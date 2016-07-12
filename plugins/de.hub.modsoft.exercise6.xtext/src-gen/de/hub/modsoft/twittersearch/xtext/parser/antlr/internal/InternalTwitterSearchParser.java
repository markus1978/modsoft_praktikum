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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'twitter'", "'{'", "'}'", "'searches'", "'primitive'", "'object'", "'field'", "':'", "'search'", "'for'", "'where'", "'&'", "';'", "'with'", "','", "'in'", "'geo'", "'('", "')'", "'before'", "'-'", "'.'", "'>'", "'<'", "'='", "'>='", "'<='", "'mi'", "'km'"
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_twitterTypes_3_0 = null;

        EObject lv_searches_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:80:28: ( ( () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:1: ( () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:1: ( () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:2: () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}'
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:2: ()
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getTwitterKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:95:1: ( (lv_twitterTypes_3_0= ruleTwitterType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:96:1: (lv_twitterTypes_3_0= ruleTwitterType )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:96:1: (lv_twitterTypes_3_0= ruleTwitterType )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:97:3: lv_twitterTypes_3_0= ruleTwitterType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTwitterTypesTwitterTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTwitterType_in_ruleModel164);
            	    lv_twitterTypes_3_0=ruleTwitterType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"twitterTypes",
            	            		lv_twitterTypes_3_0, 
            	            		"TwitterType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel177); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel189); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getSearchesKeyword_5());
                
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel201); 

                	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:125:1: ( (lv_searches_7_0= ruleSearch ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:126:1: (lv_searches_7_0= ruleSearch )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:126:1: (lv_searches_7_0= ruleSearch )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:127:3: lv_searches_7_0= ruleSearch
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSearchesSearchParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSearch_in_ruleModel222);
            	    lv_searches_7_0=ruleSearch();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"searches",
            	            		lv_searches_7_0, 
            	            		"Search");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel235); 

                	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleTwitterType"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:155:1: entryRuleTwitterType returns [EObject current=null] : iv_ruleTwitterType= ruleTwitterType EOF ;
    public final EObject entryRuleTwitterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwitterType = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:156:2: (iv_ruleTwitterType= ruleTwitterType EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:157:2: iv_ruleTwitterType= ruleTwitterType EOF
            {
             newCompositeNode(grammarAccess.getTwitterTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTwitterType_in_entryRuleTwitterType271);
            iv_ruleTwitterType=ruleTwitterType();

            state._fsp--;

             current =iv_ruleTwitterType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTwitterType281); 

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
    // $ANTLR end "entryRuleTwitterType"


    // $ANTLR start "ruleTwitterType"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:164:1: ruleTwitterType returns [EObject current=null] : (this_TwitterObjectType_0= ruleTwitterObjectType | this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType ) ;
    public final EObject ruleTwitterType() throws RecognitionException {
        EObject current = null;

        EObject this_TwitterObjectType_0 = null;

        EObject this_TwitterPrimitiveType_1 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:167:28: ( (this_TwitterObjectType_0= ruleTwitterObjectType | this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:168:1: (this_TwitterObjectType_0= ruleTwitterObjectType | this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:168:1: (this_TwitterObjectType_0= ruleTwitterObjectType | this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:169:5: this_TwitterObjectType_0= ruleTwitterObjectType
                    {
                     
                            newCompositeNode(grammarAccess.getTwitterTypeAccess().getTwitterObjectTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTwitterObjectType_in_ruleTwitterType328);
                    this_TwitterObjectType_0=ruleTwitterObjectType();

                    state._fsp--;

                     
                            current = this_TwitterObjectType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:179:5: this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTwitterTypeAccess().getTwitterPrimitiveTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTwitterPrimitiveType_in_ruleTwitterType355);
                    this_TwitterPrimitiveType_1=ruleTwitterPrimitiveType();

                    state._fsp--;

                     
                            current = this_TwitterPrimitiveType_1; 
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
    // $ANTLR end "ruleTwitterType"


    // $ANTLR start "entryRuleTwitterPrimitiveType"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:195:1: entryRuleTwitterPrimitiveType returns [EObject current=null] : iv_ruleTwitterPrimitiveType= ruleTwitterPrimitiveType EOF ;
    public final EObject entryRuleTwitterPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwitterPrimitiveType = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:196:2: (iv_ruleTwitterPrimitiveType= ruleTwitterPrimitiveType EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:197:2: iv_ruleTwitterPrimitiveType= ruleTwitterPrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getTwitterPrimitiveTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTwitterPrimitiveType_in_entryRuleTwitterPrimitiveType390);
            iv_ruleTwitterPrimitiveType=ruleTwitterPrimitiveType();

            state._fsp--;

             current =iv_ruleTwitterPrimitiveType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTwitterPrimitiveType400); 

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
    // $ANTLR end "entryRuleTwitterPrimitiveType"


    // $ANTLR start "ruleTwitterPrimitiveType"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:204:1: ruleTwitterPrimitiveType returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTwitterPrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:207:28: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:208:1: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:208:1: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:208:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTwitterPrimitiveType437); 

                	newLeafNode(otherlv_0, grammarAccess.getTwitterPrimitiveTypeAccess().getPrimitiveKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:212:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:213:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:213:1: (lv_name_1_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:214:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTwitterPrimitiveType454); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTwitterPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTwitterPrimitiveTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTwitterPrimitiveType"


    // $ANTLR start "entryRuleTwitterObjectType"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:238:1: entryRuleTwitterObjectType returns [EObject current=null] : iv_ruleTwitterObjectType= ruleTwitterObjectType EOF ;
    public final EObject entryRuleTwitterObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwitterObjectType = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:239:2: (iv_ruleTwitterObjectType= ruleTwitterObjectType EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:240:2: iv_ruleTwitterObjectType= ruleTwitterObjectType EOF
            {
             newCompositeNode(grammarAccess.getTwitterObjectTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTwitterObjectType_in_entryRuleTwitterObjectType495);
            iv_ruleTwitterObjectType=ruleTwitterObjectType();

            state._fsp--;

             current =iv_ruleTwitterObjectType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTwitterObjectType505); 

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
    // $ANTLR end "entryRuleTwitterObjectType"


    // $ANTLR start "ruleTwitterObjectType"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:247:1: ruleTwitterObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' ) ;
    public final EObject ruleTwitterObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:250:28: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:251:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:251:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:251:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTwitterObjectType542); 

                	newLeafNode(otherlv_0, grammarAccess.getTwitterObjectTypeAccess().getObjectKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:255:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:256:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:256:1: (lv_name_1_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:257:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTwitterObjectType559); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTwitterObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTwitterObjectTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTwitterObjectType576); 

                	newLeafNode(otherlv_2, grammarAccess.getTwitterObjectTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:277:1: ( (lv_fields_3_0= ruleFieldDclr ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:278:1: (lv_fields_3_0= ruleFieldDclr )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:278:1: (lv_fields_3_0= ruleFieldDclr )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:279:3: lv_fields_3_0= ruleFieldDclr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTwitterObjectTypeAccess().getFieldsFieldDclrParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldDclr_in_ruleTwitterObjectType597);
            	    lv_fields_3_0=ruleFieldDclr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTwitterObjectTypeRule());
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTwitterObjectType610); 

                	newLeafNode(otherlv_4, grammarAccess.getTwitterObjectTypeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleTwitterObjectType"


    // $ANTLR start "entryRuleFieldDclr"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:307:1: entryRuleFieldDclr returns [EObject current=null] : iv_ruleFieldDclr= ruleFieldDclr EOF ;
    public final EObject entryRuleFieldDclr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDclr = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:308:2: (iv_ruleFieldDclr= ruleFieldDclr EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:309:2: iv_ruleFieldDclr= ruleFieldDclr EOF
            {
             newCompositeNode(grammarAccess.getFieldDclrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldDclr_in_entryRuleFieldDclr646);
            iv_ruleFieldDclr=ruleFieldDclr();

            state._fsp--;

             current =iv_ruleFieldDclr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldDclr656); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:316:1: ruleFieldDclr returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFieldDclr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:319:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:320:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:320:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:320:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFieldDclr693); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldDclrAccess().getFieldKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:324:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:325:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:325:1: (lv_name_1_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:326:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldDclr710); 

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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFieldDclr727); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldDclrAccess().getColonKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:346:1: ( (otherlv_3= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:347:1: (otherlv_3= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:347:1: (otherlv_3= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:348:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldDclrRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldDclr747); 

            		newLeafNode(otherlv_3, grammarAccess.getFieldDclrAccess().getTypeTwitterTypeDeclarationCrossReference_3_0()); 
            	

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:367:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:368:2: (iv_ruleSearch= ruleSearch EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:369:2: iv_ruleSearch= ruleSearch EOF
            {
             newCompositeNode(grammarAccess.getSearchRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSearch_in_entryRuleSearch783);
            iv_ruleSearch=ruleSearch();

            state._fsp--;

             current =iv_ruleSearch; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSearch793); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:376:1: ruleSearch returns [EObject current=null] : ( () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';' ) ;
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
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:379:28: ( ( () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:380:1: ( () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:380:1: ( () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:380:2: () otherlv_1= 'search' otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ( (lv_options_4_0= ruleOption ) )* (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )? otherlv_9= ';'
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:380:2: ()
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:381:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSearchAccess().getSearchAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSearch839); 

                	newLeafNode(otherlv_1, grammarAccess.getSearchAccess().getSearchKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSearch851); 

                	newLeafNode(otherlv_2, grammarAccess.getSearchAccess().getForKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:394:1: ( (otherlv_3= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:395:1: (otherlv_3= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:395:1: (otherlv_3= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:396:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSearchRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSearch871); 

            		newLeafNode(otherlv_3, grammarAccess.getSearchAccess().getSearchTypeTwitterObjectTypeDeclarationCrossReference_3_0()); 
            	

            }


            }

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:407:2: ( (lv_options_4_0= ruleOption ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24||LA5_0==26||LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:408:1: (lv_options_4_0= ruleOption )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:408:1: (lv_options_4_0= ruleOption )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:409:3: lv_options_4_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSearchAccess().getOptionsOptionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleSearch892);
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
            	    break loop5;
                }
            } while (true);

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:425:3: (otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:425:5: otherlv_5= 'where' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )*
                    {
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSearch906); 

                        	newLeafNode(otherlv_5, grammarAccess.getSearchAccess().getWhereKeyword_5_0());
                        
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:429:1: ( (lv_conditions_6_0= ruleCondition ) )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:430:1: (lv_conditions_6_0= ruleCondition )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:430:1: (lv_conditions_6_0= ruleCondition )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:431:3: lv_conditions_6_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleSearch927);
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

                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:447:2: (otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:447:4: otherlv_7= '&' ( (lv_conditions_8_0= ruleCondition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSearch940); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSearchAccess().getAmpersandKeyword_5_2_0());
                    	        
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:451:1: ( (lv_conditions_8_0= ruleCondition ) )
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:452:1: (lv_conditions_8_0= ruleCondition )
                    	    {
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:452:1: (lv_conditions_8_0= ruleCondition )
                    	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:453:3: lv_conditions_8_0= ruleCondition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleSearch961);
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSearch977); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:481:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:482:2: (iv_ruleOption= ruleOption EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:483:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption1013);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption1023); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:490:1: ruleOption returns [EObject current=null] : (this_Keywords_0= ruleKeywords | this_Location_1= ruleLocation | this_Time_2= ruleTime ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Keywords_0 = null;

        EObject this_Location_1 = null;

        EObject this_Time_2 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:493:28: ( (this_Keywords_0= ruleKeywords | this_Location_1= ruleLocation | this_Time_2= ruleTime ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:494:1: (this_Keywords_0= ruleKeywords | this_Location_1= ruleLocation | this_Time_2= ruleTime )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:494:1: (this_Keywords_0= ruleKeywords | this_Location_1= ruleLocation | this_Time_2= ruleTime )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:495:5: this_Keywords_0= ruleKeywords
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getKeywordsParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeywords_in_ruleOption1070);
                    this_Keywords_0=ruleKeywords();

                    state._fsp--;

                     
                            current = this_Keywords_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:505:5: this_Location_1= ruleLocation
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getLocationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLocation_in_ruleOption1097);
                    this_Location_1=ruleLocation();

                    state._fsp--;

                     
                            current = this_Location_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:515:5: this_Time_2= ruleTime
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAccess().getTimeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTime_in_ruleOption1124);
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:531:1: entryRuleKeywords returns [EObject current=null] : iv_ruleKeywords= ruleKeywords EOF ;
    public final EObject entryRuleKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeywords = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:532:2: (iv_ruleKeywords= ruleKeywords EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:533:2: iv_ruleKeywords= ruleKeywords EOF
            {
             newCompositeNode(grammarAccess.getKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeywords_in_entryRuleKeywords1159);
            iv_ruleKeywords=ruleKeywords();

            state._fsp--;

             current =iv_ruleKeywords; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeywords1169); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:540:1: ruleKeywords returns [EObject current=null] : (otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleKeywords() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keywords_1_0=null;
        Token otherlv_2=null;
        Token lv_keywords_3_0=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:543:28: ( (otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )* ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:544:1: (otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )* )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:544:1: (otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )* )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:544:3: otherlv_0= 'with' ( (lv_keywords_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleKeywords1206); 

                	newLeafNode(otherlv_0, grammarAccess.getKeywordsAccess().getWithKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:548:1: ( (lv_keywords_1_0= RULE_STRING ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:549:1: (lv_keywords_1_0= RULE_STRING )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:549:1: (lv_keywords_1_0= RULE_STRING )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:550:3: lv_keywords_1_0= RULE_STRING
            {
            lv_keywords_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeywords1223); 

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

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:566:2: (otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:566:4: otherlv_2= ',' ( (lv_keywords_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeywords1241); 

            	        	newLeafNode(otherlv_2, grammarAccess.getKeywordsAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:570:1: ( (lv_keywords_3_0= RULE_STRING ) )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:571:1: (lv_keywords_3_0= RULE_STRING )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:571:1: (lv_keywords_3_0= RULE_STRING )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:572:3: lv_keywords_3_0= RULE_STRING
            	    {
            	    lv_keywords_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleKeywords1258); 

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
            	    break loop9;
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:596:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:597:2: (iv_ruleLocation= ruleLocation EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:598:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocation_in_entryRuleLocation1301);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocation1311); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:605:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')' ) ;
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
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:608:28: ( (otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:609:1: (otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:609:1: (otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:609:3: otherlv_0= 'in' otherlv_1= 'geo' otherlv_2= '(' ( (lv_lon_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_lat_5_0= ruleDOUBLE ) ) otherlv_6= ',' ( (lv_radius_7_0= ruleDOUBLE ) ) ( (lv_radiusUnit_8_0= ruleDistanceUnit ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocation1348); 

                	newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getInKeyword_0());
                
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLocation1360); 

                	newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getGeoKeyword_1());
                
            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLocation1372); 

                	newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftParenthesisKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:621:1: ( (lv_lon_3_0= ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:622:1: (lv_lon_3_0= ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:622:1: (lv_lon_3_0= ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:623:3: lv_lon_3_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLocationAccess().getLonDOUBLEParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_ruleLocation1393);
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

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleLocation1405); 

                	newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getCommaKeyword_4());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:643:1: ( (lv_lat_5_0= ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:644:1: (lv_lat_5_0= ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:644:1: (lv_lat_5_0= ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:645:3: lv_lat_5_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLocationAccess().getLatDOUBLEParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_ruleLocation1426);
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

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleLocation1438); 

                	newLeafNode(otherlv_6, grammarAccess.getLocationAccess().getCommaKeyword_6());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:665:1: ( (lv_radius_7_0= ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:666:1: (lv_radius_7_0= ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:666:1: (lv_radius_7_0= ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:667:3: lv_radius_7_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLocationAccess().getRadiusDOUBLEParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_ruleLocation1459);
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

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:683:2: ( (lv_radiusUnit_8_0= ruleDistanceUnit ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:684:1: (lv_radiusUnit_8_0= ruleDistanceUnit )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:684:1: (lv_radiusUnit_8_0= ruleDistanceUnit )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:685:3: lv_radiusUnit_8_0= ruleDistanceUnit
            {
             
            	        newCompositeNode(grammarAccess.getLocationAccess().getRadiusUnitDistanceUnitEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDistanceUnit_in_ruleLocation1480);
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

            otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLocation1492); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:713:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:714:2: (iv_ruleTime= ruleTime EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:715:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime1528);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime1538); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:722:1: ruleTime returns [EObject current=null] : (otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_before_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:725:28: ( (otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:726:1: (otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:726:1: (otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:726:3: otherlv_0= 'before' ( (lv_before_1_0= ruleDATE ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTime1575); 

                	newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getBeforeKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:730:1: ( (lv_before_1_0= ruleDATE ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:731:1: (lv_before_1_0= ruleDATE )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:731:1: (lv_before_1_0= ruleDATE )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:732:3: lv_before_1_0= ruleDATE
            {
             
            	        newCompositeNode(grammarAccess.getTimeAccess().getBeforeDATEParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDATE_in_ruleTime1596);
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:756:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:757:2: (iv_ruleCondition= ruleCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:758:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition1632);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition1642); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:765:1: ruleCondition returns [EObject current=null] : (this_IntCondition_0= ruleIntCondition | this_BooleanCondition_1= ruleBooleanCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IntCondition_0 = null;

        EObject this_BooleanCondition_1 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:768:28: ( (this_IntCondition_0= ruleIntCondition | this_BooleanCondition_1= ruleBooleanCondition ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:769:1: (this_IntCondition_0= ruleIntCondition | this_BooleanCondition_1= ruleBooleanCondition )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:769:1: (this_IntCondition_0= ruleIntCondition | this_BooleanCondition_1= ruleBooleanCondition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||(LA10_1>=22 && LA10_1<=23)) ) {
                    alt10=2;
                }
                else if ( ((LA10_1>=33 && LA10_1<=37)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:770:5: this_IntCondition_0= ruleIntCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getIntConditionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntCondition_in_ruleCondition1689);
                    this_IntCondition_0=ruleIntCondition();

                    state._fsp--;

                     
                            current = this_IntCondition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:780:5: this_BooleanCondition_1= ruleBooleanCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getBooleanConditionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanCondition_in_ruleCondition1716);
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:796:1: entryRuleIntCondition returns [EObject current=null] : iv_ruleIntCondition= ruleIntCondition EOF ;
    public final EObject entryRuleIntCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntCondition = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:797:2: (iv_ruleIntCondition= ruleIntCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:798:2: iv_ruleIntCondition= ruleIntCondition EOF
            {
             newCompositeNode(grammarAccess.getIntConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntCondition_in_entryRuleIntCondition1751);
            iv_ruleIntCondition=ruleIntCondition();

            state._fsp--;

             current =iv_ruleIntCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntCondition1761); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:805:1: ruleIntCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operand_2_0=null;
        Enumerator lv_operator_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:808:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:809:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:809:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:809:2: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntOperators ) ) ( (lv_operand_2_0= RULE_INT ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:809:2: ( (otherlv_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:810:1: (otherlv_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:810:1: (otherlv_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:811:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntConditionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIntCondition1806); 

            		newLeafNode(otherlv_0, grammarAccess.getIntConditionAccess().getFieldDeclarationTwitterFieldDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:822:2: ( (lv_operator_1_0= ruleIntOperators ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:823:1: (lv_operator_1_0= ruleIntOperators )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:823:1: (lv_operator_1_0= ruleIntOperators )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:824:3: lv_operator_1_0= ruleIntOperators
            {
             
            	        newCompositeNode(grammarAccess.getIntConditionAccess().getOperatorIntOperatorsEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIntOperators_in_ruleIntCondition1827);
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

            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:840:2: ( (lv_operand_2_0= RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:841:1: (lv_operand_2_0= RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:841:1: (lv_operand_2_0= RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:842:3: lv_operand_2_0= RULE_INT
            {
            lv_operand_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntCondition1844); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:866:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:867:2: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:868:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanCondition_in_entryRuleBooleanCondition1885);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanCondition1895); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:875:1: ruleBooleanCondition returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:878:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:879:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:879:1: ( (otherlv_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:880:1: (otherlv_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:880:1: (otherlv_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:881:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanConditionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBooleanCondition1939); 

            		newLeafNode(otherlv_0, grammarAccess.getBooleanConditionAccess().getFieldDeclarationTwitterFieldDeclarationCrossReference_0()); 
            	

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


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:900:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:901:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:902:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1975);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDOUBLE1986); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:909:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:912:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:913:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:913:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:913:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:913:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:914:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDOUBLE2025); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDOUBLE2042); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:926:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:927:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDOUBLE2061); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDOUBLE2076); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:947:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:948:2: (iv_ruleDATE= ruleDATE EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:949:2: iv_ruleDATE= ruleDATE EOF
            {
             newCompositeNode(grammarAccess.getDATERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDATE_in_entryRuleDATE2124);
            iv_ruleDATE=ruleDATE();

            state._fsp--;

             current =iv_ruleDATE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDATE2135); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:956:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:959:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:960:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:960:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:960:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDATE2175); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDATE2193); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDATEAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDATE2208); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDATE2226); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDATEAccess().getFullStopKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDATE2241); 

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


    // $ANTLR start "ruleIntOperators"
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1001:1: ruleIntOperators returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleIntOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1003:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1004:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1004:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt13=1;
                }
                break;
            case 34:
                {
                alt13=2;
                }
                break;
            case 35:
                {
                alt13=3;
                }
                break;
            case 36:
                {
                alt13=4;
                }
                break;
            case 37:
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
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1004:2: (enumLiteral_0= '>' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1004:2: (enumLiteral_0= '>' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1004:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleIntOperators2300); 

                            current = grammarAccess.getIntOperatorsAccess().getGtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntOperatorsAccess().getGtEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1010:6: (enumLiteral_1= '<' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1010:6: (enumLiteral_1= '<' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1010:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleIntOperators2317); 

                            current = grammarAccess.getIntOperatorsAccess().getLtEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntOperatorsAccess().getLtEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1016:6: (enumLiteral_2= '=' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1016:6: (enumLiteral_2= '=' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1016:8: enumLiteral_2= '='
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleIntOperators2334); 

                            current = grammarAccess.getIntOperatorsAccess().getEqEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getIntOperatorsAccess().getEqEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1022:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1022:6: (enumLiteral_3= '>=' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1022:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleIntOperators2351); 

                            current = grammarAccess.getIntOperatorsAccess().getGeqEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getIntOperatorsAccess().getGeqEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1028:6: (enumLiteral_4= '<=' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1028:6: (enumLiteral_4= '<=' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1028:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleIntOperators2368); 

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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1038:1: ruleDistanceUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'mi' ) | (enumLiteral_1= 'km' ) ) ;
    public final Enumerator ruleDistanceUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1040:28: ( ( (enumLiteral_0= 'mi' ) | (enumLiteral_1= 'km' ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1041:1: ( (enumLiteral_0= 'mi' ) | (enumLiteral_1= 'km' ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1041:1: ( (enumLiteral_0= 'mi' ) | (enumLiteral_1= 'km' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            else if ( (LA14_0==39) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1041:2: (enumLiteral_0= 'mi' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1041:2: (enumLiteral_0= 'mi' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1041:4: enumLiteral_0= 'mi'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDistanceUnit2413); 

                            current = grammarAccess.getDistanceUnitAccess().getMiEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDistanceUnitAccess().getMiEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1047:6: (enumLiteral_1= 'km' )
                    {
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1047:6: (enumLiteral_1= 'km' )
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:1047:8: enumLiteral_1= 'km'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDistanceUnit2430); 

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
        public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_ruleTwitterType_in_ruleModel164 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleModel177 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleModel189 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel201 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_ruleSearch_in_ruleModel222 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_13_in_ruleModel235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterType_in_entryRuleTwitterType271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTwitterType281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterObjectType_in_ruleTwitterType328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterPrimitiveType_in_ruleTwitterType355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterPrimitiveType_in_entryRuleTwitterPrimitiveType390 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTwitterPrimitiveType400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTwitterPrimitiveType437 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTwitterPrimitiveType454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterObjectType_in_entryRuleTwitterObjectType495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTwitterObjectType505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleTwitterObjectType542 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTwitterObjectType559 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTwitterObjectType576 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_ruleFieldDclr_in_ruleTwitterObjectType597 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_13_in_ruleTwitterObjectType610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldDclr_in_entryRuleFieldDclr646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldDclr656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleFieldDclr693 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldDclr710 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFieldDclr727 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldDclr747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSearch_in_entryRuleSearch783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSearch793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSearch839 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSearch851 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSearch871 = new BitSet(new long[]{0x0000000045A00000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleSearch892 = new BitSet(new long[]{0x0000000045A00000L});
        public static final BitSet FOLLOW_21_in_ruleSearch906 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleSearch927 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleSearch940 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleSearch961 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleSearch977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeywords_in_ruleOption1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocation_in_ruleOption1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_ruleOption1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeywords_in_entryRuleKeywords1159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeywords1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleKeywords1206 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeywords1223 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleKeywords1241 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleKeywords1258 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation1301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocation1311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleLocation1348 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleLocation1360 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLocation1372 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLocation1393 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleLocation1405 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLocation1426 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleLocation1438 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLocation1459 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_ruleDistanceUnit_in_ruleLocation1480 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLocation1492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime1528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleTime1575 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleDATE_in_ruleTime1596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1632 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntCondition_in_ruleCondition1689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanCondition_in_ruleCondition1716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntCondition_in_entryRuleIntCondition1751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntCondition1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIntCondition1806 = new BitSet(new long[]{0x0000003E00000000L});
        public static final BitSet FOLLOW_ruleIntOperators_in_ruleIntCondition1827 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntCondition1844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanCondition_in_entryRuleBooleanCondition1885 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanCondition1895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanCondition1939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleDOUBLE2025 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2042 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleDOUBLE2061 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDATE_in_entryRuleDATE2124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDATE2135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDATE2175 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDATE2193 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDATE2208 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDATE2226 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDATE2241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleIntOperators2300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleIntOperators2317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleIntOperators2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleIntOperators2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleIntOperators2368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDistanceUnit2413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDistanceUnit2430 = new BitSet(new long[]{0x0000000000000002L});
    }


}