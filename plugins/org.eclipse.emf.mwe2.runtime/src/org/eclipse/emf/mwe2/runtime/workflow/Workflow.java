package org.eclipse.emf.mwe2.runtime.workflow;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Workflow extends AbstractCompositeWorkflowComponent implements IWorkflow {

	private Provider<IWorkflowContext> contextProvider;
	
	@Inject
	public void setContextProvider(Provider<IWorkflowContext> contextProvider) {
		this.contextProvider = contextProvider;
	}
	
	public void run() {
		this.preInvoke();
		this.invoke(contextProvider.get());
		this.postInvoke();
	}

}
