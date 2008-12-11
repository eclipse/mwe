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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterValueStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowParameterValueStrategy extends EObjectImpl implements EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParameterValueStrategy()
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
		return WorkflowPackage.Literals.WORKFLOW_PARAMETER_VALUE_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.emf.workflow.runtime.WorkflowRuntimeException"
	 * @generated NOT
	 */
	public Object getValue(WorkflowContext context, WorkflowParameter parameter) throws WorkflowRuntimeException
	{
		return context.getParameters().get(parameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.emf.workflow.runtime.WorkflowRuntimeException"
	 * @generated NOT
	 */
	public void setValue(WorkflowContext context, WorkflowParameter parameter, Object value) throws WorkflowRuntimeException
	{
		if(!(value instanceof EObject))
			throw new WorkflowRuntimeException("Value is not of type EObject");
		
		context.getParameters().put(parameter, (EObject) value);
	}

} // WorkflowParameterValueStrategy
