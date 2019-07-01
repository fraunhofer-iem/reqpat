package de.fraunhofer.iem.reqpat.rmf.ui.actions;

import java.util.List;
import java.util.Set;

import org.agilemore.agilegrid.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.editor.presentation.ReqifSpecificationEditorInput;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.rmf.exceptions.PatternException;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternDescriptor;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.ui.wizards.FindAndReplaceWizard;

/**
 * This action opens a FindAndReplace wizard where the user can enter the find
 * and replace strings. To make the changes it creates FindAndReplaceCommands
 * which apply the changes to the model.
 * 
 * @author Frederik Knust
 * 
 */
public class FindAndReplace implements IEditorActionDelegate {

	private final Injector injector;

	private final IReqIfService reqIfService;
	private final IPatternService patternService;

	private SpecificationEditor editor;

	public FindAndReplace() {
		injector = de.fraunhofer.iem.reqpat.core.Activator.getInjector();
		Assert.isNotNull(injector);

		reqIfService = injector.getInstance(IReqIfService.class);
		Assert.isNotNull(reqIfService);

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

		// fetch the specification from the editor;
		if (editorInput instanceof ReqifSpecificationEditorInput) {
			specification = ((ReqifSpecificationEditorInput) editorInput)
					.getSpec();
		}

		/*
		 * The specification is null if the current editor is not a
		 * specification editor. This should not happen, as the action is added
		 * to the specification editor's actions.
		 */
		if (specification == null)
			return;

		ReqIF reqIf = ReqIF10Util.getReqIF(specification);

		/*
		 * If the ReqIF model is null, there is something wrong with the
		 * specification.
		 */
		if (reqIf == null)
			return;

		Shell shell = Display.getCurrent().getActiveShell();

		IPatternDescriptor[] patternDescriptors;

		try {
			patternDescriptors = patternService.getPatternDescriptors(reqIf);
		} catch (PatternException e) {
			reqIfService.showErrorPopup(shell, e.getTitle(), e.getMessage());
			return;
		}

		FindAndReplaceWizard wizard = new FindAndReplaceWizard(
				patternDescriptors);

		WizardDialog wd = new WizardDialog(shell, wizard);
		wd.setTitle(wizard.getWindowTitle());

		int rc = wd.open();

		if (rc == Window.CANCEL)
			return;

		/*
		 * Create the commands to replace the find with the replace values.
		 */
		Set<IPatternDescriptor> activePatternDescriptors = wizard
				.getActivePatternDescriptors();
		String findString = wizard.getFindString();
		String replaceString = wizard.getReplaceString();

		List<Command> commands = reqIfService
				.createFindAndReplaceCommands(
						specification,
						activePatternDescriptors
								.toArray(new IPatternDescriptor[activePatternDescriptors
										.size()]), findString, replaceString);

		CompoundCommand findAndReplaceCommand = new CompoundCommand(
				"Find && Replace", commands);

		// execute the command
		editor.getEditingDomain().getCommandStack()
				.execute(findAndReplaceCommand);
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
