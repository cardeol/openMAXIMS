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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4696.13908)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.ocrr.forms.clinicalordersresultsocrrform;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.HcpLiteVoCollection;
import ims.core.vo.ServiceLiteVoCollection;
import ims.core.vo.lookups.ServiceCategory;
import ims.framework.Control;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.framework.utils.Image;
import ims.framework.utils.Time;
import ims.ocrr.forms.clinicalordersresultsocrrform.GenForm.Group1Enumeration;
import ims.ocrr.forms.clinicalordersresultsocrrform.GenForm.GrpCriteriaEnumeration;
import ims.ocrr.forms.clinicalordersresultsocrrform.GenForm.grdClinicalResultsRow;
import ims.ocrr.vo.ClinicalResultListVo;
import ims.ocrr.vo.ClinicalResultListVoCollection;
import ims.ocrr.vo.InvestigationIndexLiteVoCollection;
import ims.ocrr.vo.OcsPathRadResultVo;
import ims.ocrr.vo.OcsPathRadResultVoCollection;
import ims.ocrr.vo.OrderedInvestigationStatusClinicalVo;
import ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo;
import ims.ocrr.vo.ResultCommentsLiteVo;
import ims.ocrr.vo.ResultCommentsLiteVoCollection;
import ims.ocrr.vo.RoleDisciplineSecurityLevelLiteGCVo;
import ims.ocrr.vo.lookups.AuthorisationOrderStatus;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.OrderInvStatus;

