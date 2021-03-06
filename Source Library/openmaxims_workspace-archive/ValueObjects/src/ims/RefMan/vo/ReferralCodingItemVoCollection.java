// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to RefMan.ReferralCodingItem business object (ID: 1096100038).
 */
public class ReferralCodingItemVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<ReferralCodingItemVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<ReferralCodingItemVo> col = new ArrayList<ReferralCodingItemVo>();
	public String getBoClassName()
	{
		return "ims.RefMan.domain.objects.ReferralCodingItem";
	}
	public boolean add(ReferralCodingItemVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, ReferralCodingItemVo value)
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
	public int indexOf(ReferralCodingItemVo instance)
	{
		return col.indexOf(instance);
	}
	public ReferralCodingItemVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, ReferralCodingItemVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(ReferralCodingItemVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(ReferralCodingItemVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		ReferralCodingItemVoCollection clone = new ReferralCodingItemVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((ReferralCodingItemVo)this.col.get(x).clone());
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
	public ReferralCodingItemVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public ReferralCodingItemVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public ReferralCodingItemVoCollection sort(SortOrder order)
	{
		return sort(new ReferralCodingItemVoComparator(order));
	}
	public ReferralCodingItemVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new ReferralCodingItemVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public ReferralCodingItemVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.RefMan.vo.ReferralCodingItemRefVoCollection toRefVoCollection()
	{
		ims.RefMan.vo.ReferralCodingItemRefVoCollection result = new ims.RefMan.vo.ReferralCodingItemRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public ReferralCodingItemVo[] toArray()
	{
		ReferralCodingItemVo[] arr = new ReferralCodingItemVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<ReferralCodingItemVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class ReferralCodingItemVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public ReferralCodingItemVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public ReferralCodingItemVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public ReferralCodingItemVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			ReferralCodingItemVo voObj1 = (ReferralCodingItemVo)obj1;
			ReferralCodingItemVo voObj2 = (ReferralCodingItemVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.ReferralCodingItemVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.ReferralCodingItemVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.ReferralCodingItemVoBean[] result = new ims.RefMan.vo.beans.ReferralCodingItemVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			ReferralCodingItemVo vo = ((ReferralCodingItemVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.ReferralCodingItemVoBean)vo.getBean();
		}
		return result;
	}
	public static ReferralCodingItemVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ReferralCodingItemVoCollection coll = new ReferralCodingItemVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.ReferralCodingItemVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static ReferralCodingItemVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.ReferralCodingItemVoBean[] beans)
	{
		ReferralCodingItemVoCollection coll = new ReferralCodingItemVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
