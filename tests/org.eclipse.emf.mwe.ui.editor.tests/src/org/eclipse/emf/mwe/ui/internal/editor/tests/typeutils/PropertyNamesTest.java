/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.tests.typeutils;

import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.tests.base.TypeTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jdt.core.IType;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class PropertyNamesTest extends TypeTestBase {

	public void testSettablePropertyNames() {
		final IType type = getType("org.eclipse.xtend.XtendComponent");

		if (type == null) {
			fail();
		}

		final Set<String> propertyNames =
				TypeUtils.getSettableProperties(type);
		assertTrue(propertyNames.size() >= 5);
		assertTrue(propertyNames.contains("extensionAdvice"));
		assertTrue(propertyNames.contains("invoke"));
		assertTrue(propertyNames.contains("outputSlot"));
	}
}
