/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.SimpleValue;
import org.eclipse.emf.mwe.Value;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.ui.analyze.MweDiagnostic;
import org.eclipse.emf.mwe.di.ui.utils.TypeUtils;
import org.eclipse.emf.mwe.util.MweSwitch;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class AssignmentAnalyzer extends MweSwitch<Object> {

	protected static final String FALSE_VALUE = "false";
	protected static final String TRUE_VALUE = "true";

	private final InternalAnalyzer mainAnalyzer;
	private final IProject project;
	private final DiagnosticChain diagnostics;
	private final ComplexValue analyzedObject;
	private final IType type;

	public AssignmentAnalyzer(final InternalAnalyzer mainAnalyzer, final IProject project,
			final DiagnosticChain diagnostics, final ComplexValue analyzedObject, final IType type) {
		if (mainAnalyzer == null || project == null || diagnostics == null || analyzedObject == null || type == null)
			throw new IllegalArgumentException();

		this.mainAnalyzer = mainAnalyzer;
		this.project = project;
		this.diagnostics = diagnostics;
		this.analyzedObject = analyzedObject;
		this.type = type;
	}

	public Object validate(final Assignment object) {
		return doSwitch(object);
	}

	/**
	 * @see org.eclipse.emf.mwe.util.MweSwitch#caseAssignment(org.eclipse.emf.mwe.Assignment)
	 */
	@Override
	public Object caseAssignment(final Assignment object) {
		final Value value = object.getValue();
		if (value instanceof SimpleValue)
			return processSimpleValue(object, (SimpleValue) value);
		else if (value instanceof ComplexValue)
			return processComplexValue(object, (ComplexValue) value);

		return false;
	}

	private Object processComplexValue(final Assignment object, final ComplexValue value) {
		if (object == null || value == null) {
			throw new IllegalArgumentException();
		}

		final String featureName = object.getFeature();
		final String argType = MweUtil.toString(value.getClassName());
		final IMethod method = TypeUtils.getSetter(project, type, featureName, argType);
		if (method == null) {
			diagnostics.add(createNoSetterError(object));
		}
		for (final Assignment ass : value.getAssignments()) {
			mainAnalyzer.validate(ass);
		}
		return true;
	}

	private Object processSimpleValue(final Assignment object, final SimpleValue value) {
		final String featureName = object.getFeature();
		final String argType = getSimpleValueType(value);
		final IMethod method = TypeUtils.getSetter(project, type, featureName, argType);
		if (method == null) {
			diagnostics.add(createNoSetterError(object));
			return false;
		}
		return true;
	}

	private Diagnostic createNoSetterError(final Assignment object) {
		if (object == null)
			return null;

		final String featureName = object.getFeature();
		final String objectName = MweUtil.toString(analyzedObject.getClassName());
		return MweDiagnostic.error("No setter for '" + featureName + "' in object '" + objectName + "'",
				analyzedObject, null);
	}

	private String getSimpleValueType(final SimpleValue value) {
		if (value == null)
			return null;

		String type = null;
		if (isBooleanValue(value)) {
			type = "boolean";
		}
		else {
			type = "java.lang.String";
		}
		return type;
	}

	private boolean isBooleanValue(final SimpleValue value) {
		if (value == null)
			return false;

		final String valueString = value.getValue();
		return valueString.equalsIgnoreCase(TRUE_VALUE) ^ valueString.equalsIgnoreCase(FALSE_VALUE);
	}
}
