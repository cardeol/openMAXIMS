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
 * Linked to Scheduling.FutureAppointmentStatus business object (ID: 1090100025).
 */
public class FutureAppointmentStatusRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<FutureAppointmentStatusRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<FutureAppointmentStatusRefVo> col = new ArrayList<FutureAppointmentStatusRefVo>();
	public final String getBoClassName()
	{
		return "ims.scheduling.domain.objects.FutureAppointmentStatus";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(FutureAppointmentStatusRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, FutureAppointmentStatusRefVo value)
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
	public int indexOf(FutureAppointmentStatusRefVo instance)
	{
		return col.indexOf(instance);
	}
	public FutureAppointmentStatusRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, FutureAppointmentStatusRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(FutureAppointmentStatusRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(FutureAppointmentStatusRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		FutureAppointmentStatusRefVoCollection clone = new FutureAppointmentStatusRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((FutureAppointmentStatusRefVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		return clone;
	}
	public boolean isValidated()
	{
		return true;
	}
	public String[] validate()
	{
		return null;
	}
	public FutureAppointmentStatusRefVo[] toArray()
	{
		FutureAppointmentStatusRefVo[] arr = new FutureAppointmentStatusRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public FutureAppointmentStatusRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public FutureAppointmentStatusRefVoCollection sort(SortOrder order)
	{
		return sort(new FutureAppointmentStatusRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public FutureAppointmentStatusRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<FutureAppointmentStatusRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class FutureAppointmentStatusRefVoComparator implements Comparator
	{
		private int direction = 1;
		public FutureAppointmentStatusRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public FutureAppointmentStatusRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			FutureAppointmentStatusRefVo voObj1 = (FutureAppointmentStatusRefVo)obj1;
			FutureAppointmentStatusRefVo voObj2 = (FutureAppointmentStatusRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}
