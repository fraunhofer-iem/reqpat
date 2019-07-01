/*
 * Copyright (C) 2008 by Sihong Zhu
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Sihong Zhu (fourbroad@gmail.com)
 */

package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.ui;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.agilemore.agilegrid.EditorActivationEvent;
import org.agilemore.agilegrid.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * An abstract cell editor that uses a popup box. when entering the editing
 * state, a popup box will be shown. The cell editor's value is initialized by
 * the method setValue() of CellEditor.
 * <p>
 * Subclasses may override the following methods:
 * <ul>
 * <li><code>createContents</code>: creates the cell editor's 'display value'
 * control</li>
 * <li><code>createToolBar</code>: creates the tool bar which lie in the bottom
 * area of cell editor.</li>
 * </ul>
 * </p>
 * 
 * @author fourbroad
 * 
 *         --------------------------------------------------------------------
 *         -------- Adjusted to work correctly with the XtextPopupCellEditor.
 *         Modifications can be found in the openPopupBox and createControl
 *         methods.
 *         --------------------------------------------------------------
 *         --------------
 * 
 */
public abstract class AdjustedPopupCellEditor extends CellEditor {

	/**
	 * The editor control.
	 */
	private Composite container;

	/**
	 * The current contents.
	 */
	private Control contents;

	/**
	 * The label that shows the value of cell.
	 */
	private CLabel label;

	/**
	 * The shell which contains the controls used to edit the value of cell.
	 */
	private Shell shell;

	/**
	 * The value of this cell editor; initially <code>null</code>.
	 */
	protected Object value = null;

	private static final int defaultStyle = SWT.NONE;

	/**
	 * Creates a new popup cell editor parented under the given agile grid. The
	 * cell editor value is <code>null</code> initially, and has no validator.
	 * 
	 * @param agileGrid
	 *            The parent agile grid that this cell editor works for.
	 */
	public AdjustedPopupCellEditor(AgileGrid agileGrid) {
		this(agileGrid, defaultStyle);
	}

	/**
	 * Creates a new popup cell editor parented under the given agile grid. The
	 * cell editor value is <code>null</code> initially, and has no validator.
	 * 
	 * @param agileGrid
	 *            The parent agile grid that this cell editor works for.
	 * @param style
	 *            The style bits.
	 */
	public AdjustedPopupCellEditor(AgileGrid agileGrid, int style) {
		super(agileGrid, style);
	}

	/**
	 * Activates the cell editor, and then the popup box.
	 * 
	 * @see org.agilemore.agilegrid.CellEditor#activate(org.agilemore.agilegrid.
	 *      EditorActivationEvent)
	 */

	@Override
	public void activate(EditorActivationEvent activationEvent) {
		super.activate(activationEvent);
		openPopupBox(container);
	}

