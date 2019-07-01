package de.fraunhofer.iem.reqpat.core.interfaces;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;

/**
 * Offers convenience methods e.g. to find, show and hide views and to display
 * error messages.
 * 
 * @author Frederik Knust
 * 
 */
public interface IWorkbenchService {

	/**
	 * Finds the view with the provided ID and returns it.
	 * 
	 * @param id
	 *            The ID of the view that shall be opened.
	 * @return The view that has been found.
	 * @throws PartInitException
	 *             If the workbench could not be initialized.
	 */
	public IViewPart findView(String id);

	/**
	 * Hides the view with the provided ID and returns it.
	 * 
	 * @param id
	 *            The ID of the view that shall be hidden.
	 * @return The view that has been hidden.
	 * @throws PartInitException
	 *             If the workbench could not be initialized.
	 */
	public IViewPart hideView(String id);

	/**
	 * Hides the workbench (if it is running and visible).
	 */
	public void hideWorkbench();

	/**
	 * Shows an error popup.
	 * 
	 * @param caption
	 *            the popup's caption
	 * @param message
	 *            the error message
	 */
	public void showError(String caption, String message);

	/**
	 * Opens the view with the provided ID and returns it.
	 * 
	 * @param id
	 *            The ID of the view that shall be opened.
	 * @return The view that has been opened.
	 * @throws PartInitException
	 *             If the workbench could not be initialized.
	 */
	public IViewPart showView(String id) throws PartInitException;

	/**
	 * Shows the workbench (if it is running and invisible).
	 */
	public void showWorkbench();

	/**
	 * Toggles the visibility of the workbench (if it is running).
	 */
	public void toggleWorkbench();

}
