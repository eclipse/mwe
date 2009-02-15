/**
 * <copyright>
 * </copyright>
 *
 * $Id: Concat.java,v 1.1 2009/02/15 19:18:45 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.examples.tutorial;

import org.eclipse.emf.common.notify.Notification;
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
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getInputMessage <em>Input Message</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getInputAppendMessage <em>Input Append Message</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getOutputMessage <em>Output Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage#getConcat()
 * @model kind="class"
 * @generated
 */
public class Concat extends WorkflowUnitOfWork
{
	/**
	 * The cached value of the '{@link #getInputMessage() <em>Input Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMessage()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter inputMessage;

	/**
	 * The cached value of the '{@link #getInputAppendMessage() <em>Input Append Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputAppendMessage()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter inputAppendMessage;

	/**
	 * The cached value of the '{@link #getOutputMessage() <em>Output Message</em>}' reference.
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
		return TutorialPackage.Literals.CONCAT;
	}

	/**
	 * Returns the value of the '<em><b>Input Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Message</em>' reference.
	 * @see #setInputMessage(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage#getConcat_InputMessage()
	 * @model
	 * @generated
	 */
	public WorkflowParameter getInputMessage()
	{
		if (inputMessage != null && inputMessage.eIsProxy())
		{
			InternalEObject oldInputMessage = (InternalEObject)inputMessage;
			inputMessage = (WorkflowParameter)eResolveProxy(oldInputMessage);
			if (inputMessage != oldInputMessage)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TutorialPackage.CONCAT__INPUT_MESSAGE, oldInputMessage, inputMessage));
			}
		}
		return inputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetInputMessage()
	{
		return inputMessage;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getInputMessage <em>Input Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Message</em>' reference.
	 * @see #getInputMessage()
	 * @generated
	 */
	public void setInputMessage(WorkflowParameter newInputMessage)
	{
		WorkflowParameter oldInputMessage = inputMessage;
		inputMessage = newInputMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.CONCAT__INPUT_MESSAGE, oldInputMessage, inputMessage));
	}

	/**
	 * Returns the value of the '<em><b>Input Append Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Append Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Append Message</em>' reference.
	 * @see #setInputAppendMessage(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage#getConcat_InputAppendMessage()
	 * @model
	 * @generated
	 */
	public WorkflowParameter getInputAppendMessage()
	{
		if (inputAppendMessage != null && inputAppendMessage.eIsProxy())
		{
			InternalEObject oldInputAppendMessage = (InternalEObject)inputAppendMessage;
			inputAppendMessage = (WorkflowParameter)eResolveProxy(oldInputAppendMessage);
			if (inputAppendMessage != oldInputAppendMessage)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TutorialPackage.CONCAT__INPUT_APPEND_MESSAGE, oldInputAppendMessage, inputAppendMessage));
			}
		}
		return inputAppendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetInputAppendMessage()
	{
		return inputAppendMessage;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getInputAppendMessage <em>Input Append Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Append Message</em>' reference.
	 * @see #getInputAppendMessage()
	 * @generated
	 */
	public void setInputAppendMessage(WorkflowParameter newInputAppendMessage)
	{
		WorkflowParameter oldInputAppendMessage = inputAppendMessage;
		inputAppendMessage = newInputAppendMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.CONCAT__INPUT_APPEND_MESSAGE, oldInputAppendMessage, inputAppendMessage));
	}

	/**
	 * Returns the value of the '<em><b>Output Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Message</em>' reference.
	 * @see #setOutputMessage(WorkflowParameter)
	 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage#getConcat_OutputMessage()
	 * @model
	 * @generated
	 */
	public WorkflowParameter getOutputMessage()
	{
		if (outputMessage != null && outputMessage.eIsProxy())
		{
			InternalEObject oldOutputMessage = (InternalEObject)outputMessage;
			outputMessage = (WorkflowParameter)eResolveProxy(oldOutputMessage);
			if (outputMessage != oldOutputMessage)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TutorialPackage.CONCAT__OUTPUT_MESSAGE, oldOutputMessage, outputMessage));
			}
		}
		return outputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetOutputMessage()
	{
		return outputMessage;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.examples.tutorial.Concat#getOutputMessage <em>Output Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Message</em>' reference.
	 * @see #getOutputMessage()
	 * @generated
	 */
	public void setOutputMessage(WorkflowParameter newOutputMessage)
	{
		WorkflowParameter oldOutputMessage = outputMessage;
		outputMessage = newOutputMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.CONCAT__OUTPUT_MESSAGE, oldOutputMessage, outputMessage));
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
			case TutorialPackage.CONCAT__INPUT_MESSAGE:
				if (resolve) return getInputMessage();
				return basicGetInputMessage();
			case TutorialPackage.CONCAT__INPUT_APPEND_MESSAGE:
				if (resolve) return getInputAppendMessage();
				return basicGetInputAppendMessage();
			case TutorialPackage.CONCAT__OUTPUT_MESSAGE:
				if (resolve) return getOutputMessage();
				return basicGetOutputMessage();
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
			case TutorialPackage.CONCAT__INPUT_MESSAGE:
				setInputMessage((WorkflowParameter)newValue);
				return;
			case TutorialPackage.CONCAT__INPUT_APPEND_MESSAGE:
				setInputAppendMessage((WorkflowParameter)newValue);
				return;
			case TutorialPackage.CONCAT__OUTPUT_MESSAGE:
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
			case TutorialPackage.CONCAT__INPUT_MESSAGE:
				setInputMessage((WorkflowParameter)null);
				return;
			case TutorialPackage.CONCAT__INPUT_APPEND_MESSAGE:
				setInputAppendMessage((WorkflowParameter)null);
				return;
			case TutorialPackage.CONCAT__OUTPUT_MESSAGE:
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
			case TutorialPackage.CONCAT__INPUT_MESSAGE:
				return inputMessage != null;
			case TutorialPackage.CONCAT__INPUT_APPEND_MESSAGE:
				return inputAppendMessage != null;
			case TutorialPackage.CONCAT__OUTPUT_MESSAGE:
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
