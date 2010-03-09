/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.outline;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import com.google.inject.Inject;

/**
 * customization of the default outline structure
 * 
 */
public class Mwe2Transformer extends AbstractDeclarativeSemanticModelTransformer {
	
	@Inject
	private IImageHelper imageHelper;
	
	@Inject
	private ILabelProvider labelProvider;
	
	public ContentOutlineNode createNode(Module module, ContentOutlineNode outlineParentNode) {
		ContentOutlineNode result = super.createNode(module, outlineParentNode);
		ContentOutlineNode imports = new ContentOutlineNode("import declarations");
		imports.setImage(imageHelper.getImage("impc_obj.gif"));
		result.getChildren().add(imports);
		for(Import imp: module.getImports())
			transformSemanticNode(imp, imports);
		ContentOutlineNode properties = new ContentOutlineNode("property declarations");
		properties.setImage(imageHelper.getImage("settings_obj.gif"));
		result.getChildren().add(properties);
		for(DeclaredProperty prop: module.getDeclaredProperties())
			transformSemanticNode(prop, properties);
		return result;
	}
	
	public ContentOutlineNode createNode(Assignment ass, ContentOutlineNode outlineParentNode) {
		ContentOutlineNode result = super.createNode(ass, outlineParentNode);
		if (ass.getValue() != null)
			result.setImage(labelProvider.getImage(ass.getValue()));
		return result;
	}
	
	public ContentOutlineNode createNode(DeclaredProperty prop, ContentOutlineNode outlineParentNode) {
		ContentOutlineNode result = super.createNode(prop, outlineParentNode);
		if (prop.getDefault() != null)
			result.setImage(labelProvider.getImage(prop.getDefault()));
		return result;
	}
	
	public List<EObject> getChildren(Module module) {
		return Collections.<EObject>singletonList(module.getRoot());
	}

	public boolean consumeNode(Reference reference) {
		return false;
	}

	public List<EObject> getChildren(Reference reference) {
		return NO_CHILDREN;
	}
	
	public boolean consumeNode(StringLiteral literal) {
		return false;
	}
	
	public List<EObject> getChildren(StringLiteral literal) {
		return NO_CHILDREN;
	}

	public boolean consumeNode(BooleanLiteral literal) {
		return false;
	}
	
	public List<EObject> getChildren(BooleanLiteral literal) {
		return NO_CHILDREN;
	}
	
	public boolean consumeNode(Component comp) {
		return comp.eContainer() instanceof Module;
	}
	
	public List<EObject> getChildren(DeclaredProperty object) {
		if (object.getDefault() instanceof Component)
			return Collections.<EObject>singletonList(object.getDefault());
		return NO_CHILDREN;
	}
	
	public List<EObject> getChildren(Assignment object) {
		if (object.getValue() instanceof Component)
			return Collections.<EObject>singletonList(object.getValue());
		return NO_CHILDREN;
	}

}
