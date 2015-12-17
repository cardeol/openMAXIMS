// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain;

// Generated from form domain impl
public interface ClinicalOutcomeConfig extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.clinicaladmin.vo.ClinicalOutcomeConfigDisplayVoCollection listClinicalOutcomes(ims.clinical.configuration.vo.ClinicalOutcomeConfigRefVo selectedRecord, ims.clinical.vo.lookups.ClinicalOutcomeCategory category, ims.core.vo.lookups.Specialty specialty, String clinicalOutcome, String code, Boolean activeOnly);

	// Generated from form domain interface definition
	public ims.clinicaladmin.vo.ClinicalOutcomeConfigVo getClinicalOutcome(ims.clinical.configuration.vo.ClinicalOutcomeConfigRefVo clinicalOutcome);

	// Generated from form domain interface definition
	public ims.clinicaladmin.vo.ClinicalOutcomeConfigVo saveClinicalOutcome(ims.clinicaladmin.vo.ClinicalOutcomeConfigVo clinicalOutcome) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException;
}