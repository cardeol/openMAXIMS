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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 4342.23748)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.trackingandattendanceworklists;

import ims.core.helper.ResetPIDBarHelper;
import ims.core.vo.MedicVo;
import ims.core.vo.NurseVo;
import ims.core.vo.PatientShort;
import ims.core.vo.enums.MosType;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.SpecialtyCollection;
import ims.emergency.forms.trackingandattendanceworklists.GenForm.grdResultsRow;
import ims.emergency.forms.trackingandattendanceworklists.GenForm.grpDischargeStatusEnumeration;
import ims.emergency.helper.EmergencyDisplayHelper;
import ims.emergency.vo.TrackingAttendanceWorklist_SearchCriteriaVo;
import ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo;
import ims.emergency.vo.Tracking_TrackingAttendanceWorklistVo;
import ims.emergency.vo.Tracking_TrackingAttendanceWorklistVoCollection;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.PresentationLogicException;

import java.util.ArrayList;
import java.util.Comparator;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	// Defined values for report seeds
	private static final String CARE_CONTEXT_SEED = "CareContext_id";
	// Defined report IMS id
	private static final int EMERGENCY_PATIENT_SUMMARY = 320;
	
	// Defined values for ED, discharge status
	private static final int STATUS_CURRENTLY_IN_ED		= 1;
	private static final int STATUS_DISCHARGED			= 2;
	private static final int STATUS_CURRENT_DISCHARGE	= 3;
	
	// Defined values for allocated bed
	private static final int BED_AWAITING	= 1;
	private static final int BED_ALLOCATED	= 2;
	
	// Grid column indexes
	private static final int COL_REGISTRATION_DATE = 4;
	private static final int COL_LOS = 5;
	private static final int DISPLAY_TRIAGE	= 1;//WDEV-17151
	private static final int DISPLAY_CLINICIANASSESSMNRWORKLIST	 = 2;	//WDEV-17151
	private static final int DISPLAY_TRIAGE_FROM_TRACKING		 = 4;	//wdev-17436
	

	//------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Event handlers region
	//------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		// Initialize form
		initialize();
		// Present form to screen
		open(false);
	}

	
	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
	}


	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		open(false);
	}

	
	@Override
	protected void onBtnSearchClick() throws PresentationLogicException
	{
		form.grdResults().getRows().clear();// 	WDEV-16012
		setTotalsLabel(); //WDEV-18339
		
		String[] errors = validateSearchCritieria();
		
		if (errors != null && errors.length > 0)
		{
			updateControlsState();// 	WDEV-16012
			engine.showErrors(errors);
			return;
		}
		
		saveSearchCriteria();
		
		open(true);
	
		//WDEV-17886
		clearSelection();
		// Clear results grid selection
		form.grdResults().setValue(null);
		updateControlsState();//WDEV-17919
	}

	//WDEV-18339
	private void setTotalsLabel()
	{
		form.lblTotals().setValue("Total: " + String.valueOf(form.grdResults().getRows().size()));
	}

	@Override
	protected void onBtnClearClick() throws PresentationLogicException
	{
		clearSearchCriteria();
		
		clearControls();
		
		clearSelection();
		
		updateControlsState();
	}

	@Override
	protected void onChkAwaitingReviewValueChanged() throws PresentationLogicException
	{
		
	}


	@Override
	protected void onDteDischargeToValueChanged() throws PresentationLogicException
	{
		if (form.dteDischargeFrom().getValue() != null || form.dteDischargeTo().getValue() != null)
		{
			form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoDischargeOnly);
			
			form.chkAwaitingBed().setValue(false);
			form.chkBedAllocated().setValue(false);
		}
		
		updateControlsState();
	}


	@Override
	protected void onDteDischargeFromValueChanged() throws PresentationLogicException
	{
		if (form.dteDischargeFrom().getValue() != null || form.dteDischargeTo().getValue() != null)
		{
			form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoDischargeOnly);

			form.chkAwaitingBed().setValue(false);
			form.chkBedAllocated().setValue(false);
		}
		
		updateControlsState();
	}


	@Override
	protected void onChkBedAllocatedValueChanged() throws PresentationLogicException
	{
		if (form.chkBedAllocated().getValue() == true)
		{
			form.chkAwaitingBed().setValue(false);
			
			form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoCurrentlyED);
		}
		
		updateControlsState();
	}


	@Override
	protected void onChkAwaitingBedValueChanged() throws PresentationLogicException
	{
		if (form.chkAwaitingBed().getValue() == true)
		{
			form.chkBedAllocated().setValue(false);
			
			form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoCurrentlyED);
		}
		
		updateControlsState();
	}


	@Override
	protected void onGrdResultsGridHeaderClicked(int column) throws PresentationLogicException
	{
		if (column == COL_REGISTRATION_DATE)
		{
			sortByRegistrationDateTime(form.getLocalContext().getRegistrationDateSortOrder());
			// Toggle sort order
			form.getLocalContext().setRegistrationDateSortOrder(SortOrder.ASCENDING.equals(form.getLocalContext().getRegistrationDateSortOrder()) ? SortOrder.DESCENDING : SortOrder.ASCENDING);

			// Update selection & controls state
			updateSelection();
			updateControlsState();
		}
		
		if (column == COL_LOS)
		{
			sortByLOS(form.getLocalContext().getLOSSortOrder());
			form.getLocalContext().setLOSSortOrder(SortOrder.ASCENDING.equals(form.getLocalContext().getLOSSortOrder()) ? SortOrder.DESCENDING : SortOrder.ASCENDING);
			
			// Update selection & controls state
			updateSelection();
			updateControlsState();
		}
	}


	private void sortByLOS(SortOrder losSortOrder) 
	{
		// Get selected value
		Tracking_TrackingAttendanceWorklistVo value = form.grdResults().getValue();
		
		// Sort records from grid
		Tracking_TrackingAttendanceWorklistVoCollection results = form.grdResults().getValues();
		results.sort(new Tracking_TrackingAttendanceWorklistLOSComparator(form.getLocalContext().getLOSSortOrder()));
		
		// Display sorted records from grid
		displayResults(results);
		
		// Reselect in grid
		form.grdResults().setValue(value);
	}


	private void sortByRegistrationDateTime(SortOrder order)
	{
		// Get selected value
		Tracking_TrackingAttendanceWorklistVo value = form.grdResults().getValue();
		
		// Sort records from grid
		Tracking_TrackingAttendanceWorklistVoCollection results = form.grdResults().getValues();
		results.sort(order);
		
		// Display sorted records from grid
		displayResults(results);
		
		// Reselect in grid
		form.grdResults().setValue(value);
	}

	
	@Override
	protected void onGrdResultsSelectionChanged() throws PresentationLogicException
	{
		// Set selection
		updateSelection();
		// Update controls state
		updateControlsState();
	}



	@Override
	protected void onBtnViewPatientSummaryClick() throws PresentationLogicException
	{
		if (form.getGlobalContext().Core.getCurrentCareContext() == null)
			return;
		
		form.getGlobalContext().Core.setImsReportId(EMERGENCY_PATIENT_SUMMARY);
		engine.open(form.getForms().Core.PrintReportByIMSId, new Object[] {CARE_CONTEXT_SEED, form.getGlobalContext().Core.getCurrentCareContext().getID_CareContext()});
	}

	@Override
	protected void onBtnAssessmentDetailsClick() throws PresentationLogicException
	{
		TrackingForClinicianWorklistAndTriageVo tempVo = domain.getTrackingForClinicianWorklistAndTriageVo(form.grdResults().getValue());
		
		if (tempVo != null && tempVo.getTriageDetails() != null)
		{
			engine.open(form.getForms().Emergency.EDAssessmentDialog, new Object[] {DISPLAY_CLINICIANASSESSMNRWORKLIST,tempVo},"Clinician Assessment Worklist");
		}
		else
		{
			engine.open(form.getForms().Emergency.EDAssessmentDialog, new Object[] {DISPLAY_TRIAGE_FROM_TRACKING,tempVo},"Triage");	//wdev-17436
		}
	}

	//WDEV-16816
	@Override
	protected void onBtnSeenCompleteHCPClick() throws PresentationLogicException
	{
		if (form.getGlobalContext().Emergency.getTracking() == null)
			return;
		
		engine.open(form.getForms().Emergency.EDSeenByAndCompleteDialog);
	}

	@Override
	protected void onBtnReferSpecialtyClick() throws PresentationLogicException
	{
		if (form.getGlobalContext().Emergency.getTracking() == null)
			return;
		
		engine.open(form.getForms().Emergency.EDReferralToSpecialtyDialog);//WDEV-16777
	}
	
	
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Form presentation functions
	//------------------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Function used to initialize the form
	 */
	private void initialize()
	{
		// Initialize custom controls
		form.ccMedicSearch().initialize(MosType.MEDIC);
		form.ccNurseSearch().initialize(MosType.HCP, HcpDisType.NURSING);
		
		// Initialize local context
		form.getLocalContext().setRegistrationDateSortOrder(SortOrder.ASCENDING);
		form.getLocalContext().setLOSSortOrder(SortOrder.ASCENDING);
		
		// Set initial values for radio buttons
		form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoCurrentlyED);
		
		//populateSpecialtyCombo
		populateSpecialtyCombo();//WDEV-17653
		
		// Populate search criteria to screen from persistent global context
		populateSearchControls(form.getGlobalContext().Emergency.getTrackingAndAttendance_SearchCriteria());
		setTotalsLabel();//WDEV-18339
		
		// Clear global contexts for selection
		clearSelection();
		
		//WDEV-17425
		initializeButtons();
	}

	//WDEV-17653
	private void populateSpecialtyCombo()
	{
		form.cmbSpecialty().clear();
		
		SpecialtyCollection lookupCollection =domain.listSpecialties();
		
		if( lookupCollection != null && lookupCollection.size() > 0)
		{
			for( int i = 0; i < lookupCollection.size(); i++)
			{
				if( lookupCollection.get(i).isActive() == true ) 
				{	
					form.cmbSpecialty().newRow(lookupCollection.get(i), lookupCollection.get(i).getText(), lookupCollection.get(i).getImage(), lookupCollection.get(i).getTextColor());
					
				}
			}
			
		}
	}
	
	private void initializeButtons()
	{
		form.btnSeenCompleteHCP().setImage(form.getImages().Emergency.SEENCOMPLETE16);
		form.btnReferSpecialty().setImage(form.getImages().Emergency.REFERTO16);
		form.btnAssessmentDetails().setImage(form.getImages().Emergency.ASSESSMNTDETAILS16);
		form.btnViewResults().setImage(form.getImages().Emergency.RESULTS16);//WDEV-17874
	}


	/**
	 * Function used to refresh the screen
	 */
	public void open(boolean showMessageOnSearch) throws PresentationLogicException
	{
		// Check for a saved search criteria
		if (form.getGlobalContext().Emergency.getTrackingAndAttendance_SearchCriteriaIsNotNull())
		{
			// Search for results
			
			//WDEV-18001
			long startTime = System.currentTimeMillis();
			
			
			Tracking_TrackingAttendanceWorklistVoCollection results = domain.listEmergencyAttendances(form.getGlobalContext().Emergency.getTrackingAndAttendance_SearchCriteria());

			long endTime = System.currentTimeMillis();
			long miliseconds = endTime - startTime;
			System.out.println("Total Time get records from DB: " + miliseconds);
			
			if ((results == null || results.size() == 0) && showMessageOnSearch)
			{
				engine.showMessage("No results match search criteria.");
			}

			// Populate results to screen
			displayResults(results);
			setSelection();// 	WDEV-16012 
		}

		// Update control states
		updateControlsState();
	}
	
	// 	WDEV-16012
	private void setSelection() 
	{
		if(form.getGlobalContext().Emergency.getTracking() == null || form.getGlobalContext().Emergency.getTracking().getID_Tracking() == null || form.grdResults().getRows().size() == 0)
			return;
		
		for(int i=0; i<form.grdResults().getRows().size(); i++)
		{
			Tracking_TrackingAttendanceWorklistVo tracking = form.grdResults().getRows().get(i).getValue();
			
			if(tracking == null)
				continue;
			
			if(form.getGlobalContext().Emergency.getTracking().getID_Tracking().equals(tracking.getID_Tracking()))
			{
				form.grdResults().setValue(tracking);
				
				form.getGlobalContext().Core.setPatientShort(new PatientShort(tracking.getPatient().getID_Patient(), tracking.getPatient().getVersion_Patient()));
				form.getGlobalContext().Core.setCurrentCareContext(domain.getCareContext(tracking.getAttendance().getCareContext()));
				
				refreshPIDBarText();//WDEV-17332
			}
		}
	}

	/**
	 * Function used to clear the screen
	 */
	private void clearControls()
	{
		// Clear search criteria
		clearSearchControls();
		
		// Clear results grid
		form.grdResults().getRows().clear();
		//WDEV-18339
		setTotalsLabel();
	}
	
	/**
	 * Function used to update the selection in the grid
	 */
	private void updateSelection()
	{
		if (form.grdResults().getSelectedRow() != null && form.grdResults().getValue() != null)
		{
			Tracking_TrackingAttendanceWorklistVo tracking = form.grdResults().getValue();
			
			form.getGlobalContext().Core.setPatientShort(new PatientShort(tracking.getPatient().getID_Patient(), tracking.getPatient().getVersion_Patient()));
			form.getGlobalContext().Core.setCurrentCareContext(domain.getCareContext(tracking.getAttendance().getCareContext()));// 	WDEV-16012
			form.getGlobalContext().Emergency.setTracking(tracking);
			
			refreshPIDBarText();//WDEV-17332
		}
		else
		{
			form.getGlobalContext().Core.setPatientShort(null);
			form.getGlobalContext().Core.setCurrentCareContext(null);
			form.getGlobalContext().Emergency.setTracking(null);
		}
	}

	//WDEV-17332
	private void refreshPIDBarText()
	{
		if (form.getGlobalContext().Core.getPatientShort() == null)
			return;

		new ResetPIDBarHelper(engine,domain.getPatient(form.getGlobalContext().Core.getPatientShort() ), domain.getPIDDiagnosisInfo(form.getGlobalContext().Core.getCurrentCareContext(), form.getGlobalContext().Core.getEpisodeofCareShort()));
	}
	
	/**
	 * Function used to update / clear contexts when selection is cleared
	 */
	private void clearSelection()
	{
		form.getGlobalContext().Core.setPatientShort(null);
		form.getGlobalContext().Core.setCurrentCareContext(null);
	}

	/**
	 * Function used to set Bed Allocation radio button
	 */
	private void setBedAllocation(Integer bedAllocation)
	{
		if (bedAllocation == null)
		{
			form.chkAwaitingBed().setValue(false);
			form.chkBedAllocated().setValue(false);
			return;
		}
		
		// Determine which radio button for allocated bed should be selected
		switch (bedAllocation)
		{
			case BED_AWAITING:
				form.chkAwaitingBed().setValue(true);
				form.chkBedAllocated().setValue(false);
				break;
				
			case BED_ALLOCATED:
				form.chkAwaitingBed().setValue(false);
				form.chkBedAllocated().setValue(true);
				break;
				
			default:
				form.chkAwaitingBed().setValue(false);
				form.chkBedAllocated().setValue(false);
				break;
		}
	}

	/**
	 * Function used to set Discharge - ED status
	 */
	private void setDischargeEDStatus(Integer edStatus)
	{
		// Determine which radio button for discharge status should be selected
		switch (edStatus)
		{
			case STATUS_CURRENT_DISCHARGE:
				form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoCurentDischarge);
				break;
				
			case STATUS_CURRENTLY_IN_ED:
				form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoCurrentlyED);
				break;
				
			case STATUS_DISCHARGED:
				form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoDischargeOnly);
				break;
		}
	}

	/**
	 * Function used to get Discharge - ED status
	 */
	private Integer getDischargeEDStatus()
	{
		grpDischargeStatusEnumeration value = form.grpDischargeStatus().getValue();
		
		if (grpDischargeStatusEnumeration.rdoCurrentlyED.equals(value))
			return STATUS_CURRENTLY_IN_ED;
		
		if (grpDischargeStatusEnumeration.rdoDischargeOnly.equals(value))
			return STATUS_DISCHARGED;
		
		if (grpDischargeStatusEnumeration.rdoCurentDischarge.equals(value))
			return STATUS_CURRENT_DISCHARGE;

		return null;
	}

	/**
	 *	Function used to get Bed Allocation status
	 */
	private Integer getBedAllocationStatus()
	{
		if (form.chkBedAllocated().getValue())
			return BED_ALLOCATED;
		
		if (form.chkAwaitingBed().getValue())
			return BED_AWAITING;
		
		return null;
	}

	
	/**
	 *	Function used to display emergencies attendances
	 */
	private void displayResults(Tracking_TrackingAttendanceWorklistVoCollection results)
	{
		// Clear results grid
		form.grdResults().getRows().clear();
			
		// Test results collection
		if (results == null)
			return;
		
		for (Tracking_TrackingAttendanceWorklistVo tracking : results)
		{
			// Create row for attendance
			grdResultsRow row = form.grdResults().getRows().newRow();
			
			// Set row columns
			row.setColHopitalNo(tracking.getHospitalNo());
			row.setColSurname(tracking.getPatient().getName().getSurname());
			row.setColForename(tracking.getPatient().getName().getForename());
			row.setColStatus(tracking.getCurrentStatus() != null && tracking.getCurrentStatus().getStatus() != null ? tracking.getCurrentStatus().getStatus().getText() : null);
			row.setColRegDate(tracking.getAttendance().getRegistrationDateTime() != null ? tracking.getAttendance().getRegistrationDateTime().toString() : null);
			row.setColLOS(EmergencyDisplayHelper.minutesToHoursAndMinutes(tracking.getLOS()));
			row.setColPriority(tracking.getTriageDetails() != null && tracking.getTriageDetails().getCurrentTriagePriority() != null ? tracking.getTriageDetails().getCurrentTriagePriority().getText() : null);
			row.setColArea(tracking.getCurrentArea() != null ? tracking.getCurrentArea().getAreaDisplayName() : null);
			row.setColProblem(tracking.getTriageDetails() != null && tracking.getTriageDetails().getMainPresentingProblem() != null ? tracking.getTriageDetails().getMainPresentingProblem().getPatientProblem() : null);
			row.setColAllocatedMedic(tracking.getSeenBy() != null && tracking.getSeenBy().getAllocatedMedic() != null ? tracking.getSeenBy().getAllocatedMedic().getIMosName() : null); //WDEV-16816
			
			// Set row value
			row.setValue(tracking);
		}
		//WDEV-18339
		setTotalsLabel();
	}

	/**
	 *	Function used to update
	 */
	public void updateControlsState()
	{
		boolean recordSelected = form.grdResults().getSelectedRow() != null && form.grdResults().getValue() != null;
		boolean recordInED = recordSelected && !Boolean.TRUE.equals(form.grdResults().getValue().getIsDischarged());
		
		form.btnViewPatientSummary().setEnabled(recordSelected);
		form.btnAssessmentDetails().setEnabled(recordSelected);
		
		form.btnSeenCompleteHCP().setEnabled(recordInED);//WDEV-16816
		form.btnReferSpecialty().setEnabled(recordInED);
		
		boolean filledInDischargeDate = form.dteDischargeFrom().getValue() != null || form.dteDischargeTo().getValue() != null;
		boolean filledInBedStatus = form.chkAwaitingBed().getValue() || form.chkBedAllocated().getValue();
		
		form.chkAwaitingBed().setEnabled(!filledInDischargeDate);
		form.chkBedAllocated().setEnabled(!filledInDischargeDate);
		
		form.grpDischargeStatus().setEnabled(grpDischargeStatusEnumeration.rdoCurrentlyED, !filledInDischargeDate);
		form.grpDischargeStatus().setEnabled(grpDischargeStatusEnumeration.rdoCurentDischarge, !filledInDischargeDate && !filledInBedStatus);
		form.grpDischargeStatus().setEnabled(grpDischargeStatusEnumeration.rdoDischargeOnly, !filledInBedStatus);
		
		//WDEV-17874
		form.btnViewResults().setVisible(form.getGlobalContext().Emergency.getTrackingAndAttendance_SearchCriteriaIsNotNull() && form.getGlobalContext().Emergency.getTrackingAndAttendance_SearchCriteria().getAwaitingReview());
		form.btnViewResults().setEnabled(recordSelected);
	}

	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Function used to manage search criteria
	//------------------------------------------------------------------------------------------------------------------------------------------------------------

	/**
	 *	Function used to clear search criteria
	 */
	private void clearSearchCriteria()
	{
		form.getGlobalContext().Emergency.setTrackingAndAttendance_SearchCriteria(null);
	}

	/**
	 *	Function used to clear the search criteria controls from screen
	 */
	private void clearSearchControls()
	{
		form.ccMedicSearch().clear();
		form.ccNurseSearch().clear();
		
		form.cmbSpecialty().setValue(null);
		form.cmbConsultantSpecialty().setValue(null);
		form.cmbPriority().setValue(null);
		
		form.chkBreachTriageKPI().setValue(null);
		
		form.txtSurname().setValue(null);
		form.txtAddress().setValue(null);
		
		form.dteAttendanceFrom().setValue(null);
		form.dteAttendanceTo().setValue(null);
		
		form.dteDischargeFrom().setValue(null);
		form.dteDischargeTo().setValue(null);
		
		form.dteTriageFrom().setValue(null);
		form.dteTriageTo().setValue(null);
		
		form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoCurrentlyED);
		
		form.chkAwaitingBed().setValue(false);
		form.chkBedAllocated().setValue(false);
		form.chkAwaitingReview().setValue(false);
		form.chkAttendanceNotCoded().setValue(null);
		
		//WDEV-15964
		form.cmbOutcome().setValue(null);
		form.cmbSourceOfReferral().setValue(null);
		form.intAttendanceId().setValue(null);
		form.cmbPresentingProblem().setValue(null);
	}

	/**
	 * Function used to populate
	 */
	private void populateSearchControls(TrackingAttendanceWorklist_SearchCriteriaVo searchCriteria)
	{
		// Clear search controls
		clearSearchControls();
		
		if (searchCriteria == null)
			return;
		
		// Populate each search control
		form.ccMedicSearch().setValue(searchCriteria.getMedic());
		form.ccNurseSearch().setValue(searchCriteria.getNurse());
		
		form.cmbSpecialty().setValue(searchCriteria.getSpecialty());
		form.cmbConsultantSpecialty().setValue(searchCriteria.getTeamSpecialty());
		form.cmbPriority().setValue(searchCriteria.getPriority());
		
		form.chkBreachTriageKPI().setValue(searchCriteria.getBreachedPriorityKPI());
		
		form.txtSurname().setValue(searchCriteria.getPatientSurname());
		form.txtAddress().setValue(searchCriteria.getAddressContains());
		
		form.dteAttendanceFrom().setValue(searchCriteria.getAttendanceFrom());
		form.dteAttendanceTo().setValue(searchCriteria.getAttendanceTo());
		
		form.dteDischargeFrom().setValue(searchCriteria.getDischargeFrom());
		form.dteDischargeTo().setValue(searchCriteria.getDischargeTo());
		
		form.dteTriageFrom().setValue(searchCriteria.getTriageFrom());
		form.dteTriageTo().setValue(searchCriteria.getTriageTo());
		
		//WDEV-15964
		form.cmbOutcome().setValue(searchCriteria.getOutcome());
		form.cmbSourceOfReferral().setValue(searchCriteria.getSourceOfReferral());
		form.intAttendanceId().setValue(searchCriteria.getAttendanceID());
		form.cmbPresentingProblem().setValue(searchCriteria.getPresentingProblem());

		setDischargeEDStatus(searchCriteria.getEDStatus());
		
		setBedAllocation(searchCriteria.getBedAllocation());
		
		form.chkAwaitingReview().setValue(searchCriteria.getAwaitingReview());
		form.chkAttendanceNotCoded().setValue(searchCriteria.getAttendanceNotCoded());
	}

	/**
	 * Function used to validate search criteria
	 */
	private String[] validateSearchCritieria()
	{
		ArrayList<String> errorList = new ArrayList<String>();
		
		if ((form.dteAttendanceFrom().getValue() != null && form.dteAttendanceTo().getValue() == null)
				|| (form.dteAttendanceFrom().getValue() == null && form.dteAttendanceTo().getValue() != null))
		{
			errorList.add("None or both Attendance Period dates must be filled in.");
		}
		
		if ((form.dteDischargeFrom().getValue() != null && form.dteDischargeTo().getValue() == null)
				|| (form.dteDischargeFrom().getValue() == null && form.dteDischargeTo().getValue() != null))
		{
			errorList.add("None or both Departure Period dates must be filled in.");//WDEV-17920
		}
		
		if ((form.dteTriageFrom().getValue() != null && form.dteTriageTo().getValue() == null)
				|| (form.dteTriageFrom().getValue() == null && form.dteTriageTo().getValue() != null))
		{
			errorList.add("None or both Triage Period dates must be filled in.");
		}
		
		if (form.dteAttendanceFrom().getValue() != null && form.dteAttendanceTo().getValue() != null && form.dteAttendanceFrom().getValue().isGreaterThan(form.dteAttendanceTo().getValue()))
		{
			errorList.add("Attendance Period from date is greater than To date.");
		}
		
		if (form.dteTriageFrom().getValue() != null && form.dteTriageTo().getValue() != null && form.dteTriageFrom().getValue().isGreaterThan(form.dteTriageTo().getValue()))
		{
			errorList.add("Triage Period from date is greater than To date.");
		}
		
		if (form.dteDischargeFrom().getValue() != null && form.dteDischargeTo().getValue() != null && form.dteDischargeFrom().getValue().isGreaterThan(form.dteDischargeTo().getValue()))
		{
			errorList.add("Departure Period from date is greater than To date.");//WDEV-17920
		}
		
		return errorList.toArray(new String[errorList.size()]);
	}

	/**
	 * Function used to save search criteria
	 */
	private void saveSearchCriteria()
	{
		// Create a new search criteria VO
		TrackingAttendanceWorklist_SearchCriteriaVo searchCriteria = new TrackingAttendanceWorklist_SearchCriteriaVo();
		
		// Populate search criteria with on screen values
		searchCriteria.setMedic((MedicVo) form.ccMedicSearch().getValue());
		searchCriteria.setNurse((NurseVo) form.ccNurseSearch().getValue());
		
		searchCriteria.setSpecialty(form.cmbSpecialty().getValue());
		searchCriteria.setTeamSpecialty(form.cmbConsultantSpecialty().getValue());
		searchCriteria.setPriority(form.cmbPriority().getValue());
		
		searchCriteria.setBreachedPriorityKPI(form.chkBreachTriageKPI().getValue());
		searchCriteria.setPatientSurname(form.txtSurname().getValue());
		searchCriteria.setAddressContains(form.txtAddress().getValue());
		
		searchCriteria.setAttendanceFrom(form.dteAttendanceFrom().getValue());
		searchCriteria.setAttendanceTo(form.dteAttendanceTo().getValue());
		searchCriteria.setTriageFrom(form.dteTriageFrom().getValue());
		searchCriteria.setTriageTo(form.dteTriageTo().getValue());
		searchCriteria.setDischargeFrom(form.dteDischargeFrom().getValue());
		searchCriteria.setDischargeTo(form.dteDischargeTo().getValue());
		
		searchCriteria.setEDStatus(getDischargeEDStatus());
		searchCriteria.setBedAllocation(getBedAllocationStatus());
		
		searchCriteria.setAwaitingReview(form.chkAwaitingReview().getValue());
		
		//WDEV-15964
		searchCriteria.setOutcome(form.cmbOutcome().getValue());
		searchCriteria.setSourceOfReferral(form.cmbSourceOfReferral().getValue());
		searchCriteria.setAttendanceID(form.intAttendanceId().getValue());
		searchCriteria.setPresentingProblem(form.cmbPresentingProblem().getValue());
		
		searchCriteria.setAttendanceNotCoded(form.chkAttendanceNotCoded().getValue());
		
		// Save search criteria to GC
		form.getGlobalContext().Emergency.setTrackingAndAttendance_SearchCriteria(searchCriteria);
	}
	
	class Tracking_TrackingAttendanceWorklistLOSComparator implements Comparator<Tracking_TrackingAttendanceWorklistVo>
	{
		private int order = 1;
		public Tracking_TrackingAttendanceWorklistLOSComparator()
		{
			order = 1;
		}
		public Tracking_TrackingAttendanceWorklistLOSComparator(SortOrder order)
		{
			this.order = SortOrder.DESCENDING.equals(order) ? -1 : 1;
		}
		public int compare(Tracking_TrackingAttendanceWorklistVo o1, Tracking_TrackingAttendanceWorklistVo o2)
		{
			if (o1 != null && o1.getLOSIsNotNull() && o2!=null && o2.getLOSIsNotNull())
			{
				return order*o1.getLOS().compareTo(o2.getLOS());
			}
			if (o1 == null || !o1.getLOSIsNotNull())
				return -1*order;
			if (o2 == null || !o2.getLOSIsNotNull())
				return order;
			
			return 0;
		}	
	}

	//wdev-17440
	protected void onCmbOutcomeValueChanged() throws PresentationLogicException 
	{
		if( form.cmbOutcome().getValue() != null )
		{
			form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoDischargeOnly);
			
			//WDEV-17592
			if (Boolean.TRUE.equals(form.chkAwaitingBed().getValue()))
			{
				form.chkAwaitingBed().setValue(Boolean.FALSE);
				onChkAwaitingBedValueChanged();
			}
			else if (Boolean.TRUE.equals(form.chkBedAllocated().getValue()))
			{
				form.chkBedAllocated().setValue(Boolean.FALSE);
				onChkBedAllocatedValueChanged();
			}
		}
		else 
		{
			form.grpDischargeStatus().setValue(grpDischargeStatusEnumeration.rdoCurrentlyED);
		}
			
		
	}

	//WDEV-17874
	@Override
	protected void onBtnViewResultsClick() throws PresentationLogicException
	{
		engine.open(form.getForms().Emergency.AttendanceResultListDialog);
	}
}