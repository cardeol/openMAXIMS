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

package ims.RefMan.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class ReferralWorklistStatus extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public ReferralWorklistStatus()
	{
		super();
	}
	public ReferralWorklistStatus(int id)
	{
		super(id, "", true);
	}
	public ReferralWorklistStatus(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public ReferralWorklistStatus(int id, String text, boolean active, ReferralWorklistStatus parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public ReferralWorklistStatus(int id, String text, boolean active, ReferralWorklistStatus parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public ReferralWorklistStatus(int id, String text, boolean active, ReferralWorklistStatus parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static ReferralWorklistStatus buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new ReferralWorklistStatus(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (ReferralWorklistStatus)super.getParentInstance();
	}
	public ReferralWorklistStatus getParent()
	{
		return (ReferralWorklistStatus)super.getParentInstance();
	}
	public void setParent(ReferralWorklistStatus parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		ReferralWorklistStatus[] typedChildren = new ReferralWorklistStatus[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (ReferralWorklistStatus)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof ReferralWorklistStatus)
		{
			super.addChild((ReferralWorklistStatus)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof ReferralWorklistStatus)
		{
			super.removeChild((ReferralWorklistStatus)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		ReferralWorklistStatusCollection result = new ReferralWorklistStatusCollection();
		result.add(AWAITING_REFERRAL_LETTER);
		result.add(AWAITING_TRIAGE);
		result.add(CONSULTATION_APPOINTMENT_REQUIRED);
		result.add(OTHER_APPOINTMENTS_REQUIRED);
		result.add(PROVISIONAL_REJECTION);
		result.add(REFERRAL_REJECTED);
		result.add(REFERRAL_ACCEPTED);
		result.add(REVIEW_APPOINTMENTS);
		result.add(REJECTED_INVESTIGATIONS);
		result.add(REFERRALS_PENDING_RESULTS);
		result.add(FLAGGED_FOR_REVIEW);
		result.add(FURTHER_MANAGMENT_REQUIRED);
		result.add(FINAL_DISCHARGE_DOCUMENT_REQUIRED);
		result.add(DISCHARGED_REFERRALS);
		result.add(PROVIDER_CANCELLATION);
		result.add(ORDERINV_ACCEPTED_APPT_REQUIRED);
		result.add(FIT_FOR_SURGERY_NEED_APPT);
		result.add(CAB_REFERRALS_TO_BE_ACCEPTED_ON_CAB);
		result.add(REBOOKING_OF_SUBSEQUENT_ACTIVITY);
		result.add(ONWARD_REFERRAL_WORKLIST);
		result.add(REPORTS_REQUIRED_WORKLIST);
		result.add(DISCHARGE_REPORT_WORKLIST);
		result.add(MY_ALLOCATED_WORKLIST);
		result.add(FURTHER_MANAGEMENT_REQUIRED_TLT);
		result.add(NOT_FIT_OR_SUITABLE_FOR_SURGERY);
		result.add(RefMan_REPORTS_REQUIRED_WORKLIST);
		result.add(REFER_BACK_TO_CONS_WORKLIST);
		result.add(DNA_NOT_SEEN_DISCHARGED_TO_GP);
		result.add(AWAITING_CLINICAL_INFO);
		result.add(ACTIVE_MONITORING_REQ_APPOINTMENT);
		result.add(ACTIVE_MONITORING);
		result.add(TWENTYFOUR_HOUR_POST_OP);
		result.add(REFERRAL_TRIAGE_WORKLIST);
		result.add(OP_PROCEDURE_AWAITING_APPOINTMENT);
		result.add(CONSULTATION_ACTIVITY_REQUIRED);
		result.add(CAB_REDIRECT_SERVICE);
		return result;
	}
	public static ReferralWorklistStatus[] getNegativeInstances()
	{
		ReferralWorklistStatus[] instances = new ReferralWorklistStatus[36];
		instances[0] = AWAITING_REFERRAL_LETTER;
		instances[1] = AWAITING_TRIAGE;
		instances[2] = CONSULTATION_APPOINTMENT_REQUIRED;
		instances[3] = OTHER_APPOINTMENTS_REQUIRED;
		instances[4] = PROVISIONAL_REJECTION;
		instances[5] = REFERRAL_REJECTED;
		instances[6] = REFERRAL_ACCEPTED;
		instances[7] = REVIEW_APPOINTMENTS;
		instances[8] = REJECTED_INVESTIGATIONS;
		instances[9] = REFERRALS_PENDING_RESULTS;
		instances[10] = FLAGGED_FOR_REVIEW;
		instances[11] = FURTHER_MANAGMENT_REQUIRED;
		instances[12] = FINAL_DISCHARGE_DOCUMENT_REQUIRED;
		instances[13] = DISCHARGED_REFERRALS;
		instances[14] = PROVIDER_CANCELLATION;
		instances[15] = ORDERINV_ACCEPTED_APPT_REQUIRED;
		instances[16] = FIT_FOR_SURGERY_NEED_APPT;
		instances[17] = CAB_REFERRALS_TO_BE_ACCEPTED_ON_CAB;
		instances[18] = REBOOKING_OF_SUBSEQUENT_ACTIVITY;
		instances[19] = ONWARD_REFERRAL_WORKLIST;
		instances[20] = REPORTS_REQUIRED_WORKLIST;
		instances[21] = DISCHARGE_REPORT_WORKLIST;
		instances[22] = MY_ALLOCATED_WORKLIST;
		instances[23] = FURTHER_MANAGEMENT_REQUIRED_TLT;
		instances[24] = NOT_FIT_OR_SUITABLE_FOR_SURGERY;
		instances[25] = RefMan_REPORTS_REQUIRED_WORKLIST;
		instances[26] = REFER_BACK_TO_CONS_WORKLIST;
		instances[27] = DNA_NOT_SEEN_DISCHARGED_TO_GP;
		instances[28] = AWAITING_CLINICAL_INFO;
		instances[29] = ACTIVE_MONITORING_REQ_APPOINTMENT;
		instances[30] = ACTIVE_MONITORING;
		instances[31] = TWENTYFOUR_HOUR_POST_OP;
		instances[32] = REFERRAL_TRIAGE_WORKLIST;
		instances[33] = OP_PROCEDURE_AWAITING_APPOINTMENT;
		instances[34] = CONSULTATION_ACTIVITY_REQUIRED;
		instances[35] = CAB_REDIRECT_SERVICE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[36];
		negativeInstances[0] = "AWAITING_REFERRAL_LETTER";
		negativeInstances[1] = "AWAITING_TRIAGE";
		negativeInstances[2] = "CONSULTATION_APPOINTMENT_REQUIRED";
		negativeInstances[3] = "OTHER_APPOINTMENTS_REQUIRED";
		negativeInstances[4] = "PROVISIONAL_REJECTION";
		negativeInstances[5] = "REFERRAL_REJECTED";
		negativeInstances[6] = "REFERRAL_ACCEPTED";
		negativeInstances[7] = "REVIEW_APPOINTMENTS";
		negativeInstances[8] = "REJECTED_INVESTIGATIONS";
		negativeInstances[9] = "REFERRALS_PENDING_RESULTS";
		negativeInstances[10] = "FLAGGED_FOR_REVIEW";
		negativeInstances[11] = "FURTHER_MANAGMENT_REQUIRED";
		negativeInstances[12] = "FINAL_DISCHARGE_DOCUMENT_REQUIRED";
		negativeInstances[13] = "DISCHARGED_REFERRALS";
		negativeInstances[14] = "PROVIDER_CANCELLATION";
		negativeInstances[15] = "ORDERINV_ACCEPTED_APPT_REQUIRED";
		negativeInstances[16] = "FIT_FOR_SURGERY_NEED_APPT";
		negativeInstances[17] = "CAB_REFERRALS_TO_BE_ACCEPTED_ON_CAB";
		negativeInstances[18] = "REBOOKING_OF_SUBSEQUENT_ACTIVITY";
		negativeInstances[19] = "ONWARD_REFERRAL_WORKLIST";
		negativeInstances[20] = "REPORTS_REQUIRED_WORKLIST";
		negativeInstances[21] = "DISCHARGE_REPORT_WORKLIST";
		negativeInstances[22] = "MY_ALLOCATED_WORKLIST";
		negativeInstances[23] = "FURTHER_MANAGEMENT_REQUIRED_TLT";
		negativeInstances[24] = "NOT_FIT_OR_SUITABLE_FOR_SURGERY";
		negativeInstances[25] = "RefMan_REPORTS_REQUIRED_WORKLIST";
		negativeInstances[26] = "REFER_BACK_TO_CONS_WORKLIST";
		negativeInstances[27] = "DNA_NOT_SEEN_DISCHARGED_TO_GP";
		negativeInstances[28] = "AWAITING_CLINICAL_INFO";
		negativeInstances[29] = "ACTIVE_MONITORING_REQ_APPOINTMENT";
		negativeInstances[30] = "ACTIVE_MONITORING";
		negativeInstances[31] = "TWENTYFOUR_HOUR_POST_OP";
		negativeInstances[32] = "REFERRAL_TRIAGE_WORKLIST";
		negativeInstances[33] = "OP_PROCEDURE_AWAITING_APPOINTMENT";
		negativeInstances[34] = "CONSULTATION_ACTIVITY_REQUIRED";
		negativeInstances[35] = "CAB_REDIRECT_SERVICE";
		return negativeInstances;
	}
	public static ReferralWorklistStatus getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static ReferralWorklistStatus getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		ReferralWorklistStatus[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1341008;
	public static final ReferralWorklistStatus AWAITING_REFERRAL_LETTER = new ReferralWorklistStatus(-1529, "Awaiting Referral Letter", true, null, null, Color.Default);
	public static final ReferralWorklistStatus AWAITING_TRIAGE = new ReferralWorklistStatus(-1530, "Awaiting Triage", true, null, null, Color.Default);
	public static final ReferralWorklistStatus CONSULTATION_APPOINTMENT_REQUIRED = new ReferralWorklistStatus(-1531, "Consultation Appointment Required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus OTHER_APPOINTMENTS_REQUIRED = new ReferralWorklistStatus(-1532, "Other Appointments Required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus PROVISIONAL_REJECTION = new ReferralWorklistStatus(-1533, "Second Opinion Required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REFERRAL_REJECTED = new ReferralWorklistStatus(-1535, "Referral Rejected", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REFERRAL_ACCEPTED = new ReferralWorklistStatus(-1536, "All Appointments Booked", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REVIEW_APPOINTMENTS = new ReferralWorklistStatus(-1537, "Review Appointments", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REJECTED_INVESTIGATIONS = new ReferralWorklistStatus(-1564, "Rejected Investigations", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REFERRALS_PENDING_RESULTS = new ReferralWorklistStatus(-1565, "Referrals Awaiting Results", true, null, null, Color.Default);
	public static final ReferralWorklistStatus FLAGGED_FOR_REVIEW = new ReferralWorklistStatus(-1569, "Flagged for Review", true, null, null, Color.Default);
	public static final ReferralWorklistStatus FURTHER_MANAGMENT_REQUIRED = new ReferralWorklistStatus(-1571, "Further Management Required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus FINAL_DISCHARGE_DOCUMENT_REQUIRED = new ReferralWorklistStatus(-1609, "Final Discharge Document Required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus DISCHARGED_REFERRALS = new ReferralWorklistStatus(-1610, "Discharged Referral", true, null, null, Color.Default);
	public static final ReferralWorklistStatus PROVIDER_CANCELLATION = new ReferralWorklistStatus(-1573, "Provider Cancellation", true, null, null, Color.Default);
	public static final ReferralWorklistStatus ORDERINV_ACCEPTED_APPT_REQUIRED = new ReferralWorklistStatus(-1774, "Order Accepted and Appointment required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus FIT_FOR_SURGERY_NEED_APPT = new ReferralWorklistStatus(-1785, "Fit for Surgery and appointment required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus CAB_REFERRALS_TO_BE_ACCEPTED_ON_CAB = new ReferralWorklistStatus(-1791, "Accept in C&B", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REBOOKING_OF_SUBSEQUENT_ACTIVITY = new ReferralWorklistStatus(-1793, "Re-Booking of subsequent activity", true, null, null, Color.Default);
	public static final ReferralWorklistStatus ONWARD_REFERRAL_WORKLIST = new ReferralWorklistStatus(-1794, "Discharge to Onward Referral", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REPORTS_REQUIRED_WORKLIST = new ReferralWorklistStatus(-1795, "OLD Reports Required Worklist", true, null, null, Color.Default);
	public static final ReferralWorklistStatus DISCHARGE_REPORT_WORKLIST = new ReferralWorklistStatus(-1839, "Discharge Report Required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus MY_ALLOCATED_WORKLIST = new ReferralWorklistStatus(-1842, "My Allocated Worklist", true, null, null, Color.Default);
	public static final ReferralWorklistStatus FURTHER_MANAGEMENT_REQUIRED_TLT = new ReferralWorklistStatus(-1847, "TLT Management", true, null, null, Color.Default);
	public static final ReferralWorklistStatus NOT_FIT_OR_SUITABLE_FOR_SURGERY = new ReferralWorklistStatus(-1848, "Not Fit / Suitable for Surgery ", true, null, null, Color.Default);
	public static final ReferralWorklistStatus RefMan_REPORTS_REQUIRED_WORKLIST = new ReferralWorklistStatus(-1866, "Reports Required Worklist", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REFER_BACK_TO_CONS_WORKLIST = new ReferralWorklistStatus(-1876, "Refer Back to Consultant", true, null, null, Color.Default);
	public static final ReferralWorklistStatus DNA_NOT_SEEN_DISCHARGED_TO_GP = new ReferralWorklistStatus(-1877, "DNA or Not Seen - Discharged back to GP", true, null, null, Color.Default);
	public static final ReferralWorklistStatus AWAITING_CLINICAL_INFO = new ReferralWorklistStatus(-1906, "Awaiting Clinical Information", true, null, null, Color.Default);
	public static final ReferralWorklistStatus ACTIVE_MONITORING_REQ_APPOINTMENT = new ReferralWorklistStatus(-2054, "Active Monitoring -  Req Appointment", true, null, null, Color.Default);
	public static final ReferralWorklistStatus ACTIVE_MONITORING = new ReferralWorklistStatus(-2062, "Active Monitoring", true, null, null, Color.Default);
	public static final ReferralWorklistStatus TWENTYFOUR_HOUR_POST_OP = new ReferralWorklistStatus(-2135, "24Hour Post-Op call list", true, null, null, Color.Default);
	public static final ReferralWorklistStatus REFERRAL_TRIAGE_WORKLIST = new ReferralWorklistStatus(-2160, "Onward Referral Requested Worklist", true, null, null, Color.Default);
	public static final ReferralWorklistStatus OP_PROCEDURE_AWAITING_APPOINTMENT = new ReferralWorklistStatus(-2206, "OP Procedure awaiting appointment", true, null, null, Color.Default);
	public static final ReferralWorklistStatus CONSULTATION_ACTIVITY_REQUIRED = new ReferralWorklistStatus(-3266, "First Consultation Activity Required", true, null, null, Color.Default);
	public static final ReferralWorklistStatus CAB_REDIRECT_SERVICE = new ReferralWorklistStatus(-3454, "C&B - Redirect Service", true, null, null, Color.Black);
}
