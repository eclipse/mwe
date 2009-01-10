/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.runtime;

import java.util.Map;
import java.util.concurrent.ExecutorService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage;
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
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public class RuntimePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/runtime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RuntimePackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext <em>Workflow Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext()
	 * @generated
	 */
	public static final int WORKFLOW_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Thread Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__THREAD_POOL = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__STATES = 2;

	/**
	 * The number of structural features of the '<em>Workflow Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine <em>Workflow Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowEngine()
	 * @generated
	 */
	public static final int WORKFLOW_ENGINE = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap <em>Workflow State Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateMap()
	 * @generated
	 */
	public static final int WORKFLOW_STATE_MAP = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap <em>Workflow Parameter Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowParameterMap()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER_MAP = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy <em>Workflow State Resolution Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateResolutionStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_STATE_RESOLUTION_STRATEGY = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner <em>Workflow Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRunner()
	 * @generated
	 */
	public static final int WORKFLOW_RUNNER = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable <em>Workflow Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRunnable()
	 * @generated
	 */
	public static final int WORKFLOW_RUNNABLE = 5;

	/**
	 * The number of structural features of the '<em>Workflow Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_ENGINE__WORKFLOW = WORKFLOW_RUNNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_ENGINE__CONTEXT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_ENGINE_FEATURE_COUNT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow State Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_MAP_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow Parameter Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Workflow State Resolution Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_RESOLUTION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNER__CONTEXT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNER__COMPONENT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNER_FEATURE_COUNT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.IWorkflowVisitor <em>IWorkflow Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.IWorkflowVisitor
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getIWorkflowVisitor()
	 * @generated
	 */
	public static final int IWORKFLOW_VISITOR = 7;

	/**
	 * The number of structural features of the '<em>IWorkflow Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IWORKFLOW_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResetter <em>Workflow State Resetter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResetter
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateResetter()
	 * @generated
	 */
	public static final int WORKFLOW_STATE_RESETTER = 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_RESETTER__CONTEXT = IWORKFLOW_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow State Resetter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_RESETTER_FEATURE_COUNT = IWORKFLOW_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Executor Service</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ExecutorService
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getExecutorService()
	 * @generated
	 */
	public static final int EXECUTOR_SERVICE = 9;

	/**
	 * The meta object id for the '<em>Workflow Runtime Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRuntimeException()
	 * @generated
	 */
	public static final int WORKFLOW_RUNTIME_EXCEPTION = 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateResolutionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iWorkflowVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateResetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executorServiceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workflowRuntimeExceptionEDataType = null;

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
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackage()
	{
		super(eNS_URI, RuntimeFactory.eINSTANCE);
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
	public static RuntimePackage init()
	{
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		RuntimePackage theRuntimePackage = (RuntimePackage)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RuntimePackage ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RuntimePackage());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackage ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);
		StatePackage theStatePackage = (StatePackage)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackage ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();
		theStatePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();
		theStatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

		return theRuntimePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext <em>Workflow Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext
	 * @generated
	 */
	public EClass getWorkflowContext()
	{
		return workflowContextEClass;
	}

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParameters()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_Parameters()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getThreadPool <em>Thread Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Pool</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getThreadPool()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EAttribute getWorkflowContext_ThreadPool()
	{
		return (EAttribute)workflowContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>States</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getStates()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_States()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine <em>Workflow Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Engine</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine
	 * @generated
	 */
	public EClass getWorkflowEngine()
	{
		return workflowEngineEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getWorkflow()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	public EReference getWorkflowEngine_Workflow()
	{
		return (EReference)workflowEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getContext()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	public EReference getWorkflowEngine_Context()
	{
		return (EReference)workflowEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow State Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent" keyRequired="true"
	 *        valueType="org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	public EClass getWorkflowStateMap()
	{
		return workflowStateMapEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowStateMap()
	 * @generated
	 */
	public EReference getWorkflowStateMap_Key()
	{
		return (EReference)workflowStateMapEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowStateMap()
	 * @generated
	 */
	public EReference getWorkflowStateMap_Value()
	{
		return (EReference)workflowStateMapEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow Parameter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Parameter Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter" keyRequired="true"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	public EClass getWorkflowParameterMap()
	{
		return workflowParameterMapEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowParameterMap()
	 * @generated
	 */
	public EReference getWorkflowParameterMap_Key()
	{
		return (EReference)workflowParameterMapEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowParameterMap()
	 * @generated
	 */
	public EReference getWorkflowParameterMap_Value()
	{
		return (EReference)workflowParameterMapEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy <em>Workflow State Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State Resolution Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy
	 * @generated
	 */
	public EClass getWorkflowStateResolutionStrategy()
	{
		return workflowStateResolutionStrategyEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Runnable <em>Workflow Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Runnable</em>'.
	 * @see java.lang.Runnable
	 * @model instanceClass="java.lang.Runnable"
	 * @generated
	 */
	public EClass getWorkflowRunnable()
	{
		return workflowRunnableEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner <em>Workflow Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Runner</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner
	 * @generated
	 */
	public EClass getWorkflowRunner()
	{
		return workflowRunnerEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner#getContext()
	 * @see #getWorkflowRunner()
	 * @generated
	 */
	public EReference getWorkflowRunner_Context()
	{
		return (EReference)workflowRunnerEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner#getComponent()
	 * @see #getWorkflowRunner()
	 * @generated
	 */
	public EReference getWorkflowRunner_Component()
	{
		return (EReference)workflowRunnerEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.IWorkflowVisitor <em>IWorkflow Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IWorkflow Visitor</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.IWorkflowVisitor
	 * @generated
	 */
	public EClass getIWorkflowVisitor()
	{
		return iWorkflowVisitorEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResetter <em>Workflow State Resetter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State Resetter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResetter
	 * @generated
	 */
	public EClass getWorkflowStateResetter()
	{
		return workflowStateResetterEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResetter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResetter#getContext()
	 * @see #getWorkflowStateResetter()
	 * @generated
	 */
	public EReference getWorkflowStateResetter_Context()
	{
		return (EReference)workflowStateResetterEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for data type '{@link java.util.concurrent.ExecutorService <em>Executor Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Executor Service</em>'.
	 * @see java.util.concurrent.ExecutorService
	 * @model instanceClass="java.util.concurrent.ExecutorService"
	 * @generated
	 */
	public EDataType getExecutorService()
	{
		return executorServiceEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException <em>Workflow Runtime Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Workflow Runtime Exception</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException
	 * @model instanceClass="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException"
	 * @generated
	 */
	public EDataType getWorkflowRuntimeException()
	{
		return workflowRuntimeExceptionEDataType;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RuntimeFactory getRuntimeFactory()
	{
		return (RuntimeFactory)getEFactoryInstance();
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
		workflowContextEClass = createEClass(WORKFLOW_CONTEXT);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__PARAMETERS);
		createEAttribute(workflowContextEClass, WORKFLOW_CONTEXT__THREAD_POOL);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__STATES);

		workflowEngineEClass = createEClass(WORKFLOW_ENGINE);
		createEReference(workflowEngineEClass, WORKFLOW_ENGINE__WORKFLOW);
		createEReference(workflowEngineEClass, WORKFLOW_ENGINE__CONTEXT);

		workflowStateMapEClass = createEClass(WORKFLOW_STATE_MAP);
		createEReference(workflowStateMapEClass, WORKFLOW_STATE_MAP__KEY);
		createEReference(workflowStateMapEClass, WORKFLOW_STATE_MAP__VALUE);

		workflowParameterMapEClass = createEClass(WORKFLOW_PARAMETER_MAP);
		createEReference(workflowParameterMapEClass, WORKFLOW_PARAMETER_MAP__KEY);
		createEReference(workflowParameterMapEClass, WORKFLOW_PARAMETER_MAP__VALUE);

		workflowStateResolutionStrategyEClass = createEClass(WORKFLOW_STATE_RESOLUTION_STRATEGY);

		workflowRunnableEClass = createEClass(WORKFLOW_RUNNABLE);

		workflowRunnerEClass = createEClass(WORKFLOW_RUNNER);
		createEReference(workflowRunnerEClass, WORKFLOW_RUNNER__CONTEXT);
		createEReference(workflowRunnerEClass, WORKFLOW_RUNNER__COMPONENT);

		iWorkflowVisitorEClass = createEClass(IWORKFLOW_VISITOR);

		workflowStateResetterEClass = createEClass(WORKFLOW_STATE_RESETTER);
		createEReference(workflowStateResetterEClass, WORKFLOW_STATE_RESETTER__CONTEXT);

		// Create data types
		executorServiceEDataType = createEDataType(EXECUTOR_SERVICE);
		workflowRuntimeExceptionEDataType = createEDataType(WORKFLOW_RUNTIME_EXCEPTION);
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
		StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStatePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowEngineEClass.getESuperTypes().add(this.getWorkflowRunnable());
		workflowRunnerEClass.getESuperTypes().add(this.getWorkflowRunnable());
		workflowStateResetterEClass.getESuperTypes().add(this.getIWorkflowVisitor());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowContextEClass, WorkflowContext.class, "WorkflowContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowContext_Parameters(), this.getWorkflowParameterMap(), null, "parameters", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowContext_ThreadPool(), this.getExecutorService(), "threadPool", null, 0, 1, WorkflowContext.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowContext_States(), this.getWorkflowStateMap(), null, "states", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(workflowContextEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowEngineEClass, WorkflowEngine.class, "WorkflowEngine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowEngine_Workflow(), theWorkflowPackage.getWorkflowComponent(), null, "workflow", null, 1, 1, WorkflowEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowEngine_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workflowEngineEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEngineEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowStateMapEClass, Map.Entry.class, "WorkflowStateMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowStateMap_Key(), theWorkflowPackage.getWorkflowComponent(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowStateMap_Value(), theStatePackage.getWorkflowState(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowParameterMapEClass, Map.Entry.class, "WorkflowParameterMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowParameterMap_Key(), theWorkflowPackage.getWorkflowParameter(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowParameterMap_Value(), theEcorePackage.getEObject(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowStateResolutionStrategyEClass, WorkflowStateResolutionStrategy.class, "WorkflowStateResolutionStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowStateResolutionStrategyEClass, theStatePackage.getWorkflowState(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "workflow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowRunnableEClass, Runnable.class, "WorkflowRunnable", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowRunnableEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowRunnerEClass, WorkflowRunner.class, "WorkflowRunner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowRunner_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowRunner_Component(), theWorkflowPackage.getWorkflowComponent(), null, "component", null, 1, 1, WorkflowRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workflowRunnerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iWorkflowVisitorEClass, IWorkflowVisitor.class, "IWorkflowVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iWorkflowVisitorEClass, null, "visitUnitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowUnitOfWork(), "unitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowVisitorEClass, null, "visitComposite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowStateResetterEClass, WorkflowStateResetter.class, "WorkflowStateResetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowStateResetter_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowStateResetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowStateResetterEClass, null, "visitUnitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowUnitOfWork(), "unitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowStateResetterEClass, null, "visitComposite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(executorServiceEDataType, ExecutorService.class, "ExecutorService", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(workflowRuntimeExceptionEDataType, WorkflowRuntimeException.class, "WorkflowRuntimeException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext <em>Workflow Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext()
		 * @generated
		 */
		public static final EClass WORKFLOW_CONTEXT = eINSTANCE.getWorkflowContext();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__PARAMETERS = eINSTANCE.getWorkflowContext_Parameters();

		/**
		 * The meta object literal for the '<em><b>Thread Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_CONTEXT__THREAD_POOL = eINSTANCE.getWorkflowContext_ThreadPool();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__STATES = eINSTANCE.getWorkflowContext_States();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine <em>Workflow Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowEngine()
		 * @generated
		 */
		public static final EClass WORKFLOW_ENGINE = eINSTANCE.getWorkflowEngine();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_ENGINE__WORKFLOW = eINSTANCE.getWorkflowEngine_Workflow();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_ENGINE__CONTEXT = eINSTANCE.getWorkflowEngine_Context();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap <em>Workflow State Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateMap()
		 * @generated
		 */
		public static final EClass WORKFLOW_STATE_MAP = eINSTANCE.getWorkflowStateMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_STATE_MAP__KEY = eINSTANCE.getWorkflowStateMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_STATE_MAP__VALUE = eINSTANCE.getWorkflowStateMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap <em>Workflow Parameter Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowParameterMap()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARAMETER_MAP = eINSTANCE.getWorkflowParameterMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER_MAP__KEY = eINSTANCE.getWorkflowParameterMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER_MAP__VALUE = eINSTANCE.getWorkflowParameterMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy <em>Workflow State Resolution Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateResolutionStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_STATE_RESOLUTION_STRATEGY = eINSTANCE.getWorkflowStateResolutionStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable <em>Workflow Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRunnable()
		 * @generated
		 */
		public static final EClass WORKFLOW_RUNNABLE = eINSTANCE.getWorkflowRunnable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner <em>Workflow Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRunner()
		 * @generated
		 */
		public static final EClass WORKFLOW_RUNNER = eINSTANCE.getWorkflowRunner();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_RUNNER__CONTEXT = eINSTANCE.getWorkflowRunner_Context();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_RUNNER__COMPONENT = eINSTANCE.getWorkflowRunner_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.IWorkflowVisitor <em>IWorkflow Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.IWorkflowVisitor
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getIWorkflowVisitor()
		 * @generated
		 */
		public static final EClass IWORKFLOW_VISITOR = eINSTANCE.getIWorkflowVisitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResetter <em>Workflow State Resetter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResetter
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateResetter()
		 * @generated
		 */
		public static final EClass WORKFLOW_STATE_RESETTER = eINSTANCE.getWorkflowStateResetter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_STATE_RESETTER__CONTEXT = eINSTANCE.getWorkflowStateResetter_Context();

		/**
		 * The meta object literal for the '<em>Executor Service</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ExecutorService
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getExecutorService()
		 * @generated
		 */
		public static final EDataType EXECUTOR_SERVICE = eINSTANCE.getExecutorService();

		/**
		 * The meta object literal for the '<em>Workflow Runtime Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRuntimeException()
		 * @generated
		 */
		public static final EDataType WORKFLOW_RUNTIME_EXCEPTION = eINSTANCE.getWorkflowRuntimeException();

	}

} //RuntimePackage
