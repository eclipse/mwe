/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.factory;

import java.util.Map;

import org.eclipse.xtext.common.types.JvmType;

import com.google.inject.ImplementedBy;

@ImplementedBy(SettingProviderImpl.class)
public interface ISettingProvider {
	Map<String,ISetting> getSettings(Object obj, JvmType jvmType);
}
