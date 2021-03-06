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

package ims.RefMan.vo.beans;

public class ReferralOverviewAndKpisVoBean extends ims.vo.ValueObjectBean
{
	public ReferralOverviewAndKpisVoBean()
	{
	}
	public ReferralOverviewAndKpisVoBean(ims.RefMan.vo.ReferralOverviewAndKpisVo vo)
	{
		this.catsreferral = vo.getCatsReferral() == null ? null : (ims.RefMan.vo.beans.CatsReferralListVoBean)vo.getCatsReferral().getBean();
		this.enddayskpi = vo.getEndDaysKpi();
		this.enddayspaperkpi = vo.getEndDaysPaperKpi();
		this.enddaysemailkpi = vo.getEndDaysEmailKpi();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.ReferralOverviewAndKpisVo vo)
	{
		this.catsreferral = vo.getCatsReferral() == null ? null : (ims.RefMan.vo.beans.CatsReferralListVoBean)vo.getCatsReferral().getBean(map);
		this.enddayskpi = vo.getEndDaysKpi();
		this.enddayspaperkpi = vo.getEndDaysPaperKpi();
		this.enddaysemailkpi = vo.getEndDaysEmailKpi();
	}

	public ims.RefMan.vo.ReferralOverviewAndKpisVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.ReferralOverviewAndKpisVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.ReferralOverviewAndKpisVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.ReferralOverviewAndKpisVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.ReferralOverviewAndKpisVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.RefMan.vo.beans.CatsReferralListVoBean getCatsReferral()
	{
		return this.catsreferral;
	}
	public void setCatsReferral(ims.RefMan.vo.beans.CatsReferralListVoBean value)
	{
		this.catsreferral = value;
	}
	public Integer getEndDaysKpi()
	{
		return this.enddayskpi;
	}
	public void setEndDaysKpi(Integer value)
	{
		this.enddayskpi = value;
	}
	public Integer getEndDaysPaperKpi()
	{
		return this.enddayspaperkpi;
	}
	public void setEndDaysPaperKpi(Integer value)
	{
		this.enddayspaperkpi = value;
	}
	public Integer getEndDaysEmailKpi()
	{
		return this.enddaysemailkpi;
	}
	public void setEndDaysEmailKpi(Integer value)
	{
		this.enddaysemailkpi = value;
	}

	private ims.RefMan.vo.beans.CatsReferralListVoBean catsreferral;
	private Integer enddayskpi;
	private Integer enddayspaperkpi;
	private Integer enddaysemailkpi;
}
