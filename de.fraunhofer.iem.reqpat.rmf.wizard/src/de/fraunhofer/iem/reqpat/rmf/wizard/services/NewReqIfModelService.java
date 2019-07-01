package de.fraunhofer.iem.reqpat.rmf.wizard.services;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.core.runtime.Assert;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdFactory;

import com.google.inject.Inject;

import de.fraunhofer.iem.reqpat.core.interfaces.IModelElement;
import de.fraunhofer.iem.reqpat.core.interfaces.IModelGenerator;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry.Attribute;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry;
import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry.SpecType;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.EmbeddedXtextEditorConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.EmbeddedXtextEditorFactory;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceFactory;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceFactory;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 121 $, $Date: 2015-01-05 17:06:30 +0100 (Mo, 05 Jan 2015) $
 */
public class NewReqIfModelService {

	private static final String REQ_PAT_STRING = "ReqPatString";
	private static final String HEADING_STRING = "HeadingString";
	private static final String IMAGE_STRING = "ImagePath";
	private static final String DEFAULT_STRING = "T_String32k";

	private static final String DEFAULT_SPECIFICATION_NAME = "Specification Document";
	private static final String DEFAULT_REQUIREMENTS_DOCUMENT_NAME = "Requirements Document";

	private static final String PLACEHOLDER_ID_PREFIX = "PLACEHOLDER-";

	private final IReqIfService reqIfService;
	private final ISpecTypeRegistry specTypeRegistry;
	private final IAttributeRegistry attributeRegistry;

	private IModelGenerator testModelProvider;

	private IdConfiguration idConfiguration;
	private SpecObjectType requirementType;
	private AttributeDefinitionString requirementIdAttribute;
	private AttributeDefinitionString requirementDescriptionAttribute;

	private int idCounter;

	/**
	 * Constructor for the NewReqIfModelService class.
	 * 
	 * @param reqIfService
	 *            instance of the ReqIfService
	 * @param specTypeRegistry
	 *            instance of the SpecTypeRegistry
	 * @param attributeRegistry
	 *            instance of the AttributeRegistry
	 */
	@Inject
	public NewReqIfModelService(IReqIfService reqIfService,
			ISpecTypeRegistry specTypeRegistry,
			IAttributeRegistry attributeRegistry) {
		Assert.isNotNull(reqIfService);
		Assert.isNotNull(specTypeRegistry);
		Assert.isNotNull(attributeRegistry);

		this.reqIfService = reqIfService;
		this.specTypeRegistry = specTypeRegistry;
		this.attributeRegistry = attributeRegistry;
	}

