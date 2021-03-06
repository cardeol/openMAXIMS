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
// This code was generated by Neil McAnaspie using IMS Development Environment (version 1.35 build 2103.16649)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.correspondence.domain.impl;

import java.util.List;

import ims.admin.vo.domain.ReportTemplateVoAssembler;
import ims.core.admin.vo.TemplateBoRefVo;
import ims.correspondence.configuration.domain.objects.TemplateCategory;
import ims.correspondence.vo.TemplateCategoryVo;
import ims.correspondence.vo.domain.TemplateCategoryVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.domain.impl.DomainImpl;
import ims.framework.exceptions.CodingRuntimeException;

public class CorrespondenceHeadersAdminImpl extends DomainImpl implements ims.correspondence.domain.CorrespondenceHeadersAdmin, ims.domain.impl.Transactional
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ims.admin.vo.ReportTemplateVoCollection listTemplates(Boolean activeOnly)
	{
		DomainFactory factory = getDomainFactory();
		
		List templates  = factory.find("from TemplateBo");
	
		return ReportTemplateVoAssembler.createReportTemplateVoCollectionFromTemplateBo(templates).sort();

	}

	public TemplateCategoryVo getTemplateCategories(TemplateBoRefVo template) 
	{
		if (template == null)
			throw new CodingRuntimeException("Invalid Argument: TemplateBoRefVo is null");
		DomainFactory factory = getDomainFactory();
		TemplateCategory doTemplateCategory = TemplateCategory.getTemplateCategoryFromTemplate(factory, template.getID_TemplateBo());
		return TemplateCategoryVoAssembler.create(doTemplateCategory);
		
		

	}

	public ims.correspondence.vo.TemplateCategoryVo saveTemplateCategories(ims.correspondence.vo.TemplateCategoryVo voTemplateCategory) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException 
	{
		if (voTemplateCategory == null)
			throw new CodingRuntimeException("Invalid Argument: Template Category is null");
		if (!voTemplateCategory.isValidated())
			throw new DomainRuntimeException("TemplateCategoryVo not validated.");
		
		DomainFactory factory = getDomainFactory();
		
		
		TemplateCategory domTemplCategory = TemplateCategoryVoAssembler.extractTemplateCategory(factory, voTemplateCategory);
	
		try
		{
			factory.save(domTemplCategory);
		}
		catch (UnqViolationUncheckedException ue)
		{
			throw new UniqueKeyViolationException(ue.getMessage());
		}
		
		return TemplateCategoryVoAssembler.create(domTemplCategory);

		
	}


}
