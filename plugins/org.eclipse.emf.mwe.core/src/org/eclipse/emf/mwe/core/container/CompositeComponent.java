/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.core.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.WorkflowComponentWithID;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.ao.AbstractWorkflowAdvice;
import org.eclipse.emf.mwe.core.config.FeatureComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.util.ComponentPrinter;

/**
 * A composite <tt>WorkflowComponent</tt>.
 * 
 */
public class CompositeComponent implements WorkflowComponentWithID {

	private static final String COMPONENT_NAME = "Composite Component";

	protected static final Log log = LogFactory.getLog(CompositeComponent.class);

	private final String name;

	private String resource;

	private Location location;

	private Location ownLocation;

	private CompositeComponent container;

	/** All components aggregated by this composite */
	protected List<WorkflowComponent> components = new ArrayList<WorkflowComponent>();

	private String id;

	public CompositeComponent(final String name) {
		this.name = name;
	}

	public void addBean(final Object obj) {
		// noop
	}

	/**
	 * Sets the aggregated components of this composite.
	 * 
	 * @param components
	 *            Components to aggregate.
	 */
	public void addCartridge(final Workflow cartridge) {
		components.add(cartridge);
		cartridge.setContainer(this);
	}

	/**
	 * Sets the aggregated components of this composite.
	 * 
	 * @param components
	 *            Components to aggregate.
	 */
	public void addComponent(final WorkflowComponent component) {
		components.add(component);
		component.setContainer(this);
	}

	/**
	 * adds a feature components to the list of components
	 * 
	 * @param comp
	 */
	public void addFeature(final FeatureComponent comp) {
		addComponent(comp);
	}

	/**
	 * adds a conditionalcompositecomponent to the list of components
	 * 
	 * @param comp
	 */
	public void addIf(final IfComponent comp) {
		addComponent(comp);
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#checkConfiguration(org.eclipse.emf.mwe.core.issues.Issues)
	 */
	public void checkConfiguration(final Issues issues) throws ConfigurationException {
		for (WorkflowComponent comp : components) {
			if (comp instanceof AbstractWorkflowAdvice) {
				AbstractWorkflowAdvice advice = (AbstractWorkflowAdvice) comp;
				String adviceTargetID = advice.getAdviceTarget();
				if (adviceTargetID == null) {
					issues.addError(advice, "No 'adviceTarget' given.");
					continue;
				}
				// log.info("Weaving Advice: " +
				// ComponentPrinter.getString(comp));
				Collection<WorkflowComponent> targetComponents = findComponentByID(adviceTargetID);
				if (targetComponents.size() == 0) {
					issues.addWarning(advice, "No component with ID '" + adviceTargetID + "' found.");
				}
				if (targetComponents.size() > 1) {
					issues.addWarning(advice, "More than on component with ID '" + adviceTargetID + "' found.");
				}
				if (needsToWeave(comp, issues)) {
					for (WorkflowComponent c : targetComponents) {
						((AbstractWorkflowAdvice) comp).weave(c, issues);
					}
				}
			}
		}
		for (WorkflowComponent comp : components) {
			if ((!(comp instanceof AbstractWorkflowAdvice))) {
				log.debug("Checking configuration of: " + ComponentPrinter.getString(comp));
				comp.checkConfiguration(issues);
			}
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#getComponentName()
	 */
	public String getComponentName() {
		return COMPONENT_NAME;
	}

	/**
	 * Returns a list of components.
	 * 
	 * @return list of components
	 */
	public List<WorkflowComponent> getComponents() {
		return components;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#getContainer()
	 */
	public CompositeComponent getContainer() {
		return container;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponentWithID#getId()
	 */
	public String getId() {
		return id;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#getLocation()
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponentWithID#getLogMessage()
	 */
	public String getLogMessage() {
		return "CompositeComponent " + (id != null ? id : "");
	}

	/**
	 * Returns name assigned to composite components.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the own location of the component.
	 * 
	 * @return the location
	 */
	public Location getOwnLocation() {
		return ownLocation;
	}

	/**
	 * Returns the name of the workflow.
	 * 
	 * @return name of workflow
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * Dispatches the invocation to all aggregated components.
	 */
	public void invoke(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		internalInvoke(ctx, monitor, issues);
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#setContainer(org.eclipse.emf.mwe.core.container.CompositeComponent)
	 */
	public void setContainer(final CompositeComponent container) {
		this.container = container;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponentWithID#setId(java.lang.String)
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#setLocation(org.eclipse.emf.mwe.internal.core.ast.parser.Location)
	 */
	public void setLocation(final Location location) {
		this.location = location;
	}

	// locations are set from VisitorCreator by reflection
	public void setOwnLocation(final Location endLocation) {
		this.ownLocation = endLocation;
	}

	/**
	 * Sets the name of the workflow.
	 * 
	 * @param resource
	 *            name of workflow
	 */
	public void setResource(final String resource) {
		this.resource = resource;
	}

	private Collection<WorkflowComponent> findComponentByID(final String adviceTargetID) {
		List<WorkflowComponent> hits = new ArrayList<WorkflowComponent>();
		WorkflowComponent c = this;
		while (c.getContainer() != null) {
			c = c.getContainer();
		}
		((CompositeComponent) c).resolveComponentByID(adviceTargetID, hits);
		return hits;
	}

	private void internalInvoke(final WorkflowContext model, final ProgressMonitor monitor, final Issues issues) {
		for (WorkflowComponent comp : components) {
			if ((!(comp instanceof AbstractWorkflowAdvice))) {
				comp.setContainer(this);
				if (monitor != null) {
					monitor.preTask(comp, model);
				}
				log.info(ComponentPrinter.getString(comp));
				comp.invoke(model, monitor, issues);
				if (monitor != null) {
					monitor.postTask(comp, model);
				}
			}
		}
	}

	private boolean needsToWeave(final WorkflowComponent comp, final Issues issues) {
		try {
			WorkflowComponent current = comp;
			while (current != null) {
				if (current instanceof WorkflowConditional) {
					WorkflowConditional cond = (WorkflowConditional) current;
					if (!cond.evaluate())
						return false;
				}
				current = current.getContainer();
			}
			return true;
		}
		catch (ConditionEvaluationException ex) {
			issues.addError(this, ex.getMessage());
			return false;
		}
	}

	private void resolveComponentByID(final String adviceTargetID, final List<WorkflowComponent> hits) {
		for (WorkflowComponent component : components) {
			if (component instanceof WorkflowComponentWithID) {
				if (adviceTargetID.equals(((WorkflowComponentWithID) component).getId())) {
					hits.add(component);
				}
			}
		}
		for (WorkflowComponent component : components) {
			if (component instanceof CompositeComponent) {
				((CompositeComponent) component).resolveComponentByID(adviceTargetID, hits);
			}
		}
	}
}
