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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Calin Perebiceanu
 */
public class NursingNotesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.NursingNotesVo copy(ims.RefMan.vo.NursingNotesVo valueObjectDest, ims.RefMan.vo.NursingNotesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_NursingNotes(valueObjectSrc.getID_NursingNotes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// AuthoringUser
		valueObjectDest.setAuthoringUser(valueObjectSrc.getAuthoringUser());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
		// VitalSigns
		valueObjectDest.setVitalSigns(valueObjectSrc.getVitalSigns());
		// Allergies
		valueObjectDest.setAllergies(valueObjectSrc.getAllergies());
		// SmokingStatus
		valueObjectDest.setSmokingStatus(valueObjectSrc.getSmokingStatus());
		// AdviceGiven
		valueObjectDest.setAdviceGiven(valueObjectSrc.getAdviceGiven());
		// UnitsOfAlcoholConsumedPerWeek
		valueObjectDest.setUnitsOfAlcoholConsumedPerWeek(valueObjectSrc.getUnitsOfAlcoholConsumedPerWeek());
		// ReferredToSomkingCessation
		valueObjectDest.setReferredToSomkingCessation(valueObjectSrc.getReferredToSomkingCessation());
		// ObservationNotes
		valueObjectDest.setObservationNotes(valueObjectSrc.getObservationNotes());
		// Comorbidities
		valueObjectDest.setComorbidities(valueObjectSrc.getComorbidities());
		// MRSAResult
		valueObjectDest.setMRSAResult(valueObjectSrc.getMRSAResult());
		// SpecialNeeds
		valueObjectDest.setSpecialNeeds(valueObjectSrc.getSpecialNeeds());
		// CurrentMedications
		valueObjectDest.setCurrentMedications(valueObjectSrc.getCurrentMedications());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createNursingNotesVoCollectionFromNursingNotes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.NursingNotes objects.
	 */
	public static ims.RefMan.vo.NursingNotesVoCollection createNursingNotesVoCollectionFromNursingNotes(java.util.Set domainObjectSet)	
	{
		return createNursingNotesVoCollectionFromNursingNotes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.NursingNotes objects.
	 */
	public static ims.RefMan.vo.NursingNotesVoCollection createNursingNotesVoCollectionFromNursingNotes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.NursingNotesVoCollection voList = new ims.RefMan.vo.NursingNotesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.NursingNotes domainObject = (ims.RefMan.domain.objects.NursingNotes) iterator.next();
			ims.RefMan.vo.NursingNotesVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.RefMan.domain.objects.NursingNotes objects.
	 */
	public static ims.RefMan.vo.NursingNotesVoCollection createNursingNotesVoCollectionFromNursingNotes(java.util.List domainObjectList) 
	{
		return createNursingNotesVoCollectionFromNursingNotes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.NursingNotes objects.
	 */
	public static ims.RefMan.vo.NursingNotesVoCollection createNursingNotesVoCollectionFromNursingNotes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.NursingNotesVoCollection voList = new ims.RefMan.vo.NursingNotesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.NursingNotes domainObject = (ims.RefMan.domain.objects.NursingNotes) domainObjectList.get(i);
			ims.RefMan.vo.NursingNotesVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.RefMan.domain.objects.NursingNotes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNursingNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.NursingNotesVoCollection voCollection) 
	 {
	 	return extractNursingNotesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNursingNotesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.NursingNotesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.NursingNotesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.NursingNotes domainObject = NursingNotesVoAssembler.extractNursingNotes(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.RefMan.domain.objects.NursingNotes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNursingNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.NursingNotesVoCollection voCollection) 
	 {
	 	return extractNursingNotesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNursingNotesList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.NursingNotesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.NursingNotesVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.NursingNotes domainObject = NursingNotesVoAssembler.extractNursingNotes(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.RefMan.domain.objects.NursingNotes object.
	 * @param domainObject ims.RefMan.domain.objects.NursingNotes
	 */
	 public static ims.RefMan.vo.NursingNotesVo create(ims.RefMan.domain.objects.NursingNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.NursingNotes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.NursingNotesVo create(DomainObjectMap map, ims.RefMan.domain.objects.NursingNotes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.NursingNotesVo valueObject = (ims.RefMan.vo.NursingNotesVo) map.getValueObject(domainObject, ims.RefMan.vo.NursingNotesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.NursingNotesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.NursingNotes
	 */
	 public static ims.RefMan.vo.NursingNotesVo insert(ims.RefMan.vo.NursingNotesVo valueObject, ims.RefMan.domain.objects.NursingNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.NursingNotes
	 */
	 public static ims.RefMan.vo.NursingNotesVo insert(DomainObjectMap map, ims.RefMan.vo.NursingNotesVo valueObject, ims.RefMan.domain.objects.NursingNotes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_NursingNotes(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
		// AuthoringUser
		valueObject.setAuthoringUser(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getAuthoringUser()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
		// VitalSigns
		valueObject.setVitalSigns(ims.core.vo.domain.VitalSignsForNursingNotesVoAssembler.create(map, domainObject.getVitalSigns()) );
		// Allergies
		valueObject.setAllergies(ims.core.vo.domain.PatientAllergyForNursingNotesVoAssembler.createPatientAllergyForNursingNotesVoCollectionFromPatientAllergy(map, domainObject.getAllergies()) );
		// SmokingStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSmokingStatus();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SmokingStatus voLookup6 = new ims.core.vo.lookups.SmokingStatus(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.SmokingStatus parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.SmokingStatus(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSmokingStatus(voLookup6);
		}
				// AdviceGiven
		valueObject.setAdviceGiven( domainObject.isAdviceGiven() );
		// UnitsOfAlcoholConsumedPerWeek
		valueObject.setUnitsOfAlcoholConsumedPerWeek(domainObject.getUnitsOfAlcoholConsumedPerWeek());
		// ReferredToSomkingCessation
		valueObject.setReferredToSomkingCessation( domainObject.isReferredToSomkingCessation() );
		// ObservationNotes
		valueObject.setObservationNotes(domainObject.getObservationNotes());
		// Comorbidities
		valueObject.setComorbidities(ims.core.vo.domain.PatientDiagnosisForNursingNotesVoAssembler.createPatientDiagnosisForNursingNotesVoCollectionFromPatientDiagnosis(map, domainObject.getComorbidities()) );
		// MRSAResult
		ims.domain.lookups.LookupInstance instance12 = domainObject.getMRSAResult();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.MRSAResult voLookup12 = new ims.nursing.vo.lookups.MRSAResult(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.nursing.vo.lookups.MRSAResult parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.nursing.vo.lookups.MRSAResult(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setMRSAResult(voLookup12);
		}
				// SpecialNeeds
		ims.clinical.vo.PatientSpecialNeedRefVoCollection SpecialNeeds = new ims.clinical.vo.PatientSpecialNeedRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getSpecialNeeds().iterator(); iterator.hasNext(); ) 
		{
			ims.clinical.domain.objects.PatientSpecialNeed tmp = (ims.clinical.domain.objects.PatientSpecialNeed)iterator.next();
			if (tmp != null)
				SpecialNeeds.add(new ims.clinical.vo.PatientSpecialNeedRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setSpecialNeeds(SpecialNeeds);
		// CurrentMedications
		valueObject.setCurrentMedications(ims.core.vo.domain.PatientMedicationForNursingNotesVoAssembler.createPatientMedicationForNursingNotesVoCollectionFromPatientMedication(map, domainObject.getCurrentMedications()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.NursingNotes extractNursingNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.NursingNotesVo valueObject) 
	{
		return 	extractNursingNotes(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.NursingNotes extractNursingNotes(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.NursingNotesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_NursingNotes();
		ims.RefMan.domain.objects.NursingNotes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.NursingNotes)domMap.get(valueObject);
			}
			// ims.RefMan.vo.NursingNotesVo ID_NursingNotes field is unknown
			domainObject = new ims.RefMan.domain.objects.NursingNotes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_NursingNotes());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.NursingNotes)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.NursingNotes) domainFactory.getDomainObject(ims.RefMan.domain.objects.NursingNotes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_NursingNotes());

		ims.RefMan.domain.objects.CatsReferral value1 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value1 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCatsReferral();	
			}
			else
			{
				value1 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getAuthoringUser() ) 
		{
			if (valueObject.getAuthoringUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getAuthoringUser()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getAuthoringUser());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getAuthoringUser().getBoId());
			}
		}
		domainObject.setAuthoringUser(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getAuthoringDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value3);
		domainObject.setVitalSigns(ims.core.vo.domain.VitalSignsForNursingNotesVoAssembler.extractVitalSigns(domainFactory, valueObject.getVitalSigns(), domMap));
		domainObject.setAllergies(ims.core.vo.domain.PatientAllergyForNursingNotesVoAssembler.extractPatientAllergySet(domainFactory, valueObject.getAllergies(), domainObject.getAllergies(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSmokingStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSmokingStatus().getID());
		}
		domainObject.setSmokingStatus(value6);
		domainObject.setAdviceGiven(valueObject.getAdviceGiven());
		domainObject.setUnitsOfAlcoholConsumedPerWeek(valueObject.getUnitsOfAlcoholConsumedPerWeek());
		domainObject.setReferredToSomkingCessation(valueObject.getReferredToSomkingCessation());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getObservationNotes() != null && valueObject.getObservationNotes().equals(""))
		{
			valueObject.setObservationNotes(null);
		}
		domainObject.setObservationNotes(valueObject.getObservationNotes());
		domainObject.setComorbidities(ims.core.vo.domain.PatientDiagnosisForNursingNotesVoAssembler.extractPatientDiagnosisSet(domainFactory, valueObject.getComorbidities(), domainObject.getComorbidities(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getMRSAResult() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getMRSAResult().getID());
		}
		domainObject.setMRSAResult(value12);

		ims.clinical.vo.PatientSpecialNeedRefVoCollection refCollection13 = valueObject.getSpecialNeeds();
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.Set domainSpecialNeeds13 = domainObject.getSpecialNeeds();
		if (domainSpecialNeeds13 == null)
		{
			domainSpecialNeeds13 = new java.util.HashSet();
		}
		java.util.Set newSet13  = new java.util.HashSet();
		for(int i=0; i<size13; i++) 
		{
			ims.clinical.vo.PatientSpecialNeedRefVo vo = refCollection13.get(i);					
			ims.clinical.domain.objects.PatientSpecialNeed dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.clinical.domain.objects.PatientSpecialNeed)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.clinical.domain.objects.PatientSpecialNeed)domainFactory.getDomainObject( ims.clinical.domain.objects.PatientSpecialNeed.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainSpecialNeeds13.contains(dom))
			{
				domainSpecialNeeds13.add(dom);
			}
			newSet13.add(dom);			
		}
		java.util.Set removedSet13 = new java.util.HashSet();
		java.util.Iterator iter13 = domainSpecialNeeds13.iterator();
		//Find out which objects need to be removed
		while (iter13.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter13.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet13.contains(o))
			{
				removedSet13.add(o);
			}
		}
		iter13 = removedSet13.iterator();
		//Remove the unwanted objects
		while (iter13.hasNext())
		{
			domainSpecialNeeds13.remove(iter13.next());
		}		
		
		domainObject.setSpecialNeeds(domainSpecialNeeds13);		
		domainObject.setCurrentMedications(ims.core.vo.domain.PatientMedicationForNursingNotesVoAssembler.extractPatientMedicationSet(domainFactory, valueObject.getCurrentMedications(), domainObject.getCurrentMedications(), domMap));		

		return domainObject;
	}

}
