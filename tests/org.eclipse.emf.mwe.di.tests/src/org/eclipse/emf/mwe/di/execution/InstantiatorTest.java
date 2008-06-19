package org.eclipse.emf.mwe.di.execution;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.MwePackage;
import org.eclipse.emf.mwe.QualifiedName;
import org.eclipse.emf.mwe.di.AbstractTests;

import test.ObjectA;
import test.ObjectB;

public class InstantiatorTest extends AbstractTests {

	public void testSimple() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"),
				"test.ObjectB { singleEle = test.ObjectA:a {name='foo';} multiEle = test.ObjectA{} multiEle = a;}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectB obj = (ObjectB) instantiator.instantiate(file);
		assertEquals("foo", obj.singleEle.name);
		assertEquals(obj.singleEle, obj.multiEle.get(1));
		assertNull(obj.multiEle.get(0).name);
	}

	public void testTypeInferrence() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"),
				"test.ObjectB { singleEle = :a {name='foo'} multiEle = {} multiEle = a;}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectB obj = (ObjectB) instantiator.instantiate(file);
		assertEquals("foo", obj.singleEle.name);
		assertEquals(obj.singleEle, obj.multiEle.get(1));
		assertNull(obj.multiEle.get(0).name);
	}

	public void testWorflowRef() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"),
				"test.ObjectB {another = file 'classpath:/test/Workflow.mwe'{}}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectB obj = (ObjectB) instantiator.instantiate(file);
		assertNotNull(obj.another);
	}

	public void testVarReplacement() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"), "var x = 'bar'; test.ObjectA {name = 'foo${x}'}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectA obj = (ObjectA) instantiator.instantiate(file);
		assertEquals("foobar", obj.name);
	}

	public void testVarReplacement2() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"),
				"var x = 'bar'; var y = '_${x}_'; test.ObjectA {name = 'fo${y}o${x}'}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectA obj = (ObjectA) instantiator.instantiate(file);
		assertEquals("fo_bar_obar", obj.name);
	}

	public void testJavaImport() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"), "import test.*; ObjectA {name = 'foo'}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectA obj = (ObjectA) instantiator.instantiate(file);
		assertEquals("foo", obj.name);
	}

	public void testJavaImport2() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"), "import test.ObjectA; ObjectA {name = 'foo'}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectA obj = (ObjectA) instantiator.instantiate(file);
		assertEquals("foo", obj.name);
	}

	public void testJavaImport3() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"), "import test.ObjectB; ObjectA {name = 'foo'}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		try {
			instantiator.instantiate(file);
			fail("exception expected");
		} catch (Exception e) {
			// expected
		}
	}

	public void testEmfImport() throws Exception {
		MwePackage.eINSTANCE.getAssignable(); // initialize
		File file = (File) loadModel(URI.createURI("foo.mwe"), "import '" + MwePackage.eNS_URI
				+ "'; QualifiedName {parts = 'foo'}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		QualifiedName obj = (QualifiedName) instantiator.instantiate(file);
		assertEquals("foo", obj.getParts().get(0));
	}
}
