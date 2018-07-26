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
	@Override
	public void beginTask(String name, int totalWork) {
		monitor.beginTask(name, totalWork);
	}

	/**
	 * @see {@link ProgressMonitor#done(ProgressMonitor)}
	 */
	@Override
	public void done() {
		monitor.done();
	}

	/**
	 * @see {@link ProgressMonitor#internalWorked(double)}
	 */
	@Override
	public void internalWorked(double work) {
		monitor.internalWorked(work);
	}

	/**
	 * @see {@link ProgressMonitor#isCanceled()}
	 */
	@Override
	public boolean isCanceled() {
		return monitor.isCanceled();
	}

	@Override
	public void started(Object element, Object context){
	}

	@Override
	public void finished(Object element, Object context){
		
	}

	/**
	 * @see {@link ProgressMonitor#postTask(Object, Object)}
	 */
	@Override
	public void postTask(Object element, Object context) {
	}

	/**
	 * @see {@link ProgressMonitor#preTask(Object, Object)}
	 */
	@Override
	public void preTask(Object element, Object context) {
	}

	/**
	 * @see {@link ProgressMonitor#setCanceled(boolean)}
	 */
	@Override
	public void setCanceled(boolean value) {
		monitor.setCanceled(value);
	}

	/**
	 * @see {@link ProgressMonitor#beginTask(String)}
	 */
	@Override
	public void setTaskName(String name) {
		monitor.setTaskName(name);
	}

	/**
	 * @see {@link ProgressMonitor#subTask(String)}
	 */
	@Override
	public void subTask(String name) {
		monitor.subTask(name);
	}

	/**
	 * @see {@link ProgressMonitor#worked(int)}
	 */
	@Override
	public void worked(int work) {
		monitor.worked(work);
	}
}
