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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.core.admin.domain.objects;

/**
 * 
 * @author Marius Mihalec
 * Generated.
 */


public class QueuedNotification extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1004100047;
	private static final long serialVersionUID = 1004100047L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}
	@Override
	public boolean canNeverBeAudited()
	{
		return true;
	}
	@Override
	public boolean shouldFireRules()
	{
		return false;
	}

	/** Date and Time */
	private java.util.Date dateTime;
	/** Message */
	private String message;
	/** Priority */
	private Integer priority;
	/** Entity Type */
	private String entityType;
	/** Entity Id */
	private Integer entityId;
	/** Source of notification */
	private String source;
	/** User Id */
	private Integer userId;
	/** Delivery Method */
	private Integer deliveryMethod;
    public QueuedNotification (Integer id, int ver)
    {
    	super(id, ver);
    }
    public QueuedNotification ()
    {
    	super();
    }
    public QueuedNotification (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.QueuedNotification.class;
	}


	public java.util.Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(java.util.Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		if ( null != entityType && entityType.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for entityType. Tried to set value: "+
				entityType);
		}
		this.entityType = entityType;
	}

	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		if ( null != source && source.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for source. Tried to set value: "+
				source);
		}
		this.source = source;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(Integer deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
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
		
		auditStr.append("\r\n*dateTime* :");
		auditStr.append(dateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*message* :");
		auditStr.append(message);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		auditStr.append(priority);
	    auditStr.append("; ");
		auditStr.append("\r\n*entityType* :");
		auditStr.append(entityType);
	    auditStr.append("; ");
		auditStr.append("\r\n*entityId* :");
		auditStr.append(entityId);
	    auditStr.append("; ");
		auditStr.append("\r\n*source* :");
		auditStr.append(source);
	    auditStr.append("; ");
		auditStr.append("\r\n*userId* :");
		auditStr.append(userId);
	    auditStr.append("; ");
		auditStr.append("\r\n*deliveryMethod* :");
		auditStr.append(deliveryMethod);
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
		
		String keyClassName = "QueuedNotification";
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
		if (this.getDateTime() != null)
		{
			sb.append("<dateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTime>");		
		}
		if (this.getMessage() != null)
		{
			sb.append("<message>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMessage().toString()));
			sb.append("</message>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriority().toString()));
			sb.append("</priority>");		
		}
		if (this.getEntityType() != null)
		{
			sb.append("<entityType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEntityType().toString()));
			sb.append("</entityType>");		
		}
		if (this.getEntityId() != null)
		{
			sb.append("<entityId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEntityId().toString()));
			sb.append("</entityId>");		
		}
		if (this.getSource() != null)
		{
			sb.append("<source>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSource().toString()));
			sb.append("</source>");		
		}
		if (this.getUserId() != null)
		{
			sb.append("<userId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUserId().toString()));
			sb.append("</userId>");		
		}
		if (this.getDeliveryMethod() != null)
		{
			sb.append("<deliveryMethod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDeliveryMethod().toString()));
			sb.append("</deliveryMethod>");		
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
			QueuedNotification domainObject = getQueuedNotificationfromXML(itemEl, factory, domMap);

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
			QueuedNotification domainObject = getQueuedNotificationfromXML(itemEl, factory, domMap);

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
		
	public static QueuedNotification getQueuedNotificationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getQueuedNotificationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static QueuedNotification getQueuedNotificationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!QueuedNotification.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!QueuedNotification.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the QueuedNotification class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (QueuedNotification)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(QueuedNotification.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		QueuedNotification ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (QueuedNotification)factory.getImportedDomainObject(QueuedNotification.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new QueuedNotification();
		}
		String keyClassName = "QueuedNotification";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (QueuedNotification)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, QueuedNotification obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateTime");
		if(fldEl != null)
		{	
    		obj.setDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("message");
		if(fldEl != null)
		{	
    		obj.setMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{	
    		obj.setPriority(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("entityType");
		if(fldEl != null)
		{	
    		obj.setEntityType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("entityId");
		if(fldEl != null)
		{	
    		obj.setEntityId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("source");
		if(fldEl != null)
		{	
    		obj.setSource(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("userId");
		if(fldEl != null)
		{	
    		obj.setUserId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("deliveryMethod");
		if(fldEl != null)
		{	
    		obj.setDeliveryMethod(new Integer(fldEl.getTextTrim()));	
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
		public static final String DateTime = "dateTime";
		public static final String Message = "message";
		public static final String Priority = "priority";
		public static final String EntityType = "entityType";
		public static final String EntityId = "entityId";
		public static final String Source = "source";
		public static final String UserId = "userId";
		public static final String DeliveryMethod = "deliveryMethod";
	}
}

