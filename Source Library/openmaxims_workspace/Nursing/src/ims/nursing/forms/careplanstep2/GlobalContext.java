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

package ims.nursing.forms.careplanstep2;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		COE = new COEContext(context);
		Core = new CoreContext(context);
		Nursing = new NursingContext(context);
	}
	public final class COEContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private COEContext(ims.framework.Context context)
		{
			this.context = context;

			CarePlan = new CarePlanContext(context);
		}
		public final class CarePlanContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private CarePlanContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getTemplateListIsNotNull()
			{
				return !cx_COECarePlanTemplateList.getValueIsNull(context);
			}
			public ims.nursing.vo.CarePlanTemplateTitleCollection getTemplateList()
			{
				return (ims.nursing.vo.CarePlanTemplateTitleCollection)cx_COECarePlanTemplateList.getValue(context);
			}
		public void setTemplateList(ims.nursing.vo.CarePlanTemplateTitleCollection value)
		{
				cx_COECarePlanTemplateList.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_COECarePlanTemplateList = new ims.framework.ContextVariable("COE.CarePlan.TemplateList", "_cv_COE.CarePlan.TemplateList");
			public boolean getCarePlanTemplatesIsNotNull()
			{
				return !cx_COECarePlanCarePlanTemplates.getValueIsNull(context);
			}
			public ims.nursing.vo.CarePlanTemplateCollection getCarePlanTemplates()
			{
				return (ims.nursing.vo.CarePlanTemplateCollection)cx_COECarePlanCarePlanTemplates.getValue(context);
			}

			private ims.framework.ContextVariable cx_COECarePlanCarePlanTemplates = new ims.framework.ContextVariable("COE.CarePlan.CarePlanTemplates", "_cv_COE.CarePlan.CarePlanTemplates");
			public boolean getSearchCriteriaIsNotNull()
			{
				return !cx_COECarePlanSearchCriteria.getValueIsNull(context);
			}
			public String getSearchCriteria()
			{
				return (String)cx_COECarePlanSearchCriteria.getValue(context);
			}

			private ims.framework.ContextVariable cx_COECarePlanSearchCriteria = new ims.framework.ContextVariable("COE.CarePlan.SearchCriteria", "_cv_COE.CarePlan.SearchCriteria");
			public boolean getSearchToggleIsNotNull()
			{
				return !cx_COECarePlanSearchToggle.getValueIsNull(context);
			}
			public String getSearchToggle()
			{
				return (String)cx_COECarePlanSearchToggle.getValue(context);
			}

			private ims.framework.ContextVariable cx_COECarePlanSearchToggle = new ims.framework.ContextVariable("COE.CarePlan.SearchToggle", "_cv_COE.CarePlan.SearchToggle");
			private ims.framework.Context context;
		}

		public boolean getCarePlanTemplateTitleIsNotNull()
		{
			return !cx_COECarePlanTemplateTitle.getValueIsNull(context);
		}
		public ims.nursing.vo.CarePlanTemplateTitle getCarePlanTemplateTitle()
		{
			return (ims.nursing.vo.CarePlanTemplateTitle)cx_COECarePlanTemplateTitle.getValue(context);
		}
		public void setCarePlanTemplateTitle(ims.nursing.vo.CarePlanTemplateTitle value)
		{
			cx_COECarePlanTemplateTitle.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_COECarePlanTemplateTitle = new ims.framework.ContextVariable("COE.CarePlanTemplateTitle", "_cv_COE.CarePlanTemplateTitle");
		public boolean getCarePlanObjectiveIsNotNull()
		{
			return !cx_COECarePlanObjective.getValueIsNull(context);
		}
		public String getCarePlanObjective()
		{
			return (String)cx_COECarePlanObjective.getValue(context);
		}
		public void setCarePlanObjective(String value)
		{
			cx_COECarePlanObjective.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_COECarePlanObjective = new ims.framework.ContextVariable("COE.CarePlanObjective", "_cv_COE.CarePlanObjective");
		public boolean getCarePlanTitleIsNotNull()
		{
			return !cx_COECarePlanTitle.getValueIsNull(context);
		}
		public String getCarePlanTitle()
		{
			return (String)cx_COECarePlanTitle.getValue(context);
		}
		public void setCarePlanTitle(String value)
		{
			cx_COECarePlanTitle.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_COECarePlanTitle = new ims.framework.ContextVariable("COE.CarePlanTitle", "_cv_COE.CarePlanTitle");

		public CarePlanContext CarePlan;
		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}
		public void setCurrentCareContext(ims.core.vo.CareContextShortVo value)
		{
			cx_CoreCurrentCareContext.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");
		public boolean getYesNoDialogMessageIsNotNull()
		{
			return !cx_CoreYesNoDialogMessage.getValueIsNull(context);
		}
		public String getYesNoDialogMessage()
		{
			return (String)cx_CoreYesNoDialogMessage.getValue(context);
		}
		public void setYesNoDialogMessage(String value)
		{
			cx_CoreYesNoDialogMessage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreYesNoDialogMessage = new ims.framework.ContextVariable("Core.YesNoDialogMessage", "_cv_Core.YesNoDialogMessage");
		public boolean getCurrentClinicalContactIsNotNull()
		{
			return !cx_CoreCurrentClinicalContact.getValueIsNull(context);
		}
		public ims.core.vo.ClinicalContactShortVo getCurrentClinicalContact()
		{
			return (ims.core.vo.ClinicalContactShortVo)cx_CoreCurrentClinicalContact.getValue(context);
		}
		public void setCurrentClinicalContact(ims.core.vo.ClinicalContactShortVo value)
		{
			cx_CoreCurrentClinicalContact.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentClinicalContact = new ims.framework.ContextVariable("Core.CurrentClinicalContact", "_cvp_Core.CurrentClinicalContact");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}
	public final class NursingContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private NursingContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getAssessmentComponentIsNotNull()
		{
			return !cx_NursingAssessmentComponent.getValueIsNull(context);
		}
		public ims.nursing.vo.AssessmentComponent getAssessmentComponent()
		{
			return (ims.nursing.vo.AssessmentComponent)cx_NursingAssessmentComponent.getValue(context);
		}
		public void setAssessmentComponent(ims.nursing.vo.AssessmentComponent value)
		{
			cx_NursingAssessmentComponent.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_NursingAssessmentComponent = new ims.framework.ContextVariable("Nursing.AssessmentComponent", "_cv_Nursing.AssessmentComponent");
		public boolean getAssessmentHeaderInfoIsNotNull()
		{
			return !cx_NursingAssessmentHeaderInfo.getValueIsNull(context);
		}
		public ims.nursing.vo.AssessmentHeaderInfo getAssessmentHeaderInfo()
		{
			return (ims.nursing.vo.AssessmentHeaderInfo)cx_NursingAssessmentHeaderInfo.getValue(context);
		}
		public void setAssessmentHeaderInfo(ims.nursing.vo.AssessmentHeaderInfo value)
		{
			cx_NursingAssessmentHeaderInfo.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_NursingAssessmentHeaderInfo = new ims.framework.ContextVariable("Nursing.AssessmentHeaderInfo", "_cv_Nursing.AssessmentHeaderInfo");
		public boolean getCarePlanActionIsNotNull()
		{
			return !cx_NursingCarePlanAction.getValueIsNull(context);
		}
		public String getCarePlanAction()
		{
			return (String)cx_NursingCarePlanAction.getValue(context);
		}
		public void setCarePlanAction(String value)
		{
			cx_NursingCarePlanAction.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_NursingCarePlanAction = new ims.framework.ContextVariable("Nursing.CarePlanAction", "_cv_Nursing.CarePlanAction");

		private ims.framework.Context context;
	}

	public COEContext COE;
	public CoreContext Core;
	public NursingContext Nursing;
}
