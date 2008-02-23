/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractValueImpl.java,v 1.2 2008/02/23 22:07:39 pschonbac Exp $
 */
package workflow.impl;

import org.eclipse.emf.ecore.EClass;

import workflow.AbstractValue;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractValueImpl extends WorkflowElementImpl implements AbstractValue {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.ABSTRACT_VALUE;
    }

} //AbstractValueImpl
