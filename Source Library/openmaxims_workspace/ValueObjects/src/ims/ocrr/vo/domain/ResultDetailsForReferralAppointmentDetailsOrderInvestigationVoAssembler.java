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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo copy(ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo valueObjectDest, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ResultDetails(valueObjectSrc.getID_ResultDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DocumentResultDetails
		valueObjectDest.setDocumentResultDetails(valueObjectSrc.getDocumentResultDetails());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// ClinicalResultDetails
		valueObjectDest.setClinicalResultDetails(valueObjectSrc.getClinicalResultDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollectionFromResultDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection createResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollectionFromResultDetails(java.util.Set domainObjectSet)	
	{
		return createResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollectionFromResultDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection createResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollectionFromResultDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection voList = new ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = (ims.ocrr.orderingresults.domain.objects.ResultDetails) iterator.next();
			ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection createResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollectionFromResultDetails(java.util.List domainObjectList) 
	{
		return createResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollectionFromResultDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.ResultDetails objects.
	 */
	public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection createResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollectionFromResultDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection voList = new ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = (ims.ocrr.orderingresults.domain.objects.ResultDetails) domainObjectList.get(i);
			ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ResultDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractResultDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection voCollection) 
	 {
	 	return extractResultDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractResultDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoAssembler.extractResultDetails(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.ResultDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractResultDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection voCollection) 
	 {
	 	return extractResultDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractResultDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = ResultDetailsForReferralAppointmentDetailsOrderInvestigationVoAssembler.extractResultDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ResultDetails object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultDetails
	 */
	 public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo create(ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.ResultDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo valueObject = (ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo) map.getValueObject(domainObject, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultDetails
	 */
	 public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo insert(ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.ResultDetails
	 */
	 public static ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo insert(DomainObjectMap map, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo valueObject, ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ResultDetails(domainObject.getId());
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
			
		// DocumentResultDetails
		valueObject.setDocumentResultDetails(ims.core.vo.domain.PatientDocumentVoAssembler.create(map, domainObject.getDocumentResultDetails()) );
		// Type
		ims.domain.lookups.LookupInstance instance2 = domainObject.getType();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.ResultDetailsType voLookup2 = new ims.ocrr.vo.lookups.ResultDetailsType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultDetailsType parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.ocrr.vo.lookups.ResultDetailsType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setType(voLookup2);
		}
				// ClinicalResultDetails
		valueObject.setClinicalResultDetails(ims.ocrr.vo.domain.ClinicalResultDetailsLightVoAssembler.create(map, domainObject.getClinicalResultDetails()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.ResultDetails extractResultDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo valueObject) 
	{
		return 	extractResultDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.ResultDetails extractResultDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ResultDetails();
		ims.ocrr.orderingresults.domain.objects.ResultDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ResultDetails)domMap.get(valueObject);
			}
			// ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo ID_ResultDetails field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.ResultDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ResultDetails());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.ResultDetails)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.ResultDetails) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.ResultDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ResultDetails());

		domainObject.setDocumentResultDetails(ims.core.vo.domain.PatientDocumentVoAssembler.extractPatientDocument(domainFactory, valueObject.getDocumentResultDetails(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value2);
		domainObject.setClinicalResultDetails(ims.ocrr.vo.domain.ClinicalResultDetailsLightVoAssembler.extractClinicalResultDetail(domainFactory, valueObject.getClinicalResultDetails(), domMap));

		return domainObject;
	}

}
