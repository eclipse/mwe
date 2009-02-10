/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MWEStandaloneSetup implements ISetup {

	public static void doSetup() {
		new MWEStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjectorAndDoEMFRegistration() {
			
			new org.eclipse.xtext.builtin.XtextBuiltinStandaloneSetup().doSetup();
			
		    registerEPackages();
		    
		    Injector injector = createInjector();
		    IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		    registerResourceFactory(resourceFactory);
		    return injector;
		    
	}
	
    
	public Injector createInjector() {
		return Guice.createInjector(new org.eclipse.emf.mwe.di.MWERuntimeModule());
	}
	
	public void registerResourceFactory(IResourceFactory resourceFactory) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mwe", resourceFactory);
		
	}
    

	/**
	 * initializes all EPackages generated for this language and registers them at EPackage.Registry.INSTANCE
	 */	
	public void registerEPackages() {
		
			if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/emf/mwe/di")) {
				EPackage mwe = EcoreUtil2.loadEPackage(
						"classpath:/org/eclipse/emf/mwe/di/mwe.ecore",
						MWEStandaloneSetup.class.getClassLoader());
				if (mwe == null)
					throw new IllegalStateException(
							"Couldn't load EPackage from 'classpath:/org/eclipse/emf/mwe/di/mwe.ecore'");
				EPackage.Registry.INSTANCE.put("http://www.eclipse.org/emf/mwe/di", mwe);
			}
		
	}
	
}
