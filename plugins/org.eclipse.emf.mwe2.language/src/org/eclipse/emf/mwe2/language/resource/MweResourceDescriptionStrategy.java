/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.resource;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Value;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class MweResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	public static final String DECLARED_PROPERTY__MANDATORY = "mandatory";
	public static final String MANDATORY_TRUE = "true";
	
	public static final String DECLARED_PROPERTY__TYPE = "type";
	public static final String TYPE__BOOLEAN = "boolean";
	public static final String TYPE__STRING = "String";
	
	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if(eObject instanceof Module) {
			super.createEObjectDescriptions(eObject, acceptor);
			return true;
		}
		if(eObject instanceof DeclaredProperty) {
			acceptor.accept(createIEObjectDescription((DeclaredProperty)eObject));
		}
		return false;
	}
	
	protected IEObjectDescription createIEObjectDescription(DeclaredProperty property) {
		QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(property);
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
		List<INode> typeNodes = NodeModelUtils.findNodesForFeature(object, feature);
		if (typeNodes.isEmpty()) {
			return null;
		}
		if (typeNodes.size() != 1)
			throw new IllegalStateException("Unexpected multiple values for feature '" + feature + "' in object '" + object + "'.");
		List<ILeafNode> leafNodes = Lists.newArrayList(typeNodes.get(0).getLeafNodes());
		StringBuilder result = new StringBuilder();
		for(ILeafNode leafNode: leafNodes) {
			if(!leafNode.isHidden()) {
				result.append(leafNode.getText());
			}
		}
		return result.toString();
	}

}
