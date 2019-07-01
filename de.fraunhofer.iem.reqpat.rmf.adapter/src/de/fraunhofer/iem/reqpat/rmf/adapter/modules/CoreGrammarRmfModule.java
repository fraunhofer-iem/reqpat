package de.fraunhofer.iem.reqpat.rmf.adapter.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import de.fraunhofer.iem.reqpat.core.interfaces.IMainService;
import de.fraunhofer.iem.reqpat.rmf.adapter.services.PatternService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class CoreGrammarRmfModule extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IPatternService.class).to(PatternService.class)
				.in(Singleton.class);
		bind(IMainService.class).to(PatternService.class).in(Singleton.class);
	}

}
