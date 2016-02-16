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

package ims.ocs_if.vo;

/**
 * Linked to OCRR.OrderingResults.ResultDetails business object (ID: 1070100028).
 */
public class IfResultDetailsVo extends ims.ocrr.orderingresults.vo.ResultDetailsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public IfResultDetailsVo()
	{
	}
	public IfResultDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public IfResultDetailsVo(ims.ocs_if.vo.beans.IfResultDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.pathologyresultdetails = ims.ocs_if.vo.IfOcsPathResultVoCollection.buildFromBeanCollection(bean.getPathologyResultDetails());
		this.clinicalresultdetails = bean.getClinicalResultDetails() == null ? null : bean.getClinicalResultDetails().buildVo();
		this.type = bean.getType() == null ? null : ims.ocrr.vo.lookups.ResultDetailsType.buildLookup(bean.getType());
		this.invcode = bean.getInvCode();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocs_if.vo.beans.IfResultDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.pathologyresultdetails = ims.ocs_if.vo.IfOcsPathResultVoCollection.buildFromBeanCollection(bean.getPathologyResultDetails());
		this.clinicalresultdetails = bean.getClinicalResultDetails() == null ? null : bean.getClinicalResultDetails().buildVo(map);
		this.type = bean.getType() == null ? null : ims.ocrr.vo.lookups.ResultDetailsType.buildLookup(bean.getType());
		this.invcode = bean.getInvCode();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocs_if.vo.beans.IfResultDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.ocs_if.vo.beans.IfResultDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocs_if.vo.beans.IfResultDetailsVoBean();
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
		if(fieldName.equals("PATHOLOGYRESULTDETAILS"))
			return getPathologyResultDetails();
		if(fieldName.equals("CLINICALRESULTDETAILS"))
			return getClinicalResultDetails();
		if(fieldName.equals("TYPE"))
			return getType();
		if(fieldName.equals("INVCODE"))
			return getInvCode();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPathologyResultDetailsIsNotNull()
	{
		return this.pathologyresultdetails != null;
	}
	public ims.ocs_if.vo.IfOcsPathResultVoCollection getPathologyResultDetails()
	{
		return this.pathologyresultdetails;
	}
	public void setPathologyResultDetails(ims.ocs_if.vo.IfOcsPathResultVoCollection value)
	{
		this.isValidated = false;
		this.pathologyresultdetails = value;
	}
	public boolean getClinicalResultDetailsIsNotNull()
	{
		return this.clinicalresultdetails != null;
	}
	public ims.ocs_if.vo.IfOcsRadResultVo getClinicalResultDetails()
	{
		return this.clinicalresultdetails;
	}
	public void setClinicalResultDetails(ims.ocs_if.vo.IfOcsRadResultVo value)
	{
		this.isValidated = false;
		this.clinicalresultdetails = value;
	}
	public boolean getTypeIsNotNull()
	{
		return this.type != null;
	}
	public ims.ocrr.vo.lookups.ResultDetailsType getType()
	{
		return this.type;
	}
	public void setType(ims.ocrr.vo.lookups.ResultDetailsType value)
	{
		this.isValidated = false;
		this.type = value;
	}
	public boolean getInvCodeIsNotNull()
	{
		return this.invcode != null;
	}
	public String getInvCode()
	{
		return this.invcode;
	}
	public static int getInvCodeMaxLength()
	{
		return 255;
	}
	public void setInvCode(String value)
	{
		this.isValidated = false;
		this.invcode = value;
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
		if(this.pathologyresultdetails != null)
		{
			if(!this.pathologyresultdetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.clinicalresultdetails != null)
		{
			if(!this.clinicalresultdetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.pathologyresultdetails != null)
		{
			String[] listOfOtherErrors = this.pathologyresultdetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.clinicalresultdetails != null)
		{
			String[] listOfOtherErrors = this.clinicalresultdetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.type == null)
			listOfErrors.add("Type is mandatory");
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
	
		IfResultDetailsVo clone = new IfResultDetailsVo(this.id, this.version);
		
		if(this.pathologyresultdetails == null)
			clone.pathologyresultdetails = null;
		else
			clone.pathologyresultdetails = (ims.ocs_if.vo.IfOcsPathResultVoCollection)this.pathologyresultdetails.clone();
		if(this.clinicalresultdetails == null)
			clone.clinicalresultdetails = null;
		else
			clone.clinicalresultdetails = (ims.ocs_if.vo.IfOcsRadResultVo)this.clinicalresultdetails.clone();
		if(this.type == null)
			clone.type = null;
		else
			clone.type = (ims.ocrr.vo.lookups.ResultDetailsType)this.type.clone();
		clone.invcode = this.invcode;
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
		if (!(IfResultDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A IfResultDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((IfResultDetailsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((IfResultDetailsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.pathologyresultdetails != null)
			count++;
		if(this.clinicalresultdetails != null)
			count++;
		if(this.type != null)
			count++;
		if(this.invcode != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.ocs_if.vo.IfOcsPathResultVoCollection pathologyresultdetails;
	protected ims.ocs_if.vo.IfOcsRadResultVo clinicalresultdetails;
	protected ims.ocrr.vo.lookups.ResultDetailsType type;
	protected String invcode;
	private boolean isValidated = false;
	private boolean isBusy = false;
}