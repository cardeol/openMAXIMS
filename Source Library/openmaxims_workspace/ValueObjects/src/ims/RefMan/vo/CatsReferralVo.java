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
 * Linked to RefMan.CatsReferral business object (ID: 1004100035).
 */
public class CatsReferralVo extends ims.RefMan.vo.CatsReferralRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CatsReferralVo()
	{
	}
	public CatsReferralVo(Integer id, int version)
	{
		super(id, version);
	}
	public CatsReferralVo(ims.RefMan.vo.beans.CatsReferralVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.icabreferral = bean.getICABReferral() == null ? null : bean.getICABReferral().buildVo();
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo();
		this.investigationorders = ims.ocrr.vo.OcsOrderVoCollection.buildFromBeanCollection(bean.getInvestigationOrders());
		this.appointments = ims.scheduling.vo.Booking_AppointmentVoCollection.buildFromBeanCollection(bean.getAppointments());
		this.hasdocuments = bean.getHasDocuments();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo();
		this.statushistory = ims.RefMan.vo.CatsReferralStatusVoCollection.buildFromBeanCollection(bean.getStatusHistory());
		this.callattempts = ims.RefMan.vo.AppointmentCallAttemptsVoCollection.buildFromBeanCollection(bean.getCallAttempts());
		this.consultationappt = bean.getConsultationAppt() == null ? null : bean.getConsultationAppt().buildVo();
		this.issuitableforsurgery = bean.getIsSuitableForSurgery();
		this.isfitforsurgery = bean.getIsFitForSurgery();
		this.hastheatreappt = bean.getHasTheatreAppt();
		this.isawaitingclinicalinfo = bean.getIsAwaitingClinicalInfo();
		this.hasrejectedinv = bean.getHasRejectedInv();
		this.consultationactivityrequired = bean.getConsultationActivityRequired();
		this.hasdnaornotseenactivity = bean.getHasDNAorNotSeenActivity();
		this.hasrebookingsubsequentactivity = bean.getHasRebookingSubsequentActivity();
		this.redirectcab = bean.getRedirectCAB();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.CatsReferralVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.icabreferral = bean.getICABReferral() == null ? null : bean.getICABReferral().buildVo(map);
		this.referraldetails = bean.getReferralDetails() == null ? null : bean.getReferralDetails().buildVo(map);
		this.investigationorders = ims.ocrr.vo.OcsOrderVoCollection.buildFromBeanCollection(bean.getInvestigationOrders());
		this.appointments = ims.scheduling.vo.Booking_AppointmentVoCollection.buildFromBeanCollection(bean.getAppointments());
		this.hasdocuments = bean.getHasDocuments();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo(map);
		this.statushistory = ims.RefMan.vo.CatsReferralStatusVoCollection.buildFromBeanCollection(bean.getStatusHistory());
		this.callattempts = ims.RefMan.vo.AppointmentCallAttemptsVoCollection.buildFromBeanCollection(bean.getCallAttempts());
		this.consultationappt = bean.getConsultationAppt() == null ? null : bean.getConsultationAppt().buildVo(map);
		this.issuitableforsurgery = bean.getIsSuitableForSurgery();
		this.isfitforsurgery = bean.getIsFitForSurgery();
		this.hastheatreappt = bean.getHasTheatreAppt();
		this.isawaitingclinicalinfo = bean.getIsAwaitingClinicalInfo();
		this.hasrejectedinv = bean.getHasRejectedInv();
		this.consultationactivityrequired = bean.getConsultationActivityRequired();
		this.hasdnaornotseenactivity = bean.getHasDNAorNotSeenActivity();
		this.hasrebookingsubsequentactivity = bean.getHasRebookingSubsequentActivity();
		this.redirectcab = bean.getRedirectCAB();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.CatsReferralVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.CatsReferralVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.CatsReferralVoBean();
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
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("ICABREFERRAL"))
			return getICABReferral();
		if(fieldName.equals("REFERRALDETAILS"))
			return getReferralDetails();
		if(fieldName.equals("INVESTIGATIONORDERS"))
			return getInvestigationOrders();
		if(fieldName.equals("APPOINTMENTS"))
			return getAppointments();
		if(fieldName.equals("HASDOCUMENTS"))
			return getHasDocuments();
		if(fieldName.equals("CURRENTSTATUS"))
			return getCurrentStatus();
		if(fieldName.equals("STATUSHISTORY"))
			return getStatusHistory();
		if(fieldName.equals("CALLATTEMPTS"))
			return getCallAttempts();
		if(fieldName.equals("CONSULTATIONAPPT"))
			return getConsultationAppt();
		if(fieldName.equals("ISSUITABLEFORSURGERY"))
			return getIsSuitableForSurgery();
		if(fieldName.equals("ISFITFORSURGERY"))
			return getIsFitForSurgery();
		if(fieldName.equals("HASTHEATREAPPT"))
			return getHasTheatreAppt();
		if(fieldName.equals("ISAWAITINGCLINICALINFO"))
			return getIsAwaitingClinicalInfo();
		if(fieldName.equals("HASREJECTEDINV"))
			return getHasRejectedInv();
		if(fieldName.equals("CONSULTATIONACTIVITYREQUIRED"))
			return getConsultationActivityRequired();
		if(fieldName.equals("HASDNAORNOTSEENACTIVITY"))
			return getHasDNAorNotSeenActivity();
		if(fieldName.equals("HASREBOOKINGSUBSEQUENTACTIVITY"))
			return getHasRebookingSubsequentActivity();
		if(fieldName.equals("REDIRECTCAB"))
			return getRedirectCAB();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getICABReferralIsNotNull()
	{
		return this.icabreferral != null;
	}
	public ims.core.vo.ICABReferralVo getICABReferral()
	{
		return this.icabreferral;
	}
	public void setICABReferral(ims.core.vo.ICABReferralVo value)
	{
		this.isValidated = false;
		this.icabreferral = value;
	}
	public boolean getReferralDetailsIsNotNull()
	{
		return this.referraldetails != null;
	}
	public ims.clinical.vo.ReferralLetterDetailsVo getReferralDetails()
	{
		return this.referraldetails;
	}
	public void setReferralDetails(ims.clinical.vo.ReferralLetterDetailsVo value)
	{
		this.isValidated = false;
		this.referraldetails = value;
	}
	public boolean getInvestigationOrdersIsNotNull()
	{
		return this.investigationorders != null;
	}
	public ims.ocrr.vo.OcsOrderVoCollection getInvestigationOrders()
	{
		return this.investigationorders;
	}
	public void setInvestigationOrders(ims.ocrr.vo.OcsOrderVoCollection value)
	{
		this.isValidated = false;
		this.investigationorders = value;
	}
	public boolean getAppointmentsIsNotNull()
	{
		return this.appointments != null;
	}
	public ims.scheduling.vo.Booking_AppointmentVoCollection getAppointments()
	{
		return this.appointments;
	}
	public void setAppointments(ims.scheduling.vo.Booking_AppointmentVoCollection value)
	{
		this.isValidated = false;
		this.appointments = value;
	}
	public boolean getHasDocumentsIsNotNull()
	{
		return this.hasdocuments != null;
	}
	public Boolean getHasDocuments()
	{
		return this.hasdocuments;
	}
	public void setHasDocuments(Boolean value)
	{
		this.isValidated = false;
		this.hasdocuments = value;
	}
	public boolean getCurrentStatusIsNotNull()
	{
		return this.currentstatus != null;
	}
	public ims.RefMan.vo.CatsReferralStatusVo getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.RefMan.vo.CatsReferralStatusVo value)
	{
		this.isValidated = false;
		this.currentstatus = value;
	}
	public boolean getStatusHistoryIsNotNull()
	{
		return this.statushistory != null;
	}
	public ims.RefMan.vo.CatsReferralStatusVoCollection getStatusHistory()
	{
		return this.statushistory;
	}
	public void setStatusHistory(ims.RefMan.vo.CatsReferralStatusVoCollection value)
	{
		this.isValidated = false;
		this.statushistory = value;
	}
	public boolean getCallAttemptsIsNotNull()
	{
		return this.callattempts != null;
	}
	public ims.RefMan.vo.AppointmentCallAttemptsVoCollection getCallAttempts()
	{
		return this.callattempts;
	}
	public void setCallAttempts(ims.RefMan.vo.AppointmentCallAttemptsVoCollection value)
	{
		this.isValidated = false;
		this.callattempts = value;
	}
	public boolean getConsultationApptIsNotNull()
	{
		return this.consultationappt != null;
	}
	public ims.scheduling.vo.Booking_AppointmentVo getConsultationAppt()
	{
		return this.consultationappt;
	}
	public void setConsultationAppt(ims.scheduling.vo.Booking_AppointmentVo value)
	{
		this.isValidated = false;
		this.consultationappt = value;
	}
	public boolean getIsSuitableForSurgeryIsNotNull()
	{
		return this.issuitableforsurgery != null;
	}
	public Boolean getIsSuitableForSurgery()
	{
		return this.issuitableforsurgery;
	}
	public void setIsSuitableForSurgery(Boolean value)
	{
		this.isValidated = false;
		this.issuitableforsurgery = value;
	}
	public boolean getIsFitForSurgeryIsNotNull()
	{
		return this.isfitforsurgery != null;
	}
	public Boolean getIsFitForSurgery()
	{
		return this.isfitforsurgery;
	}
	public void setIsFitForSurgery(Boolean value)
	{
		this.isValidated = false;
		this.isfitforsurgery = value;
	}
	public boolean getHasTheatreApptIsNotNull()
	{
		return this.hastheatreappt != null;
	}
	public Boolean getHasTheatreAppt()
	{
		return this.hastheatreappt;
	}
	public void setHasTheatreAppt(Boolean value)
	{
		this.isValidated = false;
		this.hastheatreappt = value;
	}
	public boolean getIsAwaitingClinicalInfoIsNotNull()
	{
		return this.isawaitingclinicalinfo != null;
	}
	public Boolean getIsAwaitingClinicalInfo()
	{
		return this.isawaitingclinicalinfo;
	}
	public void setIsAwaitingClinicalInfo(Boolean value)
	{
		this.isValidated = false;
		this.isawaitingclinicalinfo = value;
	}
	public boolean getHasRejectedInvIsNotNull()
	{
		return this.hasrejectedinv != null;
	}
	public Boolean getHasRejectedInv()
	{
		return this.hasrejectedinv;
	}
	public void setHasRejectedInv(Boolean value)
	{
		this.isValidated = false;
		this.hasrejectedinv = value;
	}
	public boolean getConsultationActivityRequiredIsNotNull()
	{
		return this.consultationactivityrequired != null;
	}
	public Boolean getConsultationActivityRequired()
	{
		return this.consultationactivityrequired;
	}
	public void setConsultationActivityRequired(Boolean value)
	{
		this.isValidated = false;
		this.consultationactivityrequired = value;
	}
	public boolean getHasDNAorNotSeenActivityIsNotNull()
	{
		return this.hasdnaornotseenactivity != null;
	}
	public Boolean getHasDNAorNotSeenActivity()
	{
		return this.hasdnaornotseenactivity;
	}
	public void setHasDNAorNotSeenActivity(Boolean value)
	{
		this.isValidated = false;
		this.hasdnaornotseenactivity = value;
	}
	public boolean getHasRebookingSubsequentActivityIsNotNull()
	{
		return this.hasrebookingsubsequentactivity != null;
	}
	public Boolean getHasRebookingSubsequentActivity()
	{
		return this.hasrebookingsubsequentactivity;
	}
	public void setHasRebookingSubsequentActivity(Boolean value)
	{
		this.isValidated = false;
		this.hasrebookingsubsequentactivity = value;
	}
	public boolean getRedirectCABIsNotNull()
	{
		return this.redirectcab != null;
	}
	public Boolean getRedirectCAB()
	{
		return this.redirectcab;
	}
	public void setRedirectCAB(Boolean value)
	{
		this.isValidated = false;
		this.redirectcab = value;
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
		if(this.icabreferral != null)
		{
			if(!this.icabreferral.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.referraldetails != null)
		{
			if(!this.referraldetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.investigationorders != null)
		{
			if(!this.investigationorders.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.appointments != null)
		{
			if(!this.appointments.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.currentstatus != null)
		{
			if(!this.currentstatus.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.statushistory != null)
		{
			if(!this.statushistory.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.callattempts != null)
		{
			if(!this.callattempts.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.consultationappt != null)
		{
			if(!this.consultationappt.isValidated())
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.icabreferral != null)
		{
			String[] listOfOtherErrors = this.icabreferral.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.referraldetails != null)
		{
			String[] listOfOtherErrors = this.referraldetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.investigationorders != null)
		{
			String[] listOfOtherErrors = this.investigationorders.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.appointments != null)
		{
			String[] listOfOtherErrors = this.appointments.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.currentstatus != null)
		{
			String[] listOfOtherErrors = this.currentstatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.statushistory != null)
		{
			String[] listOfOtherErrors = this.statushistory.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.callattempts != null)
		{
			String[] listOfOtherErrors = this.callattempts.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.consultationappt != null)
		{
			String[] listOfOtherErrors = this.consultationappt.validate();
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
	
		CatsReferralVo clone = new CatsReferralVo(this.id, this.version);
		
		clone.patient = this.patient;
		if(this.icabreferral == null)
			clone.icabreferral = null;
		else
			clone.icabreferral = (ims.core.vo.ICABReferralVo)this.icabreferral.clone();
		if(this.referraldetails == null)
			clone.referraldetails = null;
		else
			clone.referraldetails = (ims.clinical.vo.ReferralLetterDetailsVo)this.referraldetails.clone();
		if(this.investigationorders == null)
			clone.investigationorders = null;
		else
			clone.investigationorders = (ims.ocrr.vo.OcsOrderVoCollection)this.investigationorders.clone();
		if(this.appointments == null)
			clone.appointments = null;
		else
			clone.appointments = (ims.scheduling.vo.Booking_AppointmentVoCollection)this.appointments.clone();
		clone.hasdocuments = this.hasdocuments;
		if(this.currentstatus == null)
			clone.currentstatus = null;
		else
			clone.currentstatus = (ims.RefMan.vo.CatsReferralStatusVo)this.currentstatus.clone();
		if(this.statushistory == null)
			clone.statushistory = null;
		else
			clone.statushistory = (ims.RefMan.vo.CatsReferralStatusVoCollection)this.statushistory.clone();
		if(this.callattempts == null)
			clone.callattempts = null;
		else
			clone.callattempts = (ims.RefMan.vo.AppointmentCallAttemptsVoCollection)this.callattempts.clone();
		if(this.consultationappt == null)
			clone.consultationappt = null;
		else
			clone.consultationappt = (ims.scheduling.vo.Booking_AppointmentVo)this.consultationappt.clone();
		clone.issuitableforsurgery = this.issuitableforsurgery;
		clone.isfitforsurgery = this.isfitforsurgery;
		clone.hastheatreappt = this.hastheatreappt;
		clone.isawaitingclinicalinfo = this.isawaitingclinicalinfo;
		clone.hasrejectedinv = this.hasrejectedinv;
		clone.consultationactivityrequired = this.consultationactivityrequired;
		clone.hasdnaornotseenactivity = this.hasdnaornotseenactivity;
		clone.hasrebookingsubsequentactivity = this.hasrebookingsubsequentactivity;
		clone.redirectcab = this.redirectcab;
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
		if (!(CatsReferralVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CatsReferralVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((CatsReferralVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((CatsReferralVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.patient != null)
			count++;
		if(this.icabreferral != null)
			count++;
		if(this.referraldetails != null)
			count++;
		if(this.investigationorders != null)
			count++;
		if(this.appointments != null)
			count++;
		if(this.hasdocuments != null)
			count++;
		if(this.currentstatus != null)
			count++;
		if(this.statushistory != null)
			count++;
		if(this.callattempts != null)
			count++;
		if(this.consultationappt != null)
			count++;
		if(this.issuitableforsurgery != null)
			count++;
		if(this.isfitforsurgery != null)
			count++;
		if(this.hastheatreappt != null)
			count++;
		if(this.isawaitingclinicalinfo != null)
			count++;
		if(this.hasrejectedinv != null)
			count++;
		if(this.consultationactivityrequired != null)
			count++;
		if(this.hasdnaornotseenactivity != null)
			count++;
		if(this.hasrebookingsubsequentactivity != null)
			count++;
		if(this.redirectcab != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 19;
	}
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.core.vo.ICABReferralVo icabreferral;
	protected ims.clinical.vo.ReferralLetterDetailsVo referraldetails;
	protected ims.ocrr.vo.OcsOrderVoCollection investigationorders;
	protected ims.scheduling.vo.Booking_AppointmentVoCollection appointments;
	protected Boolean hasdocuments;
	protected ims.RefMan.vo.CatsReferralStatusVo currentstatus;
	protected ims.RefMan.vo.CatsReferralStatusVoCollection statushistory;
	protected ims.RefMan.vo.AppointmentCallAttemptsVoCollection callattempts;
	protected ims.scheduling.vo.Booking_AppointmentVo consultationappt;
	protected Boolean issuitableforsurgery;
	protected Boolean isfitforsurgery;
	protected Boolean hastheatreappt;
	protected Boolean isawaitingclinicalinfo;
	protected Boolean hasrejectedinv;
	protected Boolean consultationactivityrequired;
	protected Boolean hasdnaornotseenactivity;
	protected Boolean hasrebookingsubsequentactivity;
	protected Boolean redirectcab;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
