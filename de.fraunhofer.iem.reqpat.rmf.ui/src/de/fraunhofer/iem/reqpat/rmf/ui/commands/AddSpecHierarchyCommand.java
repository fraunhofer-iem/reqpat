package de.fraunhofer.iem.reqpat.rmf.ui.commands;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.rmf.reqif10.SpecHierarchy;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class AddSpecHierarchyCommand extends AbstractCommand {

	protected final SpecHierarchy specHierarchy;
	protected final SpecHierarchy parent;

	public AddSpecHierarchyCommand(SpecHierarchy specHierarchy,
			SpecHierarchy parent) {
		this.specHierarchy = specHierarchy;
		this.parent = parent;
	}

	@Override
	public boolean canUndo() {
		if (specHierarchy != null && parent != null)
			return parent.getChildren().contains(specHierarchy);

		return false;
	}

	@Override
	public void execute() {
		parent.getChildren().add(specHierarchy);

	}

	@Override
	protected boolean prepare() {
		if (specHierarchy != null && parent != null)
			return true;

		return false;
	}

	@Override
	public void redo() {
		if (specHierarchy == null || parent == null
				|| parent.getChildren().contains(specHierarchy))
			return;

		execute();
	}

	@Override
	public void undo() {
		parent.getChildren().remove(specHierarchy);
	}
}
