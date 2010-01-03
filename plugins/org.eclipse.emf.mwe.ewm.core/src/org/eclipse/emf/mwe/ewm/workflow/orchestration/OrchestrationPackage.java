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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationFactory
 * @model kind="package"
 * @generated
 */
public class OrchestrationPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "orchestration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/orchestration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.orchestration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrchestrationPackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy <em>Workflow Composite Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowCompositeOrchestrationStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Workflow Composite Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy <em>Workflow Serial Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowSerialOrchestrationStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Workflow Serial Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY_FEATURE_COUNT = WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy <em>Workflow Component Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowComponentOrchestrationStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Child Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Workflow Component Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy <em>Workflow Loop Component Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopComponentOrchestrationStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY = 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION = WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION;

	/**
	 * The feature id for the '<em><b>Child Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY = WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__LOOP_CONDITION = WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Loop Component Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT = WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate <em>Workflow Execution Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowExecutionPredicate()
	 * @generated
	 */
	public static final int WORKFLOW_EXECUTION_PREDICATE = 4;

	/**
	 * The number of structural features of the '<em>Workflow Execution Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate <em>Workflow Rerun Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowRerunPredicate()
	 * @generated
	 */
	public static final int WORKFLOW_RERUN_PREDICATE = 5;

	/**
	 * The number of structural features of the '<em>Workflow Rerun Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RERUN_PREDICATE_FEATURE_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate <em>Workflow Parameter Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowParameterPredicate()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER_PREDICATE = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_PREDICATE__PARAMETER = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Parameter Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_PREDICATE_FEATURE_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR <em>Workflow Predicate OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowPredicateOR()
	 * @generated
	 */
	public static final int WORKFLOW_PREDICATE_OR = 7;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PREDICATE_OR__CONDITIONS = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Predicate OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PREDICATE_OR_FEATURE_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND <em>Workflow Predicate AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowPredicateAND()
	 * @generated
	 */
	public static final int WORKFLOW_PREDICATE_AND = 8;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PREDICATE_AND__CONDITIONS = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Predicate AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PREDICATE_AND_FEATURE_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate <em>Workflow Loop Count Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopCountPredicate()
	 * @generated
	 */
	public static final int WORKFLOW_LOOP_COUNT_PREDICATE = 9;

	/**
	 * The feature id for the '<em><b>Current Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Loop Count Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOOP_COUNT_PREDICATE_FEATURE_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowSerialOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowCompositeOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLoopComponentOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowExecutionPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRerunPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowPredicateOREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowPredicateANDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLoopCountPredicateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrchestrationPackage()
	{
		super(eNS_URI, OrchestrationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OrchestrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrchestrationPackage init()
	{
		if (isInited) return (OrchestrationPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI);

		// Obtain or create and register package
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrchestrationPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrchestrationPackage());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		RuntimePackage theRuntimePackage = (RuntimePackage)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackage ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);
		StatePackage theStatePackage = (StatePackage)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackage ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);

		// Create package meta-data objects
		theOrchestrationPackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theStatePackage.createPackageContents();

		// Initialize created meta-data
		theOrchestrationPackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theStatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrchestrationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrchestrationPackage.eNS_URI, theOrchestrationPackage);
		return theOrchestrationPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy <em>Workflow Serial Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Serial Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy
	 * @generated
	 */
	public EClass getWorkflowSerialOrchestrationStrategy()
	{
		return workflowSerialOrchestrationStrategyEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy <em>Workflow Composite Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Composite Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy
	 * @generated
	 */
	public EClass getWorkflowCompositeOrchestrationStrategy()
	{
		return workflowCompositeOrchestrationStrategyEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy <em>Workflow Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Component Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy
	 * @generated
	 */
	public EClass getWorkflowComponentOrchestrationStrategy()
	{
		return workflowComponentOrchestrationStrategyEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#getCondition()
	 * @see #getWorkflowComponentOrchestrationStrategy()
	 * @generated
	 */
	public EReference getWorkflowComponentOrchestrationStrategy_Condition()
	{
		return (EReference)workflowComponentOrchestrationStrategyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#getChildStrategy <em>Child Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#getChildStrategy()
	 * @see #getWorkflowComponentOrchestrationStrategy()
	 * @generated
	 */
	public EReference getWorkflowComponentOrchestrationStrategy_ChildStrategy()
	{
		return (EReference)workflowComponentOrchestrationStrategyEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy <em>Workflow Loop Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Loop Component Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy
	 * @generated
	 */
	public EClass getWorkflowLoopComponentOrchestrationStrategy()
	{
		return workflowLoopComponentOrchestrationStrategyEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy#getLoopCondition()
	 * @see #getWorkflowLoopComponentOrchestrationStrategy()
	 * @generated
	 */
	public EReference getWorkflowLoopComponentOrchestrationStrategy_LoopCondition()
	{
		return (EReference)workflowLoopComponentOrchestrationStrategyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate <em>Workflow Execution Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Execution Predicate</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate
	 * @generated
	 */
	public EClass getWorkflowExecutionPredicate()
	{
		return workflowExecutionPredicateEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate <em>Workflow Rerun Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Rerun Predicate</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate
	 * @generated
	 */
	public EClass getWorkflowRerunPredicate()
	{
		return workflowRerunPredicateEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate <em>Workflow Parameter Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Parameter Predicate</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate
	 * @generated
	 */
	public EClass getWorkflowParameterPredicate()
	{
		return workflowParameterPredicateEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate#getParameter()
	 * @see #getWorkflowParameterPredicate()
	 * @generated
	 */
	public EReference getWorkflowParameterPredicate_Parameter()
	{
		return (EReference)workflowParameterPredicateEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR <em>Workflow Predicate OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Predicate OR</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR
	 * @generated
	 */
	public EClass getWorkflowPredicateOR()
	{
		return workflowPredicateOREClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR#getConditions()
	 * @see #getWorkflowPredicateOR()
	 * @generated
	 */
	public EReference getWorkflowPredicateOR_Conditions()
	{
		return (EReference)workflowPredicateOREClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND <em>Workflow Predicate AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Predicate AND</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND
	 * @generated
	 */
	public EClass getWorkflowPredicateAND()
	{
		return workflowPredicateANDEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND#getConditions()
	 * @see #getWorkflowPredicateAND()
	 * @generated
	 */
	public EReference getWorkflowPredicateAND_Conditions()
	{
		return (EReference)workflowPredicateANDEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate <em>Workflow Loop Count Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Loop Count Predicate</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate
	 * @generated
	 */
	public EClass getWorkflowLoopCountPredicate()
	{
		return workflowLoopCountPredicateEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate#getCurrentCount <em>Current Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Count</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate#getCurrentCount()
	 * @see #getWorkflowLoopCountPredicate()
	 * @generated
	 */
	public EReference getWorkflowLoopCountPredicate_CurrentCount()
	{
		return (EReference)workflowLoopCountPredicateEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate#getLoopCount <em>Loop Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Count</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate#getLoopCount()
	 * @see #getWorkflowLoopCountPredicate()
	 * @generated
	 */
	public EReference getWorkflowLoopCountPredicate_LoopCount()
	{
		return (EReference)workflowLoopCountPredicateEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public OrchestrationFactory getOrchestrationFactory()
	{
		return (OrchestrationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowSerialOrchestrationStrategyEClass = createEClass(WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY);

		workflowCompositeOrchestrationStrategyEClass = createEClass(WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY);

		workflowComponentOrchestrationStrategyEClass = createEClass(WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY);
		createEReference(workflowComponentOrchestrationStrategyEClass, WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION);
		createEReference(workflowComponentOrchestrationStrategyEClass, WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY);

		workflowLoopComponentOrchestrationStrategyEClass = createEClass(WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY);
		createEReference(workflowLoopComponentOrchestrationStrategyEClass, WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__LOOP_CONDITION);

		workflowExecutionPredicateEClass = createEClass(WORKFLOW_EXECUTION_PREDICATE);

		workflowRerunPredicateEClass = createEClass(WORKFLOW_RERUN_PREDICATE);

		workflowParameterPredicateEClass = createEClass(WORKFLOW_PARAMETER_PREDICATE);
		createEReference(workflowParameterPredicateEClass, WORKFLOW_PARAMETER_PREDICATE__PARAMETER);

		workflowPredicateOREClass = createEClass(WORKFLOW_PREDICATE_OR);
		createEReference(workflowPredicateOREClass, WORKFLOW_PREDICATE_OR__CONDITIONS);

		workflowPredicateANDEClass = createEClass(WORKFLOW_PREDICATE_AND);
		createEReference(workflowPredicateANDEClass, WORKFLOW_PREDICATE_AND__CONDITIONS);

		workflowLoopCountPredicateEClass = createEClass(WORKFLOW_LOOP_COUNT_PREDICATE);
		createEReference(workflowLoopCountPredicateEClass, WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT);
		createEReference(workflowLoopCountPredicateEClass, WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowSerialOrchestrationStrategyEClass.getESuperTypes().add(this.getWorkflowCompositeOrchestrationStrategy());
		workflowLoopComponentOrchestrationStrategyEClass.getESuperTypes().add(this.getWorkflowComponentOrchestrationStrategy());
		workflowRerunPredicateEClass.getESuperTypes().add(this.getWorkflowExecutionPredicate());
		workflowParameterPredicateEClass.getESuperTypes().add(this.getWorkflowExecutionPredicate());
		workflowPredicateOREClass.getESuperTypes().add(this.getWorkflowExecutionPredicate());
		workflowPredicateANDEClass.getESuperTypes().add(this.getWorkflowExecutionPredicate());
		workflowLoopCountPredicateEClass.getESuperTypes().add(this.getWorkflowExecutionPredicate());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowSerialOrchestrationStrategyEClass, WorkflowSerialOrchestrationStrategy.class, "WorkflowSerialOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(workflowSerialOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowCompositeOrchestrationStrategyEClass, WorkflowCompositeOrchestrationStrategy.class, "WorkflowCompositeOrchestrationStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowCompositeOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowComponentOrchestrationStrategyEClass, WorkflowComponentOrchestrationStrategy.class, "WorkflowComponentOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowComponentOrchestrationStrategy_Condition(), this.getWorkflowExecutionPredicate(), null, "condition", null, 0, 1, WorkflowComponentOrchestrationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowComponentOrchestrationStrategy_ChildStrategy(), this.getWorkflowComponentOrchestrationStrategy(), null, "childStrategy", null, 0, 1, WorkflowComponentOrchestrationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowComponentOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowLoopComponentOrchestrationStrategyEClass, WorkflowLoopComponentOrchestrationStrategy.class, "WorkflowLoopComponentOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowLoopComponentOrchestrationStrategy_LoopCondition(), this.getWorkflowExecutionPredicate(), null, "loopCondition", null, 1, 1, WorkflowLoopComponentOrchestrationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowLoopComponentOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowExecutionPredicateEClass, WorkflowExecutionPredicate.class, "WorkflowExecutionPredicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowExecutionPredicateEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowExecutionPredicateEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowRerunPredicateEClass, WorkflowRerunPredicate.class, "WorkflowRerunPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowRerunPredicateEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowParameterPredicateEClass, WorkflowParameterPredicate.class, "WorkflowParameterPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowParameterPredicate_Parameter(), theWorkflowPackage.getWorkflowParameter(), null, "parameter", null, 1, 1, WorkflowParameterPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowParameterPredicateEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowPredicateOREClass, WorkflowPredicateOR.class, "WorkflowPredicateOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowPredicateOR_Conditions(), this.getWorkflowExecutionPredicate(), null, "conditions", null, 1, -1, WorkflowPredicateOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowPredicateOREClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowPredicateANDEClass, WorkflowPredicateAND.class, "WorkflowPredicateAND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowPredicateAND_Conditions(), this.getWorkflowExecutionPredicate(), null, "conditions", null, 1, -1, WorkflowPredicateAND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowPredicateANDEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowLoopCountPredicateEClass, WorkflowLoopCountPredicate.class, "WorkflowLoopCountPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowLoopCountPredicate_CurrentCount(), theWorkflowPackage.getWorkflowParameter(), null, "currentCount", null, 1, 1, WorkflowLoopCountPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowLoopCountPredicate_LoopCount(), theWorkflowPackage.getWorkflowParameter(), null, "loopCount", null, 1, 1, WorkflowLoopCountPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowLoopCountPredicateEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy <em>Workflow Serial Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowSerialOrchestrationStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowSerialOrchestrationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy <em>Workflow Composite Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowCompositeOrchestrationStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowCompositeOrchestrationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy <em>Workflow Component Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowComponentOrchestrationStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowComponentOrchestrationStrategy();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION = eINSTANCE.getWorkflowComponentOrchestrationStrategy_Condition();

		/**
		 * The meta object literal for the '<em><b>Child Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY = eINSTANCE.getWorkflowComponentOrchestrationStrategy_ChildStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy <em>Workflow Loop Component Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopComponentOrchestrationStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowLoopComponentOrchestrationStrategy();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY__LOOP_CONDITION = eINSTANCE.getWorkflowLoopComponentOrchestrationStrategy_LoopCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate <em>Workflow Execution Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowExecutionPredicate()
		 * @generated
		 */
		public static final EClass WORKFLOW_EXECUTION_PREDICATE = eINSTANCE.getWorkflowExecutionPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate <em>Workflow Rerun Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowRerunPredicate()
		 * @generated
		 */
		public static final EClass WORKFLOW_RERUN_PREDICATE = eINSTANCE.getWorkflowRerunPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate <em>Workflow Parameter Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowParameterPredicate()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARAMETER_PREDICATE = eINSTANCE.getWorkflowParameterPredicate();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER_PREDICATE__PARAMETER = eINSTANCE.getWorkflowParameterPredicate_Parameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR <em>Workflow Predicate OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowPredicateOR()
		 * @generated
		 */
		public static final EClass WORKFLOW_PREDICATE_OR = eINSTANCE.getWorkflowPredicateOR();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PREDICATE_OR__CONDITIONS = eINSTANCE.getWorkflowPredicateOR_Conditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND <em>Workflow Predicate AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowPredicateAND()
		 * @generated
		 */
		public static final EClass WORKFLOW_PREDICATE_AND = eINSTANCE.getWorkflowPredicateAND();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PREDICATE_AND__CONDITIONS = eINSTANCE.getWorkflowPredicateAND_Conditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate <em>Workflow Loop Count Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowLoopCountPredicate()
		 * @generated
		 */
		public static final EClass WORKFLOW_LOOP_COUNT_PREDICATE = eINSTANCE.getWorkflowLoopCountPredicate();

		/**
		 * The meta object literal for the '<em><b>Current Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOOP_COUNT_PREDICATE__CURRENT_COUNT = eINSTANCE.getWorkflowLoopCountPredicate_CurrentCount();

		/**
		 * The meta object literal for the '<em><b>Loop Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOOP_COUNT_PREDICATE__LOOP_COUNT = eINSTANCE.getWorkflowLoopCountPredicate_LoopCount();

	}

} //OrchestrationPackage
