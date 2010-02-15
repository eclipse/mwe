/**
 * <copyright>
 * </copyright>
 *
 * $Id: RuntimeXMLProcessor.java,v 1.2 2010/02/15 22:53:36 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.RuntimePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeXMLProcessor extends XMLProcessor
{

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeXMLProcessor()
	{
		super((EPackage.Registry.INSTANCE));
		RuntimePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the RuntimeResourceFactoryImpl factory.
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
			registrations.put(XML_EXTENSION, new RuntimeResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RuntimeResourceFactoryImpl());
		}
		return registrations;
	}

} //RuntimeXMLProcessor
