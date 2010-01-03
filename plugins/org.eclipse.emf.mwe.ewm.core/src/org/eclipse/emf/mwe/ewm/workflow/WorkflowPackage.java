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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage;
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
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public class WorkflowPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WorkflowPackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowComponent()
	 * @generated
	 */
	public static final int WORKFLOW_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowCompositeComponent()
	 * @generated
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__NAME = WORKFLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__TYPE = WORKFLOW_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__DESCRIPTION = WORKFLOW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS = WORKFLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS = WORKFLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composite Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS = WORKFLOW_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Resolution Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY = WORKFLOW_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPOSITE_COMPONENT_FEATURE_COUNT = WORKFLOW_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork <em>Unit Of Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowUnitOfWork()
	 * @generated
	 */
	public static final int WORKFLOW_UNIT_OF_WORK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_UNIT_OF_WORK__NAME = WORKFLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_UNIT_OF_WORK__TYPE = WORKFLOW_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_UNIT_OF_WORK__DESCRIPTION = WORKFLOW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_UNIT_OF_WORK__COMPONENT_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The number of structural features of the '<em>Unit Of Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT = WORKFLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER__CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER__VALUE_STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER__DIRECTION = 6;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterValueStrategy <em>Parameter Value Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterValueStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterValueStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER_VALUE_STRATEGY = 4;

	/**
	 * The number of structural features of the '<em>Parameter Value Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_VALUE_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection <em>Parameter Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterConnection()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Source Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Target Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Parameter Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterSimpleValueStrategy <em>Parameter Simple Value Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterSimpleValueStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterSimpleValueStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY = 6;

	/**
	 * The number of structural features of the '<em>Parameter Simple Value Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY_FEATURE_COUNT = WORKFLOW_PARAMETER_VALUE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy <em>Component Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowComponentProxy()
	 * @generated
	 */
	public static final int WORKFLOW_COMPONENT_PROXY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_PROXY__NAME = WORKFLOW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_PROXY__TYPE = WORKFLOW_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_PROXY__DESCRIPTION = WORKFLOW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_PROXY__COMPONENT_ORCHESTRATION_STRATEGY = WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT = WORKFLOW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_PROXY_FEATURE_COUNT = WORKFLOW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterDirection <em>Parameter Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterDirection
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterDirection()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER_DIRECTION = 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowCompositeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowUnitOfWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterValueStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterSimpleValueStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workflowParameterDirectionEEnum = null;

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
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkflowPackage()
	{
		super(eNS_URI, WorkflowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkflowPackage init()
	{
		if (isInited) return (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);

		// Obtain or create and register package
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkflowPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkflowPackage());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackage ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);
		RuntimePackage theRuntimePackage = (RuntimePackage)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackage ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);
		StatePackage theStatePackage = (StatePackage)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackage ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);

		// Create package meta-data objects
		theWorkflowPackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theStatePackage.createPackageContents();

		// Initialize created meta-data
		theWorkflowPackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theStatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkflowPackage.eNS_URI, theWorkflowPackage);
		return theWorkflowPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent
	 * @generated
	 */
	public EClass getWorkflowComponent()
	{
		return workflowComponentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getName()
	 * @see #getWorkflowComponent()
	 * @generated
	 */
	public EAttribute getWorkflowComponent_Name() {
		return (EAttribute)workflowComponentEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getType()
	 * @see #getWorkflowComponent()
	 * @generated
	 */
	public EAttribute getWorkflowComponent_Type()
	{
		return (EAttribute)workflowComponentEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getDescription()
	 * @see #getWorkflowComponent()
	 * @generated
	 */
	public EAttribute getWorkflowComponent_Description() {
		return (EAttribute)workflowComponentEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getComponentOrchestrationStrategy <em>Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent#getComponentOrchestrationStrategy()
	 * @see #getWorkflowComponent()
	 * @generated
	 */
	public EReference getWorkflowComponent_ComponentOrchestrationStrategy()
	{
		return (EReference)workflowComponentEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent
	 * @generated
	 */
	public EClass getWorkflowCompositeComponent()
	{
		return workflowCompositeComponentEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getComponents()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_Components()
	{
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getParameters()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_Parameters()
	{
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getCompositeOrchestrationStrategy <em>Composite Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getCompositeOrchestrationStrategy()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_CompositeOrchestrationStrategy()
	{
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getConnections()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_Connections()
	{
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getStateResolutionStrategy <em>State Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Resolution Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getStateResolutionStrategy()
	 * @see #getWorkflowCompositeComponent()
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_StateResolutionStrategy()
	{
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork <em>Unit Of Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Of Work</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork
	 * @generated
	 */
	public EClass getWorkflowUnitOfWork()
	{
		return workflowUnitOfWorkEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter
	 * @generated
	 */
	public EClass getWorkflowParameter()
	{
		return workflowParameterEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getType()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	public EReference getWorkflowParameter_Type()
	{
		return (EReference)workflowParameterEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getValueStrategy <em>Value Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getValueStrategy()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	public EReference getWorkflowParameter_ValueStrategy()
	{
		return (EReference)workflowParameterEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getDirection()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Direction()
	{
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterValueStrategy <em>Parameter Value Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterValueStrategy
	 * @generated
	 */
	public EClass getWorkflowParameterValueStrategy()
	{
		return workflowParameterValueStrategyEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getName()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Name()
	{
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getDescription()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Description()
	{
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getConnection()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	public EReference getWorkflowParameter_Connection()
	{
		return (EReference)workflowParameterEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#isRequired()
	 * @see #getWorkflowParameter()
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Required()
	{
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection <em>Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Connection</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection
	 * @generated
	 */
	public EClass getWorkflowParameterConnection()
	{
		return workflowParameterConnectionEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getSourceParameter <em>Source Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getSourceParameter()
	 * @see #getWorkflowParameterConnection()
	 * @generated
	 */
	public EReference getWorkflowParameterConnection_SourceParameter()
	{
		return (EReference)workflowParameterConnectionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getTargetParameters <em>Target Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Parameters</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getTargetParameters()
	 * @see #getWorkflowParameterConnection()
	 * @generated
	 */
	public EReference getWorkflowParameterConnection_TargetParameters()
	{
		return (EReference)workflowParameterConnectionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterSimpleValueStrategy <em>Parameter Simple Value Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Simple Value Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterSimpleValueStrategy
	 * @generated
	 */
	public EClass getWorkflowParameterSimpleValueStrategy()
	{
		return workflowParameterSimpleValueStrategyEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy <em>Component Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Proxy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy
	 * @generated
	 */
	public EClass getWorkflowComponentProxy()
	{
		return workflowComponentProxyEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy#getTargetComponent <em>Target Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Component</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy#getTargetComponent()
	 * @see #getWorkflowComponentProxy()
	 * @generated
	 */
	public EReference getWorkflowComponentProxy_TargetComponent()
	{
		return (EReference)workflowComponentProxyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterDirection <em>Parameter Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Direction</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterDirection
	 * @generated
	 */
	public EEnum getWorkflowParameterDirection()
	{
		return workflowParameterDirectionEEnum;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public WorkflowFactory getWorkflowFactory()
	{
		return (WorkflowFactory)getEFactoryInstance();
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
		workflowComponentEClass = createEClass(WORKFLOW_COMPONENT);
		createEAttribute(workflowComponentEClass, WORKFLOW_COMPONENT__NAME);
		createEAttribute(workflowComponentEClass, WORKFLOW_COMPONENT__TYPE);
		createEAttribute(workflowComponentEClass, WORKFLOW_COMPONENT__DESCRIPTION);
		createEReference(workflowComponentEClass, WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY);

		workflowCompositeComponentEClass = createEClass(WORKFLOW_COMPOSITE_COMPONENT);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY);

		workflowUnitOfWorkEClass = createEClass(WORKFLOW_UNIT_OF_WORK);

		workflowParameterEClass = createEClass(WORKFLOW_PARAMETER);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__NAME);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__DESCRIPTION);
		createEReference(workflowParameterEClass, WORKFLOW_PARAMETER__CONNECTION);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__REQUIRED);
		createEReference(workflowParameterEClass, WORKFLOW_PARAMETER__TYPE);
		createEReference(workflowParameterEClass, WORKFLOW_PARAMETER__VALUE_STRATEGY);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__DIRECTION);

		workflowParameterValueStrategyEClass = createEClass(WORKFLOW_PARAMETER_VALUE_STRATEGY);

		workflowParameterConnectionEClass = createEClass(WORKFLOW_PARAMETER_CONNECTION);
		createEReference(workflowParameterConnectionEClass, WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER);
		createEReference(workflowParameterConnectionEClass, WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS);

		workflowParameterSimpleValueStrategyEClass = createEClass(WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY);

		workflowComponentProxyEClass = createEClass(WORKFLOW_COMPONENT_PROXY);
		createEReference(workflowComponentProxyEClass, WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT);

		// Create enums
		workflowParameterDirectionEEnum = createEEnum(WORKFLOW_PARAMETER_DIRECTION);
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
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOrchestrationPackage);
		getESubpackages().add(theRuntimePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowCompositeComponentEClass.getESuperTypes().add(this.getWorkflowComponent());
		workflowUnitOfWorkEClass.getESuperTypes().add(this.getWorkflowComponent());
		workflowParameterSimpleValueStrategyEClass.getESuperTypes().add(this.getWorkflowParameterValueStrategy());
		workflowComponentProxyEClass.getESuperTypes().add(this.getWorkflowComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowComponentEClass, WorkflowComponent.class, "WorkflowComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, WorkflowComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowComponent_Type(), ecorePackage.getEString(), "type", null, 1, 1, WorkflowComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkflowComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowComponent_ComponentOrchestrationStrategy(), theOrchestrationPackage.getWorkflowComponentOrchestrationStrategy(), null, "componentOrchestrationStrategy", null, 0, 1, WorkflowComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(workflowComponentEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		op = addEOperation(workflowComponentEClass, null, "clearLog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, null, "logError", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, null, "logWarning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, null, "logInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, null, "logDebug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, null, "logException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getException(), "e", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, theStatePackage.getWorkflowState(), "getState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, null, "setState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStatePackage.getWorkflowState(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, theRuntimePackage.getWorkflowComponentExecutionInfo(), "getExecutionInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowComponentEClass, null, "setExecutionInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowComponentExecutionInfo(), "executionInfo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowCompositeComponentEClass, WorkflowCompositeComponent.class, "WorkflowCompositeComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowCompositeComponent_Components(), this.getWorkflowComponent(), null, "components", null, 0, -1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowCompositeComponent_Parameters(), this.getWorkflowParameter(), null, "parameters", null, 0, -1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowCompositeComponent_CompositeOrchestrationStrategy(), theOrchestrationPackage.getWorkflowCompositeOrchestrationStrategy(), null, "compositeOrchestrationStrategy", null, 1, 1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowCompositeComponent_Connections(), this.getWorkflowParameterConnection(), null, "connections", null, 0, -1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowCompositeComponent_StateResolutionStrategy(), theRuntimePackage.getWorkflowStateResolutionStrategy(), null, "stateResolutionStrategy", null, 1, 1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowCompositeComponentEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		initEClass(workflowUnitOfWorkEClass, WorkflowUnitOfWork.class, "WorkflowUnitOfWork", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowUnitOfWorkEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		initEClass(workflowParameterEClass, WorkflowParameter.class, "WorkflowParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowParameter_Description(), ecorePackage.getEString(), "description", null, 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowParameter_Connection(), this.getWorkflowParameterConnection(), this.getWorkflowParameterConnection_TargetParameters(), "connection", null, 0, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowParameter_Required(), ecorePackage.getEBoolean(), "required", null, 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowParameter_Type(), theEcorePackage.getEClassifier(), null, "type", null, 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowParameter_ValueStrategy(), this.getWorkflowParameterValueStrategy(), null, "valueStrategy", null, 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowParameter_Direction(), this.getWorkflowParameterDirection(), "direction", null, 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowParameterEClass, ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		op = addEOperation(workflowParameterEClass, null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		initEClass(workflowParameterValueStrategyEClass, WorkflowParameterValueStrategy.class, "WorkflowParameterValueStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowParameterValueStrategyEClass, ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWorkflowParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		op = addEOperation(workflowParameterValueStrategyEClass, null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWorkflowParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		initEClass(workflowParameterConnectionEClass, WorkflowParameterConnection.class, "WorkflowParameterConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowParameterConnection_SourceParameter(), this.getWorkflowParameter(), null, "sourceParameter", null, 1, 1, WorkflowParameterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowParameterConnection_TargetParameters(), this.getWorkflowParameter(), this.getWorkflowParameter_Connection(), "targetParameters", null, 1, -1, WorkflowParameterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowParameterSimpleValueStrategyEClass, WorkflowParameterSimpleValueStrategy.class, "WorkflowParameterSimpleValueStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowParameterSimpleValueStrategyEClass, ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWorkflowParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		op = addEOperation(workflowParameterSimpleValueStrategyEClass, null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWorkflowParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theRuntimePackage.getWorkflowRuntimeException());

		initEClass(workflowComponentProxyEClass, WorkflowComponentProxy.class, "WorkflowComponentProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowComponentProxy_TargetComponent(), this.getWorkflowComponent(), null, "targetComponent", null, 1, 1, WorkflowComponentProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(workflowParameterDirectionEEnum, WorkflowParameterDirection.class, "WorkflowParameterDirection");
		addEEnumLiteral(workflowParameterDirectionEEnum, WorkflowParameterDirection.IN_OUT);
		addEEnumLiteral(workflowParameterDirectionEEnum, WorkflowParameterDirection.IN);
		addEEnumLiteral(workflowParameterDirectionEEnum, WorkflowParameterDirection.OUT);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowComponent()
		 * @generated
		 */
		public static final EClass WORKFLOW_COMPONENT = eINSTANCE.getWorkflowComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_COMPONENT__NAME = eINSTANCE.getWorkflowComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_COMPONENT__TYPE = eINSTANCE.getWorkflowComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_COMPONENT__DESCRIPTION = eINSTANCE.getWorkflowComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Component Orchestration Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowComponent_ComponentOrchestrationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowCompositeComponent()
		 * @generated
		 */
		public static final EClass WORKFLOW_COMPOSITE_COMPONENT = eINSTANCE.getWorkflowCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS = eINSTANCE.getWorkflowCompositeComponent_Components();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS = eINSTANCE.getWorkflowCompositeComponent_Parameters();

		/**
		 * The meta object literal for the '<em><b>Composite Orchestration Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowCompositeComponent_CompositeOrchestrationStrategy();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS = eINSTANCE.getWorkflowCompositeComponent_Connections();

		/**
		 * The meta object literal for the '<em><b>State Resolution Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY = eINSTANCE.getWorkflowCompositeComponent_StateResolutionStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork <em>Unit Of Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowUnitOfWork()
		 * @generated
		 */
		public static final EClass WORKFLOW_UNIT_OF_WORK = eINSTANCE.getWorkflowUnitOfWork();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARAMETER = eINSTANCE.getWorkflowParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER__TYPE = eINSTANCE.getWorkflowParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER__VALUE_STRATEGY = eINSTANCE.getWorkflowParameter_ValueStrategy();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_PARAMETER__DIRECTION = eINSTANCE.getWorkflowParameter_Direction();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterValueStrategy <em>Parameter Value Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterValueStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterValueStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARAMETER_VALUE_STRATEGY = eINSTANCE.getWorkflowParameterValueStrategy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_PARAMETER__NAME = eINSTANCE.getWorkflowParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_PARAMETER__DESCRIPTION = eINSTANCE.getWorkflowParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER__CONNECTION = eINSTANCE.getWorkflowParameter_Connection();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_PARAMETER__REQUIRED = eINSTANCE.getWorkflowParameter_Required();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection <em>Parameter Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterConnection()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARAMETER_CONNECTION = eINSTANCE.getWorkflowParameterConnection();

		/**
		 * The meta object literal for the '<em><b>Source Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER_CONNECTION__SOURCE_PARAMETER = eINSTANCE.getWorkflowParameterConnection_SourceParameter();

		/**
		 * The meta object literal for the '<em><b>Target Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER_CONNECTION__TARGET_PARAMETERS = eINSTANCE.getWorkflowParameterConnection_TargetParameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterSimpleValueStrategy <em>Parameter Simple Value Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterSimpleValueStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterSimpleValueStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY = eINSTANCE.getWorkflowParameterSimpleValueStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy <em>Component Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowComponentProxy()
		 * @generated
		 */
		public static final EClass WORKFLOW_COMPONENT_PROXY = eINSTANCE.getWorkflowComponentProxy();

		/**
		 * The meta object literal for the '<em><b>Target Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT = eINSTANCE.getWorkflowComponentProxy_TargetComponent();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterDirection <em>Parameter Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterDirection
		 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterDirection()
		 * @generated
		 */
		public static final EEnum WORKFLOW_PARAMETER_DIRECTION = eINSTANCE.getWorkflowParameterDirection();

	}

} //WorkflowPackage
