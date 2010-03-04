package org.eclipse.emf.mwe2.runtime.workflow;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;

public class WorkflowContextImpl implements IWorkflowContext {
	private Map<String, Object> internalState = Maps.newHashMap();

	public Object get(String s) {
		return internalState.get(s);
	}

	public void put(String s, Object o) {
		internalState.put(s, o);
	}

	public Set<String> getSlotNames() {
		return internalState.keySet();
	}
}
