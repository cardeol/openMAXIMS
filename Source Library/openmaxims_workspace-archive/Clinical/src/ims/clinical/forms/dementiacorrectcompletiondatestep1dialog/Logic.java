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
// This code was generated by Ancuta Ciubotaru using IMS Development Environment (version 1.80 build 4696.13908)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.dementiacorrectcompletiondatestep1dialog;

import java.util.ArrayList;

import ims.clinical.vo.DementiaFindVo;
import ims.clinical.vo.DementiaForWorklistVo;
import ims.clinical.vo.DementiaVo;
import ims.clinical.vo.enums.DementiaEventEnumeration;
import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Add your code here.
		if (args != null)
		{
			if (args.length == 1 && args[0] != null && args[0] instanceof DementiaForWorklistVo)
				form.getLocalContext().setselectedDementia(domain.getDementia((DementiaForWorklistVo) args[0]));
		}
		if(form.getLocalContext().getselectedDementiaIsNotNull()&& 
				form.getLocalContext().getselectedDementia().getStepOneFindIsNotNull() &&
				form.getLocalContext().getselectedDementia().getStepOneFind().getAuthoringInformation().getAuthoringDateTimeIsNotNull())
			form.lblExistingDisplayed().setValue(form.getLocalContext().getselectedDementia().getStepOneFind().getAuthoringInformation().getAuthoringDateTime().toString());
	}

	
	protected void onBtnCancelClick() throws PresentationLogicException 
	{
		// TODO Auto-generated method stub
		engine.close(DialogResult.CANCEL);
	}

	
	protected void onBtnSaveClick() throws PresentationLogicException 
	{		
		if(save())
			engine.close(DialogResult.OK);			
	}
	private DementiaFindVo populateDataFromScreen(DementiaFindVo dementiaFindVo)
	{
		dementiaFindVo.getAuthoringInformation().setAuthoringDateTime(form.dtimCorrected().getValue());
		
		return dementiaFindVo;
	}
	
	private String[] getUIErrors()
	{
		ArrayList<String> errors = new ArrayList<String>();

		if(form.dtimCorrected().getValue() != null )			
		{					
			if(form.getLocalContext().getselectedDementiaIsNotNull())
			{
				if (form.dtimCorrected().getValue().isLessOrEqualThan(form.getLocalContext().getselectedDementia().getAdmissionDateTime()))
				{
					errors.add("Corrected Date/Time cannot be less than or equal to Admission Date/Time!");
				}				
			}
			else
			{
				errors.add("Selected Dementia is null!");
			}
			if (form.dtimCorrected().getValue().isGreaterThan(new DateTime()))
			{
				errors.add("Corrected Date/Time should not be in the future!");
			}
		}
		else
		{
			errors.add("Corrected Date/Time is mandatory!");
		}
		if (errors.size() > 0)
		{
			String[] UIErrors = new String[errors.size()];
			errors.toArray(UIErrors);
			return UIErrors;
		}

		return null;


	}
	private boolean save() 
	{
		// TODO Auto-generated method stub
		if(form.getLocalContext().getselectedDementiaIsNotNull() && form.getLocalContext().getselectedDementia().getStepOneFindIsNotNull())
		{
			DementiaFindVo dementiaToSave = populateDataFromScreen((DementiaFindVo) form.getLocalContext().getselectedDementia().getStepOneFind().clone());		

			String[] errors = dementiaToSave.validate(getUIErrors());
			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return false;
			}
			try
			{
				domain.saveDementia(dementiaToSave);
			}
			catch (StaleObjectException e)
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());	
				engine.close(DialogResult.CANCEL);
				return false;
			}
		}
		return true;
	}
}
