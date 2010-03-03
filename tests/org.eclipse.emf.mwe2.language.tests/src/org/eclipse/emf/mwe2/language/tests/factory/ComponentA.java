package org.eclipse.emf.mwe2.language.tests.factory;

import java.util.List;

import com.google.common.collect.Lists;

public class ComponentA {
	private ComponentA x;
	private List<String> y = Lists.newArrayList();
	
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
}
