package org.eclipse.emf.mwe2.language.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class MweHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String PROPERTY_REF = "property_ref";
	public static final String FEATURE_REF = "feature_ref";
	public static final String STRING_PROP_REF = "string_prop_ref";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(PROPERTY_REF, "Variable reference", propertyReferenceTextStyle());
		acceptor.acceptDefaultHighlighting(FEATURE_REF, "Feature reference", featureReferenceTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_PROP_REF, "String property reference", textPropertyRefStyle());
	}

	public TextStyle propertyReferenceTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle textPropertyRefStyle() {
		TextStyle textStyle = stringTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle featureReferenceTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0,0,192));
		return textStyle;
	}
}
