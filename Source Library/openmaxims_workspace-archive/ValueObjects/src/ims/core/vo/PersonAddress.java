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

package ims.core.vo;

/**
 * Linked to core.generic.Address business object (ID: 1002100000).
 */
public class PersonAddress extends ims.core.generic.vo.AddressRefVo implements ims.vo.ImsCloneable, Comparable, ims.framework.interfaces.IAddress
{
	private static final long serialVersionUID = 1L;

	public PersonAddress()
	{
	}
	public PersonAddress(Integer id, int version)
	{
		super(id, version);
	}
	public PersonAddress(ims.core.vo.beans.PersonAddressBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.line1 = bean.getLine1();
		this.line2 = bean.getLine2();
		this.line3 = bean.getLine3();
		this.line4 = bean.getLine4();
		this.line5 = bean.getLine5();
		this.postcode = bean.getPostCode();
		this.phone = bean.getPhone();
		this.county = bean.getCounty() == null ? null : ims.ntpf.vo.lookups.County.buildLookup(bean.getCounty());
		this.fax = bean.getFax();
		this.updatedate = bean.getUpdateDate() == null ? null : bean.getUpdateDate().buildDateTime();
		this.notificationdate = bean.getNotificationDate() == null ? null : bean.getNotificationDate().buildDate();
		this.addresstype = bean.getAddressType() == null ? null : ims.core.vo.lookups.AddressType.buildLookup(bean.getAddressType());
		this.addresssearchtxt = bean.getAddressSearchTxt();
		this.pct = bean.getPCT();
		this.otherphone = bean.getOtherphone();
		this.lsoa = bean.getLSOA();
		this.organisation = bean.getOrganisation();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PersonAddressBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.line1 = bean.getLine1();
		this.line2 = bean.getLine2();
		this.line3 = bean.getLine3();
		this.line4 = bean.getLine4();
		this.line5 = bean.getLine5();
		this.postcode = bean.getPostCode();
		this.phone = bean.getPhone();
		this.county = bean.getCounty() == null ? null : ims.ntpf.vo.lookups.County.buildLookup(bean.getCounty());
		this.fax = bean.getFax();
		this.updatedate = bean.getUpdateDate() == null ? null : bean.getUpdateDate().buildDateTime();
		this.notificationdate = bean.getNotificationDate() == null ? null : bean.getNotificationDate().buildDate();
		this.addresstype = bean.getAddressType() == null ? null : ims.core.vo.lookups.AddressType.buildLookup(bean.getAddressType());
		this.addresssearchtxt = bean.getAddressSearchTxt();
		this.pct = bean.getPCT();
		this.otherphone = bean.getOtherphone();
		this.lsoa = bean.getLSOA();
		this.organisation = bean.getOrganisation();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PersonAddressBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PersonAddressBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PersonAddressBean();
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
		if(fieldName.equals("LINE1"))
			return getLine1();
		if(fieldName.equals("LINE2"))
			return getLine2();
		if(fieldName.equals("LINE3"))
			return getLine3();
		if(fieldName.equals("LINE4"))
			return getLine4();
		if(fieldName.equals("LINE5"))
			return getLine5();
		if(fieldName.equals("POSTCODE"))
			return getPostCode();
		if(fieldName.equals("PHONE"))
			return getPhone();
		if(fieldName.equals("COUNTY"))
			return getCounty();
		if(fieldName.equals("FAX"))
			return getFax();
		if(fieldName.equals("UPDATEDATE"))
			return getUpdateDate();
		if(fieldName.equals("NOTIFICATIONDATE"))
			return getNotificationDate();
		if(fieldName.equals("ADDRESSTYPE"))
			return getAddressType();
		if(fieldName.equals("ADDRESSSEARCHTXT"))
			return getAddressSearchTxt();
		if(fieldName.equals("PCT"))
			return getPCT();
		if(fieldName.equals("OTHERPHONE"))
			return getOtherphone();
		if(fieldName.equals("LSOA"))
			return getLSOA();
		if(fieldName.equals("ORGANISATION"))
			return getOrganisation();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getLine1IsNotNull()
	{
		return this.line1 != null;
	}
	public String getLine1()
	{
		return this.line1;
	}
	public static int getLine1MaxLength()
	{
		return 40;
	}
	public void setLine1(String value)
	{
		this.isValidated = false;
		this.line1 = value;
	}
	public boolean getLine2IsNotNull()
	{
		return this.line2 != null;
	}
	public String getLine2()
	{
		return this.line2;
	}
	public static int getLine2MaxLength()
	{
		return 40;
	}
	public void setLine2(String value)
	{
		this.isValidated = false;
		this.line2 = value;
	}
	public boolean getLine3IsNotNull()
	{
		return this.line3 != null;
	}
	public String getLine3()
	{
		return this.line3;
	}
	public static int getLine3MaxLength()
	{
		return 40;
	}
	public void setLine3(String value)
	{
		this.isValidated = false;
		this.line3 = value;
	}
	public boolean getLine4IsNotNull()
	{
		return this.line4 != null;
	}
	public String getLine4()
	{
		return this.line4;
	}
	public static int getLine4MaxLength()
	{
		return 40;
	}
	public void setLine4(String value)
	{
		this.isValidated = false;
		this.line4 = value;
	}
	public boolean getLine5IsNotNull()
	{
		return this.line5 != null;
	}
	public String getLine5()
	{
		return this.line5;
	}
	public static int getLine5MaxLength()
	{
		return 40;
	}
	public void setLine5(String value)
	{
		this.isValidated = false;
		this.line5 = value;
	}
	public boolean getPostCodeIsNotNull()
	{
		return this.postcode != null;
	}
	public String getPostCode()
	{
		return this.postcode;
	}
	public static int getPostCodeMaxLength()
	{
		return 10;
	}
	public void setPostCode(String value)
	{
		this.isValidated = false;
		this.postcode = value;
	}
	public boolean getPhoneIsNotNull()
	{
		return this.phone != null;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public static int getPhoneMaxLength()
	{
		return 30;
	}
	public void setPhone(String value)
	{
		this.isValidated = false;
		this.phone = value;
	}
	public boolean getCountyIsNotNull()
	{
		return this.county != null;
	}
	public ims.ntpf.vo.lookups.County getCounty()
	{
		return this.county;
	}
	public void setCounty(ims.ntpf.vo.lookups.County value)
	{
		this.isValidated = false;
		this.county = value;
	}
	public boolean getFaxIsNotNull()
	{
		return this.fax != null;
	}
	public String getFax()
	{
		return this.fax;
	}
	public static int getFaxMaxLength()
	{
		return 30;
	}
	public void setFax(String value)
	{
		this.isValidated = false;
		this.fax = value;
	}
	public boolean getUpdateDateIsNotNull()
	{
		return this.updatedate != null;
	}
	public ims.framework.utils.DateTime getUpdateDate()
	{
		return this.updatedate;
	}
	public void setUpdateDate(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.updatedate = value;
	}
	public boolean getNotificationDateIsNotNull()
	{
		return this.notificationdate != null;
	}
	public ims.framework.utils.Date getNotificationDate()
	{
		return this.notificationdate;
	}
	public void setNotificationDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.notificationdate = value;
	}
	public boolean getAddressTypeIsNotNull()
	{
		return this.addresstype != null;
	}
	public ims.core.vo.lookups.AddressType getAddressType()
	{
		return this.addresstype;
	}
	public void setAddressType(ims.core.vo.lookups.AddressType value)
	{
		this.isValidated = false;
		this.addresstype = value;
	}
	public boolean getAddressSearchTxtIsNotNull()
	{
		return this.addresssearchtxt != null;
	}
	public String getAddressSearchTxt()
	{
		return this.addresssearchtxt;
	}
	public static int getAddressSearchTxtMaxLength()
	{
		return 255;
	}
	public void setAddressSearchTxt(String value)
	{
		this.isValidated = false;
		this.addresssearchtxt = value;
	}
	public boolean getPCTIsNotNull()
	{
		return this.pct != null;
	}
	public String getPCT()
	{
		return this.pct;
	}
	public static int getPCTMaxLength()
	{
		return 15;
	}
	public void setPCT(String value)
	{
		this.isValidated = false;
		this.pct = value;
	}
	public boolean getOtherphoneIsNotNull()
	{
		return this.otherphone != null;
	}
	public String getOtherphone()
	{
		return this.otherphone;
	}
	public static int getOtherphoneMaxLength()
	{
		return 30;
	}
	public void setOtherphone(String value)
	{
		this.isValidated = false;
		this.otherphone = value;
	}
	public boolean getLSOAIsNotNull()
	{
		return this.lsoa != null;
	}
	public String getLSOA()
	{
		return this.lsoa;
	}
	public static int getLSOAMaxLength()
	{
		return 255;
	}
	public void setLSOA(String value)
	{
		this.isValidated = false;
		this.lsoa = value;
	}
	public boolean getOrganisationIsNotNull()
	{
		return this.organisation != null;
	}
	public String getOrganisation()
	{
		return this.organisation;
	}
	public static int getOrganisationMaxLength()
	{
		return 255;
	}
	public void setOrganisation(String value)
	{
		this.isValidated = false;
		this.organisation = value;
	}
	/**
	* toDisplayString: Returns a formatted String suitable for Display purposes
	*/
	public String toDisplayString()
	{
		java.lang.StringBuffer sb = new java.lang.StringBuffer("");
		if (line1 != null && line1.length() > 0) {
			sb.append(line1 + ", ");
		}
		if (line2 != null && line2.length() > 0) {
			sb.append(line2 + ", ");
		}
		if (line3 != null && line3.length() > 0) {
			sb.append(line3 + ", ");
		}
		if (line4 != null && line4.length() > 0) {
			sb.append(line4 + ", ");
		}
		if (line5 != null && line5.length() > 0) {
			sb.append(line5 + ", ");
		}
		if (postcode != null && postcode.length() > 0) {
			sb.append(postcode +".");
		}
		if (county != null && county.getText().length() > 0) {
			sb.append(county.getText()+".");
		}			
		if (sb.length() > 0)
		{
			sb.setLength(sb.length() - 1);
			sb.append("   ");
		}
		return sb.toString();
	}
	
	/**
	* toDisplayStringForMultiLineTextBox: returns a carraige return formatted String
	*/
	public String toDisplayStringForMultiLineTextBox()
	{
		java.lang.StringBuffer sb = new java.lang.StringBuffer("");
		if (line1 != null && line1.length() > 0) {
			sb.append(line1 + "\r\n");
		}
		if (line2 != null && line2.length() > 0) {
			sb.append(line2 + "\r\n");
		}
		if (line3 != null && line3.length() > 0) {
			sb.append(line3 + "\r\n");
		}
		if (line4 != null && line4.length() > 0) {
			sb.append(line4 + "\r\n");
		}
		if (line5 != null && line5.length() > 0) {
			sb.append(line5 + "\r\n");
		}
		if (postcode != null && postcode.length() > 0) {
			sb.append(postcode + "\r\n");
		}
		if (sb.length() > 0)
		{
			sb.setLength(sb.length() - 1);
		}
		return sb.toString();
	}
	/**
	* toNTPFDisplayString
	*/
	public String toNTPFDisplayString()
	{
		java.lang.StringBuffer sb = new java.lang.StringBuffer("");
		if (line1 != null && line1.length() > 0) {
			sb.append(line1 + ",");
		}
		if (line2 != null && line2.length() > 0) {
			sb.append(line2 + ",");
		}
		if (line3 != null && line3.length() > 0) {
			sb.append(line3 + ",");
		}
		if (postcode != null && postcode.length() > 0) {
			sb.append(postcode + ",");
		}
		if (county != null && county.getText().length() > 0) {
			sb.append(county.getText() + ",");
		}			
		if (sb.length() > 0)
		{
			sb.setLength(sb.length() - 1);
		}
		return sb.toString();
	}
	
	/**
	* IAddress Interface implementation
	*/
			public String getAddressBuildingNumber() 
			{
				return line2;
			}
			public String getAddressCounty() {
				
				return line5;
			}
			public String getAddressLine5() 
			{
				return line5;
			}
			public String getAddressLocality() 
			{		
				return line3;
			}
			public String getAddressPostCode() 
			{
				return postcode;
			}
			public String getAddressPostTown() 
			{
				return line4;
			}
			public String getAddressStreet() 
			{
				return line2;
			}
			public void setAddressBuildingNumber(String buildingNumber) {
				line2 = buildingNumber;
				
			}
			public void setAddressLine5(String addrLine5) 
			{
				line5 = addrLine5;
				
			}
			public void setAddressCounty(String county) {
				line5 = county;
				
			}
			public void setAddressLocality(String locality) {
				line3 = locality;
			}
			public void setAddressPostCode(String postCode) {
				postcode = postCode;
				
			}
			public void setAddressPostTown(String postTown) {
				line4 = postTown;
				
			}
			public void setAddressStreet(String street) {
				if (line2 != null && line2.equals(""))
					line2 = street;
				else
					line2 += " " + street;			
			}
			public String getAddressSearchText() 
			{
				return this.addresssearchtxt;
			}
			public void setAddressSearchText(String addressSearchText) 
			{		
				this.addresssearchtxt = addressSearchText;
			}
			
			public String getAddressBuildingName() 
			{
				return line1;
			}
			public void setAddressBuildingName(String buildingName) 
			{
				line1 = buildingName;			
			}
		      public String getPctCode() 
		      {
			      return pct;
		      }
		      public void setPCTcode(String pctCode) 
		      {
			      pct = pctCode;
		      }
		      public String getAddressOrganisation() 
		      {
			      return organisation;
		      }
		      public void setAddressOrganisation(String orgCode) 
		      {
			      organisation = orgCode;
		      }
	
	/**
	* equals
	*/
	public boolean equals(Object obj)
	{
		if(!(obj instanceof PersonAddress))
			return false;
		PersonAddress compareObj = (PersonAddress)obj;
		if ((line1 == null ? compareObj.line1 == null : line1.equals(compareObj.line1))&&
			(line2 == null ? compareObj.line2 == null : line2.equals(compareObj.line2))&&
			(line3 == null ? compareObj.line3 == null : line3.equals(compareObj.line3))&&
			(line4 == null ? compareObj.line4 == null : line4.equals(compareObj.line4))&&
			(line5 == null ? compareObj.line5 == null : line5.equals(compareObj.line5))&&
			(addresstype == null ? compareObj.addresstype == null : addresstype.equals(compareObj.addresstype))&&
			(notificationdate == null ? compareObj.notificationdate == null : notificationdate.equals(compareObj.notificationdate)))
				return true;
			return super.equals(obj);
	}
	/**
	* hashCode
	*/
	public int hashCode()
		{
			int hashValue=0;
			if(this.line1 != null)
				hashValue += this.line1.hashCode();
			if(this.line2 != null)
				hashValue += this.line2.hashCode();
			if(this.line3 != null)
				hashValue += this.line3.hashCode();
			if(this.line4 != null)
				hashValue += this.line4.hashCode();
			if(this.line5 != null)
				hashValue += this.line5.hashCode();
			if (this.addresstype != null)
				hashValue += this.addresstype.hashCode();
			if (this.notificationdate!=null)
				hashValue += this.notificationdate.hashCode();
			return hashValue;
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
		if(this.line1 != null)
			if(this.line1.length() > 40)
				listOfErrors.add("The length of the field [line1] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 40");
		if(this.line2 != null)
			if(this.line2.length() > 40)
				listOfErrors.add("The length of the field [line2] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 40");
		if(this.line3 != null)
			if(this.line3.length() > 40)
				listOfErrors.add("The length of the field [line3] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 40");
		if(this.line4 != null)
			if(this.line4.length() > 40)
				listOfErrors.add("The length of the field [line4] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 40");
		if(this.line5 != null)
			if(this.line5.length() > 40)
				listOfErrors.add("The length of the field [line5] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 40");
		if(this.postcode != null)
			if(this.postcode.length() > 10)
				listOfErrors.add("The length of the field [postcode] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 10");
		if(this.phone != null)
			if(this.phone.length() > 30)
				listOfErrors.add("The length of the field [phone] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 30");
		if(this.fax != null)
			if(this.fax.length() > 30)
				listOfErrors.add("The length of the field [fax] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 30");
		if(this.pct != null)
			if(this.pct.length() > 15)
				listOfErrors.add("The length of the field [pct] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 15");
		if(this.otherphone != null)
			if(this.otherphone.length() > 30)
				listOfErrors.add("The length of the field [otherphone] in the value object [ims.core.vo.PersonAddress] is too big. It should be less or equal to 30");
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
	
		PersonAddress clone = new PersonAddress(this.id, this.version);
		
		clone.line1 = this.line1;
		clone.line2 = this.line2;
		clone.line3 = this.line3;
		clone.line4 = this.line4;
		clone.line5 = this.line5;
		clone.postcode = this.postcode;
		clone.phone = this.phone;
		if(this.county == null)
			clone.county = null;
		else
			clone.county = (ims.ntpf.vo.lookups.County)this.county.clone();
		clone.fax = this.fax;
		if(this.updatedate == null)
			clone.updatedate = null;
		else
			clone.updatedate = (ims.framework.utils.DateTime)this.updatedate.clone();
		if(this.notificationdate == null)
			clone.notificationdate = null;
		else
			clone.notificationdate = (ims.framework.utils.Date)this.notificationdate.clone();
		if(this.addresstype == null)
			clone.addresstype = null;
		else
			clone.addresstype = (ims.core.vo.lookups.AddressType)this.addresstype.clone();
		clone.addresssearchtxt = this.addresssearchtxt;
		clone.pct = this.pct;
		clone.otherphone = this.otherphone;
		clone.lsoa = this.lsoa;
		clone.organisation = this.organisation;
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
		if (!(PersonAddress.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PersonAddress object cannot be compared an Object of type " + obj.getClass().getName());
		}
		PersonAddress compareObj = (PersonAddress)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getLine1() == null && compareObj.getLine1() != null)
				return -1;
			if(this.getLine1() != null && compareObj.getLine1() == null)
				return 1;
			if(this.getLine1() != null && compareObj.getLine1() != null)
			{
				if(caseInsensitive)
					retVal = this.getLine1().toLowerCase().compareTo(compareObj.getLine1().toLowerCase());
				else
					retVal = this.getLine1().compareTo(compareObj.getLine1());
			}
		}
		if (retVal == 0)
		{
			if(this.getLine2() == null && compareObj.getLine2() != null)
				return -1;
			if(this.getLine2() != null && compareObj.getLine2() == null)
				return 1;
			if(this.getLine2() != null && compareObj.getLine2() != null)
			{
				if(caseInsensitive)
					retVal = this.getLine2().toLowerCase().compareTo(compareObj.getLine2().toLowerCase());
				else
					retVal = this.getLine2().compareTo(compareObj.getLine2());
			}
		}
		if (retVal == 0)
		{
			if(this.getLine3() == null && compareObj.getLine3() != null)
				return -1;
			if(this.getLine3() != null && compareObj.getLine3() == null)
				return 1;
			if(this.getLine3() != null && compareObj.getLine3() != null)
			{
				if(caseInsensitive)
					retVal = this.getLine3().toLowerCase().compareTo(compareObj.getLine3().toLowerCase());
				else
					retVal = this.getLine3().compareTo(compareObj.getLine3());
			}
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.line1 != null)
			count++;
		if(this.line2 != null)
			count++;
		if(this.line3 != null)
			count++;
		if(this.line4 != null)
			count++;
		if(this.line5 != null)
			count++;
		if(this.postcode != null)
			count++;
		if(this.phone != null)
			count++;
		if(this.county != null)
			count++;
		if(this.fax != null)
			count++;
		if(this.updatedate != null)
			count++;
		if(this.notificationdate != null)
			count++;
		if(this.addresstype != null)
			count++;
		if(this.pct != null)
			count++;
		if(this.otherphone != null)
			count++;
		if(this.lsoa != null)
			count++;
		if(this.organisation != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 16;
	}
	protected String line1;
	protected String line2;
	protected String line3;
	protected String line4;
	protected String line5;
	protected String postcode;
	protected String phone;
	protected ims.ntpf.vo.lookups.County county;
	protected String fax;
	protected ims.framework.utils.DateTime updatedate;
	protected ims.framework.utils.Date notificationdate;
	protected ims.core.vo.lookups.AddressType addresstype;
	protected String addresssearchtxt;
	protected String pct;
	protected String otherphone;
	protected String lsoa;
	protected String organisation;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
