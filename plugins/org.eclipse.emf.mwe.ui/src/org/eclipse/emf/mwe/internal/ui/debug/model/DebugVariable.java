/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
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

	private String name;

	private DebugValue value;

	public DebugVariable(DebugTarget target, VarValueTO varTO) {
		super(target);
		name = varTO.name;
		setValue(varTO);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IValue getValue() {
		return value;
	}

	public DebugValue getValue0() {
		return value;
	}

	public void setValue(VarValueTO varTO) {
		value = target.getDebugValue(varTO);
	}

	@Override
	public void setValue(String expression) {
		// not used (yet?)
		// to be implemented if variable modification shall be established
	}

	@Override
	public void setValue(IValue value) {
		if (value instanceof DebugValue)
			this.value = (DebugValue) value;
		}

	@Override
	public String getReferenceTypeName() {
		return value.getReferenceTypeName();
	}

	// ********************************** we don't support value modification yet

	@Override
	public boolean supportsValueModification() {
		return false;
	}

	@Override
	public boolean hasValueChanged() {
		return false;
	}

	@Override
	public boolean verifyValue(String expression) {
		return true;
	}

	@Override
	public boolean verifyValue(IValue test) {
		return true;
	}

}
