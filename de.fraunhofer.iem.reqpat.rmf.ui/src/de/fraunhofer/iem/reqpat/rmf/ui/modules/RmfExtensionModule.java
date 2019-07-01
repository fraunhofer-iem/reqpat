package de.fraunhofer.iem.reqpat.rmf.ui.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IAttributeRegistry;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry;
import de.fraunhofer.iem.reqpat.rmf.ui.services.AttributeRegistry;
import de.fraunhofer.iem.reqpat.rmf.ui.services.ReqIfService;
import de.fraunhofer.iem.reqpat.rmf.ui.services.SpecTypeRegistry;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class RmfExtensionModule extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IReqIfService.class).to(ReqIfService.class).in(Singleton.class);
		bind(IAttributeRegistry.class).to(AttributeRegistry.class).in(
				Singleton.class);
		bind(ISpecTypeRegistry.class).to(SpecTypeRegistry.class).in(
				Singleton.class);

		bind(String.class).annotatedWith(
				Names.named(IReqIfService.MARKER_ORIGIN_INJECT)).toInstance(
				"Origin");
	}

}
