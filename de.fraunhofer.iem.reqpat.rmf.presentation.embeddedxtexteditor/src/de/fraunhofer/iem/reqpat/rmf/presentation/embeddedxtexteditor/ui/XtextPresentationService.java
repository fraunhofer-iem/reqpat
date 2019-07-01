package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.ui;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.AbstractPresentationService;

import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.EmbeddedXtextEditorFactory;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class XtextPresentationService extends AbstractPresentationService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.pror.reqif10.editor.presentation.service.
	 * AbstractPresentationService#getConfigurationInstance()
	 */
	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return EmbeddedXtextEditorFactory.eINSTANCE
				.createEmbeddedXtextEditorConfiguration();
	}
}
