/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parsetree.reconstr;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.*;
import org.eclipse.xtext.parsetree.reconstr.impl.*;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor.AbstractToken.Solution;


public class MWEParseTreeConstructor extends AbstractParseTreeConstructor {

	protected void internalDoUpdate(EObject obj, String ruleToCall, IParseTreeConstructorCallback callback) {
		Solution t = internalSerialize(obj);
		if(t == null) throw new XtextSerializationException(getDescr(obj), "Couldn't find rule '"+ruleToCall+"'");
		t.getPredecessor().executeAllCallbacks(callback);
		System.out.println("success!");
	}
	
	protected Solution internalSerialize(EObject obj) {
		InstanceDescription inst = getDescr(obj);
		Solution s;
		if((s = new File_Group(inst, null).firstSolution()) != null) return s;
		if((s = new Import_Alternatives(inst, null).firstSolution()) != null) return s;
		if((s = new JavaImport_Group(inst, null).firstSolution()) != null) return s;
		if((s = new GenericImport_Group(inst, null).firstSolution()) != null) return s;
		if((s = new Property_Alternatives(inst, null).firstSolution()) != null) return s;
		if((s = new LocalVariable_Group(inst, null).firstSolution()) != null) return s;
		if((s = new PropertiesFileImport_Group(inst, null).firstSolution()) != null) return s;
		if((s = new Value_Alternatives(inst, null).firstSolution()) != null) return s;
		if((s = new SimpleValue_Assignment_value(inst, null).firstSolution()) != null) return s;
		if((s = new Assignable_Alternatives(inst, null).firstSolution()) != null) return s;
		if((s = new ComplexValue_Group(inst, null).firstSolution()) != null) return s;
		if((s = new WorkflowRef_Group(inst, null).firstSolution()) != null) return s;
		if((s = new IdRef_Assignment_id(inst, null).firstSolution()) != null) return s;
		if((s = new Assignment_Group(inst, null).firstSolution()) != null) return s;
		if((s = new QualifiedName_Group(inst, null).firstSolution()) != null) return s;
		return null;
	}
	
/************ begin Rule File ****************/


protected class File_Group extends GroupToken {
	
