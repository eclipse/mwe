/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
public class CachingResourceLoaderImpl {
	private ResourceLoader delegate;
	
	public CachingResourceLoaderImpl(ResourceLoader delegate) {
		this.delegate = delegate;
	}
	
	public URL getResource(String uri) {
		return getResource.get(uri);
	}
	
	private WeakCache<String, URL> getResource = new WeakCache<String, URL>() {
		@Override
		protected URL createNew(String uri) {
			return delegate.getResource(uri);
		}
	};

	public InputStream getResourceAsStream(String uri) {
		try {
			return getResource(uri).openStream();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

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
