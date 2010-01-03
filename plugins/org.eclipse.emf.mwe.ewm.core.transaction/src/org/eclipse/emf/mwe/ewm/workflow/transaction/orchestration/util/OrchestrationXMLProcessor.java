/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrchestrationXMLProcessor.java,v 1.1 2010/01/03 21:22:54 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.mwe.ewm.workflow.transaction.orchestration.OrchestrationPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestrationXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		OrchestrationPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the OrchestrationResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations()
	{
		if (registrations == null)
		{
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new OrchestrationResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new OrchestrationResourceFactoryImpl());
		}
		return registrations;
	}

} //OrchestrationXMLProcessor
