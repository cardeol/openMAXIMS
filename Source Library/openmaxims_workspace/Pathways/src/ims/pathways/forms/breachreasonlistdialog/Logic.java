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
// This code was generated by Mara Iroaie using IMS Development Environment (version 1.80 build 5354.19352)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.pathways.forms.breachreasonlistdialog;

import ims.configuration.AppRight;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.core.vo.enums.PatientJourneyAction;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.pathways.forms.breachreasonlistdialog.GenForm.GrpViewEnumeration;
import ims.pathways.forms.breachreasonlistdialog.GenForm.grdRecordsRow;
import ims.pathways.vo.BreachReasonCorrectionVo;
import ims.pathways.vo.PatientJourneyBreachReasonListVo;
import ims.pathways.vo.PatientJourneyBreachReasonListVoCollection;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		initialise();
		
		if (args != null && args.length > 0 && args[0] instanceof PatientJourneyAction && ((PatientJourneyAction) args[0]).equals(PatientJourneyAction.RECORDBREACHREASON))
			open(true);
		else
			open(false);
		
	}
	
	private void initialise()
	{
		
		Object mos = domain.getMosUser();
		
		if (mos !=null && mos instanceof MemberOfStaffLiteVo)
		{
			form.getLocalContext().setLoggedMOS((MemberOfStaffLiteVo) mos);
		}
		
		form.GrpView().setValue(GrpViewEnumeration.rdoLatest);
		
		form.btnNewBreach().setImage(form.getImages().Core.AddFile16);
		form.btnCorrect().setImage(form.getImages().Correspondence.DocumentReview16);
		form.btnRIE().setImage(form.getImages().Core.Alert_RedTriangle2);
		form.btnClose().setImage(form.getImages().Core.Remove);
		
	}

	private void open(Boolean newBreachReason)
	{
		populateScreenFromData(false);
		
		if (Boolean.TRUE.equals(newBreachReason))
			openBreachReasonDialog();
		
		updateControlsState();
		
	}

	private void populateScreenFromData(Boolean latestFirst)
	{
		form.grdRecords().getRows().clear();
		
		PatientJourneyBreachReasonListVoCollection breachReasons = domain.getBreachReasonsForPathway(form.getGlobalContext().Pathways.getSelectedPatientPathwayJourney(), latestFirst) ;
		
		if (breachReasons == null || breachReasons.size() == 0)
			return;
		
		for (PatientJourneyBreachReasonListVo reason : breachReasons)
		{
			if (reason == null)
				continue;
			
			addNoteRow(reason);
		}
	}

	private void addNoteRow(PatientJourneyBreachReasonListVo reason)
	{
		grdRecordsRow row = form.grdRecords().getRows().newRow();
		
		StringBuffer sb = new StringBuffer();
		
		if(reason.getBreachReasonRecordingMOS() != null)
		{
			sb.append("<b>" + reason.getBreachReasonRecordingMOS().getIMosName() + "<b>");
		}
		
		if(reason.getBreachReasonDate() != null)
		{
			if(sb.length() > 0)
				sb.append(" - ");
			
			sb.append("<b>" + reason.getBreachReasonDate() + "<b>");
		}
		
		row.setColAuthoringInfo(Boolean.TRUE.equals(reason.getCorrected()) ? "<s>" + sb.toString() + "</s>" : sb.toString());
				
		if( reason.getBreachReason() != null)
			row.setColBreachReason(Boolean.TRUE.equals(reason.getCorrected()) ? "<s>" + reason.getBreachReason().getIItemText() + "</s>" : reason.getBreachReason().getIItemText());
			
		if( reason.getBreachReasonComment() !=null )
		{
			row.setColBreachNotes(Boolean.TRUE.equals(reason.getCorrected()) ? "<s>" + reason.getBreachReasonComment() + "</s>" : reason.getBreachReasonComment());
			row.setCellColBreachNotesTooltip(reason.getBreachReasonComment());
		}
		
		if (Boolean.TRUE.equals(reason.getCorrected()))
		{
			StringBuffer correctionTooltip = new StringBuffer();
			
			if (reason.getCorrectionAuthoringInfo() != null)
			{
				
				if (reason.getCorrectionAuthoringInfo().getRecordingUser() != null)
					correctionTooltip.append("<b>" + "Correcting MOS : " + "</b>" + reason.getCorrectionAuthoringInfo().getRecordingUser().getName().toString() + "<br>");

				if (reason.getCorrectionAuthoringInfo().getRecordingDateTime() != null)
					correctionTooltip.append("<b>" + "Correction Date/Time : " + "</b>" + reason.getCorrectionAuthoringInfo().getRecordingDateTime().toString() + "<br>");

			}

			correctionTooltip.append("<b>" + "Correction Comments : " + "</b>" + (reason.getCorrectionComments() != null ? reason.getCorrectionComments() : ""));

			row.setTooltip(correctionTooltip.toString());
			
			row.setBackColor(ConfigFlag.UI.CORRECTION_ROW_COLOUR.getValue());
		}
		
		row.setValue(reason);
		
	}

	@Override
	protected void onBtnNewBreachClick() throws ims.framework.exceptions.PresentationLogicException
	{
		openBreachReasonDialog();
		
	}

	private void openBreachReasonDialog()
	{
		form.grdRecords().setValue(null);
		engine.open(form.getForms().Pathways.PatientJourneyBreachReason);
		
	}

	@Override
	protected void onBtnRIEClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.open(form.getForms().Core.RieConfirmationDialog);
	}

	@Override
	protected void onBtnCorrectClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().Pathways.setBreachReasonCorrectionData(null);
		engine.open(form.getForms().Emergency.NoteCorrectionMosDialog);
		
	}

	@Override
	protected void onRadioButtonGrpViewValueChanged() throws PresentationLogicException
	{
		populateScreenFromData(form.GrpView().getValue().equals(GrpViewEnumeration.rdoOldest) ? true : false);
		updateControlsState();
		
	}

	@Override
	protected void onGrdRecordsSelectionChanged() throws PresentationLogicException
	{
		updateControlsState();
		
	}

	private void updateControlsState()
	{
		boolean canAddEditReasons = engine.hasRight(AppRight.CAN_RECORD_OVERALL_PATHWAY_BREACH_REASON);
		boolean noteWasCreatedByCurrentUser = form.grdRecords().getValue() != null && form.grdRecords().getValue().getBreachReasonRecordingMOS() != null && form.grdRecords().getValue().getBreachReasonRecordingMOS().equals(form.getLocalContext().getLoggedMOS());
		boolean userHasRightToCorrect = engine.hasRight(AppRight.PATHWAY_ALLOW_CORRECTION_OF_ANY_BREACH_REASON);
		
		form.btnNewBreach().setVisible(canAddEditReasons);
		
		form.btnCorrect().setEnabled(form.grdRecords().getValue() != null && !Boolean.TRUE.equals(form.grdRecords().getValue().getCorrected()) && (noteWasCreatedByCurrentUser || userHasRightToCorrect));
		form.btnCorrect().setVisible(canAddEditReasons);
		
		form.btnRIE().setEnabled(form.grdRecords().getValue() != null);
		form.btnRIE().setVisible(canAddEditReasons);
		
	}

	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		if(formName.equals(form.getForms().Core.RieConfirmationDialog) && DialogResult.OK.equals(result))
		{
			doRIE();
		}
		else if(formName.equals(form.getForms().Emergency.NoteCorrectionMosDialog) && DialogResult.OK.equals(result))
		{
			saveBreachReasonCorrection();
		}
		
		populateScreenFromData(form.GrpView().getValue().equals(GrpViewEnumeration.rdoOldest) ? true : false);
		
		updateControlsState();
	}

	private void saveBreachReasonCorrection()
	{
		PatientJourneyBreachReasonListVo reason = (PatientJourneyBreachReasonListVo) form.grdRecords().getValue().clone();
		
		if (reason == null || form.getGlobalContext().Pathways.getBreachReasonCorrectionData() == null)
			return;
		
		BreachReasonCorrectionVo correctionData = form.getGlobalContext().Pathways.getBreachReasonCorrectionData();
		
		reason.setCorrected(Boolean.TRUE);
		reason.setCorrectionComments(correctionData.getCorrectionComments());
		reason.setCorrectionAuthoringInfo(correctionData.getAuthoringInformation());
		
		try
		{
			domain.saveCorrection(reason);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
		}
		
	}

	private void doRIE()
	{
		
		try 
		{
			domain.markAsRie(form.grdRecords().getValue(), engine.getFormName(), form.getGlobalContext().Core.getPatientShort().getID_Patient(), null, null, form.getGlobalContext().Core.getRieMessage());
		} 
		catch (StaleObjectException e) 
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			return;
		}
		catch (UnqViolationUncheckedException e) 
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			return;
		}
	}

	@Override
	protected void onBtnCloseClick() throws PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
		
	}

	
}