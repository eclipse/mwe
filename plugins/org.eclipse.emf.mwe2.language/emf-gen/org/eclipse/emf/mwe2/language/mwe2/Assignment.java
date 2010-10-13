/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
{
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(JvmFeature)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAssignment_Feature()
	 * @model
	 * @generated
	 */
	JvmFeature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(JvmFeature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAssignment_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAssignment_FeatureName()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	String getFeatureName();

} // Assignment
