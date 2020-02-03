/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.core.resources;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sven Efftinge - Initial contribution and API
 * 
 */
public class CachingResourceLoaderTest extends Assert {
	@Test public void testLoadResource() throws Exception {
		DelegatingResourceLoader delegatingResourceLoader = new DelegatingResourceLoader(
				new ResourceLoaderImpl(getClass().getClassLoader()));
		CachingResourceLoaderImpl loader = new CachingResourceLoaderImpl(delegatingResourceLoader);
		String uri = getClass().getCanonicalName().replace('.', '/') + ".txt";
		URL resource = loader.getResource(uri);
		InputStream stream1 = loader.getResourceAsStream(uri);
		InputStream stream2 = loader.getResourceAsStream(uri);
		InputStream stream3 = resource.openStream();
		String text1 = new BufferedReader(new InputStreamReader(stream1)).readLine().trim();
		String text2 = new BufferedReader(new InputStreamReader(stream2)).readLine().trim();
		String text3 = new BufferedReader(new InputStreamReader(stream3)).readLine().trim();
		assertEquals("Foo", text1);
		assertEquals("Foo", text2);
		assertEquals("Foo", text3);

		assertEquals(0, delegatingResourceLoader.getResourceAsStream);
		assertEquals(1, delegatingResourceLoader.getResource);
		loader.getResource(uri);
		assertEquals(1, delegatingResourceLoader.getResource);
	}

	private static class DelegatingResourceLoader implements ResourceLoader {
		private ResourceLoader delegate;
		public int getResource = 0;
		public int getResourceAsStream = 0;
		public int loadClass = 0;

		public DelegatingResourceLoader(ResourceLoader delegate) {
			super();
			this.delegate = delegate;
		}

		@Override
		public URL getResource(String uri) {
			getResource++;
			return delegate.getResource(uri);
		}

		@Override
		public InputStream getResourceAsStream(String uri) {
			getResourceAsStream++;
			return delegate.getResourceAsStream(uri);
		}

		@Override
		public Class<?> loadClass(String clazzName) {
			loadClass++;
			return delegate.loadClass(clazzName);
		}

	}
	@Test public void testLoadClass() throws Exception {
		DelegatingResourceLoader delegatingResourceLoader = new DelegatingResourceLoader(
				new ResourceLoaderImpl(getClass().getClassLoader()));
		CachingResourceLoaderImpl loader = new CachingResourceLoaderImpl(delegatingResourceLoader);
		for (int i = 0; i < 10; i++) {
			Class<?> class1 = loader.loadClass(getClass().getCanonicalName());
			assertEquals(getClass(), class1);
			assertEquals(1, delegatingResourceLoader.loadClass);
		}
	}
}
