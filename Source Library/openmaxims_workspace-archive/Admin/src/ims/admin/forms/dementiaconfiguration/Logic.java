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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4694.23489)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.admin.forms.dementiaconfiguration;

import ims.admin.forms.dementiaconfiguration.GenForm.grdAdmissionTypeRow;
import ims.admin.vo.DementiaColourConfigVo;
import ims.admin.vo.DementiaColourConfigVoCollection;
import ims.admin.vo.DementiaConfigurationVo;
import ims.core.vo.lookups.LookupHelper;
import ims.core.vo.lookups.MethodOfAdmissionCollection;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.Alignment;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.FormMode;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;

import java.util.ArrayList;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	private static final String	COLUMN_START		= "0";
	private static final String	COLUMN_END			= "1";
	private static final String	COLUMN_COLOUR		= "2";

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
	}

	private void updateControlsState()
	{
		form.getContextMenus().Admin.getDementiaColourConfigGridMenuADDItem().setVisible(FormMode.EDIT.equals(form.getMode()));
		form.getContextMenus().Admin.getDementiaColourConfigGridMenuEDITItem().setVisible(FormMode.EDIT.equals(form.getMode()) && form.dyngrdColourConfig().getValue() != null);
		form.getContextMenus().Admin.getDementiaColourConfigGridMenuREMOVEItem().setVisible(FormMode.EDIT.equals(form.getMode()) && form.dyngrdColourConfig().getValue() != null);

	}

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		open();// TODO Add your code here.
	}

	private void open()
	{
		form.getLocalContext().setcurrentDementiaConfig(domain.getDementiaConfig());
		
		initializeColourConfigDynamicGrid();
		populateAdmissionTypeGrid();
		populateScreenFromData(form.getLocalContext().getcurrentDementiaConfig());

		form.setMode(FormMode.VIEW);
	}

	private void populateScreenFromData(DementiaConfigurationVo dementiaConfigurationVo)
	{
		clearScreen();
		if (dementiaConfigurationVo == null)
			return;

		form.intAge().setValue(dementiaConfigurationVo.getAge());
		form.intExcludeFAIRPeriod().setValue(dementiaConfigurationVo.getExcludeFAIRPeriod());
		form.intStepOnePeriod().setValue(dementiaConfigurationVo.getStepOnePeriod());
		form.intRemoveTimePeriod().setValue(dementiaConfigurationVo.getRemoveTimePeriod());
		form.intAMTSThresholdScore().setValue(dementiaConfigurationVo.getAMTSThresholdScore());
		
		populateAdmissionType(dementiaConfigurationVo.getAdmissionTypes());
		
		DementiaColourConfigVoCollection collColourConfigVo = dementiaConfigurationVo.getColourConfig();
		collColourConfigVo.sort(SortOrder.ASCENDING);

		populateColourConfigDynamicGrid(collColourConfigVo.sort(SortOrder.ASCENDING));

	}

	private void populateAdmissionType(MethodOfAdmissionCollection methodOfAdmissionCollection)
	{
		for (int i=0;i<form.grdAdmissionType().getRows().size();i++)
		{
			if (methodOfAdmissionCollection.contains(form.grdAdmissionType().getRows().get(i).getValue()))
			{
				form.grdAdmissionType().getRows().get(i).setcolSelected(true);
			}
		}
	}

	private void populateColourConfigDynamicGrid(DementiaColourConfigVoCollection collColourConfigVo)
	{
		form.dyngrdColourConfig().getRows().clear();
		
		for (int i = 0; collColourConfigVo != null && i < collColourConfigVo.size(); i++)
		{
			addRowToColourConfigGrid(collColourConfigVo.get(i));
		}
	}

	private void initializeColourConfigDynamicGrid()
	{
		form.dyngrdColourConfig().clear();

		DynamicGridColumn column = form.dyngrdColourConfig().getColumns().newColumn("Start (hours)",COLUMN_START);
		column.setWidth(-1);
		column.setHeaderAlignment(Alignment.LEFT);
		column = form.dyngrdColourConfig().getColumns().newColumn("End (hours)",COLUMN_END);
		column.setWidth(-1);
		column.setHeaderAlignment(Alignment.LEFT);
		column = form.dyngrdColourConfig().getColumns().newColumn("Colour",COLUMN_COLOUR);
		column.setWidth(100);
		column.setHeaderAlignment(Alignment.LEFT);
	}

	private void populateAdmissionTypeGrid()
	{
		form.grdAdmissionType().getRows().clear();
		MethodOfAdmissionCollection collAdmissionType = LookupHelper.getMethodOfAdmission(domain.getLookupService());
		
		if (collAdmissionType==null)
			return;
		
		for (int i=0;i<collAdmissionType.size();i++)
		{
			if (collAdmissionType.get(i).isActive())
			{
				grdAdmissionTypeRow row = form.grdAdmissionType().getRows().newRow();
				row.setcolAdmissionType(collAdmissionType.get(i).getIItemText());
				row.setcolSelected(false);
				row.setValue(collAdmissionType.get(i));
			}	
		}
	}

	private void clearScreen()
	{
		form.intAge().setValue(null);
		form.intExcludeFAIRPeriod().setValue(null);
		form.intStepOnePeriod().setValue(null);
		form.intRemoveTimePeriod().setValue(null);
		form.intAMTSThresholdScore().setValue(null);

		for (int i=0;i<form.grdAdmissionType().getRows().size();i++)
		{
			form.grdAdmissionType().getRows().get(i).setcolSelected(false);
		}
		form.dyngrdColourConfig().getRows().clear();
	}

	@Override
	protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
		if (formName != null && formName.equals(form.getForms().Admin.DementiaColourConfig) && result.equals(DialogResult.OK))
		{
			if (form.dyngrdColourConfig().getValue() != null)
			{
				updateRowToColourConfigGrid(form.getGlobalContext().Admin.getSelectedDementiaColourConfig());
			}
			else
			{
				addRowToColourConfigGrid(form.getGlobalContext().Admin.getSelectedDementiaColourConfig());	
				orderColourGridByStartHour();
				form.dyngrdColourConfig().setValue(form.getGlobalContext().Admin.getSelectedDementiaColourConfig());
			}
		}

		updateControlsState();
	}

	private void orderColourGridByStartHour()
	{
		DementiaColourConfigVoCollection collColourConfig = new DementiaColourConfigVoCollection();
		for (int i = 0; i < form.dyngrdColourConfig().getRows().size(); i++)
		{
			collColourConfig.add((DementiaColourConfigVo)form.dyngrdColourConfig().getRows().get(i).getValue());
		}
		
		collColourConfig.sort(SortOrder.ASCENDING);
		populateColourConfigDynamicGrid(collColourConfig);
		
	}

	private void addRowToColourConfigGrid(DementiaColourConfigVo dementiaColourConfig)
	{
		if (dementiaColourConfig == null)
			return;

		DynamicGridRow newRow = form.dyngrdColourConfig().getRows().newRow();
		
		DynamicGridCell cellStart = newRow.getCells().newCell(getColumnDynGrid(COLUMN_START),DynamicCellType.STRING);
		cellStart.setValue(dementiaColourConfig.getFromHours().toString());
		cellStart.getColumn().setAlignment(Alignment.LEFT);
			
		DynamicGridCell cellEnd = newRow.getCells().newCell(getColumnDynGrid(COLUMN_END),DynamicCellType.STRING);
		cellEnd.setValue(dementiaColourConfig.getToHours().toString());
		cellEnd.getColumn().setAlignment(Alignment.LEFT);
		
		Color[] ca = Color.getAllColors();
		
		DynamicGridCell cellColour = newRow.getCells().newCell(getColumnDynGrid(COLUMN_COLOUR),DynamicCellType.ENUMERATION);
		
		for (int k = 0; k < ca.length; k++)
			cellColour.getItems().newItem(ca[k], ca[k].getName(), ca[k].getImage());
		
		cellColour.setValue(dementiaColourConfig.getWorklistEntryColour());
		cellStart.getColumn().setAlignment(Alignment.LEFT);
		
		newRow.setValue(dementiaColourConfig);
	}

	private DynamicGridColumn getColumnDynGrid(String identifier) 
	{
		return form.dyngrdColourConfig().getColumns().getByIdentifier(identifier);
	}
	
	private void updateRowToColourConfigGrid(DementiaColourConfigVo dementiaColourConfig)
	{
		DynamicGridRow row = form.dyngrdColourConfig().getSelectedRow();
		
		DynamicGridCell colStart = row.getCells().get(getColumnDynGrid(COLUMN_START));
		colStart.setValue(dementiaColourConfig.getFromHours().toString());
		
		DynamicGridCell colEnd = row.getCells().get(getColumnDynGrid(COLUMN_END));
		colEnd.setValue(dementiaColourConfig.getToHours().toString());
		
		DynamicGridCell colColours = row.getCells().get(getColumnDynGrid(COLUMN_COLOUR));
		colColours.setValue(dementiaColourConfig.getWorklistEntryColour());
		
		row.setValue(dementiaColourConfig);
		
	}

	@Override
	protected void onGrdAdmissionTypeGridCheckBoxClicked(int column, GenForm.grdAdmissionTypeRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
	{

	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (save())
			open();
	}

	private boolean save()
	{
		DementiaConfigurationVo dementiaConfigToSave = populateDataFromScreen(form.getLocalContext().getcurrentDementiaConfig());

		if (dementiaConfigToSave==null)
		{
			engine.showMessage("Please use the script to introduce the record in DB!");
			open();
			return false;
		}
		
		String[] errors = dementiaConfigToSave.validate(validateColourConfigHours(dementiaConfigToSave.getColourConfig()));
		
		if (errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}

		try
		{
			form.getLocalContext().setcurrentDementiaConfig(domain.save(dementiaConfigToSave));
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}

		return true;
	}

	private String[] validateColourConfigHours(DementiaColourConfigVoCollection collColourConfig)
	{
		ArrayList<String> errors = new ArrayList<String>();
		
		for (int i=0;i<collColourConfig.size();i++)
		{
			if (i<collColourConfig.size()-1 && collColourConfig.get(i+1).getFromHours().intValue()!=collColourConfig.get(i).getToHours().intValue()+1)
			{
				errors.add("Colour Configuration hour intervals are not consecutive!");
				break;
			}
			
			if (collColourConfig.get(i).getFromHours().intValue()>=collColourConfig.get(i).getToHours().intValue())
			{
				errors.add("Colour Configuration hour intervals are not consecutive!");
				break;
			}
			
		}
		
		if (errors.size() > 0)
		{
			String[] UIErrors = new String[errors.size()];
			errors.toArray(UIErrors);
			return UIErrors;
		}

		return null;
	}
	
	private DementiaConfigurationVo populateDataFromScreen(DementiaConfigurationVo dementiaConfigToSave)
	{
		if (dementiaConfigToSave!=null)
			dementiaConfigToSave=(DementiaConfigurationVo) dementiaConfigToSave.clone();
		else
			return null;
		
		dementiaConfigToSave.setAge(form.intAge().getValue());
		dementiaConfigToSave.setExcludeFAIRPeriod(form.intExcludeFAIRPeriod().getValue());
		dementiaConfigToSave.setStepOnePeriod(form.intStepOnePeriod().getValue());
		dementiaConfigToSave.setRemoveTimePeriod(form.intRemoveTimePeriod().getValue());
		dementiaConfigToSave.setAMTSThresholdScore(form.intAMTSThresholdScore().getValue());

		dementiaConfigToSave.setAdmissionTypes(getAdmissionTypeSelected());

		DementiaColourConfigVoCollection collColourConfig = new DementiaColourConfigVoCollection();
		for (int i = 0; i < form.dyngrdColourConfig().getRows().size(); i++)
		{
			collColourConfig.add((DementiaColourConfigVo)form.dyngrdColourConfig().getRows().get(i).getValue());
		}

		dementiaConfigToSave.setColourConfig(collColourConfig);

		return dementiaConfigToSave;
	}

	private MethodOfAdmissionCollection getAdmissionTypeSelected()
	{
		MethodOfAdmissionCollection collMethodOfAdmission = new MethodOfAdmissionCollection();
		for (int i=0;i<form.grdAdmissionType().getRows().size();i++)
		{
			if (form.grdAdmissionType().getRows().get(i).getcolSelected())
				collMethodOfAdmission.add(form.grdAdmissionType().getRows().get(i).getValue());
		}
		
		return collMethodOfAdmission;
	}

	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}

	@Override
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		switch (menuItemID)
		{
			case GenForm.ContextMenus.AdminNamespace.DementiaColourConfigGridMenu.ADD:
				form.getGlobalContext().Admin.setSelectedDementiaColourConfig(null);
				form.dyngrdColourConfig().setValue(null);
				engine.open(form.getForms().Admin.DementiaColourConfig);
				break;

			case GenForm.ContextMenus.AdminNamespace.DementiaColourConfigGridMenu.EDIT:
				form.getGlobalContext().Admin.setSelectedDementiaColourConfig((DementiaColourConfigVo)form.dyngrdColourConfig().getValue());
				engine.open(form.getForms().Admin.DementiaColourConfig);
				break;

			case GenForm.ContextMenus.AdminNamespace.DementiaColourConfigGridMenu.REMOVE:
				form.dyngrdColourConfig().getRows().remove(form.dyngrdColourConfig().getSelectedRow());
				updateControlsState();
				break;

		}
	}

	@Override
	protected void onDyngrdColourConfigRowSelectionChanged(DynamicGridRow row) throws PresentationLogicException
	{
		form.getGlobalContext().Admin.setSelectedDementiaColourConfig((DementiaColourConfigVo) form.dyngrdColourConfig().getValue());
		updateControlsState();
	}
}