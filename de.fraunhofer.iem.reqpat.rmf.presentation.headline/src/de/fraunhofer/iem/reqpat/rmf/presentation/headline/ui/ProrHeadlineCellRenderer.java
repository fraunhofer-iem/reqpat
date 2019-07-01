/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package de.fraunhofer.iem.reqpat.rmf.presentation.headline.ui;

import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueSimple;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * Copied from
 * org.eclipse.rmf.pror.presentation.headline.ui.HeadlineCellRenderer. The
 * visibility of the fields has been adjusted so that they can be used in the
 * HeadlineCellRenderer.
 * 
 * @author Frederik Knust
 * 
 */
public class ProrHeadlineCellRenderer implements IProrCellRenderer {

	protected String fontHandle = "pror_headline_font-";
	protected Font font;
	protected int fontSize;
	protected boolean fontSizeChanged = false;

	public ProrHeadlineCellRenderer(String identifier) {
		this.fontHandle = "pror_headline_font-" + identifier;
	}

	@Override
	public int doDrawCellContent(GC gc, Rectangle rect, Object value) {
		AttributeValueSimple av = (AttributeValueSimple) value;
		String text = " ";
		if (av != null && ReqIF10Util.getTheValue(av) != null) {
			text = ReqIF10Util.getTheValue(av).toString();
		}

		if (font == null || font.isDisposed() || fontSizeChanged) {
			FontRegistry fr = JFaceResources.getFontRegistry();
			FontData[] fontData = { new FontData("Arial", fontSize, SWT.BOLD) };
			fr.put(fontHandle + this, fontData);
			font = fr.get(fontHandle + this);
			fontSizeChanged = false;
		}

		gc.setFont(font);
		gc.drawText(text, rect.x, rect.y);
		return gc.textExtent(text).y;
	}

	@Override
	public String doDrawHtmlContent(AttributeValue value) {
		AttributeValueSimple av = (AttributeValueSimple) value;
		return "<div style='font-size: " + fontSize
				+ "pt; font-weight: bold; padding-top: 4pt;'>"
				+ ReqIF10Util.getTheValue(av) + "</div>";
	}

	public void setDatatypeId(String identifier) {
		this.fontHandle = "pror_headline_font-" + identifier;
		setFontSize(fontSize);
	}

	public void setFontSize(final int fontSize) {
		this.fontSize = fontSize;
		this.fontSizeChanged = true;
	}

}
