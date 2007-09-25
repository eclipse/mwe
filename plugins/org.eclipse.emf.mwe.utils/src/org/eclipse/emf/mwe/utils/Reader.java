package org.eclipse.emf.mwe.utils;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

@SuppressWarnings("unchecked")
public class Reader extends AbstractEMFWorkflowComponent {

	private boolean makeEPackagesGlobal = true;

	private boolean firstElementOnly = true;

	public void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		ctx.set(this.getModelSlot(), load(resourceSet, uri, firstElementOnly));
		if (makeEPackagesGlobal) {
			for (String k : resourceSet.getPackageRegistry()
					.keySet())
				EPackage.Registry.INSTANCE.put(k, resourceSet
						.getPackageRegistry().get(k));
		}
	}

	@Override
	public void checkConfiguration(Issues issues) {
		super.checkConfiguration(issues);
		if (uri == null) {
			issues.addError("URI not set");
		}
	}

	public static Object load(ResourceSet resourceSet, String uri,
			boolean firstElementOnly) {
		Resource res = resourceSet.getResource(URI.createURI(uri), true);
		if (res == null)
			throw new WorkflowInterruptedException(
					"Couldn't find resource under " + uri);
		try {
			if (!res.isLoaded())
				res.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new WorkflowInterruptedException(
					"Couldn't find resource under " + uri + " : "
							+ e.getMessage());
		}
		EList result = res.getContents();
		if (firstElementOnly) {
			if (result.isEmpty())
				return null;
			return result.iterator().next();
		}
		return result;
	}

	public void setFirstElementOnly(boolean firstElementOnly) {
		this.firstElementOnly = firstElementOnly;
	}

	public void setMakeEPackagesGlobal(boolean makeEPackagesGlobal) {
		this.makeEPackagesGlobal = makeEPackagesGlobal;
	}

	@Override
	public String getLogMessage() {
		return "Loading model from " + uri;
	}

}
