package de.fraunhofer.iem.reqpat.rmf.presentation.headline.ui;

import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class HeadlineCellRenderer extends ProrHeadlineCellRenderer {

	public HeadlineCellRenderer(String identifier) {
		super(identifier);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.ipt.em.swt.isae.headlinepresentationservice.ui.
	 * ProrHeadlineCellRenderer#doDrawCellContent(org.eclipse.swt.graphics.GC,
	 * org.eclipse.swt.graphics.Rectangle, java.lang.Object)
	 */
	@Override
	public int doDrawCellContent(GC gc, Rectangle rect, Object value) {
		if (value instanceof AttributeValue) {
			AttributeValue av = (AttributeValue) value;

			// fetch the spec hierarchy for the attribute value
			SpecHierarchy specHierarchy = getSpecHierarchyForAttributeValue(av);
			String leftHeaderLabel = getLeftHeaderLabel(specHierarchy);

			if (leftHeaderLabel != null) {
				leftHeaderLabel += " ";

				gc.setFont(font);
				gc.drawText(leftHeaderLabel, rect.x, rect.y);

				/*
				 * Create a new rectangle, so that the rest of the text is
				 * written after the header label.
				 */
				Rectangle oldRect = rect;
				rect = new Rectangle(oldRect.x
						+ gc.textExtent(leftHeaderLabel).x, oldRect.y,
						oldRect.width, oldRect.height);
			}
		}

		return super.doDrawCellContent(gc, rect, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.ipt.em.swt.isae.headlinepresentationservice.ui.
	 * ProrHeadlineCellRenderer
	 * #doDrawHtmlContent(org.eclipse.rmf.reqif10.AttributeValue)
	 */
	@Override
	public String doDrawHtmlContent(AttributeValue value) {
		String html = "<b>%s</b>";

		if (value != null) {
			// fetch the spec hierarchy for the attribute value
			SpecHierarchy specHierarchy = getSpecHierarchyForAttributeValue(value);
			String leftHeaderLabel = getLeftHeaderLabel(specHierarchy);

			if (leftHeaderLabel != null) {
				html = String.format(html, leftHeaderLabel + " %s");
			}

			Object headline = ReqIF10Util.getTheValue(value);

			if (headline != null) {
				html = String.format(html, escapeHtml(headline.toString()));
			}
		}

		return html;
	}

	protected String escapeHtml(String input) {
		if (input == null)
			return null;

		return input.replaceAll("&", "&amp;").replaceAll("\"", "&quot;")
				.replaceAll("'", "&#039;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}

	/**
	 * Copied from
	 * org.eclipse.rmf.pror.reqif10.editor.agilegrid.ProrLayoutAdvisor.
	 * 
	 * Adjusted to take specHierarchy instead of row number
	 * 
	 * @param specHierarchy
	 * @return
	 */
	protected String getLeftHeaderLabel(SpecHierarchy specHierarchy) {
		StringBuffer sb = new StringBuffer();

		if (specHierarchy == null) {
			return null;
		}

		while (specHierarchy.eContainer() instanceof SpecHierarchy) {
			SpecHierarchy parent = (SpecHierarchy) specHierarchy.eContainer();
			int level = parent.getChildren().indexOf(specHierarchy) + 1;
			sb.insert(0, level);
			sb.insert(0, ".");
			specHierarchy = parent;
		}
		if (specHierarchy.eContainer() instanceof Specification) {
			Specification parent = (Specification) specHierarchy.eContainer();
			int level = parent.getChildren().indexOf(specHierarchy) + 1;
			sb.insert(0, level);
		}
		return sb.toString();
	}

	protected SpecHierarchy getSpecHierarchyForAttributeValue(AttributeValue av) {
		SpecHierarchy specHierarchy = null;

		if (av.eContainer() != null && av.eContainer() instanceof SpecObject) {
			SpecObject specObject = (SpecObject) av.eContainer();

			if (specObject.isSetIdentifier()) {
				String id = specObject.getIdentifier();

				ReqIF reqIf = ReqIF10Util.getReqIF(av);
				if (reqIf != null && reqIf.isSetCoreContent()
						&& reqIf.getCoreContent().isSetSpecifications()) {
					for (Specification specification : reqIf.getCoreContent()
							.getSpecifications()) {
						if (specification.isSetChildren()) {
							for (SpecHierarchy child : specification
									.getChildren()) {
								specHierarchy = recursiveSearch(child, id);

								if (specHierarchy != null)
									return specHierarchy;
							}
						}
					}
				}
			}
		}

		return specHierarchy;
	}

	protected SpecHierarchy recursiveSearch(SpecHierarchy specHierarchy,
			String id) {
		if (specHierarchy.isSetObject())
			if (specHierarchy.getObject().isSetIdentifier())
				if (specHierarchy.getObject().getIdentifier().equals(id))
					return specHierarchy;

		if (specHierarchy.isSetChildren())
			for (SpecHierarchy child : specHierarchy.getChildren()) {
				SpecHierarchy result = recursiveSearch(child, id);
				if (result != null)
					return result;
			}

		return null;
	}
}
