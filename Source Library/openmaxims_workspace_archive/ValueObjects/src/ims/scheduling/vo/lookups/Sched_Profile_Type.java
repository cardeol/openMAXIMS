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

package ims.scheduling.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class Sched_Profile_Type extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public Sched_Profile_Type()
	{
		super();
	}
	public Sched_Profile_Type(int id)
	{
		super(id, "", true);
	}
	public Sched_Profile_Type(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public Sched_Profile_Type(int id, String text, boolean active, Sched_Profile_Type parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public Sched_Profile_Type(int id, String text, boolean active, Sched_Profile_Type parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public Sched_Profile_Type(int id, String text, boolean active, Sched_Profile_Type parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static Sched_Profile_Type buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new Sched_Profile_Type(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (Sched_Profile_Type)super.getParentInstance();
	}
	public Sched_Profile_Type getParent()
	{
		return (Sched_Profile_Type)super.getParentInstance();
	}
	public void setParent(Sched_Profile_Type parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		Sched_Profile_Type[] typedChildren = new Sched_Profile_Type[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (Sched_Profile_Type)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof Sched_Profile_Type)
		{
			super.addChild((Sched_Profile_Type)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof Sched_Profile_Type)
		{
			super.removeChild((Sched_Profile_Type)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		Sched_Profile_TypeCollection result = new Sched_Profile_TypeCollection();
		result.add(SINGLE);
		result.add(MULTIPLE);
		return result;
	}
	public static Sched_Profile_Type[] getNegativeInstances()
	{
		Sched_Profile_Type[] instances = new Sched_Profile_Type[2];
		instances[0] = SINGLE;
		instances[1] = MULTIPLE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "SINGLE";
		negativeInstances[1] = "MULTIPLE";
		return negativeInstances;
	}
	public static Sched_Profile_Type getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static Sched_Profile_Type getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		Sched_Profile_Type[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1141000;
	public static final Sched_Profile_Type SINGLE = new Sched_Profile_Type(-538, "Single", true, null, null, Color.Default);
	public static final Sched_Profile_Type MULTIPLE = new Sched_Profile_Type(-539, "Multiple", true, null, null, Color.Default);
}