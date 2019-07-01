package de.fraunhofer.iem.reqpat.rmf.adapter.builders;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternBuilder;

public class RequirementPatternBuilder implements IPatternBuilder {

	/*
	 * Start defining Requirement Pattern.
	 */

	private static final String REQUIREMENT_PATTERN_PREFIX = "{[RP][%s]";
	private static final String REQUIREMENT_PATTERN_PREFIX_WITH_PARENTID = REQUIREMENT_PATTERN_PREFIX
			+ "['%s']";

	private static final String REQUIREMENT_PATTERN_VALUE = "%s";

	private static final String REQUIREMENT_PATTERN_SUFFIX = "}";

	private static final String REQUIREMENT_PATTERN_SKELETON = REQUIREMENT_PATTERN_PREFIX
			+ REQUIREMENT_PATTERN_VALUE + REQUIREMENT_PATTERN_SUFFIX;

	private static final String REQUIREMENT_PATTERN_SKELETON_WITH_PARENTID = REQUIREMENT_PATTERN_PREFIX_WITH_PARENTID
			+ REQUIREMENT_PATTERN_VALUE + REQUIREMENT_PATTERN_SUFFIX;

	/*
	 * Stop defining Requirement Pattern.
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternBuilder#
	 * buildAndAppendPattern(java.lang.StringBuilder, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void buildAndAppendPattern(StringBuilder sb, String id,
			String parentId, String value) {

		sb.append(buildPattern(id, parentId, value));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternBuilder#buildPattern
	 * (java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String buildPattern(String id, String parentId, String value) {

		if (parentId == null || parentId.length() == 0) {
			return String.format(REQUIREMENT_PATTERN_SKELETON, id, value);
		} else {
			return String.format(REQUIREMENT_PATTERN_SKELETON_WITH_PARENTID,
					id, parentId, value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.rmf.interfaces.IPatternBuilder#
	 * buildPatternPrefixAndSuffix(java.lang.String, java.lang.String)
	 */
	@Override
	public String[] buildPatternPrefixAndSuffix(String id, String parentId) {

		if (parentId == null || parentId.length() == 0) {
			return new String[] {
					String.format(REQUIREMENT_PATTERN_PREFIX, id),
					REQUIREMENT_PATTERN_SUFFIX };
		} else {
			return new String[] {
					String.format(REQUIREMENT_PATTERN_PREFIX_WITH_PARENTID, id,
							parentId), REQUIREMENT_PATTERN_SUFFIX };
		}
	}

}
