/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.utils;

import org.eclipse.jdt.core.IType;

public class SettableCheckResult {

	private final boolean settableFound;

	private final String name;

	private final IType type;

	public SettableCheckResult(final boolean settableFound, final String name, final IType type) {
		if (name == null || type == null)
			throw new IllegalArgumentException();

		this.settableFound = settableFound;
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public IType getType() {
		return type;
	}

	public boolean isSettableFound() {
		return settableFound;
	}
}