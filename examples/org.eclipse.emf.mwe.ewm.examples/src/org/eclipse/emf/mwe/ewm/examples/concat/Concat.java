/**
 * <copyright>
 * </copyright>
 *
 * $Id: Concat.java,v 1.1 2010/01/03 16:36:02 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.examples.concat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.concat.Concat#getInputMessage <em>Input Message</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.concat.Concat#getInputAppendMessage <em>Input Append Message</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.concat.Concat#getOutputMessage <em>Output Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.examples.concat.ConcatPackage#getConcat()
 * @model kind="class"
 * @generated
 */
public class Concat extends WorkflowUnitOfWork
{
	/**
	 * The cached value of the '{@link #getInputMessage() <em>Input Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMessage()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter inputMessage;

	/**
	 * The cached value of the '{@link #getInputAppendMessage() <em>Input Append Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputAppendMessage()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter inputAppendMessage;

	/**
	 * The cached value of the '{@link #getOutputMessage() <em>Output Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMessage()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter outputMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Concat()
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
		return ConcatPackage.Literals.CONCAT;
	}

	/**
	 * Returns the value of the '<em><b>Input Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Message</em>' containment reference.
	 * @see #setInputMessage(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.concat.ConcatPackage#getConcat_InputMessage()
	 * @model containment="true"
	 * @generated
	 */
	public WorkflowParameter getInputMessage()
	{
		return inputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputMessage(WorkflowParameter newInputMessage, NotificationChain msgs)
	{
		WorkflowParameter oldInputMessage = inputMessage;
		inputMessage = newInputMessage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConcatPackage.CONCAT__INPUT_MESSAGE, oldInputMessage, newInputMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.concat.Concat#getInputMessage <em>Input Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Message</em>' containment reference.
	 * @see #getInputMessage()
	 * @generated
	 */
	public void setInputMessage(WorkflowParameter newInputMessage)
	{
		if (newInputMessage != inputMessage)
		{
			NotificationChain msgs = null;
			if (inputMessage != null)
				msgs = ((InternalEObject)inputMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConcatPackage.CONCAT__INPUT_MESSAGE, null, msgs);
			if (newInputMessage != null)
				msgs = ((InternalEObject)newInputMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConcatPackage.CONCAT__INPUT_MESSAGE, null, msgs);
			msgs = basicSetInputMessage(newInputMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcatPackage.CONCAT__INPUT_MESSAGE, newInputMessage, newInputMessage));
	}

	/**
	 * Returns the value of the '<em><b>Input Append Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Append Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Append Message</em>' containment reference.
	 * @see #setInputAppendMessage(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.concat.ConcatPackage#getConcat_InputAppendMessage()
	 * @model containment="true"
	 * @generated
	 */
	public WorkflowParameter getInputAppendMessage()
	{
		return inputAppendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputAppendMessage(WorkflowParameter newInputAppendMessage, NotificationChain msgs)
	{
		WorkflowParameter oldInputAppendMessage = inputAppendMessage;
		inputAppendMessage = newInputAppendMessage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE, oldInputAppendMessage, newInputAppendMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.concat.Concat#getInputAppendMessage <em>Input Append Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Append Message</em>' containment reference.
	 * @see #getInputAppendMessage()
	 * @generated
	 */
	public void setInputAppendMessage(WorkflowParameter newInputAppendMessage)
	{
		if (newInputAppendMessage != inputAppendMessage)
		{
			NotificationChain msgs = null;
			if (inputAppendMessage != null)
				msgs = ((InternalEObject)inputAppendMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE, null, msgs);
			if (newInputAppendMessage != null)
				msgs = ((InternalEObject)newInputAppendMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE, null, msgs);
			msgs = basicSetInputAppendMessage(newInputAppendMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE, newInputAppendMessage, newInputAppendMessage));
	}

	/**
	 * Returns the value of the '<em><b>Output Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Message</em>' containment reference.
	 * @see #setOutputMessage(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.concat.ConcatPackage#getConcat_OutputMessage()
	 * @model containment="true"
	 * @generated
	 */
	public WorkflowParameter getOutputMessage()
	{
		return outputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputMessage(WorkflowParameter newOutputMessage, NotificationChain msgs)
	{
		WorkflowParameter oldOutputMessage = outputMessage;
		outputMessage = newOutputMessage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConcatPackage.CONCAT__OUTPUT_MESSAGE, oldOutputMessage, newOutputMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.concat.Concat#getOutputMessage <em>Output Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Message</em>' containment reference.
	 * @see #getOutputMessage()
	 * @generated
	 */
	public void setOutputMessage(WorkflowParameter newOutputMessage)
	{
		if (newOutputMessage != outputMessage)
		{
			NotificationChain msgs = null;
			if (outputMessage != null)
				msgs = ((InternalEObject)outputMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConcatPackage.CONCAT__OUTPUT_MESSAGE, null, msgs);
			if (newOutputMessage != null)
				msgs = ((InternalEObject)newOutputMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConcatPackage.CONCAT__OUTPUT_MESSAGE, null, msgs);
			msgs = basicSetOutputMessage(newOutputMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcatPackage.CONCAT__OUTPUT_MESSAGE, newOutputMessage, newOutputMessage));
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
			case ConcatPackage.CONCAT__INPUT_MESSAGE:
				return basicSetInputMessage(null, msgs);
			case ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE:
				return basicSetInputAppendMessage(null, msgs);
			case ConcatPackage.CONCAT__OUTPUT_MESSAGE:
				return basicSetOutputMessage(null, msgs);
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
			case ConcatPackage.CONCAT__INPUT_MESSAGE:
				return getInputMessage();
			case ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE:
				return getInputAppendMessage();
			case ConcatPackage.CONCAT__OUTPUT_MESSAGE:
				return getOutputMessage();
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
			case ConcatPackage.CONCAT__INPUT_MESSAGE:
				setInputMessage((WorkflowParameter)newValue);
				return;
			case ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE:
				setInputAppendMessage((WorkflowParameter)newValue);
				return;
			case ConcatPackage.CONCAT__OUTPUT_MESSAGE:
				setOutputMessage((WorkflowParameter)newValue);
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
			case ConcatPackage.CONCAT__INPUT_MESSAGE:
				setInputMessage((WorkflowParameter)null);
				return;
			case ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE:
				setInputAppendMessage((WorkflowParameter)null);
				return;
			case ConcatPackage.CONCAT__OUTPUT_MESSAGE:
				setOutputMessage((WorkflowParameter)null);
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
			case ConcatPackage.CONCAT__INPUT_MESSAGE:
				return inputMessage != null;
			case ConcatPackage.CONCAT__INPUT_APPEND_MESSAGE:
				return inputAppendMessage != null;
			case ConcatPackage.CONCAT__OUTPUT_MESSAGE:
				return outputMessage != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public WorkflowState run(WorkflowContext context) throws WorkflowRuntimeException
	{
		StringBuilder message = new StringBuilder();
		message.append(getInputMessage().getValue(context));
		
		if(message.length() > 0)
			message.append(' ');
		
		message.append(getInputAppendMessage().getValue(context));
		getOutputMessage().setValue(context, message.toString());
		System.out.println(message.toString());
		
		return StateFactory.eINSTANCE.createWorkflowSuccessState();
	}

} // Concat
