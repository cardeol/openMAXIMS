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

package ims.core.vo.beans;

public class SpecialtyOutlierInpatientEpisodeListVoBean extends ims.vo.ValueObjectBean
{
	public SpecialtyOutlierInpatientEpisodeListVoBean()
	{
	}
	public SpecialtyOutlierInpatientEpisodeListVoBean(ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.estdischargedate = vo.getEstDischargeDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEstDischargeDate().getBean();
		this.comments = vo.getComments();
		this.wardtype = vo.getWardType() == null ? null : (ims.vo.LookupInstanceBean)vo.getWardType().getBean();
		this.bed = vo.getBed() == null ? null : (ims.core.vo.beans.BedSpaceStateLiteVoBean)vo.getBed().getBean();
		this.isconfirmeddischarge = vo.getIsConfirmedDischarge();
		this.confirmeddischargedatetime = vo.getConfirmedDischargeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getConfirmedDischargeDateTime().getBean();
		this.isonhomeleave = vo.getIsOnHomeLeave();
		this.expecteddateofreturn = vo.getExpectedDateOfReturn() == null ? null : (ims.framework.utils.beans.DateBean)vo.getExpectedDateOfReturn().getBean();
		this.expectedtimeofreturn = vo.getExpectedTimeOfReturn() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getExpectedTimeOfReturn().getBean();
		this.activealerts = vo.getActiveAlerts();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PasEventForSTHKListVoBean)vo.getPasEvent().getBean();
		this.dateonhomeleave = vo.getDateOnHomeLeave() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOnHomeLeave().getBean();
		this.timeonhomeleave = vo.getTimeOnHomeLeave() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeOnHomeLeave().getBean();
		if(vo.getHomeLeaves() != null)
		{
			this.homeleaves = new ims.vo.RefVoBean[vo.getHomeLeaves().size()];
			for(int homeleaves_i = 0; homeleaves_i < vo.getHomeLeaves().size(); homeleaves_i++)
			{
				this.homeleaves[homeleaves_i] = new ims.vo.RefVoBean(vo.getHomeLeaves().get(homeleaves_i).getBoId(),vo.getHomeLeaves().get(homeleaves_i).getBoVersion());
			}
		}
		this.currenttrackingmovement = vo.getCurrentTrackingMovement() == null ? null : (ims.core.vo.beans.TrackingMovementLiteVoBean)vo.getCurrentTrackingMovement().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.estdischargedate = vo.getEstDischargeDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getEstDischargeDate().getBean();
		this.comments = vo.getComments();
		this.wardtype = vo.getWardType() == null ? null : (ims.vo.LookupInstanceBean)vo.getWardType().getBean();
		this.bed = vo.getBed() == null ? null : (ims.core.vo.beans.BedSpaceStateLiteVoBean)vo.getBed().getBean(map);
		this.isconfirmeddischarge = vo.getIsConfirmedDischarge();
		this.confirmeddischargedatetime = vo.getConfirmedDischargeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getConfirmedDischargeDateTime().getBean();
		this.isonhomeleave = vo.getIsOnHomeLeave();
		this.expecteddateofreturn = vo.getExpectedDateOfReturn() == null ? null : (ims.framework.utils.beans.DateBean)vo.getExpectedDateOfReturn().getBean();
		this.expectedtimeofreturn = vo.getExpectedTimeOfReturn() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getExpectedTimeOfReturn().getBean();
		this.activealerts = vo.getActiveAlerts();
		this.pasevent = vo.getPasEvent() == null ? null : (ims.core.vo.beans.PasEventForSTHKListVoBean)vo.getPasEvent().getBean(map);
		this.dateonhomeleave = vo.getDateOnHomeLeave() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOnHomeLeave().getBean();
		this.timeonhomeleave = vo.getTimeOnHomeLeave() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getTimeOnHomeLeave().getBean();
		if(vo.getHomeLeaves() != null)
		{
			this.homeleaves = new ims.vo.RefVoBean[vo.getHomeLeaves().size()];
			for(int homeleaves_i = 0; homeleaves_i < vo.getHomeLeaves().size(); homeleaves_i++)
			{
				this.homeleaves[homeleaves_i] = new ims.vo.RefVoBean(vo.getHomeLeaves().get(homeleaves_i).getBoId(),vo.getHomeLeaves().get(homeleaves_i).getBoVersion());
			}
		}
		this.currenttrackingmovement = vo.getCurrentTrackingMovement() == null ? null : (ims.core.vo.beans.TrackingMovementLiteVoBean)vo.getCurrentTrackingMovement().getBean(map);
	}

	public ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo vo = null;
		if(map != null)
			vo = (ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.SpecialtyOutlierInpatientEpisodeListVo();
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
	public ims.framework.utils.beans.DateTimeBean getEstDischargeDate()
	{
		return this.estdischargedate;
	}
	public void setEstDischargeDate(ims.framework.utils.beans.DateTimeBean value)
	{
		this.estdischargedate = value;
	}
	public String getComments()
	{
		return this.comments;
	}
	public void setComments(String value)
	{
		this.comments = value;
	}
	public ims.vo.LookupInstanceBean getWardType()
	{
		return this.wardtype;
	}
	public void setWardType(ims.vo.LookupInstanceBean value)
	{
		this.wardtype = value;
	}
	public ims.core.vo.beans.BedSpaceStateLiteVoBean getBed()
	{
		return this.bed;
	}
	public void setBed(ims.core.vo.beans.BedSpaceStateLiteVoBean value)
	{
		this.bed = value;
	}
	public Boolean getIsConfirmedDischarge()
	{
		return this.isconfirmeddischarge;
	}
	public void setIsConfirmedDischarge(Boolean value)
	{
		this.isconfirmeddischarge = value;
	}
	public ims.framework.utils.beans.DateTimeBean getConfirmedDischargeDateTime()
	{
		return this.confirmeddischargedatetime;
	}
	public void setConfirmedDischargeDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.confirmeddischargedatetime = value;
	}
	public Boolean getIsOnHomeLeave()
	{
		return this.isonhomeleave;
	}
	public void setIsOnHomeLeave(Boolean value)
	{
		this.isonhomeleave = value;
	}
	public ims.framework.utils.beans.DateBean getExpectedDateOfReturn()
	{
		return this.expecteddateofreturn;
	}
	public void setExpectedDateOfReturn(ims.framework.utils.beans.DateBean value)
	{
		this.expecteddateofreturn = value;
	}
	public ims.framework.utils.beans.TimeBean getExpectedTimeOfReturn()
	{
		return this.expectedtimeofreturn;
	}
	public void setExpectedTimeOfReturn(ims.framework.utils.beans.TimeBean value)
	{
		this.expectedtimeofreturn = value;
	}
	public Boolean getActiveAlerts()
	{
		return this.activealerts;
	}
	public void setActiveAlerts(Boolean value)
	{
		this.activealerts = value;
	}
	public ims.core.vo.beans.PasEventForSTHKListVoBean getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.vo.beans.PasEventForSTHKListVoBean value)
	{
		this.pasevent = value;
	}
	public ims.framework.utils.beans.DateBean getDateOnHomeLeave()
	{
		return this.dateonhomeleave;
	}
	public void setDateOnHomeLeave(ims.framework.utils.beans.DateBean value)
	{
		this.dateonhomeleave = value;
	}
	public ims.framework.utils.beans.TimeBean getTimeOnHomeLeave()
	{
		return this.timeonhomeleave;
	}
	public void setTimeOnHomeLeave(ims.framework.utils.beans.TimeBean value)
	{
		this.timeonhomeleave = value;
	}
	public ims.vo.RefVoBean[] getHomeLeaves()
	{
		return this.homeleaves;
	}
	public void setHomeLeaves(ims.vo.RefVoBean[] value)
	{
		this.homeleaves = value;
	}
	public ims.core.vo.beans.TrackingMovementLiteVoBean getCurrentTrackingMovement()
	{
		return this.currenttrackingmovement;
	}
	public void setCurrentTrackingMovement(ims.core.vo.beans.TrackingMovementLiteVoBean value)
	{
		this.currenttrackingmovement = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateTimeBean estdischargedate;
	private String comments;
	private ims.vo.LookupInstanceBean wardtype;
	private ims.core.vo.beans.BedSpaceStateLiteVoBean bed;
	private Boolean isconfirmeddischarge;
	private ims.framework.utils.beans.DateTimeBean confirmeddischargedatetime;
	private Boolean isonhomeleave;
	private ims.framework.utils.beans.DateBean expecteddateofreturn;
	private ims.framework.utils.beans.TimeBean expectedtimeofreturn;
	private Boolean activealerts;
	private ims.core.vo.beans.PasEventForSTHKListVoBean pasevent;
	private ims.framework.utils.beans.DateBean dateonhomeleave;
	private ims.framework.utils.beans.TimeBean timeonhomeleave;
	private ims.vo.RefVoBean[] homeleaves;
	private ims.core.vo.beans.TrackingMovementLiteVoBean currenttrackingmovement;
}
