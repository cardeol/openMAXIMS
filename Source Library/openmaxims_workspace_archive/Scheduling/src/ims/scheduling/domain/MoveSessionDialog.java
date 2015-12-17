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

package ims.scheduling.domain;

// Generated from form domain impl
public interface MoveSessionDialog extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* moveSessionToDate - only return updated session if there is a staleobject
	*/
	public void moveSessionToDate(ims.scheduling.vo.SessionShortVo session, ims.framework.utils.Date toDate) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* getSession
	*/
	public ims.scheduling.vo.SessionShortVo getSession(ims.scheduling.vo.Sch_SessionRefVo session);

	// Generated from form domain interface definition
	/**
	* getBookedAppointmentIdsForSession
	*/
	public Integer[] getBookedAppointmentIdsForSession(ims.scheduling.vo.Sch_SessionRefVo session);

	// Generated from form domain interface definition
	/**
	* countNonCancelledAppointmentsForSession
	*/
	public Integer countNonCancelledAppointmentsForSession(ims.scheduling.vo.Sch_SessionRefVo session);
}