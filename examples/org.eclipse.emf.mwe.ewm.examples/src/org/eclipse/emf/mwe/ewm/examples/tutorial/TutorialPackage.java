/**
 * <copyright>
 * </copyright>
 *
 * $Id: TutorialPackage.java,v 1.1 2009/02/15 19:18:45 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.examples.tutorial;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;

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
 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialFactory
 * @model kind="package"
 * @generated
 */
public class TutorialPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "tutorial";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/examples/tutorial";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mew.ewm.examples.tutorial";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TutorialPackage eINSTANCE = org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.Concat
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage#getConcat()
	 * @generated
	 */
	public static final int CONCAT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT__NAME = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT__TYPE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT__DESCRIPTION = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT__COMPONENT_ORCHESTRATION_STRATEGY = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT__PARAMETERS = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Input Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT__INPUT_MESSAGE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Append Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT__INPUT_APPEND_MESSAGE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT__OUTPUT_MESSAGE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT_FEATURE_COUNT = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatEClass = null;

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
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TutorialPackage()
	{
		super(eNS_URI, TutorialFactory.eINSTANCE);
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
	public static TutorialPackage init()
	{
		if (isInited) return (TutorialPackage)EPackage.Registry.INSTANCE.getEPackage(TutorialPackage.eNS_URI);

		// Obtain or create and register package
		TutorialPackage theTutorialPackage = (TutorialPackage)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TutorialPackage ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TutorialPackage());

		isInited = true;

		// Initialize simple dependencies
		WorkflowPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTutorialPackage.createPackageContents();

		// Initialize created meta-data
		theTutorialPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTutorialPackage.freeze();

		return theTutorialPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.Concat
	 * @generated
	 */
	public EClass getConcat()
	{
		return concatEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getInputMessage <em>Input Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Message</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getInputMessage()
	 * @see #getConcat()
	 * @generated
	 */
	public EReference getConcat_InputMessage()
	{
		return (EReference)concatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getInputAppendMessage <em>Input Append Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Append Message</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getInputAppendMessage()
	 * @see #getConcat()
	 * @generated
	 */
	public EReference getConcat_InputAppendMessage()
	{
		return (EReference)concatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getOutputMessage <em>Output Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Message</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getOutputMessage()
	 * @see #getConcat()
	 * @generated
	 */
	public EReference getConcat_OutputMessage()
	{
		return (EReference)concatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TutorialFactory getTutorialFactory()
	{
		return (TutorialFactory)getEFactoryInstance();
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
		concatEClass = createEClass(CONCAT);
		createEReference(concatEClass, CONCAT__INPUT_MESSAGE);
		createEReference(concatEClass, CONCAT__INPUT_APPEND_MESSAGE);
		createEReference(concatEClass, CONCAT__OUTPUT_MESSAGE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		concatEClass.getESuperTypes().add(theWorkflowPackage.getWorkflowUnitOfWork());

		// Initialize classes and features; add operations and parameters
		initEClass(concatEClass, Concat.class, "Concat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcat_InputMessage(), theWorkflowPackage.getWorkflowParameter(), null, "inputMessage", null, 0, 1, Concat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcat_InputAppendMessage(), theWorkflowPackage.getWorkflowParameter(), null, "inputAppendMessage", null, 0, 1, Concat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcat_OutputMessage(), theWorkflowPackage.getWorkflowParameter(), null, "outputMessage", null, 0, 1, Concat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.Concat
		 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage#getConcat()
		 * @generated
		 */
		public static final EClass CONCAT = eINSTANCE.getConcat();

		/**
		 * The meta object literal for the '<em><b>Input Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONCAT__INPUT_MESSAGE = eINSTANCE.getConcat_InputMessage();

		/**
		 * The meta object literal for the '<em><b>Input Append Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONCAT__INPUT_APPEND_MESSAGE = eINSTANCE.getConcat_InputAppendMessage();

		/**
		 * The meta object literal for the '<em><b>Output Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONCAT__OUTPUT_MESSAGE = eINSTANCE.getConcat_OutputMessage();

	}

} //TutorialPackage
