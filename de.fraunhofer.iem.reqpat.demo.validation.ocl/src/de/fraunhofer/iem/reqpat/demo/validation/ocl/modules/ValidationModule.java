package de.fraunhofer.iem.reqpat.demo.validation.ocl.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

import de.fraunhofer.iem.reqpat.core.interfaces.IResourceValidator;
import de.fraunhofer.iem.reqpat.core.interfaces.IValidatorService;
import de.fraunhofer.iem.reqpat.demo.validation.ocl.services.CompleteOclDiagramValidator;
import de.fraunhofer.iem.reqpat.demo.validation.ocl.services.CompleteOclSpecificationValidator;

/**
 * 
 * @author Markus Fockel, $LastChangedBy: fkl-rt $
 * @version $Rev: 278 $, $Date: 2016-06-10 18:19:47 +0200 (Fr, 10 Jun 2016) $
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
		
		bind(IResourceValidator.class).to(CompleteOclDiagramValidator.class);
		
		checkExtensions.addBinding().to(CompleteOclSpecificationValidator.class);
	}

}
