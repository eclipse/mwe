/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.internal.core.ast;

import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.ast.util.VisitorBase;

public abstract class AbstractASTBase {
	private Location location = null;

	public AbstractASTBase(final Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(final Location location) {
		this.location = location;
	}

	public int getColumnNumber() {
		return location.getColumnNumber();
	}

	public int getLineNumber() {
		return location.getLineNumber();
	}

	public String getResource() {
		return location.getResource();
	}

	public final Object accept(final VisitorBase visitor) {
		return visitor.visit(this);
	}

	public int getLength() {
		return location.getNameEnd();
	}

	public int getOffset() {
		return location.getNameStart();
	}

}
