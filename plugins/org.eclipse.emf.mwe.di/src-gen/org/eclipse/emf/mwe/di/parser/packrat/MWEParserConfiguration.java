/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parser.packrat;

import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumer;

import org.eclipse.xtext.builtin.parser.packrat.XtextBuiltinParserConfiguration; 

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEFileConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEImportConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEJavaImportConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEGenericImportConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEPropertyConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWELocalVariableConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEPropertiesFileImportConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEValueConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWESimpleValueConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEAssignableConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEComplexValueConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEWorkflowRefConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEIdRefConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEAssignmentConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEQualifiedNameConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinIDConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinINTConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinSTRINGConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinML_COMMENTConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinSL_COMMENTConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinWSConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinANY_OTHERConsumer;

@SuppressWarnings("unused")
public class MWEParserConfiguration extends AbstractParserConfiguration {

	private XtextBuiltinParserConfiguration xtextBuiltinConfiguration; 

    private MWEFileConsumer fileConsumer;
    private MWEImportConsumer importConsumer;
    private MWEJavaImportConsumer javaImportConsumer;
    private MWEGenericImportConsumer genericImportConsumer;
    private MWEPropertyConsumer propertyConsumer;
    private MWELocalVariableConsumer localVariableConsumer;
    private MWEPropertiesFileImportConsumer propertiesFileImportConsumer;
    private MWEValueConsumer valueConsumer;
    private MWESimpleValueConsumer simpleValueConsumer;
    private MWEAssignableConsumer assignableConsumer;
    private MWEComplexValueConsumer complexValueConsumer;
    private MWEWorkflowRefConsumer workflowRefConsumer;
    private MWEIdRefConsumer idRefConsumer;
    private MWEAssignmentConsumer assignmentConsumer;
    private MWEQualifiedNameConsumer qualifiedNameConsumer;

	public MWEParserConfiguration(IInternalParserConfiguration configuration) {
		super(configuration);
		this.xtextBuiltinConfiguration = new XtextBuiltinParserConfiguration(configuration);
	}

	public MWEFileConsumer getRootConsumer() {
		return fileConsumer;
	} 

	public void createNonTerminalConsumers() {
		getXtextBuiltinConfiguration().createNonTerminalConsumers();
		fileConsumer = new MWEFileConsumer(
    		this, null
    	);
		importConsumer = new MWEImportConsumer(
    		this, null
    	);
		javaImportConsumer = new MWEJavaImportConsumer(
    		this, null
    	);
		genericImportConsumer = new MWEGenericImportConsumer(
    		this, null
    	);
		propertyConsumer = new MWEPropertyConsumer(
    		this, null
    	);
		localVariableConsumer = new MWELocalVariableConsumer(
    		this, null
    	);
		propertiesFileImportConsumer = new MWEPropertiesFileImportConsumer(
    		this, null
    	);
		valueConsumer = new MWEValueConsumer(
    		this, null
    	);
		simpleValueConsumer = new MWESimpleValueConsumer(
    		this, null
    	);
		assignableConsumer = new MWEAssignableConsumer(
    		this, null
    	);
		complexValueConsumer = new MWEComplexValueConsumer(
    		this, null
    	);
		workflowRefConsumer = new MWEWorkflowRefConsumer(
    		this, null
    	);
		idRefConsumer = new MWEIdRefConsumer(
    		this, null
    	);
		assignmentConsumer = new MWEAssignmentConsumer(
    		this, null
    	);
		qualifiedNameConsumer = new MWEQualifiedNameConsumer(
    		this, null
    	);
	}
	
	public void createTerminalConsumers() {
		getXtextBuiltinConfiguration().createTerminalConsumers();
	}
	
