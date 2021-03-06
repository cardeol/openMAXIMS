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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.55 build 2755.23108)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.oncology.domain.impl;

import ims.assessment.configuration.domain.objects.UserAssessment;
import ims.assessment.configuration.vo.UserAssessmentRefVo;
import ims.assessment.vo.UserAssessmentVo;
import ims.assessment.vo.domain.UserAssessmentVoAssembler;
import ims.clinical.domain.PatientSummary;
import ims.clinical.domain.impl.PatientSummaryImpl;
import ims.clinicaladmin.vo.OverallPrognosticGroupingLiteVoCollection;
import ims.clinicaladmin.vo.StagingClassificationLiteVoCollection;
import ims.clinicaladmin.vo.TNMStagingClassificationVersionLiteVoCollection;
import ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVo;
import ims.clinicaladmin.vo.TumourGroupListForPrimaryTumourDetailsVoCollection;
import ims.clinicaladmin.vo.TumourGroupLiteVoCollection;
import ims.clinicaladmin.vo.TumourGroupSiteOverallStagingVoCollection;
import ims.clinicaladmin.vo.TumourGroupVo;
import ims.clinicaladmin.vo.TumourSiteListForPrimaryTumourDetailsVo;
import ims.clinicaladmin.vo.TumourSiteVo;
import ims.clinicaladmin.vo.domain.OverallPrognosticGroupingLiteVoAssembler;
import ims.clinicaladmin.vo.domain.StagingClassificationLiteVoAssembler;
import ims.clinicaladmin.vo.domain.TNMStagingClassificationVersionLiteVoAssembler;
import ims.clinicaladmin.vo.domain.TumourGroupListForPrimaryTumourDetailsVoAssembler;
import ims.clinicaladmin.vo.domain.TumourGroupLiteVoAssembler;
import ims.clinicaladmin.vo.domain.TumourGroupSiteOverallStagingVoAssembler;
import ims.clinicaladmin.vo.domain.TumourGroupVoAssembler;
import ims.clinicaladmin.vo.domain.TumourSiteListForPrimaryTumourDetailsVoAssembler;
import ims.clinicaladmin.vo.domain.TumourSiteVoAssembler;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.admin.vo.EpisodeOfCareRefVo;
import ims.core.clinical.domain.objects.PatientDiagnosis;
import ims.core.clinical.vo.PatientDiagnosisRefVo;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.oncology.configuration.domain.objects.TumourGroup;
import ims.oncology.configuration.domain.objects.TumourSite;
import ims.oncology.configuration.vo.GleasonConfigRefVo;
import ims.oncology.configuration.vo.HistopathologicGradeRefVo;
import ims.oncology.configuration.vo.PSAConfigRefVo;
import ims.oncology.configuration.vo.PrognosticLocationConfigRefVo;
import ims.oncology.configuration.vo.PrognosticRiskConfigurationRefVo;
import ims.oncology.configuration.vo.TNMStagingClassificationVersionRefVo;
import ims.oncology.configuration.vo.TumourGroupRefVo;
import ims.oncology.configuration.vo.TumourGroupSiteTNMValueRefVo;
import ims.oncology.configuration.vo.TumourHistologyRefVo;
import ims.oncology.configuration.vo.TumourSerumMarkerRefVo;
import ims.oncology.configuration.vo.TumourSiteRefVo;
import ims.oncology.domain.base.impl.BaseTumourDetailsImpl;
import ims.oncology.domain.objects.PrimaryTumourDetails;
import ims.oncology.vo.PatientDiagnosisForPrimaryTumourVo;
import ims.oncology.vo.PrimaryTumourDetailsLiteVoCollection;
import ims.oncology.vo.PrimaryTumourDetailsRefVo;
import ims.oncology.vo.PrimaryTumourDetailsVo;
import ims.oncology.vo.PrimaryTumourDetailsWithIsCurrentVo;
import ims.oncology.vo.PrimaryTumourDetailsWithIsCurrentVoCollection;
import ims.oncology.vo.TumourGroupClassificationVoCollection;
import ims.oncology.vo.domain.PatientDiagnosisForPrimaryTumourVoAssembler;
import ims.oncology.vo.domain.PrimaryTumourDetailsLiteVoAssembler;
import ims.oncology.vo.domain.PrimaryTumourDetailsVoAssembler;
import ims.oncology.vo.domain.PrimaryTumourDetailsWithIsCurrentVoAssembler;
import ims.oncology.vo.lookups.PrognosticGroup;
import ims.oncology.vo.lookups.TumourOverallStage;

