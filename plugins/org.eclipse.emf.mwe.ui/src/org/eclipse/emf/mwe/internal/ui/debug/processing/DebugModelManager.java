/*******************************************************************************
 * Copyright (c) 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.processing;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugStackFrame;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugTarget;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugThread;
import org.eclipse.emf.mwe.internal.ui.debug.model.MWEBreakpoint;
import org.eclipse.emf.mwe.internal.ui.debug.processing.handlers.BreakpointPluginHandler;
import org.eclipse.emf.mwe.internal.ui.debug.processing.handlers.CommandPluginHandler;
import org.eclipse.emf.mwe.internal.ui.debug.processing.handlers.VariablesPluginHandler;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

public class DebugModelManager implements IDebugEventSetListener {
	private final DebugTarget target;

	private PluginExtensionManager extensionManager;

	private CommandPluginHandler cmdHandler;

	private VariablesPluginHandler varHandler;

	private BreakpointPluginHandler bpHandler;

	public static DebugModelManager newDebugModelManager(final DebugTarget target, final Connection connection)
			throws DebugException {
		DebugModelManager dmm = new DebugModelManager(target);
		dmm.extensionManager = PluginExtensionManager.getDefault();
		dmm.extensionManager.init(dmm, connection);
		return dmm;
	}

	private DebugModelManager(final DebugTarget target) {
		this.target = target;
		DebugPlugin.getDefault().addDebugEventListener(this);
	}

	// -------------------------------------------------------------------------

	public void setCmdHandler(final CommandPluginHandler cmdHandler) {
		this.cmdHandler = cmdHandler;
	}

	public void setVariablesHandler(final VariablesPluginHandler varHandler) {
		this.varHandler = varHandler;
	}

	public void setBreakpointHandler(final BreakpointPluginHandler bpHandler) {
		this.bpHandler = bpHandler;
	}

	public boolean hasRequiredHandlers() {
		return (cmdHandler != null) && (varHandler != null) && (bpHandler != null);
	}

	// -------------------------------------------------------------------------

	public DebugTarget getTarget() {
		return target;
	}

	public DebugThread getThread() {
		return target.getThread();
	}

	// ********************************************************** event handling

	public void debuggerStarted() throws DebugException {
		if (shallStopInMain()) {
			cmdHandler.sendSuspendCommand();
		}
		target.setSuspended(false);
		target.installDeferredBreakpoints();
		fireCreationEvent();
	}

	public void adaptStackFrames(final int cleanStackLevel, final List<SyntaxElement> frames) {
		getThread().clearStack(cleanStackLevel);
		getThread().pushStackFrames(frames);
		target.setVariablesDirty();
		getThread().setVariablesDirty();
	}

	public void debuggerSuspended() {
		target.setSuspended(true);
		// Hint: we don't set DebugEvent.STEP_END by intention
		// only CLIENT_REQUEST or BREAKPOINT detail will expand the launch tree
		int detail = (checkBreakPoint()) ? DebugEvent.BREAKPOINT : DebugEvent.CLIENT_REQUEST;
		fireSuspendEvent(detail);
	}

	public void debuggerResumed() {
		target.setSuspended(false);
		// Hint: we don't set STEP_IN, STEP_OVER or STEP_RETURN by intention
		// because the ThreadEventHandler would only update CONTENT, but not STATE
		fireResumeEvent(DebugEvent.CLIENT_REQUEST);
	}

	public void debuggerTerminated() {
		target.setSuspended(true);
		getThread().setStepping(false);
		fireSuspendEvent(DebugEvent.CLIENT_REQUEST);
		// wait until the delayed event handling is finished (>500ms) before returning and sending confirmation
		// afterwards
		// this is to make sure that the source view update event will be really thrown
		// see org.eclipse.debug.internal.ui.viewers.update.EventHandlerModelProxy.dispatchResume(...)
		try {
			Thread.sleep(700);
		} catch (final InterruptedException e) {
		}
	}

	/**
	 * This class is registered as IDebugEventSetListener to get TERMINATE information during an unnormal end of
	 * the runtime process (when no terminate communication-event is thrown)<br>
	 * In this case a DebugEvent.TERMINATE is fired with an IProcess source.<br>
	 * Another terminate event must be fired here with the DebugTarget source. This is necessary because some
	 * listeners don't cleanup completely if there is only a terminate event with source = IProcess
	 * 
	 * @see org.eclipse.debug.core.IDebugEventSetListener#handleDebugEvents(org.eclipse.debug.core.DebugEvent[])
	 */
	public void handleDebugEvents(final DebugEvent[] events) {
		for (DebugEvent event : events) {
			if (event.getKind() == DebugEvent.TERMINATE) {
				DebugPlugin.getDefault().removeDebugEventListener(this);
				DebugPlugin.getDefault().getBreakpointManager().removeBreakpointListener(target);
				getThread().clearStack(0);
				target.removeThread();
				fireTerminateEvent();
			}
		}
	}

	private boolean shallStopInMain() {
		try {
			return target.getLaunch().getLaunchConfiguration().getAttribute(
					IJavaLaunchConfigurationConstants.ATTR_STOP_IN_MAIN, true);
		} catch (CoreException e) {
			return true;
		}
	}

	private boolean checkBreakPoint() {
		IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(
				MWEBreakpoint.DEBUG_MODEL_ID);
		DebugStackFrame frame = getThread().getStackFramePeek();
		for (IBreakpoint bp : breakpoints) {
			if (((MWEBreakpoint) bp).equals(frame.getCharStart(), frame.getResource())) {
				getThread().setBreakpoint((MWEBreakpoint) bp);
				return true;
			}
		}
		return false;
	}

	// ********************************************************* type sending

	public void requireStepInto() throws DebugException {
		getThread().setStepping(true);
		cmdHandler.sendStepIntoCommand();
	}

	public void requireStepOver() throws DebugException {
		getThread().setStepping(true);
		cmdHandler.sendStepOverCommand();
	}

	public void requireStepReturn() throws DebugException {
		getThread().setStepping(true);
		cmdHandler.sendStepReturnCommand();
	}

	public void requireResume() throws DebugException {
		getThread().setStepping(false);
		cmdHandler.sendResumeCommand();
	}

	public void requireSuspend() throws DebugException {
		cmdHandler.sendSuspendCommand();
	}

	public void requireTerminate() throws DebugException {
		cmdHandler.sendTerminateCommand();
	}

	// -------------------------------------------------------------------------

	public List<VarValueTO> requireVariables(final int frameId) throws DebugException {
		try {
			List<VarValueTO> vars = varHandler.sendRequireVariables(frameId);
			target.updateDebugValues(vars);
			return vars;
		} catch (IOException e) {
			handleIOProblem(e);
			return null; // does not occur, because handleIOProblem throws always an exception
		}
	}

	// we send the frame id and the var id; the frame id is used to get the correct adapter
	// example: an object could occur in a workflow slot (which is handled by the workflow adapter
	// later in the execution context the string representation may be rendered differently by another adapter
	public List<VarValueTO> requireSubVariables(final int varId) throws DebugException {
		int frameId = target.getThread().getVarFrameId();
		try {
			List<VarValueTO> vars = varHandler.sendRequireSubVariables(frameId, varId);
			target.updateDebugValues(vars);
			return vars;
		} catch (IOException e) {
			handleIOProblem(e);
			return null; // does not occur, because handleIOProblem throws always an exception
		}
	}

	public void requireSetBreakpoint(final MWEBreakpoint bp) throws DebugException {
		try {
			bpHandler.sendSetBreakpoint(bp);
		} catch (IOException e) {
			handleIOProblem(e);
		}
	}

	public void requireRemoveBreakpoint(final MWEBreakpoint bp) throws DebugException {
		try {
			bpHandler.sendRemoveBreakpoint(bp);
		} catch (IOException e) {
			handleIOProblem(e);
		}
	}

	public void handleIOProblem(final Exception e) throws DebugException {
		throw new DebugException(Activator.createErrorStatus(
				"lost connection to debugger runtime process --> aborting", e));
	}

	// *************************************** forward events to the DebugPlugin

	private void fireCreationEvent() {
		fireEvent(new DebugEvent(target, DebugEvent.CREATE));
	}

	private void fireResumeEvent(final int detail) {
		fireEvent(new DebugEvent(getThread(), DebugEvent.RESUME, detail));
	}

	private void fireSuspendEvent(final int detail) {
		fireEvent(new DebugEvent(getThread(), DebugEvent.SUSPEND, detail));
	}

	private void fireTerminateEvent() {
		fireEvent(new DebugEvent(target, DebugEvent.TERMINATE));
	}

	private void fireEvent(final DebugEvent event) {
		DebugPlugin.getDefault().fireDebugEventSet(new DebugEvent[] { event });
	}

}
