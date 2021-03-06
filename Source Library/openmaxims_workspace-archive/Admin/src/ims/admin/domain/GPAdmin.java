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
public interface GPAdmin extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Save a GP
	*/
	public ims.core.vo.GP saveGp(ims.core.vo.GP gp) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Get a GP by ID
	*/
	public ims.core.vo.GP getGP(Integer id);

	// Generated from form domain interface definition
	/**
	* Get's a GP by an external type - supplied the taxonomy type and the external code
	*/
	public ims.core.vo.GP getGPByTaxonomyType(String extId, ims.core.vo.lookups.TaxonomyType taxonomyType);

	// Generated from form domain interface definition
	public ims.core.vo.GpShortVoCollection listGPsBySurname(String surname);
}
