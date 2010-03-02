package org.eclipse.emf.mwe2.language.scoping;

import java.util.Map;

import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmType;

public interface IInjectableFeatureLookup {
	Map<String,JvmFeature> getInjectableFeatures(JvmType type);
}
