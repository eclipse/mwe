/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class Mwe2LabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public Mwe2LabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	public String image(Component component) {
		return "class_obj.gif";
	}
	
	public String image(Module module) {
		return "package_obj.gif";
	}
	
	public String image(Import imp) {
		return "imp_obj.gif";
	}
	
	public String image(StringLiteral literal) {
		return "methpro_obj.gif";
	}
	
	public String image(BooleanLiteral literal) {
		return "methdef_obj.gif";
	}
	
	public String image(Reference reference) {
		return "occ_match.gif"; 
	}
	
	public String image(Assignment ass) {
		return "methpub_obj.gif";
	}
	
	public String image(JvmOperation feature) {
		return "methpub_obj.gif";
	}
	
	public String image(JvmType feature) {
		return "class_obj.gif";
	}
	
	public String image(DeclaredProperty property) {
		return "field_protected_obj.gif";
	}
	
	public String text(Component component) {
		if (component.getName() != null)
			return component.getName();
		if (component.getModule() != null)
			return component.getModule().getCanonicalName();
		JvmType type = component.getActualType();
		if (type != null) {
			if (type instanceof JvmMember)
				return ((JvmMember) type).getSimpleName();
			return type.getQualifiedName('.');
		}
		return "Component";
	}

}
