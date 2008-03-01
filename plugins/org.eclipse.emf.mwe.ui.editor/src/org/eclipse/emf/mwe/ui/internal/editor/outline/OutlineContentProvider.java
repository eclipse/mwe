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

package org.eclipse.emf.mwe.ui.internal.editor.outline;

import java.util.List;

import org.eclipse.emf.mwe.ui.internal.editor.Activator;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.parser.ValidationException;
import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.emf.mwe.ui.internal.editor.parser.XMLParser;
import org.eclipse.jface.text.BadPositionCategoryException;
import org.eclipse.jface.text.DefaultPositionUpdater;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IPositionUpdater;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.xml.sax.helpers.LocatorImpl;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public class OutlineContentProvider implements ITreeContentProvider {

    protected static final String TAG_POSITIONS = "__tag_positions";

    protected IPositionUpdater positionUpdater =
            new DefaultPositionUpdater(TAG_POSITIONS);

    private final WorkflowContentOutlinePage outlinePage;

    private final Viewer viewer;

    private WorkflowElement root;

    private IEditorInput input;

    private final IDocumentProvider documentProvider;

    public OutlineContentProvider(
            final WorkflowContentOutlinePage outlinePage, final Viewer viewer,
            final IDocumentProvider documentProvider) {
        this.outlinePage = outlinePage;
        this.viewer = viewer;
        this.documentProvider = documentProvider;
    }

    public void dispose() {
        // do nothing
    }

    public Object[] getChildren(final Object parentElement) {
        if (parentElement == input) {
            if (root == null)
                return new Object[0];
            final List<WorkflowElement> childList = root.getChildrenList();
            if (childList != null)
                return childList.toArray();
        } else {
            final WorkflowElement parent = (WorkflowElement) parentElement;
            final List<WorkflowElement> childList = parent.getChildrenList();
            if (childList != null)
                return childList.toArray();
        }
        return new Object[0];
    }

    public Object[] getElements(final Object inputElement) {
        return getChildren(inputElement);
    }

    public Object getParent(final Object element) {
        if (element instanceof WorkflowElement)
            return ((WorkflowElement) element).getParent();

        return null;
    }

    public boolean hasChildren(final Object element) {
        return getChildren(element).length > 0;
    }

    public void inputChanged(final Viewer viewer, final Object oldInput,
            final Object newInput) {
        if (oldInput != null) {
            final IDocument document = documentProvider.getDocument(oldInput);
            if (document != null) {
                try {
                    document.removePositionCategory(TAG_POSITIONS);
                } catch (final BadPositionCategoryException x) {
                }
                document.removePositionUpdater(positionUpdater);
            }
        }

        input = (IEditorInput) newInput;

        if (newInput != null) {
            final IDocument document = documentProvider.getDocument(newInput);
            if (document != null) {
                document.addPositionCategory(TAG_POSITIONS);
                document.addPositionUpdater(positionUpdater);

                final WorkflowElement rootElement = parseRootElement(document);
                if (rootElement != null) {
                    root = rootElement;
                }
            }
        }
    }

    public void setInput(final IEditorInput input) {
        // do nothing
    }

    private WorkflowElement parseRootElement(final IDocument document) {
        final String text = document.get();
        final WorkflowElement tagPositions = parseRootElements(text, document);
        return tagPositions;
    }

    private WorkflowElement parseRootElements(final String text,
            final IDocument document) {
        try {
            final XMLParser xmlParser = new XMLParser();
            final WorkflowContentHandler contentHandler =
                    new WorkflowContentHandler();
            contentHandler.setDocument(document);
            contentHandler.setPositionCategory(TAG_POSITIONS);
            contentHandler.setDocumentLocator(new LocatorImpl());
            xmlParser.setContentHandler(contentHandler);
            xmlParser.parse(text);
            final WorkflowElement root = xmlParser.getRootElement();
            return root;
        } catch (final ValidationException e) {
            Activator.logDebug(e);
            return null;
        }
    }

}
