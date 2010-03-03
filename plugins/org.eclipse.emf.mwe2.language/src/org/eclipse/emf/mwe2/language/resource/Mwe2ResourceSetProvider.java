package org.eclipse.emf.mwe2.language.resource;

import org.eclipse.xtext.common.types.access.ITypeProvider;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Mwe2ResourceSetProvider implements Provider<XtextResourceSet>{

	@Inject
	private Provider<ITypeProvider.Factory> typeProviderFactory;
	
	public XtextResourceSet get() {
		XtextResourceSet result = new XtextResourceSet();
		ITypeProvider.Factory factory = typeProviderFactory.get();
		factory.createTypeProvider(result);
		return result;
	}

}
