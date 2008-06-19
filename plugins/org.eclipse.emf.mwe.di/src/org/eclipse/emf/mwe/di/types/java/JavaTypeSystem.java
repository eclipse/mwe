package org.eclipse.emf.mwe.di.types.java;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.JavaImport;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.emf.mwe.di.types.TypeSystem;
import org.eclipse.xtext.EcoreUtil2;

public class JavaTypeSystem implements TypeSystem {

	private ClassLoader classLoader;

	public JavaTypeSystem(ClassLoader classLoader) {
		super();
		this.classLoader = classLoader;
	}

	public Type typeForName(String name, File file) {
		if (name.indexOf('.') == -1) {
			for (JavaImport imp : EcoreUtil2.typeSelect(file.getImports(), JavaImport.class)) {
				String qn = MweUtil.toString(imp.getJavaImport());
				if (imp.isWildcard()) {
					Type t = load(qn + "." + name);
					if (t != null)
						return t;
				} else {
					String lastSegment = imp.getJavaImport().getParts().get(imp.getJavaImport().getParts().size() - 1);
					if (lastSegment.equals(name)) {
						return load(qn);
					}
				}
			}
		}
		return load(name);
	}

	private Type load(String string) {
		try {
			Class<?> class1 = classLoader.loadClass(string);
			return new JavaType(class1);
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

}
