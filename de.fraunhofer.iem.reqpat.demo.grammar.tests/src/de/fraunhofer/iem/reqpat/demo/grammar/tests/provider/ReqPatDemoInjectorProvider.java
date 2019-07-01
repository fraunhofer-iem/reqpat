package de.fraunhofer.iem.reqpat.demo.grammar.tests.provider;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.demo.ReqPatDemoStandaloneSetupGenerated;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class ReqPatDemoInjectorProvider implements IInjectorProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.junit4.IInjectorProvider#getInjector()
	 */
	@Override
	public Injector getInjector() {
		return new ReqPatDemoStandaloneSetupGenerated()
				.createInjectorAndDoEMFRegistration();
	}

}
