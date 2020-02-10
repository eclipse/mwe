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
package org.eclipse.emf.mwe.core.debug.processing;

import java.util.List;

import org.eclipse.emf.mwe.core.debug.model.NameValuePair;
import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;

/**
 * An adapter to the <code>DebugMonitor</code> that handle all element type specific activities on the runtime
 * side.<br>
 * That is process specific decisions and syntax element and variable normalisation.
 * 
 */
public interface ElementAdapter {

	/**
	 * returns true, if the implementation handles the element type
	 * 
	 * @param element the element that is going to be debugged
	 * @return true, if this class handles the element type
	 */
	public boolean canHandle(Object element);

	/**
	 * this method is called from the DebugMonitor prior to all other suspension activities (e.g. breakpoint
	 * check, subroutine level check)<br>
	 * this provides the opportunity to handle specific elements individually<br>
	 * Normal return value should be true<br>
	 * 
	 * @param element the element that is going to be debugged
	 * @return whether or not to suspend the debugger process for the element
	 */
	public boolean shallHandle(Object element);

	/**
	 * this method is called from the DebugMonitor after all other suspension activities (e.g. breakpoint check,
	 * subroutine level check)<br>
	 * this provides the opportunity for a last call by the adapter.<br>
	 * Implementations can *avoid* suspension, although it would suspend otherwise, if the return value is set to
	 * false here
	 * 
	 * @param element the element that is going to be debugged
	 * @param flag one of the values <code>IProcessHandler.PUSH</code> or <code>IProcessHandler.POP</code>
	 * @return whether or not to suspend the debugger process for the element
	 */
	public boolean shallSuspend(Object element, int flag);

	/**
	 * computes a SyntaxElement for a specific element type<br>
	 * the containerName should be the name of the underlying file name<br>
	 * the element name should be the name of the surrounding element (e.g. in Java we highlight the line to be
	 * debugged, but show the surrounding method name in the Launch view)<br>
	 * start, end and line should point to the text that shall be highlighted for the element
	 * 
	 * @param element the element that is going to be debugged
	 * @return a SyntaxElement that contains the information to be shown in the debugger views in a common
	 *         neutral way
	 */
	public SyntaxElement createElement(Object element);

	/**
	 * Returns true if the syntax element should be appended to callstack.
	 * @param element element to be checked.
	 * @return true if the element will be added to callstack.
	 */
	public boolean shallAddToCallStack(Object element);
	
	/**
	 * returns whether the element has a body and debugger shall stop again at the end of the execution of that
	 * element
	 * 
	 * @param element the element that is debugged currently
	 * @return whether the element has a body
	 */
	public boolean isSurroundingElement(Object element);

	/**
	 * computes a SyntaxElement for a surrounding element representing the end position to be highlighted before
	 * returning<br>
	 * the containerName should be the name of the file that holds the element<br>
	 * the element name should be a description of the end element<br>
	 * start, end and line should point to the end text to be highlighted
	 * 
	 * @param element the element that is going to be debugged
	 * @return a SyntaxElement that contains the information to be shown in the debugger views in a common
	 *         neutral way
	 */
	public SyntaxElement createEndElementTO(Object element);

	/**
	 * find the element that corresponds to the given syntax element information
	 * 
	 * @param se the syntax element transfer object
	 * @param flag 
	 * @param actual 
	 * @return the corresponding element
	 */
	public Object findElement(SyntaxElement se, Object actual, int flag);

	/**
	 * collect all available variables for a given element. With this method only the variables themselfs are
	 * collected, not their members.<br>
	 * Implementations must consider that <code>element</code>can be both a syntax element or an arbitrary java
	 * element to collect the member variables from!!
	 * 
	 * @param element the current element
	 * @return a name/value list that contains the variables
	 */
	public List<NameValuePair> getVariables(Object element);

	/**
	 * compute the string representation of the element ready to display in the variables detail view.
	 * 
	 * @param element the element to be considered
	 * @return the String representation of this element
	 */
	public String getVariableDetailRep(Object element);

	/**
	 * compute a shorter string representation of the element ready to display in the variables view.
	 * 
	 * @param element the element to be considered
	 * @return a string representation of this element
	 */
	public String getVariableSimpleRep(Object element);

	/**
	 * check if the variable representation of this element shall show members
	 * 
	 * @param element the element to be considered
	 * @return the decision
	 */
	public boolean checkVariableHasMembers(Object element);

	/**
	 * set the current execution context<br>
	 * the context should be cached and can be used to collect information about elements
	 * 
	 * @param context the context
	 */
	public void setContext(Object context);

	public Object getContext();

	/**
	 * a unique type must be provided for each implementation
	 * 
	 * @return the adapterType
	 */
	public String getAdapterType();

}
