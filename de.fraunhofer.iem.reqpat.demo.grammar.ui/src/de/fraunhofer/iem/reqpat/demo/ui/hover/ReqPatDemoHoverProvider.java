package de.fraunhofer.iem.reqpat.demo.ui.hover;

import java.text.MessageFormat;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class ReqPatDemoHoverProvider extends DefaultEObjectHoverProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider#
	 * getFirstLine(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getFirstLine(EObject o) {
		if (o instanceof AnalysisFunction) {
			return MessageFormat.format("Function <b>{0}</b>",
					((AnalysisFunction) o).getName());
		} else if (o instanceof FunctionalDevice) {
			return MessageFormat.format("Functional Device <b>{0}</b>",
					((FunctionalDevice) o).getName());
		}

		return super.getFirstLine(o);
	}

}
