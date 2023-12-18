/*******************************************************************************
 * Copyright (c) 2015, 2024 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.helpers.LegacyAbstractLogger;

class LogTester extends LegacyAbstractLogger {
	private static final long serialVersionUID = 1L;

	public LogTester(Class<?> clazz, Object object){
		setLog(clazz, object);
	}
	private void setLog(Class<?> clazz, Object object) {
		for (Field f : clazz.getDeclaredFields()) {
			if (f.getType().isAssignableFrom(Logger.class))
				try {
					f.setAccessible(true);
					f.set(object, this);
					return;
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
		}
		throw new IllegalArgumentException("The class " + clazz.getName() + " does not declare field of type org.slf4j.Logger.");
	}

	public List<String> getWarnings() {
		return warnings;
	}

	public List<String> getInfos() {
		return infos;
	}

	private final List<String> warnings = new ArrayList<>();
	private final List<String> infos = new ArrayList<>();

	@Override
	public boolean isDebugEnabled() {
		return true;
	}

	@Override
	public boolean isErrorEnabled() {
		return true;
	}

	@Override
	public boolean isInfoEnabled() {
		return false;
	}

	@Override
	public boolean isTraceEnabled() {
		return true;
	}

	@Override
	public boolean isWarnEnabled() {
		return true;
	}

	@Override
	protected String getFullyQualifiedCallerName() {
		return null;
	}

	@Override
	protected void handleNormalizedLoggingCall(Level level, Marker marker, String messagePattern, Object[] arguments,
			Throwable throwable) {
		switch (level) {
			case INFO:
				infos.add(messagePattern);
				break;
			case WARN:
				warnings.add(messagePattern);
				break;
			default:
				break;
		}
	}

}