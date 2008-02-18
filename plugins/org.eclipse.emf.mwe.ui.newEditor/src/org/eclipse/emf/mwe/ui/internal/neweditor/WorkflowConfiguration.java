/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.neweditor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class WorkflowConfiguration extends SourceViewerConfiguration {
    private WorkflowDoubleClickStrategy doubleClickStrategy;

    private WorkflowTagScanner tagScanner;

    private WorkflowScanner scanner;

    private ColorManager colorManager;

    private WorkflowEditor editor;

    public WorkflowConfiguration(ColorManager colorManager,
            WorkflowEditor editor) {
        this.colorManager = colorManager;
        this.editor = editor;
    }

    @Override
    public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
        return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
                WorkflowPartitionScanner.XML_COMMENT,
                WorkflowPartitionScanner.XML_TAG };
    }

    @Override
    public ITextDoubleClickStrategy getDoubleClickStrategy(
            ISourceViewer sourceViewer, String contentType) {
        if (doubleClickStrategy == null)
            doubleClickStrategy = new WorkflowDoubleClickStrategy();
        return doubleClickStrategy;
    }

    @Override
    public IPresentationReconciler getPresentationReconciler(
            ISourceViewer sourceViewer) {
        PresentationReconciler reconciler = new PresentationReconciler();

        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(
                getXMLTagScanner());
        reconciler.setDamager(dr, WorkflowPartitionScanner.XML_TAG);
        reconciler.setRepairer(dr, WorkflowPartitionScanner.XML_TAG);

        dr = new DefaultDamagerRepairer(getXMLScanner());
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

        NonRuleBasedDamagerRepairer ndr = new NonRuleBasedDamagerRepairer(
                new TextAttribute(colorManager
                        .getColor(IWorkflowColorConstants.XML_COMMENT)));
        reconciler.setDamager(ndr, WorkflowPartitionScanner.XML_COMMENT);
        reconciler.setRepairer(ndr, WorkflowPartitionScanner.XML_COMMENT);

        return reconciler;
    }

    @Override
    public IReconciler getReconciler(ISourceViewer sourceViewer) {
        final WorkflowReconcilingStrategy strategy = new WorkflowReconcilingStrategy();
        strategy.setEditor(editor);
        MonoReconciler reconciler = new MonoReconciler(strategy, false);
        return reconciler;

    }

    protected WorkflowScanner getXMLScanner() {
        if (scanner == null) {
            scanner = new WorkflowScanner(colorManager);
            scanner.setDefaultReturnToken(new Token(new TextAttribute(
                    colorManager.getColor(IWorkflowColorConstants.DEFAULT))));
        }
        return scanner;
    }

    protected WorkflowTagScanner getXMLTagScanner() {
        if (tagScanner == null) {
            tagScanner = new WorkflowTagScanner(colorManager);
            tagScanner.setDefaultReturnToken(new Token(new TextAttribute(
                    colorManager.getColor(IWorkflowColorConstants.TAG))));
        }
        return tagScanner;
    }
}
