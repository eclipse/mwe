package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.ui.analyze.MweDiagnostic;
import org.eclipse.emf.mwe.util.MweSwitch;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class InternalAnalyzer extends MweSwitch<Object> {

	private DiagnosticChain diagnostics;
	private final Map<String, String> properties = new HashMap<String, String>();
	private final Map<String, IType> beans = new HashMap<String, IType>();
	private Map<Object, Object> context;
	// TODO Temporary code
	private final IProject project;

	public InternalAnalyzer() {
		project = null;
	}

	public InternalAnalyzer(final IProject project) {
		this.project = project;
	}

	public boolean validate(final EObject object, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		this.diagnostics = diagnostics;
		this.context = context;
		doSwitch(object);
		return false;
	}

	@Override
	public Object caseComplexValue(final ComplexValue object) {
		try {
			final IProject project = getProject(object);
			if (project != null) {
				final IJavaProject jp = JavaCore.create(project);
				final IType type = jp.findType(MweUtil.toString(object.getClassName()));
				if (object.getId() != null) {
					if (beans.containsKey(object.getId())) {
						diagnostics.add(MweDiagnostic.warning("overwrites existing bean with id '" + object.getId()
								+ "' of type " + beans.get(object.getId()).getElementName(), object));
					}
					else {
						beans.put(object.getId(), type);
					}
				}

				final AssignmentAnalyzer analyzer = new AssignmentAnalyzer(project, object, type);
				for (final Assignment ass : object.getAssignments()) {
					final Diagnostic diagnose = analyzer.evaluate(ass.getValue());
					if (diagnose != null) {
						diagnostics.add(diagnose);
					}
				}
			}
		}
		catch (final JavaModelException e) {
			diagnostics.add(MweDiagnostic.error(e.getMessage(), object, e));
		}
		return super.caseComplexValue(object);
	}

	// TODO Add full implementation
	private IProject getProject(final EObject object) {
		return project;
	}
}
