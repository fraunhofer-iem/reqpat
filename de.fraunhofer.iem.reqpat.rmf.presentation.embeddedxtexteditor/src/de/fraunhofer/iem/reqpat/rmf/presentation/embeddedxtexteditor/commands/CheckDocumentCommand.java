package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.commands;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.swt.widgets.Shell;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class CheckDocumentCommand extends AbstractCommand {

	private final Shell shell;
	private final IPatternService patternService;
	private final IResource resource;
	private final ReqIF reqIf;
	private final Specification specification;

	public CheckDocumentCommand(Shell shell, IPatternService patternService,
			IResource resource, ReqIF reqIf, Specification specification) {
		this.shell = shell;
		this.patternService = patternService;
		this.resource = resource;
		this.reqIf = reqIf;
		this.specification = specification;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 */
	@Override
	public boolean canExecute() {
		if (shell != null && resource != null && reqIf != null
				&& specification != null)
			return true;

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		patternService.checkDocument(shell, resource, specification);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		execute();
	}
}
