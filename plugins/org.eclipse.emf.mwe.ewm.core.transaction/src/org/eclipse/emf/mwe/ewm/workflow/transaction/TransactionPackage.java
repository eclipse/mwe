/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransactionPackage.java,v 1.1 2010/01/03 21:22:54 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.transaction;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;

import org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage;

import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.TransactionFactory
 * @model kind="package"
 * @generated
 */
public class TransactionPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "transaction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/transaction";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.transaction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TransactionPackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.transaction.TransactionPackage.init();

	/**
	 * The meta object id for the '<em>Transactional Editing Domain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.transaction.TransactionalEditingDomain
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.TransactionPackage#getTransactionalEditingDomain()
	 * @generated
	 */
	public static final int TRANSACTIONAL_EDITING_DOMAIN = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transactionalEditingDomainEDataType = null;

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
	 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.TransactionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransactionPackage()
	{
		super(eNS_URI, TransactionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransactionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransactionPackage init()
	{
		if (isInited) return (TransactionPackage)EPackage.Registry.INSTANCE.getEPackage(TransactionPackage.eNS_URI);

		// Obtain or create and register package
		TransactionPackage theTransactionPackage = (TransactionPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TransactionPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TransactionPackage());

		isInited = true;

		// Initialize simple dependencies
		WorkflowPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RuntimePackage theRuntimePackage = (RuntimePackage)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackage ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackage ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);

		// Create package meta-data objects
		theTransactionPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();

		// Initialize created meta-data
		theTransactionPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransactionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransactionPackage.eNS_URI, theTransactionPackage);
		return theTransactionPackage;
	}


	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.transaction.TransactionalEditingDomain <em>Transactional Editing Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transactional Editing Domain</em>'.
	 * @see org.eclipse.emf.transaction.TransactionalEditingDomain
	 * @model instanceClass="org.eclipse.emf.transaction.TransactionalEditingDomain"
	 * @generated
	 */
	public EDataType getTransactionalEditingDomain()
	{
		return transactionalEditingDomainEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TransactionFactory getTransactionFactory()
	{
		return (TransactionFactory)getEFactoryInstance();
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

		// Create data types
		transactionalEditingDomainEDataType = createEDataType(TRANSACTIONAL_EDITING_DOMAIN);
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
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRuntimePackage);
		getESubpackages().add(theOrchestrationPackage);

		// Initialize data types
		initEDataType(transactionalEditingDomainEDataType, TransactionalEditingDomain.class, "TransactionalEditingDomain", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		 * The meta object literal for the '<em>Transactional Editing Domain</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.transaction.TransactionalEditingDomain
		 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.TransactionPackage#getTransactionalEditingDomain()
		 * @generated
		 */
		public static final EDataType TRANSACTIONAL_EDITING_DOMAIN = eINSTANCE.getTransactionalEditingDomain();

	}

} //TransactionPackage
