/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.resource;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Value;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class MweResourceDescription extends DefaultResourceDescription {

	private final static Logger log = Logger.getLogger(MweResourceDescription.class);

	public static final String DECLARED_PROPERTY__MANDATORY = "mandatory";
	public static final String MANDATORY_TRUE = "true";
	
	public static final String DECLARED_PROPERTY__TYPE = "type";
	public static final String TYPE__BOOLEAN = "boolean";
	public static final String TYPE__STRING = "String";
	
	public MweResourceDescription(Resource resource, IQualifiedNameProvider nameProvider) {
		super(resource, nameProvider);
	}
	
	@Override
	protected List<IEObjectDescription> computeExportedObjects() {
		loadResourceIfNecessary();
		if (getResource().getContents().isEmpty()) {
			return Collections.emptyList();
		}
		List<IEObjectDescription> result = Lists.newArrayList();
		Module module = (Module) getResource().getContents().get(0);
		IEObjectDescription moduleDescription = createIEObjectDescription(module); 
		if (moduleDescription != null)
			result.add(moduleDescription);
		for(DeclaredProperty property: module.getDeclaredProperties()) {
			IEObjectDescription description = createIEObjectDescription(property);
			if (description != null) {
				result.add(description);
			}
		}
		return result;
	}

	protected void loadResourceIfNecessary() {
		if (!getResource().isLoaded()) {
			try {
				getResource().load(null);
			} catch (IOException e) {
				log.error(e.getMessage(), e);
			}
		}
	}

	protected IEObjectDescription createIEObjectDescription(DeclaredProperty property) {
		QualifiedName qualifiedName = getNameProvider().getQualifiedName(property);
		Builder<String, String> builder = ImmutableMap.builder();
		String nodeModelValue = getValueFromNodeModel(property, Mwe2Package.Literals.REFERRABLE__TYPE);
		if (nodeModelValue != null) {
			builder.put(DECLARED_PROPERTY__TYPE, nodeModelValue);
			if ((property).getDefault() == null) {
				builder.put(DECLARED_PROPERTY__MANDATORY, MANDATORY_TRUE);
			}
		} else {
			Value value = (property).getDefault();
			if (value == null) {
				builder.put(DECLARED_PROPERTY__TYPE, TYPE__STRING);
				builder.put(DECLARED_PROPERTY__MANDATORY, MANDATORY_TRUE);
			} else if (value instanceof BooleanLiteral) {
				builder.put(DECLARED_PROPERTY__TYPE, TYPE__BOOLEAN);
			} else if (value instanceof StringLiteral) {
				builder.put(DECLARED_PROPERTY__TYPE, TYPE__STRING);
			} else if (value instanceof Component) {
				nodeModelValue = getValueFromNodeModel(value, Mwe2Package.Literals.COMPONENT__MODULE);
				if (nodeModelValue != null) {
					builder.put(DECLARED_PROPERTY__TYPE, nodeModelValue);
				} else {
					nodeModelValue = getValueFromNodeModel(value, Mwe2Package.Literals.REFERRABLE__TYPE);
					if (nodeModelValue != null)
						builder.put(DECLARED_PROPERTY__TYPE, nodeModelValue);
				}
			} else if (value instanceof Reference) {
				nodeModelValue = getValueFromNodeModel(value, Mwe2Package.Literals.ABSTRACT_REFERENCE__REFERABLE);
				if (nodeModelValue != null) {
					builder.put(DECLARED_PROPERTY__TYPE, nodeModelValue);
				}
			}
		}
		ImmutableMap<String, String> userData = builder.build();
		return EObjectDescription.create(qualifiedName, property, userData);
	}

	protected String getValueFromNodeModel(EObject object, EReference feature) {
		List<AbstractNode> typeNodes = NodeUtil.findNodesForFeature(object, feature);
		if (typeNodes.isEmpty()) {
			return null;
		}
		if (typeNodes.size() != 1)
			throw new IllegalStateException("Unexpected multiple values for feature '" + feature + "' in object '" + object + "'.");
		List<LeafNode> leafNodes = typeNodes.get(0).getLeafNodes();
		StringBuilder result = new StringBuilder();
		for(LeafNode leafNode: leafNodes) {
			if(!leafNode.isHidden()) {
				result.append(leafNode.getText());
			}
		}
		return result.toString();
	}
}