/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.runtime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Resolution Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateResolutionStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowStateResolutionStrategy extends EObjectImpl implements EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowStateResolutionStrategy()
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
		return RuntimePackage.Literals.WORKFLOW_STATE_RESOLUTION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public WorkflowState resolve(WorkflowCompositeComponent workflow, WorkflowContext context)
	{
		for(WorkflowComponent component : workflow.getComponents())
		{
			if(!(context.getStates().get(component) instanceof WorkflowSuccessState))
				return (WorkflowState) StateFactory.eINSTANCE.create(context.getStates().get(component).eClass());
		}
		
		return StateFactory.eINSTANCE.createWorkflowSuccessState();
	}
} // WorkflowStateResolutionStrategy