import java.util.ArrayList;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		form.Group1().setValue(Group1Enumeration.rdoAll);
		form.GrpCriteria().setValue(GrpCriteriaEnumeration.rdoBegins);
		loadCmbDepartment();
		updateTotal();

		// Security Level
		RoleDisciplineSecurityLevelLiteGCVo voRoleDisciplineSecurityLevels = form.getGlobalContext().OCRR.getRoleDisciplineSecurityLevels();
		if (voRoleDisciplineSecurityLevels == null || (voRoleDisciplineSecurityLevels != null && voRoleDisciplineSecurityLevels.getIsConfigLoadedIsNotNull() && !voRoleDisciplineSecurityLevels.getIsConfigLoaded().equals(false)))
			form.getGlobalContext().OCRR.setRoleDisciplineSecurityLevels(domain.getRoleDisciplineSecurityLevels(engine.getLoggedInRole()));
		
		doSearch();
	}

	protected void loadCmbDepartment()
	{
		ServiceLiteVoCollection coll = domain.listServices("%%%", ServiceCategory.CLINICAL);

		form.cmbDepartment().clear();

		for (int i = 0; i < coll.size(); i++)
		{
			form.cmbDepartment().newRow(coll.get(i), coll.get(i).getServiceName());
		}
	}

	private void updateTotal()
	{
		StringBuffer total = new StringBuffer();
		total.append("<b>");
		total.append("Total: ");
		total.append(form.grdClinicalResults().getRows().size());
		total.append("</b>");
		form.grdClinicalResults().setFooterValue(total.toString());
	}

	@Override
	protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().OCRR.setOrderAwaitingAuthorisation(null);// WDEV-11097

		if (formName.equals(form.getForms().OCRR.ResultDialog) && DialogResult.YES.equals(result))
		{
			engine.open(ConfigFlag.UI.DEMOGRAPHICS_FORM.getValue());
			return;
		}

		doSearch();
	}

	@Override
	protected void onRadioButtonGroup1ValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		doSearch();
	}

	@Override
	protected void onQmbClinicianTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException
	{
		HcpLiteVoCollection coll = domain.listClinicians("%" + value + "%");

		form.qmbClinician().clear();

		for (int i = 0; i < coll.size(); i++)
		{
			form.qmbClinician().newRow(coll.get(i), coll.get(i).getName().toString());
		}

		if (coll.size() == 1)
		{
			form.qmbClinician().setValue(coll.get(0));
		}
		else if (coll.size() > 1)
		{
			form.qmbClinician().showOpened();
		}
	}

	@Override
	protected void onQmbInvestigationTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException
	{
		InvestigationIndexLiteVoCollection coll = domain.listInvestigations(value, form.GrpCriteria().getValue().equals(GrpCriteriaEnumeration.rdoBegins));

		form.qmbInvestigation().clear();

		for (int i = 0; i < coll.size(); i++)
		{
			form.qmbInvestigation().newRow(coll.get(i), coll.get(i).getName());
		}

		if (coll.size() == 1)
		{
			form.qmbInvestigation().setValue(coll.get(0));
		}
		else if (coll.size() > 1)
		{
			form.qmbInvestigation().showOpened();
		}
	}

	@Override
	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{	
		doSearch();
	}

	private void doSearch()
	{
		form.getGlobalContext().OCRR.setLastUpdatedPathRadResult(null);
		form.grdClinicalResults().getRows().clear();
		updateTotal();

		if (isSearchCriteriaValid())
		{

			DateTime dtFrom = (form.dteFrom().getValue() != null ? new DateTime(form.dteFrom().getValue(), new Time(0, 0, 0)) : null);
			DateTime dtTo = (form.dteTo().getValue() != null ? new DateTime(form.dteTo().getValue(), new Time(23, 59, 59)) : null);

			ClinicalResultListVoCollection voCollResults = domain.listResults(dtFrom, dtTo, form.cmbDepartment().getValue(), form.qmbInvestigation().getValue(), form.qmbClinician().getValue(), form.Group1().getValue().equals(Group1Enumeration.rdoResults) ? Boolean.TRUE : Boolean.FALSE, form.getGlobalContext().Core.getPatientShortIsNotNull() ? form.getGlobalContext().Core.getPatientShort() : null);

			form.getLocalContext().setinvIdList(getInvId(voCollResults));
			Integer nNewResUnseenDays = ConfigFlag.DOM.OCS_NEWRES_UNSEEN_CUTOFF.getValue();
			Date dateUnseen = new Date().addDay(-1 * nNewResUnseenDays.intValue());

			populateResultsGrid(voCollResults, dateUnseen);
		}
		updateControlsState();

	}

	private void populateResultsGrid(ClinicalResultListVoCollection voCollResults, Date dateUnseen)
	{
		if (voCollResults == null || voCollResults.size() == 0)
		{
			engine.showMessage("No records match your search criteria.");
			return;
		}

		form.getLocalContext().setResultCollectionFromGrid(null); //WDEV-16882
		
		for (int i = 0; i < voCollResults.size(); i++)
		{
			Color backColour = ((i % 2) == 0 ? Color.Beige : Color.Default);
			addResultRow(voCollResults.get(i), dateUnseen, backColour);
		}
		
		updateTotal();
	}

	private void addResultRow(ClinicalResultListVo result, Date dateUnseen, Color backColour)
	{
		if (result == null)
			return;

		OcsPathRadResultVo res = new OcsPathRadResultVo();
		res.setCategory(Category.CLINICAL);
		res.setOrderInvestigation(result);
		res.setDescription(result.getInvestigationIsNotNull() && result.getInvestigation().getInvestigationIndexIsNotNull() ? result.getInvestigation().getInvestigationIndex().getName() : "<not set>");

		grdClinicalResultsRow row = form.grdClinicalResults().getRows().newRow();

		if (result.getDisplayDateTimeIsNotNull())
		{
			row.setColDateTime(result.getDisplayDateTime().toString(DateTimeFormat.STANDARD));
		}

		if (result.getInvestigationIsNotNull() && result.getInvestigation().getInvestigationIndexIsNotNull() )
		{
			row.setColInvName(result.getInvestigation().getInvestigationIndex().getName());
			row.setTooltipForColInvName(result.getInvestigation().getInvestigationIndex().getName());
		}

		if (result.getInvestigationIsNotNull() && result.getInvestigation().getProviderServiceIsNotNull() && result.getInvestigation().getProviderService().getLocationServiceIsNotNull() && result.getInvestigation().getProviderService().getLocationService().getServiceIsNotNull())
		{
			row.setColDepartment(result.getInvestigation().getProviderService().getLocationService().getService().getServiceName());
			row.setTooltipForColDepartment(result.getInvestigation().getProviderService().getLocationService().getService().getServiceName());
		}

		if (result.getOrderDetailsIsNotNull())
		{
			row.setColOrderingLocation(result.getOrderDetails().getCorrectLocation());
			row.setTooltipForColOrderingLocation(result.getOrderDetails().getCorrectLocation());
		}

		if (result.getOrderDetailsIsNotNull())
		{
			row.setColClinician(result.getOrderDetails().getCorrectClinician());
			row.setTooltipForColClinician(result.getOrderDetails().getCorrectClinician());
		}

		if (result.getResultStatusIsNotNull())
		{
			row.setColStatus(result.getResultStatus().getText());
		}

		if (result.getDisplayFlagIsNotNull())
		{
			row.setColImage(result.getDisplayFlag().getIItemImage());
			row.setTooltipForColImage(result.getDisplayFlag().getText());
		}

		// Status
		String szTooltip = "";
		if (result.getOrdInvCurrentStatusIsNotNull() && result.getOrdInvCurrentStatus().getOrdInvStatusIsNotNull())
		{
			OrderInvStatus currStat = result.getOrdInvCurrentStatus().getOrdInvStatus();

			Image image = currStat.getImage();
			szTooltip = generateStatusTooltip(result.getOrdInvCurrentStatus());

			//WDEV-16679
			if (currStat.equals(OrderInvStatus.REVIEW) && result.getAllocatedHCPforReview() != null)
			{
				szTooltip = (szTooltip + "<br><b>Review HCP: </b>" + result.getAllocatedHCPforReview().toString());
			}
			
			if (result.getRepDateTimeIsNotNull() && dateUnseen != null)
			{
				if (currStat.equals(OrderInvStatus.NEW_RESULT) || currStat.equals(OrderInvStatus.UPDATED_RESULT))
				{
					if (result.getRepDateTime().getDate().isLessThan(dateUnseen))
					{
						row.setBold(true);
						szTooltip = (szTooltip + "<br>Unseen");
					}
				}
				else if (currStat.equals(OrderInvStatus.REVIEW))
				{
					if (result.getOrdInvCurrentStatus().getChangeDateTime().getDate().isLessThan(dateUnseen))
					{
						row.setBold(true);
						szTooltip = (szTooltip + "<br>Requires Attention");
					}
				}
			}

			row.setColInvStatus(image);
			row.setTooltipForColInvStatus(szTooltip);
		}

		row.setValue(res);
		row.setBackColor(backColour);
		
		//WDEV-16679
		if (result.getResultConclusionCommentsIsNotNull() && result.getResultConclusionComments().size() > 0)
		{
			ResultCommentsLiteVoCollection comments = result.getResultConclusionComments();
			
			comments.sort(SortOrder.DESCENDING);
			ResultCommentsLiteVo lastComment = comments.get(0);

			szTooltip += "<br><b>" + lastComment.getAuthoringInformation().getAuthoringDateTime().toString() + " ";
			szTooltip += lastComment.getAuthoringInformation().getAuthoringHcp().getName().toString() + ":</b> " + lastComment.getComment();
			
			//Append correction
			if (lastComment.getCorrectingDateTimeIsNotNull())
			{
				szTooltip += "<br><b>Corrected " + lastComment.getCorrectingDateTime().toString() + " ";
				szTooltip += lastComment.getCorrectingHcp().getName().toString() + ":</b> " + lastComment.getCorrectionReason();
			}

			row.setTooltipForColInvStatus(szTooltip);
		}
		
		
		//WDEV-16642
		if (result.getResultDetailsIsNotNull())
		{
			form.getLocalContext().setResultCollectionFromGrid(addToResultCollection(form.getLocalContext().getResultCollectionFromGrid(),res));
		}
	}

	//WDEV-16642
	private OcsPathRadResultVoCollection addToResultCollection(OcsPathRadResultVoCollection resultCollectionFromGrid, OcsPathRadResultVo res)
	{
		if (resultCollectionFromGrid==null)
			resultCollectionFromGrid=new OcsPathRadResultVoCollection();
		
		resultCollectionFromGrid.add(res);
		
		return resultCollectionFromGrid;
	}

	private String generateStatusTooltip(OrderedInvestigationStatusClinicalVo ordInvCurrentStatus)
	{
		if (ordInvCurrentStatus != null && ordInvCurrentStatus.getOrdInvStatus() != null)
		{
			StringBuffer sb = new StringBuffer();
			sb.append("<b>Current status: </b>" + ordInvCurrentStatus.getOrdInvStatus().getText());

			if (ordInvCurrentStatus.getStatusReason() != null && ordInvCurrentStatus.getStatusReason().length() > 0 && ordInvCurrentStatus.getOrdInvStatus().equals(OrderInvStatus.CANCELLED))
				sb.append("<br><b>Current status reason: </b>" + ordInvCurrentStatus.getStatusReason());

			sb.append("<br><b>Date changed: </b>" + ordInvCurrentStatus.getChangeDateTime());
			sb.append("<br><b>Changed by: </b>" + (ordInvCurrentStatus.getChangeUserIsNotNull() ? ordInvCurrentStatus.getChangeUser().toString() : ""));

			return sb.toString();
		}
		return null;
	}

	private void updateControlsState()
	{
		form.getContextMenus().OCRR.hideAllClinicalOrdersResultsGridMenuMenuItems();
		ReferralAppointmentDetailsOrderInvestigationVo tempOrderInv = null;
		
		if (form.grdClinicalResults().getValue()!=null && form.grdClinicalResults().getValue().getOrderInvestigationIsNotNull())
		{
			tempOrderInv=domain.getReferralAppointmentDetailsOrderInv(form.grdClinicalResults().getValue().getOrderInvestigation());
		}
		
		//Scan/Import visible only if not Manually Resulted
		form.getContextMenus().OCRR.getClinicalOrdersResultsGridMenuSCANIMPORTItem().setVisible(form.grdClinicalResults().getRows().size()>0 && form.grdClinicalResults().getValue() != null 
				&& tempOrderInv!=null && OrderInvStatus.ORDERED.equals(tempOrderInv.getOrdInvCurrentStatus().getOrdInvStatus()));
		form.getContextMenus().OCRR.getClinicalOrdersResultsGridMenuVIEW_ORDERItem().setVisible(form.grdClinicalResults().getValue() != null);
		form.getContextMenus().OCRR.getClinicalOrdersResultsGridMenuVIEW_RESULTItem().setVisible(form.grdClinicalResults().getValue() != null && hasResults(form.grdClinicalResults().getSelectedRow()));

	}

	private boolean hasResults(grdClinicalResultsRow selectedRow)
	{
		ClinicalResultListVo res = (ClinicalResultListVo) selectedRow.getValue().getOrderInvestigation();
		return (res.getResultDetails() != null && res.getResultDetails() != null);
	}

	private boolean isSearchCriteriaValid()
	{
		ArrayList<String> errors = new ArrayList<String>();

		if (form.dteFrom().getValue() != null && form.dteTo().getValue() == null)
		{
			errors.add("A 'To' date must be entered.");
		}

		if (form.dteFrom().getValue() == null && form.dteTo().getValue() != null)
		{
			errors.add("A 'From' date must be entered.");
		}

		if (form.dteFrom().getValue() != null && form.dteTo().getValue() != null && form.dteFrom().getValue().isGreaterThan(form.dteTo().getValue()))
		{
			errors.add("'From' date must not be after 'To' date.");
		}

		if (errors.size() > 0)
		{
			String[] UIErrors = new String[errors.size()];
			errors.toArray(UIErrors);
			engine.showErrors(UIErrors);
			return false;
		}

		return true;
	}

	@Override
	protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearScreen();
		updateControlsState();
	}

	private void clearScreen()
	{
		form.dteFrom().setValue(null);
		form.dteTo().setValue(null);

		form.qmbClinician().clear();
		form.cmbDepartment().setValue(null);
		form.qmbInvestigation().setValue(null);

		form.grdClinicalResults().getRows().clear();
		form.grdClinicalResults().setFooterValue(null);

		form.Group1().setValue(Group1Enumeration.rdoAll);
		updateTotal();
	}

	@Override
	protected void onGrdClinicalImagingSelectionChanged()
	{	
		updateControlsState();
	}

	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException
	{
		
		switch (menuItemID)
		{
			case GenForm.ContextMenus.OCRRNamespace.ClinicalOrdersResultsGridMenu.SCANIMPORT:
				ReferralAppointmentDetailsOrderInvestigationVo tempReffAppDetOrderInv=null;
				if (form.grdClinicalResults().getValue()!=null && form.grdClinicalResults().getValue().getOrderInvestigationIsNotNull())
				{
					tempReffAppDetOrderInv=domain.getReferralAppointmentDetailsOrderInv(form.grdClinicalResults().getValue().getOrderInvestigation());
					
					String tempString = new String();
					tempString = "(" + ((tempReffAppDetOrderInv != null && tempReffAppDetOrderInv.getInvestigation() != null) ? tempReffAppDetOrderInv.getInvestigation().getID_Investigation() : "") +")";			
					form.getLocalContext().setinvIdList(tempString);
				}
				
				if (form.getLocalContext().getinvIdList()!=null)
				{
					form.getGlobalContext().OCRR.setReferralAppointmentDetailsOcsOrderVoCollection(domain.getRefAppDetOcsOrder(form.getLocalContext().getinvIdList(),form.getGlobalContext().Core.getPatientShort(),tempReffAppDetOrderInv));
				}
				
				engine.open(form.getForms().OCRR.ImportResultsDialog, new Object [] {tempReffAppDetOrderInv});
				
				break;
			case GenForm.ContextMenus.OCRRNamespace.ClinicalOrdersResultsGridMenu.VIEW_ORDER:
				viewSelectedOrder();
				break;

			case GenForm.ContextMenus.OCRRNamespace.ClinicalOrdersResultsGridMenu.VIEW_RESULT:
				viewResults();
				break;
		}

	}

	private String getInvId(ClinicalResultListVoCollection voCollResults)
	{
		if (voCollResults == null || voCollResults.size() == 0)
			return null;
		String temp = new String("(");
		for (int i = 0; i < voCollResults.size(); i++)
		{
			if (i < voCollResults.size() - 1)
				temp = temp + ((voCollResults.get(i) != null && voCollResults.get(i).getInvestigation() != null) ? voCollResults.get(i).getInvestigation().getID_Investigation() + "," : "");
			else
				temp = temp + ((voCollResults.get(i) != null && voCollResults.get(i).getInvestigation() != null) ? voCollResults.get(i).getInvestigation().getID_Investigation() : "");
		}
		temp += ")";
		return temp;
	}

	private void viewSelectedOrder()
	{
		form.getGlobalContext().OCRR.setCurrentPathRadResult(form.grdClinicalResults().getValue());
		ClinicalResultListVo res = (ClinicalResultListVo) form.grdClinicalResults().getValue().getOrderInvestigation();
		form.getGlobalContext().OCRR.PathologyResults.setOrder(res.getOrderDetails());
		form.getGlobalContext().OCRR.setLastUpdatedPathRadResult(null);

		if (AuthorisationOrderStatus.AWAITING_AUTHORISATION.equals(res.getOrderDetails().getAuthorisationOrderStatus()))
		{
			form.getGlobalContext().OCRR.setOrderAwaitingAuthorisation(res.getOrderDetails());
		}

		engine.open(form.getForms().OCRR.OrderSummaryDialog);
	}

	private void viewResults()
	{
		form.getGlobalContext().OCRR.setCurrentPathRadResult(form.grdClinicalResults().getValue());
		form.getGlobalContext().OCRR.setSelectedPathRadResults(form.getLocalContext().getResultCollectionFromGrid());//WDEV-16642
		form.getGlobalContext().OCRR.setLastUpdatedPathRadResult(null);
		engine.open(form.getForms().OCRR.ResultDialog, false);
	}

}
