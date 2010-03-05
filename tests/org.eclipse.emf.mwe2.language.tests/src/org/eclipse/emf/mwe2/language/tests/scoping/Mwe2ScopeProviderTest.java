/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.scoping;

import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.scoping.Mwe2ScopeProvider;
import org.eclipse.emf.mwe2.language.tests.TestSetup;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentA;
import org.eclipse.emf.mwe2.language.tests.factory.ComponentAFactory;
import org.eclipse.emf.mwe2.language.tests.factory.SubTypeOfComponentA;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.scoping.IScope;

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
	
	public void testCreateComponentFeatureScope_1() throws Exception {
		Module model = (Module) getModel("module foo "+ComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = (JvmExecutable) scope.getContentByName("x").getEObjectOrProxy();
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getCanonicalName());
	}
	
	public void testCreateComponentFeatureScope_2() throws Exception {
		Module model = (Module) getModel("module foo "+ComponentAFactory.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = (JvmExecutable) scope.getContentByName("x").getEObjectOrProxy();
		assertEquals(ComponentAFactory.class.getName(),feature.getDeclaringType().getCanonicalName());
		feature = (JvmExecutable) scope.getContentByName("y").getEObjectOrProxy();
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getCanonicalName());
	}

	public void testCreateComponentFeatureScope_3() throws Exception {
		Module model = (Module) getModel("module foo "+SubTypeOfComponentA.class.getName()+"{}");
		IScope scope = getScopeProvider().createComponentFeaturesScope(model.getRoot());
		JvmExecutable feature = (JvmExecutable) scope.getContentByName("x").getEObjectOrProxy();
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getCanonicalName());
		feature = (JvmExecutable) scope.getContentByName("y").getEObjectOrProxy();
		assertEquals(ComponentA.class.getName(),feature.getDeclaringType().getCanonicalName());
	}
	
}
