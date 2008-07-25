package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.IdRef;
import org.eclipse.emf.mwe.LocalVariable;
import org.eclipse.emf.mwe.MweFactory;
import org.eclipse.emf.mwe.PropertiesFileImport;
import org.eclipse.emf.mwe.Property;
import org.eclipse.emf.mwe.QualifiedName;
import org.eclipse.emf.mwe.SimpleValue;
import org.eclipse.emf.mwe.Value;
import org.eclipse.emf.mwe.WorkflowRef;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.types.StaticType;
import org.eclipse.emf.mwe.di.ui.extensibility.StaticTypeSystemRegistry;
import org.eclipse.emf.mwe.di.ui.util.PropertyFileReader;
import org.eclipse.emf.mwe.di.util.ModelUtils;

public class InternalAnalyzer extends AbstractAnalyzer<Object> {

	private final VariableRegistry variables = new VariableRegistry();
	private final Set<String> references = new HashSet<String>();
	private final InternalAnalyzer parentAnalyzer;
	private File analyzedFile;

	public InternalAnalyzer(final InternalAnalyzer parentAnalyzer, final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		super(diagnostics, context);
		this.parentAnalyzer = parentAnalyzer;
	}

	/**
	 * @see org.eclipse.emf.mwe.util.MweSwitch#caseAssignment(org.eclipse.emf.mwe.Assignment)
	 */
	@Override
	public Object caseAssignment(final Assignment object) {
		final StaticTypeSystemRegistry registry = StaticTypeSystemRegistry.getInstance();
		final EObject parent = object.eContainer();
		final Value value = object.getValue();
		if (value != null && parent instanceof ComplexValue) {
			final ComplexValue p = (ComplexValue) parent;
			final String typeName = MweUtil.toString(p.getClassName());
			final StaticType type = registry.staticTypeForName(typeName, analyzedFile);
			if (isTopAnalyzer()) {
				analyzeReferences(object, value, p, type);
			}
		}
		doSwitch(value);
		return super.caseAssignment(object);
	}

