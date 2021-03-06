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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class AppNavFormVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.AppNavFormVo copy(ims.admin.vo.AppNavFormVo valueObjectDest, ims.admin.vo.AppNavFormVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AppNavForm(valueObjectSrc.getID_AppNavForm());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// NodeText
		valueObjectDest.setNodeText(valueObjectSrc.getNodeText());
		// Form
		valueObjectDest.setForm(valueObjectSrc.getForm());
		// IsReadOnly
		valueObjectDest.setIsReadOnly(valueObjectSrc.getIsReadOnly());
		// AccessForRip
		valueObjectDest.setAccessForRip(valueObjectSrc.getAccessForRip());
		// AccessForEpisEnd
		valueObjectDest.setAccessForEpisEnd(valueObjectSrc.getAccessForEpisEnd());
		// PosIndex
		valueObjectDest.setPosIndex(valueObjectSrc.getPosIndex());
		// LinkedClasses
		valueObjectDest.setLinkedClasses(valueObjectSrc.getLinkedClasses());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppNavFormVoCollectionFromAppNavForm(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.AppNavForm objects.
	 */
	public static ims.admin.vo.AppNavFormVoCollection createAppNavFormVoCollectionFromAppNavForm(java.util.Set domainObjectSet)	
	{
		return createAppNavFormVoCollectionFromAppNavForm(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.AppNavForm objects.
	 */
	public static ims.admin.vo.AppNavFormVoCollection createAppNavFormVoCollectionFromAppNavForm(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.AppNavFormVoCollection voList = new ims.admin.vo.AppNavFormVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.AppNavForm domainObject = (ims.core.configuration.domain.objects.AppNavForm) iterator.next();
			ims.admin.vo.AppNavFormVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.AppNavForm objects.
	 */
	public static ims.admin.vo.AppNavFormVoCollection createAppNavFormVoCollectionFromAppNavForm(java.util.List domainObjectList) 
	{
		return createAppNavFormVoCollectionFromAppNavForm(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.AppNavForm objects.
	 */
	public static ims.admin.vo.AppNavFormVoCollection createAppNavFormVoCollectionFromAppNavForm(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.AppNavFormVoCollection voList = new ims.admin.vo.AppNavFormVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.AppNavForm domainObject = (ims.core.configuration.domain.objects.AppNavForm) domainObjectList.get(i);
			ims.admin.vo.AppNavFormVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.AppNavForm set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAppNavFormSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppNavFormVoCollection voCollection) 
	 {
	 	return extractAppNavFormSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppNavFormSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppNavFormVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppNavFormVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.AppNavForm domainObject = AppNavFormVoAssembler.extractAppNavForm(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.AppNavForm list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAppNavFormList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppNavFormVoCollection voCollection) 
	 {
	 	return extractAppNavFormList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppNavFormList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppNavFormVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppNavFormVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.AppNavForm domainObject = AppNavFormVoAssembler.extractAppNavForm(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.AppNavForm object.
	 * @param domainObject ims.core.configuration.domain.objects.AppNavForm
	 */
	 public static ims.admin.vo.AppNavFormVo create(ims.core.configuration.domain.objects.AppNavForm domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.AppNavForm object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.AppNavFormVo create(DomainObjectMap map, ims.core.configuration.domain.objects.AppNavForm domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.AppNavFormVo valueObject = (ims.admin.vo.AppNavFormVo) map.getValueObject(domainObject, ims.admin.vo.AppNavFormVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.AppNavFormVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.AppNavForm
	 */
	 public static ims.admin.vo.AppNavFormVo insert(ims.admin.vo.AppNavFormVo valueObject, ims.core.configuration.domain.objects.AppNavForm domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.AppNavForm
	 */
	 public static ims.admin.vo.AppNavFormVo insert(DomainObjectMap map, ims.admin.vo.AppNavFormVo valueObject, ims.core.configuration.domain.objects.AppNavForm domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AppNavForm(domainObject.getId());
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
			
		// NodeText
		valueObject.setNodeText(domainObject.getNodeText());
		// Form
		valueObject.setForm(ims.admin.vo.domain.AppFormVoAssembler.create(map, domainObject.getForm()) );
		// IsReadOnly
		valueObject.setIsReadOnly( domainObject.isIsReadOnly() );
		// AccessForRip
		ims.domain.lookups.LookupInstance instance4 = domainObject.getAccessForRip();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.admin.vo.lookups.FormReadWrite voLookup4 = new ims.admin.vo.lookups.FormReadWrite(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.admin.vo.lookups.FormReadWrite parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.admin.vo.lookups.FormReadWrite(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setAccessForRip(voLookup4);
		}
				// AccessForEpisEnd
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAccessForEpisEnd();
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

			ims.admin.vo.lookups.FormReadWrite voLookup5 = new ims.admin.vo.lookups.FormReadWrite(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.admin.vo.lookups.FormReadWrite parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.admin.vo.lookups.FormReadWrite(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAccessForEpisEnd(voLookup5);
		}
				// PosIndex
		valueObject.setPosIndex(domainObject.getPosIndex());
		// LinkedClasses
		valueObject.setLinkedClasses(ims.core.vo.domain.GenericIdentifierVoAssembler.createGenericIdentifierVoCollectionFromGenericIdentifier(map, domainObject.getLinkedClasses()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.AppNavForm extractAppNavForm(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppNavFormVo valueObject) 
	{
		return 	extractAppNavForm(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.AppNavForm extractAppNavForm(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppNavFormVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AppNavForm();
		ims.core.configuration.domain.objects.AppNavForm domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.AppNavForm)domMap.get(valueObject);
			}
			// ims.admin.vo.AppNavFormVo ID_AppNavForm field is unknown
			domainObject = new ims.core.configuration.domain.objects.AppNavForm();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AppNavForm());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.AppNavForm)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.AppNavForm) domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppNavForm.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AppNavForm());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNodeText() != null && valueObject.getNodeText().equals(""))
		{
			valueObject.setNodeText(null);
		}
		domainObject.setNodeText(valueObject.getNodeText());
		domainObject.setForm(ims.admin.vo.domain.AppFormVoAssembler.extractAppForm(domainFactory, valueObject.getForm(), domMap));
		domainObject.setIsReadOnly(valueObject.getIsReadOnly());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getAccessForRip() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getAccessForRip().getID());
		}
		domainObject.setAccessForRip(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAccessForEpisEnd() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAccessForEpisEnd().getID());
		}
		domainObject.setAccessForEpisEnd(value5);
		domainObject.setPosIndex(valueObject.getPosIndex());
		domainObject.setLinkedClasses(ims.core.vo.domain.GenericIdentifierVoAssembler.extractGenericIdentifierList(domainFactory, valueObject.getLinkedClasses(), domainObject.getLinkedClasses(), domMap));		

		return domainObject;
	}

}
