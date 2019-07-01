package de.fraunhofer.iem.reqpat.rmf.interfaces;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.swt.widgets.Shell;

import de.fraunhofer.iem.reqpat.rmf.exceptions.PatternException;

public interface IReqIfService {

	public static final String MARKER_ORIGIN_INJECT = "marker origin inject";

	/**
	 * Builds the prefix and suffix for the Xtext editor.
	 * 
	 * @param specification
	 *            The specification of the open Specification editor.
	 * @param openSpecObject
	 *            The spec object that shall be edited.
	 * @param patternDescriptors
	 *            the pattern descriptors to build the prefix and suffix
	 * @param prefix
	 *            A StringBuilder that can hold the prefix.
	 * @param suffix
	 *            A StringBuilder that can hold the suffix.
	 * @throws PatternException
	 *             If the ReqIF model is malformed.
	 */
	public void buildPrefixAndSuffix(Specification specification,
			SpecObject openSpecObject, IPatternDescriptor[] patternDescriptors,
			StringBuilder prefix, StringBuilder suffix) throws PatternException;

	/**
	 * Creates a copy of the given attribute value.
	 * 
	 * @param source
	 *            The attribute value to be copied.
	 * @param specObjectType
	 *            The type of the attribute value's spec object.
	 * @param cache
	 *            The attribute definition cache for the given spec object type.
	 * @return The copied attribute value.
	 * @throws IllegalArgumentException
	 *             If the attribute value has no attribute definition.
	 * @throws InputMismatchException
	 *             If the attribute definition cannot be found in the target
	 *             model.
	 */
	public AttributeValue copyAttributeValue(AttributeValue source,
			SpecObjectType specObjectType,
			Map<String, AttributeDefinition> cache)
			throws IllegalArgumentException, InputMismatchException;

	/**
	 * Creates a copy of the given attribute value enumeration.
	 * 
	 * @param source
	 *            The attribute value to be copied.
	 * @param specObjectType
	 *            The type of the attribute value's spec object.
	 * @param cache
	 *            The attribute definition cache for the given spec object type.
	 * @return The copied attribute value.
	 * @throws IllegalArgumentException
	 *             If the attribute value has no attribute definition.
	 * @throws InputMismatchException
	 *             If the attribute definition cannot be found in the target
	 *             model.
	 */
	public AttributeValueEnumeration copyAttributeValueEnumeration(
			AttributeValueEnumeration source, SpecObjectType specObjectType,
			Map<String, AttributeDefinition> cache)
			throws IllegalArgumentException, InputMismatchException;

	/**
	 * Creates FindAndReplaceCommands for the description attributes in the
	 * given specification that match one of the given pattern descriptors.
	 * 
	 * @param specification
	 *            The specification. May not be null.
	 * @param patternDescriptors
	 *            The pattern descriptors. May not be null or empty.
	 * @param find
	 *            The "find" string. May not be null or empty.
	 * @param replace
	 *            The "replace" string. May not be null.
	 * @return A list of FindAndReplace commands.
	 */
	public List<Command> createFindAndReplaceCommands(
			Specification specification,
			IPatternDescriptor[] patternDescriptors, String find, String replace);

	/**
	 * Fetches the attribute definition with the given name from the given spec
	 * object type.
	 * 
	 * @param specObjectType
	 *            The spec object type.
	 * @param name
	 *            The name of the attribute definition.
	 * @return The attribute definition if found, otherwise null.
	 */
	public AttributeDefinition findAttributeDefinition(SpecObjectType specType,
			String name);

	/**
	 * Looks for a spec object that has an attribute string of the given type
	 * with the given value.
	 * 
	 * @param reqIf
	 *            The ReqIf model containing the spec objects.
	 * @param specType
	 *            The spec object type of the sought spec object.
	 * @param attributeDefinition
	 *            The attribute definition of the attribute that shall be
	 *            compared.
	 * @param value
	 *            The sought value of the attribute.
	 * @return The spec object if found, otherwise null.
	 */
	public SpecObject findSpecObjectWithGivenAttributeValue(ReqIF reqIf,
			SpecObjectType specType, AttributeDefinition attributeDefinition,
			String value);

