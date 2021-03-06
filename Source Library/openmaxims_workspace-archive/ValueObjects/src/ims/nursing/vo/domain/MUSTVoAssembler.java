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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Charlotte Murphy
 */
public class MUSTVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.MUSTVo copy(ims.nursing.vo.MUSTVo valueObjectDest, ims.nursing.vo.MUSTVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MUST(valueObjectSrc.getID_MUST());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// PreviousHealthyWeight
		valueObjectDest.setPreviousHealthyWeight(valueObjectSrc.getPreviousHealthyWeight());
		// AcutelyIll
		valueObjectDest.setAcutelyIll(valueObjectSrc.getAcutelyIll());
		// ActionTaken
		valueObjectDest.setActionTaken(valueObjectSrc.getActionTaken());
		// WeightLossReason
		valueObjectDest.setWeightLossReason(valueObjectSrc.getWeightLossReason());
		// Management
		valueObjectDest.setManagement(valueObjectSrc.getManagement());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// VitalSign
		valueObjectDest.setVitalSign(valueObjectSrc.getVitalSign());
		// BMIScore
		valueObjectDest.setBMIScore(valueObjectSrc.getBMIScore());
		// UWLScore
		valueObjectDest.setUWLScore(valueObjectSrc.getUWLScore());
		// ADEScore
		valueObjectDest.setADEScore(valueObjectSrc.getADEScore());
		// ORMScore
		valueObjectDest.setORMScore(valueObjectSrc.getORMScore());
		// Metrics
		valueObjectDest.setMetrics(valueObjectSrc.getMetrics());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMUSTVoCollectionFromMUST(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessmenttools.domain.objects.MUST objects.
	 */
	public static ims.nursing.vo.MUSTVoCollection createMUSTVoCollectionFromMUST(java.util.Set domainObjectSet)	
	{
		return createMUSTVoCollectionFromMUST(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessmenttools.domain.objects.MUST objects.
	 */
	public static ims.nursing.vo.MUSTVoCollection createMUSTVoCollectionFromMUST(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.MUSTVoCollection voList = new ims.nursing.vo.MUSTVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessmenttools.domain.objects.MUST domainObject = (ims.nursing.assessmenttools.domain.objects.MUST) iterator.next();
			ims.nursing.vo.MUSTVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessmenttools.domain.objects.MUST objects.
	 */
	public static ims.nursing.vo.MUSTVoCollection createMUSTVoCollectionFromMUST(java.util.List domainObjectList) 
	{
		return createMUSTVoCollectionFromMUST(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessmenttools.domain.objects.MUST objects.
	 */
	public static ims.nursing.vo.MUSTVoCollection createMUSTVoCollectionFromMUST(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.MUSTVoCollection voList = new ims.nursing.vo.MUSTVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessmenttools.domain.objects.MUST domainObject = (ims.nursing.assessmenttools.domain.objects.MUST) domainObjectList.get(i);
			ims.nursing.vo.MUSTVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessmenttools.domain.objects.MUST set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMUSTSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.MUSTVoCollection voCollection) 
	 {
	 	return extractMUSTSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMUSTSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.MUSTVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.MUSTVo vo = voCollection.get(i);
			ims.nursing.assessmenttools.domain.objects.MUST domainObject = MUSTVoAssembler.extractMUST(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessmenttools.domain.objects.MUST list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMUSTList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.MUSTVoCollection voCollection) 
	 {
	 	return extractMUSTList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMUSTList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.MUSTVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.MUSTVo vo = voCollection.get(i);
			ims.nursing.assessmenttools.domain.objects.MUST domainObject = MUSTVoAssembler.extractMUST(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessmenttools.domain.objects.MUST object.
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.MUST
	 */
	 public static ims.nursing.vo.MUSTVo create(ims.nursing.assessmenttools.domain.objects.MUST domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessmenttools.domain.objects.MUST object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.MUSTVo create(DomainObjectMap map, ims.nursing.assessmenttools.domain.objects.MUST domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.MUSTVo valueObject = (ims.nursing.vo.MUSTVo) map.getValueObject(domainObject, ims.nursing.vo.MUSTVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.MUSTVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.MUST
	 */
	 public static ims.nursing.vo.MUSTVo insert(ims.nursing.vo.MUSTVo valueObject, ims.nursing.assessmenttools.domain.objects.MUST domainObject) 
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
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.MUST
	 */
	 public static ims.nursing.vo.MUSTVo insert(DomainObjectMap map, ims.nursing.vo.MUSTVo valueObject, ims.nursing.assessmenttools.domain.objects.MUST domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MUST(domainObject.getId());
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
			
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// PreviousHealthyWeight
		valueObject.setPreviousHealthyWeight(domainObject.getPreviousHealthyWeight());
		// AcutelyIll
		valueObject.setAcutelyIll( domainObject.isAcutelyIll() );
		// ActionTaken
		valueObject.setActionTaken(domainObject.getActionTaken());
		// WeightLossReason
		valueObject.setWeightLossReason(domainObject.getWeightLossReason());
		// Management
		ims.domain.lookups.LookupInstance instance7 = domainObject.getManagement();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.MUSTManagement voLookup7 = new ims.nursing.vo.lookups.MUSTManagement(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.nursing.vo.lookups.MUSTManagement parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.nursing.vo.lookups.MUSTManagement(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setManagement(voLookup7);
		}
				// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// VitalSign
		valueObject.setVitalSign(ims.core.vo.domain.VitalSignsVoAssembler.create(map, domainObject.getVitalSign()) );
		// BMIScore
		valueObject.setBMIScore(domainObject.getBMIScore());
		// UWLScore
		valueObject.setUWLScore(domainObject.getUWLScore());
		// ADEScore
		valueObject.setADEScore(domainObject.getADEScore());
		// ORMScore
		valueObject.setORMScore(domainObject.getORMScore());
		// Metrics
		valueObject.setMetrics(ims.core.vo.domain.VSMetricsAssembler.create(map, domainObject.getMetrics()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.assessmenttools.domain.objects.MUST extractMUST(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.MUSTVo valueObject) 
	{
		return 	extractMUST(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessmenttools.domain.objects.MUST extractMUST(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.MUSTVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MUST();
		ims.nursing.assessmenttools.domain.objects.MUST domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessmenttools.domain.objects.MUST)domMap.get(valueObject);
			}
			// ims.nursing.vo.MUSTVo ID_MUST field is unknown
			domainObject = new ims.nursing.assessmenttools.domain.objects.MUST();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MUST());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessmenttools.domain.objects.MUST)domMap.get(key);
			}
			domainObject = (ims.nursing.assessmenttools.domain.objects.MUST) domainFactory.getDomainObject(ims.nursing.assessmenttools.domain.objects.MUST.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MUST());

		ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getClinicalContact();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		domainObject.setPreviousHealthyWeight(valueObject.getPreviousHealthyWeight());
		domainObject.setAcutelyIll(valueObject.getAcutelyIll());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActionTaken() != null && valueObject.getActionTaken().equals(""))
		{
			valueObject.setActionTaken(null);
		}
		domainObject.setActionTaken(valueObject.getActionTaken());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWeightLossReason() != null && valueObject.getWeightLossReason().equals(""))
		{
			valueObject.setWeightLossReason(null);
		}
		domainObject.setWeightLossReason(valueObject.getWeightLossReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getManagement() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getManagement().getID());
		}
		domainObject.setManagement(value7);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		domainObject.setVitalSign(ims.core.vo.domain.VitalSignsVoAssembler.extractVitalSigns(domainFactory, valueObject.getVitalSign(), domMap));
		domainObject.setBMIScore(valueObject.getBMIScore());
		domainObject.setUWLScore(valueObject.getUWLScore());
		domainObject.setADEScore(valueObject.getADEScore());
		domainObject.setORMScore(valueObject.getORMScore());
		domainObject.setMetrics(ims.core.vo.domain.VSMetricsAssembler.extractMetrics(domainFactory, valueObject.getMetrics(), domMap));

		return domainObject;
	}

}
