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

package ims.clinical.forms.anaestheticsignindialog;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.clinical.domain.AnaestheticSignInDialog.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.clinical.domain.AnaestheticSignInDialog domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbAnaestheticTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctn1().cmbAnaestheticType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.AnaestheticType existingInstance = (ims.clinical.vo.lookups.AnaestheticType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbAnaestheticTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.AnaestheticType)
		{
			ims.clinical.vo.lookups.AnaestheticType instance = (ims.clinical.vo.lookups.AnaestheticType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbAnaestheticTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.AnaestheticType existingInstance = (ims.clinical.vo.lookups.AnaestheticType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctn1().cmbAnaestheticType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbAnaestheticTypeLookup()
	{
		this.form.ctn1().cmbAnaestheticType().clear();
		ims.clinical.vo.lookups.AnaestheticTypeCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getAnaestheticType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctn1().cmbAnaestheticType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbAnaestheticTypeLookupValue(int id)
	{
		ims.clinical.vo.lookups.AnaestheticType instance = ims.clinical.vo.lookups.LookupHelper.getAnaestheticTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctn1().cmbAnaestheticType().setValue(instance);
	}
	protected final void defaultcmbAnaestheticTypeLookupValue()
	{
		this.form.ctn1().cmbAnaestheticType().setValue((ims.clinical.vo.lookups.AnaestheticType)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.AnaestheticType.class, engine.getFormName().getID(), ims.clinical.vo.lookups.AnaestheticType.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.clinical.domain.AnaestheticSignInDialog domain;
}