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
	public static final int WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY = 2;

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
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowParallelOrchestrationStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Workflow Parallel Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY_FEATURE_COUNT = WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy <em>Workflow Component Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowComponentOrchestrationStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Workflow Component Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy <em>Workflow Conditional Component Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowConditionalComponentOrchestrationStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY__CONDITIONS = WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Conditional Component Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT = WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate <em>Workflow Execution Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowExecutionPredicate()
	 * @generated
	 */
	public static final int WORKFLOW_EXECUTION_PREDICATE = 5;

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
	public static final int WORKFLOW_RERUN_PREDICATE = 6;

	/**
	 * The number of structural features of the '<em>Workflow Rerun Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RERUN_PREDICATE_FEATURE_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 0;

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
	private EClass workflowParallelOrchestrationStrategyEClass = null;

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
	private EClass workflowConditionalComponentOrchestrationStrategyEClass = null;

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
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
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
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Parallel Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy
	 * @generated
	 */
	public EClass getWorkflowParallelOrchestrationStrategy()
	{
		return workflowParallelOrchestrationStrategyEClass;
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
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy <em>Workflow Conditional Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Conditional Component Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy
	 * @generated
	 */
	public EClass getWorkflowConditionalComponentOrchestrationStrategy()
	{
		return workflowConditionalComponentOrchestrationStrategyEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy#getConditions()
	 * @see #getWorkflowConditionalComponentOrchestrationStrategy()
	 * @generated
	 */
	public EReference getWorkflowConditionalComponentOrchestrationStrategy_Conditions()
	{
		return (EReference)workflowConditionalComponentOrchestrationStrategyEClass.getEStructuralFeatures().get(0);
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

		workflowParallelOrchestrationStrategyEClass = createEClass(WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY);

		workflowCompositeOrchestrationStrategyEClass = createEClass(WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY);

		workflowComponentOrchestrationStrategyEClass = createEClass(WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY);

		workflowConditionalComponentOrchestrationStrategyEClass = createEClass(WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY);
		createEReference(workflowConditionalComponentOrchestrationStrategyEClass, WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY__CONDITIONS);

		workflowExecutionPredicateEClass = createEClass(WORKFLOW_EXECUTION_PREDICATE);

		workflowRerunPredicateEClass = createEClass(WORKFLOW_RERUN_PREDICATE);
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
		workflowParallelOrchestrationStrategyEClass.getESuperTypes().add(this.getWorkflowCompositeOrchestrationStrategy());
		workflowConditionalComponentOrchestrationStrategyEClass.getESuperTypes().add(this.getWorkflowComponentOrchestrationStrategy());
		workflowRerunPredicateEClass.getESuperTypes().add(this.getWorkflowExecutionPredicate());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowSerialOrchestrationStrategyEClass, WorkflowSerialOrchestrationStrategy.class, "WorkflowSerialOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(workflowSerialOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowParallelOrchestrationStrategyEClass, WorkflowParallelOrchestrationStrategy.class, "WorkflowParallelOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowParallelOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowCompositeOrchestrationStrategyEClass, WorkflowCompositeOrchestrationStrategy.class, "WorkflowCompositeOrchestrationStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowCompositeOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowComponentOrchestrationStrategyEClass, WorkflowComponentOrchestrationStrategy.class, "WorkflowComponentOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowComponentOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowConditionalComponentOrchestrationStrategyEClass, WorkflowConditionalComponentOrchestrationStrategy.class, "WorkflowConditionalComponentOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowConditionalComponentOrchestrationStrategy_Conditions(), this.getWorkflowExecutionPredicate(), null, "conditions", null, 0, -1, WorkflowConditionalComponentOrchestrationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowConditionalComponentOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowExecutionPredicateEClass, WorkflowExecutionPredicate.class, "WorkflowExecutionPredicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowExecutionPredicateEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowRerunPredicateEClass, WorkflowRerunPredicate.class, "WorkflowRerunPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowRerunPredicateEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParallelOrchestrationStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowParallelOrchestrationStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowParallelOrchestrationStrategy();

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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy <em>Workflow Conditional Component Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowConditionalComponentOrchestrationStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowConditionalComponentOrchestrationStrategy();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY__CONDITIONS = eINSTANCE.getWorkflowConditionalComponentOrchestrationStrategy_Conditions();

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

	}

} //OrchestrationPackage
