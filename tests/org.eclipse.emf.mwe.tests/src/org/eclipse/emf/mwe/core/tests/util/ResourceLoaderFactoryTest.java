/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.tests.util;

import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.internal.core.resources.ResourceLoaderDefaultImpl;

import junit.framework.TestCase;

/**
 * Unittest for class
 * {@link org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory}.
 * 
 */
public class ResourceLoaderFactoryTest extends TestCase {

    @Override
    protected void tearDown() throws Exception {
        System.setProperty(ResourceLoaderFactory.PARAM_RESOURCELOADER_CLASS, ResourceLoaderDefaultImpl.class.getName());
    }

    /**
     * Tested method: {@link ResourceLoaderFactory#createResourceLoader()}.
     * <p>
     * Tests the default behaviour of the factory method.
     */
    public void test_createResourceLoader_default() throws Exception {
        final ResourceLoader loader = ResourceLoaderFactory.createResourceLoader();
        assertNotNull("createResourceLoader must not return null", loader);
        assertTrue("Expected implementation: ResourceLoaderDefaultImpl", loader instanceof ResourceLoaderDefaultImpl);
    }

    /**
     * Tested method: {@link ResourceLoaderFactory#createResourceLoader()}.
     * <p>
     * Tests that the factory evaluates the system property to create
     * alternative <tt>ResourceLoader</tt> implementations.
     */
    public void test_createResourceLoader_alternative() throws Exception {
        System.setProperty(ResourceLoaderFactory.PARAM_RESOURCELOADER_CLASS, DummyResourceLoader.class.getName());
        final ResourceLoader loader = ResourceLoaderFactory.createResourceLoader();
        ResourceLoaderFactory.class.getClassLoader().loadClass(ResourceLoaderFactory.class.getName());
        assertNotNull("createResourceLoader must not return null", loader);
        assertTrue("Expected implementation: DummyResourceLoader", loader instanceof DummyResourceLoader);
    }

    /**
     * Tested method: {@link ResourceLoaderFactory#createResourceLoader()}.
     * <p>
     * Tests that the factory fails when an invalid classname was configured.
     */
    public void test_createResourceLoader_negative() throws Exception {
        System.setProperty(ResourceLoaderFactory.PARAM_RESOURCELOADER_CLASS, "***INVALID***");
        try {
            ResourceLoaderFactory.createResourceLoader();
            fail("Exception expected because an invalid classname was specified as system property "
                    + ResourceLoaderFactory.PARAM_RESOURCELOADER_CLASS);
        } catch (final RuntimeException e) {
            ; // OK
        }
    }
}
