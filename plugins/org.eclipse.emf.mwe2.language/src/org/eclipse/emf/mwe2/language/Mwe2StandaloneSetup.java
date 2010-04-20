
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

