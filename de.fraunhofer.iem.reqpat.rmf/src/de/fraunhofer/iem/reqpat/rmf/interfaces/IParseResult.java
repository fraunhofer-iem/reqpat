package de.fraunhofer.iem.reqpat.rmf.interfaces;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;

/**
 * 
 * @author Frederik Knust
 * 
 * @param <T>
 *            the type of the model's root object
 */
public interface IParseResult<T extends EObject> {

	/**
	 * Getter for the model's root object.
	 * 
	 * @return the model's root object
	 */
	public T getModel();

	/**
	 * Getter for the xText resource.
	 * 
	 * @return the xText resource
	 */
	public XtextResource getXtextResource();

}
