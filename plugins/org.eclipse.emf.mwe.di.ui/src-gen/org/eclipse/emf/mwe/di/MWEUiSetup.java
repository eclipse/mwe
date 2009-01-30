/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di;

import org.eclipse.xtext.service.IServiceScope;
import org.eclipse.xtext.service.ServiceRegistry;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * GENERATED! 
 */
public class MWEUiSetup {

	private static boolean initialized = false;
	
	public synchronized static void doSetup() {
		if (!initialized) {
			org.eclipse.emf.mwe.di.MWEStandaloneSetup.doSetup();
			
			// overwriting runtime configuration
		    Injector injector = Guice.createInjector(new org.eclipse.emf.mwe.di.MWERuntimeModule(), new org.eclipse.emf.mwe.di.MWEUIModule());
			ServiceRegistry.registerInjector(org.eclipse.emf.mwe.di.IMWE.SCOPE, injector);
					   
		   initialized = true;
		}
	}
	
	public static IServiceScope getServiceScope() {
	   doSetup();
	   return org.eclipse.emf.mwe.di.IMWE.SCOPE;
	}
	
}
