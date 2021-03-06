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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4910.25978)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import ims.admin.vo.lookups.HardCodedEvents;
import ims.RefMan.domain.base.impl.BaseERODDialogImpl;
import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.domain.objects.PatientElectiveList;
import ims.RefMan.domain.objects.ReferralEROD;
import ims.RefMan.vo.CatsReferralERODVo;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.ReferralERODRefVo;
import ims.RefMan.vo.ReferralERODVo;
import ims.RefMan.vo.domain.CatsReferralERODVoAssembler;
import ims.RefMan.vo.domain.ReferralERODVoAssembler;
import ims.RefMan.vo.lookups.ERODType;
import ims.configuration.gen.ConfigFlag;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.domain.PatientListVoAssembler;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.DateTime;
import ims.pathways.configuration.domain.objects.Event;
import ims.pathways.domain.HL7PathwayIf;
import ims.pathways.domain.impl.HL7PathwayIfImpl;
import ims.pathways.domain.objects.PathwayClock;
import ims.pathways.domain.objects.PatientPathwayJourney;
import ims.pathways.domain.objects.PauseDetails;
import ims.pathways.vo.EventLiteVo;
import ims.pathways.vo.PatientEventVo;
import ims.pathways.vo.domain.EventLiteVoAssembler;
import ims.pathways.vo.domain.PatientJourneyVoAssembler;
import ims.pathways.vo.lookups.EventStatus;

import java.util.Date;
import java.util.List;

public class ERODDialogImpl extends BaseERODDialogImpl
{
	private static final long serialVersionUID = 1L;

