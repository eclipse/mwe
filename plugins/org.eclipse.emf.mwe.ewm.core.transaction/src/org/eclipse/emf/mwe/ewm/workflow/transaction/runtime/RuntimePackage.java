/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuntimePackage.java,v 1.1 2010/01/03 21:22:53 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.transaction.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;

import org.eclipse.emf.mwe.ewm.workflow.transaction.TransactionPackage;

import org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimeFactory
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
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/transaction/runtime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.transaction.runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RuntimePackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext <em>Workflow Transactional Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage#getWorkflowTransactionalContext()
	 * @generated
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__PARAMETERS = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thread Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__THREAD_POOL = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT__THREAD_POOL;

	/**
	 * The feature id for the '<em><b>States</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__STATES = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT__STATES;

	/**
	 * The feature id for the '<em><b>Log</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__LOG = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT__LOG;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__LOG_LEVEL = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__WORKFLOW = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Active Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__ACTIVE_COMPONENTS = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT__ACTIVE_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Execution Info</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__EXECUTION_INFO = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT__EXECUTION_INFO;

	/**
	 * The feature id for the '<em><b>Editing Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT__EDITING_DOMAIN = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Transactional Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TRANSACTIONAL_CONTEXT_FEATURE_COUNT = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.WORKFLOW_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowTransactionalContextEClass = null;

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
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage#eNS_URI
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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
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
		RuntimePackage theRuntimePackage = (RuntimePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimePackage());

		isInited = true;

		// Initialize simple dependencies
		WorkflowPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TransactionPackage theTransactionPackage = (TransactionPackage)(EPackage.Registry.INSTANCE.getEPackage(TransactionPackage.eNS_URI) instanceof TransactionPackage ? EPackage.Registry.INSTANCE.getEPackage(TransactionPackage.eNS_URI) : TransactionPackage.eINSTANCE);
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackage ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();
		theTransactionPackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();
		theTransactionPackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext <em>Workflow Transactional Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Transactional Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext
	 * @generated
	 */
	public EClass getWorkflowTransactionalContext()
	{
		return workflowTransactionalContextEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext#getEditingDomain <em>Editing Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editing Domain</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext#getEditingDomain()
	 * @see #getWorkflowTransactionalContext()
	 * @generated
	 */
	public EAttribute getWorkflowTransactionalContext_EditingDomain()
	{
		return (EAttribute)workflowTransactionalContextEClass.getEStructuralFeatures().get(0);
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
		workflowTransactionalContextEClass = createEClass(WORKFLOW_TRANSACTIONAL_CONTEXT);
		createEAttribute(workflowTransactionalContextEClass, WORKFLOW_TRANSACTIONAL_CONTEXT__EDITING_DOMAIN);
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
		org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage theRuntimePackage_1 = (org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.eNS_URI);
		TransactionPackage theTransactionPackage = (TransactionPackage)EPackage.Registry.INSTANCE.getEPackage(TransactionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowTransactionalContextEClass.getESuperTypes().add(theRuntimePackage_1.getWorkflowContext());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowTransactionalContextEClass, WorkflowTransactionalContext.class, "WorkflowTransactionalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowTransactionalContext_EditingDomain(), theTransactionPackage.getTransactionalEditingDomain(), "editingDomain", null, 1, 1, WorkflowTransactionalContext.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext <em>Workflow Transactional Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext
		 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage#getWorkflowTransactionalContext()
		 * @generated
		 */
		public static final EClass WORKFLOW_TRANSACTIONAL_CONTEXT = eINSTANCE.getWorkflowTransactionalContext();

		/**
		 * The meta object literal for the '<em><b>Editing Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_TRANSACTIONAL_CONTEXT__EDITING_DOMAIN = eINSTANCE.getWorkflowTransactionalContext_EditingDomain();

	}

} //RuntimePackage
