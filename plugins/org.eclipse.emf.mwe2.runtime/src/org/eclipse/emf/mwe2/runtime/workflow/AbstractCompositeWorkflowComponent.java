/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.runtime.workflow;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractCompositeWorkflowComponent implements
		IWorkflowComponent {
	private List<IWorkflowComponent> children = new ArrayList<IWorkflowComponent>();
	
	protected List<IWorkflowComponent> getChildren() {
		return children;
	}
	
	public void addComponent(IWorkflowComponent component) {
		this.children.add(component);
	}

	@Override
	public void preInvoke() {
		for (IWorkflowComponent component : getChildren()) {
			component.preInvoke();
		}
	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		for (IWorkflowComponent component : getChildren()) {
			component.invoke(ctx);
		}
	}

	@Override
	public void postInvoke() {
		for (IWorkflowComponent component : getChildren()) {
			component.postInvoke();
		}
	}

}
