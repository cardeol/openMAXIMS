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

package ims.scheduling.vo;

/**
 * Linked to Scheduling.Sch_Session_Appointment_Order business object (ID: 1090100012).
 */
public class Sch_Session_Appointment_OrderVo extends ims.scheduling.vo.Sch_Session_Appointment_OrderRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public Sch_Session_Appointment_OrderVo()
	{
	}
	public Sch_Session_Appointment_OrderVo(Integer id, int version)
	{
		super(id, version);
	}
	public Sch_Session_Appointment_OrderVo(ims.scheduling.vo.beans.Sch_Session_Appointment_OrderVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.session = bean.getSession() == null ? null : bean.getSession().buildVo();
		this.appointments = ims.scheduling.vo.BookingAppointmentTheatreVoCollection.buildFromBeanCollection(bean.getAppointments());
		this.isfinalised = bean.getIsFinalised();
		// Interface field type not supported.
		this.finaliseddatetime = bean.getFinalisedDateTime() == null ? null : bean.getFinalisedDateTime().buildDateTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.Sch_Session_Appointment_OrderVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.session = bean.getSession() == null ? null : bean.getSession().buildVo(map);
		this.appointments = ims.scheduling.vo.BookingAppointmentTheatreVoCollection.buildFromBeanCollection(bean.getAppointments());
		this.isfinalised = bean.getIsFinalised();
		// Interface field type not supported.
		this.finaliseddatetime = bean.getFinalisedDateTime() == null ? null : bean.getFinalisedDateTime().buildDateTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.Sch_Session_Appointment_OrderVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.Sch_Session_Appointment_OrderVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.Sch_Session_Appointment_OrderVoBean();
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
		if(fieldName.equals("SESSION"))
			return getSession();
		if(fieldName.equals("APPOINTMENTS"))
			return getAppointments();
		if(fieldName.equals("ISFINALISED"))
			return getIsFinalised();
		if(fieldName.equals("FINALISEDBY"))
			return getFinalisedBy();
		if(fieldName.equals("FINALISEDDATETIME"))
			return getFinalisedDateTime();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSessionIsNotNull()
	{
		return this.session != null;
	}
	public ims.scheduling.vo.SessionTheatreVo getSession()
	{
		return this.session;
	}
	public void setSession(ims.scheduling.vo.SessionTheatreVo value)
	{
		this.isValidated = false;
		this.session = value;
	}
	public boolean getAppointmentsIsNotNull()
	{
		return this.appointments != null;
	}
	public ims.scheduling.vo.BookingAppointmentTheatreVoCollection getAppointments()
	{
		return this.appointments;
	}
	public void setAppointments(ims.scheduling.vo.BookingAppointmentTheatreVoCollection value)
	{
		this.isValidated = false;
		this.appointments = value;
	}
	public boolean getIsFinalisedIsNotNull()
	{
		return this.isfinalised != null;
	}
	public Boolean getIsFinalised()
	{
		return this.isfinalised;
	}
	public void setIsFinalised(Boolean value)
	{
		this.isValidated = false;
		this.isfinalised = value;
	}
	public boolean getFinalisedByIsNotNull()
	{
		return this.finalisedby != null;
	}
	public ims.vo.interfaces.IMos getFinalisedBy()
	{
		return this.finalisedby;
	}
	public void setFinalisedBy(ims.vo.interfaces.IMos value)
	{
		this.isValidated = false;
		this.finalisedby = (ims.core.vo.MemberOfStaffLiteVo)value;
	}
	public boolean getFinalisedDateTimeIsNotNull()
	{
		return this.finaliseddatetime != null;
	}
	public ims.framework.utils.DateTime getFinalisedDateTime()
	{
		return this.finaliseddatetime;
	}
	public void setFinalisedDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.finaliseddatetime = value;
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
		if(this.appointments != null)
		{
			if(!this.appointments.isValidated())
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
		if(this.appointments != null)
		{
			String[] listOfOtherErrors = this.appointments.validate();
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
	
		Sch_Session_Appointment_OrderVo clone = new Sch_Session_Appointment_OrderVo(this.id, this.version);
		
		if(this.session == null)
			clone.session = null;
		else
			clone.session = (ims.scheduling.vo.SessionTheatreVo)this.session.clone();
		if(this.appointments == null)
			clone.appointments = null;
		else
			clone.appointments = (ims.scheduling.vo.BookingAppointmentTheatreVoCollection)this.appointments.clone();
		clone.isfinalised = this.isfinalised;
		clone.finalisedby = this.finalisedby;
		if(this.finaliseddatetime == null)
			clone.finaliseddatetime = null;
		else
			clone.finaliseddatetime = (ims.framework.utils.DateTime)this.finaliseddatetime.clone();
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
		if (!(Sch_Session_Appointment_OrderVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A Sch_Session_Appointment_OrderVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((Sch_Session_Appointment_OrderVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((Sch_Session_Appointment_OrderVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.session != null)
			count++;
		if(this.appointments != null)
			count++;
		if(this.isfinalised != null)
			count++;
		if(this.finalisedby != null)
			count++;
		if(this.finaliseddatetime != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.scheduling.vo.SessionTheatreVo session;
	protected ims.scheduling.vo.BookingAppointmentTheatreVoCollection appointments;
	protected Boolean isfinalised;
	protected ims.core.vo.MemberOfStaffLiteVo finalisedby;
	protected ims.framework.utils.DateTime finaliseddatetime;
	private boolean isValidated = false;
	private boolean isBusy = false;
}