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

public class DocumentCategoryConfigShortVoBean extends ims.vo.ValueObjectBean
{
	public DocumentCategoryConfigShortVoBean()
	{
	}
	public DocumentCategoryConfigShortVoBean(ims.core.vo.DocumentCategoryConfigShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.template = vo.getTemplate() == null ? null : (ims.core.vo.beans.TemplateForPatientDocumentVoBean)vo.getTemplate().getBean();
		this.specialty = vo.getSpecialty() == null ? null : vo.getSpecialty().getBeanCollection();
		this.category = vo.getCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getCategory().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.DocumentCategoryConfigShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.template = vo.getTemplate() == null ? null : (ims.core.vo.beans.TemplateForPatientDocumentVoBean)vo.getTemplate().getBean(map);
		this.specialty = vo.getSpecialty() == null ? null : vo.getSpecialty().getBeanCollection();
		this.category = vo.getCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getCategory().getBean();
	}

	public ims.core.vo.DocumentCategoryConfigShortVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.DocumentCategoryConfigShortVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.DocumentCategoryConfigShortVo vo = null;
		if(map != null)
			vo = (ims.core.vo.DocumentCategoryConfigShortVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.DocumentCategoryConfigShortVo();
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
	public ims.core.vo.beans.TemplateForPatientDocumentVoBean getTemplate()
	{
		return this.template;
	}
	public void setTemplate(ims.core.vo.beans.TemplateForPatientDocumentVoBean value)
	{
		this.template = value;
	}
	public java.util.Collection getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(java.util.Collection value)
	{
		this.specialty = value;
	}
	public void addSpecialty(java.util.Collection value)
	{
		if(this.specialty == null)
			this.specialty = new java.util.ArrayList();
		this.specialty.add(value);
	}
	public ims.vo.LookupInstanceBean getCategory()
	{
		return this.category;
	}
	public void setCategory(ims.vo.LookupInstanceBean value)
	{
		this.category = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.TemplateForPatientDocumentVoBean template;
	private java.util.Collection specialty;
	private ims.vo.LookupInstanceBean category;
}
