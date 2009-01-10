/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.SimpleAnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Simple Value Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowParameterSimpleValueStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowParameterSimpleValueStrategy extends WorkflowParameterValueStrategy
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParameterSimpleValueStrategy()
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
		return WorkflowPackage.Literals.WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.emf.workflow.runtime.WorkflowRuntimeException"
	 * @generated NOT
	 */
	@Override
	public Object getValue(WorkflowContext context, WorkflowParameter parameter) throws WorkflowRuntimeException
	{
		EObject value = context.getParameters().get(parameter);
		
		if(value == null)
			return null;
		
		if(!(value instanceof SimpleAnyType))
			throw new WorkflowRuntimeException("Value does not map to a simple type");
		
		SimpleAnyType simpleValue = (SimpleAnyType) value;
		return simpleValue.getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.emf.workflow.runtime.WorkflowRuntimeException"
	 * @generated NOT
	 */
	@Override
	public void setValue(WorkflowContext context, WorkflowParameter parameter, Object value) throws WorkflowRuntimeException
	{
		if(!(parameter.getType() instanceof EDataType))
			throw new WorkflowRuntimeException("Parameter does not map to a simple type");
		
		SimpleAnyType type = XMLTypeFactory.eINSTANCE.createSimpleAnyType();
		type.setInstanceType((EDataType) parameter.getType());
		type.setValue(value);
		context.getParameters().put(parameter, type);
	}

} // WorkflowParameterSimpleValueStrategy
