/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.headline.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServicePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class HeadlinePresentationServiceXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HeadlinePresentationServiceXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HeadlinePresentationServicePackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the
	 * HeadlinePresentationServiceResourceFactoryImpl factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION,
					new HeadlinePresentationServiceResourceFactoryImpl());
			registrations.put(STAR_EXTENSION,
					new HeadlinePresentationServiceResourceFactoryImpl());
		}
		return registrations;
	}

} // HeadlinePresentationServiceXMLProcessor
