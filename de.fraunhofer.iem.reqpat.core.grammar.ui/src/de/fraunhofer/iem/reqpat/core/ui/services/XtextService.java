package de.fraunhofer.iem.reqpat.core.ui.services;

import java.util.UUID;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

import de.fraunhofer.iem.reqpat.core.interfaces.IXtextPlugin;
import de.fraunhofer.iem.reqpat.core.interfaces.IXtextService;
import de.fraunhofer.iem.reqpat.core.ui.util.XtextResourceProvider;

/**
 * Implementation of the IXtextService interface.
 * 
 * @author Frederik Knust, $LastChangedBy: fkl-fk $
 * @version $Rev: 84 $, $Date: 2013-09-18 14:57:00 +0200 (Mi, 18 Sep 2013) $
 */
@SuppressWarnings("restriction")
public class XtextService implements IXtextService {
	private final IXtextPlugin xtextPlugin;

	private final String xtextLanguageUri;

	private final String xtextFileExtension;

	/**
	 * Constructor for the XtextService class.
	 * 
	 * @param requirementService
	 *            the requirement service, contating the xText resource
	 * @param xtextPlugin
	 *            a reference to the xText plugin, which can be used to obtain
	 *            the xText injector
	 * @param xtextSetup
	 *            a reference to the xText standalone setup
	 * @param xtextLanguageUri
	 *            the xText language URI
	 * @param xtextFileExtension
	 *            the xText file extension
	 */
	@Inject
	public XtextService(IXtextPlugin xtextPlugin, ISetup xtextSetup,
			@Named(XTEXT_LANGUAGE_URI) String xtextLanguageUri,
			@Named(XTEXT_FILE_EXTENSION) String xtextFileExtension) {
		Assert.isNotNull(xtextPlugin);
		this.xtextPlugin = xtextPlugin;

		Assert.isNotNull(xtextLanguageUri);
		this.xtextLanguageUri = xtextLanguageUri;

		Assert.isNotNull(xtextFileExtension);
		this.xtextFileExtension = xtextFileExtension;

		/*
		 * Prepare xText to be used in standalone (embedded) mode.
		 */
		Assert.isNotNull(xtextSetup);
		xtextSetup.createInjectorAndDoEMFRegistration();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.interfaces.IXtextService#
	 * addXtextModelToResource(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Resource addXtextModelToResource(EObject xtextModel) {
		IEditedResourceProvider resourceProvider = getResourceProvider();

		XtextResource resource = resourceProvider.createResource();
		resource.getContents().clear();
		resource.getContents().add(xtextModel);

		return resource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.rcp.interfaces.IXtextService#getEmbeddedEditorFactory()
	 */
	@Override
	public EmbeddedEditorFactory getEmbeddedEditorFactory() {
		Injector injector = xtextPlugin.getInjector(xtextLanguageUri);
		Assert.isNotNull(injector);

		EmbeddedEditorFactory factory = injector
				.getInstance(EmbeddedEditorFactory.class);
		Assert.isNotNull(factory);

		return factory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.rcp.interfaces.IXtextService#getResourceProvider()
	 */
	@Override
	public IEditedResourceProvider getResourceProvider() {
		String filename = String.format("%s.%s", UUID.randomUUID().toString(),
				xtextFileExtension);
		return new XtextResourceProvider(filename);
	}
}
