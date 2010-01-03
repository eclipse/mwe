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
package org.eclipse.emf.mwe.ewm.workflow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Of Work</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowUnitOfWork()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class WorkflowUnitOfWork extends WorkflowComponent
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowUnitOfWork()
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
		return WorkflowPackage.Literals.WORKFLOW_UNIT_OF_WORK;
	}

	@Override
	public void accept(IWorkflowVisitor visitor)
	{
		visitor.visitUnitOfWork(this);
	}

	@Override
	public abstract WorkflowState run(WorkflowContext context) throws WorkflowRuntimeException;
	
} // UnitOfWork
