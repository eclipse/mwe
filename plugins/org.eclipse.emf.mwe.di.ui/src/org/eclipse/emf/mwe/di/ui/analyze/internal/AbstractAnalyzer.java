/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.di.ui.analyze.MweDiagnostic;
import org.eclipse.emf.mwe.di.util.ModelUtils;
import org.eclipse.emf.mwe.util.MweSwitch;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public abstract class AbstractAnalyzer<T> extends MweSwitch<T> {

	protected final DiagnosticChain diagnostics;
	protected final Map<Object, Object> context;

	public AbstractAnalyzer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		if (diagnostics == null)
			throw new IllegalArgumentException();

		this.diagnostics = diagnostics;
		this.context = context;
	}
	
	public abstract T validate(final EObject object);

	protected void addError(final String message, final EObject context, final Throwable cause) {
		if (message == null)
			throw new IllegalArgumentException();

		diagnostics.add(MweDiagnostic.error(message, context, cause));
	}

	protected void addWarning(final String message, final EObject context) {
		if (message == null)
			throw new IllegalArgumentException();

		diagnostics.add(MweDiagnostic.warning(message, context));
	}

	protected IProject getProject(final EObject object) {
		return ModelUtils.getProject(object);
	}
}
