package de.fraunhofer.iem.reqpat.rmf.ui.actions;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.editor.presentation.ReqifSpecificationEditorInput;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ide.ResourceUtil;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class CheckDocument implements IEditorActionDelegate {

	private final IPatternService patternService;

	private SpecificationEditor editor;

	public CheckDocument() {
		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();

		patternService = injector.getInstance(IPatternService.class);
		Assert.isNotNull(patternService);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		if (editor == null)
			return;

		IEditorInput editorInput = editor.getEditorInput();

		Specification specification = null;

		if (editorInput instanceof ReqifSpecificationEditorInput) {
			specification = ((ReqifSpecificationEditorInput) editorInput)
					.getSpec();
		}

		IResource resource = ResourceUtil.getResource(editor.getReqifEditor()
				.getEditorInput());

		patternService.checkDocument(editor.getSite().getShell(), resource,
				specification);
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
}
