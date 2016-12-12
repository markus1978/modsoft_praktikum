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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTwitterSearchParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TODO'", "'twitter'", "'{'", "'}'", "'searches'", "'primitive'", "'object'", "'field'", "':'"
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
    public String getGrammarFileName() { return "../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:61:1: ( ruleModel EOF )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:76:1: ( rule__Model__Group__0 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTwitterType"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:88:1: entryRuleTwitterType : ruleTwitterType EOF ;
    public final void entryRuleTwitterType() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:89:1: ( ruleTwitterType EOF )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:90:1: ruleTwitterType EOF
            {
             before(grammarAccess.getTwitterTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTwitterType_in_entryRuleTwitterType121);
            ruleTwitterType();

            state._fsp--;

             after(grammarAccess.getTwitterTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTwitterType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTwitterType"


    // $ANTLR start "ruleTwitterType"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:97:1: ruleTwitterType : ( ( rule__TwitterType__Alternatives ) ) ;
    public final void ruleTwitterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:101:2: ( ( ( rule__TwitterType__Alternatives ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:102:1: ( ( rule__TwitterType__Alternatives ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:102:1: ( ( rule__TwitterType__Alternatives ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:103:1: ( rule__TwitterType__Alternatives )
            {
             before(grammarAccess.getTwitterTypeAccess().getAlternatives()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:104:1: ( rule__TwitterType__Alternatives )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:104:2: rule__TwitterType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterType__Alternatives_in_ruleTwitterType154);
            rule__TwitterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTwitterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTwitterType"


    // $ANTLR start "entryRuleTwitterPrimitiveType"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:116:1: entryRuleTwitterPrimitiveType : ruleTwitterPrimitiveType EOF ;
    public final void entryRuleTwitterPrimitiveType() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:117:1: ( ruleTwitterPrimitiveType EOF )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:118:1: ruleTwitterPrimitiveType EOF
            {
             before(grammarAccess.getTwitterPrimitiveTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTwitterPrimitiveType_in_entryRuleTwitterPrimitiveType181);
            ruleTwitterPrimitiveType();

            state._fsp--;

             after(grammarAccess.getTwitterPrimitiveTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTwitterPrimitiveType188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTwitterPrimitiveType"


    // $ANTLR start "ruleTwitterPrimitiveType"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:125:1: ruleTwitterPrimitiveType : ( ( rule__TwitterPrimitiveType__Group__0 ) ) ;
    public final void ruleTwitterPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:129:2: ( ( ( rule__TwitterPrimitiveType__Group__0 ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:130:1: ( ( rule__TwitterPrimitiveType__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:130:1: ( ( rule__TwitterPrimitiveType__Group__0 ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:131:1: ( rule__TwitterPrimitiveType__Group__0 )
            {
             before(grammarAccess.getTwitterPrimitiveTypeAccess().getGroup()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:132:1: ( rule__TwitterPrimitiveType__Group__0 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:132:2: rule__TwitterPrimitiveType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__Group__0_in_ruleTwitterPrimitiveType214);
            rule__TwitterPrimitiveType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTwitterPrimitiveTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTwitterPrimitiveType"


    // $ANTLR start "entryRuleTwitterObjectType"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:144:1: entryRuleTwitterObjectType : ruleTwitterObjectType EOF ;
    public final void entryRuleTwitterObjectType() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:145:1: ( ruleTwitterObjectType EOF )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:146:1: ruleTwitterObjectType EOF
            {
             before(grammarAccess.getTwitterObjectTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTwitterObjectType_in_entryRuleTwitterObjectType241);
            ruleTwitterObjectType();

            state._fsp--;

             after(grammarAccess.getTwitterObjectTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTwitterObjectType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTwitterObjectType"


    // $ANTLR start "ruleTwitterObjectType"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:153:1: ruleTwitterObjectType : ( ( rule__TwitterObjectType__Group__0 ) ) ;
    public final void ruleTwitterObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:157:2: ( ( ( rule__TwitterObjectType__Group__0 ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:158:1: ( ( rule__TwitterObjectType__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:158:1: ( ( rule__TwitterObjectType__Group__0 ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:159:1: ( rule__TwitterObjectType__Group__0 )
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getGroup()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:160:1: ( rule__TwitterObjectType__Group__0 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:160:2: rule__TwitterObjectType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__0_in_ruleTwitterObjectType274);
            rule__TwitterObjectType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTwitterObjectTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTwitterObjectType"


    // $ANTLR start "entryRuleFieldDclr"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:172:1: entryRuleFieldDclr : ruleFieldDclr EOF ;
    public final void entryRuleFieldDclr() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:173:1: ( ruleFieldDclr EOF )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:174:1: ruleFieldDclr EOF
            {
             before(grammarAccess.getFieldDclrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldDclr_in_entryRuleFieldDclr301);
            ruleFieldDclr();

            state._fsp--;

             after(grammarAccess.getFieldDclrRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldDclr308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldDclr"


    // $ANTLR start "ruleFieldDclr"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:181:1: ruleFieldDclr : ( ( rule__FieldDclr__Group__0 ) ) ;
    public final void ruleFieldDclr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:185:2: ( ( ( rule__FieldDclr__Group__0 ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:186:1: ( ( rule__FieldDclr__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:186:1: ( ( rule__FieldDclr__Group__0 ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:187:1: ( rule__FieldDclr__Group__0 )
            {
             before(grammarAccess.getFieldDclrAccess().getGroup()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:188:1: ( rule__FieldDclr__Group__0 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:188:2: rule__FieldDclr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__0_in_ruleFieldDclr334);
            rule__FieldDclr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldDclrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldDclr"


    // $ANTLR start "entryRuleSearch"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:200:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:201:1: ( ruleSearch EOF )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:202:1: ruleSearch EOF
            {
             before(grammarAccess.getSearchRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSearch_in_entryRuleSearch361);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getSearchRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSearch368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSearch"


    // $ANTLR start "ruleSearch"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:209:1: ruleSearch : ( 'TODO' ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:213:2: ( ( 'TODO' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:214:1: ( 'TODO' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:214:1: ( 'TODO' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:215:1: 'TODO'
            {
             before(grammarAccess.getSearchAccess().getTODOKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleSearch395); 
             after(grammarAccess.getSearchAccess().getTODOKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSearch"


    // $ANTLR start "rule__TwitterType__Alternatives"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:234:1: rule__TwitterType__Alternatives : ( ( ruleTwitterObjectType ) | ( ruleTwitterPrimitiveType ) );
    public final void rule__TwitterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:238:1: ( ( ruleTwitterObjectType ) | ( ruleTwitterPrimitiveType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:239:1: ( ruleTwitterObjectType )
                    {
                    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:239:1: ( ruleTwitterObjectType )
                    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:240:1: ruleTwitterObjectType
                    {
                     before(grammarAccess.getTwitterTypeAccess().getTwitterObjectTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTwitterObjectType_in_rule__TwitterType__Alternatives436);
                    ruleTwitterObjectType();

                    state._fsp--;

                     after(grammarAccess.getTwitterTypeAccess().getTwitterObjectTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:245:6: ( ruleTwitterPrimitiveType )
                    {
                    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:245:6: ( ruleTwitterPrimitiveType )
                    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:246:1: ruleTwitterPrimitiveType
                    {
                     before(grammarAccess.getTwitterTypeAccess().getTwitterPrimitiveTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTwitterPrimitiveType_in_rule__TwitterType__Alternatives453);
                    ruleTwitterPrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTwitterTypeAccess().getTwitterPrimitiveTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:258:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:262:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:263:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0483);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0486);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:270:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:274:1: ( ( () ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:275:1: ( () )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:275:1: ( () )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:276:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:277:1: ()
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:279:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:289:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:293:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:294:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1544);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1547);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:301:1: rule__Model__Group__1__Impl : ( 'twitter' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:305:1: ( ( 'twitter' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:306:1: ( 'twitter' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:306:1: ( 'twitter' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:307:1: 'twitter'
            {
             before(grammarAccess.getModelAccess().getTwitterKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Model__Group__1__Impl575); 
             after(grammarAccess.getModelAccess().getTwitterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:320:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:324:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:325:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2606);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2609);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:332:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:336:1: ( ( '{' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:337:1: ( '{' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:337:1: ( '{' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:338:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group__2__Impl637); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:351:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:355:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:356:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3668);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3671);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:363:1: rule__Model__Group__3__Impl : ( ( rule__Model__TwitterTypesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:367:1: ( ( ( rule__Model__TwitterTypesAssignment_3 )* ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:368:1: ( ( rule__Model__TwitterTypesAssignment_3 )* )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:368:1: ( ( rule__Model__TwitterTypesAssignment_3 )* )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:369:1: ( rule__Model__TwitterTypesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getTwitterTypesAssignment_3()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:370:1: ( rule__Model__TwitterTypesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:370:2: rule__Model__TwitterTypesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__TwitterTypesAssignment_3_in_rule__Model__Group__3__Impl698);
            	    rule__Model__TwitterTypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTwitterTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:380:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:384:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:385:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4729);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4732);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:392:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:396:1: ( ( '}' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:397:1: ( '}' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:397:1: ( '}' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:398:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group__4__Impl760); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:411:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:415:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:416:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5791);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6_in_rule__Model__Group__5794);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:423:1: rule__Model__Group__5__Impl : ( 'searches' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:427:1: ( ( 'searches' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:428:1: ( 'searches' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:428:1: ( 'searches' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:429:1: 'searches'
            {
             before(grammarAccess.getModelAccess().getSearchesKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group__5__Impl822); 
             after(grammarAccess.getModelAccess().getSearchesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:442:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:446:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:447:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__6853);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__7_in_rule__Model__Group__6856);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:454:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:458:1: ( ( '{' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:459:1: ( '{' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:459:1: ( '{' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:460:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group__6__Impl884); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:473:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:477:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:478:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__7915);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__8_in_rule__Model__Group__7918);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:485:1: rule__Model__Group__7__Impl : ( ( rule__Model__SearchesAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:489:1: ( ( ( rule__Model__SearchesAssignment_7 )* ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:490:1: ( ( rule__Model__SearchesAssignment_7 )* )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:490:1: ( ( rule__Model__SearchesAssignment_7 )* )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:491:1: ( rule__Model__SearchesAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getSearchesAssignment_7()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:492:1: ( rule__Model__SearchesAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:492:2: rule__Model__SearchesAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__SearchesAssignment_7_in_rule__Model__Group__7__Impl945);
            	    rule__Model__SearchesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSearchesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:502:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:506:1: ( rule__Model__Group__8__Impl )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:507:2: rule__Model__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__8976);
            rule__Model__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:513:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:517:1: ( ( '}' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:518:1: ( '}' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:518:1: ( '}' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:519:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group__8__Impl1004); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__TwitterPrimitiveType__Group__0"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:550:1: rule__TwitterPrimitiveType__Group__0 : rule__TwitterPrimitiveType__Group__0__Impl rule__TwitterPrimitiveType__Group__1 ;
    public final void rule__TwitterPrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:554:1: ( rule__TwitterPrimitiveType__Group__0__Impl rule__TwitterPrimitiveType__Group__1 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:555:2: rule__TwitterPrimitiveType__Group__0__Impl rule__TwitterPrimitiveType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__Group__0__Impl_in_rule__TwitterPrimitiveType__Group__01053);
            rule__TwitterPrimitiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__Group__1_in_rule__TwitterPrimitiveType__Group__01056);
            rule__TwitterPrimitiveType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterPrimitiveType__Group__0"


    // $ANTLR start "rule__TwitterPrimitiveType__Group__0__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:562:1: rule__TwitterPrimitiveType__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__TwitterPrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:566:1: ( ( 'primitive' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:567:1: ( 'primitive' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:567:1: ( 'primitive' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:568:1: 'primitive'
            {
             before(grammarAccess.getTwitterPrimitiveTypeAccess().getPrimitiveKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TwitterPrimitiveType__Group__0__Impl1084); 
             after(grammarAccess.getTwitterPrimitiveTypeAccess().getPrimitiveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterPrimitiveType__Group__0__Impl"


    // $ANTLR start "rule__TwitterPrimitiveType__Group__1"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:581:1: rule__TwitterPrimitiveType__Group__1 : rule__TwitterPrimitiveType__Group__1__Impl ;
    public final void rule__TwitterPrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:585:1: ( rule__TwitterPrimitiveType__Group__1__Impl )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:586:2: rule__TwitterPrimitiveType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__Group__1__Impl_in_rule__TwitterPrimitiveType__Group__11115);
            rule__TwitterPrimitiveType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterPrimitiveType__Group__1"


    // $ANTLR start "rule__TwitterPrimitiveType__Group__1__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:592:1: rule__TwitterPrimitiveType__Group__1__Impl : ( ( rule__TwitterPrimitiveType__NameAssignment_1 ) ) ;
    public final void rule__TwitterPrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:596:1: ( ( ( rule__TwitterPrimitiveType__NameAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:597:1: ( ( rule__TwitterPrimitiveType__NameAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:597:1: ( ( rule__TwitterPrimitiveType__NameAssignment_1 ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:598:1: ( rule__TwitterPrimitiveType__NameAssignment_1 )
            {
             before(grammarAccess.getTwitterPrimitiveTypeAccess().getNameAssignment_1()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:599:1: ( rule__TwitterPrimitiveType__NameAssignment_1 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:599:2: rule__TwitterPrimitiveType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__NameAssignment_1_in_rule__TwitterPrimitiveType__Group__1__Impl1142);
            rule__TwitterPrimitiveType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTwitterPrimitiveTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterPrimitiveType__Group__1__Impl"


    // $ANTLR start "rule__TwitterObjectType__Group__0"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:613:1: rule__TwitterObjectType__Group__0 : rule__TwitterObjectType__Group__0__Impl rule__TwitterObjectType__Group__1 ;
    public final void rule__TwitterObjectType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:617:1: ( rule__TwitterObjectType__Group__0__Impl rule__TwitterObjectType__Group__1 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:618:2: rule__TwitterObjectType__Group__0__Impl rule__TwitterObjectType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__0__Impl_in_rule__TwitterObjectType__Group__01176);
            rule__TwitterObjectType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__1_in_rule__TwitterObjectType__Group__01179);
            rule__TwitterObjectType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__0"


    // $ANTLR start "rule__TwitterObjectType__Group__0__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:625:1: rule__TwitterObjectType__Group__0__Impl : ( 'object' ) ;
    public final void rule__TwitterObjectType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:629:1: ( ( 'object' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:630:1: ( 'object' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:630:1: ( 'object' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:631:1: 'object'
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getObjectKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TwitterObjectType__Group__0__Impl1207); 
             after(grammarAccess.getTwitterObjectTypeAccess().getObjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__0__Impl"


    // $ANTLR start "rule__TwitterObjectType__Group__1"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:644:1: rule__TwitterObjectType__Group__1 : rule__TwitterObjectType__Group__1__Impl rule__TwitterObjectType__Group__2 ;
    public final void rule__TwitterObjectType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:648:1: ( rule__TwitterObjectType__Group__1__Impl rule__TwitterObjectType__Group__2 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:649:2: rule__TwitterObjectType__Group__1__Impl rule__TwitterObjectType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__1__Impl_in_rule__TwitterObjectType__Group__11238);
            rule__TwitterObjectType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__2_in_rule__TwitterObjectType__Group__11241);
            rule__TwitterObjectType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__1"


    // $ANTLR start "rule__TwitterObjectType__Group__1__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:656:1: rule__TwitterObjectType__Group__1__Impl : ( ( rule__TwitterObjectType__NameAssignment_1 ) ) ;
    public final void rule__TwitterObjectType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:660:1: ( ( ( rule__TwitterObjectType__NameAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:661:1: ( ( rule__TwitterObjectType__NameAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:661:1: ( ( rule__TwitterObjectType__NameAssignment_1 ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:662:1: ( rule__TwitterObjectType__NameAssignment_1 )
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getNameAssignment_1()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:663:1: ( rule__TwitterObjectType__NameAssignment_1 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:663:2: rule__TwitterObjectType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__NameAssignment_1_in_rule__TwitterObjectType__Group__1__Impl1268);
            rule__TwitterObjectType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTwitterObjectTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__1__Impl"


    // $ANTLR start "rule__TwitterObjectType__Group__2"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:673:1: rule__TwitterObjectType__Group__2 : rule__TwitterObjectType__Group__2__Impl rule__TwitterObjectType__Group__3 ;
    public final void rule__TwitterObjectType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:677:1: ( rule__TwitterObjectType__Group__2__Impl rule__TwitterObjectType__Group__3 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:678:2: rule__TwitterObjectType__Group__2__Impl rule__TwitterObjectType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__2__Impl_in_rule__TwitterObjectType__Group__21298);
            rule__TwitterObjectType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__3_in_rule__TwitterObjectType__Group__21301);
            rule__TwitterObjectType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__2"


    // $ANTLR start "rule__TwitterObjectType__Group__2__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:685:1: rule__TwitterObjectType__Group__2__Impl : ( '{' ) ;
    public final void rule__TwitterObjectType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:689:1: ( ( '{' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:690:1: ( '{' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:690:1: ( '{' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:691:1: '{'
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__TwitterObjectType__Group__2__Impl1329); 
             after(grammarAccess.getTwitterObjectTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__2__Impl"


    // $ANTLR start "rule__TwitterObjectType__Group__3"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:704:1: rule__TwitterObjectType__Group__3 : rule__TwitterObjectType__Group__3__Impl rule__TwitterObjectType__Group__4 ;
    public final void rule__TwitterObjectType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:708:1: ( rule__TwitterObjectType__Group__3__Impl rule__TwitterObjectType__Group__4 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:709:2: rule__TwitterObjectType__Group__3__Impl rule__TwitterObjectType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__3__Impl_in_rule__TwitterObjectType__Group__31360);
            rule__TwitterObjectType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__4_in_rule__TwitterObjectType__Group__31363);
            rule__TwitterObjectType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__3"


    // $ANTLR start "rule__TwitterObjectType__Group__3__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:716:1: rule__TwitterObjectType__Group__3__Impl : ( ( rule__TwitterObjectType__FieldsAssignment_3 )* ) ;
    public final void rule__TwitterObjectType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:720:1: ( ( ( rule__TwitterObjectType__FieldsAssignment_3 )* ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:721:1: ( ( rule__TwitterObjectType__FieldsAssignment_3 )* )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:721:1: ( ( rule__TwitterObjectType__FieldsAssignment_3 )* )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:722:1: ( rule__TwitterObjectType__FieldsAssignment_3 )*
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getFieldsAssignment_3()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:723:1: ( rule__TwitterObjectType__FieldsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:723:2: rule__TwitterObjectType__FieldsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__FieldsAssignment_3_in_rule__TwitterObjectType__Group__3__Impl1390);
            	    rule__TwitterObjectType__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTwitterObjectTypeAccess().getFieldsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__3__Impl"


    // $ANTLR start "rule__TwitterObjectType__Group__4"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:733:1: rule__TwitterObjectType__Group__4 : rule__TwitterObjectType__Group__4__Impl ;
    public final void rule__TwitterObjectType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:737:1: ( rule__TwitterObjectType__Group__4__Impl )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:738:2: rule__TwitterObjectType__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__4__Impl_in_rule__TwitterObjectType__Group__41421);
            rule__TwitterObjectType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__4"


    // $ANTLR start "rule__TwitterObjectType__Group__4__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:744:1: rule__TwitterObjectType__Group__4__Impl : ( '}' ) ;
    public final void rule__TwitterObjectType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:748:1: ( ( '}' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:749:1: ( '}' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:749:1: ( '}' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:750:1: '}'
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TwitterObjectType__Group__4__Impl1449); 
             after(grammarAccess.getTwitterObjectTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__Group__4__Impl"


    // $ANTLR start "rule__FieldDclr__Group__0"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:773:1: rule__FieldDclr__Group__0 : rule__FieldDclr__Group__0__Impl rule__FieldDclr__Group__1 ;
    public final void rule__FieldDclr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:777:1: ( rule__FieldDclr__Group__0__Impl rule__FieldDclr__Group__1 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:778:2: rule__FieldDclr__Group__0__Impl rule__FieldDclr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__0__Impl_in_rule__FieldDclr__Group__01490);
            rule__FieldDclr__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__1_in_rule__FieldDclr__Group__01493);
            rule__FieldDclr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__Group__0"


    // $ANTLR start "rule__FieldDclr__Group__0__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:785:1: rule__FieldDclr__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldDclr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:789:1: ( ( 'field' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:790:1: ( 'field' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:790:1: ( 'field' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:791:1: 'field'
            {
             before(grammarAccess.getFieldDclrAccess().getFieldKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FieldDclr__Group__0__Impl1521); 
             after(grammarAccess.getFieldDclrAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__Group__0__Impl"


    // $ANTLR start "rule__FieldDclr__Group__1"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:804:1: rule__FieldDclr__Group__1 : rule__FieldDclr__Group__1__Impl rule__FieldDclr__Group__2 ;
    public final void rule__FieldDclr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:808:1: ( rule__FieldDclr__Group__1__Impl rule__FieldDclr__Group__2 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:809:2: rule__FieldDclr__Group__1__Impl rule__FieldDclr__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__1__Impl_in_rule__FieldDclr__Group__11552);
            rule__FieldDclr__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__2_in_rule__FieldDclr__Group__11555);
            rule__FieldDclr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__Group__1"


    // $ANTLR start "rule__FieldDclr__Group__1__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:816:1: rule__FieldDclr__Group__1__Impl : ( ( rule__FieldDclr__NameAssignment_1 ) ) ;
    public final void rule__FieldDclr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:820:1: ( ( ( rule__FieldDclr__NameAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:821:1: ( ( rule__FieldDclr__NameAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:821:1: ( ( rule__FieldDclr__NameAssignment_1 ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:822:1: ( rule__FieldDclr__NameAssignment_1 )
            {
             before(grammarAccess.getFieldDclrAccess().getNameAssignment_1()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:823:1: ( rule__FieldDclr__NameAssignment_1 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:823:2: rule__FieldDclr__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__NameAssignment_1_in_rule__FieldDclr__Group__1__Impl1582);
            rule__FieldDclr__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldDclrAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__Group__1__Impl"


    // $ANTLR start "rule__FieldDclr__Group__2"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:833:1: rule__FieldDclr__Group__2 : rule__FieldDclr__Group__2__Impl rule__FieldDclr__Group__3 ;
    public final void rule__FieldDclr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:837:1: ( rule__FieldDclr__Group__2__Impl rule__FieldDclr__Group__3 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:838:2: rule__FieldDclr__Group__2__Impl rule__FieldDclr__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__2__Impl_in_rule__FieldDclr__Group__21612);
            rule__FieldDclr__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__3_in_rule__FieldDclr__Group__21615);
            rule__FieldDclr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__Group__2"


    // $ANTLR start "rule__FieldDclr__Group__2__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:845:1: rule__FieldDclr__Group__2__Impl : ( ':' ) ;
    public final void rule__FieldDclr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:849:1: ( ( ':' ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:850:1: ( ':' )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:850:1: ( ':' )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:851:1: ':'
            {
             before(grammarAccess.getFieldDclrAccess().getColonKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FieldDclr__Group__2__Impl1643); 
             after(grammarAccess.getFieldDclrAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__Group__2__Impl"


    // $ANTLR start "rule__FieldDclr__Group__3"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:864:1: rule__FieldDclr__Group__3 : rule__FieldDclr__Group__3__Impl ;
    public final void rule__FieldDclr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:868:1: ( rule__FieldDclr__Group__3__Impl )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:869:2: rule__FieldDclr__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__3__Impl_in_rule__FieldDclr__Group__31674);
            rule__FieldDclr__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__Group__3"


    // $ANTLR start "rule__FieldDclr__Group__3__Impl"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:875:1: rule__FieldDclr__Group__3__Impl : ( ( rule__FieldDclr__TypeAssignment_3 ) ) ;
    public final void rule__FieldDclr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:879:1: ( ( ( rule__FieldDclr__TypeAssignment_3 ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:880:1: ( ( rule__FieldDclr__TypeAssignment_3 ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:880:1: ( ( rule__FieldDclr__TypeAssignment_3 ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:881:1: ( rule__FieldDclr__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldDclrAccess().getTypeAssignment_3()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:882:1: ( rule__FieldDclr__TypeAssignment_3 )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:882:2: rule__FieldDclr__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__TypeAssignment_3_in_rule__FieldDclr__Group__3__Impl1701);
            rule__FieldDclr__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldDclrAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__Group__3__Impl"


    // $ANTLR start "rule__Model__TwitterTypesAssignment_3"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:904:1: rule__Model__TwitterTypesAssignment_3 : ( ruleTwitterType ) ;
    public final void rule__Model__TwitterTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:908:1: ( ( ruleTwitterType ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:909:1: ( ruleTwitterType )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:909:1: ( ruleTwitterType )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:910:1: ruleTwitterType
            {
             before(grammarAccess.getModelAccess().getTwitterTypesTwitterTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTwitterType_in_rule__Model__TwitterTypesAssignment_31747);
            ruleTwitterType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTwitterTypesTwitterTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TwitterTypesAssignment_3"


    // $ANTLR start "rule__Model__SearchesAssignment_7"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:919:1: rule__Model__SearchesAssignment_7 : ( ruleSearch ) ;
    public final void rule__Model__SearchesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:923:1: ( ( ruleSearch ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:924:1: ( ruleSearch )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:924:1: ( ruleSearch )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:925:1: ruleSearch
            {
             before(grammarAccess.getModelAccess().getSearchesSearchParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSearch_in_rule__Model__SearchesAssignment_71778);
            ruleSearch();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSearchesSearchParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SearchesAssignment_7"


    // $ANTLR start "rule__TwitterPrimitiveType__NameAssignment_1"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:934:1: rule__TwitterPrimitiveType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TwitterPrimitiveType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:938:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:939:1: ( RULE_ID )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:939:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:940:1: RULE_ID
            {
             before(grammarAccess.getTwitterPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TwitterPrimitiveType__NameAssignment_11809); 
             after(grammarAccess.getTwitterPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterPrimitiveType__NameAssignment_1"


    // $ANTLR start "rule__TwitterObjectType__NameAssignment_1"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:949:1: rule__TwitterObjectType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TwitterObjectType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:953:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:954:1: ( RULE_ID )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:954:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:955:1: RULE_ID
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TwitterObjectType__NameAssignment_11840); 
             after(grammarAccess.getTwitterObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__NameAssignment_1"


    // $ANTLR start "rule__TwitterObjectType__FieldsAssignment_3"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:964:1: rule__TwitterObjectType__FieldsAssignment_3 : ( ruleFieldDclr ) ;
    public final void rule__TwitterObjectType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:968:1: ( ( ruleFieldDclr ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:969:1: ( ruleFieldDclr )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:969:1: ( ruleFieldDclr )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:970:1: ruleFieldDclr
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getFieldsFieldDclrParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldDclr_in_rule__TwitterObjectType__FieldsAssignment_31871);
            ruleFieldDclr();

            state._fsp--;

             after(grammarAccess.getTwitterObjectTypeAccess().getFieldsFieldDclrParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterObjectType__FieldsAssignment_3"


    // $ANTLR start "rule__FieldDclr__NameAssignment_1"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:979:1: rule__FieldDclr__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldDclr__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:983:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:984:1: ( RULE_ID )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:984:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:985:1: RULE_ID
            {
             before(grammarAccess.getFieldDclrAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FieldDclr__NameAssignment_11902); 
             after(grammarAccess.getFieldDclrAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__NameAssignment_1"


    // $ANTLR start "rule__FieldDclr__TypeAssignment_3"
    // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:994:1: rule__FieldDclr__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__FieldDclr__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:998:1: ( ( ( RULE_ID ) ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:999:1: ( ( RULE_ID ) )
            {
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:999:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1000:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldDclrAccess().getTypeTwitterTypeDeclarationCrossReference_3_0()); 
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1001:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise5.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1002:1: RULE_ID
            {
             before(grammarAccess.getFieldDclrAccess().getTypeTwitterTypeDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FieldDclr__TypeAssignment_31937); 
             after(grammarAccess.getFieldDclrAccess().getTypeTwitterTypeDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFieldDclrAccess().getTypeTwitterTypeDeclarationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDclr__TypeAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterType_in_entryRuleTwitterType121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTwitterType128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterType__Alternatives_in_ruleTwitterType154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterPrimitiveType_in_entryRuleTwitterPrimitiveType181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTwitterPrimitiveType188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__Group__0_in_ruleTwitterPrimitiveType214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterObjectType_in_entryRuleTwitterObjectType241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTwitterObjectType248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__0_in_ruleTwitterObjectType274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldDclr_in_entryRuleFieldDclr301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldDclr308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__0_in_ruleFieldDclr334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSearch_in_entryRuleSearch361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSearch368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSearch395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterObjectType_in_rule__TwitterType__Alternatives436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterPrimitiveType_in_rule__TwitterType__Alternatives453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0483 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1544 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Model__Group__1__Impl575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2606 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group__2__Impl637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3668 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__TwitterTypesAssignment_3_in_rule__Model__Group__3__Impl698 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4729 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group__4__Impl760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5791 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__5794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group__5__Impl822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__6853 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__6856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group__6__Impl884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__7915 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__7918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__SearchesAssignment_7_in_rule__Model__Group__7__Impl945 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__8976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group__8__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__Group__0__Impl_in_rule__TwitterPrimitiveType__Group__01053 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__Group__1_in_rule__TwitterPrimitiveType__Group__01056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TwitterPrimitiveType__Group__0__Impl1084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__Group__1__Impl_in_rule__TwitterPrimitiveType__Group__11115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__NameAssignment_1_in_rule__TwitterPrimitiveType__Group__1__Impl1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__0__Impl_in_rule__TwitterObjectType__Group__01176 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__1_in_rule__TwitterObjectType__Group__01179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TwitterObjectType__Group__0__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__1__Impl_in_rule__TwitterObjectType__Group__11238 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__2_in_rule__TwitterObjectType__Group__11241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__NameAssignment_1_in_rule__TwitterObjectType__Group__1__Impl1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__2__Impl_in_rule__TwitterObjectType__Group__21298 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__3_in_rule__TwitterObjectType__Group__21301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TwitterObjectType__Group__2__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__3__Impl_in_rule__TwitterObjectType__Group__31360 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__4_in_rule__TwitterObjectType__Group__31363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__FieldsAssignment_3_in_rule__TwitterObjectType__Group__3__Impl1390 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__4__Impl_in_rule__TwitterObjectType__Group__41421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TwitterObjectType__Group__4__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__0__Impl_in_rule__FieldDclr__Group__01490 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__1_in_rule__FieldDclr__Group__01493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FieldDclr__Group__0__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__1__Impl_in_rule__FieldDclr__Group__11552 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__2_in_rule__FieldDclr__Group__11555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__NameAssignment_1_in_rule__FieldDclr__Group__1__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__2__Impl_in_rule__FieldDclr__Group__21612 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__3_in_rule__FieldDclr__Group__21615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FieldDclr__Group__2__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__3__Impl_in_rule__FieldDclr__Group__31674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__TypeAssignment_3_in_rule__FieldDclr__Group__3__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterType_in_rule__Model__TwitterTypesAssignment_31747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSearch_in_rule__Model__SearchesAssignment_71778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TwitterPrimitiveType__NameAssignment_11809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TwitterObjectType__NameAssignment_11840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldDclr_in_rule__TwitterObjectType__FieldsAssignment_31871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FieldDclr__NameAssignment_11902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FieldDclr__TypeAssignment_31937 = new BitSet(new long[]{0x0000000000000002L});
    }


}