/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyImpl.java,v 1.2 2008/02/23 22:07:39 pschonbac Exp $
 */
package workflow.impl;

import org.eclipse.emf.ecore.EClass;

import workflow.Property;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PropertyImpl extends WorkflowElementImpl implements Property {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.PROPERTY;
    }

} //PropertyImpl
