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

public class ReferralOutcomeVoBean extends ims.vo.ValueObjectBean
{
	public ReferralOutcomeVoBean()
	{
	}
	public ReferralOutcomeVoBean(ims.RefMan.vo.ReferralOutcomeVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
		this.referraldischarge = vo.getReferralDischarge() == null ? null : (ims.RefMan.vo.beans.ReferralDischargeVoBean)vo.getReferralDischarge().getBean();
		this.furthermanagementdetails = vo.getFurtherManagementDetails() == null ? null : vo.getFurtherManagementDetails().getBeanCollection();
		this.prescriptions = vo.getPrescriptions() == null ? null : vo.getPrescriptions().getBeanCollection();
		this.referraldischargehistory = vo.getReferralDischargeHistory() == null ? null : vo.getReferralDischargeHistory().getBeanCollection();
		this.catsfinalreportstatus = vo.getCatsFinalReportStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCatsFinalReportStatus().getBean();
		this.activemonitoring = vo.getActiveMonitoring() == null ? null : (ims.RefMan.vo.beans.ActiveMonitoringVoBean)vo.getActiveMonitoring().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.ReferralOutcomeVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
		this.referraldischarge = vo.getReferralDischarge() == null ? null : (ims.RefMan.vo.beans.ReferralDischargeVoBean)vo.getReferralDischarge().getBean(map);
		this.furthermanagementdetails = vo.getFurtherManagementDetails() == null ? null : vo.getFurtherManagementDetails().getBeanCollection();
		this.prescriptions = vo.getPrescriptions() == null ? null : vo.getPrescriptions().getBeanCollection();
		this.referraldischargehistory = vo.getReferralDischargeHistory() == null ? null : vo.getReferralDischargeHistory().getBeanCollection();
		this.catsfinalreportstatus = vo.getCatsFinalReportStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCatsFinalReportStatus().getBean();
		this.activemonitoring = vo.getActiveMonitoring() == null ? null : (ims.RefMan.vo.beans.ActiveMonitoringVoBean)vo.getActiveMonitoring().getBean(map);
	}

	public ims.RefMan.vo.ReferralOutcomeVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.ReferralOutcomeVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.ReferralOutcomeVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.ReferralOutcomeVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.ReferralOutcomeVo();
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
	public ims.vo.RefVoBean getCatsReferral()
	{
		return this.catsreferral;
	}
	public void setCatsReferral(ims.vo.RefVoBean value)
	{
		this.catsreferral = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}
	public ims.vo.SysInfoBean getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SysInfoBean value)
	{
		this.sysinfo = value;
	}
	public ims.RefMan.vo.beans.ReferralDischargeVoBean getReferralDischarge()
	{
		return this.referraldischarge;
	}
	public void setReferralDischarge(ims.RefMan.vo.beans.ReferralDischargeVoBean value)
	{
		this.referraldischarge = value;
	}
	public ims.RefMan.vo.beans.FurtherManagementDetailsVoBean[] getFurtherManagementDetails()
	{
		return this.furthermanagementdetails;
	}
	public void setFurtherManagementDetails(ims.RefMan.vo.beans.FurtherManagementDetailsVoBean[] value)
	{
		this.furthermanagementdetails = value;
	}
	public ims.RefMan.vo.beans.PrescriptionsVoBean[] getPrescriptions()
	{
		return this.prescriptions;
	}
	public void setPrescriptions(ims.RefMan.vo.beans.PrescriptionsVoBean[] value)
	{
		this.prescriptions = value;
	}
	public ims.RefMan.vo.beans.ReferralDischargeVoBean[] getReferralDischargeHistory()
	{
		return this.referraldischargehistory;
	}
	public void setReferralDischargeHistory(ims.RefMan.vo.beans.ReferralDischargeVoBean[] value)
	{
		this.referraldischargehistory = value;
	}
	public ims.vo.LookupInstanceBean getCatsFinalReportStatus()
	{
		return this.catsfinalreportstatus;
	}
	public void setCatsFinalReportStatus(ims.vo.LookupInstanceBean value)
	{
		this.catsfinalreportstatus = value;
	}
	public ims.RefMan.vo.beans.ActiveMonitoringVoBean getActiveMonitoring()
	{
		return this.activemonitoring;
	}
	public void setActiveMonitoring(ims.RefMan.vo.beans.ActiveMonitoringVoBean value)
	{
		this.activemonitoring = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean catsreferral;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
	private ims.vo.SysInfoBean sysinfo;
	private ims.RefMan.vo.beans.ReferralDischargeVoBean referraldischarge;
	private ims.RefMan.vo.beans.FurtherManagementDetailsVoBean[] furthermanagementdetails;
	private ims.RefMan.vo.beans.PrescriptionsVoBean[] prescriptions;
	private ims.RefMan.vo.beans.ReferralDischargeVoBean[] referraldischargehistory;
	private ims.vo.LookupInstanceBean catsfinalreportstatus;
	private ims.RefMan.vo.beans.ActiveMonitoringVoBean activemonitoring;
}
