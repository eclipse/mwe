package org.eclipse.emf.mwe.di.execution;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.AbstractTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.service.InjectedService;
import org.eclipse.xtext.util.StringInputStream;

import test.ObjectB;

public class InstantiatorTest extends AbstractTests {
	@InjectedService
	private IParser parser;
	
	public void testSimple() throws Exception {
		IParseResult result = parser.parse(new StringInputStream("test.ObjectB { singleEle = test.ObjectA id a {name='foo'} multiEle += test.ObjectA{} multiEle += idRef a}"));
		File file = (File) result.getRootASTElement();
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectB obj = (ObjectB) instantiator.instantiate(file);
		assertEquals("foo",obj.singleEle.name);
		assertEquals(obj.singleEle,obj.multiEle.get(1));
		assertNull(obj.multiEle.get(0).name);
	}
	
	public void testTypeInferrence() throws Exception {
		IParseResult result = parser.parse(new StringInputStream("test.ObjectB { singleEle = id a {name='foo'} multiEle += {} multiEle += idRef a}"));
		File file = (File) result.getRootASTElement();
		assertNotNull(file);
		Instantiator instantiator = new Instantiator();
		ObjectB obj = (ObjectB) instantiator.instantiate(file);
		assertEquals("foo",obj.singleEle.name);
		assertEquals(obj.singleEle,obj.multiEle.get(1));
		assertNull(obj.multiEle.get(0).name);
	}
}
