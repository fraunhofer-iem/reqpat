package de.fraunhofer.iem.reqpat.rmf.presentation.image.ui;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.AbstractPresentationService;

import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceFactory;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class ImagePresentationService extends AbstractPresentationService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.pror.reqif10.editor.presentation.service.
	 * AbstractPresentationService#getConfigurationInstance()
	 */
	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return ImagePresentationServiceFactory.eINSTANCE
				.createImagePresentationServiceConfiguration();
	}
}
