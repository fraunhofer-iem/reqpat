package de.fraunhofer.iem.reqpat.core.interfaces;

import java.util.List;

/**
 * 
 * @author Markus Fockel, $LastChangedBy: fkl $
 * @version $Rev: 24 $, $Date: 2013-07-10 14:26:29 +0200 (Mi, 10 Jul 2013) $
 */
public interface IValidationService {
	/** Error level: Check everything possible */
	public static final int ERRORLEVEL_ALL = 1000;
	/** Error level: All but the complex (model/OCL) checks */
	public static final int ERRORLEVEL_NOCOMPLEX = 600;
	/** Error level: Show only errors that stop ReqPat from working correctly */
	public static final int ERRORLEVEL_CRITICALSONLY = 1;

	/**
	 * Validate the given resource.
	 * 
	 * @param resource
	 *            The resource to validate.
	 * @param errorLevel
	 *            level of errors to check for
	 * @return List of found errors
	 */
	List<IMarker> validate(IReqPatResource resource, int errorLevel);
}
