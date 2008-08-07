package org.eclipse.emf.mwe.di.types;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.File;

public class CompositeTypeSystem implements TypeSystem {

	private final List<TypeSystem> children = new ArrayList<TypeSystem>();

	public CompositeTypeSystem(final List<TypeSystem> children) {
		super();
		if (children != null) {
			this.children.addAll(children);
		}
	}

	public CompositeTypeSystem(final TypeSystem... typeSystem) {
		for (final TypeSystem ts : typeSystem) {
			if (ts != null) {
				children.add(ts);
			}
		}
	}

	public Type typeForName(final String name, final File file) {
		for (final TypeSystem ts : children) {
			final Type t = ts.typeForName(name, file);
			if (t != null)
				return t;
		}
		return null;
	}

	public boolean needsExternalClassLoader() {
		for (final TypeSystem ts : children) {
			if (ts.needsExternalClassLoader())
				return true;
		}
		return false;
	}

	public void setExternalClassLoader(final ClassLoader classLoader) {
		if (classLoader == null)
			throw new IllegalArgumentException();

		for (final TypeSystem ts : children) {
			if (ts.needsExternalClassLoader()) {
				ts.setExternalClassLoader(classLoader);
			}
		}
	}

}
