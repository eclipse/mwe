/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.orchestration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serial Workflow Orchestrator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowSerialOrchestrationStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowSerialOrchestrationStrategy extends WorkflowCompositeOrchestrationStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowSerialOrchestrationStrategy() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestrationPackage.Literals.WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void run(WorkflowCompositeComponent composite, WorkflowContext context) 
	{
		for(WorkflowComponent component : composite.getComponents())
		{
			component.start(context);
			
			if(!(context.getStates().get(component) instanceof WorkflowSuccessState))
				break;
		}
	}

} // SerialWorkflowOrchestrator
