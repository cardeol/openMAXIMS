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

package ims.admin.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class ClearSpanEventLevel extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public ClearSpanEventLevel()
	{
		super();
	}
	public ClearSpanEventLevel(int id)
	{
		super(id, "", true);
	}
	public ClearSpanEventLevel(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public ClearSpanEventLevel(int id, String text, boolean active, ClearSpanEventLevel parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public ClearSpanEventLevel(int id, String text, boolean active, ClearSpanEventLevel parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public ClearSpanEventLevel(int id, String text, boolean active, ClearSpanEventLevel parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static ClearSpanEventLevel buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new ClearSpanEventLevel(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (ClearSpanEventLevel)super.getParentInstance();
	}
	public ClearSpanEventLevel getParent()
	{
		return (ClearSpanEventLevel)super.getParentInstance();
	}
	public void setParent(ClearSpanEventLevel parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		ClearSpanEventLevel[] typedChildren = new ClearSpanEventLevel[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (ClearSpanEventLevel)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof ClearSpanEventLevel)
		{
			super.addChild((ClearSpanEventLevel)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof ClearSpanEventLevel)
		{
			super.removeChild((ClearSpanEventLevel)child);
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
		ClearSpanEventLevelCollection result = new ClearSpanEventLevelCollection();
		result.add(INFORMATION);
		result.add(WARNING);
		result.add(ERROR);
		return result;
	}
	public static ClearSpanEventLevel[] getNegativeInstances()
	{
		ClearSpanEventLevel[] instances = new ClearSpanEventLevel[3];
		instances[0] = INFORMATION;
		instances[1] = WARNING;
		instances[2] = ERROR;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "INFORMATION";
		negativeInstances[1] = "WARNING";
		negativeInstances[2] = "ERROR";
		return negativeInstances;
	}
	public static ClearSpanEventLevel getNegativeInstance(String name)
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
	public static ClearSpanEventLevel getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		ClearSpanEventLevel[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1031022;
	public static final ClearSpanEventLevel INFORMATION = new ClearSpanEventLevel(-2111, "Information", true, null, new ims.framework.utils.ImagePath(103166, "Images/Admin/messagebox_info.png"), Color.Default);
	public static final ClearSpanEventLevel WARNING = new ClearSpanEventLevel(-2112, "Warning", true, null, new ims.framework.utils.ImagePath(103168, "Images/Admin/messagebox_warning.png"), Color.Default);
	public static final ClearSpanEventLevel ERROR = new ClearSpanEventLevel(-2188, "Error", true, null, new ims.framework.utils.ImagePath(103165, "Images/Admin/no.png"), Color.Default);
}
