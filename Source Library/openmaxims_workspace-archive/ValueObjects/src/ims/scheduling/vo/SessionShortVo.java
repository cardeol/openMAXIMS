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
 * Linked to Scheduling.Sch_Session business object (ID: 1055100010).
 */
public class SessionShortVo extends ims.scheduling.vo.SessionIntermediateVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SessionShortVo()
	{
	}
	public SessionShortVo(Integer id, int version)
	{
		super(id, version);
	}
	public SessionShortVo(ims.scheduling.vo.beans.SessionShortVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.schlocation = bean.getSchLocation() == null ? null : bean.getSchLocation().buildVo();
		this.service = bean.getService() == null ? null : bean.getService().buildVo();
		this.remainingslots = bean.getRemainingSlots();
		this.totalslots = bean.getTotalSlots();
		this.theatretype = bean.getTheatreType() == null ? null : ims.scheduling.vo.lookups.TheatreType.buildLookup(bean.getTheatreType());
		this.isfixed = bean.getIsFixed();
		this.starttm = bean.getStartTm() == null ? null : bean.getStartTm().buildTime();
		this.endtm = bean.getEndTm() == null ? null : bean.getEndTm().buildTime();
		this.remainingtime = bean.getRemainingTime();
		this.sessiondate = bean.getSessionDate() == null ? null : bean.getSessionDate().buildDate();
		this.exclusiontimes = ims.scheduling.vo.Session_Exc_TimesVoCollection.buildFromBeanCollection(bean.getExclusionTimes());
		this.maxcontinuousavailablemins = bean.getMaxContinuousAvailableMins();
		this.consmediatype = bean.getConsMediaType() == null ? null : ims.scheduling.vo.lookups.ConsultationMediaType.buildLookup(bean.getConsMediaType());
		this.sessionstatus = bean.getSessionStatus() == null ? null : ims.scheduling.vo.lookups.Session_Status_and_Reason.buildLookup(bean.getSessionStatus());
		this.description = bean.getDescription();
		this.isactive = bean.getIsActive();
		this.pasclinic = bean.getPASClinic() == null ? null : ims.scheduling.vo.lookups.SchedPASClinic.buildLookup(bean.getPASClinic());
		this.istheatresession = bean.getIsTheatreSession();
		this.listowners = ims.scheduling.vo.Session_ListOwnerVoCollection.buildFromBeanCollection(bean.getListOwners());
		this.cancellationreason = bean.getCancellationReason() == null ? null : ims.scheduling.vo.lookups.CancelAppointmentReason.buildLookup(bean.getCancellationReason());
		this.comment = bean.getComment();
		this.wassessionmoved = bean.getWasSessionMoved();
		this.calendarslots = ims.scheduling.vo.SessionSlotWithStatusOnlyVoCollection.buildFromBeanCollection(bean.getCalendarSlots());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.SessionShortVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.name = bean.getName();
		this.schlocation = bean.getSchLocation() == null ? null : bean.getSchLocation().buildVo(map);
		this.service = bean.getService() == null ? null : bean.getService().buildVo(map);
		this.remainingslots = bean.getRemainingSlots();
		this.totalslots = bean.getTotalSlots();
		this.theatretype = bean.getTheatreType() == null ? null : ims.scheduling.vo.lookups.TheatreType.buildLookup(bean.getTheatreType());
		this.isfixed = bean.getIsFixed();
		this.starttm = bean.getStartTm() == null ? null : bean.getStartTm().buildTime();
		this.endtm = bean.getEndTm() == null ? null : bean.getEndTm().buildTime();
		this.remainingtime = bean.getRemainingTime();
		this.sessiondate = bean.getSessionDate() == null ? null : bean.getSessionDate().buildDate();
		this.exclusiontimes = ims.scheduling.vo.Session_Exc_TimesVoCollection.buildFromBeanCollection(bean.getExclusionTimes());
		this.maxcontinuousavailablemins = bean.getMaxContinuousAvailableMins();
		this.consmediatype = bean.getConsMediaType() == null ? null : ims.scheduling.vo.lookups.ConsultationMediaType.buildLookup(bean.getConsMediaType());
		this.sessionstatus = bean.getSessionStatus() == null ? null : ims.scheduling.vo.lookups.Session_Status_and_Reason.buildLookup(bean.getSessionStatus());
		this.description = bean.getDescription();
		this.isactive = bean.getIsActive();
		this.pasclinic = bean.getPASClinic() == null ? null : ims.scheduling.vo.lookups.SchedPASClinic.buildLookup(bean.getPASClinic());
		this.istheatresession = bean.getIsTheatreSession();
		this.listowners = ims.scheduling.vo.Session_ListOwnerVoCollection.buildFromBeanCollection(bean.getListOwners());
		this.cancellationreason = bean.getCancellationReason() == null ? null : ims.scheduling.vo.lookups.CancelAppointmentReason.buildLookup(bean.getCancellationReason());
		this.comment = bean.getComment();
		this.wassessionmoved = bean.getWasSessionMoved();
		this.calendarslots = ims.scheduling.vo.SessionSlotWithStatusOnlyVoCollection.buildFromBeanCollection(bean.getCalendarSlots());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.SessionShortVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.SessionShortVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.SessionShortVoBean();
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
		if(fieldName.equals("DESCRIPTION"))
			return getDescription();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		if(fieldName.equals("PASCLINIC"))
			return getPASClinic();
		if(fieldName.equals("ISTHEATRESESSION"))
			return getIsTheatreSession();
		if(fieldName.equals("LISTOWNERS"))
			return getListOwners();
		if(fieldName.equals("CANCELLATIONREASON"))
			return getCancellationReason();
		if(fieldName.equals("COMMENT"))
			return getComment();
		if(fieldName.equals("WASSESSIONMOVED"))
			return getWasSessionMoved();
		if(fieldName.equals("CALENDARSLOTS"))
			return getCalendarSlots();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getDescriptionIsNotNull()
	{
		return this.description != null;
	}
	public String getDescription()
	{
		return this.description;
	}
	public static int getDescriptionMaxLength()
	{
		return 255;
	}
	public void setDescription(String value)
	{
		this.isValidated = false;
		this.description = value;
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
	public boolean getPASClinicIsNotNull()
	{
		return this.pasclinic != null;
	}
	public ims.scheduling.vo.lookups.SchedPASClinic getPASClinic()
	{
		return this.pasclinic;
	}
	public void setPASClinic(ims.scheduling.vo.lookups.SchedPASClinic value)
	{
		this.isValidated = false;
		this.pasclinic = value;
	}
	public boolean getIsTheatreSessionIsNotNull()
	{
		return this.istheatresession != null;
	}
	public Boolean getIsTheatreSession()
	{
		return this.istheatresession;
	}
	public void setIsTheatreSession(Boolean value)
	{
		this.isValidated = false;
		this.istheatresession = value;
	}
	public boolean getListOwnersIsNotNull()
	{
		return this.listowners != null;
	}
	public ims.scheduling.vo.Session_ListOwnerVoCollection getListOwners()
	{
		return this.listowners;
	}
	public void setListOwners(ims.scheduling.vo.Session_ListOwnerVoCollection value)
	{
		this.isValidated = false;
		this.listowners = value;
	}
	public boolean getCancellationReasonIsNotNull()
	{
		return this.cancellationreason != null;
	}
	public ims.scheduling.vo.lookups.CancelAppointmentReason getCancellationReason()
	{
		return this.cancellationreason;
	}
	public void setCancellationReason(ims.scheduling.vo.lookups.CancelAppointmentReason value)
	{
		this.isValidated = false;
		this.cancellationreason = value;
	}
	public boolean getCommentIsNotNull()
	{
		return this.comment != null;
	}
	public String getComment()
	{
		return this.comment;
	}
	public static int getCommentMaxLength()
	{
		return 255;
	}
	public void setComment(String value)
	{
		this.isValidated = false;
		this.comment = value;
	}
	public boolean getWasSessionMovedIsNotNull()
	{
		return this.wassessionmoved != null;
	}
	public Boolean getWasSessionMoved()
	{
		return this.wassessionmoved;
	}
	public void setWasSessionMoved(Boolean value)
	{
		this.isValidated = false;
		this.wassessionmoved = value;
	}
	public boolean getCalendarSlotsIsNotNull()
	{
		return this.calendarslots != null;
	}
	public ims.scheduling.vo.SessionSlotWithStatusOnlyVoCollection getCalendarSlots()
	{
		return this.calendarslots;
	}
	public void setCalendarSlots(ims.scheduling.vo.SessionSlotWithStatusOnlyVoCollection value)
	{
		this.isValidated = false;
		this.calendarslots = value;
	}
	/**
	* toString
	*/
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
				
		if(this.sessiondate != null)
		{
			sb.append("Date: ");
			sb.append(this.sessiondate.toString());
		}
		if(this.name != null)
		{
			sb.append(", Name: ");
			sb.append(this.name);
		}
		if(this.schlocation != null)
		{
			sb.append(", Location: ");
			sb.append(this.schlocation.getName());
		}	
		if(this.service != null && this.service.getServiceNameIsNotNull())
		{
			sb.append(", Specialty: ");
			sb.append(this.service.getServiceName());
		}	
		if(this.starttm != null)
		{
			sb.append(", Start Time: ");
			sb.append(this.starttm.toString());	
		}
		if(this.endtm != null)
		{
			sb.append(", End Time: ");
			sb.append(this.endtm.toString());	
		}
		if(this.listowners != null && this.listowners.size() > 0)
		{
			sb.append(", List Owner(s): ");
			int i = 0;
			for(ims.scheduling.vo.Session_ListOwnerVo voListOwner : this.listowners)
			{
				if(voListOwner.getHcpIsNotNull())
				{
					sb.append(voListOwner.getHcp().toString());
					if(i < this.listowners.size() - 1)
						sb.append(" - ");
				}
				i++;
			}
		}
	
		return sb.toString();
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
		if(this.schlocation != null)
		{
			if(!this.schlocation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.service != null)
		{
			if(!this.service.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.exclusiontimes != null)
		{
			if(!this.exclusiontimes.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.listowners != null)
		{
			if(!this.listowners.isValidated())
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
		if(this.name != null)
			if(this.name.length() > 100)
				listOfErrors.add("The length of the field [name] in the value object [ims.scheduling.vo.SessionShortVo] is too big. It should be less or equal to 100");
		if(this.schlocation != null)
		{
			String[] listOfOtherErrors = this.schlocation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.service != null)
		{
			String[] listOfOtherErrors = this.service.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.remainingslots == null)
			listOfErrors.add("RemainingSlots is mandatory");
		if(this.totalslots == null)
			listOfErrors.add("TotalSlots is mandatory");
		if(this.exclusiontimes != null)
		{
			String[] listOfOtherErrors = this.exclusiontimes.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.description != null)
			if(this.description.length() > 255)
				listOfErrors.add("The length of the field [description] in the value object [ims.scheduling.vo.SessionShortVo] is too big. It should be less or equal to 255");
		if(this.listowners != null)
		{
			String[] listOfOtherErrors = this.listowners.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.comment != null)
			if(this.comment.length() > 255)
				listOfErrors.add("The length of the field [comment] in the value object [ims.scheduling.vo.SessionShortVo] is too big. It should be less or equal to 255");
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
	
		SessionShortVo clone = new SessionShortVo(this.id, this.version);
		
		clone.name = this.name;
		if(this.schlocation == null)
			clone.schlocation = null;
		else
			clone.schlocation = (ims.core.vo.LocShortVo)this.schlocation.clone();
		if(this.service == null)
			clone.service = null;
		else
			clone.service = (ims.core.vo.ServiceShortVo)this.service.clone();
		clone.remainingslots = this.remainingslots;
		clone.totalslots = this.totalslots;
		if(this.theatretype == null)
			clone.theatretype = null;
		else
			clone.theatretype = (ims.scheduling.vo.lookups.TheatreType)this.theatretype.clone();
		clone.isfixed = this.isfixed;
		if(this.starttm == null)
			clone.starttm = null;
		else
			clone.starttm = (ims.framework.utils.Time)this.starttm.clone();
		if(this.endtm == null)
			clone.endtm = null;
		else
			clone.endtm = (ims.framework.utils.Time)this.endtm.clone();
		clone.remainingtime = this.remainingtime;
		if(this.sessiondate == null)
			clone.sessiondate = null;
		else
			clone.sessiondate = (ims.framework.utils.Date)this.sessiondate.clone();
		if(this.exclusiontimes == null)
			clone.exclusiontimes = null;
		else
			clone.exclusiontimes = (ims.scheduling.vo.Session_Exc_TimesVoCollection)this.exclusiontimes.clone();
		clone.maxcontinuousavailablemins = this.maxcontinuousavailablemins;
		if(this.consmediatype == null)
			clone.consmediatype = null;
		else
			clone.consmediatype = (ims.scheduling.vo.lookups.ConsultationMediaType)this.consmediatype.clone();
		if(this.sessionstatus == null)
			clone.sessionstatus = null;
		else
			clone.sessionstatus = (ims.scheduling.vo.lookups.Session_Status_and_Reason)this.sessionstatus.clone();
		clone.description = this.description;
		clone.isactive = this.isactive;
		if(this.pasclinic == null)
			clone.pasclinic = null;
		else
			clone.pasclinic = (ims.scheduling.vo.lookups.SchedPASClinic)this.pasclinic.clone();
		clone.istheatresession = this.istheatresession;
		if(this.listowners == null)
			clone.listowners = null;
		else
			clone.listowners = (ims.scheduling.vo.Session_ListOwnerVoCollection)this.listowners.clone();
		if(this.cancellationreason == null)
			clone.cancellationreason = null;
		else
			clone.cancellationreason = (ims.scheduling.vo.lookups.CancelAppointmentReason)this.cancellationreason.clone();
		clone.comment = this.comment;
		clone.wassessionmoved = this.wassessionmoved;
		if(this.calendarslots == null)
			clone.calendarslots = null;
		else
			clone.calendarslots = (ims.scheduling.vo.SessionSlotWithStatusOnlyVoCollection)this.calendarslots.clone();
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
		if (!(SessionShortVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SessionShortVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		SessionShortVo compareObj = (SessionShortVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSessionDate() == null && compareObj.getSessionDate() != null)
				return -1;
			if(this.getSessionDate() != null && compareObj.getSessionDate() == null)
				return 1;
			if(this.getSessionDate() != null && compareObj.getSessionDate() != null)
				retVal = this.getSessionDate().compareTo(compareObj.getSessionDate());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.description != null)
			count++;
		if(this.isactive != null)
			count++;
		if(this.pasclinic != null)
			count++;
		if(this.istheatresession != null)
			count++;
		if(this.listowners != null)
			count++;
		if(this.cancellationreason != null)
			count++;
		if(this.comment != null)
			count++;
		if(this.wassessionmoved != null)
			count++;
		if(this.calendarslots != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 9;
	}
	protected String description;
	protected Boolean isactive;
	protected ims.scheduling.vo.lookups.SchedPASClinic pasclinic;
	protected Boolean istheatresession;
	protected ims.scheduling.vo.Session_ListOwnerVoCollection listowners;
	protected ims.scheduling.vo.lookups.CancelAppointmentReason cancellationreason;
	protected String comment;
	protected Boolean wassessionmoved;
	protected ims.scheduling.vo.SessionSlotWithStatusOnlyVoCollection calendarslots;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
