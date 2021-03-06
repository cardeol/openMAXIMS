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
 * Linked to core.layout.BayConfig business object (ID: 1095100004).
 */
public class BayConfigListVo extends ims.core.layout.vo.BayConfigRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public BayConfigListVo()
	{
	}
	public BayConfigListVo(Integer id, int version)
	{
		super(id, version);
	}
	public BayConfigListVo(ims.core.vo.beans.BayConfigListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.bay = bean.getBay() == null ? null : bean.getBay().buildVo();
		this.isactive = bean.getIsActive();
		this.openingtime = bean.getOpeningTime() == null ? null : bean.getOpeningTime().buildTime();
		this.closingtime = bean.getClosingTime() == null ? null : bean.getClosingTime().buildTime();
		this.weekdaysonly = bean.getWeekdaysOnly();
		this.reopenoutofhours = ims.core.vo.ReopenBayOutOfHoursVoCollection.buildFromBeanCollection(bean.getReOpenOutOfHours());
		this.baystatus = bean.getBayStatus() == null ? null : ims.core.vo.lookups.WardBayStatus.buildLookup(bean.getBayStatus());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.BayConfigListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.bay = bean.getBay() == null ? null : bean.getBay().buildVo(map);
		this.isactive = bean.getIsActive();
		this.openingtime = bean.getOpeningTime() == null ? null : bean.getOpeningTime().buildTime();
		this.closingtime = bean.getClosingTime() == null ? null : bean.getClosingTime().buildTime();
		this.weekdaysonly = bean.getWeekdaysOnly();
		this.reopenoutofhours = ims.core.vo.ReopenBayOutOfHoursVoCollection.buildFromBeanCollection(bean.getReOpenOutOfHours());
		this.baystatus = bean.getBayStatus() == null ? null : ims.core.vo.lookups.WardBayStatus.buildLookup(bean.getBayStatus());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.BayConfigListVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.BayConfigListVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.BayConfigListVoBean();
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
		if(fieldName.equals("BAY"))
			return getBay();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		if(fieldName.equals("OPENINGTIME"))
			return getOpeningTime();
		if(fieldName.equals("CLOSINGTIME"))
			return getClosingTime();
		if(fieldName.equals("WEEKDAYSONLY"))
			return getWeekdaysOnly();
		if(fieldName.equals("REOPENOUTOFHOURS"))
			return getReOpenOutOfHours();
		if(fieldName.equals("BAYSTATUS"))
			return getBayStatus();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getBayIsNotNull()
	{
		return this.bay != null;
	}
	public ims.core.vo.LocationMinVo getBay()
	{
		return this.bay;
	}
	public void setBay(ims.core.vo.LocationMinVo value)
	{
		this.isValidated = false;
		this.bay = value;
	}
	public boolean getIsActiveIsNotNull()
	{
		return this.isactive != null;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isValidated = false;
		this.isactive = value;
	}
	public boolean getOpeningTimeIsNotNull()
	{
		return this.openingtime != null;
	}
	public ims.framework.utils.Time getOpeningTime()
	{
		return this.openingtime;
	}
	public void setOpeningTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.openingtime = value;
	}
	public boolean getClosingTimeIsNotNull()
	{
		return this.closingtime != null;
	}
	public ims.framework.utils.Time getClosingTime()
	{
		return this.closingtime;
	}
	public void setClosingTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.closingtime = value;
	}
	public boolean getWeekdaysOnlyIsNotNull()
	{
		return this.weekdaysonly != null;
	}
	public Boolean getWeekdaysOnly()
	{
		return this.weekdaysonly;
	}
	public void setWeekdaysOnly(Boolean value)
	{
		this.isValidated = false;
		this.weekdaysonly = value;
	}
	public boolean getReOpenOutOfHoursIsNotNull()
	{
		return this.reopenoutofhours != null;
	}
	public ims.core.vo.ReopenBayOutOfHoursVoCollection getReOpenOutOfHours()
	{
		return this.reopenoutofhours;
	}
	public void setReOpenOutOfHours(ims.core.vo.ReopenBayOutOfHoursVoCollection value)
	{
		this.isValidated = false;
		this.reopenoutofhours = value;
	}
	public boolean getBayStatusIsNotNull()
	{
		return this.baystatus != null;
	}
	public ims.core.vo.lookups.WardBayStatus getBayStatus()
	{
		return this.baystatus;
	}
	public void setBayStatus(ims.core.vo.lookups.WardBayStatus value)
	{
		this.isValidated = false;
		this.baystatus = value;
	}
	/**
	* isBayOutOfOpeningHours()
	*/
	public boolean isBayOutOfOpeningHours()
	{
		if (ims.core.vo.lookups.WardBayStatus.CLOSED.equals(getBayStatus()) || ims.core.vo.lookups.WardBayStatus.BLOCKED.equals(getBayStatus()))
				return false;
	
		java.util.Calendar calendar = java.util.Calendar.getInstance();
		ims.framework.utils.Date lastReopenDate = this.getMostRecentReopenDate();
		
		boolean isCurrentDayWeekDay =  (java.util.Calendar.SUNDAY != calendar.get(java.util.Calendar.DAY_OF_WEEK) && java.util.Calendar.SATURDAY != calendar.get(java.util.Calendar.DAY_OF_WEEK));
		boolean isBayOutOfHours = (getOpeningTimeIsNotNull() && new ims.framework.utils.Time().isLessThan(getOpeningTime())) || (getClosingTimeIsNotNull() && new ims.framework.utils.Time().isGreaterThan(getClosingTime()));
		boolean wasReopenedToday = new ims.framework.utils.Date().equals(lastReopenDate);
			
		if (isBayOutOfHours && wasReopenedToday)
			return false;
			
		if (java.lang.Boolean.TRUE.equals(this.getWeekdaysOnly()) && !isCurrentDayWeekDay)
			return true;
		return isBayOutOfHours;
	}
	/**
	* getMostRecentReopenDate()
	*/
	public ims.framework.utils.Date getMostRecentReopenDate()
	{
		if (this.getReOpenOutOfHours() == null)
			return null;
			
		java.util.ArrayList<ims.framework.utils.Date> dates = new java.util.ArrayList<ims.framework.utils.Date>();
		for (int i=0;i<this.getReOpenOutOfHours().size();i++)
		{
			if (this.getReOpenOutOfHours().get(i) != null && this.getReOpenOutOfHours().get(i).getReopenDateIsNotNull())
				dates.add(this.getReOpenOutOfHours().get(i).getReopenDate());
		}
		return dates.size() > 0 ? java.util.Collections.max(dates) : null;		
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
		if(this.bay == null)
			listOfErrors.add("Bay is mandatory");
		if(this.isactive == null)
			listOfErrors.add("isActive is mandatory");
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
	
		BayConfigListVo clone = new BayConfigListVo(this.id, this.version);
		
		if(this.bay == null)
			clone.bay = null;
		else
			clone.bay = (ims.core.vo.LocationMinVo)this.bay.clone();
		clone.isactive = this.isactive;
		if(this.openingtime == null)
			clone.openingtime = null;
		else
			clone.openingtime = (ims.framework.utils.Time)this.openingtime.clone();
		if(this.closingtime == null)
			clone.closingtime = null;
		else
			clone.closingtime = (ims.framework.utils.Time)this.closingtime.clone();
		clone.weekdaysonly = this.weekdaysonly;
		if(this.reopenoutofhours == null)
			clone.reopenoutofhours = null;
		else
			clone.reopenoutofhours = (ims.core.vo.ReopenBayOutOfHoursVoCollection)this.reopenoutofhours.clone();
		if(this.baystatus == null)
			clone.baystatus = null;
		else
			clone.baystatus = (ims.core.vo.lookups.WardBayStatus)this.baystatus.clone();
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
		if (!(BayConfigListVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A BayConfigListVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((BayConfigListVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((BayConfigListVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.bay != null)
			count++;
		if(this.isactive != null)
			count++;
		if(this.openingtime != null)
			count++;
		if(this.closingtime != null)
			count++;
		if(this.weekdaysonly != null)
			count++;
		if(this.reopenoutofhours != null)
			count++;
		if(this.baystatus != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 7;
	}
	protected ims.core.vo.LocationMinVo bay;
	protected Boolean isactive;
	protected ims.framework.utils.Time openingtime;
	protected ims.framework.utils.Time closingtime;
	protected Boolean weekdaysonly;
	protected ims.core.vo.ReopenBayOutOfHoursVoCollection reopenoutofhours;
	protected ims.core.vo.lookups.WardBayStatus baystatus;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
