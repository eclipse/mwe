package org.eclipse.emf.mwe2.language.factory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.language.scoping.IInjectableFeatureLookup;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.JavaReflectAccess;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

public class SettingProviderImpl implements ISettingProvider {
	
	private IInjectableFeatureLookup injectableFeatureLookup;
	private JavaReflectAccess reflectAccess;
	
	@Inject
	public void setReflectAccess(JavaReflectAccess reflectAccess) {
		this.reflectAccess = reflectAccess;
	}
	@Inject
	public void setInjectableFeatureLookup(
			IInjectableFeatureLookup injectableFeatureLookup) {
		this.injectableFeatureLookup = injectableFeatureLookup;
	}

	public Map<String,ISetting> getSettings(final Object obj, JvmType type) {
		Map<String, JvmFeature> features = injectableFeatureLookup.getInjectableFeatures(type);
		
		Iterable<ISetting> settings = Iterables.transform(features.entrySet(), new Function<Map.Entry<String, JvmFeature>,ISetting>(){

			public ISetting apply(final Map.Entry<String, JvmFeature> from) {
				if (from.getValue() instanceof JvmExecutable) {
					return new ISetting() {
						public void setValue(Object value) {
							Method method = reflectAccess.getMethod((JvmExecutable) from.getValue());
							try {
								method.invoke(obj, value);
							} catch (Exception e) {
								throw new WrappedException(e);
							}
						}
						public String getName() {
							return from.getKey();
						}
					};
				} else if (from.getValue() instanceof JvmField) {
					return new ISetting() {
						public void setValue(Object value) {
							Field field = reflectAccess.getField((JvmField) from.getValue());
							try {
								field.set(obj, value);
							} catch (Exception e) {
								throw new WrappedException(e);
							}
						}
						public String getName() {
							return from.getKey();
						}
					};
				}
				throw new IllegalArgumentException(from.getValue().getCanonicalName() + " can not be handled.");
			}});
		return Maps.uniqueIndex(settings, new Function<ISetting, String>() {
			public String apply(ISetting from) {
				return from.getName();
			}
		});
	}

}
