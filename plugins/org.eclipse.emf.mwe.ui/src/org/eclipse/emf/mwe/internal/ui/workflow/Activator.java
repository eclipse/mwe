package org.eclipse.emf.mwe.internal.ui.workflow;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.emf.mwe.ui";

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static void logError(final Exception e) {
		logError(e.getMessage(), e);
	}

	public static void logError(final String msg, final Exception e) {
		logError(createErrorStatus(msg, e));
	}

	public static void logError(final IStatus status) {
		getDefault().getLog().log(status);
	}
	
	public static IStatus createErrorStatus(final String msg, final Exception e) {
		return new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, msg, e);
	}
	
	public static void showError(final String msg) {
		showError(createErrorStatus(msg, null));
	}
	
	public static void showError(final IStatus status) {
			try {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						ErrorDialog.openError(null, null, null, status);
					}
				});
			} catch (Exception e) {
				// e.g. NullPointerException if no active window
			}
	}

}