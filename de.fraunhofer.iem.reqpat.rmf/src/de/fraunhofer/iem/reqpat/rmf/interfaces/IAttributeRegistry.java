package de.fraunhofer.iem.reqpat.rmf.interfaces;

/**
 * Stores the names of the predefined attributes.
 * 
 * @author Frederik Knust
 * 
 */
public interface IAttributeRegistry {

	public static enum Attribute {
		ID, Description
	}

	/**
	 * Getter for the attribute name.
	 * 
	 * @param attribute
	 *            the attribute
	 * @return the attribute's name
	 */
	public String getAttributeName(Attribute attribute);

}
