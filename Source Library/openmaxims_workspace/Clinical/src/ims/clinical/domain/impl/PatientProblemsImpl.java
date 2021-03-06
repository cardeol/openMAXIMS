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
// This code was generated by Dara Hickey using IMS Development Environment (version 1.45 build 2245.35199)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.clinical.domain.impl;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.admin.helper.Keywords;
import ims.clinical.configuration.domain.objects.ProblemHotlistItem;
import ims.clinical.domain.ClinicalDiAssociations;
import ims.clinical.domain.base.impl.BasePatientProblemsImpl;
import ims.clinical.vo.ClinicalDIAssociationVoCollection;
import ims.clinical.vo.ClinicalProblemShortVoCollection;
import ims.clinical.vo.domain.ClinicalProblemShortVoAssembler;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.admin.vo.CareSpellRefVo;
import ims.core.admin.vo.EpisodeOfCareRefVo;
import ims.core.clinical.domain.objects.PatientProblem;
import ims.core.clinical.vo.PatientProblemRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.Hcp;
import ims.core.vo.HcpCollection;
import ims.core.vo.PatientProblemListVoCollection;
import ims.core.vo.PatientProblemVo;
import ims.core.vo.PatientProblemVoCollection;
import ims.core.vo.domain.PatientProblemListVoAssembler;
import ims.core.vo.domain.PatientProblemVoAssembler;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;

import java.util.ArrayList;
import java.util.List;

