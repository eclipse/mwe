/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowLogResetterValidator.java,v 1.1 2009/04/10 05:36:57 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.runtime.validation;

import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;

/**
 * A sample validator interface for {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogResetter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WorkflowLogResetterValidator
{
	boolean validate();

	boolean validateContext(WorkflowContext value);
}