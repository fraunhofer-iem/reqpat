package de.fraunhofer.iem.reqpat.core.interfaces;

import java.util.List;

/**
 * Describes a service which generates a (test) model with the given amount of
 * top level elements, the given degree and the given depth.
 * 
 * @author Frederik Knust
 * 
 */
public interface IModelGenerator {

	/**
	 * Generates a random model hierarchy.
	 * 
	 * @param topLevelElements
	 *            number of top level elements
	 * @param degree
	 *            degree of the hierarchy (number of child elements for each
	 *            level of the hierarchy)
	 * @param depth
	 *            depth of the hierarchy
	 * @return list of the root elements of the hierarchy
	 */
	public List<IModelElement> generateModel(int topLevelElements,
			int degree, int depth);

}
