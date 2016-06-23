package de.hub.modsoft.twittersearch.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'twitter'", "'{'", "'}'", "'searches'", "'primitive'", "'object'", "'field'", "':'", "'TODO'"
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:76:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}' ) ;
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
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:79:28: ( ( () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:80:1: ( () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:80:1: ( () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:80:2: () otherlv_1= 'twitter' otherlv_2= '{' ( (lv_twitterTypes_3_0= ruleTwitterType ) )* otherlv_4= '}' otherlv_5= 'searches' otherlv_6= '{' ( (lv_searches_7_0= ruleSearch ) )* otherlv_8= '}'
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:80:2: ()
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getTwitterKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:94:1: ( (lv_twitterTypes_3_0= ruleTwitterType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:95:1: (lv_twitterTypes_3_0= ruleTwitterType )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:95:1: (lv_twitterTypes_3_0= ruleTwitterType )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:96:3: lv_twitterTypes_3_0= ruleTwitterType
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
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:124:1: ( (lv_searches_7_0= ruleSearch ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:125:1: (lv_searches_7_0= ruleSearch )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:125:1: (lv_searches_7_0= ruleSearch )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:126:3: lv_searches_7_0= ruleSearch
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:154:1: entryRuleTwitterType returns [EObject current=null] : iv_ruleTwitterType= ruleTwitterType EOF ;
    public final EObject entryRuleTwitterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwitterType = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:155:2: (iv_ruleTwitterType= ruleTwitterType EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:156:2: iv_ruleTwitterType= ruleTwitterType EOF
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:163:1: ruleTwitterType returns [EObject current=null] : (this_TwitterObjectType_0= ruleTwitterObjectType | this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType ) ;
    public final EObject ruleTwitterType() throws RecognitionException {
        EObject current = null;

        EObject this_TwitterObjectType_0 = null;

        EObject this_TwitterPrimitiveType_1 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:166:28: ( (this_TwitterObjectType_0= ruleTwitterObjectType | this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:167:1: (this_TwitterObjectType_0= ruleTwitterObjectType | this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:167:1: (this_TwitterObjectType_0= ruleTwitterObjectType | this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType )
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
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:168:5: this_TwitterObjectType_0= ruleTwitterObjectType
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
                    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:178:5: this_TwitterPrimitiveType_1= ruleTwitterPrimitiveType
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:194:1: entryRuleTwitterPrimitiveType returns [EObject current=null] : iv_ruleTwitterPrimitiveType= ruleTwitterPrimitiveType EOF ;
    public final EObject entryRuleTwitterPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwitterPrimitiveType = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:195:2: (iv_ruleTwitterPrimitiveType= ruleTwitterPrimitiveType EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:196:2: iv_ruleTwitterPrimitiveType= ruleTwitterPrimitiveType EOF
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:203:1: ruleTwitterPrimitiveType returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTwitterPrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:206:28: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:207:1: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:207:1: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:207:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTwitterPrimitiveType437); 

                	newLeafNode(otherlv_0, grammarAccess.getTwitterPrimitiveTypeAccess().getPrimitiveKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:211:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:212:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:212:1: (lv_name_1_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:213:3: lv_name_1_0= RULE_ID
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:237:1: entryRuleTwitterObjectType returns [EObject current=null] : iv_ruleTwitterObjectType= ruleTwitterObjectType EOF ;
    public final EObject entryRuleTwitterObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwitterObjectType = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:238:2: (iv_ruleTwitterObjectType= ruleTwitterObjectType EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:239:2: iv_ruleTwitterObjectType= ruleTwitterObjectType EOF
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:246:1: ruleTwitterObjectType returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' ) ;
    public final EObject ruleTwitterObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:249:28: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:250:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:250:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:250:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleFieldDclr ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTwitterObjectType542); 

                	newLeafNode(otherlv_0, grammarAccess.getTwitterObjectTypeAccess().getObjectKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:254:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:255:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:255:1: (lv_name_1_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:256:3: lv_name_1_0= RULE_ID
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
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:276:1: ( (lv_fields_3_0= ruleFieldDclr ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:277:1: (lv_fields_3_0= ruleFieldDclr )
            	    {
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:277:1: (lv_fields_3_0= ruleFieldDclr )
            	    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:278:3: lv_fields_3_0= ruleFieldDclr
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:306:1: entryRuleFieldDclr returns [EObject current=null] : iv_ruleFieldDclr= ruleFieldDclr EOF ;
    public final EObject entryRuleFieldDclr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDclr = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:307:2: (iv_ruleFieldDclr= ruleFieldDclr EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:308:2: iv_ruleFieldDclr= ruleFieldDclr EOF
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:315:1: ruleFieldDclr returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFieldDclr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:318:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:319:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:319:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:319:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFieldDclr693); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldDclrAccess().getFieldKeyword_0());
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:323:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:324:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:324:1: (lv_name_1_0= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:325:3: lv_name_1_0= RULE_ID
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
                
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:345:1: ( (otherlv_3= RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:346:1: (otherlv_3= RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:346:1: (otherlv_3= RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:347:3: otherlv_3= RULE_ID
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:366:1: entryRuleSearch returns [EObject current=null] : iv_ruleSearch= ruleSearch EOF ;
    public final EObject entryRuleSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearch = null;


        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:367:2: (iv_ruleSearch= ruleSearch EOF )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:368:2: iv_ruleSearch= ruleSearch EOF
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
    // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:375:1: ruleSearch returns [EObject current=null] : otherlv_0= 'TODO' ;
    public final EObject ruleSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:378:28: (otherlv_0= 'TODO' )
            // ../de.hub.modsoft.exercise6.xtext/src-gen/de/hub/modsoft/twittersearch/xtext/parser/antlr/internal/InternalTwitterSearch.g:379:2: otherlv_0= 'TODO'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSearch829); 

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
        public static final BitSet FOLLOW_19_in_ruleSearch829 = new BitSet(new long[]{0x0000000000000002L});
    }


}