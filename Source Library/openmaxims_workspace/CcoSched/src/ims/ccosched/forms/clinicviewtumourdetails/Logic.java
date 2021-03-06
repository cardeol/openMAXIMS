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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.22 build 41110.2000)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.ccosched.forms.clinicviewtumourdetails;

import ims.ccosched.vo.PatTrPlanGroupSiteTechVo;
import ims.ccosched.vo.PatTrPlanGroupSiteTechVoCollection;
import ims.ccosched.vo.PatTreatPlanActionVo;
import ims.ccosched.vo.PatTreatmentPlanLiteVo;
import ims.dto.Result;
import ims.dto.client.Lkup;
import ims.framework.enumerations.DialogResult;
import ims.oncology.vo.PrimaryTumourDetailsShortVo;

import java.util.Iterator;

public class Logic extends BaseLogicDTO
{
	protected void OnFormOpen() throws ims.framework.exceptions.FormOpenException
	{
		LoadLookups();
			/**
			 * WDEV-13470
			 */
			PrimaryTumourDetailsShortVo ptumdetVo = form.getGlobalContext().Oncology.getSelectedPrimaryTumourDetail();
			
			if (ptumdetVo != null)
			{
				if (ptumdetVo.getTumourGroupIsNotNull())
					form.TumourGroup().setValue(ptumdetVo.getTumourGroup().getGroupName());
				if (ptumdetVo.getTumourSiteIsNotNull())
					form.TumourSite().setValue(ptumdetVo.getTumourSite().getName());
				if (ptumdetVo.getTumourHistologyIsNotNull())
					form.TumourHistology().setValue(ptumdetVo.getTumourHistology().getHistologyDescription());
			}
//			form.TumourGroup().setValue(form.getGlobalContext().getPatTreatmentPlan().getPrimaryTumourGroupIsNotNull()?form.getGlobalContext().getPatTreatmentPlan().getPrimaryTumourGroup().getGroupName():"");
//			form.TumourSite().setValue(form.getGlobalContext().getPatTreatmentPlan().getPrimaryTumourSiteIsNotNull()?form.getGlobalContext().getPatTreatmentPlan().getPrimaryTumourSite().getName():"");
//			form.TumourHistology().setValue(form.getGlobalContext().getPatTreatmentPlan().getPrimaryTumourHistologyIsNotNull()?form.getGlobalContext().getPatTreatmentPlan().getPrimaryTumourHistology().getHistologyDescription():"");

			//Populate the grid
			PatTreatmentPlanLiteVo treatplVo = form.getGlobalContext().getPatTreatmentPlan();
			if (treatplVo != null  && treatplVo.getTreatmentSitesIsNotNull())
			{
				//for (Iterator iter = form.getGlobalContext().getPatTreatmentPlan().getTreatmentSites().iterator(); iter.hasNext();) {
				for (Iterator iter = form.getGlobalContext().getPatTreatmentPlan().getActions().iterator(); iter.hasNext();) 
				{
					PatTreatPlanActionVo action = (PatTreatPlanActionVo) iter.next();
					//TODO http://jira/browse/WDEV-13830
					if (action.getGroupSiteTechIsNotNull())
					{
						PatTrPlanGroupSiteTechVoCollection gst = action.getGroupSiteTech();
						for (int i=0; i<gst.size(); i++)
						{
							PatTrPlanGroupSiteTechVo value = gst.get(i);
							GenForm.TreatmentSiteRow row = form.TreatmentSite().getRows().newRow();
							row.setGroup(value.getTreatmentGroupSite().getParentInstance() != null ? value.getTreatmentGroupSite().getParentInstance().getText() : value.getTreatmentGroupSite().getText());
							row.setTreatmentSites(value.getTreatmentGroupSiteIsNotNull() && value.getTreatmentGroupSite().getParentInstance() != null ? value.getTreatmentGroupSite().getText():"");
							row.setTechnique(value.getTreatmentTechniqueIsNotNull() ? value.getTreatmentTechnique().getText() : "");
						}
					}
					//PatTrPlanGroupSiteTechVo element = (PatTrPlanGroupSiteTechVo) iter.next();
//					GenForm.TreatmentSiteRow row = form.TreatmentSite().getRows().newRow();
//					row.setGroup(element.getTreatmentGroupIsNotNull()?element.getTreatmentGroup().getName():"");
//					row.setTreatmentSites(element.getTreatmentSiteIsNotNull()?element.getTreatmentSite().getDescription():"");
//					row.setTechnique(element.getTreatmentTechniqueIsNotNull()?GetTechniqueLkupName(element.getTreatmentTechnique().getTechnique().toString()):"");
				}
			}
			
//replaced
//			//Do a get in Go_ptplactDTO
//			Go_ptplact actionDto = (Go_ptplact) domain.getDTOInstance(Go_ptplact.class);
//			actionDto.Filter.Pt_act_id = form.getGlobalContext().CcoSched.ClinicView.getActionId();
//			Result result = actionDto.get();
//			if(result != null)
//			{
//				engine.showMessage(result.getMessage());
//				return;
//			}
//
//			//Populate the grid
//			for(int i=0; i<actionDto.DataCollection.get(0).SeqnoCollection.count(); i++)
//			{
//				GenForm.TreatmentSiteRow row = form.TreatmentSite().getRows().newRow();
//				row.setGroup(actionDto.DataCollection.get(0).SeqnoCollection.get(i).Tgrouptxt);
//				row.setTreatmentSites(actionDto.DataCollection.get(0).SeqnoCollection.get(i).Txsitetxt);
//				row.setTechnique(GetTechniqueLkupName(actionDto.DataCollection.get(0).SeqnoCollection.get(i).Techniq));
//			}
//
//			//Do a get in Go_ptreatplDTO
//			if(!actionDto.DataCollection.get(0).Pt_tp_id.equals(""))
//			{
//				Go_ptreatpl trPlanDto = (Go_ptreatpl) domain.getDTOInstance(Go_ptreatpl.class);
//				trPlanDto.Filter.Unid = actionDto.DataCollection.get(0).Pt_tp_id;
//				result = trPlanDto.get();
//				if(result != null)
//				{
//					engine.showMessage(result.getMessage());
//					return;
//				}
//
//				//Populate details
//				form.TumourGroup().setValue(trPlanDto.DataCollection.get(0).Tumgrouptxt);
//				form.TumourSite().setValue(trPlanDto.DataCollection.get(0).Tumsitetxt);
//				form.TumourHistology().setValue(trPlanDto.DataCollection.get(0).Cshisttxt);
//			}
	}
	
	private void LoadLookups()
	{
		//Technique
		Lkup lookupDto =  form.getGlobalContext().CcoSched.TreatmentPlan.getTechnique();
		if (lookupDto == null)
		{
			lookupDto = (Lkup) domain.getDTOInstance(Lkup.class);
			lookupDto.Filter.clear();
			lookupDto.Filter.Lkup_typ = "3415";
			Result result = lookupDto.list();
			if (result != null)
			{
				engine.showMessage(result.getMessage());
				return;
			}
			
			form.getGlobalContext().CcoSched.TreatmentPlan.setTechnique(lookupDto);
		}
	}

	protected void OnOk() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.OK);
	}
}
