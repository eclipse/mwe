/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.validation;

import static org.eclipse.emf.mwe2.language.mwe2.impl.JvmTypeUriFactory.*;

import java.util.Set;

import org.eclipse.emf.mwe2.language.mwe2.impl.JvmTypeUriFactory;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.common.types.util.RawSuperTypes;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class MweRawSuperTypes extends RawSuperTypes {

	@Inject 
	private Primitives primitives;
	
	@Override
	public Set<JvmType> collect(JvmType type) {
		Set<JvmType> result = new MyImplementation().collect(type);
		result.remove(type);
		return result;
	}
	
	private class MyImplementation extends Implementation {
		
		@Override
		public Boolean caseJvmPrimitiveType(JvmPrimitiveType object) {
			// avoid NPE
			Boolean result = super.caseJvmPrimitiveType(object);
			if (Primitives.Primitive.Int.equals(primitives.primitiveKind(object))) {
				JvmType dbl = JvmTypeUriFactory.findJvmType(getURIForPrimitive("double"), object);
				if (dbl != null) {
					doSwitch(dbl);
				}
				JvmType lng = JvmTypeUriFactory.findJvmType(getURIForPrimitive("long"), object);
				if (lng != null) {
					doSwitch(lng);
				}
				JvmType flt = JvmTypeUriFactory.findJvmType(getURIForPrimitive("float"), object);
				if (flt != null) {
					doSwitch(flt);
				}
			}
			return result;
		}
		
	}
	
}
