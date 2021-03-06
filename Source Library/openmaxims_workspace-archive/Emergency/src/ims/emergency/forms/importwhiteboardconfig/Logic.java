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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4910.25978)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.importwhiteboardconfig;

import ims.emergency.forms.importwhiteboardconfig.GenForm.grdEDLocRow;
import ims.emergency.vo.TrackingAreaForWhiteBoardConfigVo;
import ims.emergency.vo.TrackingAreaForWhiteBoardConfigVoCollection;
import ims.framework.enumerations.DialogResult;

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
		populateEdLocGrid();
	}
	private void populateEdLocGrid()
	{
		form.grdEDLoc().getRows().clear();
		//LocationLiteVoCollection collEdLoc = domain.listEmergencyDepartments();
		
		TrackingAreaForWhiteBoardConfigVoCollection collArea = domain.listAreas();
		if (collArea==null || collArea.size()==0)
			return;
		
		for (int i=0;i<collArea.size();i++)
		{
			addRowToGrid(collArea.get(i));
		}
	}
	private void addRowToGrid(TrackingAreaForWhiteBoardConfigVo area)
	{
		if (area==null)
			return;
		
		grdEDLocRow row = form.grdEDLoc().getRows().newRow();
		row.setcolArea(area.getAreaDisplayName());
		row.setcolEDLoc(area.getEDLocation().getName());
		
		row.setValue(area);
	}
	@Override
	protected void onGrdEDLocGridCheckBoxClicked(int column, GenForm.grdEDLocRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
	{
		if (!isChecked)
			return;
		
		/*
		if (domain.getEDWhiteBoardConfigByLocation(row.getValue().getEDLocation(),row.getValue())==null)
		{
			engine.showMessage("The Emergency Department selected doesn't have WhiteBoard configured. Please select another Emergency Department.");
			row.setcolSelect(false);
		}
		*/
		for (int i=0;i<form.grdEDLoc().getRows().size() ;i++)
		{
			if (row.getValue().equals(form.grdEDLoc().getRows().get(i).getValue()))
				continue;
			
			form.grdEDLoc().getRows().get(i).setcolSelect(false);
		}
	}
	@Override
	protected void onBtnCopyClick() throws ims.framework.exceptions.PresentationLogicException
	{
		TrackingAreaForWhiteBoardConfigVo selectedArea = getSelectedLocationFromGrid();
		
		if (selectedArea==null)
		{
			engine.showMessage("Please select an Area");
			return;
		}
		
		form.getGlobalContext().Emergency.setWhiteBoardConfig(domain.getEDWhiteBoardConfigByLocation(selectedArea.getEDLocation(),selectedArea));
		engine.close(DialogResult.OK);
	}
	
	private TrackingAreaForWhiteBoardConfigVo getSelectedLocationFromGrid()
	{
		for (int i=0;i<form.grdEDLoc().getRows().size();i++)
		{
			if (form.grdEDLoc().getRows().get(i).getcolSelect())
				return form.grdEDLoc().getRows().get(i).getValue();
		}
		
		return null;
	}
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
}