	/**
	 * Looks for a spec object type with the given name.
	 * 
	 * @param reqIf
	 *            The ReqIF model containing the spec object types.
	 * @param name
	 *            The name of the spec object type.
	 * @return The spec object type if found, otherwise null.
	 */
	public SpecObjectType findSpecType(ReqIF reqIf, String name);

	/**
	 * Fetches the AttributeValueString from the spec object that has the given
	 * attribute definition.
	 * 
	 * @param attributeDefinition
	 *            The attribute definition of the attribute value.
	 * @param specObject
	 *            The spec object with the wanted attribute value.
	 * @return The attribute value if found, otherwise null.
	 */
	public AttributeValueString getAttributeValueString(
			AttributeDefinition attributeDefinition, SpecObject specObject);

	/**
	 * Fetches all AttributeValueStrings from the SpecObjects with the given
	 * SpecObjectType in the given Specification.
	 * 
	 * @param specification
	 *            The Specification.
	 * @param specObjectType
	 *            The SpecObjectType.
	 * @param attributeDefinitionString
	 *            The AttributeDefinition for the attributes that shall be
	 *            fetched.
	 * @return A list of matched AttributeValueStrings.
	 */
	public List<AttributeValueString> getAttributeValueStrings(
			Specification specification, SpecObjectType specObjectType,
			AttributeDefinition attributeDefinition);

	/**
	 * Returns the value of the attribute value string with the given attribute
	 * definition.
	 * 
	 * @param attributeDefinition
	 *            The attribute definition.
	 * @param specObject
	 *            The spec object containing a value with the given attribute
	 *            definition.
	 * @return The value or null if none was found.
	 */
	public String getAttributeValueStringValue(
			AttributeDefinition attributeDefinition, SpecObject specObject);

	/**
	 * Returns the value of the given spec object's ID attribute.
	 * 
	 * @param specObject
	 *            The spec object.
	 * @return The ID if the spec object has one, otherwise null.
	 */
	public String getIdValue(SpecObject specObject);

	/**
	 * Returns the value of the left header label (e.g. 1.1.2) of the given spec
	 * hierarchy.
	 * 
	 * Copied from
	 * org.eclipse.rmf.pror.reqif10.editor.agilegrid.ProrLayoutAdvisor.
	 * 
	 * Adjusted to take specHierarchy instead of row number.
	 * 
	 * @param specHierarchy
	 * @return The left header label, or null if the spec hierarchy is null.
	 */
	public String getLeftHeaderLabel(SpecHierarchy specHierarchy);

	/**
	 * Returns the ID of the spec hierarchy's parent.
	 * 
	 * @param specHierarchy
	 *            The spec hierarchy.
	 * @return The ID or null, if the parent has no ID or if te spec hierarchy
	 *         has no parent.
	 */
	public String getParentId(SpecHierarchy specHierarchy);

	/**
	 * Returns the ID of the spec hierarchy's parent if it is set in the
	 * provided map.
	 * 
	 * @param specHierarchy
	 *            The spec hierarchy.
	 * @param ids
	 *            The map containing all IDs.
	 * @return The ID if it was found in the map, otherwise null.
	 */
	public String getParentId(SpecHierarchy specHierarchy,
			Map<SpecHierarchy, String> ids);

	/**
	 * Fetches all placeholders (defined by the placeholderPattern) from the
	 * given ReqIF model.
	 * 
	 * @param reqIf
	 *            The ReqIF model containing the requirements/heading with the
	 *            placeholders.
	 * @return The set of placeholders contained in the ReqIF model.
	 */
	public Set<String> getPlaceholder(ReqIF reqIf);

	/**
	 * Fetches an object of the given presentation configuration class from the
	 * pror tool extensions.
	 * 
	 * @param prorToolExtensions
	 *            The list of pror tool extensions.
	 * @param presentationConfigurationClass
	 *            The class of the presentation configuration to be returned.
	 * @return The presentation configuration if one exists, otherwise null.
	 */
	public <U extends ProrPresentationConfiguration> U getPresentationConfiguration(
			List<ProrToolExtension> prorToolExtensions,
			Class<U> presentationConfigurationClass);

