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

package ims.admin.vo;

/**
 * Linked to core.admin.ClinicianSpecialtiesConfig business object (ID: 1004100041).
 */
public class ClinicianSpecialtiesConfigVo extends ims.core.admin.vo.ClinicianSpecialtiesConfigRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ClinicianSpecialtiesConfigVo()
	{
	}
	public ClinicianSpecialtiesConfigVo(Integer id, int version)
	{
		super(id, version);
	}
	public ClinicianSpecialtiesConfigVo(ims.admin.vo.beans.ClinicianSpecialtiesConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hcp = bean.getHCP() == null ? null : new ims.core.resource.people.vo.HcpRefVo(new Integer(bean.getHCP().getId()), bean.getHCP().getVersion());
		this.specialties = ims.core.vo.lookups.SpecialtyCollection.buildFromBeanCollection(bean.getSpecialties());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.beans.ClinicianSpecialtiesConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hcp = bean.getHCP() == null ? null : new ims.core.resource.people.vo.HcpRefVo(new Integer(bean.getHCP().getId()), bean.getHCP().getVersion());
		this.specialties = ims.core.vo.lookups.SpecialtyCollection.buildFromBeanCollection(bean.getSpecialties());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.beans.ClinicianSpecialtiesConfigVoBean bean = null;
		if(map != null)
			bean = (ims.admin.vo.beans.ClinicianSpecialtiesConfigVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.admin.vo.beans.ClinicianSpecialtiesConfigVoBean();
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
		if(fieldName.equals("HCP"))
			return getHCP();
		if(fieldName.equals("SPECIALTIES"))
			return getSpecialties();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getHCPIsNotNull()
	{
		return this.hcp != null;
	}
	public ims.core.resource.people.vo.HcpRefVo getHCP()
	{
		return this.hcp;
	}
	public void setHCP(ims.core.resource.people.vo.HcpRefVo value)
	{
		this.isValidated = false;
		this.hcp = value;
	}
	public boolean getSpecialtiesIsNotNull()
	{
		return this.specialties != null;
	}
	public ims.core.vo.lookups.SpecialtyCollection getSpecialties()
	{
		return this.specialties;
	}
	public void setSpecialties(ims.core.vo.lookups.SpecialtyCollection value)
	{
		this.isValidated = false;
		this.specialties = value;
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
		if(this.hcp == null)
			listOfErrors.add("HCP is mandatory");
		if(this.specialties == null || this.specialties.size() == 0)
			listOfErrors.add("Specialties are mandatory");
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
	
		ClinicianSpecialtiesConfigVo clone = new ClinicianSpecialtiesConfigVo(this.id, this.version);
		
		clone.hcp = this.hcp;
		if(this.specialties == null)
			clone.specialties = null;
		else
			clone.specialties = (ims.core.vo.lookups.SpecialtyCollection)this.specialties.clone();
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
		if (!(ClinicianSpecialtiesConfigVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ClinicianSpecialtiesConfigVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ClinicianSpecialtiesConfigVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ClinicianSpecialtiesConfigVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.hcp != null)
			count++;
		if(this.specialties != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.core.resource.people.vo.HcpRefVo hcp;
	protected ims.core.vo.lookups.SpecialtyCollection specialties;
	private boolean isValidated = false;
	private boolean isBusy = false;
}