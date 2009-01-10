/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.di.types;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public abstract class StaticType implements Type {

	public abstract String getName();

	public abstract boolean hasProperty(String name);

	public StaticType staticTypeForFeature(final String featureName) {
		final Type type = typeForFeature(featureName);
		if (type instanceof StaticType)
			return (StaticType) type;

		return null;
	}
}
