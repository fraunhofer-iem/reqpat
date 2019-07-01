package de.fraunhofer.iem.reqpat.core.interfaces;

import com.google.inject.Injector;

/**
 * Defines a method to access the xText injector of an xText plugin.
 * 
 * Must be added to the activator of all xText plugins that shall be used with
 * the RCP.
 * 
 * @author Frederik Knust
 * 
 */
public interface IXtextPlugin {

	/**
	 * Getter for the xText injector.
	 * 
	 * @param language
	 *            the language URI
	 * @return the xtext injector
	 */
	public Injector getInjector(String language);

}
