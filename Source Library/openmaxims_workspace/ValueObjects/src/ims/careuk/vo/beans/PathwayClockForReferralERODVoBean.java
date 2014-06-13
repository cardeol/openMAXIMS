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

package ims.careuk.vo.beans;

public class PathwayClockForReferralERODVoBean extends ims.vo.ValueObjectBean
{
	public PathwayClockForReferralERODVoBean()
	{
	}
	public PathwayClockForReferralERODVoBean(ims.careuk.vo.PathwayClockForReferralERODVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		if(vo.getPauseDetails() != null)
		{
			this.pausedetails = new ims.vo.RefVoBean[vo.getPauseDetails().size()];
			for(int pausedetails_i = 0; pausedetails_i < vo.getPauseDetails().size(); pausedetails_i++)
			{
				this.pausedetails[pausedetails_i] = new ims.vo.RefVoBean(vo.getPauseDetails().get(pausedetails_i).getBoId(),vo.getPauseDetails().get(pausedetails_i).getBoVersion());
			}
		}
		this.currentpause = vo.getCurrentPause() == null ? null : new ims.vo.RefVoBean(vo.getCurrentPause().getBoId(), vo.getCurrentPause().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.careuk.vo.PathwayClockForReferralERODVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		if(vo.getPauseDetails() != null)
		{
			this.pausedetails = new ims.vo.RefVoBean[vo.getPauseDetails().size()];
			for(int pausedetails_i = 0; pausedetails_i < vo.getPauseDetails().size(); pausedetails_i++)
			{
				this.pausedetails[pausedetails_i] = new ims.vo.RefVoBean(vo.getPauseDetails().get(pausedetails_i).getBoId(),vo.getPauseDetails().get(pausedetails_i).getBoVersion());
			}
		}
		this.currentpause = vo.getCurrentPause() == null ? null : new ims.vo.RefVoBean(vo.getCurrentPause().getBoId(), vo.getCurrentPause().getBoVersion());
	}

	public ims.careuk.vo.PathwayClockForReferralERODVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.careuk.vo.PathwayClockForReferralERODVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.careuk.vo.PathwayClockForReferralERODVo vo = null;
		if(map != null)
			vo = (ims.careuk.vo.PathwayClockForReferralERODVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.careuk.vo.PathwayClockForReferralERODVo();
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
	public ims.vo.RefVoBean[] getPauseDetails()
	{
		return this.pausedetails;
	}
	public void setPauseDetails(ims.vo.RefVoBean[] value)
	{
		this.pausedetails = value;
	}
	public ims.vo.RefVoBean getCurrentPause()
	{
		return this.currentpause;
	}
	public void setCurrentPause(ims.vo.RefVoBean value)
	{
		this.currentpause = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean[] pausedetails;
	private ims.vo.RefVoBean currentpause;
}