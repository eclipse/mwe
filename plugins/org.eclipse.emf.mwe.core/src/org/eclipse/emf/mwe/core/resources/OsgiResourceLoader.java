/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.core.resources;

import java.net.URL;

import org.eclipse.core.runtime.Platform;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class OsgiResourceLoader extends AbstractResourceLoader {

	private final ClassLoader loader;
	private final String bundleName;

	public OsgiResourceLoader(String bundleName, final ClassLoader loader) {
		this.bundleName = bundleName;
		this.loader = loader;
	}	
	
	@Override
	protected Class<?> tryLoadClass(final String clazzName) throws ClassNotFoundException {
		return Platform.getBundle(bundleName).loadClass(clazzName);
	}
	
	@Override
    protected URL loadFromContextClassLoader(final String path) {
		return loader.getResource(path);
	}
	
	@Override
    protected Class<?> internalLoadClass(final String clazzName) throws ClassNotFoundException {
		return loader.loadClass(clazzName);
	}
}
