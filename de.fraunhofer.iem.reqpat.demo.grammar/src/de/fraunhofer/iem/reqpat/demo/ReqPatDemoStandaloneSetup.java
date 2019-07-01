package de.fraunhofer.iem.reqpat.demo;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class ReqPatDemoStandaloneSetup extends
		ReqPatDemoStandaloneSetupGenerated {

	public static void doSetup() {
		new ReqPatDemoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
