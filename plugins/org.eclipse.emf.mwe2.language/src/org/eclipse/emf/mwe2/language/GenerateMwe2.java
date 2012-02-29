/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language;

import org.eclipse.emf.mwe.utils.DirectoryCleaner;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.emf.mwe2.runtime.workflow.Workflow;
import org.eclipse.emf.mwe2.runtime.workflow.WorkflowContextImpl;
import org.eclipse.xtext.generator.Generator;
import org.eclipse.xtext.generator.LanguageConfig;
import org.eclipse.xtext.generator.builder.BuilderIntegrationFragment;
import org.eclipse.xtext.generator.exporting.QualifiedNamesFragment;
import org.eclipse.xtext.generator.formatting.FormatterFragment;
import org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment;
import org.eclipse.xtext.generator.parser.antlr.ex.ExternalAntlrLexerFragment;
import org.eclipse.xtext.generator.parser.antlr.ex.ca.ContentAssistParserGeneratorFragment;
import org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment;
import org.eclipse.xtext.generator.resourceFactory.ResourceFactoryFragment;
import org.eclipse.xtext.generator.scoping.ImportNamespacesScopingFragment;
import org.eclipse.xtext.generator.serializer.SerializerFragment;
import org.eclipse.xtext.generator.types.TypesGeneratorFragment;
import org.eclipse.xtext.generator.validation.JavaValidatorFragment;
import org.eclipse.xtext.ui.generator.compare.CompareFragment;
import org.eclipse.xtext.ui.generator.contentAssist.JavaBasedContentAssistFragment;
import org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment;
import org.eclipse.xtext.ui.generator.outline.OutlineTreeProviderFragment;
import org.eclipse.xtext.ui.generator.outline.QuickOutlineFragment;
import org.eclipse.xtext.ui.generator.quickfix.QuickfixProviderFragment;
import org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment;
import org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment;

/**
 * Java version of a workflow used in order to avoid unnecessary bootstrapping and circular dependency problems.
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class GenerateMwe2 {
	public static void main(String[] args) {

		final String grammarURI = "classpath:/org/eclipse/emf/mwe2/language/Mwe2.xtext";
		final String file_extensions = "mwe2";
		final String projectName = "org.eclipse.emf.mwe2.language";
		final String runtimeProject = "../"+projectName+"";
		final String uiProject = ""+runtimeProject+".ui";

		Workflow workflow = new Workflow() {
			{
				addBean(new StandaloneSetup() {
					{
						setPlatformUri(runtimeProject+"/../..");
						setPlatformUri(runtimeProject+"/../../../org.eclipse.xtext");
					}
				});

				addComponent(new DirectoryCleaner() {
					{
						setDirectory(""+runtimeProject+"/emf-gen");
					}
				});

				addComponent(new org.eclipse.emf.mwe2.ecore.EcoreGenerator() {
					{
						setGenModel("platform:/resource/"+projectName+"/model/Mwe2.genmodel");
						addSrcPath("platform:/resource/"+projectName+"/src");
					}
				});

				addComponent(new DirectoryCleaner() {
					{
						setDirectory(""+runtimeProject+"/src-gen");
					}
				});

				addComponent(new DirectoryCleaner() {
					{
						setDirectory(""+runtimeProject+".ui/src-gen");
					}
				});

				addComponent(new Generator() {
					{
						setPathRtProject(runtimeProject);
						setPathUiProject(uiProject);
						setProjectNameRt(projectName);
						setProjectNameUi(""+projectName+".ui");

						addLanguage(new LanguageConfig() {
							{
								setUri(grammarURI);
								setFileExtensions(file_extensions);

								// Java API to access grammar elements (required by several other fragments)
								addFragment(new GrammarAccessFragment());

								// the serialization component
								addFragment(new SerializerFragment());

								// a custom ResourceFactory for use with EMF
								ResourceFactoryFragment resourceFragment = new ResourceFactoryFragment();
								resourceFragment.setFileExtensions(file_extensions);
								addFragment(resourceFragment);

								addFragment(new AntlrGeneratorFragment());

								ExternalAntlrLexerFragment antlrFragment1 = new ExternalAntlrLexerFragment();
								antlrFragment1.setLexerGrammar("org.eclipse.emf.mwe2.language.lexer.Mwe2Lexer");
								antlrFragment1.setRuntime(true);
								antlrFragment1.addAntlrParam("-lib");
								antlrFragment1.addAntlrParam(""+runtimeProject+"/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/lexer");
								addFragment(antlrFragment1);

								// java-based API for validation 
								JavaValidatorFragment validationFragment = new JavaValidatorFragment();
								validationFragment.addComposedCheck("org.eclipse.xtext.validation.ImportUriValidator");
								addFragment(validationFragment);

								// scoping API 
								addFragment(new ImportNamespacesScopingFragment());

								// java types 
								addFragment(new TypesGeneratorFragment());

								// formatter API 
								addFragment(new FormatterFragment());

								// labeling API 
								addFragment(new LabelProviderFragment());

								// outline API 
								addFragment(new OutlineTreeProviderFragment());
								addFragment(new QuickOutlineFragment());

								// java-based API for content assistance 
								addFragment(new JavaBasedContentAssistFragment());

								addFragment(new ContentAssistParserGeneratorFragment());

								addFragment(new BuilderIntegrationFragment());
								addFragment(new QualifiedNamesFragment());
								
								ExternalAntlrLexerFragment antlrFragment2 = new ExternalAntlrLexerFragment();
								antlrFragment2.setLexerGrammar("org.eclipse.emf.mwe2.language.ui.highlighting.MweHighlightingLexer");
								antlrFragment2.setHighlighting(true);
								addFragment(antlrFragment2);

								ExternalAntlrLexerFragment antlrFragment3 = new ExternalAntlrLexerFragment();
								antlrFragment3.setLexerGrammar("org.eclipse.emf.mwe2.language.ui.contentassist.Mwe2ContentAssistLexer");
								antlrFragment3.setContentAssist(true);
								antlrFragment3.addAntlrParam("-lib");
								antlrFragment3.addAntlrParam(""+uiProject+"/src-gen/org/eclipse/emf/mwe2/language/ui/contentassist/antlr/lexer");
								addFragment(antlrFragment3);
								// quickfix API 
								addFragment(new QuickfixProviderFragment());
								
								// refactoring
								RefactorElementNameFragment refactoringFragment = new RefactorElementNameFragment();
								refactoringFragment.setUseJdtRefactoring(true);
								addFragment(refactoringFragment);
								
								CompareFragment compareFragment = new CompareFragment();
								compareFragment.setFileExtensions(file_extensions);
								addFragment(compareFragment);
								
								addFragment(new CodetemplatesGeneratorFragment());
							}
						});
					}
				});
			}
		};

		workflow.preInvoke();
		workflow.run(new WorkflowContextImpl());
		workflow.postInvoke();
	}
}
