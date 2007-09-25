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
import org.eclipse.emf.mwe.internal.core.debug.communication.packets.AbstractPacket;

/**
 * This Runnable listens for incoming packets asynchroniously and keeps them, until they are required by
 * customers.
 * 
 * @author Clemens Kadura (zAJKa)
 */
public class PacketReceiver implements Runnable {
	private ArrayList<AbstractPacket> receivedPackets;
	
	private static final Log logger = LogFactory.getLog(PacketReceiver.class);

	private Connection connection;

	private boolean interrupt = false;

	private Exception exception;

	/**
	 * create a new instance and starts the runnable in a new thread
	 * 
	 * @param connection the <code>Connection</code> that controls this data receiver.
	 * @return the instance
	 */
	public static PacketReceiver newPacketReceiver(Connection connection) {
		PacketReceiver receiver = new PacketReceiver(connection);
		Thread thread = new Thread(receiver, "PacketReceiver");
		thread.setDaemon(true);
		thread.start();
		return receiver;
	}

	private PacketReceiver(Connection connection) {
		this.connection = connection;
		receivedPackets = new ArrayList<AbstractPacket>();
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
	public AbstractPacket getPacket(Class<? extends AbstractPacket> type, long timeToWait) throws InterruptedIOException {
		return getPacket(type, 0, timeToWait);
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
	public AbstractPacket getPacket(Class<? extends AbstractPacket> type, int refId, long timeToWait) throws InterruptedIOException {
		AbstractPacket packet = null;

		//sync to be able to wait
		synchronized (receivedPackets) {
			long remainingTime = timeToWait;
			long timeBeforeWait;

			// Wait until type is available.
			while ((packet = popReceivedPacket(type, refId)) == null && connection.isConnected() && !interrupt
					&& (timeToWait < 0 || remainingTime > 0)) {
				timeBeforeWait = System.currentTimeMillis();
				try {
					waitForPacketAvailable(remainingTime);
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
		synchronized (receivedPackets) {
			receivedPackets.notifyAll();
		}
	}

	private void waitForPacketAvailable(long timeToWait) throws InterruptedException {
		if (timeToWait == 0)
			return;
		else if (timeToWait < 0) {
			receivedPackets.wait();
		} else {
			receivedPackets.wait(timeToWait);
		}
	}

	/**
	 * Returns the first packet of the specified type and removes from the packet list.
	 */
	private synchronized AbstractPacket popReceivedPacket(Class<? extends AbstractPacket> type, int refId) {
		for (AbstractPacket packet : receivedPackets) {
			if (!type.isInstance(packet) || (refId != 0 && packet.refId != refId))
				continue;
			receivedPackets.remove(packet);
			return packet;
		}
		return null;
	}

	private void checkForException(AbstractPacket packet) throws InterruptedIOException {
		if (packet != null)
			return;
		if (exception != null && !(exception instanceof IOException))
			// print stack trace if it is not an IOException
			logger.error(exception.getMessage(), exception);
		if (interrupt)
			throw new InterruptedIOException("packet receiver is going to close");
		if (exception != null)
			throw new InterruptedIOException(exception.getMessage());
		throw new InterruptedIOException("timeout reading a packet");
	}

	// ******************************************************** runnable methods

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			while (!interrupt && connection.isConnected()) {
				readAvailablePacket();
			}
		} catch (Exception e) {
			exception = e;
			close();
		}
	}

	private void readAvailablePacket() throws IOException {
		addPacketToList(connection.readPacket());
	}

	private void addPacketToList(AbstractPacket packet) {
		synchronized (receivedPackets) {
			receivedPackets.add(packet);
			receivedPackets.notifyAll();
		}
	}

}
