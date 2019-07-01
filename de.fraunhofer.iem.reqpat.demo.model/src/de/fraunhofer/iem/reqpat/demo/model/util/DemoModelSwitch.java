/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.util;

import de.fraunhofer.iem.reqpat.core.model.RequirementPattern;

import de.fraunhofer.iem.reqpat.demo.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage
 * @generated
 */
public class DemoModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DemoModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoModelSwitch() {
		if (modelPackage == null) {
			modelPackage = DemoModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DemoModelPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.FUNCTIONAL_DEVICE: {
				FunctionalDevice functionalDevice = (FunctionalDevice)theEObject;
				T result = caseFunctionalDevice(functionalDevice);
				if (result == null) result = caseFunction(functionalDevice);
				if (result == null) result = caseNamedElement(functionalDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.ANALYSIS_FUNCTION: {
				AnalysisFunction analysisFunction = (AnalysisFunction)theEObject;
				T result = caseAnalysisFunction(analysisFunction);
				if (result == null) result = caseFunction(analysisFunction);
				if (result == null) result = caseNamedElement(analysisFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.INFORMATION: {
				Information information = (Information)theEObject;
				T result = caseInformation(information);
				if (result == null) result = caseNamedElement(information);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION: {
				FunctionalDeviceDefinition functionalDeviceDefinition = (FunctionalDeviceDefinition)theEObject;
				T result = caseFunctionalDeviceDefinition(functionalDeviceDefinition);
				if (result == null) result = caseRequirementPattern(functionalDeviceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.ANALYSIS_FUNCTION_DEFINITION: {
				AnalysisFunctionDefinition analysisFunctionDefinition = (AnalysisFunctionDefinition)theEObject;
				T result = caseAnalysisFunctionDefinition(analysisFunctionDefinition);
				if (result == null) result = caseRequirementPattern(analysisFunctionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION: {
				SubAnalysisFunctionDefinition subAnalysisFunctionDefinition = (SubAnalysisFunctionDefinition)theEObject;
				T result = caseSubAnalysisFunctionDefinition(subAnalysisFunctionDefinition);
				if (result == null) result = caseRequirementPattern(subAnalysisFunctionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.INCOMING_INFORMATION_DEFINITION: {
				IncomingInformationDefinition incomingInformationDefinition = (IncomingInformationDefinition)theEObject;
				T result = caseIncomingInformationDefinition(incomingInformationDefinition);
				if (result == null) result = caseRequirementPattern(incomingInformationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION: {
				OutgoingInformationDefinition outgoingInformationDefinition = (OutgoingInformationDefinition)theEObject;
				T result = caseOutgoingInformationDefinition(outgoingInformationDefinition);
				if (result == null) result = caseRequirementPattern(outgoingInformationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.INFORMATION_USAGE: {
				InformationUsage informationUsage = (InformationUsage)theEObject;
				T result = caseInformationUsage(informationUsage);
				if (result == null) result = caseRequirementPattern(informationUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.INFORMATION_CREATION: {
				InformationCreation informationCreation = (InformationCreation)theEObject;
				T result = caseInformationCreation(informationCreation);
				if (result == null) result = caseRequirementPattern(informationCreation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE: {
				AnalysisFunctionPurpose analysisFunctionPurpose = (AnalysisFunctionPurpose)theEObject;
				T result = caseAnalysisFunctionPurpose(analysisFunctionPurpose);
				if (result == null) result = caseRequirementPattern(analysisFunctionPurpose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDevice(FunctionalDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisFunction(AnalysisFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Device Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Device Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalDeviceDefinition(FunctionalDeviceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Function Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisFunctionDefinition(AnalysisFunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Analysis Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Analysis Function Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubAnalysisFunctionDefinition(SubAnalysisFunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Information Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingInformationDefinition(IncomingInformationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Information Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingInformationDefinition(OutgoingInformationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationUsage(InformationUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationCreation(InformationCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Function Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Function Purpose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisFunctionPurpose(AnalysisFunctionPurpose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementPattern(RequirementPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DemoModelSwitch