public class PatientProblemsImpl extends BasePatientProblemsImpl
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	* listByClinicalContact
	*/
	public ims.core.vo.PatientProblemVoCollection listByClinicalContact(ims.core.admin.vo.ClinicalContactRefVo clinicalcontact)
	{
		if(clinicalcontact == null)
			throw new DomainRuntimeException("Invalid clinical contact");
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from PatientProblem p ");
		hql.append(" where p.isActive = TRUE and p.clinicalContact.id = " + clinicalcontact.getID_ClinicalContact());
		return PatientProblemVoAssembler.createPatientProblemVoCollectionFromPatientProblem((factory.find(hql.toString())));
	}

	/**
	* Saves a patientProblem
	*/
	public ims.core.vo.PatientProblemVo save(ims.core.vo.PatientProblemVo voPatientProblem) throws ims.domain.exceptions.StaleObjectException
	{
		if (!voPatientProblem.isValidated())
			throw new DomainRuntimeException("Patient problem has not been validated");

		DomainFactory factory = getDomainFactory();
		PatientProblem domProblem = PatientProblemVoAssembler.extractPatientProblem(factory, voPatientProblem);
		if(domProblem.getId() == null)
			domProblem.setIsActive(Boolean.TRUE);
		
		factory.save(domProblem);		 
		return PatientProblemVoAssembler.create(domProblem);
	}

	/**
	* Get a patient Problem
	*/
	public PatientProblemVo get(PatientProblemRefVo patientProblem) 
	{
		if(patientProblem == null)
			throw new DomainRuntimeException("Invalid patient problem record to get");
		
		return PatientProblemVoAssembler.create((PatientProblem)getDomainFactory().getDomainObject(PatientProblem.class, patientProblem.getID_PatientProblem()));
	}

	public PatientProblemVoCollection listByPatient(PatientRefVo patient) 
	{
		if(patient == null || patient.getID_Patient() == null)
			throw new DomainRuntimeException("No Patient Supplied");
		
		DomainFactory factory = getDomainFactory();
		List problems = factory.find("from PatientProblem problem where problem.careContext.episodeOfCare.careSpell.patient.id = :patientId and problem.isActive = :active ", new String[]{"patientId","active"},new Object[]{patient.getID_Patient(), Boolean.TRUE});
		if(problems != null)
			return PatientProblemVoAssembler.createPatientProblemVoCollectionFromPatientProblem(problems); 
			
		return null;
	}
	
	public HcpCollection listHCPs(Hcp filter)
	{
		HcpAdmin hcpAdmin = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		return hcpAdmin.listHCPs(filter);
	}

	public PatientProblemVoCollection listProblemsByCareContext(CareContextRefVo careContextRefVo) 
	{
		if(careContextRefVo == null)
			throw new DomainRuntimeException("Invalid Care Context Ref");
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from PatientProblem p ");
		hql.append(" where p.isActive = TRUE and p.careContext.id = " + careContextRefVo.getID_CareContext());
		return PatientProblemVoAssembler.createPatientProblemVoCollectionFromPatientProblem((factory.find(hql.toString())));
	}

	public PatientProblemVoCollection listProblemsByEpisodeOfCare(EpisodeOfCareRefVo episodeOfCareRefVo) 
	{
		List list = listPatientProblemnsRecordsByEpisodeOfCare(episodeOfCareRefVo);
		return PatientProblemVoAssembler.createPatientProblemVoCollectionFromPatientProblem(list);
	}

	public PatientProblemListVoCollection listPatientProblemsByEpisodeOfCare(EpisodeOfCareRefVo episodeOfCareRefVo)
	{
		List list = listPatientProblemnsRecordsByEpisodeOfCare(episodeOfCareRefVo);
		return PatientProblemListVoAssembler.createPatientProblemListVoCollectionFromPatientProblem(list);
	}
	
	private List listPatientProblemnsRecordsByEpisodeOfCare(EpisodeOfCareRefVo episodeOfCareRefVo)
	{
		if(episodeOfCareRefVo == null)
			throw new DomainRuntimeException("Invalid Episode Context Ref");
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from PatientProblem p ");
		hql.append(" where p.isActive = TRUE and p.careContext.episodeOfCare.id = " + episodeOfCareRefVo.getID_EpisodeOfCare());
		List list = factory.find(hql.toString());
		return list;
	}
	
	public PatientProblemListVoCollection listPatientProblemsByPatient(PatientRefVo patient, Boolean isResolved)
	{
		List list = listPatientProblemsByPatientList(patient, isResolved);
		return PatientProblemListVoAssembler.createPatientProblemListVoCollectionFromPatientProblem(list);
	}
	
	private List listPatientProblemsByPatientList(PatientRefVo patient, Boolean isResolved)
	{
		if(patient == null)
			throw new DomainRuntimeException("Invalid Episode Context Ref");
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from PatientProblem problem ");
		hql.append(" where problem.careContext.episodeOfCare.careSpell.patient.id = " + patient.getID_Patient());
		
		if (isResolved.equals(Boolean.TRUE))
		{
			hql.append ("and (problem.isResolved is null or problem.isResolved = 0)");
		}
		
		List list = factory.find(hql.toString());
		return list;
	}
	
	public PatientProblemVoCollection listProblemsByCareSpell(CareSpellRefVo careSpellRefVo) 
	{
		if(careSpellRefVo == null)
			throw new DomainRuntimeException("Invalid Care Spell Ref");
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from PatientProblem p ");
		hql.append(" where p.isActive = TRUE and p.careContext.episodeOfCare.careSpell.id = " + careSpellRefVo.getID_CareSpell());
		return PatientProblemVoAssembler.createPatientProblemVoCollectionFromPatientProblem((factory.find(hql.toString())));
	}

	public ClinicalProblemShortVoCollection listHotlistProblemsShort(String pcName, Specialty specialty) throws DomainInterfaceException
	{
		if(pcName == null)
			throw new DomainRuntimeException("Invalid Search criteria. Clinical Problem name filter must be supplied.");
		
		if(specialty == null)
			throw new DomainRuntimeException("Invalid Search criteria. Specialty must be supplied.");

		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer(" select distinct item from ProblemHotlistItem item join item.problem as prob join prob.keywords as kw "); 
		ArrayList names = new ArrayList();
		ArrayList values = new ArrayList();

		hql.append(" where prob.isActive = :isActive");
		names.add("isActive");
		values.add(Boolean.TRUE);	

		hql.append(" and item.hotlist.specialty = :spec");
		names.add("spec");
		values.add(getDomLookup(specialty));			
	
		List hits = Keywords.searchByKeywords(factory, pcName, hql.toString(), names, values);		
		
		List ret = new ArrayList();		
		for (int i = 0; i < hits.size(); i++)
		{
			ret.add(((ProblemHotlistItem)hits.get(i)).getProblem());
		}
		
		return ClinicalProblemShortVoAssembler.createClinicalProblemShortVoCollectionFromClinicalProblem(ret);
	}

	public PatientProblemVoCollection listProblemsByEpisodeOfCarePlusUnresolved(EpisodeOfCareRefVo episodeOfCareRefVo) 
	{
		if(episodeOfCareRefVo == null)
			throw new DomainRuntimeException("Invalid Episode Context Ref");
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from PatientProblem p ");
		hql.append(" where (p.careContext.episodeOfCare.id = " + episodeOfCareRefVo.getID_EpisodeOfCare() + ")");
		hql.append(" or (p.isResolved = " + Boolean.FALSE + ")");
		return PatientProblemVoAssembler.createPatientProblemVoCollectionFromPatientProblem((factory.find(hql.toString())));
	}

	public ClinicalDIAssociationVoCollection saveClinicalDiAssociation(ClinicalDIAssociationVoCollection list) throws StaleObjectException
	{
		ClinicalDiAssociations clinicalDiAssocImpl = (ClinicalDiAssociations) getDomainImpl(ClinicalDiAssociationsImpl.class);
		return clinicalDiAssocImpl.saveClinicalDiAssociation(list);
	}

	public Boolean checkIfClinicalCDIAssociationsExist(PatientProblemRefVo voPatientProblem) 
	{
		ClinicalDiAssociations clinicalDiAssocImpl = (ClinicalDiAssociations) getDomainImpl(ClinicalDiAssociationsImpl.class);
		ClinicalDIAssociationVoCollection voColl = clinicalDiAssocImpl.listClinicalDiAssociation(voPatientProblem);
		if (voColl.size() > 0)
			return Boolean.TRUE;
		else
			return Boolean.FALSE;
	}
}
