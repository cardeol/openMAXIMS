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
// This code was generated by John MacEnri using IMS Development Environment (version 1.53 build 2637.21906)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.admin.forms.hl7messageviewdialog;

import ims.framework.controls.TreeNode;
import ims.framework.enumerations.DialogResult;

import java.util.StringTokenizer;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	private static final int FIELD_SEP = 0;
	private static final int COMP_SEP = 1;
	private static final int REP_SEP = 2;
	private static final int ESC_SEP = 3;
	private static final int SUB_SEP = 4;

	protected void onFormOpen(Object[] args) 
	{
		if (args == null || args.length == 0)
		{
			engine.showMessage("No HL7 Message passed in!");
			return;
		}
		String msg = (String)args[0];
		if (msg == null || msg.length() == 0)
		{
			engine.showMessage("No HL7 Message passed in!");
			return;
		}		
		
		TreeNode rootNode = null;
		StringTokenizer st = new StringTokenizer(msg, "\r\n");
		int count = 0;
		while (st.hasMoreTokens())
		{
			String segment = st.nextToken();
			if (count == 0)
			{
				char[] seps = new char[5];
				seps[FIELD_SEP] = segment.charAt(3);
				seps[COMP_SEP] = segment.charAt(4);
				seps[REP_SEP] = segment.charAt(5);
				seps[ESC_SEP] = segment.charAt(6);
				seps[SUB_SEP] = segment.charAt(7);
				form.getLocalContext().setSepsArray(seps);
				
				rootNode = form.treMessage().getNodes().add(segment, segment);
				rootNode.setCollapsedImage(form.getImages().Admin.ActivityGroup);
				rootNode.setExpandedImage(form.getImages().Admin.ActivityGroup);
			}
			addSegment(rootNode, segment);
			count++;
		}
		//form.treMessage().expandAll();
	}
	
	private void addSegment(TreeNode parentNode, String segment)
	{
		TreeNode node = parentNode.getNodes().add(segment, segment);
		node.setCollapsedImage(form.getImages().Admin.Activity);
		node.setExpandedImage(form.getImages().Admin.Activity);
		StringTokenizer st = new StringTokenizer(segment, "" + form.getLocalContext().getSepsArray()[FIELD_SEP]);
		while (st.hasMoreTokens())
		{
			String field = st.nextToken();
			addField(node, field);
		}		
	}

	private void addField(TreeNode parentNode, String field)
	{
		TreeNode node = parentNode.getNodes().add(field, field);
		node.setCollapsedImage(form.getImages().Core.CareContext);
		node.setExpandedImage(form.getImages().Core.CareContext);
		
		StringTokenizer st = new StringTokenizer(field, "" + form.getLocalContext().getSepsArray()[REP_SEP]);
		if (st.countTokens() > 1)
		{
			while (st.hasMoreTokens())
			{
				String rep = st.nextToken();
				addField(node, rep);
			}
		}
		else
		{
			st = new StringTokenizer(field, "" + form.getLocalContext().getSepsArray()[COMP_SEP]);
			if (st.countTokens() > 1)
			{
				while (st.hasMoreTokens())
				{
					String comp = st.nextToken();
					addComponent(node, comp);
				}
			}
		}
	}

	private void addComponent(TreeNode parentNode, String component)
	{
		TreeNode node = parentNode.getNodes().add(component, component);
		node.setCollapsedImage(form.getImages().Core.CareSpell);
		node.setExpandedImage(form.getImages().Core.CareSpell);
		StringTokenizer st = new StringTokenizer(component, "" + form.getLocalContext().getSepsArray()[SUB_SEP]);
		if (st.countTokens() > 1)
		{
			while (st.hasMoreTokens())
			{
				String subComp = st.nextToken();
				addSubComp(node, subComp);
			}
		}
	}

	private void addSubComp(TreeNode parentNode, String subComponent)
	{
		TreeNode node = parentNode.getNodes().add(subComponent, subComponent);
		node.setCollapsedImage(form.getImages().Core.ClosedFolder);
		node.setExpandedImage(form.getImages().Core.ClosedFolder);
	}

	protected void onBtnCloseClick() 
	{
		engine.close(DialogResult.OK);
	}
}
