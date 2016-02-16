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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.admin.domain;

// Generated from form domain impl
public interface LookupTree extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Causes the Hibernate cache for the Lookup Type Id passed in to be refreshed, and will also cause the Global type safe lookup collection cache in LookupServiceImpl to be refreshed.
	*/
	public void refreshCache(ims.vo.LookupTypeVo type);

	// Generated from form domain interface definition
	/**
	* Return collection of Lookup Instances based on type id
	*/
	public ims.vo.LookupInstanceCollection getLookupInstances(ims.vo.LookupTypeVo type);

	// Generated from form domain interface definition
	/**
	* Add/Save a Lookup Instance
	*/
	public ims.vo.LookupInstanceCollection saveLookupInstance(ims.vo.LookupTypeVo type, ims.vo.LookupInstVo instance) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Return mappings for a Lookup Instance
	*/
	public ims.vo.LookupInstVo getMappings(ims.vo.LookupInstVo instance);

	// Generated from form domain interface definition
	/**
	* Gets the Lookup types used by a form
	*/
	public ims.admin.vo.FormLookupVoCollection getFormLookups(ims.core.configuration.vo.AppFormRefVo formRef);

	// Generated from form domain interface definition
	public ims.vo.LookupInstVo deactivateInstance(ims.vo.LookupTypeVo type, ims.vo.LookupInstVo voInstance) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Saves the order of instances within a type
	*/
	public ims.vo.LookupInstanceCollection saveInstanceOrder(ims.vo.LookupTypeVo type, ims.vo.LookupInstanceCollection instances) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* saveLookupType
	*/
	public ims.vo.LookupTypeVo saveLookupType(ims.vo.LookupTypeVo typeVo) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public void saveDefaultInstance(ims.core.configuration.vo.AppFormRefVo formId, ims.admin.vo.FormLookupVo defInst) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.admin.vo.AppFormVoCollection listForms(String nameFilter);

	// Generated from form domain interface definition
	public ims.vo.LookupTypeVoCollection getTypes(String filter, Boolean activeOnly, Boolean userTypesOnly, Boolean systemTypes);

	// Generated from form domain interface definition
	/**
	* processes and save lookup instance data from HL7 interface
	*/
	public void saveInstanceDataFromHL7(ims.core.vo.IfLookupVo lookupData) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;
}