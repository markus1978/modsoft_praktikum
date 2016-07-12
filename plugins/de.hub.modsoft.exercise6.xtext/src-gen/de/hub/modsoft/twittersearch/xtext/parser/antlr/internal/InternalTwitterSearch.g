/*
 * generated by Xtext
 */
grammar InternalTwitterSearch;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.hub.modsoft.twittersearch.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.hub.modsoft.twittersearch.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.hub.modsoft.twittersearch.xtext.services.TwitterSearchGrammarAccess;

}

@parser::members {

 	private TwitterSearchGrammarAccess grammarAccess;
 	
    public InternalTwitterSearchParser(TokenStream input, TwitterSearchGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected TwitterSearchGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)	otherlv_1='twitter' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getTwitterKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getTwitterTypesTwitterTypeParserRuleCall_3_0()); 
	    }
		lv_twitterTypes_3_0=ruleTwitterType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"twitterTypes",
        		lv_twitterTypes_3_0, 
        		"TwitterType");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5='searches' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSearchesKeyword_5());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getSearchesSearchParserRuleCall_7_0()); 
	    }
		lv_searches_7_0=ruleSearch		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"searches",
        		lv_searches_7_0, 
        		"Search");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleTwitterType
entryRuleTwitterType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTwitterTypeRule()); }
	 iv_ruleTwitterType=ruleTwitterType 
	 { $current=$iv_ruleTwitterType.current; } 
	 EOF 
;

// Rule TwitterType
ruleTwitterType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTwitterTypeAccess().getTwitterObjectTypeParserRuleCall_0()); 
    }
    this_TwitterObjectType_0=ruleTwitterObjectType
    { 
        $current = $this_TwitterObjectType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTwitterTypeAccess().getTwitterPrimitiveTypeParserRuleCall_1()); 
    }
    this_TwitterPrimitiveType_1=ruleTwitterPrimitiveType
    { 
        $current = $this_TwitterPrimitiveType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTwitterPrimitiveType
entryRuleTwitterPrimitiveType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTwitterPrimitiveTypeRule()); }
	 iv_ruleTwitterPrimitiveType=ruleTwitterPrimitiveType 
	 { $current=$iv_ruleTwitterPrimitiveType.current; } 
	 EOF 
;

// Rule TwitterPrimitiveType
ruleTwitterPrimitiveType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='primitive' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTwitterPrimitiveTypeAccess().getPrimitiveKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTwitterPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTwitterPrimitiveTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleTwitterObjectType
entryRuleTwitterObjectType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTwitterObjectTypeRule()); }
	 iv_ruleTwitterObjectType=ruleTwitterObjectType 
	 { $current=$iv_ruleTwitterObjectType.current; } 
	 EOF 
;

// Rule TwitterObjectType
ruleTwitterObjectType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='object' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTwitterObjectTypeAccess().getObjectKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTwitterObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTwitterObjectTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTwitterObjectTypeAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTwitterObjectTypeAccess().getFieldsFieldDclrParserRuleCall_3_0()); 
	    }
		lv_fields_3_0=ruleFieldDclr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTwitterObjectTypeRule());
	        }
       		add(
       			$current, 
       			"fields",
        		lv_fields_3_0, 
        		"FieldDclr");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTwitterObjectTypeAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleFieldDclr
entryRuleFieldDclr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFieldDclrRule()); }
	 iv_ruleFieldDclr=ruleFieldDclr 
	 { $current=$iv_ruleFieldDclr.current; } 
	 EOF 
;

// Rule FieldDclr
ruleFieldDclr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='field' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFieldDclrAccess().getFieldKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFieldDclrAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldDclrRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFieldDclrAccess().getColonKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldDclrRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getFieldDclrAccess().getTypeTwitterTypeDeclarationCrossReference_3_0()); 
	}

)
))
;





// Entry rule entryRuleSearch
entryRuleSearch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSearchRule()); }
	 iv_ruleSearch=ruleSearch 
	 { $current=$iv_ruleSearch.current; } 
	 EOF 
;

