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

package ims.icp.forms.patienticp;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbDisciplineLookup();
	abstract protected void defaultcmbDisciplineLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onLnkReturnClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onlyrMainTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onBtnDefaultViewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbDisciplineValueSet(Object value);
	abstract protected void onCmbDisciplineValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnViewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdActionsCellButtonClicked(ims.framework.controls.DynamicGridCell cell);
	abstract protected void onGrdActionsRowSelectionChanged(ims.framework.controls.DynamicGridRow row, ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkCompleteValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbStructuralContextInfoClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbStructuralHelpClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRecbrStructuredAssessmentValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbGraphicalContextInfoClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRecbrGraphicalAssessmentValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbGraphicalHelpClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDynamicFormFormModeChanged(ims.framework.enumerations.FormMode formMode);
	abstract protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCloseClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void OnComponentModeChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRecbrLinkedActionsValueChanged() throws ims.framework.exceptions.PresentationLogicException;
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
		this.form.lnkReturn().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onLnkReturnClick();
			}
		});
		this.form.lyrMain().tabPageActions().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrMaintabPageActionsActivated();
			}
		});
		this.form.lyrMain().tabPageDetails().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrMaintabPageDetailsActivated();
			}
		});
		this.form.lyrMain().tabPageClinicDetails().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrMaintabPageClinicDetailsActivated();
			}
		});
		this.form.lyrMain().tabPageActions().btnDefaultView().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnDefaultViewClick();
			}
		});
		this.form.lyrMain().tabPageActions().cmbDiscipline().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbDisciplineValueSet(value);
			}
		});
		this.form.lyrMain().tabPageActions().cmbDiscipline().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbDisciplineValueChanged();
			}
		});
		this.form.lyrMain().tabPageActions().btnView().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnViewClick();
			}
		});
		this.form.lyrMain().tabPageActions().grdActions().setDynamicGridCellButtonClickedEvent(new DynamicGridCellButtonClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridCell cell) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdActionsCellButtonClicked(cell);
			}
		});
		this.form.lyrMain().tabPageActions().grdActions().setDynamicGridRowSelectionChangedEvent(new DynamicGridRowSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridRow row, ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdActionsRowSelectionChanged(row, mouseButton);
			}
		});
		this.form.lyrMain().tabPageDetails().chkComplete().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkCompleteValueChanged();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabAssessment().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrICPtabAssessmentActivated();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabReport().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrICPtabReportActivated();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabGraphicAssessment().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrICPtabGraphicAssessmentActivated();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabForm().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrICPtabFormActivated();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabPageNoDetails().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrICPtabPageNoDetailsActivated();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabAssessment().imbStructuralContextInfo().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbStructuralContextInfoClick();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabAssessment().imbStructuralHelp().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbStructuralHelpClick();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabAssessment().recbrStructuredAssessment().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRecbrStructuredAssessmentValueChanged();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabGraphicAssessment().imbGraphicalContextInfo().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbGraphicalContextInfoClick();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabGraphicAssessment().recbrGraphicalAssessment().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRecbrGraphicalAssessmentValueChanged();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabGraphicAssessment().imbGraphicalHelp().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbGraphicalHelpClick();
			}
		});
		this.form.lyrMain().tabPageDetails().lyrICP().tabForm().dynamicForm().setFormModeChangedEvent(new DynamicFormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.FormMode value)
			{
				onDynamicFormFormModeChanged(value);
			}
		});
		this.form.lyrMain().tabPageDetails().btnNew().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnNewClick();
			}
		});
		this.form.lyrMain().tabPageDetails().btnUpdate().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnUpdateClick();
			}
		});
		this.form.lyrMain().tabPageDetails().btnClose().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCloseClick();
			}
		});
		this.form.lyrMain().tabPageDetails().btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.lyrMain().tabPageDetails().btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.lyrMain().tabPageClinicDetails().setccLinkedActionDetailsValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				OnComponentModeChanged();
			}
		});
		this.form.lyrMain().tabPageClinicDetails().recbrLinkedActions().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRecbrLinkedActionsValueChanged();
			}
		});
		this.form.getContextMenus().ICP.getActionMenuActionMetItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.ActionMet, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuActionNotMetItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.ActionNotMet, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuRecordVarianceItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.RecordVariance, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuViewHelpItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.ViewHelp, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuAddCriticalEventItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.AddCriticalEvent, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuEditCriticalEventItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.EditCriticalEvent, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuViewCriticalEventItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.ViewCriticalEvent, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuAddStageItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.AddStage, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuAddPhaseItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.AddPhase, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuAddEvaluationNoteItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.AddEvaluationNote, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuEditEvaluationNoteItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.EditEvaluationNote, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuViewEvaluationNoteItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.ViewEvaluationNote, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuInactivateItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.Inactivate, sender);
			}
		});
		this.form.getContextMenus().ICP.getActionMenuActivateItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.ICPNamespace.ActionMenu.Activate, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbDisciplineLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbDisciplineLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbDisciplineLookupValue();
	}
	private void onlyrMaintabPageActionsActivated()
	{
		this.form.lyrMain().showtabPageActions();
		onlyrMainTabChanged(this.form.lyrMain().tabPageActions());
	}
	private void onlyrMaintabPageDetailsActivated()
	{
		this.form.lyrMain().showtabPageDetails();
		onlyrMainTabChanged(this.form.lyrMain().tabPageDetails());
	}
	private void onlyrMaintabPageClinicDetailsActivated()
	{
		this.form.lyrMain().showtabPageClinicDetails();
		onlyrMainTabChanged(this.form.lyrMain().tabPageClinicDetails());
	}
	private void onlyrICPtabAssessmentActivated()
	{
		this.form.lyrMain().tabPageDetails().lyrICP().showtabAssessment();
	}
	private void onlyrICPtabReportActivated()
	{
		this.form.lyrMain().tabPageDetails().lyrICP().showtabReport();
	}
	private void onlyrICPtabGraphicAssessmentActivated()
	{
		this.form.lyrMain().tabPageDetails().lyrICP().showtabGraphicAssessment();
	}
	private void onlyrICPtabFormActivated()
	{
		this.form.lyrMain().tabPageDetails().lyrICP().showtabForm();
	}
	private void onlyrICPtabPageNoDetailsActivated()
	{
		this.form.lyrMain().tabPageDetails().lyrICP().showtabPageNoDetails();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
