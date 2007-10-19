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
package org.eclipse.emf.mwe.internal.core.resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.internal.core.MWEPlugin;

public class ResourceLoaderDefaultImpl implements ResourceLoader {

	private static final String FILE_PREFIX = "file:";

	public final InputStream getResourceAsStream(String path) {
		URL resource = getResource(path);
		if (resource != null) {
			try {
				return resource.openStream();
			} catch (IOException ignore) {
			}
		}
		return null;
	}

	public final Class<?> loadClass(final String clazzName) {
		try {
			return MWEPlugin.loadClass(MWEPlugin.ID, clazzName);
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

	protected Class<?> internalLoadClass(final String clazzName)
			throws ClassNotFoundException {
		return Class.forName(clazzName, true, Thread.currentThread()
				.getContextClassLoader());
	}

	public final URL getResource(String path) {
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
			if (!path.startsWith(FILE_PREFIX)) {
				path = FILE_PREFIX + path;
			}
			URL url = new URL(path);
			if (url.getContent() != null) {
				return url;
			}
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
