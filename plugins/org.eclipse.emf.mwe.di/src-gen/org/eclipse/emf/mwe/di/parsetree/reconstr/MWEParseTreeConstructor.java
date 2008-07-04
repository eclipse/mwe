/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parsetree.reconstr;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.*;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parser.GenericEcoreElementFactory;
import org.eclipse.xtext.parsetree.reconstr.*;
import org.eclipse.xtext.parsetree.reconstr.impl.*;

public class MWEParseTreeConstructor extends AbstractParseTreeConstructor {

	protected void internalDoUpdate(EObject obj, String ruleToCall, IParseTreeConstructorCallback callback) {
		if (ruleToCall.equals("File")) {
			proceedFile(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("Import")) {
			proceedImport(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("JavaImport")) {
			proceedJavaImport(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("GenericImport")) {
			proceedGenericImport(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("Property")) {
			proceedProperty(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("LocalVariable")) {
			proceedLocalVariable(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("PropertiesFileImport")) {
			proceedPropertiesFileImport(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("Value")) {
			proceedValue(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("SimpleValue")) {
			proceedSimpleValue(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("Assignable")) {
			proceedAssignable(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("ComplexValue")) {
			proceedComplexValue(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("WorkflowRef")) {
			proceedWorkflowRef(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("IdRef")) {
			proceedIdRef(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("Assignment")) {
			proceedAssignment(getDescr(obj),callback);
		} else 		if (ruleToCall.equals("QualifiedName")) {
			proceedQualifiedName(getDescr(obj),callback);
		} else {
			throw new IllegalArgumentException("Couldn't find rule '"+ruleToCall+"'");
		}
	}

	
protected void proceedFile(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.0/@alternatives/@abstractTokens.1/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedComplexValue(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 

while (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("properties"); 
		}
}.check() ){

	final Object value = obj.consume("properties");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.0/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedProperty(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Assignment */ 

while (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("imports"); 
		}
}.check() ){

	final Object value = obj.consume("imports");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.0/@alternatives/@abstractTokens.0/@abstractTokens.0/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedImport(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}


}


}

}

protected void proceedImport(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Alternatives */ 
{

		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("JavaImport"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.1/@alternatives/@groups.0");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedJavaImport(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	else		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("GenericImport"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.1/@alternatives/@groups.1");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedGenericImport(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

}

protected void proceedJavaImport(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Group */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("wildcard")&&true; 
		}
}.check() ){

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("wildcard");
    
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal"));

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0"));

}


}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("javaImport");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedQualifiedName(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0"));

}


}


}


}

}

protected void proceedGenericImport(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return true; 
		}
}.check() ){

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.3/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.0"));

}


}


}

}

protected void proceedProperty(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Alternatives */ 
{

		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("LocalVariable"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.4/@alternatives/@groups.0");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedLocalVariable(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	else		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("PropertiesFileImport"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.4/@alternatives/@groups.1");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedPropertiesFileImport(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

}

protected void proceedLocalVariable(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedValue(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0"));

}


}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("name");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0"));

}


}


}


}

}

protected void proceedPropertiesFileImport(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("file");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1"));

}

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0"));

}


}


}


}

}

protected void proceedValue(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Alternatives */ 
{

		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("SimpleValue"); 
		}
}.check() ||
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("ComplexValue"); 
		}
}.check() ||
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("IdRef"); 
		}
}.check() ) {
			
/* xtext::Alternatives */ 
{

		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("SimpleValue"); 
		}
}.check() ||
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("ComplexValue"); 
		}
}.check() ) {
			
/* xtext::Alternatives */ 
{

		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("SimpleValue"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7/@alternatives/@groups.0/@groups.0/@groups.0");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedSimpleValue(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	else		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("ComplexValue"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7/@alternatives/@groups.0/@groups.0/@groups.1");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedComplexValue(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

		}
	else		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("IdRef"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7/@alternatives/@groups.0/@groups.1");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedIdRef(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

		}
	else		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("WorkflowRef"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.7/@alternatives/@groups.1");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedWorkflowRef(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

}

protected void proceedSimpleValue(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.8/@alternatives/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

}

protected void proceedAssignable(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Alternatives */ 
{

		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("ComplexValue"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.9/@alternatives/@groups.0");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedComplexValue(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	else		if (
new Predicate(obj) { 
		public boolean check() {
			return obj.isInstanceOf("WorkflowRef"); 
		}
}.check() ) {
			
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = obj;
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.9/@alternatives/@groups.1");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedWorkflowRef(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

}

protected void proceedComplexValue(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 

while (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("assignments"); 
		}
}.check() ){

	final Object value = obj.consume("assignments");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedAssignment(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("fooBar");
    
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal"));

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Group */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("id")&&true; 
		}
}.check() ){

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("id");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0"));

}


}

		
/* xtext::Assignment */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("className"); 
		}
}.check() ){

	final Object value = obj.consume("className");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedQualifiedName(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}


}


}


}


}

}

protected void proceedWorkflowRef(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 

while (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("assignments"); 
		}
}.check() ){

	final Object value = obj.consume("assignments");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedAssignment(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("uri");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0"));

}


}


}


}


}

}

protected void proceedIdRef(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Assignment */ 
{

	final Object value = obj.consume("id");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.12/@alternatives/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

}

protected void proceedAssignment(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return true; 
		}
}.check() ){

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
		InstanceDescription val = (getDescr((EObject)value));
		EObject ruleCall = getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
		try {
			callback.parserRuleCallStart(val, (RuleCall) ruleCall);
			proceedValue(val,callback);
		} finally {
			callback.parserRuleCallEnd();
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("operator");
    
/* xtext::Alternatives */ 
{

		if (
new Predicate(obj) { 
		public boolean check() {
			return value.equals("="); 
		}
}.check() ) {
			
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.0"));

}

		}
	else		if (
new Predicate(obj) { 
		public boolean check() {
			return value.equals("+="); 
		}
}.check() ) {
			
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal/@groups.1"));

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Assignment */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("feature"); 
		}
}.check() ){

	final Object value = obj.consume("feature");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}


}


}


}

}

protected void proceedQualifiedName(InstanceDescription obj,IParseTreeConstructorCallback callback) {
	
/* xtext::Group */ 
{

		
/* xtext::Group */ 

while (
new Predicate(obj) { 
		public boolean check() {
			return obj.checkConsume("parts")&&obj.checkConsume("parts"); 
		}
}.check() ){

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("parts");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("parts");
    
/* xtext::Keyword */ 
{

	callback.keywordCall(obj,(Keyword)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal"));

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}


}

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("parts");
    
/* xtext::RuleCall */ 
{

	
		callback.lexerRuleCall(obj,(RuleCall)getGrammarElement("classpath:/org/eclipse/emf/mwe/di/MWE.xmi#//@parserRules.14/@alternatives/@abstractTokens.0/@terminal"));
	

}

    if (obj.isConsumed())
    	callback.objectCreation(obj);

}


}

}

}
