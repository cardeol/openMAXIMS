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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.rules.forms.ruleseditorcomponent;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Rules = new RulesContext(context);
	}
	public final class RulesContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RulesContext(ims.framework.Context context)
		{
			this.context = context;

			RulesCodePreview = new RulesCodePreviewContext(context);
			RuleEditorComponent = new RuleEditorComponentContext(context);
		}
		public final class RulesCodePreviewContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private RulesCodePreviewContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getXmlRuleIsNotNull()
			{
				return !cx_RulesRulesCodePreviewXmlRule.getValueIsNull(context);
			}
			public String getXmlRule()
			{
				return (String)cx_RulesRulesCodePreviewXmlRule.getValue(context);
			}
		public void setXmlRule(String value)
		{
				cx_RulesRulesCodePreviewXmlRule.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_RulesRulesCodePreviewXmlRule = new ims.framework.ContextVariable("Rules.RulesCodePreview.XmlRule", "_cv_Rules.RulesCodePreview.XmlRule");
			private ims.framework.Context context;
		}
		public final class RuleEditorComponentContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private RuleEditorComponentContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getFormModeIsNotNull()
			{
				return !cx_RulesRuleEditorComponentFormMode.getValueIsNull(context);
			}
			public ims.rules.vo.enums.RulesEditorComponentFormAction getFormMode()
			{
				return (ims.rules.vo.enums.RulesEditorComponentFormAction)cx_RulesRuleEditorComponentFormMode.getValue(context);
			}
		public void setFormMode(ims.rules.vo.enums.RulesEditorComponentFormAction value)
		{
				cx_RulesRuleEditorComponentFormMode.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_RulesRuleEditorComponentFormMode = new ims.framework.ContextVariable("Rules.RuleEditorComponent.FormMode", "_cv_Rules.RuleEditorComponent.FormMode");
			private ims.framework.Context context;
		}

		public boolean getRuleToEditIsNotNull()
		{
			return !cx_RulesRuleToEdit.getValueIsNull(context);
		}
		public ims.admin.vo.BusinessRuleVo getRuleToEdit()
		{
			return (ims.admin.vo.BusinessRuleVo)cx_RulesRuleToEdit.getValue(context);
		}
		public void setRuleToEdit(ims.admin.vo.BusinessRuleVo value)
		{
			cx_RulesRuleToEdit.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RulesRuleToEdit = new ims.framework.ContextVariable("Rules.RuleToEdit", "_cv_Rules.RuleToEdit");
		public boolean getRuleEntitiesIsNotNull()
		{
			return !cx_RulesRuleEntities.getValueIsNull(context);
		}
		public java.util.List getRuleEntities()
		{
			return (java.util.List)cx_RulesRuleEntities.getValue(context);
		}
		public void setRuleEntities(java.util.List value)
		{
			cx_RulesRuleEntities.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RulesRuleEntities = new ims.framework.ContextVariable("Rules.RuleEntities", "_cv_Rules.RuleEntities");

		public RulesCodePreviewContext RulesCodePreview;
		public RuleEditorComponentContext RuleEditorComponent;
		private ims.framework.Context context;
	}

	public RulesContext Rules;
}