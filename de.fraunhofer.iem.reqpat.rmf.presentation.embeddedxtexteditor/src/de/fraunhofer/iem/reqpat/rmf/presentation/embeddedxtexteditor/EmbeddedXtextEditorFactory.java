/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see EmbeddedXtextEditor.EmbeddedXtextEditorPackage
 * @generated
 */
public interface EmbeddedXtextEditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EmbeddedXtextEditorFactory eINSTANCE = de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.impl.EmbeddedXtextEditorFactoryImpl
			.init();

	/**
	 * Returns a new object of class '
	 * <em>Embedded Xtext Editor Configuration</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '
	 *         <em>Embedded Xtext Editor Configuration</em>'.
	 * @generated
	 */
	EmbeddedXtextEditorConfiguration createEmbeddedXtextEditorConfiguration();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmbeddedXtextEditorPackage getEmbeddedxtexteditorPackage();

} // EmbeddedxtexteditorFactory
