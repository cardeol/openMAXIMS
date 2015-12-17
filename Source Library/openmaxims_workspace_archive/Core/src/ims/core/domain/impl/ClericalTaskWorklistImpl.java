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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4261.20360)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import ims.core.domain.base.impl.BaseClericalTaskWorklistImpl;
import ims.core.vo.ClericalTaskWorklistSearchVo;
import ims.core.vo.PatientClericalTaskVoCollection;
import ims.core.vo.domain.PatientClericalTaskVoAssembler;
import ims.domain.exceptions.DomainRuntimeException;
import ims.framework.utils.DateTime;
import ims.framework.utils.Time;

import java.util.ArrayList;
import java.util.List;

public class ClericalTaskWorklistImpl extends BaseClericalTaskWorklistImpl
{

	private static final long serialVersionUID = 1L;

	public PatientClericalTaskVoCollection listClericalTasks(ClericalTaskWorklistSearchVo searchCriteria) 
	{
			
		String hql="select patClericalTask from PatientClericalTask as patClericalTask left join patClericalTask.patient as patient left join patClericalTask.status as status left join patient.identifiers as identifiers left join identifiers.type as identifiersType ";
		StringBuilder hqlConditions = new StringBuilder(" where ( ");
		
		ArrayList <String> markers = new ArrayList<String>();
		ArrayList <Object> values = new ArrayList<Object>();
				
		String andStr = "";
	
		if (searchCriteria.getSurnameIsNotNull())
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" patient.name.upperSurname like :msurname ");
			markers.add("msurname");
			values.add(searchCriteria.getSurname().toUpperCase()+"%");
			andStr = " and ";
		}
		
		if (searchCriteria.getForenameIsNotNull())
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" patient.name.upperForename like :mforename ");
			markers.add("mforename");
			values.add(searchCriteria.getForename().toUpperCase()+"%");
			andStr = " and ";
		}
		
		if (searchCriteria.getHospitalNoIsNotNull())
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" identifiersType.id=-150 and identifiers.value = :mhospitalNo  ");
			markers.add("mhospitalNo");
			values.add(searchCriteria.getHospitalNo());
			andStr = " and ";
		}
		
		if (searchCriteria.getRequestorIsNotNull())
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" patClericalTask.requestor.id = :mrequestor ");
			markers.add("mrequestor");
			values.add(searchCriteria.getRequestor().getID_MemberOfStaff());
			andStr = " and ";
		}
				
		if (searchCriteria.getAllocatedToIsNotNull())
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" patClericalTask.allocatedTo.id = :mallocatedTo ");
			markers.add("mallocatedTo");
			values.add(searchCriteria.getAllocatedTo().getID_MemberOfStaff());
			andStr = " and ";
		}
		
		if (searchCriteria.getStatusIsNotNull())
		{
			hqlConditions.append(andStr);
			hqlConditions.append(" status.id = :mstatus ");
			markers.add("mstatus");
			values.add(searchCriteria.getStatus().getID());
			andStr = " and ";
		}
		
		if (searchCriteria.getDateFromIsNotNull())
		{
			DateTime dateTimeFrom=new DateTime(searchCriteria.getDateFrom(), new Time(0, 0, 0));
			hqlConditions.append(andStr);
			hqlConditions.append(" patClericalTask.requestedDateTime >= :mdateTimeFrom ");
			markers.add("mdateTimeFrom");
			values.add(dateTimeFrom.getJavaDate());
			andStr = " and ";
		}
		
		if (searchCriteria.getDateToIsNotNull())
		{
			DateTime dateTimeTo=new DateTime(searchCriteria.getDateTo(), new Time(23, 59, 59));
			hqlConditions.append(andStr);
			hqlConditions.append(" patClericalTask.requestedDateTime < :mdateTimeTo ");
			markers.add("mdateTimeTo");
			values.add(dateTimeTo.getJavaDate());
			andStr = " and ";
		}
		
		//hqlConditions.append(" ) order by patient asc");
		
		//FB latest changes for WDEV-13879 - 12.01.2012
		hqlConditions.append(" ) order by patClericalTask.requestedDateTime desc");
				
		List <?> list = getDomainFactory().find((hql+hqlConditions.toString()).toString(), markers, values);
		
		PatientClericalTaskVoCollection collection=PatientClericalTaskVoAssembler.createPatientClericalTaskVoCollectionFromPatientClericalTask(list);
		
		return collection;
	}
}