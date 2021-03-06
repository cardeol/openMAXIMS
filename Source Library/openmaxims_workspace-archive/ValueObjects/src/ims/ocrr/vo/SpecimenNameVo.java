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

package ims.ocrr.vo;

/**
 * Linked to OCRR.OrderingResults.OrderSpecimen business object (ID: 1070100010).
 */
public class SpecimenNameVo extends ims.ocrr.orderingresults.vo.OrderSpecimenRefVo implements ims.vo.ImsCloneable, Comparable, ims.vo.interfaces.IOrderSpecimen
{
	private static final long serialVersionUID = 1L;

	public SpecimenNameVo()
	{
	}
	public SpecimenNameVo(Integer id, int version)
	{
		super(id, version);
	}
	public SpecimenNameVo(ims.ocrr.vo.beans.SpecimenNameVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.specimensource = bean.getSpecimenSource() == null ? null : ims.ocrr.vo.lookups.SpecimenType.buildLookup(bean.getSpecimenSource());
		if(bean.getPathResult() != null)
		{
			this.pathresult = new ims.ocrr.orderingresults.vo.PathResultDetailsRefVoCollection();
			for(int pathresult_i = 0; pathresult_i < bean.getPathResult().length; pathresult_i++)
			{
				this.pathresult.add(new ims.ocrr.orderingresults.vo.PathResultDetailsRefVo(new Integer(bean.getPathResult()[pathresult_i].getId()), bean.getPathResult()[pathresult_i].getVersion()));
			}
		}
		this.colldatetimefiller = bean.getCollDateTimeFiller() == null ? null : bean.getCollDateTimeFiller().buildDateTime();
		this.fillerordnum = bean.getFillerOrdNum();
		this.receiveddatetime = bean.getReceivedDateTime() == null ? null : bean.getReceivedDateTime().buildDateTime();
		this.coltimefillersupplied = bean.getColTimeFillerSupplied();
		this.receivedtimesupplied = bean.getReceivedTimeSupplied();
		this.dftspecimenresulted = bean.getDftSpecimenResulted() == null ? null : bean.getDftSpecimenResulted().buildDateTime();
		this.dftspecimenresultedtimesupplied = bean.getDftSpecimenResultedTimeSupplied();
		this.sitecd = bean.getSiteCd() == null ? null : ims.ocrr.vo.lookups.SpecimenSite.buildLookup(bean.getSiteCd());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.SpecimenNameVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.specimensource = bean.getSpecimenSource() == null ? null : ims.ocrr.vo.lookups.SpecimenType.buildLookup(bean.getSpecimenSource());
		if(bean.getPathResult() != null)
		{
			this.pathresult = new ims.ocrr.orderingresults.vo.PathResultDetailsRefVoCollection();
			for(int pathresult_i = 0; pathresult_i < bean.getPathResult().length; pathresult_i++)
			{
				this.pathresult.add(new ims.ocrr.orderingresults.vo.PathResultDetailsRefVo(new Integer(bean.getPathResult()[pathresult_i].getId()), bean.getPathResult()[pathresult_i].getVersion()));
			}
		}
		this.colldatetimefiller = bean.getCollDateTimeFiller() == null ? null : bean.getCollDateTimeFiller().buildDateTime();
		this.fillerordnum = bean.getFillerOrdNum();
		this.receiveddatetime = bean.getReceivedDateTime() == null ? null : bean.getReceivedDateTime().buildDateTime();
		this.coltimefillersupplied = bean.getColTimeFillerSupplied();
		this.receivedtimesupplied = bean.getReceivedTimeSupplied();
		this.dftspecimenresulted = bean.getDftSpecimenResulted() == null ? null : bean.getDftSpecimenResulted().buildDateTime();
		this.dftspecimenresultedtimesupplied = bean.getDftSpecimenResultedTimeSupplied();
		this.sitecd = bean.getSiteCd() == null ? null : ims.ocrr.vo.lookups.SpecimenSite.buildLookup(bean.getSiteCd());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.SpecimenNameVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.SpecimenNameVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.SpecimenNameVoBean();
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
		if(fieldName.equals("SPECIMENSOURCE"))
			return getSpecimenSource();
		if(fieldName.equals("PATHRESULT"))
			return getPathResult();
		if(fieldName.equals("COLLDATETIMEFILLER"))
			return getCollDateTimeFiller();
		if(fieldName.equals("FILLERORDNUM"))
			return getFillerOrdNum();
		if(fieldName.equals("RECEIVEDDATETIME"))
			return getReceivedDateTime();
		if(fieldName.equals("COLTIMEFILLERSUPPLIED"))
			return getColTimeFillerSupplied();
		if(fieldName.equals("RECEIVEDTIMESUPPLIED"))
			return getReceivedTimeSupplied();
		if(fieldName.equals("DFTSPECIMENRESULTED"))
			return getDftSpecimenResulted();
		if(fieldName.equals("DFTSPECIMENRESULTEDTIMESUPPLIED"))
			return getDftSpecimenResultedTimeSupplied();
		if(fieldName.equals("SITECD"))
			return getSiteCd();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getSpecimenSourceIsNotNull()
	{
		return this.specimensource != null;
	}
	public ims.ocrr.vo.lookups.SpecimenType getSpecimenSource()
	{
		return this.specimensource;
	}
	public void setSpecimenSource(ims.ocrr.vo.lookups.SpecimenType value)
	{
		this.isValidated = false;
		this.specimensource = value;
	}
	public boolean getPathResultIsNotNull()
	{
		return this.pathresult != null;
	}
	public ims.ocrr.orderingresults.vo.PathResultDetailsRefVoCollection getPathResult()
	{
		return this.pathresult;
	}
	public void setPathResult(ims.ocrr.orderingresults.vo.PathResultDetailsRefVoCollection value)
	{
		this.isValidated = false;
		this.pathresult = value;
	}
	public boolean getCollDateTimeFillerIsNotNull()
	{
		return this.colldatetimefiller != null;
	}
	public ims.framework.utils.DateTime getCollDateTimeFiller()
	{
		return this.colldatetimefiller;
	}
	public void setCollDateTimeFiller(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.colldatetimefiller = value;
	}
	public boolean getFillerOrdNumIsNotNull()
	{
		return this.fillerordnum != null;
	}
	public String getFillerOrdNum()
	{
		return this.fillerordnum;
	}
	public static int getFillerOrdNumMaxLength()
	{
		return 20;
	}
	public void setFillerOrdNum(String value)
	{
		this.isValidated = false;
		this.fillerordnum = value;
	}
	public boolean getReceivedDateTimeIsNotNull()
	{
		return this.receiveddatetime != null;
	}
	public ims.framework.utils.DateTime getReceivedDateTime()
	{
		return this.receiveddatetime;
	}
	public void setReceivedDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.receiveddatetime = value;
	}
	public boolean getColTimeFillerSuppliedIsNotNull()
	{
		return this.coltimefillersupplied != null;
	}
	public Boolean getColTimeFillerSupplied()
	{
		return this.coltimefillersupplied;
	}
	public void setColTimeFillerSupplied(Boolean value)
	{
		this.isValidated = false;
		this.coltimefillersupplied = value;
	}
	public boolean getReceivedTimeSuppliedIsNotNull()
	{
		return this.receivedtimesupplied != null;
	}
	public Boolean getReceivedTimeSupplied()
	{
		return this.receivedtimesupplied;
	}
	public void setReceivedTimeSupplied(Boolean value)
	{
		this.isValidated = false;
		this.receivedtimesupplied = value;
	}
	public boolean getDftSpecimenResultedIsNotNull()
	{
		return this.dftspecimenresulted != null;
	}
	public ims.framework.utils.DateTime getDftSpecimenResulted()
	{
		return this.dftspecimenresulted;
	}
	public void setDftSpecimenResulted(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.dftspecimenresulted = value;
	}
	public boolean getDftSpecimenResultedTimeSuppliedIsNotNull()
	{
		return this.dftspecimenresultedtimesupplied != null;
	}
	public Boolean getDftSpecimenResultedTimeSupplied()
	{
		return this.dftspecimenresultedtimesupplied;
	}
	public void setDftSpecimenResultedTimeSupplied(Boolean value)
	{
		this.isValidated = false;
		this.dftspecimenresultedtimesupplied = value;
	}
	public boolean getSiteCdIsNotNull()
	{
		return this.sitecd != null;
	}
	public ims.ocrr.vo.lookups.SpecimenSite getSiteCd()
	{
		return this.sitecd;
	}
	public void setSiteCd(ims.ocrr.vo.lookups.SpecimenSite value)
	{
		this.isValidated = false;
		this.sitecd = value;
	}
	/**
	* IOrderSpecimen interface methods
	*/
	public String getIOrderSpecimenSource() 
	{
		if(this.specimensource != null)
			return this.specimensource.getText();
			
		return null;
	}
	