	public void configureConsumers() {
		getFileConsumer().setComplexValueConsumer(getComplexValueConsumer());
		getFileConsumer().setImportConsumer(getImportConsumer());
		getFileConsumer().setPropertyConsumer(getPropertyConsumer());

		getImportConsumer().setGenericImportConsumer(getGenericImportConsumer());
		getImportConsumer().setJavaImportConsumer(getJavaImportConsumer());

		getJavaImportConsumer().setQualifiedNameConsumer(getQualifiedNameConsumer());

		getGenericImportConsumer().setStringConsumer(getStringConsumer());

		getPropertyConsumer().setLocalVariableConsumer(getLocalVariableConsumer());
		getPropertyConsumer().setPropertiesFileImportConsumer(getPropertiesFileImportConsumer());

		getLocalVariableConsumer().setIdConsumer(getIdConsumer());
		getLocalVariableConsumer().setValueConsumer(getValueConsumer());

		getPropertiesFileImportConsumer().setStringConsumer(getStringConsumer());

		getValueConsumer().setComplexValueConsumer(getComplexValueConsumer());
		getValueConsumer().setIdRefConsumer(getIdRefConsumer());
		getValueConsumer().setSimpleValueConsumer(getSimpleValueConsumer());
		getValueConsumer().setWorkflowRefConsumer(getWorkflowRefConsumer());

		getSimpleValueConsumer().setStringConsumer(getStringConsumer());

		getAssignableConsumer().setComplexValueConsumer(getComplexValueConsumer());
		getAssignableConsumer().setWorkflowRefConsumer(getWorkflowRefConsumer());

		getComplexValueConsumer().setAssignmentConsumer(getAssignmentConsumer());
		getComplexValueConsumer().setIdConsumer(getIdConsumer());
		getComplexValueConsumer().setQualifiedNameConsumer(getQualifiedNameConsumer());

		getWorkflowRefConsumer().setAssignmentConsumer(getAssignmentConsumer());
		getWorkflowRefConsumer().setStringConsumer(getStringConsumer());

		getIdRefConsumer().setIdConsumer(getIdConsumer());

		getAssignmentConsumer().setIdConsumer(getIdConsumer());
		getAssignmentConsumer().setValueConsumer(getValueConsumer());

		getQualifiedNameConsumer().setIdConsumer(getIdConsumer());

		getJavaImportConsumer().setKeyword$4$Delimiter(MWEDelimiters.keyword$21$Delimiter);
		getJavaImportConsumer().setKeyword$8$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getJavaImportConsumer().setKeyword$10$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getJavaImportConsumer().setKeyword$11$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getGenericImportConsumer().setKeyword$3$Delimiter(MWEDelimiters.keyword$21$Delimiter);
		getGenericImportConsumer().setKeyword$6$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getGenericImportConsumer().setRuleCall$5$Delimiter(MWEDelimiters.ruleCall$35$Delimiter);
		getLocalVariableConsumer().setKeyword$4$Delimiter(MWEDelimiters.keyword$21$Delimiter);
		getLocalVariableConsumer().setKeyword$8$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getLocalVariableConsumer().setKeyword$11$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getLocalVariableConsumer().setRuleCall$6$Delimiter(MWEDelimiters.ruleCall$49$Delimiter);
		getPropertiesFileImportConsumer().setKeyword$4$Delimiter(MWEDelimiters.keyword$21$Delimiter);
		getPropertiesFileImportConsumer().setKeyword$5$Delimiter(MWEDelimiters.keyword$21$Delimiter);
		getPropertiesFileImportConsumer().setKeyword$8$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getPropertiesFileImportConsumer().setRuleCall$7$Delimiter(MWEDelimiters.ruleCall$35$Delimiter);
		getSimpleValueConsumer().setRuleCall$2$Delimiter(MWEDelimiters.ruleCall$35$Delimiter);
		getComplexValueConsumer().setKeyword$8$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getComplexValueConsumer().setKeyword$12$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getComplexValueConsumer().setKeyword$15$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getComplexValueConsumer().setRuleCall$10$Delimiter(MWEDelimiters.ruleCall$49$Delimiter);
		getWorkflowRefConsumer().setKeyword$5$Delimiter(MWEDelimiters.keyword$21$Delimiter);
		getWorkflowRefConsumer().setKeyword$8$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getWorkflowRefConsumer().setKeyword$11$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getWorkflowRefConsumer().setRuleCall$7$Delimiter(MWEDelimiters.ruleCall$35$Delimiter);
		getIdRefConsumer().setRuleCall$2$Delimiter(MWEDelimiters.ruleCall$49$Delimiter);
		getAssignmentConsumer().setKeyword$8$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getAssignmentConsumer().setKeyword$9$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getAssignmentConsumer().setKeyword$12$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getAssignmentConsumer().setRuleCall$5$Delimiter(MWEDelimiters.ruleCall$49$Delimiter);
		getQualifiedNameConsumer().setKeyword$6$Delimiter(MWEDelimiters.keyword$25$Delimiter);
		getQualifiedNameConsumer().setRuleCall$3$Delimiter(MWEDelimiters.ruleCall$49$Delimiter);
		getQualifiedNameConsumer().setRuleCall$8$Delimiter(MWEDelimiters.ruleCall$49$Delimiter);
	}
	
