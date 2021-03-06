//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.80 build 3952.27656)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.admin.forms.dischargesummaryschedulesthkform;

import ims.admin.domain.impl.DischargeSummaryScheduleSTHKFormImpl;
import ims.admin.forms.dischargesummaryschedulesthkform.GenForm.grdJobRow;
import ims.admin.helper.QuartzProperties;
import ims.clinical.vo.DischargeSummaryScheduleVo;
import ims.clinical.vo.DischargeSummaryScheduleVoCollection;
import ims.configuration.gen.ConfigFlag;
//import ims.configuration.EnvironmentConfig;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.URL;
//import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;
import com.ims.query.builder.client.PrinterAvailableCollection;
import com.ims.query.builder.client.QueryBuilderClient;
import com.ims.query.builder.client.exceptions.QueryBuilderClientException;
import com.thoughtworks.xstream.XStream;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	private static JobDetail jd;
	private static Scheduler scheduling = null;	
	
	@Override
	protected void onBtnCancelTaskClick() throws PresentationLogicException 
	{
		DischargeSummaryScheduleVo jobToAdd = null;
		try
		{
			Scheduler sched = scheduling;
			if (sched == null)
			{
				Properties properties = QuartzProperties.getProperties();
				if( properties == null)
				{
					System.out.println("Quartz start without property file");
				}
				
				SchedulerFactory sf = new StdSchedulerFactory(properties);
				sched = sf.getScheduler();				
			}			
			
			if (!sched.isStarted())	{
				sched.start();
			}
				
			jobToAdd = form.grdJob().getValue();			
			sched.deleteJob(jobToAdd.getJobType().toString(), DischargeSummaryScheduleSTHKFormImpl.class.getSimpleName());
			try 
			{
				domain.removeTask(form.grdJob().getValue().getJobType());
			} 
			catch (ForeignKeyViolationException e) 
			{
				engine.showMessage(e.getMessage());
				return;
			}
			form.grdJob().removeSelectedRow();
			updateControlState();
		}
		catch (SchedulerException e)
		{
			engine.showMessage(e.getMessage());
			return;
		}
		
		if (jobToAdd != null && jobToAdd.getJobTypeIsNotNull()) 
		{
			form.cmbJobType().newRow(jobToAdd.getJobType(), jobToAdd.getJobType().getText());
		}
		//wdev-12092
		clearControls();
		form.cmbJobType().setValue(null);
		//---------
	}

	public ArrayList<String> validateUILogic()
	{
		ArrayList <String> errors=new ArrayList<String>();
		
		if (form.intHours().getValue() == null &&
				form.intMinutes().getValue() == null)
		{
			errors.add("Number of hours or minutes is a Mandatory field");
		}
		if(form.cmbPrint().getValue() == null)
		{
			errors.add("Please select the printer where the report will be printed to.");
		}
		if (form.intMinutes().getValue() != null &&
				form.intMinutes().getValue() > 59)
		{
			errors.add("Please add minutes between 0-59");
		}

		if (form.cmbJobType().getValue() == null )
		{
			errors.add("Job Type is a Mandatory field. You can only have one Scheduled Task for each Job Type.");
		}

		if (errors.size()>0)
			return errors;		
		
		return null;
	}
			
	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException 
	{	
		initialize();
	}

	private void initialize() 
	{
		if(checkQuartzServer())
		{
			loadPrinterList();	
			populateGrid();
		}
	}

	private boolean checkQuartzServer() 
	{
		return true;
	}

	private void loadPrinterList()
	{
		form.cmbPrint().clear();		
		QueryBuilderClient qbc = new QueryBuilderClient(ConfigFlag.GEN.QUERY_SERVER_URL.getValue(), engine.getSessionId());

		try
		{
			PrinterAvailableCollection printers = qbc.listPrinters(ConfigFlag.GEN.REPORT_SERVER_URL.getValue());
			String[] printersColl = new String[printers.size()];

			for (int i = 0; i < printers.size(); i++)
			{
				form.cmbPrint().newRow(printers.get(i).getName(), printers.get(i).getName());
				printersColl[i] = printers.get(i).getName();
			}
		}
		catch (QueryBuilderClientException e)
		{
			engine.showMessage("Error getting the printers list: " + e.toString());
			return;
		}
	}
	
	private void populateGrid()
	{
		form.grdJob().getRows().clear();
	
		DischargeSummaryScheduleVoCollection voCol = domain.getJobs();
		DischargeSummaryScheduleVo summaryScheduleVo = null;
		
		for (int j = 0 ; voCol != null && j < voCol.size() ; j++)
		{
			summaryScheduleVo = voCol.get(j);

			grdJobRow row = form.grdJob().getRows().newRow();
			row.setValue(summaryScheduleVo);
			if (summaryScheduleVo.getCreationDateIsNotNull())
				row.setcolCreatedOn(summaryScheduleVo.getCreationDate());
			if (summaryScheduleVo.getTriggerFrequencyIsNotNull())
				row.setcolFrequency(summaryScheduleVo.getTriggerFrequency());
			if (summaryScheduleVo.getLastRunIsNotNull())
				row.setcolLastRun(summaryScheduleVo.getLastRun().toString());
			if (summaryScheduleVo.getNextRunIsNotNull())
				row.setcolNextRun(summaryScheduleVo.getNextRun().toString());
			if (summaryScheduleVo.getPrintedLettersNoIsNotNull())
				row.setcolNumberLettersPrinted(summaryScheduleVo.getPrintedLettersNo());				
			if (summaryScheduleVo.getGeneratedLeettersNoIsNotNull())
				row.setcolNumberLettersGenerated(summaryScheduleVo.getGeneratedLeettersNo());
			if (summaryScheduleVo.getSuccessfulEmailsNoIsNotNull())
				row.setcolSuccessfulSentEmail(summaryScheduleVo.getSuccessfulEmailsNo());
			if (summaryScheduleVo.getFailedEmailsNoIsNotNull())			
				row.setcolFailedSentEmail(summaryScheduleVo.getFailedEmailsNo());			
			row.setcolJob("Print Report");
			row.setValue(summaryScheduleVo);
			
			if (summaryScheduleVo.getJobTypeIsNotNull())
			{
				row.setcolType(summaryScheduleVo.getJobType().toString());				
				form.cmbJobType().removeRow(summaryScheduleVo.getJobType());
			}
		}
		
		updateControlState();
	}

	protected void updateControlState()
	{
		form.btnSetTask().setEnabled(true);
		form.btnCancelTask().setEnabled(form.grdJob().getSelectedRow() != null);
	}
		
	@Override
	protected void onBtnSetTaskClick() throws PresentationLogicException 
	{				
		ArrayList <String> errors = validateUILogic();
		if (errors!=null)
		{
			engine.showErrors(errors.toArray(new String[0]));
			return;
		}
		
		Properties properties = QuartzProperties.getProperties();
		if( properties == null)
		{
			System.out.println("Quartz start without property file");
		}
		
		SchedulerFactory sf;
		try 
		{
			sf = new StdSchedulerFactory(properties);
			Object repeatInterval = null;
			String triggerFrecuency = null;
			
			DateTime startDate = new ims.framework.utils.DateTime();
			DischargeSummaryScheduleVo newBatch = null;
			newBatch = new DischargeSummaryScheduleVo();
			
			newBatch.setLastRun(null);
			newBatch.setGeneratedLeettersNo(null);
			newBatch.setPrintedLettersNo(null);
			newBatch.setSuccessfulEmailsNo(null);
			newBatch.setFailedEmailsNo(null);
			newBatch.setPrintAgentTo(form.cmbPrint().getValue());
			
			CronTrigger cron = null;
			SimpleTrigger simpleCron=null;
			
			try
			{
				Scheduler sched = sf.getScheduler();
				if (!sched.isStarted())	{
					sched.start();
				}				
				
				jd = new JobDetail((form.cmbJobType().getValue()).getText(), DischargeSummaryScheduleSTHKFormImpl.class.getSimpleName(), DischargeSummaryScheduleSTHKFormImpl.class);
				jd.setRequestsRecovery(true);		
				jd.setDescription(DischargeSummaryScheduleSTHKFormImpl.class.getSimpleName());
				
				if (form.intHours().getValue() != null)
				{
					int hours = form.intHours().getValue();
					repeatInterval = hours * 3600L * 1000L;
					triggerFrecuency = "Every " + form.intHours().getValue() + " hours";
					
					if (form.intMinutes().getValue() != null)
					{
						int min = form.intMinutes().getValue();
						repeatInterval = ((hours*60)+min)*60L*1000L;
						triggerFrecuency="Every " + form.intHours().getValue() + " hours and " + min + " minutes" ;
					}
				}
				else
				{
					if (form.intMinutes().getValue() != null)
					{
						int min = form.intMinutes().getValue();
						repeatInterval = min*60L*1000L;
						triggerFrecuency="Every " + min + " minutes" ;
					}
				}
			
				newBatch.setTriggerFrequency(triggerFrecuency);
				XStream xST = new XStream();
				String interval = xST.toXML(repeatInterval);
				newBatch.setRepeatInterval(interval);			
				
				java.util.Calendar cal = new java.util.GregorianCalendar(startDate.getDate().getYear(),startDate.getDate().getMonth()-1,startDate.getDate().getDay(),startDate.getTime().getHour(),startDate.getTime().getMinute(),startDate.getTime().getSecond());
				Date startingTime = cal.getTime();
				
				simpleCron = new SimpleTrigger((form.cmbJobType().getValue()).getText(), DischargeSummaryScheduleSTHKFormImpl.class.getSimpleName(), startingTime, null, SimpleTrigger.REPEAT_INDEFINITELY, Long.parseLong(repeatInterval.toString()));
				simpleCron.setStartTime(startingTime);																	
				
				sched.scheduleJob(jd, simpleCron);		
				
				if (cron!=null)
				{
					newBatch.setNextRun(new ims.framework.utils.DateTime(cron.getNextFireTime()));
				}
				else
				{
					newBatch.setNextRun(new ims.framework.utils.DateTime(simpleCron.getNextFireTime()));
				}
								
				newBatch.setCreationDate(new ims.framework.utils.Date());
				newBatch.setJobType(form.cmbJobType().getValue());
				
				String[] err = newBatch.validate();

				if (err != null)
				{
					engine.showErrors(err);
					return;
				}
							
				try
				{
					domain.save(newBatch);																	
					scheduling = sched;
				}
				catch (StaleObjectException error)
				{
					engine.showMessage(error.getMessage());
					return;
				}			
			}
			catch (SchedulerException error)
			{
				engine.showMessage("SchedulerException: " +  error.getMessage());
				return;
			}		
			
			populateGrid();
			form.grdJob().setVisible(true);
			//wdev-12092
			clearControls();
			//-------
		} 
		catch (SchedulerException err) {
			
			System.out.println(err.getMessage());
		}
						
	}
	//wdev-12092
	private void clearControls()
	{
		form.intHours().setValue(null);
		form.intMinutes().setValue(null);
		form.cmbPrint().setValue(null);
	}
	//------------
	@Override
	protected void onGrdJobSelectionChanged() throws PresentationLogicException 
	{
		if (form.grdJob().getValue() != null)
		{
			form.btnCancelTask().setEnabled(true);
		}
	}

	@Override
	protected void onGrdJobGridButtonClicked(int column, grdJobRow row) throws PresentationLogicException 
	{	
		/*DischargeSummaryScheduleVo dischargeSummarySchedule = domain.getDischargeSummarySchedule(form.grdJob().getSelectedRow().getValue());
		engine.open(form.getForms().Admin.DischargeSummaryScheduleDialog, new Object[]{dischargeSummarySchedule});*/
	}

	/*private void postData(Integer jobId, String content) throws IOException
	{
		URL url;
		URLConnection urlConn;
		DataOutputStream printout;
		String qsUrl = EnvironmentConfig.getAplicationURL();

		if (qsUrl.endsWith("/"))
			qsUrl += "DischargeSummaryScheduler";
		else
			qsUrl += "/DischargeSummaryScheduler";
		// URL of servlet.
		url = new URL(qsUrl);
		// URL connection channel.
		urlConn = url.openConnection();
		// Let the run-time system (RTS) know that we want input.
		urlConn.setDoInput(true);
		// Let the RTS know that we want to do output.
		urlConn.setDoOutput(true);
		// No caching, we want the real thing.
		urlConn.setUseCaches(false);
		// Specify the content type.
		urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		// Send POST output.
		printout = new DataOutputStream(urlConn.getOutputStream());
		// String content = "";
		printout.writeBytes(content);
		printout.flush();
		printout.close();
		// Get response data.
		
		 * Map headers = urlConn.getHeaderFields(); Iterator it =
		 * headers.keySet().iterator();
		 * 
		 * while(it.hasNext()) { String key = (String)it.next();
		 * System.out.println(key + " >> " + headers.get(key)); }
		 

		String err = urlConn.getHeaderField(null);
		// the OK response should be HTTP/1.1 200 OK
		if (err.indexOf("HTTP/1.1 200 OK") == -1)
		{
			engine.showMessage("Failed to update or run the job: " + err);
			return;
		}

		
		 * input = new DataInputStream (urlConn.getInputStream ());
		 * BufferedReader d = new BufferedReader(new InputStreamReader(input));
		 * String str; while (null != ((str = d.readLine()))) {
		 * System.out.println (str); } input.close ();
		 
	}	*/
}
