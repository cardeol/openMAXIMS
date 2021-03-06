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

package ims.RefMan.vo.beans;

public class PatientProcedureForReferralCodingVoBean extends ims.vo.ValueObjectBean
{
	public PatientProcedureForReferralCodingVoBean()
	{
	}
	public PatientProcedureForReferralCodingVoBean(ims.RefMan.vo.PatientProcedureForReferralCodingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.procedure = vo.getProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getProcedure().getBean();
		this.proceduredescription = vo.getProcedureDescription();
		this.procdate = vo.getProcDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getProcDate().getBean();
		this.peformedby = vo.getPeformedBy() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getPeformedBy().getBean();
		this.isprimary = vo.getIsPrimary();
		this.infosource = vo.getInfoSource() == null ? null : (ims.vo.LookupInstanceBean)vo.getInfoSource().getBean();
		this.proclaterality = vo.getProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getProcLaterality().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.PatientProcedureForReferralCodingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.procedure = vo.getProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getProcedure().getBean(map);
		this.proceduredescription = vo.getProcedureDescription();
		this.procdate = vo.getProcDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getProcDate().getBean();
		this.peformedby = vo.getPeformedBy() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getPeformedBy().getBean(map);
		this.isprimary = vo.getIsPrimary();
		this.infosource = vo.getInfoSource() == null ? null : (ims.vo.LookupInstanceBean)vo.getInfoSource().getBean();
		this.proclaterality = vo.getProcLaterality() == null ? null : (ims.vo.LookupInstanceBean)vo.getProcLaterality().getBean();
	}

	public ims.RefMan.vo.PatientProcedureForReferralCodingVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.PatientProcedureForReferralCodingVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.PatientProcedureForReferralCodingVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.PatientProcedureForReferralCodingVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.PatientProcedureForReferralCodingVo();
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
	public ims.core.vo.beans.ProcedureLiteVoBean getProcedure()
	{
		return this.procedure;
	}
	public void setProcedure(ims.core.vo.beans.ProcedureLiteVoBean value)
	{
		this.procedure = value;
	}
	public String getProcedureDescription()
	{
		return this.proceduredescription;
	}
	public void setProcedureDescription(String value)
	{
		this.proceduredescription = value;
	}
	public ims.framework.utils.beans.PartialDateBean getProcDate()
	{
		return this.procdate;
	}
	public void setProcDate(ims.framework.utils.beans.PartialDateBean value)
	{
		this.procdate = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getPeformedBy()
	{
		return this.peformedby;
	}
	public void setPeformedBy(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.peformedby = value;
	}
	public Boolean getIsPrimary()
	{
		return this.isprimary;
	}
	public void setIsPrimary(Boolean value)
	{
		this.isprimary = value;
	}
	public ims.vo.LookupInstanceBean getInfoSource()
	{
		return this.infosource;
	}
	public void setInfoSource(ims.vo.LookupInstanceBean value)
	{
		this.infosource = value;
	}
	public ims.vo.LookupInstanceBean getProcLaterality()
	{
		return this.proclaterality;
	}
	public void setProcLaterality(ims.vo.LookupInstanceBean value)
	{
		this.proclaterality = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.ProcedureLiteVoBean procedure;
	private String proceduredescription;
	private ims.framework.utils.beans.PartialDateBean procdate;
	private ims.core.vo.beans.HcpLiteVoBean peformedby;
	private Boolean isprimary;
	private ims.vo.LookupInstanceBean infosource;
	private ims.vo.LookupInstanceBean proclaterality;
}
