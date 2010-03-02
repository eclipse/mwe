package org.eclipse.emf.mwe2.runtime.workflow;

import com.google.inject.Injector;

public class Workflow extends AbstractCompositeWorkflowComponent {
	public void run(Injector injector) {
		this.preInvoke();
		IWorkflowContext context = injector.getInstance(IWorkflowContext.class);
		this.invoke(context);
		this.postInvoke();
	}
}
