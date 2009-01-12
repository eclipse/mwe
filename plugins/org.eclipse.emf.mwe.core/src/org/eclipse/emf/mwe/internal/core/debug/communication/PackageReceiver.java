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
package org.eclipse.emf.mwe.internal.core.debug.communication;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.AbstractPackage;

/**
 * This Runnable listens for incoming packages asynchroniously and keeps them, until they are required by
 * customers.
 */
public class PackageReceiver implements Runnable {
	private final ArrayList<AbstractPackage> receivedPackages;
	
	private static final Log logger = LogFactory.getLog(PackageReceiver.class);

	private final Connection connection;

	private boolean interrupt = false;

	private Exception exception;

	/**
	 * create a new instance and starts the runnable in a new thread
	 * 
	 * @param connection the <code>Connection</code> that controls this data receiver.
	 * @return the instance
	 */
	public static PackageReceiver newPackageReceiver(final Connection connection) {
		PackageReceiver receiver = new PackageReceiver(connection);
		Thread thread = new Thread(receiver, "PackageReceiver");
		thread.setDaemon(true);
		thread.start();
		return receiver;
	}

	private PackageReceiver(final Connection connection) {
		this.connection = connection;
		receivedPackages = new ArrayList<AbstractPackage>();
	}

	/**
	 * Get a packet of the requested type, wait the specified time until it arrives, if time is negative, wait
	 * until socket will be closed
	 * 
	 * @param type the packet type
	 * @param timeToWait until timeout
	 * @return the received packet
	 * @throws InterruptedIOException
	 */
	public AbstractPackage getPackage(final Class<? extends AbstractPackage> type, final long timeToWait) throws InterruptedIOException {
		return getPackage(type, 0, timeToWait);
	}

	/**
	 * Get a packet of the requested type with a specific id, wait the specified time until it arrives, if time is
	 * negative, wait until socket will be closed
	 * 
	 * @param type the packet type
	 * @param refId the id the receiving packet must have
	 * @param timeToWait until timeout
	 * @return the received packet
	 * @throws InterruptedIOException
	 * @throws InterruptedIOException
	 */
	public AbstractPackage getPackage(final Class<? extends AbstractPackage> type, final int refId, final long timeToWait) throws InterruptedIOException {
		AbstractPackage packet = null;

		//sync to be able to wait
		synchronized (receivedPackages) {
			long remainingTime = timeToWait;
			long timeBeforeWait;

			// Wait until type is available.
			while (((packet = popReceivedPackage(type, refId)) == null) && connection.isConnected() && !interrupt
					&& ((timeToWait < 0) || (remainingTime > 0))) {
				timeBeforeWait = System.currentTimeMillis();
				try {
					waitForPackageAvailable(remainingTime);
				} catch (InterruptedException e) {
				}
				if (timeToWait >= 0) {
					remainingTime -= System.currentTimeMillis() - timeBeforeWait;
				}
			}
		}
		checkForException(packet);
		return packet;
	}

	private void close() {
		interrupt = true;
		synchronized (receivedPackages) {
			receivedPackages.notifyAll();
		}
	}

	private void waitForPackageAvailable(final long timeToWait) throws InterruptedException {
		if (timeToWait == 0) {
			return;
		} else if (timeToWait < 0) {
			receivedPackages.wait();
		} else {
			receivedPackages.wait(timeToWait);
		}
	}

	/**
	 * Returns the first packet of the specified type and removes from the packet list.
	 */
	private synchronized AbstractPackage popReceivedPackage(final Class<? extends AbstractPackage> type, final int refId) {
		for (AbstractPackage packet : receivedPackages) {
			if (!type.isInstance(packet) || ((refId != 0) && (packet.refId != refId))) {
				continue;
			}
			receivedPackages.remove(packet);
			return packet;
		}
		return null;
	}

	private void checkForException(final AbstractPackage packet) throws InterruptedIOException {
		if (packet != null) {
			return;
		}
		if ((exception != null) && !(exception instanceof IOException)) {
			// print stack trace if it is not an IOException
			logger.error(exception.getMessage(), exception);
		}
		if (interrupt) {
			throw new InterruptedIOException("packet receiver is going to close");
		}
		if (exception != null) {
			throw new InterruptedIOException(exception.getMessage());
		}
		throw new InterruptedIOException("timeout reading a packet");
	}

	// ******************************************************** runnable methods

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			while (!interrupt && connection.isConnected()) {
				readAvailablePackage();
			}
		} catch (Exception e) {
			exception = e;
			close();
		}
	}

	private void readAvailablePackage() throws IOException {
		addPackageToList(connection.readPackage());
	}

	private void addPackageToList(final AbstractPackage packet) {
		synchronized (receivedPackages) {
			receivedPackages.add(packet);
			receivedPackages.notifyAll();
		}
	}

}
