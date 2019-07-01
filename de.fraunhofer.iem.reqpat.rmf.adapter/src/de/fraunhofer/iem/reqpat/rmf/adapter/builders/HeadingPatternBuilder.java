package de.fraunhofer.iem.reqpat.rmf.adapter.builders;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternBuilder;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class HeadingPatternBuilder implements IPatternBuilder {

	/*
	 * Start defining Heading Pattern.
	 */

	private static final String HEADING_PATTERN_PREFIX = "{[H][%s]'";
	private static final String HEADING_PATTERN_PREFIX_WITH_PARENTID = "{[H][%s]['%s']'";

	private static final String HEADING_PATTERN_VALUE = "%s";

	private static final String HEADING_PATTERN_SUFFIX = "'}";

	private static final String HEADING_PATTERN_SKELETON = HEADING_PATTERN_PREFIX
			+ HEADING_PATTERN_VALUE + HEADING_PATTERN_SUFFIX;

	private static final String HEADING_PATTERN_SKELETON_WITH_PARENTID = HEADING_PATTERN_PREFIX_WITH_PARENTID
			+ HEADING_PATTERN_VALUE + HEADING_PATTERN_SUFFIX;

	/*
	 * Stop defining Heading Pattern.
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
			return String.format(HEADING_PATTERN_SKELETON, id, value);
		} else {
			return String.format(HEADING_PATTERN_SKELETON_WITH_PARENTID, id,
					parentId, value);
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
			return new String[] { String.format(HEADING_PATTERN_PREFIX, id),
					HEADING_PATTERN_SUFFIX };
		} else {
			return new String[] {
					String.format(HEADING_PATTERN_PREFIX_WITH_PARENTID, id,
							parentId), HEADING_PATTERN_SUFFIX };
		}
	}

}
