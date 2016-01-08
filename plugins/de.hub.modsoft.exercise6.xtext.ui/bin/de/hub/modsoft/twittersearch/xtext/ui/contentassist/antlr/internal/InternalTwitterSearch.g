/*
 * generated by Xtext
 */
grammar InternalTwitterSearch;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package de.hub.modsoft.twittersearch.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.hub.modsoft.twittersearch.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.hub.modsoft.twittersearch.xtext.services.TwitterSearchGrammarAccess;

}

@parser::members {
 
 	private TwitterSearchGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(TwitterSearchGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleObjectTypeDclr
entryRuleObjectTypeDclr 
:
{ before(grammarAccess.getObjectTypeDclrRule()); }
	 ruleObjectTypeDclr
{ after(grammarAccess.getObjectTypeDclrRule()); } 
	 EOF 
;

// Rule ObjectTypeDclr
ruleObjectTypeDclr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getObjectTypeDclrAccess().getGroup()); }
(rule__ObjectTypeDclr__Group__0)
{ after(grammarAccess.getObjectTypeDclrAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFieldDclr
entryRuleFieldDclr 
:
{ before(grammarAccess.getFieldDclrRule()); }
	 ruleFieldDclr
{ after(grammarAccess.getFieldDclrRule()); } 
	 EOF 
;

// Rule FieldDclr
ruleFieldDclr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldDclrAccess().getGroup()); }
(rule__FieldDclr__Group__0)
{ after(grammarAccess.getFieldDclrAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSearch
entryRuleSearch 
:
{ before(grammarAccess.getSearchRule()); }
	 ruleSearch
{ after(grammarAccess.getSearchRule()); } 
	 EOF 
;

// Rule Search
ruleSearch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSearchAccess().getGroup()); }
(rule__Search__Group__0)
{ after(grammarAccess.getSearchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}








// Rule FieldType
ruleFieldType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldTypeAccess().getAlternatives()); }
(rule__FieldType__Alternatives)
{ after(grammarAccess.getFieldTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}





rule__FieldType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_0()); }
(	'BOOLEAN' 
)
{ after(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_1()); }
(	'INT' 
)
{ after(grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_2()); }
(	'STRING' 
)
{ after(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTwitterAction_0()); }
(

)
{ after(grammarAccess.getModelAccess().getTwitterAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getConfigurationKeyword_1()); }

	'configuration' 

{ after(grammarAccess.getModelAccess().getConfigurationKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getModelAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getObjectTypesAssignment_3()); }
(rule__Model__ObjectTypesAssignment_3)*
{ after(grammarAccess.getModelAccess().getObjectTypesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__4__Impl
	rule__Model__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getSearchesKeyword_4()); }

	'searches' 

{ after(grammarAccess.getModelAccess().getSearchesKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__5__Impl
	rule__Model__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getColonKeyword_5()); }

	':' 

{ after(grammarAccess.getModelAccess().getColonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getSearchesAssignment_6()); }
(rule__Model__SearchesAssignment_6)*
{ after(grammarAccess.getModelAccess().getSearchesAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__ObjectTypeDclr__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectTypeDclr__Group__0__Impl
	rule__ObjectTypeDclr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectTypeDclr__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectTypeDclrAccess().getObjecttypeKeyword_0()); }

	'objecttype' 

{ after(grammarAccess.getObjectTypeDclrAccess().getObjecttypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectTypeDclr__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectTypeDclr__Group__1__Impl
	rule__ObjectTypeDclr__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectTypeDclr__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectTypeDclrAccess().getNameAssignment_1()); }
(rule__ObjectTypeDclr__NameAssignment_1)
{ after(grammarAccess.getObjectTypeDclrAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectTypeDclr__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectTypeDclr__Group__2__Impl
	rule__ObjectTypeDclr__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectTypeDclr__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectTypeDclrAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getObjectTypeDclrAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectTypeDclr__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectTypeDclr__Group__3__Impl
	rule__ObjectTypeDclr__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectTypeDclr__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectTypeDclrAccess().getFieldsAssignment_3()); }
(rule__ObjectTypeDclr__FieldsAssignment_3)*
{ after(grammarAccess.getObjectTypeDclrAccess().getFieldsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectTypeDclr__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ObjectTypeDclr__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectTypeDclr__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectTypeDclrAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getObjectTypeDclrAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__FieldDclr__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldDclr__Group__0__Impl
	rule__FieldDclr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDclr__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldDclrAccess().getFieldKeyword_0()); }

	'field' 

{ after(grammarAccess.getFieldDclrAccess().getFieldKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldDclr__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldDclr__Group__1__Impl
	rule__FieldDclr__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDclr__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldDclrAccess().getNameAssignment_1()); }
(rule__FieldDclr__NameAssignment_1)
{ after(grammarAccess.getFieldDclrAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldDclr__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldDclr__Group__2__Impl
	rule__FieldDclr__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDclr__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldDclrAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getFieldDclrAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldDclr__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldDclr__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDclr__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldDclrAccess().getFieldTypeAssignment_3()); }
(rule__FieldDclr__FieldTypeAssignment_3)
{ after(grammarAccess.getFieldDclrAccess().getFieldTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Search__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Search__Group__0__Impl
	rule__Search__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSearchAccess().getSearchAction_0()); }
(

)
{ after(grammarAccess.getSearchAccess().getSearchAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Search__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Search__Group__1__Impl
	rule__Search__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSearchAccess().getSearchKeyword_1()); }

	'search' 

{ after(grammarAccess.getSearchAccess().getSearchKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Search__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Search__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Search__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSearchAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getSearchAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Model__ObjectTypesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getObjectTypesObjectTypeDclrParserRuleCall_3_0()); }
	ruleObjectTypeDclr{ after(grammarAccess.getModelAccess().getObjectTypesObjectTypeDclrParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__SearchesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getSearchesSearchParserRuleCall_6_0()); }
	ruleSearch{ after(grammarAccess.getModelAccess().getSearchesSearchParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectTypeDclr__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectTypeDclrAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getObjectTypeDclrAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectTypeDclr__FieldsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getObjectTypeDclrAccess().getFieldsFieldDclrParserRuleCall_3_0()); }
	ruleFieldDclr{ after(grammarAccess.getObjectTypeDclrAccess().getFieldsFieldDclrParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDclr__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldDclrAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getFieldDclrAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDclr__FieldTypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldDclrAccess().getFieldTypeFieldTypeEnumRuleCall_3_0()); }
	ruleFieldType{ after(grammarAccess.getFieldDclrAccess().getFieldTypeFieldTypeEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

