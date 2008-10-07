package org.eclipse.emf.mwe.di;

import java.util.Set;

import org.eclipse.xtext.service.AbstractServiceRegistrationFactory;

/**
 * used to register components to be used at runtime.
 */
public class MWERuntimeConfig extends AbstractServiceRegistrationFactory {

	public Set<IServiceRegistration> registrations() {
		return scope(org.eclipse.emf.mwe.di.IMWE.SCOPE)
		.with(org.eclipse.xtext.IGrammarAccess.class, org.eclipse.emf.mwe.di.services.MWEGrammarAccess.class)
		.with(org.eclipse.xtext.IMetamodelAccess.class, org.eclipse.emf.mwe.di.services.MWEMetamodelAccess.class)
		.with(org.eclipse.xtext.parser.IAstFactory.class, org.eclipse.xtext.parser.GenericEcoreElementFactory.class)
		.with(org.eclipse.xtext.parser.IParser.class, org.eclipse.emf.mwe.di.parser.MWEParser.class)
		.with(org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider.class, org.eclipse.emf.mwe.di.parser.MWEAntlrTokenFileProvider.class)
		.with(org.eclipse.xtext.resource.IResourceFactory.class, org.eclipse.emf.mwe.di.services.MWEResourceFactory.class)
		.with(org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor.class, org.eclipse.emf.mwe.di.parsetree.reconstr.MWEParseTreeConstructor.class)
		.with(org.eclipse.xtext.parser.antlr.Lexer.class, org.eclipse.emf.mwe.di.parser.internal.InternalMWELexer.class)
		
			.registrations();
	}

}
			
