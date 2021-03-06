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

package ims.core.vo.beans;

public class MemberOfStaffVoBean extends ims.vo.ValueObjectBean
{
	public MemberOfStaffVoBean()
	{
	}
	public MemberOfStaffVoBean(ims.core.vo.MemberOfStaffVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean();
		this.initials = vo.getInitials();
		this.signatureblock = vo.getSignatureBlock();
		this.codemappings = vo.getCodeMappings() == null ? null : vo.getCodeMappings().getBeanCollection();
		this.hcp = vo.getHcp() == null ? null : (ims.core.vo.beans.HcpBean)vo.getHcp().getBean();
		this.appuser = vo.getAppUser() == null ? null : (ims.admin.vo.beans.AppUserShortVoBean)vo.getAppUser().getBean();
		this.stafftype = vo.getStaffType() == null ? null : (ims.vo.LookupInstanceBean)vo.getStaffType().getBean();
		this.isactive = vo.getIsActive();
		this.isappuser = vo.getIsAppUser();
		this.primarylocation = vo.getPrimaryLocation() == null ? null : (ims.core.vo.beans.LocShortVoBean)vo.getPrimaryLocation().getBean();
		this.commchannels = vo.getCommChannels() == null ? null : vo.getCommChannels().getBeanCollection();
		this.sdsroleid = vo.getSdsRoleId();
		this.canreferpatient = vo.getCanReferPatient();
		this.mappingvalue = vo.getMappingValue();
		this.locations = vo.getLocations() == null ? null : vo.getLocations().getBeanCollection();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.MemberOfStaffVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean(map);
		this.initials = vo.getInitials();
		this.signatureblock = vo.getSignatureBlock();
		this.codemappings = vo.getCodeMappings() == null ? null : vo.getCodeMappings().getBeanCollection();
		this.hcp = vo.getHcp() == null ? null : (ims.core.vo.beans.HcpBean)vo.getHcp().getBean(map);
		this.appuser = vo.getAppUser() == null ? null : (ims.admin.vo.beans.AppUserShortVoBean)vo.getAppUser().getBean(map);
		this.stafftype = vo.getStaffType() == null ? null : (ims.vo.LookupInstanceBean)vo.getStaffType().getBean();
		this.isactive = vo.getIsActive();
		this.isappuser = vo.getIsAppUser();
		this.primarylocation = vo.getPrimaryLocation() == null ? null : (ims.core.vo.beans.LocShortVoBean)vo.getPrimaryLocation().getBean(map);
		this.commchannels = vo.getCommChannels() == null ? null : vo.getCommChannels().getBeanCollection();
		this.sdsroleid = vo.getSdsRoleId();
		this.canreferpatient = vo.getCanReferPatient();
		this.mappingvalue = vo.getMappingValue();
		this.locations = vo.getLocations() == null ? null : vo.getLocations().getBeanCollection();
	}

	public ims.core.vo.MemberOfStaffVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.MemberOfStaffVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.MemberOfStaffVo vo = null;
		if(map != null)
			vo = (ims.core.vo.MemberOfStaffVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.MemberOfStaffVo();
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
	public ims.core.vo.beans.PersonNameBean getName()
	{
		return this.name;
	}
	public void setName(ims.core.vo.beans.PersonNameBean value)
	{
		this.name = value;
	}
	public String getInitials()
	{
		return this.initials;
	}
	public void setInitials(String value)
	{
		this.initials = value;
	}
	public String getSignatureBlock()
	{
		return this.signatureblock;
	}
	public void setSignatureBlock(String value)
	{
		this.signatureblock = value;
	}
	public ims.core.vo.beans.TaxonomyMapBean[] getCodeMappings()
	{
		return this.codemappings;
	}
	public void setCodeMappings(ims.core.vo.beans.TaxonomyMapBean[] value)
	{
		this.codemappings = value;
	}
	public ims.core.vo.beans.HcpBean getHcp()
	{
		return this.hcp;
	}
	public void setHcp(ims.core.vo.beans.HcpBean value)
	{
		this.hcp = value;
	}
	public ims.admin.vo.beans.AppUserShortVoBean getAppUser()
	{
		return this.appuser;
	}
	public void setAppUser(ims.admin.vo.beans.AppUserShortVoBean value)
	{
		this.appuser = value;
	}
	public ims.vo.LookupInstanceBean getStaffType()
	{
		return this.stafftype;
	}
	public void setStaffType(ims.vo.LookupInstanceBean value)
	{
		this.stafftype = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public Boolean getIsAppUser()
	{
		return this.isappuser;
	}
	public void setIsAppUser(Boolean value)
	{
		this.isappuser = value;
	}
	public ims.core.vo.beans.LocShortVoBean getPrimaryLocation()
	{
		return this.primarylocation;
	}
	public void setPrimaryLocation(ims.core.vo.beans.LocShortVoBean value)
	{
		this.primarylocation = value;
	}
	public ims.core.vo.beans.CommChannelVoBean[] getCommChannels()
	{
		return this.commchannels;
	}
	public void setCommChannels(ims.core.vo.beans.CommChannelVoBean[] value)
	{
		this.commchannels = value;
	}
	public String getSdsRoleId()
	{
		return this.sdsroleid;
	}
	public void setSdsRoleId(String value)
	{
		this.sdsroleid = value;
	}
	public Boolean getCanReferPatient()
	{
		return this.canreferpatient;
	}
	public void setCanReferPatient(Boolean value)
	{
		this.canreferpatient = value;
	}
	public String getMappingValue()
	{
		return this.mappingvalue;
	}
	public void setMappingValue(String value)
	{
		this.mappingvalue = value;
	}
	public ims.core.vo.beans.HcpLocationVoBean[] getLocations()
	{
		return this.locations;
	}
	public void setLocations(ims.core.vo.beans.HcpLocationVoBean[] value)
	{
		this.locations = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PersonNameBean name;
	private String initials;
	private String signatureblock;
	private ims.core.vo.beans.TaxonomyMapBean[] codemappings;
	private ims.core.vo.beans.HcpBean hcp;
	private ims.admin.vo.beans.AppUserShortVoBean appuser;
	private ims.vo.LookupInstanceBean stafftype;
	private Boolean isactive;
	private Boolean isappuser;
	private ims.core.vo.beans.LocShortVoBean primarylocation;
	private ims.core.vo.beans.CommChannelVoBean[] commchannels;
	private String sdsroleid;
	private Boolean canreferpatient;
	private String mappingvalue;
	private ims.core.vo.beans.HcpLocationVoBean[] locations;
}
