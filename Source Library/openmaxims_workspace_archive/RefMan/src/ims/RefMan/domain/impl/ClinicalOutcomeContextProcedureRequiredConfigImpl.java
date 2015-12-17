// This code was generated by Calin Perebiceanu using IMS Development Environment (version 1.80 build 4198.17562)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import ims.RefMan.domain.base.impl.BaseClinicalOutcomeContextProcedureRequiredConfigImpl;
import ims.RefMan.domain.objects.ClinicalOutcomeContextProcedureRequiredConfig;
import ims.RefMan.vo.ClinicalOutcomeContextProcedureRequiredConfigVo;
import ims.RefMan.vo.domain.ClinicalOutcomeContextProcedureRequiredConfigVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;

public class ClinicalOutcomeContextProcedureRequiredConfigImpl extends BaseClinicalOutcomeContextProcedureRequiredConfigImpl
{

	private static final long serialVersionUID = 1L;

	public ims.RefMan.vo.ClinicalOutcomeContextProcedureRequiredConfigVoCollection list()
	{
		String query = "select outcome from ClinicalOutcomeContextProcedureRequiredConfig as outcome where outcome.isRIE is null";
		
		return ClinicalOutcomeContextProcedureRequiredConfigVoAssembler.createClinicalOutcomeContextProcedureRequiredConfigVoCollectionFromClinicalOutcomeContextProcedureRequiredConfig(getDomainFactory().find(query));
	}

	public void save(ims.RefMan.vo.ClinicalOutcomeContextProcedureRequiredConfigVoCollection records) throws ims.domain.exceptions.StaleObjectException
	{

		// Check for valid record
		if (records == null)
			throw new DomainRuntimeException("Can not save null record");

		// Check record for validation
		if (!records.isValidated())
			throw new DomainRuntimeException("Can not save record not validated");

		// Get domain factory
		DomainFactory factory = getDomainFactory();

		// Extract ICP domain object
		for (ClinicalOutcomeContextProcedureRequiredConfigVo outcomeConfigVo : records)
		{
			ClinicalOutcomeContextProcedureRequiredConfig domainOutcome = ClinicalOutcomeContextProcedureRequiredConfigVoAssembler.extractClinicalOutcomeContextProcedureRequiredConfig(factory, outcomeConfigVo);

			// Save domain object
			factory.save(domainOutcome);
		}

		
	}
}