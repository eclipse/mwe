/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.internal.core.ast.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.internal.core.ast.AbstractASTBase;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.SimpleParamAST;
import org.eclipse.emf.mwe.internal.core.ast.parser.WorkflowParser;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.BooleanConverter;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.Converter;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.IntegerConverter;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.StringArrayConverter;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.StringConverter;

/**
 * The WorkflowFactory is responsible for creating
 * {@link org.eclipse.emf.mwe.core.WorkflowComponent WorkflowComponents}
 * from a workflow configuration.
 * 
 * @author Sven Efftinge (http://www.efftinge.de)

 */
public class WorkflowFactory {

	private final ResourceLoader loader = ResourceLoaderFactory.createResourceLoader();

	@SuppressWarnings("unchecked")
	public Workflow parseInitAndCreate(final String fileName, final Map<String, String> params, final Map<Class<?>, Converter> converter, final Issues issues) {
		final InputStream in = loader.getResourceAsStream(fileName);
		if (in == null)
			throw new IllegalArgumentException("Couldn't load file " + fileName);
		return parseInitAndCreate(in, fileName, params, converter, issues);
	}

	@SuppressWarnings("unchecked")
	public Workflow parseInitAndCreate(final InputStream in, final String resourceName, final Map<String, String> params,
			final Map<Class<?>, Converter> converters, final Issues issues) {
		final AbstractASTBase wfast = parseAndInitialize(in, resourceName, issues, params);
		if (isAbstract(wfast)) {
			issues.clear();
			issues
					.addError("This workflow file is abstract and cannot be run directly. It must be called from another workflow, passing in the required parameters.");
			return null;
		}
		if (issues.hasErrors())
			return null;
		final WorkflowContainer wc = new WorkflowContainer();
		wfast.accept(new VisitorAnalyzer(issues, converters, wc.getClass()));
		if (issues.hasErrors())
			return null;
		wfast.accept(new VisitorCreator(issues, converters, wc));
		Workflow wfRoot = (Workflow) wc.getRoot();
		return wfRoot;
	}

	private boolean isAbstract(AbstractASTBase wfast) {
		if (wfast instanceof ComponentAST) {
			ComponentAST ca = (ComponentAST) wfast;
			for (Iterator<AbstractASTBase> iter = ca.getChildren().iterator(); iter.hasNext();) {
				AbstractASTBase child = iter.next();
				if (child instanceof SimpleParamAST) {
					SimpleParamAST spa = (SimpleParamAST) child;
					if (spa.getName().toLowerCase().equals("abstract") && spa.getValue().toLowerCase().equals("true")) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public AbstractASTBase parseAndInitialize(final String uri, final Issues issues, final Map<String, String> properties) {
		final InputStream in = loader.getResourceAsStream(uri);
		if (in == null) {
			issues.addError("Couldn't find resource '" + uri + "'", null);
			return null;
		}
		return parseAndInitialize(in, uri, issues, properties);
	}

	public AbstractASTBase parseAndInitialize(final InputStream in, final String resourceName, final Issues issues, final Map<String, String> properties) {
		final WorkflowParser wp = new WorkflowParser();
		final AbstractASTBase wfast = wp.parse(in, resourceName, issues);

		if (wfast != null) {
			// resolve properties
			final VisitorInitializer pr = new VisitorInitializer(issues, properties, new HashMap<String, ComponentAST>());
			wfast.accept(pr);
		}
		return wfast;
	}

	@SuppressWarnings("unchecked")
	public Set<?> parseInitAndAnalyze(final InputStream in, final String resourceName, final Issues issues, final Map<String, String> properties,
			final Map<Class<?>, Converter> converter) {
		final AbstractASTBase wf = parseAndInitialize(in, resourceName, issues, properties);
		final Map<Class<?>, Converter> conv = WorkflowFactory.getDefaultConverter();
		conv.putAll(converter);
		final VisitorAnalyzer visitor = new VisitorAnalyzer(issues, conv, WorkflowContainer.class);
		return (Set<?>) wf.accept(visitor);
	}

	@SuppressWarnings("unchecked")
	public static Map<Class<?>, Converter> getDefaultConverter() {
		final Map<Class<?>, Converter> m = new HashMap<Class<?>, Converter>();
		m.put(Object.class, new StringConverter());
		m.put(String.class, new StringConverter());
		m.put(Boolean.class, new BooleanConverter());
		m.put(Boolean.TYPE, new BooleanConverter());
		m.put(Integer.class, new IntegerConverter());
		m.put(Integer.TYPE, new IntegerConverter());
		m.put(String[].class, new StringArrayConverter());
		return m;
	}

}
