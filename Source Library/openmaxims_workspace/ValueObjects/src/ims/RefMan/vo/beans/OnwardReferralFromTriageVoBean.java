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

public class OnwardReferralFromTriageVoBean extends ims.vo.ValueObjectBean
{
	public OnwardReferralFromTriageVoBean()
	{
	}
	public OnwardReferralFromTriageVoBean(ims.RefMan.vo.OnwardReferralFromTriageVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.referreddate = vo.getReferredDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getReferredDate().getBean();
		this.secondarycareprovider = vo.getSecondaryCareProvider() == null ? null : (ims.core.vo.beans.OrgLiteVoBean)vo.getSecondaryCareProvider().getBean();
		this.requestedbygp = vo.getRequestedByGP() == null ? null : (ims.vo.LookupInstanceBean)vo.getRequestedByGP().getBean();
		this.agreewithdecision = vo.getAgreeWithDecision() == null ? null : (ims.vo.LookupInstanceBean)vo.getAgreeWithDecision().getBean();
		this.notes = vo.getNotes();
		this.servicereferredinto = vo.getServiceReferredInto() == null ? null : (ims.vo.LookupInstanceBean)vo.getServiceReferredInto().getBean();
		this.referralcomplete = vo.getReferralComplete() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralComplete().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.OnwardReferralFromTriageVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.referreddate = vo.getReferredDate() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getReferredDate().getBean();
		this.secondarycareprovider = vo.getSecondaryCareProvider() == null ? null : (ims.core.vo.beans.OrgLiteVoBean)vo.getSecondaryCareProvider().getBean(map);
		this.requestedbygp = vo.getRequestedByGP() == null ? null : (ims.vo.LookupInstanceBean)vo.getRequestedByGP().getBean();
		this.agreewithdecision = vo.getAgreeWithDecision() == null ? null : (ims.vo.LookupInstanceBean)vo.getAgreeWithDecision().getBean();
		this.notes = vo.getNotes();
		this.servicereferredinto = vo.getServiceReferredInto() == null ? null : (ims.vo.LookupInstanceBean)vo.getServiceReferredInto().getBean();
		this.referralcomplete = vo.getReferralComplete() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralComplete().getBean();
	}

	public ims.RefMan.vo.OnwardReferralFromTriageVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.OnwardReferralFromTriageVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.OnwardReferralFromTriageVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.OnwardReferralFromTriageVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.OnwardReferralFromTriageVo();
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
	public ims.vo.RefVoBean getCatsReferral()
	{
		return this.catsreferral;
	}
	public void setCatsReferral(ims.vo.RefVoBean value)
	{
		this.catsreferral = value;
	}
	public ims.framework.utils.beans.DateTimeBean getReferredDate()
	{
		return this.referreddate;
	}
	public void setReferredDate(ims.framework.utils.beans.DateTimeBean value)
	{
		this.referreddate = value;
	}
	public ims.core.vo.beans.OrgLiteVoBean getSecondaryCareProvider()
	{
		return this.secondarycareprovider;
	}
	public void setSecondaryCareProvider(ims.core.vo.beans.OrgLiteVoBean value)
	{
		this.secondarycareprovider = value;
	}
	public ims.vo.LookupInstanceBean getRequestedByGP()
	{
		return this.requestedbygp;
	}
	public void setRequestedByGP(ims.vo.LookupInstanceBean value)
	{
		this.requestedbygp = value;
	}
	public ims.vo.LookupInstanceBean getAgreeWithDecision()
	{
		return this.agreewithdecision;
	}
	public void setAgreeWithDecision(ims.vo.LookupInstanceBean value)
	{
		this.agreewithdecision = value;
	}
	public String getNotes()
	{
		return this.notes;
	}
	public void setNotes(String value)
	{
		this.notes = value;
	}
	public ims.vo.LookupInstanceBean getServiceReferredInto()
	{
		return this.servicereferredinto;
	}
	public void setServiceReferredInto(ims.vo.LookupInstanceBean value)
	{
		this.servicereferredinto = value;
	}
	public ims.vo.LookupInstanceBean getReferralComplete()
	{
		return this.referralcomplete;
	}
	public void setReferralComplete(ims.vo.LookupInstanceBean value)
	{
		this.referralcomplete = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean catsreferral;
	private ims.framework.utils.beans.DateTimeBean referreddate;
	private ims.core.vo.beans.OrgLiteVoBean secondarycareprovider;
	private ims.vo.LookupInstanceBean requestedbygp;
	private ims.vo.LookupInstanceBean agreewithdecision;
	private String notes;
	private ims.vo.LookupInstanceBean servicereferredinto;
	private ims.vo.LookupInstanceBean referralcomplete;
}
