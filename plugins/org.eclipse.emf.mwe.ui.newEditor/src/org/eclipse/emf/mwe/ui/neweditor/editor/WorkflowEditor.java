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

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.mwe.internal.ui.debug.breakpoint.actions.BreakpointActionGroup;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.editors.text.TextEditor;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public class WorkflowEditor extends TextEditor {

    private ProjectionAnnotationModel annotationModel;

    private final ColorManager colorManager;

    private Annotation[] oldAnnotations;

    private ProjectionSupport projectSupport;

    private BreakpointActionGroup actionGroup;

    public WorkflowEditor() {
        super();
        colorManager = new ColorManager();
        setSourceViewerConfiguration(new WorkflowConfiguration(colorManager,
                this));
        setDocumentProvider(new WorkflowDocumentProvider());
    }

    @Override
    public void createPartControl(final Composite parent) {
        super.createPartControl(parent);
        final ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();

        projectSupport = new ProjectionSupport(viewer, getAnnotationAccess(),
                getSharedColors());
        projectSupport.install();
        viewer.doOperation(ProjectionViewer.TOGGLE);
        annotationModel = viewer.getProjectionAnnotationModel();
    }

    @Override
    public void dispose() {
        colorManager.dispose();
        super.dispose();
    }

    public ISourceViewer internalGetSourceViewer() {
        return getSourceViewer();
    }

    public IVerticalRuler internalGetVerticalRuler() {
        return getVerticalRuler();
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
        oldAnnotations = annotations;
    }

    @Override
    protected void createActions() {
        super.createActions();
        actionGroup = new BreakpointActionGroup(this);
    }

    @Override
    protected ISourceViewer createSourceViewer(final Composite parent,
            final IVerticalRuler ruler, final int styles) {
        final ISourceViewer viewer = new ProjectionViewer(parent, ruler,
                getOverviewRuler(), isOverviewRulerVisible(), styles);

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
    protected void rulerContextMenuAboutToShow(final IMenuManager menu) {
        menu.add(new Separator("mwe")); //$NON-NLS-1$
        super.rulerContextMenuAboutToShow(menu);

        actionGroup.fillContextMenu(menu);
    }
}
