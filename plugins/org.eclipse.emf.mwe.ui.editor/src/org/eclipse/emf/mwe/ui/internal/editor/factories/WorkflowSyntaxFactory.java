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

public final class WorkflowSyntaxFactory {

	private static IWorkflowSyntaxFactory instance;

	/**
	 * Don't allow instantiation.
	 */
	private WorkflowSyntaxFactory() {
		throw new UnsupportedOperationException();
	}

	public static IWorkflowSyntaxFactory getInstance() {
		if (instance == null) {
			throw new FactoryNotInitializedException("Factory not initialized");
		}

		return instance;
	}

	public static void installFactory(final IWorkflowSyntaxFactory newInstance) {
		if (newInstance == null)
			throw new IllegalArgumentException();

		instance = newInstance;
	}
}
