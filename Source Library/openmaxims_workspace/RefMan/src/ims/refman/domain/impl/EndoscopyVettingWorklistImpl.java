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
// This code was generated by Petru Rotariu using IMS Development Environment (version 1.80 build 5465.13953)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import java.io.Serializable;
import java.util.ArrayList;

import ims.RefMan.domain.base.impl.BaseEndoscopyVettingWorklistImpl;
import ims.RefMan.domain.objects.PatientElectiveList;
import ims.RefMan.vo.EndoscopyVettingWorklistSearchCritVo;
import ims.RefMan.vo.PatientElectiveListAddLaterVo;
import ims.RefMan.vo.PatientElectiveListForEndoscWorklistVoCollection;
import ims.RefMan.vo.PatientElectiveListRefVo;
import ims.RefMan.vo.domain.PatientElectiveListAddLaterVoAssembler;
import ims.RefMan.vo.domain.PatientElectiveListForEndoscWorklistVoAssembler;
import ims.RefMan.vo.lookups.ElectiveAdmissionType;
import ims.RefMan.vo.lookups.WaitingCardAdmissionType;
import ims.core.patient.domain.objects.Patient;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.PatientShort;
import ims.core.vo.domain.PatientShortAssembler;
import ims.core.vo.lookups.TimeUnitsSecondsToMonths;
import ims.core.vo.lookups.WaitingListStatus;
import ims.core.vo.lookups.YesNo;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.Date;

public class EndoscopyVettingWorklistImpl extends BaseEndoscopyVettingWorklistImpl
{

	private static final long serialVersionUID = 1L;

	public PatientElectiveListAddLaterVo savePatientElectiveList(PatientElectiveListAddLaterVo record) throws StaleObjectException, UniqueKeyViolationException
	{
		if( record == null)
		{
			throw new CodingRuntimeException("Cannot save null PatientElectiveListAddLaterVo");
		}
		
		DomainFactory factory = getDomainFactory();
		
		PatientElectiveList domainPatElectiveList = PatientElectiveListAddLaterVoAssembler.extractPatientElectiveList(factory, record);
		
		factory.save(domainPatElectiveList);
		
		return PatientElectiveListAddLaterVoAssembler.create(domainPatElectiveList);

	}
	

	


	public PatientElectiveListAddLaterVo getPatientElectiveList(PatientElectiveListRefVo patEleRef)
	{
		if( patEleRef == null)
			throw new CodingRuntimeException("Cannot get PatientElectiveList on null Specimen on null electiveListRef.");
		
		return PatientElectiveListAddLaterVoAssembler.create((PatientElectiveList) getDomainFactory().getDomainObject(PatientElectiveList.class, patEleRef.getID_PatientElectiveList()));
	}





