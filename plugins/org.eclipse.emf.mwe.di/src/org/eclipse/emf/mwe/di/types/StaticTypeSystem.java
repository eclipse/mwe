/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.types;

import org.eclipse.emf.mwe.File;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public abstract class StaticTypeSystem implements TypeSystem {

	public abstract String getName();

	public StaticType staticTypeForName(final String name, final File file) {
		final Type type = typeForName(name, file);
		if (type instanceof StaticType)
			return (StaticType) type;

		return null;
	}
}
