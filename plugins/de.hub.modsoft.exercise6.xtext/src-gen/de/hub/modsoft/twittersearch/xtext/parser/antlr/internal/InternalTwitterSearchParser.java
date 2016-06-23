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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTwitterSearchParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configuration'", "':'", "'searches'", "'objecttype'", "'{'", "'}'", "'field'", "'TODO'", "'BOOLEAN'", "'INT'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalTwitterSearchParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTwitterSearchParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTwitterSearchParser.tokenNames; }
    public String getGrammarFileName() { return "../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'configuration' otherlv_2= ':' ( (lv_objectTypes_3_0= ruleObjectTypeDclr ) )* otherlv_4= 'searches' otherlv_5= ':' ( (lv_searches_6_0= ruleSearch ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_objectTypes_3_0 = null;

        EObject lv_searches_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:80:28: ( ( () otherlv_1= 'configuration' otherlv_2= ':' ( (lv_objectTypes_3_0= ruleObjectTypeDclr ) )* otherlv_4= 'searches' otherlv_5= ':' ( (lv_searches_6_0= ruleSearch ) )* ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:1: ( () otherlv_1= 'configuration' otherlv_2= ':' ( (lv_objectTypes_3_0= ruleObjectTypeDclr ) )* otherlv_4= 'searches' otherlv_5= ':' ( (lv_searches_6_0= ruleSearch ) )* )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:1: ( () otherlv_1= 'configuration' otherlv_2= ':' ( (lv_objectTypes_3_0= ruleObjectTypeDclr ) )* otherlv_4= 'searches' otherlv_5= ':' ( (lv_searches_6_0= ruleSearch ) )* )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:2: () otherlv_1= 'configuration' otherlv_2= ':' ( (lv_objectTypes_3_0= ruleObjectTypeDclr ) )* otherlv_4= 'searches' otherlv_5= ':' ( (lv_searches_6_0= ruleSearch ) )*
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:2: ()
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getTwitterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getConfigurationKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getColonKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:95:1: ( (lv_objectTypes_3_0= ruleObjectTypeDclr ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:96:1: (lv_objectTypes_3_0= ruleObjectTypeDclr )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:96:1: (lv_objectTypes_3_0= ruleObjectTypeDclr )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:97:3: lv_objectTypes_3_0= ruleObjectTypeDclr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getObjectTypesObjectTypeDclrParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleObjectTypeDclr_in_ruleModel164);
            	    lv_objectTypes_3_0=ruleObjectTypeDclr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objectTypes",
            	            		lv_objectTypes_3_0, 
            	            		"ObjectTypeDclr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel177); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getSearchesKeyword_4());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel189); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getColonKeyword_5());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:121:1: ( (lv_searches_6_0= ruleSearch ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:122:1: (lv_searches_6_0= ruleSearch )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:122:1: (lv_searches_6_0= ruleSearch )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:123:3: lv_searches_6_0= ruleSearch
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSearchesSearchParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSearch_in_ruleModel210);
            	    lv_searches_6_0=ruleSearch();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"searches",
            	            		lv_searches_6_0, 
            	            		"Search");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleObjectTypeDclr"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:147:1: entryRuleObjectTypeDclr returns [EObject current=null] : iv_ruleObjectTypeDclr= ruleObjectTypeDclr EOF ;
    public final EObject entryRuleObjectTypeDclr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTypeDclr = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:148:2: (iv_ruleObjectTypeDclr= ruleObjectTypeDclr EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:149:2: iv_ruleObjectTypeDclr= ruleObjectTypeDclr EOF
            {
             newCompositeNode(grammarAccess.getObjectTypeDclrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleObjectTypeDclr_in_entryRuleObjectTypeDclr247);
            iv_ruleObjectTypeDclr=ruleObjectTypeDclr();

            state._fsp--;

             current =iv_ruleObjectTypeDclr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleObjectTypeDclr257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectTypeDclr"


    // $ANTLR start "ruleObjectTypeDclr"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:156:1: ruleObjectTypeDclr returns [EObject current=null] : (otherlv_0= 'objecttype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' ) ;
    public final EObject ruleObjectTypeDclr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:159:28: ( (otherlv_0= 'objecttype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:160:1: (otherlv_0= 'objecttype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:160:1: (otherlv_0= 'objecttype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:160:3: otherlv_0= 'objecttype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleObjectTypeDclr294); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectTypeDclrAccess().getObjecttypeKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:165:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:165:1: (lv_name_1_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleObjectTypeDclr311); 

            			newLeafNode(lv_name_1_0, grammarAccess.getObjectTypeDclrAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectTypeDclrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleObjectTypeDclr328); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectTypeDclrAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:186:1: ( (lv_fields_3_0= ruleFieldDclr ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:187:1: (lv_fields_3_0= ruleFieldDclr )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:187:1: (lv_fields_3_0= ruleFieldDclr )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:188:3: lv_fields_3_0= ruleFieldDclr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectTypeDclrAccess().getFieldsFieldDclrParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldDclr_in_ruleObjectTypeDclr349);
            	    lv_fields_3_0=ruleFieldDclr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectTypeDclrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"FieldDclr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleObjectTypeDclr362); 

                	newLeafNode(otherlv_4, grammarAccess.getObjectTypeDclrAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectTypeDclr"


    // $ANTLR start "entryRuleFieldDclr"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:216:1: entryRuleFieldDclr returns [EObject current=null] : iv_ruleFieldDclr= ruleFieldDclr EOF ;
    public final EObject entryRuleFieldDclr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDclr = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:217:2: (iv_ruleFieldDclr= ruleFieldDclr EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:218:2: iv_ruleFieldDclr= ruleFieldDclr EOF
            {
             newCompositeNode(grammarAccess.getFieldDclrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldDclr_in_entryRuleFieldDclr398);
            iv_ruleFieldDclr=ruleFieldDclr();

            state._fsp--;

             current =iv_ruleFieldDclr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldDclr408); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDclr"


    // $ANTLR start "ruleFieldDclr"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:225:1: ruleFieldDclr returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fieldType_3_0= ruleFieldType ) ) ) ;
    public final EObject ruleFieldDclr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_fieldType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:228:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fieldType_3_0= ruleFieldType ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:229:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fieldType_3_0= ruleFieldType ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:229:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fieldType_3_0= ruleFieldType ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:229:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_fieldType_3_0= ruleFieldType ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFieldDclr445); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldDclrAccess().getFieldKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:233:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:234:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:234:1: (lv_name_1_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:235:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldDclr462); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFieldDclrAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldDclrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFieldDclr479); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldDclrAccess().getColonKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:255:1: ( (lv_fieldType_3_0= ruleFieldType ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:256:1: (lv_fieldType_3_0= ruleFieldType )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:256:1: (lv_fieldType_3_0= ruleFieldType )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:257:3: lv_fieldType_3_0= ruleFieldType
            {
             
            	        newCompositeNode(grammarAccess.getFieldDclrAccess().getFieldTypeFieldTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFieldType_in_ruleFieldDclr500);
            lv_fieldType_3_0=ruleFieldType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldDclrRule());
            	        }
                   		set(
                   			current, 
                   			"fieldType",
                    		lv_fieldType_3_0, 
                    		"FieldType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDclr"


    // $ANTLR start "entryRuleSearch"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:281:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:282:2: (iv_ruleSearch= ruleSearch EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:283:2: iv_ruleSearch= ruleSearch EOF
            {
             newCompositeNode(grammarAccess.getSearchRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSearch_in_entryRuleSearch536);
            iv_ruleSearch=ruleSearch();

            state._fsp--;

             current =iv_ruleSearch; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSearch546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:290:1: ruleSearch returns [EObject current=null] : otherlv_0= 'TODO' ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:293:28: (otherlv_0= 'TODO' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:294:2: otherlv_0= 'TODO'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSearch582); 

                	newLeafNode(otherlv_0, grammarAccess.getSearchAccess().getTODOKeyword());
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSearch"


    // $ANTLR start "ruleFieldType"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:310:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INT' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:312:28: ( ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INT' ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:313:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INT' ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:313:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INT' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:313:2: (enumLiteral_0= 'BOOLEAN' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:313:2: (enumLiteral_0= 'BOOLEAN' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:313:4: enumLiteral_0= 'BOOLEAN'
                    {
                    enumLiteral_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFieldType635); 

                            current = grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:319:6: (enumLiteral_1= 'INT' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:319:6: (enumLiteral_1= 'INT' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:319:8: enumLiteral_1= 'INT'
                    {
                    enumLiteral_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFieldType652); 

                            current = grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_ruleObjectTypeDclr_in_ruleModel164 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel189 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleSearch_in_ruleModel210 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleObjectTypeDclr_in_entryRuleObjectTypeDclr247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleObjectTypeDclr257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleObjectTypeDclr294 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleObjectTypeDclr311 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleObjectTypeDclr328 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_ruleFieldDclr_in_ruleObjectTypeDclr349 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleObjectTypeDclr362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldDclr_in_entryRuleFieldDclr398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldDclr408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleFieldDclr445 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldDclr462 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFieldDclr479 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_ruleFieldType_in_ruleFieldDclr500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSearch_in_entryRuleSearch536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSearch546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSearch582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleFieldType635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFieldType652 = new BitSet(new long[]{0x0000000000000002L});
    }


}