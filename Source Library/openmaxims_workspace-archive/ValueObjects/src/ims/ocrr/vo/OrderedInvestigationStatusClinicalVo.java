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

package ims.ocrr.vo;

/**
 * Linked to OCRR.OrderingResults.OrderedInvestigationStatus business object (ID: 1070100011).
 */
public class OrderedInvestigationStatusClinicalVo extends ims.ocrr.orderingresults.vo.OrderedInvestigationStatusRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public OrderedInvestigationStatusClinicalVo()
	{
	}
	public OrderedInvestigationStatusClinicalVo(Integer id, int version)
	{
		super(id, version);
	}
	public OrderedInvestigationStatusClinicalVo(ims.ocrr.vo.beans.OrderedInvestigationStatusClinicalVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.ordinvstatus = bean.getOrdInvStatus() == null ? null : ims.ocrr.vo.lookups.OrderInvStatus.buildLookup(bean.getOrdInvStatus());
		this.changedatetime = bean.getChangeDateTime() == null ? null : bean.getChangeDateTime().buildDateTime();
		this.changeuser = bean.getChangeUser();
		this.statusreason = bean.getStatusReason();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.OrderedInvestigationStatusClinicalVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.ordinvstatus = bean.getOrdInvStatus() == null ? null : ims.ocrr.vo.lookups.OrderInvStatus.buildLookup(bean.getOrdInvStatus());
		this.changedatetime = bean.getChangeDateTime() == null ? null : bean.getChangeDateTime().buildDateTime();
		this.changeuser = bean.getChangeUser();
		this.statusreason = bean.getStatusReason();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.OrderedInvestigationStatusClinicalVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.OrderedInvestigationStatusClinicalVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.OrderedInvestigationStatusClinicalVoBean();
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
		if(fieldName.equals("ORDINVSTATUS"))
			return getOrdInvStatus();
		if(fieldName.equals("CHANGEDATETIME"))
			return getChangeDateTime();
		if(fieldName.equals("CHANGEUSER"))
			return getChangeUser();
		if(fieldName.equals("STATUSREASON"))
			return getStatusReason();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getOrdInvStatusIsNotNull()
	{
		return this.ordinvstatus != null;
	}
	public ims.ocrr.vo.lookups.OrderInvStatus getOrdInvStatus()
	{
		return this.ordinvstatus;
	}
	public void setOrdInvStatus(ims.ocrr.vo.lookups.OrderInvStatus value)
	{
		this.isValidated = false;
		this.ordinvstatus = value;
	}
	public boolean getChangeDateTimeIsNotNull()
	{
		return this.changedatetime != null;
	}
	public ims.framework.utils.DateTime getChangeDateTime()
	{
		return this.changedatetime;
	}
	public void setChangeDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.changedatetime = value;
	}
	public boolean getChangeUserIsNotNull()
	{
		return this.changeuser != null;
	}
	public String getChangeUser()
	{
		return this.changeuser;
	}
	public static int getChangeUserMaxLength()
	{
		return 255;
	}
	public void setChangeUser(String value)
	{
		this.isValidated = false;
		this.changeuser = value;
	}
	public boolean getStatusReasonIsNotNull()
	{
		return this.statusreason != null;
	}
	public String getStatusReason()
	{
		return this.statusreason;
	}
	public static int getStatusReasonMaxLength()
	{
		return 500;
	}
	public void setStatusReason(String value)
	{
		this.isValidated = false;
		this.statusreason = value;
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
		if(this.changeuser != null)
			if(this.changeuser.length() > 255)
				listOfErrors.add("The length of the field [changeuser] in the value object [ims.ocrr.vo.OrderedInvestigationStatusClinicalVo] is too big. It should be less or equal to 255");
		if(this.statusreason != null)
			if(this.statusreason.length() > 500)
				listOfErrors.add("The length of the field [statusreason] in the value object [ims.ocrr.vo.OrderedInvestigationStatusClinicalVo] is too big. It should be less or equal to 500");
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
	
		OrderedInvestigationStatusClinicalVo clone = new OrderedInvestigationStatusClinicalVo(this.id, this.version);
		
		if(this.ordinvstatus == null)
			clone.ordinvstatus = null;
		else
			clone.ordinvstatus = (ims.ocrr.vo.lookups.OrderInvStatus)this.ordinvstatus.clone();
		if(this.changedatetime == null)
			clone.changedatetime = null;
		else
			clone.changedatetime = (ims.framework.utils.DateTime)this.changedatetime.clone();
		clone.changeuser = this.changeuser;
		clone.statusreason = this.statusreason;
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
		if (!(OrderedInvestigationStatusClinicalVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A OrderedInvestigationStatusClinicalVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((OrderedInvestigationStatusClinicalVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((OrderedInvestigationStatusClinicalVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.ordinvstatus != null)
			count++;
		if(this.changedatetime != null)
			count++;
		if(this.changeuser != null)
			count++;
		if(this.statusreason != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.ocrr.vo.lookups.OrderInvStatus ordinvstatus;
	protected ims.framework.utils.DateTime changedatetime;
	protected String changeuser;
	protected String statusreason;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
