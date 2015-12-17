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

package ims.generalmedical.vo;

/**
 * Linked to core.admin.OPDRelPres business object (ID: 1023100026).
 */
public class OPDVisitRelPresVo extends ims.core.admin.vo.OPDRelPresRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public OPDVisitRelPresVo()
	{
	}
	public OPDVisitRelPresVo(Integer id, int version)
	{
		super(id, version);
	}
	public OPDVisitRelPresVo(ims.generalmedical.vo.beans.OPDVisitRelPresVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.relrelationship = bean.getRelRelationship() == null ? null : ims.core.vo.lookups.PersonRelationship.buildLookup(bean.getRelRelationship());
		this.relname = bean.getRelName();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.generalmedical.vo.beans.OPDVisitRelPresVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.relrelationship = bean.getRelRelationship() == null ? null : ims.core.vo.lookups.PersonRelationship.buildLookup(bean.getRelRelationship());
		this.relname = bean.getRelName();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.generalmedical.vo.beans.OPDVisitRelPresVoBean bean = null;
		if(map != null)
			bean = (ims.generalmedical.vo.beans.OPDVisitRelPresVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.generalmedical.vo.beans.OPDVisitRelPresVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("RELRELATIONSHIP"))
			return getRelRelationship();
		if(fieldName.equals("RELNAME"))
			return getRelName();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getRelRelationshipIsNotNull()
	{
		return this.relrelationship != null;
	}
	public ims.core.vo.lookups.PersonRelationship getRelRelationship()
	{
		return this.relrelationship;
	}
	public void setRelRelationship(ims.core.vo.lookups.PersonRelationship value)
	{
		this.isValidated = false;
		this.relrelationship = value;
	}
	public boolean getRelNameIsNotNull()
	{
		return this.relname != null;
	}
	public String getRelName()
	{
		return this.relname;
	}
	public static int getRelNameMaxLength()
	{
		return 100;
	}
	public void setRelName(String value)
	{
		this.isValidated = false;
		this.relname = value;
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
		if(this.relname != null)
			if(this.relname.length() > 100)
				listOfErrors.add("Maximum length for Family/Relative Name is 100");
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
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		OPDVisitRelPresVo clone = new OPDVisitRelPresVo(this.id, this.version);
		
		if(this.relrelationship == null)
			clone.relrelationship = null;
		else
			clone.relrelationship = (ims.core.vo.lookups.PersonRelationship)this.relrelationship.clone();
		clone.relname = this.relname;
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
		if (!(OPDVisitRelPresVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A OPDVisitRelPresVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		OPDVisitRelPresVo compareObj = (OPDVisitRelPresVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_OPDRelPres() == null && compareObj.getID_OPDRelPres() != null)
				return -1;
			if(this.getID_OPDRelPres() != null && compareObj.getID_OPDRelPres() == null)
				return 1;
			if(this.getID_OPDRelPres() != null && compareObj.getID_OPDRelPres() != null)
				retVal = this.getID_OPDRelPres().compareTo(compareObj.getID_OPDRelPres());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.relrelationship != null)
			count++;
		if(this.relname != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.core.vo.lookups.PersonRelationship relrelationship;
	protected String relname;
	private boolean isValidated = false;
	private boolean isBusy = false;
}