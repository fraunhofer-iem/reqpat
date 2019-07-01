package de.fraunhofer.iem.reqpat.core.interfaces;

/**
 * 
 * @author Frederik Knust
 * 
 */
public interface IMarker {

	/**
	 * Contains values to describe the severity of a Marker. The values are
	 * indexed, so that they can be used for sorting.
	 * 
	 */
	public enum Severity {
		ERROR(0), WARNING(1);

		private final int index;

		Severity(int index) {
			this.index = index;
		}

		public int index() {
			return index;
		}
	}

	/**
	 * Getter for the description attribute.
	 * 
	 * @return the marker's description
	 */
	public String getDescription();

	/**
	 * Getter for the ID attribute.
	 * 
	 * @return the marker's ID
	 */
	public String getId();

	/**
	 * Getter for the severity attribute.
	 * 
	 * @return the marker's severity
	 */
	public Severity getSeverity();

	/**
	 * Setter for the description attribute.
	 * 
	 * @param description
	 *            the marker's description
	 */
	public void setDescription(String description);

	/**
	 * Setter for the ID attribute.
	 * 
	 * @param id
	 *            the marker's id
	 */
	public void setId(String id);

	/**
	 * Setter for the severity attribute.
	 * 
	 * @param severity
	 *            the marker's severity
	 */
	public void setSeverity(Severity severity);

}