/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getValueStrategy <em>Value Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter()
 * @model kind="class"
 * @generated
 */
public class WorkflowParameter extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameterConnection connection;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier type;

	/**
	 * The cached value of the '{@link #getValueStrategy() <em>Value Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueStrategy()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameterValueStrategy valueStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParameter()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return WorkflowPackage.Literals.WORKFLOW_PARAMETER;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClassifier)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	public EClassifier getType()
	{
		if (type != null && type.eIsProxy())
		{
			InternalEObject oldType = (InternalEObject)type;
			type = (EClassifier)eResolveProxy(oldType);
			if (type != oldType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_PARAMETER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	public void setType(EClassifier newType)
	{
		EClassifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * Returns the value of the '<em><b>Value Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Strategy</em>' containment reference.
	 * @see #setValueStrategy(WorkflowParameterValueStrategy)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter_ValueStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowParameterValueStrategy getValueStrategy()
	{
		return valueStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueStrategy(WorkflowParameterValueStrategy newValueStrategy, NotificationChain msgs)
	{
		WorkflowParameterValueStrategy oldValueStrategy = valueStrategy;
		valueStrategy = newValueStrategy;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY, oldValueStrategy, newValueStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getValueStrategy <em>Value Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Strategy</em>' containment reference.
	 * @see #getValueStrategy()
	 * @generated
	 */
	public void setValueStrategy(WorkflowParameterValueStrategy newValueStrategy)
	{
		if (newValueStrategy != valueStrategy)
		{
			NotificationChain msgs = null;
			if (valueStrategy != null)
				msgs = ((InternalEObject)valueStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY, null, msgs);
			if (newValueStrategy != null)
				msgs = ((InternalEObject)newValueStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY, null, msgs);
			msgs = basicSetValueStrategy(newValueStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY, newValueStrategy, newValueStrategy));
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter_Description()
	 * @model required="true"
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(WorkflowParameterConnection)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter_Connection()
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection#getInputs
	 * @model opposite="inputs" required="true"
	 * @generated
	 */
	public WorkflowParameterConnection getConnection()
	{
		if (connection != null && connection.eIsProxy())
		{
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (WorkflowParameterConnection)eResolveProxy(oldConnection);
			if (connection != oldConnection)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterConnection basicGetConnection()
	{
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(WorkflowParameterConnection newConnection, NotificationChain msgs)
	{
		WorkflowParameterConnection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION, oldConnection, newConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	public void setConnection(WorkflowParameterConnection newConnection)
	{
		if (newConnection != connection)
		{
			NotificationChain msgs = null;
			if (connection != null)
				msgs = ((InternalEObject)connection).eInverseRemove(this, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS, WorkflowParameterConnection.class, msgs);
			if (newConnection != null)
				msgs = ((InternalEObject)newConnection).eInverseAdd(this, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS, WorkflowParameterConnection.class, msgs);
			msgs = basicSetConnection(newConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION, newConnection, newConnection));
	}

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameter_Required()
	 * @model required="true"
	 * @generated
	 */
	public boolean isRequired()
	{
		return required;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	public void setRequired(boolean newRequired)
	{
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param context
	 * @return the parameter value
	 * @throws WorkflowRuntimeException
	 * @model
	 * @generated NOT
	 */
	public final Object getValue(WorkflowContext context) throws WorkflowRuntimeException
	{
		Object value = getConnection() != null ? getConnection().getOutput().getValue(context) : doGetValue(context);
		
		if(isRequired() && value == null)
			throw new WorkflowRuntimeException("Required parameter: '" + getName() + "' does not have a value");
		
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.emf.workflow.runtime.WorkflowRuntimeException"
	 * @generated NOT
	 */
	public void setValue(WorkflowContext context, Object value) throws WorkflowRuntimeException
	{
		getValueStrategy().setValue(context, this, value);
	}

	/**
	 * Get the value of the parameter from the context
	 * @param context
	 * @return the value of the parameter
	 * @throws WorkflowRuntimeException 
	 */
	protected Object doGetValue(WorkflowContext context) throws WorkflowRuntimeException
	{
		return getValueStrategy().getValue(context, this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				if (connection != null)
					msgs = ((InternalEObject)connection).eInverseRemove(this, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS, WorkflowParameterConnection.class, msgs);
				return basicSetConnection((WorkflowParameterConnection)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				return basicSetConnection(null, msgs);
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				return basicSetValueStrategy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case WorkflowPackage.WORKFLOW_PARAMETER__NAME:
				return getName();
			case WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION:
				return getDescription();
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
			case WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED:
				return isRequired();
			case WorkflowPackage.WORKFLOW_PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				return getValueStrategy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case WorkflowPackage.WORKFLOW_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				setConnection((WorkflowParameterConnection)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__TYPE:
				setType((EClassifier)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				setValueStrategy((WorkflowParameterValueStrategy)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case WorkflowPackage.WORKFLOW_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				setConnection((WorkflowParameterConnection)null);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__TYPE:
				setType((EClassifier)null);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				setValueStrategy((WorkflowParameterValueStrategy)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case WorkflowPackage.WORKFLOW_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				return connection != null;
			case WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case WorkflowPackage.WORKFLOW_PARAMETER__TYPE:
				return type != null;
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				return valueStrategy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		return getName();
	}

} // Parameter
