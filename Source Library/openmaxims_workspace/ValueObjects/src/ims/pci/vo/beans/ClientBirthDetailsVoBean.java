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

package ims.pci.vo.beans;

public class ClientBirthDetailsVoBean extends ims.vo.ValueObjectBean
{
	public ClientBirthDetailsVoBean()
	{
	}
	public ClientBirthDetailsVoBean(ims.pci.vo.ClientBirthDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.client = vo.getClient() == null ? null : new ims.vo.RefVoBean(vo.getClient().getBoId(), vo.getClient().getBoVersion());
		this.placeofbirth = vo.getPlaceOfBirth() == null ? null : (ims.vo.LookupInstanceBean)vo.getPlaceOfBirth().getBean();
		this.weightatbirth = vo.getWeightAtBirth();
		this.datenotified = vo.getDateNotified() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateNotified().getBean();
		this.durationofpregnancy = vo.getDurationOfPregnancy();
		this.deliverymethod = vo.getDeliveryMethod() == null ? null : (ims.vo.LookupInstanceBean)vo.getDeliveryMethod().getBean();
		this.episiotomy = vo.getEpisiotomy() == null ? null : (ims.vo.LookupInstanceBean)vo.getEpisiotomy().getBean();
		this.epidural = vo.getEpidural() == null ? null : (ims.vo.LookupInstanceBean)vo.getEpidural().getBean();
		this.orderofbirthorder = vo.getOrderOfBirthOrder();
		this.orderofbirthnr = vo.getOrderOfBirthNr();
		this.apgar1 = vo.getApgar1();
		this.apgar5 = vo.getApgar5();
		this.apgar10 = vo.getApgar10();
		this.stillborn = vo.getStillborn();
		this.live = vo.getLive();
		this.miscarriages = vo.getMiscarriages();
		this.maritalstatusatbirth = vo.getMaritalStatusAtBirth() == null ? null : (ims.vo.LookupInstanceBean)vo.getMaritalStatusAtBirth().getBean();
		this.pkutest = vo.getPKUTest() == null ? null : (ims.vo.LookupInstanceBean)vo.getPKUTest().getBean();
		this.stillbornindicator = vo.getStillBornIndicator();
		this.breastfeeding = vo.getBreastFeeding() == null ? null : (ims.vo.LookupInstanceBean)vo.getBreastFeeding().getBean();
		this.breastfeedingatdischarge = vo.getBreastFeedingAtDischarge() == null ? null : (ims.vo.LookupInstanceBean)vo.getBreastFeedingAtDischarge().getBean();
		this.breastfeedingat3months = vo.getBreastFeedingAt3months() == null ? null : (ims.vo.LookupInstanceBean)vo.getBreastFeedingAt3months().getBean();
		this.breastfeedingatphn = vo.getBreastFeedingAtPHN() == null ? null : (ims.vo.LookupInstanceBean)vo.getBreastFeedingAtPHN().getBean();
		this.clientnotes = vo.getClientNotes();
		this.clientidofmother = vo.getClientIDOfMother();
		this.timeofbirth = vo.getTimeOfBirth();
		this.dischargedatetime = vo.getDischargeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDischargeDateTime().getBean();
		this.firstphnvisitdatetime = vo.getFirstPHNVisitDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getFirstPHNVisitDateTime().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.pci.vo.ClientBirthDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.client = vo.getClient() == null ? null : new ims.vo.RefVoBean(vo.getClient().getBoId(), vo.getClient().getBoVersion());
		this.placeofbirth = vo.getPlaceOfBirth() == null ? null : (ims.vo.LookupInstanceBean)vo.getPlaceOfBirth().getBean();
		this.weightatbirth = vo.getWeightAtBirth();
		this.datenotified = vo.getDateNotified() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateNotified().getBean();
		this.durationofpregnancy = vo.getDurationOfPregnancy();
		this.deliverymethod = vo.getDeliveryMethod() == null ? null : (ims.vo.LookupInstanceBean)vo.getDeliveryMethod().getBean();
		this.episiotomy = vo.getEpisiotomy() == null ? null : (ims.vo.LookupInstanceBean)vo.getEpisiotomy().getBean();
		this.epidural = vo.getEpidural() == null ? null : (ims.vo.LookupInstanceBean)vo.getEpidural().getBean();
		this.orderofbirthorder = vo.getOrderOfBirthOrder();
		this.orderofbirthnr = vo.getOrderOfBirthNr();
		this.apgar1 = vo.getApgar1();
		this.apgar5 = vo.getApgar5();
		this.apgar10 = vo.getApgar10();
		this.stillborn = vo.getStillborn();
		this.live = vo.getLive();
		this.miscarriages = vo.getMiscarriages();
		this.maritalstatusatbirth = vo.getMaritalStatusAtBirth() == null ? null : (ims.vo.LookupInstanceBean)vo.getMaritalStatusAtBirth().getBean();
		this.pkutest = vo.getPKUTest() == null ? null : (ims.vo.LookupInstanceBean)vo.getPKUTest().getBean();
		this.stillbornindicator = vo.getStillBornIndicator();
		this.breastfeeding = vo.getBreastFeeding() == null ? null : (ims.vo.LookupInstanceBean)vo.getBreastFeeding().getBean();
		this.breastfeedingatdischarge = vo.getBreastFeedingAtDischarge() == null ? null : (ims.vo.LookupInstanceBean)vo.getBreastFeedingAtDischarge().getBean();
		this.breastfeedingat3months = vo.getBreastFeedingAt3months() == null ? null : (ims.vo.LookupInstanceBean)vo.getBreastFeedingAt3months().getBean();
		this.breastfeedingatphn = vo.getBreastFeedingAtPHN() == null ? null : (ims.vo.LookupInstanceBean)vo.getBreastFeedingAtPHN().getBean();
		this.clientnotes = vo.getClientNotes();
		this.clientidofmother = vo.getClientIDOfMother();
		this.timeofbirth = vo.getTimeOfBirth();
		this.dischargedatetime = vo.getDischargeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDischargeDateTime().getBean();
		this.firstphnvisitdatetime = vo.getFirstPHNVisitDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getFirstPHNVisitDateTime().getBean();
	}

