package de.fraunhofer.iem.reqpat.core.interfaces;

import java.util.List;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 24 $, $Date: 2013-07-10 14:26:29 +0200 (Mi, 10 Jul 2013) $
 */
public interface IViewService {

	public static final String VIEW_IDS = "View Ids";

	/**
	 * Adds an editor listener.
	 * 
	 * @param listener
	 *            the editor listener
	 */
	public void addEditorListener(IEditorListener listener);

	/**
	 * Tells the view that the shell has been closed (made invisible).
	 */
	public void closedViaWindowX();

	/**
	 * Removes an editor listener.
	 * 
	 * @param listener
	 *            the editor listener
	 */
	public void removeEditorListener(IEditorListener listener);

	/**
	 * Opens the editor view and updates its contents.
	 * 
	 * @param id
	 *            The ID of the requirement to be edited.
	 * @param prefix
	 *            The prefix of the requirement.
	 * @param content
	 *            The content of the requirement that will be shown to the user.
	 * @param suffix
	 *            The suffix of the requirement.
	 */
	public void showAndUpdateEditorView(String id, String prefix,
			String content, String suffix);

	/**
	 * Opens the problems view to show the given markers.
	 * 
	 * @param markers
	 *            The problems to show.
	 */
	public void showAndUpdateProblemsView(List<IMarker> markers);

}
