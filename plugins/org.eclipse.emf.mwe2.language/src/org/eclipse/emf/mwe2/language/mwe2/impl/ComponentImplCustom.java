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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;

public class ComponentImplCustom extends ComponentImpl {

	@Override
	public JvmType getActualType() {
		JvmType result = super.getActualType();
		if (result != null)
			return result;
		EObject container = eContainer();
		if (container instanceof Assignment) {
			JvmIdentifiableElement containerFeature = ((Assignment) container).getFeature();
			if (containerFeature != null && containerFeature instanceof JvmOperation) {
				JvmFormalParameter parameter = ((JvmOperation) containerFeature).getParameters().get(0);
				return parameter.getParameterType().getType();
			}
		}
		if (module != null) {
			Module module = getModule();
			result = module.getRoot().getActualType();
		}
		return result;
	}
	
}
