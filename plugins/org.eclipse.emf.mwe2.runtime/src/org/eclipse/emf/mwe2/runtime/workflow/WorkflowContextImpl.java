/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.runtime.workflow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WorkflowContextImpl implements IWorkflowContext {
	private Map<String, Object> internalState = new HashMap<String, Object>();

	public Object get(String s) {
		return internalState.get(s);
	}

	public void put(String s, Object o) {
		internalState.put(s, o);
	}

	public Set<String> getSlotNames() {
		return Collections.unmodifiableSet(internalState.keySet());
	}
}
