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
import org.eclipse.xtext.builtin.XtextBuiltinGrammarAccess;
import org.eclipse.emf.mwe.di.services.MWEGrammarAccess;


public class MWEParseTreeConstructor extends AbstractParseTreeConstructor {
		
	protected Solution internalSerialize(EObject obj) {
		IInstanceDescription inst = getDescr(obj);
		Solution s;
		if(inst.isInstanceOf("File") && (s = new File_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("Import") && (s = new Import_Alternatives(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("JavaImport") && (s = new JavaImport_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("GenericImport") && (s = new GenericImport_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("Property") && (s = new Property_Alternatives(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("LocalVariable") && (s = new LocalVariable_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("PropertiesFileImport") && (s = new PropertiesFileImport_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("Value") && (s = new Value_Alternatives(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("SimpleValue") && (s = new SimpleValue_Assignment_value(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("Assignable") && (s = new Assignable_Alternatives(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("ComplexValue") && (s = new ComplexValue_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("WorkflowRef") && (s = new WorkflowRef_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("IdRef") && (s = new IdRef_Assignment_id(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("Assignment") && (s = new Assignment_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		if(inst.isInstanceOf("QualifiedName") && (s = new QualifiedName_Group(inst, null).firstSolution()) != null && isConsumed(s,null)) return s;
		return null;
	}
	

/************ begin Rule File ****************
 *
 * File:   (imports+=Import)* (properties+=Property)* value=ComplexValue;
 *
 **/


// (imports+=Import)* (properties+=Property)* value=ComplexValue
protected class File_Group extends GroupToken {
	
	public File_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prFile().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new File_1_Assignment_value(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new File_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (imports+=Import)* (properties+=Property)*
protected class File_0_Group extends GroupToken {
	
	public File_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prFile().ele0Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new File_0_1_Assignment_properties(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new File_0_0_Assignment_imports(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (imports+=Import)*
protected class File_0_0_Assignment_imports extends AssignmentToken  {
	
	public File_0_0_Assignment_imports(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prFile().ele00AssignmentImports();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("imports",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("imports");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Import")) {
				Solution s = new Import_Alternatives(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}

		return null;
	}
}

// (properties+=Property)*
protected class File_0_1_Assignment_properties extends AssignmentToken  {
	
	public File_0_1_Assignment_properties(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prFile().ele01AssignmentProperties();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("properties",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("properties");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Property")) {
				Solution s = new Property_Alternatives(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}

		return null;
	}
}


// value=ComplexValue
protected class File_1_Assignment_value extends AssignmentToken  {
	
	public File_1_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prFile().ele1AssignmentValue();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("ComplexValue")) {
				Solution s = new ComplexValue_Group(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
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
 * Import:   JavaImport|GenericImport;
 *
 **/


// JavaImport|GenericImport
protected class Import_Alternatives extends AlternativesToken {

	public Import_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prImport().eleAlternatives();
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
		return MWEGrammarAccess.INSTANCE.prImport().ele0ParserRuleCallJavaImport();
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
		return MWEGrammarAccess.INSTANCE.prImport().ele1ParserRuleCallGenericImport();
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
 * JavaImport:   "import" javaImport=QualifiedName ("." wildcard?="*")? ";";
 *
 **/


// "import" javaImport=QualifiedName ("." wildcard?="*")? ";"
protected class JavaImport_Group extends GroupToken {
	
	public JavaImport_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new JavaImport_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new JavaImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "import" javaImport=QualifiedName ("." wildcard?="*")?
protected class JavaImport_0_Group extends GroupToken {
	
	public JavaImport_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().ele0Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new JavaImport_0_1_Group(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new JavaImport_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "import" javaImport=QualifiedName
protected class JavaImport_0_0_Group extends GroupToken {
	
	public JavaImport_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().ele00Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new JavaImport_0_0_1_Assignment_javaImport(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new JavaImport_0_0_0_Keyword_import(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "import"
protected class JavaImport_0_0_0_Keyword_import extends KeywordToken  {
	
	public JavaImport_0_0_0_Keyword_import(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().ele000KeywordImport();
	}	
}

// javaImport=QualifiedName
protected class JavaImport_0_0_1_Assignment_javaImport extends AssignmentToken  {
	
	public JavaImport_0_0_1_Assignment_javaImport(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().ele001AssignmentJavaImport();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("javaImport",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("javaImport");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("QualifiedName")) {
				Solution s = new QualifiedName_Group(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}

		return null;
	}
}


// ("." wildcard?="*")?
protected class JavaImport_0_1_Group extends GroupToken {
	
	public JavaImport_0_1_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().ele01Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new JavaImport_0_1_1_Assignment_wildcard(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new JavaImport_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "."
protected class JavaImport_0_1_0_Keyword extends KeywordToken  {
	
	public JavaImport_0_1_0_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().ele010KeywordFullStop();
	}	
}

// wildcard?="*"
protected class JavaImport_0_1_1_Assignment_wildcard extends AssignmentToken  {
	
	public JavaImport_0_1_1_Assignment_wildcard(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().ele011AssignmentWildcard();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("wildcard",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("wildcard");

		if(Boolean.TRUE.equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = MWEGrammarAccess.INSTANCE.prJavaImport().ele0110KeywordAsterisk();
			return new Solution(obj);
		}

		return null;
	}
}



// ";"
protected class JavaImport_1_Keyword extends KeywordToken  {
	
	public JavaImport_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prJavaImport().ele1KeywordSemicolon();
	}	
}


/************ end Rule JavaImport ****************/


/************ begin Rule GenericImport ****************
 *
 * GenericImport:   "import" value=STRING ";"?;
 *
 **/


// "import" value=STRING ";"?
protected class GenericImport_Group extends GroupToken {
	
	public GenericImport_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prGenericImport().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new GenericImport_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new GenericImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "import" value=STRING
protected class GenericImport_0_Group extends GroupToken {
	
	public GenericImport_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prGenericImport().ele0Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new GenericImport_0_1_Assignment_value(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new GenericImport_0_0_Keyword_import(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "import"
protected class GenericImport_0_0_Keyword_import extends KeywordToken  {
	
	public GenericImport_0_0_Keyword_import(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prGenericImport().ele00KeywordImport();
	}	
}

// value=STRING
protected class GenericImport_0_1_Assignment_value extends AssignmentToken  {
	
	public GenericImport_0_1_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prGenericImport().ele01AssignmentValue();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prGenericImport().ele010LexerRuleCallSTRING();
			return new Solution(obj);
		}
		return null;
	}
}


// ";"?
protected class GenericImport_1_Keyword extends KeywordToken  {
	
	public GenericImport_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prGenericImport().ele1KeywordSemicolon();
	}	
}


/************ end Rule GenericImport ****************/


/************ begin Rule Property ****************
 *
 * Property:   LocalVariable|PropertiesFileImport;
 *
 **/


// LocalVariable|PropertiesFileImport
protected class Property_Alternatives extends AlternativesToken {

	public Property_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prProperty().eleAlternatives();
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
		return MWEGrammarAccess.INSTANCE.prProperty().ele0ParserRuleCallLocalVariable();
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
		return MWEGrammarAccess.INSTANCE.prProperty().ele1ParserRuleCallPropertiesFileImport();
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
 * LocalVariable:   "var" name=ID ("=" value=Value)? ";";
 *
 **/


// "var" name=ID ("=" value=Value)? ";"
protected class LocalVariable_Group extends GroupToken {
	
	public LocalVariable_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new LocalVariable_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new LocalVariable_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "var" name=ID ("=" value=Value)?
protected class LocalVariable_0_Group extends GroupToken {
	
	public LocalVariable_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().ele0Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new LocalVariable_0_1_Group(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new LocalVariable_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "var" name=ID
protected class LocalVariable_0_0_Group extends GroupToken {
	
	public LocalVariable_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().ele00Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new LocalVariable_0_0_1_Assignment_name(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new LocalVariable_0_0_0_Keyword_var(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "var"
protected class LocalVariable_0_0_0_Keyword_var extends KeywordToken  {
	
	public LocalVariable_0_0_0_Keyword_var(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().ele000KeywordVar();
	}	
}

// name=ID
protected class LocalVariable_0_0_1_Assignment_name extends AssignmentToken  {
	
	public LocalVariable_0_0_1_Assignment_name(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().ele001AssignmentName();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("name",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("name");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prLocalVariable().ele0010LexerRuleCallID();
			return new Solution(obj);
		}
		return null;
	}
}


// ("=" value=Value)?
protected class LocalVariable_0_1_Group extends GroupToken {
	
	public LocalVariable_0_1_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().ele01Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new LocalVariable_0_1_1_Assignment_value(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new LocalVariable_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "="
protected class LocalVariable_0_1_0_Keyword extends KeywordToken  {
	
	public LocalVariable_0_1_0_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().ele010KeywordEqualsSign();
	}	
}

// value=Value
protected class LocalVariable_0_1_1_Assignment_value extends AssignmentToken  {
	
	public LocalVariable_0_1_1_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().ele011AssignmentValue();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Value")) {
				Solution s = new Value_Alternatives(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}

		return null;
	}
}



// ";"
protected class LocalVariable_1_Keyword extends KeywordToken  {
	
	public LocalVariable_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prLocalVariable().ele1KeywordSemicolon();
	}	
}


/************ end Rule LocalVariable ****************/


/************ begin Rule PropertiesFileImport ****************
 *
 * PropertiesFileImport:   "var" "file" file=STRING ";";
 *
 **/


// "var" "file" file=STRING ";"
protected class PropertiesFileImport_Group extends GroupToken {
	
	public PropertiesFileImport_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prPropertiesFileImport().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new PropertiesFileImport_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new PropertiesFileImport_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "var" "file" file=STRING
protected class PropertiesFileImport_0_Group extends GroupToken {
	
	public PropertiesFileImport_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prPropertiesFileImport().ele0Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new PropertiesFileImport_0_1_Assignment_file(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new PropertiesFileImport_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "var" "file"
protected class PropertiesFileImport_0_0_Group extends GroupToken {
	
	public PropertiesFileImport_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prPropertiesFileImport().ele00Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new PropertiesFileImport_0_0_1_Keyword_file(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new PropertiesFileImport_0_0_0_Keyword_var(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "var"
protected class PropertiesFileImport_0_0_0_Keyword_var extends KeywordToken  {
	
	public PropertiesFileImport_0_0_0_Keyword_var(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prPropertiesFileImport().ele000KeywordVar();
	}	
}

// "file"
protected class PropertiesFileImport_0_0_1_Keyword_file extends KeywordToken  {
	
	public PropertiesFileImport_0_0_1_Keyword_file(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prPropertiesFileImport().ele001KeywordFile();
	}	
}


// file=STRING
protected class PropertiesFileImport_0_1_Assignment_file extends AssignmentToken  {
	
	public PropertiesFileImport_0_1_Assignment_file(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prPropertiesFileImport().ele01AssignmentFile();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("file",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("file");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prPropertiesFileImport().ele010LexerRuleCallSTRING();
			return new Solution(obj);
		}
		return null;
	}
}


// ";"
protected class PropertiesFileImport_1_Keyword extends KeywordToken  {
	
	public PropertiesFileImport_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prPropertiesFileImport().ele1KeywordSemicolon();
	}	
}


/************ end Rule PropertiesFileImport ****************/


/************ begin Rule Value ****************
 *
 * Value:   SimpleValue|ComplexValue|IdRef|WorkflowRef;
 *
 **/


// SimpleValue|ComplexValue|IdRef|WorkflowRef
protected class Value_Alternatives extends AlternativesToken {

	public Value_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prValue().eleAlternatives();
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

// SimpleValue|ComplexValue|IdRef
protected class Value_0_Alternatives extends AlternativesToken {

	public Value_0_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prValue().ele0Alternatives();
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

// SimpleValue|ComplexValue
protected class Value_0_0_Alternatives extends AlternativesToken {

	public Value_0_0_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prValue().ele00Alternatives();
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
		return MWEGrammarAccess.INSTANCE.prValue().ele000ParserRuleCallSimpleValue();
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
		return MWEGrammarAccess.INSTANCE.prValue().ele001ParserRuleCallComplexValue();
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
		return MWEGrammarAccess.INSTANCE.prValue().ele01ParserRuleCallIdRef();
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
		return MWEGrammarAccess.INSTANCE.prValue().ele1ParserRuleCallWorkflowRef();
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
 * SimpleValue:   value=STRING;
 *
 **/


// value=STRING
protected class SimpleValue_Assignment_value extends AssignmentToken  {
	
	public SimpleValue_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prSimpleValue().eleAssignmentValue();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prSimpleValue().ele0LexerRuleCallSTRING();
			return new Solution(obj);
		}
		return null;
	}
}

/************ end Rule SimpleValue ****************/


/************ begin Rule Assignable ****************
 *
 * Assignable:   ComplexValue|WorkflowRef;
 *
 **/


// ComplexValue|WorkflowRef
protected class Assignable_Alternatives extends AlternativesToken {

	public Assignable_Alternatives(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Alternatives getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prAssignable().eleAlternatives();
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
		return MWEGrammarAccess.INSTANCE.prAssignable().ele0ParserRuleCallComplexValue();
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
		return MWEGrammarAccess.INSTANCE.prAssignable().ele1ParserRuleCallWorkflowRef();
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
 * ComplexValue:   (className=QualifiedName)? (":" id=ID)? fooBar?="{" (assignments+=Assignment)* "}";
 *
 **/


// (className=QualifiedName)? (":" id=ID)? fooBar?="{" (assignments+=Assignment)* "}"
protected class ComplexValue_Group extends GroupToken {
	
	public ComplexValue_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (className=QualifiedName)? (":" id=ID)? fooBar?="{" (assignments+=Assignment)*
protected class ComplexValue_0_Group extends GroupToken {
	
	public ComplexValue_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele0Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_0_1_Assignment_assignments(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (className=QualifiedName)? (":" id=ID)? fooBar?="{"
protected class ComplexValue_0_0_Group extends GroupToken {
	
	public ComplexValue_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele00Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_0_0_1_Assignment_fooBar(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (className=QualifiedName)? (":" id=ID)?
protected class ComplexValue_0_0_0_Group extends GroupToken {
	
	public ComplexValue_0_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele000Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_0_0_0_1_Group(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_0_0_0_Assignment_className(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (className=QualifiedName)?
protected class ComplexValue_0_0_0_0_Assignment_className extends AssignmentToken  {
	
	public ComplexValue_0_0_0_0_Assignment_className(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele0000AssignmentClassName();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("className",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("className");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("QualifiedName")) {
				Solution s = new QualifiedName_Group(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}

		return null;
	}
}

// (":" id=ID)?
protected class ComplexValue_0_0_0_1_Group extends GroupToken {
	
	public ComplexValue_0_0_0_1_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele0001Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new ComplexValue_0_0_0_1_1_Assignment_id(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new ComplexValue_0_0_0_1_0_Keyword(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// ":"
protected class ComplexValue_0_0_0_1_0_Keyword extends KeywordToken  {
	
	public ComplexValue_0_0_0_1_0_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele00010KeywordColon();
	}	
}

// id=ID
protected class ComplexValue_0_0_0_1_1_Assignment_id extends AssignmentToken  {
	
	public ComplexValue_0_0_0_1_1_Assignment_id(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele00011AssignmentId();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("id",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("id");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prComplexValue().ele000110LexerRuleCallID();
			return new Solution(obj);
		}
		return null;
	}
}



// fooBar?="{"
protected class ComplexValue_0_0_1_Assignment_fooBar extends AssignmentToken  {
	
	public ComplexValue_0_0_1_Assignment_fooBar(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele001AssignmentFooBar();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("fooBar",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("fooBar");

		if(Boolean.TRUE.equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = MWEGrammarAccess.INSTANCE.prComplexValue().ele0010KeywordLeftCurlyBracket();
			return new Solution(obj);
		}

		return null;
	}
}


// (assignments+=Assignment)*
protected class ComplexValue_0_1_Assignment_assignments extends AssignmentToken  {
	
	public ComplexValue_0_1_Assignment_assignments(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele01AssignmentAssignments();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("assignments",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("assignments");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Assignment")) {
				Solution s = new Assignment_Group(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}

		return null;
	}
}


// "}"
protected class ComplexValue_1_Keyword extends KeywordToken  {
	
	public ComplexValue_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prComplexValue().ele1KeywordRightCurlyBracket();
	}	
}


/************ end Rule ComplexValue ****************/


/************ begin Rule WorkflowRef ****************
 *
 * WorkflowRef:   "file" uri=STRING "{" (assignments+=Assignment)* "}";
 *
 **/


// "file" uri=STRING "{" (assignments+=Assignment)* "}"
protected class WorkflowRef_Group extends GroupToken {
	
	public WorkflowRef_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new WorkflowRef_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new WorkflowRef_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "file" uri=STRING "{" (assignments+=Assignment)*
protected class WorkflowRef_0_Group extends GroupToken {
	
	public WorkflowRef_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().ele0Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new WorkflowRef_0_1_Assignment_assignments(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new WorkflowRef_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "file" uri=STRING "{"
protected class WorkflowRef_0_0_Group extends GroupToken {
	
	public WorkflowRef_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().ele00Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new WorkflowRef_0_0_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new WorkflowRef_0_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "file" uri=STRING
protected class WorkflowRef_0_0_0_Group extends GroupToken {
	
	public WorkflowRef_0_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().ele000Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new WorkflowRef_0_0_0_1_Assignment_uri(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new WorkflowRef_0_0_0_0_Keyword_file(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// "file"
protected class WorkflowRef_0_0_0_0_Keyword_file extends KeywordToken  {
	
	public WorkflowRef_0_0_0_0_Keyword_file(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().ele0000KeywordFile();
	}	
}

// uri=STRING
protected class WorkflowRef_0_0_0_1_Assignment_uri extends AssignmentToken  {
	
	public WorkflowRef_0_0_0_1_Assignment_uri(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().ele0001AssignmentUri();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("uri",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("uri");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prWorkflowRef().ele00010LexerRuleCallSTRING();
			return new Solution(obj);
		}
		return null;
	}
}


// "{"
protected class WorkflowRef_0_0_1_Keyword extends KeywordToken  {
	
	public WorkflowRef_0_0_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().ele001KeywordLeftCurlyBracket();
	}	
}


// (assignments+=Assignment)*
protected class WorkflowRef_0_1_Assignment_assignments extends AssignmentToken  {
	
	public WorkflowRef_0_1_Assignment_assignments(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().ele01AssignmentAssignments();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("assignments",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("assignments");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Assignment")) {
				Solution s = new Assignment_Group(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}

		return null;
	}
}


// "}"
protected class WorkflowRef_1_Keyword extends KeywordToken  {
	
	public WorkflowRef_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prWorkflowRef().ele1KeywordRightCurlyBracket();
	}	
}


/************ end Rule WorkflowRef ****************/


/************ begin Rule IdRef ****************
 *
 * IdRef:   id=ID;
 *
 **/


// id=ID
protected class IdRef_Assignment_id extends AssignmentToken  {
	
	public IdRef_Assignment_id(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prIdRef().eleAssignmentId();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("id",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("id");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prIdRef().ele0LexerRuleCallID();
			return new Solution(obj);
		}
		return null;
	}
}

/************ end Rule IdRef ****************/


/************ begin Rule Assignment ****************
 *
 * Assignment:   (feature=ID)? operator=("="|"+=") value=Value ";"?;
 *
 **/


// (feature=ID)? operator=("="|"+=") value=Value ";"?
protected class Assignment_Group extends GroupToken {
	
	public Assignment_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prAssignment().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new Assignment_1_Keyword(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new Assignment_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (feature=ID)? operator=("="|"+=") value=Value
protected class Assignment_0_Group extends GroupToken {
	
	public Assignment_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prAssignment().ele0Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new Assignment_0_1_Assignment_value(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new Assignment_0_0_Group(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (feature=ID)? operator=("="|"+=")
protected class Assignment_0_0_Group extends GroupToken {
	
	public Assignment_0_0_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prAssignment().ele00Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new Assignment_0_0_1_Assignment_operator(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new Assignment_0_0_0_Assignment_feature(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// (feature=ID)?
protected class Assignment_0_0_0_Assignment_feature extends AssignmentToken  {
	
	public Assignment_0_0_0_Assignment_feature(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prAssignment().ele000AssignmentFeature();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("feature",!IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("feature");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prAssignment().ele0000LexerRuleCallID();
			return new Solution(obj);
		}
		return null;
	}
}

// operator=("="|"+=")
protected class Assignment_0_0_1_Assignment_operator extends AssignmentToken  {
	
	public Assignment_0_0_1_Assignment_operator(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prAssignment().ele001AssignmentOperator();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("operator",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("operator");

		if("=".equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = MWEGrammarAccess.INSTANCE.prAssignment().ele00100KeywordEqualsSign();
			return new Solution(obj);
		}


		if("+=".equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = MWEGrammarAccess.INSTANCE.prAssignment().ele00101KeywordPlusSignEqualsSign();
			return new Solution(obj);
		}

		return null;
	}
}


// value=Value
protected class Assignment_0_1_Assignment_value extends AssignmentToken  {
	
	public Assignment_0_1_Assignment_value(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prAssignment().ele01AssignmentValue();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("value",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("value");

		if(value instanceof EObject) { // xtext::RuleCall
			IInstanceDescription param = getDescr((EObject)value);
			if(param.isInstanceOf("Value")) {
				Solution s = new Value_Alternatives(param, this).firstSolution();
				while(s != null && !isConsumed(s,this)) s = s.getPredecessor().nextSolution(this,s);
				if(s != null) {
					type = AssignmentType.PRC; 
					return new Solution(obj,s.getPredecessor());
				} 
			}
		}

		return null;
	}
}


// ";"?
protected class Assignment_1_Keyword extends KeywordToken  {
	
	public Assignment_1_Keyword(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, !IS_REQUIRED);
	}
	
	public Keyword getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prAssignment().ele1KeywordSemicolon();
	}	
}


/************ end Rule Assignment ****************/


/************ begin Rule QualifiedName ****************
 *
 * QualifiedName:   parts+=ID (parts+="." parts+=ID)*;
 *
 **/


// parts+=ID (parts+="." parts+=ID)*
protected class QualifiedName_Group extends GroupToken {
	
	public QualifiedName_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prQualifiedName().eleGroup();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new QualifiedName_1_Group(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new QualifiedName_0_Assignment_parts(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// parts+=ID
protected class QualifiedName_0_Assignment_parts extends AssignmentToken  {
	
	public QualifiedName_0_Assignment_parts(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prQualifiedName().ele0AssignmentParts();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("parts",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("parts");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prQualifiedName().ele00LexerRuleCallID();
			return new Solution(obj);
		}
		return null;
	}
}

// (parts+="." parts+=ID)*
protected class QualifiedName_1_Group extends GroupToken {
	
	public QualifiedName_1_Group(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, IS_MANY, !IS_REQUIRED);
	}
	
	public Group getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prQualifiedName().ele1Group();
	}
		
	protected Solution createSolution() {	
		Solution s1 = new QualifiedName_1_1_Assignment_parts(current, this).firstSolution();
		while(s1 != null) {
			Solution s2 = new QualifiedName_1_0_Assignment_parts(s1.getCurrent(), s1.getPredecessor()).firstSolution();
			if(s2 == null) {
				s1 = s1.getPredecessor().nextSolution(this,s1);
				if(s1 == null) return null;
			} else {
				last = s2.getPredecessor();
				return s2;
			}
		}
		return null;
		
	}
}

// parts+="."
protected class QualifiedName_1_0_Assignment_parts extends AssignmentToken  {
	
	public QualifiedName_1_0_Assignment_parts(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prQualifiedName().ele10AssignmentParts();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("parts",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("parts");

		if(".".equals(value)) { // xtext::Keyword
			type = AssignmentType.KW;
			element = MWEGrammarAccess.INSTANCE.prQualifiedName().ele100KeywordFullStop();
			return new Solution(obj);
		}

		return null;
	}
}

// parts+=ID
protected class QualifiedName_1_1_Assignment_parts extends AssignmentToken  {
	
	public QualifiedName_1_1_Assignment_parts(IInstanceDescription curr, AbstractToken pred) {
		super(curr, pred, !IS_MANY, IS_REQUIRED);
	}
	
	public Assignment getGrammarElement() {
		return MWEGrammarAccess.INSTANCE.prQualifiedName().ele11AssignmentParts();
	}
	
	protected Solution createSolution() {
		if((value = current.getConsumable("parts",IS_REQUIRED)) == null) return null;
		IInstanceDescription obj = current.cloneAndConsume("parts");
		if(Boolean.TRUE.booleanValue()) { // xtext::RuleCall FIXME: check if value is valid for lexer rule
			type = AssignmentType.LRC;
			element = MWEGrammarAccess.INSTANCE.prQualifiedName().ele110LexerRuleCallID();
			return new Solution(obj);
		}
		return null;
	}
}



/************ end Rule QualifiedName ****************/

}
