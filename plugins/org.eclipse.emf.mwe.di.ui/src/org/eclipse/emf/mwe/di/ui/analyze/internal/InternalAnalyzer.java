package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.*;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.ui.utils.ModelUtils;
import org.eclipse.emf.mwe.di.ui.utils.PropertyFileReader;
import org.eclipse.emf.mwe.di.ui.utils.TypeUtils;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

public class InternalAnalyzer extends AbstractAnalyzer<Object> {

	private static final String TRUE_VALUE = "true";
	private static final String FALSE_VALUE = "false";

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
			final EObject parent = object.eContainer();
			final Value value = object.getValue();
			if (parent instanceof ComplexValue) {
				final ComplexValue p = (ComplexValue) parent;
				final String typeName = MweUtil.toString(p.getClassName());
				final IType type = javaImportRegistry.resolve(project, object, typeName);
				processValue(object, value, p, type);
			}
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
				// TODO Complete implementation
				checkReference(id, object, true);
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
			// TODO Complete implementation
			checkReference(refName, object, true);
		}
		return super.caseSimpleValue(object);
	}

	@Override
	public Object caseWorkflowRef(final WorkflowRef object) {
		final IProject project = getProject(object);
		final String filePath = object.getUri();
		final File includedFile = ModelUtils.loadModelFile(project, filePath);
		if (includedFile != null) {
			final InternalAnalyzer subAnalyzer = new InternalAnalyzer(diagnostics, context);
			subAnalyzer.validate(includedFile);
			merge(subAnalyzer);
		}
		return super.caseWorkflowRef(object);
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

	protected JavaImportRegistry getJavaImportRegistry() {
		return javaImportRegistry;
	}

	protected VariableRegistry getVariables() {
		return variables;
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

	private void checkReference(final String referenceName, final EObject context, final boolean checkForUndefined) {
		if (referenceName == null || context == null) {
			throw new IllegalArgumentException();
		}

		final List<String> unresolvedReferences = variables.getUnresolvedReferences(referenceName, checkForUndefined);
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

	private void createNoSetterError(final Assignment object, final ComplexValue parent) {
		if (object == null)
			return;

		final String featureName = object.getFeature();
		final String objectName = MweUtil.toString(parent.getClassName());
		addError("No setter for '" + featureName + "' in object '" + objectName + "'", parent, null);
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

	private void merge(final InternalAnalyzer other) {
		if (other != null) {
			variables.merge(other.getVariables());
			javaImportRegistry.merge(other.getJavaImportRegistry());
		}
	}

	private Object processComplexValue(final Assignment object, final ComplexValue value, final ComplexValue parent,
			final IType type) {
		if (object == null || value == null)
			throw new IllegalArgumentException();

		final String featureName = object.getFeature();
		final String argType = MweUtil.toString(value.getClassName());
		final IProject project = getProject(object);
		if (project == null) {
			final IMethod method = TypeUtils.getSetter(project, type, featureName, argType);
			if (method == null) {
				createNoSetterError(object, parent);
			}
			for (final Assignment ass : value.getAssignments()) {
				doSwitch(ass);
			}
		}
		return true;
	}

	private Object processSimpleValue(final Assignment object, final SimpleValue value, final ComplexValue parent,
			final IType type) {
		final String featureName = object.getFeature();
		final String argType = getSimpleValueType(value);
		final IProject project = getProject(object);
		final IMethod method = TypeUtils.getSetter(project, type, featureName, argType);
		if (method == null) {
			createNoSetterError(object, parent);
			return false;
		}
		return true;
	}

	private void processValue(final Assignment assignment, final Value value, final ComplexValue parent,
			final IType type) {
		if (value instanceof ComplexValue) {
			processComplexValue(assignment, (ComplexValue) value, parent, type);
		}
		else if (value instanceof SimpleValue) {
			processSimpleValue(assignment, (SimpleValue) value, parent, type);
		}
	}
}
