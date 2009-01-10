/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.service.IServiceScope;
import org.eclipse.xtext.service.ServiceRegistry;
import org.eclipse.xtext.service.IServiceRegistrationFactory.IServiceRegistration;

import org.eclipse.emf.mwe.di.IMWE;

public abstract class MWEStandaloneSetup {

	private static boolean isInitialized = false;

	public synchronized static void doSetup() {
		if(!isInitialized) {
			// setup super language first
			org.eclipse.xtext.builtin.XtextBuiltinStandaloneSetup.doSetup();
			
			for (IServiceRegistration reg :  new org.eclipse.emf.mwe.di.MWERuntimeConfig().registrations()) {
				ServiceRegistry.registerFactory(reg.scope(), reg.serviceFactory(), reg.priority());
			}
			
			// register resource factory to EMF
			IResourceFactory resourceFactory = new org.eclipse.emf.mwe.di.services.MWEResourceFactory();
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mwe", resourceFactory);
			
			
			// initialize EPackages
			
				if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/emf/mwe/di")) {
					EPackage mwe = EcoreUtil2.loadEPackage(
							"classpath:/org/eclipse/emf/mwe/di/mwe.ecore",
							MWEStandaloneSetup.class.getClassLoader());
					if (mwe == null)
						throw new IllegalStateException(
								"Couldn't load EPackage from 'classpath:/org/eclipse/emf/mwe/di/mwe.ecore'");
					EPackage.Registry.INSTANCE.put("http://www.eclipse.org/emf/mwe/di", mwe);
				}
			
			isInitialized = true;
		}
	}
	
	public static IServiceScope getServiceScope() {
		return org.eclipse.emf.mwe.di.IMWE.SCOPE;
	}
}
