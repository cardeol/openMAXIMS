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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class ExternalResourceType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public ExternalResourceType()
	{
		super();
	}
	public ExternalResourceType(int id)
	{
		super(id, "", true);
	}
	public ExternalResourceType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public ExternalResourceType(int id, String text, boolean active, ExternalResourceType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public ExternalResourceType(int id, String text, boolean active, ExternalResourceType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public ExternalResourceType(int id, String text, boolean active, ExternalResourceType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static ExternalResourceType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new ExternalResourceType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (ExternalResourceType)super.getParentInstance();
	}
	public ExternalResourceType getParent()
	{
		return (ExternalResourceType)super.getParentInstance();
	}
	public void setParent(ExternalResourceType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		ExternalResourceType[] typedChildren = new ExternalResourceType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (ExternalResourceType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof ExternalResourceType)
		{
			super.addChild((ExternalResourceType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof ExternalResourceType)
		{
			super.removeChild((ExternalResourceType)child);
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
		ExternalResourceTypeCollection result = new ExternalResourceTypeCollection();
		result.add(ERT_HCP);
		result.add(ERT_HOSPITAL);
		result.add(ERT_NURSINGHOME);
		result.add(ERT_LOCALPLACEMENTFORUM);
		result.add(ERT_HOMEADDRESS);
		result.add(ERT_OTHER);
		return result;
	}
	public static ExternalResourceType[] getNegativeInstances()
	{
		ExternalResourceType[] instances = new ExternalResourceType[6];
		instances[0] = ERT_HCP;
		instances[1] = ERT_HOSPITAL;
		instances[2] = ERT_NURSINGHOME;
		instances[3] = ERT_LOCALPLACEMENTFORUM;
		instances[4] = ERT_HOMEADDRESS;
		instances[5] = ERT_OTHER;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[6];
		negativeInstances[0] = "ERT_HCP";
		negativeInstances[1] = "ERT_HOSPITAL";
		negativeInstances[2] = "ERT_NURSINGHOME";
		negativeInstances[3] = "ERT_LOCALPLACEMENTFORUM";
		negativeInstances[4] = "ERT_HOMEADDRESS";
		negativeInstances[5] = "ERT_OTHER";
		return negativeInstances;
	}
	public static ExternalResourceType getNegativeInstance(String name)
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
	public static ExternalResourceType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		ExternalResourceType[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021283;
	public static final ExternalResourceType ERT_HCP = new ExternalResourceType(-2471, "HCP", true, null, null, Color.Default);
	public static final ExternalResourceType ERT_HOSPITAL = new ExternalResourceType(-2472, "Hospital", true, null, null, Color.Default);
	public static final ExternalResourceType ERT_NURSINGHOME = new ExternalResourceType(-2473, "Nursing Home", true, null, null, Color.Default);
	public static final ExternalResourceType ERT_LOCALPLACEMENTFORUM = new ExternalResourceType(-2474, "Local Placement Forum", true, null, null, Color.Default);
	public static final ExternalResourceType ERT_HOMEADDRESS = new ExternalResourceType(-2487, "Home Address", true, null, null, Color.Default);
	public static final ExternalResourceType ERT_OTHER = new ExternalResourceType(-2488, "Other", true, null, null, Color.Default);
}