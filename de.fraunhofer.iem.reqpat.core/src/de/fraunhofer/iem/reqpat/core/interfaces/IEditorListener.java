package de.fraunhofer.iem.reqpat.core.interfaces;

/**
 * 
 * @author Markus Fockel, $LastChangedBy: fkl $
 * @version $Rev: 93 $, $Date: 2014-05-05 17:47:54 +0200 (Mo, 05 Mai 2014) $
 */
public interface IEditorListener {
	/**
	 * Called when the requirement editor is closed without saving.
	 */
	void onCancel();

	/**
	 * Called when a problem list entry is double clicked.
	 * 
	 * @param marker
	 *            The Marker associated with the clicked problem list entry
	 */
	void onMarkerDoubleClick(IMarker marker);

	/**
	 * Called when the requirement pattern editor is closed after saving.
	 * 
	 * @param mainText
	 *            The editor content
	 * @param asPattern
	 *            Save the text as requirement pattern (i.e. in the model)?
	 */
	void onSave(String mainText, boolean asPattern);

	/**
	 * Called when the "perform extended checks" button is pressed.
	 */
	void onPerformExtendedChecks();
}
