/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.tests.util;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

import junit.framework.TestCase;


public class StandaloneSetupTest extends TestCase {

	public void testRegisterNestedPackage() {
		Registry registry = EPackage.Registry.INSTANCE;
		StandaloneSetup setup = new StandaloneSetup();
		setup.addRegisterEcoreFile("resources/test/res/test.ecore");
		assertTrue(registry.containsKey("http://www.openarchitectureware.org/mm/test/nested"));
	}
}
