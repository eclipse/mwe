/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;
import org.eclipse.emf.mwe.internal.ui.debug.model.ui.VariableSorter;

/**
 * MWE Debug Value implementation<br>
 * A DebugValue has (beside it's own String representation) a list of sub-variables.
 * 
 */
public class DebugValue extends DebugElement implements IValue {

	private VarValueTO varTO;

	private boolean dirty;

	private final List<DebugVariable> variables = new ArrayList<DebugVariable>();

	// -------------------------------------------------------------------------

	public DebugValue(final DebugTarget target, final VarValueTO varTO) {
		super(target);
		this.varTO = varTO;
	}

	// -------------------------------------------------------------------------

	public void setVarTO(final VarValueTO varTO) {
		this.varTO = varTO;
	}

	public int getVarTOId() {
		return varTO.valueId;
	}

	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(final boolean dirty) {
		this.dirty = dirty;
	}

	public String getReferenceTypeName() {
		// not used in our debug model
		return "";
	}

	public String getValueString() {
		return varTO.simpleRep + (varTO.valueId > 0 ? " (id=" + varTO.valueId + ")" : "");
	}

	public String getDetailRep() {
		return varTO.stringRep;
	}

	public boolean isAllocated() {
		return true;
	}

	public boolean hasVariables() {
		return varTO.hasMembers;
	}

	public synchronized IVariable[] getVariables() throws DebugException {
		if ((varTO.hasMembers && variables.isEmpty()) || dirty) {
			// require variable value information from runtime process for the first time and after one step
			List<VarValueTO> vars = getDebugModelManager().requireSubVariables(varTO.valueId);
			if (dirty) {
				// it's an update
				List<DebugVariable> oldVars = new ArrayList<DebugVariable>();
				oldVars.addAll(variables);
				for (VarValueTO varTO : vars) {
					boolean varFound = false;
					for (DebugVariable var : variables) {
						if (var.getName().equals(varTO.name)) {
							varFound = true;
							if (varTO.valueId == 0) {
								// update value for primitives
								var.getValue0().setVarTO(varTO);
							} else if (var.getValue0().getVarTOId() != varTO.valueId) {
								// update value information
								var.setValue(varTO);
							} else {
								// still up2date
								oldVars.remove(var);
							}
							break;
						}
					}
					if (!varFound) {
						DebugVariable var = new DebugVariable(getDebugTarget0(), varTO);
						variables.add(var);
					}
				}
				for (DebugVariable var : oldVars) {
					// remove remaining obsolete vars
					variables.remove(var);
				}
			} else {
				// first time: create new variables
				for (VarValueTO varTO : vars) {
					DebugVariable var = new DebugVariable(getDebugTarget0(), varTO);
					variables.add(var);
				}
			}
			dirty = false;
			VariableSorter.sort(variables);

		}
		return variables.toArray(new IVariable[0]);
	}

}
