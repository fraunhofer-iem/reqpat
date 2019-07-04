/*
 * generated by Xtext
 */
package de.fraunhofer.iem.reqpat.demo.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.demo.ui.internal.ReqPatDemoActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ReqPatDemoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ReqPatDemoActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ReqPatDemoActivator.getInstance().getInjector(ReqPatDemoActivator.DE_FRAUNHOFER_IEM_REQPAT_DEMO_REQPATDEMO);
	}
	
}