/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.mwe.properties.mweProperties.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage
 * @generated
 */
public class MwePropertiesSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MwePropertiesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MwePropertiesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MwePropertiesPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MwePropertiesPackage.PROPERTY_FILE:
      {
        PropertyFile propertyFile = (PropertyFile)theEObject;
        T result = casePropertyFile(propertyFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MwePropertiesPackage.NATURAL_LINE:
      {
        NaturalLine naturalLine = (NaturalLine)theEObject;
        T result = caseNaturalLine(naturalLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MwePropertiesPackage.BLANK_LINE:
      {
        BlankLine blankLine = (BlankLine)theEObject;
        T result = caseBlankLine(blankLine);
        if (result == null) result = caseNaturalLine(blankLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MwePropertiesPackage.PROPERTY_COMMENT:
      {
        PropertyComment propertyComment = (PropertyComment)theEObject;
        T result = casePropertyComment(propertyComment);
        if (result == null) result = caseNaturalLine(propertyComment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MwePropertiesPackage.PROPERTY_ENTRY:
      {
        PropertyEntry propertyEntry = (PropertyEntry)theEObject;
        T result = casePropertyEntry(propertyEntry);
        if (result == null) result = caseNaturalLine(propertyEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MwePropertiesPackage.COMPOUND_STRING:
      {
        CompoundString compoundString = (CompoundString)theEObject;
        T result = caseCompoundString(compoundString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MwePropertiesPackage.COMPOUND_STRING_PART:
      {
        CompoundStringPart compoundStringPart = (CompoundStringPart)theEObject;
        T result = caseCompoundStringPart(compoundStringPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MwePropertiesPackage.EMPTY_PROPERTY_VALUE:
      {
        EmptyPropertyValue emptyPropertyValue = (EmptyPropertyValue)theEObject;
        T result = caseEmptyPropertyValue(emptyPropertyValue);
        if (result == null) result = caseCompoundString(emptyPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyFile(PropertyFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Natural Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Natural Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNaturalLine(NaturalLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Blank Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Blank Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlankLine(BlankLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyComment(PropertyComment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyEntry(PropertyEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundString(CompoundString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound String Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound String Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundStringPart(CompoundStringPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyPropertyValue(EmptyPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MwePropertiesSwitch
