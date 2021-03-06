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

package ims.clinicaladmin.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class HotListFormType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public HotListFormType()
	{
		super();
	}
	public HotListFormType(int id)
	{
		super(id, "", true);
	}
	public HotListFormType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public HotListFormType(int id, String text, boolean active, HotListFormType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public HotListFormType(int id, String text, boolean active, HotListFormType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public HotListFormType(int id, String text, boolean active, HotListFormType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static HotListFormType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new HotListFormType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (HotListFormType)super.getParentInstance();
	}
	public HotListFormType getParent()
	{
		return (HotListFormType)super.getParentInstance();
	}
	public void setParent(HotListFormType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		HotListFormType[] typedChildren = new HotListFormType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (HotListFormType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof HotListFormType)
		{
			super.addChild((HotListFormType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof HotListFormType)
		{
			super.removeChild((HotListFormType)child);
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
		HotListFormTypeCollection result = new HotListFormTypeCollection();
		result.add(PROBLEMS);
		result.add(PROCEDURES);
		result.add(DIAGNOSES);
		return result;
	}
	public static HotListFormType[] getNegativeInstances()
	{
		HotListFormType[] instances = new HotListFormType[3];
		instances[0] = PROBLEMS;
		instances[1] = PROCEDURES;
		instances[2] = DIAGNOSES;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "PROBLEMS";
		negativeInstances[1] = "PROCEDURES";
		negativeInstances[2] = "DIAGNOSES";
		return negativeInstances;
	}
	public static HotListFormType getNegativeInstance(String name)
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
	public static HotListFormType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		HotListFormType[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1041000;
	public static final HotListFormType PROBLEMS = new HotListFormType(-897, "Problems", true, null, null, Color.Default);
	public static final HotListFormType PROCEDURES = new HotListFormType(-898, "Procedures", true, null, null, Color.Default);
	public static final HotListFormType DIAGNOSES = new HotListFormType(-899, "Diagnoses", true, null, null, Color.Default);
}
