package org.eclipse.emf.mwe2.language.resource;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.access.ITypeProvider;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class MweResourceSetProvider implements Provider<XtextResourceSet>{

	@Inject
	private Provider<ITypeProvider.Factory> typeProviderFactory;
	
	public XtextResourceSet get() {
		XtextResourceSet result = new XtextResourceSet() {
			@Override
			public void setClasspathURIContext(Object classpathURIContext) {
				super.setClasspathURIContext(classpathURIContext);
				if (isExpectedContext(classpathURIContext))
					ensureTypeFactoryExists(this);
			}
		};
		return result;
	}
	
	protected boolean isExpectedContext(Object classpathURIContext) {
		return true;
	}

	protected void ensureTypeFactoryExists(ResourceSet resourceSet) {
		ITypeProvider.Factory factory = typeProviderFactory.get();
		ITypeProvider typeProvider = factory.findTypeProvider(resourceSet);
		if (typeProvider == null)
			factory.createTypeProvider(resourceSet);
	}

}
