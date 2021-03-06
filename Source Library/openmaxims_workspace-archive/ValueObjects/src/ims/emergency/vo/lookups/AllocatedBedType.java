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

package ims.emergency.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class AllocatedBedType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public AllocatedBedType()
	{
		super();
	}
	public AllocatedBedType(int id)
	{
		super(id, "", true);
	}
	public AllocatedBedType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public AllocatedBedType(int id, String text, boolean active, AllocatedBedType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public AllocatedBedType(int id, String text, boolean active, AllocatedBedType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public AllocatedBedType(int id, String text, boolean active, AllocatedBedType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static AllocatedBedType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new AllocatedBedType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (AllocatedBedType)super.getParentInstance();
	}
	public AllocatedBedType getParent()
	{
		return (AllocatedBedType)super.getParentInstance();
	}
	public void setParent(AllocatedBedType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		AllocatedBedType[] typedChildren = new AllocatedBedType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (AllocatedBedType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof AllocatedBedType)
		{
			super.addChild((AllocatedBedType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof AllocatedBedType)
		{
			super.removeChild((AllocatedBedType)child);
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
		AllocatedBedTypeCollection result = new AllocatedBedTypeCollection();
		result.add(ECN);
		result.add(EXTERNAL);
		return result;
	}
	public static AllocatedBedType[] getNegativeInstances()
	{
		AllocatedBedType[] instances = new AllocatedBedType[2];
		instances[0] = ECN;
		instances[1] = EXTERNAL;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "ECN";
		negativeInstances[1] = "EXTERNAL";
		return negativeInstances;
	}
	public static AllocatedBedType getNegativeInstance(String name)
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
	public static AllocatedBedType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		AllocatedBedType[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1291053;
	public static final AllocatedBedType ECN = new AllocatedBedType(-2557, "Emergency Care Network (ECN)", true, null, null, Color.Default);
	public static final AllocatedBedType EXTERNAL = new AllocatedBedType(-2558, "External", true, null, null, Color.Default);
}
