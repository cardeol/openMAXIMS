/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class ConsultationOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ConsultationOutcomeVo copy(ims.RefMan.vo.ConsultationOutcomeVo valueObjectDest, ims.RefMan.vo.ConsultationOutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ConsultationOutcome(valueObjectSrc.getID_ConsultationOutcome());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// FurtherManagement
		valueObjectDest.setFurtherManagement(valueObjectSrc.getFurtherManagement());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// DischargeType
		valueObjectDest.setDischargeType(valueObjectSrc.getDischargeType());
		// FollowupType
		valueObjectDest.setFollowupType(valueObjectSrc.getFollowupType());
		// DischargeMethod
		valueObjectDest.setDischargeMethod(valueObjectSrc.getDischargeMethod());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createConsultationOutcomeVoCollectionFromConsultationOutcome(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ConsultationOutcome objects.
	 */
	public static ims.RefMan.vo.ConsultationOutcomeVoCollection createConsultationOutcomeVoCollectionFromConsultationOutcome(java.util.Set domainObjectSet)	
	{
		return createConsultationOutcomeVoCollectionFromConsultationOutcome(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ConsultationOutcome objects.
	 */
	public static ims.RefMan.vo.ConsultationOutcomeVoCollection createConsultationOutcomeVoCollectionFromConsultationOutcome(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ConsultationOutcomeVoCollection voList = new ims.RefMan.vo.ConsultationOutcomeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ConsultationOutcome domainObject = (ims.RefMan.domain.objects.ConsultationOutcome) iterator.next();
			ims.RefMan.vo.ConsultationOutcomeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ConsultationOutcome objects.
	 */
	public static ims.RefMan.vo.ConsultationOutcomeVoCollection createConsultationOutcomeVoCollectionFromConsultationOutcome(java.util.List domainObjectList) 
	{
		return createConsultationOutcomeVoCollectionFromConsultationOutcome(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ConsultationOutcome objects.
	 */
	public static ims.RefMan.vo.ConsultationOutcomeVoCollection createConsultationOutcomeVoCollectionFromConsultationOutcome(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ConsultationOutcomeVoCollection voList = new ims.RefMan.vo.ConsultationOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ConsultationOutcome domainObject = (ims.RefMan.domain.objects.ConsultationOutcome) domainObjectList.get(i);
			ims.RefMan.vo.ConsultationOutcomeVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ConsultationOutcome set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractConsultationOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultationOutcomeVoCollection voCollection) 
	 {
	 	return extractConsultationOutcomeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractConsultationOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultationOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ConsultationOutcomeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ConsultationOutcome domainObject = ConsultationOutcomeVoAssembler.extractConsultationOutcome(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ConsultationOutcome list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractConsultationOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultationOutcomeVoCollection voCollection) 
	 {
	 	return extractConsultationOutcomeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractConsultationOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultationOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ConsultationOutcomeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ConsultationOutcome domainObject = ConsultationOutcomeVoAssembler.extractConsultationOutcome(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ConsultationOutcome object.
	 * @param domainObject ims.RefMan.domain.objects.ConsultationOutcome
	 */
	 public static ims.RefMan.vo.ConsultationOutcomeVo create(ims.RefMan.domain.objects.ConsultationOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ConsultationOutcome object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ConsultationOutcomeVo create(DomainObjectMap map, ims.RefMan.domain.objects.ConsultationOutcome domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ConsultationOutcomeVo valueObject = (ims.RefMan.vo.ConsultationOutcomeVo) map.getValueObject(domainObject, ims.RefMan.vo.ConsultationOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ConsultationOutcomeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ConsultationOutcome
	 */
	 public static ims.RefMan.vo.ConsultationOutcomeVo insert(ims.RefMan.vo.ConsultationOutcomeVo valueObject, ims.RefMan.domain.objects.ConsultationOutcome domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ConsultationOutcome
	 */
	 public static ims.RefMan.vo.ConsultationOutcomeVo insert(DomainObjectMap map, ims.RefMan.vo.ConsultationOutcomeVo valueObject, ims.RefMan.domain.objects.ConsultationOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ConsultationOutcome(domainObject.getId());
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
			
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
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
		// FurtherManagement
		valueObject.setFurtherManagement(domainObject.getFurtherManagement());
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// DischargeType
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDischargeType();
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

			ims.RefMan.vo.lookups.ConsultationOutcomeType voLookup6 = new ims.RefMan.vo.lookups.ConsultationOutcomeType(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ConsultationOutcomeType parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.RefMan.vo.lookups.ConsultationOutcomeType(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDischargeType(voLookup6);
		}
				// FollowupType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getFollowupType();
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

			ims.RefMan.vo.lookups.FollowupManagementType voLookup7 = new ims.RefMan.vo.lookups.FollowupManagementType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.RefMan.vo.lookups.FollowupManagementType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.RefMan.vo.lookups.FollowupManagementType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setFollowupType(voLookup7);
		}
				// DischargeMethod
		ims.domain.lookups.LookupInstance instance8 = domainObject.getDischargeMethod();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.DischargeMethod voLookup8 = new ims.core.vo.lookups.DischargeMethod(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.DischargeMethod parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.DischargeMethod(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setDischargeMethod(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ConsultationOutcome extractConsultationOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultationOutcomeVo valueObject) 
	{
		return 	extractConsultationOutcome(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ConsultationOutcome extractConsultationOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ConsultationOutcomeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ConsultationOutcome();
		ims.RefMan.domain.objects.ConsultationOutcome domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ConsultationOutcome)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ConsultationOutcomeVo ID_ConsultationOutcome field is unknown
			domainObject = new ims.RefMan.domain.objects.ConsultationOutcome();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ConsultationOutcome());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ConsultationOutcome)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ConsultationOutcome) domainFactory.getDomainObject(ims.RefMan.domain.objects.ConsultationOutcome.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ConsultationOutcome());

		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.core.patient.domain.objects.Patient value2 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value2 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getPatient();	
			}
			else
			{
				value2 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value2);
		ims.core.admin.domain.objects.CareContext value3 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value3 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getCareContext();	
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFurtherManagement() != null && valueObject.getFurtherManagement().equals(""))
		{
			valueObject.setFurtherManagement(null);
		}
		domainObject.setFurtherManagement(valueObject.getFurtherManagement());
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDischargeDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDischargeDate(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDischargeType() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDischargeType().getID());
		}
		domainObject.setDischargeType(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getFollowupType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getFollowupType().getID());
		}
		domainObject.setFollowupType(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getDischargeMethod() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getDischargeMethod().getID());
		}
		domainObject.setDischargeMethod(value8);

		return domainObject;
	}

}
