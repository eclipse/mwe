package org.eclipse.emf.mwe.utils;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.internal.utils.SingleGlobalResourceSet;

@SuppressWarnings("unchecked")
public abstract class AbstractEMFWorkflowComponent extends
		WorkflowComponentWithModelSlot {

	static {
		new StandaloneSetup();
	}

	public void setUseSingleGlobalResourceSet( final boolean b ) {
		if (b) {
			resourceSet = SingleGlobalResourceSet.get();
		}
	}
	
	protected ResourceSet resourceSet = new ResourceSetImpl();
	
	protected String uri;

	public void setResourceSet(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public void setUri(final String uri) {
		this.uri = uri;
	}
	
	public ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	public String getUri() {
		return uri;
	}
}
