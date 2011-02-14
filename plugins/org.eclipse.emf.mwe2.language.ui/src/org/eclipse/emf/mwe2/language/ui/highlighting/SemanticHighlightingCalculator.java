/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.highlighting;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Inject
	private Mwe2GrammarAccess grammarAccess;

	public void provideHighlightingFor(final XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null)
			return;

		Iterator<INode> iter = resource.getParseResult().getRootNode().getAsTreeIterable().iterator();
		while(iter.hasNext()) {
			INode node = iter.next();
			EObject grammarElement = node.getGrammarElement();
			if (grammarElement == grammarAccess.getPropertyReferenceImplAccess()
					.getReferableDeclaredPropertyCrossReference_0()) {
				highlightNode(node, MweHighlightingConfiguration.PROPERTY_REF, acceptor);
				highlightNode(node, MweHighlightingConfiguration.STRING_PROP_REF, acceptor);
				for(INode sibling: node.getParent().getChildren()) {
					if (sibling != node) {
						if (sibling.getGrammarElement() == grammarAccess.getML_COMMENTRule() || sibling.getGrammarElement() == grammarAccess.getSL_COMMENTRule()) {
							highlightNode(sibling, DefaultHighlightingConfiguration.COMMENT_ID, acceptor);
						}
					}
				}
				if (node instanceof ICompositeNode) {
					for(INode child: ((ICompositeNode) node).getChildren()) {
						if (child.getGrammarElement() == grammarAccess.getML_COMMENTRule() || child.getGrammarElement() == grammarAccess.getSL_COMMENTRule()) {
							highlightNode(child, DefaultHighlightingConfiguration.COMMENT_ID, acceptor);
						}
					}
				}
			} else if (grammarElement == grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0()
					|| grammarElement == grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2()) {
				highlightNode(node, MweHighlightingConfiguration.STRING_PROP_REF, acceptor);
			} else if (grammarElement == grammarAccess.getReferenceAccess()
					.getReferableReferrableCrossReference_0()) {
				highlightNode(node, MweHighlightingConfiguration.PROPERTY_REF, acceptor);
			} else if (grammarElement == grammarAccess.getAssignmentAccess()
					.getFeatureJvmIdentifiableElementCrossReference_0_0()) {
				highlightNode(node, MweHighlightingConfiguration.FEATURE_REF, acceptor);
				Assignment semanticObject = (Assignment) node.getSemanticElement();
				if (semanticObject.getFeature() instanceof JvmOperation) {
					JvmOperation operation = (JvmOperation) semanticObject.getFeature();
					if (isDeprecated(operation)) {
						highlightNode(node, MweHighlightingConfiguration.DEPRECATED_ELEMENT, acceptor);
					}
				}
			} else if (grammarElement == grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()
					|| grammarElement == grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()) {
				Component component = (Component) node.getSemanticElement();
				if (component.getType() instanceof JvmAnnotationTarget && isDeprecated((JvmAnnotationTarget) component.getType())) {
					highlightNode(node, MweHighlightingConfiguration.DEPRECATED_ELEMENT, acceptor);
				}
			}
		}
	}

	public boolean isDeprecated(JvmAnnotationTarget annotatable) {
		if (annotatable == null)
			return false;
		List<JvmAnnotationReference> annotations = annotatable.getAnnotations();
		for(JvmAnnotationReference annotation: annotations) {
			if (Deprecated.class.getName().equals(annotation.getAnnotation().getIdentifier())) {
				return true;
			}
		}
		if (annotatable instanceof JvmMember) {
			return isDeprecated(((JvmMember) annotatable).getDeclaringType());
		}
		return false;
	}

	private void highlightNode(INode node, String id, IHighlightedPositionAcceptor acceptor) {
		if (node == null)
			return;
		if (node instanceof ILeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (ILeafNode leaf: node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}

}
