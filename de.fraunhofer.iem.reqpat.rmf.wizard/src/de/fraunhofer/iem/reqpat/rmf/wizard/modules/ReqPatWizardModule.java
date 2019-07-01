package de.fraunhofer.iem.reqpat.rmf.wizard.modules;

import com.google.inject.AbstractModule;

import de.fraunhofer.iem.reqpat.rmf.wizard.services.NewReqIfModelService;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class ReqPatWizardModule extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(NewReqIfModelService.class);
	}

}
