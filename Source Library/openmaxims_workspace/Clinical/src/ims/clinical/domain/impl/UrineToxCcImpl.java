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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4680.16533)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.clinical.domain.impl;

import ims.clinical.domain.base.impl.BaseUrineToxCcImpl;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.emergency.domain.objects.DrugToxicology;
import ims.emergency.domain.objects.DrugToxicologyItem;
import ims.emergency.vo.DrugToxicologyItemRefVo;
import ims.emergency.vo.DrugToxicologyItemVo;
import ims.emergency.vo.DrugToxicologyRefVo;
import ims.emergency.vo.DrugToxicologyVo;
import ims.emergency.vo.domain.DrugToxicologyItemVoAssembler;
import ims.emergency.vo.domain.DrugToxicologyVoAssembler;
import ims.framework.exceptions.CodingRuntimeException;

import java.util.List;

public class UrineToxCcImpl extends BaseUrineToxCcImpl
{

	private static final long serialVersionUID = 1L;

	public DrugToxicologyVo getDrugToxicology(ims.core.admin.vo.CareContextRefVo careContextRef)
	{
		if (careContextRef == null || careContextRef.getID_CareContext() == null)
		{
			throw new CodingRuntimeException("Cannot get Urinalysis on null Id for CareContext ");
		}

		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer();
		hql.append("from DrugToxicology as drugTox where drugTox.careContext.id = :careContextID ");

		List<?> list = factory.find(hql.toString(), new String[] { "careContextID" }, new Object[] { careContextRef.getID_CareContext() });

		if (list == null || list.size() == 0)
			return null;

		return DrugToxicologyVoAssembler.create((DrugToxicology) list.get(0));

	}

	public DrugToxicologyItemVo saveItem(DrugToxicologyItemVo drugToxicologyItemToSave) throws ims.domain.exceptions.StaleObjectException
	{
		if (drugToxicologyItemToSave == null)
			throw new CodingRuntimeException("Cannot save null DrugToxicologyItem ");

		if (!drugToxicologyItemToSave.isValidated())
			throw new DomainRuntimeException("DrugToxicologyItem Not Validated.");

		DomainFactory factory = getDomainFactory();
		DrugToxicologyItem domainDrugToxicologyItem = DrugToxicologyItemVoAssembler.extractDrugToxicologyItem(factory, drugToxicologyItemToSave);

		factory.save(domainDrugToxicologyItem);

		return DrugToxicologyItemVoAssembler.create(domainDrugToxicologyItem);
	}

	public DrugToxicologyVo save(DrugToxicologyVo drugToxicologyToSave) throws ims.domain.exceptions.StaleObjectException
	{
		if (drugToxicologyToSave == null)
			throw new CodingRuntimeException("Cannot save null DrugToxicology ");

		if (!drugToxicologyToSave.isValidated())
			throw new DomainRuntimeException("DrugToxicology Not Validated.");

		DomainFactory factory = getDomainFactory();
		DrugToxicology domainDrugToxicology = DrugToxicologyVoAssembler.extractDrugToxicology(factory, drugToxicologyToSave);

		factory.save(domainDrugToxicology);

		return DrugToxicologyVoAssembler.create(domainDrugToxicology);
	}

	public DrugToxicologyItemVo getDrugToxicologyItem(DrugToxicologyItemRefVo drugToxicologyItemRef)
	{
		if (drugToxicologyItemRef == null || drugToxicologyItemRef.getID_DrugToxicologyItem() == null)
		{
			throw new CodingRuntimeException("Cannot get DrugToxicologyItem on null Id ");
		}

		DomainFactory factory = getDomainFactory();

		DrugToxicologyItem domainDrugToxicologyItem = (DrugToxicologyItem) factory.getDomainObject(DrugToxicologyItem.class, drugToxicologyItemRef.getID_DrugToxicologyItem());

		return DrugToxicologyItemVoAssembler.create(domainDrugToxicologyItem);
	}

	public Boolean isStale(DrugToxicologyItemRefVo drugToxicologyRef)
	{
		if(drugToxicologyRef == null)
			return false;
		
		DomainFactory factory = getDomainFactory();
		List<?> appts = factory.find("select drugToxItem.id from DrugToxicologyItem as drugToxItem where drugToxItem.id = :drugToxItemId and drugToxItem.version > :drugToxItemVersion", new String[] {"drugToxItemId", "drugToxItemVersion"}, new Object[] {drugToxicologyRef.getID_DrugToxicologyItem(), drugToxicologyRef.getVersion_DrugToxicologyItem()});
		
		if(appts != null && appts.size() > 0)
			return true;
		
		return false;
	}

	public DrugToxicologyVo getDrugToxicology(DrugToxicologyRefVo drugToxicologyRef)
	{
		if (drugToxicologyRef == null || drugToxicologyRef.getID_DrugToxicology() == null)
		{
			throw new CodingRuntimeException("Cannot get DrugToxicology on null Id ");
		}

		DomainFactory factory = getDomainFactory();

		DrugToxicology domainDrugToxicology = (DrugToxicology) factory.getDomainObject(DrugToxicology.class, drugToxicologyRef.getID_DrugToxicology());

		return DrugToxicologyVoAssembler.create(domainDrugToxicology);
	}
}
