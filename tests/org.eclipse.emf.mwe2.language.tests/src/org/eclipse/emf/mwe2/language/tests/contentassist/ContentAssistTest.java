/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.contentassist;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe2.language.tests.JavaProjectForTestProvider;
import org.eclipse.emf.mwe2.language.tests.UiTestSetup;
import org.eclipse.emf.mwe2.language.ui.Mwe2UiModule;
import org.eclipse.emf.mwe2.language.ui.internal.Mwe2Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.junit.editor.contentassist.AbstractContentAssistProcessorTest;
import org.eclipse.xtext.ui.junit.editor.contentassist.ContentAssistProcessorTestBuilder;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class ContentAssistTest extends AbstractContentAssistProcessorTest implements IJavaProjectProvider {
	
	private JavaProjectForTestProvider javaProjectForTestProvider;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		javaProjectForTestProvider = new JavaProjectForTestProvider();
	}
	
	@Override
	protected void tearDown() throws Exception {
		javaProjectForTestProvider = null;
		super.tearDown();
	}
	
	public ISetup getSetup() {
		return new UiTestSetup() {
			
			@Override
			protected Mwe2UiModule createUiModule(Mwe2Activator activator) {
				return new Mwe2UiModule(Mwe2Activator.getInstance()) {
					@Override
					public Class<? extends IJavaProjectProvider> bindIJavaProjectProvider() {
						return null;
					}
					@SuppressWarnings("unused")
					public IJavaProjectProvider bindIJavaProjectProviderInstance() {
						return ContentAssistTest.this;
					}
					
				};
			}
		};
	}
	
	public void testEmptyModel() throws Exception {
		newBuilder(getSetup()).assertText("module");
	}
	
	public void testClassDecl_01() throws Exception {
		newBuilder().append("java.util.ArrayList").assertText("java.util.ArrayList", ":", "{");
	}
	
	public void testClassDecl_02() throws Exception {
		newBuilder().append("j.u.ArrayL").assertText("java.util.ArrayList", ":", "{");
	}
	
	public void testClassDecl_03() throws Exception {
		newBuilder().append("uti.Arrayl").assertText("java.util.ArrayList", ":", "{");
	}
	
	public void testInsideClassDecl() throws Exception {
		newBuilder().append("java.util.ArrayList").assertTextAtCursorPosition(
				"java.util.ArrayLis", "java.util.ArrayLis".length(), "java.util.ArrayList", ":", "{");
	}
	
	public void testInsideClassDeclWithImport() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.append("util.ArrayList").assertTextAtCursorPosition(
				"util.ArrayLis", "util.ArrayLis".length(), "util.ArrayList", ":", "{");
	}
	
	public void testNestedClassDecl_01() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.append("all = java.util.ArrayLis").assertText("util.ArrayList", ":", "{", "}");
	}
	
	public void testNestedClassDecl_02() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.append("all = j.u.ArrayLis").assertText("util.ArrayList", ":", "{", "}");
	}
	
	public void testNestedClassDecl_03() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.append("all = uti.ArrayLis").assertText("util.ArrayList", ":", "{", "}");
	}
	
	public void testNestedInsideClassDecl() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.appendNl("all = java.util.ArrayList {}")
			.append("}").assertTextAtCursorPosition(
					"util.ArrayLis", "util.ArrayLis".length(), "util.ArrayList", ":", "{", "}");
	}
	
	public void testNestedInsideClassDeclWithImport() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.appendNl("all = util.ArrayList {}")
			.append("}").assertTextAtCursorPosition(
					"util.ArrayLis", "util.ArrayLis".length(), 
					"util.ArrayList",
					":", "{", "}");
	}
	
	public void testReplaceRegion_01() throws Exception {
		String javaUtilArrayList = "java.util.ArrayList";
		ICompletionProposal[] proposals = newBuilder().append(javaUtilArrayList).computeCompletionProposals(javaUtilArrayList);
		for(ICompletionProposal proposal: proposals) {
			ConfigurableCompletionProposal casted = (ConfigurableCompletionProposal) proposal;
			int replaceContextLength = casted.getReplaceContextLength();
			assertEquals(javaUtilArrayList.length(), replaceContextLength);
		}
	}
	
	public void testReplaceRegion_02() throws Exception {
		ICompletionProposal[] proposals = newBuilder().append("java.util.ArrayList").computeCompletionProposals("ava.util.ArrayList");
		for(ICompletionProposal proposal: proposals) {
			ConfigurableCompletionProposal casted = (ConfigurableCompletionProposal) proposal;
			int replaceContextLength = casted.getReplaceContextLength();
			if (casted.getDisplayString().equals(":") || casted.getDisplayString().equals("{")) {
				assertEquals(casted.getDisplayString(), "ava.util.ArrayList".length(), replaceContextLength);
			} else {
				assertEquals(casted.getDisplayString(), "java.util.ArrayList".length(), replaceContextLength);
			}
		}
	}
	
	public void testReplaceRegion_03() throws Exception {
		ICompletionProposal[] proposals = newBuilder()
			.appendNl("java.util.HashSet {")
			.appendNl("all = java.util.ArrayList {}")
			.append("}").computeCompletionProposals("java.util.ArrayList");
		for(ICompletionProposal proposal: proposals) {
			ConfigurableCompletionProposal casted = (ConfigurableCompletionProposal) proposal;
			int replaceContextLength = casted.getReplaceContextLength();
			assertEquals("java.util.ArrayList".length(), replaceContextLength);
		}
	}
	
	public void testReplaceRegion_04() throws Exception {
		ICompletionProposal[] proposals = newBuilder()
			.appendNl("java.util.HashSet {")
			.appendNl("all =java.util.ArrayList {}")
			.append("}").computeCompletionProposals("java.util.ArrayList");
		for(ICompletionProposal proposal: proposals) {
			ConfigurableCompletionProposal casted = (ConfigurableCompletionProposal) proposal;
			int replaceContextLength = casted.getReplaceContextLength();
			if ("=".equals(casted.getDisplayString()))
				assertEquals(casted.getDisplayString(), "=java.util.ArrayList".length(), replaceContextLength);
			else
				assertEquals(casted.getDisplayString(), "java.util.ArrayList".length(), replaceContextLength);
		}
	}
	
	public void testReplaceRegion_05() throws Exception {
		ICompletionProposal[] proposals = newBuilder()
			.appendNl("java.util.HashSet {")
			.appendNl("all = java.util.ArrayList {}")
			.append("}").computeCompletionProposals("ava.util.ArrayList");
		for(ICompletionProposal proposal: proposals) {
			ConfigurableCompletionProposal casted = (ConfigurableCompletionProposal) proposal;
			int replaceContextLength = casted.getReplaceContextLength();
			if (casted.getDisplayString().equals(":") || 
					casted.getDisplayString().equals("{") ||
					casted.getDisplayString().equals("}")) {
				assertEquals(casted.getDisplayString(), "ava.util.ArrayList".length(), replaceContextLength);
			} else {
				assertEquals(casted.getDisplayString(), "java.util.ArrayList".length(), replaceContextLength);
			}
		}
	}
	
	public void testReplaceRegion_06() throws Exception {
		ICompletionProposal[] proposals = newBuilder()
			.appendNl("java.util.HashSet {")
			.appendNl("all =java.util.ArrayList {}")
			.append("}").computeCompletionProposals("ava.util.ArrayList");
		for(ICompletionProposal proposal: proposals) {
			ConfigurableCompletionProposal casted = (ConfigurableCompletionProposal) proposal;
			int replaceContextLength = casted.getReplaceContextLength();
			if (casted.getDisplayString().equals(":") || 
					casted.getDisplayString().equals("{") ||
					casted.getDisplayString().equals("}")) {
				assertEquals(casted.getDisplayString(), "ava.util.ArrayList".length(), replaceContextLength);
			} else {
				assertEquals(casted.getDisplayString(), "java.util.ArrayList".length(), replaceContextLength);
			}
		}
	}
	
	public void testCompleteVarKeyword_01() throws Exception {
		ContentAssistProcessorTestBuilder builder = newBuilder();
		ICompletionProposal[] proposals = builder.computeCompletionProposals();
		for(ICompletionProposal proposal: proposals) {
			if ("var".equals(proposal.getDisplayString()))
				return;
		}
		fail("Missing proposal: 'var'; got: " + builder.toString(proposals));
	}
	
	public void testCompleteVarKeyword_02() throws Exception {
		ContentAssistProcessorTestBuilder builder = newBuilder().append("var");
		ICompletionProposal[] proposals = builder.computeCompletionProposals();
		for(ICompletionProposal proposal: proposals) {
			if ("var".equals(proposal.getDisplayString()))
				return;
		}
		fail("Missing proposal: 'var'; got: " + builder.toString(proposals));
	}
	
	public void testCompleteVarKeyword_03() throws Exception {
		ContentAssistProcessorTestBuilder builder = newBuilder().append("var foo = ''");
		ICompletionProposal[] proposals = builder.computeCompletionProposals();
		for(ICompletionProposal proposal: proposals) {
			if ("var".equals(proposal.getDisplayString()))
				return;
		}
		fail("Missing proposal: 'var'; got: " + builder.toString(proposals));
	}
	
	public void testCompleteStringLiteral_01() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = ' ")
			.assertText(
					"${", "'");
	}
	
	public void testCompleteStringLiteral_02() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = ' ${ ")
			.assertText(
					"message");
	}
	
	public void testCompleteStringLiteral_03() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = ' $")
			.assertText(
					"${", "'");
	}
	
	public void testCompleteStringLiteral_04() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ")
			.assertText(
					"${", "\"");
	}
	
	public void testCompleteStringLiteral_05() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ${ ")
			.assertText(
					"message");
	}
	
	public void testCompleteStringLiteral_06() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" $")
			.assertText(
					"${", "\"");
	}
	
	public void testCompleteStringLiteral_07() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" $\"")
			.assertTextAtCursorPosition("$", 1,
					"${", "\"");
	}
	
	public void testCompleteStringPropertyReference_01() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ${ message ")
			.assertText(
					"}");
	}
	
	public void testCompleteStringPropertyReference_02() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ${ message")
			.assertText(
					"message", "}");
	}
	
	public void testCompleteStringPropertyReference_03() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ${ message}")
			.assertText(
					"${", "}", "\"");
	}
	
	public void testCompleteProperty_01() throws Exception {
		newBuilder()
		.appendNl("StringBuilder {")
		.assertText(
				"length", "}" );
	}
	
	public void testCompleteProperty_02() throws Exception {
		newBuilder()
		.appendNl("StringBuilder {")
		.append("len")
		.assertText(
				"length", "=" );
	}
	
	public void testCompletePropertyValue_01() throws Exception {
		newBuilder()
		.appendNl("var zonk = '1'")
		.appendNl("StringBuilder {")
		.append("length = ")
		.assertText(
				"zonk", "\"", "'", "@", "auto-inject", "false", "true", ":", "{" );
	}
	
	public void testCompletePropertyValue_02() throws Exception {
		newBuilder()
		.appendNl("var zonk = '1'")
		.appendNl("StringBuilder {")
		.appendNl("length = '1'")
		.append("length = ")
		.assertText(
				"zonk", "\"", "'", "@", "auto-inject", "false", "true", ":", "{" );
	}
	
	protected ContentAssistProcessorTestBuilder newBuilder() throws Exception {
		return newBuilder(getSetup()).appendNl("module org.my.testmodel");
	}

	public IJavaProject getJavaProject(ResourceSet resourceSet) {
		return javaProjectForTestProvider.getJavaProject(resourceSet);
	}
	
}
