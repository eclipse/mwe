/*******************************************************************************
 * Copyright (c) 2009 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.examples.build;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildFactory
 * @model kind="package"
 * @generated
 */
public class BuildPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "build";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/examples/build";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.examples.build";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BuildPackage eINSTANCE = org.eclipse.emf.mwe.ewm.examples.build.BuildPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler <em>Java Compiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaCompiler()
	 * @generated
	 */
	public static final int JAVA_COMPILER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPILER__NAME = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPILER__TYPE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPILER__DESCRIPTION = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPILER__COMPONENT_ORCHESTRATION_STRATEGY = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Class Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPILER__CLASS_NAME_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classpath Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPILER__CLASSPATH_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Working Directory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java Compiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_COMPILER_FEATURE_COUNT = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar <em>Java Jar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaJar
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaJar()
	 * @generated
	 */
	public static final int JAVA_JAR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_JAR__NAME = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_JAR__TYPE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_JAR__DESCRIPTION = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_JAR__COMPONENT_ORCHESTRATION_STRATEGY = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Class Name Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_JAR__CLASS_NAME_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Working Directory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_JAR__WORKING_DIRECTORY_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_JAR__OUTPUT_FILE_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java Jar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_JAR_FEATURE_COUNT = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile <em>Zip File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.examples.build.ZipFile
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getZipFile()
	 * @generated
	 */
	public static final int ZIP_FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_FILE__NAME = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_FILE__TYPE = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_FILE__DESCRIPTION = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_FILE__COMPONENT_ORCHESTRATION_STRATEGY = WorkflowPackage.WORKFLOW_UNIT_OF_WORK__COMPONENT_ORCHESTRATION_STRATEGY;

	/**
	 * The feature id for the '<em><b>Working Directory Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_FILE__WORKING_DIRECTORY_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_FILE__INPUT_FILE_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output File Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_FILE__OUTPUT_FILE_PARAMETER = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Zip File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_FILE_FEATURE_COUNT = WorkflowPackage.WORKFLOW_UNIT_OF_WORK_FEATURE_COUNT + 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaCompilerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaJarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zipFileEClass = null;

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
	 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuildPackage()
	{
		super(eNS_URI, BuildFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BuildPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuildPackage init()
	{
		if (isInited) return (BuildPackage)EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI);

		// Obtain or create and register package
		BuildPackage theBuildPackage = (BuildPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BuildPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BuildPackage());

		isInited = true;

		// Initialize simple dependencies
		WorkflowPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBuildPackage.createPackageContents();

		// Initialize created meta-data
		theBuildPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuildPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuildPackage.eNS_URI, theBuildPackage);
		return theBuildPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler <em>Java Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Compiler</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler
	 * @generated
	 */
	public EClass getJavaCompiler()
	{
		return javaCompilerEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getClassNameParameter <em>Class Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Name Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getClassNameParameter()
	 * @see #getJavaCompiler()
	 * @generated
	 */
	public EReference getJavaCompiler_ClassNameParameter()
	{
		return (EReference)javaCompilerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getClasspathParameter <em>Classpath Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classpath Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getClasspathParameter()
	 * @see #getJavaCompiler()
	 * @generated
	 */
	public EReference getJavaCompiler_ClasspathParameter()
	{
		return (EReference)javaCompilerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Directory Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler#getWorkingDirectoryParameter()
	 * @see #getJavaCompiler()
	 * @generated
	 */
	public EReference getJavaCompiler_WorkingDirectoryParameter()
	{
		return (EReference)javaCompilerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar <em>Java Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Jar</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaJar
	 * @generated
	 */
	public EClass getJavaJar()
	{
		return javaJarEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getClassNameParameter <em>Class Name Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Name Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getClassNameParameter()
	 * @see #getJavaJar()
	 * @generated
	 */
	public EReference getJavaJar_ClassNameParameter()
	{
		return (EReference)javaJarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Directory Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getWorkingDirectoryParameter()
	 * @see #getJavaJar()
	 * @generated
	 */
	public EReference getJavaJar_WorkingDirectoryParameter()
	{
		return (EReference)javaJarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getOutputFileParameter <em>Output File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output File Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaJar#getOutputFileParameter()
	 * @see #getJavaJar()
	 * @generated
	 */
	public EReference getJavaJar_OutputFileParameter()
	{
		return (EReference)javaJarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile <em>Zip File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zip File</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.ZipFile
	 * @generated
	 */
	public EClass getZipFile()
	{
		return zipFileEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getWorkingDirectoryParameter <em>Working Directory Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Directory Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getWorkingDirectoryParameter()
	 * @see #getZipFile()
	 * @generated
	 */
	public EReference getZipFile_WorkingDirectoryParameter()
	{
		return (EReference)zipFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getInputFileParameter <em>Input File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input File Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getInputFileParameter()
	 * @see #getZipFile()
	 * @generated
	 */
	public EReference getZipFile_InputFileParameter()
	{
		return (EReference)zipFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getOutputFileParameter <em>Output File Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output File Parameter</em>'.
	 * @see org.eclipse.emf.mwe.ewm.examples.build.ZipFile#getOutputFileParameter()
	 * @see #getZipFile()
	 * @generated
	 */
	public EReference getZipFile_OutputFileParameter()
	{
		return (EReference)zipFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public BuildFactory getBuildFactory()
	{
		return (BuildFactory)getEFactoryInstance();
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
		javaCompilerEClass = createEClass(JAVA_COMPILER);
		createEReference(javaCompilerEClass, JAVA_COMPILER__CLASS_NAME_PARAMETER);
		createEReference(javaCompilerEClass, JAVA_COMPILER__CLASSPATH_PARAMETER);
		createEReference(javaCompilerEClass, JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER);

		javaJarEClass = createEClass(JAVA_JAR);
		createEReference(javaJarEClass, JAVA_JAR__CLASS_NAME_PARAMETER);
		createEReference(javaJarEClass, JAVA_JAR__WORKING_DIRECTORY_PARAMETER);
		createEReference(javaJarEClass, JAVA_JAR__OUTPUT_FILE_PARAMETER);

		zipFileEClass = createEClass(ZIP_FILE);
		createEReference(zipFileEClass, ZIP_FILE__WORKING_DIRECTORY_PARAMETER);
		createEReference(zipFileEClass, ZIP_FILE__INPUT_FILE_PARAMETER);
		createEReference(zipFileEClass, ZIP_FILE__OUTPUT_FILE_PARAMETER);
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
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		javaCompilerEClass.getESuperTypes().add(theWorkflowPackage.getWorkflowUnitOfWork());
		javaJarEClass.getESuperTypes().add(theWorkflowPackage.getWorkflowUnitOfWork());
		zipFileEClass.getESuperTypes().add(theWorkflowPackage.getWorkflowUnitOfWork());

		// Initialize classes and features; add operations and parameters
		initEClass(javaCompilerEClass, JavaCompiler.class, "JavaCompiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaCompiler_ClassNameParameter(), theWorkflowPackage.getWorkflowParameter(), null, "classNameParameter", null, 1, 1, JavaCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaCompiler_ClasspathParameter(), theWorkflowPackage.getWorkflowParameter(), null, "classpathParameter", null, 1, 1, JavaCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaCompiler_WorkingDirectoryParameter(), theWorkflowPackage.getWorkflowParameter(), null, "workingDirectoryParameter", null, 1, 1, JavaCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(javaCompilerEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(javaJarEClass, JavaJar.class, "JavaJar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaJar_ClassNameParameter(), theWorkflowPackage.getWorkflowParameter(), null, "classNameParameter", null, 1, 1, JavaJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaJar_WorkingDirectoryParameter(), theWorkflowPackage.getWorkflowParameter(), null, "workingDirectoryParameter", null, 1, 1, JavaJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaJar_OutputFileParameter(), theWorkflowPackage.getWorkflowParameter(), null, "outputFileParameter", null, 1, 1, JavaJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(javaJarEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(zipFileEClass, ZipFile.class, "ZipFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZipFile_WorkingDirectoryParameter(), theWorkflowPackage.getWorkflowParameter(), null, "workingDirectoryParameter", null, 1, 1, ZipFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZipFile_InputFileParameter(), theWorkflowPackage.getWorkflowParameter(), null, "inputFileParameter", null, 1, 1, ZipFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZipFile_OutputFileParameter(), theWorkflowPackage.getWorkflowParameter(), null, "outputFileParameter", null, 1, 1, ZipFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(zipFileEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler <em>Java Compiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaCompiler
		 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaCompiler()
		 * @generated
		 */
		public static final EClass JAVA_COMPILER = eINSTANCE.getJavaCompiler();

		/**
		 * The meta object literal for the '<em><b>Class Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference JAVA_COMPILER__CLASS_NAME_PARAMETER = eINSTANCE.getJavaCompiler_ClassNameParameter();

		/**
		 * The meta object literal for the '<em><b>Classpath Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference JAVA_COMPILER__CLASSPATH_PARAMETER = eINSTANCE.getJavaCompiler_ClasspathParameter();

		/**
		 * The meta object literal for the '<em><b>Working Directory Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference JAVA_COMPILER__WORKING_DIRECTORY_PARAMETER = eINSTANCE.getJavaCompiler_WorkingDirectoryParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.examples.build.JavaJar <em>Java Jar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.examples.build.JavaJar
		 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getJavaJar()
		 * @generated
		 */
		public static final EClass JAVA_JAR = eINSTANCE.getJavaJar();

		/**
		 * The meta object literal for the '<em><b>Class Name Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference JAVA_JAR__CLASS_NAME_PARAMETER = eINSTANCE.getJavaJar_ClassNameParameter();

		/**
		 * The meta object literal for the '<em><b>Working Directory Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference JAVA_JAR__WORKING_DIRECTORY_PARAMETER = eINSTANCE.getJavaJar_WorkingDirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>Output File Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference JAVA_JAR__OUTPUT_FILE_PARAMETER = eINSTANCE.getJavaJar_OutputFileParameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.examples.build.ZipFile <em>Zip File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.examples.build.ZipFile
		 * @see org.eclipse.emf.mwe.ewm.examples.build.BuildPackage#getZipFile()
		 * @generated
		 */
		public static final EClass ZIP_FILE = eINSTANCE.getZipFile();

		/**
		 * The meta object literal for the '<em><b>Working Directory Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ZIP_FILE__WORKING_DIRECTORY_PARAMETER = eINSTANCE.getZipFile_WorkingDirectoryParameter();

		/**
		 * The meta object literal for the '<em><b>Input File Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ZIP_FILE__INPUT_FILE_PARAMETER = eINSTANCE.getZipFile_InputFileParameter();

		/**
		 * The meta object literal for the '<em><b>Output File Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ZIP_FILE__OUTPUT_FILE_PARAMETER = eINSTANCE.getZipFile_OutputFileParameter();

	}

} //BuildPackage
