package org.eclipse.emf.mwe.di.ui;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.di.ui.analyze.Analyzer;
import org.eclipse.emf.mwe.di.ui.extensibility.StaticTypeSystemRegistry;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	private static final String TYPE_SYSTEM_EXTENSION_POINT = "typeSystem";

	private static Activator plugin;

	public static Activator getDefault() {
		return plugin;
	}

	public static void setDefault(final Activator plugin) {
		Activator.plugin = plugin;
	}

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		setDefault(this);
		initializeTypeSystemHistory();
		EValidator.Registry.INSTANCE.put(MwePackage.eINSTANCE, new Analyzer());
	}

	private void initializeTypeSystemHistory() {
		final IExtensionRegistry epr = Platform.getExtensionRegistry();
		final IExtensionPoint ep = epr.getExtensionPoint(Activator.getDefault().getBundle().getSymbolicName(),
				TYPE_SYSTEM_EXTENSION_POINT);
		Assert.isNotNull(ep, "The extension point '" + TYPE_SYSTEM_EXTENSION_POINT + "is not defined!");

		final IConfigurationElement[] configurationElements = ep.getConfigurationElements();
		final StaticTypeSystemRegistry registry = StaticTypeSystemRegistry.getInstance();
		for (final IConfigurationElement cfg : configurationElements) {
			registry.addTypeSystemConfiguration(cfg);
		}
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		super.stop(context);
		setDefault(null);
		EValidator.Registry.INSTANCE.remove(MwePackage.eINSTANCE);
	}
}
