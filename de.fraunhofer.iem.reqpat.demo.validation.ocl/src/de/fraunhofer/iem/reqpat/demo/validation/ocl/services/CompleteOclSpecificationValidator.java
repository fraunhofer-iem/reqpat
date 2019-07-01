package de.fraunhofer.iem.reqpat.demo.validation.ocl.services;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.fraunhofer.iem.reqpat.core.interfaces.IMarker;
import de.fraunhofer.iem.reqpat.core.interfaces.IReqPatResource;
import de.fraunhofer.iem.reqpat.core.interfaces.IValidationService;
import de.fraunhofer.iem.reqpat.core.interfaces.IValidatorService;
import de.fraunhofer.iem.reqpat.core.model.Specification;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage;

/**
 * 
 * @author Roman Trentinaglia, $LastChangedBy: fkl-rt $
 * @version $Rev: 278 $, $Date: 2016-06-10 18:19:47 +0200 (Fr, 10 Jun 2016) $
 */
public class CompleteOclSpecificationValidator implements IValidatorService {
	private URI oclURI = null;
	
	public CompleteOclSpecificationValidator(){
		this.createPlatformCompleteOclURI();
	}
	
	private static final int NOOFTASKS = 1;
	private static final String COMPLETEOCLPATH = "de.fraunhofer.iem.reqpat.demo.validation.ocl/completeocl/specification_validation.ocl";
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.interfaces.IValidatorService#getNumberOfTasks
	 * ()
	 */
	@Override
	public int getNumberOfTasks() {
		return NOOFTASKS;
	}
	
	private void createPlatformCompleteOclURI(){
		URI oclURI = URI
				.createPlatformPluginURI(
						COMPLETEOCLPATH,
						true);
		this.setCompleteOclUri(oclURI);
	}
	
	public void setCompleteOclUri(URI completeOclUri){
		this.oclURI = completeOclUri;
	}

	@Override
	public void performExtendedChecks(IReqPatResource reqPatResource, int errorLevel, IProgressMonitor monitor, List<IMarker> markers) {
		
		if (errorLevel < IValidationService.ERRORLEVEL_ALL) {
			monitor.worked(NOOFTASKS);
			return;
		}

		if (reqPatResource.asXtextResource().getContents().isEmpty()) {
			monitor.worked(NOOFTASKS);
			return;
		}
		
		EObject eObject = reqPatResource.asXtextResource().getContents().get(0);

		if (!(eObject instanceof Specification)) {
			throw new RuntimeException("Model is not of type 'Specification'.");
		}

		performOclChecks(reqPatResource.asXtextResource(), monitor, markers);
	}

	private void performOclChecks(Resource specificationResource, IProgressMonitor monitor, List<IMarker> markers) {
		CompleteOclValidationRunner runner = new CompleteOclValidationRunner();
		runner.performValidation(specificationResource, this.oclURI, DemoModelPackage.eNS_URI, DemoModelPackage.eINSTANCE, markers);
		monitor.worked(NOOFTASKS);
	}
}
