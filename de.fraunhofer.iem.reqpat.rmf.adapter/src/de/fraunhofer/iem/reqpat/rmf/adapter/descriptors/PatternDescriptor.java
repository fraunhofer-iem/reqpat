package de.fraunhofer.iem.reqpat.rmf.adapter.descriptors;

import org.eclipse.core.runtime.Assert;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.SpecObjectType;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternBuilder;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternDescriptor;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class PatternDescriptor implements IPatternDescriptor {

	private final String specTypeName;

	private final SpecObjectType specType;

	private final AttributeDefinition idAttributeDefinition;

	private final AttributeDefinition descriptionAttributeDefinition;

	private final IPatternBuilder patternBuilder;

	public PatternDescriptor(String specTypeName, SpecObjectType specType,
			AttributeDefinition idAttributeDefinition,
			AttributeDefinition descriptionAttributeDefinition,
			IPatternBuilder patternBuilder) {
		Assert.isNotNull(specTypeName);
		Assert.isNotNull(specType);
		Assert.isNotNull(idAttributeDefinition);
		Assert.isNotNull(descriptionAttributeDefinition);
		Assert.isNotNull(patternBuilder);

		this.specTypeName = specTypeName;
		this.specType = specType;
		this.idAttributeDefinition = idAttributeDefinition;
		this.descriptionAttributeDefinition = descriptionAttributeDefinition;
		this.patternBuilder = patternBuilder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternDescriptor#
	 * getDescriptionAttributeDefinition()
	 */
	@Override
	public AttributeDefinition getDescriptionAttributeDefinition() {
		return descriptionAttributeDefinition;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternDescriptor#
	 * getIdAttributeDefinition()
	 */
	@Override
	public AttributeDefinition getIdAttributeDefinition() {
		return idAttributeDefinition;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternDescriptor#getName()
	 */
	@Override
	public String getName() {
		return specTypeName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternDescriptor#
	 * getPatternBuilder()
	 */
	@Override
	public IPatternBuilder getPatternBuilder() {
		return patternBuilder;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternDescriptor#getSpecType
	 * ()
	 */
	@Override
	public SpecObjectType getSpecType() {
		return specType;
	}

}
