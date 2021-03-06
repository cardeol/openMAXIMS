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

package ims.emergency.vo.beans;

public class WhiteBoardConfigVoBean extends ims.vo.ValueObjectBean
{
	public WhiteBoardConfigVoBean()
	{
	}
	public WhiteBoardConfigVoBean(ims.emergency.vo.WhiteBoardConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.edlocation = vo.getEDLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getEDLocation().getBean();
		this.isactive = vo.getIsActive();
		this.medsgiven = vo.getMedsGiven();
		this.obstaken = vo.getObsTaken();
		this.ecg = vo.getECG();
		this.npo = vo.getNPO();
		this.isolation = vo.getIsolation();
		this.assessments = vo.getAssessments() == null ? null : vo.getAssessments().getBeanCollection();
		this.otherquestions = vo.getOtherQuestions() == null ? null : vo.getOtherQuestions().getBeanCollection();
		this.comments = vo.getComments();
		this.currentarea = vo.getCurrentArea() == null ? null : (ims.emergency.vo.beans.TrackingAreaLiteVoBean)vo.getCurrentArea().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.WhiteBoardConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.edlocation = vo.getEDLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getEDLocation().getBean(map);
		this.isactive = vo.getIsActive();
		this.medsgiven = vo.getMedsGiven();
		this.obstaken = vo.getObsTaken();
		this.ecg = vo.getECG();
		this.npo = vo.getNPO();
		this.isolation = vo.getIsolation();
		this.assessments = vo.getAssessments() == null ? null : vo.getAssessments().getBeanCollection();
		this.otherquestions = vo.getOtherQuestions() == null ? null : vo.getOtherQuestions().getBeanCollection();
		this.comments = vo.getComments();
		this.currentarea = vo.getCurrentArea() == null ? null : (ims.emergency.vo.beans.TrackingAreaLiteVoBean)vo.getCurrentArea().getBean(map);
	}

	public ims.emergency.vo.WhiteBoardConfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.WhiteBoardConfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.WhiteBoardConfigVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.WhiteBoardConfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.WhiteBoardConfigVo();
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
	public ims.core.vo.beans.LocationLiteVoBean getEDLocation()
	{
		return this.edlocation;
	}
	public void setEDLocation(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.edlocation = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public Boolean getMedsGiven()
	{
		return this.medsgiven;
	}
	public void setMedsGiven(Boolean value)
	{
		this.medsgiven = value;
	}
	public Boolean getObsTaken()
	{
		return this.obstaken;
	}
	public void setObsTaken(Boolean value)
	{
		this.obstaken = value;
	}
	public Boolean getECG()
	{
		return this.ecg;
	}
	public void setECG(Boolean value)
	{
		this.ecg = value;
	}
	public Boolean getNPO()
	{
		return this.npo;
	}
	public void setNPO(Boolean value)
	{
		this.npo = value;
	}
	public Boolean getIsolation()
	{
		return this.isolation;
	}
	public void setIsolation(Boolean value)
	{
		this.isolation = value;
	}
	public ims.emergency.vo.beans.WhiteBoardAssessmentConfigVoBean[] getAssessments()
	{
		return this.assessments;
	}
	public void setAssessments(ims.emergency.vo.beans.WhiteBoardAssessmentConfigVoBean[] value)
	{
		this.assessments = value;
	}
	public ims.emergency.vo.beans.WhiteBoardQuestionConfigVoBean[] getOtherQuestions()
	{
		return this.otherquestions;
	}
	public void setOtherQuestions(ims.emergency.vo.beans.WhiteBoardQuestionConfigVoBean[] value)
	{
		this.otherquestions = value;
	}
	public Boolean getComments()
	{
		return this.comments;
	}
	public void setComments(Boolean value)
	{
		this.comments = value;
	}
	public ims.emergency.vo.beans.TrackingAreaLiteVoBean getCurrentArea()
	{
		return this.currentarea;
	}
	public void setCurrentArea(ims.emergency.vo.beans.TrackingAreaLiteVoBean value)
	{
		this.currentarea = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.LocationLiteVoBean edlocation;
	private Boolean isactive;
	private Boolean medsgiven;
	private Boolean obstaken;
	private Boolean ecg;
	private Boolean npo;
	private Boolean isolation;
	private ims.emergency.vo.beans.WhiteBoardAssessmentConfigVoBean[] assessments;
	private ims.emergency.vo.beans.WhiteBoardQuestionConfigVoBean[] otherquestions;
	private Boolean comments;
	private ims.emergency.vo.beans.TrackingAreaLiteVoBean currentarea;
}
