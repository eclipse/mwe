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

package org.eclipse.emf.mwe.ui.internal.editor.factories.impl.xml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.mwe.ui.internal.editor.autoedit.SmartQuoteStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml.XMLAutoIndentStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml.XMLAutoTagCompletionStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml.XMLRemoveClosingTagStrategy;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.XMLWorkflowAttributeImpl;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.XMLWorkflowElementImpl;
import org.eclipse.emf.mwe.ui.internal.editor.factories.AbstractWorkflowSyntaxFactory;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;

public class XMLWorkflowSyntaxFactoryImpl extends
		AbstractWorkflowSyntaxFactory {

	@Override
	public Collection<IAutoEditStrategy> newAutoEditStrategyCollection() {
		final List<IAutoEditStrategy> strategies =
				new ArrayList<IAutoEditStrategy>();
		strategies.add(new XMLAutoTagCompletionStrategy());
		strategies.add(new XMLAutoIndentStrategy());
		strategies.add(new XMLRemoveClosingTagStrategy());
		strategies.add(new SmartQuoteStrategy());
		return strategies;
	}

	@Override
	public IWorkflowAttribute newWorkflowAttribute(
			final IWorkflowElement element, final String name,
			final String value) {
		return new XMLWorkflowAttributeImpl(element, name, value);
	}

	@Override
	public IWorkflowElement newWorkflowElement(final IDocument document,
			final String name) {
		return new XMLWorkflowElementImpl(document, name);
	}
}
