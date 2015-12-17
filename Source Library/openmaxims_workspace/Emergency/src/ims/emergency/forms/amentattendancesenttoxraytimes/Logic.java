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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 5127.24028)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.amentattendancesenttoxraytimes;

import java.util.ArrayList;
import java.util.List;

import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.vo.SentToXrayVo;
import ims.framework.enumerations.DialogResult;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	
	private void open()
	{
		form.getLocalContext().setCurrentRecord(domain.get(form.getGlobalContext().Emergency.getAmendAttendanceSentToXrayTimes()));
		
		if(form.getLocalContext().getCurrentRecord() == null)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
		}
		
		populateScreenFromData(form.getLocalContext().getCurrentRecord());
		updateControlsState();
	}

	private void updateControlsState()
	{
		form.dtimSent().setEnabled(form.dtimSent().getValue() != null);
		form.dtimReturned().setEnabled(form.dtimReturned().getValue() != null);
	}

	private void populateScreenFromData(SentToXrayVo sentToXrayVo)
	{
		clearScreen();
		
		if(sentToXrayVo == null)
			return;
		
		form.txtSentBy().setValue(sentToXrayVo.getSentBy() != null ? sentToXrayVo.getSentBy().getIMosName() : null);
		form.dtimSent().setValue(sentToXrayVo.getSentDateTime());
		form.dtimReturned().setValue(sentToXrayVo.getReturnedDateTime());
	}

	private void clearScreen()
	{
		form.txtSentBy().setValue(null);
		form.dtimSent().setValue(null);
		form.dtimReturned().setValue(null);
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(save())
			engine.close(DialogResult.OK);
	}
	
	private boolean save()
	{
		SentToXrayVo record = populateDataFromScreen(form.getLocalContext().getCurrentRecord());
		
		String[] errors = validateUIRules();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		errors = record.validate();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		try
		{
			domain.save(record);
		}
		catch (StaleObjectException e)
		{
			e.printStackTrace();
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
			return false;
		}
		
		return true;
	}

	private String[] validateUIRules()
	{
		List<String> uiErrors = new ArrayList<String>();
		
		DateTime registrationDateTime = form.getGlobalContext().Emergency.getEmergencyAttendanceForTimeAmendments().getRegistrationDateTime();
		DateTime dischargeDatetime = form.getGlobalContext().Emergency.getEmergencyAttendanceForTimeAmendments().getDischargeDateTime();
		
		if(form.dtimSent().isEnabled() && form.dtimSent().getValue() == null)
		{
			uiErrors.add("Sent Date/Time is mandatory.");
		}
		
		if (form.dtimSent().getValue() != null && form.dtimSent().getValue().isGreaterThan(new DateTime()))
		{
			uiErrors.add("Sent Date/Time cannot be set in the future.");
		}
		
		if(form.dtimReturned().isEnabled() && form.dtimReturned().getValue() == null)
		{
			uiErrors.add("Returned Date/Time is mandatory.");
		}
		
		if (form.dtimReturned().getValue() != null && form.dtimReturned().getValue().isGreaterThan(new DateTime()))
		{
			uiErrors.add("Returned Date/Time cannot be set in the future.");
		}
		
		if (form.dtimSent().getValue() != null && registrationDateTime != null && form.dtimSent().getValue().isLessThan(registrationDateTime))
		{
			uiErrors.add("Sent Date/Time cannot be less than Registration Start Time.");
		}
		
		if (form.dtimReturned().getValue() != null && registrationDateTime != null && form.dtimReturned().getValue().isLessThan(registrationDateTime))
		{
			uiErrors.add("Returned Date/Time cannot be less than Registration Start Time.");
		}
		
		if (form.dtimReturned().getValue() != null 
				&& form.dtimSent().getValue() != null 
				&& (form.dtimReturned().getValue().getDate().isLessThan(form.dtimSent().getValue().getDate()) 
						|| (form.dtimReturned().getValue().getDate().equals(form.dtimSent().getValue().getDate()) 
								&& form.dtimReturned().getValue().getTime().isLessThan(form.dtimSent().getValue().getTime()))))
		{
			uiErrors.add("Returned Date/Time cannot be less than Sent Date/Time.");
		}
		
		if(form.dtimSent().getValue() != null && dischargeDatetime != null && form.dtimSent().getValue().isGreaterThan(dischargeDatetime))
		{
			uiErrors.add("Sent Date/Time cannot be greater than Departed Date/Time.");
		}
		if(form.dtimReturned().getValue() != null && dischargeDatetime != null && form.dtimReturned().getValue().isGreaterThan(dischargeDatetime))
		{
			uiErrors.add("Returned Date/Time cannot be greater than Departed Date/Time.");
		}
		
		String[] uiResults = new String[uiErrors.size()];
		uiErrors.toArray(uiResults);
		
		return uiResults;
	}

	private SentToXrayVo populateDataFromScreen(SentToXrayVo currentRecord)
	{
		if(currentRecord == null)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
		}
		
		currentRecord.setSentDateTime(form.dtimSent().getValue());
		currentRecord.setReturnedDateTime(form.dtimReturned().getValue());
		
		return currentRecord;
	}
}