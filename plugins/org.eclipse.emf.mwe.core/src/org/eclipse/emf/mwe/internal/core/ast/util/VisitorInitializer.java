/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.internal.core.ast.AbstractASTBase;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.DeclaredPropertyAST;
import org.eclipse.emf.mwe.internal.core.ast.DeclaredPropertyFileAST;
import org.eclipse.emf.mwe.internal.core.ast.InclusionAST;
import org.eclipse.emf.mwe.internal.core.ast.ReferenceAST;
import org.eclipse.emf.mwe.internal.core.ast.SimpleParamAST;
import org.eclipse.emf.mwe.internal.core.ast.parser.WorkflowParser;

public class VisitorInitializer extends VisitorBase {

	private VisitorInitializer cloneThis() {
		final VisitorInitializer newOne = new VisitorInitializer(issues, props, beans);
		newOne.beans = beans;
		newOne.initialProps = initialProps;
		newOne.props = props;
		newOne.declaredPropertyNames = declaredPropertyNames;
		return newOne;
	}

	public VisitorInitializer(final Issues issues, final Map<String, String> initialProperties,
			final Map<String, ComponentAST> initialBeans) {
		this.issues = issues;
		initialProps = new HashMap<String, String>(initialProperties);
		props = new HashMap<String, String>();
		beans = new HashMap<String, ComponentAST>(initialBeans);
	}

	private Set<String> declaredPropertyNames = new HashSet<String>();

	private Issues issues = null;

	private Map<String, ComponentAST> beans = null;

	private Map<String, String> props = null;

	private Map<String, String> initialProps = null;

	private void traverseChildren(final ComponentAST c) {
		for (final Object name : c.getChildren()) {
			final AbstractASTBase element = (AbstractASTBase) name;
			element.accept(cloneThis());
		}
	}

	@Override
	public Object visitComponentAST(final ComponentAST comp) {

		comp.setClazz(replaceProperties(comp.getClazz(), comp));
		handleIdentifiedAST(comp);
		traverseChildren(comp);
		return comp;
	}

	private void handleIdentifiedAST(final ComponentAST comp) {
		if (comp.getId() != null) {
			comp.setId(replaceProperties(comp.getId(), comp));
			beans.put(comp.getId(), comp);
		}
	}

	@Override
	public Object visitInclusionAST(final InclusionAST comp) {
		comp.setFile(replaceProperties(comp.getFile(), comp));
		handleIdentifiedAST(comp);
		traverseChildren(comp);
		final Map<String, String> params = new HashMap<String, String>();
		final Map<String, ComponentAST> paramBeans = new HashMap<String, ComponentAST>();

		if (comp.isInheritAll()) {
			params.putAll(this.initialProps);
			params.putAll(this.props);
			paramBeans.putAll(this.beans);
		}
		for (final Object o : comp.getChildren()) {
			if (o instanceof SimpleParamAST) {
				final SimpleParamAST p = (SimpleParamAST) o;
				params.put(p.getName(), p.getValue());
			}
			else if (o instanceof ComponentAST) {
				final ComponentAST p = (ComponentAST) o;
				paramBeans.put(p.getName(), p);
			}
			else if (o instanceof ReferenceAST) {
				final ReferenceAST ref = (ReferenceAST) o;
				paramBeans.put(ref.getName(), ref.getReference());
			}
		}
		comp.setPassedBeans(paramBeans);
		comp.setPassedProperties(params);
		if (comp.getFile() != null) {
			final WorkflowParser p = new WorkflowParser();
			final InputStream in = loader.getResourceAsStream(translateFileURI(comp.getFile()));
			if (in == null) {
				issues.addError("Couldn't load workflow fragment from " + comp.getFile(), comp);
				return comp;
			}
			final AbstractASTBase ref = p.parse(in, comp.getFile(), issues);
			comp.setImportedElement(ref);
			if (ref == null) {
				issues.addError("Couldn't parse nested workflow file " + comp.getFile(), comp);
				return comp;
			}
			if (comp.getPassedProperties() == null) {
				issues.addError("Workflow not initialized! (passedProperties is null)", comp);
				return comp;
			}
			final VisitorInitializer vis = new VisitorInitializer(issues, comp.getPassedProperties(), comp
					.getPassedBeans());
			ref.accept(vis);
		}
		return comp;
	}

