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


public class RCHTInpatientDischargeVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public RCHTInpatientDischargeVo()
	{
	}
	public RCHTInpatientDischargeVo(ims.core.vo.beans.RCHTInpatientDischargeVoBean bean)
	{
		this.methodofdischarge = bean.getMethodOfDischarge() == null ? null : ims.core.vo.lookups.MethodOfDischarge.buildLookup(bean.getMethodOfDischarge());
		this.dischargedestination = bean.getDischargeDestination() == null ? null : ims.coe.vo.lookups.DischargeDestination.buildLookup(bean.getDischargeDestination());
		this.dischargedatetime = bean.getDischargeDateTime() == null ? null : bean.getDischargeDateTime().buildDateTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.RCHTInpatientDischargeVoBean bean)
	{
		this.methodofdischarge = bean.getMethodOfDischarge() == null ? null : ims.core.vo.lookups.MethodOfDischarge.buildLookup(bean.getMethodOfDischarge());
		this.dischargedestination = bean.getDischargeDestination() == null ? null : ims.coe.vo.lookups.DischargeDestination.buildLookup(bean.getDischargeDestination());
		this.dischargedatetime = bean.getDischargeDateTime() == null ? null : bean.getDischargeDateTime().buildDateTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.RCHTInpatientDischargeVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.RCHTInpatientDischargeVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.RCHTInpatientDischargeVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getMethodOfDischargeIsNotNull()
	{
		return this.methodofdischarge != null;
	}
	public ims.core.vo.lookups.MethodOfDischarge getMethodOfDischarge()
	{
		return this.methodofdischarge;
	}
	public void setMethodOfDischarge(ims.core.vo.lookups.MethodOfDischarge value)
	{
		this.isValidated = false;
		this.methodofdischarge = value;
	}
	public boolean getDischargeDestinationIsNotNull()
	{
		return this.dischargedestination != null;
	}
	public ims.coe.vo.lookups.DischargeDestination getDischargeDestination()
	{
		return this.dischargedestination;
	}
	public void setDischargeDestination(ims.coe.vo.lookups.DischargeDestination value)
	{
		this.isValidated = false;
		this.dischargedestination = value;
	}
	public boolean getDischargeDateTimeIsNotNull()
	{
		return this.dischargedatetime != null;
	}
	public ims.framework.utils.DateTime getDischargeDateTime()
	{
		return this.dischargedatetime;
	}
	public void setDischargeDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.dischargedatetime = value;
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
		if(!(obj instanceof RCHTInpatientDischargeVo))
			return false;
		RCHTInpatientDischargeVo compareObj = (RCHTInpatientDischargeVo)obj;
		if(this.getMethodOfDischarge() == null && compareObj.getMethodOfDischarge() != null)
			return false;
		if(this.getMethodOfDischarge() != null && compareObj.getMethodOfDischarge() == null)
			return false;
		if(this.getMethodOfDischarge() != null && compareObj.getMethodOfDischarge() != null)
			if(!this.getMethodOfDischarge().equals(compareObj.getMethodOfDischarge()))
				return false;
		if(this.getDischargeDestination() == null && compareObj.getDischargeDestination() != null)
			return false;
		if(this.getDischargeDestination() != null && compareObj.getDischargeDestination() == null)
			return false;
		if(this.getDischargeDestination() != null && compareObj.getDischargeDestination() != null)
			if(!this.getDischargeDestination().equals(compareObj.getDischargeDestination()))
				return false;
		if(this.getDischargeDateTime() == null && compareObj.getDischargeDateTime() != null)
			return false;
		if(this.getDischargeDateTime() != null && compareObj.getDischargeDateTime() == null)
			return false;
		if(this.getDischargeDateTime() != null && compareObj.getDischargeDateTime() != null)
			return this.getDischargeDateTime().equals(compareObj.getDischargeDateTime());
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
	
		RCHTInpatientDischargeVo clone = new RCHTInpatientDischargeVo();
		
		if(this.methodofdischarge == null)
			clone.methodofdischarge = null;
		else
			clone.methodofdischarge = (ims.core.vo.lookups.MethodOfDischarge)this.methodofdischarge.clone();
		if(this.dischargedestination == null)
			clone.dischargedestination = null;
		else
			clone.dischargedestination = (ims.coe.vo.lookups.DischargeDestination)this.dischargedestination.clone();
		if(this.dischargedatetime == null)
			clone.dischargedatetime = null;
		else
			clone.dischargedatetime = (ims.framework.utils.DateTime)this.dischargedatetime.clone();
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
		if (!(RCHTInpatientDischargeVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A RCHTInpatientDischargeVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		RCHTInpatientDischargeVo compareObj = (RCHTInpatientDischargeVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getMethodOfDischarge() == null && compareObj.getMethodOfDischarge() != null)
				return -1;
			if(this.getMethodOfDischarge() != null && compareObj.getMethodOfDischarge() == null)
				return 1;
			if(this.getMethodOfDischarge() != null && compareObj.getMethodOfDischarge() != null)
				retVal = this.getMethodOfDischarge().compareTo(compareObj.getMethodOfDischarge());
		}
		if (retVal == 0)
		{
			if(this.getDischargeDestination() == null && compareObj.getDischargeDestination() != null)
				return -1;
			if(this.getDischargeDestination() != null && compareObj.getDischargeDestination() == null)
				return 1;
			if(this.getDischargeDestination() != null && compareObj.getDischargeDestination() != null)
				retVal = this.getDischargeDestination().compareTo(compareObj.getDischargeDestination());
		}
		if (retVal == 0)
		{
			if(this.getDischargeDateTime() == null && compareObj.getDischargeDateTime() != null)
				return -1;
			if(this.getDischargeDateTime() != null && compareObj.getDischargeDateTime() == null)
				return 1;
			if(this.getDischargeDateTime() != null && compareObj.getDischargeDateTime() != null)
				retVal = this.getDischargeDateTime().compareTo(compareObj.getDischargeDateTime());
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
		if(this.methodofdischarge != null)
			count++;
		if(this.dischargedestination != null)
			count++;
		if(this.dischargedatetime != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.core.vo.lookups.MethodOfDischarge methodofdischarge;
	protected ims.coe.vo.lookups.DischargeDestination dischargedestination;
	protected ims.framework.utils.DateTime dischargedatetime;
	private boolean isValidated = false;
	private boolean isBusy = false;
}