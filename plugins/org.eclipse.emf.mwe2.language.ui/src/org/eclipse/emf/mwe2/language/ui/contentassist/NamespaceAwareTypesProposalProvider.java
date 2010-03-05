/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.contentassist;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.scoping.NamespaceAwareScopeProvider;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.common.types.xtext.ui.JdtTypesProposalProvider;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider.ImportNormalizer;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalFactory;

import com.google.inject.Inject;

public class NamespaceAwareTypesProposalProvider extends JdtTypesProposalProvider {

	@Inject
	private NamespaceAwareScopeProvider nameSpaceAwareScopeProvider;
	
	@Override
	protected void createTypeProposal(String typeName, ICompletionProposalFactory proposalFactory, 
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (acceptor.canAcceptMoreProposals() && !"java.lang.Object".equals(typeName)) {
			int lastDot = typeName.lastIndexOf('.');
			String displayString = typeName;
			if (lastDot != -1)
				displayString = typeName.substring(lastDot + 1) + " - " + typeName.substring(0, lastDot);
			ICompletionProposal proposal = proposalFactory.createCompletionProposal(
					toShortName(context.getRootModel(), typeName), displayString, null, context);
			acceptor.accept(proposal);
		}
	}
	
	public String toShortName(EObject context, String typeName) {
		Set<ImportNormalizer> importNormalizer = nameSpaceAwareScopeProvider.getImportNormalizer(context);
		String result = typeName;
		for(ImportNormalizer normalizer: importNormalizer) {
			String candidate = normalizer.longToShortName(typeName);
			if (candidate != null && candidate.length() < result.length())
				result = candidate;
		}
		return result;
	}
	
}
