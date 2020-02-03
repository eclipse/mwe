/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.model;

import java.util.List;
import java.util.Stack;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.emf.mwe.ui.debug.model.MWEBreakpoint;

/**
 * MWE Debug Thread implementation<br>
 * For Info: A debug thread handles the stepping commands and holds the DebugStackFrames
 * 
 */
public class DebugThread extends DebugElement implements IThread {

	private Stack<DebugStackFrame> frames = new Stack<DebugStackFrame>();

	private MWEBreakpoint bp;

	private boolean fStepping = false;

	// id of last frame that was used to get variables from
	private int varFrameId;

	public DebugThread(final DebugTarget target) {
		super(target);
	}

	// ***************************************************** StackFrame handling

	@Override
	public boolean hasStackFrames() {
		return isSuspended();
	}

	@Override
	public IStackFrame[] getStackFrames() {
		if (isSuspended()) {
			Stack<DebugStackFrame> result = new Stack<DebugStackFrame>();
			int size = frames.size();
			for (int i = size - 1; i >= 0; i--) {
				DebugStackFrame frame = frames.get(i);
				if (frame.isVisible()) {
					result.push(frame);
				}
			}
			return result.toArray(new IStackFrame[0]);
		}
		return new IStackFrame[0];
	}

	@Override
	public IStackFrame getTopStackFrame() {
		if (isSuspended() && !frames.isEmpty()) {
			return frames.peek();
		}
		return null;
	}

	public DebugStackFrame getStackFramePeek() {
		return frames.peek();
	}

	public int getSetVarFrameId(final DebugStackFrame frame) {
		varFrameId = frame.getFrameId();
		return varFrameId;
	}

	public int getVarFrameId() {
		return varFrameId;
	}

	public void clearStack(final int cleanStackLevel) {
		for (int i = frames.size(); i > cleanStackLevel; i--) {
			frames.pop();
		}
	}

	public void pushStackFrames(final List<SyntaxElement> list) {
		for (SyntaxElement se : list) {
			frames.push(new DebugStackFrame(this, se));
		}
	}

	public void setVariablesDirty() {
		for (DebugStackFrame frame : frames) {
			frame.setVariablesDirty();
		}
	}

	// ***************************************************** Breakpoint handling

	// used in Breakpoint view to select the current BP
	@Override
	public IBreakpoint[] getBreakpoints() {
		if (bp == null) {
			return new IBreakpoint[0];
		}
		return new IBreakpoint[] { bp };
	}

	// a BP will be set by the DebugModelManager, when it is hit
	public void setBreakpoint(final MWEBreakpoint bp) {
		this.bp = bp;
	}

	// *************************************************** other IThread methods

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	public String getName() {
		StringBuilder sb = new StringBuilder("State: " + getState());
		if (bp != null) {
			sb.append(" (breakpoint " + bp.getName() + ")");
		}
		return sb.toString();
	}

	public String getState() {
		return isTerminated() ? "terminated" : isSuspended() ? "suspended" : isStepping() ? "stepping" : "running";
	}

	// ******************************************************** process handling

	@Override
	public boolean isStepping() {
		return fStepping;
	}

	public void setStepping(final boolean stepping) {
		fStepping = stepping;
	}

	@Override
	public boolean canStepInto() {
		return isSuspended();
	}

	@Override
	public void stepInto() throws DebugException {
		getDebugModelManager().requireStepInto();
	}

	@Override
	public boolean canStepOver() {
		return isSuspended();
	}

	@Override
	public void stepOver() throws DebugException {
		getDebugModelManager().requireStepOver();
	}

	@Override
	public boolean canStepReturn() {
		return isSuspended();
	}

	@Override
	public void stepReturn() throws DebugException {
		getDebugModelManager().requireStepReturn();
	}

	@Override
	public boolean canSuspend() {
		return getDebugTarget().canSuspend();
	}

	@Override
	public boolean isSuspended() {
		return getDebugTarget().isSuspended();
	}

	@Override
	public void suspend() throws DebugException {
		getDebugTarget().suspend();
	}

	@Override
	public boolean canResume() {
		return getDebugTarget().canResume();
	}

	@Override
	public void resume() throws DebugException {
		getDebugTarget().resume();
	}

	@Override
	public boolean canTerminate() {
		return getDebugTarget().canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return getDebugTarget().isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		getDebugTarget().terminate();
	}

}
