package de.fraunhofer.iem.reqpat.core.interfaces;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Defines methods to perform additional validation checks.
 * 
 * @author Frederik Knust, $LastChangedBy: fkl-rt $
 * @version $Rev: 280 $, $Date: 2016-06-10 18:26:06 +0200 (Fr, 10 Jun 2016) $
 */
public interface IValidatorService {

	/**
	 * Getter for the number of tasks. Is required to show a proper progress
	 * bar.
	 * 
	 * @return the number of tasks
	 */
	public int getNumberOfTasks();

	/**
	 * Performs extended (error) checks on the given resource.
	 * 
	 * @param reqPatResource
	 *            the requirement resource to be checked
	 * @param errorLevel
	 *            the error level, defining the granularity of the checks
	 * @param monitor
	 *            the progress monitor
	 */
	public void performExtendedChecks(IReqPatResource reqPatResource,
			int errorLevel, IProgressMonitor monitor, List<IMarker> markers);
}
