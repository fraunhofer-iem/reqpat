package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.ui;

import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class XtextCellRenderer implements IProrCellRenderer {

	private static final String NEWLINE = System.getProperty("line.separator");

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer
	 * #doDrawCellContent(org.eclipse.swt.graphics.GC,
	 * org.eclipse.swt.graphics.Rectangle, java.lang.Object)
	 */
	@Override
	public int doDrawCellContent(GC gc, Rectangle rect, Object value) {
		String text = " ";

		if (value != null && value instanceof AttributeValue
				&& ReqIF10Util.getTheValue((AttributeValue) value) != null) {
			text = ReqIF10Util.getTheValue((AttributeValue) value).toString();
		}

		/*
		 * The following code adds a linebreak feature to the cell renderer, so
		 * that long requirments are still readable.
		 */

		// split the text at (unix and windows) linebreaks
		String[] lines = text.split("\\r?\\n");

		StringBuilder sb = new StringBuilder();

		for (String line : lines) {
			if (gc.textExtent(line).x > rect.width) {
				int lengthSoFar = 0;

				String[] words = line.split(" ");

				if (words != null) {
					for (String word : words) {
						if ((lengthSoFar = lengthSoFar + gc.textExtent(word).x
								+ gc.textExtent(" ").x) > rect.width) {
							/*
							 * The width of the column has been exceeded, so add
							 * a newline in front of the current word.
							 */
							lengthSoFar = 0;
							sb.append(NEWLINE);
							sb.append(word);
							sb.append(" ");
						} else {
							sb.append(word);
							sb.append(" ");
						}
					}
					sb.append(NEWLINE);
				}
			} else {
				sb.append(line);
				sb.append(NEWLINE);
			}
		}

		// Remove the last newline that has been appended.
		if (sb.subSequence(sb.length() - NEWLINE.length(), sb.length()).equals(
				NEWLINE)) {
			sb.delete(sb.length() - NEWLINE.length(), sb.length());
		}

		text = sb.toString();

		gc.drawText(text, rect.x + 3, rect.y);
		return gc.textExtent(text).y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer
	 * #doDrawHtmlContent(org.eclipse.rmf.reqif10.AttributeValue)
	 */
	@Override
	public String doDrawHtmlContent(AttributeValue value) {
		String text = null;

		if (value != null && value instanceof AttributeValue
				&& ReqIF10Util.getTheValue(value) != null) {
			text = ReqIF10Util.getTheValue(value).toString();

			if (text != null) {
				text = escapeHtml(text);
				text = text.replaceAll("\n", "<br />");
			}
		}

		return text;
	}

	protected String escapeHtml(String input) {
		if (input == null)
			return null;

		return input.replaceAll("&", "&amp;").replaceAll("\"", "&quot;")
				.replaceAll("'", "&#039;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}
