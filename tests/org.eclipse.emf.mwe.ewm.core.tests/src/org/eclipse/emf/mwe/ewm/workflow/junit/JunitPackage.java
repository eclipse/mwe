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
package org.eclipse.emf.mwe.ewm.workflow.junit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitFactory
 * @model kind="package"
 * @generated
 */
public class JunitPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "junit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/junit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.junit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JunitPackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness <em>Unit Of Work Test Harness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getUnitOfWorkTestHarness()
	 * @generated
	 */
	public static final int UNIT_OF_WORK_TEST_HARNESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_OF_WORK_TEST_HARNESS__NAME = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__NAME;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_OF_WORK_TEST_HARNESS__COMPONENT_ORCHESTRATION_STRATEGY = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_OF_WORK_TEST_HARNESS__PARAMETERS = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>End State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_OF_WORK_TEST_HARNESS__END_STATE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Of Work Test Harness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_OF_WORK_TEST_HARNESS_FEATURE_COUNT = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness <em>Predicate Test Harness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getPredicateTestHarness()
	 * @generated
	 */
	public static final int PREDICATE_TEST_HARNESS = 1;

	/**
	 * The feature id for the '<em><b>Execution Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PREDICATE_TEST_HARNESS__EXECUTION_ALLOWED = OrchestrationPackage.WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Test Harness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PREDICATE_TEST_HARNESS_FEATURE_COUNT = OrchestrationPackage.WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitOfWorkTestHarnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateTestHarnessEClass = null;

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
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JunitPackage()
	{
		super(eNS_URI, JunitFactory.eINSTANCE);
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
	public static JunitPackage init()
	{
		if (isInited) return (JunitPackage)EPackage.Registry.INSTANCE.getEPackage(JunitPackage.eNS_URI);

		// Obtain or create and register package
		JunitPackage theJunitPackage = (JunitPackage)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JunitPackage ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new JunitPackage());

		isInited = true;

		// Initialize simple dependencies
		WorkflowPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJunitPackage.createPackageContents();

		// Initialize created meta-data
		theJunitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJunitPackage.freeze();

		return theJunitPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness <em>Unit Of Work Test Harness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Of Work Test Harness</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness
	 * @generated
	 */
	public EClass getUnitOfWorkTestHarness()
	{
		return unitOfWorkTestHarnessEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getEndState <em>End State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getEndState()
	 * @see #getUnitOfWorkTestHarness()
	 * @generated
	 */
	public EReference getUnitOfWorkTestHarness_EndState()
	{
		return (EReference)unitOfWorkTestHarnessEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getRunningState <em>Running State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Running State</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getRunningState()
	 * @see #getUnitOfWorkTestHarness()
	 * @generated
	 */
	public EReference getUnitOfWorkTestHarness_RunningState()
	{
		return (EReference)unitOfWorkTestHarnessEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness <em>Predicate Test Harness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Test Harness</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness
	 * @generated
	 */
	public EClass getPredicateTestHarness()
	{
		return predicateTestHarnessEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness#isExecutionAllowed <em>Execution Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Allowed</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness#isExecutionAllowed()
	 * @see #getPredicateTestHarness()
	 * @generated
	 */
	public EAttribute getPredicateTestHarness_ExecutionAllowed()
	{
		return (EAttribute)predicateTestHarnessEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public JunitFactory getJunitFactory()
	{
		return (JunitFactory)getEFactoryInstance();
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
		unitOfWorkTestHarnessEClass = createEClass(UNIT_OF_WORK_TEST_HARNESS);
		createEReference(unitOfWorkTestHarnessEClass, UNIT_OF_WORK_TEST_HARNESS__END_STATE);
		createEReference(unitOfWorkTestHarnessEClass, UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE);

		predicateTestHarnessEClass = createEClass(PREDICATE_TEST_HARNESS);
		createEAttribute(predicateTestHarnessEClass, PREDICATE_TEST_HARNESS__EXECUTION_ALLOWED);
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
		StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unitOfWorkTestHarnessEClass.getESuperTypes().add(theWorkflowPackage.getWorkflowUnitOfWork());
		predicateTestHarnessEClass.getESuperTypes().add(theOrchestrationPackage.getWorkflowExecutionPredicate());

		// Initialize classes and features; add operations and parameters
		initEClass(unitOfWorkTestHarnessEClass, UnitOfWorkTestHarness.class, "UnitOfWorkTestHarness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitOfWorkTestHarness_EndState(), theStatePackage.getWorkflowState(), null, "endState", null, 1, 1, UnitOfWorkTestHarness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitOfWorkTestHarness_RunningState(), theStatePackage.getWorkflowState(), null, "runningState", null, 1, 1, UnitOfWorkTestHarness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateTestHarnessEClass, PredicateTestHarness.class, "PredicateTestHarness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicateTestHarness_ExecutionAllowed(), ecorePackage.getEBoolean(), "executionAllowed", null, 1, 1, PredicateTestHarness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness <em>Unit Of Work Test Harness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness
		 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getUnitOfWorkTestHarness()
		 * @generated
		 */
		public static final EClass UNIT_OF_WORK_TEST_HARNESS = eINSTANCE.getUnitOfWorkTestHarness();

		/**
		 * The meta object literal for the '<em><b>End State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference UNIT_OF_WORK_TEST_HARNESS__END_STATE = eINSTANCE.getUnitOfWorkTestHarness_EndState();

		/**
		 * The meta object literal for the '<em><b>Running State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE = eINSTANCE.getUnitOfWorkTestHarness_RunningState();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness <em>Predicate Test Harness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness
		 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getPredicateTestHarness()
		 * @generated
		 */
		public static final EClass PREDICATE_TEST_HARNESS = eINSTANCE.getPredicateTestHarness();

		/**
		 * The meta object literal for the '<em><b>Execution Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PREDICATE_TEST_HARNESS__EXECUTION_ALLOWED = eINSTANCE.getPredicateTestHarness_ExecutionAllowed();

	}

} //JunitPackage
