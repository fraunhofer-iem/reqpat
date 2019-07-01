package de.fraunhofer.iem.reqpat.rmf.ui.commands;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecObject;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class AddSpecObjectCommand extends AbstractCommand {

	protected final SpecObject specObject;
	protected final ReqIFContent coreContent;

	public AddSpecObjectCommand(SpecObject specObject, ReqIFContent coreContent) {
		this.specObject = specObject;
		this.coreContent = coreContent;
	}

	@Override
	public boolean canUndo() {
		if (specObject != null && coreContent != null)
			return coreContent.getSpecObjects().contains(specObject);

		return false;
	}

	@Override
	public void execute() {
		coreContent.getSpecObjects().add(specObject);
	}

	@Override
	protected boolean prepare() {
		if (specObject != null && coreContent != null)
			return true;

		return false;
	}

	@Override
	public void redo() {
		if (specObject == null || coreContent == null
				|| coreContent.getSpecObjects().contains(specObject))
			return;

		execute();
	}

	@Override
	public void undo() {
		coreContent.getSpecObjects().remove(specObject);
	}
}