	public PatientElectiveListForEndoscWorklistVoCollection listPatientElectiveListEndoscopist(EndoscopyVettingWorklistSearchCritVo filter)
	{
		DomainFactory factory = getDomainFactory();

		String hql = "select distinct p1_1	from PatientElectiveList as p1_1 " +
						"left join p1_1.referral as c1_1 " +
						"left join c1_1.referralDetails as r1_1 " +
						"left join p1_1.primaryProcedure as p2_1 " +
						"left join p2_1.endoscopyType as l1_1 " +
						"left join p1_1.electiveAdmissionType as l2_1 " +
						"left join p1_1.priority as l3_1 " +
						"left join p1_1.generalAnaesthetic as l4_1 " +
						"left join p1_1.admissionType as l5_1 " +
						//WDEV-22766 Exclude elective list entries with status of REMOVED
						"left join p1_1.electiveListStatus as els " +
						"left join els.electiveListStatus as status"; //WDEV-22766


		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
		//WDEV-22766
//		String andStr = " where (p1_1.admissionType.id =:admissionType and p1_1.requiresVetting = :requestVetting)";
		String andStr = " where (p1_1.admissionType.id =:admissionType and p1_1.requiresVetting = :requestVetting and status.id not in (" + WaitingListStatus.REMOVED.getID() + "))"; //WDEV-22766
		
		markers.add("admissionType");
		values.add(WaitingCardAdmissionType.ENDOSCOPY.getID());
		
		markers.add("requestVetting");
		values.add(Boolean.TRUE);
		
		if( filter != null )
		{
			
			if( filter.getElectiveAdmissionTypeIsNotNull() )
			{
				
				if( filter.getElectiveAdmissionType().equals(ElectiveAdmissionType.ELECTIVE_TYPE11))
				{
    				andStr += (" and p1_1.electiveAdmissionType.id <> :electiveAdmoissionTypeId ");
    				
    				markers.add("electiveAdmoissionTypeId");
    				values.add(ElectiveAdmissionType.PLANNED_TYPE13.getID());
				}
				else if( filter.getElectiveAdmissionType().equals(ElectiveAdmissionType.PLANNED_TYPE13))
				{
					andStr += (" and p1_1.electiveAdmissionType.id = :electiveAdmoissionTypeId ");
	    			markers.add("electiveAdmoissionTypeId");
	    				values.add(ElectiveAdmissionType.PLANNED_TYPE13.getID());
				}
			}
			
			if( filter.getProcedureTypeIsNotNull() )
			{
				andStr += (" and p2_1.endoscopyType.id = :endoscopyTypeId ");
				markers.add("endoscopyTypeId");
				values.add(filter.getProcedureType().getID());
			}
			if( filter.getUrgencyIsNotNull() )
			{
				
				andStr += (" and p1_1.priority.id = :urgencyId ");
				markers.add("urgencyId");
				values.add(filter.getUrgency().getID());
			}
			if( filter.getGeneralAnaestheticIsNotNull() )
			{
				andStr += (" and p1_1.generalAnaesthetic.id = :generalAnaestheticId ");
				markers.add("generalAnaestheticId");
				values.add(YesNo.YES.getID());
			}
			if( filter.getRTTBreachDateInIsNotNull() && filter.getRTTBReachDateUnitsIsNotNull() )
			{
				// Calculate RTT Breach Date limit
				Date endRTTDate = calculateToDate(filter.getRTTBreachDateIn(), filter.getRTTBReachDateUnits());
				
				andStr += (" and r1_1.end18WW <= :RTT_BREACH_TO_DATE ");
				markers.add("RTT_BREACH_TO_DATE");
				values.add(endRTTDate.getDate());
				
				if( !Boolean.TRUE.equals(filter.getIncludePatientsBreached()))
				{
					andStr += (" and r1_1.end18WW > :RTT_BREACH_FROM_DATE ");
					markers.add("RTT_BREACH_FROM_DATE");
					values.add( new Date().getDate());
				}
				
			}
			if( filter.getPlannedDateIntIsNotNull() && filter.getPlaneDateUnitsIsNotNull() )
			{
				// Calculate Planned Date limit
				Date endPlannedDate = calculateToDate(filter.getPlannedDateInt(), filter.getPlaneDateUnits());
				
				andStr += (" and p1_1.plannedDate <= :PLANNED_TO_DATE ");
				markers.add("PLANNED_TO_DATE");
				values.add(endPlannedDate.getDate());
				
				if( !Boolean.TRUE.equals(filter.getIncludePastPlannedDates()))
				{
					andStr += (" and p1_1.plannedDate >= :PLANNED_FROM_DATE ");
					markers.add("PLANNED_FROM_DATE");
					values.add( new Date().getDate());
				}
			}
			
			andStr += (" order by p1_1.systemInformation.creationDateTime asc  ");
			
			hql += andStr.toString();
		}				
		
		return PatientElectiveListForEndoscWorklistVoAssembler.createPatientElectiveListForEndoscWorklistVoCollectionFromPatientElectiveList(factory.find(hql, markers, values,200));
	}
	private Date calculateToDate(Integer rttBreachIn, TimeUnitsSecondsToMonths rttBreachInPeriod)
	{
		if (rttBreachIn == null || rttBreachInPeriod == null)
			return null;
		
		if (TimeUnitsSecondsToMonths.DAYS.equals(rttBreachInPeriod))
		{
			return (new Date()).addDay(rttBreachIn);
		}
		else if (TimeUnitsSecondsToMonths.WEEKS.equals(rttBreachInPeriod))
		{
			return (new Date()).addDay(7 * rttBreachIn);
		}
		else if (TimeUnitsSecondsToMonths.MONTHS.equals(rttBreachInPeriod))
		{
			return (new Date()).addMonth(rttBreachIn);
		}
		
		return new Date();
	}

	//WDEV-22823
	public PatientShort getPatientShort(PatientRefVo patientRef)
	{
		DomainFactory factory = getDomainFactory();
		if (patientRef != null)
		{
			Patient patient = (Patient)	factory.getDomainObject(patientRef);
			return PatientShortAssembler.create(patient);
		}
		
		return null;
	}

}