	// TODO collect superGrammars transitive
	public XtextBuiltinParserConfiguration getXtextBuiltinConfiguration() {
		return xtextBuiltinConfiguration;
	} 
	
    public MWEFileConsumer getFileConsumer() {
    	return fileConsumer;
    }

    public MWEImportConsumer getImportConsumer() {
    	return importConsumer;
    }

    public MWEJavaImportConsumer getJavaImportConsumer() {
    	return javaImportConsumer;
    }

    public MWEGenericImportConsumer getGenericImportConsumer() {
    	return genericImportConsumer;
    }

    public MWEPropertyConsumer getPropertyConsumer() {
    	return propertyConsumer;
    }

    public MWELocalVariableConsumer getLocalVariableConsumer() {
    	return localVariableConsumer;
    }

    public MWEPropertiesFileImportConsumer getPropertiesFileImportConsumer() {
    	return propertiesFileImportConsumer;
    }

    public MWEValueConsumer getValueConsumer() {
    	return valueConsumer;
    }

    public MWESimpleValueConsumer getSimpleValueConsumer() {
    	return simpleValueConsumer;
    }

    public MWEAssignableConsumer getAssignableConsumer() {
    	return assignableConsumer;
    }

    public MWEComplexValueConsumer getComplexValueConsumer() {
    	return complexValueConsumer;
    }

    public MWEWorkflowRefConsumer getWorkflowRefConsumer() {
    	return workflowRefConsumer;
    }

    public MWEIdRefConsumer getIdRefConsumer() {
    	return idRefConsumer;
    }

    public MWEAssignmentConsumer getAssignmentConsumer() {
    	return assignmentConsumer;
    }

    public MWEQualifiedNameConsumer getQualifiedNameConsumer() {
    	return qualifiedNameConsumer;
    }

    public XtextBuiltinIDConsumer getIdConsumer() {
    	return getXtextBuiltinConfiguration().getIdConsumer();
    }

    public XtextBuiltinINTConsumer getIntConsumer() {
    	return getXtextBuiltinConfiguration().getIntConsumer();
    }

    public XtextBuiltinSTRINGConsumer getStringConsumer() {
    	return getXtextBuiltinConfiguration().getStringConsumer();
    }

    public XtextBuiltinML_COMMENTConsumer getMlCommentConsumer() {
    	return getXtextBuiltinConfiguration().getMlCommentConsumer();
    }

    public XtextBuiltinSL_COMMENTConsumer getSlCommentConsumer() {
    	return getXtextBuiltinConfiguration().getSlCommentConsumer();
    }

    public XtextBuiltinWSConsumer getWsConsumer() {
    	return getXtextBuiltinConfiguration().getWsConsumer();
    }

    public XtextBuiltinANY_OTHERConsumer getAnyOtherConsumer() {
    	return getXtextBuiltinConfiguration().getAnyOtherConsumer();
    }


	@Override
	public ITerminalConsumer[] getInitialHiddenTerminals() {
		return getXtextBuiltinConfiguration().getInitialHiddenTerminals();
	}
	
}
