/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see EmbeddedXtextEditor.EmbeddedXtextEditorFactory
 * @model kind="package"
 * @generated
 */
public interface EmbeddedXtextEditorPackage extends EPackage {
	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link EmbeddedXtextEditor.impl.EmbeddedXtextEditorConfigurationImpl
		 * <em>Embedded Xtext Editor Configuration</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see EmbeddedXtextEditor.impl.EmbeddedXtextEditorConfigurationImpl
		 * @see EmbeddedXtextEditor.impl.EmbeddedXtextEditorPackageImpl#getEmbeddedXtextEditorConfiguration()
		 * @generated
		 */
		EClass EMBEDDED_XTEXT_EDITOR_CONFIGURATION = eINSTANCE
				.getEmbeddedXtextEditorConfiguration();

	}

	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "EmbeddedXtextEditor";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EmbeddedXtextEditorPackage eINSTANCE = de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.impl.EmbeddedXtextEditorPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link EmbeddedXtextEditor.impl.EmbeddedXtextEditorConfigurationImpl
	 * <em>Embedded Xtext Editor Configuration</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see EmbeddedXtextEditor.impl.EmbeddedXtextEditorConfigurationImpl
	 * @see EmbeddedXtextEditor.impl.EmbeddedXtextEditorPackageImpl#getEmbeddedXtextEditorConfiguration()
	 * @generated
	 */
	int EMBEDDED_XTEXT_EDITOR_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_XTEXT_EDITOR_CONFIGURATION__DATATYPE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The number of structural features of the '
	 * <em>Embedded Xtext Editor Configuration</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_XTEXT_EDITOR_CONFIGURATION_FEATURE_COUNT = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '
	 * {@link EmbeddedXtextEditor.EmbeddedXtextEditorConfiguration
	 * <em>Embedded Xtext Editor Configuration</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>Embedded Xtext Editor Configuration</em>'.
	 * @see EmbeddedXtextEditor.EmbeddedXtextEditorConfiguration
	 * @generated
	 */
	EClass getEmbeddedXtextEditorConfiguration();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmbeddedXtextEditorFactory getEmbeddedxtexteditorFactory();

} // EmbeddedxtexteditorPackage