	/**
	 * Creates the default datatype definitions and spec types.
	 * 
	 * @param factory
	 *            the ReqIF factory
	 * @param reqIfContent
	 *            he ReqIF content
	 * @param datatypeDefinitions
	 *            the datatype definitions
	 */
	private void createDatatypeDefinitionsAndSpecTypes(ReqIF10Factory factory,
			ReqIFContent reqIfContent,
			Map<String, DatatypeDefinition> datatypeDefinitions) {
		DatatypeDefinitionString reqPatString = factory
				.createDatatypeDefinitionString();
		reqPatString.setLongName(REQ_PAT_STRING);
		reqIfContent.getDatatypes().add(reqPatString);
		datatypeDefinitions.put(REQ_PAT_STRING, reqPatString);

		DatatypeDefinitionString idString = factory
				.createDatatypeDefinitionString();
		idString.setLongName(attributeRegistry.getAttributeName(Attribute.ID));
		reqIfContent.getDatatypes().add(idString);
		datatypeDefinitions.put(
				attributeRegistry.getAttributeName(Attribute.ID), idString);

		DatatypeDefinitionString headingString = factory
				.createDatatypeDefinitionString();
		headingString.setLongName(HEADING_STRING);
		reqIfContent.getDatatypes().add(headingString);
		datatypeDefinitions.put(HEADING_STRING, headingString);

		DatatypeDefinitionString imageString = factory
				.createDatatypeDefinitionString();
		imageString.setLongName(IMAGE_STRING);
		reqIfContent.getDatatypes().add(imageString);
		datatypeDefinitions.put(IMAGE_STRING, imageString);

		DatatypeDefinitionString tString32k = factory
				.createDatatypeDefinitionString();
		tString32k.setLongName(DEFAULT_STRING);
		reqIfContent.getDatatypes().add(tString32k);
		datatypeDefinitions.put(DEFAULT_STRING, tString32k);

		/*
		 * Specify Requirement Type.
		 */

		requirementType = factory.createSpecObjectType();
		requirementType.setLongName(specTypeRegistry
				.getSpecTypeName(SpecType.Requirement));

		requirementIdAttribute = factory.createAttributeDefinitionString();
		requirementIdAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.ID));
		requirementIdAttribute.setType(idString);
		requirementType.getSpecAttributes().add(requirementIdAttribute);

		requirementDescriptionAttribute = factory
				.createAttributeDefinitionString();
		requirementDescriptionAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.Description));
		requirementDescriptionAttribute.setType(reqPatString);
		requirementType.getSpecAttributes()
				.add(requirementDescriptionAttribute);

		reqIfContent.getSpecTypes().add(requirementType);

		/*
		 * Specify Heading Type.
		 */

		SpecObjectType headingType = factory.createSpecObjectType();
		headingType.setLongName(specTypeRegistry
				.getSpecTypeName(SpecType.Heading));

		AttributeDefinitionString idAttribute = factory
				.createAttributeDefinitionString();
		idAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.ID));
		idAttribute.setType(idString);
		headingType.getSpecAttributes().add(idAttribute);

		AttributeDefinitionString descriptionAttribute = factory
				.createAttributeDefinitionString();
		descriptionAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.Description));
		descriptionAttribute.setType(headingString);
		headingType.getSpecAttributes().add(descriptionAttribute);

		reqIfContent.getSpecTypes().add(headingType);

		/*
		 * Specify Free-Text Requirement Type.
		 */

		SpecObjectType freeTextRequirementType = factory.createSpecObjectType();
		freeTextRequirementType.setLongName(specTypeRegistry
				.getSpecTypeName(SpecType.FreeText));

		idAttribute = factory.createAttributeDefinitionString();
		idAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.ID));
		idAttribute.setType(idString);
		freeTextRequirementType.getSpecAttributes().add(idAttribute);

		descriptionAttribute = factory.createAttributeDefinitionString();
		descriptionAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.Description));
		descriptionAttribute.setType(tString32k);
		freeTextRequirementType.getSpecAttributes().add(descriptionAttribute);

		reqIfContent.getSpecTypes().add(freeTextRequirementType);

		/*
		 * Specify Image Type.
		 */

		SpecObjectType imageType = factory.createSpecObjectType();
		imageType.setLongName(specTypeRegistry.getSpecTypeName(SpecType.Image));

		idAttribute = factory.createAttributeDefinitionString();
		idAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.ID));
		idAttribute.setType(idString);
		imageType.getSpecAttributes().add(idAttribute);

		descriptionAttribute = factory.createAttributeDefinitionString();
		descriptionAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.Description));
		descriptionAttribute.setType(imageString);
		imageType.getSpecAttributes().add(descriptionAttribute);

		reqIfContent.getSpecTypes().add(imageType);

		/*
		 * Specify Specification Type.
		 */

		SpecificationType specificationType = factory.createSpecificationType();
		specificationType.setLongName(specTypeRegistry
				.getSpecTypeName(SpecType.Specification));

		descriptionAttribute = factory.createAttributeDefinitionString();
		descriptionAttribute.setLongName(attributeRegistry
				.getAttributeName(Attribute.Description));
		descriptionAttribute.setType(tString32k);
		specificationType.getSpecAttributes().add(descriptionAttribute);

		reqIfContent.getSpecTypes().add(specificationType);

		/*
		 * Create empty Specification.
		 */

		Specification specification = factory.createSpecification();
		specification.setLongName(DEFAULT_SPECIFICATION_NAME);
		specification.setType(specificationType);

		AttributeValueString requirementsDocumentName = factory
				.createAttributeValueString();
		requirementsDocumentName
				.setTheValue(DEFAULT_REQUIREMENTS_DOCUMENT_NAME);
		requirementsDocumentName.setDefinition(descriptionAttribute);
		specification.getValues().add(requirementsDocumentName);

		reqIfContent.getSpecifications().add(specification);
	}

	/**
	 * Creates a new ReqIF model.
	 * 
	 * @param idPrefix
	 *            the ID prefix for the ID generator
	 * @param generateTestModel
	 *            true if a test model shall be created
	 * @param topLevelElements
	 *            number of top level elements for the test model
	 * @param order
	 *            order of the test model tree
	 * @param depth
	 *            depth of the test model tree
	 * @return the new ReqIF model
	 */
	public ReqIF createDefaultReqIfModel(String idPrefix,
			boolean generateTestModel, int topLevelElements, int order,
			int depth) {
		ReqIF10Factory factory = ReqIF10Factory.eINSTANCE;

		ReqIF reqIf = createReqIf(factory);

		Map<String, DatatypeDefinition> datatypeDefinitions = new Hashtable<String, DatatypeDefinition>();

		reqIf.setTheHeader(createReqIfHeader(factory));
		reqIf.setCoreContent(createReqIFContent(factory, reqIf,
				datatypeDefinitions));
		reqIf.getToolExtensions().add(
				createReqIfToolExtension(factory, reqIf, datatypeDefinitions,
						idPrefix));

		if (generateTestModel)
			createTestSpecObjects(factory, reqIf, idPrefix != null ? idPrefix
					: PLACEHOLDER_ID_PREFIX, topLevelElements, order, depth);
		else
			createDefaultSpecObjects(factory, reqIf, idPrefix);

		return reqIf;
	}

	/**
	 * Creates the default spec objects.
	 * 
	 * @param factory
	 *            the ReqIF factory
	 * @param reqIf
	 *            the ReqIF model
	 * @param idPrefix
	 *            the ID prefix
	 */
	private void createDefaultSpecObjects(ReqIF10Factory factory, ReqIF reqIf,
			String idPrefix) {
		ReqIFContent coreContent = reqIf.getCoreContent();

		/*
		 * Add sample heading.
		 */

		SpecObjectType headingType = reqIfService.findSpecType(reqIf,
				specTypeRegistry.getSpecTypeName(SpecType.Heading));
		AttributeDefinition headingId = reqIfService.findAttributeDefinition(
				headingType, attributeRegistry.getAttributeName(Attribute.ID));
		AttributeDefinition headingDescription = reqIfService
				.findAttributeDefinition(headingType, attributeRegistry
						.getAttributeName(Attribute.Description));

		SpecObject sampleHeading = factory.createSpecObject();
		sampleHeading.setType(headingType);

		AttributeValueString sampleHeadingIdValue = factory
				.createAttributeValueString();
		sampleHeadingIdValue
				.setDefinition((AttributeDefinitionString) headingId);
		sampleHeading.getValues().add(sampleHeadingIdValue);

		AttributeValueString sampleHeadingDescriptionValue = factory
				.createAttributeValueString();
		sampleHeadingDescriptionValue
				.setDefinition((AttributeDefinitionString) headingDescription);

		String id = null;

		if (idPrefix == null)
			id = PLACEHOLDER_ID_PREFIX + "1";
		else
			id = idPrefix + "1";

		sampleHeadingIdValue.setTheValue(id);

		sampleHeadingDescriptionValue.setTheValue("Sample Heading");

		sampleHeading.getValues().add(sampleHeadingDescriptionValue);

		coreContent.getSpecObjects().add(sampleHeading);

		/*
		 * Add sample free-text requirement.
		 */

		SpecObjectType freeTextType = reqIfService.findSpecType(reqIf,
				specTypeRegistry.getSpecTypeName(SpecType.FreeText));
		AttributeDefinition freeTextId = reqIfService.findAttributeDefinition(
				freeTextType, attributeRegistry.getAttributeName(Attribute.ID));
		AttributeDefinition freeTextDescription = reqIfService
				.findAttributeDefinition(freeTextType, attributeRegistry
						.getAttributeName(Attribute.Description));

		SpecObject sampleFreeText = factory.createSpecObject();
		sampleFreeText.setType(freeTextType);

		AttributeValueString sampleFreeTextIdValue = factory
				.createAttributeValueString();
		sampleFreeTextIdValue
				.setDefinition((AttributeDefinitionString) freeTextId);
		sampleFreeText.getValues().add(sampleFreeTextIdValue);

		id = null;

		if (idPrefix == null)
			id = PLACEHOLDER_ID_PREFIX + "2";
		else
			id = idPrefix + "2";

		sampleFreeTextIdValue.setTheValue(id);

		AttributeValueString sampleFreeTextDescriptionValue = factory
				.createAttributeValueString();
		sampleFreeTextDescriptionValue
				.setDefinition((AttributeDefinitionString) freeTextDescription);
		sampleFreeTextDescriptionValue
				.setTheValue("Sample Free-Text Requirement");
		sampleFreeText.getValues().add(sampleFreeTextDescriptionValue);

		coreContent.getSpecObjects().add(sampleFreeText);

		/*
		 * Add sample requirement.
		 */

		SpecObjectType requirementType = reqIfService.findSpecType(reqIf,
				specTypeRegistry.getSpecTypeName(SpecType.Requirement));
		AttributeDefinition requirementId = reqIfService
				.findAttributeDefinition(requirementType,
						attributeRegistry.getAttributeName(Attribute.ID));
		AttributeDefinition requirementDescription = reqIfService
				.findAttributeDefinition(requirementType, attributeRegistry
						.getAttributeName(Attribute.Description));

		SpecObject sampleRequirement = factory.createSpecObject();
		sampleRequirement.setType(requirementType);

		AttributeValueString sampleRequirementIdValue = factory
				.createAttributeValueString();
		sampleRequirementIdValue
				.setDefinition((AttributeDefinitionString) requirementId);
		sampleRequirement.getValues().add(sampleRequirementIdValue);

		AttributeValueString sampleRequirementDescriptionValue = factory
				.createAttributeValueString();
		sampleRequirementDescriptionValue
				.setDefinition((AttributeDefinitionString) requirementDescription);

		id = null;

		if (idPrefix == null)
			id = PLACEHOLDER_ID_PREFIX + "3";
		else
			id = idPrefix + "3";

		sampleRequirementIdValue.setTheValue(id);

		sampleRequirementDescriptionValue.setTheValue("Sample Requirement");

		sampleRequirement.getValues().add(sampleRequirementDescriptionValue);

		coreContent.getSpecObjects().add(sampleRequirement);

		/*
		 * Add the samples to the specification.
		 */

		Specification specification = reqIf.getCoreContent()
				.getSpecifications().get(0);

		SpecHierarchy sampleHeadingSpecHierarchy = factory
				.createSpecHierarchy();
		sampleHeadingSpecHierarchy.setObject(sampleHeading);
		specification.getChildren().add(sampleHeadingSpecHierarchy);

		SpecHierarchy sampleFreeTextSpecHierarchy = factory
				.createSpecHierarchy();
		sampleFreeTextSpecHierarchy.setObject(sampleFreeText);
		sampleHeadingSpecHierarchy.getChildren().add(
				sampleFreeTextSpecHierarchy);

		SpecHierarchy sampleRequirementSpecHierarchy = factory
				.createSpecHierarchy();
		sampleRequirementSpecHierarchy.setObject(sampleRequirement);
		sampleHeadingSpecHierarchy.getChildren().add(
				sampleRequirementSpecHierarchy);

		if (idConfiguration != null)
			idConfiguration.setCount(3);
	}

	/**
	 * Creates a new ReqIF model element.
	 * 
	 * @param factory
	 *            the ReqIF factory
	 * @return the new ReqIF model element
	 */
	private ReqIF createReqIf(ReqIF10Factory factory) {
		return factory.createReqIF();
	}

	/**
	 * Creates the default ReqIF content.
	 * 
	 * @param factory
	 *            the ReqIF factory
	 * @param reqIf
	 *            the ReqIF model
	 * @param datatypeDefinitions
	 *            the datatype definitions
	 * @return the new ReqIF content
	 */
	private ReqIFContent createReqIFContent(ReqIF10Factory factory,
			ReqIF reqIf, Map<String, DatatypeDefinition> datatypeDefinitions) {
		ReqIFContent reqIfContent = factory.createReqIFContent();

		createDatatypeDefinitionsAndSpecTypes(factory, reqIfContent,
				datatypeDefinitions);

		return reqIfContent;
	}

	/**
	 * Creates the default ReqIF header.
	 * 
	 * @param factory
	 *            the ReqIF factory
	 * @return the new ReqIF header
	 */
	private ReqIFHeader createReqIfHeader(ReqIF10Factory factory) {
		ReqIFHeader header = factory.createReqIFHeader();

		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		try {
			XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory
					.newInstance().newXMLGregorianCalendar(c);
			header.setCreationTime(xmlGregorianCalendar.toGregorianCalendar());
		} catch (DatatypeConfigurationException e1) {
		}

		String name = System.getProperty("user.name");

		if (name != null) {
			header.setComment(String.format("Created by: %s", name));
		}

		return header;
	}

	/**
	 * Creates the default ReqIF tool extension
	 * 
	 * @param factory
	 *            the ReqIF factory
	 * @param reqIf
	 *            the ReqIF model
	 * @param datatypeDefinitions
	 *            the datatype definitions
	 * @param idPrefix
	 *            the ID prefix
	 * @return the new ReqIFToolExtension
	 */
	private ReqIFToolExtension createReqIfToolExtension(ReqIF10Factory factory,
			ReqIF reqIf, Map<String, DatatypeDefinition> datatypeDefinitions,
			String idPrefix) {
		ReqIFToolExtension reqIfToolExtension = factory
				.createReqIFToolExtension();

		ConfigurationFactory configurationFactory = ConfigurationFactory.eINSTANCE;

		ProrToolExtension prorToolExtension = configurationFactory
				.createProrToolExtension();

		/*
		 * Set the view configuration for the default specification.
		 */

		ProrSpecViewConfiguration prorSpecViewConfiguration = configurationFactory
				.createProrSpecViewConfiguration();
		prorSpecViewConfiguration.setSpecification(reqIf.getCoreContent()
				.getSpecifications().get(0));

		Column idColumn = configurationFactory.createColumn();
		idColumn.setLabel(attributeRegistry.getAttributeName(Attribute.ID));
		prorSpecViewConfiguration.getColumns().add(idColumn);

		Column descriptionColumn = configurationFactory.createColumn();
		descriptionColumn.setLabel(attributeRegistry
				.getAttributeName(Attribute.Description));
		descriptionColumn.setWidth(600);
		prorSpecViewConfiguration.getColumns().add(descriptionColumn);

		prorToolExtension.getSpecViewConfigurations().add(
				prorSpecViewConfiguration);

		/*
		 * Set the Description field to be the default label. This way also the
		 * Specification is displayed correctly (not just its ID).
		 */

		ProrGeneralConfiguration prorGeneralConfiguration = configurationFactory
				.createProrGeneralConfiguration();

		LabelConfiguration labelConfiguration = configurationFactory
				.createLabelConfiguration();
		labelConfiguration.getDefaultLabel().add(
				attributeRegistry.getAttributeName(Attribute.Description));
		prorGeneralConfiguration.setLabelConfiguration(labelConfiguration);

		prorToolExtension.setGeneralConfiguration(prorGeneralConfiguration);

		/*
		 * Set the presentation configurations, so that the Xtext editor is used
		 * for requirements and the Heading editor for headings.
		 */

		ProrPresentationConfigurations prorPresentationConfigurations = configurationFactory
				.createProrPresentationConfigurations();

		DatatypeDefinition reqPatString = datatypeDefinitions
				.get(REQ_PAT_STRING);

		if (reqPatString != null) {
			EmbeddedXtextEditorConfiguration embeddedXtextEditorConfiguration = EmbeddedXtextEditorFactory.eINSTANCE
					.createEmbeddedXtextEditorConfiguration();
			embeddedXtextEditorConfiguration.setDatatype(reqPatString);
			prorPresentationConfigurations.getPresentationConfigurations().add(
					embeddedXtextEditorConfiguration);
		}

		DatatypeDefinition headingString = datatypeDefinitions
				.get(HEADING_STRING);

		if (headingString != null) {
			HeadlinePresentationServiceConfiguration headlinePresentationServiceConfiguration = HeadlinePresentationServiceFactory.eINSTANCE
					.createHeadlinePresentationServiceConfiguration();
			headlinePresentationServiceConfiguration.setDatatype(headingString);
			prorPresentationConfigurations.getPresentationConfigurations().add(
					headlinePresentationServiceConfiguration);
		}

		DatatypeDefinition imageString = datatypeDefinitions.get(IMAGE_STRING);

		if (imageString != null) {
			ImagePresentationServiceConfiguration imagePresentationServiceConfiguration = ImagePresentationServiceFactory.eINSTANCE
					.createImagePresentationServiceConfiguration();
			imagePresentationServiceConfiguration.setDatatype(imageString);
			prorPresentationConfigurations.getPresentationConfigurations().add(
					imagePresentationServiceConfiguration);

		}

		/*
		 * Set the ID configuration, so that the IDs are generated
		 * automatically.
		 */

		DatatypeDefinition idString = datatypeDefinitions.get(attributeRegistry
				.getAttributeName(Attribute.ID));

		if (idString != null && idPrefix != null) {
			idConfiguration = IdFactory.eINSTANCE.createIdConfiguration();
			idConfiguration.setDatatype(idString);
			idConfiguration.setPrefix(idPrefix);
			prorPresentationConfigurations.getPresentationConfigurations().add(
					idConfiguration);
		}

		prorToolExtension
				.setPresentationConfigurations(prorPresentationConfigurations);

		reqIfToolExtension.getExtensions().add(prorToolExtension);

		return reqIfToolExtension;
	}

	/**
	 * Creates a new SpecHierarchy from the given model element.
	 * 
	 * @param factory
	 *            the ReqIF factory
	 * @param reqIf
	 *            the ReqIF model
	 * @param idPrefix
	 *            the ID prefix
	 * @param parent
	 *            the new SpecHierarchy's parent
	 * @param modelHierarchy
	 *            the model element
	 */
	private void createSpecHierarchy(ReqIF10Factory factory, ReqIF reqIf,
			String idPrefix, SpecHierarchy parent, IModelElement modelHierarchy) {

		SpecHierarchy specHierarchy = factory.createSpecHierarchy();

		// create the spec object & its attributes
		SpecObject specObject = reqIfService.newSpecObject(requirementType);
		AttributeValueString idAttribute = reqIfService
				.getAttributeValueString(requirementIdAttribute, specObject);
		idAttribute.setTheValue(idPrefix + ++idCounter);

		AttributeValueString descriptionAttribute = reqIfService
				.getAttributeValueString(requirementDescriptionAttribute,
						specObject);
		descriptionAttribute.setTheValue(modelHierarchy.getSerialization());

		specHierarchy.setObject(specObject);

		// add the spec object & spec hierarchy to the model
		reqIf.getCoreContent().getSpecObjects().add(specObject);
		parent.getChildren().add(specHierarchy);

		// generate the children recursively
		for (IModelElement child : modelHierarchy.getChildren()) {
			createSpecHierarchy(factory, reqIf, idPrefix, specHierarchy, child);
		}
	}

	/**
	 * Creates test spec objects.
	 * 
	 * @param factory
	 *            the ReqIF factory
	 * @param reqIf
	 *            the ReqIF model
	 * @param idPrefix
	 *            the ID preifx
	 * @param topLevelElements
	 *            the number of top level elements
	 * @param order
	 *            the order of the model tree
	 * @param depth
	 *            the depth of the model tree
	 */
	private void createTestSpecObjects(ReqIF10Factory factory, ReqIF reqIf,
			String idPrefix, int topLevelElements, int order, int depth) {

		if (testModelProvider == null)
			throw new RuntimeException("No random model provider available.");

		List<IModelElement> topLevel = testModelProvider.generateModel(
				topLevelElements, order, depth);

		idCounter = 0;

		for (IModelElement modelHierarchy : topLevel) {
			SpecHierarchy specHierarchy = factory.createSpecHierarchy();

			// create the spec object & its attributes
			SpecObject specObject = reqIfService.newSpecObject(requirementType);
			AttributeValueString idAttribute = reqIfService
					.getAttributeValueString(requirementIdAttribute, specObject);
			idAttribute.setTheValue(idPrefix + ++idCounter);

			AttributeValueString descriptionAttribute = reqIfService
					.getAttributeValueString(requirementDescriptionAttribute,
							specObject);
			descriptionAttribute.setTheValue(modelHierarchy.getSerialization());

			specHierarchy.setObject(specObject);

			// add the spec object & spec hierarchy to the model
			reqIf.getCoreContent().getSpecObjects().add(specObject);
			reqIf.getCoreContent().getSpecifications().get(0).getChildren()
					.add(specHierarchy);

			// generate the children recursively
			for (IModelElement child : modelHierarchy.getChildren()) {
				createSpecHierarchy(factory, reqIf, idPrefix, specHierarchy,
						child);
			}
		}

	}

	/**
	 * Setter for the
	 * 
	 * @param testModelProvider
	 */
	@Inject(optional = true)
	public void setRandomModelProvider(IModelGenerator testModelProvider) {
		this.testModelProvider = testModelProvider;
	}

}
