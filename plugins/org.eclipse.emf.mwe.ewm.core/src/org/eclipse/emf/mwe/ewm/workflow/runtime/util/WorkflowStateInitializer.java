package org.eclipse.emf.mwe.ewm.workflow.runtime.util;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.util.WorkflowSwitch;

public class WorkflowStateInitializer extends WorkflowSwitch<Boolean>
{
	public WorkflowStateInitializer(WorkflowContext context)
	{
		this.context = context;
	}
	
	@Override
	public Boolean caseWorkflowUnitOfWork(WorkflowUnitOfWork object)
	{
		if(context.getState(object) == null)
			context.setState(object, StateFactory.eINSTANCE.createWorkflowIdleState());
		
		return Boolean.TRUE;
	}

	@Override
	public Boolean caseWorkflowCompositeComponent(WorkflowCompositeComponent object)
	{
		if(context.getState(object) == null)
			context.setState(object, StateFactory.eINSTANCE.createWorkflowIdleState());

		for(WorkflowComponent component : object.getComponents())
			doSwitch(component);
		
		return Boolean.TRUE;
	}

	private WorkflowContext context;
}
