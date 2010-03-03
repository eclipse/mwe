package org.eclipse.emf.mwe2.language.tests.factory;

import java.util.ArrayList;

import org.eclipse.emf.mwe2.language.factory.Mwe2ExecutionEngine;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.tests.TestSetup;
import org.eclipse.xtext.junit.AbstractXtextTests;

public class Mwe2ExecutionEngineTest extends AbstractXtextTests {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(new TestSetup());
	}
		
	public void testSimple() throws Exception {
		ArrayList<?> m  = (ArrayList<?>) getRoot("module foo.Bar java.util.ArrayList{}");
		assertNotNull(m);
	}
	
	public void testComplex_1() throws Exception {
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
//FIXME : problem with StringLiteral	
//	public void testComplex_2() throws Exception {
//		String mweString = "module foo.Bar \n" +
//		"import "+ComponentA.class.getName()+"\n" +
//		"var baz = 'b'\n" +
//		"ComponentA : a{\n" +
//		"  x = ComponentA {\n" +
//		"    x = a\n" +
//		"    y = 'a ${baz}'\n" +
//		"    y = baz\n" +
//		"  }\n" +
//		"  y = 'foo'\n" +
//		"}";
//		ComponentA result  = (ComponentA) getRoot(mweString);
//		assertNotNull(result);
//		assertSame(result.getX().getX(),result);
//		assertEquals("a b", result.getX().getY().get(0));
//		assertEquals("b", result.getX().getY().get(1));
//	}
	
	public void testComplex_3() throws Exception {
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
	
	public void testFactory_3() throws Exception {
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
	
	private Object getRoot(String mweString) throws Exception {
		System.out.println(mweString);
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
