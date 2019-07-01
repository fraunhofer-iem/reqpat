package de.fraunhofer.iem.reqpat.rmf.adapter.services;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.fraunhofer.iem.reqpat.core.interfaces.IMainService;
import de.fraunhofer.iem.reqpat.core.interfaces.IMarker;
import de.fraunhofer.iem.reqpat.core.interfaces.IReqPatResource;
import de.fraunhofer.iem.reqpat.core.interfaces.IValidationService;
import de.fraunhofer.iem.reqpat.core.interfaces.IXtextService;
import de.fraunhofer.iem.reqpat.rmf.adapter.builders.FreeTextPatternBuilder;
import de.fraunhofer.iem.reqpat.rmf.adapter.builders.HeadingPatternBuilder;
import de.fraunhofer.iem.reqpat.rmf.adapter.builders.RequirementPatternBuilder;
import de.fraunhofer.iem.reqpat.rmf.adapter.descriptors.PatternDescriptor;
import de.fraunhofer.iem.reqpat.rmf.adapter.util.ParseResult;
import de.fraunhofer.iem.reqpat.rmf.exceptions.PatternException;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry.Attribute;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IParseResult;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternBuilder;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternDescriptor;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry;
import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry.SpecType;

/**
 * 
 * @author Frederik Knust
 * @author $LastChangedBy: fkl-rt $
 * @version $Rev: 251 $, $Date: 2016-03-11 18:12:18 +0100 (Fr, 11 Mär 2016) $
 * 
 */
public class PatternService implements IPatternService, IMainService {

	/**
	 * Helper class to be able to reuse the IValidationService.
	 * 
	 * @author Frederik Knust
	 * 
	 */
	private static class ReqIfReqPatResource implements IReqPatResource {

		private final IReqIfService reqIfService;

		private final List<String> patterns;

		private final Map<String, SpecHierarchy> requirementOrigins;

		private final XtextResource xtextResource;

		private String patternsAsString;

