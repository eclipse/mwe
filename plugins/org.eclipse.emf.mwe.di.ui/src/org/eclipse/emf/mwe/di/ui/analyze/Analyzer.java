/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.ui.analyze;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.mwe.di.ui.analyze.internal.InternalAnalyzer;

public class Analyzer implements EValidator {

	public boolean validate(final EClass class1, final EObject object, final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		return validate(object,diagnostics,context);
	}

	public boolean validate(final EDataType dataType, final Object value, final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		return false;
	}

	public boolean validate(final EObject object, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		new InternalAnalyzer(null, diagnostics, context).validate(object);
		return false;
	}

}
