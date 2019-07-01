package de.fraunhofer.iem.reqpat.rmf.ui.actions;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry;
import de.fraunhofer.iem.reqpat.rmf.ui.Activator;

/**
 * 
 * @author Frederik Knust
 * 
 */
public abstract class CreateChild implements IEditorActionDelegate {

	protected static final String ERROR_MESSAGE = "The type \"%s\" is not defined!";
	protected static final String ERROR_REASON = "The type \"%s\" must be defined in the Datatype Configuration before it can be used.";

	protected final IReqIfService reqIfService;
	protected final ISpecTypeRegistry specTypeRegistry;

	protected SpecificationEditor editor;
	protected ISelection selection;

	public CreateChild() {
		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();
		Assert.isNotNull(injector);

		reqIfService = injector.getInstance(IReqIfService.class);
		Assert.isNotNull(reqIfService);

		specTypeRegistry = injector.getInstance(ISpecTypeRegistry.class);
		Assert.isNotNull(specTypeRegistry);
	}

	protected abstract void insertNewChild(SpecHierarchy specHierarchy);

	/**
	 * Copied from
	 * org.eclipse.rmf.pror.reqif10.editor.agilegrid.ProrAgileGridViewer
	 * (insertNewRowAndEdit) and adjusted to the new environment.
	 * 
	 * Creates a new child element instead of a sibling.
	 */
	protected void insertNewChild(SpecHierarchy specHierarchy, String typeName) {
		if (editor == null)
			return;

		// Won't do anything if there is no object
		if (specHierarchy == null || specHierarchy.getObject() == null
				|| specHierarchy.getObject().getType() == null) {
			return;
		}

		EditingDomain editingDomain = editor.getEditingDomain();
		AdapterFactory adapterFactory = editor.getReqifEditor()
				.getAdapterFactory();

		// Create the new elements
		SpecHierarchy newSpecHierarchy = ReqIF10Factory.eINSTANCE
				.createSpecHierarchy();
		SpecObject newSpecObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		newSpecHierarchy.setObject(newSpecObject);

		// take the selected element as parent
		EReference childFeature = ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN;
		int pos = specHierarchy.getChildren().size();

		SpecType type = reqIfService.findSpecType(editor.getReqifEditor()
				.getReqif(), typeName);

		if (type == null) {
			showErrorPopup();
			return;
		}

		CompoundCommand cmd = ProrUtil.createAddTypedElementCommand(ReqIF10Util
				.getReqIF(specHierarchy).getCoreContent(),
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS,
				newSpecObject, ReqIF10Package.Literals.SPEC_OBJECT__TYPE, type,
				0, 0, editingDomain, adapterFactory);

		// use the specHierarchy element itself (and not its parent)
		cmd.append(AddCommand.create(editingDomain, specHierarchy,
				childFeature, newSpecHierarchy, pos));

		editingDomain.getCommandStack().execute(cmd);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		if (editor == null || selection == null || selection.isEmpty()
				|| !(selection instanceof IStructuredSelection))
			return;

		IStructuredSelection structuredSelection = (IStructuredSelection) selection;

		Object object = structuredSelection.getFirstElement();

		if (object == null && !(object instanceof SpecHierarchy))
			return;

		SpecHierarchy specHierarchy = (SpecHierarchy) object;
		insertNewChild(specHierarchy);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action
	 * .IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface
	 * .action.IAction, org.eclipse.ui.IEditorPart)
	 */
	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor instanceof SpecificationEditor) {
			this.editor = (SpecificationEditor) targetEditor;
		} else {
			this.editor = null;
		}
	}

	protected abstract void showErrorPopup();

	protected void showErrorPopup(String type) {
		if (editor != null) {
			String reason = String.format(ERROR_REASON, type);
			String message = String.format(ERROR_MESSAGE, type);

			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					reason);
			ErrorDialog.openError(editor.getSite().getShell(),
					"Type not found", message, status);
		}
	}
}
