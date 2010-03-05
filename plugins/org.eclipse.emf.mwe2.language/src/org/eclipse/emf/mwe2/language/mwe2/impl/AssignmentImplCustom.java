/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.util.Strings;

public class AssignmentImplCustom extends AssignmentImpl {
	
	@Override
	public String getFeatureName() {
		JvmFeature jvmFeature = getFeature();
		String name = jvmFeature.getSimpleName();
		if (jvmFeature instanceof JvmOperation) {
			if (name.startsWith("add") || name.startsWith("set")) {
				return Strings.toFirstLower(name.substring(3));
			}
		}
		return name;
	}
}