import java.util.ArrayList;
import java.util.List;

public class TumourDetailsImpl extends BaseTumourDetailsImpl
{
	private static final long serialVersionUID = 1L;

	/**
	 * List Primary Tumour Details records for provided EpisodeOfCare
	 * If an invalid EpisodeOfCare is provided (null or with no ID) will throw a DomainRuntimeException
	 */
	public PrimaryTumourDetailsLiteVoCollection listPrimaryTumours(EpisodeOfCareRefVo voRef)
	{
		// Check provided EpisodeOfCare record
		if (voRef == null || !voRef.getID_EpisodeOfCareIsNotNull())
			throw new DomainRuntimeException("Domain Logical Error - Can not list records after null EpisodeOfCare");
		
		// Set query
		String query = " from PrimaryTumourDetails as ptd where ptd.episodeOfCare.id = :ID order by ptd.authoringInformation.authoringDateTime desc";
		
		// Build parameter arrays
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		paramNames.add("ID");
		paramValues.add(voRef.getID_EpisodeOfCare());
		
		// Return collection of records
		return PrimaryTumourDetailsLiteVoAssembler.createPrimaryTumourDetailsLiteVoCollectionFromPrimaryTumourDetails(getDomainFactory().find(query, paramNames, paramValues));
	}
	
	/**
	 * Returns full details for provided record
	 * Will return NULL if no record (or record is not found in the database) is provided
	 */
	public PrimaryTumourDetailsVo getTumourDetails(PrimaryTumourDetailsRefVo tumourDetails)
	{
		if (tumourDetails == null || ! tumourDetails.getID_PrimaryTumourDetailsIsNotNull())
			return null;
		
		return PrimaryTumourDetailsVoAssembler.create((PrimaryTumourDetails) getDomainFactory().getDomainObject(PrimaryTumourDetails.class, tumourDetails.getID_PrimaryTumourDetails()));
	}

	
	/**
	 * Domain Interface function used to save Primary Tumour Details records
	 * 
	 * Will return the saved record
	 */
	public PrimaryTumourDetailsVo saveTumourDetails(PrimaryTumourDetailsVo tumourDetails, PrimaryTumourDetailsRefVo currentEditableRecord) throws DomainInterfaceException, StaleObjectException, ForeignKeyViolationException, UniqueKeyViolationException
	{
		if(tumourDetails == null)
			throw new CodingRuntimeException("Invalid record");

		if(!tumourDetails.isValidated())
			throw new CodingRuntimeException("Record not validated");
		
		DomainFactory factory = getDomainFactory();

		// Set is current to false to current Primary Tumour Details record
		if (currentEditableRecord != null && currentEditableRecord.getID_PrimaryTumourDetailsIsNotNull()
				&& !currentEditableRecord.getID_PrimaryTumourDetails().equals(tumourDetails.getID_PrimaryTumourDetails()))
		{
			PrimaryTumourDetails currentEditableDomainObject = (PrimaryTumourDetails) getDomainFactory().getDomainObject(PrimaryTumourDetails.class, currentEditableRecord.getID_PrimaryTumourDetails());
			
			currentEditableDomainObject.setIsCurrent(Boolean.FALSE);
			
			factory.save(currentEditableDomainObject);
		}
			
		PrimaryTumourDetails domainRecord = PrimaryTumourDetailsVoAssembler.extractPrimaryTumourDetails(factory, tumourDetails);		
		
		factory.save(domainRecord);		
		
		return PrimaryTumourDetailsVoAssembler.create(domainRecord);
	}

