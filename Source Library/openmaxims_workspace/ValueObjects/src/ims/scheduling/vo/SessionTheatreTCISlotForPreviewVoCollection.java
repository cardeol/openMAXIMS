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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.scheduling.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to Scheduling.SessionTheatreTCISlot business object (ID: 1090100017).
 */
public class SessionTheatreTCISlotForPreviewVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<SessionTheatreTCISlotForPreviewVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<SessionTheatreTCISlotForPreviewVo> col = new ArrayList<SessionTheatreTCISlotForPreviewVo>();
	public String getBoClassName()
	{
		return "ims.scheduling.domain.objects.SessionTheatreTCISlot";
	}
	public boolean add(SessionTheatreTCISlotForPreviewVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, SessionTheatreTCISlotForPreviewVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(SessionTheatreTCISlotForPreviewVo instance)
	{
		return col.indexOf(instance);
	}
	public SessionTheatreTCISlotForPreviewVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, SessionTheatreTCISlotForPreviewVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(SessionTheatreTCISlotForPreviewVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(SessionTheatreTCISlotForPreviewVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		SessionTheatreTCISlotForPreviewVoCollection clone = new SessionTheatreTCISlotForPreviewVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((SessionTheatreTCISlotForPreviewVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public SessionTheatreTCISlotForPreviewVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public SessionTheatreTCISlotForPreviewVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public SessionTheatreTCISlotForPreviewVoCollection sort(SortOrder order)
	{
		return sort(new SessionTheatreTCISlotForPreviewVoComparator(order));
	}
	public SessionTheatreTCISlotForPreviewVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new SessionTheatreTCISlotForPreviewVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public SessionTheatreTCISlotForPreviewVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.scheduling.vo.SessionTheatreTCISlotRefVoCollection toRefVoCollection()
	{
		ims.scheduling.vo.SessionTheatreTCISlotRefVoCollection result = new ims.scheduling.vo.SessionTheatreTCISlotRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public SessionTheatreTCISlotForPreviewVo[] toArray()
	{
		SessionTheatreTCISlotForPreviewVo[] arr = new SessionTheatreTCISlotForPreviewVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<SessionTheatreTCISlotForPreviewVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class SessionTheatreTCISlotForPreviewVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public SessionTheatreTCISlotForPreviewVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public SessionTheatreTCISlotForPreviewVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public SessionTheatreTCISlotForPreviewVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			SessionTheatreTCISlotForPreviewVo voObj1 = (SessionTheatreTCISlotForPreviewVo)obj1;
			SessionTheatreTCISlotForPreviewVo voObj2 = (SessionTheatreTCISlotForPreviewVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.scheduling.vo.beans.SessionTheatreTCISlotForPreviewVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.scheduling.vo.beans.SessionTheatreTCISlotForPreviewVoBean[] getBeanCollectionArray()
	{
		ims.scheduling.vo.beans.SessionTheatreTCISlotForPreviewVoBean[] result = new ims.scheduling.vo.beans.SessionTheatreTCISlotForPreviewVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			SessionTheatreTCISlotForPreviewVo vo = ((SessionTheatreTCISlotForPreviewVo)col.get(i));
			result[i] = (ims.scheduling.vo.beans.SessionTheatreTCISlotForPreviewVoBean)vo.getBean();
		}
		return result;
	}
	public static SessionTheatreTCISlotForPreviewVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		SessionTheatreTCISlotForPreviewVoCollection coll = new SessionTheatreTCISlotForPreviewVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.scheduling.vo.beans.SessionTheatreTCISlotForPreviewVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static SessionTheatreTCISlotForPreviewVoCollection buildFromBeanCollection(ims.scheduling.vo.beans.SessionTheatreTCISlotForPreviewVoBean[] beans)
	{
		SessionTheatreTCISlotForPreviewVoCollection coll = new SessionTheatreTCISlotForPreviewVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
