package de.fraunhofer.iem.reqpat.rmf.interfaces;

/**
 * 
 * @author Frederik Knust
 * 
 */
public interface IPatternBuilder {

	/**
	 * Builds the pattern and appends it to the given StringBuilder.
	 * 
	 * @param sb
	 *            The StringBuilder the pattern will be appended to.
	 * @param id
	 *            The ID.
	 * @param parentId
	 *            The ParentID.
	 * @param value
	 *            The value.
	 */
	public void buildAndAppendPattern(StringBuilder sb, String id,
			String parentId, String value);

	/**
	 * Builds the pattern.
	 * 
	 * @param id
	 *            The ID.
	 * @param parentId
	 *            The ParentID.
	 * @param value
	 *            The value.
	 * @return The pattern.
	 */
	public String buildPattern(String id, String parentId, String value);

	/**
	 * Builds the prefix and suffix of the pattern.
	 * 
	 * @param id
	 *            The ID.
	 * @param parentId
	 *            The ParentID.
	 * @return The prefix and suffix.
	 */
	public String[] buildPatternPrefixAndSuffix(String id, String parentId);

}
