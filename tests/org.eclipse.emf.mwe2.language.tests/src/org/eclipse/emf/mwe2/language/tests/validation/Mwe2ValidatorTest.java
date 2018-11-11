/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.validation;

import static org.junit.Assert.*;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.language.Mwe2InjectorProvider;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentA;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentAFactory;
import org.eclipse.emf.mwe2.language.tests.factory.SubTypeOfComponentA;
import org.eclipse.emf.mwe2.language.validation.Mwe2JavaValidator;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(Mwe2InjectorProvider.class)
public class Mwe2ValidatorTest {
	@Inject
	private ParseHelper<Module> parser;
	
	private Module getModel(String s) throws Exception {
		Module result = parser.parse(s);
		XtextResourceSet resourceSet = (XtextResourceSet) result.eResource().getResourceSet();
		resourceSet.setClasspathURIContext(getClass());
		return result;
	}
	
	@Test public void testAssignability() throws Exception {
		String textModel = "module foo "+ComponentA.class.getName()+" { y = true }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),1,list.size());
		assertEquals(Mwe2JavaValidator.INCOMPATIBLE_ASSIGNMENT, list.get(0).getCode());
	}
	
	@Test public void testAssignability_2() throws Exception {
		String textModel = "module foo "+ComponentA.class.getName()+" { y = 'foo' x = 'bar' }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(1,list.size());
		assertEquals(Mwe2JavaValidator.INCOMPATIBLE_ASSIGNMENT, list.get(0).getCode());
	}
	
	@Test public void testAssignability_3() throws Exception {
		String textModel = "module foo "+ComponentA.class.getName()+" { x = "+SubTypeOfComponentA.class.getName()+"{} }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(0,list.size());
	}
	
	@Test public void testAssignability_4() throws Exception {
		String textModel = "module foo "+SubTypeOfComponentA.class.getName()+" { sub = "+ComponentA.class.getName()+"{} }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(1,list.size());
		assertEquals(Mwe2JavaValidator.INCOMPATIBLE_ASSIGNMENT, list.get(0).getCode());
	}
	
	@Test public void testAssignability_5() throws Exception {
		String textModel = "module foo "+ComponentA.class.getName()+" { b = true i = 1 d = 1.1 }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(0,list.size());
	}
	
	@Test public void testAssignability_6() throws Exception {
		String textModel = "module foo "+ComponentA.class.getName()+" { d = 1 }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(0,list.size());
	}
	
	@Test public void testAssignability_withFactory() throws Exception {
		String textModel = "module foo "+ComponentA.class.getName()+" { x = "+ComponentAFactory.class.getName()+"{} }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(0,list.size());
	}
	
