package de.fraunhofer.iem.reqpat.rmf.adapter.util;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IParseResult;

/**
 * 
 * @author Frederik Knust
 * 
 * @param <T>
 *            type of the model in this parse result
 */
public class ParseResult<T extends EObject> implements IParseResult<T> {

	private final T model;

	private final XtextResource resource;

	public ParseResult(T model, XtextResource resource) {
		Assert.isNotNull(model);
		Assert.isNotNull(resource);

		this.model = model;
		this.resource = resource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IParseResult#getModel()
	 */
	@Override
	public T getModel() {
		return model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IParseResult#getXtextResource
	 * ()
	 */
	@Override
	public XtextResource getXtextResource() {
		return resource;
	}

}
