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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.mwe.core.customizer.CustomizationException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.ast.AbstractASTBase;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.InclusionAST;
import org.eclipse.emf.mwe.internal.core.ast.ReferenceAST;
import org.eclipse.emf.mwe.internal.core.ast.SimpleParamAST;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.Converter;

public class VisitorAnalyzer extends VisitorBase {

	private VisitorAnalyzer cloneWithCurrentClass(final Class<?> c) {
		final VisitorAnalyzer ana = new VisitorAnalyzer(issues, converter, c);
		return ana;
	}

	private Map<Class<?>, Converter<?>> converter = new HashMap<Class<?>, Converter<?>>(); // <Class,
																						// Converter>

	private Class<?> currentComponentClass = null;

	private Issues issues = new IssuesImpl();

	public VisitorAnalyzer(final Issues issues, final Map<Class<?>, Converter<?>> converter,
			final Class<?> currentComponentClass) {
		if (currentComponentClass == null)
			throw new NullPointerException("currentComponentClass");
		this.issues = issues;
		this.converter = converter;
		this.currentComponentClass = currentComponentClass;
	}

	@Override
	public Object visitComponentAST(final ComponentAST componentAST) {
		final String elementName = componentAST.getName();
		Class<?> expected = null;
		try {
			expected = getTypeForProperty(elementName);
		}
		catch (final CustomizationException ex) {
			issues.addError(ex.getMessage(), componentAST);
			return null;
		}
		if (expected == null) {
			issues.addError("No getter or adder method for property '" + elementName + "' in clazz '"
					+ currentComponentClass.getName() + "' found. Forgot to customize?", componentAST);
		}
		else {
			if (componentAST.getClazz() != null) {
				final Class<?> actual = loader.loadClass(componentAST.getClazz());
				if (actual == null) {
					issues.addError("Class not found: '" + componentAST.getClazz() + "'", componentAST);
				}
				else if (!expected.isAssignableFrom(actual)) {
					issues.addError("Incompatible Classes: '" + componentAST.getClazz()
							+ "' is not a subclass of the expected class '" + expected.getName() + "'.", componentAST);
				}
				else {
					expected = actual;
				}
			}
			componentAST.setAnalyzedType(expected);
			final VisitorAnalyzer v = cloneWithCurrentClass(expected);
			for (final Iterator<?> iter = componentAST.getChildren().iterator(); iter.hasNext();) {
				((AbstractASTBase) iter.next()).accept(v);
			}
		}
		return expected;
	}

	@Override
	public Object visitReferenceAST(final ReferenceAST ele) {
		Class<?> expected = null;
		try {
			expected = getTypeForProperty(ele.getName());
		}
		catch (final CustomizationException ex) {
			issues.addError(ex.getMessage(), ele);
			return null;
		}
		if (expected == null) {
			issues.addError("No setter or adder method for property '" + ele.getName() + "' in clazz '"
					+ currentComponentClass.getName() + "' found", ele);
			return ele;
		}

		if (ele.getReference() == null) {
			issues.addError("Reference to bean with id " + ele.getIdRef() + " not resolved!", ele);
		}
		else {
			final Class<?> c = (Class<?>) ele.getReference().getAnalyzedType();
			if (c != null && !expected.isAssignableFrom(c)) {
				issues.addWarning("The type of the referred bean (" + c.getName() + ") is not assignable to "
						+ expected.getName());
			}
			return c;
		}
		return expected;
	}

	@Override
	public Object visitSimpleParamAST(final SimpleParamAST ele) {
		Class<?> expected = null;
		try {
			expected = getTypeForProperty(ele.getName());
		}
		catch (final CustomizationException ex) {
			issues.addError(ex.getMessage(), ele);
			return null;
		}
		if (expected == null) {
			issues.addError("No getter or adder method for property '" + ele.getName() + "' in clazz '"
					+ getCurrClassName() + "' found.", ele);
		}
		else if (!converter.containsKey(expected)) {
			issues.addError("Cannot convert from String to '" + expected.getName()
					+ "'. You need to register a corresponding Converter.", ele);
		}
		return expected;
	}

	private String getCurrClassName() {
		return currentComponentClass != null ? currentComponentClass.getName() : "unknown";
	}

	private Class<?> getTypeForProperty(final String name) {
		if (currentComponentClass != null) {
			final Injector inj = InjectorFactory.getInjector(currentComponentClass, name);
			if (inj != null)
				return inj.getRequiredType();
		}
		return null;
	}

	@Override
	public Object visitInclusionAST(final InclusionAST ele) {
		if (ele.getImportedElement() != null)
			return ele.getImportedElement().accept(cloneWithCurrentClass(WorkflowContainer.class));
		else {
			issues.addError("Cartridge " + ele.getFile() + " not resolved!", ele);
		}
		return Object.class;
	}

}
