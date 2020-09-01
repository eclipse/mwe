/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.core.resources;

import java.lang.reflect.InvocationTargetException;

/**
 * Factory for
 * {@link org.eclipse.emf.mwe.core.resources.ResourceLoader ResourceLoaders}.
 * By default this factory creates instances of
 * {@link org.eclipse.emf.mwe.core.resources.ResourceLoaderDefaultImpl ResourceLoaderDefaultImpl}.
 * <p>
 * The factory evaluates the <tt>org.eclipse.emf.mwe.core.resources.ResourceLoader</tt>
 * system property to get the <tt>ResourceLoader</tt> implementation class
 * name. Set this property to specify an alternative implementation.
 * 
 */
public class ResourceLoaderFactory {
    public final static String PARAM_RESOURCELOADER_CLASS = "org.eclipse.emf.mwe.core.resources.ResourceLoader";

    private static Class<?> resourceLoaderImpl;

    private static final ThreadLocal<ResourceLoader> current = new ThreadLocal<ResourceLoader>();

    public static void setCurrentThreadResourceLoader(final ResourceLoader rl) {
        current.set(rl);
    }
    
    public static ResourceLoader getCurrentThreadResourceLoader() {
		return current.get();
	}

    private static void initResourceLoaderClass() {
        final String name = System.getProperty(PARAM_RESOURCELOADER_CLASS, ResourceLoaderDefaultImpl.class.getName());
        // enable changing implementations at runtime.
        // preliminary implemented for the unittest of this class
        if ((resourceLoaderImpl == null) || ((name != null) && !name.equals(resourceLoaderImpl.getName()))) {
            try {
                resourceLoaderImpl = Class.forName(name);
            } catch (final ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Creates an instance of ResourceLoader.
     * 
     * @return The newly created object
     * @throws RuntimeException
     *             In any case that an instance could not be created.
     */
    public static ResourceLoader createResourceLoader() throws RuntimeException {
        if (current.get() != null) {
            return current.get();
        }
        initResourceLoaderClass();
        try {
            return (ResourceLoader) resourceLoaderImpl.getDeclaredConstructor().newInstance();
        } catch (final InstantiationException e) {
            throw new RuntimeException(e);
        } catch (final IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
