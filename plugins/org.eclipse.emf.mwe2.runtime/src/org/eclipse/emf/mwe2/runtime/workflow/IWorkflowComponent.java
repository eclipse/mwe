package org.eclipse.emf.mwe2.runtime.workflow;

public interface IWorkflowComponent {
	public void preInvoke();
	public void invoke(IWorkflowContext ctx);
	public void postInvoke();
}
