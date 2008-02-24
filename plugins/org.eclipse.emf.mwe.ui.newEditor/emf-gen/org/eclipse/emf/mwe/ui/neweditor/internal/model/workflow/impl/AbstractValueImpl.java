/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractValueImpl.java,v 1.1 2008/02/24 23:50:27 pschonbac Exp $
 */
package org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.AbstractValue;
import org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage;


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
