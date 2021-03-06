// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.65 build 3210.21225)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.RefMan.domain.impl;

import ims.RefMan.domain.ReferralOutcomeComponent;
import ims.RefMan.domain.ReferralWizard;
import ims.RefMan.domain.base.impl.BaseOnExaminationComponentImpl;
import ims.RefMan.domain.objects.OnExamination;
import ims.RefMan.domain.objects.ReferralOutcome;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.CatsReferralWizardVo;
import ims.RefMan.vo.CatsReportNoteVoCollection;
import ims.RefMan.vo.ConsultationClinicalNotesLiteVoCollection;
import ims.RefMan.vo.CorrespondenceNoteLiteVo;
import ims.RefMan.vo.CorrespondenceNoteLiteVoCollection;
import ims.RefMan.vo.DiagnosisManagementLiteVoCollection;
import ims.RefMan.vo.FollowUpNoteLiteVoCollection;
import ims.RefMan.vo.FurtherManagementDetailsVoCollection;
import ims.RefMan.vo.PrescriptionsLiteVoCollection;
import ims.RefMan.vo.ReferralDischargeVoCollection;
import ims.RefMan.vo.ReferralOutcomeLiteVoCollection;
import ims.RefMan.vo.ReferralOutcomeRefVo;
import ims.RefMan.vo.ReferralOutcomeVo;
import ims.RefMan.vo.ReferralOutcomeVoCollection;
import ims.RefMan.vo.TltSummaryNoteLiteVoCollection;
import ims.RefMan.vo.onExaminationVo;
import ims.RefMan.vo.onExaminationVoCollection;
import ims.RefMan.vo.domain.CatsReportNoteVoAssembler;
import ims.RefMan.vo.domain.ConsultationClinicalNotesLiteVoAssembler;
import ims.RefMan.vo.domain.CorrespondenceNoteLiteVoAssembler;
import ims.RefMan.vo.domain.DiagnosisManagementLiteVoAssembler;
import ims.RefMan.vo.domain.FollowUpNoteLiteVoAssembler;
import ims.RefMan.vo.domain.FurtherManagementDetailsVoAssembler;
import ims.RefMan.vo.domain.PrescriptionsLiteVoAssembler;
import ims.RefMan.vo.domain.ReferralDischargeVoAssembler;
import ims.RefMan.vo.domain.ReferralOutcomeLiteVoAssembler;
import ims.RefMan.vo.domain.ReferralOutcomeVoAssembler;
import ims.RefMan.vo.domain.TltSummaryNoteLiteVoAssembler;
import ims.RefMan.vo.domain.onExaminationVoAssembler;
import ims.RefMan.vo.lookups.FollowupManagementType;
import ims.RefMan.vo.lookups.ReportNoteStatus;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.OrgLiteVoCollection;
import ims.core.vo.PatientDocumentLiteVoCollection;
import ims.core.vo.domain.PatientDocumentLiteVoAssembler;
import ims.core.vo.enums.UploadDocumentStoreLevel;
import ims.core.vo.lookups.DocumentCategory;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.CodingRuntimeException;
import ims.ocrr.orderingresults.domain.objects.OrderInvestigation;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVo;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OnExaminationComponentImpl extends BaseOnExaminationComponentImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.HcpLiteVoCollection listHCP(String name) throws ims.domain.exceptions.StaleObjectException
	{
		// TODO: Add your code here and change the return value.
		return null;
	}

	public onExaminationVo saveOnExamination(onExaminationVo voOnExamination) throws StaleObjectException 
	{
		if(voOnExamination == null)
			throw new CodingRuntimeException("Invalid voOnExamination");
		if(!voOnExamination.isValidated())
			throw new CodingRuntimeException("voOnExamination not validated");
		
		DomainFactory factory = getDomainFactory();
		OnExamination domainObject = onExaminationVoAssembler.extractOnExamination(factory, voOnExamination);
		
		factory.save(domainObject);
		
		return onExaminationVoAssembler.create(domainObject);
	}

	public onExaminationVo getOnExamination(CatsReferralRefVo voCATSReferralRef) 
	{
		if(voCATSReferralRef != null)
		{
			DomainFactory factory = getDomainFactory();
			StringBuffer hql = new StringBuffer(" from OnExamination onEx where "); 
			String andStr = " ";
		
			ArrayList<String> markers = new ArrayList<String>();
			ArrayList<Serializable> values = new ArrayList<Serializable>();
		
			hql.append(andStr + " onEx.catsReferral.id = :cats");
 			markers.add("cats");
			values.add(voCATSReferralRef.getID_CatsReferral());
			andStr = " and ";	

			List listAdditional = factory.find(hql.toString(), markers,values);
			if(listAdditional != null && listAdditional.size() > 0)
			{ 
				onExaminationVoCollection voColl = onExaminationVoAssembler.createonExaminationVoCollectionFromOnExamination(listAdditional);
				if(voColl != null && voColl.size() > 0)
					return voColl.get(0);
			}
		}
		return null;
	}
	
	public String[] getSystemReportAndTemplate(Integer imsId)
	{
		String[] result = null;		
		DomainFactory factory = getDomainFactory();
		
		List lst = factory.find("select r1_1.reportXml, t1_1.templateXml, r1_1.reportName, r1_1.reportDescription, t1_1.name, t1_1.description from ReportBo as r1_1 left join r1_1.templates as t1_1 where (r1_1.imsId= :imsid) order by t1_1.name", new String[] {"imsid"}, new Object[] {imsId});
		
		if(lst.iterator().hasNext())
		{
			Object[] obj = (Object[])lst.iterator().next();
			
			result = new String[] {(String)obj[0], (String)obj[1], (String)obj[2], (String)obj[3], (String)obj[4], (String)obj[5]};
		}
		
		return result;
	}
	
	public ConsultationClinicalNotesLiteVoCollection getConsultationClinicalNotes(ims.RefMan.vo.CatsReferralRefVo refVoCatsReferral)
	{
		if(refVoCatsReferral == null || refVoCatsReferral.getID_CatsReferral() == null) {
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" from ConsultationClinicalNotes ccn"); 
	
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
	
		hql.append(" where ccn.catsReferral.id = :catsId");
		
		markers.add("catsId");
		values.add(refVoCatsReferral.getID_CatsReferral());
		
		List listNotes = factory.find(hql.toString(), markers,values);
		if(listNotes != null && listNotes.size() > 0)
		{ 
			ConsultationClinicalNotesLiteVoCollection voColl = ConsultationClinicalNotesLiteVoAssembler.createConsultationClinicalNotesLiteVoCollectionFromConsultationClinicalNotes(listNotes);			
			return voColl;
		}
		return null;
		
	}
	
	public DiagnosisManagementLiteVoCollection getDiagnosisManagement(ims.RefMan.vo.CatsReferralRefVo refVoCatsReferral)
	{
		if(refVoCatsReferral == null || refVoCatsReferral.getID_CatsReferral() == null) {
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" from DiagnosisManagement dm"); 
	
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
	
		hql.append(" where dm.catsReferral.id = :dmId");
		
		markers.add("dmId");
		values.add(refVoCatsReferral.getID_CatsReferral());
		
		List listNotes = factory.find(hql.toString(), markers,values);
		if(listNotes != null && listNotes.size() > 0)
		{ 
			DiagnosisManagementLiteVoCollection voColl = DiagnosisManagementLiteVoAssembler.createDiagnosisManagementLiteVoCollectionFromDiagnosisManagement(listNotes);			
			return voColl;
		}
		return null;
	}
	
	public PrescriptionsLiteVoCollection getPrescription(ims.RefMan.vo.CatsReferralRefVo refVoCatsReferral)
	{
		if(refVoCatsReferral == null || refVoCatsReferral.getID_CatsReferral() == null) {
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select prescriptions from ReferralOutcome as ro join ro.catsReferral as cats join ro.prescriptions as prescriptions ");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		hql.append("  where cats.id = :idCatsRefferal");
		names.add("idCatsRefferal");
		values.add(refVoCatsReferral.getID_CatsReferral());	
				
		List result = factory.find(hql.toString(),names,values);
		
		if (result != null && result.size() > 0) {
			return PrescriptionsLiteVoAssembler.createPrescriptionsLiteVoCollectionFromPrescription(result);
		}
		
		return null;
	}
	
	public ReferralOutcomeLiteVoCollection getReferralOutcome(CatsReferralRefVo refVoCatsReferral) 
	{
		if(refVoCatsReferral == null || refVoCatsReferral.getID_CatsReferral() == null) {
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" from ReferralOutcome ro where "); 
		String andStr = " ";
	
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
	
		hql.append(andStr + " ro.catsReferral.id = :cats");
		markers.add("cats");
		values.add(refVoCatsReferral.getID_CatsReferral());
		andStr = " and ";	

		List listAdditional = factory.find(hql.toString(), markers,values);
		if(listAdditional != null && listAdditional.size() > 0)
		{ 
			return ReferralOutcomeLiteVoAssembler.createReferralOutcomeLiteVoCollectionFromReferralOutcome(listAdditional);
			
		}
		
		return null;
	}
	public ReferralDischargeVoCollection getReferralDischarge(ReferralOutcomeRefVo refVo) 
	{		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select discharge from ReferralOutcome ro right join ro.referralDischargeHistory as discharge where "); 
		String  andStr = " ";
	
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
	
		hql.append(andStr + " ro.id = :outcomeId");
			markers.add("outcomeId");
		values.add(refVo.getID_ReferralOutcome());
		andStr = " and ";

		List listAdditional = factory.find(hql.toString(), markers,values);
		if(listAdditional != null && listAdditional.size() > 0)
		{
			ReferralDischargeVoCollection voDischargeColl = ReferralDischargeVoAssembler.createReferralDischargeVoCollectionFromDischargeOutcome(listAdditional);
			return voDischargeColl;
		}
		
		return null;
	}
	
	public FurtherManagementDetailsVoCollection getFurtherManagement(ReferralOutcomeRefVo refVo) 
	{		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select fm from ReferralOutcome ro join ro.furtherManagementDetails as fm where "); 
		String  andStr = " ";
	
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
	
		hql.append(andStr + " ro.id = :outcomeId");
			markers.add("outcomeId");
		values.add(refVo.getID_ReferralOutcome());
		andStr = " and ";

		List listAdditional = factory.find(hql.toString(), markers,values);
		if(listAdditional != null && listAdditional.size() > 0)
		{
			FurtherManagementDetailsVoCollection vofurtherManagementColl = FurtherManagementDetailsVoAssembler.createFurtherManagementDetailsVoCollectionFromFurtherManagement(listAdditional);
			return vofurtherManagementColl;
		}
		
		return null;
	}
	
	public FollowUpNoteLiteVoCollection getFollowUpNotes(ims.RefMan.vo.CatsReferralRefVo catsRefVo)
	{
		if(catsRefVo == null || catsRefVo.getID_CatsReferral() == null) {
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select notes from FollowUpNote as notes left join notes.catsReferral as cats ");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		hql.append("  where cats.id = :idCatsRefferal ");
		names.add("idCatsRefferal");
		values.add(catsRefVo.getID_CatsReferral());	
				
		List result = factory.find(hql.toString(),names,values);
		
		if (result != null && result.size() > 0) {
			FollowUpNoteLiteVoCollection voColl = FollowUpNoteLiteVoAssembler.createFollowUpNoteLiteVoCollectionFromFollowUpNote(result);
			if(voColl != null && voColl.size() > 0) 
			{
				voColl.sort(SortOrder.DESCENDING);
				return voColl;
			}
		}
		
		return null;
	}
	
	public CorrespondenceNoteLiteVoCollection getReportNote(ims.RefMan.vo.CatsReferralRefVo catsRefVo)
	{
		if(catsRefVo == null || catsRefVo.getID_CatsReferral() == null) {
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select notes from ReportNote as notes left join notes.catsReferral as cats left join notes.noteStatus as status");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		hql.append("  where cats.id = :idCatsRefferal");
		names.add("idCatsRefferal");
		values.add(catsRefVo.getID_CatsReferral());	
		
		hql.append("  and status.id in ( " + ReportNoteStatus.PREVIEW.getID() + ")");		
		
		List result = factory.find(hql.toString(),names,values);
		
		if (result != null && result.size() > 0) {
			 CorrespondenceNoteLiteVoCollection voColl = CorrespondenceNoteLiteVoAssembler.createCorrespondenceNoteLiteVoCollectionFromReportNote(result);
			if(voColl != null && voColl.size() > 0) 
			{
				voColl.sort(SortOrder.DESCENDING);
				return voColl;
			}
		}
		
		return null;
	}
	
	public ims.RefMan.vo.TltSummaryNoteLiteVoCollection getTLTSummaryNotes(ims.RefMan.vo.CatsReferralRefVo catsRefVo)
	{
		if(catsRefVo == null || catsRefVo.getID_CatsReferral() == null) {
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select notes from TltSummaryNote as notes left join notes.catsReferral as cats ");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		hql.append("  where cats.id = :idCatsRefferal");
		names.add("idCatsRefferal");
		values.add(catsRefVo.getID_CatsReferral());	
				
		List result = factory.find(hql.toString(),names,values);
		
		if (result != null && result.size() > 0) {
			TltSummaryNoteLiteVoCollection voColl = TltSummaryNoteLiteVoAssembler.createTltSummaryNoteLiteVoCollectionFromTltSummaryNote(result);
			if(voColl != null && voColl.size() > 0) 
			{
				voColl.sort(SortOrder.DESCENDING);
				return voColl;
			}
		}		
		
		return null;
	}

	public ims.RefMan.vo.CatsReportNoteVoCollection getCatsReportNote(ims.RefMan.vo.CatsReferralRefVo catsRefVo)
	{
		if(catsRefVo == null || catsRefVo.getID_CatsReferral() == null) {
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select notes from CatsReportNote as notes left join notes.catsReferral as cats ");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		hql.append("  where cats.id = :idCatsRefferal");
		names.add("idCatsRefferal");
		values.add(catsRefVo.getID_CatsReferral());	
				
		List result = factory.find(hql.toString(),names,values);
		
		if (result != null && result.size() > 0) {
			CatsReportNoteVoCollection voColl = CatsReportNoteVoAssembler.createCatsReportNoteVoCollectionFromCatsReportNote(result);
			if(voColl != null && voColl.size() > 0) 
			{
				voColl.sort(SortOrder.DESCENDING);
				return voColl;
			}
		}		
		
		return null;
	}
	
	public PatientDocumentLiteVoCollection listPatientDocuments(PatientRefVo patient, CareContextRefVo context,DocumentCategory documentCategory, CatsReferralRefVo refVo, UploadDocumentStoreLevel level) 
	{
		if(patient == null || 
				(patient != null && patient.getID_Patient() == null))
					throw new DomainRuntimeException("Cannot get PatientDocumentVoCollection for null PatientRefVo");
		
		if (level == null)
			throw new DomainRuntimeException("Document Store Level cannot be null");
		
		DomainFactory factory = getDomainFactory();
		String mainHql = ""; 
		String hql = "";
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();
		String andStr = " where ";
		
		if (level.equals(UploadDocumentStoreLevel.REFERRAL))
		{
			if (refVo != null) {
				mainHql = "select pd from CatsReferral catsref ";
				mainHql +=(" left join catsref.referralDocuments as pd ");
				andStr = " where ";			
				
				hql += (andStr + " catsref.id = :idCatsRef ");
				markers.add("idCatsRef");
				values.add(refVo.getID_CatsReferral());
				andStr = " and ";
				
				mainHql +=(" left join pd.patient as p");
				hql += andStr + " p.id = :idPatient ";
				markers.add("idPatient");
				values.add(patient.getID_Patient());				
			}
			else {
				return null;
			}
		}
		else if (level.equals(UploadDocumentStoreLevel.CARECONTEXT))
		{
			mainHql = "select pd from PatientDocument pd ";			
			mainHql +=(" left join pd.patient as p");
			hql += andStr + " p.id = :idPatient ";
			markers.add("idPatient");
			values.add(patient.getID_Patient());
			
			if (context != null)
			{
				andStr = " and ";
				hql += andStr + " pd.careContext.id = :idCareContext";
				markers.add("idCareContext");
				values.add(context.getID_CareContext());
			}			
		}
		else if (level.equals(UploadDocumentStoreLevel.PATIENT))
		{
			mainHql = "select pd from PatientDocument pd ";			
			mainHql +=(" left join pd.patient as p");
			hql += andStr + " p.id = :idPatient ";
			markers.add("idPatient");
			values.add(patient.getID_Patient());
		}
				
		mainHql += hql;
		List documents = factory.find(mainHql,markers,values);					
		return PatientDocumentLiteVoAssembler.createPatientDocumentLiteVoCollectionFromPatientDocument(documents);	
	}

	public ReferralOutcomeVo getReferralOutcomeFullVo(CatsReferralRefVo catsRefVo) 
	{
		if(catsRefVo == null || catsRefVo.getID_CatsReferral() == null) 
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer(" from ReferralOutcome ro where "); 
		String andStr = " ";
	
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
	
		hql.append(andStr + " ro.catsReferral.id = :cats");
		markers.add("cats");
		values.add(catsRefVo.getID_CatsReferral());
		andStr = " and ";	

		List listAdditional = factory.find(hql.toString(), markers,values);
		if(listAdditional != null && listAdditional.size() > 0)
		{
			ReferralOutcomeVoCollection voColl = ReferralOutcomeVoAssembler.createReferralOutcomeVoCollectionFromReferralOutcome(listAdditional).sort(SortOrder.DESCENDING);
			return voColl.get(0);
		}
		
		return null;
	}

	public ReferralOutcomeVo saveReferralOutcome(ReferralOutcomeVo voReferralOutcome) throws StaleObjectException 
	{
		if(voReferralOutcome == null)
			throw new CodingRuntimeException("Invalid voReferralOutcome");
		if(!voReferralOutcome.isValidated())
			throw new CodingRuntimeException("voReferralOutcome not validated");
		
		DomainFactory factory = getDomainFactory();
		ReferralOutcome domainObject = ReferralOutcomeVoAssembler.extractReferralOutcome(factory, voReferralOutcome);
		
		factory.save(domainObject);
		
		return ReferralOutcomeVoAssembler.create(domainObject);
	}

	public OrgLiteVoCollection listAllSuppliers() 
	{
		ReferralOutcomeComponent impl = (ReferralOutcomeComponent) getDomainImpl(ReferralOutcomeComponentImpl.class);
		return impl.listAllSuppliers();
	}

	public CatsReferralWizardVo getCatsReferral(CatsReferralRefVo voCatsRef)
	{
		ReferralWizard impl = (ReferralWizard) getDomainImpl(ReferralWizardImpl.class);
		return impl.getCatsReferral(voCatsRef);
	}

	public CatsReferralWizardVo saveCatsReferral(CatsReferralWizardVo record) throws DomainInterfaceException, StaleObjectException 
	{
		ReferralWizard impl = (ReferralWizard) getDomainImpl(ReferralWizardImpl.class);
		return impl.saveCatsReferral(record);
	}

	public Boolean isThereFurtherManagementOfTypeTLT(CatsReferralRefVo voCatsRef)
	{
		if(voCatsRef == null || voCatsRef.getID_CatsReferral() == null) 
			throw new CodingRuntimeException("CatsReferralVo is null or id not provided");
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from ReferralOutcome as ro left join ro.furtherManagementDetails as fmd ");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Serializable> values = new ArrayList<Serializable>();
		
		hql.append("  where ro.catsReferral.id = :idCatsRefferal");
		names.add("idCatsRefferal");
		values.add(voCatsRef.getID_CatsReferral());	
				
		hql.append("  and fmd.followupType = :fut");
		names.add("fut");
		values.add(getDomLookup(FollowupManagementType.TLT));	
				
		List result = factory.find(hql.toString(),names,values);
		
		if (result != null && result.size() > 0) 
			return true;

		return false;
	}

	/**
	 * WDEV-12345
	 * Retrieve OrderInvestigations records associated to ReferralOutcoem record corresponding to CATS Referral record
	 */
	public OrderInvestigationRefVoCollection listInvestigations(CatsReferralRefVo referral)
	{
		// Test referral parameter
		if (referral == null || !referral.getID_CatsReferralIsNotNull())
			return null;
		
		
		// Build query to retrieve  Investigations  associated to  ReferralOutcome  record corresponding to  CATS Referral record
		String query = "select investigation from ReferralOutcome as refOut left join refOut.referralDischarge as dis join dis.resultsForReport as investigation where refOut.catsReferral.id = :ID";
		// Query database for investigations
		List<?> investigationsList = getDomainFactory().find(query, "ID", referral.getID_CatsReferral());
		
		// Create collection for results
		OrderInvestigationRefVoCollection resultsCollection = new OrderInvestigationRefVoCollection();
		
		// Iterate investigations returned by database query
		Iterator<?> investigationIterator = investigationsList.iterator();
		
		while (investigationIterator.hasNext())
		{
			OrderInvestigation investigation = (OrderInvestigation) investigationIterator.next();
			
			// Create OrderInvestigationRefVo
			OrderInvestigationRefVo investigationRef = new OrderInvestigationRefVo(investigation.getId(), investigation.getVersion());
			// Add OrderInvestigationRefVo to results
			resultsCollection.add(investigationRef);
		}
		
		// Results
		return resultsCollection;
	}
}
