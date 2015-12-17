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

package ims.admin.forms.casenotefoldertrackingconfiguration;

public abstract class BaseLogic extends Handlers
{
	private java.util.ArrayList lookupUsageErrors;

	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.admin.domain.CaseNoteFolderTrackingConfiguration.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.admin.domain.CaseNoteFolderTrackingConfiguration domain)
	{
		setContext(engine, form);
		this.domain = domain;
		if(domain.getLookupService().countLookupInstances(ims.core.vo.lookups.FolderCaseNoteCollection.class, ims.core.vo.lookups.FolderCaseNote.class, 1021317, false) == 0)
		{
			if(lookupUsageErrors == null)
				lookupUsageErrors = new java.util.ArrayList();
			lookupUsageErrors.add("The lookup type 'FolderCaseNote' (ID: 1021317) must have at least one instance configured.");
		}
	}
	public final String[] getLookupUsageErrors()
	{
		if(lookupUsageErrors == null)
			return null;
		String[] errors = new String[lookupUsageErrors.size()];
		for(int x = 0; x < lookupUsageErrors.size(); x++)
		{
			errors[x] = (String)lookupUsageErrors.get(x);
		}
		return errors;
	}
	protected final void oncmbDefaultFolderValValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbDefaultFolderVal().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.FolderCaseNote existingInstance = (ims.core.vo.lookups.FolderCaseNote)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDefaultFolderValLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.FolderCaseNote)
		{
			ims.core.vo.lookups.FolderCaseNote instance = (ims.core.vo.lookups.FolderCaseNote)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDefaultFolderValLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.FolderCaseNote existingInstance = (ims.core.vo.lookups.FolderCaseNote)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbDefaultFolderVal().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDefaultFolderValLookup()
	{
		this.form.cmbDefaultFolderVal().clear();
		ims.core.vo.lookups.FolderCaseNoteCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getFolderCaseNote(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbDefaultFolderVal().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDefaultFolderValLookupValue(int id)
	{
		ims.core.vo.lookups.FolderCaseNote instance = ims.core.vo.lookups.LookupHelper.getFolderCaseNoteInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbDefaultFolderVal().setValue(instance);
	}
	protected final void defaultcmbDefaultFolderValLookupValue()
	{
		this.form.cmbDefaultFolderVal().setValue((ims.core.vo.lookups.FolderCaseNote)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.FolderCaseNote.class, engine.getFormName().getID(), ims.core.vo.lookups.FolderCaseNote.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.admin.domain.CaseNoteFolderTrackingConfiguration domain;
}