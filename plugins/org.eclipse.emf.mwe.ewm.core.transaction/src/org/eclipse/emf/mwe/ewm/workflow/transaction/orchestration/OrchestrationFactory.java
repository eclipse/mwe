/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrchestrationFactory.java,v 1.2 2010/02/15 22:53:39 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage
 * @generated
 */
public class OrchestrationFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrchestrationFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrchestrationFactory init()
	{
		try
		{
			OrchestrationFactory theOrchestrationFactory = (OrchestrationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/ewm/workflow/transaction/orchestration"); 
			if (theOrchestrationFactory != null)
			{
				return theOrchestrationFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrchestrationFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationFactory()
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
			case OrchestrationPackage.WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY: return createWorkflowParallelOrchestrationStrategy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParallelOrchestrationStrategy createWorkflowParallelOrchestrationStrategy()
	{
		WorkflowParallelOrchestrationStrategy workflowParallelOrchestrationStrategy = new WorkflowParallelOrchestrationStrategy();
		return workflowParallelOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationPackage getOrchestrationPackage()
	{
		return (OrchestrationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrchestrationPackage getPackage()
	{
		return OrchestrationPackage.eINSTANCE;
	}

} //OrchestrationFactory
