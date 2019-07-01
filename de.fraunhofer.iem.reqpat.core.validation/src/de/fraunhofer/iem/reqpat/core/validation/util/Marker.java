package de.fraunhofer.iem.reqpat.core.validation.util;

import de.fraunhofer.iem.reqpat.core.interfaces.IMarker;

/**
 * Stores the information of a requirement's error or warning.
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 43 $, $Date: 2013-07-19 15:40:31 +0200 (Fr, 19 Jul 2013) $
 */
public class Marker implements IMarker {

	private String id;
	private String description;

	private Severity severity;

	public Marker(String id, String description, Severity severity) {
		this.id = id;
		this.description = description;
		this.severity = severity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.views.util.IMarker#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.views.util.IMarker#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.views.util.IMarker#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return severity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.views.util.IMarker#setDescription(java.lang.
	 * String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.views.util.IMarker#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.views.util.IMarker#setSeverity(de.fraunhofer
	 * .iem.reqpat.views.util.Marker.Severity)
	 */
	@Override
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
}
