//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.70 build 3341.28572)
// Copyright (C) 1995-2009 IMS MAXIMS plc. All rights reserved.

package ims.pathways.forms.patientjourneycomments;

import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.DialogResult;
import ims.pathways.vo.PatientJourneyCommentsVo;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		if (form.getGlobalContext().Pathways.getPatientJourneyCommentsIsNotNull())
		{
			PatientJourneyCommentsVo comments = form.getGlobalContext().Pathways.getPatientJourneyComments();		
			form.getLocalContext().setEditedRecord(comments);
			form.txtComments().setValue(comments != null ? comments.getComments() : null);
		}
	}
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		try 
		{
			if (save())
				engine.close(DialogResult.OK);
		} 
		catch (StaleObjectException e) 
		{			
			e.printStackTrace();
		}
	}
	
	private PatientJourneyCommentsVo populateDataFromScreen(PatientJourneyCommentsVo record)
	{
		if (record == null)
			record = new PatientJourneyCommentsVo();
		record.setComments(form.txtComments().getValue());
		
		return record;
	}
	
	private boolean save() throws StaleObjectException
	{
		PatientJourneyCommentsVo record = populateDataFromScreen(form.getLocalContext().getEditedRecord());
		try
		{
			record = domain.save(record);
			form.getGlobalContext().Pathways.setPatientJourneyComments(record);
			return true;
		}
		catch (Exception e) 
		{
			engine.showMessage(e.toString());
			return false;
		}		
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
}