/**
 * <copyright>
 * </copyright>
 *
 * $Id: MweFactoryImpl.java,v 1.1 2008/06/13 09:57:49 sefftinge Exp $
 */
package org.eclipse.emf.mwe.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.mwe.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MweFactoryImpl extends EFactoryImpl implements MweFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MweFactory init() {
		try {
			MweFactory theMweFactory = (MweFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/di"); 
			if (theMweFactory != null) {
				return theMweFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MweFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MweFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MwePackage.ASSIGNMENT: return createAssignment();
			case MwePackage.COMPLEX_VALUE: return createComplexValue();
			case MwePackage.SIMPLE_VALUE: return createSimpleValue();
			case MwePackage.ID_REF: return createIdRef();
			case MwePackage.QUALIFIED_NAME: return createQualifiedName();
			case MwePackage.WORKFLOW_REF: return createWorkflowRef();
			case MwePackage.FILE: return createFile();
			case MwePackage.PROPERTIES_FILE_IMPORT: return createPropertiesFileImport();
			case MwePackage.LOCAL_VARIABLE: return createLocalVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRef createWorkflowRef() {
		WorkflowRefImpl workflowRef = new WorkflowRefImpl();
		return workflowRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexValue createComplexValue() {
		ComplexValueImpl complexValue = new ComplexValueImpl();
		return complexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName createQualifiedName() {
		QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdRef createIdRef() {
		IdRefImpl idRef = new IdRefImpl();
		return idRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesFileImport createPropertiesFileImport() {
		PropertiesFileImportImpl propertiesFileImport = new PropertiesFileImportImpl();
		return propertiesFileImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleValue createSimpleValue() {
		SimpleValueImpl simpleValue = new SimpleValueImpl();
		return simpleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MwePackage getMwePackage() {
		return (MwePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MwePackage getPackage() {
		return MwePackage.eINSTANCE;
	}

} //MweFactoryImpl
