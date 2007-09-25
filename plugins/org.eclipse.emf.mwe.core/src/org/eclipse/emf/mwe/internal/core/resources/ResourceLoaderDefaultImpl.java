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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;

public class ResourceLoaderDefaultImpl implements ResourceLoader {

	private static final String FILE_PREFIX = "file:";

	private static final Log log = LogFactory
			.getLog(ResourceLoaderDefaultImpl.class);

	public final InputStream getResourceAsStream(String path) {
		InputStream in = internalGetResourceAsStream(path);
		if (in == null) {
			try {
				in = new FileInputStream(path);
			} catch (final FileNotFoundException e) {
				if (!path.startsWith(FILE_PREFIX)) {
					path = FILE_PREFIX + path;
				}
				try {
					in = new FileInputStream(path);
				} catch (final Exception ex) {
					return null;
				}
			}
		}
		return in;
	}

	protected InputStream internalGetResourceAsStream(final String path) {
		return Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(path);
	}

	public final Class<?> loadClass(final String clazzName) {
		try {
			return internalLoadClass(clazzName);
		} catch (final Exception e) {
			if (clazzName.startsWith("mwe"))
				return loadClass(clazzName.replaceFirst("mwe",
						"org.eclipse.emf.mwe"));
			return null;
		}
	}

	protected Class<?> internalLoadClass(final String clazzName)
			throws ClassNotFoundException {
		return Class.forName(clazzName, true, Thread.currentThread()
				.getContextClassLoader());
	}

	public final URL getResource(String path) {
		URL url = internalGetResource(path);
		if (url == null) {
			try {
				if (!path.startsWith(FILE_PREFIX)) {
					path = FILE_PREFIX + path;
				}
				url = new URL(path);
				if (url.getContent() == null)
					return null;
			} catch (final MalformedURLException e) {
				return null;
			} catch (final IOException e) {
				return null;
			}
		}
		return url;
	}

	protected URL internalGetResource(final String path) {
		return Thread.currentThread().getContextClassLoader().getResource(path);
	}

	public Enumeration<URL> getResources(String uri) {
		try {
			return Thread.currentThread().getContextClassLoader().getResources(
					uri);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			return new Enumeration<URL>() {
				public boolean hasMoreElements() {
					return false;
				}

				public URL nextElement() {
					return null;
				}
			};
		}
	}

}
