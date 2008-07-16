/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComplexValue.java,v 1.5 2008/07/16 07:36:08 sefftinge Exp $
 */
package org.eclipse.emf.mwe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ComplexValue#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ComplexValue#isFooBar <em>Foo Bar</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ComplexValue#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.MwePackage#getComplexValue()
 * @model
 * @generated
 */
public interface ComplexValue extends Value, Assignable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.emf.mwe.MwePackage#getComplexValue_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ComplexValue#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Foo Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foo Bar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foo Bar</em>' attribute.
	 * @see #setFooBar(boolean)
	 * @see org.eclipse.emf.mwe.MwePackage#getComplexValue_FooBar()
	 * @model
	 * @generated
	 */
	boolean isFooBar();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ComplexValue#isFooBar <em>Foo Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foo Bar</em>' attribute.
	 * @see #isFooBar()
	 * @generated
	 */
	void setFooBar(boolean value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' containment reference.
	 * @see #setClassName(QualifiedName)
	 * @see org.eclipse.emf.mwe.MwePackage#getComplexValue_ClassName()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedName getClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ComplexValue#getClassName <em>Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' containment reference.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(QualifiedName value);

} // ComplexValue
