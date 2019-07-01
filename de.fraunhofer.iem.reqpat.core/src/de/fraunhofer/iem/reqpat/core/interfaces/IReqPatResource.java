package de.fraunhofer.iem.reqpat.core.interfaces;

import org.eclipse.xtext.resource.XtextResource;

/**
 * Resource containing requirement pattern instances (text compliant to ReqPat
 * grammar).
 * 
 * @author Markus Fockel, $LastChangedBy: fkl-fk $
 * @version $Rev: 83 $, $Date: 2013-09-18 14:43:32 +0200 (Mi, 18 Sep 2013) $
 */
public interface IReqPatResource {
	/**
	 * @return This set of requirement pattern instances as text compliant to
	 *         the ReqPat (core) grammar.
	 */
	String asString();

	/**
	 * @return This set of requirement pattern instances as an XtextResource.
	 */
	XtextResource asXtextResource();

	/**
	 * Get the id of the SpecObject that the given offset lies in.
	 * 
	 * @param offset
	 *            Offset in the textual resource to find id for
	 * @return The SpecObject's id or null if no container object was found.
	 */
	String getSpecObjectIdForOffset(int offset);
}
