package de.fraunhofer.iem.reqpat.core.interfaces;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * Represents a model element created by an IModelGenerator.
 * 
 * @author Frederik Knust
 * 
 */
public interface IModelElement {

	/**
	 * Getter for the children of this model element.
	 * 
	 * @return the children of this model element
	 */
	public List<IModelElement> getChildren();

	/**
	 * Getter for the (EMF) model object.
	 * 
	 * @return the (EMF) model object
	 */
	public EObject getModelElement();

	/**
	 * Getter for the model element's textual representation (serialization).
	 * 
	 * @return the model element's textual representation
	 */
	public String getSerialization();

}
