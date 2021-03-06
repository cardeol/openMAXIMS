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

package ims.core.forms.supportnetworkprofessionalservices;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyrProServicesTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onChkNoneAtPresentProValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbProfessionServiceValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbHcpSubTypeValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkSupplyHcpValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbHcpNameValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbHcpNameTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbLocationHcpValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRadioButtongrpProfFilterValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGridProSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkNoneAtPresentSerValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbServiceValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkSupplyServiceDetailValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbLocationValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRadioButtongrpServiceFilterValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdServicesSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCopyFromClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnInactiveRecordClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onLnkGPDetailsClick() throws ims.framework.exceptions.PresentationLogicException;
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
				onFormOpen();
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.lyrProServices().tabProfessional().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrProServicestabProfessionalActivated();
			}
		});
		this.form.lyrProServices().tabServices().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrProServicestabServicesActivated();
			}
		});
		this.form.lyrProServices().tabProfessional().chkNoneAtPresentPro().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkNoneAtPresentProValueChanged();
			}
		});
		this.form.lyrProServices().tabProfessional().cmbProfessional().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbProfessionServiceValueChanged();
			}
		});
		this.form.lyrProServices().tabProfessional().cmbHcpSubType().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbHcpSubTypeValueChanged();
			}
		});
		this.form.lyrProServices().tabProfessional().chkSupplyHcp().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkSupplyHcpValueChanged();
			}
		});
		this.form.lyrProServices().tabProfessional().qmbHcpName().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbHcpNameValueChanged();
			}
		});
		this.form.lyrProServices().tabProfessional().qmbHcpName().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbHcpNameTextSubmited(value);
			}
		});
		this.form.lyrProServices().tabProfessional().cmbLocationHcp().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbLocationHcpValueChanged();
			}
		});
		this.form.lyrProServices().tabProfessional().grpProfFilter().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtongrpProfFilterValueChanged();
			}
		});
		this.form.lyrProServices().tabProfessional().grdProfessional().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGridProSelectionChanged();
			}
		});
		this.form.lyrProServices().tabServices().chkNoneAtPresentSer().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkNoneAtPresentSerValueChanged();
			}
		});
		this.form.lyrProServices().tabServices().cmbService().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbServiceValueChanged();
			}
		});
		this.form.lyrProServices().tabServices().chkSupplyServiceDetail().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkSupplyServiceDetailValueChanged();
			}
		});
		this.form.lyrProServices().tabServices().cmbLocation().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbLocationValueChanged();
			}
		});
		this.form.lyrProServices().tabServices().grpServiceFilter().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtongrpServiceFilterValueChanged();
			}
		});
		this.form.lyrProServices().tabServices().grdServices().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdServicesSelectionChanged();
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
		this.form.btnUpdate().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnUpdateClick();
			}
		});
		this.form.btnCopyFrom().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCopyFromClick();
			}
		});
		this.form.btnInactiveRecord().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnInactiveRecordClick();
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
		this.form.lnkGPDetails().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onLnkGPDetailsClick();
			}
		});
		this.form.getContextMenus().getLIPNewItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.LIP.New, sender);
			}
		});
		this.form.getContextMenus().getLIPUpdateItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.LIP.Update, sender);
			}
		});
	}
	private void onlyrProServicestabProfessionalActivated()
	{
		this.form.lyrProServices().showtabProfessional();
		onlyrProServicesTabChanged(this.form.lyrProServices().tabProfessional());
	}
	private void onlyrProServicestabServicesActivated()
	{
		this.form.lyrProServices().showtabServices();
		onlyrProServicesTabChanged(this.form.lyrProServices().tabServices());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
