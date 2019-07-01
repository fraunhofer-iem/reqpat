package de.fraunhofer.iem.reqpat.core;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import de.fraunhofer.iem.reqpat.core.interfaces.IMainService;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 24 $, $Date: 2013-07-10 14:26:29 +0200 (Mi, 10 Jul 2013) $
 */
public class Activator implements BundleActivator {
	private static BundleContext context;

	private static Injector injector;

	static BundleContext getContext() {
		return context;
	}

	public static Injector getInjector() {
		return injector;
	}

	private List<Module> loadModules() {
		List<Module> modules = new ArrayList<Module>();

		IConfigurationElement[] configurationElements = Platform
				.getExtensionRegistry().getConfigurationElementsFor(
						"de.fraunhofer.iem.reqpat.core.modules");

		Module coreModule = null;
		Module extensionModule = null;

		for (IConfigurationElement configurationElement : configurationElements) {
			try {
				Object o = configurationElement
						.createExecutableExtension("class");

				if (o instanceof Module) {
					Module module = (Module) o;

					String type = configurationElement.getAttribute("type");
					if (type != null) {
						if (type.equals("Core")) {
							if (coreModule != null)
								throw new RuntimeException(
										"Only one core module may be defined!");

							coreModule = module;
						} else if (type.equals("Extension")) {
							if (extensionModule != null)
								throw new RuntimeException(
										"Only one extension module may be defined!");

							extensionModule = module;
						}
					}

					modules.add(module);
				}
			} catch (CoreException e) {
				System.out.println(MessageFormat.format(
						"Unable to load module ''{0}'': {1}",
						configurationElement.getName(), e.getMessage()));
			}
		}

		/*
		 * If both a core and an extension module are defined, overwrite the
		 * core with the extension module.
		 */
		if (coreModule != null && extensionModule != null) {
			modules.remove(coreModule);
			modules.remove(extensionModule);

			modules.add(Modules.override(coreModule).with(extensionModule));
		}

		return modules;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		injector = Guice.createInjector(Modules.combine(loadModules()));

		// start the main application
		injector.getInstance(IMainService.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}