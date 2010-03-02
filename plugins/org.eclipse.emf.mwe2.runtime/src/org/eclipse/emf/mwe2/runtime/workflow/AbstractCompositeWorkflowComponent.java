package org.eclipse.emf.mwe2.runtime.workflow;

import java.util.List;

import com.google.common.collect.Lists;

public abstract class AbstractCompositeWorkflowComponent implements
		IWorkflowComponent {
	private List<IWorkflowComponent> children = Lists.newArrayList();
	
	public void addComponent(IWorkflowComponent component) {
		this.children.add(component);
	}

	public void preInvoke() {
		for (IWorkflowComponent component : children) {
			component.preInvoke();
		}
	}

	public void invoke(IWorkflowContext ctx) {
		for (IWorkflowComponent component : children) {
			component.invoke(ctx);
		}
	}

	public void postInvoke() {
		for (IWorkflowComponent component : children) {
			component.postInvoke();
		}
	}

}