	/**
	 * Creates the controls used to show the value of this cell editor.
	 * <p>
	 * Subclasses should implement this method.
	 * </p>
	 * 
	 * @param parent
	 *            The control for this cell editor.
	 * @return The controls used to show the value of this cell editor.
	 */
	protected abstract Control createContents(Composite parent);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.agilemore.agilegrid.CellEditor#createControl(org.agilemore.agilegrid
	 * .AgileGrid)
	 */
	@Override
	protected Control createControl(AgileGrid agileGrid) {
		Font font = agileGrid.getFont();
		Color bg = agileGrid.getBackground();

		int style = getStyle();
		container = new Composite(agileGrid, style);
		container.setFont(font);
		container.setBackground(bg);
		container.setLayout(new FillLayout());

		label = new CLabel(container, SWT.LEFT | SWT.FLAT);
		label.setFont(container.getFont());
		label.setBackground(container.getBackground());

		/*
		 * Start of modification.
		 */

		label.setImage(SWTResourceManager.getImage(
				AdjustedPopupCellEditor.class, "/icons/arrow_down.gif"));

		// label.setImage(SWTResourceManager.getImage(AdjustedPopupCellEditor.class,
		// "/icons/editor_normal.png"));

		/*
		 * End of modification.
		 */

		updateLabel(value);

		setValueValid(true);

		return container;
	}

	/**
	 * Creates a tool bar which lie in the bottom area of pop-up box.
	 * 
	 * @param parent
	 */
	protected void createToolBar(Composite parent) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.agilemore.agilegrid.CellEditor#deactivate()
	 */
	@Override
	public void deactivate() {
		if (shell != null && !shell.isDisposed()) {
			shell.dispose();
		}
		super.deactivate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.peertoo.agilegrid.CellEditor#doGetValue()
	 */
	@Override
	protected Object doGetValue() {
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.peertoo.agilegrid.CellEditor#doSetValue(java.lang.Object)
	 */
	@Override
	protected void doSetValue(Object value) {
		this.value = value;
		updateLabel(value);
	}

	/**
	 * Returns the label widget created by <code>createControl</code>.
	 * 
	 * @return the label widget.
	 */
	protected CLabel getLabel() {
		return label;
	}

	/**
	 * Opens a popup box under the given parent control, which will be shown
	 * bellow the cell and returns the valid value when it lost focus, otherwise
	 * cancel edit and set error message.
	 * 
	 * @param parent
	 *            the parent control so that a subclass can adjust the popup box
	 *            accordingly.
	 */
	protected void openPopupBox(Control parent) {
		shell = new Shell(parent.getShell(), SWT.RESIZE | SWT.ON_TOP);
		shell.setBackground(parent.getBackground());
		shell.setLayout(new FillLayout());
		shell.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.character == SWT.ESC) { // Escape
					fireCancelEditor();
				}
			}
		});

		/*
		 * Start of modification.
		 * 
		 * The following code handled closing the shell when it lost its focus.
		 * It has been replaced by the FocusListener in the
		 * XtextPopupCellEditor.
		 * 
		 * Otherwise the shell would always close if someone selects an entry of
		 * the code completion pop-up.
		 */

		// shell.addShellListener(new ShellAdapter() {
		//
		//
		// @Override
		// public void shellDeactivated(ShellEvent e) {
		// boolean validState = isCorrect(value);
		// if (validState) {
		// markDirty();
		// fireApplyEditorValue();
		// } else {
		// // Try to insert the current value into the error
		// // message.
		// setErrorMessage(MessageFormat.format(getErrorMessage(),
		// new Object[] { value.toString() }));
		// fireCancelEditor();
		// }
		// }
		// });

		/*
		 * End of modification.
		 */

		Display display = parent.getDisplay();
		Rectangle cellRect = display.map(parent.getParent(), null,
				parent.getBounds());
		Rectangle clientRect = parent.getMonitor().getClientArea();
		int x = cellRect.x;
		int y = cellRect.y + cellRect.height;
		int width = 300;
		int height = 200;
		if (x + width > clientRect.x + clientRect.width)
			x = clientRect.x + clientRect.width - width;
		if (y + height > clientRect.y + clientRect.height)
			y = cellRect.y - height;

		shell.setBounds(x, y, width, height);

		Composite popupContainer = new Composite(shell, SWT.NONE);
		popupContainer
				.setBackground(popupContainer.getParent().getBackground());
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		popupContainer.setLayout(gridLayout);

		contents = createContents(popupContainer);
		if (contents != null) {
			contents.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if (e.character == SWT.ESC) { // Escape

						/*
						 * Start of modification
						 */

						// get the active shell
						Shell activeShell = e.display.getActiveShell();

						// check if the active shell is the editor shell
						if (activeShell != null
								&& activeShell == contents.getShell()) {
							/*
							 * The active shell is the editor shell, so ignore
							 * the call.
							 */
							return;
						}

						/*
						 * End of modification.
						 */

						fireCancelEditor();
					}
				}
			});
		}

		createToolBar(popupContainer);
		shell.open();
		shell.layout();
	}

	/**
	 * Updates the controls showing the value of this cell editor.
	 * <p>
	 * The default implementation of this framework method just converts the
	 * passed object to a string using <code>toString</code> and sets this as
	 * the text of the label widget.
	 * </p>
	 * 
	 * @param value
	 *            the new value of this cell editor
	 */
	protected void updateLabel(Object value) {
		if (label == null) {
			return;
		}

		String text = "";//$NON-NLS-1$
		if (value != null) {
			text = value.toString();
		}
		label.setText(text);
	}

}
