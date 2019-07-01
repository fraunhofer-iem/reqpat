package de.fraunhofer.iem.reqpat.core.interfaces;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.uml2.uml.Model;

public interface IResourceValidator {
	/**
	 * Performs extended (error) checks on the given resource.
	 * 
	 * @param resourceToValidate
	 *            the resource to be checked
	 * @param monitor
	 *            the progress monitor
	 * @throws CoreException 
	 */
	void performOclChecks(Model resourceToValidate, IFile markerFile, IProgressMonitor monitor) throws CoreException;
}
