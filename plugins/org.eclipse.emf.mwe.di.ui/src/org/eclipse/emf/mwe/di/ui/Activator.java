/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.ui;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.di.ui.analyze.Analyzer;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	private static Activator plugin;

	public static Activator getDefault() {
		return plugin;
	}

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		EValidator.Registry.INSTANCE.put(MwePackage.eINSTANCE, new Analyzer());
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
		EValidator.Registry.INSTANCE.remove(MwePackage.eINSTANCE);
	}
}
