/**
 * <copyright>
 * </copyright>
 *
 * $Id: TutorialFactory.java,v 1.1 2009/02/15 19:18:45 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.examples.tutorial;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.ewm.examples.tutorial.TutorialPackage
 * @generated
 */
public class TutorialFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TutorialFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TutorialFactory init()
	{
		try
		{
			TutorialFactory theTutorialFactory = (TutorialFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/ewm/examples/tutorial"); 
			if (theTutorialFactory != null)
			{
				return theTutorialFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TutorialFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TutorialFactory()
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
			case TutorialPackage.CONCAT: return createConcat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concat createConcat()
	{
		Concat concat = new Concat();
		return concat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TutorialPackage getTutorialPackage()
	{
		return (TutorialPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TutorialPackage getPackage()
	{
		return TutorialPackage.eINSTANCE;
	}

} //TutorialFactory
