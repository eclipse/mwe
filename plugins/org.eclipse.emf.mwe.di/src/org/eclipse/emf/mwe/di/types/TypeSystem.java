package org.eclipse.emf.mwe.di.types;

import org.eclipse.emf.mwe.File;

public interface TypeSystem {
	public Type typeForName(String name, File file);
}
