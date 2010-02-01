package org.eclipse.emf.mwe.concept.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class MweHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String PROPERTY_REF = null;

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(PROPERTY_REF, "Property reference", propertyReferenceTextStyle());
	}

	public TextStyle propertyReferenceTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
