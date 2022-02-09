/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.scoping;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.language.tests.Mwe2InjectorProvider;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.scoping.Mwe2ScopeProvider;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentA;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentAFactory;
import org.eclipse.emf.mwe2.language.tests.factory.SubTypeOfComponentA;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(Mwe2InjectorProvider.class)
public class Mwe2ScopeProviderTest {

	@Inject
	private Mwe2ScopeProvider scopeProvider;
	
	@Inject
	private ParseHelper<Module> parser;
	
	private Module getModel(String s) throws Exception {
		Module result = parser.parse(s);
		XtextResourceSet resourceSet = (XtextResourceSet) result.eResource().getResourceSet();
		resourceSet.setClasspathURIContext(getClass());
		return result;
	}
	
	private Mwe2ScopeProvider getScopeProvider() {
		return scopeProvider;
	}
	
	@Test public void testImplicitImportOfModulePackage_01() throws Exception {
		Module model = getModel("module java.util.foo "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().getScope(model, Mwe2Package.Literals.REFERRABLE__TYPE);
		assertNotNull(scope.getSingleElement(QualifiedName.create("java","util","List")));
		assertNotNull(scope.getSingleElement(QualifiedName.create("List")));
		assertNull(scope.getSingleElement(QualifiedName.create("BigDecimal")));
	}
	
	@Test public void testImplicitImportOfModulePackage_02() throws Exception {
		Module model = getModel("module java.math.foo "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().getScope(model, Mwe2Package.Literals.REFERRABLE__TYPE);
		assertNull(scope.getSingleElement(QualifiedName.create("List")));
		assertNotNull(scope.getSingleElement(QualifiedName.create("BigDecimal")));
	}
	
	@Test public void testImplicitImportOfModulePackage_03() throws Exception {
		Module model = getModel("module java.math.foo import java.math.* "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().getScope(model, Mwe2Package.Literals.REFERRABLE__TYPE);
		assertNull(scope.getSingleElement(QualifiedName.create("List")));
		assertNotNull(scope.getSingleElement(QualifiedName.create("BigDecimal")));
	}
	
	@Test public void testImplicitImportOfModulePackage_04() throws Exception {
		Module model = getModel("module java.MyModule "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().getScope(model, Mwe2Package.Literals.REFERRABLE__TYPE);
		assertNotNull(scope.getSingleElement(QualifiedName.create("math", "BigDecimal")));
		assertNotNull(scope.getSingleElement(QualifiedName.create("math.BigDecimal")));
		assertNull(scope.getSingleElement(QualifiedName.create("BigDecimal")));
	}
	
	@Test public void testCreateComponentFeatureScope_1() throws Exception {
		Module model = getModel("module foo "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = getScopedElementByName(scope, "x");
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getIdentifier());
	}

	
	@Test public void testCreateComponentFeatureScope_2() throws Exception {
		Module model = getModel("module foo "+ComponentAFactory.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = getScopedElementByName(scope, "x");
		assertEquals(ComponentAFactory.class.getName(),feature.getDeclaringType().getIdentifier());
		feature = getScopedElementByName(scope, "y");
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getIdentifier());
	}

	@Test public void testCreateComponentFeatureScope_3() throws Exception {
		Module model = getModel("module foo "+SubTypeOfComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = getScopedElementByName(scope, "x");
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getIdentifier());
		feature = getScopedElementByName(scope, "y");
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getIdentifier());
	}
	
	@Test public void testCreateReferableScope() throws Exception {
		Module model = getModel("module foo \n"
				+ "var a = 'foo'\n" 
				+ "var a.b = 'foo'\n" 
				+ ComponentA.class.getName() +"{\n"
				+ "  y = a"
				+ "  y = a.b"
				+ "}");
		Component componentA = model.getRoot();
		Assignment yAssignment = componentA.getAssignment().get(0);
		Reference reference = (Reference) yAssignment.getValue();
		IScope scope = getScopeProvider().getScope(reference, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE);
		assertNotNull(scope.getSingleElement(QualifiedName.create("a")));
		assertNotNull(scope.getSingleElement(QualifiedName.create("a", "b")));
		assertNull(scope.getSingleElement(QualifiedName.create("a.b")));
	}
	
	@Test public void testModuleInvocation() throws Exception {
		Resource res = getResourceFromString("module foo \n" +
				"var bar " +
				"String{}");
		Resource resource = res.getResourceSet().createResource(URI.createURI("hobbelbobble.mwe2"));
		resource.load(new StringInputStream("module hobblebobble @foo { bar = 'baz'}"), null);
		Module m = (Module) resource.getContents().get(0);
		assertTrue(""+m.getRoot().getAssignment().get(0).getFeature(),m.getRoot().getAssignment().get(0).getFeature() instanceof DeclaredProperty);
	}
	
	private Resource getResourceFromString(String string) throws Exception {
		return getModel(string).eResource();
	}

	private JvmExecutable getScopedElementByName(IScope scope, String name) {
		return (JvmExecutable) scope.getSingleElement(QualifiedName.create(name)).getEObjectOrProxy();
	}
}
