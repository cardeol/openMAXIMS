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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.emergency.vo.beans;

public class ifPartialAdmissionVoBean extends ims.vo.ValueObjectBean
{
	public ifPartialAdmissionVoBean()
	{
	}
	public ifPartialAdmissionVoBean(ims.emergency.vo.ifPartialAdmissionVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.allocatedstatus = vo.getAllocatedStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getAllocatedStatus().getBean();
		this.allocatedward = vo.getAllocatedWard() == null ? null : (ims.core.vo.beans.LocShortMappingsVoBean)vo.getAllocatedWard().getBean();
		this.accomodationrequestedtype = vo.getAccomodationRequestedType() == null ? null : (ims.vo.LookupInstanceBean)vo.getAccomodationRequestedType().getBean();
		this.admittingconsultant = vo.getAdmittingConsultant() == null ? null : (ims.core.vo.beans.HcpBean)vo.getAdmittingConsultant().getBean();
		this.decisiontoadmitdatetime = vo.getDecisionToAdmitDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDecisionToAdmitDateTime().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.ifPartialAdmissionVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.allocatedstatus = vo.getAllocatedStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getAllocatedStatus().getBean();
		this.allocatedward = vo.getAllocatedWard() == null ? null : (ims.core.vo.beans.LocShortMappingsVoBean)vo.getAllocatedWard().getBean(map);
		this.accomodationrequestedtype = vo.getAccomodationRequestedType() == null ? null : (ims.vo.LookupInstanceBean)vo.getAccomodationRequestedType().getBean();
		this.admittingconsultant = vo.getAdmittingConsultant() == null ? null : (ims.core.vo.beans.HcpBean)vo.getAdmittingConsultant().getBean(map);
		this.decisiontoadmitdatetime = vo.getDecisionToAdmitDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDecisionToAdmitDateTime().getBean();
	}

	public ims.emergency.vo.ifPartialAdmissionVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.ifPartialAdmissionVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.ifPartialAdmissionVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.ifPartialAdmissionVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.ifPartialAdmissionVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.LookupInstanceBean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.vo.LookupInstanceBean value)
	{
		this.specialty = value;
	}
	public ims.vo.LookupInstanceBean getAllocatedStatus()
	{
		return this.allocatedstatus;
	}
	public void setAllocatedStatus(ims.vo.LookupInstanceBean value)
	{
		this.allocatedstatus = value;
	}
	public ims.core.vo.beans.LocShortMappingsVoBean getAllocatedWard()
	{
		return this.allocatedward;
	}
	public void setAllocatedWard(ims.core.vo.beans.LocShortMappingsVoBean value)
	{
		this.allocatedward = value;
	}
	public ims.vo.LookupInstanceBean getAccomodationRequestedType()
	{
		return this.accomodationrequestedtype;
	}
	public void setAccomodationRequestedType(ims.vo.LookupInstanceBean value)
	{
		this.accomodationrequestedtype = value;
	}
	public ims.core.vo.beans.HcpBean getAdmittingConsultant()
	{
		return this.admittingconsultant;
	}
	public void setAdmittingConsultant(ims.core.vo.beans.HcpBean value)
	{
		this.admittingconsultant = value;
	}
	public ims.framework.utils.beans.DateTimeBean getDecisionToAdmitDateTime()
	{
		return this.decisiontoadmitdatetime;
	}
	public void setDecisionToAdmitDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.decisiontoadmitdatetime = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean specialty;
	private ims.vo.LookupInstanceBean allocatedstatus;
	private ims.core.vo.beans.LocShortMappingsVoBean allocatedward;
	private ims.vo.LookupInstanceBean accomodationrequestedtype;
	private ims.core.vo.beans.HcpBean admittingconsultant;
	private ims.framework.utils.beans.DateTimeBean decisiontoadmitdatetime;
}
