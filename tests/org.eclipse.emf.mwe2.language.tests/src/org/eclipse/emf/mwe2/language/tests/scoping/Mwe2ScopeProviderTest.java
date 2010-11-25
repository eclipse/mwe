/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.scoping;

import static org.eclipse.xtext.scoping.Selectors.*;

import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.scoping.Mwe2ScopeProvider;
import org.eclipse.emf.mwe2.language.tests.TestSetup;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentA;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentAFactory;
import org.eclipse.emf.mwe2.language.tests.factory.SubTypeOfComponentA;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.ISelector;

public class Mwe2ScopeProviderTest extends AbstractXtextTests {

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new TestSetup());
	}
	
	@Override
	public Mwe2ScopeProvider getScopeProvider() {
		return (Mwe2ScopeProvider) super.getScopeProvider();
	}
	
	public void testImplicitImportOfModulePackage_01() throws Exception {
		Module model = (Module) getModel("module java.util.foo "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().getScope(model, Mwe2Package.Literals.REFERRABLE__TYPE);
		assertNotNull(scope.getSingleElement(selectByName(QualifiedName.create("java","util","List"))));
		assertNotNull(scope.getSingleElement(selectByName(QualifiedName.create("List"))));
		assertNull(scope.getSingleElement(selectByName(QualifiedName.create("BigDecimal"))));
	}
	
	public void testImplicitImportOfModulePackage_02() throws Exception {
		Module model = (Module) getModel("module java.math.foo "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().getScope(model, Mwe2Package.Literals.REFERRABLE__TYPE);
		assertNull(scope.getSingleElement(selectByName(QualifiedName.create("List"))));
		assertNotNull(scope.getSingleElement(selectByName(QualifiedName.create("BigDecimal"))));
	}
	
	public void testImplicitImportOfModulePackage_03() throws Exception {
		Module model = (Module) getModel("module java.math.foo import java.math.* "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().getScope(model, Mwe2Package.Literals.REFERRABLE__TYPE);
		assertNull(scope.getSingleElement(selectByName(QualifiedName.create("List"))));
		assertNotNull(scope.getSingleElement(selectByName(QualifiedName.create("BigDecimal"))));
	}
	
	public void testCreateComponentFeatureScope_1() throws Exception {
		Module model = (Module) getModel("module foo "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = getScopedElementByName(scope, "x");
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getCanonicalName());
	}

	
	public void testCreateComponentFeatureScope_2() throws Exception {
		Module model = (Module) getModel("module foo "+ComponentAFactory.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = getScopedElementByName(scope, "x");
		assertEquals(ComponentAFactory.class.getName(),feature.getDeclaringType().getCanonicalName());
		feature = getScopedElementByName(scope, "y");
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getCanonicalName());
	}

	public void testCreateComponentFeatureScope_3() throws Exception {
		Module model = (Module) getModel("module foo "+SubTypeOfComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = getScopedElementByName(scope, "x");
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getCanonicalName());
		feature = getScopedElementByName(scope, "y");
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getCanonicalName());
	}
	
	public void testCreateReferableScope() throws Exception {
		Module model = (Module) getModel("module foo \n"
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
		assertNotNull(scope.getSingleElement(new ISelector.SelectByName(QualifiedName.create("a"))));
		assertNotNull(scope.getSingleElement(new ISelector.SelectByName(QualifiedName.create("a", "b"))));
		assertNull(scope.getSingleElement(new ISelector.SelectByName(QualifiedName.create("a.b"))));
	}
	
	private JvmExecutable getScopedElementByName(IScope scope, String name) {
		return (JvmExecutable) scope.getSingleElement(new ISelector.SelectByName(QualifiedName.create(name))).getEObjectOrProxy();
	}
}
