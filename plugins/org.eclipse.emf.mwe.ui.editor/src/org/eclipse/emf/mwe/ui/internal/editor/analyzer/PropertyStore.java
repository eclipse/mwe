/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.analyzer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */
public class PropertyStore {

	private final Set<String> propertyNames = new HashSet<String>();

	public void add(final String propertyName) {
		if (propertyName == null || propertyName.length() == 0)
			throw new IllegalArgumentException();

		propertyNames.add(propertyName);
	}

	public void clear() {
		propertyNames.clear();
	}

	public boolean contains(final String propertyName) {
		if (propertyName != null)
			return propertyNames.contains(propertyName);
		else
			return false;
	}

	public List<String> getNames() {
		final List<String> nameList = new ArrayList<String>();
		nameList.addAll(propertyNames);
		return nameList;
	}
}
