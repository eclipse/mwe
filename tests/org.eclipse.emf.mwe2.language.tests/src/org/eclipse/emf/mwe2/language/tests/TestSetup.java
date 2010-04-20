/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests;

import org.eclipse.emf.mwe2.language.Mwe2RuntimeModule;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestSetup extends Mwe2StandaloneSetup {
	@Override
	public Injector createInjector() {
		return Guice.createInjector(new Mwe2RuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return TestSetup.class.getClassLoader();
			}
		});
	}
}
