/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.util;

import org.eclipse.emf.mwe.internal.core.Workflow;

public class WorkflowContainer {
	private Object root = null;

	public void setWorkflow(final Workflow workflow) {
		root = workflow;
	}

	public void put(final String name, final Object value) {
		root = value;
	}

	public Object getRoot() {
		return root;
	}
}
