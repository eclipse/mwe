package org.eclipse.emf.mwe2.language.ui.highlighting;

import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
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

		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource.getParseResult().getRootNode());
		for (AbstractNode abstractNode : allNodes) {
			if (abstractNode.getGrammarElement() == grammarAccess.getPropertyReferenceAccess()
					.getReferableDeclaredPropertyCrossReference_1_0()) {
				highlightNode(abstractNode, MweHighlightingConfiguration.PROPERTY_REF, acceptor);
				highlightNode(abstractNode, MweHighlightingConfiguration.STRING_PROP_REF, acceptor);
				for(AbstractNode sibling: abstractNode.getParent().getChildren()) {
					if (sibling != abstractNode) {
						if (sibling.getGrammarElement() == grammarAccess.getML_COMMENTRule() || sibling.getGrammarElement() == grammarAccess.getSL_COMMENTRule()) {
							highlightNode(sibling, DefaultHighlightingConfiguration.COMMENT_ID, acceptor);
						}
					}
				}
				if (abstractNode instanceof CompositeNode) {
					for(AbstractNode child: ((CompositeNode) abstractNode).getChildren()) {
						if (child.getGrammarElement() == grammarAccess.getML_COMMENTRule() || child.getGrammarElement() == grammarAccess.getSL_COMMENTRule()) {
							highlightNode(child, DefaultHighlightingConfiguration.COMMENT_ID, acceptor);
						}
					}
				}
			} else if (abstractNode.getGrammarElement() == grammarAccess.getPropertyReferenceAccess().getDollarSignLeftCurlyBracketKeyword_0()
					|| abstractNode.getGrammarElement() == grammarAccess.getPropertyReferenceAccess().getRightCurlyBracketKeyword_2()) {
				highlightNode(abstractNode, MweHighlightingConfiguration.STRING_PROP_REF, acceptor);
			} else if (abstractNode.getGrammarElement() == grammarAccess.getReferenceAccess()
					.getReferableReferrableCrossReference_0()) {
				highlightNode(abstractNode, MweHighlightingConfiguration.PROPERTY_REF, acceptor);
			} else if (abstractNode.getGrammarElement() == grammarAccess.getAssignmentAccess()
					.getFeatureJvmFeatureCrossReference_0_0()) {
				highlightNode(abstractNode, MweHighlightingConfiguration.FEATURE_REF, acceptor);
			}
		}
	}

	private void highlightNode(AbstractNode node, String id, IHighlightedPositionAcceptor acceptor) {
		if (node == null)
			return;
		if (node instanceof LeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (LeafNode leaf : node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}

}
