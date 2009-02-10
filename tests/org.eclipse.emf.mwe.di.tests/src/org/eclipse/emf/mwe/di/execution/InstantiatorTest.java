package org.eclipse.emf.mwe.di.execution;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.QualifiedName;
import org.eclipse.emf.mwe.di.AbstractTests;

import test.ObjectA;
import test.ObjectB;

public class InstantiatorTest extends AbstractTests {

	public void testEmfImport() throws Exception {
		MwePackage.eINSTANCE.getAssignable(); // initialize
		final File file =
				createModelFile("import '" + MwePackage.eNS_URI
						+ "'; QualifiedName {parts = 'foo'}");
		assertNotNull(file);
		final QualifiedName obj = (QualifiedName) instantiate(file);
		assertEquals("foo", obj.getParts().get(0));
	}

	public void testJavaImport() throws Exception {
		final File file =
				createModelFile("import test.*; ObjectA {name = 'foo'}");
		assertNotNull(file);
		final ObjectA obj = (ObjectA) instantiate(file);
		assertEquals("foo", obj.name);
	}

	public void testJavaImport2() throws Exception {
		final File file =
				createModelFile("import test.ObjectA; ObjectA {name = 'foo'}");
		assertNotNull(file);
		final ObjectA obj = (ObjectA) instantiate(file);
		assertEquals("foo", obj.name);
	}

	public void testJavaImport3() throws Exception {
		final File file =
				createModelFile("import test.ObjectB; ObjectA {name = 'foo'}");
		assertNotNull(file);
		try {
			instantiate(file);
			fail("exception expected");
		} catch (final Exception e) {
			// expected
		}
	}

	public void testSimple() throws Exception {
		final File file =
				createModelFile("test.ObjectB { singleEle = test.ObjectA:a {name='foo';} multiEle = test.ObjectA{} multiEle = a;}");
		assertNotNull(file);
		final ObjectB obj = (ObjectB) instantiate(file);
		assertEquals("foo", obj.singleEle.name);
		assertEquals(obj.singleEle, obj.multiEle.get(1));
		assertNull(obj.multiEle.get(0).name);
	}

	public void testTypeInference() throws Exception {
		final File file =
				createModelFile("test.ObjectB { singleEle = :a {name='foo'} multiEle = {} multiEle = a;}");
		assertNotNull(file);
		final ObjectB obj = (ObjectB) instantiate(file);
		assertEquals("foo", obj.singleEle.name);
		assertEquals(obj.singleEle, obj.multiEle.get(1));
		assertNull(obj.multiEle.get(0).name);
	}

	public void testVarReplacement() throws Exception {
		final File file =
				createModelFile("var x = 'bar'; test.ObjectA {name = 'foo${x}'}");
		assertNotNull(file);
		final ObjectA obj = (ObjectA) instantiate(file);
		assertEquals("foobar", obj.name);
	}

	public void testVarReplacement2() throws Exception {
		final File file =
				createModelFile("var x = 'bar'; var y = '_${x}_'; test.ObjectA {name = 'fo${y}o${x}'}");
		assertNotNull(file);
		final ObjectA obj = (ObjectA) instantiate(file);
		assertEquals("fo_bar_obar", obj.name);
	}

	private File createModelFile(String string) throws Exception {
		return (File) getModel(string);
	}

	public void testWorkflowRef() throws Exception {
		final File file =
				(File) getModel("test.ObjectB {another = file 'classpath:/test/Workflow.mwe'{}}");
		assertNotNull(file);
		final ObjectB obj = (ObjectB) instantiate(file);
		assertNotNull(obj.another);
	}
}
