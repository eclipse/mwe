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
import org.eclipse.emf.mwe2.language.ui.Mwe2UiModule;
import org.eclipse.emf.mwe2.language.ui.internal.Mwe2Activator;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class UiTestSetup extends Mwe2StandaloneSetup {
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(
				new Mwe2RuntimeModule() {
					@Override
					public ClassLoader bindClassLoaderToInstance() {
						return UiTestSetup.class.getClassLoader();
					}
				},
				createUiModule(Mwe2Activator.getInstance()),
				new SharedStateModule()));
	}

	protected Mwe2UiModule createUiModule(Mwe2Activator activator) {
		return new Mwe2UiModule(activator);
	}
}
