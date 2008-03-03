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

package org.eclipse.emf.mwe.ui.internal.editor.images;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.mwe.ui.internal.editor.Activator;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public final class EditorImages {

    public static final String PROPERTY = "property.gif";

    public static final String ASSIGNMENT = "assignment.gif";

    public static final String WORKFLOW = "workflow.gif";

    /**
     * The image registry containing <code>Image</code>s and
     * <code>ImageDescriptor</code>s.
     */
    private static ImageRegistry imageRegistry;

    /**
     * The URL path to the icon folder.
     */
    private static URL iconBaseURL;

    static {
        final String pathSuffix = "icons/"; //$NON-NLS-1$
        EditorImages.iconBaseURL =
                Activator.getDefault().getBundle().getEntry(pathSuffix);
        initializeImageRegistry();
    }

    /**
     * Hidden because of utility class.
     */
    private EditorImages() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the <code>Image</code> identified by the given key, or
     * <code>null</code> if it does not exist.
     */
    public static Image getImage(final String key) {
        return getImageRegistry().get(key);
    }

    /**
     * Returns the <code>ImageDescriptor</code> identified by the given key,
     * or <code>null</code> if it does not exist.
     */
    public static ImageDescriptor getImageDescriptor(final String key) {
        return getImageRegistry().getDescriptor(key);
    }

    /**
     * Returns the ImageRegistry.
     */
    public static ImageRegistry getImageRegistry() {
        if (EditorImages.imageRegistry == null) {
            initializeImageRegistry();
        }
        return EditorImages.imageRegistry;
    }

    /**
     * Initialize the image registry by declaring all of the required graphics.
     * This involves creating JFace image descriptors describing how to
     * create/find the image should it be needed. The image is not actually
     * allocated until requested.
     * 
     * Prefix conventions Wizard Banners WIZBAN_ Preference Banners PREF_BAN_
     * Property Page Banners PROPBAN_ Color toolbar CTOOL_ Enable toolbar ETOOL_
     * Disable toolbar DTOOL_ Local enabled toolbar ELCL_ Local Disable toolbar
     * DLCL_ Object large OBJL_ Object small OBJS_ View VIEW_ Product images
     * PROD_ Misc images MISC_
     * 
     * Where are the images? The images (typically gifs) are found in the same
     * location as this plugin class. This may mean the same package directory
     * as the package holding this class. The images are declared using
     * this.getClass() to ensure they are looked up via this plugin class.
     * 
     * @see org.eclipse.jface.resource.ImageRegistry
     */
    public static ImageRegistry initializeImageRegistry() {
        EditorImages.imageRegistry =
                new ImageRegistry(Activator.getStandardDisplay());
        declareImages();
        return EditorImages.imageRegistry;
    }

    /**
     * Declare all images
     */
    private static void declareImages() {
        final Field[] fs = EditorImages.class.getFields();
        for (final Field f : fs) {
            if (f.getType().equals(String.class)
                    && Modifier.isFinal(f.getModifiers())
                    && Modifier.isStatic(f.getModifiers())
                    && Modifier.isPublic(f.getModifiers())) {
                try {
                    declareRegistryImage((String) f.get(null), (String) f
                            .get(null));
                } catch (final IllegalArgumentException e) {
                } catch (final IllegalAccessException e) {
                }
            }
        }
    }

    /**
     * Declare an Image in the registry table.
     * 
     * @param key
     *            The key to use when registering the image
     * @param path
     *            The path where the image can be found. This path is relative
     *            to where this plugin class is found (i.e. typically the
     *            packages directory)
     */
    private static void declareRegistryImage(final String key,
            final String path) {
        ImageDescriptor desc = ImageDescriptor.getMissingImageDescriptor();
        try {
            desc = ImageDescriptor.createFromURL(makeIconFileURL(path));
        } catch (final MalformedURLException me) {
            Log.logError(me);
        }
        EditorImages.imageRegistry.put(key, desc);
    }

    private static URL makeIconFileURL(final String iconPath)
            throws MalformedURLException {
        if (EditorImages.iconBaseURL == null)
            throw new MalformedURLException();

        return new URL(EditorImages.iconBaseURL, iconPath);
    }

}
