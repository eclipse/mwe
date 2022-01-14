/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui;

import com.google.inject.Injector;
import org.eclipse.emf.mwe2.language.ui.internal.LanguageActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Mwe2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(LanguageActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		LanguageActivator activator = LanguageActivator.getInstance();
		return activator != null ? activator.getInjector(LanguageActivator.ORG_ECLIPSE_EMF_MWE2_LANGUAGE_MWE2) : null;
	}

}
