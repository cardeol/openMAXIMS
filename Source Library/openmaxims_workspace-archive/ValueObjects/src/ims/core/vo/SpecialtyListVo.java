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

package ims.core.vo;


public class SpecialtyListVo extends ims.core.vo.BaseListVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SpecialtyListVo()
	{
	}
	public SpecialtyListVo(ims.core.vo.beans.SpecialtyListVoBean bean)
	{
		this.compositeid = bean.getCompositeID();
		this.name = bean.getName();
		this.boolvalue = bean.getBoolValue();
		this.singleid = bean.getSingleID();
		this.description = bean.getDescription();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.SpecialtyListVoBean bean)
	{
		this.compositeid = bean.getCompositeID();
		this.name = bean.getName();
		this.boolvalue = bean.getBoolValue();
		this.singleid = bean.getSingleID();
		this.description = bean.getDescription();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.SpecialtyListVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.SpecialtyListVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.SpecialtyListVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof SpecialtyListVo))
			return false;
		SpecialtyListVo compareObj = (SpecialtyListVo)obj;
		if(this.getSingleID() == null && compareObj.getSingleID() != null)
			return false;
		if(this.getSingleID() != null && compareObj.getSingleID() == null)
			return false;
		if(this.getSingleID() != null && compareObj.getSingleID() != null)
			return this.getSingleID().equals(compareObj.getSingleID());
		return super.equals(obj);
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		SpecialtyListVo clone = new SpecialtyListVo();
		
		clone.compositeid = this.compositeid;
		clone.name = this.name;
		clone.boolvalue = this.boolvalue;
		clone.singleid = this.singleid;
		clone.description = this.description;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(SpecialtyListVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SpecialtyListVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		SpecialtyListVo compareObj = (SpecialtyListVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSingleID() == null && compareObj.getSingleID() != null)
				return -1;
			if(this.getSingleID() != null && compareObj.getSingleID() == null)
				return 1;
			if(this.getSingleID() != null && compareObj.getSingleID() != null)
				retVal = this.getSingleID().compareTo(compareObj.getSingleID());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 0;
	}
	private boolean isValidated = false;
	private boolean isBusy = false;
}
