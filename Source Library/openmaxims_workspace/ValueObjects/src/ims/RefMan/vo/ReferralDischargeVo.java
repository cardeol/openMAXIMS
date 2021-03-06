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
 * Linked to RefMan.DischargeOutcome business object (ID: 1096100017).
 */
public class ReferralDischargeVo extends ims.RefMan.vo.DischargeOutcomeRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ReferralDischargeVo()
	{
	}
	public ReferralDischargeVo(Integer id, int version)
	{
		super(id, version);
	}
	public ReferralDischargeVo(ims.RefMan.vo.beans.ReferralDischargeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.dischargetype = bean.getDischargeType() == null ? null : ims.RefMan.vo.lookups.DischargeType.buildLookup(bean.getDischargeType());
		this.furthermanagement = bean.getFurtherManagement();
		this.dischargeothertype = bean.getDischargeOtherType() == null ? null : ims.RefMan.vo.lookups.DischargeOtherType.buildLookup(bean.getDischargeOtherType());
		this.otherdetails = bean.getOtherDetails();
		this.currentonwardreferral = bean.getCurrentOnwardReferral() == null ? null : bean.getCurrentOnwardReferral().buildVo();
		this.onwardreferrals = ims.RefMan.vo.OnwardReferralVoCollection.buildFromBeanCollection(bean.getOnwardReferrals());
		this.dischargedate = bean.getDischargeDate() == null ? null : bean.getDischargeDate().buildDate();
		this.recordinginformation = bean.getRecordingInformation() == null ? null : bean.getRecordingInformation().buildVo();
		this.discharginghcp = bean.getDischargingHCP() == null ? null : bean.getDischargingHCP().buildVo();
		if(bean.getResultsForReport() != null)
		{
			this.resultsforreport = new ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection();
			for(int resultsforreport_i = 0; resultsforreport_i < bean.getResultsForReport().length; resultsforreport_i++)
			{
				this.resultsforreport.add(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(new Integer(bean.getResultsForReport()[resultsforreport_i].getId()), bean.getResultsForReport()[resultsforreport_i].getVersion()));
			}
		}
		if(bean.getDiagnosisForReport() != null)
		{
			this.diagnosisforreport = new ims.core.clinical.vo.PatientDiagnosisRefVoCollection();
			for(int diagnosisforreport_i = 0; diagnosisforreport_i < bean.getDiagnosisForReport().length; diagnosisforreport_i++)
			{
				this.diagnosisforreport.add(new ims.core.clinical.vo.PatientDiagnosisRefVo(new Integer(bean.getDiagnosisForReport()[diagnosisforreport_i].getId()), bean.getDiagnosisForReport()[diagnosisforreport_i].getVersion()));
			}
		}
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.ReferralDischargeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.dischargetype = bean.getDischargeType() == null ? null : ims.RefMan.vo.lookups.DischargeType.buildLookup(bean.getDischargeType());
		this.furthermanagement = bean.getFurtherManagement();
		this.dischargeothertype = bean.getDischargeOtherType() == null ? null : ims.RefMan.vo.lookups.DischargeOtherType.buildLookup(bean.getDischargeOtherType());
		this.otherdetails = bean.getOtherDetails();
		this.currentonwardreferral = bean.getCurrentOnwardReferral() == null ? null : bean.getCurrentOnwardReferral().buildVo(map);
		this.onwardreferrals = ims.RefMan.vo.OnwardReferralVoCollection.buildFromBeanCollection(bean.getOnwardReferrals());
		this.dischargedate = bean.getDischargeDate() == null ? null : bean.getDischargeDate().buildDate();
		this.recordinginformation = bean.getRecordingInformation() == null ? null : bean.getRecordingInformation().buildVo(map);
		this.discharginghcp = bean.getDischargingHCP() == null ? null : bean.getDischargingHCP().buildVo(map);
		if(bean.getResultsForReport() != null)
		{
			this.resultsforreport = new ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection();
			for(int resultsforreport_i = 0; resultsforreport_i < bean.getResultsForReport().length; resultsforreport_i++)
			{
				this.resultsforreport.add(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(new Integer(bean.getResultsForReport()[resultsforreport_i].getId()), bean.getResultsForReport()[resultsforreport_i].getVersion()));
			}
		}
		if(bean.getDiagnosisForReport() != null)
		{
			this.diagnosisforreport = new ims.core.clinical.vo.PatientDiagnosisRefVoCollection();
			for(int diagnosisforreport_i = 0; diagnosisforreport_i < bean.getDiagnosisForReport().length; diagnosisforreport_i++)
			{
				this.diagnosisforreport.add(new ims.core.clinical.vo.PatientDiagnosisRefVo(new Integer(bean.getDiagnosisForReport()[diagnosisforreport_i].getId()), bean.getDiagnosisForReport()[diagnosisforreport_i].getVersion()));
			}
		}
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.ReferralDischargeVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.ReferralDischargeVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.ReferralDischargeVoBean();
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
		if(fieldName.equals("DISCHARGETYPE"))
			return getDischargeType();
		if(fieldName.equals("FURTHERMANAGEMENT"))
			return getFurtherManagement();
		if(fieldName.equals("DISCHARGEOTHERTYPE"))
			return getDischargeOtherType();
		if(fieldName.equals("OTHERDETAILS"))
			return getOtherDetails();
		if(fieldName.equals("CURRENTONWARDREFERRAL"))
			return getCurrentOnwardReferral();
		if(fieldName.equals("ONWARDREFERRALS"))
			return getOnwardReferrals();
		if(fieldName.equals("DISCHARGEDATE"))
			return getDischargeDate();
		if(fieldName.equals("RECORDINGINFORMATION"))
			return getRecordingInformation();
		if(fieldName.equals("DISCHARGINGHCP"))
			return getDischargingHCP();
		if(fieldName.equals("RESULTSFORREPORT"))
			return getResultsForReport();
		if(fieldName.equals("DIAGNOSISFORREPORT"))
			return getDiagnosisForReport();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getDischargeTypeIsNotNull()
	{
		return this.dischargetype != null;
	}
	public ims.RefMan.vo.lookups.DischargeType getDischargeType()
	{
		return this.dischargetype;
	}
	public void setDischargeType(ims.RefMan.vo.lookups.DischargeType value)
	{
		this.isValidated = false;
		this.dischargetype = value;
	}
	public boolean getFurtherManagementIsNotNull()
	{
		return this.furthermanagement != null;
	}
	public String getFurtherManagement()
	{
		return this.furthermanagement;
	}
	public static int getFurtherManagementMaxLength()
	{
		return 3000;
	}
	public void setFurtherManagement(String value)
	{
		this.isValidated = false;
		this.furthermanagement = value;
	}
	public boolean getDischargeOtherTypeIsNotNull()
	{
		return this.dischargeothertype != null;
	}
	public ims.RefMan.vo.lookups.DischargeOtherType getDischargeOtherType()
	{
		return this.dischargeothertype;
	}
	public void setDischargeOtherType(ims.RefMan.vo.lookups.DischargeOtherType value)
	{
		this.isValidated = false;
		this.dischargeothertype = value;
	}
	public boolean getOtherDetailsIsNotNull()
	{
		return this.otherdetails != null;
	}
	public String getOtherDetails()
	{
		return this.otherdetails;
	}
	public static int getOtherDetailsMaxLength()
	{
		return 3000;
	}
	public void setOtherDetails(String value)
	{
		this.isValidated = false;
		this.otherdetails = value;
	}
	public boolean getCurrentOnwardReferralIsNotNull()
	{
		return this.currentonwardreferral != null;
	}
	public ims.RefMan.vo.OnwardReferralVo getCurrentOnwardReferral()
	{
		return this.currentonwardreferral;
	}
	public void setCurrentOnwardReferral(ims.RefMan.vo.OnwardReferralVo value)
	{
		this.isValidated = false;
		this.currentonwardreferral = value;
	}
	public boolean getOnwardReferralsIsNotNull()
	{
		return this.onwardreferrals != null;
	}
	public ims.RefMan.vo.OnwardReferralVoCollection getOnwardReferrals()
	{
		return this.onwardreferrals;
	}
	public void setOnwardReferrals(ims.RefMan.vo.OnwardReferralVoCollection value)
	{
		this.isValidated = false;
		this.onwardreferrals = value;
	}
	public boolean getDischargeDateIsNotNull()
	{
		return this.dischargedate != null;
	}
	public ims.framework.utils.Date getDischargeDate()
	{
		return this.dischargedate;
	}
	public void setDischargeDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dischargedate = value;
	}
	public boolean getRecordingInformationIsNotNull()
	{
		return this.recordinginformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getRecordingInformation()
	{
		return this.recordinginformation;
	}
	public void setRecordingInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.recordinginformation = value;
	}
	public boolean getDischargingHCPIsNotNull()
	{
		return this.discharginghcp != null;
	}
	public ims.core.vo.AuthoringInformationVo getDischargingHCP()
	{
		return this.discharginghcp;
	}
	public void setDischargingHCP(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.discharginghcp = value;
	}
	public boolean getResultsForReportIsNotNull()
	{
		return this.resultsforreport != null;
	}
	public ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection getResultsForReport()
	{
		return this.resultsforreport;
	}
	public void setResultsForReport(ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection value)
	{
		this.isValidated = false;
		this.resultsforreport = value;
	}
	public boolean getDiagnosisForReportIsNotNull()
	{
		return this.diagnosisforreport != null;
	}
	public ims.core.clinical.vo.PatientDiagnosisRefVoCollection getDiagnosisForReport()
	{
		return this.diagnosisforreport;
	}
	public void setDiagnosisForReport(ims.core.clinical.vo.PatientDiagnosisRefVoCollection value)
	{
		this.isValidated = false;
		this.diagnosisforreport = value;
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
		if(this.currentonwardreferral != null)
		{
			if(!this.currentonwardreferral.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.onwardreferrals != null)
		{
			if(!this.onwardreferrals.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.recordinginformation != null)
		{
			if(!this.recordinginformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.discharginghcp != null)
		{
			if(!this.discharginghcp.isValidated())
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
		if(this.dischargetype == null)
			listOfErrors.add("DischargeType is mandatory");
		if(this.furthermanagement != null)
			if(this.furthermanagement.length() > 3000)
				listOfErrors.add("The length of the field [furthermanagement] in the value object [ims.RefMan.vo.ReferralDischargeVo] is too big. It should be less or equal to 3000");
		if(this.otherdetails != null)
			if(this.otherdetails.length() > 3000)
				listOfErrors.add("The length of the field [otherdetails] in the value object [ims.RefMan.vo.ReferralDischargeVo] is too big. It should be less or equal to 3000");
		if(this.currentonwardreferral != null)
		{
			String[] listOfOtherErrors = this.currentonwardreferral.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.onwardreferrals != null)
		{
			String[] listOfOtherErrors = this.onwardreferrals.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.dischargedate == null)
			listOfErrors.add("DischargeDate is mandatory");
		if(this.recordinginformation == null)
			listOfErrors.add("RecordingInformation is mandatory");
		if(this.recordinginformation != null)
		{
			String[] listOfOtherErrors = this.recordinginformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.discharginghcp == null)
			listOfErrors.add("DischargingHCP is mandatory");
		if(this.discharginghcp != null)
		{
			String[] listOfOtherErrors = this.discharginghcp.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
	
		ReferralDischargeVo clone = new ReferralDischargeVo(this.id, this.version);
		
		if(this.dischargetype == null)
			clone.dischargetype = null;
		else
			clone.dischargetype = (ims.RefMan.vo.lookups.DischargeType)this.dischargetype.clone();
		clone.furthermanagement = this.furthermanagement;
		if(this.dischargeothertype == null)
			clone.dischargeothertype = null;
		else
			clone.dischargeothertype = (ims.RefMan.vo.lookups.DischargeOtherType)this.dischargeothertype.clone();
		clone.otherdetails = this.otherdetails;
		if(this.currentonwardreferral == null)
			clone.currentonwardreferral = null;
		else
			clone.currentonwardreferral = (ims.RefMan.vo.OnwardReferralVo)this.currentonwardreferral.clone();
		if(this.onwardreferrals == null)
			clone.onwardreferrals = null;
		else
			clone.onwardreferrals = (ims.RefMan.vo.OnwardReferralVoCollection)this.onwardreferrals.clone();
		if(this.dischargedate == null)
			clone.dischargedate = null;
		else
			clone.dischargedate = (ims.framework.utils.Date)this.dischargedate.clone();
		if(this.recordinginformation == null)
			clone.recordinginformation = null;
		else
			clone.recordinginformation = (ims.core.vo.AuthoringInformationVo)this.recordinginformation.clone();
		if(this.discharginghcp == null)
			clone.discharginghcp = null;
		else
			clone.discharginghcp = (ims.core.vo.AuthoringInformationVo)this.discharginghcp.clone();
		clone.resultsforreport = this.resultsforreport;
		clone.diagnosisforreport = this.diagnosisforreport;
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
		if (!(ReferralDischargeVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ReferralDischargeVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ReferralDischargeVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ReferralDischargeVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.dischargetype != null)
			count++;
		if(this.furthermanagement != null)
			count++;
		if(this.dischargeothertype != null)
			count++;
		if(this.otherdetails != null)
			count++;
		if(this.currentonwardreferral != null)
			count++;
		if(this.onwardreferrals != null)
			count++;
		if(this.dischargedate != null)
			count++;
		if(this.recordinginformation != null)
			count++;
		if(this.discharginghcp != null)
			count++;
		if(this.resultsforreport != null)
			count++;
		if(this.diagnosisforreport != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 11;
	}
	protected ims.RefMan.vo.lookups.DischargeType dischargetype;
	protected String furthermanagement;
	protected ims.RefMan.vo.lookups.DischargeOtherType dischargeothertype;
	protected String otherdetails;
	protected ims.RefMan.vo.OnwardReferralVo currentonwardreferral;
	protected ims.RefMan.vo.OnwardReferralVoCollection onwardreferrals;
	protected ims.framework.utils.Date dischargedate;
	protected ims.core.vo.AuthoringInformationVo recordinginformation;
	protected ims.core.vo.AuthoringInformationVo discharginghcp;
	protected ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection resultsforreport;
	protected ims.core.clinical.vo.PatientDiagnosisRefVoCollection diagnosisforreport;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
