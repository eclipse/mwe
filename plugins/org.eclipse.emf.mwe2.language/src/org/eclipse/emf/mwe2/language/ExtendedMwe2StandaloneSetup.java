/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;

import com.google.inject.Injector;

public class ExtendedMwe2StandaloneSetup extends Mwe2StandaloneSetup  {
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		EPackage.Registry.INSTANCE.put(Mwe2Package.eINSTANCE.getNsURI(),Mwe2Package.eINSTANCE);
		return super.createInjectorAndDoEMFRegistration();
	}
}
