package de.fraunhofer.iem.reqpat.rmf.ui.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry.Attribute;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.ui.Activator;
import de.fraunhofer.iem.reqpat.rmf.ui.commands.AddSpecHierarchyCommand;
import de.fraunhofer.iem.reqpat.rmf.ui.commands.AddSpecObjectCommand;
import de.fraunhofer.iem.reqpat.rmf.ui.commands.FindAndReplaceCommand;
import de.fraunhofer.iem.reqpat.rmf.ui.wizards.InsertTemplateWizard;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 127 $, $Date: 2015-01-13 18:22:30 +0100 (Di, 13 Jan 2015) $
 * 
 */
public class InsertTemplate implements IEditorActionDelegate {

	public static class Placeholder {
		public String key;
		public String value;

		public Placeholder(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public boolean isActive() {
			if (key != null && key.length() > 0 && value != null
					&& value.length() > 0)
				return true;

			return false;
		}
	}

	private final IReqIfService reqIfService;
	private final IAttributeRegistry attributeService;
	private final IPatternService patternService;

	private SpecificationEditor editor;
	private ISelection selection;

	public InsertTemplate() {
		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();
		Assert.isNotNull(injector);

		reqIfService = injector.getInstance(IReqIfService.class);
		Assert.isNotNull(reqIfService);

		attributeService = injector.getInstance(IAttributeRegistry.class);
		Assert.isNotNull(attributeService);

		patternService = injector.getInstance(IPatternService.class);
		Assert.isNotNull(patternService);
	}

	protected List<IResource> getTemplates() throws CoreException {
		IProject templateProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("Templates");

		List<IResource> templates = new ArrayList<IResource>();
		getTemplatesRecursively(templateProject, templates);

		return templates;
	}

	protected void getTemplatesRecursively(IContainer parent,
			final List<IResource> templates) throws CoreException {
		if (parent != null) {

			IResource[] members = parent.members();

			for (IResource member : members) {
				if (member.getType() == IResource.FILE) {
					if (member.getFileExtension() != null
							&& member.getFileExtension().equalsIgnoreCase(
									"reqif")) {
						templates.add(member);
					}
				} else if (member.getType() == IResource.FOLDER) {
					getTemplatesRecursively((IContainer) member, templates);
				}
			}
		}
	}

