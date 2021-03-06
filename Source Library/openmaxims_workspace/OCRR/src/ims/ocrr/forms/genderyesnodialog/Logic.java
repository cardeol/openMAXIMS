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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4785.23502)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.ocrr.forms.genderyesnodialog;

import ims.core.vo.lookups.Sex;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.ocrr.configuration.vo.InvestigationRefVoCollection;
import ims.ocrr.forms.genderyesnodialog.GenForm.grdInvestigationsRow;
import ims.ocrr.vo.GenderInvestigationVo;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
	}
	
	private void initialize() 
	{
		String query = "";
		
		boolean isFemale = form.getGlobalContext().Core.getPatientShort().getSexIsNotNull() && form.getGlobalContext().Core.getPatientShort().getSex().equals(Sex.FEMALE);

		if(isFemale)
			query = "These investigations have been configured as appropriate for patients of Male gender.\nDo you still wish to include these items in the order for this patient?";
		else
			query = "These investigations have been configured as appropriate for patients of Female gender.\nDo you still wish to include these items in the order for this patient?";
		
		form.lblQuestion().setValue(query);
		form.grdInvestigations().setSelectable(false);
		
		populateInvestigationGrid();
	}

	private void populateInvestigationGrid() 
	{
		if(form.getGlobalContext().OCRR.getGenderInvestigations() == null || form.getGlobalContext().OCRR.getGenderInvestigations().size() ==0)
			return;
		
		for(GenderInvestigationVo inv : form.getGlobalContext().OCRR.getGenderInvestigations())
		{
			addInvestigationRow(inv);
		}
	}

	private void addInvestigationRow(GenderInvestigationVo inv) 
	{
		if(inv == null)
			return;
		
		grdInvestigationsRow row = form.grdInvestigations().getRows().newRow();
		
		row.setColInvestigation(inv.getInvestigationIndex().getName());
		row.setColSelect(true);
		row.setValue(inv);
		
		if(inv.getAssocInvestigation() == null || inv.getAssocInvestigation().size() == 0)
			return;
		
		row.setExpanded(true);
		
		for(GenderInvestigationVo childInv : inv.getAssocInvestigation())
		{
			if(childInv == null)
				continue;
			
			grdInvestigationsRow childRow = row.getRows().newRow();
			childRow.setColInvestigation(childInv.getInvestigationIndex().getName());
			childRow.setColSelect(true);
			childRow.setValue(childInv);
		}
	}

	@Override
	protected void onBtnOkClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().OCRR.setRefusedInvestigation(getRefusedInvestigation());
		engine.close(DialogResult.YES);
	}

	private InvestigationRefVoCollection getRefusedInvestigation() 
	{
		InvestigationRefVoCollection invColl = form.getGlobalContext().OCRR.getRefusedInvestigation();
		
		if(invColl == null)
			invColl = new InvestigationRefVoCollection();
		
		for(int i=0; i<form.grdInvestigations().getRows().size(); i++)
		{
			grdInvestigationsRow row = form.grdInvestigations().getRows().get(i);
			
			if(row.getValue() == null)
				continue;
			
			if(!row.getColSelect())
			{
				invColl.add(row.getValue());
			}
			else
			{
				if(invColl.indexOf(row.getValue()) >= 0)
				{
					invColl.remove(row.getValue());
				}
			}
			
			if(Boolean.TRUE.equals(row.getValue().getInvestigationIndex().getIsProfile()))
			{
				for(int j=0; j<row.getRows().size(); j++)
				{
					grdInvestigationsRow childRow = row.getRows().get(j);
						
					if(!childRow.getColSelect())
					{
						invColl.add(childRow.getValue());
					}
					else
					{
						if(invColl.indexOf(childRow.getValue()) >= 0)
						{
							invColl.remove(childRow.getValue());
						}
					}
				}
			}
		}
		
		return invColl.size() > 0 ? invColl : null;
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		deselectAllInvestigations();//WDEV-16762
		form.getGlobalContext().OCRR.setRefusedInvestigation(getRefusedInvestigation());
		engine.close(DialogResult.YES);
	}

	//WDEV-16762
	private void deselectAllInvestigations() 
	{
		for(int i=0; i<form.grdInvestigations().getRows().size(); i++)
		{
			grdInvestigationsRow row = form.grdInvestigations().getRows().get(i);
			
			if(row == null)
				continue;
			
			row.setColSelect(false);
			
			if(row.getRows() != null)
			{
				for(int j=0; j<row.getRows().size(); j++)
				{
					grdInvestigationsRow childRow = row.getRows().get(j);
					
					if(childRow == null)
						continue;
					
					childRow.setColSelect(false);
				}
			}
		}
	}

	@Override
	protected void onGrdInvestigationsGridCheckBoxClicked(int column, grdInvestigationsRow row, boolean isChecked) throws PresentationLogicException 
	{
		if(row != null && row.getValue() != null)
		{
			checkUncheckChildInv(row, isChecked);
			checkUncheckOtherInvWithSameValue(row, isChecked);
		}
		
		form.grdInvestigations().setValue(null);
	}

	private void checkUncheckOtherInvWithSameValue(grdInvestigationsRow row, boolean isChecked) 
	{
		if(row == null || row.getValue() == null)
			return;
		
		GenderInvestigationVo invValue = row.getValue();
		
		for(int i=0; i<form.grdInvestigations().getRows().size(); i++)
		{
			grdInvestigationsRow invRow = form.grdInvestigations().getRows().get(i);
			
			if(invValue.equals(invRow.getValue()))
			{
				invRow.setColSelect(isChecked);
			}
			
			if(invRow.getColSelect())
			{
				for(int j=0; j<invRow.getRows().size(); j++)
				{
					grdInvestigationsRow childRow = invRow.getRows().get(j);
					if(invValue.equals(childRow.getValue()))
						childRow.setColSelect(isChecked);
				}
			}
		}
	}

	private void checkUncheckChildInv(grdInvestigationsRow row,	boolean isChecked) 
	{
		if(row == null)
			return;
		
		for(int i=0; i<row.getRows().size(); i++)
		{
			row.getRows().get(i).setColSelect(isChecked);

			row.getRows().get(i).setColSelectReadOnly(!isChecked);
			
			checkUncheckOtherInvWithSameValue(row.getRows().get(i), isChecked);
		}
	}

	@Override
	protected void onGrdInvestigationsSelectionChanged() throws PresentationLogicException
	{
		form.grdInvestigations().setValue(null);
	}
}
