/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrchestrationPackage.java,v 1.1 2010/01/03 21:22:54 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;

import org.eclipse.emf.mwe.ewm.workflow.transaction.TransactionPackage;

import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationFactory
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
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/transaction/orchestration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrchestrationPackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.WorkflowParallelOrchestrationStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage#getWorkflowParallelOrchestrationStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Workflow Parallel Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY_FEATURE_COUNT = org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage.WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParallelOrchestrationStrategyEClass = null;

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
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage#eNS_URI
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
		WorkflowPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TransactionPackage theTransactionPackage = (TransactionPackage)(EPackage.Registry.INSTANCE.getEPackage(TransactionPackage.eNS_URI) instanceof TransactionPackage ? EPackage.Registry.INSTANCE.getEPackage(TransactionPackage.eNS_URI) : TransactionPackage.eINSTANCE);
		RuntimePackage theRuntimePackage = (RuntimePackage)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackage ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);

		// Create package meta-data objects
		theOrchestrationPackage.createPackageContents();
		theTransactionPackage.createPackageContents();
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theOrchestrationPackage.initializePackageContents();
		theTransactionPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrchestrationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrchestrationPackage.eNS_URI, theOrchestrationPackage);
		return theOrchestrationPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Parallel Orchestration Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.WorkflowParallelOrchestrationStrategy
	 * @generated
	 */
	public EClass getWorkflowParallelOrchestrationStrategy()
	{
		return workflowParallelOrchestrationStrategyEClass;
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
		workflowParallelOrchestrationStrategyEClass = createEClass(WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY);
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
		org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage theOrchestrationPackage_1 = (org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage.eNS_URI);
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);
		org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage theRuntimePackage_1 = (org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowParallelOrchestrationStrategyEClass.getESuperTypes().add(theOrchestrationPackage_1.getWorkflowCompositeOrchestrationStrategy());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowParallelOrchestrationStrategyEClass, WorkflowParallelOrchestrationStrategy.class, "WorkflowParallelOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(workflowParallelOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage_1.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.WorkflowParallelOrchestrationStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage#getWorkflowParallelOrchestrationStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowParallelOrchestrationStrategy();

	}

} //OrchestrationPackage
