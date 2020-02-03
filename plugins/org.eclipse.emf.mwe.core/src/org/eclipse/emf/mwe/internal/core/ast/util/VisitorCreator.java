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

import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.ast.AbstractASTBase;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.InclusionAST;
import org.eclipse.emf.mwe.internal.core.ast.ReferenceAST;
import org.eclipse.emf.mwe.internal.core.ast.SimpleParamAST;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.Converter;

public class VisitorCreator extends VisitorBase {

	private VisitorCreator cloneWithBean(final Object newBean) {
		final VisitorCreator newInst = new VisitorCreator(issues, converter, newBean);
		newInst.beans = beans;
		return newInst;
	}

	private Map<String, Object> beans = new HashMap<String, Object>();

	private Map<Class<?>, Converter<?>> converter = new HashMap<Class<?>, Converter<?>>(); // <Class,
	// Converter>

	private Object currentBean = null;

	private Issues issues = new IssuesImpl();

	public VisitorCreator(final Issues issues, final Map<Class<?>, Converter<?>> converter, final Object rootBean) {
		this.issues = issues;
		this.converter = converter;
		currentBean = rootBean;
	}

	@Override
	public Object visitInclusionAST(final InclusionAST cart) {
		if (cart.getImportedElement() == null) {
			issues.addError("referenced element not resolved! ", cart);
		}
		final Class<?> type = currentBean.getClass();
		final Injector inj = InjectorFactory.getInjector(type, cart.getName());
		if (inj == null) {
			issues.addError("no injector could be found in class " + type.getName() + " for property '"
					+ cart.getName() + "'!", cart);
			return cart;
		}
		final Map<String, Object> beansToPass = new HashMap<String, Object>();
		if (cart.isInheritAll()) {
			beansToPass.putAll(this.beans);
		}
		for (final Iterator<?> iter = cart.getChildren().iterator(); iter.hasNext();) {
			final Object o = iter.next();
			if (o instanceof InclusionAST)
				throw new ConfigurationException("Nested inclusions are not supported!");
			else if (o instanceof ComponentAST) {
				final ComponentAST p = (ComponentAST) o;
				final Object bean = createBean(p, null);
				beansToPass.put(p.getName(), bean);
			}
			else if (o instanceof ReferenceAST) {
				final ReferenceAST ref = (ReferenceAST) o;
				if (beans.containsKey(ref.getIdRef())) {
					beansToPass.put(ref.getName(), beans.get(ref.getIdRef()));
				}
				else {
					issues.addError("No bean with id " + ref.getIdRef() + " found!", ref);
				}
			}
		}
		final WorkflowContainer wc = new WorkflowContainer();
		final VisitorCreator vis = cloneWithBean(wc);
		vis.beans = beansToPass;
		final Object importedElement = cart.getImportedElement().accept(vis);
		setValue(importedElement, cart.getName(), cart);

		final Injector inj1 = InjectorFactory.getInjector(importedElement.getClass(), "location");
		if (inj1 != null) {
			inj1.setValue(importedElement, cart.getLocation());
		}
		final Injector inj2 = InjectorFactory.getInjector(importedElement.getClass(), "ownLocation");
		if (inj2 != null) {
			inj2.setValue(importedElement, cart.getImportedElement().getLocation());
		}

		if (cart.getId() != null) {
			beans.put(cart.getId(), importedElement);
		}
		return importedElement;
	}

	@Override
	public Object visitComponentAST(final ComponentAST comp) {
		final Class<?> type = currentBean.getClass();
		final Injector inj = InjectorFactory.getInjector(type, comp.getName());
		if (inj == null) {
			issues.addError("no injector could be found in class " + type.getName() + " for property '"
					+ comp.getName() + "'!", comp);
			return comp;
		}
		final Class<?> toLoad = inj.getRequiredType();
		final Object bean = createBean(comp, toLoad);

		if (bean != null) {
			inj.setValue(currentBean, bean);
		}
		return bean;
	}

	@SuppressWarnings("all")
	private Object createBean(final ComponentAST comp, Class<?> toLoad) {
		Object bean = null;
		if (comp.getClazz() != null) {
			toLoad = loader.loadClass(comp.getClazz());
			if (toLoad == null) {
				issues.addError("Class not found: '" + comp.getClazz() + "'", comp);
				return comp;
			}
		}
		try {
			bean = toLoad.newInstance();
			if (comp.getId() != null) {
				beans.put(comp.getId(), bean);
				final Injector inj = InjectorFactory.getInjector(bean.getClass(), "id");
				if (inj != null) {
					inj.setValue(bean, comp.getId());
				}
			}
			if (comp.getLocation() != null) {
				final Injector inj = InjectorFactory.getInjector(bean.getClass(), "resource");
				if (inj != null) {
					inj.setValue(bean, comp.getLocation().getResource());
				}
				final Injector inj1 = InjectorFactory.getInjector(bean.getClass(), "location");
				if (inj1 != null) {
					inj1.setValue(bean, comp.getLocation());
				}
			}
			final VisitorBase vis = cloneWithBean(bean);
			for (final Iterator<?> iter = comp.getChildren().iterator(); iter.hasNext();) {
				((AbstractASTBase) iter.next()).accept(vis);
			}
		}
		catch (final Exception e) {
			log.error(e.getMessage(), e);
			issues.addError("Error creating instance of type '" + comp.getClazz() + "' : " + e.getMessage(), comp);
		}
		return bean;
	}

	private void setValue(final Object value, final String name, final AbstractASTBase ele) {
		final Injector inj = InjectorFactory.getInjector(currentBean.getClass(), name);
		if (inj == null) {
			issues.addError("no setter or adder could be found in class " + currentBean.getClass().getName() + " for '"
					+ name + "'!", ele);
		}
		else {
			inj.setValue(currentBean, value);
		}
	}

	@Override
	public Object visitReferenceAST(final ReferenceAST ref) {
		if (beans.containsKey(ref.getIdRef())) {
			setValue(beans.get(ref.getIdRef()), ref.getName(), ref);
			return beans.get(ref.getIdRef());
		}
		issues.addError("Couldn't find bean with id " + ref.getIdRef() + " : ", ref);
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object visitSimpleParamAST(final SimpleParamAST param) {
		final Injector inj = InjectorFactory.getInjector(currentBean.getClass(), param.getName());
		if (inj == null) {
			issues.addError("no setter or adder could be found in class " + currentBean.getClass().getName() + " for '"
					+ param.getName() + "'!", param);
			return null;
		}
		final Converter conv = converter.get(inj.getRequiredType());
		if (conv == null) {
			issues.addError("No converter found for " + param + " converting to " + inj.getRequiredType(), param);
			return null;
		}
		final Object val = conv.convert(param.getValue());
		inj.setValue(currentBean, val);
		return val;
	}

}
