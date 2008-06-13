package org.eclipse.emf.mwe.di.execution;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("serial")
public class MweInstantiationException extends RuntimeException {

	private EObject element;

	public MweInstantiationException(String string, EObject object) {
		super(string);
		this.element = object;
	}
	
	public EObject getElement() {
		return element;
	}

}
