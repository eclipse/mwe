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

import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Value;
import org.eclipse.xtext.common.types.JvmType;

import static org.eclipse.emf.mwe2.language.mwe2.impl.JvmTypeUriFactory.*;

public class DeclaredPropertyImplCustom extends DeclaredPropertyImpl {

	@Override
	public String getIdentifier() {
		Module module = getModule();
		if (module != null) {
			String moduleName = module.getCanonicalName();
			if (name != null)
				return moduleName + "." + name;
			return moduleName + ".UNNAMED";
		}
		return name;
	}
	
	@Override
	public String getSimpleName() {
		return name;
	}
	
	@Override
	public String getQualifiedName(char innerClassDelimiter) {
		return getIdentifier();
	}
	
	@Override
	public String getQualifiedName() {
		return getIdentifier();
	}
	
	@Override
	public JvmType getActualType() {
		JvmType result = super.getActualType();
		if (result != null)
			return result;
		Value value = getDefault();
		if (value != null) {
			return value.getActualType();
		}
		return findJvmType(JvmTypeUriFactory.getURIForFqn(String.class.getName()), this);
	}
}
