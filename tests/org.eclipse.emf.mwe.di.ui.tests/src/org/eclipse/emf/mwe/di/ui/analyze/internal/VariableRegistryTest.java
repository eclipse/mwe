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
 * @version $Revision: 1.3 $
 */

public class VariableRegistryTest extends AbstractUITests {

	private static final String DEFAULT_NAME = "test";
	private static final String DEFAULT_VALUE = "testvalue";

	private File file;
	private VariableRegistry registry;
	private final MweFactory factory = MweFactory.eINSTANCE;
	private LocalVariable variable;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		file = factory.createFile();
		registry = new VariableRegistry();
		registry.setContext(file);
		variable = createVariable(DEFAULT_NAME, DEFAULT_VALUE);
		assertNotNull(variable);
		registry.addVariable(variable);
	}

	public void testSimpleValue() {
		assertTrue(registry.hasVariable(DEFAULT_NAME));
		assertTrue(registry.hasSimpleValue(DEFAULT_NAME));
		assertEquals(DEFAULT_VALUE, registry.getSimpleValue(DEFAULT_NAME));
	}

	public void testReference1() {
		final LocalVariable var = createVariable("test2", "${test}/bar");
		registry.addVariable(var);
		final List<String> lst = registry.getUnresolvedReferences("test2");
		assertNotNull(lst);
		assertEquals(0, lst.size());
	}

	public void testReference2() {
		final LocalVariable var = createVariable("test2", "${foo}/bar");
		registry.addVariable(var);
		final List<String> lst = registry.getUnresolvedReferences("test2");
		assertNotNull(lst);
		assertEquals(1, lst.size());
		assertEquals("foo", lst.get(0));
	}

	public void testUndefinedVariable() {
		final List<String> lst = registry.getUnresolvedReferences("foo");
		assertEquals(1, lst.size());
		assertEquals("foo", lst.get(0));
	}

	public void testCircularReference() {
		LocalVariable var = createVariable("test2", "${test3}/foo");
		registry.addVariable(var);
		var = createVariable("test3", "${test2}/bar");
		registry.addVariable(var);
		List<String> lst = registry.getUnresolvedReferences("test2");
		assertEquals(1, lst.size());
		assertEquals("test3", lst.get(0));
		lst = registry.getUnresolvedReferences("test3");
		assertEquals(0, lst.size());
	}

	private LocalVariable createVariable(final String name, final String value) {
		final LocalVariable var = factory.createLocalVariable();
		var.setName(name);
		final SimpleValue simpleValue = factory.createSimpleValue();
		simpleValue.setValue(value);
		var.setValue(simpleValue);
		return var;
	}
}
