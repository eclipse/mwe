package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.ui.analyze.MweDiagnostic;
import org.eclipse.emf.mwe.di.ui.utils.ModelUtils;
import org.eclipse.emf.mwe.di.ui.utils.TypeUtils;
import org.eclipse.emf.mwe.util.MweSwitch;
import org.eclipse.jdt.core.IType;

public class InternalAnalyzer extends MweSwitch<Object> {

	private DiagnosticChain diagnostics;
	private final Map<String, String> properties = new HashMap<String, String>();
	private final Map<String, IType> beans = new HashMap<String, IType>();
	private Map<Object, Object> context;

	public boolean validate(final EObject object) {
		if (diagnostics == null) {
			throw new IllegalStateException("Diagnostic chain not set");
		}

		doSwitch(object);
		return true;
	}

	public boolean validate(final EObject object, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		this.diagnostics = diagnostics;
		this.context = context;
		doSwitch(object);
		return true;
	}

	@Override
	public Object caseComplexValue(final ComplexValue object) {
		final IProject project = getProject(object);
		if (project != null) {
			final String typeName = MweUtil.toString(object.getClassName());
			final IType type = TypeUtils.findType(project, typeName);
			if (type != null) {
				if (object.getId() != null) {
					if (beans.containsKey(object.getId())) {
						diagnostics.add(MweDiagnostic.warning("overwrites existing bean with id '" + object.getId()
								+ "' of type " + beans.get(object.getId()).getElementName(), object));
					}
					else {
						beans.put(object.getId(), type);
					}
				}
				final AssignmentAnalyzer assAnalyzer = new AssignmentAnalyzer(this, project, diagnostics, object, type);
				for (final Assignment ass : object.getAssignments()) {
					assAnalyzer.validate(ass);
				}
			}
			else {
				diagnostics.add(MweDiagnostic.error("Cannot find class '" + typeName + "'", object, null));
			}
		}
		return super.caseComplexValue(object);
	}

	private IProject getProject(final EObject object) {
		return ModelUtils.getProject(object);
	}

	/**
	 * @see org.eclipse.emf.mwe.util.MweSwitch#caseFile(org.eclipse.emf.mwe.File)
	 */
	@Override
	public Object caseFile(final File object) {
		final ComplexValue value = object.getValue();
		doSwitch(value);
		return super.caseFile(object);
	}

	/**
	 * @see org.eclipse.emf.mwe.util.MweSwitch#caseAssignment(org.eclipse.emf.mwe.Assignment)
	 */
	@Override
	public Object caseAssignment(final Assignment object) {
		final IProject project = getProject(object);
		if (project != null) {
			final ComplexValue parent = (ComplexValue) object.eContainer();
			final String typeName = MweUtil.toString(parent.getClassName());
			final IType type = TypeUtils.findType(project, typeName);
			final AssignmentAnalyzer assAnalyzer = new AssignmentAnalyzer(this, project, diagnostics, parent, type);
			assAnalyzer.validate(object);
		}
		return super.caseAssignment(object);
	}

}
