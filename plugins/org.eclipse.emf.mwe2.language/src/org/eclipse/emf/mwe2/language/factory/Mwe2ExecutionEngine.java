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
import org.eclipse.emf.mwe2.runtime.IFactory;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.JavaReflectAccess;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

public class Mwe2ExecutionEngine {

	private PolymorphicDispatcher<Object> dispatcher = PolymorphicDispatcher
			.createForSingleTarget("inCase", 2,2,this);
	private JavaReflectAccess reflectAccess;
	private ISettingProvider settingProvider;

	@Inject
	public void setReflectAccess(JavaReflectAccess reflectAccess) {
		this.reflectAccess = reflectAccess;
	}
	
	@Inject
	public void setSettingProvider(ISettingProvider settingProvider) {
		this.settingProvider = settingProvider;
	}
	
	public Object create(Module m) {
		return create(m, Maps.<String,Object>newHashMap());
	}
	
	public Object create(Module m, Map<String, Object> params) {
		return internalSwitch(m, Maps.newHashMap(params));
	}

	protected Object internalSwitch(Object o, Map<String, Object> variables) {
		return dispatcher.invoke(o, variables);
	}

	protected Object inCase(Module m, Map<String, Object> variables) {
		for (DeclaredProperty prop : m.getDeclaredProperties()) {
			if (prop.getDefault() == null
					&& !variables.containsKey(prop.getName())) {
				throw new IllegalArgumentException("Cannot execute module '"
						+ m.getCanonicalName() + "'.The mandatory parameter '"
						+ prop.getName() + "' has not been passed.");
			}
			internalSwitch(prop, variables);
		}
		return internalSwitch(m.getRoot(), variables);
	}

	protected Object inCase(DeclaredProperty prop, Map<String, Object> variables) {
		if (prop.getDefault() != null && !variables.containsKey(prop.getName())) {
			variables.put(prop.getName(), internalSwitch(prop.getDefault(),
					variables));
		}
		return null;
	}

	protected Object inCase(Component comp, Map<String, Object> variables) {
		List<Assignment> assignments = Lists.newArrayList(comp.getAssignment());
		if (comp.getModule() != null) {
			Map<String, Object> params = comp.isAutoInject() ? Maps
					.newHashMap(variables) : Maps.<String, Object> newHashMap();
			for (Assignment ass : assignments) {
				params.put(((DeclaredProperty)ass.getFeature()).getName(), internalSwitch(ass
						.getValue(), variables));
			}
			return internalSwitch(comp.getModule(), params);
		} else {
			Object object = create(comp.getActualType());
			if (object instanceof IFactory<?>) {
				internalApplyAssignments(object, comp, assignments, variables);
				object = ((IFactory<?>)object).create();
			}
			if (comp.getName() != null) {
				variables.put(comp.getName(), object);
			}
			internalApplyAssignments(object, comp, assignments, variables);
			return object;
		}
	}

	/**
	 * applies the passed assignments to the given object.
	 * !!It removes any consumed assignments from the passed list!!
	 */
	protected void internalApplyAssignments(Object object, Component comp,
			List<Assignment> assignments, Map<String, Object> variables) {
		Map<String, ISetting> settings = settingProvider.getSettings(object, comp.getActualType());
		if (comp.isAutoInject()) {
			for (ISetting setting : settings.values()) {
				String name = setting.getName();
				if (variables.containsKey(name))
					setting.setValue(variables.get(name));
			}
		}
		Iterator<Assignment> iterator = assignments.iterator();
		while (iterator.hasNext()) {
			Assignment assignment = iterator.next();
			String featureName = assignment.getFeatureName();
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

	protected Object inCase(Reference ref, Map<String, Object> variables) {
		return variables.get(ref.getReferable().getName());
	}
	protected Object inCase(BooleanLiteral comp, Map<String, Object> variables) {
		return comp.isIsTrue();
	}
	
	protected Object inCase(StringLiteral comp, Map<String, Object> variables) {
		StringBuilder builder = new StringBuilder();
		for (StringPart part : comp.getParts()) {
			if (part instanceof PropertyReference) {
				builder.append(internalSwitch(((PropertyReference) part).getProperty(), variables));
			} else {
				builder.append(((PlainString)part).getValue());
			}
		}
		return builder.toString();
	}

}
