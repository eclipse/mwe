/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.services;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.IMetamodelAccess;
import org.eclipse.xtext.parser.BaseEPackageAccess;

public class MWEMetamodelAccess extends BaseEPackageAccess implements IMetamodelAccess {

	private EPackage[] generated = new EPackage[] {
		
		getMweEPackage()
		
		};

	public EPackage[] getGeneratedEPackages() {
		return generated;
	}

	private EPackage[] referenced = new EPackage[] {
		
		};
	public EPackage[] getReferencedEPackages() {
		return referenced;
	}
	
	private EPackage[] all = new EPackage[] {
	    getMweEPackage()
		};
	
	public EPackage[] getAllEPackages() {
		return all;
	}

	
	protected static final String MWE_NS_URI = "http://www.eclipse.org/emf/mwe/di";
	
	protected EPackage getMweEPackage() {	
		return EPackage.Registry.INSTANCE.getEPackage(MWE_NS_URI);
	}
	
}
