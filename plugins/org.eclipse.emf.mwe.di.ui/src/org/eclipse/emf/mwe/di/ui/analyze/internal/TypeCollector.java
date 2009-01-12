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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IType;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */

public class TypeCollector {

	private final List<IType> types = new ArrayList<IType>();
	private final EObject context;

	public TypeCollector(final EObject context) {
		this.context = context;
	}

	public void addType(final IType type) {
		if (type == null)
			throw new IllegalArgumentException();

		types.add(type);
	}

	public boolean isEmpty() {
		return types.isEmpty();
	}

	public IType resolve() {
		if (isEmpty())
			return null;

		if (size() > 1)
			throw createAmbiguityException();

		return types.get(0);
	}

	public int size() {
		return types.size();
	}

	private DuplicateElementException createAmbiguityException() {
		final StringBuilder sb = new StringBuilder();
		final String shortName = types.get(0).getElementName();
		sb.append("The class '");
		sb.append(shortName);
		sb.append("' cannot be resolved because the reference is ambiguous. It refers to the following classes:\n");
		for (final IType t : types) {
			sb.append("- ");
			sb.append(t.getFullyQualifiedName());
			sb.append("\n");
		}
		return new DuplicateElementException(sb.toString(), context);
	}
}
