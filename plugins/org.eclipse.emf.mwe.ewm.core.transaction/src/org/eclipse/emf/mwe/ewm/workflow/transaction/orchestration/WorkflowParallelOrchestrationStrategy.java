/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowParallelOrchestrationStrategy.java,v 1.1 2010/01/03 21:22:54 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Parallel Orchestration Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage#getWorkflowParallelOrchestrationStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowParallelOrchestrationStrategy extends WorkflowCompositeOrchestrationStrategy
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParallelOrchestrationStrategy()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return OrchestrationPackage.Literals.WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void run(final WorkflowCompositeComponent composite, final WorkflowContext context)
	{
		Assert.isTrue(context instanceof WorkflowTransactionalContext, "You must use WorkflowTransactionalContext with a parallel workflow");
		WorkflowTransactionalContext transactionalContext = (WorkflowTransactionalContext) context;
		final ArrayList<Future<?>> futures = new ArrayList<Future<?>>();
		
		try
		{
			transactionalContext.getEditingDomain().runExclusive(new Runnable()
			{
				/*
				 * (non-Javadoc)
				 * 
				 * @see java.lang.Runnable#run()
				 */
				public void run()
				{
					ExecutorService threadPool = context.getThreadPool();

					for (WorkflowComponent component : composite.getComponents())
					{
						WorkflowRunner runner = RuntimeFactory.eINSTANCE.createWorkflowRunner();
						runner.setComponent(component);
						runner.setContext(context);
						futures.add(threadPool.submit(runner));
					}
				}
			});
		}
		catch (InterruptedException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		for (Future<?> future : futures)
		{
			try
			{
				future.get();
			}
			catch (Exception e)
			{
				continue;
			}
		}
	}
} // WorkflowParallelOrchestrationStrategy
