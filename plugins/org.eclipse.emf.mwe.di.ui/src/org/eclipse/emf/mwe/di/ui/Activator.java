package org.eclipse.emf.mwe.di.ui;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.di.ui.analyze.Analyzer;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	public Activator() {
	}
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		EValidator.Registry.INSTANCE.put(MwePackage.eINSTANCE, new Analyzer());
	}
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		EValidator.Registry.INSTANCE.remove(MwePackage.eINSTANCE);
	}
}
