/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.EmbeddedXtextEditorPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmbeddedXtextEditorXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EmbeddedXtextEditorXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EmbeddedXtextEditorPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the
	 * EmbeddedxtexteditorResourceFactoryImpl factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION,
					new EmbeddedXtextEditorResourceFactoryImpl());
			registrations.put(STAR_EXTENSION,
					new EmbeddedXtextEditorResourceFactoryImpl());
		}
		return registrations;
	}

} // EmbeddedxtexteditorXMLProcessor
