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

package ims.scheduling.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class AppointmentAction extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public AppointmentAction()
	{
		super();
	}
	public AppointmentAction(int id)
	{
		super(id, "", true);
	}
	public AppointmentAction(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public AppointmentAction(int id, String text, boolean active, AppointmentAction parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public AppointmentAction(int id, String text, boolean active, AppointmentAction parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public AppointmentAction(int id, String text, boolean active, AppointmentAction parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static AppointmentAction buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new AppointmentAction(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (AppointmentAction)super.getParentInstance();
	}
	public AppointmentAction getParent()
	{
		return (AppointmentAction)super.getParentInstance();
	}
	public void setParent(AppointmentAction parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		AppointmentAction[] typedChildren = new AppointmentAction[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (AppointmentAction)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof AppointmentAction)
		{
			super.addChild((AppointmentAction)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof AppointmentAction)
		{
			super.removeChild((AppointmentAction)child);
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
		AppointmentActionCollection result = new AppointmentActionCollection();
		result.add(WAITING_LIST_ACTION);
		result.add(BOOKED_LIST_ACTION);
		result.add(PLANNED_LIST_ACTION);
		result.add(BOOK_APPT_ACTION);
		result.add(ONWARD_REFERRAL_ACTION);
		result.add(TRANSFER_ACTION);
		result.add(REQUEST_FOR_SERVICE_ACTION);
		result.add(TRANSFER_OF_CARE);
		return result;
	}
	public static AppointmentAction[] getNegativeInstances()
	{
		AppointmentAction[] instances = new AppointmentAction[8];
		instances[0] = WAITING_LIST_ACTION;
		instances[1] = BOOKED_LIST_ACTION;
		instances[2] = PLANNED_LIST_ACTION;
		instances[3] = BOOK_APPT_ACTION;
		instances[4] = ONWARD_REFERRAL_ACTION;
		instances[5] = TRANSFER_ACTION;
		instances[6] = REQUEST_FOR_SERVICE_ACTION;
		instances[7] = TRANSFER_OF_CARE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[8];
		negativeInstances[0] = "WAITING_LIST_ACTION";
		negativeInstances[1] = "BOOKED_LIST_ACTION";
		negativeInstances[2] = "PLANNED_LIST_ACTION";
		negativeInstances[3] = "BOOK_APPT_ACTION";
		negativeInstances[4] = "ONWARD_REFERRAL_ACTION";
		negativeInstances[5] = "TRANSFER_ACTION";
		negativeInstances[6] = "REQUEST_FOR_SERVICE_ACTION";
		negativeInstances[7] = "TRANSFER_OF_CARE";
		return negativeInstances;
	}
	public static AppointmentAction getNegativeInstance(String name)
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
	public static AppointmentAction getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		AppointmentAction[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1141027;
	public static final AppointmentAction WAITING_LIST_ACTION = new AppointmentAction(-2666, "WaitingListAction", true, null, null, Color.Default);
	public static final AppointmentAction BOOKED_LIST_ACTION = new AppointmentAction(-2667, "Booked List Action", true, null, null, Color.Default);
	public static final AppointmentAction PLANNED_LIST_ACTION = new AppointmentAction(-2668, "Planned List Action", true, null, null, Color.Default);
	public static final AppointmentAction BOOK_APPT_ACTION = new AppointmentAction(-2669, "Book Appointment Action", true, null, null, Color.Default);
	public static final AppointmentAction ONWARD_REFERRAL_ACTION = new AppointmentAction(-2670, "Onward Referral Action", true, null, null, Color.Default);
	public static final AppointmentAction TRANSFER_ACTION = new AppointmentAction(-2671, "Transfer Action", true, null, null, Color.Default);
	public static final AppointmentAction REQUEST_FOR_SERVICE_ACTION = new AppointmentAction(-3112, "Request for Service Action", true, null, null, Color.Default);
	public static final AppointmentAction TRANSFER_OF_CARE = new AppointmentAction(-3154, "Transfer of Care", true, null, null, Color.Default);
}
