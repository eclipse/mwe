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
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.types.StaticType;
import org.eclipse.emf.mwe.di.types.StaticTypeSystem;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.emf.mwe.di.types.TypeSystem;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public class StaticTypeSystemRegistry implements TypeSystem {

	private static StaticTypeSystemRegistry instance;

	private final List<TypeSystemEntry> typeSystemEntries = new ArrayList<TypeSystemEntry>();
	boolean needsSorting;

	/**
	 * Don't allow instantiation.
	 */
	private StaticTypeSystemRegistry() {
		throw new UnsupportedOperationException();
	}

	public static StaticTypeSystemRegistry getInstance() {
		if (instance == null) {
			instance = new StaticTypeSystemRegistry();
		}

		return instance;
	}

	public void addTypeSystemConfiguration(final IConfigurationElement configurationElement) {
		if (configurationElement == null)
			throw new IllegalArgumentException();

		final TypeSystemEntry entry = new TypeSystemEntry(configurationElement);
		typeSystemEntries.add(entry);
		needsSorting = true;
	}

	public StaticTypeSystem getTypeSystem(final String name) {
		sort();
		for (final TypeSystemEntry tse : typeSystemEntries) {
			final StaticTypeSystem ts = tse.getTypeSystem();
			if (ts.getName().equals(name))
				return ts;
		}
		return null;
	}

	public List<String> getTypeSystemNames() {
		sort();
		final List<String> result = new ArrayList<String>();
		for (final TypeSystemEntry tse : typeSystemEntries) {
			result.add(tse.getName());
		}
		return result;
	}

	public boolean hasTypeSystem(final String name) {
		return getTypeSystem(name) != null;
	}

	public StaticType staticTypeForName(final String name, final File file) {
		final Type type = typeForName(name, file);
		StaticType staticType = null;
		if (type instanceof StaticType) {
			staticType = (StaticType) type;
		}

		return staticType;
	}

	public Type typeForName(final String name, final File file) {
		sort();
		for (final TypeSystemEntry tse : typeSystemEntries) {
			final Type type = tse.typeForName(name, file);
			if (type != null)
				return type;
		}
		return null;
	}

	private void sort() {
		if (needsSorting) {
			Collections.sort(typeSystemEntries);
			needsSorting = false;
		}
	}
}