	public Integer getIOrderSpecimenId() 
	{
		return this.id;
	}
	
	public ims.framework.utils.DateTime getIOrderSpecimenCollectionDateTime() 
	{
		return this.colldatetimefiller;
	}
	
	public ims.framework.utils.DateTime getIOrderSpecimenReceivedDateTime()
	{
		return this.receiveddatetime;
	}
	
	public String getIOrderSpecimenFillerOrdNum() 
	{
		return this.fillerordnum;
	}
	
	public Boolean getIOrderSpecimenCollectionTimeSupplied() 
	{
		return this.coltimefillersupplied;
	}
	
	public Boolean getIOrderSpecimenReceivedTimeSupplied() 
	{
		return this.receivedtimesupplied;
	}
	
	public ims.framework.utils.DateTime getIOrderSpecimenResultedDate() 
	{
		return this.dftspecimenresulted;
	}
	
	public Boolean getIOrderSpecimenResultedTimeSupplied() 
	{
		return this.dftspecimenresultedtimesupplied;
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
		if(this.specimensource == null)
			listOfErrors.add("SpecimenSource is mandatory");
		if(this.fillerordnum != null)
			if(this.fillerordnum.length() > 20)
				listOfErrors.add("The length of the field [fillerordnum] in the value object [ims.ocrr.vo.SpecimenNameVo] is too big. It should be less or equal to 20");
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
	
		SpecimenNameVo clone = new SpecimenNameVo(this.id, this.version);
		
		if(this.specimensource == null)
			clone.specimensource = null;
		else
			clone.specimensource = (ims.ocrr.vo.lookups.SpecimenType)this.specimensource.clone();
		clone.pathresult = this.pathresult;
		if(this.colldatetimefiller == null)
			clone.colldatetimefiller = null;
		else
			clone.colldatetimefiller = (ims.framework.utils.DateTime)this.colldatetimefiller.clone();
		clone.fillerordnum = this.fillerordnum;
		if(this.receiveddatetime == null)
			clone.receiveddatetime = null;
		else
			clone.receiveddatetime = (ims.framework.utils.DateTime)this.receiveddatetime.clone();
		clone.coltimefillersupplied = this.coltimefillersupplied;
		clone.receivedtimesupplied = this.receivedtimesupplied;
		if(this.dftspecimenresulted == null)
			clone.dftspecimenresulted = null;
		else
			clone.dftspecimenresulted = (ims.framework.utils.DateTime)this.dftspecimenresulted.clone();
		clone.dftspecimenresultedtimesupplied = this.dftspecimenresultedtimesupplied;
		if(this.sitecd == null)
			clone.sitecd = null;
		else
			clone.sitecd = (ims.ocrr.vo.lookups.SpecimenSite)this.sitecd.clone();
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
		if (!(SpecimenNameVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SpecimenNameVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((SpecimenNameVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((SpecimenNameVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.specimensource != null)
			count++;
		if(this.pathresult != null)
			count++;
		if(this.colldatetimefiller != null)
			count++;
		if(this.fillerordnum != null)
			count++;
		if(this.receiveddatetime != null)
			count++;
		if(this.coltimefillersupplied != null)
			count++;
		if(this.receivedtimesupplied != null)
			count++;
		if(this.dftspecimenresulted != null)
			count++;
		if(this.dftspecimenresultedtimesupplied != null)
			count++;
		if(this.sitecd != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 10;
	}
	protected ims.ocrr.vo.lookups.SpecimenType specimensource;
	protected ims.ocrr.orderingresults.vo.PathResultDetailsRefVoCollection pathresult;
	protected ims.framework.utils.DateTime colldatetimefiller;
	protected String fillerordnum;
	protected ims.framework.utils.DateTime receiveddatetime;
	protected Boolean coltimefillersupplied;
	protected Boolean receivedtimesupplied;
	protected ims.framework.utils.DateTime dftspecimenresulted;
	protected Boolean dftspecimenresultedtimesupplied;
	protected ims.ocrr.vo.lookups.SpecimenSite sitecd;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
