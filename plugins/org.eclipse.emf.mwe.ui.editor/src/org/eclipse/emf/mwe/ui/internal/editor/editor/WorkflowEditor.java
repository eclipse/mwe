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
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.internal.ui.debug.breakpoint.actions.BreakpointActionGroup;
import org.eclipse.emf.mwe.ui.internal.editor.Activator;
import org.eclipse.emf.mwe.ui.internal.editor.analyzer.ElementIterator;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.outline.WorkflowContentOutlinePage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.IDocument;
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
 * @version $Revision: 1.10 $
 */
public class WorkflowEditor extends TextEditor {

    private ProjectionAnnotationModel annotationModel;

    private final ColorManager colorManager;

    private ProjectionSupport projectSupport;

    private BreakpointActionGroup actionGroup;

    private WorkflowContentOutlinePage outlinePage;

    private WorkflowElement rootElement;

    private List<WorkflowElement> elementList;

    private List<WorkflowAttribute> attributeList;

    public WorkflowEditor() {
        super();
        colorManager = new ColorManager();
        setSourceViewerConfiguration(new WorkflowEditorConfiguration(
                colorManager, this));
        setDocumentProvider(new WorkflowDocumentProvider());
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
        if (outlinePage != null)
            outlinePage.setInput(null);

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
     * Returns the value of field <code>attributeList</code>.
     * 
     * @return value of <code>attributeList</code>.
     */
    public List<WorkflowAttribute> getAttributeList() {
        return attributeList;
    }

    /**
     * Returns the value of field <code>elementList</code>.
     * 
     * @return value of <code>elementList</code>.
     */
    public List<WorkflowElement> getElementList() {
        return elementList;
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
        if (getRootElement() == null)
            return;

        final ElementIterator iterator =
                new ElementIterator(getInputFile(), getInputDocument());
        iterator.checkValidity(getRootElement());
        elementList = iterator.getElementList();
        attributeList = iterator.getAttributeList();
    }

    @Override
    protected void createActions() {
        super.createActions();
        actionGroup = new BreakpointActionGroup(this);
        final ResourceBundle bundle =
                Activator.getDefault().getResourceBundle();
        setAction("QuickFormat", new TextOperationAction(bundle,
                "QuickFormat.", this, ISourceViewer.FORMAT));

        // content assist
        IAction a =
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

        if (outlinePage != null)
            outlinePage.refresh();

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

    @Override
    protected void rulerContextMenuAboutToShow(final IMenuManager menu) {
        menu.add(new Separator("mwe")); //$NON-NLS-1$
        super.rulerContextMenuAboutToShow(menu);

        actionGroup.fillContextMenu(menu);
    }
}
