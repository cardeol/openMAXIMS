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

package ims.scheduling.vo.beans;

public class ProfileForProfileRippleVoBean extends ims.vo.ValueObjectBean
{
	public ProfileForProfileRippleVoBean()
	{
	}
	public ProfileForProfileRippleVoBean(ims.scheduling.vo.ProfileForProfileRippleVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.description = vo.getDescription();
		this.prfcategory = vo.getPrfCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPrfCategory().getBean();
		this.prftype = vo.getPrftype() == null ? null : (ims.vo.LookupInstanceBean)vo.getPrftype().getBean();
		this.efffrm = vo.getEffFrm() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEffFrm().getBean();
		this.effto = vo.getEffTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEffTo().getBean();
		this.isactive = vo.getIsActive();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceShortVoBean)vo.getService().getBean();
		this.lastactualgendate = vo.getLastActualGenDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getLastActualGenDate().getBean();
		this.lastgendate = vo.getLastGenDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getLastGenDate().getBean();
		this.autogenerateperiod = vo.getAutoGeneratePeriod();
		this.readytogenerate = vo.getReadyToGenerate();
		this.isfixed = vo.getIsFixed();
		this.schlocation = vo.getSchLocation() == null ? null : new ims.vo.RefVoBean(vo.getSchLocation().getBoId(), vo.getSchLocation().getBoVersion());
		this.starttm = vo.getStartTm() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTm().getBean();
		this.endtm = vo.getEndTm() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getEndTm().getBean();
		this.profileslots = vo.getProfileSlots() == null ? null : vo.getProfileSlots().getBeanCollection();
		this.listowners = vo.getListOwners() == null ? null : vo.getListOwners().getBeanCollection();
		this.profiletype = vo.getProfileType() == null ? null : (ims.vo.LookupInstanceBean)vo.getProfileType().getBean();
		this.function = vo.getFunction() == null ? null : vo.getFunction().getBeanCollection();
		this.directoryofservices = vo.getDirectoryOfServices() == null ? null : vo.getDirectoryOfServices().getBeanCollection();
		this.haschoosebookactivity = vo.getHasChooseBookActivity();
		this.hospital = vo.getHospital() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getHospital().getBean();
		if(vo.getParentChildSlots() != null)
		{
			this.parentchildslots = new ims.vo.RefVoBean[vo.getParentChildSlots().size()];
			for(int parentchildslots_i = 0; parentchildslots_i < vo.getParentChildSlots().size(); parentchildslots_i++)
			{
				this.parentchildslots[parentchildslots_i] = new ims.vo.RefVoBean(vo.getParentChildSlots().get(parentchildslots_i).getBoId(),vo.getParentChildSlots().get(parentchildslots_i).getBoVersion());
			}
		}
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.ProfileForProfileRippleVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.description = vo.getDescription();
		this.prfcategory = vo.getPrfCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPrfCategory().getBean();
		this.prftype = vo.getPrftype() == null ? null : (ims.vo.LookupInstanceBean)vo.getPrftype().getBean();
		this.efffrm = vo.getEffFrm() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEffFrm().getBean();
		this.effto = vo.getEffTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEffTo().getBean();
		this.isactive = vo.getIsActive();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceShortVoBean)vo.getService().getBean(map);
		this.lastactualgendate = vo.getLastActualGenDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getLastActualGenDate().getBean();
		this.lastgendate = vo.getLastGenDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getLastGenDate().getBean();
		this.autogenerateperiod = vo.getAutoGeneratePeriod();
		this.readytogenerate = vo.getReadyToGenerate();
		this.isfixed = vo.getIsFixed();
		this.schlocation = vo.getSchLocation() == null ? null : new ims.vo.RefVoBean(vo.getSchLocation().getBoId(), vo.getSchLocation().getBoVersion());
		this.starttm = vo.getStartTm() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTm().getBean();
		this.endtm = vo.getEndTm() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getEndTm().getBean();
		this.profileslots = vo.getProfileSlots() == null ? null : vo.getProfileSlots().getBeanCollection();
		this.listowners = vo.getListOwners() == null ? null : vo.getListOwners().getBeanCollection();
		this.profiletype = vo.getProfileType() == null ? null : (ims.vo.LookupInstanceBean)vo.getProfileType().getBean();
		this.function = vo.getFunction() == null ? null : vo.getFunction().getBeanCollection();
		this.directoryofservices = vo.getDirectoryOfServices() == null ? null : vo.getDirectoryOfServices().getBeanCollection();
		this.haschoosebookactivity = vo.getHasChooseBookActivity();
		this.hospital = vo.getHospital() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getHospital().getBean(map);
		if(vo.getParentChildSlots() != null)
		{
			this.parentchildslots = new ims.vo.RefVoBean[vo.getParentChildSlots().size()];
			for(int parentchildslots_i = 0; parentchildslots_i < vo.getParentChildSlots().size(); parentchildslots_i++)
			{
				this.parentchildslots[parentchildslots_i] = new ims.vo.RefVoBean(vo.getParentChildSlots().get(parentchildslots_i).getBoId(),vo.getParentChildSlots().get(parentchildslots_i).getBoVersion());
			}
		}
	}

	public ims.scheduling.vo.ProfileForProfileRippleVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.ProfileForProfileRippleVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.ProfileForProfileRippleVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.ProfileForProfileRippleVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.ProfileForProfileRippleVo();
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
	public String getName()
	{
		return this.name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String value)
	{
		this.description = value;
	}
	public ims.vo.LookupInstanceBean getPrfCategory()
	{
		return this.prfcategory;
	}
	public void setPrfCategory(ims.vo.LookupInstanceBean value)
	{
		this.prfcategory = value;
	}
	public ims.vo.LookupInstanceBean getPrftype()
	{
		return this.prftype;
	}
	public void setPrftype(ims.vo.LookupInstanceBean value)
	{
		this.prftype = value;
	}
	public ims.framework.utils.beans.DateBean getEffFrm()
	{
		return this.efffrm;
	}
	public void setEffFrm(ims.framework.utils.beans.DateBean value)
	{
		this.efffrm = value;
	}
	public ims.framework.utils.beans.DateBean getEffTo()
	{
		return this.effto;
	}
	public void setEffTo(ims.framework.utils.beans.DateBean value)
	{
		this.effto = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public ims.core.vo.beans.ServiceShortVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.beans.ServiceShortVoBean value)
	{
		this.service = value;
	}
	public ims.framework.utils.beans.DateBean getLastActualGenDate()
	{
		return this.lastactualgendate;
	}
	public void setLastActualGenDate(ims.framework.utils.beans.DateBean value)
	{
		this.lastactualgendate = value;
	}
	public ims.framework.utils.beans.DateBean getLastGenDate()
	{
		return this.lastgendate;
	}
	public void setLastGenDate(ims.framework.utils.beans.DateBean value)
	{
		this.lastgendate = value;
	}
	public Integer getAutoGeneratePeriod()
	{
		return this.autogenerateperiod;
	}
	public void setAutoGeneratePeriod(Integer value)
	{
		this.autogenerateperiod = value;
	}
	public Boolean getReadyToGenerate()
	{
		return this.readytogenerate;
	}
	public void setReadyToGenerate(Boolean value)
	{
		this.readytogenerate = value;
	}
	public Boolean getIsFixed()
	{
		return this.isfixed;
	}
	public void setIsFixed(Boolean value)
	{
		this.isfixed = value;
	}
	public ims.vo.RefVoBean getSchLocation()
	{
		return this.schlocation;
	}
	public void setSchLocation(ims.vo.RefVoBean value)
	{
		this.schlocation = value;
	}
	public ims.framework.utils.beans.TimeBean getStartTm()
	{
		return this.starttm;
	}
	public void setStartTm(ims.framework.utils.beans.TimeBean value)
	{
		this.starttm = value;
	}
	public ims.framework.utils.beans.TimeBean getEndTm()
	{
		return this.endtm;
	}
	public void setEndTm(ims.framework.utils.beans.TimeBean value)
	{
		this.endtm = value;
	}
	public ims.scheduling.vo.beans.Profile_SlotGenericVoBean[] getProfileSlots()
	{
		return this.profileslots;
	}
	public void setProfileSlots(ims.scheduling.vo.beans.Profile_SlotGenericVoBean[] value)
	{
		this.profileslots = value;
	}
	public ims.scheduling.vo.beans.Profile_ListOwnerVoBean[] getListOwners()
	{
		return this.listowners;
	}
	public void setListOwners(ims.scheduling.vo.beans.Profile_ListOwnerVoBean[] value)
	{
		this.listowners = value;
	}
	public ims.vo.LookupInstanceBean getProfileType()
	{
		return this.profiletype;
	}
	public void setProfileType(ims.vo.LookupInstanceBean value)
	{
		this.profiletype = value;
	}
	public java.util.Collection getFunction()
	{
		return this.function;
	}
	public void setFunction(java.util.Collection value)
	{
		this.function = value;
	}
	public void addFunction(java.util.Collection value)
	{
		if(this.function == null)
			this.function = new java.util.ArrayList();
		this.function.add(value);
	}
	public ims.scheduling.vo.beans.DirectoryOfServiceVoBean[] getDirectoryOfServices()
	{
		return this.directoryofservices;
	}
	public void setDirectoryOfServices(ims.scheduling.vo.beans.DirectoryOfServiceVoBean[] value)
	{
		this.directoryofservices = value;
	}
	public Boolean getHasChooseBookActivity()
	{
		return this.haschoosebookactivity;
	}
	public void setHasChooseBookActivity(Boolean value)
	{
		this.haschoosebookactivity = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getHospital()
	{
		return this.hospital;
	}
	public void setHospital(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.hospital = value;
	}
	public ims.vo.RefVoBean[] getParentChildSlots()
	{
		return this.parentchildslots;
	}
	public void setParentChildSlots(ims.vo.RefVoBean[] value)
	{
		this.parentchildslots = value;
	}

	private Integer id;
	private int version;
	private String name;
	private String description;
	private ims.vo.LookupInstanceBean prfcategory;
	private ims.vo.LookupInstanceBean prftype;
	private ims.framework.utils.beans.DateBean efffrm;
	private ims.framework.utils.beans.DateBean effto;
	private Boolean isactive;
	private ims.core.vo.beans.ServiceShortVoBean service;
	private ims.framework.utils.beans.DateBean lastactualgendate;
	private ims.framework.utils.beans.DateBean lastgendate;
	private Integer autogenerateperiod;
	private Boolean readytogenerate;
	private Boolean isfixed;
	private ims.vo.RefVoBean schlocation;
	private ims.framework.utils.beans.TimeBean starttm;
	private ims.framework.utils.beans.TimeBean endtm;
	private ims.scheduling.vo.beans.Profile_SlotGenericVoBean[] profileslots;
	private ims.scheduling.vo.beans.Profile_ListOwnerVoBean[] listowners;
	private ims.vo.LookupInstanceBean profiletype;
	private java.util.Collection function;
	private ims.scheduling.vo.beans.DirectoryOfServiceVoBean[] directoryofservices;
	private Boolean haschoosebookactivity;
	private ims.core.vo.beans.LocationLiteVoBean hospital;
	private ims.vo.RefVoBean[] parentchildslots;
}
