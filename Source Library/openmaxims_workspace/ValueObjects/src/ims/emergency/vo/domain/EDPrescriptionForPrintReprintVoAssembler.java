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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class EDPrescriptionForPrintReprintVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.EDPrescriptionForPrintReprintVo copy(ims.emergency.vo.EDPrescriptionForPrintReprintVo valueObjectDest, ims.emergency.vo.EDPrescriptionForPrintReprintVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EDPrescription(valueObjectSrc.getID_EDPrescription());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isCompleted
		valueObjectDest.setIsCompleted(valueObjectSrc.getIsCompleted());
		// isPrinted
		valueObjectDest.setIsPrinted(valueObjectSrc.getIsPrinted());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// PrescriptionPrintHistory
		valueObjectDest.setPrescriptionPrintHistory(valueObjectSrc.getPrescriptionPrintHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEDPrescriptionForPrintReprintVoCollectionFromEDPrescription(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EDPrescription objects.
	 */
	public static ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection createEDPrescriptionForPrintReprintVoCollectionFromEDPrescription(java.util.Set domainObjectSet)	
	{
		return createEDPrescriptionForPrintReprintVoCollectionFromEDPrescription(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.EDPrescription objects.
	 */
	public static ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection createEDPrescriptionForPrintReprintVoCollectionFromEDPrescription(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection voList = new ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.EDPrescription domainObject = (ims.emergency.domain.objects.EDPrescription) iterator.next();
			ims.emergency.vo.EDPrescriptionForPrintReprintVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.EDPrescription objects.
	 */
	public static ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection createEDPrescriptionForPrintReprintVoCollectionFromEDPrescription(java.util.List domainObjectList) 
	{
		return createEDPrescriptionForPrintReprintVoCollectionFromEDPrescription(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.EDPrescription objects.
	 */
	public static ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection createEDPrescriptionForPrintReprintVoCollectionFromEDPrescription(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection voList = new ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.EDPrescription domainObject = (ims.emergency.domain.objects.EDPrescription) domainObjectList.get(i);
			ims.emergency.vo.EDPrescriptionForPrintReprintVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.EDPrescription set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEDPrescriptionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection voCollection) 
	 {
	 	return extractEDPrescriptionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEDPrescriptionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDPrescriptionForPrintReprintVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EDPrescription domainObject = EDPrescriptionForPrintReprintVoAssembler.extractEDPrescription(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.EDPrescription list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEDPrescriptionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection voCollection) 
	 {
	 	return extractEDPrescriptionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEDPrescriptionList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPrescriptionForPrintReprintVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.EDPrescriptionForPrintReprintVo vo = voCollection.get(i);
			ims.emergency.domain.objects.EDPrescription domainObject = EDPrescriptionForPrintReprintVoAssembler.extractEDPrescription(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.EDPrescription object.
	 * @param domainObject ims.emergency.domain.objects.EDPrescription
	 */
	 public static ims.emergency.vo.EDPrescriptionForPrintReprintVo create(ims.emergency.domain.objects.EDPrescription domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.EDPrescription object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.EDPrescriptionForPrintReprintVo create(DomainObjectMap map, ims.emergency.domain.objects.EDPrescription domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.EDPrescriptionForPrintReprintVo valueObject = (ims.emergency.vo.EDPrescriptionForPrintReprintVo) map.getValueObject(domainObject, ims.emergency.vo.EDPrescriptionForPrintReprintVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.EDPrescriptionForPrintReprintVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.EDPrescription
	 */
	 public static ims.emergency.vo.EDPrescriptionForPrintReprintVo insert(ims.emergency.vo.EDPrescriptionForPrintReprintVo valueObject, ims.emergency.domain.objects.EDPrescription domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.EDPrescription
	 */
	 public static ims.emergency.vo.EDPrescriptionForPrintReprintVo insert(DomainObjectMap map, ims.emergency.vo.EDPrescriptionForPrintReprintVo valueObject, ims.emergency.domain.objects.EDPrescription domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EDPrescription(domainObject.getId());
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
			
		// isCompleted
		valueObject.setIsCompleted( domainObject.isIsCompleted() );
		// isPrinted
		valueObject.setIsPrinted( domainObject.isIsPrinted() );
		// Episode
		if (domainObject.getEpisode() != null)
		{
			if(domainObject.getEpisode() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisode();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisode(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisode().getId(), domainObject.getEpisode().getVersion()));
			}
		}
		// Attendance
		if (domainObject.getAttendance() != null)
		{
			if(domainObject.getAttendance() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAttendance();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setAttendance(new ims.core.admin.vo.CareContextRefVo(domainObject.getAttendance().getId(), domainObject.getAttendance().getVersion()));
			}
		}
		// PrescriptionPrintHistory
		valueObject.setPrescriptionPrintHistory(ims.emergency.vo.domain.PrescriptionPrintDetailsVoAssembler.createPrescriptionPrintDetailsVoCollectionFromPrescriptionPrintDetails(map, domainObject.getPrescriptionPrintHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.EDPrescription extractEDPrescription(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPrescriptionForPrintReprintVo valueObject) 
	{
		return 	extractEDPrescription(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.EDPrescription extractEDPrescription(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.EDPrescriptionForPrintReprintVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EDPrescription();
		ims.emergency.domain.objects.EDPrescription domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.EDPrescription)domMap.get(valueObject);
			}
			// ims.emergency.vo.EDPrescriptionForPrintReprintVo ID_EDPrescription field is unknown
			domainObject = new ims.emergency.domain.objects.EDPrescription();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EDPrescription());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.EDPrescription)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.EDPrescription) domainFactory.getDomainObject(ims.emergency.domain.objects.EDPrescription.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EDPrescription());

		domainObject.setIsCompleted(valueObject.getIsCompleted());
		domainObject.setIsPrinted(valueObject.getIsPrinted());
		ims.core.admin.domain.objects.EpisodeOfCare value3 = null;
		if ( null != valueObject.getEpisode() ) 
		{
			if (valueObject.getEpisode().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisode()) != null)
				{
					value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisode());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getEpisode();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisode().getBoId());
			}
		}
		domainObject.setEpisode(value3);
		ims.core.admin.domain.objects.CareContext value4 = null;
		if ( null != valueObject.getAttendance() ) 
		{
			if (valueObject.getAttendance().getBoId() == null)
			{
				if (domMap.get(valueObject.getAttendance()) != null)
				{
					value4 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getAttendance());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getAttendance();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getAttendance().getBoId());
			}
		}
		domainObject.setAttendance(value4);
		domainObject.setPrescriptionPrintHistory(ims.emergency.vo.domain.PrescriptionPrintDetailsVoAssembler.extractPrescriptionPrintDetailsList(domainFactory, valueObject.getPrescriptionPrintHistory(), domainObject.getPrescriptionPrintHistory(), domMap));		

		return domainObject;
	}

}
