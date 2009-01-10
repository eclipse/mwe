/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.contentassist;

import java.util.List;

import org.eclipse.jface.text.contentassist.ICompletionProposal;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */

public interface IContentProposalComputer {

	List<ICompletionProposal> computeProposals(final int offset);

	boolean isApplicable(int offset);
}
