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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4342.23748)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.medicnotes;

import ims.clinical.configuration.vo.ClinicalProblemRefVo;
import ims.configuration.AppRight;
import ims.core.resource.people.vo.HcpRefVo;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.emergency.forms.medicnotes.GenForm.grdNotesRow;
import ims.emergency.vo.MedicNotesVo;
import ims.emergency.vo.MedicNotesVoCollection;
import ims.framework.Control;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
		if(formName.equals(form.getForms().Core.RieConfirmationDialog) && DialogResult.OK.equals(result))
		{
			doRIE();
		}
		
		open();
	}
	
	private void doRIE() 
	{
		try 
		{
			domain.markAsRie(form.getLocalContext().getRIERecord(), engine.getFormName(), form.getLocalContext().getPatient().getID_Patient(), null, form.getLocalContext().getCareContext().getID_CareContext(), form.getGlobalContext().Core.getRieMessage());
		} 
		catch (StaleObjectException e) 
		{
			e.printStackTrace();
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			return;
		}
		catch (UnqViolationUncheckedException unq)
		{
			unq.printStackTrace();
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			return;
		}
	}

	public void initialize(ims.core.patient.vo.PatientRefVo patient, ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCare, ims.core.admin.vo.CareContextRefVo careContext,  ClinicalProblemRefVo presentingProblem)
	{
		form.getLocalContext().setIsEnabled(true);
		
		form.getLocalContext().setPatient(patient);
		form.getLocalContext().setEpisodeOfCare(episodeOfCare);
		form.getLocalContext().setCareContext(careContext);
		form.getLocalContext().setClinicalProblem(presentingProblem);
		
		Object hcp = domain.getHcpLiteUser();
		if(hcp instanceof HcpRefVo)
		{
			form.getLocalContext().setLoggedHCP((HcpRefVo) hcp);
		}
		
		open();
	}

	private void open() 
	{
		populateScreenFromData();
		updateControlsState();
	}

	private void populateScreenFromData() 
	{
		form.grdNotes().getRows().clear();
		
		MedicNotesVoCollection notes = domain.listMedicNotes(form.getLocalContext().getPatient(), form.getLocalContext().getEpisodeOfCare(), form.getLocalContext().getCareContext());
		
		for(MedicNotesVo note : notes)
		{
			if(note == null)
				continue;
			
			addNoteRow(note);
		}
	}

	private void addNoteRow(MedicNotesVo note) 
	{
		if(note == null)
			return;
		
		grdNotesRow row = form.grdNotes().getRows().newRow();
		
		StringBuffer sb = new StringBuffer();
		
		if(note.getAuthoringInformationIsNotNull())
		{
			sb.append("<b>" + note.getAuthoringInformation().getAuthoringDateTime());
			
			if(note.getAuthoringInformation().getAuthoringHcpIsNotNull())
			{
				if(sb.length() > 0)
					sb.append(" - ");
				
				sb.append(note.getAuthoringInformation().getAuthoringHcp().getIHcpName());
			}
			
			sb.append("</b>");
		}
		
		sb.append("<br><br>");
		sb.append(note.getMedicNote());
		
		row.setColNote(sb.toString());
		row.setValue(note);
	}

	private void updateControlsState() 
	{
		form.btnNew().setVisible(true);
		form.btnNew().setEnabled(form.getLocalContext().getCareContextIsNotNull() && Boolean.TRUE.equals(form.getLocalContext().getIsEnabled()));
		form.btnEdit().setEnabled(form.getLocalContext().getCareContextIsNotNull() && Boolean.TRUE.equals(form.getLocalContext().getIsEnabled()) && form.grdNotes().getValue() != null && (form.grdNotes().getValue().getAuthoringInformation().getAuthoringHcp().equals(form.getLocalContext().getLoggedHCP()) || engine.hasRight(AppRight.ED_ALLOW_CORRECTION_OF_ANY_MEDIC_NOTE)));
		form.btnRIE().setEnabled(form.getLocalContext().getCareContextIsNotNull() && Boolean.TRUE.equals(form.getLocalContext().getIsEnabled()) && form.grdNotes().getValue() != null);
		
		form.getContextMenus().Emergency.getMedicNoteMenuNEWItem().setVisible(form.getLocalContext().getCareContextIsNotNull() && Boolean.TRUE.equals(form.getLocalContext().getIsEnabled()));
		form.getContextMenus().Emergency.getMedicNoteMenuEDITItem().setVisible(form.getLocalContext().getCareContextIsNotNull() && Boolean.TRUE.equals(form.getLocalContext().getIsEnabled()) && form.grdNotes().getValue() != null && (form.grdNotes().getValue().getAuthoringInformation().getAuthoringHcp().equals(form.getLocalContext().getLoggedHCP()) || engine.hasRight(AppRight.ED_ALLOW_CORRECTION_OF_ANY_MEDIC_NOTE)));
		form.getContextMenus().Emergency.getMedicNoteMenuRIEItem().setVisible(form.getLocalContext().getCareContextIsNotNull() && Boolean.TRUE.equals(form.getLocalContext().getIsEnabled()) && form.grdNotes().getValue() != null);
	}

	public void setEnabled(Boolean value) 
	{
		form.getLocalContext().setIsEnabled(value);
		updateControlsState();
	}

	@Override
	protected void onBtnEditClick() throws PresentationLogicException 
	{
		form.getGlobalContext().Emergency.setMedicNote(form.grdNotes().getValue());
		
		engine.open(form.getForms().Emergency.MedicNoteDialog);
	}

	@Override
	protected void onGrdNotesSelectionChanged()	throws PresentationLogicException 
	{
		updateControlsState();
	}

	@Override
	protected void onBtnRIEClick() throws PresentationLogicException 
	{
		markAsRIE();
	}

	private void markAsRIE() 
	{
		if(form.grdNotes().getValue() == null)
			return;
		
		form.getLocalContext().setRIERecord(form.grdNotes().getValue());
		engine.open(form.getForms().Core.RieConfirmationDialog);
	}

	@Override
	protected void onBtnNewClick() throws PresentationLogicException 
	{
		newMedicNote();
	}

	private void newMedicNote() 
	{
		MedicNotesVo note = new MedicNotesVo();
		note.setPatient(form.getLocalContext().getPatient());
		note.setEpisode(form.getLocalContext().getEpisodeOfCare());
		note.setAttendance(form.getLocalContext().getCareContext());
		note.setPresentingProblem(form.getLocalContext().getClinicalProblem());
		form.getGlobalContext().Emergency.setMedicNote(note);
		
		engine.open(form.getForms().Emergency.MedicNoteDialog);
	}

	public void clear() 
	{
		form.getLocalContext().setPatient(null);
		form.getLocalContext().setEpisodeOfCare(null);
		form.getLocalContext().setCareContext(null);
		form.getLocalContext().setClinicalProblem(null);
		form.getLocalContext().setRIERecord(null);
		form.grdNotes().getRows().clear();
		
		updateControlsState();
	}

	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException 
	{
		switch(menuItemID)
		{
			case GenForm.ContextMenus.EmergencyNamespace.MedicNoteMenu.NEW:
				newMedicNote();
			break;
			
			case GenForm.ContextMenus.EmergencyNamespace.MedicNoteMenu.EDIT:
				form.getGlobalContext().Emergency.setMedicNote(form.grdNotes().getValue());
				engine.open(form.getForms().Emergency.MedicNoteDialog);
			break;
				
			case GenForm.ContextMenus.EmergencyNamespace.MedicNoteMenu.RIE:
				markAsRIE();
			break;
		}
		
		updateControlsState();
	}
}
