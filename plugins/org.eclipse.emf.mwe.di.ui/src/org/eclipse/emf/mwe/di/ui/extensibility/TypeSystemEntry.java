/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.extensibility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.types.StaticTypeSystem;
import org.eclipse.emf.mwe.di.types.Type;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class TypeSystemEntry implements Comparable<TypeSystemEntry> {

	private static final String DOMINANCE = "dominance";
	private static final String PRIORITY = "priority";
	private static final String TYPE_SYSTEM_CLASS = "class";
	private static final Log log = LogFactory.getLog(TypeSystemEntry.class);

	private final IConfigurationElement configurationElement;
	private StaticTypeSystem typeSystem;
	private final int priority;
	private final boolean dominant;

	public TypeSystemEntry(final IConfigurationElement configurationElement) {
		if (configurationElement == null)
			throw new IllegalArgumentException();

		this.configurationElement = configurationElement;
		this.priority = extractPriority();
		this.dominant = extractDominance();
	}

	public int compareTo(final TypeSystemEntry other) {
		if (other == null)
			return 0;

		if (getPriority() < other.getPriority())
			return -1;
		else if (getPriority() > other.getPriority())
			return 1;
		else {
			if (isDominant() && !other.isDominant())
				return -1;
			else
				return 1;
		}
	}

	public String getName() {
		return getTypeSystem().getName();
	}

	public int getPriority() {
		return priority;
	}

	public StaticTypeSystem getTypeSystem() {
		if (typeSystem == null) {
			try {
				typeSystem = (StaticTypeSystem) configurationElement.createExecutableExtension(TYPE_SYSTEM_CLASS);
			}
			catch (final CoreException e) {
				log.error("Could not load type system class: " + configurationElement.getAttribute(TYPE_SYSTEM_CLASS),
						e);
			}
		}
		return typeSystem;
	}

	public boolean isDominant() {
		return dominant;
	}

	public Type typeForName(final String name, final File file) {
		return getTypeSystem().typeForName(name, file);
	}

	private final boolean extractDominance() {
		final String booleanString = configurationElement.getAttribute(DOMINANCE);
		if (booleanString != null) {
			final Boolean dominance = Boolean.valueOf(booleanString);
			if (dominance != null)
				return dominance;
		}
		throw new IllegalArgumentException();
	}

	private final int extractPriority() {
		final String priorityString = configurationElement.getAttribute(PRIORITY);
		if (priorityString != null) {
			final Integer priority = Integer.valueOf(priorityString);
			if (priority != null && priority >= 1)
				return priority;
		}
		throw new IllegalArgumentException();
	}

}
