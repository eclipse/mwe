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

package org.eclipse.emf.mwe.ui.internal.editor.factories.impl.xml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.autoedit.SmartQuoteStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml.XMLAutoIndentStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml.XMLAutoTagCompletionStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml.XMLRemoveClosingTagStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml.XMLTagContentAssistProcessor;
import org.eclipse.emf.mwe.ui.internal.editor.editor.ColorManager;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.PropertyContainerImpl;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.XMLWorkflowAttributeImpl;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.XMLWorkflowElementImpl;
import org.eclipse.emf.mwe.ui.internal.editor.factories.IWorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

public class XMLWorkflowSyntaxFactoryImpl implements IWorkflowSyntaxFactory {

	public Collection<IAutoEditStrategy> newAutoEditStrategyCollection() {
		final List<IAutoEditStrategy> strategies = new ArrayList<IAutoEditStrategy>();
		strategies.add(new XMLAutoTagCompletionStrategy());
		strategies.add(new XMLAutoIndentStrategy());
		strategies.add(new XMLRemoveClosingTagStrategy());
		strategies.add(new SmartQuoteStrategy());
		return strategies;
	}

	public IContentAssistProcessor newContentAssistProcessor(final WorkflowEditor editor,
			final ColorManager colorManager) {
		if (editor == null || colorManager == null)
			throw new IllegalArgumentException();

		return new XMLTagContentAssistProcessor(editor.getInputFile(), editor, new WorkflowTagScanner(colorManager));

	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.factories.IWorkflowSyntaxFactory#newPropertyContainer()
	 */
	public IPropertyContainer newPropertyContainer() {
		return new PropertyContainerImpl();
	}

	public IWorkflowAttribute newWorkflowAttribute(final String name, final String value) {
		return new XMLWorkflowAttributeImpl(name, value);
	}

	public AbstractWorkflowElement newWorkflowElement(final WorkflowEditor editor, final IProject project,
			final IDocument document, final String name) {
		return new XMLWorkflowElementImpl(editor, project, document, name);
	}

}
