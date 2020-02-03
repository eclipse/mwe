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

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.mwe.internal.core.util.WeakCache;

/**
 * @author Sven Efftinge - Initial contribution and API
 *
 */
public class CachingResourceLoaderImpl implements ResourceLoader {
	private ResourceLoader delegate;
	
	public CachingResourceLoaderImpl(ResourceLoader delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public URL getResource(String uri) {
		return getResource.get(uri);
	}
	
	private WeakCache<String, URL> getResource = new WeakCache<String, URL>() {
		@Override
		protected URL createNew(String uri) {
			return delegate.getResource(uri);
		}
	};

	@Override
	public final InputStream getResourceAsStream(String uri) {
		URL resource = getResource(uri);
		if (resource != null) {
			try {
				return resource.openStream();
			} catch (IOException ignore) {
			}
		}
		return null;
	}

	@Override
	public Class<?> loadClass(String clazzName) {
		return loadClass.get(clazzName);
	}
	
	private WeakCache<String, Class<?>> loadClass = new WeakCache<String, Class<?>>() {
		@Override
		protected Class<?> createNew(String clazzName) {
			return delegate.loadClass(clazzName);
		}
	};
	
}
