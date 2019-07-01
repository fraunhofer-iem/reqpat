/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.impl;

import de.fraunhofer.iem.reqpat.demo.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoModelFactoryImpl extends EFactoryImpl implements DemoModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DemoModelFactory init() {
		try {
			DemoModelFactory theDemoModelFactory = (DemoModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.fraunhofer.iem.reqpat.demo.model"); 
			if (theDemoModelFactory != null) {
				return theDemoModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DemoModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DemoModelPackage.FUNCTIONAL_DEVICE: return createFunctionalDevice();
			case DemoModelPackage.ANALYSIS_FUNCTION: return createAnalysisFunction();
			case DemoModelPackage.INFORMATION: return createInformation();
			case DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION: return createFunctionalDeviceDefinition();
			case DemoModelPackage.ANALYSIS_FUNCTION_DEFINITION: return createAnalysisFunctionDefinition();
			case DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION: return createSubAnalysisFunctionDefinition();
			case DemoModelPackage.INCOMING_INFORMATION_DEFINITION: return createIncomingInformationDefinition();
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION: return createOutgoingInformationDefinition();
			case DemoModelPackage.INFORMATION_USAGE: return createInformationUsage();
			case DemoModelPackage.INFORMATION_CREATION: return createInformationCreation();
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE: return createAnalysisFunctionPurpose();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDevice createFunctionalDevice() {
		FunctionalDeviceImpl functionalDevice = new FunctionalDeviceImpl();
		return functionalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunction createAnalysisFunction() {
		AnalysisFunctionImpl analysisFunction = new AnalysisFunctionImpl();
		return analysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDeviceDefinition createFunctionalDeviceDefinition() {
		FunctionalDeviceDefinitionImpl functionalDeviceDefinition = new FunctionalDeviceDefinitionImpl();
		return functionalDeviceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionDefinition createAnalysisFunctionDefinition() {
		AnalysisFunctionDefinitionImpl analysisFunctionDefinition = new AnalysisFunctionDefinitionImpl();
		return analysisFunctionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubAnalysisFunctionDefinition createSubAnalysisFunctionDefinition() {
		SubAnalysisFunctionDefinitionImpl subAnalysisFunctionDefinition = new SubAnalysisFunctionDefinitionImpl();
		return subAnalysisFunctionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingInformationDefinition createIncomingInformationDefinition() {
		IncomingInformationDefinitionImpl incomingInformationDefinition = new IncomingInformationDefinitionImpl();
		return incomingInformationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingInformationDefinition createOutgoingInformationDefinition() {
		OutgoingInformationDefinitionImpl outgoingInformationDefinition = new OutgoingInformationDefinitionImpl();
		return outgoingInformationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationUsage createInformationUsage() {
		InformationUsageImpl informationUsage = new InformationUsageImpl();
		return informationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationCreation createInformationCreation() {
		InformationCreationImpl informationCreation = new InformationCreationImpl();
		return informationCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionPurpose createAnalysisFunctionPurpose() {
		AnalysisFunctionPurposeImpl analysisFunctionPurpose = new AnalysisFunctionPurposeImpl();
		return analysisFunctionPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoModelPackage getDemoModelPackage() {
		return (DemoModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DemoModelPackage getPackage() {
		return DemoModelPackage.eINSTANCE;
	}

} //DemoModelFactoryImpl
