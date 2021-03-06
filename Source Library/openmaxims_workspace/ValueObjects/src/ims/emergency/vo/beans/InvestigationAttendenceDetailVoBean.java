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

public class InvestigationAttendenceDetailVoBean extends ims.vo.ValueObjectBean
{
	public InvestigationAttendenceDetailVoBean()
	{
	}
	public InvestigationAttendenceDetailVoBean(ims.emergency.vo.InvestigationAttendenceDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
		this.attendenceinvestigation = vo.getAttendenceInvestigation() == null ? null : (ims.vo.LookupInstanceBean)vo.getAttendenceInvestigation().getBean();
		this.active = vo.getActive();
		this.addedduringcoding = vo.getAddedDuringCoding();
		this.ocsinvestigation = vo.getOCSInvestigation() == null ? null : (ims.emergency.vo.beans.OrderInvestigationForAttendenceNotesCcVoBean)vo.getOCSInvestigation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.InvestigationAttendenceDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
		this.attendenceinvestigation = vo.getAttendenceInvestigation() == null ? null : (ims.vo.LookupInstanceBean)vo.getAttendenceInvestigation().getBean();
		this.active = vo.getActive();
		this.addedduringcoding = vo.getAddedDuringCoding();
		this.ocsinvestigation = vo.getOCSInvestigation() == null ? null : (ims.emergency.vo.beans.OrderInvestigationForAttendenceNotesCcVoBean)vo.getOCSInvestigation().getBean(map);
	}

	public ims.emergency.vo.InvestigationAttendenceDetailVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.emergency.vo.InvestigationAttendenceDetailVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.InvestigationAttendenceDetailVo vo = null;
		if(map != null)
			vo = (ims.emergency.vo.InvestigationAttendenceDetailVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.emergency.vo.InvestigationAttendenceDetailVo();
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
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}
	public ims.vo.LookupInstanceBean getAttendenceInvestigation()
	{
		return this.attendenceinvestigation;
	}
	public void setAttendenceInvestigation(ims.vo.LookupInstanceBean value)
	{
		this.attendenceinvestigation = value;
	}
	public Boolean getActive()
	{
		return this.active;
	}
	public void setActive(Boolean value)
	{
		this.active = value;
	}
	public Boolean getAddedDuringCoding()
	{
		return this.addedduringcoding;
	}
	public void setAddedDuringCoding(Boolean value)
	{
		this.addedduringcoding = value;
	}
	public ims.emergency.vo.beans.OrderInvestigationForAttendenceNotesCcVoBean getOCSInvestigation()
	{
		return this.ocsinvestigation;
	}
	public void setOCSInvestigation(ims.emergency.vo.beans.OrderInvestigationForAttendenceNotesCcVoBean value)
	{
		this.ocsinvestigation = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
	private ims.vo.LookupInstanceBean attendenceinvestigation;
	private Boolean active;
	private Boolean addedduringcoding;
	private ims.emergency.vo.beans.OrderInvestigationForAttendenceNotesCcVoBean ocsinvestigation;
}
