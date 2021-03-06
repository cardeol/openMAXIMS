// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.removefromelectivelist;

import java.util.ArrayList;

import ims.RefMan.vo.Booking_AppointmentElectiveListVo;
import ims.RefMan.vo.CatsReferralListVo;
import ims.RefMan.vo.ElectiveListStatusVo;
import ims.RefMan.vo.ElectiveListStatusVoCollection;
import ims.RefMan.vo.PatientElectiveListForTCIDetailsDialogVo;
import ims.RefMan.vo.PatientElectiveListRefVo;
import ims.RefMan.vo.PatientElectiveListTCIVo;
import ims.RefMan.vo.PatientElectiveListTCIVoCollection;
import ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo;
import ims.RefMan.vo.TCIOutcomeForPatientElectiveListVoCollection;
import ims.RefMan.vo.lookups.AdmissionOfferOutcome;
import ims.RefMan.vo.lookups.ElectiveListStatusReason;
import ims.RefMan.vo.lookups.TCIStatusChangeReason;
import ims.chooseandbook.vo.lookups.ActionRequestType;
import ims.configuration.gen.ConfigFlag;
import ims.core.resource.people.vo.MemberOfStaffRefVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.enums.MosType;
import ims.core.vo.lookups.WaitingListStatus;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.scheduling.vo.Appointment_StatusVo;
import ims.scheduling.vo.Appointment_StatusVoCollection;
import ims.scheduling.vo.Booking_AppointmentVo;
import ims.scheduling.vo.lookups.Status_Reason;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{

		if( save(true))
			engine.close(DialogResult.OK);
		
	}
	private String[] validateUIRules()
	{
		ArrayList<String> errors = new ArrayList<String>();

		if( form.dtimRemovalDateTime().getValue() == null )
		{
			errors.add("Removal Date Time is mandatory!");
		}
		if( form.ccRemovedBy().getValue() == null )
		{
			errors.add("Removed By is mandatory!");
		}
		if( form.cmbRemovalReason().getValue() == null)
		{
			errors.add("Removal Reason is mandatory!");
		}
		if( form.cmbRemovalOtherReason().getValue() == null)
		{
			errors.add("Removal Other Reason is mandatory!");
		}
		
		if (errors.size() > 0)
		{
			String[] UIErrors = new String[errors.size()];
			errors.toArray(UIErrors);
			return UIErrors;
		}

		return null;
	}
	private boolean save( boolean details)
	{
		PatientElectiveListForTCIDetailsDialogVo record =  form.getLocalContext().getPatientElectiveList(); 
		String[] errors = validateUIRules();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		if( record != null )
		{
			if( details == true )
			{
    			if( record.getTCIDetailsIsNotNull()  )
    			{
    				if( record.getTCIDetails().getTCIDateIsNotNull() && (record.getTCIDetails().getTCIDate().isGreaterOrEqualThan(new Date()) ||( record.getTCIDetails().getAppointmentIsNotNull() && record.getTCIDetails().getAppointment().getAppointmentDateIsNotNull() && record.getTCIDetails().getAppointment().getAppointmentDate().isGreaterOrEqualThan(new Date()))))
    				{
    					form.getLocalContext().setMessageBoxIdForRemoveEntryList(engine.showMessage("Do you want to Cancel All Future TCI's and Appointments ? " , "" , MessageButtons.YESNO, MessageIcon.QUESTION));
    					return false;
    				}
    			}
			}
			
			record = setRemovedStatus(record);
			String[] arrErrors = record.validate();
			if (arrErrors != null)
			{
				engine.showErrors(arrErrors);
				return false;
			}
			try
			{
				record = domain.save(record);
			}
			catch (StaleObjectException e)
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				return true;
			}
			catch (UniqueKeyViolationException e)
			{
				engine.showMessage(e.getMessage());
				return false;
			}
			
		}
		
		return true;
		
	}
	private void RemoveFromElective()
	{
		
		PatientElectiveListForTCIDetailsDialogVo  tempVo = form.getLocalContext().getPatientElectiveList();
		
		
		if( tempVo != null  && tempVo.getTCIDetailsIsNotNull() && tempVo.getTCIDetails().getAppointmentIsNotNull() && tempVo.getTCIDetails().getAppointment().getAppointmentDateIsNotNull() && tempVo.getTCIDetails().getAppointment().getAppointmentDate().isGreaterOrEqualThan(new Date()))
		{
						
			Appointment_StatusVo voApptStatus = new Appointment_StatusVo();
			//voApptStatus.setComment(form.txtComment().getValue());
			voApptStatus.setStatus(Status_Reason.CANCELLED);
			//voApptStatus.setStatusReason(form.cmbCancellationType().getValue());
			//voApptStatus.setCancellationReason(form.cmbCancellationReason().getValue());
			
			form.getGlobalContext().Scheduling.setApptCancelStatus(voApptStatus);
			Booking_AppointmentVo voAppt = cancelAppt();
			if( voAppt == null)
				return;
			
			CancelTCIforRemove();
		
		}
		else
		{
			CancelTCIforRemove();
			
		}
	}
	private PatientElectiveListForTCIDetailsDialogVo setRemovedStatus(PatientElectiveListForTCIDetailsDialogVo record )
	{
		if( record == null )
			return null;
		
		// create a new electiveliststatus
		ElectiveListStatusVo electivStatus = new ElectiveListStatusVo();
		//set the values for the new created electiveliststatus 
		electivStatus.setElectiveListStatus(WaitingListStatus.REMOVED);
		electivStatus.setStatusDateTime(form.dtimRemovalDateTime().getValue());
		
		electivStatus.setAuthoringUser((MemberOfStaffLiteVo) form.ccRemovedBy().getValue());
		electivStatus.setRemovalReason(form.cmbRemovalReason().getValue());
		electivStatus.setRemovalOtherReason(form.cmbRemovalOtherReason().getValue());
		electivStatus.setStatusComment(form.txtRemovalComment().getValue());

		//get the history
		ElectiveListStatusVoCollection electListColl = record.getElectiveListStatusHistory();		
		if( electListColl == null )
			electListColl = new ElectiveListStatusVoCollection();
		
		electListColl.add(electivStatus);							//add to history the old electiveliststatus
		record.setElectiveListStatusHistory(electListColl);
		record.setElectiveListStatus(electivStatus);				//set the new electiveliststatus
		return record;
		
		
	}
	private boolean CancelTCIforRemove()
	{
		PatientElectiveListForTCIDetailsDialogVo record = form.getLocalContext().getPatientElectiveList();
		if( record != null )
		{
			
			record = setRemovedStatus(record);
			//----------
			PatientElectiveListTCIVo patTciVo = record.getTCIDetails();
			if( patTciVo != null && patTciVo.getTCIDateIsNotNull() && patTciVo.getTCIDate().isGreaterOrEqualThan(new Date()))
			{
				
				//create a new Outcome
				TCIOutcomeForPatientElectiveListVo  temp = new TCIOutcomeForPatientElectiveListVo();
				//set the values for the new created outcome
				temp.setOutcomeReason(TCIStatusChangeReason.CANCELLEDBYREMOVALOFELECTIVELISTRECORD);
				temp.setStatusDateTime(new DateTime());
				
				Object mos  = domain.getMosUser();
				MemberOfStaffLiteVo mossh = null;
				if( mos instanceof MemberOfStaffShortVo )
				{
					mossh = (MemberOfStaffLiteVo) mos;
				}
				temp.setChangeBy(mossh);
				if( patTciVo.getTCIDate().equals(new Date()))		//if the nowdate is equal with TCIDate 
					temp.setOutcome(AdmissionOfferOutcome.ADMISSION_CANCELLED_BY_HOSPITAL_ON_DAY_7);
				else
					temp.setOutcome(AdmissionOfferOutcome.ADMISSION_CANCELLED_BY_HOSPITAL_BEFORE_6);
				
				
				//get outcome history
				TCIOutcomeForPatientElectiveListVoCollection  tempColl = patTciVo.getOutcomeHistory();
				if( tempColl == null )
					tempColl = new TCIOutcomeForPatientElectiveListVoCollection();
				
				tempColl.add(patTciVo.getCurrentOutcome());			//add the old outcome to history
				patTciVo.setOutcomeHistory(tempColl);
				patTciVo.setCurrentOutcome(temp);					//add the new created outcome to currentoutcome field 
    			
    			
				//get TCI history
    			PatientElectiveListTCIVoCollection patelctTCIcoll = record.getTCIHistory();
    			if( patelctTCIcoll == null )
    				patelctTCIcoll = new PatientElectiveListTCIVoCollection();
    			
    			patelctTCIcoll.add(record.getTCIDetails());			//add the old TCIDetails to history
    			record.setTCIHistory(patelctTCIcoll);
    			record.setTCIDetails(null);							//set NULL to TCI Details	
    			
			}
			String[] arrErrors = record.validate();
			if (arrErrors != null)
			{
				engine.showErrors(arrErrors);
				return false;
			}
			try
			{
				record = domain.save(record);
			}
			catch (StaleObjectException e)
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				return false;
			}
			catch (UniqueKeyViolationException e)
			{
				engine.showMessage(e.getMessage());
				return false;
			}
		}
		return true;

	}
	private Booking_AppointmentVo cancelAppt() 
	{
		Booking_AppointmentElectiveListVo voAppt = form.getLocalContext().getPatientElectiveListIsNotNull() && form.getLocalContext().getPatientElectiveList().getTCIDetailsIsNotNull()?form.getLocalContext().getPatientElectiveList().getTCIDetails().getAppointment():null;
		if( voAppt == null)
			return null;
		
		Booking_AppointmentVo voApptFull = domain.getBookingAppointment(voAppt);
			
		if( voApptFull.getApptStatusIsNotNull()
			&& voAppt.getApptStatusIsNotNull()
			&&  !voApptFull.getApptStatus().equals(voAppt.getApptStatus()) )
		{
			engine.showMessage("The Status of the appointment has already been changed.");
			return null;
		}
			
		if( form.getGlobalContext().Scheduling.getApptCancelStatusIsNotNull())
		{
			// appt status and status history
			voApptFull.setApptStatus(Status_Reason.CANCELLED);
			
			// wdev-6034
			Appointment_StatusVo voApptStatus = new Appointment_StatusVo();
			voApptFull.setCurrentStatusRecord(voApptStatus);

			voApptFull.setApptStatusHistory(getApptStatusHistory(voApptFull,Status_Reason.CANCELLED, voApptStatus));
			if( form.getGlobalContext().Scheduling.getApptCancelStatusIsNotNull())
			{
				voApptFull.setApptStatusReas(form.getGlobalContext().Scheduling.getApptCancelStatus().getStatusReason());
				if( form.getGlobalContext().Scheduling.getApptCancelStatus().getRebookSelectedIsNotNull())
					voApptFull.setRequiresRebook(form.getGlobalContext().Scheduling.getApptCancelStatus().getRebookSelected());
			}
		}
		if( voApptFull.getSessionSlotIsNotNull())
			voApptFull.getSessionSlot().setStatus(Status_Reason.SLOTOPENED);
		
		String[] arrErrors = voApptFull.validate();
		if( arrErrors != null)
		{
			engine.showErrors(arrErrors);
			return null;
		}
		PatientElectiveListForTCIDetailsDialogVo tempVo = form.getLocalContext().getPatientElectiveList();
		CatsReferralListVo voRef = domain.getCatsReferral(tempVo.getReferral());
		form.getLocalContext().setCatsReferralListV(voRef);
		if( tempVo != null && tempVo.getReferralIsNotNull())
		{
			voRef.setHasCancelledApptsForReview(true);
			String[] arrErrors2 = voRef.validate();
    		if( arrErrors2 != null)
    		{
    			engine.showErrors(arrErrors2);
    			return null;
    		}
    		form.getLocalContext().setCatsReferralListV(voRef);
		}

		try 
		{
			voApptFull = domain.cancelAppt(voApptFull, ActionRequestType.NOTIFY_APPT_CANCEL, "Cancel Appt requested from Referral Appointment Details");
		
			if( form.getLocalContext().getCatsReferralListVIsNotNull()) 
			{
    			domain.updateCatsReferralAdditionalInvStatus(form.getLocalContext().getCatsReferralListV());
    			
    			domain.updateCatsReferralCancelStatus(form.getLocalContext().getCatsReferralListV());
			}
			
			if( Status_Reason.HOSPITALCANCELLED.equals(voApptFull.getApptStatusReas()) && voApptFull.getTheatreBooking() != null)
			{
				domain.cancelReferralEROD(voRef, voApptFull);
			}
		} 
		catch( StaleObjectException e) 
		{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				return null;
		}
		
		return voApptFull;
		
		
		
	}
	private Appointment_StatusVoCollection getApptStatusHistory(Booking_AppointmentVo voAppt, Status_Reason status, Appointment_StatusVo voApptStatus) 
	{
		voApptStatus.setApptDate(voAppt.getAppointmentDate());
		if (voAppt.getSessionSlotIsNotNull())
		{
			voApptStatus.setApptTime(voAppt.getSessionSlot().getStartTm());
			voApptStatus.setStatusChangeDateTime(new DateTime());
			voApptStatus.setPriority(voAppt.getSessionSlot().getPriority());
		}
		//WDEV-11887
		else if(voAppt.getApptStartTimeIsNotNull())
		{
			voApptStatus.setApptTime(voAppt.getApptStartTime());
			voApptStatus.setStatusChangeDateTime(new DateTime());
		}
		
		// if reason is cancelled retrieve values set in cancel dialog
		if(status.equals(Status_Reason.CANCELLED))
		{
			if(form.getGlobalContext().Scheduling.getApptCancelStatusIsNotNull())
			{
				voApptStatus.setStatus(form.getGlobalContext().Scheduling.getApptCancelStatus().getStatus());
				voApptStatus.setStatusReason(form.getGlobalContext().Scheduling.getApptCancelStatus().getStatusReason());
				voApptStatus.setCancellationReason(form.getGlobalContext().Scheduling.getApptCancelStatus().getCancellationReason());
				voApptStatus.setRebookSelected(form.getGlobalContext().Scheduling.getApptCancelStatus().getRebookSelected());
				voApptStatus.setComment(form.getGlobalContext().Scheduling.getApptCancelStatus().getComment());
				//--------------
				voApptStatus.setEarliestOfferedDate(voAppt.getEarliestOfferedDate());
				///-----------
			}
		}
		else
		{
			voApptStatus.setStatus(status);
			voApptStatus.setStatusReason(status);
		}

		
		
		Appointment_StatusVoCollection voCollApptStatusHistory = voAppt.getApptStatusHistory();
		if(voCollApptStatusHistory == null)
			voCollApptStatusHistory = new Appointment_StatusVoCollection();
		
		
		voCollApptStatusHistory.add(voApptStatus);

		return voCollApptStatusHistory;
	}
	
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		if( args!=null && args.length > 0 )
		{
			if (args[0] !=null && args[0] instanceof PatientElectiveListRefVo)
				form.getLocalContext().setPatientElectiveList(domain.getPatientElectiveList((PatientElectiveListRefVo) args[0]));
		}
		
		initialize();
		open();
		
	}
	
	private void initialize()
	{
		clearScreen();

		form.ccRemovedBy().isRequired(true);
		form.ccRemovedBy().initialize(MosType.ALL);
		Object mos = domain.getMosUser();

		if (mos != null && mos instanceof MemberOfStaffRefVo)
			form.ccRemovedBy().setValue((MemberOfStaffLiteVo) mos);

		form.dtimRemovalDateTime().setValue(new DateTime());
	}
	
	private void open()
	{
		form.cmbRemovalReason().setValue(ElectiveListStatusReason.PATIENT_REMOVED_FOR_OTHER_REASONS);
		updateControlsState();
	}
	private void populateDcreenFromData()
	{
		PatientElectiveListForTCIDetailsDialogVo record = form.getLocalContext().getPatientElectiveList();
		if( record != null)
		{
			if( !record.getElectiveListStatusIsNotNull() )
			{
				form.cmbRemovalReason().setValue(ElectiveListStatusReason.PATIENT_REMOVED_FOR_OTHER_REASONS);
			}
			else if( record.getElectiveListStatusIsNotNull())
			{
				if( !record.getElectiveListStatus().getRemovalReasonIsNotNull())
				{
					form.cmbRemovalReason().setValue(ElectiveListStatusReason.PATIENT_REMOVED_FOR_OTHER_REASONS);
				}
				else
				{
					form.cmbRemovalReason().setValue(record.getElectiveListStatus().getRemovalReason());
				}
				form.dtimRemovalDateTime().setValue(record.getElectiveListStatus().getStatusDateTime());
				form.cmbRemovalOtherReason().setValue(record.getElectiveListStatus().getRemovalOtherReason());
				form.ccRemovedBy().setValue(record.getElectiveListStatus().getAuthoringUser());
				form.txtRemovalComment().setValue(record.getElectiveListStatus().getStatusComment());
			}
			
		}
	}
	private void updateControlsState()
	{
		form.cmbRemovalReason().setEnabled(false);
		form.cmbRemovalOtherReason().setEnabled(true);
		form.cmbRemovalOtherReason().setRequired(true);
		
	}
	private void clearScreen()
	{
		form.dtimRemovalDateTime().setValue(null);
		form.ccRemovedBy().setValue(null);
		form.cmbRemovalReason().setValue(null);
		form.cmbRemovalReason().setValue(null);
		form.txtRemovalComment().setValue(null);
	}

	
	protected void onMessageBoxClosed(int messageBoxId, DialogResult result) throws PresentationLogicException
	{
		if(form.getLocalContext().getMessageBoxIdForRemoveEntryListIsNotNull() && form.getLocalContext().getMessageBoxIdForRemoveEntryList().equals(messageBoxId))
		{
			if( DialogResult.YES.equals(result) )
			{
				RemoveFromElective();
				engine.close(DialogResult.OK);
			}
			else
			{
				save( false);
				engine.close(DialogResult.CANCEL);
			}
		}
		
	}
}
