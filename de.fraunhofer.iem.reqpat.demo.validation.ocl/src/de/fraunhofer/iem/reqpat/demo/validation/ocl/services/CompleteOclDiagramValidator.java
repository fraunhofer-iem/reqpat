package de.fraunhofer.iem.reqpat.demo.validation.ocl.services;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Model;

import de.fraunhofer.iem.reqpat.core.interfaces.IResourceValidator;

/**
 * 
 * @author Roman Trentinaglia, $LastChangedBy: fkl $
 * @version $Rev: 270 $, $Date: 2016-04-22 11:31:29 +0200 (Fr, 22 Apr 2016) $
 */
public class CompleteOclDiagramValidator implements IResourceValidator {
	private URI oclURI = null;
	private static final int NOOFTASKS = 1;
	private static final String COMPLETEOCLPATH = "de.fraunhofer.iem.reqpat.demo.validation.ocl/completeocl/sysml_validation.ocl";
	
	public CompleteOclDiagramValidator() {
		this.createPlatformCompleteOclURI();

	}

	private void createPlatformCompleteOclURI() {
		URI oclURI = URI.createPlatformPluginURI(COMPLETEOCLPATH, true);
		this.setCompleteOclUri(oclURI);
	}

	public void setCompleteOclUri(URI completeOclUri) {
		this.oclURI = completeOclUri;
	}

	public void performOclChecks(Model umlModel, IFile markerFile, IProgressMonitor monitor)
			throws CoreException {
		
		CompleteOclValidationRunner runner = new CompleteOclValidationRunner();
		runner.performValidation(umlModel, this.oclURI, markerFile, monitor);
		monitor.worked(NOOFTASKS);
	}
}
