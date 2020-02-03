/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.debug.model;

import java.util.HashSet;
import java.util.Set;

/**
 * A wrapper class for caching of variable values together with a specific id and remember where this value is
 * used and which member valuess it has.
 */
public class VarValue {

	public int id;

	public Object element;

	public Set<VarValue> usedIn = new HashSet<VarValue>();

	public Set<VarValue> members = new HashSet<VarValue>();

	// -------------------------------------------------------------------------

	public VarValue(Object element, int id) {
		this.element = element;
		this.id = id;
	}

}
