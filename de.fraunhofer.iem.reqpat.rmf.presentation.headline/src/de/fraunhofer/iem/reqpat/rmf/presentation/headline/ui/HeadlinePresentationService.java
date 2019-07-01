package de.fraunhofer.iem.reqpat.rmf.presentation.headline.ui;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.AbstractPresentationService;

import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceFactory;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class HeadlinePresentationService extends AbstractPresentationService {

	protected HeadlineCellRenderer headlineCellRenderer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.pror.reqif10.editor.presentation.service.
	 * AbstractPresentationService#getConfigurationInstance()
	 */
	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return HeadlinePresentationServiceFactory.eINSTANCE
				.createHeadlinePresentationServiceConfiguration();
	}

}
