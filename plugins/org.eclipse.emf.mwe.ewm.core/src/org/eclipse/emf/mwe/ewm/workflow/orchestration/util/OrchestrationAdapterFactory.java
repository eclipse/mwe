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
package org.eclipse.emf.mwe.ewm.workflow.orchestration.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.*;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage
 * @generated
 */
public class OrchestrationAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrchestrationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = OrchestrationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestrationSwitch<Adapter> modelSwitch =
		new OrchestrationSwitch<Adapter>()
		{
			@Override
			public Adapter caseWorkflowSerialOrchestrationStrategy(WorkflowSerialOrchestrationStrategy object)
			{
				return createWorkflowSerialOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowParallelOrchestrationStrategy(WorkflowParallelOrchestrationStrategy object)
			{
				return createWorkflowParallelOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy object)
			{
				return createWorkflowCompositeOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowComponentOrchestrationStrategy(WorkflowComponentOrchestrationStrategy object)
			{
				return createWorkflowComponentOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowLoopComponentOrchestrationStrategy(WorkflowLoopComponentOrchestrationStrategy object)
			{
				return createWorkflowLoopComponentOrchestrationStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowExecutionPredicate(WorkflowExecutionPredicate object)
			{
				return createWorkflowExecutionPredicateAdapter();
			}
			@Override
			public Adapter caseWorkflowRerunPredicate(WorkflowRerunPredicate object)
			{
				return createWorkflowRerunPredicateAdapter();
			}
			@Override
			public Adapter caseWorkflowParameterPredicate(WorkflowParameterPredicate object)
			{
				return createWorkflowParameterPredicateAdapter();
			}
			@Override
			public Adapter caseWorkflowPredicateOR(WorkflowPredicateOR object)
			{
				return createWorkflowPredicateORAdapter();
			}
			@Override
			public Adapter caseWorkflowPredicateAND(WorkflowPredicateAND object)
			{
				return createWorkflowPredicateANDAdapter();
			}
			@Override
			public Adapter caseWorkflowLoopCountPredicate(WorkflowLoopCountPredicate object)
			{
				return createWorkflowLoopCountPredicateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy <em>Workflow Serial Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowSerialOrchestrationStrategyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowParallelOrchestrationStrategyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy <em>Workflow Composite Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowCompositeOrchestrationStrategyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy <em>Workflow Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowComponentOrchestrationStrategyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy <em>Workflow Loop Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy
	 * @generated
	 */
	public Adapter createWorkflowLoopComponentOrchestrationStrategyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate <em>Workflow Execution Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate
	 * @generated
	 */
	public Adapter createWorkflowExecutionPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate <em>Workflow Rerun Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate
	 * @generated
	 */
	public Adapter createWorkflowRerunPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate <em>Workflow Parameter Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate
	 * @generated
	 */
	public Adapter createWorkflowParameterPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR <em>Workflow Predicate OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR
	 * @generated
	 */
	public Adapter createWorkflowPredicateORAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND <em>Workflow Predicate AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND
	 * @generated
	 */
	public Adapter createWorkflowPredicateANDAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate <em>Workflow Loop Count Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate
	 * @generated
	 */
	public Adapter createWorkflowLoopCountPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //OrchestrationAdapterFactory
