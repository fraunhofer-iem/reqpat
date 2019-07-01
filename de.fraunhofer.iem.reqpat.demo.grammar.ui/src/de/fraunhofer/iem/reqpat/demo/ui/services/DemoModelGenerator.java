package de.fraunhofer.iem.reqpat.demo.ui.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.serializer.ISerializer;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

import de.fraunhofer.iem.reqpat.core.common.DefaultModelElement;
import de.fraunhofer.iem.reqpat.core.interfaces.IModelElement;
import de.fraunhofer.iem.reqpat.core.interfaces.IModelGenerator;
import de.fraunhofer.iem.reqpat.core.interfaces.IXtextPlugin;
import de.fraunhofer.iem.reqpat.core.interfaces.IXtextService;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelFactory;
import de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 87 $, $Date: 2013-10-15 13:54:29 +0200 (Di, 15 Okt 2013) $
 */
public class DemoModelGenerator implements IModelGenerator {

	private static final String DEFAULT_ANALYSIS_FUNCTION_NAME = "AnalysisFunction%d";

	private static final String SUBANALYSIS_FUNCTION_PREFIX = "Sub";

	private final IXtextService xtextService;
	private final ISerializer serializer;

	/**
	 * Constructor of the DemoModelGenerator class.
	 * 
	 * @param languageUri
	 *            the xText language URI
	 * @param xtextPlugin
	 *            instance of the xText plugin
	 */
	@Inject
	public DemoModelGenerator(
			@Named(IXtextService.XTEXT_LANGUAGE_URI) String languageUri,
			IXtextPlugin xtextPlugin, IXtextService xtextService) {
		Assert.isNotNull(languageUri);
		Assert.isNotNull(xtextPlugin);
		Assert.isNotNull(xtextService);

		this.xtextService = xtextService;

		Injector injector = xtextPlugin.getInjector(languageUri);
		serializer = injector.getInstance(ISerializer.class);
		Assert.isNotNull(serializer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.interfaces.IRandomModelProvider#getRandomModel
	 * (int, int, int)
	 */
	@Override
	public List<IModelElement> generateModel(int topLevelElements, int degree,
			int depth) {

		List<IModelElement> topLevel = new ArrayList<IModelElement>();

		int[] elementCounter = new int[depth + 1];

		Resource resource = null;

		for (int i = 0; i < topLevelElements; i++) {
			int counter = ++elementCounter[depth];
			String name = DEFAULT_ANALYSIS_FUNCTION_NAME;

			// create the analysis function
			AnalysisFunction analysisFunction = DemoModelFactory.eINSTANCE
					.createAnalysisFunction();
			analysisFunction.setName(String.format(name, counter));

			// create the analysis function definition
			AnalysisFunctionDefinition definition = DemoModelFactory.eINSTANCE
					.createAnalysisFunctionDefinition();
			definition.setAnalysisFunction(analysisFunction);

			// add to the resource to enable serialization
			if (resource == null)
				resource = xtextService.addXtextModelToResource(definition);
			else
				resource.getContents().add(definition);

			String serialization = serializer.serialize(definition);

			IModelElement modelHierarchy = new DefaultModelElement(definition,
					serialization);

			for (int j = 0; j < degree; j++) {
				IModelElement child = generateSubAnalysisFunctionDefinitions(
						resource, elementCounter, degree, depth - 1,
						analysisFunction, name);
				if (child != null)
					modelHierarchy.getChildren().add(child);
			}

			topLevel.add(modelHierarchy);
		}

		return topLevel;
	}

	/**
	 * Creates subanalysis function definitions until the depth has reached
	 * zero.
	 * 
	 * @param resource
	 *            the resource the definitions are added to (required for
	 *            serialization)
	 * @param elementCounter
	 *            the element counter per level
	 * @param degree
	 *            the degree of the tree to be created
	 * @param depth
	 *            the (rest) depth
	 * @param parent
	 *            the parent element
	 * @param parentName
	 *            the parent element's name
	 * @return the new model element containing the subanalysis function
	 *         definition
	 */
	private IModelElement generateSubAnalysisFunctionDefinitions(
			Resource resource, int[] elementCounter, int degree, int depth,
			AnalysisFunction parent, String parentName) {
		if (depth <= 0)
			return null;

		int counter = ++elementCounter[depth];
		String name = SUBANALYSIS_FUNCTION_PREFIX + parentName;

		// create the analysis function
		AnalysisFunction analysisFunction = DemoModelFactory.eINSTANCE
				.createAnalysisFunction();
		analysisFunction.setName(String.format(name, counter));
		analysisFunction.setParentAnalysisFunction(parent);

		// create the subanalysis function definition
		SubAnalysisFunctionDefinition definition = DemoModelFactory.eINSTANCE
				.createSubAnalysisFunctionDefinition();
		definition.setAnalysisFunction(analysisFunction);

		// add to the resource to enable serialization
		resource.getContents().add(definition);

		String serialization = serializer.serialize(definition);

		IModelElement modelHierarchy = new DefaultModelElement(definition,
				serialization);

		// create the children of this model hierarchy
		for (int i = 0; i < degree; i++) {
			IModelElement child = generateSubAnalysisFunctionDefinitions(
					resource, elementCounter, degree, depth - 1,
					analysisFunction, name);
			if (child != null)
				modelHierarchy.getChildren().add(child);
		}

		return modelHierarchy;
	}

}
