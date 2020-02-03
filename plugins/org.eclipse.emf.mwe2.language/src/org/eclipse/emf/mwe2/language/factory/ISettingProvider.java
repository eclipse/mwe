/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.factory;

import java.util.Map;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.ImplementedBy;

@ImplementedBy(SettingProviderImpl.class)
public interface ISettingProvider {
	Map<QualifiedName, ISetting> getSettings(Object obj, JvmType jvmType);
}
