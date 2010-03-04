package org.eclipse.emf.mwe2.runtime.workflow;

import java.util.Set;

public interface IWorkflowContext {
	public Object get(String s);
	public void put(String s, Object o);
	public Set<String> getSlotNames();
}
