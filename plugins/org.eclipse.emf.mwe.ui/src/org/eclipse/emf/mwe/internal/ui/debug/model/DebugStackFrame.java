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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;
import org.eclipse.emf.mwe.internal.ui.debug.model.ui.VariableSorter;

/**
 * MWE Debug StackFrame implementation.<br>
 * Each debugger step is represented by a stack frame. It holds the variables
 * that belong to that frame. It provides all information important for the
 * Source code display. <br>
 * <br>
 * For Info: In the MWE debug model all processing methods are delegated either
 * to DebugTarget or DebugThread.
 * 
 */
public class DebugStackFrame extends DebugElement implements IStackFrame {

	private final DebugThread thread;

	private final SyntaxElement frameValues;

	private final List<DebugVariable> variables = new ArrayList<DebugVariable>();

	private boolean variablesChecked;

	// -------------------------------------------------------------------------

	public DebugStackFrame(final DebugThread thread, final SyntaxElement to) {
		super(thread.getDebugTarget0());
		this.thread = thread;
		this.frameValues = to;
	}

	// ********************************************** IStackFrame implementation

	@Override
	public IThread getThread() {
		return thread;
	}

	@Override
	public synchronized IVariable[] getVariables() throws DebugException {
		if (!variablesChecked) {
			// Hint: we assume that when clicking a frame or opening the
			// variables view at first this method is
			// called. Therefore we remember the current stackFrame number in
			// thread and use it when collecting
			// sub variables.
			final List<VarValueTO> vars = getDebugModelManager().requireVariables(thread.getSetVarFrameId(this));
			variables.clear();
			for (final VarValueTO varTO : vars) {
				final DebugVariable var = new DebugVariable(getDebugTarget0(), varTO);
				variables.add(var);
			}
			VariableSorter.sort(variables);
			variablesChecked = true;
		}
		return variables.toArray(new IVariable[0]);
	}

	@Override
	public boolean hasVariables() throws DebugException {
		return getVariables().length > 0;
	}

	public void setVariablesDirty() {
		variablesChecked = false;
	}

	@Override
	public String getName() {
		return frameValues.containerName + " :: " + frameValues.elementName + " (line: " + frameValues.line + ")";
	}

	@Override
	public int getLineNumber() {
		return frameValues.line;
	}

	@Override
	public int getCharStart() {
		return frameValues.start;
	}

	@Override
	public int getCharEnd() {
		return frameValues.end;
	}

	public String getResource() {
		return frameValues.resource;
	}

	public String getType() {
		return frameValues.type;

	}

	public int getFrameId() {
		return frameValues.frameId;

	}

	public boolean isVisible() {
		return frameValues.visible;

	}

	@Override
	public IRegisterGroup[] getRegisterGroups() {
		return null;
	}

	@Override
	public boolean hasRegisterGroups() {
		return false;
	}

	// ******************************************************** process handling

	@Override
	public boolean isStepping() {
		return getThread().isStepping();
	}

	@Override
	public boolean canStepInto() {
		return getThread().canStepInto();
	}

	@Override
	public void stepInto() throws DebugException {
		getThread().stepInto();
	}

	@Override
	public boolean canStepOver() {
		return getThread().canStepOver();
	}

	@Override
	public void stepOver() throws DebugException {
		getThread().stepOver();
	}

	@Override
	public boolean canStepReturn() {
		return getThread().canStepReturn();
	}

	@Override
	public void stepReturn() throws DebugException {
		getThread().stepReturn();
	}

	@Override
	public boolean canSuspend() {
		return getThread().canSuspend();
	}

	@Override
	public boolean isSuspended() {
		return getThread().isSuspended();
	}

	@Override
	public void suspend() throws DebugException {
		getThread().suspend();
	}

	@Override
	public boolean canResume() {
		return getThread().canResume();
	}

	@Override
	public void resume() throws DebugException {
		getThread().resume();
	}

	@Override
	public boolean canTerminate() {
		return getThread().canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return getThread().isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		getThread().terminate();
	}

}
