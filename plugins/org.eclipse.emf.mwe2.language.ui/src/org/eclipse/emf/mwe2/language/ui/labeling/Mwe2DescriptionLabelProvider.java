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

import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.util.Mwe2Switch;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class Mwe2DescriptionLabelProvider extends DefaultDescriptionLabelProvider {

	private Mwe2Switch<String> imageSwitch = new Mwe2Switch<String>() {
		@Override
		public String caseComponent(Component component) {
			return "class_obj.gif";
		}
		
		@Override
		public String caseModule(Module module) {
			return "package_obj.gif";
		}
		
		@Override
		public String caseImport(Import imp) {
			return "imp_obj.gif";
		}
		
		@Override
		public String caseStringLiteral(StringLiteral literal) {
			return "methpro_obj.gif";
		}
		
		@Override
		public String caseBooleanLiteral(BooleanLiteral literal) {
			return "methdef_obj.gif";
		}
		
		@Override
		public String caseReference(Reference reference) {
			return "occ_match.gif"; 
		}
		
		@Override
		public String caseAssignment(Assignment ass) {
			return "methpub_obj.gif";
		}
		
		@Override
		public String caseDeclaredProperty(DeclaredProperty property) {
			return "field_protected_obj.gif";
		}
		
	};
	
//	@Override
//	public String text(IEObjectDescription ele) {
//	  return "my "+ele.getName();
//	}
	 
    @Override
	public String image(IEObjectDescription ele) {
      if (TypesPackage.Literals.JVM_OPERATION.isSuperTypeOf(ele.getEClass()))
    	  return "methpub_obj.gif";
      if (TypesPackage.Literals.JVM_TYPE.isSuperTypeOf(ele.getEClass()))
    	  return "class_obj.gif";
      return imageSwitch.doSwitch(ele.getEObjectOrProxy());
    }	 

}
