package de.fraunhofer.iem.reqpat.rmf.ui.services;

import java.text.MessageFormat;

import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class SpecTypeRegistry implements ISpecTypeRegistry {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.ISpecTypeRegistry#
	 * getSpecTypeName
	 * (de.fraunhofer.iem.reqpat.core.rmf.interfaces.ISpecTypeRegistry.SpecType)
	 */
	@Override
	public String getSpecTypeName(SpecType type) {
		switch (type) {
		case FreeText:
			return "Free Text";
		case Heading:
			return "Heading";
		case Image:
			return "Image";
		case Requirement:
			return "Requirement Type";
		case Specification:
			return "Specification Type";
		default:
			throw new RuntimeException(MessageFormat.format(
					"Unknown SpecType with name ''{0}''.", type.name()));
		}
	}

}
