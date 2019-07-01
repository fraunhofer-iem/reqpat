/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.EmbeddedXtextEditorConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.EmbeddedXtextEditorFactory;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.EmbeddedXtextEditorPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EmbeddedXtextEditorFactoryImpl extends EFactoryImpl implements
		EmbeddedXtextEditorFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmbeddedXtextEditorPackage getPackage() {
		return EmbeddedXtextEditorPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static EmbeddedXtextEditorFactory init() {
		try {
			EmbeddedXtextEditorFactory theEmbeddedxtexteditorFactory = (EmbeddedXtextEditorFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://de.fraunhofer.ipt.em.swt.isae.embeddedxtexteditor");
			if (theEmbeddedxtexteditorFactory != null) {
				return theEmbeddedxtexteditorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmbeddedXtextEditorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public EmbeddedXtextEditorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EmbeddedXtextEditorPackage.EMBEDDED_XTEXT_EDITOR_CONFIGURATION:
			return createEmbeddedXtextEditorConfiguration();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EmbeddedXtextEditorConfiguration createEmbeddedXtextEditorConfiguration() {
		EmbeddedXtextEditorConfigurationImpl embeddedXtextEditorConfiguration = new EmbeddedXtextEditorConfigurationImpl();
		return embeddedXtextEditorConfiguration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EmbeddedXtextEditorPackage getEmbeddedxtexteditorPackage() {
		return (EmbeddedXtextEditorPackage) getEPackage();
	}

} // EmbeddedxtexteditorFactoryImpl
