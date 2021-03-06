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

package ims.emergency.vo;

/**
 * Linked to emergency.Configuration.ManchesterTriageProtocolConfiguration business object (ID: 1087100010).
 */
public class ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo extends ims.emergency.configuration.vo.ManchesterTriageProtocolConfigurationRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo()
	{
	}
	public ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo(Integer id, int version)
	{
		super(id, version);
	}
	public ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo(ims.emergency.vo.beans.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.protocolname = bean.getProtocolName();
		this.discriminators = ims.emergency.vo.ProtocolDiscriminatorLiteVoCollection.buildFromBeanCollection(bean.getDiscriminators());
		this.defaultpriority = bean.getDefaultPriority() == null ? null : ims.emergency.vo.lookups.TriagePriority.buildLookup(bean.getDefaultPriority());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.protocolname = bean.getProtocolName();
		this.discriminators = ims.emergency.vo.ProtocolDiscriminatorLiteVoCollection.buildFromBeanCollection(bean.getDiscriminators());
		this.defaultpriority = bean.getDefaultPriority() == null ? null : ims.emergency.vo.lookups.TriagePriority.buildLookup(bean.getDefaultPriority());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVoBean();
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
		if(fieldName.equals("PROTOCOLNAME"))
			return getProtocolName();
		if(fieldName.equals("DISCRIMINATORS"))
			return getDiscriminators();
		if(fieldName.equals("DEFAULTPRIORITY"))
			return getDefaultPriority();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getProtocolNameIsNotNull()
	{
		return this.protocolname != null;
	}
	public String getProtocolName()
	{
		return this.protocolname;
	}
	public static int getProtocolNameMaxLength()
	{
		return 100;
	}
	public void setProtocolName(String value)
	{
		this.isValidated = false;
		this.protocolname = value;
	}
	public boolean getDiscriminatorsIsNotNull()
	{
		return this.discriminators != null;
	}
	public ims.emergency.vo.ProtocolDiscriminatorLiteVoCollection getDiscriminators()
	{
		return this.discriminators;
	}
	public void setDiscriminators(ims.emergency.vo.ProtocolDiscriminatorLiteVoCollection value)
	{
		this.isValidated = false;
		this.discriminators = value;
	}
	public boolean getDefaultPriorityIsNotNull()
	{
		return this.defaultpriority != null;
	}
	public ims.emergency.vo.lookups.TriagePriority getDefaultPriority()
	{
		return this.defaultpriority;
	}
	public void setDefaultPriority(ims.emergency.vo.lookups.TriagePriority value)
	{
		this.isValidated = false;
		this.defaultpriority = value;
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
		if(this.protocolname == null || this.protocolname.length() == 0)
			listOfErrors.add("ProtocolName is mandatory");
		else if(this.protocolname.length() > 100)
			listOfErrors.add("The length of the field [protocolname] in the value object [ims.emergency.vo.ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo] is too big. It should be less or equal to 100");
		if(this.defaultpriority == null)
			listOfErrors.add("DefaultPriority is mandatory");
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
	
		ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo clone = new ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo(this.id, this.version);
		
		clone.protocolname = this.protocolname;
		if(this.discriminators == null)
			clone.discriminators = null;
		else
			clone.discriminators = (ims.emergency.vo.ProtocolDiscriminatorLiteVoCollection)this.discriminators.clone();
		if(this.defaultpriority == null)
			clone.defaultpriority = null;
		else
			clone.defaultpriority = (ims.emergency.vo.lookups.TriagePriority)this.defaultpriority.clone();
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
		if (!(ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ManchesterTriageProtocolConfigForTriageProtocolAssessmentVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.protocolname != null)
			count++;
		if(this.discriminators != null)
			count++;
		if(this.defaultpriority != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected String protocolname;
	protected ims.emergency.vo.ProtocolDiscriminatorLiteVoCollection discriminators;
	protected ims.emergency.vo.lookups.TriagePriority defaultpriority;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
