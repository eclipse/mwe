/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.mwe.properties.mweProperties.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage
 * @generated
 */
public class MwePropertiesAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MwePropertiesPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MwePropertiesAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MwePropertiesPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MwePropertiesSwitch<Adapter> modelSwitch =
    new MwePropertiesSwitch<Adapter>()
    {
      @Override
      public Adapter casePropertyFile(PropertyFile object)
      {
        return createPropertyFileAdapter();
      }
      @Override
      public Adapter caseNaturalLine(NaturalLine object)
      {
        return createNaturalLineAdapter();
      }
      @Override
      public Adapter caseBlankLine(BlankLine object)
      {
        return createBlankLineAdapter();
      }
      @Override
      public Adapter casePropertyComment(PropertyComment object)
      {
        return createPropertyCommentAdapter();
      }
      @Override
      public Adapter casePropertyEntry(PropertyEntry object)
      {
        return createPropertyEntryAdapter();
      }
      @Override
      public Adapter caseCompoundString(CompoundString object)
      {
        return createCompoundStringAdapter();
      }
      @Override
      public Adapter caseCompoundStringPart(CompoundStringPart object)
      {
        return createCompoundStringPartAdapter();
      }
      @Override
      public Adapter caseEmptyPropertyValue(EmptyPropertyValue object)
      {
        return createEmptyPropertyValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyFile <em>Property File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyFile
   * @generated
   */
  public Adapter createPropertyFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.properties.mweProperties.NaturalLine <em>Natural Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.mwe.properties.mweProperties.NaturalLine
   * @generated
   */
  public Adapter createNaturalLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.properties.mweProperties.BlankLine <em>Blank Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.mwe.properties.mweProperties.BlankLine
   * @generated
   */
  public Adapter createBlankLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyComment <em>Property Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyComment
   * @generated
   */
  public Adapter createPropertyCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry <em>Property Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry
   * @generated
   */
  public Adapter createPropertyEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.properties.mweProperties.CompoundString <em>Compound String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.mwe.properties.mweProperties.CompoundString
   * @generated
   */
  public Adapter createCompoundStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.properties.mweProperties.CompoundStringPart <em>Compound String Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.mwe.properties.mweProperties.CompoundStringPart
   * @generated
   */
  public Adapter createCompoundStringPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.properties.mweProperties.EmptyPropertyValue <em>Empty Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.mwe.properties.mweProperties.EmptyPropertyValue
   * @generated
   */
  public Adapter createEmptyPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MwePropertiesAdapterFactory
