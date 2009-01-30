package org.eclipse.emf.mwe.di.ui;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.di.ui.analyze.Analyzer;
import org.eclipse.emf.mwe.di.ui.internal.MWEActivator;
import org.osgi.framework.BundleContext;

public class Activator extends MWEActivator {

	private static Activator plugin;

	public static Activator getDefault() {
		return plugin;
	}

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		EValidator.Registry.INSTANCE.put(MwePackage.eINSTANCE, new Analyzer());
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
		EValidator.Registry.INSTANCE.remove(MwePackage.eINSTANCE);
	}
}
