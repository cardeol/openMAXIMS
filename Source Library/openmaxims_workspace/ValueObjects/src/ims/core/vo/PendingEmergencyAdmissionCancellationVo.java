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

package ims.core.vo;

/**
 * Linked to core.admin.pas.PendingNoEDEmergencyAdmit business object (ID: 1014100027).
 */
public class PendingEmergencyAdmissionCancellationVo extends ims.core.admin.pas.vo.PendingNoEDEmergencyAdmitRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PendingEmergencyAdmissionCancellationVo()
	{
	}
	public PendingEmergencyAdmissionCancellationVo(Integer id, int version)
	{
		super(id, version);
	}
	public PendingEmergencyAdmissionCancellationVo(ims.core.vo.beans.PendingEmergencyAdmissionCancellationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.type = bean.getType() == null ? null : ims.core.vo.lookups.PendingEmergencyAdmissionType.buildLookup(bean.getType());
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo();
		this.statushistory = ims.core.vo.PendingEmergencyAdmissionStatusVoCollection.buildFromBeanCollection(bean.getStatusHistory());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PendingEmergencyAdmissionCancellationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.type = bean.getType() == null ? null : ims.core.vo.lookups.PendingEmergencyAdmissionType.buildLookup(bean.getType());
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo(map);
		this.statushistory = ims.core.vo.PendingEmergencyAdmissionStatusVoCollection.buildFromBeanCollection(bean.getStatusHistory());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PendingEmergencyAdmissionCancellationVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PendingEmergencyAdmissionCancellationVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PendingEmergencyAdmissionCancellationVoBean();
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
		if(fieldName.equals("TYPE"))
			return getType();
		if(fieldName.equals("CURRENTSTATUS"))
			return getCurrentStatus();
		if(fieldName.equals("STATUSHISTORY"))
			return getStatusHistory();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTypeIsNotNull()
	{
		return this.type != null;
	}
	public ims.core.vo.lookups.PendingEmergencyAdmissionType getType()
	{
		return this.type;
	}
	public void setType(ims.core.vo.lookups.PendingEmergencyAdmissionType value)
	{
		this.isValidated = false;
		this.type = value;
	}
	public boolean getCurrentStatusIsNotNull()
	{
		return this.currentstatus != null;
	}
	public ims.core.vo.PendingEmergencyAdmissionStatusVo getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.core.vo.PendingEmergencyAdmissionStatusVo value)
	{
		this.isValidated = false;
		this.currentstatus = value;
	}
	public boolean getStatusHistoryIsNotNull()
	{
		return this.statushistory != null;
	}
	public ims.core.vo.PendingEmergencyAdmissionStatusVoCollection getStatusHistory()
	{
		return this.statushistory;
	}
	public void setStatusHistory(ims.core.vo.PendingEmergencyAdmissionStatusVoCollection value)
	{
		this.isValidated = false;
		this.statushistory = value;
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
		if(this.currentstatus != null)
		{
			if(!this.currentstatus.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.statushistory != null)
		{
			if(!this.statushistory.isValidated())
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
		if(this.type == null)
			listOfErrors.add("Type is mandatory");
		if(this.currentstatus == null)
			listOfErrors.add("CurrentStatus is mandatory");
		if(this.currentstatus != null)
		{
			String[] listOfOtherErrors = this.currentstatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.statushistory == null || this.statushistory.size() == 0)
			listOfErrors.add("StatusHistory are mandatory");
		if(this.statushistory != null)
		{
			String[] listOfOtherErrors = this.statushistory.validate();
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
	
		PendingEmergencyAdmissionCancellationVo clone = new PendingEmergencyAdmissionCancellationVo(this.id, this.version);
		
		if(this.type == null)
			clone.type = null;
		else
			clone.type = (ims.core.vo.lookups.PendingEmergencyAdmissionType)this.type.clone();
		if(this.currentstatus == null)
			clone.currentstatus = null;
		else
			clone.currentstatus = (ims.core.vo.PendingEmergencyAdmissionStatusVo)this.currentstatus.clone();
		if(this.statushistory == null)
			clone.statushistory = null;
		else
			clone.statushistory = (ims.core.vo.PendingEmergencyAdmissionStatusVoCollection)this.statushistory.clone();
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
		if (!(PendingEmergencyAdmissionCancellationVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PendingEmergencyAdmissionCancellationVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PendingEmergencyAdmissionCancellationVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PendingEmergencyAdmissionCancellationVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.type != null)
			count++;
		if(this.currentstatus != null)
			count++;
		if(this.statushistory != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.core.vo.lookups.PendingEmergencyAdmissionType type;
	protected ims.core.vo.PendingEmergencyAdmissionStatusVo currentstatus;
	protected ims.core.vo.PendingEmergencyAdmissionStatusVoCollection statushistory;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
