package org.eclipse.emf.mwe2.runtime.workflow;

public class Workflow extends AbstractCompositeWorkflowComponent implements IWorkflow {

	public void run(IWorkflowContext context) {
		this.preInvoke();
		this.invoke(context);
		this.postInvoke();
	}
	
	public void addUnused(Object x) {
		
	}

}
