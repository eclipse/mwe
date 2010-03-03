package org.eclipse.emf.mwe2.language.tests.factory;

import org.eclipse.emf.mwe2.runtime.IFactory;

public class ComponentAFactory implements IFactory<ComponentA>{
	private String x;
	public void setX(String x) {
		this.x = x;
	}

	public ComponentA create() {
		ComponentA a = new ComponentA();
		if (x!=null) {
			a.addY(x);
		}
		return a;
	}

}
