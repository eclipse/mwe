/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di;

import java.util.Set;

import org.eclipse.xtext.service.AbstractServiceRegistrationFactory;

/**
 * GENERATED! Manual modification goes to MWEUiConfig
 */
public class GenMWEUiConfig extends AbstractServiceRegistrationFactory {

	public Set<IServiceRegistration> registrations() {
		return scope(org.eclipse.emf.mwe.di.IMWE.SCOPE)
			.with(org.eclipse.xtext.ui.common.editor.codecompletion.IProposalProvider.class, org.eclipse.emf.mwe.di.MWEGenProposalProvider.class)
			.with(org.eclipse.jface.text.contentassist.IContentAssistant.class, org.eclipse.jface.text.contentassist.ContentAssistant.class)
			.with(org.eclipse.jface.text.contentassist.IContentAssistProcessor.class, org.eclipse.xtext.ui.common.editor.codecompletion.DefaultContentAssistProcessor.class)
			.with(org.eclipse.xtext.ui.common.editor.codecompletion.ILinkingCandidatesService.class, org.eclipse.xtext.ui.common.editor.codecompletion.impl.DefaultLinkingCandidatesService.class)
			.registrations();
	}

}
