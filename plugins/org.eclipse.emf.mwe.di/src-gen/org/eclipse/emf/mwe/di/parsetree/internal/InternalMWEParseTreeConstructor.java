
/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parsetree.internal;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parser.GenericEcoreElementFactory;
import org.eclipse.xtext.parsetree.Predicate;
import org.eclipse.xtext.parsetree.internal.AbstractInternalParseTreeConstructor;

public class InternalMWEParseTreeConstructor extends AbstractInternalParseTreeConstructor {

	public InternalMWEParseTreeConstructor(GenericEcoreElementFactory factory, Grammar grammar, IValueConverterService converterService) {
		super(factory,grammar,converterService);
	}

	protected void internalDoUpdate(EObject obj, String ruleToCall) {
		if (ruleToCall.equals("File")) {
			proceedFile(getDescr(obj));
		} else 		if (ruleToCall.equals("Import")) {
			proceedImport(getDescr(obj));
		} else 		if (ruleToCall.equals("JavaImport")) {
			proceedJavaImport(getDescr(obj));
		} else 		if (ruleToCall.equals("GenericImport")) {
			proceedGenericImport(getDescr(obj));
		} else 		if (ruleToCall.equals("Property")) {
			proceedProperty(getDescr(obj));
		} else 		if (ruleToCall.equals("LocalVariable")) {
			proceedLocalVariable(getDescr(obj));
		} else 		if (ruleToCall.equals("PropertiesFileImport")) {
			proceedPropertiesFileImport(getDescr(obj));
		} else 		if (ruleToCall.equals("Value")) {
			proceedValue(getDescr(obj));
		} else 		if (ruleToCall.equals("SimpleValue")) {
			proceedSimpleValue(getDescr(obj));
		} else 		if (ruleToCall.equals("Assignable")) {
			proceedAssignable(getDescr(obj));
		} else 		if (ruleToCall.equals("ComplexValue")) {
			proceedComplexValue(getDescr(obj));
		} else 		if (ruleToCall.equals("WorkflowRef")) {
			proceedWorkflowRef(getDescr(obj));
		} else 		if (ruleToCall.equals("IdRef")) {
			proceedIdRef(getDescr(obj));
		} else 		if (ruleToCall.equals("Assignment")) {
			proceedAssignment(getDescr(obj));
		} else 		if (ruleToCall.equals("QualifiedName")) {
			proceedQualifiedName(getDescr(obj));
		} else {
			throw new IllegalArgumentException("Couldn't find rule '"+ruleToCall+"'");
		}
	}

	
protected void proceedFile(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
	InstanceDescription val = (getDescr((EObject)value));
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.0/@alternatives/@abstractTokens.1/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedComplexValue(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.0/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedProperty(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.0/@alternatives/@abstractTokens.0/@abstractTokens.0/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedImport(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}


}


}

}

protected void proceedImport(InstanceDescription obj) {
	
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.1/@alternatives/@groups.0");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedJavaImport(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.1/@alternatives/@groups.1");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedGenericImport(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
	}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

}

protected void proceedJavaImport(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return true; 
		}
}.check() ){

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.2/@alternatives/@abstractTokens.1"));

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

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal"));

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0"));

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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedQualifiedName(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.2/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0"));

}


}


}


}

}

protected void proceedGenericImport(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return true; 
		}
}.check() ){

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.3/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.3/@alternatives/@abstractTokens.0/@abstractTokens.0"));

}


}


}

}

protected void proceedProperty(InstanceDescription obj) {
	
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.4/@alternatives/@groups.0");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedLocalVariable(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.4/@alternatives/@groups.1");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedPropertiesFileImport(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
	}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

}

protected void proceedLocalVariable(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return true; 
		}
}.check() ){

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.5/@alternatives/@abstractTokens.1"));

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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedValue(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0"));

}


}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("name");
    
/* xtext::RuleCall */ 
{

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.5/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0"));

}


}


}


}

}

protected void proceedPropertiesFileImport(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return true; 
		}
}.check() ){

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.6/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("file");
    
/* xtext::RuleCall */ 
{

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1"));

}

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.6/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0"));

}


}


}


}

}

protected void proceedValue(InstanceDescription obj) {
	
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.7/@alternatives/@groups.0/@groups.0/@groups.0");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedSimpleValue(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.7/@alternatives/@groups.0/@groups.0/@groups.1");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedComplexValue(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.7/@alternatives/@groups.0/@groups.1");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedIdRef(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.7/@alternatives/@groups.1");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedWorkflowRef(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
	}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

}

protected void proceedSimpleValue(InstanceDescription obj) {
	
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.8/@alternatives/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

}

protected void proceedAssignable(InstanceDescription obj) {
	
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.9/@alternatives/@groups.0");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedComplexValue(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.9/@alternatives/@groups.1");
	try {
		ruleCallStart(val, false, (RuleCall) ruleCall);
		proceedWorkflowRef(val);
	} finally {
		ruleCallEnd(val, false, (RuleCall) ruleCall);
	}
	

}

		}
	
		else {
		    throw new IllegalStateException("No alternative matched");
		}
	

}

}

protected void proceedComplexValue(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.10/@alternatives/@abstractTokens.1"));

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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedAssignment(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("fooBar");
    
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal"));

}

    if (obj.isConsumed())
    	objectCreation(obj);

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

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.1/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@abstractTokens.0"));

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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.10/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedQualifiedName(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}


}


}


}


}

}

protected void proceedWorkflowRef(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.11/@alternatives/@abstractTokens.1"));

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
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedAssignment(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("uri");
    
/* xtext::RuleCall */ 
{

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.11/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0"));

}


}


}


}


}

}

protected void proceedIdRef(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.12/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("id");
    
/* xtext::RuleCall */ 
{

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.12/@alternatives/@abstractTokens.0/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}


}

}

protected void proceedAssignment(InstanceDescription obj) {
	
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 

if (
new Predicate(obj) { 
		public boolean check() {
			return true; 
		}
}.check() ){

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.13/@alternatives/@abstractTokens.1"));

}

		
/* xtext::Group */ 
{

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("value");
    
/* xtext::RuleCall */ 
{

	
	InstanceDescription val = (getDescr((EObject)value));
	EObject ruleCall = getGrammar().eResource().getEObject("//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.1/@terminal");
	try {
		ruleCallStart(val, true, (RuleCall) ruleCall);
		proceedValue(val);
	} finally {
		ruleCallEnd(val, true, (RuleCall) ruleCall);
	}
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Group */ 
{

		
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.1"));

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

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.13/@alternatives/@abstractTokens.0/@abstractTokens.0/@abstractTokens.0/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}


}


}


}

}

protected void proceedQualifiedName(InstanceDescription obj) {
	
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

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.14/@alternatives/@abstractTokens.1/@abstractTokens.1/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("parts");
    
/* xtext::Keyword */ 
{

	keyword((Keyword)getGrammar().eResource().getEObject("//@parserRules.14/@alternatives/@abstractTokens.1/@abstractTokens.0/@terminal"));

}

    if (obj.isConsumed())
    	objectCreation(obj);

}


}

		
/* xtext::Assignment */ 
{

	final Object value = obj.consume("parts");
    
/* xtext::RuleCall */ 
{

	
		
		lexerRuleCall(value,(RuleCall)getGrammar().eResource().getEObject("//@parserRules.14/@alternatives/@abstractTokens.0/@terminal"));
		
	

}

    if (obj.isConsumed())
    	objectCreation(obj);

}


}

}

}
