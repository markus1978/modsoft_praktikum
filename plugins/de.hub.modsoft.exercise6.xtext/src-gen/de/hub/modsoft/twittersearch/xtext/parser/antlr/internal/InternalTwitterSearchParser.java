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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configuration'", "':'", "'searches'", "'objecttype'", "'{'", "'}'", "'field'", "'search'", "'for'", "'where'", "'&'", "';'", "'with'", "','", "'in'", "'geo'", "'('", "')'", "'before'", "'-'", "'.'", "'BOOLEAN'", "'INT'", "'>'", "'<'", "'='", "'>='", "'<='", "'mi'", "'km'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:290:1: ruleSearch returns [EObject current=null] : ( () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';' ) ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_options_4_0 = null;

        EObject lv_conditions_6_0 = null;

        EObject lv_conditions_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:293:28: ( ( () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:294:1: ( () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:294:1: ( () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:294:2: () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';'
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:294:2: ()
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:295:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSearchAccess().getSearchAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSearch592); 

                	newLeafNode(otherlv_1, grammarAccess.getSearchAccess().getSearchKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSearch604); 

                	newLeafNode(otherlv_2, grammarAccess.getSearchAccess().getForKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:308:1: ( (otherlv_3= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:309:1: (otherlv_3= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:309:1: (otherlv_3= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:310:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSearchRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSearch624); 

            		newLeafNode(otherlv_3, grammarAccess.getSearchAccess().getSearchForTwitterObjectTypeCrossReference_3_0()); 
            	

            }


            }

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:321:2: ( (lv_options_4_0= ruleOption ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23||LA4_0==25||LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:322:1: (lv_options_4_0= ruleOption )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:322:1: (lv_options_4_0= ruleOption )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:323:3: lv_options_4_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSearchAccess().getOptionsOptionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSearch645);
            	    lv_options_4_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSearchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_4_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:339:3: (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:339:5: otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )*
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSearch659); 

                        	newLeafNode(otherlv_5, grammarAccess.getSearchAccess().getWhereKeyword_5_0());
                        
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:343:1: ( (lv_conditions_6_0= ruleCondition ) )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:344:1: (lv_conditions_6_0= ruleCondition )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:344:1: (lv_conditions_6_0= ruleCondition )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:345:3: lv_conditions_6_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleSearch680);
                    lv_conditions_6_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSearchRule());
                    	        }
                           		add(
                           			current, 
                           			"conditions",
                            		lv_conditions_6_0, 
                            		"Condition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:361:2: (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:361:4: otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSearch693); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSearchAccess().getAmpersandKeyword_5_2_0());
                    	        
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:365:1: ( (lv_conditions_8_0= ruleCondition ) )
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:366:1: (lv_conditions_8_0= ruleCondition )
                    	    {
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:366:1: (lv_conditions_8_0= ruleCondition )
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:367:3: lv_conditions_8_0= ruleCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleSearch714);
                    	    lv_conditions_8_0=ruleCondition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSearchRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"conditions",
                    	            		lv_conditions_8_0, 
                    	            		"Condition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSearch730); 

                	newLeafNode(otherlv_9, grammarAccess.getSearchAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleSearch"


    // $ANTLR start "entryRuleOption"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:395:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:396:2: (iv_ruleOption= ruleOption EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:397:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption766);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption776); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:404:1: ruleOption returns [EObject current=null] : (this_Keywords_0= ruleKeywords | this_Location_1= ruleLocation | this_Time_2= ruleTime ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Keywords_0 = null;

        EObject this_Location_1 = null;

        EObject this_Time_2 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:407:28: ( (this_Keywords_0= ruleKeywords | this_Location_1= ruleLocation | this_Time_2= ruleTime ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:408:1: (this_Keywords_0= ruleKeywords | this_Location_1= ruleLocation | this_Time_2= ruleTime )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:408:1: (this_Keywords_0= ruleKeywords | this_Location_1= ruleLocation | this_Time_2= ruleTime )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:409:5: this_Keywords_0= ruleKeywords
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getKeywordsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeywords_in_ruleOption823);
                    this_Keywords_0=ruleKeywords();

                    state._fsp--;

                     
                            current = this_Keywords_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:419:5: this_Location_1= ruleLocation
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getLocationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLocation_in_ruleOption850);
                    this_Location_1=ruleLocation();

                    state._fsp--;

                     
                            current = this_Location_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:429:5: this_Time_2= ruleTime
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getTimeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTime_in_ruleOption877);
                    this_Time_2=ruleTime();

                    state._fsp--;

                     
                            current = this_Time_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleKeywords"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:445:1: entryRuleKeywords returns [EObject current=null] : iv_ruleKeywords= ruleKeywords EOF ;
    public final EObject entryRuleKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeywords = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:446:2: (iv_ruleKeywords= ruleKeywords EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:447:2: iv_ruleKeywords= ruleKeywords EOF
            {
             newCompositeNode(grammarAccess.getKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeywords_in_entryRuleKeywords912);
            iv_ruleKeywords=ruleKeywords();

            state._fsp--;

             current =iv_ruleKeywords; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeywords922); 

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
    // $ANTLR end "entryRuleKeywords"


    // $ANTLR start "ruleKeywords"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:454:1: ruleKeywords returns [EObject current=null] : (otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleKeywords() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keywords_1_0=null;
        Token otherlv_2=null;
        Token lv_keywords_3_0=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:457:28: ( (otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )* ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:458:1: (otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )* )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:458:1: (otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )* )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:458:3: otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleKeywords959); 

                	newLeafNode(otherlv_0, grammarAccess.getKeywordsAccess().getWithKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:462:1: ( (lv_keywords_1_0= RULE_STRING ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:463:1: (lv_keywords_1_0= RULE_STRING )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:463:1: (lv_keywords_1_0= RULE_STRING )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:464:3: lv_keywords_1_0= RULE_STRING
            {
            lv_keywords_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeywords976); 

            			newLeafNode(lv_keywords_1_0, grammarAccess.getKeywordsAccess().getKeywordsSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeywordsRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"keywords",
                    		lv_keywords_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:480:2: (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:480:4: otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleKeywords994); 

            	        	newLeafNode(otherlv_2, grammarAccess.getKeywordsAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:484:1: ( (lv_keywords_3_0= RULE_STRING ) )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:485:1: (lv_keywords_3_0= RULE_STRING )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:485:1: (lv_keywords_3_0= RULE_STRING )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:486:3: lv_keywords_3_0= RULE_STRING
            	    {
            	    lv_keywords_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeywords1011); 

            	    			newLeafNode(lv_keywords_3_0, grammarAccess.getKeywordsAccess().getKeywordsSTRINGTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKeywordsRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"keywords",
            	            		lv_keywords_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleKeywords"


    // $ANTLR start "entryRuleLocation"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:510:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:511:2: (iv_ruleLocation= ruleLocation EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:512:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocation_in_entryRuleLocation1054);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocation1064); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:519:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_lon_3_0 = null;

        AntlrDatatypeRuleToken lv_lat_5_0 = null;

        AntlrDatatypeRuleToken lv_radius_7_0 = null;

        Enumerator lv_radiusUnit_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:522:28: ( (otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:523:1: (otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:523:1: (otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:523:3: otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleLocation1101); 

                	newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getInKeyword_0());
                
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocation1113); 

                	newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getGeoKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLocation1125); 

                	newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftParenthesisKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:535:1: ( (lv_lon_3_0= ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:536:1: (lv_lon_3_0= ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:536:1: (lv_lon_3_0= ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:537:3: lv_lon_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLocationAccess().getLonDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_ruleLocation1146);
            lv_lon_3_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocationRule());
            	        }
                   		set(
                   			current, 
                   			"lon",
                    		lv_lon_3_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLocation1158); 

                	newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getCommaKeyword_4());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:557:1: ( (lv_lat_5_0= ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:558:1: (lv_lat_5_0= ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:558:1: (lv_lat_5_0= ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:559:3: lv_lat_5_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLocationAccess().getLatDOUBLEParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_ruleLocation1179);
            lv_lat_5_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocationRule());
            	        }
                   		set(
                   			current, 
                   			"lat",
                    		lv_lat_5_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLocation1191); 

                	newLeafNode(otherlv_6, grammarAccess.getLocationAccess().getCommaKeyword_6());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:579:1: ( (lv_radius_7_0= ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:580:1: (lv_radius_7_0= ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:580:1: (lv_radius_7_0= ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:581:3: lv_radius_7_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLocationAccess().getRadiusDOUBLEParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_ruleLocation1212);
            lv_radius_7_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocationRule());
            	        }
                   		set(
                   			current, 
                   			"radius",
                    		lv_radius_7_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:597:2: ( (lv_radiusUnit_8_0= ruleDistanceUnit ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:598:1: (lv_radiusUnit_8_0= ruleDistanceUnit )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:598:1: (lv_radiusUnit_8_0= ruleDistanceUnit )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:599:3: lv_radiusUnit_8_0= ruleDistanceUnit
            {
             
            	        newCompositeNode(grammarAccess.getLocationAccess().getRadiusUnitDistanceUnitEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDistanceUnit_in_ruleLocation1233);
            lv_radiusUnit_8_0=ruleDistanceUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocationRule());
            	        }
                   		set(
                   			current, 
                   			"radiusUnit",
                    		lv_radiusUnit_8_0, 
                    		"DistanceUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLocation1245); 

                	newLeafNode(otherlv_9, grammarAccess.getLocationAccess().getRightParenthesisKeyword_9());
                

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleTime"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:627:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:628:2: (iv_ruleTime= ruleTime EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:629:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime1281);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime1291); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:636:1: ruleTime returns [EObject current=null] : (otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_before_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:639:28: ( (otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:640:1: (otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:640:1: (otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:640:3: otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTime1328); 

                	newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getBeforeKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:644:1: ( (lv_before_1_0= ruleDATE ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:645:1: (lv_before_1_0= ruleDATE )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:645:1: (lv_before_1_0= ruleDATE )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:646:3: lv_before_1_0= ruleDATE
            {
             
            	        newCompositeNode(grammarAccess.getTimeAccess().getBeforeDATEParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDATE_in_ruleTime1349);
            lv_before_1_0=ruleDATE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeRule());
            	        }
                   		set(
                   			current, 
                   			"before",
                    		lv_before_1_0, 
                    		"DATE");
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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleCondition"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:670:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:671:2: (iv_ruleCondition= ruleCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:672:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition1385);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition1395); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:679:1: ruleCondition returns [EObject current=null] : (this_IntCondition_0= ruleIntCondition | this_BooleanCondition_1= ruleBooleanCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IntCondition_0 = null;

        EObject this_BooleanCondition_1 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:682:28: ( (this_IntCondition_0= ruleIntCondition | this_BooleanCondition_1= ruleBooleanCondition ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:683:1: (this_IntCondition_0= ruleIntCondition | this_BooleanCondition_1= ruleBooleanCondition )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:683:1: (this_IntCondition_0= ruleIntCondition | this_BooleanCondition_1= ruleBooleanCondition )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=34 && LA9_1<=38)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||(LA9_1>=21 && LA9_1<=22)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:684:5: this_IntCondition_0= ruleIntCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getIntConditionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntCondition_in_ruleCondition1442);
                    this_IntCondition_0=ruleIntCondition();

                    state._fsp--;

                     
                            current = this_IntCondition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:694:5: this_BooleanCondition_1= ruleBooleanCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getBooleanConditionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanCondition_in_ruleCondition1469);
                    this_BooleanCondition_1=ruleBooleanCondition();

                    state._fsp--;

                     
                            current = this_BooleanCondition_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIntCondition"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:710:1: entryRuleIntCondition returns [EObject current=null] : iv_ruleIntCondition= ruleIntCondition EOF ;
    public final EObject entryRuleIntCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntCondition = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:711:2: (iv_ruleIntCondition= ruleIntCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:712:2: iv_ruleIntCondition= ruleIntCondition EOF
            {
             newCompositeNode(grammarAccess.getIntConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntCondition_in_entryRuleIntCondition1504);
            iv_ruleIntCondition=ruleIntCondition();

            state._fsp--;

             current =iv_ruleIntCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntCondition1514); 

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
    // $ANTLR end "entryRuleIntCondition"


    // $ANTLR start "ruleIntCondition"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:719:1: ruleIntCondition returns [EObject current=null] : ( ( (lv_field_0_0= ruleFieldExpression ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntCondition() throws RecognitionException {
        EObject current = null;

        Token lv_operand_2_0=null;
        EObject lv_field_0_0 = null;

        Enumerator lv_operator_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:722:28: ( ( ( (lv_field_0_0= ruleFieldExpression ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:723:1: ( ( (lv_field_0_0= ruleFieldExpression ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:723:1: ( ( (lv_field_0_0= ruleFieldExpression ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:723:2: ( (lv_field_0_0= ruleFieldExpression ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:723:2: ( (lv_field_0_0= ruleFieldExpression ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:724:1: (lv_field_0_0= ruleFieldExpression )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:724:1: (lv_field_0_0= ruleFieldExpression )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:725:3: lv_field_0_0= ruleFieldExpression
            {
             
            	        newCompositeNode(grammarAccess.getIntConditionAccess().getFieldFieldExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFieldExpression_in_ruleIntCondition1560);
            lv_field_0_0=ruleFieldExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntConditionRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_0_0, 
                    		"FieldExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:741:2: ( (lv_operator_1_0= ruleIntOperators ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:742:1: (lv_operator_1_0= ruleIntOperators )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:742:1: (lv_operator_1_0= ruleIntOperators )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:743:3: lv_operator_1_0= ruleIntOperators
            {
             
            	        newCompositeNode(grammarAccess.getIntConditionAccess().getOperatorIntOperatorsEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIntOperators_in_ruleIntCondition1581);
            lv_operator_1_0=ruleIntOperators();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"IntOperators");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:759:2: ( (lv_operand_2_0= RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:760:1: (lv_operand_2_0= RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:760:1: (lv_operand_2_0= RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:761:3: lv_operand_2_0= RULE_INT
            {
            lv_operand_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntCondition1598); 

            			newLeafNode(lv_operand_2_0, grammarAccess.getIntConditionAccess().getOperandINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operand",
                    		lv_operand_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleIntCondition"


    // $ANTLR start "entryRuleBooleanCondition"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:785:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:786:2: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:787:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanCondition_in_entryRuleBooleanCondition1639);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanCondition1649); 

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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:794:1: ruleBooleanCondition returns [EObject current=null] : ( (lv_field_0_0= ruleFieldExpression ) ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_field_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:797:28: ( ( (lv_field_0_0= ruleFieldExpression ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:798:1: ( (lv_field_0_0= ruleFieldExpression ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:798:1: ( (lv_field_0_0= ruleFieldExpression ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:799:1: (lv_field_0_0= ruleFieldExpression )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:799:1: (lv_field_0_0= ruleFieldExpression )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:800:3: lv_field_0_0= ruleFieldExpression
            {
             
            	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getFieldFieldExpressionParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFieldExpression_in_ruleBooleanCondition1694);
            lv_field_0_0=ruleFieldExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_0_0, 
                    		"FieldExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleFieldExpression"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:824:1: entryRuleFieldExpression returns [EObject current=null] : iv_ruleFieldExpression= ruleFieldExpression EOF ;
    public final EObject entryRuleFieldExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldExpression = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:825:2: (iv_ruleFieldExpression= ruleFieldExpression EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:826:2: iv_ruleFieldExpression= ruleFieldExpression EOF
            {
             newCompositeNode(grammarAccess.getFieldExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldExpression_in_entryRuleFieldExpression1729);
            iv_ruleFieldExpression=ruleFieldExpression();

            state._fsp--;

             current =iv_ruleFieldExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldExpression1739); 

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
    // $ANTLR end "entryRuleFieldExpression"


    // $ANTLR start "ruleFieldExpression"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:833:1: ruleFieldExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFieldExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:836:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:837:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:837:1: ( (otherlv_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:838:1: (otherlv_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:838:1: (otherlv_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:839:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldExpression1783); 

            		newLeafNode(otherlv_0, grammarAccess.getFieldExpressionAccess().getFieldDeclarationFieldDeclarationCrossReference_0()); 
            	

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
    // $ANTLR end "ruleFieldExpression"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:858:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:859:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:860:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1819);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDOUBLE1830); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:867:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:870:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:871:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:871:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:871:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:871:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:872:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDOUBLE1869); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDOUBLE1886); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:884:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:885:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDOUBLE1905); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDOUBLE1920); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleDATE"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:905:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:906:2: (iv_ruleDATE= ruleDATE EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:907:2: iv_ruleDATE= ruleDATE EOF
            {
             newCompositeNode(grammarAccess.getDATERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDATE_in_entryRuleDATE1968);
            iv_ruleDATE=ruleDATE();

            state._fsp--;

             current =iv_ruleDATE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDATE1979); 

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
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:914:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:917:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:918:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:918:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:918:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDATE2019); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDATE2037); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDATEAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDATE2052); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDATE2070); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDATEAccess().getFullStopKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDATE2085); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleDATE"


    // $ANTLR start "ruleFieldType"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:959:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INT' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:961:28: ( ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INT' ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:962:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INT' ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:962:1: ( (enumLiteral_0= 'BOOLEAN' ) | (enumLiteral_1= 'INT' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            else if ( (LA12_0==33) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:962:2: (enumLiteral_0= 'BOOLEAN' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:962:2: (enumLiteral_0= 'BOOLEAN' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:962:4: enumLiteral_0= 'BOOLEAN'
                    {
                    enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFieldType2144); 

                            current = grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:968:6: (enumLiteral_1= 'INT' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:968:6: (enumLiteral_1= 'INT' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:968:8: enumLiteral_1= 'INT'
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFieldType2161); 

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


    // $ANTLR start "ruleIntOperators"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:978:1: ruleIntOperators returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleIntOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:980:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:981:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:981:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            case 38:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:981:2: (enumLiteral_0= '>' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:981:2: (enumLiteral_0= '>' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:981:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleIntOperators2206); 

                            current = grammarAccess.getIntOperatorsAccess().getGtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntOperatorsAccess().getGtEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:987:6: (enumLiteral_1= '<' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:987:6: (enumLiteral_1= '<' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:987:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleIntOperators2223); 

                            current = grammarAccess.getIntOperatorsAccess().getLtEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntOperatorsAccess().getLtEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:993:6: (enumLiteral_2= '=' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:993:6: (enumLiteral_2= '=' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:993:8: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleIntOperators2240); 

                            current = grammarAccess.getIntOperatorsAccess().getEqEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getIntOperatorsAccess().getEqEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:999:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:999:6: (enumLiteral_3= '>=' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:999:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleIntOperators2257); 

                            current = grammarAccess.getIntOperatorsAccess().getGeqEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getIntOperatorsAccess().getGeqEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1005:6: (enumLiteral_4= '<=' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1005:6: (enumLiteral_4= '<=' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1005:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleIntOperators2274); 

                            current = grammarAccess.getIntOperatorsAccess().getLeqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getIntOperatorsAccess().getLeqEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleIntOperators"


    // $ANTLR start "ruleDistanceUnit"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1015:1: ruleDistanceUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'mi' ) | (enumLiteral_1= 'km' ) ) ;
    public final Enumerator ruleDistanceUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1017:28: ( ( (enumLiteral_0= 'mi' ) | (enumLiteral_1= 'km' ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1018:1: ( (enumLiteral_0= 'mi' ) | (enumLiteral_1= 'km' ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1018:1: ( (enumLiteral_0= 'mi' ) | (enumLiteral_1= 'km' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            else if ( (LA14_0==40) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1018:2: (enumLiteral_0= 'mi' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1018:2: (enumLiteral_0= 'mi' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1018:4: enumLiteral_0= 'mi'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDistanceUnit2319); 

                            current = grammarAccess.getDistanceUnitAccess().getMiEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDistanceUnitAccess().getMiEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1024:6: (enumLiteral_1= 'km' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1024:6: (enumLiteral_1= 'km' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1024:8: enumLiteral_1= 'km'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDistanceUnit2336); 

                            current = grammarAccess.getDistanceUnitAccess().getKmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDistanceUnitAccess().getKmEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleDistanceUnit"

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
        public static final BitSet FOLLOW_12_in_ruleFieldDclr479 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_ruleFieldType_in_ruleFieldDclr500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSearch_in_entryRuleSearch536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSearch546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSearch592 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSearch604 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSearch624 = new BitSet(new long[]{0x0000000022D00000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSearch645 = new BitSet(new long[]{0x0000000022D00000L});
        public static final BitSet FOLLOW_20_in_ruleSearch659 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleSearch680 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleSearch693 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleSearch714 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_ruleSearch730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption766 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeywords_in_ruleOption823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocation_in_ruleOption850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_ruleOption877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeywords_in_entryRuleKeywords912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeywords922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleKeywords959 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeywords976 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleKeywords994 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeywords1011 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation1054 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocation1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleLocation1101 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleLocation1113 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleLocation1125 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLocation1146 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLocation1158 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLocation1179 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLocation1191 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLocation1212 = new BitSet(new long[]{0x0000018000000000L});
        public static final BitSet FOLLOW_ruleDistanceUnit_in_ruleLocation1233 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLocation1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime1281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleTime1328 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleDATE_in_ruleTime1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition1395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntCondition_in_ruleCondition1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanCondition_in_ruleCondition1469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntCondition_in_entryRuleIntCondition1504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntCondition1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldExpression_in_ruleIntCondition1560 = new BitSet(new long[]{0x0000007C00000000L});
        public static final BitSet FOLLOW_ruleIntOperators_in_ruleIntCondition1581 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntCondition1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanCondition_in_entryRuleBooleanCondition1639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanCondition1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldExpression_in_ruleBooleanCondition1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldExpression_in_entryRuleFieldExpression1729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldExpression1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldExpression1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleDOUBLE1869 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE1886 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleDOUBLE1905 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE1920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDATE_in_entryRuleDATE1968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDATE1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDATE2019 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDATE2037 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDATE2052 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDATE2070 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDATE2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFieldType2144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFieldType2161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleIntOperators2206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleIntOperators2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleIntOperators2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleIntOperators2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleIntOperators2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDistanceUnit2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleDistanceUnit2336 = new BitSet(new long[]{0x0000000000000002L});
    }


}