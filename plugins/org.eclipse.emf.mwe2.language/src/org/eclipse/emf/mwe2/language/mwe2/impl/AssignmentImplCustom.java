/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.util.Strings;

public class AssignmentImplCustom extends AssignmentImpl {

	@Override
	public String getFeatureName() {
		JvmIdentifiableElement feature = getFeature();
		if (feature instanceof JvmFeature) {
			String name = ((JvmFeature)feature).getSimpleName();
			if (feature instanceof JvmOperation) {
				if (name.startsWith("add") || name.startsWith("set")) {
					return Strings.toFirstLower(name.substring(3));
				}
			}
			return name;
		} else if (feature instanceof DeclaredProperty) {
			return ((DeclaredProperty)feature).getName();
		} else {
			return null;
		}
	}
}
