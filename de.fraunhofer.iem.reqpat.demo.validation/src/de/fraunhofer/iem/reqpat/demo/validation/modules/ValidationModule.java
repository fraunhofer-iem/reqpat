package de.fraunhofer.iem.reqpat.demo.validation.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

import de.fraunhofer.iem.reqpat.core.interfaces.IValidatorService;
import de.fraunhofer.iem.reqpat.demo.validation.services.ReqPatDemoValidatorService;

/**
 * 
 * @author Frederik Knust
 *
 */
public class ValidationModule extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		Multibinder<IValidatorService> checkExtensions = Multibinder
				.newSetBinder(binder(), IValidatorService.class);
		
		checkExtensions.addBinding().to(ReqPatDemoValidatorService.class);
	}

}
