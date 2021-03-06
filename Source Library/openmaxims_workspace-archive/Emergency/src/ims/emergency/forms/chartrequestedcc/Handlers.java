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

package ims.emergency.forms.chartrequestedcc;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbChartReceivedLookup();
	abstract protected void defaultcmbChartReceivedLookupValue();
	abstract protected void bindcmbReasonNotRequestedLookup();
	abstract protected void defaultcmbReasonNotRequestedLookupValue();
	abstract protected void bindcmbChartRequestedByReceptionLookup();
	abstract protected void defaultcmbChartRequestedByReceptionLookupValue();
	abstract protected void bindcmbChartRequiredByTriageLookup();
	abstract protected void defaultcmbChartRequiredByTriageLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbChartReceivedValueSet(Object value);
	abstract protected void onCmbChartReceivedValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbReasonNotRequestedValueSet(Object value);
	abstract protected void oncmbChartRequestedByReceptionValueSet(Object value);
	abstract protected void onCmbChartRequestedByReceptionValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbChartRequiredByTriageValueSet(Object value);

	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form)
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
		this.form.cmbChartReceived().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbChartReceivedValueSet(value);
			}
		});
		this.form.cmbChartReceived().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbChartReceivedValueChanged();
			}
		});
		this.form.cmbReasonNotRequested().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbReasonNotRequestedValueSet(value);
			}
		});
		this.form.cmbChartRequestedByReception().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbChartRequestedByReceptionValueSet(value);
			}
		});
		this.form.cmbChartRequestedByReception().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbChartRequestedByReceptionValueChanged();
			}
		});
		this.form.cmbChartRequiredByTriage().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbChartRequiredByTriageValueSet(value);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbChartReceivedLookup();
		bindcmbReasonNotRequestedLookup();
		bindcmbChartRequestedByReceptionLookup();
		bindcmbChartRequiredByTriageLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbChartReceivedLookup();
		bindcmbReasonNotRequestedLookup();
		bindcmbChartRequestedByReceptionLookup();
		bindcmbChartRequiredByTriageLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbChartReceivedLookupValue();
		defaultcmbReasonNotRequestedLookupValue();
		defaultcmbChartRequestedByReceptionLookupValue();
		defaultcmbChartRequiredByTriageLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIComponentEngine engine;
	protected GenForm form;
}