	/**
	 * Domain Interface function used to retrieve Patient Diagnosis based on passed record
	 */
	public PatientDiagnosisForPrimaryTumourVo getPatientDiagnosis(PatientDiagnosisRefVo diagnosis)
	{
		if (diagnosis == null || !diagnosis.getID_PatientDiagnosisIsNotNull())
			return null;
		
		return PatientDiagnosisForPrimaryTumourVoAssembler.create((PatientDiagnosis) getDomainFactory().getDomainObject(PatientDiagnosis.class, diagnosis.getID_PatientDiagnosis()));
	}

	/**
	 * Domain Interface function used to retrieve Tumour Versions records
	 */
	public TNMStagingClassificationVersionLiteVoCollection getVersions()
	{
		String query = "from TNMStagingClassificationVersion as vers where vers.status.id = :STATUS order by vers.systemInformation.creationDateTime desc";
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		paramNames.add("STATUS");
		paramValues.add(PreActiveActiveInactiveStatus.ACTIVE.getID());

		return TNMStagingClassificationVersionLiteVoAssembler.createTNMStagingClassificationVersionLiteVoCollectionFromTNMStagingClassificationVersion(getDomainFactory().find(query, paramNames, paramValues));
	}

	/**
	 * Domain Interface function used to retrieve Tumour Group records
	 * based on version and speciality
	 */
	public TumourGroupLiteVoCollection getTumourGroups(TNMStagingClassificationVersionRefVo version, Specialty speciality)
	{
		if (version == null || !version.getID_TNMStagingClassificationVersionIsNotNull())
			return null;
		
		if (speciality == null)
			return null;
		
		
		StringBuilder query = new StringBuilder();
		
		query.append("select grp from TumourCategoryVersionGroups as version left join version.groups as grp left join grp.associatedSpecialties as groupSpecialty");
		query.append(" left join groupSpecialty.associatedSpecialty as specialty ");
		query.append(" where version.tNMVersion.id = :VERSION_ID and specialty.id = :SPECIALTY_ID and groupSpecialty.isActive = 1 and grp.isActive = 1 order by grp.groupName asc");
		
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		paramNames.add("VERSION_ID");	paramValues.add(version.getID_TNMStagingClassificationVersion());
		paramNames.add("SPECIALTY_ID");	paramValues.add(speciality.getID());
		
		return TumourGroupLiteVoAssembler.createTumourGroupLiteVoCollectionFromTumourGroup(getDomainFactory().find(query.toString(), paramNames, paramValues));
	}

	/**
	 * Domain Interface function used to retrieve detailed Tumour Group record
	 */
	public TumourGroupListForPrimaryTumourDetailsVo getTumourGroupList(TumourGroupRefVo tumourGroupRef)
	{
		if (tumourGroupRef == null)
			return null;
		
		return TumourGroupListForPrimaryTumourDetailsVoAssembler.create((TumourGroup)getDomainFactory().getDomainObject(TumourGroup.class,tumourGroupRef.getID_TumourGroup()));
	}

	/**
	 * Domain Interface function used to retrieve detailed Tumour Site record
	 */
	public TumourSiteListForPrimaryTumourDetailsVo getTumourSiteList(TumourSiteRefVo tumourSiteRef)
	{
		if (tumourSiteRef == null)
			return null;
		
		return TumourSiteListForPrimaryTumourDetailsVoAssembler.create((TumourSite)getDomainFactory().getDomainObject(TumourSite.class,tumourSiteRef.getID_TumourSite()));
	}

