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

import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElement;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public abstract class AbstractWorkflowSyntaxFactory {

	private static AbstractWorkflowSyntaxFactory instance;

	public static AbstractWorkflowSyntaxFactory getInstance() {
		if (instance == null)
			throw new FactoryNotInitializedException("Factory not initialized");

		return instance;
	}

	public static void installFactory(
			final AbstractWorkflowSyntaxFactory newInstance) {
		if (newInstance == null) {
			throw new IllegalArgumentException();
		}

		instance = newInstance;
	}

	public abstract IWorkflowAttribute newWorkflowAttribute(
			IWorkflowElement element, String name, String value);

	public abstract IWorkflowElement newWorkflowElement(IDocument document,
			String name);
}
