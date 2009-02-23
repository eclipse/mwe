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
package test.res;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;

public class Component implements WorkflowComponent {

	private static final String COMPONENT_NAME = "Test Component";

	public boolean booleanParam = false;

	public void setBooleanParam(final boolean booleanParam) {
		this.booleanParam = booleanParam;
	}

	public Boolean booleanObjectParam = Boolean.FALSE;

	public void setBooleanObjectParam(final Boolean booleanObjectParam) {
		this.booleanObjectParam = booleanObjectParam;
	}

	public int intParam = -1;

	public void setIntParam(final int intParam) {
		this.intParam = intParam;
	}

	public Integer integerParam = new Integer(-1);

	public void setIntegerParam(final Integer integerParam) {
		this.integerParam = integerParam;
	}

	public String stringParam;

	public void setStringParam(final String stringParam) {
		this.stringParam = stringParam;
	}

	public String[] stringArrayParam;

	public void setStringArrayParam(final String[] stringArrayParam) {
		this.stringArrayParam = stringArrayParam;
	}

	public Component type;

	public void setType(final Component type) {
		this.type = type;
	}

	public List<Component> types = new ArrayList<Component>();

	public void addTypes(final Component type) {
		types.add(type);
	}

	public Map<String, Object> map = new HashMap<String, Object>();

	public void put(final String key, final Object value) {
		map.put(key, value);
	}

	public Object bean = null;

	public void setBean(final Object bean) {
		this.bean = bean;
	}

	public static int INVOCATIONS = 0;

	public int invocations = 0;

	public void invoke(final WorkflowContext model, final ProgressMonitor monitor, final Issues issues) {
		invocations++;
		INVOCATIONS++;
	}

	public int checks = 0;

	private CompositeComponent container;

	private Location location;

	public void checkConfiguration(final Issues issues) {
		checks++;
	}

	public CompositeComponent getContainer() {
		return container;
	}

	public void setContainer(CompositeComponent container) {
		this.container = container;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
		//
	}

	public String getComponentName() {
		return COMPONENT_NAME;
	}
}
