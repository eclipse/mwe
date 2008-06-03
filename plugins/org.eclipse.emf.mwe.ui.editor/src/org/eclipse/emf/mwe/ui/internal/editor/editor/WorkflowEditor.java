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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.mwe.internal.ui.debug.breakpoint.actions.BreakpointActionGroup;
import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.emf.mwe.ui.internal.editor.analyzer.ElementIterator;
import org.eclipse.emf.mwe.ui.internal.editor.analyzer.references.ReferenceInfo;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.outline.WorkflowContentOutlinePage;
import org.eclipse.emf.mwe.ui.internal.editor.utils.DocumentParser;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.24 $
 */
public class WorkflowEditor extends TextEditor {

	private ProjectionAnnotationModel annotationModel;

	private final ColorManager colorManager;

	private ProjectionSupport projectSupport;

	private BreakpointActionGroup actionGroup;

	private WorkflowContentOutlinePage outlinePage;

	private Job job;

	private WorkflowElement rootElement;

	private Collection<WorkflowElement> elements;

	private Collection<WorkflowAttribute> attributes;

	private Collection<String> propertyNames;

	private Collection<ReferenceInfo> references;

	private Collection<ReferenceInfo> referenceDefinitions;

	public WorkflowEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new WorkflowEditorConfiguration(
				WorkflowEditorPlugin.getDefault(), colorManager, this));
		setDocumentProvider(new WorkflowDocumentProvider());
	}

	public void createMarker(final IDocument document, final String msg,
			final int line, final int column) {
		try {
			final IFile file = getInputFile();
			final int lineOffset = document.getLineOffset(line);
			final int start = lineOffset + column;
			int end = start;
			if (end < document.getLength()) {
				end++;
			}

			final ElementPositionRange range =
				new ElementPositionRange(document, start, end);
			MarkerManager.createMarkerFromRange(file, document, msg, range,
					true);
		} catch (final BadLocationException e) {
			Log.logError("Document location error", e);
		}
	}

	@Override
	public void createPartControl(final Composite parent) {
		super.createPartControl(parent);
		final ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();

		projectSupport =
			new ProjectionSupport(viewer, getAnnotationAccess(),
					getSharedColors());
		projectSupport.install();
		viewer.doOperation(ProjectionViewer.TOGGLE);
		annotationModel = viewer.getProjectionAnnotationModel();
	}

	@Override
	public void dispose() {
		colorManager.dispose();
		if (outlinePage != null) {
			outlinePage.setInput(null);
		}

		ReflectionManager.clearCache();
		super.dispose();
	}

	/**
	 * This method overrides the implementation of <code>getAdapter</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.ui.editors.text.TextEditor#getAdapter(java.lang.Class)
	 */
	@Override
	public Object getAdapter(final Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
			if (outlinePage == null) {
				outlinePage = new WorkflowContentOutlinePage(this);
				outlinePage.setInput(getEditorInput());
			}
			return outlinePage;
		}
		return super.getAdapter(adapter);
	}

	/**
	 * Returns the value of field <code>attributes</code>.
	 * 
	 * @return value of <code>attributes</code>.
	 */
	public Collection<WorkflowAttribute> getAttributes() {
		return attributes;
	}

	/**
	 * Returns the value of field <code>elements</code>.
	 * 
	 * @return value of <code>elements</code>.
	 */
	public Collection<WorkflowElement> getElements() {
		return elements;
	}

	/**
	 * Returns the value of field <code>propertyNames</code>.
	 * 
	 * @return value of <code>propertyNames</code>.
	 */
	public Collection<String> getPropertyNames() {
		return propertyNames;
	}

	public Collection<ReferenceInfo> getReferenceDefinitions() {
		return referenceDefinitions;
	}

	public Collection<ReferenceInfo> getReferences() {
		return references;
	}

	/**
	 * Returns the value of field <code>rootElement</code>.
	 * 
	 * @return value of <code>rootElement</code>.
	 */
	public WorkflowElement getRootElement() {
		return rootElement;
	}

	public ISourceViewer internalGetSourceViewer() {
		return getSourceViewer();
	}

	public IVerticalRuler internalGetVerticalRuler() {
		return getVerticalRuler();
	}

	public WorkflowElement parseRootElement(final IDocument document) {
		return DocumentParser.parse(document, null);
	}

	/**
	 * Sets a new value for field <code>rootElement</code>.
	 * 
	 * @param rootElement
	 *            new value for <code>rootElement</code>.
	 */
	public void setRootElement(final WorkflowElement rootElement) {
		this.rootElement = rootElement;
	}

	public void updateFoldingStructure(final ArrayList positions) {
		final Annotation[] annotations = new Annotation[positions.size()];
		final HashMap newAnnotations = new HashMap();
		for (int i = 0; i < positions.size(); i++) {
			final ProjectionAnnotation annotation = new ProjectionAnnotation();

			newAnnotations.put(annotation, positions.get(i));

			annotations[i] = annotation;
		}

		annotationModel.modifyAnnotations(annotations, newAnnotations, null);
	}

	public void validateAndMark() {
		final IDocument document = getInputDocument();
		final WorkflowElement newRootElement = parseRootElement(document);
		final ElementIterator iterator =
			new ElementIterator(getInputFile(), getInputDocument());

		if (newRootElement != null) {
			setRootElement(newRootElement);
		}

		if (getRootElement() == null)
			return;

		iterator.checkValidity(getRootElement());
		elements = iterator.getElementList();
		attributes = iterator.getAttributeList();
		propertyNames = iterator.getPropertyNameList();
		references = iterator.getReferences();
		referenceDefinitions = iterator.getReferenceDefinitions();
	}

	@Override
	protected void createActions() {
		super.createActions();
		actionGroup = new BreakpointActionGroup(this);
		final ResourceBundle bundle =
			WorkflowEditorPlugin.getDefault().getResourceBundle();
		IAction a =
			new TextOperationAction(bundle, "QuickFormat.", this,
					ISourceViewer.FORMAT);
		setAction("QuickFormat", a);

		// content assist
		a =
			new TextOperationAction(bundle, "ContentAssistProposal.",
					this, ISourceViewer.CONTENTASSIST_PROPOSALS);
		a
		.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction("ContentAssistProposal", a);

		a =
			new TextOperationAction(bundle, "ContentAssistTip.", this,
					ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION);
		a
		.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
		setAction("ContentAssistTip", a);

	}

	@Override
	protected ISourceViewer createSourceViewer(final Composite parent,
			final IVerticalRuler ruler, final int styles) {
		final ISourceViewer viewer =
			new ProjectionViewer(parent, ruler, getOverviewRuler(),
					isOverviewRulerVisible(), styles);
		getSourceViewerDecorationSupport(viewer);
		job = new Job("parsing document") {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				validateAndMark();
				return Status.OK_STATUS;
			}
		};
		viewer.addTextListener(new ITextListener() {

			public void textChanged(
					final org.eclipse.jface.text.TextEvent event) {
				if (event.getDocumentEvent() != null) {
					job.cancel();
					job.schedule();
				}
			}

		});
		job.cancel();
		job.schedule();
		return viewer;
	}

	@Override
	protected void editorContextMenuAboutToShow(final IMenuManager menu) {
		menu.add(new Separator("mwe"));
		super.editorContextMenuAboutToShow(menu);

		actionGroup.fillContextMenu(menu);
	}

	@Override
	protected void editorSaved() {
		super.editorSaved();

		if (outlinePage != null) {
			outlinePage.refresh();
		}

		validateAndMark();
	}

	protected IDocument getInputDocument() {
		final IDocument document =
			getDocumentProvider().getDocument(getEditorInput());
		return document;
	}

	protected IFile getInputFile() {
		final IFileEditorInput ife = (IFileEditorInput) getEditorInput();
		final IFile file = ife.getFile();
		return file;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>initializeEditor</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.ui.editors.text.TextEditor#initializeEditor()
	 */
	@Override
	protected void initializeEditor() {
		super.initializeEditor();
		setPreferenceStore(getPlugin().getCombinedPreferenceStore());
	}

	@Override
	protected void rulerContextMenuAboutToShow(final IMenuManager menu) {
		menu.add(new Separator("mwe")); //$NON-NLS-1$
		super.rulerContextMenuAboutToShow(menu);

		actionGroup.fillContextMenu(menu);
	}

	private WorkflowEditorPlugin getPlugin() {
		return WorkflowEditorPlugin.getDefault();
	}
}
