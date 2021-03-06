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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.clinicaladmin.forms.tumourcategory;

import ims.framework.enumerations.FormMode;

public interface IComponent
{
	public void setMode(FormMode mode);
	public FormMode getMode();
	/**
	* Set Context Menu for configuration form
	*/
	public void setContextMenuForConfiguration(Boolean value);

	/**
	* Set Context Menu for instantiation form
	*/
	public void setContextMenuForInstantiation(Boolean value);

	/**
	* Return Context Menu selected
	*/
	public ims.oncology.vo.enums.TumourCategory getContextMenuSelected();

	/**
	* Get selected nod
	*/
	public ims.vo.ValueObject getSelectedNod();

	public void clear();

	public void clearSelectedNod();

	public void clearContextMenuSelected();

	public void refresh();

	public ims.vo.ValueObject getParentNod();

	public ims.vo.ValueObject getRootNod();

	public void setValue(ims.vo.ValueObject value);

	public void showHideOverallContextMenu(ims.oncology.vo.enums.TumourCategory menu, Boolean value);

	public void setComponentMode(ims.framework.enumerations.FormMode mode);

	public ims.oncology.configuration.vo.TNMStagingClassificationVersionRefVo getSelectedBranchVersion();

	public void clearEvent();

	public Boolean hasEvent();
}
