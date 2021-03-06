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

public class PDSConsent extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public PDSConsent()
	{
		super();
	}
	public PDSConsent(int id)
	{
		super(id, "", true);
	}
	public PDSConsent(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public PDSConsent(int id, String text, boolean active, PDSConsent parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public PDSConsent(int id, String text, boolean active, PDSConsent parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public PDSConsent(int id, String text, boolean active, PDSConsent parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static PDSConsent buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new PDSConsent(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (PDSConsent)super.getParentInstance();
	}
	public PDSConsent getParent()
	{
		return (PDSConsent)super.getParentInstance();
	}
	public void setParent(PDSConsent parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		PDSConsent[] typedChildren = new PDSConsent[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (PDSConsent)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof PDSConsent)
		{
			super.addChild((PDSConsent)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof PDSConsent)
		{
			super.removeChild((PDSConsent)child);
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
		PDSConsentCollection result = new PDSConsentCollection();
		result.add(EXPLICITCONSENT);
		result.add(EXPLICITDISSENT);
		result.add(NOPREFERENCEEXPRESSED);
		return result;
	}
	public static PDSConsent[] getNegativeInstances()
	{
		PDSConsent[] instances = new PDSConsent[3];
		instances[0] = EXPLICITCONSENT;
		instances[1] = EXPLICITDISSENT;
		instances[2] = NOPREFERENCEEXPRESSED;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "EXPLICITCONSENT";
		negativeInstances[1] = "EXPLICITDISSENT";
		negativeInstances[2] = "NOPREFERENCEEXPRESSED";
		return negativeInstances;
	}
	public static PDSConsent getNegativeInstance(String name)
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
	public static PDSConsent getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		PDSConsent[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021343;
	public static final PDSConsent EXPLICITCONSENT = new PDSConsent(-3072, "Explicit Consent", true, null, null, Color.Default);
	public static final PDSConsent EXPLICITDISSENT = new PDSConsent(-3073, "Explicit Dissent", true, null, null, Color.Default);
	public static final PDSConsent NOPREFERENCEEXPRESSED = new PDSConsent(-3074, "No-preference expressed", true, null, null, Color.Default);
}
