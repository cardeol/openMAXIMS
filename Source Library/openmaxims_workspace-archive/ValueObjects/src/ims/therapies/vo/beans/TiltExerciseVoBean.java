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

package ims.therapies.vo.beans;

public class TiltExerciseVoBean extends ims.vo.ValueObjectBean
{
	public TiltExerciseVoBean()
	{
	}
	public TiltExerciseVoBean(ims.therapies.vo.TiltExerciseVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.supporttype = vo.getSupportType() == null ? null : (ims.vo.LookupInstanceBean)vo.getSupportType().getBean();
		this.tiltsupportexercise = vo.getTiltSupportExercise() == null ? null : vo.getTiltSupportExercise().getBeanCollection();
		this.degrees = vo.getDegrees();
		this.duration = vo.getDuration();
		this.tiltexercisedetails = vo.getTiltExerciseDetails();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.therapies.vo.TiltExerciseVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.supporttype = vo.getSupportType() == null ? null : (ims.vo.LookupInstanceBean)vo.getSupportType().getBean();
		this.tiltsupportexercise = vo.getTiltSupportExercise() == null ? null : vo.getTiltSupportExercise().getBeanCollection();
		this.degrees = vo.getDegrees();
		this.duration = vo.getDuration();
		this.tiltexercisedetails = vo.getTiltExerciseDetails();
	}

	public ims.therapies.vo.TiltExerciseVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.therapies.vo.TiltExerciseVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.therapies.vo.TiltExerciseVo vo = null;
		if(map != null)
			vo = (ims.therapies.vo.TiltExerciseVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.therapies.vo.TiltExerciseVo();
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
	public ims.vo.LookupInstanceBean getSupportType()
	{
		return this.supporttype;
	}
	public void setSupportType(ims.vo.LookupInstanceBean value)
	{
		this.supporttype = value;
	}
	public java.util.Collection getTiltSupportExercise()
	{
		return this.tiltsupportexercise;
	}
	public void setTiltSupportExercise(java.util.Collection value)
	{
		this.tiltsupportexercise = value;
	}
	public void addTiltSupportExercise(java.util.Collection value)
	{
		if(this.tiltsupportexercise == null)
			this.tiltsupportexercise = new java.util.ArrayList();
		this.tiltsupportexercise.add(value);
	}
	public Integer getDegrees()
	{
		return this.degrees;
	}
	public void setDegrees(Integer value)
	{
		this.degrees = value;
	}
	public Integer getDuration()
	{
		return this.duration;
	}
	public void setDuration(Integer value)
	{
		this.duration = value;
	}
	public String getTiltExerciseDetails()
	{
		return this.tiltexercisedetails;
	}
	public void setTiltExerciseDetails(String value)
	{
		this.tiltexercisedetails = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean supporttype;
	private java.util.Collection tiltsupportexercise;
	private Integer degrees;
	private Integer duration;
	private String tiltexercisedetails;
}
