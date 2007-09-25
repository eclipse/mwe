/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.ui.internal.simpleEditor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class XMLConfiguration extends SourceViewerConfiguration {
    private XMLDoubleClickStrategy doubleClickStrategy;

    private XMLTagScanner tagScanner;

    private XMLScanner scanner;

    private ColorManager colorManager;

    public XMLConfiguration(final ColorManager colorManager) {
        this.colorManager = colorManager;
    }

    @Override
    public String[] getConfiguredContentTypes(final ISourceViewer sourceViewer) {
        return new String[] { IDocument.DEFAULT_CONTENT_TYPE, XMLPartitionScanner.XML_COMMENT,
                XMLPartitionScanner.XML_TAG };
    }

    @Override
    public ITextDoubleClickStrategy getDoubleClickStrategy(final ISourceViewer sourceViewer, final String contentType) {
        if (doubleClickStrategy == null)
            doubleClickStrategy = new XMLDoubleClickStrategy();
        return doubleClickStrategy;
    }

    protected XMLScanner getXMLScanner() {
        if (scanner == null) {
            scanner = new XMLScanner(colorManager);
            scanner.setDefaultReturnToken(new Token(
                    new TextAttribute(colorManager.getColor(XMLColorConstants.DEFAULT))));
        }
        return scanner;
    }

    protected XMLTagScanner getXMLTagScanner() {
        if (tagScanner == null) {
            tagScanner = new XMLTagScanner(colorManager);
            tagScanner
                    .setDefaultReturnToken(new Token(new TextAttribute(colorManager.getColor(XMLColorConstants.TAG))));
        }
        return tagScanner;
    }

    @Override
    public IPresentationReconciler getPresentationReconciler(final ISourceViewer sourceViewer) {
        final PresentationReconciler reconciler = new PresentationReconciler();

        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getXMLTagScanner());
        reconciler.setDamager(dr, XMLPartitionScanner.XML_TAG);
        reconciler.setRepairer(dr, XMLPartitionScanner.XML_TAG);

        dr = new DefaultDamagerRepairer(getXMLScanner());
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

        final NonRuleBasedDamagerRepairer ndr = new NonRuleBasedDamagerRepairer(new TextAttribute(colorManager
                .getColor(XMLColorConstants.XML_COMMENT)));
        reconciler.setDamager(ndr, XMLPartitionScanner.XML_COMMENT);
        reconciler.setRepairer(ndr, XMLPartitionScanner.XML_COMMENT);

        return reconciler;
    }

}