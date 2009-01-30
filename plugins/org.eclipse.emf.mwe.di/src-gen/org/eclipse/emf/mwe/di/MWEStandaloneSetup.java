/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.service.IServiceScope;
import org.eclipse.xtext.service.ServiceRegistry;

import com.google.inject.Guice;
import com.google.inject.Injector;

import org.eclipse.emf.mwe.di.IMWE;

public abstract class MWEStandaloneSetup {

	private static boolean isInitialized = false;

	public synchronized static void doSetup() {
		if(!isInitialized) {
		    
		    Injector injector = Guice.createInjector(new org.eclipse.emf.mwe.di.MWERuntimeModule());
			ServiceRegistry.registerInjector(org.eclipse.emf.mwe.di.IMWE.SCOPE, injector);
			
			
			
			org.eclipse.xtext.builtin.XtextBuiltinStandaloneSetup.doSetup();
			
			
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
	   doSetup();
	   return org.eclipse.emf.mwe.di.IMWE.SCOPE;
	}
	
}
