/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.scoping;

import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

public class InjectableFeatureLookup implements IInjectableFeatureLookup {
	
	@Override
	public Map<QualifiedName, JvmFeature> getInjectableFeatures(JvmType type) {
		Map<QualifiedName, JvmFeature> result = Maps.newHashMap();
		collectFeatures(type, result);
		return ImmutableMap.copyOf(result);
	}
	
	public void collectFeatures(JvmType containerType, Map<QualifiedName, JvmFeature> result) {
		if (containerType == null || containerType.eIsProxy())
			return;		
		if (containerType instanceof JvmDeclaredType) {
			List<JvmTypeReference> superTypes = ((JvmDeclaredType) containerType).getSuperTypes();
			for(JvmTypeReference superType: superTypes) {
				if (superType.getType() != null)
					collectFeatures(superType.getType(), result);
			}
			List<JvmMember> members = ((JvmDeclaredType) containerType).getMembers();
			for(JvmMember member: members) {
				if (member instanceof JvmOperation) {
					JvmOperation op = (JvmOperation) member;
					String simpleName = op.getSimpleName();
					if (simpleName != null && simpleName.length() > 3 && 
						(simpleName.startsWith("add") || simpleName.startsWith("set"))) {
						if (op.getParameters().size() == 1) {
							String name = Strings.toFirstLower(op.getSimpleName().substring(3));
							result.put(QualifiedName.create(name), op);
						}
					}
				}
			}
		}
	}

}
