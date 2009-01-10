/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.core.resources;

import java.net.URL;

public class ResourceLoaderImpl extends ResourceLoaderDefaultImpl {

	private final ClassLoader loader;

	public ResourceLoaderImpl(final ClassLoader l) {
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
