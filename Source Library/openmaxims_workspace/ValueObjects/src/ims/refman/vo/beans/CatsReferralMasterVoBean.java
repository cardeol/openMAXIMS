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

public class CatsReferralMasterVoBean extends ims.vo.ValueObjectBean
{
	public CatsReferralMasterVoBean()
	{
	}
	public CatsReferralMasterVoBean(ims.RefMan.vo.CatsReferralMasterVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.referraldetails = vo.getReferralDetails() == null ? null : (ims.clinical.vo.beans.ReferralLetterDetailsVoBean)vo.getReferralDetails().getBean();
		this.carecontext = vo.getCareContext() == null ? null : (ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean)vo.getCareContext().getBean();
		this.linkedreferrals = vo.getLinkedReferrals() == null ? null : vo.getLinkedReferrals().getBeanCollection();
		this.contract = vo.getContract() == null ? null : (ims.RefMan.vo.beans.ContractConfigForReferralDetailsComponentVoBean)vo.getContract().getBean();
		this.rttclockimpact = vo.getRTTClockImpact();
		this.currentrttstatus = vo.getCurrentRTTStatus() == null ? null : (ims.pathways.vo.beans.PathwayRTTStatusVoBean)vo.getCurrentRTTStatus().getBean();
		this.journey = vo.getJourney() == null ? null : (ims.RefMan.vo.beans.PatientPathwayJourneyForTransferOfCareVoBean)vo.getJourney().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.RefMan.vo.beans.CatsReferralStatusVoBean)vo.getCurrentStatus().getBean();
		this.statushistory = vo.getStatusHistory() == null ? null : vo.getStatusHistory().getBeanCollection();
		this.urgency = vo.getUrgency() == null ? null : (ims.vo.LookupInstanceBean)vo.getUrgency().getBean();
		this.pathwayid = vo.getPathwayID();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.CatsReferralMasterVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : new ims.vo.RefVoBean(vo.getPatient().getBoId(), vo.getPatient().getBoVersion());
		this.referraldetails = vo.getReferralDetails() == null ? null : (ims.clinical.vo.beans.ReferralLetterDetailsVoBean)vo.getReferralDetails().getBean(map);
		this.carecontext = vo.getCareContext() == null ? null : (ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean)vo.getCareContext().getBean(map);
		this.linkedreferrals = vo.getLinkedReferrals() == null ? null : vo.getLinkedReferrals().getBeanCollection();
		this.contract = vo.getContract() == null ? null : (ims.RefMan.vo.beans.ContractConfigForReferralDetailsComponentVoBean)vo.getContract().getBean(map);
		this.rttclockimpact = vo.getRTTClockImpact();
		this.currentrttstatus = vo.getCurrentRTTStatus() == null ? null : (ims.pathways.vo.beans.PathwayRTTStatusVoBean)vo.getCurrentRTTStatus().getBean(map);
		this.journey = vo.getJourney() == null ? null : (ims.RefMan.vo.beans.PatientPathwayJourneyForTransferOfCareVoBean)vo.getJourney().getBean(map);
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.RefMan.vo.beans.CatsReferralStatusVoBean)vo.getCurrentStatus().getBean(map);
		this.statushistory = vo.getStatusHistory() == null ? null : vo.getStatusHistory().getBeanCollection();
		this.urgency = vo.getUrgency() == null ? null : (ims.vo.LookupInstanceBean)vo.getUrgency().getBean();
		this.pathwayid = vo.getPathwayID();
	}

	public ims.RefMan.vo.CatsReferralMasterVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.CatsReferralMasterVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.CatsReferralMasterVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.CatsReferralMasterVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.CatsReferralMasterVo();
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
	public ims.vo.RefVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.vo.RefVoBean value)
	{
		this.patient = value;
	}
	public ims.clinical.vo.beans.ReferralLetterDetailsVoBean getReferralDetails()
	{
		return this.referraldetails;
	}
	public void setReferralDetails(ims.clinical.vo.beans.ReferralLetterDetailsVoBean value)
	{
		this.referraldetails = value;
	}
	public ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean value)
	{
		this.carecontext = value;
	}
	public ims.RefMan.vo.beans.LinkedCatsReferralForOutcomeVoBean[] getLinkedReferrals()
	{
		return this.linkedreferrals;
	}
	public void setLinkedReferrals(ims.RefMan.vo.beans.LinkedCatsReferralForOutcomeVoBean[] value)
	{
		this.linkedreferrals = value;
	}
	public ims.RefMan.vo.beans.ContractConfigForReferralDetailsComponentVoBean getContract()
	{
		return this.contract;
	}
	public void setContract(ims.RefMan.vo.beans.ContractConfigForReferralDetailsComponentVoBean value)
	{
		this.contract = value;
	}
	public Boolean getRTTClockImpact()
	{
		return this.rttclockimpact;
	}
	public void setRTTClockImpact(Boolean value)
	{
		this.rttclockimpact = value;
	}
	public ims.pathways.vo.beans.PathwayRTTStatusVoBean getCurrentRTTStatus()
	{
		return this.currentrttstatus;
	}
	public void setCurrentRTTStatus(ims.pathways.vo.beans.PathwayRTTStatusVoBean value)
	{
		this.currentrttstatus = value;
	}
	public ims.RefMan.vo.beans.PatientPathwayJourneyForTransferOfCareVoBean getJourney()
	{
		return this.journey;
	}
	public void setJourney(ims.RefMan.vo.beans.PatientPathwayJourneyForTransferOfCareVoBean value)
	{
		this.journey = value;
	}
	public ims.RefMan.vo.beans.CatsReferralStatusVoBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.RefMan.vo.beans.CatsReferralStatusVoBean value)
	{
		this.currentstatus = value;
	}
	public ims.RefMan.vo.beans.CatsReferralStatusVoBean[] getStatusHistory()
	{
		return this.statushistory;
	}
	public void setStatusHistory(ims.RefMan.vo.beans.CatsReferralStatusVoBean[] value)
	{
		this.statushistory = value;
	}
	public ims.vo.LookupInstanceBean getUrgency()
	{
		return this.urgency;
	}
	public void setUrgency(ims.vo.LookupInstanceBean value)
	{
		this.urgency = value;
	}
	public String getPathwayID()
	{
		return this.pathwayid;
	}
	public void setPathwayID(String value)
	{
		this.pathwayid = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean patient;
	private ims.clinical.vo.beans.ReferralLetterDetailsVoBean referraldetails;
	private ims.RefMan.vo.beans.CareContextForRequestServiceShortVoBean carecontext;
	private ims.RefMan.vo.beans.LinkedCatsReferralForOutcomeVoBean[] linkedreferrals;
	private ims.RefMan.vo.beans.ContractConfigForReferralDetailsComponentVoBean contract;
	private Boolean rttclockimpact;
	private ims.pathways.vo.beans.PathwayRTTStatusVoBean currentrttstatus;
	private ims.RefMan.vo.beans.PatientPathwayJourneyForTransferOfCareVoBean journey;
	private ims.RefMan.vo.beans.CatsReferralStatusVoBean currentstatus;
	private ims.RefMan.vo.beans.CatsReferralStatusVoBean[] statushistory;
	private ims.vo.LookupInstanceBean urgency;
	private String pathwayid;
}
