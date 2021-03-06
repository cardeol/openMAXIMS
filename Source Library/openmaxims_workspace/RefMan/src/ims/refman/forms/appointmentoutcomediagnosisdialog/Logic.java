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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.appointmentoutcomediagnosisdialog;

import ims.RefMan.forms.appointmentoutcomediagnosisdialog.GenForm.grpFilterEnumeration;
import ims.RefMan.vo.PatientDiagnosisForAppointmentOutcomeVo;
import ims.clinical.vo.lookups.CodingItemType;
import ims.core.vo.DiagLiteVo;
import ims.core.vo.lookups.SourceofInformation;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.Date;
import ims.vo.interfaces.IClinicalCodingValue;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialise();
		open();
	}
	
	private void open()
	{
		populateScreenFromData(form.getGlobalContext().RefMan.getSelectedOutcomePatientDiagnosis());
		form.setMode(FormMode.EDIT);
	}
	
	private void populateScreenFromData(PatientDiagnosisForAppointmentOutcomeVo diagnosis)
	{
		clear();
		
		if(diagnosis == null)
			return;
		
		form.ccDiagnosis().setValue(diagnosis);
		form.chkDiagnosedOnAdmission().setValue(Boolean.TRUE.equals(diagnosis.getDiagnosedOnAdmission()));
		form.ccAuthInfo().setValue(diagnosis.getAuthoringInfo()); //WDEV-19860	
	}

	private void clear()
	{
		form.ccDiagnosis().setValue(null);
	}

	private void initialise()
	{
		form.ccDiagnosis().setCodingItemType(CodingItemType.DIAGNOSIS);
		form.ccDiagnosis().setIsRequired(true);
		form.ccDiagnosis().setParentEditing(true);
		
		setSpeciality();
		
		form.ccAuthInfo().initializeComponent();
	}

	private void setSpeciality()
	{
		form.ccDiagnosis().setHotlist(false);
		form.grpFilter().setValue(grpFilterEnumeration.rdoAll);
		
		if(form.getGlobalContext().Core.getEpisodeofCareShort() != null && form.getGlobalContext().Core.getEpisodeofCareShort().getSpecialty() != null)// 	WDEV-15962
		{
			form.ccDiagnosis().setSpecialty(form.getGlobalContext().Core.getEpisodeofCareShort().getSpecialty());// 	WDEV-15962
			form.ccDiagnosis().setHotlist(true);
			form.grpFilter().setValue(grpFilterEnumeration.rdoSpecialty);	
		}
	}

	@Override
	protected void onCcDiagnosisValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		if (Boolean.TRUE.equals(form.ccDiagnosis().isAllSelected()))
		{
			form.grpFilter().setValue(grpFilterEnumeration.rdoAll);
			form.ccDiagnosis().setHotlist(false);
			form.ccDiagnosis().search();
		}
	}
	
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(save())
			engine.close(DialogResult.OK);
	}
	
	private boolean save()
	{
		PatientDiagnosisForAppointmentOutcomeVo record = populateDataFromScreen(form.getGlobalContext().RefMan.getSelectedOutcomePatientDiagnosis());
		
		String[] errors = record.validate();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		form.getGlobalContext().RefMan.setSelectedOutcomePatientDiagnosis(record);
		
		return true;
	}

	private PatientDiagnosisForAppointmentOutcomeVo populateDataFromScreen(PatientDiagnosisForAppointmentOutcomeVo diagnosis)
	{
		if(diagnosis == null)
			diagnosis = new PatientDiagnosisForAppointmentOutcomeVo();
		
		IClinicalCodingValue voResult = form.ccDiagnosis().getValue();
		if (voResult != null)
		{
			if (voResult.getIClinicalCodingValue() instanceof DiagLiteVo)
			{
				DiagLiteVo voDiagnosis = (DiagLiteVo) voResult.getIClinicalCodingValue();
				if (voDiagnosis.getID_Diagnosis() != null && voDiagnosis.getID_Diagnosis().intValue() < 0)
					diagnosis.setDiagnosis(null);
				else
					diagnosis.setDiagnosis(voDiagnosis);

				diagnosis.setDiagnosisDescription(voResult.getIClinicalCodingValueDescription());
			}
			else
				throw new CodingRuntimeException("DiagLiteVo expected from component");
		}
		else
		{
			diagnosis.setDiagnosisDescription(null);
		}
		
		if (!diagnosis.getID_PatientDiagnosisIsNotNull())
		{
			diagnosis.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());
			diagnosis.setAuthoringInfo(form.ccAuthInfo().getValue());
			diagnosis.setDiagnosedDate((new Date()).toPartialDate());
			diagnosis.setSourceofInformation(SourceofInformation.CLINICALCONTACT);
			diagnosis.setEpisodeOfCare(form.getGlobalContext().Core.getEpisodeofCareShort());
			diagnosis.setDiagnosedOnAdmission(form.chkDiagnosedOnAdmission().getValue()); //WDEV-19860
		}
		
		return diagnosis;
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	@Override
	protected void onRadioButtongrpFilterValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		if (grpFilterEnumeration.rdoAll.equals(form.grpFilter().getValue()))
		{
			form.ccDiagnosis().setHotlist(false);
		}
		else
		{
			setSpeciality();
		}
	}

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
		
	}

	private void updateControlsState()
	{
		form.chkDiagnosedOnAdmission().setEnabled(FormMode.EDIT.equals(form.getMode()) && (form.getGlobalContext().RefMan.getSelectedOutcomePatientDiagnosis() == null || form.getGlobalContext().RefMan.getSelectedOutcomePatientDiagnosis().getID_PatientDiagnosis() == null)); //WDEV-19860		
	}
}
