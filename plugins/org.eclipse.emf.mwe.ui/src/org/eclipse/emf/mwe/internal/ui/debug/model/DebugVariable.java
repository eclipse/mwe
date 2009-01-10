/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.model;

import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;

/**
 * MWE Debug Variable implementation<br>
 * A variable has (beside the name) a <code>DebugValue</code>, that holds potential sub-variables.
 * 
 */
public class DebugVariable extends DebugElement implements IVariable {

	private final String name;

	private DebugValue value;

	public DebugVariable(final DebugTarget target, final VarValueTO varTO) {
		super(target);
		name = varTO.name;
		setValue(varTO);
	}

	public String getName() {
		return name;
	}

	public IValue getValue() {
		return value;
	}

	public DebugValue getValue0() {
		return value;
	}

	public void setValue(final VarValueTO varTO) {
		value = target.getDebugValue(varTO);
	}

	public void setValue(final String expression) {
		// not used (yet?)
		// to be implemented if variable modification shall be established
	}

	public void setValue(final IValue value) {
		if (value instanceof DebugValue) {
			this.value = (DebugValue) value;
		}
	}

	public String getReferenceTypeName() {
		return value.getReferenceTypeName();
	}

	// ********************************** we don't support value modification yet

	public boolean supportsValueModification() {
		return false;
	}

	public boolean hasValueChanged() {
		return false;
	}

	public boolean verifyValue(final String expression) {
		return true;
	}

	public boolean verifyValue(final IValue test) {
		return true;
	}

}