	public ims.pci.vo.ClientBirthDetailsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.pci.vo.ClientBirthDetailsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.pci.vo.ClientBirthDetailsVo vo = null;
		if(map != null)
			vo = (ims.pci.vo.ClientBirthDetailsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.pci.vo.ClientBirthDetailsVo();
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
	public ims.vo.RefVoBean getClient()
	{
		return this.client;
	}
	public void setClient(ims.vo.RefVoBean value)
	{
		this.client = value;
	}
	public ims.vo.LookupInstanceBean getPlaceOfBirth()
	{
		return this.placeofbirth;
	}
	public void setPlaceOfBirth(ims.vo.LookupInstanceBean value)
	{
		this.placeofbirth = value;
	}
	public Integer getWeightAtBirth()
	{
		return this.weightatbirth;
	}
	public void setWeightAtBirth(Integer value)
	{
		this.weightatbirth = value;
	}
	public ims.framework.utils.beans.DateBean getDateNotified()
	{
		return this.datenotified;
	}
	public void setDateNotified(ims.framework.utils.beans.DateBean value)
	{
		this.datenotified = value;
	}
	public Integer getDurationOfPregnancy()
	{
		return this.durationofpregnancy;
	}
	public void setDurationOfPregnancy(Integer value)
	{
		this.durationofpregnancy = value;
	}
	public ims.vo.LookupInstanceBean getDeliveryMethod()
	{
		return this.deliverymethod;
	}
	public void setDeliveryMethod(ims.vo.LookupInstanceBean value)
	{
		this.deliverymethod = value;
	}
	public ims.vo.LookupInstanceBean getEpisiotomy()
	{
		return this.episiotomy;
	}
	public void setEpisiotomy(ims.vo.LookupInstanceBean value)
	{
		this.episiotomy = value;
	}
	public ims.vo.LookupInstanceBean getEpidural()
	{
		return this.epidural;
	}
	public void setEpidural(ims.vo.LookupInstanceBean value)
	{
		this.epidural = value;
	}
	public Integer getOrderOfBirthOrder()
	{
		return this.orderofbirthorder;
	}
	public void setOrderOfBirthOrder(Integer value)
	{
		this.orderofbirthorder = value;
	}
	public Integer getOrderOfBirthNr()
	{
		return this.orderofbirthnr;
	}
	public void setOrderOfBirthNr(Integer value)
	{
		this.orderofbirthnr = value;
	}
	public Integer getApgar1()
	{
		return this.apgar1;
	}
	public void setApgar1(Integer value)
	{
		this.apgar1 = value;
	}
	public Integer getApgar5()
	{
		return this.apgar5;
	}
	public void setApgar5(Integer value)
	{
		this.apgar5 = value;
	}
	public Integer getApgar10()
	{
		return this.apgar10;
	}
	public void setApgar10(Integer value)
	{
		this.apgar10 = value;
	}
	public Integer getStillborn()
	{
		return this.stillborn;
	}
	public void setStillborn(Integer value)
	{
		this.stillborn = value;
	}
	public Integer getLive()
	{
		return this.live;
	}
	public void setLive(Integer value)
	{
		this.live = value;
	}
	public Integer getMiscarriages()
	{
		return this.miscarriages;
	}
	public void setMiscarriages(Integer value)
	{
		this.miscarriages = value;
	}
	public ims.vo.LookupInstanceBean getMaritalStatusAtBirth()
	{
		return this.maritalstatusatbirth;
	}
	public void setMaritalStatusAtBirth(ims.vo.LookupInstanceBean value)
	{
		this.maritalstatusatbirth = value;
	}
	public ims.vo.LookupInstanceBean getPKUTest()
	{
		return this.pkutest;
	}
	public void setPKUTest(ims.vo.LookupInstanceBean value)
	{
		this.pkutest = value;
	}
	public Boolean getStillBornIndicator()
	{
		return this.stillbornindicator;
	}
	public void setStillBornIndicator(Boolean value)
	{
		this.stillbornindicator = value;
	}
	public ims.vo.LookupInstanceBean getBreastFeeding()
	{
		return this.breastfeeding;
	}
	public void setBreastFeeding(ims.vo.LookupInstanceBean value)
	{
		this.breastfeeding = value;
	}
	public ims.vo.LookupInstanceBean getBreastFeedingAtDischarge()
	{
		return this.breastfeedingatdischarge;
	}
	public void setBreastFeedingAtDischarge(ims.vo.LookupInstanceBean value)
	{
		this.breastfeedingatdischarge = value;
	}
	public ims.vo.LookupInstanceBean getBreastFeedingAt3months()
	{
		return this.breastfeedingat3months;
	}
	public void setBreastFeedingAt3months(ims.vo.LookupInstanceBean value)
	{
		this.breastfeedingat3months = value;
	}
	public ims.vo.LookupInstanceBean getBreastFeedingAtPHN()
	{
		return this.breastfeedingatphn;
	}
	public void setBreastFeedingAtPHN(ims.vo.LookupInstanceBean value)
	{
		this.breastfeedingatphn = value;
	}
	public String getClientNotes()
	{
		return this.clientnotes;
	}
	public void setClientNotes(String value)
	{
		this.clientnotes = value;
	}
	public String getClientIDOfMother()
	{
		return this.clientidofmother;
	}
	public void setClientIDOfMother(String value)
	{
		this.clientidofmother = value;
	}
	public String getTimeOfBirth()
	{
		return this.timeofbirth;
	}
	public void setTimeOfBirth(String value)
	{
		this.timeofbirth = value;
	}
	public ims.framework.utils.beans.DateTimeBean getDischargeDateTime()
	{
		return this.dischargedatetime;
	}
	public void setDischargeDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.dischargedatetime = value;
	}
	public ims.framework.utils.beans.DateTimeBean getFirstPHNVisitDateTime()
	{
		return this.firstphnvisitdatetime;
	}
	public void setFirstPHNVisitDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.firstphnvisitdatetime = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean client;
	private ims.vo.LookupInstanceBean placeofbirth;
	private Integer weightatbirth;
	private ims.framework.utils.beans.DateBean datenotified;
	private Integer durationofpregnancy;
	private ims.vo.LookupInstanceBean deliverymethod;
	private ims.vo.LookupInstanceBean episiotomy;
	private ims.vo.LookupInstanceBean epidural;
	private Integer orderofbirthorder;
	private Integer orderofbirthnr;
	private Integer apgar1;
	private Integer apgar5;
	private Integer apgar10;
	private Integer stillborn;
	private Integer live;
	private Integer miscarriages;
	private ims.vo.LookupInstanceBean maritalstatusatbirth;
	private ims.vo.LookupInstanceBean pkutest;
	private Boolean stillbornindicator;
	private ims.vo.LookupInstanceBean breastfeeding;
	private ims.vo.LookupInstanceBean breastfeedingatdischarge;
	private ims.vo.LookupInstanceBean breastfeedingat3months;
	private ims.vo.LookupInstanceBean breastfeedingatphn;
	private String clientnotes;
	private String clientidofmother;
	private String timeofbirth;
	private ims.framework.utils.beans.DateTimeBean dischargedatetime;
	private ims.framework.utils.beans.DateTimeBean firstphnvisitdatetime;
}