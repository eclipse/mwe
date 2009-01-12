/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion.impl;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe.Assignable;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.SimpleValue;
import org.eclipse.emf.mwe.Value;
import org.eclipse.emf.mwe.di.xml.Xml2MweConverter;
import org.eclipse.emf.mwe.di.xml.conversion.AbstractCreatorModule;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public abstract class AbstractValueCreatorModule extends AbstractCreatorModule
		implements IMweFactory {

	protected static final Set<String> RESERVED_ATTRS = new HashSet<String>();

	protected static final Set<String> RESERVED_ELES = new HashSet<String>();

	static {
		RESERVED_ATTRS.add(Xml2MweConverter.VALUE);
		RESERVED_ATTRS.add(Xml2MweConverter.ID_REF);
		RESERVED_ATTRS.add(Xml2MweConverter.FILE);
		RESERVED_ATTRS.add(Xml2MweConverter.CLASS);
		RESERVED_ATTRS.add(Xml2MweConverter.ID);
	}

	static {
		RESERVED_ELES.add(Xml2MweConverter.PROPERTY);
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractModule#relevantNodeTypes()
	 */
	@Override
	public short[] relevantNodeTypes() {
		return new short[] { Node.ELEMENT_NODE, Node.ATTRIBUTE_NODE };
	}

	protected void addToValue(final Assignable assignableValue,
			final Assignment assignment) {
		if (assignableValue == null)
			throw new IllegalArgumentException();

		if (assignment == null)
			return;

		assignableValue.getAssignments().add(assignment);
	}

	protected void addToValue(final Assignable assignableValue,
			final EList<Assignment> assignments) {
		if (assignableValue == null)
			throw new IllegalArgumentException();

		if (assignments == null)
			return;

		assignableValue.getAssignments().addAll(assignments);
	}

	protected Assignment createAssignment(final Node item) {
		if (converter == null) {
			throw new IllegalStateException("Converter not set");
		}

		if (item.getNodeType() == Node.ATTRIBUTE_NODE) {
			if (RESERVED_ATTRS.contains(item.getNodeName()))
				return null;
			final Assignment a = FACTORY.createAssignment();
			a.setFeature(item.getNodeName());
			final SimpleValue sv = FACTORY.createSimpleValue();
			sv.setValue(item.getNodeValue());
			a.setValue(sv);
			return a;
		} else if (item.getNodeType() == Node.ELEMENT_NODE) {
			if (RESERVED_ELES.contains(item.getNodeName()))
				return null;
			final Assignment a = FACTORY.createAssignment();
			a.setFeature(item.getNodeName());
			a.setValue((Value) converter.create(item));
			return a;
		}
		throw new IllegalArgumentException(item.toString());
	}

	protected EList<Assignment> getAssignments(final NamedNodeMap nodes) {
		if (nodes == null)
			return null;

		final EList<Assignment> assignments = new BasicEList<Assignment>();
		for (int i = 0; i < nodes.getLength(); i++) {
			final Node child = nodes.item(i);
			if (isRelevantNode(child)) {
				final Assignment a = createAssignment(nodes.item(i));
				if (a != null) {
					assignments.add(a);
				}
			}
		}
		return assignments;
	}

	protected EList<Assignment> getAssignments(final NodeList nodes) {
		if (nodes == null)
			return null;

		final EList<Assignment> assignments = new BasicEList<Assignment>();
		for (int i = 0; i < nodes.getLength(); i++) {
			final Node child = nodes.item(i);
			if (isRelevantNode(child)) {
				final Assignment a = createAssignment(nodes.item(i));
				if (a != null) {
					assignments.add(a);
				}
			}
		}
		return assignments;
	}

}
