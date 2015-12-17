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
// This code was generated by John MacEnri using IMS Development Environment (version 1.20 build 40816.1400)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.nursing.domain.impl;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.vo.CareContextShortVo;
import ims.core.vo.ClinicalNotesVoCollection;
import ims.core.vo.Hcp;
import ims.core.vo.HcpCollection;
import ims.core.vo.HcpFilter;
import ims.core.vo.domain.ClinicalNotesVoAssembler;
import ims.core.vo.lookups.HcpDisType;
import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.SortOrder;

import java.util.ArrayList;
import java.util.List;

public class ContactViewImpl extends DomainImpl implements ims.nursing.domain.ContactView, ims.domain.impl.Transactional
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	* List all the Hcps
	*/
	public HcpCollection listHcps(HcpFilter filter)
	{
		HcpAdmin hcpAdmin = (HcpAdmin)getDomainImpl(HcpAdminImpl.class);
		return hcpAdmin.listHCPs(filter);
	}

	public ClinicalNotesVoCollection listContacts(Hcp hcpFilterVo, HcpDisType disciplineFilterVo, CareContextShortVo careContextShortVo, Boolean activeOnly) 
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" ");
		String query = "from ClinicalNotes cn ";
		String andStr = " ";

		ArrayList<String> markerNames = new ArrayList<String>();
		ArrayList<Object> markerValues = new ArrayList<Object>();

		if (hcpFilterVo != null) 
		{
			hql.append(" cn.authoringInformation.authoringHcp.id = :authoringHCP ");
			markerNames.add("authoringHCP");
			markerValues.add(hcpFilterVo.getID_Hcp());
			andStr = " and ";
		} 
	
		if (disciplineFilterVo != null) 
		{
			hql.append(andStr + " cn.discipline = :discipline");
			markerNames.add("discipline");
			markerValues.add(getDomLookup(disciplineFilterVo));
			andStr = " and ";
		}

		if (careContextShortVo != null)
		{
			hql.append(andStr + " cn.careContext.id = :rcc");
			markerNames.add("rcc");
			markerValues.add(careContextShortVo.getID_CareContext());
			andStr = " and ";
		}
		if (activeOnly != null && activeOnly)
		{
			hql.append(andStr + " cn.isCorrected <> 1");
			andStr = " and ";
		}

		if(markerNames.size()>0) query += " where ";
		query += hql.toString();							
		List<?> clinicalNotes = factory.find(query, markerNames, markerValues);
		
		return ClinicalNotesVoAssembler.createClinicalNotesVoCollectionFromClinicalNotes(clinicalNotes).sort(SortOrder.DESCENDING);
	}
}