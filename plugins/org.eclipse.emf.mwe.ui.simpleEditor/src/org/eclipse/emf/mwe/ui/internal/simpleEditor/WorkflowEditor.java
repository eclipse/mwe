/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.simpleEditor;

import org.eclipse.emf.mwe.internal.ui.debug.breakpoint.actions.BreakpointActionGroup;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.ui.editors.text.TextEditor;

public class WorkflowEditor extends TextEditor {

    private final ColorManager colorManager;

	private BreakpointActionGroup actionGroup;

    public WorkflowEditor() {
        super();
        colorManager = new ColorManager();
        setSourceViewerConfiguration(new XMLConfiguration(colorManager));
        setDocumentProvider(new XMLDocumentProvider());
    }

    @Override
    public void dispose() {
        colorManager.dispose();
        super.dispose();
    }

	@Override
	protected void createActions() {
		super.createActions();
		actionGroup = new BreakpointActionGroup(this);
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

	public ISourceViewer internalGetSourceViewer() {
		return getSourceViewer();
	}

	public IVerticalRuler internalGetVerticalRuler() {
		return getVerticalRuler();
	}


}
