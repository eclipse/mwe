/*
 * Copyright (c) 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.editor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.mwe.internal.ui.debug.breakpoint.actions.BreakpointActionGroup;
import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.emf.mwe.ui.internal.editor.analyzer.ElementIterator;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.outline.WorkflowContentOutlinePage;
import org.eclipse.emf.mwe.ui.internal.editor.parser.ValidationException;
import org.eclipse.emf.mwe.ui.internal.editor.preferences.PreferenceConstants;
import org.eclipse.emf.mwe.ui.internal.editor.utils.DocumentParser;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.emf.mwe.ui.internal.editor.utils.WorkflowElementSearcher;
import org.eclipse.jdt.internal.ui.javaeditor.IJavaAnnotation;
import org.eclipse.jdt.internal.ui.javaeditor.JavaAnnotationIterator;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.ITextViewerExtension5;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension2;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.viewers.IPostSelectionProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */
@SuppressWarnings("restriction")
public class WorkflowEditor extends TextEditor {

	private ProjectionAnnotationModel annotationModel;

	private final ColorManager colorManager;

	private ProjectionSupport projectSupport;

	private BreakpointActionGroup actionGroup;

	private WorkflowContentOutlinePage outlinePage;

	private Job validationJob;

	private ISelectionChangedListener selectionChangedListener;

	private AbstractWorkflowElement rootElement;

	private Collection<AbstractWorkflowElement> elements;

	private Collection<IWorkflowAttribute> attributes;

	public WorkflowEditor() {
		super();
		colorManager = new ColorManager();
	}

	private static boolean isProblemMarkerAnnotation(final Annotation annotation) {
		if (!(annotation instanceof MarkerAnnotation))
			return false;
		try {
			return (((MarkerAnnotation) annotation).getMarker().isSubtypeOf(IMarker.PROBLEM));
		}
		catch (final CoreException e) {
			return false;
		}
	}

	public void createMarker(final IDocument document, final String msg, final int line, final int column) {
		final IFile file = getInputFile();
		MarkerManager.createMarker(file, document, msg, line, column);
	}

