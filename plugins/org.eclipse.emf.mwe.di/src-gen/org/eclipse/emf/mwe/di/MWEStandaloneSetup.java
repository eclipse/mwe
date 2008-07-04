/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.builtin.XtextBuiltinStandaloneSetup;
import org.eclipse.xtext.service.ILanguageDescriptor;
import org.eclipse.xtext.service.LanguageDescriptorFactory;
import org.eclipse.xtext.service.ServiceRegistry;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess;
import org.eclipse.xtext.IMetamodelAccess;
import org.eclipse.emf.mwe.di.services.MWEMetamodelAccess;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parser.GenericEcoreElementFactory;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.emf.mwe.di.parser.MWEParser;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.emf.mwe.di.services.MWEResourceFactory;
import org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor;
import org.eclipse.emf.mwe.di.parsetree.reconstr.MWEParseTreeConstructor;

import org.eclipse.emf.mwe.di.IMWE;

public abstract class MWEStandaloneSetup {

	private static boolean isInitialized = false;

	public synchronized static void doSetup() {
		if(!isInitialized) {
			
			// setup super language first
			XtextBuiltinStandaloneSetup.doSetup();
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new XMIResourceFactoryImpl());
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xmi", new XMIResourceFactoryImpl());
			ILanguageDescriptor languageDescriptor = 
				LanguageDescriptorFactory.createLanguageDescriptor(
					IMWE.ID, 
					IMWE.NAME, 
					IMWE.NAMESPACE, 
					LanguageDescriptorFactory.get("org.eclipse.xtext.builtin.XtextBuiltin"));
			ServiceRegistry.registerService(languageDescriptor, IGrammarAccess.class, MWEGrammarAccess.class);
			ServiceRegistry.registerService(languageDescriptor, IMetamodelAccess.class, MWEMetamodelAccess.class);
			ServiceRegistry.registerService(languageDescriptor, IAstFactory.class, GenericEcoreElementFactory.class);
			ServiceRegistry.registerService(languageDescriptor, IParser.class, MWEParser.class);
			ServiceRegistry.registerService(languageDescriptor, IResourceFactory.class, MWEResourceFactory.class);
			ServiceRegistry.registerService(languageDescriptor, IParseTreeConstructor.class, MWEParseTreeConstructor.class);
			
			// register resource factory to EMF
			IResourceFactory resourceFactory = new MWEResourceFactory();
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xtext", resourceFactory);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mwe", resourceFactory);
			
			
			isInitialized = true;
		}
	}
	
	public static ILanguageDescriptor getLanguageDescriptor() {
		if(!isInitialized) {
			doSetup();
		}
		return LanguageDescriptorFactory.get(IMWE.ID);
	}
			
}
