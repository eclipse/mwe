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

package org.eclipse.emf.mwe.ui.internal.editor.editor;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.emf.mwe.ui.internal.editor.factories.AbstractWorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.factories.impl.xml.XMLWorkflowSyntaxFactoryImpl;
import org.eclipse.emf.mwe.ui.internal.editor.format.DefaultFormattingStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.format.DocTypeFormattingStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.format.ProcessingInstructionFormattingStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.format.TextFormattingStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.format.WorkflowFormattingStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.hover.ProblemHover;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.CDataScanner;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowPartitionScanner;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowScanner;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTextScanner;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.IUndoManager;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextViewerUndoManager;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.formatter.ContentFormatter;
import org.eclipse.jface.text.formatter.IContentFormatter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.18 $
 */
public class WorkflowEditorConfiguration extends TextSourceViewerConfiguration {

	private static final int UNDO_LEVELS = 100;

	private WorkflowDoubleClickStrategy doubleClickStrategy;

	private WorkflowTagScanner tagScanner;

	private WorkflowScanner scanner;

	private WorkflowTextScanner textScanner;

	private CDataScanner cdataScanner;

	private final ColorManager colorManager;

	private final WorkflowEditor editor;

	private final WorkflowEditorPlugin plugin;

	private final AbstractWorkflowSyntaxFactory factory;

	public WorkflowEditorConfiguration(final WorkflowEditorPlugin plugin,
			final ColorManager colorManager, final WorkflowEditor editor) {
		super(plugin.getCombinedPreferenceStore());
		this.plugin = plugin;
		this.colorManager = colorManager;
		this.editor = editor;

		// TODO Preliminary code. The factory has to be installed depending on
		// the document content.
		AbstractWorkflowSyntaxFactory
				.installFactory(new XMLWorkflowSyntaxFactoryImpl());

		factory = AbstractWorkflowSyntaxFactory.getInstance();
	}

	/**
	 * This method overrides the implementation of
	 * <code>getAnnotationHover</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getAnnotationHover(org.eclipse.jface.text.source.ISourceViewer)
	 */
	@Override
	public IAnnotationHover getAnnotationHover(final ISourceViewer sourceViewer) {
		return new ProblemHover(sourceViewer);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getAutoEditStrategies</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getAutoEditStrategies(org.eclipse.jface.text.source.ISourceViewer,
	 *      java.lang.String)
	 */
	@Override
	public IAutoEditStrategy[] getAutoEditStrategies(
			final ISourceViewer sourceViewer, final String contentType) {
		final IAutoEditStrategy[] inheritedStrategies =
				super.getAutoEditStrategies(sourceViewer, contentType);
		final List<IAutoEditStrategy> strategies =
				new LinkedList<IAutoEditStrategy>();
		for (final IAutoEditStrategy s : inheritedStrategies) {
			strategies.add(s);
		}
		strategies.add(new DefaultIndentLineAutoEditStrategy());
		strategies.addAll(factory.newAutoEditStrategyCollection());
		final IAutoEditStrategy[] res =
				strategies.toArray(new IAutoEditStrategy[strategies.size()]);
		return res;
	}

	@Override
	public String[] getConfiguredContentTypes(final ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
				WorkflowPartitionScanner.XML_START_TAG,
				WorkflowPartitionScanner.XML_END_TAG,
				WorkflowPartitionScanner.XML_PROCESSING_INSTRUCTION,
				WorkflowPartitionScanner.XML_DOCTYPE,
				WorkflowPartitionScanner.XML_TEXT };
	}

