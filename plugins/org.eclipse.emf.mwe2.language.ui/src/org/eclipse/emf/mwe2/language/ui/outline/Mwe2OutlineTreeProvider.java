/*******************************************************************************
 * Copyright (c) 2010, 2011 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.outline;

import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;

import com.google.inject.Inject;

/**
 * customization of the default outline structure
 * 
 * @author Jan Koehnlein
 */
public class Mwe2OutlineTreeProvider extends DefaultOutlineTreeProvider {

	private static final String COMPONENT_TYPE_SEPARATOR = " : ";

	@Inject
	private StylerFactory stylerFactory;

	@Inject
	private IImageHelper imageHelper;

	protected void _createChildren(DocumentRootNode parentNode, Module module) {
		createEStructuralFeatureNode(parentNode, module, Mwe2Package.Literals.MODULE__IMPORTS,
				imageHelper.getImage("impc_obj.gif"), "import declarations", false);
		createEStructuralFeatureNode(parentNode, module, Mwe2Package.Literals.MODULE__DECLARED_PROPERTIES,
				imageHelper.getImage("settings_obj.gif"), "declared properties", false);
		if (module.getRoot() != null)
			createNode(parentNode, module.getRoot());
	}

	protected boolean _isLeaf(Assignment assignment) {
		return !(assignment.getValue() instanceof Component);
	}

	protected boolean _isLeaf(DeclaredProperty property) {
		return !(property.getDefault() instanceof Component);
	}

	protected Image _image(DeclaredProperty prop) {
		return labelProvider.getImage(prop.getDefault());
	}

	protected Object _text(Assignment assignment) {
		StyledString styledText = (StyledString) super._text(assignment);
		if (assignment.getFeature() instanceof JvmOperation) {
			return appendSimpleName(styledText, ((JvmOperation)assignment.getFeature()).getParameters().get(0));
		}
		return styledText;
	}

	protected Object _text(Component component) {
		StyledString styledText = (StyledString) super._text(component);
		if (component.getType() != null) {
			return appendSimpleName(styledText, component.getType());
		}
		return styledText;
	}

	protected StyledString appendSimpleName(StyledString styledText, JvmIdentifiableElement element) {
		String typeName = element.getSimpleName();
		return styledText.append(new StyledString(COMPONENT_TYPE_SEPARATOR + typeName, stylerFactory
				.createXtextStyleAdapterStyler(getTypeTextStyle())));
	}
	
	protected TextStyle getTypeTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(149, 125, 71));
		return textStyle;
	}

}
