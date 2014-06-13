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

package ims.ocrr.vo.beans;

public class ClinicalImagingResultVoBean extends ims.vo.ValueObjectBean
{
	public ClinicalImagingResultVoBean()
	{
	}
	public ClinicalImagingResultVoBean(ims.ocrr.vo.ClinicalImagingResultVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.investigation = vo.getInvestigation() == null ? null : (ims.ocrr.vo.beans.NewResultInvestigationVoBean)vo.getInvestigation().getBean();
		this.orderdetails = vo.getOrderDetails() == null ? null : (ims.ocrr.vo.beans.NewResultOcsOrderVoBean)vo.getOrderDetails().getBean();
		this.resultdemographics = vo.getResultDemographics() == null ? null : (ims.ocrr.vo.beans.ResultDemographicsVoBean)vo.getResultDemographics().getBean();
		this.repdatetime = vo.getRepDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRepDateTime().getBean();
		this.reptimesupplied = vo.getRepTimeSupplied();
		this.resultstatus = vo.getResultStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getResultStatus().getBean();
		this.displayflag = vo.getDisplayFlag() == null ? null : (ims.vo.LookupInstanceBean)vo.getDisplayFlag().getBean();
		this.ordinvcurrentstatus = vo.getOrdInvCurrentStatus() == null ? null : (ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean)vo.getOrdInvCurrentStatus().getBean();
		this.ordinvstatushistory = vo.getOrdInvStatusHistory() == null ? null : vo.getOrdInvStatusHistory().getBeanCollection();
		this.fillerordnum = vo.getFillerOrdNum();
		this.requestedlocation = vo.getRequestedLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getRequestedLocation().getBean();
		this.resultconclusioncomments = vo.getResultConclusionComments() == null ? null : vo.getResultConclusionComments().getBeanCollection();
		this.resultdetails = vo.getResultDetails() == null ? null : (ims.ocrr.vo.beans.ResultDetailsForClinicalImagingResultVoBean)vo.getResultDetails().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.ClinicalImagingResultVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.investigation = vo.getInvestigation() == null ? null : (ims.ocrr.vo.beans.NewResultInvestigationVoBean)vo.getInvestigation().getBean(map);
		this.orderdetails = vo.getOrderDetails() == null ? null : (ims.ocrr.vo.beans.NewResultOcsOrderVoBean)vo.getOrderDetails().getBean(map);
		this.resultdemographics = vo.getResultDemographics() == null ? null : (ims.ocrr.vo.beans.ResultDemographicsVoBean)vo.getResultDemographics().getBean(map);
		this.repdatetime = vo.getRepDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getRepDateTime().getBean();
		this.reptimesupplied = vo.getRepTimeSupplied();
		this.resultstatus = vo.getResultStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getResultStatus().getBean();
		this.displayflag = vo.getDisplayFlag() == null ? null : (ims.vo.LookupInstanceBean)vo.getDisplayFlag().getBean();
		this.ordinvcurrentstatus = vo.getOrdInvCurrentStatus() == null ? null : (ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean)vo.getOrdInvCurrentStatus().getBean(map);
		this.ordinvstatushistory = vo.getOrdInvStatusHistory() == null ? null : vo.getOrdInvStatusHistory().getBeanCollection();
		this.fillerordnum = vo.getFillerOrdNum();
		this.requestedlocation = vo.getRequestedLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getRequestedLocation().getBean(map);
		this.resultconclusioncomments = vo.getResultConclusionComments() == null ? null : vo.getResultConclusionComments().getBeanCollection();
		this.resultdetails = vo.getResultDetails() == null ? null : (ims.ocrr.vo.beans.ResultDetailsForClinicalImagingResultVoBean)vo.getResultDetails().getBean(map);
	}

