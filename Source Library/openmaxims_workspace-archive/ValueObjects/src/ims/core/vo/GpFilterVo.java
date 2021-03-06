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


public class GpFilterVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public GpFilterVo()
	{
	}
	public GpFilterVo(ims.core.vo.beans.GpFilterVoBean bean)
	{
		this.surname = bean.getSurname();
		this.forename = bean.getForename();
		this.practicename = bean.getPracticeName();
		this.gpcodemapping = bean.getGPCodeMapping() == null ? null : bean.getGPCodeMapping().buildVo();
		this.practicecodemapping = bean.getPracticeCodeMapping() == null ? null : bean.getPracticeCodeMapping().buildVo();
		this.practices = ims.core.vo.GpToPracticesVoCollection.buildFromBeanCollection(bean.getPractices());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.GpFilterVoBean bean)
	{
		this.surname = bean.getSurname();
		this.forename = bean.getForename();
		this.practicename = bean.getPracticeName();
		this.gpcodemapping = bean.getGPCodeMapping() == null ? null : bean.getGPCodeMapping().buildVo(map);
		this.practicecodemapping = bean.getPracticeCodeMapping() == null ? null : bean.getPracticeCodeMapping().buildVo(map);
		this.practices = ims.core.vo.GpToPracticesVoCollection.buildFromBeanCollection(bean.getPractices());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.GpFilterVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.GpFilterVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.GpFilterVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getSurnameIsNotNull()
	{
		return this.surname != null;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public static int getSurnameMaxLength()
	{
		return 255;
	}
	public void setSurname(String value)
	{
		this.isValidated = false;
		this.surname = value;
	}
	public boolean getForenameIsNotNull()
	{
		return this.forename != null;
	}
	public String getForename()
	{
		return this.forename;
	}
	public static int getForenameMaxLength()
	{
		return 255;
	}
	public void setForename(String value)
	{
		this.isValidated = false;
		this.forename = value;
	}
	public boolean getPracticeNameIsNotNull()
	{
		return this.practicename != null;
	}
	public String getPracticeName()
	{
		return this.practicename;
	}
	public static int getPracticeNameMaxLength()
	{
		return 255;
	}
	public void setPracticeName(String value)
	{
		this.isValidated = false;
		this.practicename = value;
	}
	public boolean getGPCodeMappingIsNotNull()
	{
		return this.gpcodemapping != null;
	}
	public ims.core.vo.TaxonomyMap getGPCodeMapping()
	{
		return this.gpcodemapping;
	}
	public void setGPCodeMapping(ims.core.vo.TaxonomyMap value)
	{
		this.isValidated = false;
		this.gpcodemapping = value;
	}
	public boolean getPracticeCodeMappingIsNotNull()
	{
		return this.practicecodemapping != null;
	}
	public ims.core.vo.TaxonomyMap getPracticeCodeMapping()
	{
		return this.practicecodemapping;
	}
	public void setPracticeCodeMapping(ims.core.vo.TaxonomyMap value)
	{
		this.isValidated = false;
		this.practicecodemapping = value;
	}
	public boolean getPracticesIsNotNull()
	{
		return this.practices != null;
	}
	public ims.core.vo.GpToPracticesVoCollection getPractices()
	{
		return this.practices;
	}
	public void setPractices(ims.core.vo.GpToPracticesVoCollection value)
	{
		this.isValidated = false;
		this.practices = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof GpFilterVo))
			return false;
		GpFilterVo compareObj = (GpFilterVo)obj;
		if(this.getSurname() == null && compareObj.getSurname() != null)
			return false;
		if(this.getSurname() != null && compareObj.getSurname() == null)
			return false;
		if(this.getSurname() != null && compareObj.getSurname() != null)
			return this.getSurname().equals(compareObj.getSurname());
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
		if(this.gpcodemapping != null)
		{
			if(!this.gpcodemapping.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.practicecodemapping != null)
		{
			if(!this.practicecodemapping.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.practices != null)
		{
			if(!this.practices.isValidated())
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
		if(this.gpcodemapping != null)
		{
			String[] listOfOtherErrors = this.gpcodemapping.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.practicecodemapping != null)
		{
			String[] listOfOtherErrors = this.practicecodemapping.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.practices != null)
		{
			String[] listOfOtherErrors = this.practices.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
	
		GpFilterVo clone = new GpFilterVo();
		
		clone.surname = this.surname;
		clone.forename = this.forename;
		clone.practicename = this.practicename;
		if(this.gpcodemapping == null)
			clone.gpcodemapping = null;
		else
			clone.gpcodemapping = (ims.core.vo.TaxonomyMap)this.gpcodemapping.clone();
		if(this.practicecodemapping == null)
			clone.practicecodemapping = null;
		else
			clone.practicecodemapping = (ims.core.vo.TaxonomyMap)this.practicecodemapping.clone();
		if(this.practices == null)
			clone.practices = null;
		else
			clone.practices = (ims.core.vo.GpToPracticesVoCollection)this.practices.clone();
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
		if (!(GpFilterVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A GpFilterVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		GpFilterVo compareObj = (GpFilterVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSurname() == null && compareObj.getSurname() != null)
				return -1;
			if(this.getSurname() != null && compareObj.getSurname() == null)
				return 1;
			if(this.getSurname() != null && compareObj.getSurname() != null)
			{
				if(caseInsensitive)
					retVal = this.getSurname().toLowerCase().compareTo(compareObj.getSurname().toLowerCase());
				else
					retVal = this.getSurname().compareTo(compareObj.getSurname());
			}
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
		if(this.surname != null)
			count++;
		if(this.forename != null)
			count++;
		if(this.practicename != null)
			count++;
		if(this.gpcodemapping != null)
			count++;
		if(this.practicecodemapping != null)
			count++;
		if(this.practices != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected String surname;
	protected String forename;
	protected String practicename;
	protected ims.core.vo.TaxonomyMap gpcodemapping;
	protected ims.core.vo.TaxonomyMap practicecodemapping;
	protected ims.core.vo.GpToPracticesVoCollection practices;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
