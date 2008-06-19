package org.eclipse.emf.mwe.di.types.emf;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.GenericImport;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.emf.mwe.di.types.TypeSystem;
import org.eclipse.xtext.EcoreUtil2;

public class EMFTypeSystem implements TypeSystem {

	private EPackage.Registry registry = EPackage.Registry.INSTANCE;

	public Type typeForName(String name, File file) {
		for (GenericImport imp : EcoreUtil2.typeSelect(file.getImports(), GenericImport.class)) {
			EPackage package1 = registry.getEPackage(imp.getValue());
			if (package1 != null) {
				List<EClass> classes = EcoreUtil2.typeSelect(package1.getEClassifiers(), EClass.class);
				for (EClass class1 : classes) {
					if (class1.getName().equals(name))
						return new EMFType(class1);
				}
			}
		}
		return null;
	}

}
