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

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.types.StaticType;
import org.eclipse.emf.mwe.di.types.StaticTypeSystem;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.emf.mwe.di.types.TypeSystem;
import org.eclipse.emf.mwe.di.ui.Activator;
import org.osgi.framework.Bundle;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */

public class StaticTypeSystemRegistry implements TypeSystem {

	private static final String TYPE_SYSTEM_EXTENSION_POINT = "typeSystem";

	private static StaticTypeSystemRegistry instance;

	private final List<TypeSystemEntry> typeSystemEntries = new ArrayList<TypeSystemEntry>();
	boolean needsSorting;

	/**
	 * Don't allow instantiation.
	 */
	private StaticTypeSystemRegistry() {
		initialize();
	}

	public static StaticTypeSystemRegistry getInstance() {
		if (instance == null) {
			instance = new StaticTypeSystemRegistry();
		}

		return instance;
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

	public boolean needsExternalClassLoader() {
		for (final TypeSystemEntry tse : typeSystemEntries) {
			if (tse.needsExternalClassLoader())
				return true;
		}
		return false;
	}

	public void setExternalClassLoader(final ClassLoader classLoader) {
		if (classLoader == null)
			throw new IllegalArgumentException();

		for (final TypeSystemEntry tse : typeSystemEntries) {
			if (tse.needsExternalClassLoader()) {
				tse.setExternalClassLoader(classLoader);
			}
		}
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

	private void addTypeSystemConfiguration(final IConfigurationElement configurationElement) {
		if (configurationElement == null)
			throw new IllegalArgumentException();

		final TypeSystemEntry entry = new TypeSystemEntry(configurationElement);
		typeSystemEntries.add(entry);
		needsSorting = true;
	}

	private final void initialize() {
		final IExtensionRegistry epr = Platform.getExtensionRegistry();
		final Bundle bundle = Activator.getDefault().getBundle();
		final String pluginName = bundle.getSymbolicName();
		final IExtensionPoint ep = epr.getExtensionPoint(pluginName, TYPE_SYSTEM_EXTENSION_POINT);
		Assert.isNotNull(ep, "The extension point '" + TYPE_SYSTEM_EXTENSION_POINT + "is not defined!");

		final IConfigurationElement[] configurationElements = ep.getConfigurationElements();
		for (final IConfigurationElement cfg : configurationElements) {
			addTypeSystemConfiguration(cfg);
		}
	}

	private void sort() {
		if (needsSorting) {
			Collections.sort(typeSystemEntries);
			needsSorting = false;
		}
	}

}
