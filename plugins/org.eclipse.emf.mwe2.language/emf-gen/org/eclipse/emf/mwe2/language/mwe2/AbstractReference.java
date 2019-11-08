/**
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.AbstractReference#getReferable <em>Referable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAbstractReference()
 * @model abstract="true"
 * @generated
 */
public interface AbstractReference extends EObject
{
	/**
	 * Returns the value of the '<em><b>Referable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referable</em>' reference.
	 * @see #setReferable(Referrable)
	 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getAbstractReference_Referable()
	 * @model
	 * @generated
	 */
	Referrable getReferable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.AbstractReference#getReferable <em>Referable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referable</em>' reference.
	 * @see #getReferable()
	 * @generated
	 */
	void setReferable(Referrable value);

} // AbstractReference
