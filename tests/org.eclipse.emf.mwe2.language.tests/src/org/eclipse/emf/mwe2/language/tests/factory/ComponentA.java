/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.factory;

import java.util.List;

import com.google.common.collect.Lists;

public class ComponentA {
	private ComponentA x;
	private List<String> y = Lists.newArrayList();
	private String z;
	private int i;
	private double d;
	private boolean b;
	
	public ComponentA getX() {
		return x;
	}
	public void setX(ComponentA x) {
		this.x = x;
	}
	
	public List<String> getY() {
		return y;
	}
	
	public void addY(String s) {
		this.y.add(s);
	}
	
	public void setZ(String z) {
		this.z = z;
	}
	
	public String getZ() {
		return z;
	}
	
	public boolean isB() {
		return b;
	}
	
	public void setB(boolean b) {
		this.b = b;
	}
	
	public double getD() {
		return d;
	}
	
	public void setD(double d) {
		this.d = d;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
}
