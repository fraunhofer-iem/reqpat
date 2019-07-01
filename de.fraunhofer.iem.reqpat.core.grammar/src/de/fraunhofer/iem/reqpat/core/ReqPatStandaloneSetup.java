
package de.fraunhofer.iem.reqpat.core;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ReqPatStandaloneSetup extends ReqPatStandaloneSetupGenerated{

	public static void doSetup() {
		new ReqPatStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