	@Override
	public Object caseComplexValue(final ComplexValue object) {
		final StaticTypeSystemRegistry registry = StaticTypeSystemRegistry.getInstance();
		final QualifiedName className = object.getClassName();
		if (className != null) {
			final String typeName = MweUtil.toString(className);
			final StaticType type = registry.staticTypeForName(typeName, analyzedFile);
			if (type != null) {
				final String id = object.getId();
				if (id != null) {
					if (variables.isBean(id)) {
						final StaticType beanType = variables.getType(id);
						addWarning("overwrites existing bean with id '" + id + "' of type " + beanType.getName(),
								object);
					}
					else {
						addVariable(id, object, type, false);
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
		analyzedFile = object;
		for (final Property p : object.getProperties()) {
			doSwitch(p);
		}

		final ComplexValue value = object.getValue();
		doSwitch(value);
		if (isTopAnalyzer()) {
			checkForUnreferencedVariables(object);
		}

		return super.caseFile(object);
	}

	@Override
	public Object caseIdRef(final IdRef object) {
		if (object != null) {
			final String id = object.getId();
			if (id != null) {
				if (isTopAnalyzer()) {
					checkReference(id, object, true);
				}
				references.add(id);
			}
		}
		return super.caseIdRef(object);
	}

	@Override
	public Object caseLocalVariable(final LocalVariable object) {
		addVariable(object, false);
		final Value value = object.getValue();
		if (value != null) {
			doSwitch(value);
		}
		return super.caseLocalVariable(object);
	}

	@Override
	public Object casePropertiesFileImport(final PropertiesFileImport object) {
		final IProject project = getProject(object);
		final String filePath = object.getFile();
		final String content = ModelUtils.getFileContent(project, filePath);
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
			references.add(refName);
			if (isTopAnalyzer()) {
				checkReference(refName, object, true);
			}
		}
		return super.caseSimpleValue(object);
	}

	@Override
	public Object caseWorkflowRef(final WorkflowRef object) {
		final IProject project = getProject(object);
		final String filePath = object.getUri();
		final File includedFile = ModelUtils.loadModelFile(project, filePath);
		if (includedFile != null) {
			final InternalAnalyzer subAnalyzer = new InternalAnalyzer(this, diagnostics, context);
			subAnalyzer.validate(includedFile);
			checkVariableMatching(subAnalyzer, object);
		}
		else {
			addError("Workflow file '" + filePath + "' could not be found", object, null);
		}

		for (final Assignment ass : object.getAssignments()) {
			doSwitch(ass);
		}
		return super.caseWorkflowRef(object);
	}

	public boolean isTopAnalyzer() {
		return parentAnalyzer == null;
	}

	@Override
	public Object validate(final EObject object) {
		variables.setContext(object);
		try {
			references.clear();
			return doSwitch(object);
		}
		catch (final DuplicateElementException e) {
			addError(e.getMessage(), e.getContext(), null);
		}
		return null;
	}

	protected Set<String> getDeclarations() {
		return variables.getDeclarations();
	}

	protected VariableRegistry getVariables() {
		return variables;
	}

	protected boolean hasReference(final String name) {
		if (name == null)
			return false;

		return references.contains(name);
	}

	protected boolean hasVariable(final String name) {
		if (name == null)
			return false;

		return variables.hasVariable(name);
	}

	private void addVariable(final LocalVariable variable, final boolean imported) {
		if (variable == null)
			throw new IllegalArgumentException();

		variables.addVariable(variable, imported);
	}

	private void addVariable(final String name, final Value value, final boolean imported) {
		if (name == null || value == null)
			throw new IllegalArgumentException();

		final MweFactory factory = MweFactory.eINSTANCE;
		final LocalVariable var = factory.createLocalVariable();
		var.setName(name);
		var.setValue(value);
		addVariable(var, imported);
	}

	private void addVariable(final String name, final Value value, final StaticType type, final boolean imported) {
		if (type == null)
			throw new IllegalArgumentException();

		addVariable(name, value, imported);
		variables.setType(name, type);
	}

	private Object analyzeReferences(final Assignment object, final Value value, final ComplexValue parent,
			final StaticType type) {
		if (object == null || value == null)
			throw new IllegalArgumentException();

		final String featureName = object.getFeature();
		final IProject project = getProject(object);
		if (project != null) {
			if (!type.hasProperty(featureName)) {
				createNoSetterError(object, parent);
			}
		}
		return true;
	}

	private void checkForUnreferencedVariables(final File modelFile) {
		if (modelFile == null)
			throw new IllegalArgumentException();

		final Set<String> variableNames = variables.getVariableNames(true);
		variableNames.removeAll(references);
		for (final String r : variableNames) {
			addWarning("Variable '" + r + "' never is referenced within the workflow", modelFile);
		}
	}

	private void checkReference(final String referenceName, final EObject context, final boolean checkForUndefined) {
		if (referenceName == null || context == null)
			throw new IllegalArgumentException();

		final List<String> unresolvedReferences = variables.getUnresolvedReferences(referenceName, checkForUndefined);
		for (final String ref : unresolvedReferences) {
			addError("Cannot resolve reference '${" + ref + "}'", context, null);
		}
	}

	private void checkVariableMatching(final InternalAnalyzer analyzer, final WorkflowRef workflowRef) {
		if (analyzer == null || workflowRef == null)
			throw new IllegalArgumentException();

		final Set<String> declarations = analyzer.getDeclarations();
		for (final Assignment ass : workflowRef.getAssignments()) {
			final String assName = ass.getFeature();
			if (!analyzer.hasVariable(assName)) {
				addError("There is no variable '" + assName + "' in workflow '" + workflowRef.getUri() + "'",
						workflowRef, null);
			}
			else {
				declarations.remove(assName);
			}
		}

		for (final String d : declarations) {
			addError("The declared variable '" + d + "in workflow '" + workflowRef.getUri() + "' has not been set",
					workflowRef, null);
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
			addVariable(var, true);
		}
	}

	private void createNoSetterError(final Assignment object, final ComplexValue parent) {
		if (object == null)
			return;

		final String featureName = object.getFeature();
		final String objectName = MweUtil.toString(parent.getClassName());
		addError("No setter '" + featureName + "' in object '" + objectName + "'", parent, null);
	}
}
