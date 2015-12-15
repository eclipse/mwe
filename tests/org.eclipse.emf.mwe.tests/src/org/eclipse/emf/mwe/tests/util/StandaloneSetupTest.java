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

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.junit.Assert;
import org.junit.Test;

public class StandaloneSetupTest extends Assert {

	@Test
	public void testRegisterNestedPackage() {
		Registry registry = EPackage.Registry.INSTANCE;
		StandaloneSetup setup = new StandaloneSetup();
		setup.addRegisterEcoreFile("platform:/plugin/org.eclipse.emf.mwe.tests/resources/test/res/test.ecore");
		assertTrue(registry.containsKey("http://www.openarchitectureware.org/mm/test"));
		assertTrue(registry.containsKey("http://www.openarchitectureware.org/mm/test/nested"));
	}

	@Test
	public void testRegisterGenModels() {
		Map<String, URI> registry = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
		StandaloneSetup setup = new StandaloneSetup();
		setup.addRegisterGenModelFile("platform:/plugin/org.eclipse.emf.mwe.tests/resources/test/res/test.genmodel");
		assertTrue(registry.containsKey("http://www.openarchitectureware.org/mm/test"));
		assertTrue(registry.containsKey("http://www.openarchitectureware.org/mm/test/nested"));
		assertTrue(registry.containsKey("http://www.eclipse.org/oaw/test"));
	}

	// does not run in OSGi context.
	@Test
	public void testSearchJars() throws Exception {
		StandaloneSetup setup = new StandaloneSetup();
		setup.setScanClassPath(true);
		final ResourceSetImpl resSet = new ResourceSetImpl();
		final URI uri = URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore");
		Resource resource = resSet.getResource(uri, true);
		assertNotNull(resource.getContents().get(0));
	}
}
