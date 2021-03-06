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

public class PASEventForVTERiskAssessmentVoBean extends ims.vo.ValueObjectBean
{
	public PASEventForVTERiskAssessmentVoBean()
	{
	}
	public PASEventForVTERiskAssessmentVoBean(ims.core.vo.PASEventForVTERiskAssessmentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientForVTERiskAssessmentVoBean)vo.getPatient().getBean();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.MedicLiteVoBean)vo.getConsultant().getBean();
		this.location = vo.getLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getLocation().getBean();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PASEventForVTERiskAssessmentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientForVTERiskAssessmentVoBean)vo.getPatient().getBean(map);
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.MedicLiteVoBean)vo.getConsultant().getBean(map);
		this.location = vo.getLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getLocation().getBean(map);
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
	}

	public ims.core.vo.PASEventForVTERiskAssessmentVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PASEventForVTERiskAssessmentVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PASEventForVTERiskAssessmentVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PASEventForVTERiskAssessmentVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PASEventForVTERiskAssessmentVo();
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
	public ims.core.vo.beans.PatientForVTERiskAssessmentVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.beans.PatientForVTERiskAssessmentVoBean value)
	{
		this.patient = value;
	}
	public ims.core.vo.beans.MedicLiteVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.core.vo.beans.MedicLiteVoBean value)
	{
		this.consultant = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getLocation()
	{
		return this.location;
	}
	public void setLocation(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.location = value;
	}
	public ims.vo.LookupInstanceBean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.vo.LookupInstanceBean value)
	{
		this.specialty = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PatientForVTERiskAssessmentVoBean patient;
	private ims.core.vo.beans.MedicLiteVoBean consultant;
	private ims.core.vo.beans.LocationLiteVoBean location;
	private ims.vo.LookupInstanceBean specialty;
}
