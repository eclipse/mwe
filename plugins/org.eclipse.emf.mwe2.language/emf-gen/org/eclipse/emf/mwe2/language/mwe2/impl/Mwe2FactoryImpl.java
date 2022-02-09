/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.DoubleLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.IntegerLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Factory;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.NullLiteral;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.PropertyReference;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.Referrable;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.StringPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mwe2FactoryImpl extends EFactoryImpl implements Mwe2Factory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mwe2Factory init()
	{
		try
		{
			Mwe2Factory theMwe2Factory = (Mwe2Factory)EPackage.Registry.INSTANCE.getEFactory(Mwe2Package.eNS_URI);
			if (theMwe2Factory != null)
			{
				return theMwe2Factory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mwe2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mwe2FactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case Mwe2Package.MODULE: return createModule();
			case Mwe2Package.REFERRABLE: return createReferrable();
			case Mwe2Package.DECLARED_PROPERTY: return createDeclaredProperty();
			case Mwe2Package.COMPONENT: return createComponent();
			case Mwe2Package.IMPORT: return createImport();
			case Mwe2Package.ASSIGNMENT: return createAssignment();
			case Mwe2Package.BOOLEAN_LITERAL: return createBooleanLiteral();
			case Mwe2Package.REFERENCE: return createReference();
			case Mwe2Package.STRING_LITERAL: return createStringLiteral();
			case Mwe2Package.STRING_PART: return createStringPart();
			case Mwe2Package.PROPERTY_REFERENCE: return createPropertyReference();
			case Mwe2Package.PLAIN_STRING: return createPlainString();
			case Mwe2Package.NULL_LITERAL: return createNullLiteral();
			case Mwe2Package.DOUBLE_LITERAL: return createDoubleLiteral();
			case Mwe2Package.INTEGER_LITERAL: return createIntegerLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.emf.mwe2.language.mwe2.Module createModule()
	{
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referrable createReferrable()
	{
		ReferrableImplCustom referrable = new ReferrableImplCustom();
		return referrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclaredProperty createDeclaredProperty()
	{
		DeclaredPropertyImplCustom declaredProperty = new DeclaredPropertyImplCustom();
		return declaredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent()
	{
		ComponentImplCustom component = new ComponentImplCustom();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport()
	{
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment()
	{
		AssignmentImplCustom assignment = new AssignmentImplCustom();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral()
	{
		BooleanLiteralImplCustom booleanLiteral = new BooleanLiteralImplCustom();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference()
	{
		ReferenceImplCustom reference = new ReferenceImplCustom();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral()
	{
		StringLiteralImplCustom stringLiteral = new StringLiteralImplCustom();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringPart createStringPart()
	{
		StringPartImpl stringPart = new StringPartImpl();
		return stringPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyReference createPropertyReference()
	{
		PropertyReferenceImpl propertyReference = new PropertyReferenceImpl();
		return propertyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlainString createPlainString()
	{
		PlainStringImpl plainString = new PlainStringImpl();
		return plainString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullLiteral createNullLiteral()
	{
		NullLiteralImplCustom nullLiteral = new NullLiteralImplCustom();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleLiteral createDoubleLiteral()
	{
		DoubleLiteralImplCustom doubleLiteral = new DoubleLiteralImplCustom();
		return doubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerLiteral createIntegerLiteral()
	{
		IntegerLiteralImplCustom integerLiteral = new IntegerLiteralImplCustom();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mwe2Package getMwe2Package()
	{
		return (Mwe2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mwe2Package getPackage()
	{
		return Mwe2Package.eINSTANCE;
	}

} //Mwe2FactoryImpl
