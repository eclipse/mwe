/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.List;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.LocalVariable;
import org.eclipse.emf.mwe.MweFactory;
import org.eclipse.emf.mwe.SimpleValue;

import base.AbstractUITests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.6 $
 */

public class LocalVariableDefinitionTest extends AbstractUITests {

	private static final String VAR_NAME = "test";
	private static final String VAR_VALUE = "value";
	private static final int VAR_DEF_POSITION = 10;

	private File file;
	private LocalVariable localVariable;
	private SimpleValue simpleValue;

	public void testGetDefinitionPosition() {
		simpleValue.setValue(VAR_VALUE);
		final LocalVariableDefinition def = createDefinition();
		assertEquals(VAR_DEF_POSITION, def.getDefinitionPosition());
	}

	public void testGetName() {
		simpleValue.setValue(VAR_VALUE);
		final LocalVariableDefinition def = createDefinition();
		assertNotNull(def);
		assertEquals(VAR_NAME, def.getName());
	}

	public void testGetValue() {
		simpleValue.setValue(VAR_VALUE);
		final LocalVariableDefinition def = createDefinition();
		assertEquals(VAR_VALUE, def.getSimpleValue());
	}

	public void testMultipleReference() {
		simpleValue.setValue("${ref1}/test1/${ref2}/test2");
		final LocalVariableDefinition def = createDefinition();
		final List<String> ref = def.getReferences();
		assertEquals(2, ref.size());
		assertEquals("ref1", ref.get(0));
		assertEquals("ref2", ref.get(1));
	}

	public void testNoReference() {
		simpleValue.setValue(VAR_VALUE);
		final LocalVariableDefinition def = createDefinition();
		assertTrue(def.getReferences().isEmpty());
	}

	public void testSingleReference() {
		simpleValue.setValue("${ref}/test");
		final LocalVariableDefinition def = createDefinition();
		final List<String> ref = def.getReferences();
		assertEquals(1, ref.size());
		assertEquals("ref", ref.get(0));
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		final MweFactory factory = MweFactory.eINSTANCE;
		file = factory.createFile();
		localVariable = factory.createLocalVariable();
		localVariable.setName(VAR_NAME);
		simpleValue = factory.createSimpleValue();
	}

	private LocalVariableDefinition createDefinition() {
		localVariable.setValue(simpleValue);
		return new LocalVariableDefinition(localVariable, VAR_DEF_POSITION, false, file);
	}
}
