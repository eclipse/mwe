/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.MweFactory;
import org.eclipse.emf.mwe.di.types.StaticType;
import org.eclipse.emf.mwe.di.ui.extensibility.StaticTypeSystemRegistry;

import base.AbstractAnalyzerTests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class DummyAnalyzerTest extends AbstractAnalyzerTests {

	private File file;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		final MweFactory factory = MweFactory.eINSTANCE;
		file = factory.createFile();
	}

	public void testgTypeAccess() {
		final StaticTypeSystemRegistry registry = StaticTypeSystemRegistry.getInstance();
		final StaticType type = registry.staticTypeForName("dummyType", file);
		assertNotNull(type);
		assertTrue(type.hasProperty("dummyProperty"));
	}
}