	/**
	 * Returns the (Eclipse) project for a given EObject.
	 * 
	 * @param eObject
	 *            The EObject.
	 * @return The (Eclipse) project.
	 */
	public IProject getProject(EObject eObject);

	/**
	 * Fetches the pror tool extensions from the given ReqIF model.
	 * 
	 * @param reqIf
	 *            The ReqIF model.
	 * @return The pror tool extensions.
	 */
	public List<ProrToolExtension> getProrToolExtensions(ReqIF reqIf);

	/**
	 * Returns the (Eclipse) resource for a given EObject.
	 * 
	 * @param eObject
	 *            The EObject.
	 * @return The (Eclipse) resource.
	 */
	public IResource getResource(EObject eObject);

	/**
	 * Returns the spec hierarchy with the given RMF identifier (not the ID!).
	 * 
	 * @param reqIf
	 *            The ReqIF model containing the spec hierarchy.
	 * @param identifier
	 *            The RMF identifier.
	 * @return The spec hierarchy if found, otherwise null.
	 */
	public SpecHierarchy getSpecHierarchy(ReqIF reqIf, String identifier);

	/**
	 * Returns the first! spec hierarchy which as the given spec object as spec
	 * object.
	 * 
	 * @param specObject
	 *            The spec object.
	 * @return The spec hierarchy if any, otherwise null.
	 */
	public SpecHierarchy getSpecHierarchy(SpecObject specObject);

	/**
	 * Returns the specification containing the given spec hierarchy.
	 * 
	 * @param specHierarchy
	 *            The spec hierarchy.
	 * @return The specification.
	 */
	public Specification getSpecification(SpecHierarchy specHierarchy);

	/**
	 * Returns the specification from the active ReqIF Specification editor.
	 * 
	 * @return The specification or null if no specification editor is active.
	 */
	public Specification getSpecificationFromActiveEditor();

	/**
	 * Fetches the values with the given spec types and attribute definition
	 * from the given spec hierarchy.
	 * 
	 * Calls the method recursively for all children of the spec hierarchy.
	 * 
	 * Note: Could be replace with a TreeIterator.
	 * 
	 * @param specHierarchy
	 *            The current spec hierarchy.
	 * @param values
	 *            This list is filled by this method with the values.
	 * @param origins
	 *            This map is filled by this method with the origins.
	 * @param specTypes
	 *            The spec types that shall be considered by this method.
	 * @param attributeDefinitionForSpecType
	 *            The attribute definitions for the spec types that shall be
	 *            considered.
	 */
	public void getValuesRecursively(
			SpecHierarchy specHierarchy,
			List<String> values,
			Map<String, SpecHierarchy> origins,
			Set<SpecObjectType> specTypes,
			Map<SpecObjectType, AttributeDefinition> attributeDefinitionForSpecType);

	/**
	 * Loads the ReqIF model from the given resource.
	 * 
	 * @param template
	 *            The resource containing the ReqIF model.
	 * @return The ReqIF model or null if the model could not be loaded.
	 */
	public ReqIF loadReqIf(IResource template);

	/**
	 * Create a new Spec Object with the given type and attributes.
	 * 
	 * @param type
	 *            the spec object type of the new spec object
	 * @return the new spec object
	 */
	public SpecObject newSpecObject(SpecObjectType type);

	/**
	 * Opens an error pop-up.
	 * 
	 * @param shell
	 *            The shell to create the pop-up.
	 * @param title
	 *            The title of the pop-up.
	 * @param message
	 *            The message of the pop-up.
	 */
	public void showErrorPopup(Shell shell, String title, String message);

	
	/**
	 * Opens an warning pop-up.
	 * 
	 * @param shell
	 *            The shell to create the pop-up.
	 * @param title
	 *            The title of the pop-up.
	 * @param message
	 *            The message of the pop-up.
	 */
	public void showWarningPopup(Shell shell, String title, String message);
}
