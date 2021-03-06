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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.pathways.forms.externaleventmappingsconfiguration;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode, ims.framework.interfaces.IClearInfo
{
	abstract protected void bindcmbDetailLookup();
	abstract protected void defaultcmbDetailLookupValue();
	abstract protected void bindcmbGroupLookup();
	abstract protected void defaultcmbGroupLookupValue();
	abstract protected void bindcmbSpecialtyLookup();
	abstract protected void defaultcmbSpecialtyLookupValue();
	abstract protected void bindcmbSearchSpecialtyLookup();
	abstract protected void defaultcmbSearchSpecialtyLookupValue();
	abstract protected void bindcmbSearchDetailLookup();
	abstract protected void defaultcmbSearchDetailLookupValue();
	abstract protected void bindcmbSearchGroupLookup();
	abstract protected void defaultcmbSearchGroupLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbDetailValueSet(Object value);
	abstract protected void onCmbDetailValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbGroupValueSet(Object value);
	abstract protected void onCmbGroupValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbProviderValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdSpecialtySelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdSpecialtyGridQueryComboBoxTextSubmited(int column, GenForm.lyrDetailsLayer.tabEventMappingSpecialtyContainer.grdSpecialtyRow row, String text) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbSpecialtyValueSet(Object value);
	abstract protected void onDyngrdListRowSelectionChanged(ims.framework.controls.DynamicGridRow row) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbSearchConsultantTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbSearchSpecialtyValueSet(Object value);
	abstract protected void oncmbSearchDetailValueSet(Object value);
	abstract protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbSearchGroupValueSet(Object value);
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen(args);
			}
		});
		this.form.lyrDetails().tabEventMappingDetails().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabEventMappingDetailsActivated();
			}
		});
		this.form.lyrDetails().tabEventMappingSpecialty().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabEventMappingSpecialtyActivated();
			}
		});
		this.form.lyrDetails().tabEventMappingDetails().cmbDetail().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbDetailValueSet(value);
			}
		});
		this.form.lyrDetails().tabEventMappingDetails().cmbDetail().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbDetailValueChanged();
			}
		});
		this.form.lyrDetails().tabEventMappingDetails().cmbGroup().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbGroupValueSet(value);
			}
		});
		this.form.lyrDetails().tabEventMappingDetails().cmbGroup().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbGroupValueChanged();
			}
		});
		this.form.lyrDetails().tabEventMappingDetails().cmbProvider().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbProviderValueChanged();
			}
		});
		this.form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdSpecialtySelectionChanged();
			}
		});
		this.form.lyrDetails().tabEventMappingSpecialty().grdSpecialty().setGridQueryComboBoxTextSubmitedEvent(new GridQueryComboBoxTextSubmited()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int column, ims.framework.controls.GridRow row, String text) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdSpecialtyGridQueryComboBoxTextSubmited(column, new GenForm.lyrDetailsLayer.tabEventMappingSpecialtyContainer.grdSpecialtyRow(row), text);
			}
		});
		this.form.lyrDetails().tabEventMappingSpecialty().cmbSpecialty().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSpecialtyValueSet(value);
			}
		});
		this.form.dyngrdList().setDynamicGridRowSelectionChangedEvent(new DynamicGridRowSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridRow row, ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdListRowSelectionChanged(row);
			}
		});
		this.form.qmbSearchConsultant().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbSearchConsultantTextSubmited(value);
			}
		});
		this.form.imbClear().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbClearClick();
			}
		});
		this.form.imbSearch().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbSearchClick();
			}
		});
		this.form.cmbSearchSpecialty().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSearchSpecialtyValueSet(value);
			}
		});
		this.form.cmbSearchDetail().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSearchDetailValueSet(value);
			}
		});
		this.form.btnNew().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewClick();
			}
		});
		this.form.btnEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditClick();
			}
		});
		this.form.btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.cmbSearchGroup().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSearchGroupValueSet(value);
			}
		});
		this.form.getContextMenus().Pathways.getExternalEventMappingsSpecialtyAddItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappingsSpecialty.Add, sender);
			}
		});
		this.form.getContextMenus().Pathways.getExternalEventMappingsSpecialtyRemoveItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappingsSpecialty.Remove, sender);
			}
		});
		this.form.getContextMenus().Pathways.getExternalEventMappingsNewItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.New, sender);
			}
		});
		this.form.getContextMenus().Pathways.getExternalEventMappingsEditItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.Edit, sender);
			}
		});
		this.form.getContextMenus().Pathways.getExternalEventMappingsAddItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.Add, sender);
			}
		});
		this.form.getContextMenus().Pathways.getExternalEventMappingsEditSpecialtyItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.EditSpecialty, sender);
			}
		});
		this.form.getContextMenus().Pathways.getExternalEventMappingsAddConsultantItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.AddConsultant, sender);
			}
		});
		this.form.getContextMenus().Pathways.getExternalEventMappingsEditConsultantItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.PathwaysNamespace.ExternalEventMappings.EditConsultant, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbDetailLookup();
		bindcmbGroupLookup();
		bindcmbSpecialtyLookup();
		bindcmbSearchSpecialtyLookup();
		bindcmbSearchDetailLookup();
		bindcmbSearchGroupLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbDetailLookup();
		bindcmbGroupLookup();
		bindcmbSpecialtyLookup();
		bindcmbSearchSpecialtyLookup();
		bindcmbSearchDetailLookup();
		bindcmbSearchGroupLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbDetailLookupValue();
		defaultcmbGroupLookupValue();
		defaultcmbSpecialtyLookupValue();
		defaultcmbSearchSpecialtyLookupValue();
		defaultcmbSearchDetailLookupValue();
		defaultcmbSearchGroupLookupValue();
	}
	private void onlyrDetailstabEventMappingDetailsActivated()
	{
		this.form.lyrDetails().showtabEventMappingDetails();
	}
	private void onlyrDetailstabEventMappingSpecialtyActivated()
	{
		this.form.lyrDetails().showtabEventMappingSpecialty();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	public abstract void clearContextInformation();
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
