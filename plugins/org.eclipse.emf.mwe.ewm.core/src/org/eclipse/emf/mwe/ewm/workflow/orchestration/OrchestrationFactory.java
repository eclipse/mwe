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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage
 * @generated
 */
public class OrchestrationFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrchestrationFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrchestrationFactory init()
	{
		try
		{
			OrchestrationFactory theOrchestrationFactory = (OrchestrationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/ewm/workflow/orchestration"); 
			if (theOrchestrationFactory != null)
			{
				return theOrchestrationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrchestrationFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationFactory()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case OrchestrationPackage.WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY: return createWorkflowSerialOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY: return createWorkflowParallelOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY: return createWorkflowComponentOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY: return createWorkflowConditionalComponentOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY: return createWorkflowLoopComponentOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_RERUN_PREDICATE: return createWorkflowRerunPredicate();
			case OrchestrationPackage.WORKFLOW_PARAMETER_PREDICATE: return createWorkflowParameterPredicate();
			case OrchestrationPackage.WORKFLOW_PREDICATE_OR: return createWorkflowPredicateOR();
			case OrchestrationPackage.WORKFLOW_PREDICATE_AND: return createWorkflowPredicateAND();
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE: return createWorkflowLoopCountPredicate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSerialOrchestrationStrategy createWorkflowSerialOrchestrationStrategy()
	{
		WorkflowSerialOrchestrationStrategy workflowSerialOrchestrationStrategy = new WorkflowSerialOrchestrationStrategy();
		return workflowSerialOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParallelOrchestrationStrategy createWorkflowParallelOrchestrationStrategy()
	{
		WorkflowParallelOrchestrationStrategy workflowParallelOrchestrationStrategy = new WorkflowParallelOrchestrationStrategy();
		return workflowParallelOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponentOrchestrationStrategy createWorkflowComponentOrchestrationStrategy()
	{
		WorkflowComponentOrchestrationStrategy workflowComponentOrchestrationStrategy = new WorkflowComponentOrchestrationStrategy();
		return workflowComponentOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowConditionalComponentOrchestrationStrategy createWorkflowConditionalComponentOrchestrationStrategy()
	{
		WorkflowConditionalComponentOrchestrationStrategy workflowConditionalComponentOrchestrationStrategy = new WorkflowConditionalComponentOrchestrationStrategy();
		return workflowConditionalComponentOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLoopComponentOrchestrationStrategy createWorkflowLoopComponentOrchestrationStrategy()
	{
		WorkflowLoopComponentOrchestrationStrategy workflowLoopComponentOrchestrationStrategy = new WorkflowLoopComponentOrchestrationStrategy();
		return workflowLoopComponentOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRerunPredicate createWorkflowRerunPredicate()
	{
		WorkflowRerunPredicate workflowRerunPredicate = new WorkflowRerunPredicate();
		return workflowRerunPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterPredicate createWorkflowParameterPredicate()
	{
		WorkflowParameterPredicate workflowParameterPredicate = new WorkflowParameterPredicate();
		return workflowParameterPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowPredicateOR createWorkflowPredicateOR()
	{
		WorkflowPredicateOR workflowPredicateOR = new WorkflowPredicateOR();
		return workflowPredicateOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowPredicateAND createWorkflowPredicateAND()
	{
		WorkflowPredicateAND workflowPredicateAND = new WorkflowPredicateAND();
		return workflowPredicateAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLoopCountPredicate createWorkflowLoopCountPredicate()
	{
		WorkflowLoopCountPredicate workflowLoopCountPredicate = new WorkflowLoopCountPredicate();
		return workflowLoopCountPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationPackage getOrchestrationPackage()
	{
		return (OrchestrationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrchestrationPackage getPackage()
	{
		return OrchestrationPackage.eINSTANCE;
	}

} //OrchestrationFactory
