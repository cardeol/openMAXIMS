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

package ims.core.forms.nextofkingpidentifierscc;

public abstract class BaseLogic extends Handlers implements IComponent
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.NextOfKinGpIdentifiersCC.class;
	}
	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form, ims.core.domain.NextOfKinGpIdentifiersCC domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void setMode(ims.framework.enumerations.FormMode mode)
	{
		form.setMode(mode);
	}
	public ims.framework.enumerations.FormMode getMode()
	{
		return form.getMode();
	}
	protected final void oncmbPreferredContactMethodValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbPreferredContactMethod().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.ContactMethod existingInstance = (ims.core.vo.lookups.ContactMethod)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPreferredContactMethodLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.ContactMethod)
		{
			ims.core.vo.lookups.ContactMethod instance = (ims.core.vo.lookups.ContactMethod)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPreferredContactMethodLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.ContactMethod existingInstance = (ims.core.vo.lookups.ContactMethod)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbPreferredContactMethod().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPreferredContactMethodLookup()
	{
		this.form.cmbPreferredContactMethod().clear();
		ims.core.vo.lookups.ContactMethodCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getContactMethod(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbPreferredContactMethod().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPreferredContactMethodLookupValue(int id)
	{
		ims.core.vo.lookups.ContactMethod instance = ims.core.vo.lookups.LookupHelper.getContactMethodInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbPreferredContactMethod().setValue(instance);
	}
	protected final void defaultcmbPreferredContactMethodLookupValue()
	{
		this.form.cmbPreferredContactMethod().setValue((ims.core.vo.lookups.ContactMethod)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.ContactMethod.class, engine.getFormName().getID(), ims.core.vo.lookups.ContactMethod.TYPE_ID));
	}
	protected final void oncmbPreferredContactTimesValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbPreferredContactTimes().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PreferredContactTime existingInstance = (ims.core.vo.lookups.PreferredContactTime)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPreferredContactTimesLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PreferredContactTime)
		{
			ims.core.vo.lookups.PreferredContactTime instance = (ims.core.vo.lookups.PreferredContactTime)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPreferredContactTimesLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PreferredContactTime existingInstance = (ims.core.vo.lookups.PreferredContactTime)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbPreferredContactTimes().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPreferredContactTimesLookup()
	{
		this.form.cmbPreferredContactTimes().clear();
		ims.core.vo.lookups.PreferredContactTimeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPreferredContactTime(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbPreferredContactTimes().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPreferredContactTimesLookupValue(int id)
	{
		ims.core.vo.lookups.PreferredContactTime instance = ims.core.vo.lookups.LookupHelper.getPreferredContactTimeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbPreferredContactTimes().setValue(instance);
	}
	protected final void defaultcmbPreferredContactTimesLookupValue()
	{
		this.form.cmbPreferredContactTimes().setValue((ims.core.vo.lookups.PreferredContactTime)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PreferredContactTime.class, engine.getFormName().getID(), ims.core.vo.lookups.PreferredContactTime.TYPE_ID));
	}
	protected final void oncmbPreferedLanguageValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbPreferedLanguage().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PDSPreferredCommunicationLanguage existingInstance = (ims.core.vo.lookups.PDSPreferredCommunicationLanguage)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPreferedLanguageLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PDSPreferredCommunicationLanguage)
		{
			ims.core.vo.lookups.PDSPreferredCommunicationLanguage instance = (ims.core.vo.lookups.PDSPreferredCommunicationLanguage)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPreferedLanguageLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PDSPreferredCommunicationLanguage existingInstance = (ims.core.vo.lookups.PDSPreferredCommunicationLanguage)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbPreferedLanguage().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPreferedLanguageLookup()
	{
		this.form.cmbPreferedLanguage().clear();
		ims.core.vo.lookups.PDSPreferredCommunicationLanguageCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPDSPreferredCommunicationLanguage(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbPreferedLanguage().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPreferedLanguageLookupValue(int id)
	{
		ims.core.vo.lookups.PDSPreferredCommunicationLanguage instance = ims.core.vo.lookups.LookupHelper.getPDSPreferredCommunicationLanguageInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbPreferedLanguage().setValue(instance);
	}
	protected final void defaultcmbPreferedLanguageLookupValue()
	{
		this.form.cmbPreferedLanguage().setValue((ims.core.vo.lookups.PDSPreferredCommunicationLanguage)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PDSPreferredCommunicationLanguage.class, engine.getFormName().getID(), ims.core.vo.lookups.PDSPreferredCommunicationLanguage.TYPE_ID));
	}
	protected final void bindgrdCommChannelscolTypeLookup()
	{
		this.form.grdCommChannels().colTypeComboBox().clear();
		ims.core.vo.lookups.ChannelTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getChannelType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdCommChannels().colTypeComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.NextOfKinGpIdentifiersCC domain;
}