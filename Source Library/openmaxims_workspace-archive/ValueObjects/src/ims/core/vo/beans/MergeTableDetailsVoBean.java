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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.vo.beans;

public class MergeTableDetailsVoBean extends ims.vo.ValueObjectBean
{
	public MergeTableDetailsVoBean()
	{
	}
	public MergeTableDetailsVoBean(ims.core.vo.MergeTableDetailsVo vo)
	{
		this.entityname = vo.getEntityName();
		this.tablename = vo.getTableName();
		this.columnname = vo.getColumnName();
		this.attributename = vo.getAttributeName();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.MergeTableDetailsVo vo)
	{
		this.entityname = vo.getEntityName();
		this.tablename = vo.getTableName();
		this.columnname = vo.getColumnName();
		this.attributename = vo.getAttributeName();
	}

	public ims.core.vo.MergeTableDetailsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.MergeTableDetailsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.MergeTableDetailsVo vo = null;
		if(map != null)
			vo = (ims.core.vo.MergeTableDetailsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.MergeTableDetailsVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public String getEntityName()
	{
		return this.entityname;
	}
	public void setEntityName(String value)
	{
		this.entityname = value;
	}
	public String getTableName()
	{
		return this.tablename;
	}
	public void setTableName(String value)
	{
		this.tablename = value;
	}
	public String getColumnName()
	{
		return this.columnname;
	}
	public void setColumnName(String value)
	{
		this.columnname = value;
	}
	public String getAttributeName()
	{
		return this.attributename;
	}
	public void setAttributeName(String value)
	{
		this.attributename = value;
	}

	private String entityname;
	private String tablename;
	private String columnname;
	private String attributename;
}