	/**
	 * Domain Interface function used to retrieve a UserAssessment record
	 */
	public UserAssessmentVo getUserAssessment(UserAssessmentRefVo userAssessment)
	{
		if (userAssessment == null || !userAssessment.getID_UserAssessmentIsNotNull())
			return null;
		
		return UserAssessmentVoAssembler.create((UserAssessment) getDomainFactory().getDomainObject(UserAssessment.class, userAssessment.getID_UserAssessment()));
	}

	/**
	* listDiagnosesForEpisodeOfCare 
	*/
	public ims.core.vo.PatientDiagnosisShortVoCollection listDiagnosisComplicationEpisodeOfCare(ims.core.admin.vo.EpisodeOfCareRefVo episodeOfCareRefVo, Boolean isCancerDiagnosis)
	{
		// TODO: Add your code here and change the return value.
		return null;
	}
	
	public Integer countForGroupsConfiguredForEpisodeOfCareSpecialty(Specialty specialty) 
	{
		String hql ="";
		String[] strings = new String[] {"specialty", "isAct"};
		Object[] objects = null;
		
		hql = "select count(tg.id) from TumourGroup as tg left join tg.associatedSpecialties as tgs " +
		"where tgs.associatedSpecialty = :specialty and tg.isRIE is null and tgs.isActive = : isAct ";
		objects = new Object[] {getDomLookup(specialty), Boolean.TRUE};
		
		@SuppressWarnings("rawtypes")
		List find = getDomainFactory().find(hql, strings, objects);
		
		if(find.size() == 0)
			return 0;
						
		return ((Long)find.get(0)).intValue();
	}
	
	
	public TumourGroupListForPrimaryTumourDetailsVoCollection listTumourGroupForSpecialty(Specialty specialty) 
	{
		return listGroupForSpecialty(specialty);
	}
	
	public TumourGroupListForPrimaryTumourDetailsVoCollection listTumourGroupForSpecialty() 
	{
		return listGroupForSpecialty(null);
	}
	
	
	private TumourGroupListForPrimaryTumourDetailsVoCollection listGroupForSpecialty(Specialty specialty) 
	{
		String hql ="";
		String[] strings = new String[] {"specialty", "isAct"};
		Object[] objects = null;
		@SuppressWarnings("rawtypes")
		List find;
		
		if (specialty != null) 
		{
			hql = " select tg from TumourGroup as tg left join tg.associatedSpecialties as tgs where tgs.associatedSpecialty = :specialty and tg.isRIE is null and tgs.isActive = :isAct AND tg.isActive = :isAct order by tg.groupName asc";
			objects = new Object[] {getDomLookup(specialty), Boolean.TRUE};
			find = getDomainFactory().find(hql, strings, objects);
		}
		else
		{
			
			hql = " SELECT tg FROM TumourGroup AS tg WHERE tg.isRIE IS NULL AND tg.isActive = :isAct order by tg.groupName asc";
			String[] status = new String[]{"isAct"};
			objects = new Object[] {Boolean.TRUE};
			find = getDomainFactory().find(hql,status,objects);
		}
		
		return TumourGroupListForPrimaryTumourDetailsVoAssembler.createTumourGroupListForPrimaryTumourDetailsVoCollectionFromTumourGroup(find);
	}	
	