	protected void insertSpecHierarchyRecursively(
			ReqIF reqIf,
			SpecHierarchy parent,
			SpecHierarchy specHierarchy,
			CompoundCommand insertTemplateCommand,
			Map<String, SpecObjectType> typeCache,
			Map<SpecObjectType, Map<String, AttributeDefinition>> attributeDefinitionCache,
			IdConfiguration idConfiguration,
			List<Placeholder> activePlaceholders)
			throws IllegalArgumentException, InputMismatchException {

		if (specHierarchy.isSetObject()) {
			SpecObject newSpecObject = ReqIF10Factory.eINSTANCE
					.createSpecObject();
			SpecObject specObject = specHierarchy.getObject();

			newSpecObject.setLongName(specObject.getLongName());
			newSpecObject.setDesc(specObject.getDesc());

			if (!specObject.isSetType())
				throw new IllegalArgumentException("Spec Object \""
						+ specObject.getIdentifier() + "\" has no type!");

			/*
			 * The type name is used to find a corresponding type in the open
			 * ReqIf model.
			 */
			String typeName = (specObject.getType().getLongName());

			SpecObjectType specType = typeCache.get(typeName);

			if (specType == null) {
				specType = reqIfService.findSpecType(reqIf, specObject
						.getType().getLongName());

				if (specType == null)
					throw new InputMismatchException(
							"Unable to find Spec Type \"" + typeName
									+ "\" in target model!");

				typeCache.put(typeName, specType);
			}

			Map<String, AttributeDefinition> attributeDefinitionCacheForType = attributeDefinitionCache
					.get(specType);

			/*
			 * Check if a cache for this spec type has already been created. If
			 * not create a new one.
			 */
			if (attributeDefinitionCacheForType == null) {
				attributeDefinitionCacheForType = new HashMap<String, AttributeDefinition>();
				attributeDefinitionCache.put(specType,
						attributeDefinitionCacheForType);
			}

			/*
			 * A corresponding type has been found, so update the new spec
			 * object.
			 */
			newSpecObject.setType(specType);

			if (specObject.isSetValues()) {
				List<AttributeValue> attributeValues = specObject.getValues();

				for (AttributeValue attributeValue : attributeValues) {
					AttributeValue newAttributeValue = null;

					/*
					 * The enumeration type has to be treated differently, so we
					 * check first if the current attribute value is an
					 * enumeration.
					 */
					if (attributeValue instanceof AttributeValueEnumeration) {
						newAttributeValue = reqIfService
								.copyAttributeValueEnumeration(
										(AttributeValueEnumeration) attributeValue,
										specType,
										attributeDefinitionCacheForType);
					} else {
						newAttributeValue = reqIfService.copyAttributeValue(
								attributeValue, specType,
								attributeDefinitionCacheForType);
					}

					// add the value to the new spec object
					newSpecObject.getValues().add(newAttributeValue);

					// replace the placeholders
					if (newAttributeValue instanceof AttributeValueString)
						for (Placeholder ph : activePlaceholders) {
							findAndReplace(
									(AttributeValueString) newAttributeValue,
									ph.key, ph.value);
						}
				}
			}

			/*
			 * If an ID configuration is set the IDs of all the elements must be
			 * updated.
			 */
			if (idConfiguration != null) {
				// find ID attribute definition
				AttributeDefinition idAttributeDefinition = attributeDefinitionCacheForType
						.get(attributeService.getAttributeName(Attribute.ID));

				if (idAttributeDefinition != null
						&& newSpecObject.isSetValues()) {
					List<AttributeValue> attributeValues = newSpecObject
							.getValues();

					AttributeValueString idValue = null;

					/*
					 * Look for the ID attribute, so that a new ID can be
					 * assigned (using the ID generator prefix).
					 */
					for (AttributeValue attributeValue : attributeValues) {
						if (attributeValue instanceof AttributeValueString) {
							if (((AttributeValueString) attributeValue)
									.getDefinition() == idAttributeDefinition) {
								idValue = (AttributeValueString) attributeValue;
								break;
							}
						}
					}

					if (idValue != null) {
						int count = idConfiguration.getCount();

						String id = idConfiguration.getPrefix() + ++count;
						idValue.setTheValue(id);

						idConfiguration.setCount(count);
					}
				}
			}

			SpecHierarchy newSpecHierarchy = ReqIF10Factory.eINSTANCE
					.createSpecHierarchy();
			newSpecHierarchy.setObject(newSpecObject);

			// add the new spec object to the open ReqIf model
			AddSpecObjectCommand addSpecObjectCommand = new AddSpecObjectCommand(
					newSpecObject, reqIf.getCoreContent());
			insertTemplateCommand.append(addSpecObjectCommand);

			// add the new spec hierarchy to its parent
			AddSpecHierarchyCommand addSpecHierarchyCommand = new AddSpecHierarchyCommand(
					newSpecHierarchy, parent);
			insertTemplateCommand.append(addSpecHierarchyCommand);

			/*
			 * Check if the current specHierarchy has children. If this is the
			 * case, call this method recursively for each child and use the new
			 * spec hierarchy as parent.
			 */
			if (specHierarchy.isSetChildren()) {
				List<SpecHierarchy> children = specHierarchy.getChildren();

				for (SpecHierarchy child : children) {
					insertSpecHierarchyRecursively(reqIf, newSpecHierarchy,
							child, insertTemplateCommand, typeCache,
							attributeDefinitionCache, idConfiguration,
							activePlaceholders);
				}
			}
		}
	}

	protected void findAndReplace(AttributeValueString descriptionAttribute,
			String find, String replace) {
		Assert.isNotNull(descriptionAttribute);
		Assert.isLegal(find != null && find.length() > 0);
		Assert.isNotNull(replace);

		String value = descriptionAttribute.getTheValue();

		if (value == null || value.length() == 0)
			return;

		/*
		 * Create a command if the value contains the "find" string.
		 */
		if (value.contains(find)) {
			FindAndReplaceCommand command = new FindAndReplaceCommand(
					descriptionAttribute, find, replace);
			command.execute();
		}
	}

