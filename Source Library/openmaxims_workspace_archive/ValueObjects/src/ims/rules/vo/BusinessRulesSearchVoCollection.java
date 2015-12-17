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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.rules.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;


public class BusinessRulesSearchVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<BusinessRulesSearchVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<BusinessRulesSearchVo> col = new ArrayList<BusinessRulesSearchVo>();
	public String getBoClassName()
	{
		return null;
	}
	public boolean add(BusinessRulesSearchVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, BusinessRulesSearchVo value)
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
	public int indexOf(BusinessRulesSearchVo instance)
	{
		return col.indexOf(instance);
	}
	public BusinessRulesSearchVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, BusinessRulesSearchVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(BusinessRulesSearchVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(BusinessRulesSearchVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		BusinessRulesSearchVoCollection clone = new BusinessRulesSearchVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((BusinessRulesSearchVo)this.col.get(x).clone());
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
	public BusinessRulesSearchVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public BusinessRulesSearchVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public BusinessRulesSearchVoCollection sort(SortOrder order)
	{
		return sort(new BusinessRulesSearchVoComparator(order));
	}
	public BusinessRulesSearchVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new BusinessRulesSearchVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public BusinessRulesSearchVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public BusinessRulesSearchVo[] toArray()
	{
		BusinessRulesSearchVo[] arr = new BusinessRulesSearchVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<BusinessRulesSearchVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class BusinessRulesSearchVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public BusinessRulesSearchVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public BusinessRulesSearchVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public BusinessRulesSearchVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			BusinessRulesSearchVo voObj1 = (BusinessRulesSearchVo)obj1;
			BusinessRulesSearchVo voObj2 = (BusinessRulesSearchVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.rules.vo.beans.BusinessRulesSearchVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.rules.vo.beans.BusinessRulesSearchVoBean[] getBeanCollectionArray()
	{
		ims.rules.vo.beans.BusinessRulesSearchVoBean[] result = new ims.rules.vo.beans.BusinessRulesSearchVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			BusinessRulesSearchVo vo = ((BusinessRulesSearchVo)col.get(i));
			result[i] = (ims.rules.vo.beans.BusinessRulesSearchVoBean)vo.getBean();
		}
		return result;
	}
	public static BusinessRulesSearchVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		BusinessRulesSearchVoCollection coll = new BusinessRulesSearchVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.rules.vo.beans.BusinessRulesSearchVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static BusinessRulesSearchVoCollection buildFromBeanCollection(ims.rules.vo.beans.BusinessRulesSearchVoBean[] beans)
	{
		BusinessRulesSearchVoCollection coll = new BusinessRulesSearchVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}