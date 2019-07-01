package de.fraunhofer.iem.reqpat.core.interfaces;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

/**
 * Defines methods required to create an embedded Xtext editor.
 * 
 * @author Frederik Knust, $LastChangedBy: fkl-fk $
 * @version $Rev: 83 $, $Date: 2013-09-18 14:43:32 +0200 (Mi, 18 Sep 2013) $
 */
@SuppressWarnings("restriction")
public interface IXtextService {

	public static final String XTEXT_LANGUAGE_URI = "xText language URI";

	public static final String XTEXT_FILE_EXTENSION = "xText file extension";

	/**
	 * Creates a new resource with the correct file extension and adds the xText
	 * model as content.
	 * 
	 * @param xtextModel
	 *            the xText model to be added to the resource
	 * @return the new (xText) resource containing the xText model
	 */
	public Resource addXtextModelToResource(EObject xtextModel);

	/**
	 * Getter for the embedded editor factory, which can be used to create a new
	 * editor.
	 * 
	 * @return the embedded editor factory
	 */
	public EmbeddedEditorFactory getEmbeddedEditorFactory();

	/**
	 * Getter for the Xtext resource provider which is required by the embedded
	 * editor factory.
	 * 
	 * @return the Xtext resource provider
	 */
	public IEditedResourceProvider getResourceProvider();

}
