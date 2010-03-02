package org.eclipse.emf.mwe2.language.scoping;

import java.util.Map;

import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmType;

import com.google.inject.ImplementedBy;

@ImplementedBy(InjectableFeatureLookup.class)
public interface IInjectableFeatureLookup {
	Map<String, JvmFeature> getInjectableFeatures(JvmType type);
}
