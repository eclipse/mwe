/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.factory;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.eclipse.emf.mwe2.language.factory.Mwe2ExecutionEngine;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.tests.AbstractMwe2Tests;
import org.eclipse.emf.mwe2.language.tests.TestSetup;
import org.junit.Test;

public class Mwe2ExecutionEngineTest extends AbstractMwe2Tests {
	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new TestSetup());
	}
		
	@Test public void testSimple() throws Exception {
		ArrayList<?> m  = (ArrayList<?>) getRoot("module foo.Bar java.util.ArrayList{}");
		assertNotNull(m);
	}
	
	@Test public void testComplex_1() throws Exception {
		String mweString = "module foo.Bar \n" +
				"import "+ComponentA.class.getName()+"\n" +
			     "ComponentA : a{\n" +
			     "  x = a\n" +
			     "  y = 'foo'\n" +
			     "}";
		ComponentA result  = (ComponentA) getRoot(mweString);
		assertNotNull(result);
		assertSame(result.getX(),result);
		assertEquals("foo", result.getY().get(0));
	}

	@Test public void testComplex_2() throws Exception {
		String mweString = "module foo.Bar \n" +
		"import "+ComponentA.class.getName()+"\n" +
		"var baz = 'b'\n" +
		"ComponentA : a{\n" +
		"  x = ComponentA {\n" +
		"    x = a\n" +
		"    y = 'a ${baz}'\n" +
		"    y = baz\n" +
		"  }\n" +
		"  y = 'foo'\n" +
		"}";
		ComponentA result  = (ComponentA) getRoot(mweString);
		assertNotNull(result);
		assertSame(result.getX().getX(),result);
		assertEquals("a b", result.getX().getY().get(0));
		assertEquals("b", result.getX().getY().get(1));
	}
	
	@Test public void testComplex_3() throws Exception {
		String mweString = "module foo.Bar \n" +
		"import "+ComponentA.class.getName()+"\n" +
		"var baz = 'b'\n" +
		"ComponentA : a{\n" +
		"  x = ComponentA {\n" +
		"    x = a\n" +
		"    y = baz\n" +
		"  }\n" +
		"  y = 'foo'\n" +
		"}";
		ComponentA result  = (ComponentA) getRoot(mweString);
		assertNotNull(result);
		assertSame(result.getX().getX(),result);
		assertEquals("b", result.getX().getY().get(0));
	}
	
	@Test public void testFactory_3() throws Exception {
		String mweString = "module foo.Bar \n" +
		"import "+ComponentAFactory.class.getName()+"\n" +
		"var baz = 'b'\n" +
		"ComponentAFactory : a{\n" +
		"  x = 'foo'\n" +
		"  y = 'bar'\n" +
		"}";
		ComponentA result  = (ComponentA) getRoot(mweString);
		assertNotNull(result);
		assertNull(result.getX());
		assertEquals("foo", result.getY().get(0));
		assertEquals("bar", result.getY().get(1));
	}
	
	@Test public void testQualifiedName() throws Exception {
		String mweString = "module foo.Bar \n" +
			"import "+ComponentA.class.getName()+"\n" +
			"var a.b = 'foo'" +
			"ComponentA {\n" +
			"  y = a.b\n" +
			"}";
		ComponentA result  = (ComponentA) getRoot(mweString);
		assertNotNull(result);
		assertEquals("foo", result.getY().get(0));
	}
	
	@Test public void testAutoInject_01() throws Exception {
		String mweString = "module foo.Bar \n" +
		"import "+ComponentA.class.getName()+"\n" +
		"var y = 'y'" +
		"var z = 'z'" +
		"ComponentA auto-inject {\n" +
		"}";
		ComponentA result  = (ComponentA) getRoot(mweString);
		assertNotNull(result);
		assertEquals("y", result.getY().get(0));
		assertEquals("z", result.getZ());
	}
	
	@Test public void testAutoInject_02() throws Exception {
		String mweString = "module foo.Bar \n" +
		"import "+ComponentA.class.getName()+"\n" +
		"var y = 'y'" +
		"var z = 'z'" +
		"ComponentA {\n" +
		"  x = ComponentA auto-inject {\n" +
		"  }\n" +
		"}";
		ComponentA root  = (ComponentA) getRoot(mweString);
		ComponentA result = root.getX();
		assertNotNull(result);
		assertEquals("y", result.getY().get(0));
		assertEquals("z", result.getZ());
	}
	
	@Test public void testAutoInject_Bug347132_01() throws Exception {
		String mweString = "module foo.Bar \n" +
		"import "+ComponentA.class.getName()+"\n" +
		"var y = 'variableY'" +
		"var z = 'variableZ'" +
		"ComponentA auto-inject {\n" +
		"    y = 'y'\n" +
		"    z = 'z'\n" +
		"}";
		ComponentA result  = (ComponentA) getRoot(mweString);
		assertNotNull(result);
		assertEquals("y", result.getY().get(0));
		assertEquals(1, result.getY().size());
		assertEquals("z", result.getZ());
	}
	
	@Test public void testAutoInject_Bug347132_02() throws Exception {
		String mweString = "module foo.Bar \n" +
		"import "+ComponentA.class.getName()+"\n" +
		"var y = 'variableY'" +
		"var z = 'variableZ'" +
		"ComponentA {\n" +
		"  x = ComponentA auto-inject {" +
		"    y = 'y'\n" +
		"    z = 'z'\n" +
		"  }\n" +
		"}";
		ComponentA root  = (ComponentA) getRoot(mweString);
		ComponentA result = root.getX();
		assertNotNull(result);
		assertEquals("y", result.getY().get(0));
		assertEquals(1, result.getY().size());
		assertEquals("z", result.getZ());
	}
	
	private Object getRoot(String mweString) throws Exception {
		return getRootInstance(getModule(mweString));
	}

	private Module getModule(String string) throws Exception {
		return (Module) getModel(string);
	}
	
	private Object getRootInstance(Module m) {
		Mwe2ExecutionEngine engine = get(Mwe2ExecutionEngine.class);
		return engine.execute(m);
	}
}
