package de.fraunhofer.iem.reqpat.rmf.ui.services;

import java.text.MessageFormat;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class AttributeRegistry implements IAttributeRegistry {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IAttributeRegistry#
	 * getAttributeName
	 * (de.fraunhofer.iem.reqpat.core.rmf.interfaces.IAttributeRegistry
	 * .Attribute)
	 */
	@Override
	public String getAttributeName(Attribute attribute) {
		switch (attribute) {
		case ID:
			return "ID";
		case Description:
			return "Description";
		default:
			throw new RuntimeException(MessageFormat.format(
					"Unknown Attribute with name ''{0}''", attribute.name()));
		}
	}

}
