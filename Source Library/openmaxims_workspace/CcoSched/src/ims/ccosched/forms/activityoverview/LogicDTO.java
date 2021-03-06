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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.21 build 40924.1400)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.ccosched.forms.activityoverview;

import ims.alerts.PatientAlertCCO;
import ims.dto.client.Sd_activity_grp;
import ims.dto.Result;
import ims.dto.client.Sd_activity;
import ims.dto.client.Sd_mc;
import ims.dto.client.Sd_sess_avail;
import ims.dto.client.Sd_sess_misctrl;
import ims.framework.delegates.CancelArgs;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.StringUtils;
import ims.framework.utils.DateFormat;

public class LogicDTO extends BaseLogicDTO
{
	private String NL = new String("<br>");
	private String BSTART = new String("<b>");
	private String BEND	  = new String("</b>");
	protected void onFormOpen() throws ims.framework.exceptions.FormOpenException
	{
		clearPIDAndPatient();
		form.ViewSession().setEnabled(false);

		form.ActivityGroup().clear();
		form.Activity().clear();

		// load activity groups
		Sd_activity_grp activityGroups = form.getGlobalContext().CcoSched.ActivityView.getActivityGroups();
		if (activityGroups == null)
		{
			activityGroups = (Sd_activity_grp)domain.getDTOInstance(Sd_activity_grp.class);
			activityGroups.Filter.clear();
			activityGroups.Filter.Act_ind_grp = "Y";

			Result result = activityGroups.list();
			if (result != null)
			{
				engine.showMessage(result.getMessage());
				return;
			}
			form.getGlobalContext().CcoSched.ActivityView.setActivityGroups(activityGroups);
		}
		
		for (int i = 0; i < activityGroups.DataCollection.count(); ++i)
		{
			Sd_activity_grp.Sd_activity_grpRecord item = activityGroups.DataCollection.get(i);
			form.ActivityGroup().newRow(item.Grp_id, activityGroups.DataCollection.get(i).Grp_nm);
		}
		
		// load activities
		Sd_activity activities = form.getGlobalContext().CcoSched.ActivityView.getActivities();
		if (activities == null)
		{
			activities = (Sd_activity)domain.getDTOInstance(Sd_activity.class);
			activities.Filter.clear();
			activities.Filter.Act_ind = "Y";
			activities.Filter.Grp_act_ind = "Y";

			Result result = activities.list();
			if (result != null)
			{
				engine.showMessage(result.getMessage());
				return;
			}
			form.getGlobalContext().CcoSched.ActivityView.setActivities(activities);
		}

		LoadActivity();
	}
	
	private void clearPIDAndPatient()
	{
		engine.clearAlertsByType(PatientAlertCCO.class);
		form.getGlobalContext().Core.setPatientShort(null);
	}
	
