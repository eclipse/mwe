package org.eclipse.emf.mwe.utils;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class SingleGlobalResourceSet {

	private static ResourceSet rs;

	public static ResourceSet get() {
		if ( rs == null ) {
			rs = new ResourceSetImpl();
		}
		return rs;
	}

}
