package org.eclipse.emf.mwe.di.ui.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MWEActivator extends AbstractUIPlugin {

	private Injector injector;
	private static MWEActivator INSTANCE;

	public Injector getInjector() {
		return injector;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		this.injector = Guice.createInjector(new org.eclipse.emf.mwe.di.MWERuntimeModule(), new org.eclipse.emf.mwe.di.MWEUIModule());
	}
	
	public static MWEActivator getInstance() {
		return INSTANCE;
	}
	
}
 