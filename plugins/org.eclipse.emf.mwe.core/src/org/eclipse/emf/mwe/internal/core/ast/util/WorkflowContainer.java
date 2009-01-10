/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
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
