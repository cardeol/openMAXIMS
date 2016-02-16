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

package ims.emergency.vo;

/**
 * Linked to core.configuration.EDDischargeSummarySchedule business object (ID: 1028100069).
 */
public class EDDischargeSummaryScheduleVo extends ims.core.configuration.vo.EDDischargeSummaryScheduleRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public EDDischargeSummaryScheduleVo()
	{
	}
	public EDDischargeSummaryScheduleVo(Integer id, int version)
	{
		super(id, version);
	}
	public EDDischargeSummaryScheduleVo(ims.emergency.vo.beans.EDDischargeSummaryScheduleVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.generatedlettersno = bean.getGeneratedLettersNo();
		this.printagentto = bean.getPrintAgentTo();
		this.successfulemailsno = bean.getSuccessfulEmailsNo();
		this.failedemailsno = bean.getFailedEmailsNo();
		this.printedlettersno = bean.getPrintedLettersNo();
		this.configuredjobdetails = bean.getConfiguredJobDetails() == null ? null : new ims.core.configuration.vo.ConfiguredJobRefVo(new Integer(bean.getConfiguredJobDetails().getId()), bean.getConfiguredJobDetails().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.EDDischargeSummaryScheduleVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.generatedlettersno = bean.getGeneratedLettersNo();
		this.printagentto = bean.getPrintAgentTo();
		this.successfulemailsno = bean.getSuccessfulEmailsNo();
		this.failedemailsno = bean.getFailedEmailsNo();
		this.printedlettersno = bean.getPrintedLettersNo();
		this.configuredjobdetails = bean.getConfiguredJobDetails() == null ? null : new ims.core.configuration.vo.ConfiguredJobRefVo(new Integer(bean.getConfiguredJobDetails().getId()), bean.getConfiguredJobDetails().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.EDDischargeSummaryScheduleVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.EDDischargeSummaryScheduleVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.EDDischargeSummaryScheduleVoBean();
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
		if(fieldName.equals("GENERATEDLETTERSNO"))
			return getGeneratedLettersNo();
		if(fieldName.equals("PRINTAGENTTO"))
			return getPrintAgentTo();
		if(fieldName.equals("SUCCESSFULEMAILSNO"))
			return getSuccessfulEmailsNo();
		if(fieldName.equals("FAILEDEMAILSNO"))
			return getFailedEmailsNo();
		if(fieldName.equals("PRINTEDLETTERSNO"))
			return getPrintedLettersNo();
		if(fieldName.equals("CONFIGUREDJOBDETAILS"))
			return getConfiguredJobDetails();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getGeneratedLettersNoIsNotNull()
	{
		return this.generatedlettersno != null;
	}
	public Integer getGeneratedLettersNo()
	{
		return this.generatedlettersno;
	}
	public void setGeneratedLettersNo(Integer value)
	{
		this.isValidated = false;
		this.generatedlettersno = value;
	}
	public boolean getPrintAgentToIsNotNull()
	{
		return this.printagentto != null;
	}
	public String getPrintAgentTo()
	{
		return this.printagentto;
	}
	public static int getPrintAgentToMaxLength()
	{
		return 500;
	}
	public void setPrintAgentTo(String value)
	{
		this.isValidated = false;
		this.printagentto = value;
	}
	public boolean getSuccessfulEmailsNoIsNotNull()
	{
		return this.successfulemailsno != null;
	}
	public Integer getSuccessfulEmailsNo()
	{
		return this.successfulemailsno;
	}
	public void setSuccessfulEmailsNo(Integer value)
	{
		this.isValidated = false;
		this.successfulemailsno = value;
	}
	public boolean getFailedEmailsNoIsNotNull()
	{
		return this.failedemailsno != null;
	}
	public Integer getFailedEmailsNo()
	{
		return this.failedemailsno;
	}
	public void setFailedEmailsNo(Integer value)
	{
		this.isValidated = false;
		this.failedemailsno = value;
	}
	public boolean getPrintedLettersNoIsNotNull()
	{
		return this.printedlettersno != null;
	}
	public Integer getPrintedLettersNo()
	{
		return this.printedlettersno;
	}
	public void setPrintedLettersNo(Integer value)
	{
		this.isValidated = false;
		this.printedlettersno = value;
	}
	public boolean getConfiguredJobDetailsIsNotNull()
	{
		return this.configuredjobdetails != null;
	}
	public ims.core.configuration.vo.ConfiguredJobRefVo getConfiguredJobDetails()
	{
		return this.configuredjobdetails;
	}
	public void setConfiguredJobDetails(ims.core.configuration.vo.ConfiguredJobRefVo value)
	{
		this.isValidated = false;
		this.configuredjobdetails = value;
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
		if(this.printagentto != null)
			if(this.printagentto.length() > 500)
				listOfErrors.add("The length of the field [printagentto] in the value object [ims.emergency.vo.EDDischargeSummaryScheduleVo] is too big. It should be less or equal to 500");
		if(this.configuredjobdetails == null)
			listOfErrors.add("ConfiguredJobDetails is mandatory");
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
	
		EDDischargeSummaryScheduleVo clone = new EDDischargeSummaryScheduleVo(this.id, this.version);
		
		clone.generatedlettersno = this.generatedlettersno;
		clone.printagentto = this.printagentto;
		clone.successfulemailsno = this.successfulemailsno;
		clone.failedemailsno = this.failedemailsno;
		clone.printedlettersno = this.printedlettersno;
		clone.configuredjobdetails = this.configuredjobdetails;
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
		if (!(EDDischargeSummaryScheduleVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EDDischargeSummaryScheduleVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((EDDischargeSummaryScheduleVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((EDDischargeSummaryScheduleVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.generatedlettersno != null)
			count++;
		if(this.printagentto != null)
			count++;
		if(this.successfulemailsno != null)
			count++;
		if(this.failedemailsno != null)
			count++;
		if(this.printedlettersno != null)
			count++;
		if(this.configuredjobdetails != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected Integer generatedlettersno;
	protected String printagentto;
	protected Integer successfulemailsno;
	protected Integer failedemailsno;
	protected Integer printedlettersno;
	protected ims.core.configuration.vo.ConfiguredJobRefVo configuredjobdetails;
	private boolean isValidated = false;
	private boolean isBusy = false;
}