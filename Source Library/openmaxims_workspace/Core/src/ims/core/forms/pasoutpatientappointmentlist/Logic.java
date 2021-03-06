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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.71 build 3876.28032)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.core.forms.pasoutpatientappointmentlist;

import java.util.ArrayList;
import java.util.List;

import ims.configuration.gen.ConfigFlag;
import ims.core.forms.pasoutpatientappointmentlist.GenForm.grdOPAttendencesRow;
import ims.core.vo.ClinicLiteVoCollection;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.OutPatientAttendanceVo;
import ims.core.vo.OutPatientAttendanceVoCollection;
import ims.core.vo.OutPatientListSearchCriteriaVo;
import ims.core.vo.lookups.PatIdType;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	@Override
	protected void onCmbLocationValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.qmbClinic().clear();//WDEV-14607
		
		if (form.cmbLocation().getValue() != null)
			form.qmbClinic().setEnabled(true);
		else
			form.qmbClinic().setEnabled(false);
	}
	@Override
	protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearInstanceControls();
	}

	private void clearInstanceControls()
	{
		form.qmbClinic().clear();
		form.qmbClinic().setEnabled(false);
		form.cmbLocation().setValue(null);
		form.dteFromDate().setValue(null);
		form.dteToDate().setValue(null);
		form.grdOPAttendences().getRows().clear();
		form.getGlobalContext().Core.setOutPatientSearchCriteria(null);

	}

	@Override
	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		search();
	}

	private void search()
	{
		form.getGlobalContext().Core.setOutPatientSearchCriteria(null);

		form.grdOPAttendences().getRows().clear();

		String[] errors = validateSearch();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return;
		}
		
		OutPatientListSearchCriteriaVo voOutPatSearch = new OutPatientListSearchCriteriaVo();
		voOutPatSearch.setClinic(form.qmbClinic().getValue());
		voOutPatSearch.setLocation(form.cmbLocation().getValue());
		voOutPatSearch.setDateFrom(form.dteFromDate().getValue());
		voOutPatSearch.setDateTo(form.dteToDate().getValue());

		populateOutPatientList(domain.listOutpatients(voOutPatSearch, false));

	}
	
	private String[] validateSearch() 
	{
		List<String> uiErrors = new ArrayList<String>();
		
		if (form.dteFromDate().getValue() == null && form.qmbClinic().getValue() == null)
		{
			uiErrors.add("Valid search criteria must be specified - Please enter a 'Clinic' or a 'From Date'.");//WDEV-14607
		}
		
		if(form.dteFromDate().getValue() != null && form.dteToDate().getValue() != null && form.dteToDate().getValue().isLessThan(form.dteFromDate().getValue()))
		{
			uiErrors.add("Date To cannot be set before date From.");
		}
		
		String[] searchErrors = new String[uiErrors.size()];
		uiErrors.toArray(searchErrors);
		
		return searchErrors;
	}
	
	private void populateOutPatientList(OutPatientAttendanceVoCollection voOutPatColl)
	{
		if (voOutPatColl != null)
		{
			if (voOutPatColl.size() == 0)
			{
				engine.showMessage("No matching patients found.");
				return;
			}
			storeSearchCriteria();
			grdOPAttendencesRow row = null;
			for (int i = 0; i < voOutPatColl.size(); i++)
			{
				OutPatientAttendanceVo voOutPatient = voOutPatColl.get(i);
				if (voOutPatient != null 
					&& voOutPatient.getPasEventIsNotNull() 
					&& voOutPatient.getPasEvent().getPatientIsNotNull())
				{
					row = form.grdOPAttendences().getRows().newRow();
					
					if (voOutPatient.getPasEvent().getPatient().getNameIsNotNull())
					{
						row.setcolForename(voOutPatient.getPasEvent().getPatient().getName().getForename());
						row.setcolSurname(voOutPatient.getPasEvent().getPatient().getName().getSurname());
					}

					ims.core.vo.PatientId voPatId = voOutPatient.getPasEvent().getPatient().getDisplayId();
					if (voPatId != null)
						row.setcolHospnum(voPatId.getValue());

					if (voOutPatient.getPasEvent().getPatient().getDobIsNotNull())
						row.setcolDob(voOutPatient.getPasEvent().getPatient().getDob().toString());

					if (voOutPatient.getPasEvent().getPatient().getAgeIsNotNull())
						row.setColAge(voOutPatient.getPasEvent().getPatient().getAge().toString());
					else
						row.setColAge(voOutPatient.getPasEvent().getPatient().calculateAge()!=null ? voOutPatient.getPasEvent().getPatient().calculateAge().toString():null);//WDEV-17541

					if (voOutPatient.getPasEvent().getPatient().getSexIsNotNull())
						row.setcolSex(voOutPatient.getPasEvent().getPatient().getSex().getText());

					if (voOutPatient.getClinicIsNotNull())
						row.setcolClinic(voOutPatient.getClinic().getClinicName());

					if (voOutPatient.getPasEvent() != null && voOutPatient.getPasEvent().getSpecialty() != null)
						row.setcolSpecialty(voOutPatient.getPasEvent().getSpecialty().getText());

					if (voOutPatient.getAppointmentDateTimeIsNotNull())
						row.setcolClinicDate(voOutPatient.getAppointmentDateTime().toString());

					if (voOutPatient.getPasEvent().getPatient().getIsDead() != null && voOutPatient.getPasEvent().getPatient().getIsDead().booleanValue())
						row.setBackColor(ConfigFlag.UI.RIP_COLOUR.getValue());

					row.setValue(voOutPatient.getPasEvent().getPatient());
				}

			}
		}

	}

	private void storeSearchCriteria()
	{
		OutPatientListSearchCriteriaVo voOutPatSearch = new OutPatientListSearchCriteriaVo();
		voOutPatSearch.setClinic(form.qmbClinic().getValue());
		voOutPatSearch.setLocation(form.cmbLocation().getValue());
		voOutPatSearch.setDateFrom(form.dteFromDate().getValue());
		voOutPatSearch.setDateTo(form.dteToDate().getValue());
		form.getGlobalContext().Core.setOutPatientSearchCriteria(voOutPatSearch);
	}

	private void open()
	{
		if (form.getGlobalContext().Core.getOutPatientSearchCriteriaIsNotNull())
		{
			displaySearchCriteria();
			search();
		}

	}
	
	private void displaySearchCriteria()
	{
		form.dteFromDate().setValue(form.getGlobalContext().Core.getOutPatientSearchCriteria().getDateFrom());
		form.dteToDate().setValue(form.getGlobalContext().Core.getOutPatientSearchCriteria().getDateTo());
		form.cmbLocation().setValue(form.getGlobalContext().Core.getOutPatientSearchCriteria().getLocation());
		if (form.cmbLocation().getValue() != null && form.getGlobalContext().Core.getOutPatientSearchCriteria().getClinicIsNotNull())
		{
			form.qmbClinic().newRow(form.getGlobalContext().Core.getOutPatientSearchCriteria().getClinic(), form.getGlobalContext().Core.getOutPatientSearchCriteria().getClinic().getClinicName());
			form.qmbClinic().setValue(form.getGlobalContext().Core.getOutPatientSearchCriteria().getClinic());
		}
	}

	private void initialize()
	{
		form.qmbClinic().setEnabled(false);

		PatIdType dispIdType = PatIdType.getNegativeInstance(ConfigFlag.UI.DISPLAY_PATID_TYPE.getValue());
		form.grdOPAttendences().setcolHospnumCaption(dispIdType.getText());
		
		loadClinicLocationCombo();
		form.dteFromDate().setValue(new Date());
	}

	
	private void loadClinicLocationCombo()
	{
		LocationLiteVoCollection voLocationLiteColl = domain.listActiveLocations();
		if (voLocationLiteColl != null)
		{
			String currentLocName = "";
			for (int i = 0; i < voLocationLiteColl.size(); i++)
			{
				form.cmbLocation().newRow(voLocationLiteColl.get(i), voLocationLiteColl.get(i).getName().toString());
				//WDEV-4585
				
				if (engine.getCurrentLocation() != null)
				{
					// WDEV-2847
					currentLocName = engine.getCurrentLocation().getName();
					if (currentLocName.equals(voLocationLiteColl.get(i).getName()))
					{
						form.cmbLocation().setValue(voLocationLiteColl.get(i));
						form.qmbClinic().setEnabled(true);
					}
				}
			}
		}
	}

	@Override
	protected void onQmbClinicTextSubmited(String value) throws PresentationLogicException 
	{
		if (form.cmbLocation().getValue() == null)
		{
			engine.showMessage("Please select a Location");
			form.cmbLocation().setFocus();
			return;
		}
		loadClinicsbyLocation(form.cmbLocation().getValue(), value);
	}
	private void loadClinicsbyLocation(LocationLiteVo voLocLite, String strClinicName)
	{
		form.qmbClinic().clear();

		if (voLocLite != null)
		{
			ClinicLiteVoCollection voClinicLiteColl = domain.listClinicsforLocation(voLocLite, strClinicName);

			if (voClinicLiteColl != null)
			{
				for (int i = 0; i < voClinicLiteColl.size(); i++)
				{
					if (Boolean.TRUE.equals(voClinicLiteColl.get(i).getIsActive())) //WDEV-19978
					{
					 form.qmbClinic().newRow(voClinicLiteColl.get(i), voClinicLiteColl.get(i).getClinicName());
					}
				}
				if (voClinicLiteColl.size() == 1)
					form.qmbClinic().setValue(voClinicLiteColl.get(0));
				else if (voClinicLiteColl.size() > 1)
					form.qmbClinic().showOpened();
			}
		}

	}
	@Override
	protected void onGrdOPAttendencesSelectionChanged() throws PresentationLogicException 
	{
		form.getGlobalContext().Core.setPatientShort(null);
		form.getGlobalContext().Core.setPatientToBeDisplayed(form.grdOPAttendences().getValue());

		engine.open(ConfigFlag.UI.DEMOGRAPHICS_FORM.getValue());
	}
}
