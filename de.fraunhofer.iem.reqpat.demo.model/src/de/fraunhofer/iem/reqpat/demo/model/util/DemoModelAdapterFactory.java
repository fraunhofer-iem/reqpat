/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.util;

import de.fraunhofer.iem.reqpat.core.model.RequirementPattern;

import de.fraunhofer.iem.reqpat.demo.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage
 * @generated
 */
public class DemoModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DemoModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DemoModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemoModelSwitch<Adapter> modelSwitch =
		new DemoModelSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseFunctionalDevice(FunctionalDevice object) {
				return createFunctionalDeviceAdapter();
			}
			@Override
			public Adapter caseAnalysisFunction(AnalysisFunction object) {
				return createAnalysisFunctionAdapter();
			}
			@Override
			public Adapter caseInformation(Information object) {
				return createInformationAdapter();
			}
			@Override
			public Adapter caseFunctionalDeviceDefinition(FunctionalDeviceDefinition object) {
				return createFunctionalDeviceDefinitionAdapter();
			}
			@Override
			public Adapter caseAnalysisFunctionDefinition(AnalysisFunctionDefinition object) {
				return createAnalysisFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseSubAnalysisFunctionDefinition(SubAnalysisFunctionDefinition object) {
				return createSubAnalysisFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseIncomingInformationDefinition(IncomingInformationDefinition object) {
				return createIncomingInformationDefinitionAdapter();
			}
			@Override
			public Adapter caseOutgoingInformationDefinition(OutgoingInformationDefinition object) {
				return createOutgoingInformationDefinitionAdapter();
			}
			@Override
			public Adapter caseInformationUsage(InformationUsage object) {
				return createInformationUsageAdapter();
			}
			@Override
			public Adapter caseInformationCreation(InformationCreation object) {
				return createInformationCreationAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseAnalysisFunctionPurpose(AnalysisFunctionPurpose object) {
				return createAnalysisFunctionPurposeAdapter();
			}
			@Override
			public Adapter caseRequirementPattern(RequirementPattern object) {
				return createRequirementPatternAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice <em>Functional Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice
	 * @generated
	 */
	public Adapter createFunctionalDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction
	 * @generated
	 */
	public Adapter createAnalysisFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition <em>Functional Device Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition
	 * @generated
	 */
	public Adapter createFunctionalDeviceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition <em>Analysis Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition
	 * @generated
	 */
	public Adapter createAnalysisFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition <em>Sub Analysis Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition
	 * @generated
	 */
	public Adapter createSubAnalysisFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition <em>Incoming Information Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition
	 * @generated
	 */
	public Adapter createIncomingInformationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition <em>Outgoing Information Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition
	 * @generated
	 */
	public Adapter createOutgoingInformationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.InformationUsage <em>Information Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.InformationUsage
	 * @generated
	 */
	public Adapter createInformationUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.InformationCreation <em>Information Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.InformationCreation
	 * @generated
	 */
	public Adapter createInformationCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose <em>Analysis Function Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose
	 * @generated
	 */
	public Adapter createAnalysisFunctionPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fraunhofer.iem.reqpat.core.model.RequirementPattern <em>Requirement Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.core.model.RequirementPattern
	 * @generated
	 */
	public Adapter createRequirementPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DemoModelAdapterFactory
