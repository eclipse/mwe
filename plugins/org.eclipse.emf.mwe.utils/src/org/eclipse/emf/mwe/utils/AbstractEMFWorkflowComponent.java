/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.utils;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;


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
