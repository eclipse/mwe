package org.eclipse.emf.mwe.di.types.java;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.JavaImport;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.types.StaticTypeSystem;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.emf.mwe.di.types.TypeSystem;
import org.eclipse.xtext.EcoreUtil2;

public class JavaTypeSystem implements TypeSystem, StaticTypeSystem {

	private final ClassLoader classLoader;

	public JavaTypeSystem(final ClassLoader classLoader) {
		super();
		this.classLoader = classLoader;
	}

	public String getName() {
		return "Java types";
	}

	public Type typeForName(final String name, final File file) {
		if (name.indexOf('.') == -1) {
			for (final JavaImport imp : EcoreUtil2.typeSelect(file.getImports(), JavaImport.class)) {
				final String qn = MweUtil.toString(imp.getJavaImport());
				if (imp.isWildcard()) {
					final Type t = load(qn + "." + name);
					if (t != null)
						return t;
				}
				else {
					final String lastSegment = imp.getJavaImport().getParts().get(
							imp.getJavaImport().getParts().size() - 1);
					if (lastSegment.equals(name))
						return load(qn);
				}
			}
		}
		return load(name);
	}

	private Type load(final String string) {
		try {
			final Class<?> class1 = classLoader.loadClass(string);
			return new JavaType(class1);
		}
		catch (final ClassNotFoundException e) {
			return null;
		}
	}

}
