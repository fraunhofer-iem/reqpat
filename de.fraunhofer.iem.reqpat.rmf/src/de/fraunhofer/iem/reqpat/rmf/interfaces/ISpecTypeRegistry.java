package de.fraunhofer.iem.reqpat.rmf.interfaces;

/**
 * Stores the names of the predefined types.
 * 
 * @author Frederik Knust
 * 
 */
public interface ISpecTypeRegistry {

	public enum SpecType {
		FreeText, Heading, Requirement, Image, Specification
	}

	/**
	 * Getter for the type name.
	 * 
	 * @param type
	 *            the type
	 * @return the type's name
	 */
	public String getSpecTypeName(SpecType type);

}
