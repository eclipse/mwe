/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language;

import org.eclipse.emf.mwe2.ecore.EcoreGenerator;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.DefaultGeneratorModule;
import org.eclipse.xtext.xtext.generator.StandardLanguage;
import org.eclipse.xtext.xtext.generator.XtextGenerator;
import org.eclipse.xtext.xtext.generator.generator.GeneratorFragment2;
import org.eclipse.xtext.xtext.generator.junit.JUnitFragment;
import org.eclipse.xtext.xtext.generator.model.ManifestAccess;
import org.eclipse.xtext.xtext.generator.model.project.BundleProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.StandardProjectConfig;
import org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2;
import org.eclipse.xtext.xtext.generator.parser.antlr.ex.ExternalAntlrLexerFragment;
import org.eclipse.xtext.xtext.generator.types.TypesGeneratorFragment2;

/**
 * @author Christian Dietrich - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class GenerateMwe2 {
	
	public static void main(String[] args) {
		final String genModel = "platform:/resource/org.eclipse.emf.mwe2.language/model/Mwe2.genmodel";
		final String root = "..";
		final String projectName = "org.eclipse.emf.mwe2.language";
		final String runtimeProject = root + "/" + projectName;
		final String runtimeTestProject = root + "/../tests/" + "org.eclipse.emf.mwe2.language.tests";
		final String ideProject = root + "/" + "org.eclipse.emf.mwe2.language.ide";
		final String uiProject = root + "/" + "org.eclipse.emf.mwe2.language.ui";
		final String lineDelimiter = "\n";
		final String fileHeader = "/*******************************************************************************\n" +
			" * Copyright (c) 2010, ${year} itemis AG (http://www.itemis.eu) and others.\n" +
			" * This program and the accompanying materials are made available under the\n" +
			" * terms of the Eclipse Public License 2.0 which is available at\n" +
			" * http://www.eclipse.org/legal/epl-2.0.\n" +
			" *\n" +
			" * SPDX-License-Identifier: EPL-2.0\n" +
			" *******************************************************************************/";
		final XtextGenerator generator = new XtextGenerator() {{
			setConfiguration(new DefaultGeneratorModule() {{
				setProject(new StandardProjectConfig() {{
					setRootPath(root);
					setBaseName(projectName);
					setCreateEclipseMetaData(true);
					BundleProjectConfig eclipsePlugin = getEclipsePlugin();
					eclipsePlugin.setEnabled(true);
					eclipsePlugin.setRoot(uiProject);
					BundleProjectConfig runtimeTest = getRuntimeTest();
					runtimeTest.setEnabled(true);
					runtimeTest.setRoot(runtimeTestProject);
					ManifestAccess manifestAccessRuntimeTest = new ManifestAccess();
					manifestAccessRuntimeTest.setMerge(false);
					runtimeTest.setManifest(manifestAccessRuntimeTest);
					BundleProjectConfig eclipsePluginTest = getEclipsePluginTest();
					eclipsePluginTest.setEnabled(true);
					eclipsePluginTest.setRoot(runtimeTestProject);
					ManifestAccess manifestAccessPluginTest = new ManifestAccess();
					manifestAccessPluginTest.setMerge(false);
					eclipsePluginTest.setManifest(manifestAccessPluginTest);
				}});
				setCode(new CodeConfig() {{
					setEncoding("ISO-8859-1");
					setLineDelimiter(lineDelimiter);
					setFileHeader(fileHeader);
					setPreferXtendStubs(false);
				}});
				
				addLanguage(new StandardLanguage() {
					{
						addReferencedResource(genModel);
						setName("org.eclipse.emf.mwe2.language.Mwe2");
						setFileExtensions("mwe2");
						setGenerator(new GeneratorFragment2() {{
							setGenerateStub(false);
						}});
						setParserGenerator(new XtextAntlrGeneratorFragment2() {{
							setCombinedGrammar(false);
						}});
						JUnitFragment junitFragment = new JUnitFragment();
						junitFragment.setGenerateStub(false);
						setJunitSupport(junitFragment);
						getFragments().add(new TypesGeneratorFragment2());
						ExternalAntlrLexerFragment antlrFragment1 = new ExternalAntlrLexerFragment();
						antlrFragment1.setLexerGrammar("org.eclipse.emf.mwe2.language.lexer.Mwe2Lexer");
						antlrFragment1.setRuntime(true);
						antlrFragment1.addAntlrParam("-lib");
						antlrFragment1.addAntlrParam(""+runtimeProject+"/src-gen/org/eclipse/emf/mwe2/language/parser/antlr/lexer");
						getFragments().add(antlrFragment1);
						
						ExternalAntlrLexerFragment antlrFragment2 = new ExternalAntlrLexerFragment();
						antlrFragment2.setLexerGrammar("org.eclipse.emf.mwe2.language.ui.highlighting.MweHighlightingLexer");
						antlrFragment2.setHighlighting(true);
						getFragments().add(antlrFragment2);

						ExternalAntlrLexerFragment antlrFragment3 = new ExternalAntlrLexerFragment();
						antlrFragment3.setLexerGrammar("org.eclipse.emf.mwe2.language.ide.contentassist.Mwe2ContentAssistLexer");
						antlrFragment3.setContentAssist(true);
						antlrFragment3.addAntlrParam("-lib");
						antlrFragment3.addAntlrParam(""+ideProject+"/src-gen/org/eclipse/emf/mwe2/language/ide/contentassist/antlr/lexer");
						getFragments().add(antlrFragment3);
					}
				});
			}});
		}};
		generator.preInvoke();
		
		new EcoreGenerator() {{
			setGenModel(genModel);
			addSrcPath("platform:/resource/" + projectName + "/src");
			addSrcPath("platform:/resource/org.eclipse.xtext.common.types/src");
			setLineDelimiter(lineDelimiter);
		}}.invoke(null);
		
		generator.invoke(null);
		generator.postInvoke();
		
	}

}
