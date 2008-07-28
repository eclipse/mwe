/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package typesystem;

import org.eclipse.emf.mwe.di.types.StaticType;
import org.eclipse.emf.mwe.di.types.Type;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public class DummyType extends StaticType {

	public void inject(final Object target, final String feature, final Object value) {
	}

	public Object newInstance() {
		return null;
	}

	public Type typeForFeature(final String featureName) {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean hasProperty(final String name) {
		if ("dummyProperty".equals(name))
			return true;

		return false;
	}

}
