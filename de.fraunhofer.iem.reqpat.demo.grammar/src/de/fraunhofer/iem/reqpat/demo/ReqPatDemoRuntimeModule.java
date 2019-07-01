package de.fraunhofer.iem.reqpat.demo;

import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 * 
 * @author Markus Fockel, $LastChangedBy: fkl $
 * @version $Rev: 37 $, $Date: 2013-07-15 15:19:03 +0200 (Mo, 15 Jul 2013) $
 */
public class ReqPatDemoRuntimeModule extends
		de.fraunhofer.iem.reqpat.demo.AbstractReqPatDemoRuntimeModule {
	public Class<? extends ISyntaxErrorMessageProvider> bindISyntaxErrorMessageProvider() {
		return ReqPatDemoSyntaxErrorMessageProvider.class;
	}
}
