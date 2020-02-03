/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.PropertyReference;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.StringPart;
import org.eclipse.emf.mwe2.language.mwe2.Value;
import org.eclipse.emf.mwe2.language.mwe2.util.Mwe2Switch;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

/**
 * @author Christoph Kulla - Initial contribution and API
 */
public class Mwe2EObjectHoverProvider extends DefaultEObjectHoverProvider {
	
	@Override
	protected String getFirstLine(EObject o) {
		String result = super.getFirstLine(o);
		if (o instanceof DeclaredProperty) {
			Value defaultValue = ((DeclaredProperty) o).getDefault();
			if (defaultValue != null) {
				return result + " = " + getPropertyValue(defaultValue);
			}
		}
		return result;
	}
	
	protected String getPropertyValue (Value value) {
		return new Mwe2Switch<String>() {

			@Override
			public String caseStringLiteral(StringLiteral value) {
				String result = "";
				result += value.getBegin();
				for (StringPart p : value.getParts()) {
					if (p instanceof PlainString) {
						result += ((PlainString) p).getValue();
					} else {
						if (p instanceof PropertyReference) {
							result += "${" + getElementLinks().createLink(((PropertyReference) p).getReferable()) + "}";
						}
					}
				}
				result += value.getEnd();
				return result;
			}
			
			
			@Override
			public String caseComponent(Component object) {
				if (object.getType()!=null)
					return object.getType().getQualifiedName('.');
				else
					return "";
			}

			@Override
			public String caseReference(Reference object) {
				return getElementLinks().createLink(object.getReferable());
			}

			@Override
			public String caseBooleanLiteral(BooleanLiteral object) {
				return String.valueOf(object.isIsTrue());
			}			
			
		}.doSwitch(value); 
	}
	
}
