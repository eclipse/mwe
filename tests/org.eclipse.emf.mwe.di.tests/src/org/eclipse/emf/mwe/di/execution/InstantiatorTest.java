package org.eclipse.emf.mwe.di.execution;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.AbstractTests;

import test.ObjectB;

public class InstantiatorTest extends AbstractTests {
	
	public void testSimple() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"),"test.ObjectB { singleEle = test.ObjectA id a {name='foo'} multiEle = test.ObjectA{} multiEle = idRef a}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectB obj = (ObjectB) instantiator.instantiate(file);
		assertEquals("foo",obj.singleEle.name);
		assertEquals(obj.singleEle,obj.multiEle.get(1));
		assertNull(obj.multiEle.get(0).name);
	}
	
	public void testTypeInferrence() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"),"test.ObjectB { singleEle = id a {name='foo'} multiEle = {} multiEle = idRef a}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectB obj = (ObjectB) instantiator.instantiate(file);
		assertEquals("foo",obj.singleEle.name);
		assertEquals(obj.singleEle,obj.multiEle.get(1));
		assertNull(obj.multiEle.get(0).name);
	}
	
	
	public void testWorflowRef() throws Exception {
		File file = (File) loadModel(URI.createURI("foo.mwe"),"test.ObjectB {another = file 'classpath:/test/Workflow.mwe'{}}");
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectB obj = (ObjectB) instantiator.instantiate(file);
		assertNotNull(obj.another);
	}
}
