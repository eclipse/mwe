package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.Import;
import org.eclipse.emf.mwe.JavaImport;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.jdt.core.IType;

public class InternalAnalyzer extends AbstractAnalyzer<Object> {

	private final VariableRegistry properties = new VariableRegistry();
	private final Map<String, IType> beans = new HashMap<String, IType>();
	private final JavaImportRegistry javaImportRegistry = new JavaImportRegistry();

	public InternalAnalyzer(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		super(diagnostics, context);
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
			final IType type = javaImportRegistry.resolve(project, object, typeName);
			final AssignmentAnalyzer assAnalyzer = new AssignmentAnalyzer(this, diagnostics, parent, type, null);
			assAnalyzer.validate(object);
		}
		return super.caseAssignment(object);
	}

	@Override
	public Object caseComplexValue(final ComplexValue object) {
		final IProject project = getProject(object);
		if (project != null) {
			final String typeName = MweUtil.toString(object.getClassName());
			final IType type = javaImportRegistry.resolve(project, object, typeName);
			if (type != null) {
				if (object.getId() != null) {
					if (beans.containsKey(object.getId())) {
						addWarning("overwrites existing bean with id '" + object.getId() + "' of type "
								+ beans.get(object.getId()).getElementName(), object);
					}
					else {
						beans.put(object.getId(), type);
					}
				}
				final AssignmentAnalyzer assAnalyzer = new AssignmentAnalyzer(this, diagnostics, object, type, null);
				for (final Assignment ass : object.getAssignments()) {
					assAnalyzer.validate(ass);
				}
			}
			else {
				addError("Cannot find class '" + typeName + "'", object, null);
			}
		}
		return super.caseComplexValue(object);
	}

	/**
	 * @see org.eclipse.emf.mwe.util.MweSwitch#caseFile(org.eclipse.emf.mwe.File)
	 */
	@Override
	public Object caseFile(final File object) {
		for (final Import imp : object.getImports()) {
			if (imp instanceof JavaImport) {
				javaImportRegistry.addImport((JavaImport) imp);
			}
		}

		final ComplexValue value = object.getValue();
		doSwitch(value);
		return super.caseFile(object);
	}

	@Override
	public Object validate(final EObject object) {
		try {
			return doSwitch(object);
		}
		catch (final AmbiguousTypeException e) {
			addError(e.getMessage(), e.getContext(), null);
		}
		return null;
	}
}
