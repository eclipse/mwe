package org.eclipse.emf.mwe.core.monitor;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * An adapter between Eclipse's {@link IProgressMonitor} interface and oAW's {@link ProgressMonitor} interface.
 * The adapter delegates all calls to the wrapped <tt>IProgressMonitor</tt> instance.
 * @author Karsten Thoms
 * @since 4.1.2
 */
public class ProgressMonitorAdapter implements ProgressMonitor {
	private IProgressMonitor monitor;
	
	/**
	 * Constructor.
	 * @param monitor The monitor implementation where all calls are delegated to.
	 */
	public ProgressMonitorAdapter (IProgressMonitor monitor) {
		this.monitor = monitor;
	}
	
	/**
	 * @see {@link ProgressMonitor#beginTask(String, int)}
	 */
	public void beginTask(String name, int totalWork) {
		monitor.beginTask(name, totalWork);
	}

	/**
	 * @see {@link ProgressMonitor#done(ProgressMonitor)}
	 */
	public void done() {
		monitor.done();
	}

	/**
	 * @see {@link ProgressMonitor#internalWorked(double)}
	 */
	public void internalWorked(double work) {
		monitor.internalWorked(work);
	}

	/**
	 * @see {@link ProgressMonitor#isCanceled()}
	 */
	public boolean isCanceled() {
		return monitor.isCanceled();
	}

	public void started(Object element, Object context){
	}

	public void finished(Object element, Object context){
		
	}

	/**
	 * @see {@link ProgressMonitor#postTask(Object, Object)}
	 */
	public void postTask(Object element, Object context) {
	}

	/**
	 * @see {@link ProgressMonitor#preTask(Object, Object)}
	 */
	public void preTask(Object element, Object context) {
	}

	/**
	 * @see {@link ProgressMonitor#setCanceled(boolean)}
	 */
	public void setCanceled(boolean value) {
		monitor.setCanceled(value);
	}

	/**
	 * @see {@link ProgressMonitor#beginTask(String)}
	 */
	public void setTaskName(String name) {
		monitor.setTaskName(name);
	}

	/**
	 * @see {@link ProgressMonitor#subTask(String)}
	 */
	public void subTask(String name) {
		monitor.subTask(name);
	}

	/**
	 * @see {@link ProgressMonitor#worked(int)}
	 */
	public void worked(int work) {
		monitor.worked(work);
	}
}
