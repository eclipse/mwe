/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.core.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
 * @author Sven Efftinge (http://www.efftinge.de)
 * 
 */
public class CompositeComponent implements WorkflowComponentWithID {
	protected static final Log log = LogFactory.getLog(CompositeComponent.class);

	private String name;

	private String resource;

	private Location location;

	private Location ownLocation;

	private CompositeComponent container;

	public CompositeComponent(final String name) {
		this.name = name;
	}

	/** All components aggregated by this composite */
	protected List<WorkflowComponent> components = new ArrayList<WorkflowComponent>();

	private String id;

	public List<WorkflowComponent> getComponents() {
		return components;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogMessage() {
		return "CompositeComponent " + (id != null ? id : "");
	}

	/**
	 * Dispatches the invocation to all aggregated components.
	 */
	public void invoke(final WorkflowContext ctx,
			final ProgressMonitor monitor, final Issues issues) {
		internalInvoke(ctx, monitor, issues);
	}

	private void internalInvoke(final WorkflowContext model,
			final ProgressMonitor monitor, final Issues issues) {
		for (final Iterator<WorkflowComponent> iter = components.iterator(); iter
				.hasNext();) {
			final WorkflowComponent comp = iter.next();
			if ((!(comp instanceof AbstractWorkflowAdvice))) {
				comp.setContainer(this);
				if (monitor != null)
					monitor.preTask(comp, model);
				log.info(ComponentPrinter.getString(comp));
				comp.invoke(model, monitor, issues);
				if (monitor != null)
					monitor.postTask(comp, model);
			}
		}
	}

	public void checkConfiguration(final Issues issues)
			throws ConfigurationException {
		for (final Iterator<WorkflowComponent> iter = components.iterator(); iter
				.hasNext();) {
			final WorkflowComponent comp = iter.next();
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
					issues.addWarning(advice, "No component with ID '"
							+ adviceTargetID + "' found.");
				}
				if (targetComponents.size() > 1) {
					issues.addWarning(advice,
							"More than on component with ID '" + adviceTargetID
									+ "' found.");
				}
				if (needsToWeave(comp, issues)) {
					for (WorkflowComponent c : targetComponents) {
						((AbstractWorkflowAdvice) comp).weave(c, issues);
					}
				}
			}
		}
		for (final Iterator<WorkflowComponent> iter = components.iterator(); iter
				.hasNext();) {
			final WorkflowComponent comp = iter.next();
			if ((!(comp instanceof AbstractWorkflowAdvice))) {
				log.debug("Checking configuration of: "
						+ ComponentPrinter.getString(comp));
				comp.checkConfiguration(issues);
			}
		}
	}

	private boolean needsToWeave(WorkflowComponent comp, Issues issues) {
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
		} catch (ConditionEvaluationException ex) {
			issues.addError(this, ex.getMessage());
			return false;
		}
	}

	private Collection<WorkflowComponent> findComponentByID(
			String adviceTargetID) {
		List<WorkflowComponent> hits = new ArrayList<WorkflowComponent>();
		WorkflowComponent c = this;
		while (c.getContainer() != null)
			c = c.getContainer();
		((CompositeComponent) c).resolveComponentByID(adviceTargetID, hits);
		return hits;
	}

	private void resolveComponentByID(String adviceTargetID,
			List<WorkflowComponent> hits) {
		for (WorkflowComponent component : components) {
			if (component instanceof WorkflowComponentWithID) {
				if (adviceTargetID.equals(((WorkflowComponentWithID) component)
						.getId()))
					hits.add(component);
			}
		}
		for (WorkflowComponent component : components) {
			if (component instanceof CompositeComponent) {
				((CompositeComponent) component).resolveComponentByID(
						adviceTargetID, hits);
			}
		}
	}

	public String getName() {
		return name;
	}

	// the file name of this workflow
	public String getResource() {
		return resource;
	}

	public void setResource(final String resource) {
		this.resource = resource;
	}

	// the location of the entry in the parent workflow file
	public Location getLocation() {
		return location;
	}

	public void setLocation(final Location location) {
		this.location = location;
	}

	// the location of the start and closing tags in the actual workflow file
	public Location getOwnLocation() {
		return ownLocation;
	}

	// locations are set from VisitorCreator by reflection
	public void setOwnLocation(Location endLocation) {
		this.ownLocation = endLocation;
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
	 * adds a conditionalcompositecomponent to the list of components
	 * 
	 * @param comp
	 */
	public void addIf(final IfComponent comp) {
		addComponent(comp);
	}

	/**
	 * adds a feature components to the list of components
	 * 
	 * @param comp
	 */
	public void addFeature(final FeatureComponent comp) {
		addComponent(comp);
	}

	public CompositeComponent getContainer() {
		return container;
	}

	public void setContainer(CompositeComponent container) {
		this.container = container;
	}

	public void put(@SuppressWarnings("unused")
	String name, WorkflowComponent comp) {
		addComponent(comp);
	}
	
	public void addBean(final Object obj) {
		// noop
	}

}
