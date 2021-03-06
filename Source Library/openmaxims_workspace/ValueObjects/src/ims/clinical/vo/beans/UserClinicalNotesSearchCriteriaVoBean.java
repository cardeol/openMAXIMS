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

package ims.clinical.vo.beans;

public class UserClinicalNotesSearchCriteriaVoBean extends ims.vo.ValueObjectBean
{
	public UserClinicalNotesSearchCriteriaVoBean()
	{
	}
	public UserClinicalNotesSearchCriteriaVoBean(ims.clinical.vo.UserClinicalNotesSearchCriteriaVo vo)
	{
		this.fromdate = vo.getFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFromDate().getBean();
		this.todate = vo.getTodate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTodate().getBean();
		this.requiringvalidation = vo.getRequiringValidation();
		this.user = vo.getUser() == null ? null : (ims.core.vo.beans.MemberOfStaffShortVoBean)vo.getUser().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.UserClinicalNotesSearchCriteriaVo vo)
	{
		this.fromdate = vo.getFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFromDate().getBean();
		this.todate = vo.getTodate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTodate().getBean();
		this.requiringvalidation = vo.getRequiringValidation();
		this.user = vo.getUser() == null ? null : (ims.core.vo.beans.MemberOfStaffShortVoBean)vo.getUser().getBean(map);
	}

	public ims.clinical.vo.UserClinicalNotesSearchCriteriaVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.UserClinicalNotesSearchCriteriaVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.UserClinicalNotesSearchCriteriaVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.UserClinicalNotesSearchCriteriaVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.UserClinicalNotesSearchCriteriaVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.framework.utils.beans.DateBean getFromDate()
	{
		return this.fromdate;
	}
	public void setFromDate(ims.framework.utils.beans.DateBean value)
	{
		this.fromdate = value;
	}
	public ims.framework.utils.beans.DateBean getTodate()
	{
		return this.todate;
	}
	public void setTodate(ims.framework.utils.beans.DateBean value)
	{
		this.todate = value;
	}
	public Boolean getRequiringValidation()
	{
		return this.requiringvalidation;
	}
	public void setRequiringValidation(Boolean value)
	{
		this.requiringvalidation = value;
	}
	public ims.core.vo.beans.MemberOfStaffShortVoBean getUser()
	{
		return this.user;
	}
	public void setUser(ims.core.vo.beans.MemberOfStaffShortVoBean value)
	{
		this.user = value;
	}

	private ims.framework.utils.beans.DateBean fromdate;
	private ims.framework.utils.beans.DateBean todate;
	private Boolean requiringvalidation;
	private ims.core.vo.beans.MemberOfStaffShortVoBean user;
}
