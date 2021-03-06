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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.medical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class MskJointMovement extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1023100022;
	private static final long serialVersionUID = 1023100022L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance moveType;
	private ims.domain.lookups.LookupInstance moveFinding;
	private Integer movSOR;
	private Integer movEOR;
	/** QualitativeRange */
	private ims.domain.lookups.LookupInstance qualitativeRange;
	/** Limited */
	private ims.domain.lookups.LookupInstance limited;
	/** isActive */
	private Boolean isActive;
	/** MoveAction ( Passive/Active) */
	private ims.domain.lookups.LookupInstance moveAction;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MskJointMovement (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MskJointMovement ()
    {
    	super();
    }
    public MskJointMovement (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.MskJointMovement.class;
	}


	public ims.domain.lookups.LookupInstance getMoveType() {
		return moveType;
	}
	public void setMoveType(ims.domain.lookups.LookupInstance moveType) {
		this.moveType = moveType;
	}

	public ims.domain.lookups.LookupInstance getMoveFinding() {
		return moveFinding;
	}
	public void setMoveFinding(ims.domain.lookups.LookupInstance moveFinding) {
		this.moveFinding = moveFinding;
	}

	public Integer getMovSOR() {
		return movSOR;
	}
	public void setMovSOR(Integer movSOR) {
		this.movSOR = movSOR;
	}

	public Integer getMovEOR() {
		return movEOR;
	}
	public void setMovEOR(Integer movEOR) {
		this.movEOR = movEOR;
	}

	public ims.domain.lookups.LookupInstance getQualitativeRange() {
		return qualitativeRange;
	}
	public void setQualitativeRange(ims.domain.lookups.LookupInstance qualitativeRange) {
		this.qualitativeRange = qualitativeRange;
	}

	public ims.domain.lookups.LookupInstance getLimited() {
		return limited;
	}
	public void setLimited(ims.domain.lookups.LookupInstance limited) {
		this.limited = limited;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.domain.lookups.LookupInstance getMoveAction() {
		return moveAction;
	}
	public void setMoveAction(ims.domain.lookups.LookupInstance moveAction) {
		this.moveAction = moveAction;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*moveType* :");
		if (moveType != null)
			auditStr.append(moveType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*moveFinding* :");
		if (moveFinding != null)
			auditStr.append(moveFinding.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*movSOR* :");
		auditStr.append(movSOR);
	    auditStr.append("; ");
		auditStr.append("\r\n*movEOR* :");
		auditStr.append(movEOR);
	    auditStr.append("; ");
		auditStr.append("\r\n*qualitativeRange* :");
		if (qualitativeRange != null)
			auditStr.append(qualitativeRange.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*limited* :");
		if (limited != null)
			auditStr.append(limited.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*moveAction* :");
		if (moveAction != null)
			auditStr.append(moveAction.getText());
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "MskJointMovement";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getMoveType() != null)
		{
			sb.append("<moveType>");
			sb.append(this.getMoveType().toXMLString()); 
			sb.append("</moveType>");		
		}
		if (this.getMoveFinding() != null)
		{
			sb.append("<moveFinding>");
			sb.append(this.getMoveFinding().toXMLString()); 
			sb.append("</moveFinding>");		
		}
		if (this.getMovSOR() != null)
		{
			sb.append("<movSOR>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMovSOR().toString()));
			sb.append("</movSOR>");		
		}
		if (this.getMovEOR() != null)
		{
			sb.append("<movEOR>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMovEOR().toString()));
			sb.append("</movEOR>");		
		}
		if (this.getQualitativeRange() != null)
		{
			sb.append("<qualitativeRange>");
			sb.append(this.getQualitativeRange().toXMLString()); 
			sb.append("</qualitativeRange>");		
		}
		if (this.getLimited() != null)
		{
			sb.append("<limited>");
			sb.append(this.getLimited().toXMLString()); 
			sb.append("</limited>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getMoveAction() != null)
		{
			sb.append("<moveAction>");
			sb.append(this.getMoveAction().toXMLString()); 
			sb.append("</moveAction>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			MskJointMovement domainObject = getMskJointMovementfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			MskJointMovement domainObject = getMskJointMovementfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static MskJointMovement getMskJointMovementfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMskJointMovementfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MskJointMovement getMskJointMovementfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MskJointMovement.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MskJointMovement.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MskJointMovement class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MskJointMovement)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MskJointMovement.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MskJointMovement ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MskJointMovement)factory.getImportedDomainObject(MskJointMovement.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MskJointMovement();
		}
		String keyClassName = "MskJointMovement";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MskJointMovement)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MskJointMovement obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("moveType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMoveType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("moveFinding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMoveFinding(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("movSOR");
		if(fldEl != null)
		{	
    		obj.setMovSOR(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("movEOR");
		if(fldEl != null)
		{	
    		obj.setMovEOR(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("qualitativeRange");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQualitativeRange(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("limited");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLimited(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("moveAction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMoveAction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String MoveType = "moveType";
		public static final String MoveFinding = "moveFinding";
		public static final String MovSOR = "movSOR";
		public static final String MovEOR = "movEOR";
		public static final String QualitativeRange = "qualitativeRange";
		public static final String Limited = "limited";
		public static final String IsActive = "isActive";
		public static final String MoveAction = "moveAction";
	}
}

