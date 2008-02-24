/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowElementImpl.java,v 1.1 2008/02/24 23:50:27 pschonbac Exp $
 */
package org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowElement;
import org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl.WorkflowElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl.WorkflowElementImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl.WorkflowElementImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.impl.WorkflowElementImpl#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowElementImpl extends EObjectImpl implements WorkflowElement {
    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final int LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected int length = LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected static final int OFFSET_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected int offset = OFFSET_EDEFAULT;

    /**
     * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
    protected static final String IMAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
    protected String image = IMAGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkflowElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorkflowPackage.Literals.WORKFLOW_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_ELEMENT__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLength(int newLength) {
        int oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_ELEMENT__LENGTH, oldLength, length));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getOffset() {
        return offset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOffset(int newOffset) {
        int oldOffset = offset;
        offset = newOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_ELEMENT__OFFSET, oldOffset, offset));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImage() {
        return image;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImage(String newImage) {
        String oldImage = image;
        image = newImage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_ELEMENT__IMAGE, oldImage, image));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WorkflowPackage.WORKFLOW_ELEMENT__LABEL:
                return getLabel();
            case WorkflowPackage.WORKFLOW_ELEMENT__LENGTH:
                return new Integer(getLength());
            case WorkflowPackage.WORKFLOW_ELEMENT__OFFSET:
                return new Integer(getOffset());
            case WorkflowPackage.WORKFLOW_ELEMENT__IMAGE:
                return getImage();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case WorkflowPackage.WORKFLOW_ELEMENT__LABEL:
                setLabel((String)newValue);
                return;
            case WorkflowPackage.WORKFLOW_ELEMENT__LENGTH:
                setLength(((Integer)newValue).intValue());
                return;
            case WorkflowPackage.WORKFLOW_ELEMENT__OFFSET:
                setOffset(((Integer)newValue).intValue());
                return;
            case WorkflowPackage.WORKFLOW_ELEMENT__IMAGE:
                setImage((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case WorkflowPackage.WORKFLOW_ELEMENT__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case WorkflowPackage.WORKFLOW_ELEMENT__LENGTH:
                setLength(LENGTH_EDEFAULT);
                return;
            case WorkflowPackage.WORKFLOW_ELEMENT__OFFSET:
                setOffset(OFFSET_EDEFAULT);
                return;
            case WorkflowPackage.WORKFLOW_ELEMENT__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case WorkflowPackage.WORKFLOW_ELEMENT__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case WorkflowPackage.WORKFLOW_ELEMENT__LENGTH:
                return length != LENGTH_EDEFAULT;
            case WorkflowPackage.WORKFLOW_ELEMENT__OFFSET:
                return offset != OFFSET_EDEFAULT;
            case WorkflowPackage.WORKFLOW_ELEMENT__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (label: ");
        result.append(label);
        result.append(", length: ");
        result.append(length);
        result.append(", offset: ");
        result.append(offset);
        result.append(", image: ");
        result.append(image);
        result.append(')');
        return result.toString();
    }

} //WorkflowElementImpl