	@Override
	public void createPartControl(final Composite parent) {
		super.createPartControl(parent);
		final ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();

		projectSupport = new ProjectionSupport(viewer, getAnnotationAccess(), getSharedColors());
		projectSupport.install();
		viewer.doOperation(ProjectionViewer.TOGGLE);
		annotationModel = viewer.getProjectionAnnotationModel();
		selectionChangedListener = new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent event) {
				updateStatusLine();
				updateOutlineSelection();
			}
		};
		final ISelectionProvider selectionProvider = getSelectionProvider();
		if (selectionProvider instanceof IPostSelectionProvider) {
			final IPostSelectionProvider postSelectionProvider = (IPostSelectionProvider) selectionProvider;
			postSelectionProvider.addPostSelectionChangedListener(selectionChangedListener);
		}
		else {
			getSelectionProvider().addSelectionChangedListener(selectionChangedListener);
		}
	}

	@Override
	public void dispose() {
		colorManager.dispose();
		if (selectionChangedListener != null) {
			final ISelectionProvider selectionProvider = getSelectionProvider();
			if (selectionProvider instanceof IPostSelectionProvider) {
				final IPostSelectionProvider postSelectionProvider = (IPostSelectionProvider) selectionProvider;
				postSelectionProvider.addPostSelectionChangedListener(selectionChangedListener);
			}
			else {
				getSelectionProvider().addSelectionChangedListener(selectionChangedListener);
			}
		}

		if (outlinePage != null) {
			outlinePage.setInput(null);
		}
		TypeUtils.clearCache();
		super.dispose();
	}

	/**
	 * This method overrides the implementation of <code>getAdapter</code>
	 * inherited from the superclass to provide an adapter for
	 * IContentOutlinePage.
	 * 
	 * @see org.eclipse.ui.editors.text.TextEditor#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings("unchecked")
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
	public Collection<IWorkflowAttribute> getAttributes() {
		return attributes;
	}

	/**
	 * Returns the value of field <code>elements</code>.
	 * 
	 * @return value of <code>elements</code>.
	 */
	public Collection<AbstractWorkflowElement> getElements() {
		return elements;
	}

	public IFile getInputFile() {
		final IFileEditorInput ife = (IFileEditorInput) getEditorInput();
		final IFile file = ife.getFile();
		return file;
	}

	/**
	 * Returns the value of field <code>rootElement</code>.
	 * 
	 * @return value of <code>rootElement</code>.
	 */
	public AbstractWorkflowElement getRootElement() {
		return rootElement;
	}

	/**
	 * @see org.eclipse.ui.texteditor.AbstractTextEditor#init(org.eclipse.ui.IEditorSite,
	 *      org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		// do document provider setup
		setSourceViewerConfiguration(new WorkflowEditorConfiguration(WorkflowEditorPlugin.getDefault(), colorManager,
				this));

		// source viewer setup
		setDocumentProvider(new WorkflowDocumentProvider());

		// create chained pref. store
		final IPreferenceStore store = new ChainedPreferenceStore(new IPreferenceStore[] {
				WorkflowEditorPlugin.getDefault().getPreferenceStore(), EditorsUI.getPreferenceStore() });
		setPreferenceStore(store);

		super.init(site, input);
	}

	public ISourceViewer internalGetSourceViewer() {
		return getSourceViewer();
	}

	public IVerticalRuler internalGetVerticalRuler() {
		return getVerticalRuler();
	}

	public AbstractWorkflowElement parseRootElement(final IDocument document) {
		try {
			return DocumentParser.parse(document, null, this);
		}
		catch (final ValidationException e) {
			final int line = e.getLineNumber() - 1;
			final int column = e.getColumnNumber();
			createMarker(document, e.getDetailedMessage(), line, column);
			return null;
		}
	}

	/**
	 * Sets a new value for field <code>rootElement</code>.
	 * 
	 * @param newRootElement
	 *            new value for <code>rootElement</code>.
	 */
	public void setRootElement(final AbstractWorkflowElement newRootElement) {
		this.rootElement = newRootElement;
	}

	public void updateFoldingStructure(final List<Position> positions) {
		final Annotation[] annotations = new Annotation[positions.size()];
		final Map<ProjectionAnnotation, Position> newAnnotations = new HashMap<ProjectionAnnotation, Position>();
		for (int i = 0; i < positions.size(); i++) {
			final ProjectionAnnotation annotation = new ProjectionAnnotation();

			newAnnotations.put(annotation, positions.get(i));

			annotations[i] = annotation;
		}

		annotationModel.modifyAnnotations(annotations, newAnnotations, null);
	}

	public void validateAndMark() {
		final IDocument document = getInputDocument();
		MarkerManager.deleteMarkers(getInputFile());
		final AbstractWorkflowElement newRootElement = parseRootElement(document);
		final ElementIterator iterator = new ElementIterator(getInputFile(), getInputDocument());

		if (newRootElement != null) {
			setRootElement(newRootElement);
		}

		if (getRootElement() == null)
			return;

		iterator.checkValidity(getRootElement());
		elements = iterator.getElementList();
		attributes = iterator.getAttributeList();
	}

	@Override
	protected void createActions() {
		super.createActions();
		actionGroup = new BreakpointActionGroup(this);
		final ResourceBundle bundle = WorkflowEditorPlugin.getDefault().getResourceBundle();
		IAction a = new TextOperationAction(bundle, "QuickFormat.", this, ISourceViewer.FORMAT);
		setAction("QuickFormat", a);

		// content assist
		a = new TextOperationAction(bundle, "ContentAssistProposal.", this, ISourceViewer.CONTENTASSIST_PROPOSALS);
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction("ContentAssistProposal", a);

		a = new TextOperationAction(bundle, "ContentAssistTip.", this, ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION);
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
		setAction("ContentAssistTip", a);

	}

	@Override
	protected ISourceViewer createSourceViewer(final Composite parent, final IVerticalRuler ruler, final int styles) {
		final ISourceViewer viewer = new ProjectionViewer(parent, ruler, getOverviewRuler(), isOverviewRulerVisible(),
				styles);
		getSourceViewerDecorationSupport(viewer);
		validationJob = new Job("parsing document") {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				validateAndMark();

				return Status.OK_STATUS;
			}
		};
		viewer.addTextListener(new ITextListener() {

			public void textChanged(final org.eclipse.jface.text.TextEvent event) {
				if (event.getDocumentEvent() != null) {
					validationJob.cancel();
					validationJob.schedule();
				}
			}

		});

		validateAndMark();

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
		final IDocument document = getDocumentProvider().getDocument(getEditorInput());
		return document;
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

	protected void updateOutlineSelection() {
		if (isOutlineUpdatingEnabled() && outlinePage != null && isEditorActive()) {
			final AbstractWorkflowElement element = computeHighlightedElement();
			synchronizeOutlinePage(element);
		}
	}

	protected void updateStatusLine() {
		final ITextSelection selection = (ITextSelection) getSelectionProvider().getSelection();
		final Annotation annotation = getAnnotation(selection.getOffset(), selection.getLength());
		String message = null;
		if (annotation != null) {
			updateMarkerViews(annotation);
			if (annotation instanceof IJavaAnnotation && ((IJavaAnnotation) annotation).isProblem()
					|| isProblemMarkerAnnotation(annotation)) {
				message = annotation.getText();
			}
		}
		setStatusLineMessage(message);
	}

	private AbstractWorkflowElement computeHighlightedElement() {
		final ISourceViewer sourceViewer = getSourceViewer();
		if (sourceViewer == null)
			return null;

		final StyledText styledText = sourceViewer.getTextWidget();
		if (styledText == null)
			return null;

		int caret = 0;
		if (sourceViewer instanceof ITextViewerExtension5) {
			final ITextViewerExtension5 extension = (ITextViewerExtension5) sourceViewer;
			caret = extension.widgetOffset2ModelOffset(styledText.getCaretOffset());
		}
		else {
			final int offset = sourceViewer.getVisibleRegion().getOffset();
			caret = offset + styledText.getCaretOffset();
		}
		AbstractWorkflowElement element = null;
		if (getRootElement() != null && getInputDocument() != null) {
			element = WorkflowElementSearcher.searchCompleteParentElement(getRootElement(), getInputDocument(), caret);
		}
		return element;
	}

	private IWorkbenchPart getActivePart() {
		final IWorkbenchWindow window = getSite().getWorkbenchWindow();
		final IPartService service = window.getPartService();
		final IWorkbenchPart part = service.getActivePart();
		return part;
	}

	private Annotation getAnnotation(final int offset, final int length) {
		final IAnnotationModel model = getDocumentProvider().getAnnotationModel(getEditorInput());
		if (model == null)
			return null;

		Iterator parent;
		if (model instanceof IAnnotationModelExtension2) {
			parent = ((IAnnotationModelExtension2) model).getAnnotationIterator(offset, length, true, true);
		}
		else {
			parent = model.getAnnotationIterator();
		}

		final Iterator e = new JavaAnnotationIterator(parent, false);
		while (e.hasNext()) {
			final Annotation a = (Annotation) e.next();
			final Position p = model.getPosition(a);
			if (p != null && p.overlapsWith(offset, length))
				return a;
		}
		return null;
	}

	private WorkflowEditorPlugin getPlugin() {
		return WorkflowEditorPlugin.getDefault();
	}

	private boolean isEditorActive() {
		final IWorkbenchPart part = getActivePart();
		return part == this;
	}

	private boolean isOutlineUpdatingEnabled() {
		final IPreferenceStore store = WorkflowEditorPlugin.getDefault().getCombinedPreferenceStore();
		return store.getBoolean(PreferenceConstants.SYNCHRONIZE_OUTLINE_VIEW);
	}

	private void synchronizeOutlinePage(final AbstractWorkflowElement element) {
		if (outlinePage != null && element != null) {
			outlinePage.select(element);
		}

	}
}