	/**
	 * This method overrides the implementation of
	 * <code>getContentAssistant</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getContentAssistant(org.eclipse.jface.text.source.ISourceViewer)
	 */
	@Override
	public IContentAssistant getContentAssistant(
			final ISourceViewer sourceViewer) {
		final ContentAssistant assistant = new ContentAssistant();

		IContentAssistProcessor contentAssistProcessor =
				factory.newContentAssistProcessor(editor, colorManager);
		assistant.setContentAssistProcessor(contentAssistProcessor,
				IDocument.DEFAULT_CONTENT_TYPE);
		contentAssistProcessor =
				factory.newContentAssistProcessor(editor, colorManager);
		assistant.setContentAssistProcessor(contentAssistProcessor,
				WorkflowPartitionScanner.XML_START_TAG);
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant
				.setProposalPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
		assistant
				.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
		return assistant;
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
		formatter.setFormattingStrategy(formattingStrategy,
				WorkflowPartitionScanner.XML_START_TAG);
		formatter.setFormattingStrategy(formattingStrategy,
				WorkflowPartitionScanner.XML_END_TAG);

		return formatter;
	}

	@Override
	public ITextDoubleClickStrategy getDoubleClickStrategy(
			final ISourceViewer sourceViewer, final String contentType) {
		if (doubleClickStrategy == null) {
			doubleClickStrategy = new WorkflowDoubleClickStrategy();
		}
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

		dr = new DefaultDamagerRepairer(getWorkflowTagScanner());
		reconciler.setDamager(dr, WorkflowPartitionScanner.XML_END_TAG);
		reconciler.setRepairer(dr, WorkflowPartitionScanner.XML_END_TAG);

		dr = new DefaultDamagerRepairer(getWorkflowScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		dr = new DefaultDamagerRepairer(getWorkflowScanner());
		reconciler.setDamager(dr, WorkflowPartitionScanner.XML_DOCTYPE);
		reconciler.setRepairer(dr, WorkflowPartitionScanner.XML_DOCTYPE);

		dr = new DefaultDamagerRepairer(getWorkflowScanner());
		reconciler.setDamager(dr,
				WorkflowPartitionScanner.XML_PROCESSING_INSTRUCTION);
		reconciler.setRepairer(dr,
				WorkflowPartitionScanner.XML_PROCESSING_INSTRUCTION);

		dr = new DefaultDamagerRepairer(getWorkflowTextScanner());
		reconciler.setDamager(dr, WorkflowPartitionScanner.XML_TEXT);
		reconciler.setRepairer(dr, WorkflowPartitionScanner.XML_TEXT);

		final TextAttribute textAttribute =
				new TextAttribute(colorManager
						.getColor(WorkflowColorConstants.XML_COMMENT));
		final NonRuleBasedDamagerRepairer ndr =
				new NonRuleBasedDamagerRepairer(textAttribute);
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

	/**
	 * This method overrides the implementation of <code>getTextHover</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getTextHover(org.eclipse.jface.text.source.ISourceViewer,
	 *      java.lang.String)
	 */
	@Override
	public ITextHover getTextHover(final ISourceViewer sourceViewer,
			final String contentType) {
		return new ProblemHover(sourceViewer);
	}

	/**
	 * This method overrides the implementation of <code>getUndoManager</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getUndoManager(org.eclipse.jface.text.source.ISourceViewer)
	 */
	@Override
	public IUndoManager getUndoManager(final ISourceViewer sourceViewer) {
		return new TextViewerUndoManager(UNDO_LEVELS);
	}

	protected CDataScanner getCDataScanner() {
		if (cdataScanner == null) {
			cdataScanner = new CDataScanner(colorManager);
			cdataScanner
					.setDefaultReturnToken(new Token(
							new TextAttribute(
									colorManager
											.getColor(WorkflowColorConstants.CDATA_TEXT))));
		}
		return cdataScanner;
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

	protected WorkflowTextScanner getWorkflowTextScanner() {
		if (textScanner == null) {
			textScanner = new WorkflowTextScanner(colorManager);
			textScanner.setDefaultReturnToken(new Token(new TextAttribute(
					colorManager.getColor(WorkflowColorConstants.DEFAULT))));
		}
		return textScanner;
	}

}
