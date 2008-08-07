package org.eclipse.emf.mwe.di.execution;

import java.util.Map;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.execution.internal.InternalInstantiator;
import org.eclipse.emf.mwe.di.types.CompositeTypeSystem;
import org.eclipse.emf.mwe.di.types.TypeSystem;
import org.eclipse.emf.mwe.di.types.emf.EMFTypeSystem;
import org.eclipse.emf.mwe.di.types.java.JavaTypeSystem;

public class Instantiator {

	private final ClassLoader classLoader;

	public Instantiator() {
		classLoader = Thread.currentThread().getContextClassLoader();
	}

	public Instantiator(final ClassLoader classLoader) {
		if (classLoader == null)
			throw new IllegalArgumentException();

		this.classLoader = classLoader;
	}

	public Object instantiate(final File file) {
		final TypeSystem compositeTypeSystem = new CompositeTypeSystem(new EMFTypeSystem(), new JavaTypeSystem());
		compositeTypeSystem.setExternalClassLoader(classLoader);
		return instantiate(file, null, compositeTypeSystem);
	}

	public Object instantiate(final File file, final Map<String, Object> params, final TypeSystem typeSystem) {
		return new InternalInstantiator(typeSystem, file, params).instantiate();
	}

}
