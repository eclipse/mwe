/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
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

import java.net.URL;

public class ResourceLoaderImpl extends ResourceLoaderDefaultImpl {

	private final ClassLoader loader;

	public ResourceLoaderImpl(final ClassLoader l ) {
		loader = l;
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
