package de.fraunhofer.iem.reqpat.core.ui.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

/**
 * 
 * @author Frederik Knust
 * 
 */
@SuppressWarnings("restriction")
public class XtextResourceProvider implements IEditedResourceProvider {

	private String filename;
	private XtextResource resource;

	/**
	 * Constructor for the XtextResourceProvider class.
	 * 
	 * @param filename
	 *            the filename of the resource to be created
	 */
	public XtextResourceProvider(String filename) {
		this.filename = filename;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider#createResource
	 * ()
	 */
	@Override
	public XtextResource createResource() {
		ResourceSet resourceSet = new XtextResourceSet(); // new ResourceSetImpl(); => ClassCastException
		resource = (XtextResource) resourceSet.createResource(URI
				.createURI(filename));

		return resource;
	}

	/**
	 * Getter for the filename.
	 * 
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * Getter for the xText resource.
	 * 
	 * @return the xText resource
	 */
	public XtextResource getResource() {
		return resource;
	}

}
