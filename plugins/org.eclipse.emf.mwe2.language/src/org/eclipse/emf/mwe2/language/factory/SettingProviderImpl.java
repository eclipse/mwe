/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.factory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.language.scoping.IInjectableFeatureLookup;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.JavaReflectAccess;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

@SuppressWarnings("restriction") 
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

	@Override
	public Map<QualifiedName,ISetting> getSettings(final Object obj, JvmType type) {
		Map<QualifiedName, JvmFeature> features = injectableFeatureLookup.getInjectableFeatures(type);
		
		Iterable<ISetting> settings = Iterables.transform(features.entrySet(), new Function<Map.Entry<QualifiedName, JvmFeature>,ISetting>(){
			@Override
			public ISetting apply(final Map.Entry<QualifiedName, JvmFeature> from) {
				if (from.getValue() instanceof JvmOperation) {
					return new ISetting() {
						@Override
						public void setValue(Object value) {
							Method method = reflectAccess.getMethod((JvmOperation) from.getValue());
							try {
								method.invoke(obj, value);
							} catch (Exception e) {
								throw new WrappedException(e);
							}
						}
						@Override
						public QualifiedName getName() {
							return from.getKey();
						}
					};
				} else if (from.getValue() instanceof JvmField) {
					return new ISetting() {
						@Override
						public void setValue(Object value) {
							Field field = reflectAccess.getField((JvmField) from.getValue());
							try {
								field.set(obj, value);
							} catch (Exception e) {
								throw new WrappedException(e);
							}
						}
						@Override
						public QualifiedName getName() {
							return from.getKey();
						}
					};
				}
				throw new IllegalArgumentException(from.getValue().getIdentifier() + " can not be handled.");
			}});
		return Maps.uniqueIndex(settings, new Function<ISetting, QualifiedName>() {
			@Override
			public QualifiedName apply(ISetting from) {
				return from.getName();
			}
		});
	}

}
