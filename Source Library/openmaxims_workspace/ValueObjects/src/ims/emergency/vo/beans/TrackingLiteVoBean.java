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

package ims.emergency.vo.beans;

public class TrackingLiteVoBean extends ims.vo.ValueObjectBean
{
	public TrackingLiteVoBean()
	{
	}
	public TrackingLiteVoBean(ims.emergency.vo.TrackingLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.currentarea = vo.getCurrentArea() == null ? null : new ims.vo.RefVoBean(vo.getCurrentArea().getBoId(), vo.getCurrentArea().getBoVersion());
		this.isprimarycare = vo.getIsPrimaryCare();
		this.isdischarged = vo.getIsDischarged();
		this.lastmovementdatetime = vo.getLastMovementDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getLastMovementDateTime().getBean();
		this.attendance = vo.getAttendance() == null ? null : (ims.emergency.vo.beans.EmergencyAttendanceForSendToAreaVoBean)vo.getAttendance().getBean();
		this.currentpartialadmission = vo.getCurrentPartialAdmission() == null ? null : (ims.emergency.vo.beans.CurrentPartialAdmissionForSendToAreaVoBean)vo.getCurrentPartialAdmission().getBean();
		this.currentcubicle = vo.getCurrentCubicle() == null ? null : (ims.emergency.vo.beans.CubicleAllocationVoBean)vo.getCurrentCubicle().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.emergency.vo.beans.TrackingAttendanceStatusVoBean)vo.getCurrentStatus().getBean();
		this.displayined = vo.getDisplayInED();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.TrackingLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.currentarea = vo.getCurrentArea() == null ? null : new ims.vo.RefVoBean(vo.getCurrentArea().getBoId(), vo.getCurrentArea().getBoVersion());
		this.isprimarycare = vo.getIsPrimaryCare();
		this.isdischarged = vo.getIsDischarged();
		this.lastmovementdatetime = vo.getLastMovementDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getLastMovementDateTime().getBean();
		this.attendance = vo.getAttendance() == null ? null : (ims.emergency.vo.beans.EmergencyAttendanceForSendToAreaVoBean)vo.getAttendance().getBean(map);
		this.currentpartialadmission = vo.getCurrentPartialAdmission() == null ? null : (ims.emergency.vo.beans.CurrentPartialAdmissionForSendToAreaVoBean)vo.getCurrentPartialAdmission().getBean(map);
		this.currentcubicle = vo.getCurrentCubicle() == null ? null : (ims.emergency.vo.beans.CubicleAllocationVoBean)vo.getCurrentCubicle().getBean(map);
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.emergency.vo.beans.TrackingAttendanceStatusVoBean)vo.getCurrentStatus().getBean(map);
		this.displayined = vo.getDisplayInED();
	}

	public ims.emergency.vo.TrackingLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.TrackingLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.TrackingLiteVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.TrackingLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.TrackingLiteVo();
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
	public ims.vo.RefVoBean getCurrentArea()
	{
		return this.currentarea;
	}
	public void setCurrentArea(ims.vo.RefVoBean value)
	{
		this.currentarea = value;
	}
	public Boolean getIsPrimaryCare()
	{
		return this.isprimarycare;
	}
	public void setIsPrimaryCare(Boolean value)
	{
		this.isprimarycare = value;
	}
	public Boolean getIsDischarged()
	{
		return this.isdischarged;
	}
	public void setIsDischarged(Boolean value)
	{
		this.isdischarged = value;
	}
	public ims.framework.utils.beans.DateTimeBean getLastMovementDateTime()
	{
		return this.lastmovementdatetime;
	}
	public void setLastMovementDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.lastmovementdatetime = value;
	}
	public ims.emergency.vo.beans.EmergencyAttendanceForSendToAreaVoBean getAttendance()
	{
		return this.attendance;
	}
	public void setAttendance(ims.emergency.vo.beans.EmergencyAttendanceForSendToAreaVoBean value)
	{
		this.attendance = value;
	}
	public ims.emergency.vo.beans.CurrentPartialAdmissionForSendToAreaVoBean getCurrentPartialAdmission()
	{
		return this.currentpartialadmission;
	}
	public void setCurrentPartialAdmission(ims.emergency.vo.beans.CurrentPartialAdmissionForSendToAreaVoBean value)
	{
		this.currentpartialadmission = value;
	}
	public ims.emergency.vo.beans.CubicleAllocationVoBean getCurrentCubicle()
	{
		return this.currentcubicle;
	}
	public void setCurrentCubicle(ims.emergency.vo.beans.CubicleAllocationVoBean value)
	{
		this.currentcubicle = value;
	}
	public ims.emergency.vo.beans.TrackingAttendanceStatusVoBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.emergency.vo.beans.TrackingAttendanceStatusVoBean value)
	{
		this.currentstatus = value;
	}
	public Boolean getDisplayInED()
	{
		return this.displayined;
	}
	public void setDisplayInED(Boolean value)
	{
		this.displayined = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean currentarea;
	private Boolean isprimarycare;
	private Boolean isdischarged;
	private ims.framework.utils.beans.DateTimeBean lastmovementdatetime;
	private ims.emergency.vo.beans.EmergencyAttendanceForSendToAreaVoBean attendance;
	private ims.emergency.vo.beans.CurrentPartialAdmissionForSendToAreaVoBean currentpartialadmission;
	private ims.emergency.vo.beans.CubicleAllocationVoBean currentcubicle;
	private ims.emergency.vo.beans.TrackingAttendanceStatusVoBean currentstatus;
	private Boolean displayined;
}
