// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class CatsReferralStatusVoBean extends ims.vo.ValueObjectBean
{
	public CatsReferralStatusVoBean()
	{
	}
	public CatsReferralStatusVoBean(ims.RefMan.vo.CatsReferralStatusVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.referralstatus = vo.getReferralStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralStatus().getBean();
		this.authoringuser = vo.getAuthoringUser() == null ? null : new ims.vo.RefVoBean(vo.getAuthoringUser().getBoId(), vo.getAuthoringUser().getBoVersion());
		this.statusdatetime = vo.getStatusDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getStatusDateTime().getBean();
		this.comment = vo.getComment();
		this.secondopinioncategory = vo.getSecondOpinionCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getSecondOpinionCategory().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.CatsReferralStatusVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.referralstatus = vo.getReferralStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralStatus().getBean();
		this.authoringuser = vo.getAuthoringUser() == null ? null : new ims.vo.RefVoBean(vo.getAuthoringUser().getBoId(), vo.getAuthoringUser().getBoVersion());
		this.statusdatetime = vo.getStatusDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getStatusDateTime().getBean();
		this.comment = vo.getComment();
		this.secondopinioncategory = vo.getSecondOpinionCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getSecondOpinionCategory().getBean();
	}

	public ims.RefMan.vo.CatsReferralStatusVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.CatsReferralStatusVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.CatsReferralStatusVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.CatsReferralStatusVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.CatsReferralStatusVo();
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
	public ims.vo.LookupInstanceBean getReferralStatus()
	{
		return this.referralstatus;
	}
	public void setReferralStatus(ims.vo.LookupInstanceBean value)
	{
		this.referralstatus = value;
	}
	public ims.vo.RefVoBean getAuthoringUser()
	{
		return this.authoringuser;
	}
	public void setAuthoringUser(ims.vo.RefVoBean value)
	{
		this.authoringuser = value;
	}
	public ims.framework.utils.beans.DateTimeBean getStatusDateTime()
	{
		return this.statusdatetime;
	}
	public void setStatusDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.statusdatetime = value;
	}
	public String getComment()
	{
		return this.comment;
	}
	public void setComment(String value)
	{
		this.comment = value;
	}
	public ims.vo.LookupInstanceBean getSecondOpinionCategory()
	{
		return this.secondopinioncategory;
	}
	public void setSecondOpinionCategory(ims.vo.LookupInstanceBean value)
	{
		this.secondopinioncategory = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean referralstatus;
	private ims.vo.RefVoBean authoringuser;
	private ims.framework.utils.beans.DateTimeBean statusdatetime;
	private String comment;
	private ims.vo.LookupInstanceBean secondopinioncategory;
}
