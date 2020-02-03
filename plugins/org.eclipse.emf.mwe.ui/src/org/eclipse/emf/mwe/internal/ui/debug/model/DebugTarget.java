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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;
import org.eclipse.emf.mwe.internal.ui.debug.processing.DebugModelManager;
import org.eclipse.emf.mwe.internal.ui.eclipse.launch.MWELaunchConfigurationConstants;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.emf.mwe.ui.debug.model.MWEBreakpoint;

/**
 * MWE Debug Target implementation<br>
 * It holds the debug threads. There is only one thread in the MWE debug model.<br>
 * It holds also a variable values cache.
 * <br>
 * For Info: A debug target handles the suspend, resume, terminate commands and the breakpoint handling.
 * 
 */
public class DebugTarget extends DebugElement implements IDebugTarget {

	private IProcess fProcess;

	private ILaunch fLaunch;

	private DebugThread fThread;

	private DebugModelManager dmm;

	private Map<Integer, DebugValue> valueCache = new HashMap<Integer, DebugValue>();

	protected boolean suspended;

	public static DebugTarget newDebugTarget(final ILaunch launch, final IProcess process, final Connection conn)
			throws CoreException {
		final DebugTarget[] target = new DebugTarget[1];
		IWorkspaceRunnable r = new IWorkspaceRunnable() {
			@Override
			public void run(IProgressMonitor m) throws DebugException {
				target[0] = new DebugTarget(launch, process, conn);
			}
		};
		try {
			// run as atomic unit of work; fire resource change events only once
			ResourcesPlugin.getWorkspace().run(r, null, 0, null);
		} catch (CoreException e) {
			Activator.logError(e);
			Activator.showError(e.getStatus());
			throw e;
		}
		launch.addDebugTarget(target[0]);
		return target[0];
	}

	private DebugTarget(ILaunch launch, IProcess process, Connection conn) throws DebugException {
		super(null);
		fLaunch = launch;
		target = this;
		fProcess = process;
		fThread = new DebugThread(this);
		dmm = DebugModelManager.newDebugModelManager(this, conn);

		DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
	}

	// ******************************************** debug model related elements
	@Override
	public ILaunch getLaunch() {
		return fLaunch;
	}

	@Override
	public IProcess getProcess() {
		return fProcess;
	}

	@Override
	public IThread[] getThreads() {
		return new IThread[] { fThread };
	}

	public DebugThread getThread() {
		return fThread;
	}

	public void removeThread() {
		fThread = null;
	}

	@Override
	public boolean hasThreads() {
		return fThread != null;
	}

	@Override
	public String getName() {
		try {
			return "Workflow: "
					+ fLaunch.getLaunchConfiguration().getAttribute(
							MWELaunchConfigurationConstants.ATTR_MWE_WORKFLOW_FILE, "");
		} catch (CoreException e) {
			// should not occur
		}
		return "";
	}

	@Override
	public DebugModelManager getDebugModelManager() {
		return dmm;
	}

	public DebugValue getDebugValue(VarValueTO varTO) {
		DebugValue value = null;
		int valueId = varTO.valueId;

		if (valueId == 0)
			// don't cache primitives
			value = new DebugValue(this, varTO);
		else {
			value = valueCache.get(valueId);
			if (value == null) {
				value = new DebugValue(this, varTO);
				valueCache.put(valueId, value);
			}
		}
		return value;
	}

	public void updateDebugValues(List<VarValueTO> vars) {
		for (VarValueTO varTO : vars) {
			DebugValue value = valueCache.get(varTO.valueId);
			if (value != null && value.isDirty()) {
				value.setVarTO(varTO);
			}
		}
	}

	// ************************ ISuspendResume implementation and other commands

	@Override
	public boolean canResume() {
		return suspended && !isTerminated();
	}

	@Override
	public boolean canSuspend() {
		return  !suspended && !isTerminated();
	}

	@Override
	public boolean isSuspended() {
		return suspended;
	}

	@Override
	public void resume() throws DebugException {
		dmm.requireResume();
	}

	@Override
	public void suspend() throws DebugException {
		dmm.requireSuspend();
	}

	public void setSuspended(boolean value) {
		suspended = value;
	}

	public void setVariablesDirty() {
		for (DebugValue entry : valueCache.values())
			if (entry != null)
				entry.setDirty(true);
			}

	// ***************** Breakpoint handling, IBreakpointListener implementation

	public void installDeferredBreakpoints() {
		IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(
				MWEBreakpoint.DEBUG_MODEL_ID);
		for (IBreakpoint element : breakpoints) {
			breakpointAdded(element);
		}
	}

	@Override
	public boolean supportsBreakpoint(final IBreakpoint breakpoint) {
		return breakpoint.getModelIdentifier().equals(MWEBreakpoint.DEBUG_MODEL_ID);
	}

	@Override
	public void breakpointAdded(final IBreakpoint breakpoint) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				if (breakpoint.isEnabled()) {
					dmm.requireSetBreakpoint((MWEBreakpoint) breakpoint);
				}
			} catch (CoreException e) {
				// in case connection broke
			}
		}
	}

	@Override
	public void breakpointRemoved(final IBreakpoint breakpoint, final IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				dmm.requireRemoveBreakpoint((MWEBreakpoint) breakpoint);
			} catch (CoreException e) {
				// in case connection broke
			}
		}
	}

	@Override
	public void breakpointChanged(final IBreakpoint breakpoint, final IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				if (breakpoint.isEnabled()) {
					breakpointAdded(breakpoint);
				} else {
					breakpointRemoved(breakpoint, null);
				}
			} catch (CoreException e) {
				// in case connection broke
			}
		}
	}

	// *********************************************** ITerminate implementation

	@Override
	public boolean canTerminate() {
		return getProcess().canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return getProcess().isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		dmm.requireTerminate();
	}

	// ********************************************** IDisconnect implementation

	@Override
	public boolean canDisconnect() {
		return false;
	}

	@Override
	public void disconnect() {
		// not supported
	}

	@Override
	public boolean isDisconnected() {
		return false;
	}

	// ************************************ IMemoryBlockRetrieval implementation

	@Override
	public boolean supportsStorageRetrieval() {
		return false;
	}

	@Override
	public IMemoryBlock getMemoryBlock(final long startAddress, final long length) {
		return null;
	}

}
