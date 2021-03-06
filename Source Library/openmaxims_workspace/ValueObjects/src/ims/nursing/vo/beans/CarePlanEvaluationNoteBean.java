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

package ims.nursing.vo.beans;

public class CarePlanEvaluationNoteBean extends ims.vo.ValueObjectBean
{
	public CarePlanEvaluationNoteBean()
	{
	}
	public CarePlanEvaluationNoteBean(ims.nursing.vo.CarePlanEvaluationNote vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.recordeddatetime = vo.getRecordedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRecordedDateTime().getBean();
		this.recordedby = vo.getRecordedBy() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getRecordedBy().getBean();
		this.nextevaluationdate = vo.getNextEvaluationDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getNextEvaluationDate().getBean();
		this.nextevaluationtime = vo.getNextEvaluationTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getNextEvaluationTime().getBean();
		this.note = vo.getNote();
		this.correctedby = vo.getCorrectedBy() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getCorrectedBy().getBean();
		this.correctiondatetime = vo.getCorrectionDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getCorrectionDateTime().getBean();
		this.correctionreason = vo.getCorrectionReason();
		this.active = vo.getActive();
		this.confirmedby = vo.getConfirmedBy() == null ? null : new ims.vo.RefVoBean(vo.getConfirmedBy().getBoId(), vo.getConfirmedBy().getBoVersion());
		this.confirmeddatetime = vo.getConfirmedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getConfirmedDateTime().getBean();
		this.careplan = vo.getCarePlan() == null ? null : new ims.vo.RefVoBean(vo.getCarePlan().getBoId(), vo.getCarePlan().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.CarePlanEvaluationNote vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.recordeddatetime = vo.getRecordedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRecordedDateTime().getBean();
		this.recordedby = vo.getRecordedBy() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getRecordedBy().getBean(map);
		this.nextevaluationdate = vo.getNextEvaluationDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getNextEvaluationDate().getBean();
		this.nextevaluationtime = vo.getNextEvaluationTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getNextEvaluationTime().getBean();
		this.note = vo.getNote();
		this.correctedby = vo.getCorrectedBy() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getCorrectedBy().getBean(map);
		this.correctiondatetime = vo.getCorrectionDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getCorrectionDateTime().getBean();
		this.correctionreason = vo.getCorrectionReason();
		this.active = vo.getActive();
		this.confirmedby = vo.getConfirmedBy() == null ? null : new ims.vo.RefVoBean(vo.getConfirmedBy().getBoId(), vo.getConfirmedBy().getBoVersion());
		this.confirmeddatetime = vo.getConfirmedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getConfirmedDateTime().getBean();
		this.careplan = vo.getCarePlan() == null ? null : new ims.vo.RefVoBean(vo.getCarePlan().getBoId(), vo.getCarePlan().getBoVersion());
	}

	public ims.nursing.vo.CarePlanEvaluationNote buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.nursing.vo.CarePlanEvaluationNote buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.CarePlanEvaluationNote vo = null;
		if(map != null)
			vo = (ims.nursing.vo.CarePlanEvaluationNote)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.nursing.vo.CarePlanEvaluationNote();
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
	public ims.framework.utils.beans.DateTimeBean getRecordedDateTime()
	{
		return this.recordeddatetime;
	}
	public void setRecordedDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.recordeddatetime = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getRecordedBy()
	{
		return this.recordedby;
	}
	public void setRecordedBy(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.recordedby = value;
	}
	public ims.framework.utils.beans.DateBean getNextEvaluationDate()
	{
		return this.nextevaluationdate;
	}
	public void setNextEvaluationDate(ims.framework.utils.beans.DateBean value)
	{
		this.nextevaluationdate = value;
	}
	public ims.framework.utils.beans.TimeBean getNextEvaluationTime()
	{
		return this.nextevaluationtime;
	}
	public void setNextEvaluationTime(ims.framework.utils.beans.TimeBean value)
	{
		this.nextevaluationtime = value;
	}
	public String getNote()
	{
		return this.note;
	}
	public void setNote(String value)
	{
		this.note = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getCorrectedBy()
	{
		return this.correctedby;
	}
	public void setCorrectedBy(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.correctedby = value;
	}
	public ims.framework.utils.beans.DateTimeBean getCorrectionDateTime()
	{
		return this.correctiondatetime;
	}
	public void setCorrectionDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.correctiondatetime = value;
	}
	public String getCorrectionReason()
	{
		return this.correctionreason;
	}
	public void setCorrectionReason(String value)
	{
		this.correctionreason = value;
	}
	public Boolean getActive()
	{
		return this.active;
	}
	public void setActive(Boolean value)
	{
		this.active = value;
	}
	public ims.vo.RefVoBean getConfirmedBy()
	{
		return this.confirmedby;
	}
	public void setConfirmedBy(ims.vo.RefVoBean value)
	{
		this.confirmedby = value;
	}
	public ims.framework.utils.beans.DateTimeBean getConfirmedDateTime()
	{
		return this.confirmeddatetime;
	}
	public void setConfirmedDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.confirmeddatetime = value;
	}
	public ims.vo.RefVoBean getCarePlan()
	{
		return this.careplan;
	}
	public void setCarePlan(ims.vo.RefVoBean value)
	{
		this.careplan = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateTimeBean recordeddatetime;
	private ims.core.vo.beans.HcpLiteVoBean recordedby;
	private ims.framework.utils.beans.DateBean nextevaluationdate;
	private ims.framework.utils.beans.TimeBean nextevaluationtime;
	private String note;
	private ims.core.vo.beans.HcpLiteVoBean correctedby;
	private ims.framework.utils.beans.DateTimeBean correctiondatetime;
	private String correctionreason;
	private Boolean active;
	private ims.vo.RefVoBean confirmedby;
	private ims.framework.utils.beans.DateTimeBean confirmeddatetime;
	private ims.vo.RefVoBean careplan;
}
