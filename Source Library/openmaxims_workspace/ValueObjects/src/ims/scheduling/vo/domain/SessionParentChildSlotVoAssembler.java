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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class SessionParentChildSlotVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionParentChildSlotVo copy(ims.scheduling.vo.SessionParentChildSlotVo valueObjectDest, ims.scheduling.vo.SessionParentChildSlotVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SessionParentChildSlot(valueObjectSrc.getID_SessionParentChildSlot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartTime
		valueObjectDest.setStartTime(valueObjectSrc.getStartTime());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// profileSlot
		valueObjectDest.setProfileSlot(valueObjectSrc.getProfileSlot());
		// sessDateTime
		valueObjectDest.setSessDateTime(valueObjectSrc.getSessDateTime());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// StatusReason
		valueObjectDest.setStatusReason(valueObjectSrc.getStatusReason());
		// StatusReasonHistory
		valueObjectDest.setStatusReasonHistory(valueObjectSrc.getStatusReasonHistory());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// ParentSlot
		valueObjectDest.setParentSlot(valueObjectSrc.getParentSlot());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// CancelBlockReason
		valueObjectDest.setCancelBlockReason(valueObjectSrc.getCancelBlockReason());
		// CancelBlockComment
		valueObjectDest.setCancelBlockComment(valueObjectSrc.getCancelBlockComment());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// SlotResp
		valueObjectDest.setSlotResp(valueObjectSrc.getSlotResp());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionParentChildSlot objects.
	 */
	public static ims.scheduling.vo.SessionParentChildSlotVoCollection createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(java.util.Set domainObjectSet)	
	{
		return createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionParentChildSlot objects.
	 */
	public static ims.scheduling.vo.SessionParentChildSlotVoCollection createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionParentChildSlotVoCollection voList = new ims.scheduling.vo.SessionParentChildSlotVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.SessionParentChildSlot domainObject = (ims.scheduling.domain.objects.SessionParentChildSlot) iterator.next();
			ims.scheduling.vo.SessionParentChildSlotVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionParentChildSlot objects.
	 */
	public static ims.scheduling.vo.SessionParentChildSlotVoCollection createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(java.util.List domainObjectList) 
	{
		return createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionParentChildSlot objects.
	 */
	public static ims.scheduling.vo.SessionParentChildSlotVoCollection createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionParentChildSlotVoCollection voList = new ims.scheduling.vo.SessionParentChildSlotVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.SessionParentChildSlot domainObject = (ims.scheduling.domain.objects.SessionParentChildSlot) domainObjectList.get(i);
			ims.scheduling.vo.SessionParentChildSlotVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.SessionParentChildSlot set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSessionParentChildSlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionParentChildSlotVoCollection voCollection) 
	 {
	 	return extractSessionParentChildSlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSessionParentChildSlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionParentChildSlotVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionParentChildSlotVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionParentChildSlot domainObject = SessionParentChildSlotVoAssembler.extractSessionParentChildSlot(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.SessionParentChildSlot list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSessionParentChildSlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionParentChildSlotVoCollection voCollection) 
	 {
	 	return extractSessionParentChildSlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSessionParentChildSlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionParentChildSlotVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionParentChildSlotVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionParentChildSlot domainObject = SessionParentChildSlotVoAssembler.extractSessionParentChildSlot(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.SessionParentChildSlot object.
	 * @param domainObject ims.scheduling.domain.objects.SessionParentChildSlot
	 */
	 public static ims.scheduling.vo.SessionParentChildSlotVo create(ims.scheduling.domain.objects.SessionParentChildSlot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.SessionParentChildSlot object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.SessionParentChildSlotVo create(DomainObjectMap map, ims.scheduling.domain.objects.SessionParentChildSlot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionParentChildSlotVo valueObject = (ims.scheduling.vo.SessionParentChildSlotVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionParentChildSlotVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionParentChildSlotVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.SessionParentChildSlot
	 */
	 public static ims.scheduling.vo.SessionParentChildSlotVo insert(ims.scheduling.vo.SessionParentChildSlotVo valueObject, ims.scheduling.domain.objects.SessionParentChildSlot domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.SessionParentChildSlot
	 */
	 public static ims.scheduling.vo.SessionParentChildSlotVo insert(DomainObjectMap map, ims.scheduling.vo.SessionParentChildSlotVo valueObject, ims.scheduling.domain.objects.SessionParentChildSlot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SessionParentChildSlot(domainObject.getId());
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
			
		// StartTime
		String StartTime = domainObject.getStartTime();
		if ( null != StartTime ) 
		{
			valueObject.setStartTime(new ims.framework.utils.Time(StartTime) );
		}
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// profileSlot
		if (domainObject.getProfileSlot() != null)
		{
			if(domainObject.getProfileSlot() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProfileSlot();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProfileSlot(new ims.scheduling.vo.ProfileParentChildSlotRefVo(id, -1));				
			}
			else
			{
				valueObject.setProfileSlot(new ims.scheduling.vo.ProfileParentChildSlotRefVo(domainObject.getProfileSlot().getId(), domainObject.getProfileSlot().getVersion()));
			}
		}
		// sessDateTime
		java.util.Date sessDateTime = domainObject.getSessDateTime();
		if ( null != sessDateTime ) 
		{
			valueObject.setSessDateTime(new ims.framework.utils.DateTime(sessDateTime) );
		}
		// Status
		ims.domain.lookups.LookupInstance instance5 = domainObject.getStatus();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Status_Reason voLookup5 = new ims.scheduling.vo.lookups.Status_Reason(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setStatus(voLookup5);
		}
				// Appointment
		valueObject.setAppointment(ims.scheduling.vo.domain.BookingAppointmentTheatreLiteVoAssembler.create(map, domainObject.getAppointment()) );
		// StatusReason
		ims.domain.lookups.LookupInstance instance7 = domainObject.getStatusReason();
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

			ims.scheduling.vo.lookups.Status_Reason voLookup7 = new ims.scheduling.vo.lookups.Status_Reason(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setStatusReason(voLookup7);
		}
				// StatusReasonHistory
		valueObject.setStatusReasonHistory(ims.scheduling.vo.domain.SessionSlotStatusVoAssembler.createSessionSlotStatusVoCollectionFromSessionSlotStatus(map, domainObject.getStatusReasonHistory()) );
		// Session
		if (domainObject.getSession() != null)
		{
			if(domainObject.getSession() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSession();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSession(new ims.scheduling.vo.Sch_SessionRefVo(id, -1));				
			}
			else
			{
				valueObject.setSession(new ims.scheduling.vo.Sch_SessionRefVo(domainObject.getSession().getId(), domainObject.getSession().getVersion()));
			}
		}
		// ParentSlot
		if (domainObject.getParentSlot() != null)
		{
			if(domainObject.getParentSlot() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getParentSlot();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setParentSlot(new ims.scheduling.vo.SessionParentChildSlotRefVo(id, -1));				
			}
			else
			{
				valueObject.setParentSlot(new ims.scheduling.vo.SessionParentChildSlotRefVo(domainObject.getParentSlot().getId(), domainObject.getParentSlot().getVersion()));
			}
		}
		// Duration
		valueObject.setDuration(domainObject.getDuration());
		// CancelBlockReason
		ims.domain.lookups.LookupInstance instance12 = domainObject.getCancelBlockReason();
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

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup12 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setCancelBlockReason(voLookup12);
		}
				// CancelBlockComment
		valueObject.setCancelBlockComment(domainObject.getCancelBlockComment());
		// Priority
		ims.domain.lookups.LookupInstance instance14 = domainObject.getPriority();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedulingPriority voLookup14 = new ims.scheduling.vo.lookups.SchedulingPriority(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedulingPriority parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.scheduling.vo.lookups.SchedulingPriority(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setPriority(voLookup14);
		}
				// SlotResp
		valueObject.setSlotResp(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.create(map, domainObject.getSlotResp()) );
		// Comment
		valueObject.setComment(domainObject.getComment());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.SessionParentChildSlot extractSessionParentChildSlot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionParentChildSlotVo valueObject) 
	{
		return 	extractSessionParentChildSlot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.SessionParentChildSlot extractSessionParentChildSlot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionParentChildSlotVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SessionParentChildSlot();
		ims.scheduling.domain.objects.SessionParentChildSlot domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.SessionParentChildSlot)domMap.get(valueObject);
			}
			// ims.scheduling.vo.SessionParentChildSlotVo ID_SessionParentChildSlot field is unknown
			domainObject = new ims.scheduling.domain.objects.SessionParentChildSlot();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SessionParentChildSlot());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.SessionParentChildSlot)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.SessionParentChildSlot) domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionParentChildSlot.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SessionParentChildSlot());

		ims.framework.utils.Time time1 = valueObject.getStartTime();
		String value1 = null;
		if ( time1 != null ) 
		{
			value1 = time1.toString();
		}
		domainObject.setStartTime(value1);
		domainObject.setIsActive(valueObject.getIsActive());
		ims.scheduling.domain.objects.ProfileParentChildSlot value3 = null;
		if ( null != valueObject.getProfileSlot() ) 
		{
			if (valueObject.getProfileSlot().getBoId() == null)
			{
				if (domMap.get(valueObject.getProfileSlot()) != null)
				{
					value3 = (ims.scheduling.domain.objects.ProfileParentChildSlot)domMap.get(valueObject.getProfileSlot());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getProfileSlot();	
			}
			else
			{
				value3 = (ims.scheduling.domain.objects.ProfileParentChildSlot)domainFactory.getDomainObject(ims.scheduling.domain.objects.ProfileParentChildSlot.class, valueObject.getProfileSlot().getBoId());
			}
		}
		domainObject.setProfileSlot(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getSessDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setSessDateTime(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value6 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value6 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else
			{
				value6 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getStatusReason() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getStatusReason().getID());
		}
		domainObject.setStatusReason(value7);
		domainObject.setStatusReasonHistory(ims.scheduling.vo.domain.SessionSlotStatusVoAssembler.extractSessionSlotStatusSet(domainFactory, valueObject.getStatusReasonHistory(), domainObject.getStatusReasonHistory(), domMap));		
		ims.scheduling.domain.objects.Sch_Session value9 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value9 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getSession();	
			}
			else
			{
				value9 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value9);
		ims.scheduling.domain.objects.SessionParentChildSlot value10 = null;
		if ( null != valueObject.getParentSlot() ) 
		{
			if (valueObject.getParentSlot().getBoId() == null)
			{
				if (domMap.get(valueObject.getParentSlot()) != null)
				{
					value10 = (ims.scheduling.domain.objects.SessionParentChildSlot)domMap.get(valueObject.getParentSlot());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getParentSlot();	
			}
			else
			{
				value10 = (ims.scheduling.domain.objects.SessionParentChildSlot)domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionParentChildSlot.class, valueObject.getParentSlot().getBoId());
			}
		}
		domainObject.setParentSlot(value10);
		domainObject.setDuration(valueObject.getDuration());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getCancelBlockReason() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getCancelBlockReason().getID());
		}
		domainObject.setCancelBlockReason(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCancelBlockComment() != null && valueObject.getCancelBlockComment().equals(""))
		{
			valueObject.setCancelBlockComment(null);
		}
		domainObject.setCancelBlockComment(valueObject.getCancelBlockComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value14);
		domainObject.setSlotResp(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.extractSession_ListOwner(domainFactory, valueObject.getSlotResp(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());

		return domainObject;
	}

}
