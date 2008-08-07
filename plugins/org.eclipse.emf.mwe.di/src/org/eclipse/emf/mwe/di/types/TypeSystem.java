/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.types;

import org.eclipse.emf.mwe.File;

public interface TypeSystem {

	Type typeForName(String name, File file);

	boolean needsExternalClassLoader();

	void setExternalClassLoader(ClassLoader classLoader);
}
