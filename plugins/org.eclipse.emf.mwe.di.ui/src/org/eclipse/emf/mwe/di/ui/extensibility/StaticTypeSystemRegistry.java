/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.extensibility;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.types.StaticTypeSystem;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.emf.mwe.di.types.TypeSystem;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class StaticTypeSystemRegistry implements TypeSystem {

	private final List<StaticTypeSystem> typeSystems = new ArrayList<StaticTypeSystem>();

	public void addTypeSystem(final StaticTypeSystem typeSystem) {
		if (typeSystem == null)
			throw new IllegalArgumentException();

		typeSystems.add(typeSystem);
	}

	public StaticTypeSystem getTypeSystem(final String name) {
		for (final StaticTypeSystem ts : typeSystems) {
			if (ts.getName().equals(name))
				return ts;
		}
		return null;
	}

	public List<String> getTypeSystemNames() {
		final List<String> result = new ArrayList<String>();
		for (final StaticTypeSystem ts : typeSystems) {
			result.add(ts.getName());
		}
		return result;
	}

	public List<StaticTypeSystem> getTypeSystems() {
		return typeSystems;
	}

	public boolean hasTypeSystem(final String name) {
		return getTypeSystem(name) != null;
	}

	public Type typeForName(final String name, final File file) {
		for (final StaticTypeSystem ts : typeSystems) {
			final Type type = ts.typeForName(name, file);
			if (type != null)
				return type;
		}
		return null;
	}
}
