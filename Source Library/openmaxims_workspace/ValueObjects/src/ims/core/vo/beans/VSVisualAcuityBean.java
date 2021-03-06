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

public class VSVisualAcuityBean extends ims.vo.ValueObjectBean
{
	public VSVisualAcuityBean()
	{
	}
	public VSVisualAcuityBean(ims.core.vo.VSVisualAcuity vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.systemused = vo.getSystemUsed() == null ? null : (ims.vo.LookupInstanceBean)vo.getSystemUsed().getBean();
		this.leftvalue = vo.getLeftValue();
		this.rightvalue = vo.getRightValue();
		this.iscorrectedvalue = vo.getIsCorrectedValue();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.VSVisualAcuity vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.systemused = vo.getSystemUsed() == null ? null : (ims.vo.LookupInstanceBean)vo.getSystemUsed().getBean();
		this.leftvalue = vo.getLeftValue();
		this.rightvalue = vo.getRightValue();
		this.iscorrectedvalue = vo.getIsCorrectedValue();
	}

	public ims.core.vo.VSVisualAcuity buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.VSVisualAcuity buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.VSVisualAcuity vo = null;
		if(map != null)
			vo = (ims.core.vo.VSVisualAcuity)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.VSVisualAcuity();
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
	public ims.vo.LookupInstanceBean getSystemUsed()
	{
		return this.systemused;
	}
	public void setSystemUsed(ims.vo.LookupInstanceBean value)
	{
		this.systemused = value;
	}
	public String getLeftValue()
	{
		return this.leftvalue;
	}
	public void setLeftValue(String value)
	{
		this.leftvalue = value;
	}
	public String getRightValue()
	{
		return this.rightvalue;
	}
	public void setRightValue(String value)
	{
		this.rightvalue = value;
	}
	public Boolean getIsCorrectedValue()
	{
		return this.iscorrectedvalue;
	}
	public void setIsCorrectedValue(Boolean value)
	{
		this.iscorrectedvalue = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean systemused;
	private String leftvalue;
	private String rightvalue;
	private Boolean iscorrectedvalue;
}
