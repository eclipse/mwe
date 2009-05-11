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
package org.eclipse.emf.mwe.ewm.workflow.runtime.state;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory
 * @model kind="package"
 * @generated
 */
public class StatePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "state";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/runtime/state";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.runtime.state";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatePackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState <em>Workflow State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowState()
	 * @generated
	 */
	public static final int WORKFLOW_STATE = 0;

	/**
	 * The number of structural features of the '<em>Workflow State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState <em>Workflow Idle State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowIdleState()
	 * @generated
	 */
	public static final int WORKFLOW_IDLE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Workflow Idle State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_IDLE_STATE_FEATURE_COUNT = WORKFLOW_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState <em>Workflow Running State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowRunningState()
	 * @generated
	 */
	public static final int WORKFLOW_RUNNING_STATE = 2;

	/**
	 * The number of structural features of the '<em>Workflow Running State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNING_STATE_FEATURE_COUNT = WORKFLOW_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState <em>Workflow Done State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowDoneState()
	 * @generated
	 */
	public static final int WORKFLOW_DONE_STATE = 3;

	/**
	 * The number of structural features of the '<em>Workflow Done State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_DONE_STATE_FEATURE_COUNT = WORKFLOW_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState <em>Workflow Success State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowSuccessState()
	 * @generated
	 */
	public static final int WORKFLOW_SUCCESS_STATE = 4;

	/**
	 * The number of structural features of the '<em>Workflow Success State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_SUCCESS_STATE_FEATURE_COUNT = WORKFLOW_DONE_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState <em>Workflow Failed State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowFailedState()
	 * @generated
	 */
	public static final int WORKFLOW_FAILED_STATE = 5;

	/**
	 * The number of structural features of the '<em>Workflow Failed State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_FAILED_STATE_FEATURE_COUNT = WORKFLOW_DONE_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState <em>Workflow Error State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowErrorState()
	 * @generated
	 */
	public static final int WORKFLOW_ERROR_STATE = 6;

	/**
	 * The number of structural features of the '<em>Workflow Error State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_ERROR_STATE_FEATURE_COUNT = WORKFLOW_DONE_STATE_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowIdleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunningStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowDoneStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowSuccessStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowFailedStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowErrorStateEClass = null;

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
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatePackage()
	{
		super(eNS_URI, StateFactory.eINSTANCE);
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
	public static StatePackage init()
	{
		if (isInited) return (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);

		// Obtain or create and register package
		StatePackage theStatePackage = (StatePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatePackage());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackage ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);
		RuntimePackage theRuntimePackage = (RuntimePackage)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackage ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);

		// Create package meta-data objects
		theStatePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theStatePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatePackage.freeze();

		return theStatePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState <em>Workflow State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState
	 * @generated
	 */
	public EClass getWorkflowState()
	{
		return workflowStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState <em>Workflow Idle State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Idle State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState
	 * @generated
	 */
	public EClass getWorkflowIdleState()
	{
		return workflowIdleStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState <em>Workflow Running State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Running State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState
	 * @generated
	 */
	public EClass getWorkflowRunningState()
	{
		return workflowRunningStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState <em>Workflow Done State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Done State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState
	 * @generated
	 */
	public EClass getWorkflowDoneState()
	{
		return workflowDoneStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState <em>Workflow Success State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Success State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState
	 * @generated
	 */
	public EClass getWorkflowSuccessState()
	{
		return workflowSuccessStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState <em>Workflow Failed State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Failed State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState
	 * @generated
	 */
	public EClass getWorkflowFailedState()
	{
		return workflowFailedStateEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState <em>Workflow Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Error State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState
	 * @generated
	 */
	public EClass getWorkflowErrorState()
	{
		return workflowErrorStateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StateFactory getStateFactory()
	{
		return (StateFactory)getEFactoryInstance();
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
		workflowStateEClass = createEClass(WORKFLOW_STATE);

		workflowIdleStateEClass = createEClass(WORKFLOW_IDLE_STATE);

		workflowRunningStateEClass = createEClass(WORKFLOW_RUNNING_STATE);

		workflowDoneStateEClass = createEClass(WORKFLOW_DONE_STATE);

		workflowSuccessStateEClass = createEClass(WORKFLOW_SUCCESS_STATE);

		workflowFailedStateEClass = createEClass(WORKFLOW_FAILED_STATE);

		workflowErrorStateEClass = createEClass(WORKFLOW_ERROR_STATE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowIdleStateEClass.getESuperTypes().add(this.getWorkflowState());
		workflowRunningStateEClass.getESuperTypes().add(this.getWorkflowState());
		workflowDoneStateEClass.getESuperTypes().add(this.getWorkflowState());
		workflowSuccessStateEClass.getESuperTypes().add(this.getWorkflowDoneState());
		workflowFailedStateEClass.getESuperTypes().add(this.getWorkflowDoneState());
		workflowErrorStateEClass.getESuperTypes().add(this.getWorkflowDoneState());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowStateEClass, WorkflowState.class, "WorkflowState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowIdleStateEClass, WorkflowIdleState.class, "WorkflowIdleState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowIdleStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowRunningStateEClass, WorkflowRunningState.class, "WorkflowRunningState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowRunningStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowDoneStateEClass, WorkflowDoneState.class, "WorkflowDoneState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowDoneStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowSuccessStateEClass, WorkflowSuccessState.class, "WorkflowSuccessState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowSuccessStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowFailedStateEClass, WorkflowFailedState.class, "WorkflowFailedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowFailedStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowErrorStateEClass, WorkflowErrorState.class, "WorkflowErrorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowErrorStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState <em>Workflow State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowState()
		 * @generated
		 */
		public static final EClass WORKFLOW_STATE = eINSTANCE.getWorkflowState();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState <em>Workflow Idle State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowIdleState()
		 * @generated
		 */
		public static final EClass WORKFLOW_IDLE_STATE = eINSTANCE.getWorkflowIdleState();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState <em>Workflow Running State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowRunningState()
		 * @generated
		 */
		public static final EClass WORKFLOW_RUNNING_STATE = eINSTANCE.getWorkflowRunningState();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState <em>Workflow Done State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowDoneState()
		 * @generated
		 */
		public static final EClass WORKFLOW_DONE_STATE = eINSTANCE.getWorkflowDoneState();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState <em>Workflow Success State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowSuccessState()
		 * @generated
		 */
		public static final EClass WORKFLOW_SUCCESS_STATE = eINSTANCE.getWorkflowSuccessState();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState <em>Workflow Failed State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowFailedState()
		 * @generated
		 */
		public static final EClass WORKFLOW_FAILED_STATE = eINSTANCE.getWorkflowFailedState();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState <em>Workflow Error State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage#getWorkflowErrorState()
		 * @generated
		 */
		public static final EClass WORKFLOW_ERROR_STATE = eINSTANCE.getWorkflowErrorState();

	}

} //StatePackage
