/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.common.editor.codecompletion.AbstractProposalProvider;
import org.eclipse.xtext.ui.common.editor.codecompletion.IProposalProvider;

/**
 * Represents a generated, default implementation of interface {@link IProposalProvider}.
 * 
 * In addition to the declared methods, the framework tries to call grammar dependent methods for assignments using reflection.
 * The signature of such methods invoked reflectively follows the following pattern:
 * 
 * public List<ICompletionProposal> complete[Typename][featureName](Assignment ele, EObject model, String prefix)
 * 
 * <b>Example</b>
 *  Given the following grammar :
 *  <code>
 *  RuleA returns MyType :
 *  	"myType" name=ID;
 *  </code>
 *
 * One could provide the following method in an implementation of this interface:
 *  <code>
 * 	public List<ICompletionProposal> completeMyTypeName(Assignment ele, EObject model, String prefix, IDocument doc) {...}
 *  </code>
 *  Note that if you have generated Java classes for your domain model (meta model) you can alternatively declare the second parameter using 
 *  a specific type:
 *  <code>
 * 	public List<ICompletionProposal> completeMyTypeName(Assignment ele, MyType model, String prefix, IDocument doc) {...}
 *  </code>
 *   
 */
public class MWEGenProposalProvider  extends AbstractProposalProvider {
	// constants
	private static final String UI_PLUGIN_ID  = "org.eclipse.emf.mwe.di.ui";

	
	public List<? extends ICompletionProposal> completeFileImports(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFileImports feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeFileProperties(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFileProperties feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeFileValue(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFileValue feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeJavaImportJavaImport(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeJavaImportJavaImport feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeJavaImportWildcard(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeJavaImportWildcard feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeGenericImportValue(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeGenericImportValue feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"\"GenericImportValue\"", offset));		
	}
	
	public List<? extends ICompletionProposal> completeLocalVariableName(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeLocalVariableName feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"LocalVariableName", offset));
	}
	
	public List<? extends ICompletionProposal> completeLocalVariableValue(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeLocalVariableValue feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completePropertiesFileImportFile(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completePropertiesFileImportFile feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"\"PropertiesFileImportFile\"", offset));		
	}
	
	public List<? extends ICompletionProposal> completeSimpleValueValue(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeSimpleValueValue feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"\"SimpleValueValue\"", offset));		
	}
	
	public List<? extends ICompletionProposal> completeComplexValueClassName(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeComplexValueClassName feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeComplexValueId(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeComplexValueId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"ComplexValueId", offset));
	}
	
	public List<? extends ICompletionProposal> completeComplexValueFooBar(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeComplexValueFooBar feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeComplexValueAssignments(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeComplexValueAssignments feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeWorkflowRefUri(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeWorkflowRefUri feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"\"WorkflowRefUri\"", offset));		
	}
	
	public List<? extends ICompletionProposal> completeWorkflowRefAssignments(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeWorkflowRefAssignments feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeIdRefId(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeIdRefId feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"IdRefId", offset));
	}
	
	public List<? extends ICompletionProposal> completeAssignmentFeature(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeAssignmentFeature feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"AssignmentFeature", offset));
	}
	
	public List<? extends ICompletionProposal> completeAssignmentOperator(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeAssignmentOperator feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeAssignmentValue(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeAssignmentValue feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.emptyList();
	}
	
	public List<? extends ICompletionProposal> completeQualifiedNameParts(Assignment assignment, EObject model, String prefix, IDocument doc,int offset) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeQualifiedNameParts feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ prefix.trim() + "'");
		}
		return Collections.singletonList(createCompletionProposal(assignment,model,"QualifiedNameParts", offset));
	}
	
	
    
    @Override
	protected String getDefaultImageFilePath() {
		return "icons/editor.gif";
	}

	@Override
	protected String getPluginId() {
		return UI_PLUGIN_ID;
	}
}
