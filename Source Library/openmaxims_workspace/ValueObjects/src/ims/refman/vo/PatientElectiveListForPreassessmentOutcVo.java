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

package ims.RefMan.vo;

/**
 * Linked to RefMan.PatientElectiveList business object (ID: 1014100020).
 */
public class PatientElectiveListForPreassessmentOutcVo extends ims.RefMan.vo.PatientElectiveListRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientElectiveListForPreassessmentOutcVo()
	{
	}
	public PatientElectiveListForPreassessmentOutcVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientElectiveListForPreassessmentOutcVo(ims.RefMan.vo.beans.PatientElectiveListForPreassessmentOutcVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.preassessmentoutcome = bean.getPreAssessmentOutcome() == null ? null : bean.getPreAssessmentOutcome().buildVo();
		this.fitforsurgery = bean.getFitForSurgery() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getFitForSurgery());
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.electivelist = bean.getElectiveList() == null ? null : bean.getElectiveList().buildVo();
		this.primaryprocedure = bean.getPrimaryProcedure() == null ? null : bean.getPrimaryProcedure().buildVo();
		this.proclaterality = bean.getProcLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getProcLaterality());
		this.secondaryprocedure = bean.getSecondaryProcedure() == null ? null : bean.getSecondaryProcedure().buildVo();
		this.secondaryproclaterality = bean.getSecondaryProcLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getSecondaryProcLaterality());
		this.wlanaesthetictype = bean.getWLAnaestheticType() == null ? null : ims.clinical.vo.lookups.AnaestheticType.buildLookup(bean.getWLAnaestheticType());
		this.haspacemakerdefib = bean.getHasPacemakerDefib();
		this.patientreceivinganticoagulanttherapy = bean.getPatientReceivingAnticoagulantTherapy() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getPatientReceivingAnticoagulantTherapy());
		this.wlpatientreceivinganticoagulanttherapy = bean.getWLPatientReceivingAnticoagulantTherapy() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getWLPatientReceivingAnticoagulantTherapy());
		this.availableatshortnotice = bean.getAvailableAtShortNotice();
		this.wlavailableatshortnotice = bean.getWLAvailableAtShortNotice();
		this.availableatshortnoticeperiod = bean.getAvailableAtShortNoticePeriod();
		this.wlavailableatshortnoticeperiod = bean.getWLAvailableAtShortNoticePeriod();
		this.preoperativeovernightstayrequired = bean.getPreOperativeOvernightStayRequired();
		this.wlpreoperativeovernightstayrequired = bean.getWLPreOperativeOvernightStayRequired();
		this.noofpreoperativenights = bean.getNoOfPreOperativeNights();
		this.wlnoofpreoperativenights = bean.getWLNoOfPreOperativeNights();
		this.anticipatedstay = bean.getAnticipatedStay();
		this.wlanticipatedstay = bean.getWLAnticipatedStay();
		this.requiredtheatretype = bean.getRequiredTheatreType() == null ? null : ims.scheduling.vo.lookups.TheatreType.buildLookup(bean.getRequiredTheatreType());
		this.electiveliststatus = bean.getElectiveListStatus() == null ? null : bean.getElectiveListStatus().buildVo();
		this.electiveliststatushistory = ims.RefMan.vo.ElectiveListStatusVoCollection.buildFromBeanCollection(bean.getElectiveListStatusHistory());
		this.electiveadmissiontype = bean.getElectiveAdmissionType() == null ? null : ims.RefMan.vo.lookups.ElectiveAdmissionType.buildLookup(bean.getElectiveAdmissionType());
		this.criticalcarebedrequired = bean.getCriticalCareBedRequired();
		this.anaesthetictype = bean.getAnaestheticType() == null ? null : ims.clinical.vo.lookups.AnaestheticType.buildLookup(bean.getAnaestheticType());
		this.hospital = bean.getHospital() == null ? null : new ims.core.resource.place.vo.LocationRefVo(new Integer(bean.getHospital().getId()), bean.getHospital().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.PatientElectiveListForPreassessmentOutcVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.preassessmentoutcome = bean.getPreAssessmentOutcome() == null ? null : bean.getPreAssessmentOutcome().buildVo(map);
		this.fitforsurgery = bean.getFitForSurgery() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getFitForSurgery());
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.electivelist = bean.getElectiveList() == null ? null : bean.getElectiveList().buildVo(map);
		this.primaryprocedure = bean.getPrimaryProcedure() == null ? null : bean.getPrimaryProcedure().buildVo(map);
		this.proclaterality = bean.getProcLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getProcLaterality());
		this.secondaryprocedure = bean.getSecondaryProcedure() == null ? null : bean.getSecondaryProcedure().buildVo(map);
		this.secondaryproclaterality = bean.getSecondaryProcLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getSecondaryProcLaterality());
		this.wlanaesthetictype = bean.getWLAnaestheticType() == null ? null : ims.clinical.vo.lookups.AnaestheticType.buildLookup(bean.getWLAnaestheticType());
		this.haspacemakerdefib = bean.getHasPacemakerDefib();
		this.patientreceivinganticoagulanttherapy = bean.getPatientReceivingAnticoagulantTherapy() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getPatientReceivingAnticoagulantTherapy());
		this.wlpatientreceivinganticoagulanttherapy = bean.getWLPatientReceivingAnticoagulantTherapy() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getWLPatientReceivingAnticoagulantTherapy());
		this.availableatshortnotice = bean.getAvailableAtShortNotice();
		this.wlavailableatshortnotice = bean.getWLAvailableAtShortNotice();
		this.availableatshortnoticeperiod = bean.getAvailableAtShortNoticePeriod();
		this.wlavailableatshortnoticeperiod = bean.getWLAvailableAtShortNoticePeriod();
		this.preoperativeovernightstayrequired = bean.getPreOperativeOvernightStayRequired();
		this.wlpreoperativeovernightstayrequired = bean.getWLPreOperativeOvernightStayRequired();
		this.noofpreoperativenights = bean.getNoOfPreOperativeNights();
		this.wlnoofpreoperativenights = bean.getWLNoOfPreOperativeNights();
		this.anticipatedstay = bean.getAnticipatedStay();
		this.wlanticipatedstay = bean.getWLAnticipatedStay();
		this.requiredtheatretype = bean.getRequiredTheatreType() == null ? null : ims.scheduling.vo.lookups.TheatreType.buildLookup(bean.getRequiredTheatreType());
		this.electiveliststatus = bean.getElectiveListStatus() == null ? null : bean.getElectiveListStatus().buildVo(map);
		this.electiveliststatushistory = ims.RefMan.vo.ElectiveListStatusVoCollection.buildFromBeanCollection(bean.getElectiveListStatusHistory());
		this.electiveadmissiontype = bean.getElectiveAdmissionType() == null ? null : ims.RefMan.vo.lookups.ElectiveAdmissionType.buildLookup(bean.getElectiveAdmissionType());
		this.criticalcarebedrequired = bean.getCriticalCareBedRequired();
		this.anaesthetictype = bean.getAnaestheticType() == null ? null : ims.clinical.vo.lookups.AnaestheticType.buildLookup(bean.getAnaestheticType());
		this.hospital = bean.getHospital() == null ? null : new ims.core.resource.place.vo.LocationRefVo(new Integer(bean.getHospital().getId()), bean.getHospital().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.PatientElectiveListForPreassessmentOutcVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.PatientElectiveListForPreassessmentOutcVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.PatientElectiveListForPreassessmentOutcVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("PREASSESSMENTOUTCOME"))
			return getPreAssessmentOutcome();
		if(fieldName.equals("FITFORSURGERY"))
			return getFitForSurgery();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("ELECTIVELIST"))
			return getElectiveList();
		if(fieldName.equals("PRIMARYPROCEDURE"))
			return getPrimaryProcedure();
		if(fieldName.equals("PROCLATERALITY"))
			return getProcLaterality();
		if(fieldName.equals("SECONDARYPROCEDURE"))
			return getSecondaryProcedure();
		if(fieldName.equals("SECONDARYPROCLATERALITY"))
			return getSecondaryProcLaterality();
		if(fieldName.equals("WLANAESTHETICTYPE"))
			return getWLAnaestheticType();
		if(fieldName.equals("HASPACEMAKERDEFIB"))
			return getHasPacemakerDefib();
		if(fieldName.equals("PATIENTRECEIVINGANTICOAGULANTTHERAPY"))
			return getPatientReceivingAnticoagulantTherapy();
		if(fieldName.equals("WLPATIENTRECEIVINGANTICOAGULANTTHERAPY"))
			return getWLPatientReceivingAnticoagulantTherapy();
		if(fieldName.equals("AVAILABLEATSHORTNOTICE"))
			return getAvailableAtShortNotice();
		if(fieldName.equals("WLAVAILABLEATSHORTNOTICE"))
			return getWLAvailableAtShortNotice();
		if(fieldName.equals("AVAILABLEATSHORTNOTICEPERIOD"))
			return getAvailableAtShortNoticePeriod();
		if(fieldName.equals("WLAVAILABLEATSHORTNOTICEPERIOD"))
			return getWLAvailableAtShortNoticePeriod();
		if(fieldName.equals("PREOPERATIVEOVERNIGHTSTAYREQUIRED"))
			return getPreOperativeOvernightStayRequired();
		if(fieldName.equals("WLPREOPERATIVEOVERNIGHTSTAYREQUIRED"))
			return getWLPreOperativeOvernightStayRequired();
		if(fieldName.equals("NOOFPREOPERATIVENIGHTS"))
			return getNoOfPreOperativeNights();
		if(fieldName.equals("WLNOOFPREOPERATIVENIGHTS"))
			return getWLNoOfPreOperativeNights();
		if(fieldName.equals("ANTICIPATEDSTAY"))
			return getAnticipatedStay();
		if(fieldName.equals("WLANTICIPATEDSTAY"))
			return getWLAnticipatedStay();
		if(fieldName.equals("REQUIREDTHEATRETYPE"))
			return getRequiredTheatreType();
		if(fieldName.equals("ELECTIVELISTSTATUS"))
			return getElectiveListStatus();
		if(fieldName.equals("ELECTIVELISTSTATUSHISTORY"))
			return getElectiveListStatusHistory();
		if(fieldName.equals("ELECTIVEADMISSIONTYPE"))
			return getElectiveAdmissionType();
		if(fieldName.equals("CRITICALCAREBEDREQUIRED"))
			return getCriticalCareBedRequired();
		if(fieldName.equals("ANAESTHETICTYPE"))
			return getAnaestheticType();
		if(fieldName.equals("HOSPITAL"))
			return getHospital();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPreAssessmentOutcomeIsNotNull()
	{
		return this.preassessmentoutcome != null;
	}
	public ims.RefMan.vo.PreAssessmentOutcomeVo getPreAssessmentOutcome()
	{
		return this.preassessmentoutcome;
	}
	public void setPreAssessmentOutcome(ims.RefMan.vo.PreAssessmentOutcomeVo value)
	{
		this.isValidated = false;
		this.preassessmentoutcome = value;
	}
	public boolean getFitForSurgeryIsNotNull()
	{
		return this.fitforsurgery != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getFitForSurgery()
	{
		return this.fitforsurgery;
	}
	public void setFitForSurgery(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.fitforsurgery = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getElectiveListIsNotNull()
	{
		return this.electivelist != null;
	}
	public ims.admin.vo.ElectiveListConfigurationVo getElectiveList()
	{
		return this.electivelist;
	}
	public void setElectiveList(ims.admin.vo.ElectiveListConfigurationVo value)
	{
		this.isValidated = false;
		this.electivelist = value;
	}
	public boolean getPrimaryProcedureIsNotNull()
	{
		return this.primaryprocedure != null;
	}
	public ims.core.vo.ProcedureVo getPrimaryProcedure()
	{
		return this.primaryprocedure;
	}
	public void setPrimaryProcedure(ims.core.vo.ProcedureVo value)
	{
		this.isValidated = false;
		this.primaryprocedure = value;
	}
	public boolean getProcLateralityIsNotNull()
	{
		return this.proclaterality != null;
	}
	public ims.core.vo.lookups.LateralityLRB getProcLaterality()
	{
		return this.proclaterality;
	}
	public void setProcLaterality(ims.core.vo.lookups.LateralityLRB value)
	{
		this.isValidated = false;
		this.proclaterality = value;
	}
	public boolean getSecondaryProcedureIsNotNull()
	{
		return this.secondaryprocedure != null;
	}
	public ims.core.vo.ProcedureVo getSecondaryProcedure()
	{
		return this.secondaryprocedure;
	}
	public void setSecondaryProcedure(ims.core.vo.ProcedureVo value)
	{
		this.isValidated = false;
		this.secondaryprocedure = value;
	}
	public boolean getSecondaryProcLateralityIsNotNull()
	{
		return this.secondaryproclaterality != null;
	}
	public ims.core.vo.lookups.LateralityLRB getSecondaryProcLaterality()
	{
		return this.secondaryproclaterality;
	}
	public void setSecondaryProcLaterality(ims.core.vo.lookups.LateralityLRB value)
	{
		this.isValidated = false;
		this.secondaryproclaterality = value;
	}
	public boolean getWLAnaestheticTypeIsNotNull()
	{
		return this.wlanaesthetictype != null;
	}
	public ims.clinical.vo.lookups.AnaestheticType getWLAnaestheticType()
	{
		return this.wlanaesthetictype;
	}
	public void setWLAnaestheticType(ims.clinical.vo.lookups.AnaestheticType value)
	{
		this.isValidated = false;
		this.wlanaesthetictype = value;
	}
	public boolean getHasPacemakerDefibIsNotNull()
	{
		return this.haspacemakerdefib != null;
	}
	public Boolean getHasPacemakerDefib()
	{
		return this.haspacemakerdefib;
	}
	public void setHasPacemakerDefib(Boolean value)
	{
		this.isValidated = false;
		this.haspacemakerdefib = value;
	}
	public boolean getPatientReceivingAnticoagulantTherapyIsNotNull()
	{
		return this.patientreceivinganticoagulanttherapy != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getPatientReceivingAnticoagulantTherapy()
	{
		return this.patientreceivinganticoagulanttherapy;
	}
	public void setPatientReceivingAnticoagulantTherapy(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.patientreceivinganticoagulanttherapy = value;
	}
	public boolean getWLPatientReceivingAnticoagulantTherapyIsNotNull()
	{
		return this.wlpatientreceivinganticoagulanttherapy != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getWLPatientReceivingAnticoagulantTherapy()
	{
		return this.wlpatientreceivinganticoagulanttherapy;
	}
	public void setWLPatientReceivingAnticoagulantTherapy(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.wlpatientreceivinganticoagulanttherapy = value;
	}
	public boolean getAvailableAtShortNoticeIsNotNull()
	{
		return this.availableatshortnotice != null;
	}
	public Boolean getAvailableAtShortNotice()
	{
		return this.availableatshortnotice;
	}
	public void setAvailableAtShortNotice(Boolean value)
	{
		this.isValidated = false;
		this.availableatshortnotice = value;
	}
	public boolean getWLAvailableAtShortNoticeIsNotNull()
	{
		return this.wlavailableatshortnotice != null;
	}
	public Boolean getWLAvailableAtShortNotice()
	{
		return this.wlavailableatshortnotice;
	}
	public void setWLAvailableAtShortNotice(Boolean value)
	{
		this.isValidated = false;
		this.wlavailableatshortnotice = value;
	}
	public boolean getAvailableAtShortNoticePeriodIsNotNull()
	{
		return this.availableatshortnoticeperiod != null;
	}
	public Integer getAvailableAtShortNoticePeriod()
	{
		return this.availableatshortnoticeperiod;
	}
	public void setAvailableAtShortNoticePeriod(Integer value)
	{
		this.isValidated = false;
		this.availableatshortnoticeperiod = value;
	}
	public boolean getWLAvailableAtShortNoticePeriodIsNotNull()
	{
		return this.wlavailableatshortnoticeperiod != null;
	}
	public Integer getWLAvailableAtShortNoticePeriod()
	{
		return this.wlavailableatshortnoticeperiod;
	}
	public void setWLAvailableAtShortNoticePeriod(Integer value)
	{
		this.isValidated = false;
		this.wlavailableatshortnoticeperiod = value;
	}
	public boolean getPreOperativeOvernightStayRequiredIsNotNull()
	{
		return this.preoperativeovernightstayrequired != null;
	}
	public Boolean getPreOperativeOvernightStayRequired()
	{
		return this.preoperativeovernightstayrequired;
	}
	public void setPreOperativeOvernightStayRequired(Boolean value)
	{
		this.isValidated = false;
		this.preoperativeovernightstayrequired = value;
	}
	public boolean getWLPreOperativeOvernightStayRequiredIsNotNull()
	{
		return this.wlpreoperativeovernightstayrequired != null;
	}
	public Boolean getWLPreOperativeOvernightStayRequired()
	{
		return this.wlpreoperativeovernightstayrequired;
	}
	public void setWLPreOperativeOvernightStayRequired(Boolean value)
	{
		this.isValidated = false;
		this.wlpreoperativeovernightstayrequired = value;
	}
	public boolean getNoOfPreOperativeNightsIsNotNull()
	{
		return this.noofpreoperativenights != null;
	}
	public Integer getNoOfPreOperativeNights()
	{
		return this.noofpreoperativenights;
	}
	public void setNoOfPreOperativeNights(Integer value)
	{
		this.isValidated = false;
		this.noofpreoperativenights = value;
	}
	public boolean getWLNoOfPreOperativeNightsIsNotNull()
	{
		return this.wlnoofpreoperativenights != null;
	}
	public Integer getWLNoOfPreOperativeNights()
	{
		return this.wlnoofpreoperativenights;
	}
	public void setWLNoOfPreOperativeNights(Integer value)
	{
		this.isValidated = false;
		this.wlnoofpreoperativenights = value;
	}
	public boolean getAnticipatedStayIsNotNull()
	{
		return this.anticipatedstay != null;
	}
	public Integer getAnticipatedStay()
	{
		return this.anticipatedstay;
	}
	public void setAnticipatedStay(Integer value)
	{
		this.isValidated = false;
		this.anticipatedstay = value;
	}
	public boolean getWLAnticipatedStayIsNotNull()
	{
		return this.wlanticipatedstay != null;
	}
	public Integer getWLAnticipatedStay()
	{
		return this.wlanticipatedstay;
	}
	public void setWLAnticipatedStay(Integer value)
	{
		this.isValidated = false;
		this.wlanticipatedstay = value;
	}
	public boolean getRequiredTheatreTypeIsNotNull()
	{
		return this.requiredtheatretype != null;
	}
	public ims.scheduling.vo.lookups.TheatreType getRequiredTheatreType()
	{
		return this.requiredtheatretype;
	}
	public void setRequiredTheatreType(ims.scheduling.vo.lookups.TheatreType value)
	{
		this.isValidated = false;
		this.requiredtheatretype = value;
	}
	public boolean getElectiveListStatusIsNotNull()
	{
		return this.electiveliststatus != null;
	}
	public ims.RefMan.vo.ElectiveListStatusVo getElectiveListStatus()
	{
		return this.electiveliststatus;
	}
	public void setElectiveListStatus(ims.RefMan.vo.ElectiveListStatusVo value)
	{
		this.isValidated = false;
		this.electiveliststatus = value;
	}
	public boolean getElectiveListStatusHistoryIsNotNull()
	{
		return this.electiveliststatushistory != null;
	}
	public ims.RefMan.vo.ElectiveListStatusVoCollection getElectiveListStatusHistory()
	{
		return this.electiveliststatushistory;
	}
	public void setElectiveListStatusHistory(ims.RefMan.vo.ElectiveListStatusVoCollection value)
	{
		this.isValidated = false;
		this.electiveliststatushistory = value;
	}
	public boolean getElectiveAdmissionTypeIsNotNull()
	{
		return this.electiveadmissiontype != null;
	}
	public ims.RefMan.vo.lookups.ElectiveAdmissionType getElectiveAdmissionType()
	{
		return this.electiveadmissiontype;
	}
	public void setElectiveAdmissionType(ims.RefMan.vo.lookups.ElectiveAdmissionType value)
	{
		this.isValidated = false;
		this.electiveadmissiontype = value;
	}
	public boolean getCriticalCareBedRequiredIsNotNull()
	{
		return this.criticalcarebedrequired != null;
	}
	public Boolean getCriticalCareBedRequired()
	{
		return this.criticalcarebedrequired;
	}
	public void setCriticalCareBedRequired(Boolean value)
	{
		this.isValidated = false;
		this.criticalcarebedrequired = value;
	}
	public boolean getAnaestheticTypeIsNotNull()
	{
		return this.anaesthetictype != null;
	}
	public ims.clinical.vo.lookups.AnaestheticType getAnaestheticType()
	{
		return this.anaesthetictype;
	}
	public void setAnaestheticType(ims.clinical.vo.lookups.AnaestheticType value)
	{
		this.isValidated = false;
		this.anaesthetictype = value;
	}
	public boolean getHospitalIsNotNull()
	{
		return this.hospital != null;
	}
	public ims.core.resource.place.vo.LocationRefVo getHospital()
	{
		return this.hospital;
	}
	public void setHospital(ims.core.resource.place.vo.LocationRefVo value)
	{
		this.isValidated = false;
		this.hospital = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.preassessmentoutcome != null)
		{
			if(!this.preassessmentoutcome.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.electivelist != null)
		{
			if(!this.electivelist.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.electiveliststatus != null)
		{
			if(!this.electiveliststatus.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.electiveliststatushistory != null)
		{
			if(!this.electiveliststatushistory.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.preassessmentoutcome != null)
		{
			String[] listOfOtherErrors = this.preassessmentoutcome.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.electivelist != null)
		{
			String[] listOfOtherErrors = this.electivelist.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.electiveliststatus == null)
			listOfErrors.add("ElectiveListStatus is mandatory");
		if(this.electiveliststatus != null)
		{
			String[] listOfOtherErrors = this.electiveliststatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.electiveliststatushistory != null)
		{
			String[] listOfOtherErrors = this.electiveliststatushistory.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.electiveadmissiontype == null)
			listOfErrors.add("ElectiveAdmissionType is mandatory");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatientElectiveListForPreassessmentOutcVo clone = new PatientElectiveListForPreassessmentOutcVo(this.id, this.version);
		
		if(this.preassessmentoutcome == null)
			clone.preassessmentoutcome = null;
		else
			clone.preassessmentoutcome = (ims.RefMan.vo.PreAssessmentOutcomeVo)this.preassessmentoutcome.clone();
		if(this.fitforsurgery == null)
			clone.fitforsurgery = null;
		else
			clone.fitforsurgery = (ims.core.vo.lookups.YesNoUnknown)this.fitforsurgery.clone();
		clone.patient = this.patient;
		if(this.electivelist == null)
			clone.electivelist = null;
		else
			clone.electivelist = (ims.admin.vo.ElectiveListConfigurationVo)this.electivelist.clone();
		if(this.primaryprocedure == null)
			clone.primaryprocedure = null;
		else
			clone.primaryprocedure = (ims.core.vo.ProcedureVo)this.primaryprocedure.clone();
		if(this.proclaterality == null)
			clone.proclaterality = null;
		else
			clone.proclaterality = (ims.core.vo.lookups.LateralityLRB)this.proclaterality.clone();
		if(this.secondaryprocedure == null)
			clone.secondaryprocedure = null;
		else
			clone.secondaryprocedure = (ims.core.vo.ProcedureVo)this.secondaryprocedure.clone();
		if(this.secondaryproclaterality == null)
			clone.secondaryproclaterality = null;
		else
			clone.secondaryproclaterality = (ims.core.vo.lookups.LateralityLRB)this.secondaryproclaterality.clone();
		if(this.wlanaesthetictype == null)
			clone.wlanaesthetictype = null;
		else
			clone.wlanaesthetictype = (ims.clinical.vo.lookups.AnaestheticType)this.wlanaesthetictype.clone();
		clone.haspacemakerdefib = this.haspacemakerdefib;
		if(this.patientreceivinganticoagulanttherapy == null)
			clone.patientreceivinganticoagulanttherapy = null;
		else
			clone.patientreceivinganticoagulanttherapy = (ims.core.vo.lookups.YesNoUnknown)this.patientreceivinganticoagulanttherapy.clone();
		if(this.wlpatientreceivinganticoagulanttherapy == null)
			clone.wlpatientreceivinganticoagulanttherapy = null;
		else
			clone.wlpatientreceivinganticoagulanttherapy = (ims.core.vo.lookups.YesNoUnknown)this.wlpatientreceivinganticoagulanttherapy.clone();
		clone.availableatshortnotice = this.availableatshortnotice;
		clone.wlavailableatshortnotice = this.wlavailableatshortnotice;
		clone.availableatshortnoticeperiod = this.availableatshortnoticeperiod;
		clone.wlavailableatshortnoticeperiod = this.wlavailableatshortnoticeperiod;
		clone.preoperativeovernightstayrequired = this.preoperativeovernightstayrequired;
		clone.wlpreoperativeovernightstayrequired = this.wlpreoperativeovernightstayrequired;
		clone.noofpreoperativenights = this.noofpreoperativenights;
		clone.wlnoofpreoperativenights = this.wlnoofpreoperativenights;
		clone.anticipatedstay = this.anticipatedstay;
		clone.wlanticipatedstay = this.wlanticipatedstay;
		if(this.requiredtheatretype == null)
			clone.requiredtheatretype = null;
		else
			clone.requiredtheatretype = (ims.scheduling.vo.lookups.TheatreType)this.requiredtheatretype.clone();
		if(this.electiveliststatus == null)
			clone.electiveliststatus = null;
		else
			clone.electiveliststatus = (ims.RefMan.vo.ElectiveListStatusVo)this.electiveliststatus.clone();
		if(this.electiveliststatushistory == null)
			clone.electiveliststatushistory = null;
		else
			clone.electiveliststatushistory = (ims.RefMan.vo.ElectiveListStatusVoCollection)this.electiveliststatushistory.clone();
		if(this.electiveadmissiontype == null)
			clone.electiveadmissiontype = null;
		else
			clone.electiveadmissiontype = (ims.RefMan.vo.lookups.ElectiveAdmissionType)this.electiveadmissiontype.clone();
		clone.criticalcarebedrequired = this.criticalcarebedrequired;
		if(this.anaesthetictype == null)
			clone.anaesthetictype = null;
		else
			clone.anaesthetictype = (ims.clinical.vo.lookups.AnaestheticType)this.anaesthetictype.clone();
		clone.hospital = this.hospital;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(PatientElectiveListForPreassessmentOutcVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientElectiveListForPreassessmentOutcVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientElectiveListForPreassessmentOutcVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientElectiveListForPreassessmentOutcVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.preassessmentoutcome != null)
			count++;
		if(this.fitforsurgery != null)
			count++;
		if(this.patient != null)
			count++;
		if(this.electivelist != null)
			count++;
		if(this.primaryprocedure != null)
			count++;
		if(this.proclaterality != null)
			count++;
		if(this.secondaryprocedure != null)
			count++;
		if(this.secondaryproclaterality != null)
			count++;
		if(this.wlanaesthetictype != null)
			count++;
		if(this.haspacemakerdefib != null)
			count++;
		if(this.patientreceivinganticoagulanttherapy != null)
			count++;
		if(this.wlpatientreceivinganticoagulanttherapy != null)
			count++;
		if(this.availableatshortnotice != null)
			count++;
		if(this.wlavailableatshortnotice != null)
			count++;
		if(this.availableatshortnoticeperiod != null)
			count++;
		if(this.wlavailableatshortnoticeperiod != null)
			count++;
		if(this.preoperativeovernightstayrequired != null)
			count++;
		if(this.wlpreoperativeovernightstayrequired != null)
			count++;
		if(this.noofpreoperativenights != null)
			count++;
		if(this.wlnoofpreoperativenights != null)
			count++;
		if(this.anticipatedstay != null)
			count++;
		if(this.wlanticipatedstay != null)
			count++;
		if(this.requiredtheatretype != null)
			count++;
		if(this.electiveliststatus != null)
			count++;
		if(this.electiveliststatushistory != null)
			count++;
		if(this.electiveadmissiontype != null)
			count++;
		if(this.criticalcarebedrequired != null)
			count++;
		if(this.anaesthetictype != null)
			count++;
		if(this.hospital != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 29;
	}
	protected ims.RefMan.vo.PreAssessmentOutcomeVo preassessmentoutcome;
	protected ims.core.vo.lookups.YesNoUnknown fitforsurgery;
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.admin.vo.ElectiveListConfigurationVo electivelist;
	protected ims.core.vo.ProcedureVo primaryprocedure;
	protected ims.core.vo.lookups.LateralityLRB proclaterality;
	protected ims.core.vo.ProcedureVo secondaryprocedure;
	protected ims.core.vo.lookups.LateralityLRB secondaryproclaterality;
	protected ims.clinical.vo.lookups.AnaestheticType wlanaesthetictype;
	protected Boolean haspacemakerdefib;
	protected ims.core.vo.lookups.YesNoUnknown patientreceivinganticoagulanttherapy;
	protected ims.core.vo.lookups.YesNoUnknown wlpatientreceivinganticoagulanttherapy;
	protected Boolean availableatshortnotice;
	protected Boolean wlavailableatshortnotice;
	protected Integer availableatshortnoticeperiod;
	protected Integer wlavailableatshortnoticeperiod;
	protected Boolean preoperativeovernightstayrequired;
	protected Boolean wlpreoperativeovernightstayrequired;
	protected Integer noofpreoperativenights;
	protected Integer wlnoofpreoperativenights;
	protected Integer anticipatedstay;
	protected Integer wlanticipatedstay;
	protected ims.scheduling.vo.lookups.TheatreType requiredtheatretype;
	protected ims.RefMan.vo.ElectiveListStatusVo electiveliststatus;
	protected ims.RefMan.vo.ElectiveListStatusVoCollection electiveliststatushistory;
	protected ims.RefMan.vo.lookups.ElectiveAdmissionType electiveadmissiontype;
	protected Boolean criticalcarebedrequired;
	protected ims.clinical.vo.lookups.AnaestheticType anaesthetictype;
	protected ims.core.resource.place.vo.LocationRefVo hospital;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
