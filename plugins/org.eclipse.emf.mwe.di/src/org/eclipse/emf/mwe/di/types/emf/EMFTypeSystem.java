package org.eclipse.emf.mwe.di.types.emf;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.GenericImport;
import org.eclipse.emf.mwe.di.types.StaticTypeSystem;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.xtext.EcoreUtil2;

public class EMFTypeSystem extends StaticTypeSystem {

	private final EPackage.Registry registry = EPackage.Registry.INSTANCE;

	@Override
	public String getName() {
		return "EMF types";
	}

	public Type typeForName(final String name, final File file) {
		for (final GenericImport imp : EcoreUtil2.typeSelect(file.getImports(), GenericImport.class)) {
			final EPackage package1 = registry.getEPackage(imp.getValue());
			if (package1 != null) {
				final List<EClass> classes = EcoreUtil2.typeSelect(package1.getEClassifiers(), EClass.class);
				for (final EClass class1 : classes) {
					if (class1.getName().equals(name))
						return new EMFType(class1);
				}
			}
		}
		return null;
	}

}
