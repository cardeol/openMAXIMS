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
 * Linked to RefMan.TCIForPatientElectiveList business object (ID: 1096100064).
 */
public class PatientElectiveListTCIVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<PatientElectiveListTCIVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<PatientElectiveListTCIVo> col = new ArrayList<PatientElectiveListTCIVo>();
	public String getBoClassName()
	{
		return "ims.RefMan.domain.objects.TCIForPatientElectiveList";
	}
	public boolean add(PatientElectiveListTCIVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, PatientElectiveListTCIVo value)
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
	public int indexOf(PatientElectiveListTCIVo instance)
	{
		return col.indexOf(instance);
	}
	public PatientElectiveListTCIVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, PatientElectiveListTCIVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(PatientElectiveListTCIVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(PatientElectiveListTCIVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		PatientElectiveListTCIVoCollection clone = new PatientElectiveListTCIVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((PatientElectiveListTCIVo)this.col.get(x).clone());
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
	public PatientElectiveListTCIVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public PatientElectiveListTCIVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public PatientElectiveListTCIVoCollection sort(SortOrder order)
	{
		return sort(new PatientElectiveListTCIVoComparator(order));
	}
	public PatientElectiveListTCIVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new PatientElectiveListTCIVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public PatientElectiveListTCIVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection toRefVoCollection()
	{
		ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection result = new ims.RefMan.vo.TCIForPatientElectiveListRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public PatientElectiveListTCIVo[] toArray()
	{
		PatientElectiveListTCIVo[] arr = new PatientElectiveListTCIVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<PatientElectiveListTCIVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class PatientElectiveListTCIVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public PatientElectiveListTCIVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public PatientElectiveListTCIVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public PatientElectiveListTCIVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			PatientElectiveListTCIVo voObj1 = (PatientElectiveListTCIVo)obj1;
			PatientElectiveListTCIVo voObj2 = (PatientElectiveListTCIVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.PatientElectiveListTCIVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.PatientElectiveListTCIVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.PatientElectiveListTCIVoBean[] result = new ims.RefMan.vo.beans.PatientElectiveListTCIVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			PatientElectiveListTCIVo vo = ((PatientElectiveListTCIVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.PatientElectiveListTCIVoBean)vo.getBean();
		}
		return result;
	}
	public static PatientElectiveListTCIVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		PatientElectiveListTCIVoCollection coll = new PatientElectiveListTCIVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.PatientElectiveListTCIVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static PatientElectiveListTCIVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.PatientElectiveListTCIVoBean[] beans)
	{
		PatientElectiveListTCIVoCollection coll = new PatientElectiveListTCIVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}