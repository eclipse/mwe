/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.LocalVariable;
import org.eclipse.emf.mwe.SimpleValue;
import org.eclipse.emf.mwe.Value;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class LocalVariableDefinition {

	public static final Pattern REFERENCE_PATTERN = Pattern.compile("\\$\\{(\\w+)\\}");

	private final LocalVariable variable;
	private final int definitionPosition;

	private final EObject context;

	public LocalVariableDefinition(final LocalVariable variable, final int definitionPosition, final EObject context) {
		if (variable == null || definitionPosition < 0 || context == null) {
			throw new IllegalArgumentException();
		}

		if (variable.getName() == null || variable.getValue() == null)
			throw new IllegalArgumentException("Incomplete variable variable");

		this.variable = variable;
		this.definitionPosition = definitionPosition;
		this.context = context;
	}

	public EObject getContext() {
		return context;
	}

	public int getDefinitionPosition() {
		return definitionPosition;
	}

	public String getName() {
		return variable.getName();
	}

	public Collection<String> getReferences() {
		final Collection<String> result = new HashSet<String>();
		final Matcher m = REFERENCE_PATTERN.matcher(getSimpleValue());
		while (m.find()) {
			final String refName = m.group(1);
			result.add(refName);
		}
		return result;
	}

	public String getSimpleValue() {
		if (hasSimpleValue()) {
			final SimpleValue val = (SimpleValue) getValue();
			return val.getValue();
		}

		return null;
	}

	public Value getValue() {
		return variable.getValue();
	}

	public boolean hasSimpleValue() {
		return getValue() instanceof SimpleValue;
	}
}