	public File_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new File_1_Assignment_value(current, this).firstSolution();
		if(s1 == null) return null;
		return new File_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class File_0_Group extends GroupToken {
	
	public File_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new File_0_1_Assignment_properties(current, this).firstSolution();
		if(s1 == null) return null;
		return new File_0_0_Assignment_imports(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class File_0_0_Assignment_imports extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.0/@terminal");
	protected Object value;
	
	public File_0_0_Assignment_imports(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("imports")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("imports");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("Import")) return null;
		AbstractToken t = new Import_Alternatives(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("File_0_0_Assignment_importsCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call Import
	}
}

protected class File_0_1_Assignment_properties extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public File_0_1_Assignment_properties(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("properties")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("properties");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("Property")) return null;
		AbstractToken t = new Property_Alternatives(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("File_0_1_Assignment_propertiesCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call Property
	}
}


protected class File_1_Assignment_value extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.1/@terminal");
	protected Object value;
	
	public File_1_Assignment_value(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("value")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("value");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("ComplexValue")) return null;
		AbstractToken t = new ComplexValue_Group(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("File_1_Assignment_valueCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call ComplexValue
	}
}


/************ end Rule File ****************/
/************ begin Rule Import ****************/


protected class Import_Alternatives extends GroupToken {
	
	private boolean first = true;

	public Import_Alternatives(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected boolean activateNextSolution() {
		if(first) {
			first = false;
			return true;
		}
		return false;
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Import_1_RuleCall_GenericImport(current, this) : new Import_0_RuleCall_JavaImport(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		return s; 
	}
}

protected class Import_0_RuleCall_JavaImport extends RuleCallToken {
	
	public Import_0_RuleCall_JavaImport(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(JavaImport_Group.class, current)) return null;
		if(!current.isInstanceOf("JavaImport")) return null;
		return new JavaImport_Group(current, this).firstSolution();
	}
}

protected class Import_1_RuleCall_GenericImport extends RuleCallToken {
	
	public Import_1_RuleCall_GenericImport(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(GenericImport_Group.class, current)) return null;
		if(!current.isInstanceOf("GenericImport")) return null;
		return new GenericImport_Group(current, this).firstSolution();
	}
}


/************ end Rule Import ****************/
/************ begin Rule JavaImport ****************/


protected class JavaImport_Group extends GroupToken {
	
	public JavaImport_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new JavaImport_1_Keyword(current, this).firstSolution();
		if(s1 == null) return null;
		return new JavaImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class JavaImport_0_Group extends GroupToken {
	
	public JavaImport_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new JavaImport_0_1_Group(current, this).firstSolution();
		if(s1 == null) return null;
		return new JavaImport_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class JavaImport_0_0_Group extends GroupToken {
	
	public JavaImport_0_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new JavaImport_0_0_1_Assignment_javaImport(current, this).firstSolution();
		if(s1 == null) return null;
		return new JavaImport_0_0_0_Keyword_import(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}


protected class JavaImport_0_0_0_Keyword_import extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	
	public JavaImport_0_0_0_Keyword_import(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}

protected class JavaImport_0_0_1_Assignment_javaImport extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public JavaImport_0_0_1_Assignment_javaImport(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("javaImport")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("javaImport");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("QualifiedName")) return null;
		AbstractToken t = new QualifiedName_Group(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("JavaImport_0_0_1_Assignment_javaImportCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call QualifiedName
	}
}


protected class JavaImport_0_1_Group extends GroupToken {
	
	public JavaImport_0_1_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new JavaImport_0_1_1_Assignment_wildcard(current, this).firstSolution();
		if(s1 == null) return null;
		return new JavaImport_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}


protected class JavaImport_0_1_0_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0");
	
	public JavaImport_0_1_0_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}

protected class JavaImport_0_1_1_Assignment_wildcard extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal");
	protected Object value;
	
	public JavaImport_0_1_1_Assignment_wildcard(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("wildcard")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("wildcard");
		// handling xtext::Keyword
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("JavaImport_0_1_1_Assignment_wildcardCallback(\"xtext::Keyword\", " + value + ")");
		callback.keywordCall(current, (Keyword)element);
	}
}




protected class JavaImport_1_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.1");
	
	public JavaImport_1_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}


/************ end Rule JavaImport ****************/
/************ begin Rule GenericImport ****************/


protected class GenericImport_Group extends GroupToken {
	
	public GenericImport_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new GenericImport_1_Keyword(current, this).firstSolution();
		if(s1 == null) return null;
		return new GenericImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class GenericImport_0_Group extends GroupToken {
	
	public GenericImport_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new GenericImport_0_1_Assignment_value(current, this).firstSolution();
		if(s1 == null) return null;
		return new GenericImport_0_0_Keyword_import(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}


protected class GenericImport_0_0_Keyword_import extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.0");
	
	public GenericImport_0_0_Keyword_import(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}

protected class GenericImport_0_1_Assignment_value extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public GenericImport_0_1_Assignment_value(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("value")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("value");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("GenericImport_0_1_Assignment_valueCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}



protected class GenericImport_1_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.1");
	
	public GenericImport_1_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// This keyword (';') is optional (cardinality == ?) and thereby not serialized.
	}
}


/************ end Rule GenericImport ****************/
/************ begin Rule Property ****************/


protected class Property_Alternatives extends GroupToken {
	
	private boolean first = true;

	public Property_Alternatives(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected boolean activateNextSolution() {
		if(first) {
			first = false;
			return true;
		}
		return false;
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Property_1_RuleCall_PropertiesFileImport(current, this) : new Property_0_RuleCall_LocalVariable(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		return s; 
	}
}

protected class Property_0_RuleCall_LocalVariable extends RuleCallToken {
	
	public Property_0_RuleCall_LocalVariable(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(LocalVariable_Group.class, current)) return null;
		if(!current.isInstanceOf("LocalVariable")) return null;
		return new LocalVariable_Group(current, this).firstSolution();
	}
}

protected class Property_1_RuleCall_PropertiesFileImport extends RuleCallToken {
	
	public Property_1_RuleCall_PropertiesFileImport(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(PropertiesFileImport_Group.class, current)) return null;
		if(!current.isInstanceOf("PropertiesFileImport")) return null;
		return new PropertiesFileImport_Group(current, this).firstSolution();
	}
}


/************ end Rule Property ****************/
/************ begin Rule LocalVariable ****************/


protected class LocalVariable_Group extends GroupToken {
	
	public LocalVariable_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new LocalVariable_1_Keyword(current, this).firstSolution();
		if(s1 == null) return null;
		return new LocalVariable_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class LocalVariable_0_Group extends GroupToken {
	
	public LocalVariable_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new LocalVariable_0_1_Group(current, this).firstSolution();
		if(s1 == null) return null;
		return new LocalVariable_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class LocalVariable_0_0_Group extends GroupToken {
	
	public LocalVariable_0_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new LocalVariable_0_0_1_Assignment_name(current, this).firstSolution();
		if(s1 == null) return null;
		return new LocalVariable_0_0_0_Keyword_var(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}


protected class LocalVariable_0_0_0_Keyword_var extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	
	public LocalVariable_0_0_0_Keyword_var(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}

protected class LocalVariable_0_0_1_Assignment_name extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public LocalVariable_0_0_1_Assignment_name(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("name")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("name");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("LocalVariable_0_0_1_Assignment_nameCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}


protected class LocalVariable_0_1_Group extends GroupToken {
	
	public LocalVariable_0_1_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new LocalVariable_0_1_1_Assignment_value(current, this).firstSolution();
		if(s1 == null) return null;
		return new LocalVariable_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}


protected class LocalVariable_0_1_0_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0");
	
	public LocalVariable_0_1_0_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}

protected class LocalVariable_0_1_1_Assignment_value extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal");
	protected Object value;
	
	public LocalVariable_0_1_1_Assignment_value(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("value")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("value");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("Value")) return null;
		AbstractToken t = new Value_Alternatives(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("LocalVariable_0_1_1_Assignment_valueCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call Value
	}
}




protected class LocalVariable_1_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.1");
	
	public LocalVariable_1_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}


/************ end Rule LocalVariable ****************/
/************ begin Rule PropertiesFileImport ****************/


protected class PropertiesFileImport_Group extends GroupToken {
	
	public PropertiesFileImport_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new PropertiesFileImport_1_Keyword(current, this).firstSolution();
		if(s1 == null) return null;
		return new PropertiesFileImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class PropertiesFileImport_0_Group extends GroupToken {
	
	public PropertiesFileImport_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new PropertiesFileImport_0_1_Assignment_file(current, this).firstSolution();
		if(s1 == null) return null;
		return new PropertiesFileImport_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class PropertiesFileImport_0_0_Group extends GroupToken {
	
	public PropertiesFileImport_0_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new PropertiesFileImport_0_0_1_Keyword_file(current, this).firstSolution();
		if(s1 == null) return null;
		return new PropertiesFileImport_0_0_0_Keyword_var(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}


protected class PropertiesFileImport_0_0_0_Keyword_var extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	
	public PropertiesFileImport_0_0_0_Keyword_var(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}


protected class PropertiesFileImport_0_0_1_Keyword_file extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	
	public PropertiesFileImport_0_0_1_Keyword_file(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}


protected class PropertiesFileImport_0_1_Assignment_file extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public PropertiesFileImport_0_1_Assignment_file(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("file")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("file");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("PropertiesFileImport_0_1_Assignment_fileCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}



protected class PropertiesFileImport_1_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.1");
	
	public PropertiesFileImport_1_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}


/************ end Rule PropertiesFileImport ****************/
/************ begin Rule Value ****************/


protected class Value_Alternatives extends GroupToken {
	
	private boolean first = true;

	public Value_Alternatives(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected boolean activateNextSolution() {
		if(first) {
			first = false;
			return true;
		}
		return false;
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Value_1_RuleCall_WorkflowRef(current, this) : new Value_0_Alternatives(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		return s; 
	}
}

protected class Value_0_Alternatives extends GroupToken {
	
	private boolean first = true;

	public Value_0_Alternatives(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected boolean activateNextSolution() {
		if(first) {
			first = false;
			return true;
		}
		return false;
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Value_0_1_RuleCall_IdRef(current, this) : new Value_0_0_Alternatives(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		return s; 
	}
}

protected class Value_0_0_Alternatives extends GroupToken {
	
	private boolean first = true;

	public Value_0_0_Alternatives(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected boolean activateNextSolution() {
		if(first) {
			first = false;
			return true;
		}
		return false;
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Value_0_0_1_RuleCall_ComplexValue(current, this) : new Value_0_0_0_RuleCall_SimpleValue(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		return s; 
	}
}

protected class Value_0_0_0_RuleCall_SimpleValue extends RuleCallToken {
	
	public Value_0_0_0_RuleCall_SimpleValue(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(SimpleValue_Assignment_value.class, current)) return null;
		if(!current.isInstanceOf("SimpleValue")) return null;
		return new SimpleValue_Assignment_value(current, this).firstSolution();
	}
}

protected class Value_0_0_1_RuleCall_ComplexValue extends RuleCallToken {
	
	public Value_0_0_1_RuleCall_ComplexValue(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(ComplexValue_Group.class, current)) return null;
		if(!current.isInstanceOf("ComplexValue")) return null;
		return new ComplexValue_Group(current, this).firstSolution();
	}
}


protected class Value_0_1_RuleCall_IdRef extends RuleCallToken {
	
	public Value_0_1_RuleCall_IdRef(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(IdRef_Assignment_id.class, current)) return null;
		if(!current.isInstanceOf("IdRef")) return null;
		return new IdRef_Assignment_id(current, this).firstSolution();
	}
}


protected class Value_1_RuleCall_WorkflowRef extends RuleCallToken {
	
	public Value_1_RuleCall_WorkflowRef(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(WorkflowRef_Group.class, current)) return null;
		if(!current.isInstanceOf("WorkflowRef")) return null;
		return new WorkflowRef_Group(current, this).firstSolution();
	}
}


/************ end Rule Value ****************/
/************ begin Rule SimpleValue ****************/


protected class SimpleValue_Assignment_value extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8/@alternatives/@terminal");
	protected Object value;
	
	public SimpleValue_Assignment_value(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("value")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("value");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("SimpleValue_Assignment_valueCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}

/************ end Rule SimpleValue ****************/
/************ begin Rule Assignable ****************/


protected class Assignable_Alternatives extends GroupToken {
	
	private boolean first = true;

	public Assignable_Alternatives(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected boolean activateNextSolution() {
		if(first) {
			first = false;
			return true;
		}
		return false;
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Assignable_1_RuleCall_WorkflowRef(current, this) : new Assignable_0_RuleCall_ComplexValue(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		return s; 
	}
}

protected class Assignable_0_RuleCall_ComplexValue extends RuleCallToken {
	
	public Assignable_0_RuleCall_ComplexValue(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(ComplexValue_Group.class, current)) return null;
		if(!current.isInstanceOf("ComplexValue")) return null;
		return new ComplexValue_Group(current, this).firstSolution();
	}
}

protected class Assignable_1_RuleCall_WorkflowRef extends RuleCallToken {
	
	public Assignable_1_RuleCall_WorkflowRef(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(checkForRecursion(WorkflowRef_Group.class, current)) return null;
		if(!current.isInstanceOf("WorkflowRef")) return null;
		return new WorkflowRef_Group(current, this).firstSolution();
	}
}


/************ end Rule Assignable ****************/
/************ begin Rule ComplexValue ****************/


protected class ComplexValue_Group extends GroupToken {
	
	public ComplexValue_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new ComplexValue_1_Keyword(current, this).firstSolution();
		if(s1 == null) return null;
		return new ComplexValue_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class ComplexValue_0_Group extends GroupToken {
	
	public ComplexValue_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new ComplexValue_0_1_Assignment_assignments(current, this).firstSolution();
		if(s1 == null) return null;
		return new ComplexValue_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class ComplexValue_0_0_Group extends GroupToken {
	
	public ComplexValue_0_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new ComplexValue_0_0_1_Assignment_fooBar(current, this).firstSolution();
		if(s1 == null) return null;
		return new ComplexValue_0_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class ComplexValue_0_0_0_Group extends GroupToken {
	
	public ComplexValue_0_0_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new ComplexValue_0_0_0_1_Group(current, this).firstSolution();
		if(s1 == null) return null;
		return new ComplexValue_0_0_0_0_Assignment_className(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class ComplexValue_0_0_0_0_Assignment_className extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal");
	protected Object value;
	
	public ComplexValue_0_0_0_0_Assignment_className(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("className")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("className");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("QualifiedName")) return null;
		AbstractToken t = new QualifiedName_Group(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("ComplexValue_0_0_0_0_Assignment_classNameCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call QualifiedName
	}
}

protected class ComplexValue_0_0_0_1_Group extends GroupToken {
	
	public ComplexValue_0_0_0_1_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new ComplexValue_0_0_0_1_1_Assignment_id(current, this).firstSolution();
		if(s1 == null) return null;
		return new ComplexValue_0_0_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}


protected class ComplexValue_0_0_0_1_0_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0");
	
	public ComplexValue_0_0_0_1_0_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}

protected class ComplexValue_0_0_0_1_1_Assignment_id extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal");
	protected Object value;
	
	public ComplexValue_0_0_0_1_1_Assignment_id(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("id")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("id");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("ComplexValue_0_0_0_1_1_Assignment_idCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}



protected class ComplexValue_0_0_1_Assignment_fooBar extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public ComplexValue_0_0_1_Assignment_fooBar(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("fooBar")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("fooBar");
		// handling xtext::Keyword
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("ComplexValue_0_0_1_Assignment_fooBarCallback(\"xtext::Keyword\", " + value + ")");
		callback.keywordCall(current, (Keyword)element);
	}
}


protected class ComplexValue_0_1_Assignment_assignments extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public ComplexValue_0_1_Assignment_assignments(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("assignments")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("assignments");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("Assignment")) return null;
		AbstractToken t = new Assignment_Group(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("ComplexValue_0_1_Assignment_assignmentsCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call Assignment
	}
}



protected class ComplexValue_1_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.1");
	
	public ComplexValue_1_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}


/************ end Rule ComplexValue ****************/
/************ begin Rule WorkflowRef ****************/


protected class WorkflowRef_Group extends GroupToken {
	
	public WorkflowRef_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new WorkflowRef_1_Keyword(current, this).firstSolution();
		if(s1 == null) return null;
		return new WorkflowRef_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class WorkflowRef_0_Group extends GroupToken {
	
	public WorkflowRef_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new WorkflowRef_0_1_Assignment_assignments(current, this).firstSolution();
		if(s1 == null) return null;
		return new WorkflowRef_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class WorkflowRef_0_0_Group extends GroupToken {
	
	public WorkflowRef_0_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new WorkflowRef_0_0_1_Keyword(current, this).firstSolution();
		if(s1 == null) return null;
		return new WorkflowRef_0_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class WorkflowRef_0_0_0_Group extends GroupToken {
	
	public WorkflowRef_0_0_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new WorkflowRef_0_0_0_1_Assignment_uri(current, this).firstSolution();
		if(s1 == null) return null;
		return new WorkflowRef_0_0_0_0_Keyword_file(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}


protected class WorkflowRef_0_0_0_0_Keyword_file extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	
	public WorkflowRef_0_0_0_0_Keyword_file(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}

protected class WorkflowRef_0_0_0_1_Assignment_uri extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public WorkflowRef_0_0_0_1_Assignment_uri(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("uri")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("uri");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("WorkflowRef_0_0_0_1_Assignment_uriCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}



protected class WorkflowRef_0_0_1_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	
	public WorkflowRef_0_0_1_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}


protected class WorkflowRef_0_1_Assignment_assignments extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public WorkflowRef_0_1_Assignment_assignments(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("assignments")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("assignments");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("Assignment")) return null;
		AbstractToken t = new Assignment_Group(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("WorkflowRef_0_1_Assignment_assignmentsCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call Assignment
	}
}



protected class WorkflowRef_1_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.1");
	
	public WorkflowRef_1_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		callback.keywordCall(current, keyword);
	}
}


/************ end Rule WorkflowRef ****************/
/************ begin Rule IdRef ****************/


protected class IdRef_Assignment_id extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12/@alternatives/@terminal");
	protected Object value;
	
	public IdRef_Assignment_id(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("id")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("id");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("IdRef_Assignment_idCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}

/************ end Rule IdRef ****************/
/************ begin Rule Assignment ****************/


protected class Assignment_Group extends GroupToken {
	
	public Assignment_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new Assignment_1_Keyword(current, this).firstSolution();
		if(s1 == null) return null;
		return new Assignment_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class Assignment_0_Group extends GroupToken {
	
	public Assignment_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new Assignment_0_1_Assignment_value(current, this).firstSolution();
		if(s1 == null) return null;
		return new Assignment_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class Assignment_0_0_Group extends GroupToken {
	
	public Assignment_0_0_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new Assignment_0_0_1_Assignment_operator(current, this).firstSolution();
		if(s1 == null) return null;
		return new Assignment_0_0_0_Assignment_feature(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class Assignment_0_0_0_Assignment_feature extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal");
	protected Object value;
	
	public Assignment_0_0_0_Assignment_feature(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("feature")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("feature");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("Assignment_0_0_0_Assignment_featureCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}

protected class Assignment_0_0_1_Assignment_operator extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public Assignment_0_0_1_Assignment_operator(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("operator")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("operator");
		// handling xtext::Alternatives
		if("=".equals(value))
			element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.0");
		else 		if("+=".equals(value))
			element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.1");
		else 		return null;
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("Assignment_0_0_1_Assignment_operatorCallback(\"xtext::Alternatives\", " + value + ")");
		if(element instanceof Keyword)
			callback.keywordCall(current, (Keyword)element);
	}
}


protected class Assignment_0_1_Assignment_value extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	protected Object value;
	
	public Assignment_0_1_Assignment_value(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("value")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("value");
		// handling xtext::RuleCall
		InstanceDescription param = getDescr((EObject)value);
		if(!param.isInstanceOf("Value")) return null;
		AbstractToken t = new Value_Alternatives(param, this);
		Solution s =  t.firstSolution();
		if(s == null) return null;
		return new Solution(obj,s.getPredecessor());
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("Assignment_0_1_Assignment_valueCallback(\"xtext::RuleCall\", " + value + ")");
		// Nothing to do for ParserRule Call Value
	}
}



protected class Assignment_1_Keyword extends KeywordToken  {

	protected Keyword keyword = (Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.1");
	
	public Assignment_1_Keyword(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	protected Solution createSolution() {
		return new Solution();
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// This keyword (';') is optional (cardinality == ?) and thereby not serialized.
	}
}


/************ end Rule Assignment ****************/
/************ begin Rule QualifiedName ****************/


protected class QualifiedName_Group extends GroupToken {
	
	public QualifiedName_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new QualifiedName_1_Group(current, this).firstSolution();
		if(s1 == null) return null;
		return new QualifiedName_0_Assignment_parts(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class QualifiedName_0_Assignment_parts extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.0/@terminal");
	protected Object value;
	
	public QualifiedName_0_Assignment_parts(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("parts")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("parts");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("QualifiedName_0_Assignment_partsCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}

protected class QualifiedName_1_Group extends GroupToken {
	
	public QualifiedName_1_Group(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}

		
	protected Solution createSolution() {
		Solution s1 = new QualifiedName_1_1_Assignment_parts(current, this).firstSolution();
		if(s1 == null) return null;
		return new QualifiedName_1_0_Assignment_parts(s1.getCurrent(), s1.getPredecessor()).firstSolution();
	}
}

protected class QualifiedName_1_0_Assignment_parts extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal");
	protected Object value;
	
	public QualifiedName_1_0_Assignment_parts(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("parts")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("parts");
		// handling xtext::Keyword
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("QualifiedName_1_0_Assignment_partsCallback(\"xtext::Keyword\", " + value + ")");
		callback.keywordCall(current, (Keyword)element);
	}
}

protected class QualifiedName_1_1_Assignment_parts extends AssignmentToken  {

	protected AbstractElement element = (AbstractElement)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal");
	protected Object value;
	
	public QualifiedName_1_1_Assignment_parts(InstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}

	
	protected Solution createSolution() {
		if(!current.isConsumable("parts")) return null;
		InstanceDescription obj = (InstanceDescription)current.createClone();
		value = obj.consume("parts");
		// handling xtext::RuleCall
		return new Solution(obj);
	}
	
	public void executeCallback(IParseTreeConstructorCallback callback) {
		// System.out.println("QualifiedName_1_1_Assignment_partsCallback(\"xtext::RuleCall\", " + value + ")");
		callback.lexerRuleCall(current, (RuleCall) element, value);
	}
}



/************ end Rule QualifiedName ****************/
}
