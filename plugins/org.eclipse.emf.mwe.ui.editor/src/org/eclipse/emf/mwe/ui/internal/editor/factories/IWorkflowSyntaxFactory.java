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

package org.eclipse.emf.mwe.ui.internal.editor.factories;

import java.util.Collection;

import org.eclipse.emf.mwe.ui.internal.editor.editor.ColorManager;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.7 $
 */

public interface IWorkflowSyntaxFactory {

	Collection<IAutoEditStrategy> newAutoEditStrategyCollection();

	IContentAssistProcessor newContentAssistProcessor(WorkflowEditor editor, ColorManager colorManager);

	IWorkflowAttribute newWorkflowAttribute(IWorkflowElement element, String name, String value);

	IWorkflowElement newWorkflowElement(WorkflowEditor editor, IDocument document, String name);
}
