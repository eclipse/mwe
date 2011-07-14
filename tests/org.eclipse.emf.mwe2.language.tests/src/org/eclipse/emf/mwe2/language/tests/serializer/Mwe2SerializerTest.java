/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.serializer;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.junit.serializer.SerializerTester;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class Mwe2SerializerTest extends AbstractXtextTests {
	private SerializerTester tester;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(new Mwe2StandaloneSetup());
		tester = get(SerializerTester.class);
	}

	public void testSimple() throws Exception {
		StringBuilder module = new StringBuilder();
		module.append("module foo\n");
		module.append("org.eclipse.emf.mwe2.runtime.workflow.Workflow {}");
		tester.assertSerializeWithNodeModel(module.toString());
		tester.assertSerializeWithoutNodeModel(module.toString());
	}

	public void testIntegration() throws Exception {
		StringBuilder module = new StringBuilder();
		module.append("module foo\n");
		module.append("var bool1 = true\n");
		module.append("var bool2 = false\n");
		module.append("var str1 = 'xxx${bool1}xx'\n");
		module.append("var str2 = \"xxx${bool2}xx\"\n");
		module.append("var comp1 = org.eclipse.emf.mwe2.runtime.workflow.Workflow {} \n");
		module.append("var ref1 = bool1 \n");
		module.append("org.eclipse.emf.mwe2.runtime.workflow.Workflow {\n");
		module.append("    bean = java.lang.String {}");
		module.append("    component = @foo {}");
		module.append("    component = @foo : bar.baz auto-inject {}");
		module.append("}");
		tester.assertSerializeWithNodeModel(module.toString());
		tester.assertSerializeWithoutNodeModel(module.toString());
	}

	public void testStrings() throws Exception {
		StringBuilder module = new StringBuilder();
		module.append("module foo\n");
		module.append("var bool1 = true\n");
		module.append("var bool2 = false\n");
		module.append("var str1 = 'xxx${bool1}xx'\n");
		module.append("var str2 = \"xxx${bool2}xx\"\n");
		module.append("var str3 = \" xxx ${ bool2 } xx \"\n");
		module.append("var str4 = \"xxx${bool1}${bool2}xx\"\n");
		module.append("var str5 = \"${bool1}\"\n");
		module.append("var str6 = '${bool1}'\n");
		module.append("org.eclipse.emf.mwe2.runtime.workflow.Workflow {}");
		tester.assertSerializeWithNodeModel(module.toString());
		tester.assertSerializeWithoutNodeModel(module.toString());
	}

	public void testComponents() throws Exception {
		StringBuilder module = new StringBuilder();
		module.append("module foo\n");
		module.append("org.eclipse.emf.mwe2.runtime.workflow.Workflow {\n");
		module.append("    bean = java.lang.String {}");
		module.append("    component = @foo {}");
		module.append("    component = @foo : bar.baz auto-inject {}");
		module.append("    component = :other {}");
		module.append("    bean = {}");
		module.append("}");
		for (Component comp : EcoreUtil2.getAllContentsOfType(getModel(module.toString()), Component.class)) {
			tester.assertSerializeWithNodeModel(comp);
			tester.assertSerializeWithoutNodeModel(comp);
		}
	}

}
