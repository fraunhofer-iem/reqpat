package de.fraunhofer.iem.reqpat.rmf.ui.commands;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.rmf.reqif10.AttributeValueString;

/**
 * Replaces the value of the "find" string with the value of the "replace"
 * string for an AttributeValueString's value.
 * 
 * @author Frederik Knust
 * 
 */
public class FindAndReplaceCommand extends AbstractCommand {

	private final AttributeValueString attribute;

	private final String find;
	private final String replace;

	private String oldValue;

	/**
	 * Constructor for the FindAndReplaceCommand class.
	 * 
	 * @param attribute
	 *            The attribute value which value shall be changed. May not be
	 *            null.
	 * @param find
	 *            The "find" string. May not be null or empty.
	 * @param replace
	 *            The "replace" string. May not be null.
	 */
	public FindAndReplaceCommand(AttributeValueString attribute, String find,
			String replace) {
		Assert.isNotNull(attribute);
		Assert.isLegal(find != null && find.length() > 0);
		Assert.isNotNull(replace);

		this.attribute = attribute;
		this.find = find;
		this.replace = replace;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return oldValue != null;
	}

	@Override
	public void execute() {
		oldValue = attribute.getTheValue();

		String newValue = oldValue.replace(find, replace);
		attribute.setTheValue(newValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		return true;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.command.AbstractCommand#undo()
	 */
	@Override
	public void undo() {
		attribute.setTheValue(oldValue);

		oldValue = null;
	}
}
