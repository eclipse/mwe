/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.language.Mwe2InjectorProvider;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentA;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(Mwe2InjectorProvider.class)
public class ActualTypeComputationTest {

	@Inject
	private ParseHelper<Module> parser;
	
	private Module getModel(String s) throws Exception {
		Module result = parser.parse(s);
		XtextResourceSet resourceSet = (XtextResourceSet) result.eResource().getResourceSet();
		resourceSet.setClasspathURIContext(getClass());
		return result;
	}
	
	@Test public void testInferredLiteralTypes() throws Exception {
		checkPropertyType("a = 'myString'", String.class);
		checkPropertyType("a = true", boolean.class);
		checkPropertyType("a = java.util.ArrayList {}", ArrayList.class);
		checkPropertyType("a = java.util.Arrays.ArrayList {}", Class.forName("java.util.Arrays$ArrayList"));
	}
	
	@Test public void testInferredComponentType() throws Exception {
		String typeName = ComponentA.class.getName();
		Module module = getModel("module myModule " + typeName + " {"
				+ "  x = {}"
				+ "}");
		Assignment assignment = module.getRoot().getAssignment().get(0);
		JvmType assignedType = assignment.getValue().getActualType();
		assertNotNull(assignedType);
		assertFalse("eIsProxy", assignedType.eIsProxy());
		assertEquals(typeName, assignedType.getIdentifier());
	}
	
	@Test public void testLiteralTypes() throws Exception {
		checkPropertyType("java.lang.CharSequence a = 'myString'", CharSequence.class);
		checkPropertyType("boolean a", boolean.class);
		checkPropertyType("java.util.List a = java.util.ArrayList {}", List.class);
	}
	
	@Test public void testReferenceTypes() throws Exception {
		checkPropertyType("CharSequence a = 'myString' var b = a", CharSequence.class);
		checkPropertyType("boolean a var b = a", boolean.class);
		checkPropertyType("java.util.List a = java.util.ArrayList {} var b = a", List.class);
	}
	
	@Test public void testDefaultType() throws Exception {
		checkPropertyType("a", String.class);
	}
	
	@Test public void testModuleType() throws Exception {
		Module stringModule = getModel("module stringModule String {}");
		JvmType stringType = stringModule.getRoot().getActualType();
		assertNotNull(stringType);
		assertFalse("eIsProxy", stringType.eIsProxy());
		assertEquals(String.class.getName(), stringType.getIdentifier());
		Module referingModule = getModel("module referingModule java.util.ArrayList {}");
		referingModule.getRoot().setModule(stringModule);
		referingModule.getRoot().setType(null);
		JvmType referingRootType = referingModule.getRoot().getActualType();
		assertSame(stringType, referingRootType);
	}
	
	protected void checkPropertyType(String input, Class<?> expected) throws Exception {
		Module module = getModelAndExpect("module myModule var " + input, 1);
		List<DeclaredProperty> properties = module.getDeclaredProperties();
		DeclaredProperty property = properties.get(properties.size() - 1);
		JvmType type = property.getActualType();
		assertNotNull(type);
		assertFalse("eIsProxy", type.eIsProxy());
		assertEquals(expected.getName(), type.getIdentifier());
	}

	private Module getModelAndExpect(String string, int errors) throws Exception {
		Module result = getModel(string);
		EcoreUtil.resolveAll(result);
		EList<Diagnostic> errorList = result.eResource().getErrors();
		assertEquals(errorList.toString(), errors, errorList.size());
		return result;
	}
	
}
