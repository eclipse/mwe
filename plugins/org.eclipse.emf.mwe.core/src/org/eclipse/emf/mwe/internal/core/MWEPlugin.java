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
package org.eclipse.emf.mwe.internal.core;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;

public class MWEPlugin extends EMFPlugin {
	/**
	 * The singleton instance of the plugin.
	 */
	public static final MWEPlugin INSTANCE = new MWEPlugin();

	public static final String ID = "org.eclipse.emf.mwe.core";

	/**
	 * The one instance of this class.
	 */
	private static Implementation plugin;

	/**
	 * Creates the singleton instance.
	 */
	private MWEPlugin() {
		super(new ResourceLocator[] {});
	}

	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * 
	 * @return the singleton instance.
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * Use the platform, if available, to convert to a local URI.
	 */
	public static URI asLocalURI(final URI uri) {
		return plugin == null ? uri : Implementation.asLocalURI(uri);
	}

	/**
	 * Use the platform, if available, to resolve the URI.
	 */
	public static URI resolve(final URI uri) {
		return plugin == null ? uri : Implementation.resolve(uri);
	}

	/**
	 * Use the platform, if available, to load the named class using the right
	 * class loader.
	 */
	public static Class<?> loadClass(final String pluginID, final String className) throws ClassNotFoundException {
		return plugin == null ? Class.forName(className) : Implementation.loadClass(pluginID, className);
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}

		/**
		 * Use the platform to convert to a local URI.
		 */
		protected static URI asLocalURI(final URI uri) {
			try {
				final String fragment = uri.fragment();
				final URL url = FileLocator.toFileURL(new URL(uri.trimFragment().toString()));
				return fix(url, fragment);
			}
			catch (final IOException exception) {
				// Ignore the exception and return the original URI.
			}
			return uri;
		}

		/**
		 * Use the platform to convert to a local URI.
		 */
		protected static URI resolve(final URI uri) {
			final String fragment = uri.fragment();
			final URI uriWithoutFragment = uri.trimFragment();
			String uriWithoutFragmentToString = uriWithoutFragment.toString();

			URL url = null;
			try {
				url = FileLocator.resolve(new URL(uriWithoutFragmentToString));
			}
			catch (final IOException exception1) {
				// Platform.resolve() doesn't work if the project is encoded.
				//
				try {
					uriWithoutFragmentToString = URI.decode(uriWithoutFragmentToString);
					url = FileLocator.resolve(new URL(uriWithoutFragmentToString));
				}
				catch (final IOException exception2) {
					// Continue with the unresolved URI.
				}
			}
			if (url != null)
				return fix(url, fragment);

			return uri;
		}

		protected static URI fix(final URL url, final String fragment) {
			// Only file-scheme URIs will be re-encoded. If a URI was decoded in
			// the workaround
			// above, and Platform.resolve() didn't return a file-scheme URI,
			// then this will return
			// an decoded URI.
			//
			URI result = "file".equalsIgnoreCase(url.getProtocol()) ? URI.createFileURI(URI.decode(url.getFile()))
					: URI.createURI(url.toString());
			if (fragment != null) {
				result = result.appendFragment(fragment);
			}
			return result;
		}

		/**
		 * Use the platform to load the named class using the right class
		 * loader.
		 */
		public static Class<?> loadClass(final String pluginID, final String className) throws ClassNotFoundException {
			return Platform.getBundle(pluginID).loadClass(className);
		}
	}
}