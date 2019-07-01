package de.fraunhofer.iem.reqpat.rmf.interfaces;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.SpecObjectType;

/**
 * 
 * @author Frederik Knust
 * 
 */
public interface IPatternDescriptor {

	/**
	 * Getter for the description attribute definition.
	 * 
	 * @return The description attribute definition.
	 */
	public AttributeDefinition getDescriptionAttributeDefinition();

	/**
	 * Getter for the ID attribute definition.
	 * 
	 * @return The ID attribute definition.
	 */
	public AttributeDefinition getIdAttributeDefinition();

	/**
	 * Getter for the name.
	 * 
	 * @return The name.
	 */
	public String getName();

	/**
	 * Getter for the pattern builder.
	 * 
	 * @return The pattern builder.
	 */
	public IPatternBuilder getPatternBuilder();

	/**
	 * Getter for the spec type.
	 * 
	 * @return The spec type.
	 */
	public SpecObjectType getSpecType();
}