	public ims.ocrr.vo.ClinicalImagingResultVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.ClinicalImagingResultVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.ClinicalImagingResultVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.ClinicalImagingResultVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.ClinicalImagingResultVo();
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
	public ims.ocrr.vo.beans.NewResultInvestigationVoBean getInvestigation()
	{
		return this.investigation;
	}
	public void setInvestigation(ims.ocrr.vo.beans.NewResultInvestigationVoBean value)
	{
		this.investigation = value;
	}
	public ims.ocrr.vo.beans.NewResultOcsOrderVoBean getOrderDetails()
	{
		return this.orderdetails;
	}
	public void setOrderDetails(ims.ocrr.vo.beans.NewResultOcsOrderVoBean value)
	{
		this.orderdetails = value;
	}
	public ims.ocrr.vo.beans.ResultDemographicsVoBean getResultDemographics()
	{
		return this.resultdemographics;
	}
	public void setResultDemographics(ims.ocrr.vo.beans.ResultDemographicsVoBean value)
	{
		this.resultdemographics = value;
	}
	public ims.framework.utils.beans.DateTimeBean getRepDateTime()
	{
		return this.repdatetime;
	}
	public void setRepDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.repdatetime = value;
	}
	public Boolean getRepTimeSupplied()
	{
		return this.reptimesupplied;
	}
	public void setRepTimeSupplied(Boolean value)
	{
		this.reptimesupplied = value;
	}
	public ims.vo.LookupInstanceBean getResultStatus()
	{
		return this.resultstatus;
	}
	public void setResultStatus(ims.vo.LookupInstanceBean value)
	{
		this.resultstatus = value;
	}
	public ims.vo.LookupInstanceBean getDisplayFlag()
	{
		return this.displayflag;
	}
	public void setDisplayFlag(ims.vo.LookupInstanceBean value)
	{
		this.displayflag = value;
	}
	public ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean getOrdInvCurrentStatus()
	{
		return this.ordinvcurrentstatus;
	}
	public void setOrdInvCurrentStatus(ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean value)
	{
		this.ordinvcurrentstatus = value;
	}
	public ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean[] getOrdInvStatusHistory()
	{
		return this.ordinvstatushistory;
	}
	public void setOrdInvStatusHistory(ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean[] value)
	{
		this.ordinvstatushistory = value;
	}
	public String getFillerOrdNum()
	{
		return this.fillerordnum;
	}
	public void setFillerOrdNum(String value)
	{
		this.fillerordnum = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getRequestedLocation()
	{
		return this.requestedlocation;
	}
	public void setRequestedLocation(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.requestedlocation = value;
	}
	public ims.ocrr.vo.beans.ResultCommentsLiteVoBean[] getResultConclusionComments()
	{
		return this.resultconclusioncomments;
	}
	public void setResultConclusionComments(ims.ocrr.vo.beans.ResultCommentsLiteVoBean[] value)
	{
		this.resultconclusioncomments = value;
	}
	public ims.ocrr.vo.beans.ResultDetailsForClinicalImagingResultVoBean getResultDetails()
	{
		return this.resultdetails;
	}
	public void setResultDetails(ims.ocrr.vo.beans.ResultDetailsForClinicalImagingResultVoBean value)
	{
		this.resultdetails = value;
	}

	private Integer id;
	private int version;
	private ims.ocrr.vo.beans.NewResultInvestigationVoBean investigation;
	private ims.ocrr.vo.beans.NewResultOcsOrderVoBean orderdetails;
	private ims.ocrr.vo.beans.ResultDemographicsVoBean resultdemographics;
	private ims.framework.utils.beans.DateTimeBean repdatetime;
	private Boolean reptimesupplied;
	private ims.vo.LookupInstanceBean resultstatus;
	private ims.vo.LookupInstanceBean displayflag;
	private ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean ordinvcurrentstatus;
	private ims.ocrr.vo.beans.OrderedInvestigationStatusVoBean[] ordinvstatushistory;
	private String fillerordnum;
	private ims.core.vo.beans.LocationLiteVoBean requestedlocation;
	private ims.ocrr.vo.beans.ResultCommentsLiteVoBean[] resultconclusioncomments;
	private ims.ocrr.vo.beans.ResultDetailsForClinicalImagingResultVoBean resultdetails;
}