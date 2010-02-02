package org.eclipse.emf.mwe.concept.ui.highlighting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.concept.services.MWEConceptGrammarAccess;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Inject
	private MWEConceptGrammarAccess grammarAccess;
	
	public void provideHighlightingFor(final XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null)
			return;
		
		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource.getParseResult().getRootNode());
		for (AbstractNode abstractNode : allNodes) {
			if (abstractNode.getGrammarElement() == grammarAccess.getPropertyReferenceAccess().getPropertyPropertyEntryCrossReference_0()) {
				highlightNode(abstractNode, MweHighlightingConfiguration.PROPERTY_REF, acceptor);
				EObject semanticObject = NodeUtil.getNearestSemanticObject(abstractNode);
				if (semanticObject != null) {
					highlightNode(abstractNode, DefaultHighlightingConfiguration.STRING_ID, acceptor);
				}
			}
		}
	}
	
	private void highlightNode(AbstractNode node, String id, IHighlightedPositionAcceptor acceptor) {
		if (node == null)
			return;
		if (node instanceof LeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (LeafNode leaf: node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}

	public void setGrammarAccess(MWEConceptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	public MWEConceptGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}
}
