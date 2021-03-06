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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.65 build 3225.30788)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.core.forms.transportbooking;

import ims.RefMan.vo.TransportBookingDisplayVo;
import ims.RefMan.vo.TransportBookingShortVo;
import ims.RefMan.vo.TransportBookingShortVoCollection;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.forms.transportbooking.GenForm.ctnDetailsContainer.grdAppointmentsGridGrid;
import ims.core.forms.transportbooking.GenForm.ctnDetailsContainer.grdAppointmentsGridRow;
import ims.core.forms.transportbooking.GenForm.ctnDetailsContainer.grdAppointmentsGridRowCollection;
import ims.core.forms.transportbooking.GenForm.grdTransportGrid;
import ims.core.forms.transportbooking.GenForm.grdTransportRow;
import ims.core.vo.PatientTransportRequirementsVo;
import ims.core.vo.TransportBookingRefVo;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.Control;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import ims.scheduling.vo.Booking_AppointmentRefVoCollection;
import ims.scheduling.vo.Booking_AppointmentTransportVo;
import ims.scheduling.vo.Booking_AppointmentTransportVoCollection;


public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	
	//----------------------------------------------------------------------------------------------------
	//	Event handler functions
	//----------------------------------------------------------------------------------------------------

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		// Get the CareContext from parameter passed
		// If the parameter passed doesn't meet the requirements then throw PresentationLogicException
		//----
		if (args == null || args.length < 1)
			throw new PresentationLogicException("Error calling dialog - missing parameter. CareContextRefVo parameter expected");
		
		if (!(args[0] instanceof CareContextRefVo))
			throw new PresentationLogicException("Error calling dialog - invalld parameter. CareContextRefVo parameter expected");
		
		form.getLocalContext().setCareContext((CareContextRefVo) args[0]);
		
		//---
		
		
		initialize();
		open();
	}
	

	@Override
	protected void onFormModeChanged()
	{
		// Update instance controls state
		updateControlsState();
	}
	
	@Override
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// New instance
		newInstance();
	}

	/**
	 * 
	 */
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Update selected instance
		updateInstance();
	}

	/**
	 * 
	 */
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Refresh the screen after a successful save
		if (save())
			open();
	}

	/**
	 * 
	 */
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Refresh the screen
		open();
	}

	/**
	 * 
	 */
	@Override
	protected void onBtnCloseClick() throws PresentationLogicException
	{
		// Close the dialog
		engine.close(DialogResult.OK);
	}
	
	/**
	 * 
	 */
	@Override
	protected void onGrdTransportSelectionChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		// Fill details container
		setDetailsContainer(form.grdTransport().getValue());
		
		// Set selected VO
		form.getLocalContext().setselectedTransport(form.grdTransport().getValue());
		
		// Update instance controls state
		updateControlsState();
	}
	
	/**
	 * 
	 */
	@Override
	protected void onGrdTransportSelectionCleared() throws ims.framework.exceptions.PresentationLogicException
	{
		// Fill details container (with null)
		setDetailsContainer(form.grdTransport().getValue());
		
		// Set selection VO
		form.getLocalContext().setselectedTransport(form.grdTransport().getValue());
		
		// Update instance controls state
		updateControlsState();
	}
	
	/**
	 * 
	 */
	@Override
	protected void onGrdAppointmentsGridSelectionChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		// Update instance controls state
		updateControlsState();
	}

	/**
	 * 
	 */
	@Override
	protected void onGrdAppointmentsGridSelectionCleared() throws ims.framework.exceptions.PresentationLogicException
	{
		// Update instance controls state
		updateControlsState();
	}

	/**
	 * 
	 */
	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException
	{
		// Determine context-menu option chosen
		switch (menuItemID)
		{
			// New booking
			case GenForm.ContextMenus.RefManNamespace.TransportBooking.New:
				newInstance();
				break;
				
			// Edit a booking
			case GenForm.ContextMenus.RefManNamespace.TransportBooking.Edit:
				updateInstance();
				break;
		}
		
		// Update controls state
		updateControlsState();
	}

	
	//----------------------------------------------------------------------------------------------------
	//										Form Presentation Logic
	//----------------------------------------------------------------------------------------------------

	/**
	 *	Override initialize() function from BaseLogic.java
	 */
	public void initialize() throws FormOpenException
	{
		// Initialize local context
		form.getLocalContext().setselectedTransport(null);
		
		// Initialize context menus (No need for a function, this code is used only in this function)
		// Transports grid context menu
		form.getContextMenus().RefMan.getTransportBookingNewItem().setEnabled(true);
		form.getContextMenus().RefMan.getTransportBookingNewItem().setVisible(true);
		
		form.getContextMenus().RefMan.getTransportBookingEditItem().setEnabled(true);
		form.getContextMenus().RefMan.getTransportBookingEditItem().setVisible(true);
	}
	
	/**
	 * 
	 */
	public void open() throws PresentationLogicException
	{
		// Clear controls
		clearInstanceControls();
		
		// Get Patient Transport requirements for selected Care Context
		PatientTransportRequirementsVo transportRequirements = domain.getPatientTransportRequirements(form.getLocalContext().getCareContext());

		// Fill the data of transport requirements
		form.cmbTransportType().setValue(transportRequirements != null ? transportRequirements.getTransport() : null);
		form.txtSpecialRequirements().setValue(transportRequirements != null ? transportRequirements.getSpecialRequirements() : null);
		
		// Perform domain search
		TransportBookingShortVoCollection transports = domain.listTransportBooking(form.getLocalContext().getCareContext());

		// Show the search results
		setTransportGrid(form.grdTransport(), transports);
		
		// Reselect previously selected VO
		form.grdTransport().setValue(form.getLocalContext().getselectedTransport());
		setDetailsContainer(form.getLocalContext().getselectedTransport());
		
		// Set form to VIEW mode
		form.setMode(FormMode.VIEW);
	}

	/**
	 * 
	 */
	public void clearInstanceControls()
	{
		// Clear upper controls
		form.cmbTransportType().setValue(null);
		form.txtSpecialRequirements().setValue(null);
		form.grdTransport().getRows().clear();
		
		// Clear details container
		clearDetailsContainer();
	}

	/**
	 * 
	 */
	private void clearDetailsContainer()
	{
		// Clear details container
		form.ctnDetails().dteBookedDate().setValue(null);
		form.ctnDetails().txtBookingRef().setValue(null);
		form.ctnDetails().grdAppointmentsGrid().getRows().clear();
	}
	
	/**
	 * 
	 */
	public void updateControlsState()
	{
		// Update buttons state
		if (FormMode.VIEW.equals(form.getMode()))
		{
			form.btnEdit().setVisible(form.grdTransport().getValue() != null);
		}
		
		// Update context menu state
		updateContextMenuState();
	}

	/**
	 * 
	 */
	private void updateContextMenuState()
	{
		// Update context menu - Transport Booking
		form.getContextMenus().RefMan.getTransportBookingNewItem().setVisible(FormMode.VIEW.equals(form.getMode()));
		form.getContextMenus().RefMan.getTransportBookingEditItem().setVisible(form.grdTransport().getValue() != null && FormMode.VIEW.equals(form.getMode()));
	}

	
	//----------------------------------------------------------------------------------------------------
	//									Events functions and additional logic
	//----------------------------------------------------------------------------------------------------

	/**
	 * 
	 */
	private void setTransportGrid(grdTransportGrid grid, TransportBookingShortVoCollection transports)
	{
		// Check for grid (an error should never occur)
		if (grid == null)
			throw new CodingRuntimeException("MAJOR LOGICAL ERROR - No grid provided");
		
		// Clear the previous rows
		grid.getRows().clear();
		
		// Test data for null
		if (transports == null)
			return;
		
		// Add each VO to the grid
		for (int i = 0; i < transports.size(); i++)
		{
			TransportBookingShortVo transportBooking = transports.get(i);
			
			// Skip null VO
			if (transportBooking == null)
				continue;
			
			// Set grid row
			setTransportGridRow(grid.getRows().newRow(), transportBooking);
		}
	}

	/**
	 * 
	 * @param row
	 * @param transportBooking
	 */
	private void setTransportGridRow(grdTransportRow row, TransportBookingShortVo transportBooking)
	{
		// Check for row (an error should never occur)
		if (row == null)
			throw new CodingRuntimeException("MAJOR LOGICAL ERROR - No grid row provided");
		
		// Check for transport
		if (transportBooking == null)
			return;
		
		// Set up row display
		row.setcolBookingRef(transportBooking.getBookingReference());
		row.setcolBookedDate(transportBooking.getDateBooked());
		row.setcolBookedBy(transportBooking.getSysInfo() == null ? "" : transportBooking.getSysInfo().getLastupdateUser() == null ? transportBooking.getSysInfo().getCreationUser() : transportBooking.getSysInfo().getLastupdateUser());
		
		// Set up row value
		row.setValue(transportBooking);
	}

	/**
	 * 
	 * @param transport
	 */
	private void setDetailsContainer(TransportBookingRefVo transport)
	{
		// Clear container details
		clearDetailsContainer();
		
		// Check for passed value
		if (transport == null)
			return;
		
		// Populate with data
		populateScreenFromData(domain.getTransportBooking(transport));
	}

	/**
	 * 
	 * @param grid
	 * @param appointments
	 */
	private void setAppointments(grdAppointmentsGridGrid grid, Booking_AppointmentTransportVoCollection appointments, boolean clearPreviousAppointments)
	{
		// Check for grid (an error should never occur)
		if (grid == null)
			throw new CodingRuntimeException("MAJOR LOGICAL ERROR - No grid provided");
		
		// Clear the previous rows if required
		if (clearPreviousAppointments)
		{
			grid.getRows().clear();
		}
		
		// Test data for null
		if (appointments == null)
			return;
		
		// Add each VO to the grid
		for (int i = 0; i < appointments.size(); i++)
		{
			Booking_AppointmentTransportVo appointment = appointments.get(i);
			
			// Skip null VO
			if (appointment == null)
				continue;
			
			// Set grid row
			setAppointmentGridRow(grid.getRows().newRow(), appointment);
		}
	}

	/**
	 * 
	 * @param row
	 * @param appointment
	 */
	private void setAppointmentGridRow(grdAppointmentsGridRow row, Booking_AppointmentTransportVo appointment)
	{
		// Check for row (an error should never occur)
		if (row == null)
			throw new CodingRuntimeException("MAJOR LOGICAL ERROR - No grid row provided");
		
		// Check for appointment
		if (appointment == null)
			return;
		
		// Set up row display
		row.setcolDate(appointment.getAppointmentDate());
		row.setcolTime(appointment.getApptStartTime());
		row.setcolClinic(appointment.getSession() == null ? "" : appointment.getSession().getSchLocation() == null ? "" : appointment.getSession().getSchLocation().getName());
		row.setcolSelect(appointment.getIsTransportBooked() == null ? false : appointment.getIsTransportBooked());
		row.setcolProfileName(appointment.getSession() == null || appointment.getSession().getSch_Profile() == null ? "" : appointment.getSession().getSch_Profile().getName());
		// Keep original value for comparison reasons (hidden)
		row.setcolChanged(appointment.getIsTransportBooked() == null ? false : appointment.getIsTransportBooked());

		// Set up row value
		row.setValue(appointment);
	}


	public void newInstance() throws ims.framework.exceptions.PresentationLogicException
	{
		// Clear selection
		form.getLocalContext().setselectedTransport(null);
		form.grdTransport().setValue(null);
		
		// Clear container details
		clearDetailsContainer();
		
		// Set default date
		form.ctnDetails().dteBookedDate().setValue(new Date());
		
		// Get the appointments 
		Booking_AppointmentTransportVoCollection appointments = domain.listAppointments(form.getLocalContext().getCareContext());
		
		// Fill the appointments
		setAppointments(form.ctnDetails().grdAppointmentsGrid(), appointments, true);

		// Set form to EDIT mode
		form.setMode(FormMode.EDIT);
	}
	
	/**
	 * 
	 */
	public void updateInstance()
	{
		// Fill details container
		setDetailsContainer(form.grdTransport().getValue());
		
		// Get the appointments for current CATS Referral
		Booking_AppointmentTransportVoCollection appointments = domain.listAppointments(form.getLocalContext().getCareContext());
		
		// Add the appointments
		setAppointments(form.ctnDetails().grdAppointmentsGrid(), appointments, false);
		
		// Set form to EDIT mode
		form.setMode(FormMode.EDIT);
	}
	
	/**
	 * 
	 */
	public boolean save() throws PresentationLogicException
	{
		// Get VO data
		TransportBookingShortVo transportBooking = populateDataFromScreen(form.getLocalContext().getselectedTransport());
		Booking_AppointmentTransportVoCollection appointments = getUpdatedAppointments();
		
		// Check for data from screen (an error should never occur)
		if (transportBooking == null)
			throw new CodingRuntimeException("MAJOR LOGICAL ERROR - Can not validate or save a null VO");
		
		// Validate data
		String[] errors = transportBooking.validate();
		
		if (appointments != null)
		{
			errors = appointments.validate(errors);
		}
		
		if (errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		try
		{
			// Attempt domain save (will also update the appointments)
			form.getLocalContext().setselectedTransport(domain.saveTransportBooking(transportBooking, appointments));
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue(), "Error", MessageButtons.OK, MessageIcon.ERROR);
			return true;
		}

		return true;
	}
	
	
	//----------------------------------------------------------------------------------------------------
	//									Data binding functions
	//----------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param transport
	 */
	private void populateScreenFromData(TransportBookingDisplayVo transport)
	{
		// Check for data
		if (transport == null)
			return;
		
		// Fill date booked
		form.ctnDetails().dteBookedDate().setValue(transport.getDateBooked());
		
		// Fill Booking Reference
		form.ctnDetails().txtBookingRef().setValue(transport.getBookingReference());
		
		// Fill appointments grid
		setAppointments(form.ctnDetails().grdAppointmentsGrid(), transport.getAppointments(), true);
	}

	
	/**
	 * 
	 * @param transportBooking
	 * @return
	 */
	private TransportBookingShortVo populateDataFromScreen(TransportBookingShortVo transportBooking)
	{
		// Check for a valid TransportBookingVo - create one in case it is null
		if (transportBooking == null)
			transportBooking = new TransportBookingShortVo();
		
		// Retrieve basic data from screen
		transportBooking.setDateBooked(form.ctnDetails().dteBookedDate().getValue());
		transportBooking.setBookingReference(form.ctnDetails().txtBookingRef().getValue());
		
		// Set up CATS Referral
		transportBooking.setCareContext(form.getLocalContext().getCareContext());
		
		// Clear collection of recorded appointments
		if (transportBooking.getAppointmentsIsNotNull())
		{
			transportBooking.getAppointments().clear();
		}
		else
		{
			transportBooking.setAppointments(new Booking_AppointmentRefVoCollection());
		}
		
		// Retrieve appointments references
		grdAppointmentsGridRowCollection rows = form.ctnDetails().grdAppointmentsGrid().getRows();
		for (int i = 0; i < rows.size(); i++)
		{
			grdAppointmentsGridRow row = rows.get(i);
			
			// Skip invalid rows (null value - should not exist)
			if (row.getValue() == null)
				continue;
			
			if (row.getcolSelect())
				transportBooking.getAppointments().add(row.getValue());
		}
		
		// Return data
		return transportBooking;
	}

	/**
	 * 
	 * @return
	 */
	private Booking_AppointmentTransportVoCollection getUpdatedAppointments()
	{
		return getUpdatedAppointments(new Booking_AppointmentTransportVoCollection());
	}

	/**
	 * 
	 * @param appointments
	 * @return
	 */
	private Booking_AppointmentTransportVoCollection getUpdatedAppointments(Booking_AppointmentTransportVoCollection appointments)
	{
		// Check for a valid appointments collection
		if (appointments == null)
			appointments = new Booking_AppointmentTransportVoCollection();
		
		// Check for differences
		grdAppointmentsGridRowCollection rows = form.ctnDetails().grdAppointmentsGrid().getRows();
		for (int i = 0; i < rows.size(); i++)
		{
			grdAppointmentsGridRow row = rows.get(i);
			
			// Skip non value rows
			if (row.getValue() == null)
				continue;
			
			if (row.getcolSelect() != row.getcolChanged())
			{
				row.getValue().setIsTransportBooked(row.getcolSelect() == true ? Boolean.TRUE : null);
				appointments.add(row.getValue());
			}
		}
		
		// Return null if no appointments were modified
		if (appointments == null || appointments.size() <= 0)
			return null;
		
		return appointments;
	}
}
