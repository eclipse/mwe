/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui;

import org.eclipse.emf.mwe2.language.ui.highlighting.MweHighlightingConfiguration;
import org.eclipse.emf.mwe2.language.ui.highlighting.SemanticHighlightingCalculator;
import org.eclipse.emf.mwe2.language.ui.highlighting.TokenDefProvider;
import org.eclipse.emf.mwe2.language.ui.highlighting.TokenToAttributeMapper;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

import com.google.inject.Binder;
import com.google.inject.Provider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class Mwe2UiModule extends org.eclipse.emf.mwe2.language.ui.AbstractMwe2UiModule {
	public Mwe2UiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configureHighlightingTokenDefProvider(Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.ITokenDefProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING)).to(TokenDefProvider.class);
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return TokenToAttributeMapper.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SemanticHighlightingCalculator.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return MweHighlightingConfiguration.class;
	}
	
	public Class<? extends Provider<? extends XtextResourceSet>> provideXtextResourceSet() {
		return MweUiResourceSetProvider.class;
	}
	
}
