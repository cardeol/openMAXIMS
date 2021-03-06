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

package ims.RefMan.forms.electivelistdetails;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbPatientCategoryLookup();
	abstract protected void defaultcmbPatientCategoryLookupValue();
	abstract protected void bindcmbTransportRequiredLookup();
	abstract protected void defaultcmbTransportRequiredLookupValue();
	abstract protected void bindcmbInterpreterRequiredLookup();
	abstract protected void defaultcmbInterpreterRequiredLookupValue();
	abstract protected void bindcmbLateralitySecondLookup();
	abstract protected void defaultcmbLateralitySecondLookupValue();
	abstract protected void bindcmbLateralityLookup();
	abstract protected void defaultcmbLateralityLookupValue();
	abstract protected void bindcmbPriorityLookup();
	abstract protected void defaultcmbPriorityLookupValue();
	abstract protected void bindcmbAnaestheticTypeLookup();
	abstract protected void defaultcmbAnaestheticTypeLookupValue();
	abstract protected void bindcmbTransportRequiredMedicalLookup();
	abstract protected void defaultcmbTransportRequiredMedicalLookupValue();
	abstract protected void bindcmbInterpreterRequiredMedicalLookup();
	abstract protected void defaultcmbInterpreterRequiredMedicalLookupValue();
	abstract protected void bindcmbPriorityMedicalLookup();
	abstract protected void defaultcmbPriorityMedicalLookupValue();
	abstract protected void bindcmbLateralitySecondMedicalLookup();
	abstract protected void defaultcmbLateralitySecondMedicalLookupValue();
	abstract protected void bindcmbLateralityMedicalLookup();
	abstract protected void defaultcmbLateralityMedicalLookupValue();
	abstract protected void bindcmbTransportRequiredEndoscopyLookup();
	abstract protected void defaultcmbTransportRequiredEndoscopyLookupValue();
	abstract protected void bindcmbInterpreterRequiredEndoscopyLookup();
	abstract protected void defaultcmbInterpreterRequiredEndoscopyLookupValue();
	abstract protected void bindcmbUrgencyEndoscopyLookup();
	abstract protected void defaultcmbUrgencyEndoscopyLookupValue();
	abstract protected void bindcmbERODReasonLookup();
	abstract protected void defaultcmbERODReasonLookupValue();
	abstract protected void bindcmbReasonDeclinedLookup();
	abstract protected void defaultcmbReasonDeclinedLookupValue();
	abstract protected void bindcmbTCOOfferedMethodLookup();
	abstract protected void defaultcmbTCOOfferedMethodLookupValue();
	abstract protected void bindcmbBreachReasonLookup();
	abstract protected void defaultcmbBreachReasonLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onMessageBoxClosed(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbPatientCategoryValueSet(Object value);
	abstract protected void onRadioButtonGroupElectiveListValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCloseClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnAddTCIClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnBookTheatreClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnAddERODClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnPatientSummaryClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnTheatreDashboardClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnBedManagementDashboardClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDteRequestedPlannedDateSurgicalValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRadioButtonGroupPlanedProceduresSurgicalValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbTransportRequiredValueSet(Object value);
	abstract protected void oncmbInterpreterRequiredValueSet(Object value);
	abstract protected void oncmbLateralitySecondValueSet(Object value);
	abstract protected void onDteDateGivenToPatientValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkPatientDateGivenToPatientValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbLateralityValueSet(Object value);
	abstract protected void oncmbPriorityValueSet(Object value);
	abstract protected void oncmbAnaestheticTypeValueSet(Object value);
	abstract protected void onRadioButtonGroupDaySurgMainTheatreValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDteRequestedPlannedMedicalValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRadioButtonGroupPlanedProceduresMedicalValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbTransportRequiredMedicalValueSet(Object value);
	abstract protected void oncmbInterpreterRequiredMedicalValueSet(Object value);
	abstract protected void oncmbPriorityMedicalValueSet(Object value);
	abstract protected void oncmbLateralitySecondMedicalValueSet(Object value);
	abstract protected void oncmbLateralityMedicalValueSet(Object value);
	abstract protected void onDteDateGivemToPatientMedicalValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkPatientDateGivenToPatientMedicalValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDteRequestedPlannedEndoscopyValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onRadioButtonGroupPlanedProceduresEndoscopyValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbTransportRequiredEndoscopyValueSet(Object value);
	abstract protected void oncmbInterpreterRequiredEndoscopyValueSet(Object value);
	abstract protected void oncmbUrgencyEndoscopyValueSet(Object value);
	abstract protected void onGrdNoteCommentsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdTCIHistorySelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdERODHistorySelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnRecordERODInErrorClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelERODClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveERODClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkEXTDelayValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditERODClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbERODReasonValueSet(Object value);
	abstract protected void onBtnPrintTCIClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnDNAClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveTCIClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelEditTCIClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditTCIClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbReasonDeclinedValueSet(Object value);
	abstract protected void onRadioButtonGroupWasReasonableValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbTCIWardTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbHospitalValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbHospitalTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelTCIClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbTCOOfferedMethodValueSet(Object value);
	abstract protected void oncmbBreachReasonValueSet(Object value);
	abstract protected void onDteTCIDateValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnPreAssessmentOutcomeClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnElectiveListRequestClick() throws ims.framework.exceptions.PresentationLogicException;
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
		this.form.setMessageBoxClosedEvent(new MessageBoxClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onMessageBoxClosed(messageBoxId, result);
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
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.ctnDetails().cmbPatientCategory().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPatientCategoryValueSet(value);
			}
		});
		this.form.ctnDetails().GroupElectiveList().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtonGroupElectiveListValueChanged();
			}
		});
		this.form.ctnDetails().btnClose().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCloseClick();
			}
		});
		this.form.ctnDetails().btnAddTCI().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnAddTCIClick();
			}
		});
		this.form.ctnDetails().btnBookTheatre().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnBookTheatreClick();
			}
		});
		this.form.ctnDetails().btnAddEROD().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnAddERODClick();
			}
		});
		this.form.ctnDetails().btnPatientSummary().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnPatientSummaryClick();
			}
		});
		this.form.ctnDetails().btnTheatreDashboard().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnTheatreDashboardClick();
			}
		});
		this.form.ctnDetails().btnBedManagementDashboard().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnBedManagementDashboardClick();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().dteRequestedPlannedDateSurgical().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onDteRequestedPlannedDateSurgicalValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().GroupPlanedProceduresSurgical().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtonGroupPlanedProceduresSurgicalValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().cmbTransportRequired().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbTransportRequiredValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().cmbInterpreterRequired().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbInterpreterRequiredValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().cmbLateralitySecond().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbLateralitySecondValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().dteDateGivenToPatient().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onDteDateGivenToPatientValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().chkPatientDateGivenToPatient().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkPatientDateGivenToPatientValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().cmbLaterality().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbLateralityValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().cmbPriority().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPriorityValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().cmbAnaestheticType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbAnaestheticTypeValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageSurgical().GroupDaySurgMainTheatre().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtonGroupDaySurgMainTheatreValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().dteRequestedPlannedMedical().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onDteRequestedPlannedMedicalValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().GroupPlanedProceduresMedical().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtonGroupPlanedProceduresMedicalValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().cmbTransportRequiredMedical().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbTransportRequiredMedicalValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().cmbInterpreterRequiredMedical().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbInterpreterRequiredMedicalValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().cmbPriorityMedical().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPriorityMedicalValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().cmbLateralitySecondMedical().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbLateralitySecondMedicalValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().cmbLateralityMedical().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbLateralityMedicalValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().dteDateGivemToPatientMedical().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onDteDateGivemToPatientMedicalValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageMedical().chkPatientDateGivenToPatientMedical().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkPatientDateGivenToPatientMedicalValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageEndoscopy().dteRequestedPlannedEndoscopy().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onDteRequestedPlannedEndoscopyValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageEndoscopy().GroupPlanedProceduresEndoscopy().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtonGroupPlanedProceduresEndoscopyValueChanged();
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageEndoscopy().cmbTransportRequiredEndoscopy().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbTransportRequiredEndoscopyValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageEndoscopy().cmbInterpreterRequiredEndoscopy().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbInterpreterRequiredEndoscopyValueSet(value);
			}
		});
		this.form.ctnDetails().lyrWaitingListDetails().tabPageEndoscopy().cmbUrgencyEndoscopy().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbUrgencyEndoscopyValueSet(value);
			}
		});
		this.form.ctnDetails().lyrHistory().tabPageNotes().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrHistorytabPageNotesActivated();
			}
		});
		this.form.ctnDetails().lyrHistory().tabPageTCIHistory().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrHistorytabPageTCIHistoryActivated();
			}
		});
		this.form.ctnDetails().lyrHistory().tabPageErodHistory().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrHistorytabPageErodHistoryActivated();
			}
		});
		this.form.ctnDetails().lyrHistory().tabPageNotes().grdNoteComments().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdNoteCommentsSelectionChanged();
			}
		});
		this.form.ctnDetails().lyrHistory().tabPageTCIHistory().grdTCIHistory().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdTCIHistorySelectionChanged();
			}
		});
		this.form.ctnDetails().lyrHistory().tabPageErodHistory().grdERODHistory().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdERODHistorySelectionChanged();
			}
		});
		this.form.ctnDetails().btnRecordERODInError().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnRecordERODInErrorClick();
			}
		});
		this.form.ctnDetails().btnCancelEROD().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelERODClick();
			}
		});
		this.form.ctnDetails().btnSaveEROD().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveERODClick();
			}
		});
		this.form.ctnDetails().chkEXTDelay().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkEXTDelayValueChanged();
			}
		});
		this.form.ctnDetails().btnEditEROD().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditERODClick();
			}
		});
		this.form.ctnDetails().cmbERODReason().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbERODReasonValueSet(value);
			}
		});
		this.form.ctnDetails().btnPrintTCI().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnPrintTCIClick();
			}
		});
		this.form.ctnDetails().btnDNA().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnDNAClick();
			}
		});
		this.form.ctnDetails().btnSaveTCI().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveTCIClick();
			}
		});
		this.form.ctnDetails().btnCancelEditTCI().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelEditTCIClick();
			}
		});
		this.form.ctnDetails().btnEditTCI().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditTCIClick();
			}
		});
		this.form.ctnDetails().cmbReasonDeclined().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbReasonDeclinedValueSet(value);
			}
		});
		this.form.ctnDetails().GroupWasReasonable().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onRadioButtonGroupWasReasonableValueChanged();
			}
		});
		this.form.ctnDetails().qmbTCIWard().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbTCIWardTextSubmited(value);
			}
		});
		this.form.ctnDetails().qmbHospital().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbHospitalValueChanged();
			}
		});
		this.form.ctnDetails().qmbHospital().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbHospitalTextSubmited(value);
			}
		});
		this.form.ctnDetails().btnCancelTCI().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelTCIClick();
			}
		});
		this.form.ctnDetails().cmbTCOOfferedMethod().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbTCOOfferedMethodValueSet(value);
			}
		});
		this.form.ctnDetails().cmbBreachReason().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbBreachReasonValueSet(value);
			}
		});
		this.form.ctnDetails().dteTCIDate().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onDteTCIDateValueChanged();
			}
		});
		this.form.ctnDetails().btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.ctnDetails().btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.ctnDetails().btnEdit().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnEditClick();
			}
		});
		this.form.ctnDetails().btnPreAssessmentOutcome().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnPreAssessmentOutcomeClick();
			}
		});
		this.form.ctnDetails().btnElectiveListRequest().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnElectiveListRequestClick();
			}
		});
		this.form.getContextMenus().RefMan.getNewElectiveListNotesMenu1ADDItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.NewElectiveListNotesMenu1.ADD, sender);
			}
		});
		this.form.getContextMenus().RefMan.getNewElectiveListNotesMenu1EDITItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.NewElectiveListNotesMenu1.EDIT, sender);
			}
		});
		this.form.getContextMenus().RefMan.getNewElectiveListNotesMenu1VIEWItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.NewElectiveListNotesMenu1.VIEW, sender);
			}
		});
		this.form.getContextMenus().RefMan.getNewElectiveListNotesMenu1RIEItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.NewElectiveListNotesMenu1.RIE, sender);
			}
		});
		this.form.getContextMenus().RefMan.getTCIHistoryMenuVIEW_EDIT_CANCELLATION_DETAILSItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.TCIHistoryMenu.VIEW_EDIT_CANCELLATION_DETAILS, sender);
			}
		});
		this.form.getContextMenus().RefMan.getTCIHistoryMenuEDIT_CANCELLATION_DETAILSItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.TCIHistoryMenu.EDIT_CANCELLATION_DETAILS, sender);
			}
		});
		this.form.getContextMenus().RefMan.getTCIHistoryMenuRECORD_REASONABLE_28_DAY_RULE_OFFERItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.TCIHistoryMenu.RECORD_REASONABLE_28_DAY_RULE_OFFER, sender);
			}
		});
		this.form.getContextMenus().RefMan.getTCIHistoryMenuVIEW_TCI_DETAILSItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.TCIHistoryMenu.VIEW_TCI_DETAILS, sender);
			}
		});
		this.form.getContextMenus().RefMan.getERODHistoryMenuVIEW_ERODItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.RefManNamespace.ERODHistoryMenu.VIEW_EROD, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbPatientCategoryLookup();
		bindcmbTransportRequiredLookup();
		bindcmbInterpreterRequiredLookup();
		bindcmbLateralitySecondLookup();
		bindcmbLateralityLookup();
		bindcmbPriorityLookup();
		bindcmbAnaestheticTypeLookup();
		bindcmbTransportRequiredMedicalLookup();
		bindcmbInterpreterRequiredMedicalLookup();
		bindcmbPriorityMedicalLookup();
		bindcmbLateralitySecondMedicalLookup();
		bindcmbLateralityMedicalLookup();
		bindcmbTransportRequiredEndoscopyLookup();
		bindcmbInterpreterRequiredEndoscopyLookup();
		bindcmbUrgencyEndoscopyLookup();
		bindcmbERODReasonLookup();
		bindcmbReasonDeclinedLookup();
		bindcmbTCOOfferedMethodLookup();
		bindcmbBreachReasonLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbPatientCategoryLookup();
		bindcmbTransportRequiredLookup();
		bindcmbInterpreterRequiredLookup();
		bindcmbLateralitySecondLookup();
		bindcmbLateralityLookup();
		bindcmbPriorityLookup();
		bindcmbAnaestheticTypeLookup();
		bindcmbTransportRequiredMedicalLookup();
		bindcmbInterpreterRequiredMedicalLookup();
		bindcmbPriorityMedicalLookup();
		bindcmbLateralitySecondMedicalLookup();
		bindcmbLateralityMedicalLookup();
		bindcmbTransportRequiredEndoscopyLookup();
		bindcmbInterpreterRequiredEndoscopyLookup();
		bindcmbUrgencyEndoscopyLookup();
		bindcmbERODReasonLookup();
		bindcmbReasonDeclinedLookup();
		bindcmbTCOOfferedMethodLookup();
		bindcmbBreachReasonLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbPatientCategoryLookupValue();
		defaultcmbTransportRequiredLookupValue();
		defaultcmbInterpreterRequiredLookupValue();
		defaultcmbLateralitySecondLookupValue();
		defaultcmbLateralityLookupValue();
		defaultcmbPriorityLookupValue();
		defaultcmbAnaestheticTypeLookupValue();
		defaultcmbTransportRequiredMedicalLookupValue();
		defaultcmbInterpreterRequiredMedicalLookupValue();
		defaultcmbPriorityMedicalLookupValue();
		defaultcmbLateralitySecondMedicalLookupValue();
		defaultcmbLateralityMedicalLookupValue();
		defaultcmbTransportRequiredEndoscopyLookupValue();
		defaultcmbInterpreterRequiredEndoscopyLookupValue();
		defaultcmbUrgencyEndoscopyLookupValue();
		defaultcmbERODReasonLookupValue();
		defaultcmbReasonDeclinedLookupValue();
		defaultcmbTCOOfferedMethodLookupValue();
		defaultcmbBreachReasonLookupValue();
	}
	private void onlyrHistorytabPageNotesActivated()
	{
		this.form.ctnDetails().lyrHistory().showtabPageNotes();
	}
	private void onlyrHistorytabPageTCIHistoryActivated()
	{
		this.form.ctnDetails().lyrHistory().showtabPageTCIHistory();
	}
	private void onlyrHistorytabPageErodHistoryActivated()
	{
		this.form.ctnDetails().lyrHistory().showtabPageErodHistory();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