// Rule Search
ruleSearch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSearchAccess().getSearchAction_0(),
            $current);
    }
)	otherlv_1='search' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSearchAccess().getSearchKeyword_1());
    }
	otherlv_2='for' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSearchAccess().getForKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSearchRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getSearchAccess().getSearchTypeTwitterObjectTypeDeclarationCrossReference_3_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSearchAccess().getOptionsOptionParserRuleCall_4_0()); 
	    }
		lv_options_4_0=ruleOption		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSearchRule());
	        }
       		add(
       			$current, 
       			"options",
        		lv_options_4_0, 
        		"Option");
	        afterParserOrEnumRuleCall();
	    }

)
)*(	otherlv_5='where' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSearchAccess().getWhereKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_1_0()); 
	    }
		lv_conditions_6_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSearchRule());
	        }
       		add(
       			$current, 
       			"conditions",
        		lv_conditions_6_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7='&' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSearchAccess().getAmpersandKeyword_5_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_2_1_0()); 
	    }
		lv_conditions_8_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSearchRule());
	        }
       		add(
       			$current, 
       			"conditions",
        		lv_conditions_8_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getSearchAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleOption
entryRuleOption returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptionRule()); }
	 iv_ruleOption=ruleOption 
	 { $current=$iv_ruleOption.current; } 
	 EOF 
;

// Rule Option
ruleOption returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOptionAccess().getKeywordsParserRuleCall_0()); 
    }
    this_Keywords_0=ruleKeywords
    { 
        $current = $this_Keywords_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getOptionAccess().getLocationParserRuleCall_1()); 
    }
    this_Location_1=ruleLocation
    { 
        $current = $this_Location_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getOptionAccess().getTimeParserRuleCall_2()); 
    }
    this_Time_2=ruleTime
    { 
        $current = $this_Time_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleKeywords
entryRuleKeywords returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getKeywordsRule()); }
	 iv_ruleKeywords=ruleKeywords 
	 { $current=$iv_ruleKeywords.current; } 
	 EOF 
;

// Rule Keywords
ruleKeywords returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='with' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getKeywordsAccess().getWithKeyword_0());
    }
(
(
		lv_keywords_1_0=RULE_STRING
		{
			newLeafNode(lv_keywords_1_0, grammarAccess.getKeywordsAccess().getKeywordsSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getKeywordsRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"keywords",
        		lv_keywords_1_0, 
        		"STRING");
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getKeywordsAccess().getCommaKeyword_2_0());
    }
(
(
		lv_keywords_3_0=RULE_STRING
		{
			newLeafNode(lv_keywords_3_0, grammarAccess.getKeywordsAccess().getKeywordsSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getKeywordsRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"keywords",
        		lv_keywords_3_0, 
        		"STRING");
	    }

)
))*)
;





// Entry rule entryRuleLocation
entryRuleLocation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocationRule()); }
	 iv_ruleLocation=ruleLocation 
	 { $current=$iv_ruleLocation.current; } 
	 EOF 
;

// Rule Location
ruleLocation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='in' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getInKeyword_0());
    }
	otherlv_1='geo' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getGeoKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocationAccess().getLonDOUBLEParserRuleCall_3_0()); 
	    }
		lv_lon_3_0=ruleDOUBLE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocationRule());
	        }
       		set(
       			$current, 
       			"lon",
        		lv_lon_3_0, 
        		"DOUBLE");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getCommaKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocationAccess().getLatDOUBLEParserRuleCall_5_0()); 
	    }
		lv_lat_5_0=ruleDOUBLE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocationRule());
	        }
       		set(
       			$current, 
       			"lat",
        		lv_lat_5_0, 
        		"DOUBLE");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getLocationAccess().getCommaKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocationAccess().getRadiusDOUBLEParserRuleCall_7_0()); 
	    }
		lv_radius_7_0=ruleDOUBLE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocationRule());
	        }
       		set(
       			$current, 
       			"radius",
        		lv_radius_7_0, 
        		"DOUBLE");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLocationAccess().getRadiusUnitDistanceUnitEnumRuleCall_8_0()); 
	    }
		lv_radiusUnit_8_0=ruleDistanceUnit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocationRule());
	        }
       		set(
       			$current, 
       			"radiusUnit",
        		lv_radiusUnit_8_0, 
        		"DistanceUnit");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9=')' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getLocationAccess().getRightParenthesisKeyword_9());
    }
)
;





