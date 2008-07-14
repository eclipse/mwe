package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.*;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.ui.utils.PropertyFileReader;
import org.eclipse.emf.mwe.di.ui.utils.TypeUtils;
import org.eclipse.jdt.core.IType;

public class InternalAnalyzer extends AbstractAnalyzer<Object> {

	private final VariableRegistry variables = new VariableRegistry();
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
			final Value value = object.getValue();
			doSwitch(value);

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
				final String id = object.getId();
				if (id != null) {
					if (variables.isBean(id)) {
						final IType beanType = variables.getType(id);
						addWarning(
								"overwrites existing bean with id '" + id + "' of type " + beanType.getElementName(),
								object);
					}
					else {
						addVariable(id, object, type);
					}
				}

				for (final Assignment ass : object.getAssignments()) {
					doSwitch(ass);
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
			doSwitch(imp);
		}

		for (final Property p : object.getProperties()) {
			doSwitch(p);
		}

		final ComplexValue value = object.getValue();
		doSwitch(value);
		return super.caseFile(object);
	}

	@Override
	public Object caseIdRef(final IdRef object) {
		if (object != null) {
			final String id = object.getId();
			if (id != null) {
				checkReference(id, object);
			}
		}
		return super.caseIdRef(object);
	}

	@Override
	public Object caseJavaImport(final JavaImport object) {
		javaImportRegistry.addImport(object);
		return super.caseJavaImport(object);
	}

	@Override
	public Object caseLocalVariable(final LocalVariable object) {
		addVariable(object);
		final Value value = object.getValue();
		doSwitch(value);
		return super.caseLocalVariable(object);
	}

	@Override
	public Object casePropertiesFileImport(final PropertiesFileImport object) {
		final IProject project = getProject(object);
		final String filePath = object.getFile();
		final String content = TypeUtils.getFileContent(project, filePath);
		if (content != null) {
			final Map<String, String> map = PropertyFileReader.parse(content);
			convertMap(map);
		}
		else {
			addError("Cannot find file '" + filePath + "'", object, null);
		}
		return super.casePropertiesFileImport(object);
	}

	@Override
	public Object caseSimpleValue(final SimpleValue object) {
		final String value = object.getValue();
		if (VariableRegistry.isReference(value)) {
			final String refName = VariableRegistry.referenceName(value);
			checkReference(refName, object);
		}
		return super.caseSimpleValue(object);
	}

	@Override
	public Object validate(final EObject object) {
		variables.setContext(object);
		try {
			return doSwitch(object);
		}
		catch (final AmbiguousTypeException e) {
			addError(e.getMessage(), e.getContext(), null);
		}
		return null;
	}

	private void addVariable(final LocalVariable variable) {
		if (variable == null)
			throw new IllegalArgumentException();

		variables.addVariable(variable);
	}

	private void addVariable(final String name, final Value value) {
		if (name == null || value == null)
			throw new IllegalArgumentException();

		final MweFactory factory = MweFactory.eINSTANCE;
		final LocalVariable var = factory.createLocalVariable();
		var.setName(name);
		var.setValue(value);
		addVariable(var);
	}

	private void addVariable(final String name, final Value value, final IType type) {
		if (type == null)
			throw new IllegalArgumentException();

		addVariable(name, value);
		variables.setType(name, type);
	}

	private void checkReference(final String referenceName, final EObject context) {
		if (referenceName == null || context == null) {
			throw new IllegalArgumentException();
		}

		final List<String> unresolvedReferences = variables.getUnresolvedReferences(referenceName);
		for (final String ref : unresolvedReferences) {
			addError("Cannot resolve reference ${" + ref + "}", context, null);
		}
	}

	private void convertMap(final Map<String, String> map) {
		if (map == null)
			return;

		for (final String key : map.keySet()) {
			final String value = map.get(key);
			final MweFactory factory = MweFactory.eINSTANCE;
			final LocalVariable var = factory.createLocalVariable();
			var.setName(key);
			final SimpleValue val = factory.createSimpleValue();
			val.setValue(value);
			var.setValue(val);
			addVariable(var);
		}
	}
}
