/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Factory
 * @model kind="package"
 * @generated
 */
public interface Mwe2Package extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mwe2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/xtext/common/mwe2/Mwe2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mwe2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mwe2Package eINSTANCE = org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ModuleImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Canonical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CANONICAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Declared Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DECLARED_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ROOT = 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ReferrableImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getReferrable()
	 * @generated
	 */
	int REFERRABLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl <em>Declared Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getDeclaredProperty()
	 * @generated
	 */
	int DECLARED_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY__TYPE = REFERRABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY__DEFAULT = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY__MODULE = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declared Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PROPERTY_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = REFERRABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = REFERRABLE__NAME;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MODULE = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auto Inject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTO_INJECT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASSIGNMENT = REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ImportImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 4;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.AssignmentImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FEATURE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ValueImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 6;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.BooleanLiteralImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__IS_TRUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ReferenceImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Referable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERABLE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.StringLiteralImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 9;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__BEGIN = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__PARTS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__END = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.StringPartImpl <em>String Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.StringPartImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getStringPart()
	 * @generated
	 */
	int STRING_PART = 10;

	/**
	 * The number of structural features of the '<em>String Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PART_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.PropertyReferenceImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getPropertyReference()
	 * @generated
	 */
	int PROPERTY_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Referable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE__REFERABLE = STRING_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_REFERENCE_FEATURE_COUNT = STRING_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.PlainStringImpl <em>Plain String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.PlainStringImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getPlainString()
	 * @generated
	 */
	int PLAIN_STRING = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_STRING__VALUE = STRING_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plain String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_STRING_FEATURE_COUNT = STRING_PART_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.AbstractReferenceImpl <em>Abstract Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.AbstractReferenceImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getAbstractReference()
	 * @generated
	 */
	int ABSTRACT_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Referable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__REFERABLE = 0;

	/**
	 * The number of structural features of the '<em>Abstract Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.NullLiteralImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 14;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.DoubleLiteralImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getDoubleLiteral()
	 * @generated
	 */
	int DOUBLE_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.IntegerLiteralImpl
	 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.Module#getCanonicalName <em>Canonical Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical Name</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Module#getCanonicalName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_CanonicalName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe2.language.mwe2.Module#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Module#getImports()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe2.language.mwe2.Module#getDeclaredProperties <em>Declared Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declared Properties</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Module#getDeclaredProperties()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_DeclaredProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe2.language.mwe2.Module#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Module#getRoot()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Referrable
	 * @generated
	 */
	EClass getReferrable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe2.language.mwe2.Referrable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Referrable#getType()
	 * @see #getReferrable()
	 * @generated
	 */
	EReference getReferrable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.Referrable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Referrable#getName()
	 * @see #getReferrable()
	 * @generated
	 */
	EAttribute getReferrable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty <em>Declared Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Property</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty
	 * @generated
	 */
	EClass getDeclaredProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getDefault()
	 * @see #getDeclaredProperty()
	 * @generated
	 */
	EReference getDeclaredProperty_Default();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getModule()
	 * @see #getDeclaredProperty()
	 * @generated
	 */
	EReference getDeclaredProperty_Module();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe2.language.mwe2.Component#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Component#getModule()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Module();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.Component#isAutoInject <em>Auto Inject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Inject</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Component#isAutoInject()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_AutoInject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe2.language.mwe2.Component#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Component#getAssignment()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Assignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeature()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeatureName()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_FeatureName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral#isIsTrue <em>Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is True</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral#isIsTrue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_IsTrue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getBegin()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Begin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getParts()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EReference getStringLiteral_Parts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getEnd()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_End();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.StringPart <em>String Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Part</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.StringPart
	 * @generated
	 */
	EClass getStringPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.PropertyReference <em>Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Reference</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.PropertyReference
	 * @generated
	 */
	EClass getPropertyReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.PlainString <em>Plain String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain String</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.PlainString
	 * @generated
	 */
	EClass getPlainString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.PlainString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.PlainString#getValue()
	 * @see #getPlainString()
	 * @generated
	 */
	EAttribute getPlainString_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.AbstractReference <em>Abstract Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Reference</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.AbstractReference
	 * @generated
	 */
	EClass getAbstractReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe2.language.mwe2.AbstractReference#getReferable <em>Referable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referable</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.AbstractReference#getReferable()
	 * @see #getAbstractReference()
	 * @generated
	 */
	EReference getAbstractReference_Referable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Literal</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.DoubleLiteral
	 * @generated
	 */
	EClass getDoubleLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.DoubleLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.DoubleLiteral#getValue()
	 * @see #getDoubleLiteral()
	 * @generated
	 */
	EAttribute getDoubleLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe2.language.mwe2.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe2.language.mwe2.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe2.language.mwe2.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mwe2Factory getMwe2Factory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ModuleImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Canonical Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__CANONICAL_NAME = eINSTANCE.getModule_CanonicalName();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__IMPORTS = eINSTANCE.getModule_Imports();

		/**
		 * The meta object literal for the '<em><b>Declared Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__DECLARED_PROPERTIES = eINSTANCE.getModule_DeclaredProperties();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ROOT = eINSTANCE.getModule_Root();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ReferrableImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getReferrable()
		 * @generated
		 */
		EClass REFERRABLE = eINSTANCE.getReferrable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERRABLE__TYPE = eINSTANCE.getReferrable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERRABLE__NAME = eINSTANCE.getReferrable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl <em>Declared Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.DeclaredPropertyImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getDeclaredProperty()
		 * @generated
		 */
		EClass DECLARED_PROPERTY = eINSTANCE.getDeclaredProperty();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PROPERTY__DEFAULT = eINSTANCE.getDeclaredProperty_Default();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PROPERTY__MODULE = eINSTANCE.getDeclaredProperty_Module();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__MODULE = eINSTANCE.getComponent_Module();

		/**
		 * The meta object literal for the '<em><b>Auto Inject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__AUTO_INJECT = eINSTANCE.getComponent_AutoInject();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ASSIGNMENT = eINSTANCE.getComponent_Assignment();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ImportImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.AssignmentImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__FEATURE = eINSTANCE.getAssignment_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__FEATURE_NAME = eINSTANCE.getAssignment_FeatureName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ValueImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.BooleanLiteralImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__IS_TRUE = eINSTANCE.getBooleanLiteral_IsTrue();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.ReferenceImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.StringLiteralImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__BEGIN = eINSTANCE.getStringLiteral_Begin();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_LITERAL__PARTS = eINSTANCE.getStringLiteral_Parts();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__END = eINSTANCE.getStringLiteral_End();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.StringPartImpl <em>String Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.StringPartImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getStringPart()
		 * @generated
		 */
		EClass STRING_PART = eINSTANCE.getStringPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.PropertyReferenceImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getPropertyReference()
		 * @generated
		 */
		EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.PlainStringImpl <em>Plain String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.PlainStringImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getPlainString()
		 * @generated
		 */
		EClass PLAIN_STRING = eINSTANCE.getPlainString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_STRING__VALUE = eINSTANCE.getPlainString_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.AbstractReferenceImpl <em>Abstract Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.AbstractReferenceImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getAbstractReference()
		 * @generated
		 */
		EClass ABSTRACT_REFERENCE = eINSTANCE.getAbstractReference();

		/**
		 * The meta object literal for the '<em><b>Referable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REFERENCE__REFERABLE = eINSTANCE.getAbstractReference_Referable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.NullLiteralImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.DoubleLiteralImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getDoubleLiteral()
		 * @generated
		 */
		EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe2.language.mwe2.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.IntegerLiteralImpl
		 * @see org.eclipse.emf.mwe2.language.mwe2.impl.Mwe2PackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

	}

} //Mwe2Package
