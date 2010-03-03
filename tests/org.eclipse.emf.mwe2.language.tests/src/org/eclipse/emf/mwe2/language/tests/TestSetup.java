package org.eclipse.emf.mwe2.language.tests;

import org.eclipse.emf.mwe2.language.ExtendedMwe2StandaloneSetup;
import org.eclipse.emf.mwe2.language.Mwe2RuntimeModule;
import org.eclipse.emf.mwe2.language.tests.factory.Mwe2ModelExecutingFactoryTest;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestSetup extends ExtendedMwe2StandaloneSetup {
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new Mwe2RuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return Mwe2ModelExecutingFactoryTest.class.getClassLoader();
			}
		});
	}
}