		/**
		 * Constructor of the ReqIfReqPatResource class.
		 */
		public ReqIfReqPatResource(IReqIfService reqIfService,
				List<String> patterns,
				Map<String, SpecHierarchy> requirementOrigins,
				XtextResource xtextResource) {
			Assert.isNotNull(reqIfService);
			Assert.isNotNull(patterns);
			Assert.isNotNull(requirementOrigins);
			Assert.isNotNull(xtextResource);

			this.reqIfService = reqIfService;
			this.patterns = patterns;
			this.requirementOrigins = requirementOrigins;
			this.xtextResource = xtextResource;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * de.fraunhofer.iem.reqpat.core.interfaces.IReqPatResource#asString()
		 */
		@Override
		public String asString() {
			if (patternsAsString == null) {
				StringBuilder sb = new StringBuilder();
				for (String pattern : patterns)
					sb.append(pattern);

				patternsAsString = sb.toString();
			}

			return patternsAsString;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * de.fraunhofer.iem.reqpat.core.interfaces.IReqPatResource#asXtextResource
		 * ()
		 */
		@Override
		public XtextResource asXtextResource() {
			return xtextResource;
		}

		/**
		 * Finds the requirement and its spec hierarchy for a given offset.
		 * 
		 * @param totalOffset
		 *            The offset of the error.
		 * @param requirements
		 *            The list of all requirements.
		 * @param requirementOrigins
		 *            The map connecting the requirement to their spec
		 *            hierarchies.
		 * @return The spec hierarchy if found, otherwise null.
		 */
		private SpecHierarchy getErrorOrigin(int totalOffset,
				List<String> requirements,
				Map<String, SpecHierarchy> requirementOrigins) {
			int offset = 0;

			Iterator<String> it = requirements.iterator();
			while (it.hasNext() && offset <= totalOffset) {
				String requirement = it.next();

				if (totalOffset >= offset
						&& totalOffset < offset + requirement.length()) {

					return requirementOrigins.get(requirement);
				}

				offset += requirement.length();
			}

			return null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.fraunhofer.iem.reqpat.core.interfaces.IReqPatResource#
		 * getSpecObjectIdForOffset(int)
		 */
		@Override
		public String getSpecObjectIdForOffset(int offset) {
			SpecHierarchy specHierarchy = getErrorOrigin(offset, patterns,
					requirementOrigins);

			SpecObject specObject = specHierarchy != null ? specHierarchy
					.getObject() : null;

			return specObject != null ? reqIfService.getIdValue(specObject)
					: null;
		}
	}

	private final IReqIfService reqIfService;
	private final IValidationService validationService;
	private final IAttributeRegistry attributeRegistry;
	private final ISpecTypeRegistry specTypeRegistry;

	private final String markerOrigin;
	private final String xtextFileExtension;

	private final Map<ReqIF, IPatternDescriptor[]> cache;

	/**
	 * Constructor for the PatternService class.
	 * 
	 * @param reqIfService
	 *            instance of the ReqIF service
	 * @param idAttribute
	 *            the id attribute name
	 * @param descriptionAttribute
	 *            the description attribute name
	 */
	@Inject
	public PatternService(IReqIfService reqIfService,
			IValidationService validationService,
			IAttributeRegistry attributeRegistry,
			ISpecTypeRegistry specTypeRegistry,
			@Named(IReqIfService.MARKER_ORIGIN_INJECT) String markerOrigin,
			@Named(IXtextService.XTEXT_FILE_EXTENSION) String xtextFileExtension) {
		Assert.isNotNull(reqIfService);
		Assert.isNotNull(validationService);
		Assert.isNotNull(attributeRegistry);
		Assert.isNotNull(specTypeRegistry);
		Assert.isNotNull(markerOrigin);
		Assert.isNotNull(xtextFileExtension);

		this.reqIfService = reqIfService;
		this.validationService = validationService;
		this.attributeRegistry = attributeRegistry;
		this.specTypeRegistry = specTypeRegistry;
		this.markerOrigin = markerOrigin;
		this.xtextFileExtension = xtextFileExtension;

		cache = new Hashtable<ReqIF, IPatternDescriptor[]>();
	}

	/**
	 * Builds a pattern descriptor for the given ReqIF model according to the
	 * given spec type name.
	 * 
	 * @param reqIf
	 *            The ReqIF model.
	 * @param specTypeName
	 *            The spec type's name.
	 * @param patternBuilder
	 *            The pattern builder for the pattern descriptor.
	 * @return The pattern descriptor.
	 * @throws PatternException
	 *             If the pattern descriptor could not be created.
	 */
	private IPatternDescriptor buildPatternDescriptor(ReqIF reqIf,
			String specTypeName, IPatternBuilder patternBuilder)
			throws PatternException {
		SpecObjectType specType = reqIfService
				.findSpecType(reqIf, specTypeName);
		if (specType == null)
			throw new PatternException("Spec type missing",
					MessageFormat.format("No type with name ''{0}'' found.",
							specTypeName));

		String descriptionAttributeName = attributeRegistry
				.getAttributeName(Attribute.Description);

		// fetch the description attribute definition for the spec type
		AttributeDefinition descriptionAttributeDefinition = reqIfService
				.findAttributeDefinition(specType, descriptionAttributeName);
		if (descriptionAttributeDefinition == null
				|| !(descriptionAttributeDefinition instanceof AttributeDefinitionString))
			throw new PatternException("Description attribute missing",
					MessageFormat.format(
							"The type ''{0}'' has no attribute named ''{1}''.",
							specTypeName, descriptionAttributeName));

		String idAttributeName = attributeRegistry
				.getAttributeName(Attribute.ID);

		// fetch the id attribute definition for the spec type
		AttributeDefinition idAttributeDefinition = reqIfService
				.findAttributeDefinition(specType, idAttributeName);

		if (idAttributeDefinition == null
				|| !(idAttributeDefinition instanceof AttributeDefinitionString))
			throw new PatternException("ID attribute missing",
					MessageFormat.format(
							"The type ''{0}'' has no attribute named ''{1}''.",
							specTypeName, idAttributeName));

		return new PatternDescriptor(specTypeName, specType,
				idAttributeDefinition, descriptionAttributeDefinition,
				patternBuilder);
	}

	// @Override
	// public void checkReqIfDocument(ReqIF reqIf) {
	//
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternService#
	 * buildReqPatModelForSpecification(org.eclipse.rmf.reqif10.ReqIF,
	 * org.eclipse.rmf.reqif10.Specification,
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternDescriptor[],
	 * java.lang.Class)
	 */
	@Override
	public <T extends EObject> IParseResult<T> buildReqPatModelForSpecification(
			ReqIF reqIf, Specification specification,
			IPatternDescriptor[] patternDescriptors, Class<T> root)
			throws ParseException, IOException {
		return buildReqPatModelForSpecification(reqIf, specification,
				patternDescriptors, null, null, root);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternService#
	 * buildReqPatModelForSpecification(org.eclipse.rmf.reqif10.ReqIF,
	 * org.eclipse.rmf.reqif10.Specification,
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternDescriptor[],
	 * java.util.List, java.util.Map, java.lang.Class)
	 */
	@Override
	public <T extends EObject> IParseResult<T> buildReqPatModelForSpecification(
			ReqIF reqIf, Specification specification,
			IPatternDescriptor[] patternDescriptors, List<String> patterns,
			Map<String, SpecHierarchy> origins, Class<T> root)
			throws ParseException, IOException {
		Assert.isNotNull(reqIf);
		Assert.isNotNull(specification);
		Assert.isNotNull(patternDescriptors);
		Assert.isLegal(patternDescriptors.length != 0);

		Map<SpecObjectType, IPatternDescriptor> specTypes = new Hashtable<SpecObjectType, IPatternDescriptor>();

		/*
		 * Add the pattern descriptor to the specTypes dictionary, which helps
		 * to find the correct pattern descriptor for each SpecObjectType.
		 */
		for (IPatternDescriptor patternDescriptor : patternDescriptors)
			specTypes.put(patternDescriptor.getSpecType(), patternDescriptor);

		Map<SpecHierarchy, String> ids = new Hashtable<SpecHierarchy, String>();
		StringBuilder sb = new StringBuilder();

		TreeIterator<EObject> treeIterator = specification.eAllContents();
		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();

			if (!(eObject instanceof SpecHierarchy))
				continue;

			SpecHierarchy specHierarchy = (SpecHierarchy) eObject;

			if (!specHierarchy.isSetObject())
				continue;

			SpecObject specObject = specHierarchy.getObject();

			// check if the spec object has one of the specified types
			if (!specTypes.containsKey(specObject.getType()))
				continue;

			IPatternDescriptor patternDescriptor = specTypes.get(specObject
					.getType());

			// fetch the ID, the ParentID and the value itself
			String id = reqIfService.getAttributeValueStringValue(
					patternDescriptor.getIdAttributeDefinition(), specObject);
			String parentId = reqIfService.getParentId(specHierarchy, ids);
			String value = reqIfService.getAttributeValueStringValue(
					patternDescriptor.getDescriptionAttributeDefinition(),
					specObject);

			if (value != null && value.trim().length() > 0) {
				String pattern = patternDescriptor.getPatternBuilder()
						.buildPattern(id, parentId, value);
				sb.append(pattern);

				if (id != null && id.length() > 0)
					ids.put(specHierarchy, id);

				if (patterns != null)
					patterns.add(pattern);

				if (origins != null)
					origins.put(pattern, specHierarchy);
			}
		}

		return buildReqPatModelFromString(sb.toString(), root);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternService#
	 * buildReqPatModelFromString(java.lang.String, java.lang.Class)
	 */
	@Override
	public <T extends EObject> IParseResult<T> buildReqPatModelFromString(
			String s, Class<T> root) throws IOException, ParseException {
		ResourceSet resourceSet = new ResourceSetImpl();
		XtextResource xtextResource = (XtextResource) resourceSet
				.createResource(URI.createURI(String.format("%s.%s", UUID
						.randomUUID().toString(), xtextFileExtension)));

		xtextResource.load(new StringInputStream(s), Collections.EMPTY_MAP);

		if (xtextResource == null || xtextResource.getContents() == null
				|| xtextResource.getContents().isEmpty()) {
			throw new ParseException("Unable to parse Requirements.");
		}

		Object obj = xtextResource.getContents().get(0);

		if (obj == null || !(root.isInstance(obj))) {
			throw new ParseException(MessageFormat.format(
					"Parse result has no root element with type ''{0}''.",
					root.getSimpleName()));
		}

		IParseResult<T> parseResult = new ParseResult<T>(root.cast(obj),
				xtextResource);
		return parseResult;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternService#checkDocument
	 * (org.eclipse.rmf.reqif10.Specification)
	 */
	@Override
	public void checkDocument(Shell shell, IResource resource,
			Specification specification) {
		/*
		 * A specification should be present, otherwise the document can't be
		 * checked.
		 */
		if (specification == null) {
			reqIfService.showErrorPopup(shell, "No Specification found",
					"Your ReqIf model seems to be invalid.");
			return;
		}

		ReqIF reqIf = ReqIF10Util.getReqIF(specification);

		// /*
		// * Start fetching the spec types for the free text requirements and
		// * setting the corresponding attribute definition.
		// */
		//
		// Set<SpecObjectType> freeTextRequirementSpecTypes = new
		// HashSet<SpecObjectType>();
		// Map<SpecObjectType, AttributeDefinition>
		// attributeDefinitionToFreeTextRequirementSpecTypes = new
		// Hashtable<SpecObjectType, AttributeDefinition>();
		//
		// String freeTextRequirementTypeName = specTypeRegistry
		// .getSpecTypeName(SpecType.FreeText);
		//
		// SpecObjectType freeTextRequirementType = reqIfService.findSpecType(
		// reqIf, freeTextRequirementTypeName);
		// if (freeTextRequirementType == null) {
		// reqIfService.showErrorPopup(shell,
		// "Free Text Requirement type missing", MessageFormat.format(
		// "No type with name ''{0}'' found.",
		// freeTextRequirementTypeName));
		// return;
		// }
		//
		// String descriptionAttributeName = attributeRegistry
		// .getAttributeName(Attribute.Description);
		//
		// freeTextRequirementSpecTypes.add(freeTextRequirementType);
		//
		// AttributeDefinition freeTextRequirementDescription = reqIfService
		// .findAttributeDefinition(freeTextRequirementType,
		// descriptionAttributeName);
		// if (freeTextRequirementDescription == null
		// || !(freeTextRequirementDescription instanceof
		// AttributeDefinitionString)) {
		// reqIfService.showErrorPopup(shell, "Description attribute missing",
		// MessageFormat.format(
		// "The type ''{0}'' has no attribute named ''{1}''.",
		// freeTextRequirementTypeName,
		// descriptionAttributeName));
		// return;
		// }
		//
		// attributeDefinitionToFreeTextRequirementSpecTypes.put(
		// freeTextRequirementType, freeTextRequirementDescription);
		//
		// /*
		// * End fetching the spec types for the free text requirement types.
		// */

		IPatternDescriptor[] patternDescriptors;

		try {
			patternDescriptors = getPatternDescriptors(reqIf);
		} catch (PatternException e) {
			reqIfService.showErrorPopup(shell, e.getTitle(), e.getMessage());
			return;
		}

		/*
		 * This list will contain all pattern in the correct order. It is
		 * required to find the error origin.
		 */
		List<String> patterns = new ArrayList<String>();

		/*
		 * This map contains all patterns with the corresponding
		 * SpecHierarchies. It is required to find the error origin.
		 */
		Map<String, SpecHierarchy> requirementOrigins = new Hashtable<String, SpecHierarchy>();

		IParseResult<EObject> parseResult;

		try {
			parseResult = buildReqPatModelForSpecification(reqIf,
					specification, patternDescriptors, patterns,
					requirementOrigins, EObject.class);
		} catch (Exception e) {
			reqIfService.showErrorPopup(shell, e.getClass().getSimpleName(),
					e.getMessage());
			return;
		}

		XtextResource xtextResource = parseResult.getXtextResource();

		IReqPatResource reqPatResource = new ReqIfReqPatResource(reqIfService,
				patterns, requirementOrigins, xtextResource);

		List<IMarker> markers = validationService.validate(reqPatResource,
				IValidationService.ERRORLEVEL_ALL);

		try {
			// remove the old problem markers
			resource.deleteMarkers(
					"de.fraunhofer.iem.reqpat.rmf.ui.problemmarker", false, 0);
		} catch (CoreException e) {
		}

		Map<String, SpecHierarchy> specObjectIdToSpecHierarchy = new Hashtable<String, SpecHierarchy>();

		for (SpecHierarchy specHierarchy : requirementOrigins.values()) {
			if (!specHierarchy.isSetObject())
				continue;

			SpecObject specObject = specHierarchy.getObject();
			String id = reqIfService.getIdValue(specObject);

			if (id == null || id.length() == 0)
				continue;

			if (specObjectIdToSpecHierarchy.containsKey(id))
				continue;

			specObjectIdToSpecHierarchy.put(id, specHierarchy);
		}

		/*
		 * Transform the custom IMarkers to standard eclipse IMarkers.
		 */
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

			String origin = null;
			String location = null;

			if (marker.getId() != null && marker.getId().length() > 0) {
				SpecHierarchy specHierarchy = specObjectIdToSpecHierarchy
						.get(marker.getId());

				if (specHierarchy != null) {
					location = reqIfService.getLeftHeaderLabel(specHierarchy);

					origin = specHierarchy.getIdentifier();
				}
			}

			createMarker(resource, severity, marker.getDescription(), origin,
					location != null ? location : "None");
		}
	}

	/**
	 * Creates a marker for the given resource.
	 * 
	 * @param resource
	 *            The resource.
	 * @param severity
	 *            The severity of the marker (e.g. IMarker.SEVERITY_WARNING)
	 * @param message
	 *            The message of the marker.
	 * @param specHierarchy
	 *            The spec hierarchy pointing to the requirement this marker is
	 *            about.
	 * @param location
	 *            The location of the marker (e.g. the requirements ID).
	 */
	private void createMarker(IResource resource, int severity, String message,
			String origin, String location) {
		try {
			org.eclipse.core.resources.IMarker marker = resource
					.createMarker("de.fraunhofer.iem.reqpat.rmf.ui.problemmarker");
			marker.setAttribute(org.eclipse.core.resources.IMarker.SEVERITY,
					severity);
			marker.setAttribute(org.eclipse.core.resources.IMarker.MESSAGE,
					message);

			if (origin != null) {
				marker.setAttribute(markerOrigin, origin);
			}

			if (location != null)
				marker.setAttribute(
						org.eclipse.core.resources.IMarker.LOCATION, location);
		} catch (CoreException ex) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternService#
	 * getPatternDescriptors(org.eclipse.rmf.reqif10.ReqIF)
	 */
	@Override
	public IPatternDescriptor[] getPatternDescriptors(ReqIF reqIf)
			throws PatternException {
		Assert.isNotNull(reqIf);

		if (cache.containsKey(reqIf))
			return cache.get(reqIf);

		IPatternDescriptor[] patternDescriptors = new IPatternDescriptor[] {
				buildPatternDescriptor(reqIf,
						specTypeRegistry.getSpecTypeName(SpecType.Heading),
						new HeadingPatternBuilder()),
				buildPatternDescriptor(reqIf,
						specTypeRegistry.getSpecTypeName(SpecType.FreeText),
						new FreeTextPatternBuilder()),
				buildPatternDescriptor(reqIf,
						specTypeRegistry.getSpecTypeName(SpecType.Requirement),
						new RequirementPatternBuilder()) };

		cache.put(reqIf, patternDescriptors);
		return patternDescriptors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService#getPatternDescriptors
	 * (org.eclipse.rmf.reqif10.ReqIF,
	 * de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry.SpecType[])
	 */
	@Override
	public IPatternDescriptor[] getPatternDescriptors(ReqIF reqIf,
			SpecType... specTypes) throws PatternException {
		Assert.isNotNull(reqIf);
		Assert.isLegal(specTypes != null && specTypes.length > 0);

		IPatternDescriptor[] patternDescriptors = null;
		if (!cache.containsKey(reqIf))
			patternDescriptors = getPatternDescriptors(reqIf);
		else
			patternDescriptors = cache.get(reqIf);

		int index = 0;
		IPatternDescriptor[] subset = new IPatternDescriptor[specTypes.length];

		for (SpecType specType : specTypes) {
			IPatternDescriptor patternDescriptorForSpecType = null;

			for (IPatternDescriptor patternDescriptor : patternDescriptors) {
				String specTypeName = specTypeRegistry
						.getSpecTypeName(specType);

				if (patternDescriptor.getName().equals(specTypeName)) {
					patternDescriptorForSpecType = patternDescriptor;
					break;
				}
			}

			if (patternDescriptorForSpecType == null)
				throw new PatternException(
						"Pattern Descriptor not found",
						MessageFormat
								.format("There is no pattern descriptor for the spec type ''{0}''.",
										specType.name()));

			subset[index++] = patternDescriptorForSpecType;
		}

		return subset;
	}

}
