/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.contentassist;

import org.eclipse.emf.mwe2.language.tests.UiTestSetup;
import org.eclipse.emf.mwe2.language.ui.Mwe2UiModule;
import org.eclipse.emf.mwe2.language.ui.internal.Mwe2Activator;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.junit4.ui.AbstractContentAssistProcessorTest;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class ContentAssistTest extends AbstractContentAssistProcessorTest {
	
	@BeforeClass
	public static void setUpProject() throws Exception {
		JavaProjectForTestProvider.setUp();
	}

	@AfterClass
	public static void tearDownProject() throws Exception {
		JavaProjectForTestProvider.tearDown();
	}
	
	@Override
	public ISetup doGetSetup() {
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
						return new JavaProjectForTestProvider();
					}
					
				};
			}
		};
	}
	
	@Test public void testEmptyModel() throws Exception {
		super.newBuilder().assertText("module");
	}
	
	@Test public void testClassDecl_01() throws Exception {
		newBuilder().append("java.util.ArrayList").assertText("java.util.ArrayList", ":", "{");
	}
	
	@Test public void testClassDecl_02() throws Exception {
		newBuilder().append("j.u.ArrayL").assertText("java.util.ArrayList", ":", "{");
	}
	
	@Test public void testClassDecl_03() throws Exception {
		newBuilder().append("uti.Arrayl").assertText("java.util.ArrayList", ":", "{");
	}
	
	@Test public void testClassDecl_04() throws Exception {
		newBuilder().append("j.u.ArrL").assertText("java.util.ArrayList", ":", "{");
	}
	
	@Test public void testClassDecl_05() throws Exception {
		newBuilder().append("uti.ArraL").assertText("java.util.ArrayList", ":", "{");
	}
	
	@Test public void testClassDecl_06() throws Exception {
		newBuilder().append("ArraList").assertText("java.util.ArrayList", "java.util.Arrays.ArrayList", ":", "{");
	}
	
	@Test public void testInsideClassDecl() throws Exception {
		newBuilder().append("java.util.ArrayList").assertTextAtCursorPosition(
				"java.util.ArrayLis", "java.util.ArrayLis".length(), "java.util.ArrayList", ":", "{");
	}
	
	@Test public void testInsideClassDeclWithImport() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.append("util.ArrayList").assertTextAtCursorPosition(
				"util.ArrayLis", "util.ArrayLis".length(), "util.ArrayList", ":", "{");
	}
	
	@Test public void testNestedClassDecl_01() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.append("all = java.util.ArrayLis").assertText("util.ArrayList", ":", "{", "}");
	}
	
	@Test public void testNestedClassDecl_02() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.append("all = j.u.ArrayLis").assertText("util.ArrayList", ":", "{", "}");
	}
	
	@Test public void testNestedClassDecl_03() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.append("all = uti.ArrayLis").assertText("util.ArrayList", ":", "{", "}");
	}
	
	@Test public void testNestedInsideClassDecl() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.appendNl("all = java.util.ArrayList {}")
			.append("}").assertTextAtCursorPosition(
					"util.ArrayLis", "util.ArrayLis".length(), "util.ArrayList", ":", "{", "}");
	}
	
	@Test public void testNestedInsideClassDeclWithImport() throws Exception {
		newBuilder()
			.appendNl("import java.*")
			.appendNl("util.HashSet {")
			.appendNl("all = util.ArrayList {}")
			.append("}").assertTextAtCursorPosition(
					"util.ArrayLis", "util.ArrayLis".length(), 
					"util.ArrayList",
					":", "{", "}");
	}
	
	@Test public void testReplaceRegion_01() throws Exception {
		String javaUtilArrayList = "java.util.ArrayList";
		ICompletionProposal[] proposals = newBuilder().append(javaUtilArrayList).computeCompletionProposals(javaUtilArrayList);
		for(ICompletionProposal proposal: proposals) {
			ConfigurableCompletionProposal casted = (ConfigurableCompletionProposal) proposal;
			int replaceContextLength = casted.getReplaceContextLength();
			assertEquals(javaUtilArrayList.length(), replaceContextLength);
		}
	}
	
	@Test public void testReplaceRegion_02() throws Exception {
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
	
	@Test public void testReplaceRegion_03() throws Exception {
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
	
	@Test public void testReplaceRegion_04() throws Exception {
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
	
	@Test public void testReplaceRegion_05() throws Exception {
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
	
	@Test public void testReplaceRegion_06() throws Exception {
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
	
	@Test public void testCompleteVarKeyword_01() throws Exception {
		ContentAssistProcessorTestBuilder builder = newBuilder();
		ICompletionProposal[] proposals = builder.computeCompletionProposals();
		for(ICompletionProposal proposal: proposals) {
			if ("var".equals(proposal.getDisplayString()))
				return;
		}
		fail("Missing proposal: 'var'; got: " + builder.toString(proposals));
	}
	
	@Test public void testCompleteVarKeyword_02() throws Exception {
		ContentAssistProcessorTestBuilder builder = newBuilder().append("var");
		ICompletionProposal[] proposals = builder.computeCompletionProposals();
		for(ICompletionProposal proposal: proposals) {
			if ("var".equals(proposal.getDisplayString()))
				return;
		}
		fail("Missing proposal: 'var'; got: " + builder.toString(proposals));
	}
	
	@Test public void testCompleteVarKeyword_03() throws Exception {
		ContentAssistProcessorTestBuilder builder = newBuilder().append("var foo = ''");
		ICompletionProposal[] proposals = builder.computeCompletionProposals();
		for(ICompletionProposal proposal: proposals) {
			if ("var".equals(proposal.getDisplayString()))
				return;
		}
		fail("Missing proposal: 'var'; got: " + builder.toString(proposals));
	}
	
	@Test public void testCompleteStringLiteral_01() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = ' ")
			.assertText(
					"${", "'");
	}
	
	@Test public void testCompleteStringLiteral_02() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = ' ${ ")
			.assertText(
					"message");
	}
	
	@Test public void testCompleteStringLiteral_03() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = ' $")
			.assertText(
					"${", "'");
	}
	
	@Test public void testCompleteStringLiteral_04() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ")
			.assertText(
					"${", "\"");
	}
	
	@Test public void testCompleteStringLiteral_05() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ${ ")
			.assertText(
					"message");
	}
	
	@Test public void testCompleteStringLiteral_06() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" $")
			.assertText(
					"${", "\"");
	}
	
	@Test public void testCompleteStringLiteral_07() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" $\"")
			.assertTextAtCursorPosition("$", 1,
					"${", "\"");
	}
	
	@Test public void testCompleteStringPropertyReference_01() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ${ message ")
			.assertText(
					"}");
	}
	
	@Test public void testCompleteStringPropertyReference_02() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ${ message")
			.assertText(
					"message", "}");
	}
	
	@Test public void testCompleteStringPropertyReference_03() throws Exception {
		newBuilder()
			.appendNl("var message = 'zonk'")
			.append("var other = \" ${ message}")
			.assertText(
					"${", "}", "\"");
	}
	
	@Test public void testCompleteProperty_01() throws Exception {
		newBuilder()
		.appendNl("StringBuilder {")
		.assertText(
				"length", "}" );
	}
	
	@Test public void testCompleteProperty_02() throws Exception {
		newBuilder()
		.appendNl("StringBuilder {")
		.append("len")
		.assertText(
				"length", "=" );
	}
	
	@Test public void testCompletePropertyValue_01() throws Exception {
		newBuilder()
		.appendNl("var zonk = '1'")
		.appendNl("StringBuilder {")
		.append("length = ")
		.assertText(
				"zonk", "\"", "'", "@", "auto-inject", "false", "true", ":", "{" );
	}
	
	@Test public void testCompletePropertyValue_02() throws Exception {
		newBuilder()
		.appendNl("var zonk = '1'")
		.appendNl("StringBuilder {")
		.appendNl("length = '1'")
		.append("length = ")
		.assertText(
				"zonk", "\"", "'", "@", "auto-inject", "false", "true", ":", "{" );
	}
	
	@Override
	protected ContentAssistProcessorTestBuilder newBuilder() throws Exception {
		return super.newBuilder().appendNl("module org.my.testmodel");
	}

}
