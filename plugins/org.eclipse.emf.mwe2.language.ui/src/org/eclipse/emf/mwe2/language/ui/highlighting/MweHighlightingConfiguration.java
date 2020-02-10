/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.highlighting;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class MweHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String PROPERTY_REF = "property_ref";
	public static final String FEATURE_REF = "feature_ref";
	public static final String STRING_PROP_REF = "string_prop_ref";
	public static final String DEPRECATED_ELEMENT = "deprecated_element";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(PROPERTY_REF, "Variable reference", propertyReferenceTextStyle());
		acceptor.acceptDefaultHighlighting(FEATURE_REF, "Feature reference", featureReferenceTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_PROP_REF, "String property reference", textPropertyRefStyle());
		acceptor.acceptDefaultHighlighting(DEPRECATED_ELEMENT, "Deprecated element", textDeprecatedStyle());
	}

	public TextStyle propertyReferenceTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle textPropertyRefStyle() {
		TextStyle textStyle = stringTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(227,55,34));
		return textStyle;
	}
	
	public TextStyle featureReferenceTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0,0,192));
		return textStyle;
	}
	
	public TextStyle textDeprecatedStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(TextAttribute.STRIKETHROUGH);
		return textStyle;
	}
}