	public TumourGroupSiteOverallStagingVoCollection getOverall(
						TumourGroupRefVo group, TumourSiteListForPrimaryTumourDetailsVo site,
							TumourGroupSiteTNMValueRefVo tnmTypeT,
								TumourGroupSiteTNMValueRefVo tnmTypeN,
									TumourGroupSiteTNMValueRefVo tnmTypeM,
										TumourHistologyRefVo histology,
											HistopathologicGradeRefVo differentation, Boolean over45,
												TumourSerumMarkerRefVo serum)
	{
		
		DomainFactory factory = getDomainFactory();
		boolean bUseHisto = false;
		boolean bUseDiff = false;
		boolean bUseOver45 = false;
		boolean bUseSerum = false;
		
		if (group != null)
		{
			TumourGroup domainObject = (TumourGroup) factory.getDomainObject(group);
			TumourGroupVo voGroup = TumourGroupVoAssembler.create(domainObject);
			
			if (voGroup != null)
			{
				if (voGroup.getTnmRequiresHistoIsNotNull() 
					&& voGroup.getTnmRequiresHisto())
					bUseHisto = true;
				
				if (voGroup.getTnmRequiresDiffIsNotNull() 
					&& voGroup.getTnmRequiresDiff())
					bUseDiff = true;
				
				if (voGroup.getTnmRequiresOver45IsNotNull() 
					&& voGroup.getTnmRequiresOver45())
					bUseOver45 = true;
				
				if (voGroup.getTnmRequiresSMarkersIsNotNull() 
					&& voGroup.getTnmRequiresSMarkers())
					bUseSerum = true;
			}
		}
		if (site != null)
		{
			TumourSite domainObject = (TumourSite) factory.getDomainObject(site);
			TumourSiteVo voSite = TumourSiteVoAssembler.create(domainObject);
			
			if (voSite != null
				&& voSite.getHasSiteSpecificHistologyIsNotNull() 
				&& voSite.getHasSiteSpecificHistology())
				bUseHisto = true;
		}
		
		String hql = new String();
		hql = " select t1_1 from TumourGroupSiteOverallStaging as t1_1 left join t1_1.overallStageDescription as stageDesc ";

		StringBuffer condStr = new StringBuffer();
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		String andStr = " and ";
		String whereStr = "  where ";
		
		if (site != null && site.getHasSiteSpecificTNMIsNotNull() && site.getHasSiteSpecificTNM())
		{
			condStr.append("left join t1_1.tSite as t2_1");
		}
		else
		{
			condStr.append(" left join t1_1.tGroup as t2_1");
		}
		
		condStr.append(" left join t1_1.tVal as t3_1 left join t1_1.nVal as t4_1 left join t1_1.mVal as t5_1 ");
		
		if (bUseHisto && histology != null)
		{
			condStr.append(" left join t1_1.histVal as t6_1 left join t6_1.associatedHistology as assocHistology");
		}
		
		if (bUseDiff && differentation != null)
		{
			condStr.append(" left join t1_1.diffVal as t7_1");
		}
		
		if (bUseSerum && serum != null)
		{
			condStr.append(" left join t1_1.serumMarkerVal as t9_1");
		}
		
		if (site != null && site.getHasSiteSpecificTNMIsNotNull() && site.getHasSiteSpecificTNM())
		{
			condStr.append(whereStr + " t2_1.id = :idSite ");
			markers.add("idSite");
			values.add(site.getID_TumourSite());
		}
		else
		{
			condStr.append(whereStr + " t2_1.id = :idGroup ");
			markers.add("idGroup");
			values.add(group.getID_TumourGroup());
		}
		
		condStr.append(andStr + "t1_1.isActive = 1 and stageDesc.id <> :STAGE_TOBE_CONF and t3_1.id = :idTypeT and t4_1.id = :idTypeN and t5_1.id = :idTypeM");
		markers.add("STAGE_TOBE_CONF");
		values.add(TumourOverallStage.TOBECONFIGURED.getID());
		markers.add("idTypeT");
		values.add(tnmTypeT.getID_TumourGroupSiteTNMValue());
		markers.add("idTypeN");
		values.add(tnmTypeN.getID_TumourGroupSiteTNMValue());
		markers.add("idTypeM");
		values.add(tnmTypeM.getID_TumourGroupSiteTNMValue());
		
		if (bUseHisto && histology != null)
		{
			condStr.append(andStr + "assocHistology.id = :histology");
			markers.add("histology");
			values.add(histology.getID_TumourHistology());
		}
		
		if (bUseDiff && differentation != null)
		{
			condStr.append(andStr + "t7_1.tumourDifferentation.id = :differentation");
//			condStr.append(andStr + "t7_1.id = :differentation");
			markers.add("differentation");
			values.add(differentation.getID_HistopathologicGrade());
		}
		
		if (bUseOver45 && over45 != null)
		{
			condStr.append(andStr + "t1_1.o45 = :over45");
			markers.add("over45");
			if (over45)
				values.add("Y");
			else
				values.add("N");
		}
		
		if (bUseSerum && serum != null)
		{
			condStr.append(andStr + "t9_1.id = :serum");
			markers.add("serum");
			values.add(serum.getID_TumourSerumMarker());
		}
		
		hql += condStr.toString();
		
		return  TumourGroupSiteOverallStagingVoAssembler.createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(factory.find(hql,markers,values));
	}
	
