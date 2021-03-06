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

package ims.RefMan.domain;

// Generated from form domain impl
public interface ViewPatientCodingRecords extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.RefMan.vo.ReferralCodingForViewVoCollection getReferralCodings(ims.core.patient.vo.PatientRefVo patientRef, ims.RefMan.vo.ReferralCodingVo refCodingToBeExcluded);

	// Generated from form domain interface definition
	public ims.core.vo.PatientShort getPatientByCatsRef(ims.RefMan.vo.CatsReferralRefVo catsRef);

	// Generated from form domain interface definition
	public ims.RefMan.vo.ReferralCodingForViewVo getReferralCoding(ims.RefMan.vo.ReferralCodingRefVo referralCodingRef);

	// Generated from form domain interface definition
	public ims.core.vo.DiagnosisVo getDiagnosisWithTaxonomyMappings(ims.core.clinical.vo.DiagnosisRefVo diagRefVo);

	// Generated from form domain interface definition
	public ims.core.vo.ProcedureVo getProcedureWithTaxonomyMappings(ims.core.clinical.vo.ProcedureRefVo procRefVo);

	// Generated from form domain interface definition
	public ims.ocrr.vo.InvestigationIndexVo getInvestigationWithTaxonomyMappings(ims.ocrr.configuration.vo.InvestigationIndexRefVo investigationRef);

	// Generated from form domain interface definition
	public ims.core.vo.DischargedEpisodeForReferralCodingViewVo getDischargedEpisodeByPasEvent(ims.core.admin.pas.vo.PASEventRefVo pasEventRef);
}
