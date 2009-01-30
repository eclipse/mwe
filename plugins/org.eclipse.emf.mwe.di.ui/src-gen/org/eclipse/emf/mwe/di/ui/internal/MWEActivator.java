package org.eclipse.emf.mwe.di.ui.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class MWEActivator extends AbstractUIPlugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		org.eclipse.emf.mwe.di.MWEUiSetup.doSetup();
	}
	
}
 