/**
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Module#getCanonicalName <em>Canonical Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Module#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Module#getDeclaredProperties <em>Declared Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Module#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
	/**
	 * Returns the value of the '<em><b>Canonical Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonical Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canonical Name</em>' attribute.
	 * @see #setCanonicalName(String)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getModule_CanonicalName()
	 * @model
	 * @generated
	 */
	String getCanonicalName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Module#getCanonicalName <em>Canonical Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonical Name</em>' attribute.
	 * @see #getCanonicalName()
	 * @generated
	 */
	void setCanonicalName(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe2.language.mwe2.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getModule_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Declared Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declared Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Properties</em>' containment reference list.
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getModule_DeclaredProperties()
	 * @see org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<DeclaredProperty> getDeclaredProperties();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Component)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getModule_Root()
	 * @model containment="true"
	 * @generated
	 */
	Component getRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Module#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Component value);

} // Module
