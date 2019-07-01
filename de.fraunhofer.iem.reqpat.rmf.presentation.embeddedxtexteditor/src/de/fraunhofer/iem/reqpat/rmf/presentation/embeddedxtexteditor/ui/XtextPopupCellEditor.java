package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.ui;

import java.util.Timer;
import java.util.TimerTask;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.Cell;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.Activator;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.commands.CheckDocumentCommand;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl-fk $
 * @version $Rev: 369 $, $Date: 2013-03-22 14:48:07 +0100 (Fr, 22 Mrz 2013) $
 * 
 */
public class XtextPopupCellEditor extends AdjustedPopupCellEditor {

	private final IPatternService patternService;
	private final EmbeddedEditorFactory factory;
	private final IEditedResourceProvider resourceProvider;
	private final AgileGrid agileGrid;
	private final Specification specification;
	private final EditingDomain editingDomain;
	private final IEclipsePreferences preferences;
	private final Cell selectedCell;
	private final IResource resource;
	private final ReqIF reqIf;
	private final SpecElementWithAttributes parent;
	private final Object affectedObject;

	private AttributeValue attributeValue;
	private StringBuilder prefix;
	private StringBuilder suffix;
	private EmbeddedEditorModelAccess partialEditor;
	private EmbeddedEditor handle;

	private String value;

	public XtextPopupCellEditor(IReqIfService reqIfService,
			IPatternService patternService, AgileGrid agileGrid,
			Specification specification, EmbeddedEditorFactory factory,
			IEditedResourceProvider resourceProvider,
			EditingDomain editingDomain, IEclipsePreferences preferences,
			Cell selectedCell, SpecObject specObject,
			AttributeValue attributeValue, SpecElementWithAttributes parent,
			Object affectedObject, StringBuilder prefix, StringBuilder suffix) {
		super(agileGrid);

		this.patternService = patternService;
		this.agileGrid = agileGrid;
		this.specification = specification;
		this.factory = factory;
		this.resourceProvider = resourceProvider;
		this.editingDomain = editingDomain;
		this.preferences = preferences;
		this.selectedCell = selectedCell;
		this.attributeValue = attributeValue;
		this.parent = parent;
		this.affectedObject = affectedObject;
		this.prefix = prefix;
		this.suffix = suffix;

		reqIf = ReqIF10Util.getReqIF(attributeValue);

		// try to get the resource from the attribute value
		resource = reqIfService.getResource(attributeValue);

		Object value = ReqIF10Util.getTheValue(attributeValue);

		if (value == null)
			value = "";

		Assert.isLegal(value instanceof String,
				"Value must be of type 'String'.");

		this.value = (String) value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.ipt.em.swt.isae.embeddedxtexteditor.ui.AdjustedPopupCellEditor
	 * #createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		if (value == null)
			return null;

		// create handle with provided resource provider
		handle = factory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withParent(parent);

		// pass the attribute value to the partialEditor
		partialEditor = handle.createPartialEditor(prefix.toString(), value,
				suffix.toString(), true);

		// update the document so that it shows error directly after the dialog
		// shows
		handle.getDocument().checkAndUpdateAnnotations();

		// TODO check for minimum width
		Rectangle bounds = getRenderArea(selectedCell);
		parent.getShell().setSize(bounds.width, 150);

		handle.getViewer().getTextWidget()
				.addFocusListener(new FocusListener() {

					private long timeOpened = -1;

					@Override
					public void focusGained(FocusEvent e) {
						if (timeOpened == -1)
							timeOpened = System.currentTimeMillis();
					}

					@Override
					public void focusLost(final FocusEvent e) {
						// get the active shell
						Shell activeShell = e.display.getActiveShell();

						// check if the active shell is a child of the dialog
						if (activeShell != null
								&& activeShell.getParent() == handle
										.getViewer().getTextWidget().getShell()) {
							/*
							 * The active shell is a child of the dialog, so it
							 * is most certainly the code completion window. In
							 * this case ignore the call.
							 */
							return;
						}

						/*
						 * The Xtext editor may throw an exception if it is
						 * closed directly after it has been opened. This delay
						 * tries to prevent that.
						 */
						if (timeOpened != -1
								&& System.currentTimeMillis() - timeOpened <= 100) {
							Timer timer = new Timer();
							timer.schedule(new TimerTask() {

								@Override
								public void run() {
									e.display.asyncExec(new Runnable() {

										@Override
										public void run() {
											fireCancelEditor();
										}
									});
								}
							}, 100);

							return;
						}

						markDirty();
						fireApplyEditorValue();
					}
				});

		handle.getViewer().getTextWidget().addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.stateMask == SWT.CONTROL && e.keyCode == 's') {
					markDirty();
					fireApplyEditorValue();
				}
			}
		});

		handle.getViewer().getTextWidget().setFocus();

		return handle.getViewer().getTextWidget();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.ipt.em.swt.isae.embeddedxtexteditor.ui.AdjustedPopupCellEditor
	 * #doGetValue()
	 */
	@Override
	protected Object doGetValue() {
		/*
		 * Only save the value if the document is not null. If it is null the
		 * user has closed the editor using the escape key, so he does not want
		 * to save the changes.
		 */
		if (handle != null && handle.getViewer() != null
				&& handle.getViewer().getDocument() != null) {
			String newText = partialEditor.getEditablePart();

			// Only submit a change if something has changed.
			if (newText.equals(value)) {
				return attributeValue;
			}

			ProrUtil.setTheValue(attributeValue, newText, parent,
					affectedObject, editingDomain);

			if (preferences != null
					&& preferences.getBoolean(Activator.AUTO_CHECK, false)) {
				CheckDocumentCommand checkDocumentCommand = new CheckDocumentCommand(
						agileGrid.getShell(), patternService, resource, reqIf,
						specification);
				editingDomain.getCommandStack().execute(checkDocumentCommand);
			}
		}

		return attributeValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.ipt.em.swt.isae.embeddedxtexteditor.ui.AdjustedPopupCellEditor
	 * #doSetValue(java.lang.Object)
	 */
	@Override
	protected void doSetValue(Object value) {
		super.doSetValue(this.value);
	}

	protected Object getAttributeValue(AttributeValue attributeValue) {
		if (attributeValue != null)
			return ReqIF10Util.getTheValue(attributeValue);

		return null;
	}
}
