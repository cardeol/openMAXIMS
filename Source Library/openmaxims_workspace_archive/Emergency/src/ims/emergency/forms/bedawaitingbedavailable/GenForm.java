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

package ims.emergency.forms.bedawaitingbedavailable;

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
	public static class cmbDTABedTypeComboBox extends ComboBoxBridge
	{
		private static final long serialVersionUID = 1L;
		
		public void newRow(ims.core.vo.lookups.BedTypeRequested value, String text)
		{
			super.control.newRow(value, text);
		}
		public void newRow(ims.core.vo.lookups.BedTypeRequested value, String text, ims.framework.utils.Image image)
		{
			super.control.newRow(value, text, image);
		}
		public void newRow(ims.core.vo.lookups.BedTypeRequested value, String text, ims.framework.utils.Color textColor)
		{
			super.control.newRow(value, text, textColor);
		}
		public void newRow(ims.core.vo.lookups.BedTypeRequested value, String text, ims.framework.utils.Image image, ims.framework.utils.Color textColor)
		{
			super.control.newRow(value, text, image, textColor);
		}
		public boolean removeRow(ims.core.vo.lookups.BedTypeRequested value)
		{
			return super.control.removeRow(value);
		}
		public ims.core.vo.lookups.BedTypeRequested getValue()
		{
			return (ims.core.vo.lookups.BedTypeRequested)super.control.getValue();
		}
		public void setValue(ims.core.vo.lookups.BedTypeRequested value)
		{
			super.control.setValue(value);
		}
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
		if(!context.isValidContextType(ims.core.vo.PatientShort.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.PatientShort' of the global context variable 'Core.PatientShort' is not supported.");
		if(!context.isValidContextType(ims.core.vo.CareContextShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.CareContextShortVo' of the global context variable 'Core.CurrentCareContext' is not supported.");
		if(!context.isValidContextType(ims.core.vo.EpisodeofCareShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.EpisodeofCareShortVo' of the global context variable 'Core.EpisodeofCareShort' is not supported.");
	}
	private void validateMandatoryContext(Context context)
	{
		if(new ims.framework.ContextVariable("Emergency.Tracking", "_cv_Emergency.Tracking").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'Emergency.Tracking' is not available.");
		if(new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'Core.PatientShort' is not available.");
		if(new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'Core.CurrentCareContext' is not available.");
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

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(494, 136);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setFormReferences(FormReferencesFlyweightFactory.getInstance().create(Forms.class));
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Custom Controls
		ims.framework.CustomComponent instance1 = factory.getEmptyCustomComponent();
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 123, 6, 368, 20, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		ims.framework.FormUiLogic m_ccRequestedByForm = loader.loadComponent(102256, appForm, startControlID * 10 + 1000, anchoringHelper1.getSize(), instance1, startTabIndex.intValue() + 1, skipContextValidation);
		//ims.framework.Control m_ccRequestedByControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(123), new Integer(6), new Integer(368), new Integer(20), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT, new Integer(startTabIndex.intValue() + 1), m_ccRequestedByForm, instance1 } );
		ims.framework.Control m_ccRequestedByControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1001),  new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT, new Integer(startTabIndex.intValue() + 1), m_ccRequestedByForm, instance1, Boolean.FALSE } );
		super.addControl(m_ccRequestedByControl);
		Menu[] menus1 = m_ccRequestedByForm.getForm().getRegisteredMenus();
		for(int x = 0; x < menus1.length; x++)
		{
			form.registerMenu(menus1[x]);
		}

		// Label Controls
		RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 8, 58, 87, 17, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, "DTA Bed Type:", new Integer(1), null, new Integer(0)}));
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 8, 82, 116, 17, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1003), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, "Available Bed Time:", new Integer(1), null, new Integer(0)}));
		RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 8, 32, 115, 17, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1004), new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, "Awaiting Bed Time:", new Integer(1), null, new Integer(0)}));
		RuntimeAnchoring anchoringHelper5 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 86, 17, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1005), new Integer(anchoringHelper5.getX()), new Integer(anchoringHelper5.getY()), new Integer(anchoringHelper5.getWidth()), new Integer(anchoringHelper5.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, "Requested by:", new Integer(1), null, new Integer(0)}));

		// Button Controls
		RuntimeAnchoring anchoringHelper6 = new RuntimeAnchoring(designSize, runtimeSize, 152, 109, 128, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1006), new Integer(anchoringHelper6.getX()), new Integer(anchoringHelper6.getY()), new Integer(anchoringHelper6.getWidth()), new Integer(anchoringHelper6.getHeight()), new Integer(startTabIndex.intValue() + 1005), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Remove Bed Request", Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper7 = new RuntimeAnchoring(designSize, runtimeSize, 400, 109, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1007), new Integer(anchoringHelper7.getX()), new Integer(anchoringHelper7.getY()), new Integer(anchoringHelper7.getWidth()), new Integer(anchoringHelper7.getHeight()), new Integer(startTabIndex.intValue() + 1007), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Cancel", Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper8 = new RuntimeAnchoring(designSize, runtimeSize, 322, 109, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1008), new Integer(anchoringHelper8.getX()), new Integer(anchoringHelper8.getY()), new Integer(anchoringHelper8.getWidth()), new Integer(anchoringHelper8.getHeight()), new Integer(startTabIndex.intValue() + 1006), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Save", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// Date Time Controls
		RuntimeAnchoring anchoringHelper9 = new RuntimeAnchoring(designSize, runtimeSize, 123, 80, 200, 20, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		super.addControl(factory.getControl(DateTimeControl.class, new Object[] { control, new Integer(startControlID.intValue() + 1009), new Integer(anchoringHelper9.getX()), new Integer(anchoringHelper9.getY()), new Integer(anchoringHelper9.getWidth()), new Integer(anchoringHelper9.getHeight()), new Integer(startTabIndex.intValue() + 1004), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT,Boolean.TRUE, null, Boolean.FALSE, null, Boolean.FALSE, null}));
		RuntimeAnchoring anchoringHelper10 = new RuntimeAnchoring(designSize, runtimeSize, 123, 30, 200, 20, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		super.addControl(factory.getControl(DateTimeControl.class, new Object[] { control, new Integer(startControlID.intValue() + 1010), new Integer(anchoringHelper10.getX()), new Integer(anchoringHelper10.getY()), new Integer(anchoringHelper10.getWidth()), new Integer(anchoringHelper10.getHeight()), new Integer(startTabIndex.intValue() + 1002), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT,Boolean.TRUE, null, Boolean.FALSE, null, Boolean.TRUE, null}));

		// ComboBox Controls
		RuntimeAnchoring anchoringHelper11 = new RuntimeAnchoring(designSize, runtimeSize, 123, 56, 200, 21, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		ComboBox m_cmbDTABedTypeTemp = (ComboBox)factory.getControl(ComboBox.class, new Object[] { control, new Integer(startControlID.intValue() + 1011), new Integer(anchoringHelper11.getX()), new Integer(anchoringHelper11.getY()), new Integer(anchoringHelper11.getWidth()), new Integer(anchoringHelper11.getHeight()), new Integer(startTabIndex.intValue() + 1003), ControlState.UNKNOWN, ControlState.UNKNOWN,ims.framework.enumerations.ControlAnchoring.TOPLEFT ,Boolean.TRUE, Boolean.FALSE, SortOrder.NONE, Boolean.FALSE, new Integer(1), null, Boolean.TRUE, new Integer(-1)});
		addControl(m_cmbDTABedTypeTemp);
		cmbDTABedTypeComboBox cmbDTABedType = (cmbDTABedTypeComboBox)ComboBoxFlyweightFactory.getInstance().createComboBoxBridge(cmbDTABedTypeComboBox.class, m_cmbDTABedTypeTemp);
		super.addComboBox(cmbDTABedType);
	}



	public Forms getForms()
	{
		return (Forms)super.getFormReferences();
	}
	public ims.core.forms.mosquery.IComponent ccRequestedBy()
	{
		return (ims.core.forms.mosquery.IComponent)((ims.framework.cn.controls.CustomComponent)super.getControl(0)).getLogic();
	}
	public void setccRequestedByValueChangedEvent(ims.framework.delegates.ValueChanged delegate)
	{
		((CustomComponent)super.getControl(0)).setValueChangedEvent(delegate);
	}
	public void setccRequestedByVisible(boolean value)
	{
		((ims.framework.Control)super.getControl(0)).setVisible(value);
	}
	public boolean isccRequestedByVisible()
	{
		return ((ims.framework.Control)super.getControl(0)).isVisible();
	}
	public void setccRequestedByEnabled(boolean value)
	{
		((ims.framework.Control)super.getControl(0)).setEnabled(value);
	}
	public boolean isccRequestedByEnabled()
	{
		return ((ims.framework.Control)super.getControl(0)).isEnabled();
	}
	public Button btnRemove()
	{
		return (Button)super.getControl(5);
	}
	public Button btnCancel()
	{
		return (Button)super.getControl(6);
	}
	public Button btnSave()
	{
		return (Button)super.getControl(7);
	}
	public DateTimeControl dtimAvailableBed()
	{
		return (DateTimeControl)super.getControl(8);
	}
	public DateTimeControl dtimAwaitingBed()
	{
		return (DateTimeControl)super.getControl(9);
	}
	public cmbDTABedTypeComboBox cmbDTABedType()
	{
		return (cmbDTABedTypeComboBox)super.getComboBox(0);
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
			Emergency = new EmergencyForms();
		}
		public final class EmergencyForms implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private EmergencyForms()
			{
				TrackingStatusDialog = new LocalFormName(129153);
			}
			public final FormName TrackingStatusDialog;
		}

		public EmergencyForms Emergency;
	}

	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
	}
	public LocalContext getLocalContext()
	{
		return (LocalContext)super.getLocalCtx();
	}
	public class LocalContext extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
		
		public LocalContext(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			super.setContext(context);
			String prefix = formInfo.getLocalVariablesPrefix();
			cxl_currentBedAvailability = new ims.framework.ContextVariable("currentBedAvailability", prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentBedAvailability_" + componentIdentifier + "");
			cxl_currentTracking = new ims.framework.ContextVariable("currentTracking", prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentTracking_" + componentIdentifier + "");
		}
		
		public boolean getcurrentBedAvailabilityIsNotNull()
		{
			return !cxl_currentBedAvailability.getValueIsNull(context);
		}
		public ims.emergency.vo.BedAvailabilityVo getcurrentBedAvailability()
		{
			return (ims.emergency.vo.BedAvailabilityVo)cxl_currentBedAvailability.getValue(context);
		}
		public void setcurrentBedAvailability(ims.emergency.vo.BedAvailabilityVo value)
		{
			cxl_currentBedAvailability.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_currentBedAvailability = null;
		public boolean getcurrentTrackingIsNotNull()
		{
			return !cxl_currentTracking.getValueIsNull(context);
		}
		public ims.emergency.vo.TrackingForBedAvailabilityVo getcurrentTracking()
		{
			return (ims.emergency.vo.TrackingForBedAvailabilityVo)cxl_currentTracking.getValue(context);
		}
		public void setcurrentTracking(ims.emergency.vo.TrackingForBedAvailabilityVo value)
		{
			cxl_currentTracking.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_currentTracking = null;
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
			IReportField[] fields = new IReportField[93];
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
			fields[71] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-ID", "ID_TrackingAttendanceStatus");
			fields[72] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-PATIENT", "Patient");
			fields[73] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-EPISODE", "Episode");
			fields[74] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-ATTENDANCE", "Attendance");
			fields[75] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-TRACKINGAREA", "TrackingArea");
			fields[76] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-STATUSDATETIME", "StatusDatetime");
			fields[77] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-CREATEDBY", "CreatedBy");
			fields[78] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-STATUS", "Status");
			fields[79] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-PREVSTATUS", "PrevStatus");
			fields[80] = new ims.framework.ReportField(this.context, "_cv_Emergency.TrackingAttendanceStatus", "BO-1086100013-PREVTRACKINGAREA", "PrevTrackingArea");
			fields[81] = new ims.framework.ReportField(this.context, "_cv_Emergency.Tracking", "BO-1086100005-ID", "ID_Tracking");
			fields[82] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentBedAvailability_" + componentIdentifier, "BO-1086100001-ID", "ID_BedAvailability");
			fields[83] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentBedAvailability_" + componentIdentifier, "BO-1086100001-PATIENT", "Patient");
			fields[84] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentBedAvailability_" + componentIdentifier, "BO-1086100001-EPISODE", "Episode");
			fields[85] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentBedAvailability_" + componentIdentifier, "BO-1086100001-ATTENDANCE", "Attendance");
			fields[86] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentBedAvailability_" + componentIdentifier, "BO-1086100001-TRACKINGAREA", "TrackingArea");
			fields[87] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentBedAvailability_" + componentIdentifier, "BO-1086100001-AWAITINGDATETIME", "AwaitingDateTime");
			fields[88] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentBedAvailability_" + componentIdentifier, "BO-1086100001-AVAILABLEDATETIME", "AvailableDateTime");
			fields[89] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentTracking_" + componentIdentifier, "BO-1086100005-ID", "ID_Tracking");
			fields[90] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentTracking_" + componentIdentifier, "BO-1086100005-CURRENTAREA", "CurrentArea");
			fields[91] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentTracking_" + componentIdentifier, "BO-1086100005-ISDISCHARGED", "IsDischarged");
			fields[92] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.BedAwaitingBedAvailable.__internal_x_context__currentTracking_" + componentIdentifier, "BO-1086100005-PATIENT", "Patient");
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