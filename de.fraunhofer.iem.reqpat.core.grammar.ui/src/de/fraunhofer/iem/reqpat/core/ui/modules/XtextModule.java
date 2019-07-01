package de.fraunhofer.iem.reqpat.core.ui.modules;

import org.eclipse.xtext.ISetup;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import de.fraunhofer.iem.reqpat.core.ReqPatStandaloneSetupGenerated;
import de.fraunhofer.iem.reqpat.core.interfaces.IXtextPlugin;
import de.fraunhofer.iem.reqpat.core.interfaces.IXtextService;
import de.fraunhofer.iem.reqpat.core.ui.services.XtextPluginProxy;
import de.fraunhofer.iem.reqpat.core.ui.services.XtextService;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class XtextModule extends AbstractModule {

	private static final String CORE_FILENAME_EXTENSION = "reqPat";

	private static final String CORE_LANGUAGE_URI = "de.fraunhofer.iem.reqpat.core.ReqPat";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IXtextService.class).to(XtextService.class).in(Singleton.class);

		bind(ISetup.class).to(ReqPatStandaloneSetupGenerated.class);
		bind(String.class).annotatedWith(
				Names.named(IXtextService.XTEXT_LANGUAGE_URI)).toInstance(
				CORE_LANGUAGE_URI);
		bind(String.class).annotatedWith(
				Names.named(IXtextService.XTEXT_FILE_EXTENSION)).toInstance(
				CORE_FILENAME_EXTENSION);

		bind(IXtextPlugin.class).to(XtextPluginProxy.class).in(Singleton.class);
	}

}
