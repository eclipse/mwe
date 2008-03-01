package org.eclipse.emf.mwe.ui.internal.editor;

/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
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

    public static IStatus createErrorStatus(final String msg, final Exception e) {
        return new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, msg, e);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    public static String getId() {
        return getDefault().getBundle().getSymbolicName();
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in
     * relative path.
     * 
     * @param path
     *            the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(final String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(getId(), path);
    }

    /**
     * Returns the standard display to be used. The method first checks, if the
     * thread calling this method has an associated display. If so, this display
     * is returned. Otherwise the method returns the default display.
     */
    public static Display getStandardDisplay() {
        Display display = Display.getCurrent();
        if (display == null) {
            display = Display.getDefault();
        }
        return display;
    }

    public static void logDebug(final String msg) {
        System.err.println(msg);
    }

    public static void logDebug(final Throwable throwable) {
        throwable.printStackTrace();
    }

    public static void logError(final Exception e) {
        logError(e.getMessage(), e);
    }

    public static void logError(final IStatus status) {
        getDefault().getLog().log(status);
    }

    public static void logError(final String msg, final Exception e) {
        logError(createErrorStatus(msg, e));
    }

    public static void showError(final IStatus status) {
        try {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    ErrorDialog.openError(null, null, null, status);
                }
            });
        } catch (final Exception e) {
            // e.g. NullPointerException if no active window
        }
    }

    public static void showError(final String msg) {
        showError(createErrorStatus(msg, null));
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
}
