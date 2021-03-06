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

package ims.clinical.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class LeftAndRightSideCheckedAndCorrectSideMarked extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public LeftAndRightSideCheckedAndCorrectSideMarked()
	{
		super();
	}
	public LeftAndRightSideCheckedAndCorrectSideMarked(int id)
	{
		super(id, "", true);
	}
	public LeftAndRightSideCheckedAndCorrectSideMarked(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public LeftAndRightSideCheckedAndCorrectSideMarked(int id, String text, boolean active, LeftAndRightSideCheckedAndCorrectSideMarked parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public LeftAndRightSideCheckedAndCorrectSideMarked(int id, String text, boolean active, LeftAndRightSideCheckedAndCorrectSideMarked parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public LeftAndRightSideCheckedAndCorrectSideMarked(int id, String text, boolean active, LeftAndRightSideCheckedAndCorrectSideMarked parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static LeftAndRightSideCheckedAndCorrectSideMarked buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new LeftAndRightSideCheckedAndCorrectSideMarked(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (LeftAndRightSideCheckedAndCorrectSideMarked)super.getParentInstance();
	}
	public LeftAndRightSideCheckedAndCorrectSideMarked getParent()
	{
		return (LeftAndRightSideCheckedAndCorrectSideMarked)super.getParentInstance();
	}
	public void setParent(LeftAndRightSideCheckedAndCorrectSideMarked parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		LeftAndRightSideCheckedAndCorrectSideMarked[] typedChildren = new LeftAndRightSideCheckedAndCorrectSideMarked[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (LeftAndRightSideCheckedAndCorrectSideMarked)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof LeftAndRightSideCheckedAndCorrectSideMarked)
		{
			super.addChild((LeftAndRightSideCheckedAndCorrectSideMarked)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof LeftAndRightSideCheckedAndCorrectSideMarked)
		{
			super.removeChild((LeftAndRightSideCheckedAndCorrectSideMarked)child);
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
		LeftAndRightSideCheckedAndCorrectSideMarkedCollection result = new LeftAndRightSideCheckedAndCorrectSideMarkedCollection();
		result.add(LEFT);
		result.add(RIGHT);
		result.add(BILATERAL);
		return result;
	}
	public static LeftAndRightSideCheckedAndCorrectSideMarked[] getNegativeInstances()
	{
		LeftAndRightSideCheckedAndCorrectSideMarked[] instances = new LeftAndRightSideCheckedAndCorrectSideMarked[3];
		instances[0] = LEFT;
		instances[1] = RIGHT;
		instances[2] = BILATERAL;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "LEFT";
		negativeInstances[1] = "RIGHT";
		negativeInstances[2] = "BILATERAL";
		return negativeInstances;
	}
	public static LeftAndRightSideCheckedAndCorrectSideMarked getNegativeInstance(String name)
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
	public static LeftAndRightSideCheckedAndCorrectSideMarked getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		LeftAndRightSideCheckedAndCorrectSideMarked[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1231150;
	public static final LeftAndRightSideCheckedAndCorrectSideMarked LEFT = new LeftAndRightSideCheckedAndCorrectSideMarked(-3230, "Left", true, null, null, Color.Default);
	public static final LeftAndRightSideCheckedAndCorrectSideMarked RIGHT = new LeftAndRightSideCheckedAndCorrectSideMarked(-3231, "Right", true, null, null, Color.Default);
	public static final LeftAndRightSideCheckedAndCorrectSideMarked BILATERAL = new LeftAndRightSideCheckedAndCorrectSideMarked(-3400, "Bilateral", true, null, null, Color.Default);
}
