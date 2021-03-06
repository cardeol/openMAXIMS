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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4471.18200)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.pendingarrivals;

import ims.clinical.vo.lookups.DischargeLetterStatus;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.LocSiteLiteVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.forms.pendingarrivals.GenForm.grdResultsRow;
import ims.emergency.vo.EmergencyAttendanceForPendingArrivalsVo;
import ims.emergency.vo.EmergencyAttendanceForPendingArrivalsVoCollection;
import ims.emergency.vo.TrackingAttendanceStatusVo;
import ims.emergency.vo.TrackingForQuickRegistrationVo;
import ims.emergency.vo.lookups.TrackingStatus;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}

	private void open()
	{
		doSearch();
	}

	@Override
	protected void onBtnRemovePatientClick() throws ims.framework.exceptions.PresentationLogicException
	{
		EmergencyAttendanceForPendingArrivalsVo record = form.grdResults().getSelectedRow().getValue();
		if (record == null)
			return;

		// Check SOE on selection
		if (record.getID_EmergencyAttendanceIsNotNull() && domain.isStaleEmergencyAttendance(record))
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return;
		}

		String comment = "Patient Removed from Arrival List - DNA";
		
		try
		{
			domain.markAsRie(form.getLocalContext().getselectedRecord(), engine.getFormName(), form.getLocalContext().getselectedRecord().getPatient().getID_Patient(),  null, form.getLocalContext().getselectedRecord().getCareContext().getID_CareContext(), comment);
		}
		catch (StaleObjectException e)
		{
			e.printStackTrace();
		}
		
		doSearch();
	}

	@Override
	protected void onBtnArrivePatientClick() throws ims.framework.exceptions.PresentationLogicException
	{
		EmergencyAttendanceForPendingArrivalsVo record = form.grdResults().getSelectedRow().getValue();

		// Check SOE on selection
		if (record.getID_EmergencyAttendanceIsNotNull() && domain.isStaleEmergencyAttendance(record))
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return;
		}

		//WDEV-17413
		form.getGlobalContext().Core.setPatientShort(domain.getPatientShort(record.getPatient()));
		form.getGlobalContext().Core.setCurrentCareContext(domain.getCareContext(record.getCareContext()));//WDEV-17396
		
		Object mos = domain.getMosUser();
		if (mos == null)
		{
			engine.showMessage("Current User is not a Member of Staff!");
			return;
		}

		engine.open(form.getForms().Emergency.SendToAreaDialog, new Object[] {Boolean.FALSE}); //WDEV-17276
	}

	@Override
	protected void onGrdResultsSelectionChanged()
	{
		form.getLocalContext().setselectedRecord(form.grdResults().getSelectedRow().getValue());
		updateControlsState();
	}

	private void updateControlsState()
	{
		form.btnArrivePatient().setEnabled(form.grdResults().getValue() instanceof EmergencyAttendanceForPendingArrivalsVo);
		form.btnRemovePatient().setEnabled(form.grdResults().getValue() instanceof EmergencyAttendanceForPendingArrivalsVo);

	}

	@Override
	protected void onImbClearClick() throws PresentationLogicException
	{
		form.txtSurname().setValue(null);
		form.txtForename().setValue(null);
		form.cmbSourceOfReferral().setValue(null);

		form.grdResults().getRows().clear();
		form.grdResults().setValue(null);

		form.getGlobalContext().Core.setPatientShort(null);
		form.getGlobalContext().Core.setCurrentCareContext(null);	
		updateControlsState();
	}

	@Override
	protected void onImbSearchClick() throws PresentationLogicException
	{
		doSearch();	
	}
	
	private void doSearch()
	{
		form.grdResults().getRows().clear();
		form.grdResults().setValue(null);
		form.getLocalContext().setselectedRecord(null);
		
		updateControlsState();

		//latest changes 07/05/2012
		LocationLiteVo currentLocation = null;
		
		if (domain.getCurrentLocation() instanceof LocationLiteVo )
		{
			 currentLocation = (LocationLiteVo) domain.getCurrentLocation();
		}
		else if (domain.getCurrentLocation() instanceof LocSiteLiteVo)
		{
			LocSiteLiteVo locsite = (LocSiteLiteVo) domain.getCurrentLocation();
			if (locsite!=null)
			{
				currentLocation = new LocationLiteVo(locsite.getID_Location(), locsite.getVersion_Location());
			}
		}

		EmergencyAttendanceForPendingArrivalsVoCollection coll = domain.listPendingArrivals(currentLocation, form.txtSurname().getValue(), form.txtForename().getValue(), form.cmbSourceOfReferral().getValue());

		if (coll == null || coll.size() == 0)
		{
			engine.showMessage("There are no Records for the Search Criteria Provided");
			return;
		}

		populateScreenFromData(coll);
	}

	private void populateScreenFromData(EmergencyAttendanceForPendingArrivalsVoCollection coll)
	{
		if (coll == null)
			return;

		for (int i = 0; i < coll.size(); i++)
		{
			addRow(coll.get(i));
		}

	}

	private void addRow(EmergencyAttendanceForPendingArrivalsVo pendingArrival)
	{
		if (pendingArrival == null)
			return;

		grdResultsRow row = form.grdResults().getRows().newRow();

		row.setcolSurname(pendingArrival.getPatient().getName().getSurname());
		row.setcolForename(pendingArrival.getPatient().getName().getForename());
		row.setcolSourceOfReferral(pendingArrival.getEpisode().getSourceOfReferral().toString());
		row.setcolExpectedArrivalTime(pendingArrival.getArrivalDateTime()!=null ? pendingArrival.getArrivalDateTime().toString():"");
		row.setcolInjuryTime(pendingArrival.getEpisode()!=null && pendingArrival.getEpisode().getInjuryDateTime()!=null ? pendingArrival.getEpisode().getInjuryDateTime().toString():"");
		row.setcolComments(pendingArrival.getComments());
		row.setTooltipForcolComments(pendingArrival.getComments());
		row.setValue(pendingArrival);
	}

	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		if (formName.equals(form.getForms().Emergency.SendToAreaDialog) && result.equals(DialogResult.OK))
		{
			if (save())
			{
				open();
				engine.open(form.getForms().Core.PrintReport);//WDEV-17428
			}
		}

	}

	private boolean save()
	{
		TrackingForQuickRegistrationVo trackingToSave = populateDataFromScreen(form.getLocalContext().getselectedRecord());

		EmergencyAttendanceForPendingArrivalsVo emergencyAttendanceToSave = form.getLocalContext().getselectedRecord();
		
		DateTime dtt  = new DateTime();   //wdev-17462
		emergencyAttendanceToSave.setArrivalDateTime(dtt);
		emergencyAttendanceToSave.setRegistrationDateTime(dtt);
		
		emergencyAttendanceToSave.setExpectedArrivalDateTime(null);

		String[] errors = trackingToSave.validate();

		if (errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}

		String[] errors1 = emergencyAttendanceToSave.validate();

		if (errors1 != null && errors1.length > 0)
		{
			engine.showErrors(errors1);
			return false;
		}

		// Check SOE
		if (trackingToSave.getID_TrackingIsNotNull() && domain.isStale(trackingToSave))
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}

		try
		{
			form.getLocalContext().setselectedRecord(domain.save(trackingToSave, emergencyAttendanceToSave));
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}

		return true;
	}

	private TrackingForQuickRegistrationVo populateDataFromScreen(EmergencyAttendanceForPendingArrivalsVo selectedRecord)
	{
		TrackingForQuickRegistrationVo trackingToSave = new TrackingForQuickRegistrationVo();

		trackingToSave.setPatient(form.getGlobalContext().Core.getPatientShort());

		EmergencyAttendanceForPendingArrivalsVo emergencyAttendanceToSave = form.getLocalContext().getselectedRecord();
		trackingToSave.setAttendance(emergencyAttendanceToSave);
		trackingToSave.setEpisode(emergencyAttendanceToSave.getEpisode());

		LocationLiteVo currentLocation = (LocationLiteVo) domain.getCurrentLocation();
		trackingToSave.setEDLocation(currentLocation);

		trackingToSave.setCurrentArea(form.getGlobalContext().Emergency.getTrackingAreaForSendToAreaVo());

		TrackingAttendanceStatusVo trackingStatusToSave = populateTrackingAttendanceStatus(ims.emergency.vo.lookups.TrackingStatus.WAITING_TO_BE_TRIAGED);
		trackingToSave.setCurrentStatus(trackingStatusToSave);
		trackingToSave.setDischargeLetterStatus(DischargeLetterStatus.IN_PROGRESS);//wdev-17266
		
		return trackingToSave;
	}

	private TrackingAttendanceStatusVo populateTrackingAttendanceStatus(TrackingStatus status)
	{
		TrackingAttendanceStatusVo trackingAttStatus = new TrackingAttendanceStatusVo();

		EmergencyAttendanceForPendingArrivalsVo tempRecord = form.getLocalContext().getselectedRecord();

		trackingAttStatus.setPatient(form.getGlobalContext().Core.getPatientShort());
		trackingAttStatus.setEpisode(tempRecord.getEpisode().getEpisodeOfCare());
		trackingAttStatus.setAttendance(form.getGlobalContext().Core.getCurrentCareContext());
		trackingAttStatus.setTrackingArea(form.getGlobalContext().Emergency.getTrackingAreaForSendToAreaVo());

		trackingAttStatus.setStatusDatetime(new DateTime());

		Object mos = domain.getMosUser();
		if (mos instanceof MemberOfStaffLiteVo)
		{
			trackingAttStatus.setCreatedBy((MemberOfStaffLiteVo) mos);
		}

		trackingAttStatus.setStatus(status);
		trackingAttStatus.setPrevStatus(null); //WDEV-16777

		return trackingAttStatus;
	}

	
}