// Entry rule entryRuleTime
entryRuleTime returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTimeRule()); }
	 iv_ruleTime=ruleTime 
	 { $current=$iv_ruleTime.current; } 
	 EOF 
;

// Rule Time
ruleTime returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='before' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getBeforeKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTimeAccess().getBeforeDATEParserRuleCall_1_0()); 
	    }
		lv_before_1_0=ruleDATE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTimeRule());
	        }
       		set(
       			$current, 
       			"before",
        		lv_before_1_0, 
        		"DATE");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getIntConditionParserRuleCall_0()); 
    }
    this_IntCondition_0=ruleIntCondition
    { 
        $current = $this_IntCondition_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConditionAccess().getBooleanConditionParserRuleCall_1()); 
    }
    this_BooleanCondition_1=ruleBooleanCondition
    { 
        $current = $this_BooleanCondition_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleIntCondition
entryRuleIntCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntConditionRule()); }
	 iv_ruleIntCondition=ruleIntCondition 
	 { $current=$iv_ruleIntCondition.current; } 
	 EOF 
;

// Rule IntCondition
ruleIntCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntConditionRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getIntConditionAccess().getFieldDeclarationTwitterFieldDeclarationCrossReference_0_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getIntConditionAccess().getOperatorIntOperatorsEnumRuleCall_1_0()); 
	    }
		lv_operator_1_0=ruleIntOperators		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntConditionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_1_0, 
        		"IntOperators");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_operand_2_0=RULE_INT
		{
			newLeafNode(lv_operand_2_0, grammarAccess.getIntConditionAccess().getOperandINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntConditionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"operand",
        		lv_operand_2_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleBooleanCondition
entryRuleBooleanCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanConditionRule()); }
	 iv_ruleBooleanCondition=ruleBooleanCondition 
	 { $current=$iv_ruleBooleanCondition.current; } 
	 EOF 
;

// Rule BooleanCondition
ruleBooleanCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanConditionRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getBooleanConditionAccess().getFieldDeclarationTwitterFieldDeclarationCrossReference_0()); 
	}

)
)
;





// Entry rule entryRuleDOUBLE
entryRuleDOUBLE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDOUBLERule()); } 
	 iv_ruleDOUBLE=ruleDOUBLE 
	 { $current=$iv_ruleDOUBLE.current.getText(); }  
	 EOF 
;

// Rule DOUBLE
ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 
    }
)?)
    ;





// Entry rule entryRuleDATE
entryRuleDATE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDATERule()); } 
	 iv_ruleDATE=ruleDATE 
	 { $current=$iv_ruleDATE.current.getText(); }  
	 EOF 
;

// Rule DATE
ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDATEAccess().getFullStopKeyword_1()); 
    }
    this_INT_2=RULE_INT    {
		$current.merge(this_INT_2);
    }

    { 
    newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDATEAccess().getFullStopKeyword_3()); 
    }
    this_INT_4=RULE_INT    {
		$current.merge(this_INT_4);
    }

    { 
    newLeafNode(this_INT_4, grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); 
    }
)
    ;





// Rule IntOperators
ruleIntOperators returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='>' 
	{
        $current = grammarAccess.getIntOperatorsAccess().getGtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getIntOperatorsAccess().getGtEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='<' 
	{
        $current = grammarAccess.getIntOperatorsAccess().getLtEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getIntOperatorsAccess().getLtEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='=' 
	{
        $current = grammarAccess.getIntOperatorsAccess().getEqEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getIntOperatorsAccess().getEqEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='>=' 
	{
        $current = grammarAccess.getIntOperatorsAccess().getGeqEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getIntOperatorsAccess().getGeqEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='<=' 
	{
        $current = grammarAccess.getIntOperatorsAccess().getLeqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getIntOperatorsAccess().getLeqEnumLiteralDeclaration_4()); 
    }
));



// Rule DistanceUnit
ruleDistanceUnit returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='mi' 
	{
        $current = grammarAccess.getDistanceUnitAccess().getMiEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getDistanceUnitAccess().getMiEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='km' 
	{
        $current = grammarAccess.getDistanceUnitAccess().getKmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getDistanceUnitAccess().getKmEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


