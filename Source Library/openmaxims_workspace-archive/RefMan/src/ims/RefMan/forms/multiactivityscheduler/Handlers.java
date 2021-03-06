// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.multiactivityscheduler;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbTypeLookup();
	abstract protected void defaultcmbTypeLookupValue();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnDownloadClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdJobsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnRunClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onIntDaysValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkSunValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkSatValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkFriValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkThuValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkWedValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkTueValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkMonValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTimMonthlyTimeValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onIntDayOfMonthValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbTypeValueSet(Object value);
	abstract protected void onDtimStartValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbFrequencyValueChanged() throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen(args);
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
		this.form.btnDownload().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnDownloadClick();
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
		this.form.grdJobs().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdJobsSelectionChanged();
			}
		});
		this.form.btnRun().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnRunClick();
			}
		});
		this.form.lyrSchedule().tabPageDaily().intDays().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onIntDaysValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageWeekly().chkSun().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkSunValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageWeekly().chkSat().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkSatValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageWeekly().chkFri().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkFriValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageWeekly().chkThu().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkThuValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageWeekly().chkWed().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkWedValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageWeekly().chkTue().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkTueValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageWeekly().chkMon().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkMonValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageMonthly().timMonthlyTime().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onTimMonthlyTimeValueChanged();
			}
		});
		this.form.lyrSchedule().tabPageMonthly().intDayOfMonth().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onIntDayOfMonthValueChanged();
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
		this.form.btnEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditClick();
			}
		});
		this.form.cmbType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbTypeValueSet(value);
			}
		});
		this.form.dtimStart().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onDtimStartValueChanged();
			}
		});
		this.form.cmbFrequency().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbFrequencyValueChanged();
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbTypeLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbTypeLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbTypeLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
