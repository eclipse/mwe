/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.services;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.AbstractXtextResourceFactory;

public class MWEResourceFactory extends AbstractXtextResourceFactory {

	public MWEResourceFactory() {
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xtext", this);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mwe", this);
		
	}
	
	public String[] getModelFileExtensions() {
		return new String[] { "xtext", "mwe" };
	}
	
} 
