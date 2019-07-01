package de.fraunhofer.iem.reqpat.demo.ui.modules;

import org.eclipse.xtext.ISetup;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import de.fraunhofer.iem.reqpat.core.interfaces.IModelGenerator;
import de.fraunhofer.iem.reqpat.core.interfaces.IXtextPlugin;
import de.fraunhofer.iem.reqpat.core.interfaces.IXtextService;
import de.fraunhofer.iem.reqpat.demo.ReqPatDemoStandaloneSetupGenerated;
import de.fraunhofer.iem.reqpat.demo.ui.services.DemoModelGenerator;
import de.fraunhofer.iem.reqpat.demo.ui.services.XtextPluginProxy;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 87 $, $Date: 2013-10-15 13:54:29 +0200 (Di, 15 Okt 2013) $
 */
public class XtextModule extends AbstractModule {

	private static final String DEMO_FILENAME_EXTENSION = "reqpatDemo";
	private static final String DEMO_LANGUAGE_URI = "de.fraunhofer.iem.reqpat.demo.ReqPatDemo";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(ISetup.class).to(ReqPatDemoStandaloneSetupGenerated.class);
		bind(String.class).annotatedWith(
				Names.named(IXtextService.XTEXT_LANGUAGE_URI)).toInstance(
				DEMO_LANGUAGE_URI);
		bind(String.class).annotatedWith(
				Names.named(IXtextService.XTEXT_FILE_EXTENSION)).toInstance(
				DEMO_FILENAME_EXTENSION);

		bind(IXtextPlugin.class).to(XtextPluginProxy.class).in(Singleton.class);
		bind(IModelGenerator.class).to(DemoModelGenerator.class).in(
				Singleton.class);
	}

}
