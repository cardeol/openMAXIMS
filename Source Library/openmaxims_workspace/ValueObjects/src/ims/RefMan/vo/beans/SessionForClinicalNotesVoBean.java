// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class SessionForClinicalNotesVoBean extends ims.vo.ValueObjectBean
{
	public SessionForClinicalNotesVoBean()
	{
	}
	public SessionForClinicalNotesVoBean(ims.RefMan.vo.SessionForClinicalNotesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.SessionForClinicalNotesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean(map);
	}

	public ims.RefMan.vo.SessionForClinicalNotesVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.SessionForClinicalNotesVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.SessionForClinicalNotesVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.SessionForClinicalNotesVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.SessionForClinicalNotesVo();
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
	public ims.core.vo.beans.ServiceLiteVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.beans.ServiceLiteVoBean value)
	{
		this.service = value;
	}

	private Integer id;
	private int version;
	private String name;
	private ims.core.vo.beans.ServiceLiteVoBean service;
}