	/**
	 * WDEV-13091
	 * Domain method used to retrieve Overall Staging for Site Specific
	 */
	public TumourGroupSiteOverallStagingVoCollection getOverallSiteSpecific(TumourGroupRefVo group, TumourSiteListForPrimaryTumourDetailsVo site, TumourGroupSiteTNMValueRefVo tnmTypeT, TumourGroupSiteTNMValueRefVo tnmTypeN, TumourGroupSiteTNMValueRefVo tnmTypeM)
	{
		StringBuilder query = new StringBuilder();
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		query.append("SELECT staging FROM TumourGroupSiteOverallStaging AS staging LEFT JOIN staging.tSite AS site ");
		query.append(" LEFT JOIN staging.tVal AS TVal LEFT JOIN staging.nVal AS NVal LEFT JOIN staging.mVal as MVal ");
		query.append(" LEFT JOIN staging.overallStageDescription as overall");
		query.append(" WHERE ");
		
		// Check for record to be active, not "To Be Configured", configured for this TumourSite
		query.append(" staging.isActive = 1 AND overall.id <> :TOBECONFIGURED AND site.id = :SITE_ID ");
		// Check for T, N, M values
		query.append(" AND TVal.id = :T_ID AND NVal.id = :N_ID AND MVal.id = :M_ID");
		
		paramNames.add("TOBECONFIGURED"); paramValues.add(TumourOverallStage.TOBECONFIGURED.getID());
		paramNames.add("SITE_ID"); paramValues.add(site.getID_TumourSite());
		paramNames.add("T_ID"); paramValues.add(tnmTypeT.getID_TumourGroupSiteTNMValue());
		paramNames.add("N_ID"); paramValues.add(tnmTypeN.getID_TumourGroupSiteTNMValue());
		paramNames.add("M_ID"); paramValues.add(tnmTypeM.getID_TumourGroupSiteTNMValue());
		
		return TumourGroupSiteOverallStagingVoAssembler.createTumourGroupSiteOverallStagingVoCollectionFromTumourGroupSiteOverallStaging(getDomainFactory().find(query.toString(), paramNames, paramValues));
	}

	public PrimaryTumourDetailsVo save(PrimaryTumourDetailsVo record) throws StaleObjectException 
	{
		if(record == null)
			throw new DomainRuntimeException("Invalid record");

		if(!record.isValidated())
			throw new CodingRuntimeException("Record not validated");
			
		DomainFactory factory = getDomainFactory();
		PrimaryTumourDetails domainRecord = PrimaryTumourDetailsVoAssembler.extractPrimaryTumourDetails(factory, record);		
		
		factory.save(domainRecord);		
		
		return PrimaryTumourDetailsVoAssembler.create(domainRecord);
	}
	
