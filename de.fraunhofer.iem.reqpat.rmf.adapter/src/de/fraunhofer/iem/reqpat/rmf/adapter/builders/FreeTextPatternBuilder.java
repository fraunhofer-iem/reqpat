package de.fraunhofer.iem.reqpat.rmf.adapter.builders;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternBuilder;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class FreeTextPatternBuilder implements IPatternBuilder {

	/*
	 * Start defining Free Text Pattern.
	 */

	private static final String FREE_TEXT_PATTERN_PREFIX = "{[F][%s]\"";
	private static final String FREE_TEXT_PATTERN_PREFIX_WITH_PARENTID = "{[F][%s]['%s']\"";

	private static final String FREE_TEXT_PATTERN_VALUE = "%s";

	private static final String FREE_TEXT_PATTERN_SUFFIX = "\"}";

	private static final String FREE_TEXT_PATTERN_SKELETON = FREE_TEXT_PATTERN_PREFIX
			+ FREE_TEXT_PATTERN_VALUE + FREE_TEXT_PATTERN_SUFFIX;

	private static final String FREE_TEXT_PATTERN_SKELETON_WITH_PARENTID = FREE_TEXT_PATTERN_PREFIX_WITH_PARENTID
			+ FREE_TEXT_PATTERN_VALUE + FREE_TEXT_PATTERN_SUFFIX;

	/*
	 * Stop defining Free Text Pattern.
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternBuilder#buildAndAppendPattern
	 * (java.lang.StringBuilder, java.lang.String, java.lang.String,
	 * java.lang.String)
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
	 * de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternBuilder#buildPattern(
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String buildPattern(String id, String parentId, String value) {

		if (parentId == null || parentId.length() == 0) {
			return String.format(FREE_TEXT_PATTERN_SKELETON, id, value);
		} else {
			return String.format(FREE_TEXT_PATTERN_SKELETON_WITH_PARENTID, id,
					parentId, value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternBuilder#
	 * buildPatternPrefixAndSuffix(java.lang.String, java.lang.String)
	 */
	@Override
	public String[] buildPatternPrefixAndSuffix(String id, String parentId) {

		if (parentId == null || parentId.length() == 0) {
			return new String[] { String.format(FREE_TEXT_PATTERN_PREFIX, id),
					FREE_TEXT_PATTERN_SUFFIX };
		} else {
			return new String[] {
					String.format(FREE_TEXT_PATTERN_PREFIX_WITH_PARENTID, id,
							parentId), FREE_TEXT_PATTERN_SUFFIX };
		}
	}

}
