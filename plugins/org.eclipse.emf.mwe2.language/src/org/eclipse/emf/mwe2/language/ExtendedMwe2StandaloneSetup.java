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
