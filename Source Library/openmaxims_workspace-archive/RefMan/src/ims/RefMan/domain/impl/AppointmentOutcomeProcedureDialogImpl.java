// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import java.util.List;

import ims.RefMan.domain.base.impl.BaseAppointmentOutcomeProcedureDialogImpl;
import ims.RefMan.vo.domain.CareContextForAppointmentOutcomeVoAssembler;
import ims.core.admin.domain.objects.CareContext;
import ims.domain.DomainFactory;

public class AppointmentOutcomeProcedureDialogImpl extends BaseAppointmentOutcomeProcedureDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ims.RefMan.vo.CareContextForAppointmentOutcomeVo getCareContext(ims.scheduling.vo.Booking_AppointmentRefVo bookAppt)
	{
		if(bookAppt == null || bookAppt.getID_Booking_Appointment() == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		String query = "select cats.careContext from CatsReferral as cats left join cats.appointments as appt where appt.id = :ApptId";
		
		List<?> careContextList = factory.find(query, new String[] {"ApptId"}, new Object[] {bookAppt.getID_Booking_Appointment()});
		
		if(careContextList != null && careContextList.size() > 0)
			return CareContextForAppointmentOutcomeVoAssembler.create((CareContext) careContextList.get(0));
		
		return null;
	}
}
