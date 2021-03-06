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
 * Linked to emergency.EDPartialAdmission business object (ID: 1086100043).
 */
public class ifPartialAdmissionVo extends ims.emergency.vo.EDPartialAdmissionRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ifPartialAdmissionVo()
	{
	}
	public ifPartialAdmissionVo(Integer id, int version)
	{
		super(id, version);
	}
	public ifPartialAdmissionVo(ims.emergency.vo.beans.ifPartialAdmissionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
		this.allocatedstatus = bean.getAllocatedStatus() == null ? null : ims.emergency.vo.lookups.AllocationStatus.buildLookup(bean.getAllocatedStatus());
		this.allocatedward = bean.getAllocatedWard() == null ? null : bean.getAllocatedWard().buildVo();
		this.accomodationrequestedtype = bean.getAccomodationRequestedType() == null ? null : ims.core.vo.lookups.AccomodationRequestedType.buildLookup(bean.getAccomodationRequestedType());
		this.admittingconsultant = bean.getAdmittingConsultant() == null ? null : bean.getAdmittingConsultant().buildVo();
		this.decisiontoadmitdatetime = bean.getDecisionToAdmitDateTime() == null ? null : bean.getDecisionToAdmitDateTime().buildDateTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.ifPartialAdmissionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
		this.allocatedstatus = bean.getAllocatedStatus() == null ? null : ims.emergency.vo.lookups.AllocationStatus.buildLookup(bean.getAllocatedStatus());
		this.allocatedward = bean.getAllocatedWard() == null ? null : bean.getAllocatedWard().buildVo(map);
		this.accomodationrequestedtype = bean.getAccomodationRequestedType() == null ? null : ims.core.vo.lookups.AccomodationRequestedType.buildLookup(bean.getAccomodationRequestedType());
		this.admittingconsultant = bean.getAdmittingConsultant() == null ? null : bean.getAdmittingConsultant().buildVo(map);
		this.decisiontoadmitdatetime = bean.getDecisionToAdmitDateTime() == null ? null : bean.getDecisionToAdmitDateTime().buildDateTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.ifPartialAdmissionVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.ifPartialAdmissionVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.ifPartialAdmissionVoBean();
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
		if(fieldName.equals("SPECIALTY"))
			return getSpecialty();
		if(fieldName.equals("ALLOCATEDSTATUS"))
			return getAllocatedStatus();
		if(fieldName.equals("ALLOCATEDWARD"))
			return getAllocatedWard();
		if(fieldName.equals("ACCOMODATIONREQUESTEDTYPE"))
			return getAccomodationRequestedType();
		if(fieldName.equals("ADMITTINGCONSULTANT"))
			return getAdmittingConsultant();
		if(fieldName.equals("DECISIONTOADMITDATETIME"))
			return getDecisionToAdmitDateTime();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSpecialtyIsNotNull()
	{
		return this.specialty != null;
	}
	public ims.core.vo.lookups.Specialty getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.core.vo.lookups.Specialty value)
	{
		this.isValidated = false;
		this.specialty = value;
	}
	public boolean getAllocatedStatusIsNotNull()
	{
		return this.allocatedstatus != null;
	}
	public ims.emergency.vo.lookups.AllocationStatus getAllocatedStatus()
	{
		return this.allocatedstatus;
	}
	public void setAllocatedStatus(ims.emergency.vo.lookups.AllocationStatus value)
	{
		this.isValidated = false;
		this.allocatedstatus = value;
	}
	public boolean getAllocatedWardIsNotNull()
	{
		return this.allocatedward != null;
	}
	public ims.core.vo.LocShortMappingsVo getAllocatedWard()
	{
		return this.allocatedward;
	}
	public void setAllocatedWard(ims.core.vo.LocShortMappingsVo value)
	{
		this.isValidated = false;
		this.allocatedward = value;
	}
	public boolean getAccomodationRequestedTypeIsNotNull()
	{
		return this.accomodationrequestedtype != null;
	}
	public ims.core.vo.lookups.AccomodationRequestedType getAccomodationRequestedType()
	{
		return this.accomodationrequestedtype;
	}
	public void setAccomodationRequestedType(ims.core.vo.lookups.AccomodationRequestedType value)
	{
		this.isValidated = false;
		this.accomodationrequestedtype = value;
	}
	public boolean getAdmittingConsultantIsNotNull()
	{
		return this.admittingconsultant != null;
	}
	public ims.core.vo.Hcp getAdmittingConsultant()
	{
		return this.admittingconsultant;
	}
	public void setAdmittingConsultant(ims.core.vo.Hcp value)
	{
		this.isValidated = false;
		this.admittingconsultant = value;
	}
	public boolean getDecisionToAdmitDateTimeIsNotNull()
	{
		return this.decisiontoadmitdatetime != null;
	}
	public ims.framework.utils.DateTime getDecisionToAdmitDateTime()
	{
		return this.decisiontoadmitdatetime;
	}
	public void setDecisionToAdmitDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.decisiontoadmitdatetime = value;
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
		if(this.specialty == null)
			listOfErrors.add("Specialty is mandatory");
		if(this.admittingconsultant == null)
			listOfErrors.add("AdmittingConsultant is mandatory");
		if(this.decisiontoadmitdatetime == null)
			listOfErrors.add("DecisionToAdmitDateTime is mandatory");
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
	
		ifPartialAdmissionVo clone = new ifPartialAdmissionVo(this.id, this.version);
		
		if(this.specialty == null)
			clone.specialty = null;
		else
			clone.specialty = (ims.core.vo.lookups.Specialty)this.specialty.clone();
		if(this.allocatedstatus == null)
			clone.allocatedstatus = null;
		else
			clone.allocatedstatus = (ims.emergency.vo.lookups.AllocationStatus)this.allocatedstatus.clone();
		if(this.allocatedward == null)
			clone.allocatedward = null;
		else
			clone.allocatedward = (ims.core.vo.LocShortMappingsVo)this.allocatedward.clone();
		if(this.accomodationrequestedtype == null)
			clone.accomodationrequestedtype = null;
		else
			clone.accomodationrequestedtype = (ims.core.vo.lookups.AccomodationRequestedType)this.accomodationrequestedtype.clone();
		if(this.admittingconsultant == null)
			clone.admittingconsultant = null;
		else
			clone.admittingconsultant = (ims.core.vo.Hcp)this.admittingconsultant.clone();
		if(this.decisiontoadmitdatetime == null)
			clone.decisiontoadmitdatetime = null;
		else
			clone.decisiontoadmitdatetime = (ims.framework.utils.DateTime)this.decisiontoadmitdatetime.clone();
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
		if (!(ifPartialAdmissionVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ifPartialAdmissionVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ifPartialAdmissionVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ifPartialAdmissionVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.specialty != null)
			count++;
		if(this.allocatedstatus != null)
			count++;
		if(this.allocatedward != null)
			count++;
		if(this.accomodationrequestedtype != null)
			count++;
		if(this.admittingconsultant != null)
			count++;
		if(this.decisiontoadmitdatetime != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.core.vo.lookups.Specialty specialty;
	protected ims.emergency.vo.lookups.AllocationStatus allocatedstatus;
	protected ims.core.vo.LocShortMappingsVo allocatedward;
	protected ims.core.vo.lookups.AccomodationRequestedType accomodationrequestedtype;
	protected ims.core.vo.Hcp admittingconsultant;
	protected ims.framework.utils.DateTime decisiontoadmitdatetime;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
