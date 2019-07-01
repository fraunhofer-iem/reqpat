package de.fraunhofer.iem.reqpat.rmf.exceptions;

/**
 * This class represents an Exception that occurred while creating a
 * PatternDescriptor.
 * 
 * @author Frederik Knust
 * 
 */
public class PatternException extends Exception {

	private static final long serialVersionUID = -2438189985768636184L;

	private final String title;

	/**
	 * Constructor for the PatternException class.
	 * 
	 * @param title
	 *            The title of this exception.
	 * @param message
	 *            The message of this exception.
	 */
	public PatternException(String title, String message) {
		super(message);

		this.title = title;
	}

	/**
	 * Getter for the title.
	 * 
	 * @return The title.
	 */
	public String getTitle() {
		return title;
	}
}
