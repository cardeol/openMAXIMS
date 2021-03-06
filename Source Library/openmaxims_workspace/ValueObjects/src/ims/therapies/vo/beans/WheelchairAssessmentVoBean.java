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

package ims.therapies.vo.beans;

public class WheelchairAssessmentVoBean extends ims.vo.ValueObjectBean
{
	public WheelchairAssessmentVoBean()
	{
	}
	public WheelchairAssessmentVoBean(ims.therapies.vo.WheelchairAssessmentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.authoringdatetime = vo.getAuthoringDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAuthoringDateTime().getBean();
		this.authoringcp = vo.getAuthoringCP() == null ? null : (ims.core.vo.beans.HcpBean)vo.getAuthoringCP().getBean();
		this.chairtype = vo.getChairType() == null ? null : (ims.vo.LookupInstanceBean)vo.getChairType().getBean();
		this.surfacedistance = vo.getSurfaceDistance() == null ? null : vo.getSurfaceDistance().getBeanCollection();
		this.powerchairskillsassess = vo.getPowerchairSkillsAssess() == null ? null : vo.getPowerchairSkillsAssess().getBeanCollection();
		this.wheelchairskillsassess = vo.getWheelchairSkillsAssess() == null ? null : vo.getWheelchairSkillsAssess().getBeanCollection();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : new ims.vo.RefVoBean(vo.getClinicalContact().getBoId(), vo.getClinicalContact().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.therapies.vo.WheelchairAssessmentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.authoringdatetime = vo.getAuthoringDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getAuthoringDateTime().getBean();
		this.authoringcp = vo.getAuthoringCP() == null ? null : (ims.core.vo.beans.HcpBean)vo.getAuthoringCP().getBean(map);
		this.chairtype = vo.getChairType() == null ? null : (ims.vo.LookupInstanceBean)vo.getChairType().getBean();
		this.surfacedistance = vo.getSurfaceDistance() == null ? null : vo.getSurfaceDistance().getBeanCollection();
		this.powerchairskillsassess = vo.getPowerchairSkillsAssess() == null ? null : vo.getPowerchairSkillsAssess().getBeanCollection();
		this.wheelchairskillsassess = vo.getWheelchairSkillsAssess() == null ? null : vo.getWheelchairSkillsAssess().getBeanCollection();
		this.clinicalcontact = vo.getClinicalContact() == null ? null : new ims.vo.RefVoBean(vo.getClinicalContact().getBoId(), vo.getClinicalContact().getBoVersion());
	}

	public ims.therapies.vo.WheelchairAssessmentVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.therapies.vo.WheelchairAssessmentVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.therapies.vo.WheelchairAssessmentVo vo = null;
		if(map != null)
			vo = (ims.therapies.vo.WheelchairAssessmentVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.therapies.vo.WheelchairAssessmentVo();
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
	public ims.framework.utils.beans.DateTimeBean getAuthoringDateTime()
	{
		return this.authoringdatetime;
	}
	public void setAuthoringDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.authoringdatetime = value;
	}
	public ims.core.vo.beans.HcpBean getAuthoringCP()
	{
		return this.authoringcp;
	}
	public void setAuthoringCP(ims.core.vo.beans.HcpBean value)
	{
		this.authoringcp = value;
	}
	public ims.vo.LookupInstanceBean getChairType()
	{
		return this.chairtype;
	}
	public void setChairType(ims.vo.LookupInstanceBean value)
	{
		this.chairtype = value;
	}
	public ims.therapies.vo.beans.WheelchairSurfaceDistanceVoBean[] getSurfaceDistance()
	{
		return this.surfacedistance;
	}
	public void setSurfaceDistance(ims.therapies.vo.beans.WheelchairSurfaceDistanceVoBean[] value)
	{
		this.surfacedistance = value;
	}
	public ims.therapies.vo.beans.PowerchairSkillsAssessmentVoBean[] getPowerchairSkillsAssess()
	{
		return this.powerchairskillsassess;
	}
	public void setPowerchairSkillsAssess(ims.therapies.vo.beans.PowerchairSkillsAssessmentVoBean[] value)
	{
		this.powerchairskillsassess = value;
	}
	public ims.therapies.vo.beans.WheelchairSkillsAssessmentVoBean[] getWheelchairSkillsAssess()
	{
		return this.wheelchairskillsassess;
	}
	public void setWheelchairSkillsAssess(ims.therapies.vo.beans.WheelchairSkillsAssessmentVoBean[] value)
	{
		this.wheelchairskillsassess = value;
	}
	public ims.vo.RefVoBean getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.vo.RefVoBean value)
	{
		this.clinicalcontact = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateTimeBean authoringdatetime;
	private ims.core.vo.beans.HcpBean authoringcp;
	private ims.vo.LookupInstanceBean chairtype;
	private ims.therapies.vo.beans.WheelchairSurfaceDistanceVoBean[] surfacedistance;
	private ims.therapies.vo.beans.PowerchairSkillsAssessmentVoBean[] powerchairskillsassess;
	private ims.therapies.vo.beans.WheelchairSkillsAssessmentVoBean[] wheelchairskillsassess;
	private ims.vo.RefVoBean clinicalcontact;
}
