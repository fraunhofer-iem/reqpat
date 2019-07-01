package de.fraunhofer.iem.reqpat.demo.validation.ocl.services;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.pivot.uml.UMLStandaloneSetup;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.validation.ComposedEValidator;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;

import de.fraunhofer.iem.reqpat.core.interfaces.IMarker;
import de.fraunhofer.iem.reqpat.core.model.RequirementPattern;
import de.fraunhofer.iem.reqpat.core.validation.util.Marker;

public class CompleteOclValidationRunner {
	private static OCL ocl;
	
	public CompleteOclValidationRunner(){
		this.initializeValidator();
		if (ocl == null){
//			EPackage.Registry registry = EPackage.Registry.INSTANCE;
//			registry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
			ocl = OCL.newInstance();
		}
	}
	
	private void initializeValidator(){
		UMLStandaloneSetup.init();
		CompleteOCLStandaloneSetup.doSetup();
	}
	
	private void removeOldOCLValidators(ComposedEValidator composedValidator){
		List<EValidator> elementsToDelete = new ArrayList<EValidator>();
		for (EValidator val : composedValidator.getChildren())
			if (val instanceof CompleteOCLEObjectValidator)
				elementsToDelete.add(val);
		for(EValidator val : elementsToDelete){
			composedValidator.removeChild(val);
		}
	}
	
	public void performValidation(Model umlModel, URI oclUri, IFile markerFile, IProgressMonitor monitor) throws CoreException{
		ArrayList<IMarker> markers = new ArrayList<IMarker>();
		List<EObject> objectsToValidate = new ArrayList<EObject>();
		objectsToValidate.add(umlModel);
		objectsToValidate.addAll(umlModel.allOwnedElements());
		
		CompleteOCLEObjectValidator myValidator = new CompleteOCLEObjectValidator(UMLPackage.eINSTANCE,
				oclUri, ocl.getEnvironmentFactory());
		
		// WORKAROUND FIXME
		// Pre-validate all EObjects to resolve references
		for (EObject eObj : objectsToValidate) {
			this.validateEObject(eObj, myValidator);
		}
		// WORKAROUND END
		
		
		System.out.println("#### "+new Date().toString()+" ####");
		
		for (EObject eObj : objectsToValidate) {
			BasicDiagnostic diagnostics = this.validateEObject(eObj, myValidator);
			for (Diagnostic constraintResult : diagnostics.getChildren()){
				IMarker.Severity severity = (constraintResult.getSeverity() == Diagnostic.WARNING) ? 
						IMarker.Severity.WARNING : 
						IMarker.Severity.ERROR;
				System.out.println("Result: " + constraintResult.getMessage() + ", Severity: " + severity);
				this.createMarker(markers, severity, constraintResult.getMessage(), markerFile.getFullPath().toPortableString());
			}
		}

		this.placeMarkers(markerFile, markers);
		
	}
	
	private BasicDiagnostic validateEObject(EObject eObj, EValidator validator){
		BasicDiagnostic diagnostics = Diagnostician.INSTANCE.createDefaultDiagnostic(eObj);
		Map<Object, Object> context = Diagnostician.INSTANCE.createDefaultContext();
		validator.validate(eObj, diagnostics, context);
		return diagnostics;
	}
	
	private void placeMarkers(IFile markerFile, List<IMarker> markers) throws CoreException{
		// Add markers to marker file
		markerFile.deleteMarkers("de.fraunhofer.iem.reqpat.rmf.ui.problemmarker", false, 0); // delete
																								// old
																								// markers
		for (IMarker marker : markers) {
			int severity = 0;
			switch (marker.getSeverity()) {
			case ERROR:
				severity = org.eclipse.core.resources.IMarker.SEVERITY_ERROR;
				break;
			case WARNING:
				severity = org.eclipse.core.resources.IMarker.SEVERITY_WARNING;
				break;
			}

			String location = null;

			if (marker.getId() != null && marker.getId().length() > 0) {
				location = markerFile.getName();
			}

			org.eclipse.core.resources.IMarker eclipseMarker = markerFile
					.createMarker("de.fraunhofer.iem.reqpat.rmf.ui.problemmarker");
			eclipseMarker.setAttribute(org.eclipse.core.resources.IMarker.SEVERITY, severity);

			eclipseMarker.setAttribute(org.eclipse.core.resources.IMarker.MESSAGE, marker.getDescription());

			if (location != null)
				eclipseMarker.setAttribute(org.eclipse.core.resources.IMarker.LOCATION, location);
		}
	}
	
	public void performValidation(Resource validationResource, URI oclUri, String pkgUri, EPackage pkg, List<IMarker> markers){
		// Register an extended EValidator for the Complete OCL document constraints
		ComposedEValidator newEValidator = ComposedEValidator.install(pkg);
		
		this.removeOldOCLValidators(newEValidator);
		CompleteOCLEObjectValidator completeOclValidator = new CompleteOCLEObjectValidator(
			pkg, 
			oclUri, 
			ocl.getEnvironmentFactory());
		
		newEValidator.addChild(completeOclValidator);
		
		
		// Validate the object
		Diagnostician diagnostician = Diagnostician.INSTANCE;
		for (EObject eObj : validationResource.getContents()){
			Diagnostic diagnostics = diagnostician.validate(eObj);
		
			// Print the diagnostics
			if (diagnostics.getSeverity() != Diagnostic.OK) {
				
				for (int i = 0; i < diagnostics.getChildren().size(); i++){
					Diagnostic diagnostic = diagnostics.getChildren().get(i);
					List<?> data = diagnostic.getData();
					String source = diagnostic.getSource();
					if (data.size() > 0 && data.get(0) instanceof RequirementPattern){
						source = ((RequirementPattern) data.get(0)).getSpecObject().getId();
					}
					
					IMarker.Severity severity = (diagnostic.getSeverity() == Diagnostic.WARNING) ? 
							IMarker.Severity.WARNING : 
							IMarker.Severity.ERROR;
					createMarker(markers, severity,
							diagnostic.getMessage(), source);
					System.out.println(MessageFormat.format("{0}) Validation result: {1} - {2} - Severity: {3}", 
							String.valueOf(i+1),
							diagnostic.getMessage(), 
							source, 
							severity));
				}
			}
		}
	}
	
	/**
	 * Creates and adds a marker to the markers list.
	 * 
	 * @param markers
	 *            The markers list.
	 * @param severity
	 *            The severity of the problem (error or warning).
	 * @param message
	 *            The problem description.
	 * @param location
	 *            The location (id) of the problem.
	 */
	private void createMarker(List<IMarker> markers,
			Marker.Severity severity, String message, String location) {
		IMarker marker = new Marker(location, message, severity);

		markers.add(marker);
	}
}