	public CatsReferralERODVo getCatsReferral(CatsReferralRefVo catsReferral)
	{
		if(catsReferral == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		CatsReferral doCatsErod = (CatsReferral) factory.getDomainObject(CatsReferral.class, catsReferral.getID_CatsReferral());
		
		return CatsReferralERODVoAssembler.create(doCatsErod);
	}

	public CatsReferralERODVo saveEROD(ERODType erodType, CatsReferralERODVo catsReferralErod, ReferralERODVo referralEROD) throws ims.domain.exceptions.StaleObjectException
	{
		if(catsReferralErod == null)
			throw new CodingRuntimeException("Cannot save a null CatsReferralERODVo.");
		
		if(!catsReferralErod.isValidated())
			throw new CodingRuntimeException("CatsReferralERODVo is not validated.");
		
		if(referralEROD == null)
			throw new CodingRuntimeException("Cannot save a null ReferralERODVo.");
		
		DomainFactory factory = getDomainFactory();
		CatsReferral doCatsReferralErod = null;
		
		if(ERODType.ELECTIVE.equals(erodType))
		{
			ReferralEROD doReferralErod = ReferralERODVoAssembler.extractReferralEROD(factory, referralEROD);
			factory.save(doReferralErod);
			
			if(referralEROD.getID_ReferralEROD() == null)
			{
				doCatsReferralErod = CatsReferralERODVoAssembler.extractCatsReferral(factory, catsReferralErod);
			
				if(doCatsReferralErod.getElectiveEROD() == null)
					doCatsReferralErod.setElectiveEROD(new java.util.ArrayList());
			
				doCatsReferralErod.getElectiveEROD().add(doReferralErod);
				
				if(catsReferralErod.getJourney() != null && catsReferralErod.getJourney().getCurrentClock() != null)
				{
					PauseDetails doPauseDetails = new PauseDetails();
					doPauseDetails.setPauseStart(doReferralErod.getERODDate1());
					// WDEV-20704 if PatAvailDate set then pause stop to be populated with it
					doPauseDetails.setPauseStop(doReferralErod.getPatAvailFromDate());
					doPauseDetails.setActive(true);
					
					//WDEV-18837
					PathwayClock updatedClock = (PathwayClock) factory.getDomainObject(PathwayClock.class, catsReferralErod.getJourney().getCurrentClock().getID_PathwayClock());
					factory.refresh(updatedClock);
					
					doCatsReferralErod.getJourney().getCurrentClock().setCurrentPause(doPauseDetails);
					
					if(catsReferralErod.getJourney().getCurrentClock().getPauseDetails() == null)
						doCatsReferralErod.getJourney().getCurrentClock().setPauseDetails(new java.util.ArrayList());
					
					doCatsReferralErod.getJourney().getCurrentClock().getPauseDetails().add(doPauseDetails);
					
					//WDEV-19772 
        			if (ConfigFlag.DOM.PATHWAY_ENTITY_EVENT_FUNCTIONALITY.getValue() && doCatsReferralErod != null && doCatsReferralErod.getJourney() != null)			
        			{
        				EventLiteVo hardCodedEvent = getHardCodedEvent(HardCodedEvents.PATHWAYPAUSED.getID());
    					createPatientEvent(doCatsReferralErod, hardCodedEvent, doReferralErod.getERODDate1());	    			
        			}
				}
			
				factory.save(doCatsReferralErod);
			}
			
				
			if(catsReferralErod.getJourney() != null && catsReferralErod.getJourney().getCurrentClock() != null)
			{
				Date tciGiven=null; // WDEV-20704 - do not update Pause stop if TCI already given		
				
				String patientElectiveListQuery = "select electiveList from PatientElectiveList as electiveList left join electiveList.referral as cats left join electiveList.pathwayClock as pc where cats.id = :CatsId and pc.id = :PathwayClock";
				List<?> electiveList = factory.find(patientElectiveListQuery, new String[] {"CatsId", "PathwayClock"}, new Object[] {catsReferralErod.getID_CatsReferral(), catsReferralErod.getJourney().getCurrentClock().getID_PathwayClock()});
				
				if(electiveList != null && electiveList.size() > 0 && electiveList.get(0) instanceof PatientElectiveList)
				{
					PatientElectiveList doPatientElectiveList = (PatientElectiveList) electiveList.get(0);
					doPatientElectiveList.setEROD(doReferralErod);
					
					// WDEV-20704 
					if (doPatientElectiveList.getTCIDetails() != null && doPatientElectiveList.getTCIDetails().getTCIDate() != null)
						tciGiven=doPatientElectiveList.getTCIDetails().getTCIDate();
					
					factory.save(doPatientElectiveList);
				}
				
				// WDEV-20704 - We may need to update the Pause information at this stage.  Loop through all pause
				// records for the clock to ensure we are updating the correct record
				//doCatsReferralErod = CatsReferralERODVoAssembler.extractCatsReferral(factory, catsReferralErod);
				PathwayClock doClock = (PathwayClock) factory.getDomainObject(PathwayClock.class, catsReferralErod.getJourney().getCurrentClock().getID_PathwayClock());
				PauseDetails currentPause = doClock.getCurrentPause();
				if (currentPause != null && currentPause.getPauseStart().equals(doReferralErod.getERODDate1()))
				{
					if (tciGiven == null)
						currentPause.setPauseStop(doReferralErod.getPatAvailFromDate());
					else
						currentPause.setPauseStop(tciGiven);
				}
				else if (currentPause == null)
				{
					// Current Pause is null, so create a new one to store the EROD details
					currentPause = new PauseDetails();
					currentPause.setPauseStart(doReferralErod.getERODDate1());
					if (tciGiven == null)
						currentPause.setPauseStop(doReferralErod.getPatAvailFromDate());
					else
						currentPause.setPauseStop(tciGiven);
					currentPause.setActive(doReferralErod.isIsActive());
					doClock.setCurrentPause(currentPause);
				}
				
				List<PauseDetails> pauses = doClock.getPauseDetails();
				if (pauses != null && pauses.size() > 0)
				{
					for (int i=0; i<pauses.size(); i++)
					{
						PauseDetails pause = pauses.get(0);
						if (pause.getPauseStart().equals(doReferralErod.getERODDate1()))
						{
							if (tciGiven == null)
								pause.setPauseStop(doReferralErod.getPatAvailFromDate());
							else
								pause.setPauseStop(tciGiven);
						}
					}
				}
			}
		}
		else if(ERODType.OUTPATIENT.equals(erodType))
		{
			doCatsReferralErod = CatsReferralERODVoAssembler.extractCatsReferral(factory, catsReferralErod);
			factory.save(doCatsReferralErod);
		}
		
		return CatsReferralERODVoAssembler.create(doCatsReferralErod);
	}
		
	//WDEV-19772 
	private void createPatientEvent(CatsReferral doCatsReferral, EventLiteVo hardCodedEvent, java.util.Date erodStartDate) throws StaleObjectException
	{
		PatientPathwayJourney patientJBo = doCatsReferral != null ? doCatsReferral.getJourney() : null;

		if (patientJBo != null && hardCodedEvent != null)
		{				
				PatientEventVo patEvent = new PatientEventVo();
				patEvent.setPatient((PatientRefVo)PatientListVoAssembler.create(doCatsReferral.getPatient()));
				patEvent.setEvent(hardCodedEvent);
				patEvent.setEventDateTime(erodStartDate != null ? new DateTime(erodStartDate) : new DateTime());
				patEvent.setEventStatus(EventStatus.ACTIVE);
				patEvent.setJourney(PatientJourneyVoAssembler.create(patientJBo));
				
				HL7PathwayIf implPath = (HL7PathwayIf) getDomainImpl(HL7PathwayIfImpl.class);
				try
				{
					implPath.instantiatePatientEvent(patEvent);
				}
				catch (DomainInterfaceException e)
				{throw new DomainRuntimeException("Domain Error occured in save Event " + e.getMessage(), e);}
		}		
	}

	//WDEV-19772 
	private EventLiteVo getHardCodedEvent(int event_Id)
	{
		StringBuilder hqlBuilder = new StringBuilder("select event from Event as event left join event.status as s where event.id = :eventID and s.id = :statusID ");
		
		List <?> list = getDomainFactory().find(hqlBuilder.toString(),new String[] {"eventID", "statusID"},new Object[] {event_Id, PreActiveActiveInactiveStatus.ACTIVE.getID()});
		
		if (list == null || list.size() == 0)
			return null;
		
		return EventLiteVoAssembler.create((Event)list.get(0));	
	}

	public ReferralERODVo getEROD(ReferralERODRefVo erod)
	{
		if(erod == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		ReferralEROD doErod = (ReferralEROD) factory.getDomainObject(ReferralEROD.class, erod.getID_ReferralEROD());
		
		return ReferralERODVoAssembler.create(doErod);
	}

	public Boolean isStale(ReferralERODRefVo referralERODRef)
	{
		if(referralERODRef == null)
			return false;
		
		DomainFactory factory = getDomainFactory();
		
		List<?> refErods = factory.find("select re.id from ReferralEROD as re where re.id = :ReferralERODId and re.version > :ReferralERODVersion", new String[] {"ReferralERODId", "ReferralERODVersion"}, new Object[] {referralERODRef.getID_ReferralEROD(), referralERODRef.getVersion_ReferralEROD()});
		
		if(refErods != null && refErods.size() > 0)
			return true;
		
		return false;
	}
	
	/**
	 * WDEV-20704
	 * Method to inactivate a pause associated with an EROD that has just been marked as RIE
	 * @param referral
	 * @throws StaleObjectException 
	 */
	public void inactivatePause(CatsReferralRefVo referral, ReferralERODRefVo erod) throws StaleObjectException
	{
		if(referral == null || erod == null)
			return;
		
		DomainFactory factory = getDomainFactory();
		
		CatsReferral domReferral = (CatsReferral) factory.getDomainObject(CatsReferral.class, referral.getID_CatsReferral());
		if (domReferral != null && domReferral.getJourney() != null && domReferral.getJourney().getCurrentClock() != null)
		{
			ReferralEROD domErod = (ReferralEROD) factory.getDomainObject(ReferralEROD.class, erod.getID_ReferralEROD());
			if (domErod != null && domErod.getERODType().getId() == ERODType.ELECTIVE.getId())
			{
				// Check to see if we have an associated pause for this erod record
				PathwayClock domClock = domReferral.getJourney().getCurrentClock();
				PauseDetails currentPause = domClock.getCurrentPause();
				if (currentPause != null && currentPause.isActive() && currentPause.getPauseStart().equals(domErod.getERODDate1()))
					currentPause.setActive(false);
				
				// It could be in the history
				List pauseDetails = domClock.getPauseDetails();
				if (pauseDetails != null && pauseDetails.size() > 0)
				{
					for (int i=0; i<pauseDetails.size(); i++)
					{
						PauseDetails pause = (PauseDetails) pauseDetails.get(i);
						if (pause != null && pause.isActive() && pause.getPauseStart().equals(domErod.getERODDate1()))
						{
							pause.setActive(false);
						}
						
					}
				}
				factory.save(domClock);
			}
				
		}
		
		
	}
}
