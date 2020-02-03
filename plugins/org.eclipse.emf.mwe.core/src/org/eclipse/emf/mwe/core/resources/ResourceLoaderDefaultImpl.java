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

package org.eclipse.emf.mwe.core.resources;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.mwe.internal.core.MWEPlugin;

public class ResourceLoaderDefaultImpl extends AbstractResourceLoader {

	@Override
	public final InputStream getResourceAsStream(String path) {
		return super.getResourceAsStream(path);
	}
	
	@Override
	public final Class<?> loadClass(final String clazzName) {
		return super.loadClass(clazzName);
	}
	
	@Override
	public final URL getResource(String path) {
		return super.getResource(path);
	}
	
	@Override
	protected Class<?> tryLoadClass(final String clazzName) throws ClassNotFoundException {
		return MWEPlugin.loadClass(MWEPlugin.ID, clazzName);
	}

}
