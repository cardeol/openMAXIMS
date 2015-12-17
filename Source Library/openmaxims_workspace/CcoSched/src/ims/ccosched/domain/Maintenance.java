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

package ims.ccosched.domain;

// Generated from form domain impl
public interface Maintenance extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.dto.client.Sd_prfile listProfiles() throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* get or replicate Patient
	*/
	public ims.core.vo.Patient getPatient(ims.core.vo.PatientShort patient) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* String
	*/
	public ims.dto.client.Patient getPatient(String pkey) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* get ims.dto.client.Sd_appt 
	*/
	public ims.dto.client.Sd_appt getSd_appt(String appt_head_id) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* listSd_appt_dts
	*/
	public ims.dto.client.Sd_appt_dts listSd_appt_dts(String prfile_sess_id, String prfiled_sess_id, String appt_stat, String act_comp_flg) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* list ClinicDetails
	*/
	public ims.dto.client.Sd_clinicview listClinicDetails(String prfile_id, String sess_dt) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* list ClinicDetails
	*/
	public ims.dto.client.Sd_clinicview getClinicDetails(String prfile_sess_id) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* get Lookup Instance
	*/
	public ims.dto.client.Lkup getLookupInstance(String lkup_type) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* getForUpdate
	*/
	public ims.dto.client.Sd_appt getForUpdate(ims.dto.client.Sd_appt sd_appt) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* update
	*/
	public ims.dto.client.Sd_appt update(ims.dto.client.Sd_appt sd_appt) throws ims.domain.exceptions.DomainInterfaceException;
}