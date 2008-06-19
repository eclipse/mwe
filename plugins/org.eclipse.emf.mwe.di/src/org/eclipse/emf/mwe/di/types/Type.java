package org.eclipse.emf.mwe.di.types;

public interface Type {
	Type typeForFeature(String featureName);
	void inject(Object target, String feature, Object value);
	Object newInstance();
}
