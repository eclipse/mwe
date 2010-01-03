/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.orchestration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSkippedState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Rerun Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowRerunPredicate()
 * @model kind="class"
 * @generated
 */
public class WorkflowRerunPredicate extends WorkflowExecutionPredicate
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowRerunPredicate()
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
		return OrchestrationPackage.Literals.WORKFLOW_RERUN_PREDICATE;
	}

	@Override
	public boolean evaluate(WorkflowComponent component, WorkflowContext context)
	{
		return !(context.getState(component) instanceof WorkflowSuccessState) && !(context.getState(component) instanceof WorkflowSkippedState);
	}

} // WorkflowRerunPredicate
