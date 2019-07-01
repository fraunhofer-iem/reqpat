package de.fraunhofer.iem.reqpat.rmf.interfaces;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.parser.ParseException;

import de.fraunhofer.iem.reqpat.rmf.exceptions.PatternException;
import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry.SpecType;

/**
 * 
 * @author Frederik Knust
 * 
 */
public interface IPatternService {

	/**
	 * Builds a ReqPat model for the patterns in the given specification which
	 * have a type that is defined in the pattern descriptors.
	 * 
	 * @param <T>
	 *            Root element of the model
	 * @param reqIf
	 *            The specification's ReqIF model.
	 * @param specification
	 *            The specification.
	 * @param patternDescriptors
	 *            The pattern descriptors.
	 * @param root
	 *            the class of the model's root element
	 * @return A parse result containing the Root object and its resource.
	 * @throws ParseException
	 *             If the patterns could not be parsed.
	 * @throws IOException
	 *             If the resource could not be created.
	 */
	public <T extends EObject> IParseResult<T> buildReqPatModelForSpecification(
			ReqIF reqIf, Specification specification,
			IPatternDescriptor[] patternDescriptors, Class<T> root)
			throws ParseException, IOException;

	/**
	 * Builds a ReqPat model for the patterns in the given specification which
	 * have a type that is defined in the pattern descriptors.
	 * 
	 * @param reqIf
	 *            The specification's ReqIF model.
	 * @param specification
	 *            The specification.
	 * @param patternDescriptors
	 *            The pattern descriptors.
	 * @param patterns
	 *            All patterns will be added to this list in the correct order.
	 *            May be null.
	 * @param origins
	 *            Saves the patterns together with its containing spec
	 *            hierarchy. May be null.
	 * @return A parse result containing the Root object and its resource.
	 * @throws ParseException
	 *             If the patterns could not be parsed.
	 * @throws IOException
	 *             If the resource could not be created.
	 */
	public <T extends EObject> IParseResult<T> buildReqPatModelForSpecification(
			ReqIF reqIf, Specification specification,
			IPatternDescriptor[] patternDescriptors, List<String> patterns,
			Map<String, SpecHierarchy> origins, Class<T> root)
			throws ParseException, IOException;

	/**
	 * Uses the Xtext parser to create a ReqPat model from the given string.
	 * 
	 * @param s
	 *            The string containing the requirements.
	 * @return The ReqPat model's Root object and the xtext resource.
	 * @throws IOException
	 *             If the Xtext resource can't be created.
	 * @throws ParseException
	 *             If the requirements cannot be parsed to a ReqPat model.
	 */
	public <T extends EObject> IParseResult<T> buildReqPatModelFromString(
			String s, Class<T> root) throws IOException, ParseException;

	/**
	 * Builds the mode from the specification and checks it for errors using the
	 * IValidationService.
	 * 
	 * @param shell
	 *            a shell which can be used to show error messages
	 * @param resource
	 *            the (eclipse) resource containing the ReqIF model
	 * @param specification
	 *            the specification containing the model
	 */
	public void checkDocument(Shell shell, IResource resource,
			Specification specification);

	/**
	 * Builds and returns the (default) pattern descriptors.
	 * 
	 * @param reqIf
	 *            the ReqIF model for that the pattern descriptors shall be
	 *            built
	 * @return an array containing the pattern descriptors
	 * @throws PatternException
	 *             if the pattern descriptors could not be created
	 */
	public IPatternDescriptor[] getPatternDescriptors(ReqIF reqIf)
			throws PatternException;

	/**
	 * Builds (if required) and returns the pattern descriptors for the given
	 * spec types.
	 * 
	 * @param reqIf
	 *            the ReqIF model for that the pattern descriptors shall be
	 *            built
	 * @param specTypes
	 *            the spec types
	 * @return an array containing the pattern descriptors
	 * @throws PatternException
	 *             if the pattern descriptors could not be created
	 */
	public IPatternDescriptor[] getPatternDescriptors(ReqIF reqIf,
			SpecType... specTypes) throws PatternException;

}
