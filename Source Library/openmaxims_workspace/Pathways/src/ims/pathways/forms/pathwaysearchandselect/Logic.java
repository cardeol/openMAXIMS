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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.60 build 2838.16667)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.pathways.forms.pathwaysearchandselect;

import ims.core.vo.enums.MosType;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.pathways.configuration.vo.PathwayRefVo;
import ims.pathways.forms.pathwaysearchandselect.GenForm.grdDetailsRow;
import ims.pathways.vo.PathwayShortVo;
import ims.pathways.vo.PathwayShortVoCollection;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
	}

	private void initialize()
	{
		form.txtSearchName().setFocus();
		form.cmbSearchStatus().setValue(PreActiveActiveInactiveStatus.ACTIVE);
		form.getGlobalContext().Pathways.setPathwayToCopy(null);
		form.getGlobalContext().Pathways.setSelectedPathway(null);
		//form.customControlConsultant().setHcpType(HcpDisType.MEDICAL);
		//WDEV-5193 
		form.customControlMos().initialize(MosType.MEDIC);
		search();
	}

	protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearSearch();
		form.grdDetails().getRows().clear();
		form.btnEdit().setVisible(false);
		updateControlState();//WDEV-17796
	}

	private void search()
	{
		populateGridFromData(domain.listPathway(form.txtSearchName().getValue(), form.cmbSearchSpecialty().getValue(), form.customControlMos().getValue(), form.cmbSearchStatus().getValue()));
		form.grdDetails().setFooterValue("Total records : " + form.grdDetails().getRows().size());
		updateControlState();//WDEV-17374
	}

	private void populateGridFromData(PathwayShortVoCollection voCollPathway)
	{
		form.grdDetails().getRows().clear();		
		
		if(voCollPathway == null || voCollPathway.size() == 0)
		{
			engine.showMessage("No matching records found");
			return;
		}
		
		for(int i=0;i<voCollPathway.size();i++)
		{
			grdDetailsRow row = form.grdDetails().getRows().newRow();
			PathwayShortVo voPathway = voCollPathway.get(i);
			if(voPathway != null)
			{
				row.setColName(voPathway.getName());
				row.setColDescr(voPathway.getDescription());
				row.setColSpecialty(voPathway.getSpecialty());
				if(voPathway.getConsultantIsNotNull())
					row.setColConsultant(voPathway.getConsultant().toString());
			
				row.setColStatus(voPathway.getStatus());
				row.setColDefault(voPathway.getIsDefault());
				if(voPathway.getNumWeeksIsNotNull() &&
						voPathway.getJourneyCountType() != null)
							row.setColWeeks(voPathway.getNumWeeks().toString() + " - " + voPathway.getJourneyCountType().getText());				

				
				row.setValue(voPathway);
			}
		}
	}

	private void clearSearch()
	{		
		form.txtSearchName().setValue(null);
		form.cmbSearchSpecialty().setValue(null);
		//form.customControlConsultant().setValue(null);
		form.customControlMos().setValue(null);
		form.cmbSearchStatus().setValue(null);
		form.grdDetails().setFooterValue("Total records : 0");
	}

	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		search();
	}

	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		if(sender.equals(form.grdDetails()))
		{
			switch (menuItemID)
			{
				case GenForm.ContextMenus.PathwaysNamespace.PathwaySearchAndSelect.NEW:
					addPathway();
				break;
				case GenForm.ContextMenus.PathwaysNamespace.PathwaySearchAndSelect.EDIT :
					editPathway();
				break;
				case GenForm.ContextMenus.PathwaysNamespace.PathwaySearchAndSelect.VIEW :
					viewPathway();
				break;
				case GenForm.ContextMenus.PathwaysNamespace.PathwaySearchAndSelect.COPY :
					copyPathway();
				break;
				default :
				break;
			}
		}
	}

	private void copyPathway()
	{
		form.getGlobalContext().Pathways.setPathwayToCopy(form.grdDetails().getValue());
		engine.open(form.getForms().Pathways.PathwayConfiguration, new Object[] {FormMode.EDIT});
	}

	private void viewPathway()
	{
		engine.open(form.getForms().Pathways.PathwayConfiguration, new Object[] {FormMode.VIEW});
	}

	private void editPathway()
	{
		engine.open(form.getForms().Pathways.PathwayConfiguration, new Object[] {FormMode.EDIT});
	}

	private void addPathway()
	{
		form.getGlobalContext().Pathways.setSelectedPathway(new PathwayRefVo());
		engine.open(form.getForms().Pathways.PathwayConfiguration, new Object[] {FormMode.EDIT});
	}

	protected void onGrdDetailsSelectionChanged() throws PresentationLogicException
	{
		form.getGlobalContext().Pathways.setSelectedPathway(form.grdDetails().getValue());
		updateControlState();
	}

	private void updateControlState()
	{
		PreActiveActiveInactiveStatus status =  form.grdDetails().getValue() != null ? form.grdDetails().getValue().getStatus() : null;
		boolean recordSelected = form.grdDetails().getValue() != null;
		FormMode mode = form.getMode();

		if(mode.equals(FormMode.VIEW))
		{
			form.getContextMenus().Pathways.getPathwaySearchAndSelectNEWItem().setVisible(true);
			form.btnEdit().setVisible(form.grdDetails().getValue() != null && (status != null && !status.equals(PreActiveActiveInactiveStatus.INACTIVE)));
			
			//WDEV-17796
			form.getContextMenus().Pathways.getPathwaySearchAndSelectEDITItem().setVisible(recordSelected & (status != null && !status.equals(PreActiveActiveInactiveStatus.INACTIVE)));
			form.getContextMenus().Pathways.getPathwaySearchAndSelectVIEWItem().setVisible(recordSelected);
			form.getContextMenus().Pathways.getPathwaySearchAndSelectCOPYItem().setVisible(recordSelected);
			
			if(form.grdDetails().getValue() != null)
			{
				form.getContextMenus().Pathways.getPathwaySearchAndSelectCOPYItem().setText("Create a New Pathway based on " + form.grdDetails().getValue().getName());
			}
		}
	}

	protected void onFormModeChanged()
	{
		updateControlState();
	}

	protected void onBtnEditClick() throws PresentationLogicException
	{
		editPathway();
	}

	protected void onBtnNewClick() throws PresentationLogicException
	{
		addPathway();
	}
}
