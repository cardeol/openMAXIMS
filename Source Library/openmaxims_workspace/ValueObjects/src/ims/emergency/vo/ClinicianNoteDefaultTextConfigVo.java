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

package ims.emergency.vo;

/**
 * Linked to emergency.Configuration.ClinicianNoteDefaultTextConfig business object (ID: 1087100006).
 */
public class ClinicianNoteDefaultTextConfigVo extends ims.emergency.configuration.vo.ClinicianNoteDefaultTextConfigRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ClinicianNoteDefaultTextConfigVo()
	{
	}
	public ClinicianNoteDefaultTextConfigVo(Integer id, int version)
	{
		super(id, version);
	}
	public ClinicianNoteDefaultTextConfigVo(ims.emergency.vo.beans.ClinicianNoteDefaultTextConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.problem = bean.getProblem() == null ? null : bean.getProblem().buildVo();
		this.defaultcliniciannote = bean.getDefaultClinicianNote();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.ClinicianNoteDefaultTextConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.problem = bean.getProblem() == null ? null : bean.getProblem().buildVo(map);
		this.defaultcliniciannote = bean.getDefaultClinicianNote();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.ClinicianNoteDefaultTextConfigVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.ClinicianNoteDefaultTextConfigVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.ClinicianNoteDefaultTextConfigVoBean();
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
		if(fieldName.equals("PROBLEM"))
			return getProblem();
		if(fieldName.equals("DEFAULTCLINICIANNOTE"))
			return getDefaultClinicianNote();
		if(fieldName.equals("STATUS"))
			return getStatus();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getProblemIsNotNull()
	{
		return this.problem != null;
	}
	public ims.clinical.vo.ClinicalProblemVo getProblem()
	{
		return this.problem;
	}
	public void setProblem(ims.clinical.vo.ClinicalProblemVo value)
	{
		this.isValidated = false;
		this.problem = value;
	}
	public boolean getDefaultClinicianNoteIsNotNull()
	{
		return this.defaultcliniciannote != null;
	}
	public String getDefaultClinicianNote()
	{
		return this.defaultcliniciannote;
	}
	public static int getDefaultClinicianNoteMaxLength()
	{
		return 5000;
	}
	public void setDefaultClinicianNote(String value)
	{
		this.isValidated = false;
		this.defaultcliniciannote = value;
	}
	public boolean getStatusIsNotNull()
	{
		return this.status != null;
	}
	public ims.core.vo.lookups.PreActiveActiveInactiveStatus getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.core.vo.lookups.PreActiveActiveInactiveStatus value)
	{
		this.isValidated = false;
		this.status = value;
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
		if(this.problem == null)
			listOfErrors.add("Problem is mandatory");
		if(this.defaultcliniciannote == null || this.defaultcliniciannote.length() == 0)
			listOfErrors.add("DefaultClinicianNote is mandatory");
		if(this.status == null)
			listOfErrors.add("Status is mandatory");
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
	
		ClinicianNoteDefaultTextConfigVo clone = new ClinicianNoteDefaultTextConfigVo(this.id, this.version);
		
		if(this.problem == null)
			clone.problem = null;
		else
			clone.problem = (ims.clinical.vo.ClinicalProblemVo)this.problem.clone();
		clone.defaultcliniciannote = this.defaultcliniciannote;
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.status.clone();
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
		if (!(ClinicianNoteDefaultTextConfigVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ClinicianNoteDefaultTextConfigVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ClinicianNoteDefaultTextConfigVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ClinicianNoteDefaultTextConfigVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.problem != null)
			count++;
		if(this.defaultcliniciannote != null)
			count++;
		if(this.status != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.clinical.vo.ClinicalProblemVo problem;
	protected String defaultcliniciannote;
	protected ims.core.vo.lookups.PreActiveActiveInactiveStatus status;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
