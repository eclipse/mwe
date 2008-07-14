/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
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
			org.eclipse.xtext.builtin.XtextBuiltinStandaloneSetup.doSetup();
			
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
			
			
			// initialize EPackages
			
				if (!EPackage.Registry.INSTANCE.containsKey("http://www.eclipse.org/emf/mwe/di")) {
					EPackage mwe = EcoreUtil2.loadEPackage(
							"classpath:/org/eclipse/emf/mwe/di/mwe.ecore",
							MWEStandaloneSetup.class.getClassLoader());
					if (mwe == null)
						throw new IllegalStateException(
								"Couldn't load EPackage from 'classpath:/org/eclipse/emf/mwe/di/mwe.ecore'");
					EPackage.Registry.INSTANCE.put("http://www.eclipse.org/emf/mwe/di", mwe);
				}
			
			isInitialized = true;
		}
	}
	
	public static synchronized ILanguageDescriptor getLanguageDescriptor() {
		if(!isInitialized) {
			doSetup();
		}
		return LanguageDescriptorFactory.get(IMWE.ID);
	}
			
}
