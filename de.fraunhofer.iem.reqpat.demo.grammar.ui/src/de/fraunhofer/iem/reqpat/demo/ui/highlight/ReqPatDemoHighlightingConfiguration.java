package de.fraunhofer.iem.reqpat.demo.ui.highlight;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 35 $, $Date: 2013-07-12 15:28:06 +0200 (Fr, 12 Jul 2013) $
 */
public class ReqPatDemoHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
	 * #defaultTextStyle()
	 */
	@Override
	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(17, 117, 94));

		return textStyle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
	 * #keywordTextStyle()
	 */
	@Override
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));

		return textStyle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
	 * #punctuationTextStyle()
	 */
	@Override
	public TextStyle punctuationTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));

		return textStyle;
	}

}
