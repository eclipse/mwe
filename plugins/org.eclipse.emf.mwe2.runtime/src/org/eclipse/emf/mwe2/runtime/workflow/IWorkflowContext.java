/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.runtime.workflow;

import java.util.Set;

import com.google.inject.ImplementedBy;

@ImplementedBy(WorkflowContextImpl.class)
public interface IWorkflowContext {
	public Object get(String s);
	public void put(String s, Object o);
	public Set<String> getSlotNames();
}
