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

package org.eclipse.emf.mwe.core;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;

/**
 * Helper class that provides some utility methods for workflow components. 
 */
public class WorkflowComponentHelper {

	/**
	 * Proves if the filename points to a existent file (not directory!).
	 * 
	 * @param filename
	 *            Path to a file
	 * @return <tt>true</tt> if the path points to a file, <tt>false</tt> if
	 *         the file does not exist or is a directory.
	 */
	public static boolean isLegalFile(final String filename) {
		final File f = new File(filename);
		if (!f.exists()) {
			return false;
		}
		if (f.isDirectory()) {
			return false;
		}
		return true;
	}

	/**
	 * Proves if the argument points to a existent directory (not file!).
	 * 
	 * @param dirname
	 *            Path to a directory
	 * @return <tt>true</tt> if the path points to a directory, <tt>false</tt>
	 *         if the directory does not exist or is a file.
	 */
	public static boolean isLegalDir(final String dirname) {
		final File f = new File(dirname);
		if (!f.exists()) {
			return false;
		}
		if (f.isFile()) {
			return false;
		}
		return true;
	}

	/**
	 * Proves if the given string is a valid URL. This method tries to open the
	 * URL to check its validity.
	 * 
	 * @param url
	 *            An URL as String
	 * @return <tt>true</tt> if the string is a valid URL, otherwise
	 *         <tt>false</tt>.
	 */
	public static boolean isLegalURL(final String url) {
		if ((url == null) || (url.trim().length() == 0)) {
			return false;
		}

		try {
			final URL u = new URL(url);
			u.openConnection();
			return true;
		} catch (final MalformedURLException e) {
			return false;
		} catch (final IOException e) {
			return false;
		}
	}

	/**
	 * Proves if the given name is a valid resource. This method tries to open a
	 * URL connection to the resource. The resource is located via the Thread
	 * Context ClassLoader.
	 * 
	 * @param uri
	 *            A resource identifier
	 * @return <tt>true</tt> if the given URI points to a valid resource,
	 *         otherwise <tt>false</tt>.
	 */
	public static boolean isResource(final String uri) {
		try {
			final URL u = ResourceLoaderFactory.createResourceLoader().getResource(uri);
			if (u == null) {
				return false;
			}
			u.openConnection();
			return true;
		} catch (final MalformedURLException e) {
			return false;
		} catch (final IOException e) {
			return false;
		}
	}

	/**
	 * Proves if the given name is a valid resource. This method tries to open a
	 * URL connection to the resource. The resource is located as a class
	 * resource.
	 * 
	 * @param uri
	 *            A resource identifier
	 * @param contextClassName
	 *            The class whose resource is tested
	 * @return <tt>true</tt> if the given URI points to a valid resource,
	 *         otherwise <tt>false</tt>.
	 */
	public static boolean isResource(final String uri,
			final String contextClassName) {
		if (!isLoadableClass(contextClassName)) {
			return false;
		}
		try {
			final Class<?> context = Class.forName(contextClassName);
			final URL u = context.getResource(uri);
			if (u == null) {
				return false;
			}
			u.openConnection();
			return true;
		} catch (final Exception e) {
			return false;
		}
	}

	/**
	 * Convenience method that proves if a parameter is set.
	 * 
	 * @param param
	 *            The parameter
	 * @return <tt>true</tt> if the given parameter string is not null.
	 */
	public static boolean isParamSet(final String param) {
		return param != null;
	}

	/**
	 * Proves that a class could be loaded.
	 * 
	 * @param classname
	 *            The classname to check
	 * @return <code>true</code> if the class was successfully loaded
	 */
	public static boolean isLoadableClass(final String classname) {
		try {
			Class.forName(classname);
			return true;
		} catch (final Exception exc) {
			return false;
		}
	}
}
