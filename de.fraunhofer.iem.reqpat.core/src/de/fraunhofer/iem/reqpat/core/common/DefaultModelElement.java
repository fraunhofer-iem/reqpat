package de.fraunhofer.iem.reqpat.core.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;

import de.fraunhofer.iem.reqpat.core.interfaces.IModelElement;

/**
 * Default implementation of the IModelElement interface.
 * 
 * @author Frederik Knust
 * 
 */
public class DefaultModelElement implements IModelElement {

	private final EObject modelElement;

	private final String serialization;

	private final List<IModelElement> children;

	/**
	 * Constructor of the DefaultModelElement class.
	 * 
	 * @param modelElement
	 *            the model element
	 * @param serialization
	 *            the model element's serialization
	 */
	public DefaultModelElement(EObject modelElement, String serialization) {
		Assert.isNotNull(modelElement);
		Assert.isNotNull(serialization);

		this.modelElement = modelElement;
		this.serialization = serialization;
		this.children = new ArrayList<IModelElement>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.interfaces.IModelHierarchy#getChildren()
	 */
	@Override
	public List<IModelElement> getChildren() {
		return children;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.interfaces.IModelHierarchy#getModelElement
	 * ()
	 */
	@Override
	public EObject getModelElement() {
		return modelElement;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.interfaces.IModelHierarchy#getSerialization
	 * ()
	 */
	@Override
	public String getSerialization() {
		return serialization;
	}

}