	@Test public void testVarAssignability_withFactory() throws Exception {
		String textModel = "module foo var "+ComponentA.class.getName()+" x = "+ComponentAFactory.class.getName()+"{} String {}";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),1,list.size()); // unused WARNING
	}
	@Test public void testVarAssignability_1() throws Exception {
		String textModel = "module foo var "+String.class.getName()+" x = 'x' String {}";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),1,list.size()); // unused WARNING
	}
	
	@Test public void testVarAssignability_2() throws Exception {
		String textModel = "module foo var "+String.class.getName()+" x = true String {}";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),2,list.size()); // unused WARNING
	}
	
	@Test public void testVarAssignability_3() throws Exception {
		String textModel = "module foo var "+Boolean.class.getName()+" x = true String {}";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),1,list.size()); // unused WARNING
	}
	
	@Test public void testVarAssignability_4() throws Exception {
		String textModel = "module foo var "+Boolean.class.getName()+" x = 'foo' String {}";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),2,list.size()); // unused WARNING
	}
	
	@Test public void testUnusedLocalVariable() throws Exception {
		String textModel = "module foo var foo = 'holla' "+ComponentA.class.getName()+" : ups{ x = ups y = foo }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(0,list.size());
	}
	@Test public void testUnusedLocalVariable_1() throws Exception {
		String textModel = "module foo var foo = 'holla' "+ComponentA.class.getName()+" : ups{ x = ups }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(1,list.size());
		assertEquals(Mwe2JavaValidator.UNUSED_LOCAL, list.get(0).getCode());
		assertEquals(Severity.WARNING, list.get(0).getSeverity());
	}
	
	@Test public void testUnusedLocalVariable_2() throws Exception {
		String textModel = "module foo var foo = 'holla' "+ComponentA.class.getName()+" : ups { y = foo }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(1,list.size());
		assertEquals(Mwe2JavaValidator.UNUSED_LOCAL, list.get(0).getCode());
		assertEquals(Severity.WARNING, list.get(0).getSeverity());
	}
	
	@Test public void testUnusedLocalVariable_3() throws Exception {
		String textModel = "module foo var foo = 'holla' var bar = '${foo}!' "+ComponentA.class.getName()+"{ y = bar}";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),0,list.size());
	}
	
	@Test public void testUnusedLocalVariable_4() throws Exception {
		String textModel = "module foo var y = 'holla' "+ComponentA.class.getName()+" auto-inject { }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),0,list.size());
	}
	
	@Test public void testUnusedLocalVariable_5() throws Exception {
		String textModel = "module foo var y = 'holla' "+ComponentA.class.getName()+" auto-inject { y = 'zonk' }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(1,list.size());
		assertEquals(Mwe2JavaValidator.UNUSED_LOCAL, list.get(0).getCode());
		assertEquals(Severity.WARNING, list.get(0).getSeverity());
	}
	
	@Test public void testUnusedLocalVariable_6() throws Exception {
		String textModel = "module foo var y = 'holla' "+ComponentA.class.getName()+" auto-inject { y = y }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),0,list.size());
	}
	
	@Test public void testUnusedLocalVariable_7() throws Exception {
		String textModel = "module foo var y = 'holla' "+ComponentA.class.getName()+" auto-inject { y = '${y}' }";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),0,list.size());
	}
	
	@Test public void testUnusedLocalVariable_8() throws Exception {
		String textModel_1 = "module foo var foo.bar = 'holla' @bar auto-inject {}";
		String textModel_2 = "module bar var foo.bar = '' "+ComponentA.class.getName()+" { y = foo.bar }";
		EObject model_2 = getModel(textModel_2);
		Resource resource_1 = model_2.eResource().getResourceSet().createResource(URI.createURI("does_not_matter.mwe2"));
		resource_1.load(new StringInputStream(textModel_1), null);
		List<Issue> list = validate(resource_1.getContents().get(0));
		assertEquals(list.toString(),0,list.size());
	}
	
	@Test public void testDuplicateLocalVariable_1() throws Exception {
		String textModel = "module foo var foo = 'holla' var foo = '${foo}!' "+ComponentA.class.getName()+"{ y = foo}";
		EObject model = getModel(textModel);
		List<Issue> list = validate(model);
		assertEquals(list.toString(),2,list.size());
		assertEquals(Mwe2JavaValidator.DUPLICATE_LOCAL, list.get(1).getCode());
		assertEquals(Severity.ERROR, list.get(1).getSeverity());
	}
	
	@Test public void testMandatoryProperty_1() throws Exception {
		String textModel_1 = "module foo @bar { foo = 'zonk' }";
		String textModel_2 = "module bar var foo.bar var foo "+ComponentA.class.getName()+" { y = foo.bar }";
		EObject model_2 = getModel(textModel_2);
		Resource resource_1 = model_2.eResource().getResourceSet().createResource(URI.createURI("does_not_matter.mwe2"));
		resource_1.load(new StringInputStream(textModel_1), null);
		List<Issue> list = validate(resource_1.getContents().get(0));
		assertEquals(list.toString(), 1, list.size());
		assertEquals(Mwe2JavaValidator.MISSING_MANDATORY_FEATURE, list.get(0).getCode());
		assertEquals(Severity.ERROR, list.get(0).getSeverity());
		assertTrue(list.get(0).getMessage(), list.get(0).getMessage().contains("foo.bar"));
	}
	
	private List<Issue> validate(EObject model) {
		XtextResource res = ((XtextResource)model.eResource());
		List<Issue> list = res.getResourceServiceProvider().getResourceValidator().validate(res, CheckMode.ALL, CancelIndicator.NullImpl);
		return list;
	}

}
