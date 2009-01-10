/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.services;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.IMetamodelAccess;
import org.eclipse.xtext.parser.BaseEPackageAccess;

public class MWEMetamodelAccess extends BaseEPackageAccess implements IMetamodelAccess {

{

		if (!EPackage.Registry.INSTANCE.containsKey(MWE_NS_URI))
			EPackage.Registry.INSTANCE.put(MWE_NS_URI, loadEcoreFile(getClass().getClassLoader(), "classpath:/org/eclipse/emf/mwe/di/mwe.ecore"));

}

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
