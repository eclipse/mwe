package org.eclipse.emf.mwe2.language.scoping;

import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.ImmutableMap;
import com.google.inject.internal.Maps;

public class InjectableFeatureLookup implements IInjectableFeatureLookup {
	
	public Map<String, JvmFeature> getInjectableFeatures(JvmType type) {
		Map<String, JvmFeature> result = Maps.newHashMap();
		collectFeatures(type, result);
		return ImmutableMap.copyOf(result);
	}
	
	public void collectFeatures(JvmType containerType, Map<String, JvmFeature> result) {
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
							result.put(name, op);
						}
					}
				}
			}
		}
	}

}