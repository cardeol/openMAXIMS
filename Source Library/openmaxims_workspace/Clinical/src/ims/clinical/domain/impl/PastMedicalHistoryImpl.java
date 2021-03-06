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
// This code was generated by Peter Martin using IMS Development Environment (version 1.51 build 2475.27538)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.clinical.domain.impl;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.clinical.domain.objects.PastMedicalHistory;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.PatientPastMedicalHistoryVo;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.enumerations.SortOrder;
import ims.core.vo.domain.PatientPastMedicalHistoryVoAssembler;
import ims.core.vo.HcpLiteVoCollection;
import ims.clinical.domain.base.impl.BasePastMedicalHistoryImpl;

public class PastMedicalHistoryImpl extends BasePastMedicalHistoryImpl
{
	private static final long	serialVersionUID	= 1L;

	
	/**
	* PMH for a Patient
	*/
	public PatientPastMedicalHistoryVo getPastMedicalHistory(PatientRefVo patient)
	{
		DomainFactory factory = getDomainFactory();
				
		PastMedicalHistory domPmh = PastMedicalHistory.getPastMedicalHistoryFromPatient(factory,patient.getID_Patient());
		
		
		PatientPastMedicalHistoryVo voPatientPastHistory = PatientPastMedicalHistoryVoAssembler.create(domPmh);
		if (voPatientPastHistory != null && voPatientPastHistory.getDiagnosisIsNotNull())
			voPatientPastHistory.getDiagnosis().sort(SortOrder.ASCENDING);
		if (voPatientPastHistory != null && voPatientPastHistory.getProcedureIsNotNull())
			voPatientPastHistory.getProcedure().sort(SortOrder.ASCENDING);
		return voPatientPastHistory;
	}

	public PatientPastMedicalHistoryVo savePMH(PatientPastMedicalHistoryVo voPMH) throws StaleObjectException, UniqueKeyViolationException
	{
		// Ensure the value object has been validated
		if (!voPMH.isValidated())
			throw new DomainRuntimeException("PMH has not been validated");
		
		DomainFactory factory = getDomainFactory();
		PastMedicalHistory doPMH = PatientPastMedicalHistoryVoAssembler.extractPastMedicalHistory(factory, voPMH);
		
		factory.save(doPMH);
		
		return PatientPastMedicalHistoryVoAssembler.create(doPMH);
	}

	public HcpLiteVoCollection listHCPs(String strHcpName)
	{
		HcpAdmin hcpAdmin = (HcpAdmin)getDomainImpl(HcpAdminImpl.class);
		return hcpAdmin.listHcpLiteByName(strHcpName);
	}


}
