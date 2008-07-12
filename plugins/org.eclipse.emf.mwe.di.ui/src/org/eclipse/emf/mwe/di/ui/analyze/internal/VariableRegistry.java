/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.LocalVariable;
import org.eclipse.emf.mwe.Value;

public class VariableRegistry {

	private EObject context;
	private final Map<String, LocalVariableDefinition> variables = new HashMap<String, LocalVariableDefinition>();

	public static boolean isReference(final String text) {
		final Matcher m = LocalVariableDefinition.REFERENCE_PATTERN.matcher(text);
		return m.matches() && m.start() == 0 && m.end() == text.length();
	}

	public static final String referenceName(final String text) {
		if (!isReference(text))
			return null;

		final Matcher m = LocalVariableDefinition.REFERENCE_PATTERN.matcher(text);
		m.find();
		return m.group(1);
	}

	public void addVariable(final LocalVariable variable) {
		if (variable == null)
			throw new IllegalArgumentException();
		else if (getContext() == null)
			throw new IllegalStateException("No context set");

		final int definitionPosition = size();
		final LocalVariableDefinition def = new LocalVariableDefinition(variable, definitionPosition, context);
		variables.put(def.getName(), def);
	}

	public void clear() {
		variables.clear();
	}

	public EObject getContext() {
		return context;
	}

	public String getSimpleValue(final String name) {
		final LocalVariableDefinition def = getDefinition(name);
		return def != null ? def.getSimpleValue() : null;
	}

	public List<String> getUnresolvedReferences(final String name) {
		final List<String> result = new ArrayList<String>();
		final LocalVariableDefinition secondDef = getDefinition(name);
		if (secondDef != null) {
			final List<String> references = secondDef.getReferences();
			for (final String r : references) {
				final LocalVariableDefinition firstDef = getDefinition(r);
				if (firstDef == null || !isDefinedBefore(firstDef, secondDef)) {
					result.add(r);
				}
			}
		}
		else {
			result.add(name);
		}
		return result;
	}

	public Value getValue(final String name) {
		final LocalVariableDefinition def = getDefinition(name);
		return def != null ? def.getValue() : null;
	}

	public boolean hasSimpleValue(final String name) {
		final LocalVariableDefinition def = getDefinition(name);
		return def != null ? def.hasSimpleValue() : false;
	}

	public boolean hasVariable(final String name) {
		if (name == null)
			return false;

		return variables.containsKey(name);
	}

	public boolean isDefinedBefore(final String name, final int definitionPosition) {
		if (!hasVariable(name) || definitionPosition < 0)
			return false;

		final LocalVariableDefinition def = getDefinition(name);
		return def.getDefinitionPosition() < definitionPosition;
	}

	public boolean isEmpty() {
		return variables.isEmpty();
	}

	public void setContext(final EObject context) {
		if (context == null) {
			throw new IllegalArgumentException();
		}

		this.context = context;
	}

	public int size() {
		return variables.size();
	}

	private LocalVariableDefinition getDefinition(final String name) {
		if (name == null)
			return null;

		return variables.get(name);
	}

	private boolean isDefinedBefore(final LocalVariableDefinition firstDef, final LocalVariableDefinition secondDef) {
		if (firstDef == null || secondDef == null)
			return false;

		return firstDef.getDefinitionPosition() < secondDef.getDefinitionPosition();
	}
}
