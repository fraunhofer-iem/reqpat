package de.fraunhofer.iem.reqpat.rmf.presentation.headline.ui;

import org.agilemore.agilegrid.AgileGrid;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrCellEditor;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl-fk $
 * @version $Rev: 369 $, $Date: 2013-03-22 14:48:07 +0100 (Fr, 22 Mrz 2013) $
 * 
 */
public class HeadlineCellEditor extends ProrCellEditor {

	protected final AttributeValue attributeValue;

	protected String value;

	public HeadlineCellEditor(AgileGrid agileGrid, EditingDomain editingDomain,
			AttributeValue attributeValue, SpecElementWithAttributes parent,
			Object affectedObject) {
		super(agileGrid, editingDomain, parent, affectedObject);

		this.attributeValue = attributeValue;

		Object value = ReqIF10Util.getTheValue(attributeValue);

		if (value == null)
			value = "";

		Assert.isLegal(value instanceof String,
				"Value must be of type 'String'.");

		this.value = (String) value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrCellEditor#doGetValue()
	 */
	@Override
	protected Object doGetValue() {
		String newValue = text.getText();

		// Only submit a change if something has changed.
		if (newValue.equals(value)) {
			return attributeValue;
		}

		ProrUtil.setTheValue(attributeValue, newValue, parent, affectedObject,
				editingDomain);

		return attributeValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrCellEditor#doSetValue
	 * (java.lang.Object)
	 */
	@Override
	protected void doSetValue(Object value) {
		super.doSetValue(this.value);
	}
}