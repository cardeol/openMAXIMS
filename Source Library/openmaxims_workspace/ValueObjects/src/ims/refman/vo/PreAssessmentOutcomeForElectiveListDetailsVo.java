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

package ims.RefMan.vo;

/**
 * Linked to RefMan.PreAssessmentOutcome business object (ID: 1096100083).
 */
public class PreAssessmentOutcomeForElectiveListDetailsVo extends ims.RefMan.vo.PreAssessmentOutcomeRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PreAssessmentOutcomeForElectiveListDetailsVo()
	{
	}
	public PreAssessmentOutcomeForElectiveListDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public PreAssessmentOutcomeForElectiveListDetailsVo(ims.RefMan.vo.beans.PreAssessmentOutcomeForElectiveListDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.pacemakerdefib = bean.getPaceMakerDefib() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getPaceMakerDefib());
		this.receivinganticoag = bean.getReceivingAntiCoag() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getReceivingAntiCoag());
		this.shortnotice = bean.getShortNotice();
		this.noticeperiodvalue = bean.getNoticePeriodValue();
		this.preopovernight = bean.getPreOpOvernight();
		this.nights = bean.getNights();
		this.postopstay = bean.getPostOpStay();
		this.anaesthetictype = bean.getAnaestheticType() == null ? null : ims.clinical.vo.lookups.AnaestheticType.buildLookup(bean.getAnaestheticType());
		this.fittoproceed = bean.getFitToProceed();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.PreAssessmentOutcomeForElectiveListDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.pacemakerdefib = bean.getPaceMakerDefib() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getPaceMakerDefib());
		this.receivinganticoag = bean.getReceivingAntiCoag() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getReceivingAntiCoag());
		this.shortnotice = bean.getShortNotice();
		this.noticeperiodvalue = bean.getNoticePeriodValue();
		this.preopovernight = bean.getPreOpOvernight();
		this.nights = bean.getNights();
		this.postopstay = bean.getPostOpStay();
		this.anaesthetictype = bean.getAnaestheticType() == null ? null : ims.clinical.vo.lookups.AnaestheticType.buildLookup(bean.getAnaestheticType());
		this.fittoproceed = bean.getFitToProceed();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.PreAssessmentOutcomeForElectiveListDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.PreAssessmentOutcomeForElectiveListDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.PreAssessmentOutcomeForElectiveListDetailsVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("PACEMAKERDEFIB"))
			return getPaceMakerDefib();
		if(fieldName.equals("RECEIVINGANTICOAG"))
			return getReceivingAntiCoag();
		if(fieldName.equals("SHORTNOTICE"))
			return getShortNotice();
		if(fieldName.equals("NOTICEPERIODVALUE"))
			return getNoticePeriodValue();
		if(fieldName.equals("PREOPOVERNIGHT"))
			return getPreOpOvernight();
		if(fieldName.equals("NIGHTS"))
			return getNights();
		if(fieldName.equals("POSTOPSTAY"))
			return getPostOpStay();
		if(fieldName.equals("ANAESTHETICTYPE"))
			return getAnaestheticType();
		if(fieldName.equals("FITTOPROCEED"))
			return getFitToProceed();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPaceMakerDefibIsNotNull()
	{
		return this.pacemakerdefib != null;
	}
	public ims.core.vo.lookups.YesNo getPaceMakerDefib()
	{
		return this.pacemakerdefib;
	}
	public void setPaceMakerDefib(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.pacemakerdefib = value;
	}
	public boolean getReceivingAntiCoagIsNotNull()
	{
		return this.receivinganticoag != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getReceivingAntiCoag()
	{
		return this.receivinganticoag;
	}
	public void setReceivingAntiCoag(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.receivinganticoag = value;
	}
	public boolean getShortNoticeIsNotNull()
	{
		return this.shortnotice != null;
	}
	public Boolean getShortNotice()
	{
		return this.shortnotice;
	}
	public void setShortNotice(Boolean value)
	{
		this.isValidated = false;
		this.shortnotice = value;
	}
	public boolean getNoticePeriodValueIsNotNull()
	{
		return this.noticeperiodvalue != null;
	}
	public Integer getNoticePeriodValue()
	{
		return this.noticeperiodvalue;
	}
	public void setNoticePeriodValue(Integer value)
	{
		this.isValidated = false;
		this.noticeperiodvalue = value;
	}
	public boolean getPreOpOvernightIsNotNull()
	{
		return this.preopovernight != null;
	}
	public Boolean getPreOpOvernight()
	{
		return this.preopovernight;
	}
	public void setPreOpOvernight(Boolean value)
	{
		this.isValidated = false;
		this.preopovernight = value;
	}
	public boolean getNightsIsNotNull()
	{
		return this.nights != null;
	}
	public Integer getNights()
	{
		return this.nights;
	}
	public void setNights(Integer value)
	{
		this.isValidated = false;
		this.nights = value;
	}
	public boolean getPostOpStayIsNotNull()
	{
		return this.postopstay != null;
	}
	public Integer getPostOpStay()
	{
		return this.postopstay;
	}
	public void setPostOpStay(Integer value)
	{
		this.isValidated = false;
		this.postopstay = value;
	}
	public boolean getAnaestheticTypeIsNotNull()
	{
		return this.anaesthetictype != null;
	}
	public ims.clinical.vo.lookups.AnaestheticType getAnaestheticType()
	{
		return this.anaesthetictype;
	}
	public void setAnaestheticType(ims.clinical.vo.lookups.AnaestheticType value)
	{
		this.isValidated = false;
		this.anaesthetictype = value;
	}
	public boolean getFitToProceedIsNotNull()
	{
		return this.fittoproceed != null;
	}
	public Boolean getFitToProceed()
	{
		return this.fittoproceed;
	}
	public void setFitToProceed(Boolean value)
	{
		this.isValidated = false;
		this.fittoproceed = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PreAssessmentOutcomeForElectiveListDetailsVo clone = new PreAssessmentOutcomeForElectiveListDetailsVo(this.id, this.version);
		
		if(this.pacemakerdefib == null)
			clone.pacemakerdefib = null;
		else
			clone.pacemakerdefib = (ims.core.vo.lookups.YesNo)this.pacemakerdefib.clone();
		if(this.receivinganticoag == null)
			clone.receivinganticoag = null;
		else
			clone.receivinganticoag = (ims.core.vo.lookups.YesNoUnknown)this.receivinganticoag.clone();
		clone.shortnotice = this.shortnotice;
		clone.noticeperiodvalue = this.noticeperiodvalue;
		clone.preopovernight = this.preopovernight;
		clone.nights = this.nights;
		clone.postopstay = this.postopstay;
		if(this.anaesthetictype == null)
			clone.anaesthetictype = null;
		else
			clone.anaesthetictype = (ims.clinical.vo.lookups.AnaestheticType)this.anaesthetictype.clone();
		clone.fittoproceed = this.fittoproceed;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(PreAssessmentOutcomeForElectiveListDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PreAssessmentOutcomeForElectiveListDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PreAssessmentOutcomeForElectiveListDetailsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PreAssessmentOutcomeForElectiveListDetailsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.pacemakerdefib != null)
			count++;
		if(this.receivinganticoag != null)
			count++;
		if(this.shortnotice != null)
			count++;
		if(this.noticeperiodvalue != null)
			count++;
		if(this.preopovernight != null)
			count++;
		if(this.nights != null)
			count++;
		if(this.postopstay != null)
			count++;
		if(this.anaesthetictype != null)
			count++;
		if(this.fittoproceed != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.core.vo.lookups.YesNo pacemakerdefib;
	protected ims.core.vo.lookups.YesNoUnknown receivinganticoag;
	protected Boolean shortnotice;
	protected Integer noticeperiodvalue;
	protected Boolean preopovernight;
	protected Integer nights;
	protected Integer postopstay;
	protected ims.clinical.vo.lookups.AnaestheticType anaesthetictype;
	protected Boolean fittoproceed;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