	protected void insertTemplate(ReqIF reqIf, SpecHierarchy specHierarchy,
			List<Placeholder> activePlaceholders) {
		Map<String, SpecObjectType> typeCache = new HashMap<String, SpecObjectType>();
		Map<SpecObjectType, Map<String, AttributeDefinition>> attributeDefinitionCache = new HashMap<SpecObjectType, Map<String, AttributeDefinition>>();

		CompoundCommand insertTemplateCommand = new CompoundCommand(
				"Insert Template");

		try {
			if (reqIf != null && reqIf.isSetCoreContent()) {
				ReqIFContent coreContent = reqIf.getCoreContent();

				if (coreContent.isSetSpecifications()) {
					List<Specification> specifications = coreContent
							.getSpecifications();

					/*
					 * Fetch the ID generator from the target ReqIf model (if
					 * set);
					 */
					List<ProrToolExtension> prorToolExtensions = reqIfService
							.getProrToolExtensions(editor.getReqifEditor()
									.getReqif());

					IdConfiguration idConfiguration = reqIfService
							.getPresentationConfiguration(prorToolExtensions,
									IdConfiguration.class);

					for (Specification specification : specifications) {
						if (specification.isSetChildren()) {
							List<SpecHierarchy> children = specification
									.getChildren();

							for (SpecHierarchy child : children) {
								insertSpecHierarchyRecursively(editor
										.getReqifEditor().getReqif(),
										specHierarchy, child,
										insertTemplateCommand, typeCache,
										attributeDefinitionCache,
										idConfiguration, activePlaceholders);
							}
						}
					}
				}
			}
		} catch (IllegalArgumentException e) {
			showErrorPopup("Malformed Template", e.getClass().getSimpleName(),
					e.getMessage());
			return;
		} catch (InputMismatchException e) {
			showErrorPopup("No Match Found", e.getClass().getSimpleName(),
					e.getMessage());
			return;
		} catch (Exception e) {
			showErrorPopup("Unknown Error", e.getClass().getSimpleName(),
					e.getMessage());
			return;
		}

		/*
		 * Perform the command only if no errors occurred. Otherwise parts of
		 * the template could be inserted into the target model, which may cause
		 * errors because of missing references (e.g. because a type could not
		 * be matched).
		 */
		if (!insertTemplateCommand.isEmpty()) {
			editor.getEditingDomain().getCommandStack()
					.execute(insertTemplateCommand);
		}
	}

	@Override
	public void run(IAction action) {
		if (editor == null || selection == null || selection.isEmpty()
				|| !(selection instanceof IStructuredSelection))
			return;

		IStructuredSelection structuredSelection = (IStructuredSelection) selection;

		Object object = structuredSelection.getFirstElement();

		if (object == null || !(object instanceof SpecHierarchy))
			return;

		SpecHierarchy specHierarchy = (SpecHierarchy) object;

		List<IResource> templates = null;
		try {
			templates = getTemplates();
		} catch (CoreException e) {
		}

		if (templates == null)
			templates = new ArrayList<IResource>();

		InsertTemplateWizard wizard = new InsertTemplateWizard(templates);

		WizardDialog wd = new WizardDialog(Display.getCurrent()
				.getActiveShell(), wizard);
		wd.setTitle(wizard.getWindowTitle());
		wd.create();
		int rc = wd.open();

		if (rc == Window.CANCEL)
			return;

		ReqIF reqIf = wizard.getReqIf();
		List<Placeholder> activePlaceholders = wizard.getActivePlaceholders();

		if (reqIf == null)
			return;

		insertTemplate(reqIf, specHierarchy, activePlaceholders);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor instanceof SpecificationEditor) {
			this.editor = (SpecificationEditor) targetEditor;
		} else {
			this.editor = null;
		}
	}

	protected void showErrorPopup(String title, String message, String reason) {
		if (editor != null) {

			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					reason);
			ErrorDialog.openError(editor.getSite().getShell(), title, message,
					status);
		}
	}
}
