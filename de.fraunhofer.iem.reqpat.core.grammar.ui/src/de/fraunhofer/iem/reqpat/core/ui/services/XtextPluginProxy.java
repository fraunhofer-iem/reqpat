package de.fraunhofer.iem.reqpat.core.ui.services;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.core.interfaces.IXtextPlugin;
import de.fraunhofer.iem.reqpat.core.ui.internal.ReqPatActivator;

/**
 * Acts as proxy for the ReqPatActivator instance to avoid instantiation issues.
 * 
 * @author Frederik Knust
 * 
 */
public class XtextPluginProxy implements IXtextPlugin {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.interfaces.IXtextPlugin#getInjector(java
	 * .lang.String)
	 */
	@Override
	public Injector getInjector(String language) {
		return ReqPatActivator.getInstance().getInjector(language);
	}

}
