/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package typesystem;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.types.StaticTypeSystem;
import org.eclipse.emf.mwe.di.types.Type;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class DummyTypeSystem extends StaticTypeSystem {

	@Override
	public String getName() {
		return "Dummy type system";
	}

	public Type typeForName(final String name, final File file) {
		if ("dummyType".equals(name))
			return new DummyType();

		return null;
	}

	public boolean needsExternalClassLoader() {
		return false;
	}

	public void setExternalClassLoader(final ClassLoader classLoader) {
		throw new UnsupportedOperationException();
	}

}
