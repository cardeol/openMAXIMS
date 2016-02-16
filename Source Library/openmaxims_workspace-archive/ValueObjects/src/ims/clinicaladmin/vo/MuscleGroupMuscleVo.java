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

package ims.clinicaladmin.vo;

/**
 * Linked to therapies.MuscleGroupMuscle business object (ID: 1030100008).
 */
public class MuscleGroupMuscleVo extends ims.therapies.vo.MuscleGroupMuscleRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public MuscleGroupMuscleVo()
	{
	}
	public MuscleGroupMuscleVo(Integer id, int version)
	{
		super(id, version);
	}
	public MuscleGroupMuscleVo(ims.clinicaladmin.vo.beans.MuscleGroupMuscleVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.muscle = bean.getMuscle() == null ? null : bean.getMuscle().buildVo();
		this.muslcegroup = bean.getMuslceGroup() == null ? null : new ims.therapies.vo.MuscleGroupRefVo(new Integer(bean.getMuslceGroup().getId()), bean.getMuslceGroup().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.beans.MuscleGroupMuscleVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.muscle = bean.getMuscle() == null ? null : bean.getMuscle().buildVo(map);
		this.muslcegroup = bean.getMuslceGroup() == null ? null : new ims.therapies.vo.MuscleGroupRefVo(new Integer(bean.getMuslceGroup().getId()), bean.getMuslceGroup().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.beans.MuscleGroupMuscleVoBean bean = null;
		if(map != null)
			bean = (ims.clinicaladmin.vo.beans.MuscleGroupMuscleVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinicaladmin.vo.beans.MuscleGroupMuscleVoBean();
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
		if(fieldName.equals("MUSCLE"))
			return getMuscle();
		if(fieldName.equals("MUSLCEGROUP"))
			return getMuslceGroup();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getMuscleIsNotNull()
	{
		return this.muscle != null;
	}
	public ims.clinicaladmin.vo.MuscleVo getMuscle()
	{
		return this.muscle;
	}
	public void setMuscle(ims.clinicaladmin.vo.MuscleVo value)
	{
		this.isValidated = false;
		this.muscle = value;
	}
	public boolean getMuslceGroupIsNotNull()
	{
		return this.muslcegroup != null;
	}
	public ims.therapies.vo.MuscleGroupRefVo getMuslceGroup()
	{
		return this.muslcegroup;
	}
	public void setMuslceGroup(ims.therapies.vo.MuscleGroupRefVo value)
	{
		this.isValidated = false;
		this.muslcegroup = value;
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
		if(this.muscle != null)
		{
			if(!this.muscle.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.muscle == null)
			listOfErrors.add("Muscle is mandatory");
		if(this.muscle != null)
		{
			String[] listOfOtherErrors = this.muscle.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.muslcegroup == null)
			listOfErrors.add("MuslceGroup is mandatory");
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
	
		MuscleGroupMuscleVo clone = new MuscleGroupMuscleVo(this.id, this.version);
		
		if(this.muscle == null)
			clone.muscle = null;
		else
			clone.muscle = (ims.clinicaladmin.vo.MuscleVo)this.muscle.clone();
		clone.muslcegroup = this.muslcegroup;
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
		if (!(MuscleGroupMuscleVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A MuscleGroupMuscleVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((MuscleGroupMuscleVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((MuscleGroupMuscleVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.muscle != null)
			count++;
		if(this.muslcegroup != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.clinicaladmin.vo.MuscleVo muscle;
	protected ims.therapies.vo.MuscleGroupRefVo muslcegroup;
	private boolean isValidated = false;
	private boolean isBusy = false;
}