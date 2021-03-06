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
package ims.pci.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ScheduleConfigurationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pci.vo.ScheduleConfigurationVo copy(ims.pci.vo.ScheduleConfigurationVo valueObjectDest, ims.pci.vo.ScheduleConfigurationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ScheduleConfiguration(valueObjectSrc.getID_ScheduleConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Stages
		valueObjectDest.setStages(valueObjectSrc.getStages());
		// ScheduleName
		valueObjectDest.setScheduleName(valueObjectSrc.getScheduleName());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// StartDob
		valueObjectDest.setStartDob(valueObjectSrc.getStartDob());
		// EndDob
		valueObjectDest.setEndDob(valueObjectSrc.getEndDob());
		// isDefaultSchedule
		valueObjectDest.setIsDefaultSchedule(valueObjectSrc.getIsDefaultSchedule());
		// ScheduleType
		valueObjectDest.setScheduleType(valueObjectSrc.getScheduleType());
		// CampaignStartDate
		valueObjectDest.setCampaignStartDate(valueObjectSrc.getCampaignStartDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createScheduleConfigurationVoCollectionFromScheduleConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ScheduleConfiguration objects.
	 */
	public static ims.pci.vo.ScheduleConfigurationVoCollection createScheduleConfigurationVoCollectionFromScheduleConfiguration(java.util.Set domainObjectSet)	
	{
		return createScheduleConfigurationVoCollectionFromScheduleConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pci.domain.objects.ScheduleConfiguration objects.
	 */
	public static ims.pci.vo.ScheduleConfigurationVoCollection createScheduleConfigurationVoCollectionFromScheduleConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pci.vo.ScheduleConfigurationVoCollection voList = new ims.pci.vo.ScheduleConfigurationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pci.domain.objects.ScheduleConfiguration domainObject = (ims.pci.domain.objects.ScheduleConfiguration) iterator.next();
			ims.pci.vo.ScheduleConfigurationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pci.domain.objects.ScheduleConfiguration objects.
	 */
	public static ims.pci.vo.ScheduleConfigurationVoCollection createScheduleConfigurationVoCollectionFromScheduleConfiguration(java.util.List domainObjectList) 
	{
		return createScheduleConfigurationVoCollectionFromScheduleConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pci.domain.objects.ScheduleConfiguration objects.
	 */
	public static ims.pci.vo.ScheduleConfigurationVoCollection createScheduleConfigurationVoCollectionFromScheduleConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pci.vo.ScheduleConfigurationVoCollection voList = new ims.pci.vo.ScheduleConfigurationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pci.domain.objects.ScheduleConfiguration domainObject = (ims.pci.domain.objects.ScheduleConfiguration) domainObjectList.get(i);
			ims.pci.vo.ScheduleConfigurationVo vo = create(map, domainObject);

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
	 * Create the ims.pci.domain.objects.ScheduleConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractScheduleConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationVoCollection voCollection) 
	 {
	 	return extractScheduleConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractScheduleConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ScheduleConfigurationVo vo = voCollection.get(i);
			ims.pci.domain.objects.ScheduleConfiguration domainObject = ScheduleConfigurationVoAssembler.extractScheduleConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.pci.domain.objects.ScheduleConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractScheduleConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationVoCollection voCollection) 
	 {
	 	return extractScheduleConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractScheduleConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pci.vo.ScheduleConfigurationVo vo = voCollection.get(i);
			ims.pci.domain.objects.ScheduleConfiguration domainObject = ScheduleConfigurationVoAssembler.extractScheduleConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pci.domain.objects.ScheduleConfiguration object.
	 * @param domainObject ims.pci.domain.objects.ScheduleConfiguration
	 */
	 public static ims.pci.vo.ScheduleConfigurationVo create(ims.pci.domain.objects.ScheduleConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pci.domain.objects.ScheduleConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pci.vo.ScheduleConfigurationVo create(DomainObjectMap map, ims.pci.domain.objects.ScheduleConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pci.vo.ScheduleConfigurationVo valueObject = (ims.pci.vo.ScheduleConfigurationVo) map.getValueObject(domainObject, ims.pci.vo.ScheduleConfigurationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pci.vo.ScheduleConfigurationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pci.domain.objects.ScheduleConfiguration
	 */
	 public static ims.pci.vo.ScheduleConfigurationVo insert(ims.pci.vo.ScheduleConfigurationVo valueObject, ims.pci.domain.objects.ScheduleConfiguration domainObject) 
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
	 * @param domainObject ims.pci.domain.objects.ScheduleConfiguration
	 */
	 public static ims.pci.vo.ScheduleConfigurationVo insert(DomainObjectMap map, ims.pci.vo.ScheduleConfigurationVo valueObject, ims.pci.domain.objects.ScheduleConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ScheduleConfiguration(domainObject.getId());
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
			
		// Stages
		valueObject.setStages(ims.pci.vo.domain.StageConfigurationVoAssembler.createStageConfigurationVoCollectionFromStageConfiguration(map, domainObject.getStages()) );
		// ScheduleName
		valueObject.setScheduleName(domainObject.getScheduleName());
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup3 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// StartDob
		java.util.Date StartDob = domainObject.getStartDob();
		if ( null != StartDob ) 
		{
			valueObject.setStartDob(new ims.framework.utils.Date(StartDob) );
		}
		// EndDob
		java.util.Date EndDob = domainObject.getEndDob();
		if ( null != EndDob ) 
		{
			valueObject.setEndDob(new ims.framework.utils.Date(EndDob) );
		}
		// isDefaultSchedule
		valueObject.setIsDefaultSchedule( domainObject.isIsDefaultSchedule() );
		// ScheduleType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getScheduleType();
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

			ims.pci.vo.lookups.ScheduleType voLookup7 = new ims.pci.vo.lookups.ScheduleType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.pci.vo.lookups.ScheduleType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.pci.vo.lookups.ScheduleType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setScheduleType(voLookup7);
		}
				// CampaignStartDate
		java.util.Date CampaignStartDate = domainObject.getCampaignStartDate();
		if ( null != CampaignStartDate ) 
		{
			valueObject.setCampaignStartDate(new ims.framework.utils.Date(CampaignStartDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pci.domain.objects.ScheduleConfiguration extractScheduleConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationVo valueObject) 
	{
		return 	extractScheduleConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.pci.domain.objects.ScheduleConfiguration extractScheduleConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.pci.vo.ScheduleConfigurationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ScheduleConfiguration();
		ims.pci.domain.objects.ScheduleConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pci.domain.objects.ScheduleConfiguration)domMap.get(valueObject);
			}
			// ims.pci.vo.ScheduleConfigurationVo ID_ScheduleConfiguration field is unknown
			domainObject = new ims.pci.domain.objects.ScheduleConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ScheduleConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.pci.domain.objects.ScheduleConfiguration)domMap.get(key);
			}
			domainObject = (ims.pci.domain.objects.ScheduleConfiguration) domainFactory.getDomainObject(ims.pci.domain.objects.ScheduleConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ScheduleConfiguration());

		domainObject.setStages(ims.pci.vo.domain.StageConfigurationVoAssembler.extractStageConfigurationList(domainFactory, valueObject.getStages(), domainObject.getStages(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getScheduleName() != null && valueObject.getScheduleName().equals(""))
		{
			valueObject.setScheduleName(null);
		}
		domainObject.setScheduleName(valueObject.getScheduleName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getStartDob();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setStartDob(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getEndDob();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setEndDob(value5);
		domainObject.setIsDefaultSchedule(valueObject.getIsDefaultSchedule());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getScheduleType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getScheduleType().getID());
		}
		domainObject.setScheduleType(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getCampaignStartDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setCampaignStartDate(value8);

		return domainObject;
	}

}