	public StagingClassificationLiteVoCollection getStagingClasificationCollection(TumourGroupClassificationVoCollection voRef) 
	{
		if(voRef == null)
			throw new DomainRuntimeException("Invalid Staging Classification");
		
		DomainFactory factory = getDomainFactory();
		StringBuilder hqlString = new StringBuilder("from StagingClassification sc");
		
		int size = voRef.size();
		if(size > 0)
		{
			hqlString.append(" where sc.id in (");
			boolean bActiveStagingFound = false;
			int nAddedCound = 0;
			for (int i = 0; i < voRef.size(); i++) 
			{
				if (voRef.get(i).getIsActiveIsNotNull() && voRef.get(i).getIsActive())
				{
					if(nAddedCound > 0 )
						hqlString.append(",");
					hqlString.append(voRef.get(i).getClassification().getID_StagingClassification());
					bActiveStagingFound = true;
					nAddedCound++;
				}
			}
		
			if(size > 0)
				hqlString.append(")");
		
			if (bActiveStagingFound)
			{
				@SuppressWarnings("rawtypes")
				List collection = factory.find(hqlString.toString());
				return StagingClassificationLiteVoAssembler.createStagingClassificationLiteVoCollectionFromStagingClassification(collection).sort();
			}
			else
				return null;
			
		}
		return null;
	}

	public PrimaryTumourDetailsWithIsCurrentVo getPrimaryTumourToSetAsNotCurrent(EpisodeOfCareRefVo voEpisodeOfCareRef,	PrimaryTumourDetailsRefVo voRefOfRecordToExclude) 
	{
		if(voEpisodeOfCareRef == null)
			throw new DomainRuntimeException("Invalid Primary Tumour");
		
		PrimaryTumourDetailsWithIsCurrentVoCollection coll = PrimaryTumourDetailsWithIsCurrentVoAssembler.createPrimaryTumourDetailsWithIsCurrentVoCollectionFromPrimaryTumourDetails(
				getDomainFactory().find("from  PrimaryTumourDetails as ptd where ptd.careContext.episodeOfCare.id = :id and ptd.isCurrent =:curr and ptd.id != :exid", 
				new String[] {"id", "curr", "exid"}, new Object[] {voEpisodeOfCareRef.getID_EpisodeOfCare(), Boolean.TRUE, voRefOfRecordToExclude.getID_PrimaryTumourDetails()}));
		
		if (coll != null && coll.size() > 0)
			return coll.get(0);
		
		return null;
	}

	public PrimaryTumourDetailsWithIsCurrentVo savePrimaryTumourToSetAsNotCurrent(PrimaryTumourDetailsWithIsCurrentVo record) throws StaleObjectException 
	{
		if(record == null)
			throw new DomainRuntimeException("Invalid record");

		if(!record.isValidated())
			throw new CodingRuntimeException("Record not validated");
			
		DomainFactory factory = getDomainFactory();
		PrimaryTumourDetails domainRecord = PrimaryTumourDetailsWithIsCurrentVoAssembler.extractPrimaryTumourDetails(factory, record);		
		
		factory.save(domainRecord);		
		
		return PrimaryTumourDetailsWithIsCurrentVoAssembler.create(domainRecord);
	}