	private String translateFileURI(final String file) {
		String fileName = new String(file);
		if (fileName.indexOf("::") != -1) {
			fileName = fileName.replaceAll("::", "/");
		}
		if (!fileName.toLowerCase().endsWith(".mwe") && !fileName.toLowerCase().endsWith(".oaw")) {
			fileName += ".mwe";
		}
		return fileName;
	}

	@Override
	public Object visitReferenceAST(final ReferenceAST comp) {
		comp.setIdRef(replaceProperties(comp.getIdRef(), comp));
		final ComponentAST ref = beans.get(comp.getIdRef());
		if (ref == null) {
			issues.addError("Couldn't find bean with id '" + comp.getIdRef() + "'", comp);
		}
		else {
			comp.setReference(ref);
		}
		return comp;
	}

	@Override
	public Object visitSimpleParamAST(final SimpleParamAST param) {
		param.setValue(replaceProperties(param.getValue(), param));
		return param;
	}

	@Override
	public Object visitDeclaredPropertyAST(final DeclaredPropertyAST prop) {
		if (prop.getValue() != null) {
			final String n = replaceProperties(prop.getName(), prop);
			if (!initialProps.containsKey(n)) {
				props.put(n, replaceProperties(prop.getValue(), prop));
			}
			else {
				if (!declaredPropertyNames.add(n)) {
					issues.addError("Duplicate property " + n, prop);
				}
			}
		}
		return props;
	}

	@Override
	public Object visitDeclaredPropertyFileAST(final DeclaredPropertyFileAST propFile) {
		propFile.setFile(replaceProperties(propFile.getFile(), propFile));
		final Properties properties = propFile.getProperties(loader);
		if (properties == null) {
			issues.addError("Couldn't resolve properties file!", propFile);
			return new HashMap<Object, Object>();
		}
		else {
			for (final String string : propFile.getPropertyNames(loader)) {
				final String name = replaceProperties(string, propFile);
				final String val = replaceProperties((String) properties.get(name), propFile);
				if (!initialProps.containsKey(name)) {
					props.put(name, val);
				}
				else {
					if (!declaredPropertyNames.add(name)) {
						issues.addError("Duplicate property " + name, propFile);
					}
				}
			}
		}
		return props;
	}

	private static final Pattern PROPERTY_PATTERN = Pattern.compile("\\$\\{([\\w_\\.-]+)\\}");

	private static final Pattern[] PROPERTY_WARN_PATTERN = { Pattern.compile("\\$\\(([\\w_\\.-]+)\\)") };

	protected String replaceProperties(final String toResolve, final AbstractASTBase ast) {
		return replaceProperties(toResolve, true, ast);
	}

	private final Stack<String> currentProp = new Stack<String>();

	protected String replaceProperties(final String toResolve, final boolean logIssues, final AbstractASTBase ast) {
		if (toResolve == null) {
			return null;
		}
		// if (currentProp.contains(toResolve)) {
		// issues.addError("property "+toResolve+" not found!");
		// return null;
		// }
		//
		// try {
		currentProp.push(toResolve);

		// check for expressions the user probably didn't want to use
		if (logIssues) {
			for (final Pattern p : PROPERTY_WARN_PATTERN) {
				final Matcher m = p.matcher(toResolve);
				while (m.find()) {
					issues.addWarning("The expression \"" + m.group(0)
							+ "\" is not a valid property and therefore not resolved."
							+ " Properties need to be enclosed in curly brackets, like: ${myProperty}");
				}
			}
		}

		final Matcher m = PROPERTY_PATTERN.matcher(toResolve);
		final StringBuffer buff = new StringBuffer();
		int index = 0;
		while (m.find()) {
			final String varName = m.group(1);
			String propValue = propGet(varName);
			if (propValue == null) {
				if (logIssues) {
					issues.addError("property " + varName + " not specified. Dereferenced at "
							+ ast.getLocation().toString());
				}

				return null;
			}
			else {
				propValue = replaceProperties(propValue, logIssues, ast);
			}
			final int start = m.start();
			final int end = m.end();
			buff.append(toResolve.substring(index, start));
			buff.append(propValue);
			index = end;
		}
		buff.append(toResolve.substring(index));
		return buff.toString();
		// } finally {
		// currentProp.pop();
		// }

	}

	private String propGet(final String varName) {
		final String val = initialProps.get(varName);
		if (val != null) {
			return val;
		}

		return props.get(varName);
	}
}
