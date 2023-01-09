/*******************************************************************************
 * Copyright (c) 2010, 2023 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.tests;

import com.google.inject.Injector;
import org.eclipse.emf.mwe2.language.ui.internal.LanguageActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class Mwe2UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LanguageActivator.getInstance().getInjector("org.eclipse.emf.mwe2.language.Mwe2");
	}

}
