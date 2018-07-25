/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.util;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.apache.commons.logging.Log;

class LogTester implements Log {
	
	public LogTester(Class<?> clazz, Object object){
		super();
		setLog(clazz, object);
	}
	private void setLog(Class<?> clazz, Object object) {
		for (Field f : clazz.getDeclaredFields()) {
			if (f.getType().isAssignableFrom(Log.class))
				try {
					f.setAccessible(true);
					f.set(object, this);
					return;
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
		}
		throw new IllegalArgumentException("The class " + clazz.getName() + " does not declare field of type org.apache.commons.logging.Log.");
	}
	
	
	public ArrayList<String> getWarnings() {
		return warnings;
	}

	ArrayList<String> warnings = new ArrayList<String>();
	ArrayList<String> infos = new ArrayList<String>();

	@Override
	public boolean isDebugEnabled() {
		return true;
	}

	@Override
	public boolean isErrorEnabled() {
		return true;
	}

	@Override
	public boolean isFatalEnabled() {
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
	public void trace(Object message) {

	}

	@Override
	public void trace(Object message, Throwable t) {

	}

	@Override
	public void debug(Object message) {

	}

	@Override
	public void debug(Object message, Throwable t) {

	}

	@Override
	public void info(Object message) {
		infos.add((String) message);
	}

	@Override
	public void info(Object message, Throwable t) {

	}

	@Override
	public void warn(Object message) {
		warnings.add((String) message);
	}

	@Override
	public void warn(Object message, Throwable t) {

	}

	@Override
	public void error(Object message) {

	}

	@Override
	public void error(Object message, Throwable t) {

	}

	@Override
	public void fatal(Object message) {

	}

	@Override
	public void fatal(Object message, Throwable t) {

	}

}