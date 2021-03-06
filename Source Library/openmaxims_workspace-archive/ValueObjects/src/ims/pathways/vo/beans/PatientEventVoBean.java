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

package ims.pathways.vo.beans;

public class PatientEventVoBean extends ims.vo.ValueObjectBean
{
	public PatientEventVoBean()
	{
	}
	public PatientEventVoBean(ims.pathways.vo.PatientEventVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.event = vo.getEvent() == null ? null : new ims.vo.RefVoBean(vo.getEvent().getBoId(), vo.getEvent().getBoVersion());
		this.description = vo.getDescription();
		this.eventdatetime = vo.getEventDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEventDateTime().getBean();
		this.messageid = vo.getMessageId();
		this.journey = vo.getJourney() == null ? null : (ims.pathways.vo.beans.PatientJourneyVoBean)vo.getJourney().getBean();
		this.patienttarget = vo.getPatientTarget() == null ? null : new ims.vo.RefVoBean(vo.getPatientTarget().getBoId(), vo.getPatientTarget().getBoVersion());
		this.externalevent = vo.getExternalEvent() == null ? null : new ims.vo.RefVoBean(vo.getExternalEvent().getBoId(), vo.getExternalEvent().getBoVersion());
		this.cliniccode = vo.getClinicCode();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.consultant = vo.getConsultant() == null ? null : new ims.vo.RefVoBean(vo.getConsultant().getBoId(), vo.getConsultant().getBoVersion());
		this.externaleventid = vo.getExternalEventId();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.rttexternalevent = vo.getRttExternalEvent() == null ? null : new ims.vo.RefVoBean(vo.getRttExternalEvent().getBoId(), vo.getRttExternalEvent().getBoVersion());
		this.actioncode = vo.getActionCode();
		this.scheduleddate = vo.getScheduledDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getScheduledDate().getBean();
		this.eventstatus = vo.getEventStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getEventStatus().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.pathways.vo.PatientEventVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.event = vo.getEvent() == null ? null : new ims.vo.RefVoBean(vo.getEvent().getBoId(), vo.getEvent().getBoVersion());
		this.description = vo.getDescription();
		this.eventdatetime = vo.getEventDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEventDateTime().getBean();
		this.messageid = vo.getMessageId();
		this.journey = vo.getJourney() == null ? null : (ims.pathways.vo.beans.PatientJourneyVoBean)vo.getJourney().getBean(map);
		this.patienttarget = vo.getPatientTarget() == null ? null : new ims.vo.RefVoBean(vo.getPatientTarget().getBoId(), vo.getPatientTarget().getBoVersion());
		this.externalevent = vo.getExternalEvent() == null ? null : new ims.vo.RefVoBean(vo.getExternalEvent().getBoId(), vo.getExternalEvent().getBoVersion());
		this.cliniccode = vo.getClinicCode();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.consultant = vo.getConsultant() == null ? null : new ims.vo.RefVoBean(vo.getConsultant().getBoId(), vo.getConsultant().getBoVersion());
		this.externaleventid = vo.getExternalEventId();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.rttexternalevent = vo.getRttExternalEvent() == null ? null : new ims.vo.RefVoBean(vo.getRttExternalEvent().getBoId(), vo.getRttExternalEvent().getBoVersion());
		this.actioncode = vo.getActionCode();
		this.scheduleddate = vo.getScheduledDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getScheduledDate().getBean();
		this.eventstatus = vo.getEventStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getEventStatus().getBean();
	}

	public ims.pathways.vo.PatientEventVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.pathways.vo.PatientEventVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.pathways.vo.PatientEventVo vo = null;
		if(map != null)
			vo = (ims.pathways.vo.PatientEventVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.pathways.vo.PatientEventVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.RefVoBean getEvent()
	{
		return this.event;
	}
	public void setEvent(ims.vo.RefVoBean value)
	{
		this.event = value;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String value)
	{
		this.description = value;
	}
	public ims.framework.utils.beans.DateTimeBean getEventDateTime()
	{
		return this.eventdatetime;
	}
	public void setEventDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.eventdatetime = value;
	}
	public String getMessageId()
	{
		return this.messageid;
	}
	public void setMessageId(String value)
	{
		this.messageid = value;
	}
	public ims.pathways.vo.beans.PatientJourneyVoBean getJourney()
	{
		return this.journey;
	}
	public void setJourney(ims.pathways.vo.beans.PatientJourneyVoBean value)
	{
		this.journey = value;
	}
	public ims.vo.RefVoBean getPatientTarget()
	{
		return this.patienttarget;
	}
	public void setPatientTarget(ims.vo.RefVoBean value)
	{
		this.patienttarget = value;
	}
	public ims.vo.RefVoBean getExternalEvent()
	{
		return this.externalevent;
	}
	public void setExternalEvent(ims.vo.RefVoBean value)
	{
		this.externalevent = value;
	}
	public String getClinicCode()
	{
		return this.cliniccode;
	}
	public void setClinicCode(String value)
	{
		this.cliniccode = value;
	}
	public ims.vo.LookupInstanceBean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.vo.LookupInstanceBean value)
	{
		this.specialty = value;
	}
	public ims.vo.RefVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.vo.RefVoBean value)
	{
		this.consultant = value;
	}
	public Integer getExternalEventId()
	{
		return this.externaleventid;
	}
	public void setExternalEventId(Integer value)
	{
		this.externaleventid = value;
	}
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.vo.RefVoBean getRttExternalEvent()
	{
		return this.rttexternalevent;
	}
	public void setRttExternalEvent(ims.vo.RefVoBean value)
	{
		this.rttexternalevent = value;
	}
	public String getActionCode()
	{
		return this.actioncode;
	}
	public void setActionCode(String value)
	{
		this.actioncode = value;
	}
	public ims.framework.utils.beans.DateTimeBean getScheduledDate()
	{
		return this.scheduleddate;
	}
	public void setScheduledDate(ims.framework.utils.beans.DateTimeBean value)
	{
		this.scheduleddate = value;
	}
	public ims.vo.LookupInstanceBean getEventStatus()
	{
		return this.eventstatus;
	}
	public void setEventStatus(ims.vo.LookupInstanceBean value)
	{
		this.eventstatus = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean event;
	private String description;
	private ims.framework.utils.beans.DateTimeBean eventdatetime;
	private String messageid;
	private ims.pathways.vo.beans.PatientJourneyVoBean journey;
	private ims.vo.RefVoBean patienttarget;
	private ims.vo.RefVoBean externalevent;
	private String cliniccode;
	private ims.vo.LookupInstanceBean specialty;
	private ims.vo.RefVoBean consultant;
	private Integer externaleventid;
	private ims.vo.RefVoBean patient;
	private ims.vo.RefVoBean rttexternalevent;
	private String actioncode;
	private ims.framework.utils.beans.DateTimeBean scheduleddate;
	private ims.vo.LookupInstanceBean eventstatus;
}
