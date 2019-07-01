package de.fraunhofer.iem.reqpat.rmf.ui.services;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.editor.presentation.ReqifSpecificationEditorInput;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceSetImpl;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Inject;

import de.fraunhofer.iem.reqpat.rmf.exceptions.PatternException;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry.Attribute;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternDescriptor;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.ui.Activator;
import de.fraunhofer.iem.reqpat.rmf.ui.commands.FindAndReplaceCommand;

/**
 * This class offers a set of convenience methods for easier
 * modifications/access to a ReqIF model.
 * 
 * @author Frederik Knust
 * 
 */
public class ReqIfService implements IReqIfService {

	private final IAttributeRegistry attributeRegistry;

	private final Pattern placeholderPattern = Pattern
			.compile("(<[A-Za-z0-9 ]+>)");

	/**
	 * Default constructor for the ReqIfService class.
	 * 
	 * @param attributeRegistry
	 *            instance of the attribute registry
	 */
	@Inject
	public ReqIfService(IAttributeRegistry attributeRegistry) {
		Assert.isNotNull(attributeRegistry);
		this.attributeRegistry = attributeRegistry;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * buildPrefixAndSuffix(org.eclipse.rmf.reqif10.Specification,
	 * org.eclipse.rmf.reqif10.SpecObject, java.lang.StringBuilder,
	 * java.lang.StringBuilder)
	 */
	@Override
	public void buildPrefixAndSuffix(Specification specification,
			SpecObject openSpecObject, IPatternDescriptor[] patternDescriptors,
			StringBuilder prefix, StringBuilder suffix) throws PatternException {

		Assert.isNotNull(specification);

		if (!specification.isSetChildren())
			return;

		Map<SpecObjectType, IPatternDescriptor> specTypes = new Hashtable<SpecObjectType, IPatternDescriptor>();

		/*
		 * Add the pattern descriptor to the specTypes dictionary, which helps
		 * to find the correct pattern descriptor for each SpecObjectType.
		 */
		for (IPatternDescriptor patternDescriptor : patternDescriptors)
			specTypes.put(patternDescriptor.getSpecType(), patternDescriptor);

		TreeIterator<EObject> it = specification.eAllContents();

		StringBuilder sb = prefix;

		while (it.hasNext()) {
			EObject eObject = it.next();

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
			String id = getAttributeValueStringValue(
					patternDescriptor.getIdAttributeDefinition(), specObject);
			String parentId = getParentId(specHierarchy);
			String value = getAttributeValueStringValue(
					patternDescriptor.getDescriptionAttributeDefinition(),
					specObject);

			// if the open spec object has been reached continue with the suffix
			if (specObject == openSpecObject) {

				String[] values = patternDescriptor.getPatternBuilder()
						.buildPatternPrefixAndSuffix(id, parentId);

				// add the prefix of the pattern to the prefix string builder
				sb.append(values[0]);

				sb = suffix;

				// add the suffix of the pattern to the suffix string builder
				sb.append(values[1]);

				continue;
			}

			patternDescriptor.getPatternBuilder().buildAndAppendPattern(sb, id,
					parentId, value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService#newSpecObject(org
	 * .eclipse.rmf.reqif10.SpecObjectType)
	 */
	@Override
	public SpecObject newSpecObject(SpecObjectType type) {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();

		if (type == null)
			return specObject;
		
		specObject.setType(type);

		for (AttributeDefinition attributeDefinition : type.getSpecAttributes()) {
			AttributeValue value = ReqIF10Util
					.createAttributeValue(attributeDefinition);
			specObject.getValues().add(value);
		}

		return specObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#copyAttributeValue
	 * (org.eclipse.rmf.reqif10.AttributeValue,
	 * org.eclipse.rmf.reqif10.SpecObjectType, java.util.Map)
	 */
	@Override
	public AttributeValue copyAttributeValue(AttributeValue source,
			SpecObjectType specObjectType,
			Map<String, AttributeDefinition> cache)
			throws IllegalArgumentException, InputMismatchException {
		/*
		 * We can use the EcoreUtil's copy method here as Attribute Values have
		 * no identifier. This way the copy has the correct type (e.g.
		 * AttributeValueString) and the correct value.
		 */
		AttributeValue copy = EcoreUtil.copy(source);

		/*
		 * Get the value of the source's Definition field and try to find a
		 * corresponding definition in the target model.
		 */
		if (source.eClass() != null
				&& source.eClass().getEAllStructuralFeatures() != null) {
			EStructuralFeature definitionFeature = source.eClass()
					.getEStructuralFeature("definition");

			if (definitionFeature != null) {
				Object o = copy.eGet(definitionFeature);

				if (o != null && o instanceof AttributeDefinition) {
					AttributeDefinition sourceAd = (AttributeDefinition) o;

					String sourceAdName = sourceAd.getLongName();

					AttributeDefinition targetAd = cache.get(sourceAdName);

					/*
					 * Check if an Attribute Definition has been found in the
					 * cache. If not, check the target model's spec object type
					 * for an Attribute Definition with the provided name.
					 */
					if (targetAd == null) {
						targetAd = findAttributeDefinition(specObjectType,
								sourceAdName);

						if (targetAd == null)
							throw new InputMismatchException(
									MessageFormat
											.format("Unable to find Attribute Definition ''{0}'' in target model for Spec Object Type ''{1}''.",
													sourceAdName,
													specObjectType
															.getLongName()));

						cache.put(sourceAdName, targetAd);
					}

					copy.eSet(definitionFeature, targetAd);
				}

				return copy;
			}
		}

		throw new IllegalArgumentException(MessageFormat.format(
				"The Attribute Value ''{0}'' has no type definition",
				source.toString()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * copyAttributeValueEnumeration
	 * (org.eclipse.rmf.reqif10.AttributeValueEnumeration,
	 * org.eclipse.rmf.reqif10.SpecObjectType, java.util.Map)
	 */
	@Override
	public AttributeValueEnumeration copyAttributeValueEnumeration(
			AttributeValueEnumeration source, SpecObjectType specObjectType,
			Map<String, AttributeDefinition> cache)
			throws IllegalArgumentException, InputMismatchException {
		AttributeValueEnumeration copy = ReqIF10Factory.eINSTANCE
				.createAttributeValueEnumeration();

		if (source.isSetDefinition()) {
			String sourceAdName = source.getDefinition().getLongName();

			AttributeDefinition targetAd = cache.get(sourceAdName);

			/*
			 * Check if an Attribute Definition has been found in the cache. If
			 * not, check the target model's spec object type for an Attribute
			 * Definition with the provided name.
			 */
			if (targetAd == null) {
				targetAd = findAttributeDefinition(specObjectType, sourceAdName);

				if (targetAd == null)
					throw new InputMismatchException(
							MessageFormat
									.format("Unable to find Attribute Definition ''{0}'' in target model for Spec Object Type ''{1}''.",
											sourceAdName,
											specObjectType.getLongName()));

				cache.put(sourceAdName, targetAd);
			}

			if (!(targetAd instanceof AttributeDefinitionEnumeration))
				throw new IllegalArgumentException(
						MessageFormat
								.format("Attribute Definition ''{0}'' in target model for Spec Object Type ''{1}'' is not of type AttributeDefinitionEnumeration.",
										sourceAdName,
										specObjectType.getLongName()));

			AttributeDefinitionEnumeration adEnum = (AttributeDefinitionEnumeration) targetAd;

			copy.setDefinition(adEnum);

			/*
			 * Check if the source Attribute Value has values. Try to match the
			 * each value to a corresponding value of the target attribute
			 * definition.
			 */
			if (source.isSetValues()) {
				List<EnumValue> sourceValues = source.getValues();

				if (adEnum.isSetType()
						&& adEnum.getType().isSetSpecifiedValues()) {
					List<EnumValue> targetValues = adEnum.getType()
							.getSpecifiedValues();

					for (EnumValue sourceValue : sourceValues) {
						EnumValue matchedValue = null;

						for (EnumValue targetValue : targetValues) {

							if (sourceValue.isSetLongName()
									&& targetValue.isSetLongName()) {

								if (sourceValue.getLongName().equals(
										targetValue.getLongName())) {
									matchedValue = targetValue;
									break;
								}
							}
						}

						// check if a valid match has been found
						if (matchedValue != null)
							copy.getValues().add(matchedValue);
						else
							throw new InputMismatchException(
									MessageFormat
											.format("Unable to match Enum Value ''{0}'' in target model for Enum Type ''{1}''.",
													sourceValue.getLongName(),
													adEnum.getLongName()));
					}
				}
			}

			return copy;
		}

		throw new IllegalArgumentException(MessageFormat.format(
				"The Attribute Value ''{0}'' has no type definition.",
				source.toString()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * createFindAndReplaceCommands(org.eclipse.rmf.reqif10.Specification,
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternDescriptor[],
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Command> createFindAndReplaceCommands(
			Specification specification,
			IPatternDescriptor[] patternDescriptors, String find, String replace) {
		Assert.isNotNull(specification);
		Assert.isLegal(patternDescriptors != null
				&& patternDescriptors.length > 0);
		Assert.isLegal(find != null && find.length() > 0);
		Assert.isNotNull(replace);

		List<Command> commands = new ArrayList<Command>();

		Map<SpecObjectType, IPatternDescriptor> specTypes = new Hashtable<SpecObjectType, IPatternDescriptor>();

		/*
		 * Add the pattern descriptor to the specTypes dictionary, which helps
		 * to find the correct pattern descriptor for each SpecObjectType.
		 */
		for (IPatternDescriptor patternDescriptor : patternDescriptors)
			specTypes.put(patternDescriptor.getSpecType(), patternDescriptor);

		TreeIterator<EObject> it = specification.eAllContents();

		while (it.hasNext()) {
			EObject eObject = it.next();

			if (!(eObject instanceof SpecHierarchy))
				continue;

			SpecHierarchy specHierarchy = (SpecHierarchy) eObject;

			if (!specHierarchy.isSetObject())
				continue;

			SpecObject specObject = specHierarchy.getObject();

			if (!specObject.isSetType())
				continue;

			if (!specTypes.containsKey(specObject.getType()))
				continue;

			IPatternDescriptor patternDescriptor = specTypes.get(specObject
					.getType());

			AttributeValueString descriptionAttribute = getAttributeValueString(
					patternDescriptor.getDescriptionAttributeDefinition(),
					specObject);
			String value = descriptionAttribute.getTheValue();

			if (value == null || value.length() == 0)
				continue;

			/*
			 * Create a command if the value contains the "find" string.
			 */
			if (value.contains(find)) {
				FindAndReplaceCommand command = new FindAndReplaceCommand(
						descriptionAttribute, find, replace);
				commands.add(command);
			}
		}

		return commands;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * findAttributeDefinition(org.eclipse.rmf.reqif10.SpecObjectType,
	 * java.lang.String)
	 */
	@Override
	public AttributeDefinition findAttributeDefinition(SpecObjectType specType,
			String name) {
		if (specType != null && specType.isSetSpecAttributes()) {
			List<AttributeDefinition> specAttributes = specType
					.getSpecAttributes();

			for (AttributeDefinition specAttribute : specAttributes) {
				if (specAttribute.getLongName() != null
						&& specAttribute.getLongName().equals(name)) {
					return specAttribute;
				}
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * findSpecObjectWithGivenAttributeValue(org.eclipse.rmf.reqif10.ReqIF,
	 * org.eclipse.rmf.reqif10.SpecObjectType,
	 * org.eclipse.rmf.reqif10.AttributeDefinition, java.lang.String)
	 */
	@Override
	public SpecObject findSpecObjectWithGivenAttributeValue(ReqIF reqIf,
			SpecObjectType specType, AttributeDefinition attributeDefinition,
			String value) {
		if (reqIf == null || !reqIf.isSetCoreContent())
			return null;

		ReqIFContent content = reqIf.getCoreContent();

		if (!content.isSetSpecObjects())
			return null;

		List<SpecObject> specObjects = content.getSpecObjects();

		// find SpecObject with given value
		for (SpecObject specObject : specObjects) {
			if (specObject.getType() != specType)
				continue;

			AttributeValueString avs = getAttributeValueString(
					attributeDefinition, specObject);

			if (avs == null)
				return null;

			if (value.equals(avs.getTheValue()))
				return specObject;
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#findSpecType
	 * (org.eclipse.rmf.reqif10.ReqIF, java.lang.String)
	 */
	@Override
	public SpecObjectType findSpecType(ReqIF reqIf, String name) {
		if (reqIf != null && reqIf.isSetCoreContent()) {
			ReqIFContent reqIfContent = reqIf.getCoreContent();

			if (reqIfContent.isSetSpecTypes()) {
				List<SpecType> specTypes = reqIfContent.getSpecTypes();

				for (SpecType specType : specTypes) {
					if (specType.getLongName() != null
							&& specType.getLongName().equals(name)) {
						return (SpecObjectType) specType;
					}
				}
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * getAttributeValueString(org.eclipse.rmf.reqif10.AttributeDefinition,
	 * org.eclipse.rmf.reqif10.SpecObject)
	 */
	@Override
	public AttributeValueString getAttributeValueString(
			AttributeDefinition attributeDefinition, SpecObject specObject) {
		if (specObject == null || !specObject.isSetValues())
			return null;

		List<AttributeValue> values = specObject.getValues();

		for (AttributeValue value : values) {
			if (!(value instanceof AttributeValueString))
				continue;

			AttributeValueString avs = (AttributeValueString) value;

			if (avs.getDefinition() == attributeDefinition)
				return avs;
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * getAttributeValueStrings(org.eclipse.rmf.reqif10.Specification,
	 * org.eclipse.rmf.reqif10.SpecObjectType,
	 * org.eclipse.rmf.reqif10.AttributeDefinition)
	 */
	@Override
	public List<AttributeValueString> getAttributeValueStrings(
			Specification specification, SpecObjectType specObjectType,
			AttributeDefinition attributeDefinition) {
		if (specification == null)
			return Collections.emptyList();

		List<AttributeValueString> values = new ArrayList<AttributeValueString>();

		TreeIterator<EObject> it = specification.eAllContents();

		/*
		 * Go through the elements in the spec hierarchy and fetch the attribute
		 * values with the given attribute definition.
		 */
		while (it.hasNext()) {
			EObject o = it.next();

			if (!(o instanceof SpecHierarchy))
				continue;

			SpecHierarchy specHierarchy = (SpecHierarchy) o;

			if (!specHierarchy.isSetObject())
				continue;

			SpecObject specObject = specHierarchy.getObject();

			if (!(specObject.getType() == specObjectType))
				continue;

			AttributeValueString avs = getAttributeValueString(
					attributeDefinition, specObject);

			if (avs == null)
				continue;

			values.add(avs);
		}

		return values;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * getAttributeValueStringValue(org.eclipse.rmf.reqif10.AttributeDefinition,
	 * org.eclipse.rmf.reqif10.SpecObject)
	 */
	@Override
	public String getAttributeValueStringValue(
			AttributeDefinition attributeDefinition, SpecObject specObject) {
		AttributeValueString avs = getAttributeValueString(attributeDefinition,
				specObject);

		if (avs != null)
			return avs.getTheValue();

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getIdValue
	 * (org.eclipse.rmf.reqif10.SpecObject)
	 */
	@Override
	public String getIdValue(SpecObject specObject) {
		if (specObject == null)
			return null;

		SpecObjectType specObjectType = specObject.getType();

		if (specObjectType == null)
			return null;

		AttributeDefinition idAttributeDefinition = findAttributeDefinition(
				specObjectType,
				attributeRegistry.getAttributeName(Attribute.ID));

		if (idAttributeDefinition == null)
			return null;

		if (specObject.isSetValues()) {
			List<AttributeValue> values = specObject.getValues();

			for (AttributeValue av : values) {
				if (av instanceof AttributeValueString) {
					AttributeValueString avs = (AttributeValueString) av;
					if (idAttributeDefinition == avs.getDefinition()) {
						return avs.getTheValue();
					}
				}
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getLeftHeaderLabel
	 * (org.eclipse.rmf.reqif10.SpecHierarchy)
	 */
	@Override
	public String getLeftHeaderLabel(SpecHierarchy specHierarchy) {
		StringBuffer sb = new StringBuffer();

		if (specHierarchy == null) {
			return null;
		}

		while (specHierarchy.eContainer() instanceof SpecHierarchy) {
			SpecHierarchy parent = (SpecHierarchy) specHierarchy.eContainer();
			int level = parent.getChildren().indexOf(specHierarchy) + 1;
			sb.insert(0, level);
			sb.insert(0, ".");
			specHierarchy = parent;
		}
		if (specHierarchy.eContainer() instanceof Specification) {
			Specification parent = (Specification) specHierarchy.eContainer();
			int level = parent.getChildren().indexOf(specHierarchy) + 1;
			sb.insert(0, level);
		}
		return sb.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getParentId
	 * (org.eclipse.rmf.reqif10.SpecHierarchy)
	 */
	@Override
	public String getParentId(SpecHierarchy specHierarchy) {
		if (specHierarchy == null || specHierarchy.eContainer() == null)
			return null;

		if (specHierarchy.eContainer() instanceof SpecHierarchy) {
			SpecObject parentSpecObject = ((SpecHierarchy) specHierarchy
					.eContainer()).getObject();

			if (parentSpecObject == null)
				return null;

			return getIdValue(parentSpecObject);
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getParentId
	 * (org.eclipse.rmf.reqif10.SpecHierarchy, java.util.Map)
	 */
	@Override
	public String getParentId(SpecHierarchy specHierarchy,
			Map<SpecHierarchy, String> ids) {
		if (specHierarchy == null || ids == null)
			return null;

		if (specHierarchy.eContainer() instanceof SpecHierarchy) {
			SpecHierarchy parentSpecHierarchy = (SpecHierarchy) specHierarchy
					.eContainer();

			if (ids.containsKey(parentSpecHierarchy)) {
				return ids.get(parentSpecHierarchy);
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getPlaceholder
	 * (org.eclipse.rmf.reqif10.ReqIF)
	 */
	@Override
	public Set<String> getPlaceholder(ReqIF reqIf) {
		Set<String> placeholder = new HashSet<String>();

		if (reqIf != null) {
			if (reqIf.isSetCoreContent()) {
				ReqIFContent reqIfContent = reqIf.getCoreContent();

				if (reqIfContent.isSetSpecObjects()) {
					List<SpecObject> specObjects = reqIfContent
							.getSpecObjects();

					for (SpecObject specObject : specObjects) {
						if (specObject.isSetValues()) {
							List<AttributeValue> attributeValues = specObject
									.getValues();

							for (AttributeValue attributeValue : attributeValues) {
								Object value = ReqIF10Util
										.getTheValue(attributeValue);

								if (value != null && value instanceof String) {
									Matcher matcher = placeholderPattern
											.matcher((String) value);

									while (matcher.find()) {
										placeholder.add(matcher.group(1));
									}
								}
							}
						}
					}
				}

			}

		}

		return placeholder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * getPresentationConfiguration(java.util.List, java.lang.Class)
	 */
	@Override
	public <U extends ProrPresentationConfiguration> U getPresentationConfiguration(
			List<ProrToolExtension> prorToolExtensions,
			Class<U> presentationConfigurationClass) {
		if (prorToolExtensions != null && !prorToolExtensions.isEmpty()) {
			for (ProrToolExtension prorToolExtension : prorToolExtensions) {
				if (prorToolExtension.getPresentationConfigurations() != null
						&& prorToolExtension.getPresentationConfigurations()
								.getPresentationConfigurations() != null) {
					for (ProrPresentationConfiguration prorPresentationConfiguration : prorToolExtension
							.getPresentationConfigurations()
							.getPresentationConfigurations()) {
						if (presentationConfigurationClass
								.isInstance(prorPresentationConfiguration)) {
							return presentationConfigurationClass
									.cast(prorPresentationConfiguration);
						}
					}
				}
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getProject
	 * (org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public IProject getProject(EObject eObject) {
		IResource resource = getResource(eObject);

		if (resource != null)
			return resource.getProject();

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * getProrToolExtensions(org.eclipse.rmf.reqif10.ReqIF)
	 */
	@Override
	public List<ProrToolExtension> getProrToolExtensions(ReqIF reqIf) {
		List<ProrToolExtension> prorToolExtensions = new ArrayList<ProrToolExtension>();

		if (reqIf != null && reqIf.isSetToolExtensions()
				&& !reqIf.getToolExtensions().isEmpty()) {

			for (ReqIFToolExtension reqIfToolExtension : reqIf
					.getToolExtensions()) {
				if (!reqIfToolExtension.getExtensions().isEmpty()) {
					EList<EObject> extList = reqIfToolExtension.getExtensions();

					for (EObject ext : extList) {
						if (ext != null && ext instanceof ProrToolExtension) {
							prorToolExtensions.add((ProrToolExtension) ext);
						}
					}
				}
			}
		}

		return prorToolExtensions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getResource
	 * (org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public IResource getResource(EObject eObject) {
		if (eObject == null)
			return null;

		IResource resource = null;

		Object o = eObject.eResource();

		if (o != null && o instanceof ReqIF10ResourceImpl) {
			ReqIF10ResourceImpl reqIfResource = (ReqIF10ResourceImpl) o;

			resource = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(reqIfResource.getURI().toPlatformString(true));
		}

		return resource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getSpecHierarchy
	 * (org.eclipse.rmf.reqif10.ReqIF, java.lang.String)
	 */
	@Override
	public SpecHierarchy getSpecHierarchy(ReqIF reqIf, String identifier) {
		if (reqIf != null && reqIf.isSetCoreContent() && identifier != null) {
			ReqIFContent coreContent = reqIf.getCoreContent();

			if (coreContent.isSetSpecifications()) {
				List<Specification> specifications = coreContent
						.getSpecifications();

				TreeIterator<Object> treeIterator = EcoreUtil
						.getAllContents(specifications);

				while (treeIterator.hasNext()) {
					Object obj = treeIterator.next();

					if (obj instanceof SpecHierarchy) {
						SpecHierarchy specHierarchy = (SpecHierarchy) obj;

						if (specHierarchy.isSetIdentifier()
								&& specHierarchy.getIdentifier().equals(
										identifier))
							return specHierarchy;
					}
				}
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getSpecHierarchy
	 * (org.eclipse.rmf.reqif10.SpecObject)
	 */
	@Override
	public SpecHierarchy getSpecHierarchy(SpecObject specObject) {
		ReqIF reqIf = ReqIF10Util.getReqIF(specObject);
		for (Specification specification : reqIf.getCoreContent()
				.getSpecifications()) {
			TreeIterator<EObject> it = specification.eAllContents();
			while (it.hasNext()) {
				EObject eObj = it.next();
				if (eObj instanceof SpecHierarchy) {
					SpecHierarchy specHier = (SpecHierarchy) eObj;
					if (specHier.getObject() == specObject) {
						return specHier;
					}
				}
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#getSpecification
	 * (org.eclipse.rmf.reqif10.SpecHierarchy)
	 */
	@Override
	public Specification getSpecification(SpecHierarchy specHierarchy) {
		if (specHierarchy != null) {
			EObject eObject = specHierarchy;

			while (eObject != null && !(eObject instanceof Specification)) {
				eObject = eObject.eContainer();
			}

			if (eObject != null && eObject instanceof Specification) {
				return (Specification) eObject;
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * getSpecificationFromActiveEditor()
	 */
	@Override
	public Specification getSpecificationFromActiveEditor() {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		IEditorPart editor = page.getActiveEditor();

		if (editor instanceof SpecificationEditor) {
			IEditorInput editorInput = editor.getEditorInput();

			if (editorInput instanceof ReqifSpecificationEditorInput) {
				return ((ReqifSpecificationEditorInput) editorInput).getSpec();
			}
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#
	 * getValuesRecursively(org.eclipse.rmf.reqif10.SpecHierarchy,
	 * java.util.List, java.util.Map, java.util.Set, java.util.Map)
	 */
	@Override
	public void getValuesRecursively(
			SpecHierarchy specHierarchy,
			List<String> values,
			Map<String, SpecHierarchy> origins,
			Set<SpecObjectType> specTypes,
			Map<SpecObjectType, AttributeDefinition> attributeDefinitionForSpecType) {
		if (specHierarchy == null)
			return;

		if (specHierarchy.isSetObject()) {
			SpecObject specObject = specHierarchy.getObject();

			// check if the object has the requirement type
			if (specObject.isSetType()) {
				SpecObjectType specType = specObject.getType();

				if (specTypes.contains(specType)) {
					AttributeDefinition attributeDefinition = attributeDefinitionForSpecType
							.get(specType);

					/*
					 * The correct value can only be found if an attribute
					 * definition is set for this spec type.
					 */
					if (attributeDefinition != null) {

						/*
						 * The object has specified type, so go through the
						 * object's attribute values to find the attribute.
						 */
						if (specObject.isSetValues()) {
							List<AttributeValue> attributeValues = specObject
									.getValues();

							for (AttributeValue attributeValue : attributeValues) {
								if (attributeValue instanceof AttributeValueString) {
									AttributeValueString attributeValueString = (AttributeValueString) attributeValue;

									// check if this is the correct attribute
									if (attributeValueString.getDefinition() == attributeDefinition) {
										String value = attributeValueString
												.getTheValue();

										/*
										 * If the value is null the
										 * specification contains a new
										 * requirement which value has not been
										 * set.
										 * 
										 * If the value is empty this
										 * requirement can be ignored.
										 * 
										 * In both cases the loop can be left at
										 * this point.
										 */
										if (value == null
												|| value.length() == 0)
											break;

										/*
										 * The description attribute has been
										 * found, so add the value to the
										 * StringBuilder and terminate the loop.
										 */
										values.add(attributeValueString
												.getTheValue());
										origins.put(value, specHierarchy);
										break;
									}
								}
							}
						}
					}
				}
			}
		}

		/*
		 * Call the method recursively for all children. This way the order of
		 * the requirements is maintained.
		 */
		if (specHierarchy.isSetChildren()) {
			List<SpecHierarchy> children = specHierarchy.getChildren();

			for (SpecHierarchy child : children) {
				getValuesRecursively(child, values, origins, specTypes,
						attributeDefinitionForSpecType);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#loadReqIf(
	 * org.eclipse.core.resources.IResource)
	 */
	@Override
	public ReqIF loadReqIf(IResource template) {
		if (template == null)
			return null;

		try {
			URI fileUri = URI.createPlatformResourceURI(template.getFullPath()
					.toString(), true);

			ResourceSet resourceSet = new  XMLPersistenceMappingResourceSetImpl();
			Resource resource = resourceSet.getResource(fileUri, true);

			if (resource.isLoaded() && resource.getContents().size() > 0) {
				EObject eObj = resource.getContents().get(0);

				if (eObj instanceof ReqIF)
					return (ReqIF) eObj;
			}
		} catch (Exception e) {
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IReqIfService#showErrorPopup
	 * (org.eclipse.swt.widgets.Shell, java.lang.String, java.lang.String)
	 */
	@Override
	public void showErrorPopup(Shell shell, String title, String message) {
		if (shell != null && !shell.isDisposed()) {

			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					message);
			ErrorDialog.openError(shell, "Error", title, status);
		}
	}

	@Override
	public void showWarningPopup(Shell shell, String title, String message) {
		if (shell != null && !shell.isDisposed()) {

			Status status = new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					message);
			ErrorDialog.openError(shell, "Warning", title, status);
		}
	}

}
