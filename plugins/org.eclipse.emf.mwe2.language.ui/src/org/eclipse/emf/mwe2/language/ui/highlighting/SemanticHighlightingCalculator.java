/*******************************************************************************
 * Copyright (c) 2008, 2019 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.highlighting;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.util.DeprecationUtil;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Inject
	private Mwe2GrammarAccess grammarAccess;

	@Inject
	protected OperationCanceledManager operationCanceledManager;

	@Override
	public void provideHighlightingFor(final XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		if (resource == null)
			return;

		Iterator<INode> iter = resource.getParseResult().getRootNode().getAsTreeIterable().iterator();
		while(iter.hasNext()) {
			operationCanceledManager.checkCanceled(cancelIndicator);
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
					if (DeprecationUtil.isDeprecated(operation)) {
						highlightNode(node, MweHighlightingConfiguration.DEPRECATED_ELEMENT, acceptor);
					}
				}
			} else if (grammarElement == grammarAccess.getComponentAccess().getTypeJvmTypeCrossReference_1_0_0()
					|| grammarElement == grammarAccess.getRootComponentAccess().getTypeJvmTypeCrossReference_1_0_0()) {
				Component component = (Component) node.getSemanticElement();
				if (component.getType() instanceof JvmAnnotationTarget && DeprecationUtil.isDeprecated((JvmAnnotationTarget) component.getType())) {
					highlightNode(node, MweHighlightingConfiguration.DEPRECATED_ELEMENT, acceptor);
				}
			}
		}
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
