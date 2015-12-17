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

package ims.clinical.vo.beans;

public class NeonatalVoBean extends ims.vo.ValueObjectBean
{
	public NeonatalVoBean()
	{
	}
	public NeonatalVoBean(ims.clinical.vo.NeonatalVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		// Interface field type not supported.
		this.gestationweeks = vo.getGestationWeeks();
		this.ismidwife = vo.getIsMidwife();
		this.ishealthvisitor = vo.getIsHealthVisitor();
		this.feeding = vo.getFeeding() == null ? null : (ims.vo.LookupInstanceBean)vo.getFeeding().getBean();
		this.isvitaminkgiven = vo.getIsVitaminKGiven();
		this.route = vo.getRoute() == null ? null : (ims.vo.LookupInstanceBean)vo.getRoute().getBean();
		this.firstpkutestdate = vo.getFirstPKUTestDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFirstPKUTestDate().getBean();
		this.secondpkutestdate = vo.getSecondPKUTestDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getSecondPKUTestDate().getBean();
		this.apgar1minute = vo.getApgar1Minute();
		this.apgar5minute = vo.getApgar5Minute();
		this.birthweight = vo.getBirthWeight();
		this.length = vo.getLength();
		this.dischargeweight = vo.getDischargeWeight();
		this.iscomplete = vo.getIsComplete();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.NeonatalVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		// Interface field type not supported.
		this.gestationweeks = vo.getGestationWeeks();
		this.ismidwife = vo.getIsMidwife();
		this.ishealthvisitor = vo.getIsHealthVisitor();
		this.feeding = vo.getFeeding() == null ? null : (ims.vo.LookupInstanceBean)vo.getFeeding().getBean();
		this.isvitaminkgiven = vo.getIsVitaminKGiven();
		this.route = vo.getRoute() == null ? null : (ims.vo.LookupInstanceBean)vo.getRoute().getBean();
		this.firstpkutestdate = vo.getFirstPKUTestDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFirstPKUTestDate().getBean();
		this.secondpkutestdate = vo.getSecondPKUTestDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getSecondPKUTestDate().getBean();
		this.apgar1minute = vo.getApgar1Minute();
		this.apgar5minute = vo.getApgar5Minute();
		this.birthweight = vo.getBirthWeight();
		this.length = vo.getLength();
		this.dischargeweight = vo.getDischargeWeight();
		this.iscomplete = vo.getIsComplete();
	}

	public ims.clinical.vo.NeonatalVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.NeonatalVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.NeonatalVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.NeonatalVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.NeonatalVo();
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
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public Integer getGestationWeeks()
	{
		return this.gestationweeks;
	}
	public void setGestationWeeks(Integer value)
	{
		this.gestationweeks = value;
	}
	public Boolean getIsMidwife()
	{
		return this.ismidwife;
	}
	public void setIsMidwife(Boolean value)
	{
		this.ismidwife = value;
	}
	public Boolean getIsHealthVisitor()
	{
		return this.ishealthvisitor;
	}
	public void setIsHealthVisitor(Boolean value)
	{
		this.ishealthvisitor = value;
	}
	public ims.vo.LookupInstanceBean getFeeding()
	{
		return this.feeding;
	}
	public void setFeeding(ims.vo.LookupInstanceBean value)
	{
		this.feeding = value;
	}
	public Boolean getIsVitaminKGiven()
	{
		return this.isvitaminkgiven;
	}
	public void setIsVitaminKGiven(Boolean value)
	{
		this.isvitaminkgiven = value;
	}
	public ims.vo.LookupInstanceBean getRoute()
	{
		return this.route;
	}
	public void setRoute(ims.vo.LookupInstanceBean value)
	{
		this.route = value;
	}
	public ims.framework.utils.beans.DateBean getFirstPKUTestDate()
	{
		return this.firstpkutestdate;
	}
	public void setFirstPKUTestDate(ims.framework.utils.beans.DateBean value)
	{
		this.firstpkutestdate = value;
	}
	public ims.framework.utils.beans.DateBean getSecondPKUTestDate()
	{
		return this.secondpkutestdate;
	}
	public void setSecondPKUTestDate(ims.framework.utils.beans.DateBean value)
	{
		this.secondpkutestdate = value;
	}
	public Integer getApgar1Minute()
	{
		return this.apgar1minute;
	}
	public void setApgar1Minute(Integer value)
	{
		this.apgar1minute = value;
	}
	public Integer getApgar5Minute()
	{
		return this.apgar5minute;
	}
	public void setApgar5Minute(Integer value)
	{
		this.apgar5minute = value;
	}
	public Float getBirthWeight()
	{
		return this.birthweight;
	}
	public void setBirthWeight(Float value)
	{
		this.birthweight = value;
	}
	public Integer getLength()
	{
		return this.length;
	}
	public void setLength(Integer value)
	{
		this.length = value;
	}
	public Float getDischargeWeight()
	{
		return this.dischargeweight;
	}
	public void setDischargeWeight(Float value)
	{
		this.dischargeweight = value;
	}
	public Boolean getIsComplete()
	{
		return this.iscomplete;
	}
	public void setIsComplete(Boolean value)
	{
		this.iscomplete = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean carecontext;
	private Integer gestationweeks;
	private Boolean ismidwife;
	private Boolean ishealthvisitor;
	private ims.vo.LookupInstanceBean feeding;
	private Boolean isvitaminkgiven;
	private ims.vo.LookupInstanceBean route;
	private ims.framework.utils.beans.DateBean firstpkutestdate;
	private ims.framework.utils.beans.DateBean secondpkutestdate;
	private Integer apgar1minute;
	private Integer apgar5minute;
	private Float birthweight;
	private Integer length;
	private Float dischargeweight;
	private Boolean iscomplete;
}