package de.fraunhofer.iem.reqpat.core.validation.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import de.fraunhofer.iem.reqpat.core.interfaces.IValidationService;
import de.fraunhofer.iem.reqpat.core.validation.services.ValidationService;

/**
 * 
 * @author Markus Fockel, $LastChangedBy: fkl-fk $
 * @version $Rev: 55 $, $Date: 2013-08-09 13:52:13 +0200 (Fr, 09 Aug 2013) $
 */
public class ValidationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IValidationService.class).to(ValidationService.class).in(
				Singleton.class);
	}

}
