/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Mwe2StandaloneSetup extends Mwe2StandaloneSetupGenerated{

	public static void doSetup() {
		new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		EPackage.Registry.INSTANCE.put(Mwe2Package.eINSTANCE.getNsURI(), Mwe2Package.eINSTANCE);
		super.register(injector);
	}
}

