/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.image.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServicePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ImagePresentationServiceXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ImagePresentationServiceXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ImagePresentationServicePackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the
	 * ImagePresentationServiceResourceFactoryImpl factory. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION,
					new ImagePresentationServiceResourceFactoryImpl());
			registrations.put(STAR_EXTENSION,
					new ImagePresentationServiceResourceFactoryImpl());
		}
		return registrations;
	}

} // ImagePresentationServiceXMLProcessor
