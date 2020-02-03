/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.core.resources;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.mwe.internal.core.MWEPlugin;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractResourceLoader implements ResourceLoader {

	protected abstract Class<?> tryLoadClass(final String clazzName) throws ClassNotFoundException;

	@Override
	public InputStream getResourceAsStream(String path) {
		URL resource = getResource(path);
		if (resource != null) {
			try {
				return resource.openStream();
			} catch (IOException ignore) {
			}
		}
		return null;
	}

	@Override
	public Class<?> loadClass(final String clazzName) {
		try {
			return tryLoadClass(clazzName);
		} catch (Exception e1) {
			try {
				return internalLoadClass(clazzName);
			} catch (final Exception e2) {
				if (clazzName.startsWith("mwe")) {
					return loadClass(clazzName.replaceFirst("mwe",
							"org.eclipse.emf.mwe"));
				}
			}
		}
		return null;
	}

	protected Class<?> internalLoadClass(final String clazzName) throws ClassNotFoundException {
		return Class.forName(clazzName, true, Thread.currentThread()
				.getContextClassLoader());
	}

	@Override
	public URL getResource(String path) {
		URL url = loadDirectly(path);
		if (url == null) {
			url = loadFromBaseURL(path);
		}
		if (url == null) {
			url = loadFromContextClassLoader(path);
		}
		if (url == null) {
			url = loadFromFile(path);
		}
		return url;
	}

	private URL loadFromFile(String path) {
		try {
			File f = new File(path);
			if (f.exists())
				return f.toURI().toURL();
		} catch (final Exception e) {
		}
		return null;
	}

	private URL loadFromBaseURL(String path) {
		try {
			URL url = new URL(MWEPlugin.INSTANCE.getBaseURL() + path);
			if (url.getContent() != null) {
				return url;
			}
		} catch (Exception ignore) {
		}
		return null;
	}

	private URL loadDirectly(String path) {
		try {
			URL url = new URL(path);
			if (url.getContent() != null) {
				return url;
			}
		} catch (Exception ignore) {
		}
		return null;
	}

	protected URL loadFromContextClassLoader(final String path) {
		return Thread.currentThread().getContextClassLoader().getResource(path);
	}

}
