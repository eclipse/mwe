/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.factory;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.PropertyReference;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.StringPart;
import org.eclipse.emf.mwe2.language.scoping.FactorySupport;
import org.eclipse.emf.mwe2.runtime.IFactory;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.JavaReflectAccess;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

public class Mwe2ExecutionEngine {

	private PolymorphicDispatcher<Object> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("inCase", 2,2,this);
	@Inject
	private FactorySupport factorySupport;
	
	@Inject
	private JavaReflectAccess reflectAccess;
	
	@Inject
	private ISettingProvider settingProvider;
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	public Object execute(Module m) {
		return create(m, Maps.<QualifiedName,Object>newHashMap());
	}
	
	public Object create(Module m, Map<QualifiedName, Object> params) {
		return internalSwitch(m, Maps.newHashMap(params));
	}

	protected Object internalSwitch(Object o, Map<QualifiedName, Object> variables) {
		return dispatcher.invoke(o, variables);
	}

	protected Object inCase(Module m, Map<QualifiedName, Object> variables) {
		for (DeclaredProperty prop : m.getDeclaredProperties()) {
			QualifiedName propertyQualifiedName = qualifiedNameConverter.toQualifiedName(prop.getName());
			if (prop.getDefault() == null
					&& !variables.containsKey(propertyQualifiedName)) {
				throw new IllegalArgumentException("Cannot execute module '"
						+ m.getCanonicalName() + "'.The mandatory parameter '"
						+ prop.getName() + "' has not been passed.");
			}
			internalSwitch(prop, variables);
		}
		return internalSwitch(m.getRoot(), variables);
	}

	protected Object inCase(DeclaredProperty prop, Map<QualifiedName, Object> variables) {
		QualifiedName propertyQualifiedName = qualifiedNameConverter.toQualifiedName(prop.getName());
		if (prop.getDefault() != null && !variables.containsKey(propertyQualifiedName)) {
			variables.put(propertyQualifiedName, internalSwitch(prop.getDefault(),
					variables));
		}
		return null;
	}

	protected Object inCase(Component comp, Map<QualifiedName, Object> variables) {
		List<Assignment> assignments = Lists.newArrayList(comp.getAssignment());
		if (comp.getModule() != null) {
			Map<QualifiedName, Object> params = comp.isAutoInject() ? Maps
					.newHashMap(variables) : Maps.<QualifiedName, Object> newHashMap();
			for (Assignment ass : assignments) {
				params.put(QualifiedName.create(((DeclaredProperty)ass.getFeature()).getName()), internalSwitch(ass
						.getValue(), variables));
			}
			return internalSwitch(comp.getModule(), params);
		} else {
			JvmType actualType = comp.getActualType();
			Object object = create(actualType);
			JvmType factoryType = factorySupport.findFactoriesCreationType(actualType);
			if (factoryType!=null) {
				internalApplyAssignments(object, actualType, comp.isAutoInject(), assignments, variables);
				object = ((IFactory<?>)object).create();
				actualType = factoryType;
			}
			if (comp.getName() != null) {
				variables.put(qualifiedNameConverter.toQualifiedName(comp.getName()), object);
			}
			internalApplyAssignments(object, actualType, comp.isAutoInject(), assignments, variables);
			return object;
		}
	}

	/**
	 * applies the passed assignments to the given object.
	 * !!It removes any consumed assignments from the passed list!!
	 */
	protected void internalApplyAssignments(Object object, JvmType type, boolean isAutoInject,
			List<Assignment> assignments, Map<QualifiedName, Object> variables) {
		Map<QualifiedName, ISetting> settings = settingProvider.getSettings(object, type);
		if (isAutoInject) {
			for (ISetting setting : settings.values()) {
				QualifiedName name = setting.getName();
				if (variables.containsKey(name))
					setting.setValue(variables.get(name));
			}
		}
		Iterator<Assignment> iterator = assignments.iterator();
		while (iterator.hasNext()) {
			Assignment assignment = iterator.next();
			QualifiedName featureName = qualifiedNameConverter.toQualifiedName(assignment.getFeatureName());
			if (settings.containsKey(featureName)) {
				Object actualValueToSet = internalSwitch(assignment.getValue(), variables);
				settings.get(featureName).setValue(actualValueToSet);
				// remove the applied assignment
				iterator.remove();
			}
		}
	}
	
	protected Object create(JvmType jvmType) {
		Class<?> class1 = reflectAccess.getRawType(jvmType);
		if (class1==null)
			throw new IllegalStateException("Couldn't find java.lang.Class for name '"+jvmType.getCanonicalName()+"'");
		try {
			return class1.newInstance();
		} catch (Exception e) {
			throw new WrappedException(e);
		}
	}

	protected Object inCase(Reference ref, Map<QualifiedName, Object> variables) {
		return variables.get(qualifiedNameConverter.toQualifiedName(ref.getReferable().getName()));
	}
	protected Object inCase(BooleanLiteral comp, Map<QualifiedName, Object> variables) {
		return comp.isIsTrue();
	}
	
	protected Object inCase(StringLiteral comp, Map<QualifiedName, Object> variables) {
		StringBuilder builder = new StringBuilder();
		for (StringPart part : comp.getParts()) {
			if (part instanceof PropertyReference) {
				builder.append(variables.get(qualifiedNameConverter.toQualifiedName(((PropertyReference) part).getReferable().getName())));
			} else {
				builder.append(((PlainString)part).getValue());
			}
		}
		return builder.toString();
	}

	
	public void setFactorySupport(FactorySupport factorySupport) {
		this.factorySupport = factorySupport;
	}
	
	public void setReflectAccess(JavaReflectAccess reflectAccess) {
		this.reflectAccess = reflectAccess;
	}
	
	public void setSettingProvider(ISettingProvider settingProvider) {
		this.settingProvider = settingProvider;
	}
}