	protected void onViewSessionClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (form.getGlobalContext().CcoSched.Booking.getSelectedDate() != null)
			engine.open(form.getForms().CcoSched.SessionList);
	}
	protected void onResourceGridSelectionChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.ViewSession().setEnabled(true);

		Sd_mc machines = (Sd_mc)domain.getDTOInstance(Sd_mc.class);
		machines.Filter.clear();
		machines.Filter.Mc_id = form.ResourceGrid().getValue().Mc_id;

		Result result = machines.get();
		if (result != null)
		{
			engine.showMessage(result.getMessage());								
		}
		else if (machines.DataCollection.count() != 1)
		{
			engine.showMessage("Failed to get resource information.");				
		}

		form.getGlobalContext().CcoSched.Booking.setSelectedDate(form.dtDate().getValue());
		form.getGlobalContext().CcoSched.Booking.setSessionId(form.ResourceGrid().getValue().Session_id);
		form.getGlobalContext().CcoSched.Booking.setSessionDetailsId(form.ResourceGrid().getValue().Sessiond_id);			
	}
	
	protected void onFindClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.barBar().clear();
		form.ResourceGrid().getRows().clear();

		if (form.dtDate().getValue() == null)
		{
			engine.showMessage("Please select a date.");
			return;
		}
		if (form.ActivityGroup().getValue() == null)
		{
			engine.showMessage("Please select an activity group.");
			return;
		}
		if (form.Activity().getValue() == null)
		{
			engine.showMessage("Please select an activity.");
			return;
		}

		Sd_sess_avail sessions = (Sd_sess_avail)domain.getDTOInstance(Sd_sess_avail.class);
		sessions.Filter.clear();			
		sessions.Filter.Sess_dt = form.dtDate().getValue().toString(DateFormat.ISO);
		sessions.Filter.Grp_id = form.ActivityGroup().getValue();
		sessions.Filter.Activ_id = form.Activity().getValue().Activ_id;
		Result result = sessions.list();
		if (result != null)
		{
			engine.showMessage(result.getMessage());
			return;
		}		
		if (sessions.DataCollection.count()==0)
		{
			engine.showMessage("There are no results for the search criteria.");
			return;
		}		

		for (int i = 0; i < sessions.DataCollection.count(); ++i)
		{
			String[] tmp = StringUtils.splitString((String)sessions.DataCollection.get(i).Sessiond_ids, ",+");
			
			for (int j = 0; j < (tmp.length / 2); ++j)
			{
				Sd_sess_misctrl machineControls = (Sd_sess_misctrl)domain.getDTOInstance(Sd_sess_misctrl.class);
				machineControls.Filter.clear();
				machineControls.Filter.Session_id = tmp[2 * j];
				machineControls.Filter.Sessiond_id = tmp[2 * j + 1];					

				result = machineControls.get();
				if (result != null)
				{
					engine.showMessage(result.getMessage());
					return;
				}

				if (machineControls.DataCollection.count() != 1)
				{
					engine.showMessage("Failed to get alternative resource information.");
					return;
				}

				Sd_sess_misctrl.Sd_sess_misctrlRecord machineControl = machineControls.DataCollection.get(0);

				int total = getIntFromString(machineControl.Max_apps);
				int completed = getIntFromString(machineControl.Rem_apps);

				GenForm.ResourceGridRow r = form.ResourceGrid().getRows().newRow();
				
				int nIndex = j;
				nIndex++;
				Integer number = new Integer(nIndex);
				String str = new String(number.toString());
				
				r.setNumber(str);
				r.setResourceName(machineControl.Sess_mcnm);
				r.setLocation(machineControl.Sess_lcnm);
				r.setValue(machineControl);
				 
				String tooltip = BSTART + "Machine Name: " + BEND;
				tooltip += machineControl.Sess_mcnm;
				tooltip += NL;
				tooltip += BSTART + "Machine Location: " + BEND;
				tooltip += machineControl.Sess_lcnm;
				tooltip += NL;
				tooltip += BSTART + "Total Number of Appointments: " + BEND;
				tooltip += machineControl.Max_apps;
				tooltip += NL;
				tooltip += BSTART + "Number of Appointments Completed: " + BEND;
				tooltip += machineControl.Rem_apps;
				
				form.barBar().addResource(total, completed, tooltip);
			}
		}
	}
	private int getIntFromString(String value)
	{
		if(value != null && value.equals(""))
			return 0;
		try
		{
			return Integer.parseInt(value);
		}
		catch(NumberFormatException e)
		{
			engine.showMessage(e.getMessage());
		}
		return 0;
	}
	
	protected void onActivityGroupValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		LoadActivity();
	}
	
	private void LoadActivity()
	{
		if(form.ActivityGroup().getValue() == null)
		{
			form.Activity().clear(); //WDEV-14851
			return;
		}

		Sd_activity activities = form.getGlobalContext().CcoSched.ActivityView.getActivities();
		if(activities == null)
		{
			engine.showMessage("Please select an activity.");
			return;
		}

		String id = form.ActivityGroup().getValue();
		
		form.Activity().clear();
		for (int i = 0; i < activities.DataCollection.count(); ++i)
		{
			if (activities.DataCollection.get(i).Grp_id.equals(id))
				form.Activity().newRow(activities.DataCollection.get(i), activities.DataCollection.get(i).Activ_nm);
		}
	}

	protected void onFormClosing(CancelArgs args) throws PresentationLogicException 
	{
		//19/11/2004 - Clear persistant context
		if(form.getGlobalContext().CcoSched.Booking.getSelectedDateIsNotNull())
			form.getGlobalContext().CcoSched.Booking.setSelectedDate(null);
		
	}
}
