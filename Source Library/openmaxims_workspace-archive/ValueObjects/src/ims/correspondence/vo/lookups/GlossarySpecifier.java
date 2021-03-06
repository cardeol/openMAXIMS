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

package ims.correspondence.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class GlossarySpecifier extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public GlossarySpecifier()
	{
		super();
	}
	public GlossarySpecifier(int id)
	{
		super(id, "", true);
	}
	public GlossarySpecifier(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public GlossarySpecifier(int id, String text, boolean active, GlossarySpecifier parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public GlossarySpecifier(int id, String text, boolean active, GlossarySpecifier parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public GlossarySpecifier(int id, String text, boolean active, GlossarySpecifier parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static GlossarySpecifier buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new GlossarySpecifier(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (GlossarySpecifier)super.getParentInstance();
	}
	public GlossarySpecifier getParent()
	{
		return (GlossarySpecifier)super.getParentInstance();
	}
	public void setParent(GlossarySpecifier parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		GlossarySpecifier[] typedChildren = new GlossarySpecifier[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (GlossarySpecifier)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof GlossarySpecifier)
		{
			super.addChild((GlossarySpecifier)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof GlossarySpecifier)
		{
			super.removeChild((GlossarySpecifier)child);
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
		GlossarySpecifierCollection result = new GlossarySpecifierCollection();
		result.add(MEDIC);
		result.add(SPECIALTY);
		return result;
	}
	public static GlossarySpecifier[] getNegativeInstances()
	{
		GlossarySpecifier[] instances = new GlossarySpecifier[2];
		instances[0] = MEDIC;
		instances[1] = SPECIALTY;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "MEDIC";
		negativeInstances[1] = "SPECIALTY";
		return negativeInstances;
	}
	public static GlossarySpecifier getNegativeInstance(String name)
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
	public static GlossarySpecifier getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		GlossarySpecifier[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1111010;
	public static final GlossarySpecifier MEDIC = new GlossarySpecifier(-643, "Medic", true, null, null, Color.Default);
	public static final GlossarySpecifier SPECIALTY = new GlossarySpecifier(-644, "Specialty", true, null, null, Color.Default);
}
