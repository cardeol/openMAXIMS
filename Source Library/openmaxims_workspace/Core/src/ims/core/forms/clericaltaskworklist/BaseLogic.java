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

package ims.core.forms.clericaltaskworklist;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.ClericalTaskWorklist.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.core.domain.ClericalTaskWorklist domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbCurrentStatusValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbCurrentStatus().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.ocrr.vo.lookups.PatientClericalTaskStatus existingInstance = (ims.ocrr.vo.lookups.PatientClericalTaskStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCurrentStatusLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.ocrr.vo.lookups.PatientClericalTaskStatus)
		{
			ims.ocrr.vo.lookups.PatientClericalTaskStatus instance = (ims.ocrr.vo.lookups.PatientClericalTaskStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCurrentStatusLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.ocrr.vo.lookups.PatientClericalTaskStatus existingInstance = (ims.ocrr.vo.lookups.PatientClericalTaskStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbCurrentStatus().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCurrentStatusLookup()
	{
		this.form.cmbCurrentStatus().clear();
		ims.ocrr.vo.lookups.PatientClericalTaskStatusCollection lookupCollection = ims.ocrr.vo.lookups.LookupHelper.getPatientClericalTaskStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbCurrentStatus().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCurrentStatusLookupValue(int id)
	{
		ims.ocrr.vo.lookups.PatientClericalTaskStatus instance = ims.ocrr.vo.lookups.LookupHelper.getPatientClericalTaskStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbCurrentStatus().setValue(instance);
	}
	protected final void defaultcmbCurrentStatusLookupValue()
	{
		this.form.cmbCurrentStatus().setValue((ims.ocrr.vo.lookups.PatientClericalTaskStatus)domain.getLookupService().getDefaultInstance(ims.ocrr.vo.lookups.PatientClericalTaskStatus.class, engine.getFormName().getID(), ims.ocrr.vo.lookups.PatientClericalTaskStatus.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.ClericalTaskWorklist domain;
}
