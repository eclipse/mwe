/*******************************************************************************
 * Copyright (c) 2007, 2015 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.util;

import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderDefaultImpl;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unittest for class {@link org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory}.
 * 
 */
public class ResourceLoaderFactoryTest extends Assert {

	@After
	public void tearDown() throws Exception {
		System.setProperty(ResourceLoaderFactory.PARAM_RESOURCELOADER_CLASS, ResourceLoaderDefaultImpl.class.getName());
	}

	/**
	 * Tested method: {@link ResourceLoaderFactory#createResourceLoader()}.
	 * <p>
	 * Tests the default behaviour of the factory method.
	 */
	@Test public void test_createResourceLoader_default() throws Exception {
		final ResourceLoader loader = ResourceLoaderFactory.createResourceLoader();
		assertNotNull("createResourceLoader must not return null", loader);
		assertTrue("Expected implementation: ResourceLoaderDefaultImpl", loader instanceof ResourceLoaderDefaultImpl);
	}

	/**
	 * Tested method: {@link ResourceLoaderFactory#createResourceLoader()}.
	 * <p>
	 * Tests that the factory evaluates the system property to create alternative <tt>ResourceLoader</tt>
	 * implementations.
	 */
	@Test public void test_createResourceLoader_alternative() throws Exception {
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
	@Test public void test_createResourceLoader_negative() throws Exception {
		System.setProperty(ResourceLoaderFactory.PARAM_RESOURCELOADER_CLASS, "***INVALID***");
		try {
			ResourceLoaderFactory.createResourceLoader();
			fail("Exception expected because an invalid classname was specified as system property "
					+ ResourceLoaderFactory.PARAM_RESOURCELOADER_CLASS);
		}
		catch (final RuntimeException e) {
			// OK
		}
	}
}
