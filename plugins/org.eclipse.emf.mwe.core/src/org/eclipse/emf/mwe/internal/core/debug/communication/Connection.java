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
package org.eclipse.emf.mwe.internal.core.debug.communication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;

import org.eclipse.emf.mwe.internal.core.debug.communication.packages.AbstractPackage;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.HandshakePackage;

/**
 * This class implements a socket connection model. "Packages" (units of information) can be transfered between two
 * different virtual machines. During the initialisation of a socket connection a reader and a writer thread are
 * established. This class can be used both on the sender and receiver side.
 */
public class Connection {

	private ServerSocket ssocket;

	private Socket socket;

	private DataOutputStream out;

	private DataInputStream in;

	private PackageSender sender;

	private PackageReceiver receiver;

	// -------------------------------------------------------------------------
	// *the* main operation methods

	public AbstractPackage listenForPackage(final Class<? extends AbstractPackage> type) throws InterruptedIOException {
		return receiver.getPackage(type, -1);
	}

	public AbstractPackage listenForPackage(final Class<? extends AbstractPackage> type, final int refId) throws InterruptedIOException {
		return receiver.getPackage(type, refId, -1);
	}

	public int sendPackage(final AbstractPackage packet) throws IOException {
		if (sender == null) {
			return -1;
		}
		return sender.sendPackage(packet);
	}

	// -------------------------------------------------------------------------
	// socket communication handling

	/**
	 * create a new <code>ServerSocket</code>.
	 * 
	 * @param port the communication port
	 * @throws IOException
	 */
	public void startListeningSocket(final int port) throws IOException {
		ssocket = new ServerSocket(port);
	}

	/**
	 * the server listens for a client to connect, creates new reader and writer threads and sends a first
	 * handshake packet to test the communication
	 * 
	 * @param timeout
	 * @throws IOException
	 */
	public void accept(final int timeout) throws IOException {
		ssocket.setSoTimeout(timeout);
		// will throw SocketTimeoutException, if nobody connects
		socket = ssocket.accept();
		establishReaderAndWriter();
		if (!writeHandshake()) {
			throw new IOException("handshake failed");
		}
	}

	/**
	 * the client establishes the connection here, creates new reader and writer threads and waits for a handshake
	 * packet to be received from the server
	 * 
	 * @param port
	 * @throws IOException
	 */
	public void connect(final int port) throws IOException {
		socket = new Socket("localhost", port);
		establishReaderAndWriter();
		replyHandshake();
	}

	/**
	 * @return if the socket connection is still active
	 */
	public boolean isConnected() {
		return (socket != null) && !socket.isClosed();
	}

	/**
	 * close and dispose the socket and the (possibly waiting) sender thread
	 */
	public synchronized void close() {
		try {
			if (sender != null) {
				sender.close();
				sender = null;
			}

			if (socket != null) {
				socket.close();
				socket = null;
			}
			
			if(out!=null) { 
				out.close();
				out = null;
			}
			
			if(in!=null) {
				in.close();
				in = null;
			}
			
			if(ssocket != null) {
				ssocket.close();
				ssocket = null;
			}
		} catch (Exception e) {
			// IOExceptions and NullPointerExceptions may occur
		}
	}

	// -------------------------------------------------------------------------
	// the real sending and receiving of packages to be called from PackageReceiver and PackageSender only

	protected AbstractPackage readPackage() throws IOException {
		String className = in.readUTF();
		AbstractPackage packet = instantiatePackage(className);
		packet.readContent(in);
		// System.out.println(Thread.currentThread().getName() + "-RECEIVED-: " + packet);
		return packet;
	}

	
	@SuppressWarnings("unchecked")
	private AbstractPackage instantiatePackage(final String className) throws IOException {
		Class<? extends AbstractPackage> packetClass = null;
		AbstractPackage packet = null;
		String msg = null;
		try {
			packetClass = (Class<? extends AbstractPackage>) Class.forName(className);
		} catch (ClassNotFoundException e) {
			msg = "Couldn't find " + className + " in the classpath.";
		}

		if (msg == null && packetClass != null) {
			Constructor<?> c = packetClass.getConstructors()[0];
			Class<?>[] parmTypes = c.getParameterTypes();
			Object[] initargs = new Object[parmTypes.length];
			for (int i = 0; i < parmTypes.length; i++) {
				if (parmTypes[i] == int.class) {
					initargs[i] = 0;
				}
			}
			try {
				packet = (AbstractPackage) c.newInstance(initargs);
			} catch (IllegalArgumentException e) {
				msg = "Couldn't instantiate " + c + " : " + e;
			} catch (InstantiationException e) {
				msg = "Couldn't instantiate " + c + " : " + e;
			} catch (IllegalAccessException e) {
				msg = "Couldn't instantiate " + c + " : " + e;
			} catch (InvocationTargetException e) {
				msg = "Problem during instantiation of " + c + " : " + e.getTargetException();
			}
		}

		if (msg != null) {
			System.err.println(msg);
			throw new IOException(msg);
		}
		return packet;
	}

	protected void writePackage(final AbstractPackage packet) throws IOException {
		out.writeUTF(packet.getClass().getName());
		packet.writeContent(out);
		// System.out.println(Thread.currentThread().getName() + "-SENT-----: " + packet);
	}

	// ********************************************************* private methods

	private void establishReaderAndWriter() throws IOException {
		out = new DataOutputStream(socket.getOutputStream());
		in = new DataInputStream(socket.getInputStream());

		// start receiver and sender in extra threads
		receiver = PackageReceiver.newPackageReceiver(this);
		sender = PackageSender.newPackageSender(this);

	}

	private boolean writeHandshake() throws IOException {
		AbstractPackage packet = new HandshakePackage();
		sendPackage(packet);
		return listenForPackage(HandshakePackage.class).getClass().equals(HandshakePackage.class);
	}

	private void replyHandshake() throws IOException {
		if (listenForPackage(HandshakePackage.class).getClass().equals(HandshakePackage.class)) {
			sendPackage(new HandshakePackage());
		} else {
			throw new IOException("handshake failed");
		}
	}

}
