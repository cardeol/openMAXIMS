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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.70 build 3478.14513)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.OrganisationAndLocation;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.admin.domain.impl.OrganisationAndLocationImpl;
import ims.RefMan.domain.ReferralWizard;
import ims.RefMan.domain.TheatreList;
import ims.RefMan.domain.base.impl.BaseTheatreReAdmissionDialogImpl;
import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.CatsReferralWizardVo;
import ims.RefMan.vo.domain.CatsReferralWizardVoAssembler;
import ims.core.admin.domain.objects.CareContext;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.clinical.domain.objects.Service;
import ims.core.domain.ADT;
import ims.core.domain.impl.ADTImpl;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.place.domain.objects.Location;
import ims.core.vo.CareContextLiteVo;
import ims.core.vo.CareContextShortVo;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.LocShortMappingsVoCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.ServiceShortVo;
import ims.core.vo.domain.CareContextLiteVoAssembler;
import ims.core.vo.domain.CareContextShortVoAssembler;
import ims.core.vo.domain.LocMostVoAssembler;
import ims.core.vo.domain.ServiceShortVoAssembler;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.icp.vo.PatientICPFullVo;
import ims.icp.vo.domain.PatientICPFullVoAssembler;
import ims.icps.instantiation.domain.objects.PatientICP;
import ims.scheduling.vo.Booking_AppointmentRefVo;
import ims.scheduling.vo.Booking_AppointmentVo;

import java.util.ArrayList;
import java.util.List;

public class TheatreReAdmissionDialogImpl extends BaseTheatreReAdmissionDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.LocMostVo getLocation(ims.core.resource.place.vo.LocationRefVo location)
	{
		if (location == null || location.getID_Location() == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		return LocMostVoAssembler.create((Location) factory.getDomainObject(Location.class, location.getID_Location()));
	}

	public ims.core.vo.LocShortMappingsVoCollection listActiveWardsForHospital(ims.core.resource.place.vo.LocationRefVo hospital)
	{
		OrganisationAndLocation implLoc = (OrganisationAndLocation)getDomainImpl(OrganisationAndLocationImpl.class);
		return implLoc.listActiveWardsForHospital(hospital);
	}

	public CareContextShortVo admitPatient(PatientShort patVo, InpatientEpisodeVo episVo, CareContextRefVo careContectRefVo, CatsReferralRefVo voCats) throws DomainInterfaceException, StaleObjectException, ForeignKeyViolationException, UniqueKeyViolationException 
	{
		if (patVo == null || patVo.getID_Patient() == null)
			throw new CodingRuntimeException("patVo is null or id not provide for method admitPatient");

		if (episVo == null)
			throw new CodingRuntimeException("episVo is null or id not provide for method admitPatient");

		if (careContectRefVo == null || careContectRefVo.getID_CareContext() == null)
			throw new CodingRuntimeException("careContectRefVo is null or id not provide for method admitPatient");

		ADT implLoc = (ADT)getDomainImpl(ADTImpl.class);
		//InpatientEpisodeVo voIP = implLoc.admitPatient(patVo, episVo);
		InpatientEpisodeVo voIP;
		try
		{
			voIP = implLoc.admitPatient(patVo, episVo, null);
		}
		catch (UnqViolationUncheckedException e)
		{
			throw new UniqueKeyViolationException(e.getMessage());
		}
		
		if ( !voIP.getAdmissionDateTime().equals(episVo.getAdmissionDateTime()))
		{
			throw new DomainInterfaceException("Patient is already an inpatient. Cannot Admit.");
		}

		DomainFactory factory = getDomainFactory();
		//wdev-8305
		CatsReferral domCats = (CatsReferral) factory.getDomainObject(CatsReferral.class, voCats.getID_CatsReferral());
		domCats.setRequiresDischargeRep(null);
		domCats.setDischargeDate(null);////wdev-11889
		factory.save(domCats);
		
		CatsReferralWizardVo catsRefWizVO = CatsReferralWizardVoAssembler.create(domCats);
		
		// Update the CareContext with PASEvent (WDEV-8364)
		CareContextLiteVo careContext = CareContextLiteVoAssembler.create((CareContext) getDomainFactory().getDomainObject(CareContext.class, catsRefWizVO.getCareContext().getID_CareContext()));
		careContext.setPasEvent(voIP.getPasEvent());
		
		CareContext domCareContext = CareContextLiteVoAssembler.extractCareContext(getDomainFactory(), careContext);
		factory.save(domCareContext);

		// Update the ICP with PASEVent
		List picps = getDomainFactory().find("select picp from PatientICP picp where picp.careContext = '" + careContectRefVo.getID_CareContext() + "' and picp.completedDateTime = null");
		if (picps != null && picps.size() == 1)
		{
			PatientICPFullVo voPatientICP = PatientICPFullVoAssembler.create((PatientICP) picps.get(0));
			if (voPatientICP != null)
			{
				voPatientICP.setPasEvent(voIP.getPasEvent());

				PatientICP doICP = PatientICPFullVoAssembler.extractPatientICP(factory, voPatientICP);

				factory.save(doICP);
			}
		}
		return CareContextShortVoAssembler.create(domCareContext);
	}

	/**
	* listActiveMedics
	*/
	public ims.core.vo.MedicLiteVoCollection listActiveMedics(String szName)
	{
		HcpAdmin implHCP = (HcpAdmin)getDomainImpl(HcpAdminImpl.class);
		return implHCP.listActiveMedics(szName);
	}

	public CatsReferralWizardVo getCatsReferralWizardVo(CatsReferralRefVo voCatsRef) 
	{
		ReferralWizard impl = (ReferralWizard) getDomainImpl(ReferralWizardImpl.class);
		return impl.getCatsReferral(voCatsRef);
	}

	public LocShortMappingsVoCollection listActiveHospitals() 
	{
		OrganisationAndLocation impl = (OrganisationAndLocation) getDomainImpl(OrganisationAndLocationImpl.class);
		return impl.listActiveHospitals();
	}

	public Booking_AppointmentVo getBookingAppt(Booking_AppointmentRefVo bookingApptRefVo) 
	{
		TheatreList impl = (TheatreList)getDomainImpl(TheatreListImpl.class);
		return impl.getBookingAppt(bookingApptRefVo);
	}

	public Boolean isNotACurrentInpatient(PatientRefVo voPatRef) 
	{
		TheatreList impl = (TheatreList)getDomainImpl(TheatreListImpl.class);
		return impl.isNotACurrentInpatient(voPatRef);
	}

	// WDEV-12293 
	public Specialty getReferralSpecialty(CatsReferralRefVo referral)
	{
		if (referral == null || !referral.getID_CatsReferralIsNotNull())
			return null;
		
		String query = "select service from CatsReferral as referral left join referral.referralDetails as details left join details.service as service where referral.id = :ID";
		
		ArrayList<String> paramNames = new ArrayList<String>(); paramNames.add("ID");
		ArrayList<Object> paramValues = new ArrayList<Object>(); paramValues.add(referral.getID_CatsReferral());
		
		ServiceShortVo service = ServiceShortVoAssembler.create((Service) getDomainFactory().findFirst(query, paramNames, paramValues));
		
		return service.getSpecialty();
	}


}
