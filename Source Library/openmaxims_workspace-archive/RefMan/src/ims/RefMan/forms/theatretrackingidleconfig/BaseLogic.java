// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.theatretrackingidleconfig;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.TheatreTrackingIdleConfig.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.RefMan.domain.TheatreTrackingIdleConfig domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected void clearScreen()
	{
		this.form.intTTT().setValue(null);
		this.form.intTPACU().setValue(null);
		this.form.intTOA().setValue(null);
	}
	protected void populateScreenFromData(ims.RefMan.vo.TheatreTrackingIdleConfigVo value)
	{
		clearScreen();
		if(value == null)
			return;

		this.form.intTTT().setValue(value.getTimeToTheatreIdleMinIsNotNull() ? value.getTimeToTheatreIdleMin() : null);
		this.form.intTPACU().setValue(value.getTimeIntoPACUIdleMinIsNotNull() ? value.getTimeIntoPACUIdleMin() : null);
		this.form.intTOA().setValue(value.getTimeOfArrivalIdleMinIsNotNull() ? value.getTimeOfArrivalIdleMin() : null);
	}
	protected ims.RefMan.vo.TheatreTrackingIdleConfigVo populateDataFromScreen(ims.RefMan.vo.TheatreTrackingIdleConfigVo value)
	{
		if(value == null)
			value = new ims.RefMan.vo.TheatreTrackingIdleConfigVo();

		value.setTimeToTheatreIdleMin(this.form.intTTT().getValue());
		value.setTimeIntoPACUIdleMin(this.form.intTPACU().getValue());
		value.setTimeOfArrivalIdleMin(this.form.intTOA().getValue());

		return value;
	}
	protected ims.RefMan.vo.TheatreTrackingIdleConfigVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.RefMan.vo.TheatreTrackingIdleConfigVo());
	}
	public void initialize() throws ims.framework.exceptions.FormOpenException
	{
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.TheatreTrackingIdleConfig domain;
}
