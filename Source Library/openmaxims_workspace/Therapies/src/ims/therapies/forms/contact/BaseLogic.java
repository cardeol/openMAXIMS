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

package ims.therapies.forms.contact;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.therapies.domain.Contact.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.therapies.domain.Contact domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbSearchDisiplineValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrContact().tabContactSummary().cmbSearchDisipline().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.HcpDisType existingInstance = (ims.core.vo.lookups.HcpDisType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSearchDisiplineLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.HcpDisType)
		{
			ims.core.vo.lookups.HcpDisType instance = (ims.core.vo.lookups.HcpDisType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSearchDisiplineLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.HcpDisType existingInstance = (ims.core.vo.lookups.HcpDisType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrContact().tabContactSummary().cmbSearchDisipline().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSearchDisiplineLookup()
	{
		this.form.lyrContact().tabContactSummary().cmbSearchDisipline().clear();
		ims.core.vo.lookups.HcpDisTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getHcpDisType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrContact().tabContactSummary().cmbSearchDisipline().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSearchDisiplineLookupValue(int id)
	{
		ims.core.vo.lookups.HcpDisType instance = ims.core.vo.lookups.LookupHelper.getHcpDisTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrContact().tabContactSummary().cmbSearchDisipline().setValue(instance);
	}
	protected final void defaultcmbSearchDisiplineLookupValue()
	{
		this.form.lyrContact().tabContactSummary().cmbSearchDisipline().setValue((ims.core.vo.lookups.HcpDisType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.HcpDisType.class, engine.getFormName().getID(), ims.core.vo.lookups.HcpDisType.TYPE_ID));
	}
	protected final void oncmbConsentReasonValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrContact().tabContactDetails().cmbConsentReason().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.ConsentReason existingInstance = (ims.therapies.vo.lookups.ConsentReason)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbConsentReasonLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.therapies.vo.lookups.ConsentReason)
		{
			ims.therapies.vo.lookups.ConsentReason instance = (ims.therapies.vo.lookups.ConsentReason)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbConsentReasonLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.ConsentReason existingInstance = (ims.therapies.vo.lookups.ConsentReason)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrContact().tabContactDetails().cmbConsentReason().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbConsentReasonLookup()
	{
		this.form.lyrContact().tabContactDetails().cmbConsentReason().clear();
		ims.therapies.vo.lookups.ConsentReasonCollection lookupCollection = ims.therapies.vo.lookups.LookupHelper.getConsentReason(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrContact().tabContactDetails().cmbConsentReason().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbConsentReasonLookupValue(int id)
	{
		ims.therapies.vo.lookups.ConsentReason instance = ims.therapies.vo.lookups.LookupHelper.getConsentReasonInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrContact().tabContactDetails().cmbConsentReason().setValue(instance);
	}
	protected final void defaultcmbConsentReasonLookupValue()
	{
		this.form.lyrContact().tabContactDetails().cmbConsentReason().setValue((ims.therapies.vo.lookups.ConsentReason)domain.getLookupService().getDefaultInstance(ims.therapies.vo.lookups.ConsentReason.class, engine.getFormName().getID(), ims.therapies.vo.lookups.ConsentReason.TYPE_ID));
	}
	protected final void oncmbReferringProblemValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrContact().tabContactDetails().cmbReferringProblem().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.Caseload existingInstance = (ims.therapies.vo.lookups.Caseload)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReferringProblemLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.therapies.vo.lookups.Caseload)
		{
			ims.therapies.vo.lookups.Caseload instance = (ims.therapies.vo.lookups.Caseload)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReferringProblemLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.Caseload existingInstance = (ims.therapies.vo.lookups.Caseload)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrContact().tabContactDetails().cmbReferringProblem().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReferringProblemLookup()
	{
		this.form.lyrContact().tabContactDetails().cmbReferringProblem().clear();
		ims.therapies.vo.lookups.CaseloadCollection lookupCollection = ims.therapies.vo.lookups.LookupHelper.getCaseload(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrContact().tabContactDetails().cmbReferringProblem().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReferringProblemLookupValue(int id)
	{
		ims.therapies.vo.lookups.Caseload instance = ims.therapies.vo.lookups.LookupHelper.getCaseloadInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrContact().tabContactDetails().cmbReferringProblem().setValue(instance);
	}
	protected final void defaultcmbReferringProblemLookupValue()
	{
		this.form.lyrContact().tabContactDetails().cmbReferringProblem().setValue((ims.therapies.vo.lookups.Caseload)domain.getLookupService().getDefaultInstance(ims.therapies.vo.lookups.Caseload.class, engine.getFormName().getID(), ims.therapies.vo.lookups.Caseload.TYPE_ID));
	}
	protected final void oncmbCaseloadValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrContact().tabContactDetails().cmbCaseload().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.Caseload existingInstance = (ims.therapies.vo.lookups.Caseload)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCaseloadLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.therapies.vo.lookups.Caseload)
		{
			ims.therapies.vo.lookups.Caseload instance = (ims.therapies.vo.lookups.Caseload)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCaseloadLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.Caseload existingInstance = (ims.therapies.vo.lookups.Caseload)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrContact().tabContactDetails().cmbCaseload().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCaseloadLookup()
	{
		this.form.lyrContact().tabContactDetails().cmbCaseload().clear();
		ims.therapies.vo.lookups.CaseloadCollection lookupCollection = ims.therapies.vo.lookups.LookupHelper.getCaseload(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrContact().tabContactDetails().cmbCaseload().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCaseloadLookupValue(int id)
	{
		ims.therapies.vo.lookups.Caseload instance = ims.therapies.vo.lookups.LookupHelper.getCaseloadInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrContact().tabContactDetails().cmbCaseload().setValue(instance);
	}
	protected final void defaultcmbCaseloadLookupValue()
	{
		this.form.lyrContact().tabContactDetails().cmbCaseload().setValue((ims.therapies.vo.lookups.Caseload)domain.getLookupService().getDefaultInstance(ims.therapies.vo.lookups.Caseload.class, engine.getFormName().getID(), ims.therapies.vo.lookups.Caseload.TYPE_ID));
	}
	protected final void oncmbContactTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrContact().tabContactDetails().cmbContactType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.TherapiesContactType existingInstance = (ims.therapies.vo.lookups.TherapiesContactType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbContactTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.therapies.vo.lookups.TherapiesContactType)
		{
			ims.therapies.vo.lookups.TherapiesContactType instance = (ims.therapies.vo.lookups.TherapiesContactType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbContactTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.therapies.vo.lookups.TherapiesContactType existingInstance = (ims.therapies.vo.lookups.TherapiesContactType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrContact().tabContactDetails().cmbContactType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbContactTypeLookup()
	{
		this.form.lyrContact().tabContactDetails().cmbContactType().clear();
		ims.therapies.vo.lookups.TherapiesContactTypeCollection lookupCollection = ims.therapies.vo.lookups.LookupHelper.getTherapiesContactType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrContact().tabContactDetails().cmbContactType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbContactTypeLookupValue(int id)
	{
		ims.therapies.vo.lookups.TherapiesContactType instance = ims.therapies.vo.lookups.LookupHelper.getTherapiesContactTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrContact().tabContactDetails().cmbContactType().setValue(instance);
	}
	protected final void defaultcmbContactTypeLookupValue()
	{
		this.form.lyrContact().tabContactDetails().cmbContactType().setValue((ims.therapies.vo.lookups.TherapiesContactType)domain.getLookupService().getDefaultInstance(ims.therapies.vo.lookups.TherapiesContactType.class, engine.getFormName().getID(), ims.therapies.vo.lookups.TherapiesContactType.TYPE_ID));
	}
	protected final void oncmbDisciplineValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrContact().tabContactDetails().cmbDiscipline().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.HcpDisType existingInstance = (ims.core.vo.lookups.HcpDisType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDisciplineLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.HcpDisType)
		{
			ims.core.vo.lookups.HcpDisType instance = (ims.core.vo.lookups.HcpDisType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDisciplineLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.HcpDisType existingInstance = (ims.core.vo.lookups.HcpDisType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrContact().tabContactDetails().cmbDiscipline().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDisciplineLookup()
	{
		this.form.lyrContact().tabContactDetails().cmbDiscipline().clear();
		ims.core.vo.lookups.HcpDisTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getHcpDisType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrContact().tabContactDetails().cmbDiscipline().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDisciplineLookupValue(int id)
	{
		ims.core.vo.lookups.HcpDisType instance = ims.core.vo.lookups.LookupHelper.getHcpDisTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrContact().tabContactDetails().cmbDiscipline().setValue(instance);
	}
	protected final void defaultcmbDisciplineLookupValue()
	{
		this.form.lyrContact().tabContactDetails().cmbDiscipline().setValue((ims.core.vo.lookups.HcpDisType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.HcpDisType.class, engine.getFormName().getID(), ims.core.vo.lookups.HcpDisType.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.therapies.domain.Contact domain;
}
