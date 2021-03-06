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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.62 build 3040.26452)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.pci.domain.impl;

import ims.core.resource.place.domain.objects.Townland;
import ims.core.resource.place.vo.TownlandRefVo;
import ims.core.vo.DEDLiteVo;
import ims.core.vo.DEDLiteVoCollection;
import ims.core.vo.TownlandShortVoCollection;
import ims.core.vo.TownlandVo;
import ims.core.vo.domain.DEDLiteVoAssembler;
import ims.core.vo.domain.TownlandShortVoAssembler;
import ims.core.vo.domain.TownlandVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.ntpf.vo.lookups.County;
import ims.pci.domain.base.impl.BaseTownlandAdminImpl;

import java.util.ArrayList;

public class TownlandAdminImpl extends BaseTownlandAdminImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.TownlandVo save(ims.core.vo.TownlandVo townland) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if(!townland.isValidated())
			throw new DomainRuntimeException("TownlandVo Not Validated.");
		
		try
		{
			DomainFactory factory = getDomainFactory();
			Townland doTownland = TownlandVoAssembler.extractTownland(factory, townland);
			
			factory.save(doTownland);
			
			return TownlandVoAssembler.create(doTownland);
		}
		catch (UnqViolationUncheckedException e)
		{
			throw new UniqueKeyViolationException("Townland already exists in the system or another townland with the same taxonomy mappings exist.", e);
		}
	}

	public TownlandVo get(TownlandRefVo townlandRef)
	{
		if(townlandRef == null || townlandRef.getID_Townland() == null)
			throw new DomainRuntimeException("Townland not provided for get call. ");
		
		DomainFactory factory = getDomainFactory();
		
		Townland doTownland = (Townland) factory.getDomainObject(Townland.class, townlandRef.getID_Townland());
		
		return TownlandVoAssembler.create(doTownland);
	}

	public TownlandShortVoCollection list(String townland, DEDLiteVo ded, County county, Boolean active) 
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer();
		String query = "from Townland t ";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		
		if(townland != null)
		{
			if(markers.size() > 0)
				hql.append(" and ");
			
			hql.append("t.upperName like :townlandName");
			markers.add("townlandName");
			values.add(townland.toUpperCase() + "%");
		}
		
		if(ded != null && ded.getID_DEDIsNotNull())
		{
			if(markers.size() > 0)
				hql.append(" and ");
			
			hql.append("t.dED.id = :ded");
			markers.add("ded");
			values.add(ded.getID_DED());
		}
		
		if(county != null)
		{
			if(markers.size() > 0)
				hql.append(" and ");
			
			hql.append(" t.county.id = :county");
			markers.add("county");
			values.add(county.getID());
		}
		
		if(active != null && active == true)
		{
			if(markers.size() > 0)
				hql.append(" and ");
			
			hql.append(" t.isActive= :active");
			markers.add("active");
			values.add(active);
		}
		
		if (markers.size() > 0)
			query += " where ";
		query += hql.toString();

		return TownlandShortVoAssembler.createTownlandShortVoCollectionFromTownland(factory.find(query, markers, values));
	}

	// WDEV-12657 - Updated function: added parameter to control whether inactive records should be listed
	public DEDLiteVoCollection listDEDs(String searchText, Boolean listInactive) 
	{
		if(searchText == null || (searchText != null && searchText.trim().length() == 0))
			throw new DomainRuntimeException("String for search is null.");
		
		String DEDLite = searchText != null ? searchText.toUpperCase() + "%" : "%%";
		
		StringBuffer hql = new StringBuffer();
		hql.append(" from DED ded");
		hql.append(" where ded.upperName like :dedName");
		
		// WDEV-12657 - Update query to list only active records
		if (!listInactive)
			hql.append(" and ded.isActive = 1");
		
		return DEDLiteVoAssembler.createDEDLiteVoCollectionFromDED(getDomainFactory().find(hql.toString(), new String []{"dedName"}, new Object []{DEDLite}));
	}
}
