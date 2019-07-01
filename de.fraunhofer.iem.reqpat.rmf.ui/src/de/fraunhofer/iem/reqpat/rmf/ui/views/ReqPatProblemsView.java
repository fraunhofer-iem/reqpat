package de.fraunhofer.iem.reqpat.rmf.ui.views;

import org.agilemore.agilegrid.Assert;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10Editor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.ReqifSpecificationEditorInput;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.ui.internal.views.markers.ExtendedMarkersView;
import org.eclipse.ui.views.markers.MarkerSupportView;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;

/**
 * A customized MarkerSupportView, which overwrites the createPartControl()
 * method to alter the double-click actions that is performed when the user
 * double-clicks onto a marker.
 * 
 * @author Frederik Knust
 * 
 */
@SuppressWarnings("restriction")
public class ReqPatProblemsView extends MarkerSupportView {

	public static final String VIEW_ID = "de.fraunhofer.iem.reqpat.rmf.ui.ReqPatProblemsView";

	private final IReqIfService reqIfService;

	private final String markerOrigin;

	/**
	 * Constructor for the ReqPatProblemsView class.
	 */
	public ReqPatProblemsView() {
		super("de.fraunhofer.iem.reqpat.rmf.ui.ReqPatMarkerGenerator");

		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();
		Assert.isNotNull(injector);

		reqIfService = injector.getInstance(IReqIfService.class);
		Assert.isNotNull(reqIfService);

		markerOrigin = injector.getInstance(Key.get(String.class,
				Names.named(IReqIfService.MARKER_ORIGIN_INJECT)));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.internal.views.markers.ExtendedMarkersView#createPartControl
	 * (org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		Control[] children = parent.getChildren();
		for (Control child : children) {
			if (child instanceof Tree) {
				Tree tree = (Tree) child;

				final Listener[] listeners = tree
						.getListeners(SWT.DefaultSelection);
				if (listeners != null) {
					for (final Listener listener : listeners) {
						tree.removeListener(SWT.DefaultSelection, listener);
					}
				}

				tree.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseDoubleClick(final MouseEvent e) {
						if (e.widget instanceof Tree) {
							final Tree tree = (Tree) e.widget;

							/*
							 * Get the selection from the tree. As the listener
							 * reacted to a double click this should always be
							 * exactly one element.
							 */
							TreeItem[] selection = tree.getSelection();

							if (selection == null || selection.length == 0)
								return;

							TreeItem selectedItem = selection[0];
							Object obj = selectedItem.getData();

							/*
							 * Fetch the marker from the object. (The marker is
							 * wrapped in an adapter).
							 */
							if (obj instanceof IAdaptable) {
								IMarker marker = (IMarker) ((IAdaptable) obj)
										.getAdapter(IMarker.class);

								openMarker(marker, getSite().getPage());
							}
						}
					}

				});
			}
		}
	}

	/**
	 * Fetches the IResource and the SpechHierarchy's identifier (MARKER_ORIGIN)
	 * from the marker. Checks if the correct SpecificationEditor has already
	 * been opened and selects the erroneous SpecHierarchy. If the
	 * SpecificationEditor is not already open, it is opened first.
	 * 
	 * @param marker
	 *            The selected marker.
	 * @param page
	 *            The current workbench page.
	 */
	public void openMarker(IMarker marker, IWorkbenchPage page) {
		SpecHierarchy origin = null;
		Specification specification = null;
		Reqif10Editor reqIfEditor = null;

		String identifier = marker.getAttribute(markerOrigin, null);

		if (identifier != null) {

			if (marker.getResource() != null
					& marker.getResource() instanceof IFile) {
				ReqIF reqIf = null;
				IEditorPart editor = ResourceUtil.findEditor(page,
						(IFile) marker.getResource());

				// the editor is not open, so open it first
				if (editor == null) {
					try {
						editor = IDE.openEditor(page,
								(IFile) marker.getResource());
					} catch (PartInitException e) {
					}
				}

				// check if the ReqIf editor for this resource is already open
				if (editor != null && editor instanceof Reqif10Editor) {
					reqIfEditor = (Reqif10Editor) editor;
					reqIf = reqIfEditor.getReqif();

					origin = reqIfService.getSpecHierarchy(reqIf, identifier);
					specification = reqIfService.getSpecification(origin);
				}
			}

			if (origin != null && specification != null && reqIfEditor != null) {
				/*
				 * Check if one of the open editors is the Specification editor
				 * for the Specification of the marker.
				 */
				IEditorReference[] editorReferences = page
						.getEditorReferences();

				if (editorReferences != null) {
					for (IEditorReference editorReference : editorReferences) {
						IEditorPart editor = editorReference.getEditor(true);

						if (editor != null
								&& editor instanceof SpecificationEditor) {
							SpecificationEditor specificationEditor = (SpecificationEditor) editor;
							IEditorInput input = specificationEditor
									.getEditorInput();

							if (input != null
									&& input instanceof ReqifSpecificationEditorInput) {
								ReqifSpecificationEditorInput specificationEditorInput = (ReqifSpecificationEditorInput) input;

								if (specification == specificationEditorInput
										.getSpec()) {
									// this is the correct editor
									page.activate(specificationEditor);

									if (specificationEditor.getSite() != null
											&& specificationEditor.getSite()
													.getSelectionProvider() != null) {
										specificationEditor
												.getSite()
												.getSelectionProvider()
												.setSelection(
														new StructuredSelection(
																origin));
									}
									return;
								}
							}
						}
					}
				}

				/*
				 * The editor for this Specification is not open, so open a new
				 * Specification editor.
				 */

				ReqifSpecificationEditorInput editorInput = new ReqifSpecificationEditorInput(
						reqIfEditor, specification);

				try {
					SpecificationEditor specificationEditor = (SpecificationEditor) IDE
							.openEditor(page, editorInput,
									SpecificationEditor.EDITOR_ID);

					if (specificationEditor.getSite() != null
							&& specificationEditor.getSite()
									.getSelectionProvider() != null) {
						specificationEditor.getSite().getSelectionProvider()
								.setSelection(new StructuredSelection(origin));
					}

					return;
				} catch (PartInitException e1) {
				}
			}
		}

		/*
		 * The origin and specification could not be found or an unexpected
		 * error occurred, so use the default behavior.
		 */
		ExtendedMarkersView.openMarkerInEditor(marker, page);
	}
}
