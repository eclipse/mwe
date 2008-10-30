/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parsetree.reconstr;

//import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.*;
import org.eclipse.xtext.parsetree.reconstr.impl.*;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor.AbstractToken.Solution;


public class MWEParseTreeConstructor extends AbstractParseTreeConstructor {

	public IAbstractToken serialize(EObject object) {
		Solution t = internalSerialize(object);
		if(t == null) throw new XtextSerializationException(getDescr(object), "No rule found for serialization");
		return t.getPredecessor();
	}
	
	protected Solution internalSerialize(EObject obj) {
		IInstanceDescription inst = getDescr(obj);
		Solution s;
		if(inst.isInstanceOf("File") && (s = new File_Group(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("Import") && (s = new Import_Alternatives(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("JavaImport") && (s = new JavaImport_Group(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("GenericImport") && (s = new GenericImport_Group(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("Property") && (s = new Property_Alternatives(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("LocalVariable") && (s = new LocalVariable_Group(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("PropertiesFileImport") && (s = new PropertiesFileImport_Group(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("Value") && (s = new Value_Alternatives(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("SimpleValue") && (s = new SimpleValue_Assignment_value(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("Assignable") && (s = new Assignable_Alternatives(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("ComplexValue") && (s = new ComplexValue_Group(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("WorkflowRef") && (s = new WorkflowRef_Group(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("IdRef") && (s = new IdRef_Assignment_id(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("Assignment") && (s = new Assignment_Group(inst, null).firstSolution()) != null) return s;
		if(inst.isInstanceOf("QualifiedName") && (s = new QualifiedName_Group(inst, null).firstSolution()) != null) return s;
		return null;
	}
	
/************ begin Rule File ****************
 *
 * File : ( imports += Import ) * ( properties += Property ) * value = ComplexValue ;
 *
 **/


// ( imports += Import ) * ( properties += Property ) * value = ComplexValue
protected class File_Group extends GroupToken {
	
	public File_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new File_1_Assignment_value(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new File_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( imports += Import ) * ( properties += Property ) *
protected class File_0_Group extends GroupToken {
	
	public File_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new File_0_1_Assignment_properties(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new File_0_0_Assignment_imports(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( imports += Import ) *
protected class File_0_0_Assignment_imports extends AssignmentToken  {
	
	public File_0_0_Assignment_imports(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.0");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("imports",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("imports");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Import")) {
				Solution s = new Import_Alternatives(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}

// ( properties += Property ) *
protected class File_0_1_Assignment_properties extends AssignmentToken  {
	
	public File_0_1_Assignment_properties(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("properties",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("properties");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Property")) {
				Solution s = new Property_Alternatives(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}


// value = ComplexValue
protected class File_1_Assignment_value extends AssignmentToken  {
	
	public File_1_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.0/@alternatives/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("ComplexValue")) {
				Solution s = new ComplexValue_Group(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}


/************ end Rule File ****************/

/************ begin Rule Import ****************
 *
 * Import : JavaImport | GenericImport ;
 *
 **/


// JavaImport | GenericImport
protected class Import_Alternatives extends AlternativesToken {

	public Import_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return (Alternatives)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives");
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Import_1_RuleCall_GenericImport(current, this) : new Import_0_RuleCall_JavaImport(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		if(s == null) return null;
		last = s.getPredecessor();
		return s; 
	}
}

// JavaImport
protected class Import_0_RuleCall_JavaImport extends RuleCallToken {
	
	public Import_0_RuleCall_JavaImport(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives/@groups.0");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(JavaImport_Group.class, current)) return null;
		if(!current.isInstanceOf("JavaImport")) return null;
		return new JavaImport_Group(current, this).firstSolution();
	}
}

// GenericImport
protected class Import_1_RuleCall_GenericImport extends RuleCallToken {
	
	public Import_1_RuleCall_GenericImport(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.1/@alternatives/@groups.1");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(GenericImport_Group.class, current)) return null;
		if(!current.isInstanceOf("GenericImport")) return null;
		return new GenericImport_Group(current, this).firstSolution();
	}
}


/************ end Rule Import ****************/

/************ begin Rule JavaImport ****************
 *
 * JavaImport : 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ? ';' ;
 *
 **/


// 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ? ';'
protected class JavaImport_Group extends GroupToken {
	
	public JavaImport_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new JavaImport_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new JavaImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'import' javaImport = QualifiedName ( '.' wildcard ?= '*' ) ?
protected class JavaImport_0_Group extends GroupToken {
	
	public JavaImport_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new JavaImport_0_1_Group(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new JavaImport_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'import' javaImport = QualifiedName
protected class JavaImport_0_0_Group extends GroupToken {
	
	public JavaImport_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new JavaImport_0_0_1_Assignment_javaImport(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new JavaImport_0_0_0_Keyword_import(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'import'
protected class JavaImport_0_0_0_Keyword_import extends KeywordToken  {
	
	public JavaImport_0_0_0_Keyword_import(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	}	
}

// javaImport = QualifiedName
protected class JavaImport_0_0_1_Assignment_javaImport extends AssignmentToken  {
	
	public JavaImport_0_0_1_Assignment_javaImport(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("javaImport",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("javaImport");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("QualifiedName")) {
				Solution s = new QualifiedName_Group(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}


// ( '.' wildcard ?= '*' ) ?
protected class JavaImport_0_1_Group extends GroupToken {
	
	public JavaImport_0_1_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new JavaImport_0_1_1_Assignment_wildcard(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new JavaImport_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// '.'
protected class JavaImport_0_1_0_Keyword extends KeywordToken  {
	
	public JavaImport_0_1_0_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0");
	}	
}

// wildcard ?= '*'
protected class JavaImport_0_1_1_Assignment_wildcard extends AssignmentToken  {
	
	public JavaImport_0_1_1_Assignment_wildcard(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("wildcard",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("wildcard");
		if("*".equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal");
			return new Solution(obj);
		}
		return null;
	}
}



// ';'
protected class JavaImport_1_Keyword extends KeywordToken  {
	
	public JavaImport_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.2/@alternatives/@abstractTokens.1");
	}	
}


/************ end Rule JavaImport ****************/

/************ begin Rule GenericImport ****************
 *
 * GenericImport : 'import' value = STRING ';' ? ;
 *
 **/


// 'import' value = STRING ';' ?
protected class GenericImport_Group extends GroupToken {
	
	public GenericImport_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new GenericImport_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new GenericImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'import' value = STRING
protected class GenericImport_0_Group extends GroupToken {
	
	public GenericImport_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new GenericImport_0_1_Assignment_value(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new GenericImport_0_0_Keyword_import(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'import'
protected class GenericImport_0_0_Keyword_import extends KeywordToken  {
	
	public GenericImport_0_0_Keyword_import(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.0");
	}	
}

// value = STRING
protected class GenericImport_0_1_Assignment_value extends AssignmentToken  {
	
	public GenericImport_0_1_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}


// ';' ?
protected class GenericImport_1_Keyword extends KeywordToken  {
	
	public GenericImport_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.3/@alternatives/@abstractTokens.1");
	}	
}


/************ end Rule GenericImport ****************/

/************ begin Rule Property ****************
 *
 * Property : LocalVariable | PropertiesFileImport ;
 *
 **/


// LocalVariable | PropertiesFileImport
protected class Property_Alternatives extends AlternativesToken {

	public Property_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return (Alternatives)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives");
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Property_1_RuleCall_PropertiesFileImport(current, this) : new Property_0_RuleCall_LocalVariable(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		if(s == null) return null;
		last = s.getPredecessor();
		return s; 
	}
}

// LocalVariable
protected class Property_0_RuleCall_LocalVariable extends RuleCallToken {
	
	public Property_0_RuleCall_LocalVariable(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives/@groups.0");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(LocalVariable_Group.class, current)) return null;
		if(!current.isInstanceOf("LocalVariable")) return null;
		return new LocalVariable_Group(current, this).firstSolution();
	}
}

// PropertiesFileImport
protected class Property_1_RuleCall_PropertiesFileImport extends RuleCallToken {
	
	public Property_1_RuleCall_PropertiesFileImport(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.4/@alternatives/@groups.1");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(PropertiesFileImport_Group.class, current)) return null;
		if(!current.isInstanceOf("PropertiesFileImport")) return null;
		return new PropertiesFileImport_Group(current, this).firstSolution();
	}
}


/************ end Rule Property ****************/

/************ begin Rule LocalVariable ****************
 *
 * LocalVariable : 'var' name = ID ( '=' value = Value ) ? ';' ;
 *
 **/


// 'var' name = ID ( '=' value = Value ) ? ';'
protected class LocalVariable_Group extends GroupToken {
	
	public LocalVariable_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new LocalVariable_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new LocalVariable_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'var' name = ID ( '=' value = Value ) ?
protected class LocalVariable_0_Group extends GroupToken {
	
	public LocalVariable_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new LocalVariable_0_1_Group(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new LocalVariable_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'var' name = ID
protected class LocalVariable_0_0_Group extends GroupToken {
	
	public LocalVariable_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new LocalVariable_0_0_1_Assignment_name(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new LocalVariable_0_0_0_Keyword_var(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'var'
protected class LocalVariable_0_0_0_Keyword_var extends KeywordToken  {
	
	public LocalVariable_0_0_0_Keyword_var(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	}	
}

// name = ID
protected class LocalVariable_0_0_1_Assignment_name extends AssignmentToken  {
	
	public LocalVariable_0_0_1_Assignment_name(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("name",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}


// ( '=' value = Value ) ?
protected class LocalVariable_0_1_Group extends GroupToken {
	
	public LocalVariable_0_1_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new LocalVariable_0_1_1_Assignment_value(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new LocalVariable_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// '='
protected class LocalVariable_0_1_0_Keyword extends KeywordToken  {
	
	public LocalVariable_0_1_0_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0");
	}	
}

// value = Value
protected class LocalVariable_0_1_1_Assignment_value extends AssignmentToken  {
	
	public LocalVariable_0_1_1_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Value")) {
				Solution s = new Value_Alternatives(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}



// ';'
protected class LocalVariable_1_Keyword extends KeywordToken  {
	
	public LocalVariable_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.5/@alternatives/@abstractTokens.1");
	}	
}


/************ end Rule LocalVariable ****************/

/************ begin Rule PropertiesFileImport ****************
 *
 * PropertiesFileImport : 'var' 'file' file = STRING ';' ;
 *
 **/


// 'var' 'file' file = STRING ';'
protected class PropertiesFileImport_Group extends GroupToken {
	
	public PropertiesFileImport_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new PropertiesFileImport_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new PropertiesFileImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'var' 'file' file = STRING
protected class PropertiesFileImport_0_Group extends GroupToken {
	
	public PropertiesFileImport_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new PropertiesFileImport_0_1_Assignment_file(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new PropertiesFileImport_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'var' 'file'
protected class PropertiesFileImport_0_0_Group extends GroupToken {
	
	public PropertiesFileImport_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new PropertiesFileImport_0_0_1_Keyword_file(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new PropertiesFileImport_0_0_0_Keyword_var(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'var'
protected class PropertiesFileImport_0_0_0_Keyword_var extends KeywordToken  {
	
	public PropertiesFileImport_0_0_0_Keyword_var(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	}	
}

// 'file'
protected class PropertiesFileImport_0_0_1_Keyword_file extends KeywordToken  {
	
	public PropertiesFileImport_0_0_1_Keyword_file(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	}	
}


// file = STRING
protected class PropertiesFileImport_0_1_Assignment_file extends AssignmentToken  {
	
	public PropertiesFileImport_0_1_Assignment_file(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("file",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("file");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}


// ';'
protected class PropertiesFileImport_1_Keyword extends KeywordToken  {
	
	public PropertiesFileImport_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.6/@alternatives/@abstractTokens.1");
	}	
}


/************ end Rule PropertiesFileImport ****************/

/************ begin Rule Value ****************
 *
 * Value : SimpleValue | ComplexValue | IdRef | WorkflowRef ;
 *
 **/


// SimpleValue | ComplexValue | IdRef | WorkflowRef
protected class Value_Alternatives extends AlternativesToken {

	public Value_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return (Alternatives)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives");
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Value_1_RuleCall_WorkflowRef(current, this) : new Value_0_Alternatives(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		if(s == null) return null;
		last = s.getPredecessor();
		return s; 
	}
}

// SimpleValue | ComplexValue | IdRef
protected class Value_0_Alternatives extends AlternativesToken {

	public Value_0_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return (Alternatives)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0");
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Value_0_1_RuleCall_IdRef(current, this) : new Value_0_0_Alternatives(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		if(s == null) return null;
		last = s.getPredecessor();
		return s; 
	}
}

// SimpleValue | ComplexValue
protected class Value_0_0_Alternatives extends AlternativesToken {

	public Value_0_0_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return (Alternatives)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0");
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Value_0_0_1_RuleCall_ComplexValue(current, this) : new Value_0_0_0_RuleCall_SimpleValue(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		if(s == null) return null;
		last = s.getPredecessor();
		return s; 
	}
}

// SimpleValue
protected class Value_0_0_0_RuleCall_SimpleValue extends RuleCallToken {
	
	public Value_0_0_0_RuleCall_SimpleValue(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0/@groups.0");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(SimpleValue_Assignment_value.class, current)) return null;
		if(!current.isInstanceOf("SimpleValue")) return null;
		return new SimpleValue_Assignment_value(current, this).firstSolution();
	}
}

// ComplexValue
protected class Value_0_0_1_RuleCall_ComplexValue extends RuleCallToken {
	
	public Value_0_0_1_RuleCall_ComplexValue(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.0/@groups.1");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(ComplexValue_Group.class, current)) return null;
		if(!current.isInstanceOf("ComplexValue")) return null;
		return new ComplexValue_Group(current, this).firstSolution();
	}
}


// IdRef
protected class Value_0_1_RuleCall_IdRef extends RuleCallToken {
	
	public Value_0_1_RuleCall_IdRef(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.0/@groups.1");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(IdRef_Assignment_id.class, current)) return null;
		if(!current.isInstanceOf("IdRef")) return null;
		return new IdRef_Assignment_id(current, this).firstSolution();
	}
}


// WorkflowRef
protected class Value_1_RuleCall_WorkflowRef extends RuleCallToken {
	
	public Value_1_RuleCall_WorkflowRef(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.7/@alternatives/@groups.1");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(WorkflowRef_Group.class, current)) return null;
		if(!current.isInstanceOf("WorkflowRef")) return null;
		return new WorkflowRef_Group(current, this).firstSolution();
	}
}


/************ end Rule Value ****************/

/************ begin Rule SimpleValue ****************
 *
 * SimpleValue : value = STRING ;
 *
 **/


// value = STRING
protected class SimpleValue_Assignment_value extends AssignmentToken  {
	
	public SimpleValue_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8/@alternatives");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.8/@alternatives/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}

/************ end Rule SimpleValue ****************/

/************ begin Rule Assignable ****************
 *
 * Assignable : ComplexValue | WorkflowRef ;
 *
 **/


// ComplexValue | WorkflowRef
protected class Assignable_Alternatives extends AlternativesToken {

	public Assignable_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return (Alternatives)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.9/@alternatives");
	}
	
	protected Solution createSolution() {
		AbstractToken t = (first) ? new Assignable_1_RuleCall_WorkflowRef(current, this) : new Assignable_0_RuleCall_ComplexValue(current, this);
		Solution s = t.firstSolution();
		if(s == null && activateNextSolution()) s = createSolution();
		if(s == null) return null;
		last = s.getPredecessor();
		return s; 
	}
}

// ComplexValue
protected class Assignable_0_RuleCall_ComplexValue extends RuleCallToken {
	
	public Assignable_0_RuleCall_ComplexValue(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.9/@alternatives/@groups.0");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(ComplexValue_Group.class, current)) return null;
		if(!current.isInstanceOf("ComplexValue")) return null;
		return new ComplexValue_Group(current, this).firstSolution();
	}
}

// WorkflowRef
protected class Assignable_1_RuleCall_WorkflowRef extends RuleCallToken {
	
	public Assignable_1_RuleCall_WorkflowRef(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public RuleCall getGrammarElement() {
		return (RuleCall)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.9/@alternatives/@groups.1");
	}
	
	protected Solution createSolution() {
		if(checkForRecursion(WorkflowRef_Group.class, current)) return null;
		if(!current.isInstanceOf("WorkflowRef")) return null;
		return new WorkflowRef_Group(current, this).firstSolution();
	}
}


/************ end Rule Assignable ****************/

/************ begin Rule ComplexValue ****************
 *
 * ComplexValue : ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) * '}' ;
 *
 **/


// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) * '}'
protected class ComplexValue_Group extends GroupToken {
	
	public ComplexValue_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{' ( assignments += Assignment ) *
protected class ComplexValue_0_Group extends GroupToken {
	
	public ComplexValue_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_0_1_Assignment_assignments(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( className = QualifiedName ) ? ( ':' id = ID ) ? fooBar ?= '{'
protected class ComplexValue_0_0_Group extends GroupToken {
	
	public ComplexValue_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_0_0_1_Assignment_fooBar(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( className = QualifiedName ) ? ( ':' id = ID ) ?
protected class ComplexValue_0_0_0_Group extends GroupToken {
	
	public ComplexValue_0_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_0_0_0_1_Group(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_0_0_0_Assignment_className(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( className = QualifiedName ) ?
protected class ComplexValue_0_0_0_0_Assignment_className extends AssignmentToken  {
	
	public ComplexValue_0_0_0_0_Assignment_className(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("className",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("className");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("QualifiedName")) {
				Solution s = new QualifiedName_Group(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}

// ( ':' id = ID ) ?
protected class ComplexValue_0_0_0_1_Group extends GroupToken {
	
	public ComplexValue_0_0_0_1_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_0_0_0_1_1_Assignment_id(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_0_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ':'
protected class ComplexValue_0_0_0_1_0_Keyword extends KeywordToken  {
	
	public ComplexValue_0_0_0_1_0_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0");
	}	
}

// id = ID
protected class ComplexValue_0_0_0_1_1_Assignment_id extends AssignmentToken  {
	
	public ComplexValue_0_0_0_1_1_Assignment_id(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("id",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("id");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}



// fooBar ?= '{'
protected class ComplexValue_0_0_1_Assignment_fooBar extends AssignmentToken  {
	
	public ComplexValue_0_0_1_Assignment_fooBar(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("fooBar",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("fooBar");
		if("{".equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal");
			return new Solution(obj);
		}
		return null;
	}
}


// ( assignments += Assignment ) *
protected class ComplexValue_0_1_Assignment_assignments extends AssignmentToken  {
	
	public ComplexValue_0_1_Assignment_assignments(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("assignments",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("assignments");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Assignment")) {
				Solution s = new Assignment_Group(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}


// '}'
protected class ComplexValue_1_Keyword extends KeywordToken  {
	
	public ComplexValue_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.10/@alternatives/@abstractTokens.1");
	}	
}


/************ end Rule ComplexValue ****************/

/************ begin Rule WorkflowRef ****************
 *
 * WorkflowRef : 'file' uri = STRING '{' ( assignments += Assignment ) * '}' ;
 *
 **/


// 'file' uri = STRING '{' ( assignments += Assignment ) * '}'
protected class WorkflowRef_Group extends GroupToken {
	
	public WorkflowRef_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new WorkflowRef_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new WorkflowRef_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'file' uri = STRING '{' ( assignments += Assignment ) *
protected class WorkflowRef_0_Group extends GroupToken {
	
	public WorkflowRef_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new WorkflowRef_0_1_Assignment_assignments(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new WorkflowRef_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'file' uri = STRING '{'
protected class WorkflowRef_0_0_Group extends GroupToken {
	
	public WorkflowRef_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new WorkflowRef_0_0_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new WorkflowRef_0_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'file' uri = STRING
protected class WorkflowRef_0_0_0_Group extends GroupToken {
	
	public WorkflowRef_0_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new WorkflowRef_0_0_0_1_Assignment_uri(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new WorkflowRef_0_0_0_0_Keyword_file(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// 'file'
protected class WorkflowRef_0_0_0_0_Keyword_file extends KeywordToken  {
	
	public WorkflowRef_0_0_0_0_Keyword_file(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	}	
}

// uri = STRING
protected class WorkflowRef_0_0_0_1_Assignment_uri extends AssignmentToken  {
	
	public WorkflowRef_0_0_0_1_Assignment_uri(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("uri",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("uri");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}


// '{'
protected class WorkflowRef_0_0_1_Keyword extends KeywordToken  {
	
	public WorkflowRef_0_0_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	}	
}


// ( assignments += Assignment ) *
protected class WorkflowRef_0_1_Assignment_assignments extends AssignmentToken  {
	
	public WorkflowRef_0_1_Assignment_assignments(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("assignments",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("assignments");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Assignment")) {
				Solution s = new Assignment_Group(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}


// '}'
protected class WorkflowRef_1_Keyword extends KeywordToken  {
	
	public WorkflowRef_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.11/@alternatives/@abstractTokens.1");
	}	
}


/************ end Rule WorkflowRef ****************/

/************ begin Rule IdRef ****************
 *
 * IdRef : id = ID ;
 *
 **/


// id = ID
protected class IdRef_Assignment_id extends AssignmentToken  {
	
	public IdRef_Assignment_id(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12/@alternatives");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("id",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("id");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.12/@alternatives/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}

/************ end Rule IdRef ****************/

/************ begin Rule Assignment ****************
 *
 * Assignment : ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value ';' ? ;
 *
 **/


// ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value ';' ?
protected class Assignment_Group extends GroupToken {
	
	public Assignment_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new Assignment_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new Assignment_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( feature = ID ) ? operator = ( '=' | '+=' ) value = Value
protected class Assignment_0_Group extends GroupToken {
	
	public Assignment_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new Assignment_0_1_Assignment_value(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new Assignment_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( feature = ID ) ? operator = ( '=' | '+=' )
protected class Assignment_0_0_Group extends GroupToken {
	
	public Assignment_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new Assignment_0_0_1_Assignment_operator(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new Assignment_0_0_0_Assignment_feature(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ( feature = ID ) ?
protected class Assignment_0_0_0_Assignment_feature extends AssignmentToken  {
	
	public Assignment_0_0_0_Assignment_feature(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("feature",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("feature");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}

// operator = ( '=' | '+=' )
protected class Assignment_0_0_1_Assignment_operator extends AssignmentToken  {
	
	public Assignment_0_0_1_Assignment_operator(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("operator",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("operator");
		if("=".equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.0");
			return new Solution(obj);
		}
		if("+=".equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.1");
			return new Solution(obj);
		}
		return null;
	}
}


// value = Value
protected class Assignment_0_1_Assignment_value extends AssignmentToken  {
	
	public Assignment_0_1_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.0/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Value")) {
				Solution s = new Value_Alternatives(param, this).firstSolution();
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}
		return null;
	}
}


// ';' ?
protected class Assignment_1_Keyword extends KeywordToken  {
	
	public Assignment_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return (Keyword)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.13/@alternatives/@abstractTokens.1");
	}	
}


/************ end Rule Assignment ****************/

/************ begin Rule QualifiedName ****************
 *
 * QualifiedName : parts += ID ( parts += '.' parts += ID ) * ;
 *
 **/


// parts += ID ( parts += '.' parts += ID ) *
protected class QualifiedName_Group extends GroupToken {
	
	public QualifiedName_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new QualifiedName_1_Group(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new QualifiedName_0_Assignment_parts(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// parts += ID
protected class QualifiedName_0_Assignment_parts extends AssignmentToken  {
	
	public QualifiedName_0_Assignment_parts(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.0");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("parts",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("parts");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.0/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}

// ( parts += '.' parts += ID ) *
protected class QualifiedName_1_Group extends GroupToken {
	
	public QualifiedName_1_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return (Group)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1");
	}
		
	protected Solution createSolution() {	
		Solution s1 = new QualifiedName_1_1_Assignment_parts(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new QualifiedName_1_0_Assignment_parts(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// parts += '.'
protected class QualifiedName_1_0_Assignment_parts extends AssignmentToken  {
	
	public QualifiedName_1_0_Assignment_parts(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.0");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("parts",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("parts");
		if(".".equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal");
			return new Solution(obj);
		}
		return null;
	}
}

// parts += ID
protected class QualifiedName_1_1_Assignment_parts extends AssignmentToken  {
	
	public QualifiedName_1_1_Assignment_parts(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return (Assignment)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.1");
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("parts",required)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("parts");
		if(true) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = (AbstractElement)getGrammarEle("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@rules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal"); 
			return new Solution(obj);
		}
		return null;
	}
}



/************ end Rule QualifiedName ****************/

}
