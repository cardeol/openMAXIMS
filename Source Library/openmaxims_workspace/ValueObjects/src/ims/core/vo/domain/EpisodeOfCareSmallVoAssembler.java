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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class EpisodeOfCareSmallVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.EpisodeOfCareSmallVo copy(ims.core.vo.EpisodeOfCareSmallVo valueObjectDest, ims.core.vo.EpisodeOfCareSmallVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EpisodeOfCare(valueObjectSrc.getID_EpisodeOfCare());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
		// EpisodeOfCareHistory
		valueObjectDest.setEpisodeOfCareHistory(valueObjectSrc.getEpisodeOfCareHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEpisodeOfCareSmallVoCollectionFromEpisodeOfCare(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.core.vo.EpisodeOfCareSmallVoCollection createEpisodeOfCareSmallVoCollectionFromEpisodeOfCare(java.util.Set domainObjectSet)	
	{
		return createEpisodeOfCareSmallVoCollectionFromEpisodeOfCare(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.core.vo.EpisodeOfCareSmallVoCollection createEpisodeOfCareSmallVoCollectionFromEpisodeOfCare(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.EpisodeOfCareSmallVoCollection voList = new ims.core.vo.EpisodeOfCareSmallVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = (ims.core.admin.domain.objects.EpisodeOfCare) iterator.next();
			ims.core.vo.EpisodeOfCareSmallVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.core.vo.EpisodeOfCareSmallVoCollection createEpisodeOfCareSmallVoCollectionFromEpisodeOfCare(java.util.List domainObjectList) 
	{
		return createEpisodeOfCareSmallVoCollectionFromEpisodeOfCare(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EpisodeOfCare objects.
	 */
	public static ims.core.vo.EpisodeOfCareSmallVoCollection createEpisodeOfCareSmallVoCollectionFromEpisodeOfCare(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.EpisodeOfCareSmallVoCollection voList = new ims.core.vo.EpisodeOfCareSmallVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = (ims.core.admin.domain.objects.EpisodeOfCare) domainObjectList.get(i);
			ims.core.vo.EpisodeOfCareSmallVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.EpisodeOfCare set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEpisodeOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareSmallVoCollection voCollection) 
	 {
	 	return extractEpisodeOfCareSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEpisodeOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareSmallVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.EpisodeOfCareSmallVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = EpisodeOfCareSmallVoAssembler.extractEpisodeOfCare(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.EpisodeOfCare list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEpisodeOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareSmallVoCollection voCollection) 
	 {
	 	return extractEpisodeOfCareList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEpisodeOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareSmallVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.EpisodeOfCareSmallVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EpisodeOfCare domainObject = EpisodeOfCareSmallVoAssembler.extractEpisodeOfCare(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.EpisodeOfCare object.
	 * @param domainObject ims.core.admin.domain.objects.EpisodeOfCare
	 */
	 public static ims.core.vo.EpisodeOfCareSmallVo create(ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.EpisodeOfCare object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.EpisodeOfCareSmallVo create(DomainObjectMap map, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.EpisodeOfCareSmallVo valueObject = (ims.core.vo.EpisodeOfCareSmallVo) map.getValueObject(domainObject, ims.core.vo.EpisodeOfCareSmallVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.EpisodeOfCareSmallVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.EpisodeOfCare
	 */
	 public static ims.core.vo.EpisodeOfCareSmallVo insert(ims.core.vo.EpisodeOfCareSmallVo valueObject, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.EpisodeOfCare
	 */
	 public static ims.core.vo.EpisodeOfCareSmallVo insert(DomainObjectMap map, ims.core.vo.EpisodeOfCareSmallVo valueObject, ims.core.admin.domain.objects.EpisodeOfCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EpisodeOfCare(domainObject.getId());
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
			
		// Specialty
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSpecialty();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup1 = new ims.core.vo.lookups.Specialty(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.core.vo.lookups.Specialty(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSpecialty(voLookup1);
		}
				// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
		// EpisodeOfCareHistory
		valueObject.setEpisodeOfCareHistory(ims.core.vo.domain.EpisodeOfCareHistVoAssembler.createEpisodeOfCareHistVoCollectionFromEpisodeOfCareHistory(map, domainObject.getEpisodeOfCareHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EpisodeOfCare extractEpisodeOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareSmallVo valueObject) 
	{
		return 	extractEpisodeOfCare(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EpisodeOfCare extractEpisodeOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EpisodeOfCareSmallVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EpisodeOfCare();
		ims.core.admin.domain.objects.EpisodeOfCare domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject);
			}
			// ims.core.vo.EpisodeOfCareSmallVo ID_EpisodeOfCare field is unknown
			domainObject = new ims.core.admin.domain.objects.EpisodeOfCare();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EpisodeOfCare());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.EpisodeOfCare) domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EpisodeOfCare());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getStartDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setStartDate(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getEndDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setEndDate(value3);

		// SaveAsRefVO treated as RefValueObject
		ims.core.admin.vo.EpisodeOfCareHistoryRefVoCollection refCollection4 = new ims.core.admin.vo.EpisodeOfCareHistoryRefVoCollection();
		if (valueObject.getEpisodeOfCareHistory() != null)
		{
			for (int i4=0; i4<valueObject.getEpisodeOfCareHistory().size(); i4++)
			{
				ims.core.admin.vo.EpisodeOfCareHistoryRefVo ref4 = (ims.core.admin.vo.EpisodeOfCareHistoryRefVo)valueObject.getEpisodeOfCareHistory().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainEpisodeOfCareHistory4 = domainObject.getEpisodeOfCareHistory();
		if (domainEpisodeOfCareHistory4 == null)
		{
			domainEpisodeOfCareHistory4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.core.admin.vo.EpisodeOfCareHistoryRefVo vo = refCollection4.get(i);					
			ims.core.admin.domain.objects.EpisodeOfCareHistory dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.EpisodeOfCareHistory)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.EpisodeOfCareHistory)domainFactory.getDomainObject( ims.core.admin.domain.objects.EpisodeOfCareHistory.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainEpisodeOfCareHistory4.contains(dom))
			{
				domainEpisodeOfCareHistory4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainEpisodeOfCareHistory4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainEpisodeOfCareHistory4.remove(iter4.next());
		}		
		
		domainObject.setEpisodeOfCareHistory(domainEpisodeOfCareHistory4);		

		return domainObject;
	}

}
