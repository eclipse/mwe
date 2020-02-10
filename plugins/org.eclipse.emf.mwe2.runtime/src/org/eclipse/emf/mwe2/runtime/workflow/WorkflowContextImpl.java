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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WorkflowContextImpl implements IWorkflowContext {
	private Map<String, Object> internalState = new HashMap<String, Object>();

	@Override
	public Object get(String s) {
		return internalState.get(s);
	}

	@Override
	public void put(String s, Object o) {
		internalState.put(s, o);
	}

	@Override
	public Set<String> getSlotNames() {
		return Collections.unmodifiableSet(internalState.keySet());
	}
}
