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
// This code was generated by Peter Martin using IMS Development Environment (version 1.42 build 2202.25904)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.therapies.domain.impl;

import java.util.ArrayList;
import java.util.List;
import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.admin.vo.ClinicalContactRefVo;
import ims.core.vo.Hcp;
import ims.core.vo.HcpCollection;
import ims.core.vo.HcpFilter;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.therapies.domain.TreatmentEquipmentConfig;
import ims.therapies.domain.base.impl.BasePneumaticImpl;
import ims.therapies.treatment.domain.objects.ElectrotherapyPneumatic;
import ims.therapies.treatment.vo.ElectrotherapyPneumaticRefVo;
import ims.therapies.vo.ElectrotherapyPneumaticShortVoCollection;
import ims.therapies.vo.ElectrotherapyPneumaticVo;
import ims.therapies.vo.ElectrotherapyPneumaticVoCollection;
import ims.therapies.vo.TreatmentEquipmentConfigVoCollection;
import ims.therapies.vo.domain.ElectrotherapyPneumaticShortVoAssembler;
import ims.therapies.vo.domain.ElectrotherapyPneumaticVoAssembler;
import ims.therapies.vo.lookups.TreatmentEquipmentTypeConfig;

public class PneumaticImpl extends BasePneumaticImpl
{
	public ElectrotherapyPneumaticVo saveElectrotherapyPneumaticTreatmentVo(ElectrotherapyPneumaticVo electrotherapyPneumaticTreatmentVo) throws StaleObjectException, UniqueKeyViolationException
	{
		if(electrotherapyPneumaticTreatmentVo == null)
			throw new CodingRuntimeException ("ElectrotherapyPneumaticVo is null");
		if (!electrotherapyPneumaticTreatmentVo.isValidated())
			throw new DomainRuntimeException ("This ElectrotherapyPneumaticVo has not been validated");
		
		DomainFactory factory = getDomainFactory();	
		
		if (electrotherapyPneumaticTreatmentVo.getID_ElectrotherapyPneumatic() == null)//Inserting a record
		{
			ElectrotherapyPneumaticVo vo = getElectrotheraphyPneumaticVoByClinicalContact(electrotherapyPneumaticTreatmentVo.getClinicalContact());
			if(vo != null)
				throw new UniqueKeyViolationException("The screen will be refreshed");
		}
		
		ElectrotherapyPneumatic domElectrotherapyPneumatic = ElectrotherapyPneumaticVoAssembler.extractElectrotherapyPneumatic(factory, electrotherapyPneumaticTreatmentVo);
		
		factory.save(domElectrotherapyPneumatic);
			
		return ElectrotherapyPneumaticVoAssembler.create(domElectrotherapyPneumatic);
	}

	public ElectrotherapyPneumaticShortVoCollection listElectrotheraphyPneumaticByCareContext(CareContextRefVo voCareContextRef)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" ");
		String query = "from ElectrotherapyPneumatic p ";
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
		String andStr = " ";
		
		if (voCareContextRef != null)
		{
			hql.append(andStr + " p.clinicalContact.careContext.id = :cc");
			markers.add("cc");
			values.add(voCareContextRef.getID_CareContext());			
			andStr = " and ";
		}
		
		if (markers.size() > 0) query += " where ";
		query += hql.toString();

		List pneumatics = factory.find(query, markers, values, 200);	
		return ElectrotherapyPneumaticShortVoAssembler.createElectrotherapyPneumaticShortVoCollectionFromElectrotherapyPneumatic(pneumatics).sort();
	}	
	
	public ElectrotherapyPneumaticVo getElectrotheraphyPneumaticVoByClinicalContact(ClinicalContactRefVo voClinicalContactRef) 
	{
		if(voClinicalContactRef == null)
			throw new CodingRuntimeException("ElectrotherapyPneumatic Filter not provided for get call. ");
		
		String hql = new String("from ElectrotherapyPneumatic p where p.clinicalContact.id = :CLINICAL_CONTACT_ID");

		java.util.List list = getDomainFactory().find(hql, "CLINICAL_CONTACT_ID", voClinicalContactRef.getID_ClinicalContact());

		ElectrotherapyPneumaticVoCollection coll = ElectrotherapyPneumaticVoAssembler.createElectrotherapyPneumaticVoCollectionFromElectrotherapyPneumatic(list);
		if(coll!=null && coll.size()>0)
			return coll.get(0);
		else
			return null;
	}
	
	public HcpCollection listHcps(Hcp filter) {
		HcpAdmin hcpAdmin = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		return hcpAdmin.listHCPs(filter);
	}

	public TreatmentEquipmentConfigVoCollection listTreatmentEquipmentConfigs(TreatmentEquipmentTypeConfig lkpTreatmentEquipmentConfig) {
		TreatmentEquipmentConfig impl = (TreatmentEquipmentConfig) getDomainImpl(TreatmentEquipmentConfigImpl.class);		
		return impl.list(lkpTreatmentEquipmentConfig);
	}

	public Hcp getHcp(Integer hcpId) {
		HcpAdmin hcpAdmin = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		HcpFilter  hcpFilter = new HcpFilter();
		hcpFilter.setID_Hcp(hcpId);
		return hcpAdmin.getHcp(hcpFilter);
	}

	//	WDEV-13588
	public ElectrotherapyPneumaticVo getElectrotheraphyPneumatic(ElectrotherapyPneumaticRefVo electrotherapyPneumatic)
	{
		if(electrotherapyPneumatic == null || electrotherapyPneumatic.getID_ElectrotherapyPneumatic() == null)
			throw new CodingRuntimeException("Cannot get ElectrotherapyPneumatic on null Id.");
		
		return ElectrotherapyPneumaticVoAssembler.create((ElectrotherapyPneumatic) getDomainFactory().getDomainObject(ElectrotherapyPneumatic.class, electrotherapyPneumatic.getID_ElectrotherapyPneumatic()));
	}
}
