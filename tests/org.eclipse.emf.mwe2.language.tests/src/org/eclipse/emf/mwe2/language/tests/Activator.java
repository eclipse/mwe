package org.eclipse.emf.mwe2.language.tests;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		JavaProjectForTestProvider.setUp();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		JavaProjectForTestProvider.tearDown();
		super.stop(context);
	}
}
