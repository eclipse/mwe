/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.utils;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class Reader extends AbstractEMFWorkflowComponent {

	private static final String COMPONENT_NAME = "Reader";

	private boolean makeEPackagesGlobal = true;

	private boolean firstElementOnly = true;

	@Override
	public void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		ctx.set(getModelSlot(), load(resourceSet, uri, firstElementOnly));
		if (makeEPackagesGlobal) {
			for (final String k : resourceSet.getPackageRegistry().keySet()) {
				EPackage.Registry.INSTANCE.put(k, resourceSet.getPackageRegistry().get(k));
			}
		}
	}

	@Override
	public void checkConfiguration(final Issues issues) {
		super.checkConfiguration(issues);
		if (uri == null) {
			issues.addError("URI not set");
		}
	}

	public static Object load(final ResourceSet resourceSet, final String uri, final boolean firstElementOnly) {
		final Resource res = resourceSet.getResource(URI.createURI(uri), true);
		if (res == null)
			throw new WorkflowInterruptedException("Couldn't find resource under " + uri);
		try {
			if (!res.isLoaded()) {
				res.load(Collections.EMPTY_MAP);
			}
		}
		catch (final IOException e) {
			throw new WorkflowInterruptedException("Couldn't find resource under " + uri + " : " + e.getMessage());
		}
		final EList<EObject> result = res.getContents();
		if (firstElementOnly) {
			if (result.isEmpty())
				return null;
			return result.iterator().next();
		}
		else
			return result;
	}

	public void setFirstElementOnly(final boolean firstElementOnly) {
		this.firstElementOnly = firstElementOnly;
	}

	public void setMakeEPackagesGlobal(final boolean makeEPackagesGlobal) {
		this.makeEPackagesGlobal = makeEPackagesGlobal;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getLogMessage()
	 */
	@Override
	public String getLogMessage() {
		return "Loading model from " + uri;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#getComponentName()
	 */
	@Override
	public String getComponentName() {
		return COMPONENT_NAME;
	}

}
