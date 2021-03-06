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

package ims.clinical.vo.beans;

public class EdischargeListSTHKManualAssemblyVoBean extends ims.vo.ValueObjectBean
{
	public EdischargeListSTHKManualAssemblyVoBean()
	{
	}
	public EdischargeListSTHKManualAssemblyVoBean(ims.clinical.vo.EdischargeListSTHKManualAssemblyVo vo)
	{
		this.carecontextrefvo = vo.getCareContextRefVo() == null ? null : new ims.vo.RefVoBean(vo.getCareContextRefVo().getBoId(), vo.getCareContextRefVo().getBoVersion());
		this.responsiblehcpname = vo.getResponsibleHCPName();
		this.ward = vo.getWard();
		this.dischargedate = vo.getDischargeDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDischargeDate().getBean();
		this.patientname = vo.getPatientName();
		this.patienthospnum = vo.getPatientHospnum();
		this.letterstatus = vo.getLetterStatus();
		this.issummaryrecordcomplete = vo.getIsSummaryRecordComplete();
		this.juliandate = vo.getJulianDate();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.EdischargeListSTHKManualAssemblyVo vo)
	{
		this.carecontextrefvo = vo.getCareContextRefVo() == null ? null : new ims.vo.RefVoBean(vo.getCareContextRefVo().getBoId(), vo.getCareContextRefVo().getBoVersion());
		this.responsiblehcpname = vo.getResponsibleHCPName();
		this.ward = vo.getWard();
		this.dischargedate = vo.getDischargeDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDischargeDate().getBean();
		this.patientname = vo.getPatientName();
		this.patienthospnum = vo.getPatientHospnum();
		this.letterstatus = vo.getLetterStatus();
		this.issummaryrecordcomplete = vo.getIsSummaryRecordComplete();
		this.juliandate = vo.getJulianDate();
	}

	public ims.clinical.vo.EdischargeListSTHKManualAssemblyVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.EdischargeListSTHKManualAssemblyVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.EdischargeListSTHKManualAssemblyVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.EdischargeListSTHKManualAssemblyVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.EdischargeListSTHKManualAssemblyVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.vo.RefVoBean getCareContextRefVo()
	{
		return this.carecontextrefvo;
	}
	public void setCareContextRefVo(ims.vo.RefVoBean value)
	{
		this.carecontextrefvo = value;
	}
	public String getResponsibleHCPName()
	{
		return this.responsiblehcpname;
	}
	public void setResponsibleHCPName(String value)
	{
		this.responsiblehcpname = value;
	}
	public String getWard()
	{
		return this.ward;
	}
	public void setWard(String value)
	{
		this.ward = value;
	}
	public ims.framework.utils.beans.DateBean getDischargeDate()
	{
		return this.dischargedate;
	}
	public void setDischargeDate(ims.framework.utils.beans.DateBean value)
	{
		this.dischargedate = value;
	}
	public String getPatientName()
	{
		return this.patientname;
	}
	public void setPatientName(String value)
	{
		this.patientname = value;
	}
	public String getPatientHospnum()
	{
		return this.patienthospnum;
	}
	public void setPatientHospnum(String value)
	{
		this.patienthospnum = value;
	}
	public String getLetterStatus()
	{
		return this.letterstatus;
	}
	public void setLetterStatus(String value)
	{
		this.letterstatus = value;
	}
	public Boolean getIsSummaryRecordComplete()
	{
		return this.issummaryrecordcomplete;
	}
	public void setIsSummaryRecordComplete(Boolean value)
	{
		this.issummaryrecordcomplete = value;
	}
	public String getJulianDate()
	{
		return this.juliandate;
	}
	public void setJulianDate(String value)
	{
		this.juliandate = value;
	}

	private ims.vo.RefVoBean carecontextrefvo;
	private String responsiblehcpname;
	private String ward;
	private ims.framework.utils.beans.DateBean dischargedate;
	private String patientname;
	private String patienthospnum;
	private String letterstatus;
	private Boolean issummaryrecordcomplete;
	private String juliandate;
}
