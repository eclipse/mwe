/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.execution;

import java.util.Map;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.execution.internal.InternalInstantiator;
import org.eclipse.emf.mwe.di.types.CompositeTypeSystem;
import org.eclipse.emf.mwe.di.types.TypeSystem;
import org.eclipse.emf.mwe.di.types.emf.EMFTypeSystem;
import org.eclipse.emf.mwe.di.types.java.JavaTypeSystem;

public class Instantiator {

	public Object instantiate(final File file) {
		return instantiate(file, null, new CompositeTypeSystem(new EMFTypeSystem(), new JavaTypeSystem()));
	}

	public Object instantiate(final File file, final Map<String, Object> params, final TypeSystem typeSystem) {
		return new InternalInstantiator(typeSystem, file, params).instantiate();
	}

}
