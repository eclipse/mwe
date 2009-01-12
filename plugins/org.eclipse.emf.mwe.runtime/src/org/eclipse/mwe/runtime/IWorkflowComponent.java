package org.eclipse.mwe.runtime;

import org.eclipse.mwe.runtime.status.Status;

public interface IWorkflowComponent {
	
	/**
	 * @param ctx
	 * @return
	 */
	Status execute(IWorkflowContext ctx);
}
