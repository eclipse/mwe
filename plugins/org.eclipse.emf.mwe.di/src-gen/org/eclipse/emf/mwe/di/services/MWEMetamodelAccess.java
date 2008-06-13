/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.services;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.IMetamodelAccess;
import org.eclipse.xtext.parser.BaseEPackageAccess;

public class MWEMetamodelAccess extends BaseEPackageAccess implements IMetamodelAccess {

	public EPackage[] getGeneratedEPackages() {
		return new EPackage[] {
		
		getMweEPackage()
		
		};
	}

	public EPackage[] getReferencedEPackages() {
		return new EPackage[] {
		
		};
	}

	
	public static final String MWE_NS_URI = "http://www.eclipse.org/emf/mwe/di";
	public static final String MWE_CP_URI = "org/eclipse/emf/mwe/di/mwe.ecore";
	
	public static EPackage getMweEPackage() {	
		if (!EPackage.Registry.INSTANCE.containsKey(MWE_NS_URI)) {
			EPackage p = loadEcoreFile(MWEMetamodelAccess.class.getClassLoader(),MWE_CP_URI);
			if (p!=null) {
				EPackage.Registry.INSTANCE.put(MWE_NS_URI,p);
			}
		}
		return EPackage.Registry.INSTANCE.getEPackage(MWE_NS_URI);
	}
	
}
