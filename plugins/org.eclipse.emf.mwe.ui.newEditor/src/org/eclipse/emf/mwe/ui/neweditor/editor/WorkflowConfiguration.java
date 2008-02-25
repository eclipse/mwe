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

package org.eclipse.emf.mwe.ui.neweditor.editor;

import org.eclipse.emf.mwe.ui.neweditor.format.DefaultFormattingStrategy;
import org.eclipse.emf.mwe.ui.neweditor.format.DocTypeFormattingStrategy;
import org.eclipse.emf.mwe.ui.neweditor.format.ProcessingInstructionFormattingStrategy;
import org.eclipse.emf.mwe.ui.neweditor.format.TextFormattingStrategy;
import org.eclipse.emf.mwe.ui.neweditor.format.WorkflowFormattingStrategy;
import org.eclipse.emf.mwe.ui.neweditor.scanners.WorkflowPartitionScanner;
import org.eclipse.emf.mwe.ui.neweditor.scanners.WorkflowScanner;
import org.eclipse.emf.mwe.ui.neweditor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.formatter.ContentFormatter;
import org.eclipse.jface.text.formatter.IContentFormatter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.7 $
 */
public class WorkflowConfiguration extends SourceViewerConfiguration {
    private WorkflowDoubleClickStrategy doubleClickStrategy;

    private WorkflowTagScanner tagScanner;

    private WorkflowScanner scanner;

    private final ColorManager colorManager;

    private final WorkflowEditor editor;

    public WorkflowConfiguration(final ColorManager colorManager,
            final WorkflowEditor editor) {
        this.colorManager = colorManager;
        this.editor = editor;
    }

    @Override
    public String[] getConfiguredContentTypes(final ISourceViewer sourceViewer) {
        return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
                WorkflowPartitionScanner.XML_START_TAG,
                WorkflowPartitionScanner.XML_END_TAG,
                WorkflowPartitionScanner.XML_PROCESSING_INSTRUCTION,
                WorkflowPartitionScanner.XML_DOCTYPE,
                WorkflowPartitionScanner.XML_CDATA,
                WorkflowPartitionScanner.XML_TEXT };
    }

    /**
     * This method overrides the implementation of
     * <code>getContentFormatter</code> inherited from the superclass.
     * 
     * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getContentFormatter(org.eclipse.jface.text.source.ISourceViewer)
     */
    @Override
    public IContentFormatter getContentFormatter(
            final ISourceViewer sourceViewer) {
        final ContentFormatter formatter = new ContentFormatter();

        final WorkflowFormattingStrategy formattingStrategy =
                new WorkflowFormattingStrategy();
        final DefaultFormattingStrategy defaultStrategy =
                new DefaultFormattingStrategy();
        final TextFormattingStrategy textStrategy =
                new TextFormattingStrategy();
        final DocTypeFormattingStrategy docTypeStrategy =
                new DocTypeFormattingStrategy();
        final ProcessingInstructionFormattingStrategy processingInstructionStrategy =
                new ProcessingInstructionFormattingStrategy();

        formatter.setFormattingStrategy(defaultStrategy,
                IDocument.DEFAULT_CONTENT_TYPE);
        formatter.setFormattingStrategy(textStrategy,
                WorkflowPartitionScanner.XML_TEXT);
        formatter.setFormattingStrategy(docTypeStrategy,
                WorkflowPartitionScanner.XML_DOCTYPE);
        formatter.setFormattingStrategy(processingInstructionStrategy,
                WorkflowPartitionScanner.XML_PROCESSING_INSTRUCTION);
        formatter.setFormattingStrategy(textStrategy,
                WorkflowPartitionScanner.XML_CDATA);
        formatter.setFormattingStrategy(formattingStrategy,
                WorkflowPartitionScanner.XML_START_TAG);
        formatter.setFormattingStrategy(formattingStrategy,
                WorkflowPartitionScanner.XML_END_TAG);

        return formatter;
    }

    @Override
    public ITextDoubleClickStrategy getDoubleClickStrategy(
            final ISourceViewer sourceViewer, final String contentType) {
        if (doubleClickStrategy == null)
            doubleClickStrategy = new WorkflowDoubleClickStrategy();
        return doubleClickStrategy;
    }

    @Override
    public IPresentationReconciler getPresentationReconciler(
            final ISourceViewer sourceViewer) {
        final PresentationReconciler reconciler = new PresentationReconciler();

        DefaultDamagerRepairer dr =
                new DefaultDamagerRepairer(getWorkflowTagScanner());
        reconciler.setDamager(dr, WorkflowPartitionScanner.XML_START_TAG);
        reconciler.setRepairer(dr, WorkflowPartitionScanner.XML_START_TAG);

        dr = new DefaultDamagerRepairer(getWorkflowScanner());
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

        final NonRuleBasedDamagerRepairer ndr =
                new NonRuleBasedDamagerRepairer(new TextAttribute(colorManager
                        .getColor(WorkflowColorConstants.XML_COMMENT)));
        reconciler.setDamager(ndr, WorkflowPartitionScanner.XML_COMMENT);
        reconciler.setRepairer(ndr, WorkflowPartitionScanner.XML_COMMENT);

        return reconciler;
    }

    @Override
    public IReconciler getReconciler(final ISourceViewer sourceViewer) {
        final WorkflowReconcilingStrategy strategy =
                new WorkflowReconcilingStrategy();
        strategy.setEditor(editor);
        final MonoReconciler reconciler = new MonoReconciler(strategy, false);
        return reconciler;

    }

    protected WorkflowScanner getWorkflowScanner() {
        if (scanner == null) {
            scanner = new WorkflowScanner(colorManager);
            scanner.setDefaultReturnToken(new Token(new TextAttribute(
                    colorManager.getColor(WorkflowColorConstants.DEFAULT))));
        }
        return scanner;
    }

    protected WorkflowTagScanner getWorkflowTagScanner() {
        if (tagScanner == null) {
            tagScanner = new WorkflowTagScanner(colorManager);
            tagScanner.setDefaultReturnToken(new Token(new TextAttribute(
                    colorManager.getColor(WorkflowColorConstants.TAG))));
        }
        return tagScanner;
    }
}
