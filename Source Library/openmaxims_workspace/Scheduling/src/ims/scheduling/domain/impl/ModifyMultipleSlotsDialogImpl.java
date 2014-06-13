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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.80 build 4198.17562)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.scheduling.domain.impl;

import ims.framework.exceptions.CodingRuntimeException;
import ims.scheduling.domain.base.impl.BaseModifyMultipleSlotsDialogImpl;
import ims.scheduling.vo.domain.SessionTheatreVoAssembler;

public class ModifyMultipleSlotsDialogImpl extends BaseModifyMultipleSlotsDialogImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* saveTheatreSession
	*/
	public void saveTheatreSession(ims.scheduling.vo.SessionTheatreVo voSession) throws ims.domain.exceptions.StaleObjectException
	{
		if (voSession == null)
			throw new CodingRuntimeException("voSession is null in method saveTheatreSession");
		
		getDomainFactory().save(SessionTheatreVoAssembler.extractSch_Session(getDomainFactory(), voSession));
	}
}