	public OverallPrognosticGroupingLiteVoCollection getOverallPrognostic(TumourGroupRefVo group, TumourGroupSiteTNMValueRefVo valueT, TumourGroupSiteTNMValueRefVo valueN,
																	TumourGroupSiteTNMValueRefVo valueM, TumourHistologyRefVo histologyType,
																	HistopathologicGradeRefVo histopathologicGrade, PrognosticLocationConfigRefVo location,
																	PrognosticRiskConfigurationRefVo risk, PSAConfigRefVo psa, GleasonConfigRefVo gleason)
	{
		if (group == null)
			throw new DomainRuntimeException("Tumour Group must be passed to retrieve Overall Prognostic records");
		
		StringBuilder query = new StringBuilder();
		StringBuilder conditionString = new StringBuilder();
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		query.append("select overProg from PrognosticGrouping as overProg left join overProg.prognosticGroup as progGroup left join overProg.tGroup as grp ");
		conditionString.append(" where overProg.isActive = 1 and progGroup.id <> :PROG_TOBE_CONF and grp.id = :GRP_ID");
		
		paramNames.add("PROG_TOBE_CONF"); paramValues.add(PrognosticGroup.TOBECONFIGURED.getID());
		paramNames.add("GRP_ID"); paramValues.add(group.getID_TumourGroup());
		
		
		if (valueT != null && valueT.getID_TumourGroupSiteTNMValueIsNotNull())
		{
			query.append(" left join overProg.tVal as t ");
			conditionString.append(" and t.id = :T_ID");
			
			paramNames.add("T_ID"); paramValues.add(valueT.getID_TumourGroupSiteTNMValue());
		}
		
		if (valueN != null && valueN.getID_TumourGroupSiteTNMValueIsNotNull())
		{
			query.append(" left join overProg.nVal as n ");
			conditionString.append(" and n.id = :N_ID");
			
			paramNames.add("N_ID"); paramValues.add(valueN.getID_TumourGroupSiteTNMValue());
		}
		
		if (valueM != null && valueM.getID_TumourGroupSiteTNMValueIsNotNull())
		{
			query.append(" left join overProg.mVal as m ");
			conditionString.append(" and m.id = :M_ID");
			
			paramNames.add("M_ID"); paramValues.add(valueM.getID_TumourGroupSiteTNMValue());
		}
		
		if (histologyType != null && histologyType.getID_TumourHistologyIsNotNull())
		{
			query.append(" left join overProg.histVal as his left join his.associatedHistology as aHist ");
			conditionString.append(" and aHist.id = :HT_ID");
			
			paramNames.add("HT_ID"); paramValues.add(histologyType.getID_TumourHistology());
		}
		
		if (histopathologicGrade != null && histopathologicGrade.getID_HistopathologicGradeIsNotNull())
		{
			query.append(" left join overProg.diffVal as diff left join diff.tumourDifferentation as tDiff ");
			conditionString.append(" and tDiff.id = :HG_ID");
			
			paramNames.add("HG_ID"); paramValues.add(histopathologicGrade.getID_HistopathologicGrade());
		}
		
		if (location != null && location.getID_PrognosticLocationConfigIsNotNull())
		{
			query.append(" left join overProg.prognosticLocationVal as location ");
			conditionString.append(" and location.id = :LOC_ID");
			
			paramNames.add("LOC_ID"); paramValues.add(location.getID_PrognosticLocationConfig());
		}
		
		if (risk != null && risk.getID_PrognosticRiskConfigurationIsNotNull())
		{
			query.append(" left join overProg.prognosticRiskVal as risk ");
			conditionString.append(" and risk.id = :RISK_ID");
			
			paramNames.add("RISK_ID"); paramValues.add(risk.getID_PrognosticRiskConfiguration());
		}
		
		if (psa != null && psa.getID_PSAConfigIsNotNull())
		{
			query.append(" left join overProg.prognosticPSAVal as psa ");
			conditionString.append(" and psa.id = :PSA_ID");
			
			paramNames.add("PSA_ID"); paramValues.add(psa.getID_PSAConfig());
		}
		
		if (gleason != null && gleason.getID_GleasonConfigIsNotNull())
		{
			query.append(" left join overProg.prognosticGleasonVal as gleason ");
			conditionString.append(" and gleason.id = :GLEASON_ID");
			
			paramNames.add("GLEASON_ID"); paramValues.add(gleason.getID_GleasonConfig());
		}
		
		query.append(conditionString.toString());
		
		return OverallPrognosticGroupingLiteVoAssembler.createOverallPrognosticGroupingLiteVoCollectionFromPrognosticGrouping(getDomainFactory().find(query.toString(), paramNames, paramValues));
	}

	public String getPIDDiagnosisInfo(CareContextRefVo careContextRefVo, EpisodeOfCareRefVo episodeRefVo)
	{
		PatientSummary ps = (PatientSummary) getDomainImpl(PatientSummaryImpl.class);
		return ps.getPIDDiagnosisInfo(careContextRefVo, episodeRefVo, null);
	}

}
