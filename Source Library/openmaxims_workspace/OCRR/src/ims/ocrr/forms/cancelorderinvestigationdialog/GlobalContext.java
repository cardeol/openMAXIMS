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

package ims.ocrr.forms.cancelorderinvestigationdialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		OCRR = new OCRRContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getItemsIsNotNull()
		{
			return !cx_CoreItems.getValueIsNull(context);
		}
		public ims.admin.vo.SelectItemVoCollection getItems()
		{
			return (ims.admin.vo.SelectItemVoCollection)cx_CoreItems.getValue(context);
		}
		public void setItems(ims.admin.vo.SelectItemVoCollection value)
		{
			cx_CoreItems.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreItems = new ims.framework.ContextVariable("Core.Items", "_cv_Core.Items");

		private ims.framework.Context context;
	}
	public final class OCRRContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private OCRRContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getInvestigationStatusChangeReasonIsNotNull()
		{
			return !cx_OCRRInvestigationStatusChangeReason.getValueIsNull(context);
		}
		public ims.ocrr.vo.lookups.InvestigationStatusChangeReason getInvestigationStatusChangeReason()
		{
			return (ims.ocrr.vo.lookups.InvestigationStatusChangeReason)cx_OCRRInvestigationStatusChangeReason.getValue(context);
		}
		public void setInvestigationStatusChangeReason(ims.ocrr.vo.lookups.InvestigationStatusChangeReason value)
		{
			cx_OCRRInvestigationStatusChangeReason.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRInvestigationStatusChangeReason = new ims.framework.ContextVariable("OCRR.InvestigationStatusChangeReason", "_cv_OCRR.InvestigationStatusChangeReason");
		public boolean getInvestigationCancelCommentIsNotNull()
		{
			return !cx_OCRRInvestigationCancelComment.getValueIsNull(context);
		}
		public String getInvestigationCancelComment()
		{
			return (String)cx_OCRRInvestigationCancelComment.getValue(context);
		}
		public void setInvestigationCancelComment(String value)
		{
			cx_OCRRInvestigationCancelComment.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRInvestigationCancelComment = new ims.framework.ContextVariable("OCRR.InvestigationCancelComment", "_cv_OCRR.InvestigationCancelComment");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public OCRRContext OCRR;
}
