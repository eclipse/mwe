package org.eclipse.emf.mwe2.runtime.workflow;

public interface IWorkflowContext {
	public Object get(String s);
	public void put(String s, Object o);
}
