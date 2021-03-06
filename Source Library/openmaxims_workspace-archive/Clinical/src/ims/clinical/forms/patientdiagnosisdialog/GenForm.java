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

package ims.clinical.forms.patientdiagnosisdialog;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	public boolean canProvideData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).canProvideData();
	}
	public boolean hasData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).hasData();
	}
	public IReportField[] getData(IReportSeed[] reportSeeds)
	{
		return getData(reportSeeds, false);
	}
	public IReportField[] getData(IReportSeed[] reportSeeds, boolean excludeNulls)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields(), excludeNulls).getData();
	}

	public static class grpFilterRadioButton extends RadioButtonBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected void setContext(Integer startTabIndex, ims.framework.utils.SizeInfo designSize, ims.framework.utils.SizeInfo runtimeSize)
		{
			if(startTabIndex == null)
				throw new RuntimeException("Invalid startTabIndex ");
			RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 199, 40, 88, 16, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
			control.addButton(0, anchoringHelper1.getX(), anchoringHelper1.getY(), anchoringHelper1.getWidth(), "All Diagnoses", startTabIndex.intValue() + 2);
			RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 79, 40, 104, 16, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
			control.addButton(1, anchoringHelper2.getX(), anchoringHelper2.getY(), anchoringHelper2.getWidth(), "Specialty Hotlist", startTabIndex.intValue() + 1);
		}
		public void setText(grpFilterEnumeration option, String value)
		{
			if(option != null && option.id >= 0 && value != null)
				control.setText(option.id, value);
		}
		public grpFilterEnumeration getValue()
		{
			switch (super.control.getValue())
			{
				case -1: return grpFilterEnumeration.None;
				case 0: return grpFilterEnumeration.rdoAll;
				case 1: return grpFilterEnumeration.rdoSpecialty;
			}
			return null;
		}
		public void setValue(grpFilterEnumeration value)
		{
			if(value != null)
				super.control.setValue(value.id);
			else
				super.control.setValue(grpFilterEnumeration.None.id);
		}
		public boolean isEnabled(grpFilterEnumeration option)
		{
			return super.control.isEnabled(option.id);
		}
		public void setEnabled(grpFilterEnumeration option, boolean value)
		{
			super.control.setEnabled(option.id, value);
		}
		public boolean isVisible(grpFilterEnumeration option)
		{
			return super.control.isVisible(option.id);
		}
		public void setVisible(grpFilterEnumeration option, boolean value)
		{
			super.control.setVisible(option.id, value);
		}
		public void setVisible(boolean value)
		{
			super.control.setVisible(value);
		}
		public void setEnabled(boolean value)
		{
			super.control.setEnabled(value);
		}
	}
	public static class grpFilterEnumeration implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		public static grpFilterEnumeration None = new grpFilterEnumeration(-1);
		public static grpFilterEnumeration rdoAll = new grpFilterEnumeration(0);
		public static grpFilterEnumeration rdoSpecialty = new grpFilterEnumeration(1);
		private grpFilterEnumeration(int id)
		{
			this.id = id;
		}
		public boolean equals(Object o)
		{
			return this.id == ((grpFilterEnumeration)o).id;
		}
		private int id;
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
		if(!context.isValidContextType(ims.core.vo.EpisodeofCareShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.EpisodeofCareShortVo' of the global context variable 'Core.EpisodeofCareShort' is not supported.");
		if(!context.isValidContextType(ims.core.vo.CareContextShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.CareContextShortVo' of the global context variable 'Core.CurrentCareContext' is not supported.");
	}
	private void validateMandatoryContext(Context context)
	{
		if(new ims.framework.ContextVariable("Core.EpisodeofCareShort", "_cvp_Core.EpisodeofCareShort").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'Core.EpisodeofCareShort' is not available.");
	}
	public boolean supportsRecordedInError()
	{
		return false;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return null;
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context) throws Exception
	{
		setContext(loader, form, appForm, factory, context, Boolean.FALSE, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context, Boolean skipContextValidation) throws Exception
	{
		setContext(loader, form, appForm, factory, context, skipContextValidation, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, ims.framework.Context context, Boolean skipContextValidation, Integer startControlID, ims.framework.utils.SizeInfo runtimeSize, ims.framework.Control control, Integer startTabIndex) throws Exception
	{
		if(loader == null); // this is to avoid eclipse warning only.
		if(factory == null); // this is to avoid eclipse warning only.
		if(runtimeSize == null); // this is to avoid eclipse warning only.
		if(appForm == null)
			throw new RuntimeException("Invalid application form");
		if(startControlID == null)
			throw new RuntimeException("Invalid startControlID");
		if(control == null); // this is to avoid eclipse warning only.
		if(startTabIndex == null)
			throw new RuntimeException("Invalid startTabIndex");
		this.context = context;
		this.componentIdentifier = startControlID.toString();
		this.formInfo = form.getFormInfo();
		this.globalContext = new GlobalContext(context);
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
			validateMandatoryContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(808, 232);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setFormReferences(FormReferencesFlyweightFactory.getInstance().create(Forms.class));
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));


		// Panel Controls
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 8, 0, 792, 32, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		super.addControl(factory.getControl(Panel.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT,"Diagnosis", new Integer(1), ""}));

		// Custom Controls
		ims.framework.CustomComponent instance1 = factory.getEmptyCustomComponent();
		RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 360, 136, 440, 56, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT);
		ims.framework.FormUiLogic m_ccAuthInfoForm = loader.loadComponent(102228, appForm, startControlID * 10 + 1000, anchoringHelper4.getSize(), instance1, startTabIndex.intValue() + 1005, skipContextValidation);
		//ims.framework.Control m_ccAuthInfoControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1001), new Integer(360), new Integer(136), new Integer(440), new Integer(56), ControlState.DISABLED, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT, new Integer(startTabIndex.intValue() + 1005), m_ccAuthInfoForm, instance1 } );
		ims.framework.Control m_ccAuthInfoControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1002),  new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), ControlState.DISABLED, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT, new Integer(startTabIndex.intValue() + 1005), m_ccAuthInfoForm, instance1, Boolean.FALSE } );
		super.addControl(m_ccAuthInfoControl);
		Menu[] menus1 = m_ccAuthInfoForm.getForm().getRegisteredMenus();
		for(int x = 0; x < menus1.length; x++)
		{
			form.registerMenu(menus1[x]);
		}
		ims.framework.CustomComponent instance2 = factory.getEmptyCustomComponent();
		RuntimeAnchoring anchoringHelper5 = new RuntimeAnchoring(designSize, runtimeSize, 16, 64, 784, 64, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		ims.framework.FormUiLogic m_ccDiagnosisForm = loader.loadComponent(123133, appForm, startControlID * 10 + 2000, anchoringHelper5.getSize(), instance2, startTabIndex.intValue() + 3, skipContextValidation);
		//ims.framework.Control m_ccDiagnosisControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1003), new Integer(16), new Integer(64), new Integer(784), new Integer(64), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT, new Integer(startTabIndex.intValue() + 3), m_ccDiagnosisForm, instance2 } );
		ims.framework.Control m_ccDiagnosisControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1004),  new Integer(anchoringHelper5.getX()), new Integer(anchoringHelper5.getY()), new Integer(anchoringHelper5.getWidth()), new Integer(anchoringHelper5.getHeight()), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT, new Integer(startTabIndex.intValue() + 3), m_ccDiagnosisForm, instance2, Boolean.FALSE } );
		super.addControl(m_ccDiagnosisControl);
		Menu[] menus2 = m_ccDiagnosisForm.getForm().getRegisteredMenus();
		for(int x = 0; x < menus2.length; x++)
		{
			form.registerMenu(menus2[x]);
		}

		// Label Controls
		RuntimeAnchoring anchoringHelper6 = new RuntimeAnchoring(designSize, runtimeSize, 23, 137, 53, 17, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1005), new Integer(anchoringHelper6.getX()), new Integer(anchoringHelper6.getY()), new Integer(anchoringHelper6.getWidth()), new Integer(anchoringHelper6.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "Primary:", new Integer(1), null, new Integer(0)}));
		RuntimeAnchoring anchoringHelper7 = new RuntimeAnchoring(designSize, runtimeSize, 23, 40, 41, 17, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1006), new Integer(anchoringHelper7.getX()), new Integer(anchoringHelper7.getY()), new Integer(anchoringHelper7.getWidth()), new Integer(anchoringHelper7.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, "Filter: ", new Integer(1), null, new Integer(0)}));

		// Button Controls
		RuntimeAnchoring anchoringHelper8 = new RuntimeAnchoring(designSize, runtimeSize, 624, 200, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1007), new Integer(anchoringHelper8.getX()), new Integer(anchoringHelper8.getY()), new Integer(anchoringHelper8.getWidth()), new Integer(anchoringHelper8.getHeight()), new Integer(startTabIndex.intValue() + 2007), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Save", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper9 = new RuntimeAnchoring(designSize, runtimeSize, 704, 200, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1008), new Integer(anchoringHelper9.getX()), new Integer(anchoringHelper9.getY()), new Integer(anchoringHelper9.getWidth()), new Integer(anchoringHelper9.getHeight()), new Integer(startTabIndex.intValue() + 2009), ControlState.ENABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Cancel", Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// CheckBox Controls
		RuntimeAnchoring anchoringHelper10 = new RuntimeAnchoring(designSize, runtimeSize, 127, 137, 16, 16, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(CheckBox.class, new Object[] { control, new Integer(startControlID.intValue() + 1009), new Integer(anchoringHelper10.getX()), new Integer(anchoringHelper10.getY()), new Integer(anchoringHelper10.getWidth()), new Integer(anchoringHelper10.getHeight()), new Integer(startTabIndex.intValue() + 1004), ControlState.UNKNOWN, ControlState.UNKNOWN,ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT ,"", Boolean.FALSE, null}));

		// RadioButton Controls
		RadioButton tmpgrpFilter = (RadioButton)factory.getControl(RadioButton.class, new Object[] { control, new Integer(startControlID.intValue() + 1010), new Integer(0), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.TOPLEFT,Boolean.TRUE});
		super.addControl(tmpgrpFilter);
		grpFilterRadioButton grpFilter = (grpFilterRadioButton)RadioButtonBridgeFlyweightFactory.getInstance().createRadioButtonBridge(grpFilterRadioButton.class, tmpgrpFilter);
		grpFilter.setContext(startTabIndex, designSize, runtimeSize);
		super.addRadioButton(grpFilter);
	}



	public Forms getForms()
	{
		return (Forms)super.getFormReferences();
	}
	public ims.core.forms.authoringinfo.IComponent ccAuthInfo()
	{
		return (ims.core.forms.authoringinfo.IComponent)((ims.framework.cn.controls.CustomComponent)super.getControl(1)).getLogic();
	}
	public void setccAuthInfoValueChangedEvent(ims.framework.delegates.ValueChanged delegate)
	{
		((CustomComponent)super.getControl(1)).setValueChangedEvent(delegate);
	}
	public void setccAuthInfoVisible(boolean value)
	{
		((ims.framework.Control)super.getControl(1)).setVisible(value);
	}
	public boolean isccAuthInfoVisible()
	{
		return ((ims.framework.Control)super.getControl(1)).isVisible();
	}
	public void setccAuthInfoEnabled(boolean value)
	{
		((ims.framework.Control)super.getControl(1)).setEnabled(value);
	}
	public boolean isccAuthInfoEnabled()
	{
		return ((ims.framework.Control)super.getControl(1)).isEnabled();
	}
	public ims.clinical.forms.clinicalcoding.IComponent ccDiagnosis()
	{
		return (ims.clinical.forms.clinicalcoding.IComponent)((ims.framework.cn.controls.CustomComponent)super.getControl(2)).getLogic();
	}
	public void setccDiagnosisValueChangedEvent(ims.framework.delegates.ValueChanged delegate)
	{
		((CustomComponent)super.getControl(2)).setValueChangedEvent(delegate);
	}
	public void setccDiagnosisVisible(boolean value)
	{
		((ims.framework.Control)super.getControl(2)).setVisible(value);
	}
	public boolean isccDiagnosisVisible()
	{
		return ((ims.framework.Control)super.getControl(2)).isVisible();
	}
	public void setccDiagnosisEnabled(boolean value)
	{
		((ims.framework.Control)super.getControl(2)).setEnabled(value);
	}
	public boolean isccDiagnosisEnabled()
	{
		return ((ims.framework.Control)super.getControl(2)).isEnabled();
	}
	public Label lblPrimary()
	{
		return (Label)super.getControl(3);
	}
	public Button btnSave()
	{
		return (Button)super.getControl(5);
	}
	public Button btnCancel()
	{
		return (Button)super.getControl(6);
	}
	public CheckBox chkMain()
	{
		return (CheckBox)super.getControl(7);
	}
	public grpFilterRadioButton grpFilter()
	{
		return (grpFilterRadioButton)super.getRadioButton(0);
	}

	public static class Forms implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			private LocalFormName(int name)
			{
				super(name);
			}
		}

		private Forms()
		{
			Scheduling = new SchedulingForms();
		}
		public final class SchedulingForms implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private SchedulingForms()
			{
				AppointmentOutcomeDialog = new LocalFormName(114171);
			}
			public final FormName AppointmentOutcomeDialog;
		}

		public SchedulingForms Scheduling;
	}

	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
	}
	private IReportField[] getFormReportFields()
	{
		if(this.context == null)
			return null;
		if(this.reportFields == null)
			this.reportFields = new ReportFields(this.context, this.formInfo, this.componentIdentifier).getReportFields();
		return this.reportFields;
	}
	private class ReportFields
	{
		public ReportFields(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			this.context = context;
			this.formInfo = formInfo;
			this.componentIdentifier = componentIdentifier;
		}
		public IReportField[] getReportFields()
		{
			String prefix = formInfo.getLocalVariablesPrefix();
			IReportField[] fields = new IReportField[77];
			fields[0] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ID", "ID_Patient");
			fields[1] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SEX", "Sex");
			fields[2] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOB", "Dob");
			fields[3] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOD", "Dod");
			fields[4] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-RELIGION", "Religion");
			fields[5] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISACTIVE", "IsActive");
			fields[6] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ETHNICORIGIN", "EthnicOrigin");
			fields[7] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MARITALSTATUS", "MaritalStatus");
			fields[8] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SCN", "SCN");
			fields[9] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SOURCEOFINFORMATION", "SourceOfInformation");
			fields[10] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFDEATH", "TimeOfDeath");
			fields[11] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISQUICKREGISTRATIONPATIENT", "IsQuickRegistrationPatient");
			fields[12] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-CURRENTRESPONSIBLECONSULTANT", "CurrentResponsibleConsultant");
			fields[13] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-ID", "ID_Patient");
			fields[14] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-SEX", "Sex");
			fields[15] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-DOB", "Dob");
			fields[16] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[17] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[18] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[19] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[20] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[21] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[22] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[23] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ID", "ID_Hcp");
			fields[24] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-HCPTYPE", "HcpType");
			fields[25] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISACTIVE", "IsActive");
			fields[26] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPARESPONSIBLEHCP", "IsHCPaResponsibleHCP");
			fields[27] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISARESPONSIBLEEDCLINICIAN", "IsAResponsibleEDClinician");
			fields[28] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ID", "ID_CareContext");
			fields[29] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-CONTEXT", "Context");
			fields[30] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[31] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			fields[32] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-STARTDATETIME", "StartDateTime");
			fields[33] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ENDDATETIME", "EndDateTime");
			fields[34] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-LOCATIONTYPE", "LocationType");
			fields[35] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-RESPONSIBLEHCP", "ResponsibleHCP");
			fields[36] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[37] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-CARESPELL", "CareSpell");
			fields[38] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-SPECIALTY", "Specialty");
			fields[39] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-RELATIONSHIP", "Relationship");
			fields[40] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-STARTDATE", "StartDate");
			fields[41] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ENDDATE", "EndDate");
			fields[42] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[43] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALNOTE", "ClinicalNote");
			fields[44] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTETYPE", "NoteType");
			fields[45] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-DISCIPLINE", "Discipline");
			fields[46] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALCONTACT", "ClinicalContact");
			fields[47] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISDERIVEDNOTE", "IsDerivedNote");
			fields[48] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEW", "ForReview");
			fields[49] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[50] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-REVIEWINGDATETIME", "ReviewingDateTime");
			fields[51] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISCORRECTED", "IsCorrected");
			fields[52] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISTRANSCRIBED", "IsTranscribed");
			fields[53] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-SOURCEOFNOTE", "SourceOfNote");
			fields[54] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-RECORDINGDATETIME", "RecordingDateTime");
			fields[55] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-INHOSPITALREPORT", "InHospitalReport");
			fields[56] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[57] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[58] = new ims.framework.ReportField(this.context, "_cvp_STHK.AvailableBedsListFilter", "BO-1014100009-ID", "ID_BedSpaceState");
			fields[59] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ID", "ID_PendingEmergencyAdmission");
			fields[60] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ADMISSIONSTATUS", "AdmissionStatus");
			fields[61] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ID", "ID_InpatientEpisode");
			fields[62] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ESTDISCHARGEDATE", "EstDischargeDate");
			fields[63] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[64] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEW", "ForReview");
			fields[65] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[66] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[67] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[68] = new ims.framework.ReportField(this.context, "_cvp_Core.PasEvent", "BO-1014100003-ID", "ID_PASEvent");
			fields[69] = new ims.framework.ReportField(this.context, "_cvp_Correspondence.CorrespondenceDetails", "BO-1052100001-ID", "ID_CorrespondenceDetails");
			fields[70] = new ims.framework.ReportField(this.context, "_cvp_RefMan.CatsReferral", "BO-1004100035-ID", "ID_CatsReferral");
			fields[71] = new ims.framework.ReportField(this.context, "_cv_Clinical.SelectedPatientDiagnosisOPNotes", "BO-1003100016-ID", "ID_PatientDiagnosis");
			fields[72] = new ims.framework.ReportField(this.context, "_cv_Clinical.SelectedPatientDiagnosisOPNotes", "BO-1003100016-DIAGNOSISDESCRIPTION", "DiagnosisDescription");
			fields[73] = new ims.framework.ReportField(this.context, "_cv_Clinical.SelectedPatientDiagnosisOPNotes", "BO-1003100016-DIAGNOSEDDATE", "DiagnosedDate");
			fields[74] = new ims.framework.ReportField(this.context, "_cv_Clinical.SelectedPatientDiagnosisOPNotes", "BO-1003100016-SOURCEOFINFORMATION", "SourceofInformation");
			fields[75] = new ims.framework.ReportField(this.context, "_cv_Clinical.SelectedPatientDiagnosisOPNotes", "BO-1003100016-ISCOMORBIDITY", "IsComorbidity");
			fields[76] = new ims.framework.ReportField(this.context, "_cv_Clinical.SelectedPatientDiagnosisOPNotes", "BO-1003100016-EPISODEOFCARE", "EpisodeOfCare");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return null;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private GlobalContext globalContext = null;
	private IReportField[] reportFields = null;
}
