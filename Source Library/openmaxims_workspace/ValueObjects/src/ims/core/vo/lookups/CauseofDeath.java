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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class CauseofDeath extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public CauseofDeath()
	{
		super();
	}
	public CauseofDeath(int id)
	{
		super(id, "", true);
	}
	public CauseofDeath(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public CauseofDeath(int id, String text, boolean active, CauseofDeath parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public CauseofDeath(int id, String text, boolean active, CauseofDeath parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public CauseofDeath(int id, String text, boolean active, CauseofDeath parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static CauseofDeath buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new CauseofDeath(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (CauseofDeath)super.getParentInstance();
	}
	public CauseofDeath getParent()
	{
		return (CauseofDeath)super.getParentInstance();
	}
	public void setParent(CauseofDeath parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		CauseofDeath[] typedChildren = new CauseofDeath[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (CauseofDeath)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof CauseofDeath)
		{
			super.addChild((CauseofDeath)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof CauseofDeath)
		{
			super.removeChild((CauseofDeath)child);
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
		CauseofDeathCollection result = new CauseofDeathCollection();
		result.add(IMMEDIATE);
		result.add(CONDITION);
		result.add(UNDERLYING);
		result.add(SIGNIFICANT);
		return result;
	}
	public static CauseofDeath[] getNegativeInstances()
	{
		CauseofDeath[] instances = new CauseofDeath[4];
		instances[0] = IMMEDIATE;
		instances[1] = CONDITION;
		instances[2] = UNDERLYING;
		instances[3] = SIGNIFICANT;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[4];
		negativeInstances[0] = "IMMEDIATE";
		negativeInstances[1] = "CONDITION";
		negativeInstances[2] = "UNDERLYING";
		negativeInstances[3] = "SIGNIFICANT";
		return negativeInstances;
	}
	public static CauseofDeath getNegativeInstance(String name)
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
	public static CauseofDeath getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		CauseofDeath[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021203;
	public static final CauseofDeath IMMEDIATE = new CauseofDeath(-1214, "Cause of Death - Immediate.", true, null, null, Color.Default);
	public static final CauseofDeath CONDITION = new CauseofDeath(-1215, "Cause of Death - Condition giving rise to death.", true, null, null, Color.Default);
	public static final CauseofDeath UNDERLYING = new CauseofDeath(-1216, "Cause of Death - Underlying condition leading to death.", true, null, null, Color.Default);
	public static final CauseofDeath SIGNIFICANT = new CauseofDeath(-1217, "Cause of Death - Significant condition not directly related to death.", true, null, null, Color.Default);
}
