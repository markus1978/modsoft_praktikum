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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'='", "'>='", "'<='", "'mi'", "'km'", "'twitter'", "'{'", "'}'", "'searches'", "'primitive'", "'object'", "'field'", "':'", "'search'", "'for'", "';'", "'where'", "'&'", "'with'", "','", "'in'", "'geo'", "'('", "')'", "'before'", "'-'", "'.'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g"; }


     
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:61:1: ( ruleModel EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:62:1: ruleModel EOF
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:76:1: ( rule__Model__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:76:2: rule__Model__Group__0
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:88:1: entryRuleTwitterType : ruleTwitterType EOF ;
    public final void entryRuleTwitterType() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:89:1: ( ruleTwitterType EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:90:1: ruleTwitterType EOF
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:97:1: ruleTwitterType : ( ( rule__TwitterType__Alternatives ) ) ;
    public final void ruleTwitterType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:101:2: ( ( ( rule__TwitterType__Alternatives ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:102:1: ( ( rule__TwitterType__Alternatives ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:102:1: ( ( rule__TwitterType__Alternatives ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:103:1: ( rule__TwitterType__Alternatives )
            {
             before(grammarAccess.getTwitterTypeAccess().getAlternatives()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:104:1: ( rule__TwitterType__Alternatives )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:104:2: rule__TwitterType__Alternatives
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:116:1: entryRuleTwitterPrimitiveType : ruleTwitterPrimitiveType EOF ;
    public final void entryRuleTwitterPrimitiveType() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:117:1: ( ruleTwitterPrimitiveType EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:118:1: ruleTwitterPrimitiveType EOF
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:125:1: ruleTwitterPrimitiveType : ( ( rule__TwitterPrimitiveType__Group__0 ) ) ;
    public final void ruleTwitterPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:129:2: ( ( ( rule__TwitterPrimitiveType__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:130:1: ( ( rule__TwitterPrimitiveType__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:130:1: ( ( rule__TwitterPrimitiveType__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:131:1: ( rule__TwitterPrimitiveType__Group__0 )
            {
             before(grammarAccess.getTwitterPrimitiveTypeAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:132:1: ( rule__TwitterPrimitiveType__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:132:2: rule__TwitterPrimitiveType__Group__0
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:144:1: entryRuleTwitterObjectType : ruleTwitterObjectType EOF ;
    public final void entryRuleTwitterObjectType() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:145:1: ( ruleTwitterObjectType EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:146:1: ruleTwitterObjectType EOF
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:153:1: ruleTwitterObjectType : ( ( rule__TwitterObjectType__Group__0 ) ) ;
    public final void ruleTwitterObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:157:2: ( ( ( rule__TwitterObjectType__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:158:1: ( ( rule__TwitterObjectType__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:158:1: ( ( rule__TwitterObjectType__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:159:1: ( rule__TwitterObjectType__Group__0 )
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:160:1: ( rule__TwitterObjectType__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:160:2: rule__TwitterObjectType__Group__0
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:172:1: entryRuleFieldDclr : ruleFieldDclr EOF ;
    public final void entryRuleFieldDclr() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:173:1: ( ruleFieldDclr EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:174:1: ruleFieldDclr EOF
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:181:1: ruleFieldDclr : ( ( rule__FieldDclr__Group__0 ) ) ;
    public final void ruleFieldDclr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:185:2: ( ( ( rule__FieldDclr__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:186:1: ( ( rule__FieldDclr__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:186:1: ( ( rule__FieldDclr__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:187:1: ( rule__FieldDclr__Group__0 )
            {
             before(grammarAccess.getFieldDclrAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:188:1: ( rule__FieldDclr__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:188:2: rule__FieldDclr__Group__0
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:200:1: entryRuleSearch : ruleSearch EOF ;
    public final void entryRuleSearch() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:201:1: ( ruleSearch EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:202:1: ruleSearch EOF
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:209:1: ruleSearch : ( ( rule__Search__Group__0 ) ) ;
    public final void ruleSearch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:213:2: ( ( ( rule__Search__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:214:1: ( ( rule__Search__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:214:1: ( ( rule__Search__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:215:1: ( rule__Search__Group__0 )
            {
             before(grammarAccess.getSearchAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:216:1: ( rule__Search__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:216:2: rule__Search__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__0_in_ruleSearch394);
            rule__Search__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getGroup()); 

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


    // $ANTLR start "entryRuleOption"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:228:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:229:1: ( ruleOption EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:230:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption421);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption428); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:237:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:241:2: ( ( ( rule__Option__Alternatives ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:242:1: ( ( rule__Option__Alternatives ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:242:1: ( ( rule__Option__Alternatives ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:243:1: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:244:1: ( rule__Option__Alternatives )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:244:2: rule__Option__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Alternatives_in_ruleOption454);
            rule__Option__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleKeywords"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:256:1: entryRuleKeywords : ruleKeywords EOF ;
    public final void entryRuleKeywords() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:257:1: ( ruleKeywords EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:258:1: ruleKeywords EOF
            {
             before(grammarAccess.getKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeywords_in_entryRuleKeywords481);
            ruleKeywords();

            state._fsp--;

             after(grammarAccess.getKeywordsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeywords488); 

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
    // $ANTLR end "entryRuleKeywords"


    // $ANTLR start "ruleKeywords"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:265:1: ruleKeywords : ( ( rule__Keywords__Group__0 ) ) ;
    public final void ruleKeywords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:269:2: ( ( ( rule__Keywords__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:270:1: ( ( rule__Keywords__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:270:1: ( ( rule__Keywords__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:271:1: ( rule__Keywords__Group__0 )
            {
             before(grammarAccess.getKeywordsAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:272:1: ( rule__Keywords__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:272:2: rule__Keywords__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group__0_in_ruleKeywords514);
            rule__Keywords__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeywordsAccess().getGroup()); 

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
    // $ANTLR end "ruleKeywords"


    // $ANTLR start "entryRuleLocation"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:284:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:285:1: ( ruleLocation EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:286:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocation_in_entryRuleLocation541);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocation548); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:293:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:297:2: ( ( ( rule__Location__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:298:1: ( ( rule__Location__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:298:1: ( ( rule__Location__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:299:1: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:300:1: ( rule__Location__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:300:2: rule__Location__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__0_in_ruleLocation574);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleTime"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:312:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:313:1: ( ruleTime EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:314:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime601);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime608); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:321:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:325:2: ( ( ( rule__Time__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:326:1: ( ( rule__Time__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:326:1: ( ( rule__Time__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:327:1: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:328:1: ( rule__Time__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:328:2: rule__Time__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__0_in_ruleTime634);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleCondition"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:340:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:341:1: ( ruleCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:342:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition661);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition668); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:349:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:353:2: ( ( ( rule__Condition__Alternatives ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:354:1: ( ( rule__Condition__Alternatives ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:354:1: ( ( rule__Condition__Alternatives ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:355:1: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:356:1: ( rule__Condition__Alternatives )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:356:2: rule__Condition__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Alternatives_in_ruleCondition694);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIntCondition"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:368:1: entryRuleIntCondition : ruleIntCondition EOF ;
    public final void entryRuleIntCondition() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:369:1: ( ruleIntCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:370:1: ruleIntCondition EOF
            {
             before(grammarAccess.getIntConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntCondition_in_entryRuleIntCondition721);
            ruleIntCondition();

            state._fsp--;

             after(grammarAccess.getIntConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntCondition728); 

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
    // $ANTLR end "entryRuleIntCondition"


    // $ANTLR start "ruleIntCondition"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:377:1: ruleIntCondition : ( ( rule__IntCondition__Group__0 ) ) ;
    public final void ruleIntCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:381:2: ( ( ( rule__IntCondition__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:382:1: ( ( rule__IntCondition__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:382:1: ( ( rule__IntCondition__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:383:1: ( rule__IntCondition__Group__0 )
            {
             before(grammarAccess.getIntConditionAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:384:1: ( rule__IntCondition__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:384:2: rule__IntCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__Group__0_in_ruleIntCondition754);
            rule__IntCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleIntCondition"


    // $ANTLR start "entryRuleBooleanCondition"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:396:1: entryRuleBooleanCondition : ruleBooleanCondition EOF ;
    public final void entryRuleBooleanCondition() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:397:1: ( ruleBooleanCondition EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:398:1: ruleBooleanCondition EOF
            {
             before(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanCondition_in_entryRuleBooleanCondition781);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getBooleanConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanCondition788); 

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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:405:1: ruleBooleanCondition : ( ( rule__BooleanCondition__FieldDeclarationAssignment ) ) ;
    public final void ruleBooleanCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:409:2: ( ( ( rule__BooleanCondition__FieldDeclarationAssignment ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:410:1: ( ( rule__BooleanCondition__FieldDeclarationAssignment ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:410:1: ( ( rule__BooleanCondition__FieldDeclarationAssignment ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:411:1: ( rule__BooleanCondition__FieldDeclarationAssignment )
            {
             before(grammarAccess.getBooleanConditionAccess().getFieldDeclarationAssignment()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:412:1: ( rule__BooleanCondition__FieldDeclarationAssignment )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:412:2: rule__BooleanCondition__FieldDeclarationAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanCondition__FieldDeclarationAssignment_in_ruleBooleanCondition814);
            rule__BooleanCondition__FieldDeclarationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getFieldDeclarationAssignment()); 

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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleDOUBLE"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:424:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:425:1: ( ruleDOUBLE EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:426:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE841);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDOUBLE848); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:433:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:437:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:438:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:438:1: ( ( rule__DOUBLE__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:439:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:440:1: ( rule__DOUBLE__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:440:2: rule__DOUBLE__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE874);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleDATE"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:452:1: entryRuleDATE : ruleDATE EOF ;
    public final void entryRuleDATE() throws RecognitionException {
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:453:1: ( ruleDATE EOF )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:454:1: ruleDATE EOF
            {
             before(grammarAccess.getDATERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDATE_in_entryRuleDATE901);
            ruleDATE();

            state._fsp--;

             after(grammarAccess.getDATERule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDATE908); 

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
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:461:1: ruleDATE : ( ( rule__DATE__Group__0 ) ) ;
    public final void ruleDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:465:2: ( ( ( rule__DATE__Group__0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:466:1: ( ( rule__DATE__Group__0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:466:1: ( ( rule__DATE__Group__0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:467:1: ( rule__DATE__Group__0 )
            {
             before(grammarAccess.getDATEAccess().getGroup()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:468:1: ( rule__DATE__Group__0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:468:2: rule__DATE__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__0_in_ruleDATE934);
            rule__DATE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDATEAccess().getGroup()); 

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
    // $ANTLR end "ruleDATE"


    // $ANTLR start "ruleIntOperators"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:481:1: ruleIntOperators : ( ( rule__IntOperators__Alternatives ) ) ;
    public final void ruleIntOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:485:1: ( ( ( rule__IntOperators__Alternatives ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:486:1: ( ( rule__IntOperators__Alternatives ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:486:1: ( ( rule__IntOperators__Alternatives ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:487:1: ( rule__IntOperators__Alternatives )
            {
             before(grammarAccess.getIntOperatorsAccess().getAlternatives()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:488:1: ( rule__IntOperators__Alternatives )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:488:2: rule__IntOperators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntOperators__Alternatives_in_ruleIntOperators971);
            rule__IntOperators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntOperatorsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIntOperators"


    // $ANTLR start "ruleDistanceUnit"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:500:1: ruleDistanceUnit : ( ( rule__DistanceUnit__Alternatives ) ) ;
    public final void ruleDistanceUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:504:1: ( ( ( rule__DistanceUnit__Alternatives ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:505:1: ( ( rule__DistanceUnit__Alternatives ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:505:1: ( ( rule__DistanceUnit__Alternatives ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:506:1: ( rule__DistanceUnit__Alternatives )
            {
             before(grammarAccess.getDistanceUnitAccess().getAlternatives()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:507:1: ( rule__DistanceUnit__Alternatives )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:507:2: rule__DistanceUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DistanceUnit__Alternatives_in_ruleDistanceUnit1007);
            rule__DistanceUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDistanceUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDistanceUnit"


    // $ANTLR start "rule__TwitterType__Alternatives"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:518:1: rule__TwitterType__Alternatives : ( ( ruleTwitterObjectType ) | ( ruleTwitterPrimitiveType ) );
    public final void rule__TwitterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:522:1: ( ( ruleTwitterObjectType ) | ( ruleTwitterPrimitiveType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:523:1: ( ruleTwitterObjectType )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:523:1: ( ruleTwitterObjectType )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:524:1: ruleTwitterObjectType
                    {
                     before(grammarAccess.getTwitterTypeAccess().getTwitterObjectTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTwitterObjectType_in_rule__TwitterType__Alternatives1042);
                    ruleTwitterObjectType();

                    state._fsp--;

                     after(grammarAccess.getTwitterTypeAccess().getTwitterObjectTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:529:6: ( ruleTwitterPrimitiveType )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:529:6: ( ruleTwitterPrimitiveType )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:530:1: ruleTwitterPrimitiveType
                    {
                     before(grammarAccess.getTwitterTypeAccess().getTwitterPrimitiveTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTwitterPrimitiveType_in_rule__TwitterType__Alternatives1059);
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


    // $ANTLR start "rule__Option__Alternatives"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:540:1: rule__Option__Alternatives : ( ( ruleKeywords ) | ( ruleLocation ) | ( ruleTime ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:544:1: ( ( ruleKeywords ) | ( ruleLocation ) | ( ruleTime ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:545:1: ( ruleKeywords )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:545:1: ( ruleKeywords )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:546:1: ruleKeywords
                    {
                     before(grammarAccess.getOptionAccess().getKeywordsParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeywords_in_rule__Option__Alternatives1091);
                    ruleKeywords();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getKeywordsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:551:6: ( ruleLocation )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:551:6: ( ruleLocation )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:552:1: ruleLocation
                    {
                     before(grammarAccess.getOptionAccess().getLocationParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLocation_in_rule__Option__Alternatives1108);
                    ruleLocation();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getLocationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:557:6: ( ruleTime )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:557:6: ( ruleTime )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:558:1: ruleTime
                    {
                     before(grammarAccess.getOptionAccess().getTimeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTime_in_rule__Option__Alternatives1125);
                    ruleTime();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getTimeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Option__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:568:1: rule__Condition__Alternatives : ( ( ruleIntCondition ) | ( ruleBooleanCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:572:1: ( ( ruleIntCondition ) | ( ruleBooleanCondition ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==28||LA3_1==30) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=11 && LA3_1<=15)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:573:1: ( ruleIntCondition )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:573:1: ( ruleIntCondition )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:574:1: ruleIntCondition
                    {
                     before(grammarAccess.getConditionAccess().getIntConditionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntCondition_in_rule__Condition__Alternatives1157);
                    ruleIntCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getIntConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:579:6: ( ruleBooleanCondition )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:579:6: ( ruleBooleanCondition )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:580:1: ruleBooleanCondition
                    {
                     before(grammarAccess.getConditionAccess().getBooleanConditionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanCondition_in_rule__Condition__Alternatives1174);
                    ruleBooleanCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getBooleanConditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__IntOperators__Alternatives"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:590:1: rule__IntOperators__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__IntOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:594:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:595:1: ( ( '>' ) )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:595:1: ( ( '>' ) )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:596:1: ( '>' )
                    {
                     before(grammarAccess.getIntOperatorsAccess().getGtEnumLiteralDeclaration_0()); 
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:597:1: ( '>' )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:597:3: '>'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__IntOperators__Alternatives1207); 

                    }

                     after(grammarAccess.getIntOperatorsAccess().getGtEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:602:6: ( ( '<' ) )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:602:6: ( ( '<' ) )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:603:1: ( '<' )
                    {
                     before(grammarAccess.getIntOperatorsAccess().getLtEnumLiteralDeclaration_1()); 
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:604:1: ( '<' )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:604:3: '<'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__IntOperators__Alternatives1228); 

                    }

                     after(grammarAccess.getIntOperatorsAccess().getLtEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:609:6: ( ( '=' ) )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:609:6: ( ( '=' ) )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:610:1: ( '=' )
                    {
                     before(grammarAccess.getIntOperatorsAccess().getEqEnumLiteralDeclaration_2()); 
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:611:1: ( '=' )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:611:3: '='
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__IntOperators__Alternatives1249); 

                    }

                     after(grammarAccess.getIntOperatorsAccess().getEqEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:616:6: ( ( '>=' ) )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:616:6: ( ( '>=' ) )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:617:1: ( '>=' )
                    {
                     before(grammarAccess.getIntOperatorsAccess().getGeqEnumLiteralDeclaration_3()); 
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:618:1: ( '>=' )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:618:3: '>='
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__IntOperators__Alternatives1270); 

                    }

                     after(grammarAccess.getIntOperatorsAccess().getGeqEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:623:6: ( ( '<=' ) )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:623:6: ( ( '<=' ) )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:624:1: ( '<=' )
                    {
                     before(grammarAccess.getIntOperatorsAccess().getLeqEnumLiteralDeclaration_4()); 
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:625:1: ( '<=' )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:625:3: '<='
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__IntOperators__Alternatives1291); 

                    }

                     after(grammarAccess.getIntOperatorsAccess().getLeqEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__IntOperators__Alternatives"


    // $ANTLR start "rule__DistanceUnit__Alternatives"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:635:1: rule__DistanceUnit__Alternatives : ( ( ( 'mi' ) ) | ( ( 'km' ) ) );
    public final void rule__DistanceUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:639:1: ( ( ( 'mi' ) ) | ( ( 'km' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:640:1: ( ( 'mi' ) )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:640:1: ( ( 'mi' ) )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:641:1: ( 'mi' )
                    {
                     before(grammarAccess.getDistanceUnitAccess().getMiEnumLiteralDeclaration_0()); 
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:642:1: ( 'mi' )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:642:3: 'mi'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__DistanceUnit__Alternatives1327); 

                    }

                     after(grammarAccess.getDistanceUnitAccess().getMiEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:647:6: ( ( 'km' ) )
                    {
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:647:6: ( ( 'km' ) )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:648:1: ( 'km' )
                    {
                     before(grammarAccess.getDistanceUnitAccess().getKmEnumLiteralDeclaration_1()); 
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:649:1: ( 'km' )
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:649:3: 'km'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__DistanceUnit__Alternatives1348); 

                    }

                     after(grammarAccess.getDistanceUnitAccess().getKmEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DistanceUnit__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:661:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:665:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:666:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01381);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01384);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:673:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:677:1: ( ( () ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:678:1: ( () )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:678:1: ( () )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:679:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:680:1: ()
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:682:1: 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:692:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:696:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:697:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11442);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11445);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:704:1: rule__Model__Group__1__Impl : ( 'twitter' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:708:1: ( ( 'twitter' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:709:1: ( 'twitter' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:709:1: ( 'twitter' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:710:1: 'twitter'
            {
             before(grammarAccess.getModelAccess().getTwitterKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Model__Group__1__Impl1473); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:723:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:727:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:728:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21504);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21507);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:735:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:739:1: ( ( '{' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:740:1: ( '{' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:740:1: ( '{' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:741:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Model__Group__2__Impl1535); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:754:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:758:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:759:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31566);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31569);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:766:1: rule__Model__Group__3__Impl : ( ( rule__Model__TwitterTypesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:770:1: ( ( ( rule__Model__TwitterTypesAssignment_3 )* ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:771:1: ( ( rule__Model__TwitterTypesAssignment_3 )* )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:771:1: ( ( rule__Model__TwitterTypesAssignment_3 )* )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:772:1: ( rule__Model__TwitterTypesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getTwitterTypesAssignment_3()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:773:1: ( rule__Model__TwitterTypesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=22 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:773:2: rule__Model__TwitterTypesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__TwitterTypesAssignment_3_in_rule__Model__Group__3__Impl1596);
            	    rule__Model__TwitterTypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:783:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:787:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:788:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41627);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41630);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:795:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:799:1: ( ( '}' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:800:1: ( '}' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:800:1: ( '}' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:801:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Model__Group__4__Impl1658); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:814:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:818:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:819:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51689);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51692);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:826:1: rule__Model__Group__5__Impl : ( 'searches' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:830:1: ( ( 'searches' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:831:1: ( 'searches' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:831:1: ( 'searches' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:832:1: 'searches'
            {
             before(grammarAccess.getModelAccess().getSearchesKeyword_5()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Model__Group__5__Impl1720); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:845:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:849:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:850:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61751);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61754);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:857:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:861:1: ( ( '{' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:862:1: ( '{' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:862:1: ( '{' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:863:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Model__Group__6__Impl1782); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:876:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:880:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:881:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71813);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71816);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:888:1: rule__Model__Group__7__Impl : ( ( rule__Model__SearchesAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:892:1: ( ( ( rule__Model__SearchesAssignment_7 )* ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:893:1: ( ( rule__Model__SearchesAssignment_7 )* )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:893:1: ( ( rule__Model__SearchesAssignment_7 )* )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:894:1: ( rule__Model__SearchesAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getSearchesAssignment_7()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:895:1: ( rule__Model__SearchesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:895:2: rule__Model__SearchesAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__SearchesAssignment_7_in_rule__Model__Group__7__Impl1843);
            	    rule__Model__SearchesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:905:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:909:1: ( rule__Model__Group__8__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:910:2: rule__Model__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81874);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:916:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:920:1: ( ( '}' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:921:1: ( '}' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:921:1: ( '}' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:922:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Model__Group__8__Impl1902); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:953:1: rule__TwitterPrimitiveType__Group__0 : rule__TwitterPrimitiveType__Group__0__Impl rule__TwitterPrimitiveType__Group__1 ;
    public final void rule__TwitterPrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:957:1: ( rule__TwitterPrimitiveType__Group__0__Impl rule__TwitterPrimitiveType__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:958:2: rule__TwitterPrimitiveType__Group__0__Impl rule__TwitterPrimitiveType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__Group__0__Impl_in_rule__TwitterPrimitiveType__Group__01951);
            rule__TwitterPrimitiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__Group__1_in_rule__TwitterPrimitiveType__Group__01954);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:965:1: rule__TwitterPrimitiveType__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__TwitterPrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:969:1: ( ( 'primitive' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:970:1: ( 'primitive' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:970:1: ( 'primitive' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:971:1: 'primitive'
            {
             before(grammarAccess.getTwitterPrimitiveTypeAccess().getPrimitiveKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TwitterPrimitiveType__Group__0__Impl1982); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:984:1: rule__TwitterPrimitiveType__Group__1 : rule__TwitterPrimitiveType__Group__1__Impl ;
    public final void rule__TwitterPrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:988:1: ( rule__TwitterPrimitiveType__Group__1__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:989:2: rule__TwitterPrimitiveType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__Group__1__Impl_in_rule__TwitterPrimitiveType__Group__12013);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:995:1: rule__TwitterPrimitiveType__Group__1__Impl : ( ( rule__TwitterPrimitiveType__NameAssignment_1 ) ) ;
    public final void rule__TwitterPrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:999:1: ( ( ( rule__TwitterPrimitiveType__NameAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1000:1: ( ( rule__TwitterPrimitiveType__NameAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1000:1: ( ( rule__TwitterPrimitiveType__NameAssignment_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1001:1: ( rule__TwitterPrimitiveType__NameAssignment_1 )
            {
             before(grammarAccess.getTwitterPrimitiveTypeAccess().getNameAssignment_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1002:1: ( rule__TwitterPrimitiveType__NameAssignment_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1002:2: rule__TwitterPrimitiveType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterPrimitiveType__NameAssignment_1_in_rule__TwitterPrimitiveType__Group__1__Impl2040);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1016:1: rule__TwitterObjectType__Group__0 : rule__TwitterObjectType__Group__0__Impl rule__TwitterObjectType__Group__1 ;
    public final void rule__TwitterObjectType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1020:1: ( rule__TwitterObjectType__Group__0__Impl rule__TwitterObjectType__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1021:2: rule__TwitterObjectType__Group__0__Impl rule__TwitterObjectType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__0__Impl_in_rule__TwitterObjectType__Group__02074);
            rule__TwitterObjectType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__1_in_rule__TwitterObjectType__Group__02077);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1028:1: rule__TwitterObjectType__Group__0__Impl : ( 'object' ) ;
    public final void rule__TwitterObjectType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1032:1: ( ( 'object' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1033:1: ( 'object' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1033:1: ( 'object' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1034:1: 'object'
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getObjectKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TwitterObjectType__Group__0__Impl2105); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1047:1: rule__TwitterObjectType__Group__1 : rule__TwitterObjectType__Group__1__Impl rule__TwitterObjectType__Group__2 ;
    public final void rule__TwitterObjectType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1051:1: ( rule__TwitterObjectType__Group__1__Impl rule__TwitterObjectType__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1052:2: rule__TwitterObjectType__Group__1__Impl rule__TwitterObjectType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__1__Impl_in_rule__TwitterObjectType__Group__12136);
            rule__TwitterObjectType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__2_in_rule__TwitterObjectType__Group__12139);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1059:1: rule__TwitterObjectType__Group__1__Impl : ( ( rule__TwitterObjectType__NameAssignment_1 ) ) ;
    public final void rule__TwitterObjectType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1063:1: ( ( ( rule__TwitterObjectType__NameAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1064:1: ( ( rule__TwitterObjectType__NameAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1064:1: ( ( rule__TwitterObjectType__NameAssignment_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1065:1: ( rule__TwitterObjectType__NameAssignment_1 )
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getNameAssignment_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1066:1: ( rule__TwitterObjectType__NameAssignment_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1066:2: rule__TwitterObjectType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__NameAssignment_1_in_rule__TwitterObjectType__Group__1__Impl2166);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1076:1: rule__TwitterObjectType__Group__2 : rule__TwitterObjectType__Group__2__Impl rule__TwitterObjectType__Group__3 ;
    public final void rule__TwitterObjectType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1080:1: ( rule__TwitterObjectType__Group__2__Impl rule__TwitterObjectType__Group__3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1081:2: rule__TwitterObjectType__Group__2__Impl rule__TwitterObjectType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__2__Impl_in_rule__TwitterObjectType__Group__22196);
            rule__TwitterObjectType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__3_in_rule__TwitterObjectType__Group__22199);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1088:1: rule__TwitterObjectType__Group__2__Impl : ( '{' ) ;
    public final void rule__TwitterObjectType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1092:1: ( ( '{' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1093:1: ( '{' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1093:1: ( '{' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1094:1: '{'
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TwitterObjectType__Group__2__Impl2227); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1107:1: rule__TwitterObjectType__Group__3 : rule__TwitterObjectType__Group__3__Impl rule__TwitterObjectType__Group__4 ;
    public final void rule__TwitterObjectType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1111:1: ( rule__TwitterObjectType__Group__3__Impl rule__TwitterObjectType__Group__4 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1112:2: rule__TwitterObjectType__Group__3__Impl rule__TwitterObjectType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__3__Impl_in_rule__TwitterObjectType__Group__32258);
            rule__TwitterObjectType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__4_in_rule__TwitterObjectType__Group__32261);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1119:1: rule__TwitterObjectType__Group__3__Impl : ( ( rule__TwitterObjectType__FieldsAssignment_3 )* ) ;
    public final void rule__TwitterObjectType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1123:1: ( ( ( rule__TwitterObjectType__FieldsAssignment_3 )* ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1124:1: ( ( rule__TwitterObjectType__FieldsAssignment_3 )* )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1124:1: ( ( rule__TwitterObjectType__FieldsAssignment_3 )* )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1125:1: ( rule__TwitterObjectType__FieldsAssignment_3 )*
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getFieldsAssignment_3()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1126:1: ( rule__TwitterObjectType__FieldsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1126:2: rule__TwitterObjectType__FieldsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__FieldsAssignment_3_in_rule__TwitterObjectType__Group__3__Impl2288);
            	    rule__TwitterObjectType__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1136:1: rule__TwitterObjectType__Group__4 : rule__TwitterObjectType__Group__4__Impl ;
    public final void rule__TwitterObjectType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1140:1: ( rule__TwitterObjectType__Group__4__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1141:2: rule__TwitterObjectType__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TwitterObjectType__Group__4__Impl_in_rule__TwitterObjectType__Group__42319);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1147:1: rule__TwitterObjectType__Group__4__Impl : ( '}' ) ;
    public final void rule__TwitterObjectType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1151:1: ( ( '}' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1152:1: ( '}' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1152:1: ( '}' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1153:1: '}'
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TwitterObjectType__Group__4__Impl2347); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1176:1: rule__FieldDclr__Group__0 : rule__FieldDclr__Group__0__Impl rule__FieldDclr__Group__1 ;
    public final void rule__FieldDclr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1180:1: ( rule__FieldDclr__Group__0__Impl rule__FieldDclr__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1181:2: rule__FieldDclr__Group__0__Impl rule__FieldDclr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__0__Impl_in_rule__FieldDclr__Group__02388);
            rule__FieldDclr__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__1_in_rule__FieldDclr__Group__02391);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1188:1: rule__FieldDclr__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldDclr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1192:1: ( ( 'field' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1193:1: ( 'field' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1193:1: ( 'field' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1194:1: 'field'
            {
             before(grammarAccess.getFieldDclrAccess().getFieldKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__FieldDclr__Group__0__Impl2419); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1207:1: rule__FieldDclr__Group__1 : rule__FieldDclr__Group__1__Impl rule__FieldDclr__Group__2 ;
    public final void rule__FieldDclr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1211:1: ( rule__FieldDclr__Group__1__Impl rule__FieldDclr__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1212:2: rule__FieldDclr__Group__1__Impl rule__FieldDclr__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__1__Impl_in_rule__FieldDclr__Group__12450);
            rule__FieldDclr__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__2_in_rule__FieldDclr__Group__12453);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1219:1: rule__FieldDclr__Group__1__Impl : ( ( rule__FieldDclr__NameAssignment_1 ) ) ;
    public final void rule__FieldDclr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1223:1: ( ( ( rule__FieldDclr__NameAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1224:1: ( ( rule__FieldDclr__NameAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1224:1: ( ( rule__FieldDclr__NameAssignment_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1225:1: ( rule__FieldDclr__NameAssignment_1 )
            {
             before(grammarAccess.getFieldDclrAccess().getNameAssignment_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1226:1: ( rule__FieldDclr__NameAssignment_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1226:2: rule__FieldDclr__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__NameAssignment_1_in_rule__FieldDclr__Group__1__Impl2480);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1236:1: rule__FieldDclr__Group__2 : rule__FieldDclr__Group__2__Impl rule__FieldDclr__Group__3 ;
    public final void rule__FieldDclr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1240:1: ( rule__FieldDclr__Group__2__Impl rule__FieldDclr__Group__3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1241:2: rule__FieldDclr__Group__2__Impl rule__FieldDclr__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__2__Impl_in_rule__FieldDclr__Group__22510);
            rule__FieldDclr__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__3_in_rule__FieldDclr__Group__22513);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1248:1: rule__FieldDclr__Group__2__Impl : ( ':' ) ;
    public final void rule__FieldDclr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1252:1: ( ( ':' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1253:1: ( ':' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1253:1: ( ':' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1254:1: ':'
            {
             before(grammarAccess.getFieldDclrAccess().getColonKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__FieldDclr__Group__2__Impl2541); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1267:1: rule__FieldDclr__Group__3 : rule__FieldDclr__Group__3__Impl ;
    public final void rule__FieldDclr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1271:1: ( rule__FieldDclr__Group__3__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1272:2: rule__FieldDclr__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__Group__3__Impl_in_rule__FieldDclr__Group__32572);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1278:1: rule__FieldDclr__Group__3__Impl : ( ( rule__FieldDclr__TypeAssignment_3 ) ) ;
    public final void rule__FieldDclr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1282:1: ( ( ( rule__FieldDclr__TypeAssignment_3 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1283:1: ( ( rule__FieldDclr__TypeAssignment_3 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1283:1: ( ( rule__FieldDclr__TypeAssignment_3 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1284:1: ( rule__FieldDclr__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldDclrAccess().getTypeAssignment_3()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1285:1: ( rule__FieldDclr__TypeAssignment_3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1285:2: rule__FieldDclr__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FieldDclr__TypeAssignment_3_in_rule__FieldDclr__Group__3__Impl2599);
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


    // $ANTLR start "rule__Search__Group__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1303:1: rule__Search__Group__0 : rule__Search__Group__0__Impl rule__Search__Group__1 ;
    public final void rule__Search__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1307:1: ( rule__Search__Group__0__Impl rule__Search__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1308:2: rule__Search__Group__0__Impl rule__Search__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__0__Impl_in_rule__Search__Group__02637);
            rule__Search__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__1_in_rule__Search__Group__02640);
            rule__Search__Group__1();

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
    // $ANTLR end "rule__Search__Group__0"


    // $ANTLR start "rule__Search__Group__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1315:1: rule__Search__Group__0__Impl : ( () ) ;
    public final void rule__Search__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1319:1: ( ( () ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1320:1: ( () )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1320:1: ( () )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1321:1: ()
            {
             before(grammarAccess.getSearchAccess().getSearchAction_0()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1322:1: ()
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1324:1: 
            {
            }

             after(grammarAccess.getSearchAccess().getSearchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Search__Group__0__Impl"


    // $ANTLR start "rule__Search__Group__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1334:1: rule__Search__Group__1 : rule__Search__Group__1__Impl rule__Search__Group__2 ;
    public final void rule__Search__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1338:1: ( rule__Search__Group__1__Impl rule__Search__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1339:2: rule__Search__Group__1__Impl rule__Search__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__1__Impl_in_rule__Search__Group__12698);
            rule__Search__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__2_in_rule__Search__Group__12701);
            rule__Search__Group__2();

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
    // $ANTLR end "rule__Search__Group__1"


    // $ANTLR start "rule__Search__Group__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1346:1: rule__Search__Group__1__Impl : ( 'search' ) ;
    public final void rule__Search__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1350:1: ( ( 'search' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1351:1: ( 'search' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1351:1: ( 'search' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1352:1: 'search'
            {
             before(grammarAccess.getSearchAccess().getSearchKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Search__Group__1__Impl2729); 
             after(grammarAccess.getSearchAccess().getSearchKeyword_1()); 

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
    // $ANTLR end "rule__Search__Group__1__Impl"


    // $ANTLR start "rule__Search__Group__2"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1365:1: rule__Search__Group__2 : rule__Search__Group__2__Impl rule__Search__Group__3 ;
    public final void rule__Search__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1369:1: ( rule__Search__Group__2__Impl rule__Search__Group__3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1370:2: rule__Search__Group__2__Impl rule__Search__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__2__Impl_in_rule__Search__Group__22760);
            rule__Search__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__3_in_rule__Search__Group__22763);
            rule__Search__Group__3();

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
    // $ANTLR end "rule__Search__Group__2"


    // $ANTLR start "rule__Search__Group__2__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1377:1: rule__Search__Group__2__Impl : ( 'for' ) ;
    public final void rule__Search__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1381:1: ( ( 'for' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1382:1: ( 'for' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1382:1: ( 'for' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1383:1: 'for'
            {
             before(grammarAccess.getSearchAccess().getForKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Search__Group__2__Impl2791); 
             after(grammarAccess.getSearchAccess().getForKeyword_2()); 

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
    // $ANTLR end "rule__Search__Group__2__Impl"


    // $ANTLR start "rule__Search__Group__3"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1396:1: rule__Search__Group__3 : rule__Search__Group__3__Impl rule__Search__Group__4 ;
    public final void rule__Search__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1400:1: ( rule__Search__Group__3__Impl rule__Search__Group__4 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1401:2: rule__Search__Group__3__Impl rule__Search__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__3__Impl_in_rule__Search__Group__32822);
            rule__Search__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__4_in_rule__Search__Group__32825);
            rule__Search__Group__4();

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
    // $ANTLR end "rule__Search__Group__3"


    // $ANTLR start "rule__Search__Group__3__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1408:1: rule__Search__Group__3__Impl : ( ( rule__Search__SearchTypeAssignment_3 ) ) ;
    public final void rule__Search__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1412:1: ( ( ( rule__Search__SearchTypeAssignment_3 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1413:1: ( ( rule__Search__SearchTypeAssignment_3 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1413:1: ( ( rule__Search__SearchTypeAssignment_3 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1414:1: ( rule__Search__SearchTypeAssignment_3 )
            {
             before(grammarAccess.getSearchAccess().getSearchTypeAssignment_3()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1415:1: ( rule__Search__SearchTypeAssignment_3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1415:2: rule__Search__SearchTypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__SearchTypeAssignment_3_in_rule__Search__Group__3__Impl2852);
            rule__Search__SearchTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getSearchTypeAssignment_3()); 

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
    // $ANTLR end "rule__Search__Group__3__Impl"


    // $ANTLR start "rule__Search__Group__4"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1425:1: rule__Search__Group__4 : rule__Search__Group__4__Impl rule__Search__Group__5 ;
    public final void rule__Search__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1429:1: ( rule__Search__Group__4__Impl rule__Search__Group__5 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1430:2: rule__Search__Group__4__Impl rule__Search__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__4__Impl_in_rule__Search__Group__42882);
            rule__Search__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__5_in_rule__Search__Group__42885);
            rule__Search__Group__5();

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
    // $ANTLR end "rule__Search__Group__4"


    // $ANTLR start "rule__Search__Group__4__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1437:1: rule__Search__Group__4__Impl : ( ( rule__Search__OptionsAssignment_4 )* ) ;
    public final void rule__Search__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1441:1: ( ( ( rule__Search__OptionsAssignment_4 )* ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1442:1: ( ( rule__Search__OptionsAssignment_4 )* )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1442:1: ( ( rule__Search__OptionsAssignment_4 )* )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1443:1: ( rule__Search__OptionsAssignment_4 )*
            {
             before(grammarAccess.getSearchAccess().getOptionsAssignment_4()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1444:1: ( rule__Search__OptionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31||LA9_0==33||LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1444:2: rule__Search__OptionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Search__OptionsAssignment_4_in_rule__Search__Group__4__Impl2912);
            	    rule__Search__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSearchAccess().getOptionsAssignment_4()); 

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
    // $ANTLR end "rule__Search__Group__4__Impl"


    // $ANTLR start "rule__Search__Group__5"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1454:1: rule__Search__Group__5 : rule__Search__Group__5__Impl rule__Search__Group__6 ;
    public final void rule__Search__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1458:1: ( rule__Search__Group__5__Impl rule__Search__Group__6 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1459:2: rule__Search__Group__5__Impl rule__Search__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__5__Impl_in_rule__Search__Group__52943);
            rule__Search__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__6_in_rule__Search__Group__52946);
            rule__Search__Group__6();

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
    // $ANTLR end "rule__Search__Group__5"


    // $ANTLR start "rule__Search__Group__5__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1466:1: rule__Search__Group__5__Impl : ( ( rule__Search__Group_5__0 )? ) ;
    public final void rule__Search__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1470:1: ( ( ( rule__Search__Group_5__0 )? ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1471:1: ( ( rule__Search__Group_5__0 )? )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1471:1: ( ( rule__Search__Group_5__0 )? )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1472:1: ( rule__Search__Group_5__0 )?
            {
             before(grammarAccess.getSearchAccess().getGroup_5()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1473:1: ( rule__Search__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1473:2: rule__Search__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5__0_in_rule__Search__Group__5__Impl2973);
                    rule__Search__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSearchAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Search__Group__5__Impl"


    // $ANTLR start "rule__Search__Group__6"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1483:1: rule__Search__Group__6 : rule__Search__Group__6__Impl ;
    public final void rule__Search__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1487:1: ( rule__Search__Group__6__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1488:2: rule__Search__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group__6__Impl_in_rule__Search__Group__63004);
            rule__Search__Group__6__Impl();

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
    // $ANTLR end "rule__Search__Group__6"


    // $ANTLR start "rule__Search__Group__6__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1494:1: rule__Search__Group__6__Impl : ( ';' ) ;
    public final void rule__Search__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1498:1: ( ( ';' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1499:1: ( ';' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1499:1: ( ';' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1500:1: ';'
            {
             before(grammarAccess.getSearchAccess().getSemicolonKeyword_6()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Search__Group__6__Impl3032); 
             after(grammarAccess.getSearchAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Search__Group__6__Impl"


    // $ANTLR start "rule__Search__Group_5__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1527:1: rule__Search__Group_5__0 : rule__Search__Group_5__0__Impl rule__Search__Group_5__1 ;
    public final void rule__Search__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1531:1: ( rule__Search__Group_5__0__Impl rule__Search__Group_5__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1532:2: rule__Search__Group_5__0__Impl rule__Search__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5__0__Impl_in_rule__Search__Group_5__03077);
            rule__Search__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5__1_in_rule__Search__Group_5__03080);
            rule__Search__Group_5__1();

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
    // $ANTLR end "rule__Search__Group_5__0"


    // $ANTLR start "rule__Search__Group_5__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1539:1: rule__Search__Group_5__0__Impl : ( 'where' ) ;
    public final void rule__Search__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1543:1: ( ( 'where' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1544:1: ( 'where' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1544:1: ( 'where' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1545:1: 'where'
            {
             before(grammarAccess.getSearchAccess().getWhereKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Search__Group_5__0__Impl3108); 
             after(grammarAccess.getSearchAccess().getWhereKeyword_5_0()); 

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
    // $ANTLR end "rule__Search__Group_5__0__Impl"


    // $ANTLR start "rule__Search__Group_5__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1558:1: rule__Search__Group_5__1 : rule__Search__Group_5__1__Impl rule__Search__Group_5__2 ;
    public final void rule__Search__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1562:1: ( rule__Search__Group_5__1__Impl rule__Search__Group_5__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1563:2: rule__Search__Group_5__1__Impl rule__Search__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5__1__Impl_in_rule__Search__Group_5__13139);
            rule__Search__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5__2_in_rule__Search__Group_5__13142);
            rule__Search__Group_5__2();

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
    // $ANTLR end "rule__Search__Group_5__1"


    // $ANTLR start "rule__Search__Group_5__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1570:1: rule__Search__Group_5__1__Impl : ( ( rule__Search__ConditionsAssignment_5_1 ) ) ;
    public final void rule__Search__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1574:1: ( ( ( rule__Search__ConditionsAssignment_5_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1575:1: ( ( rule__Search__ConditionsAssignment_5_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1575:1: ( ( rule__Search__ConditionsAssignment_5_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1576:1: ( rule__Search__ConditionsAssignment_5_1 )
            {
             before(grammarAccess.getSearchAccess().getConditionsAssignment_5_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1577:1: ( rule__Search__ConditionsAssignment_5_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1577:2: rule__Search__ConditionsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__ConditionsAssignment_5_1_in_rule__Search__Group_5__1__Impl3169);
            rule__Search__ConditionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getConditionsAssignment_5_1()); 

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
    // $ANTLR end "rule__Search__Group_5__1__Impl"


    // $ANTLR start "rule__Search__Group_5__2"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1587:1: rule__Search__Group_5__2 : rule__Search__Group_5__2__Impl ;
    public final void rule__Search__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1591:1: ( rule__Search__Group_5__2__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1592:2: rule__Search__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5__2__Impl_in_rule__Search__Group_5__23199);
            rule__Search__Group_5__2__Impl();

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
    // $ANTLR end "rule__Search__Group_5__2"


    // $ANTLR start "rule__Search__Group_5__2__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1598:1: rule__Search__Group_5__2__Impl : ( ( rule__Search__Group_5_2__0 )* ) ;
    public final void rule__Search__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1602:1: ( ( ( rule__Search__Group_5_2__0 )* ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1603:1: ( ( rule__Search__Group_5_2__0 )* )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1603:1: ( ( rule__Search__Group_5_2__0 )* )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1604:1: ( rule__Search__Group_5_2__0 )*
            {
             before(grammarAccess.getSearchAccess().getGroup_5_2()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1605:1: ( rule__Search__Group_5_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1605:2: rule__Search__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5_2__0_in_rule__Search__Group_5__2__Impl3226);
            	    rule__Search__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSearchAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__Search__Group_5__2__Impl"


    // $ANTLR start "rule__Search__Group_5_2__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1621:1: rule__Search__Group_5_2__0 : rule__Search__Group_5_2__0__Impl rule__Search__Group_5_2__1 ;
    public final void rule__Search__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1625:1: ( rule__Search__Group_5_2__0__Impl rule__Search__Group_5_2__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1626:2: rule__Search__Group_5_2__0__Impl rule__Search__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5_2__0__Impl_in_rule__Search__Group_5_2__03263);
            rule__Search__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5_2__1_in_rule__Search__Group_5_2__03266);
            rule__Search__Group_5_2__1();

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
    // $ANTLR end "rule__Search__Group_5_2__0"


    // $ANTLR start "rule__Search__Group_5_2__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1633:1: rule__Search__Group_5_2__0__Impl : ( '&' ) ;
    public final void rule__Search__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1637:1: ( ( '&' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1638:1: ( '&' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1638:1: ( '&' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1639:1: '&'
            {
             before(grammarAccess.getSearchAccess().getAmpersandKeyword_5_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Search__Group_5_2__0__Impl3294); 
             after(grammarAccess.getSearchAccess().getAmpersandKeyword_5_2_0()); 

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
    // $ANTLR end "rule__Search__Group_5_2__0__Impl"


    // $ANTLR start "rule__Search__Group_5_2__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1652:1: rule__Search__Group_5_2__1 : rule__Search__Group_5_2__1__Impl ;
    public final void rule__Search__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1656:1: ( rule__Search__Group_5_2__1__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1657:2: rule__Search__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__Group_5_2__1__Impl_in_rule__Search__Group_5_2__13325);
            rule__Search__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__Search__Group_5_2__1"


    // $ANTLR start "rule__Search__Group_5_2__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1663:1: rule__Search__Group_5_2__1__Impl : ( ( rule__Search__ConditionsAssignment_5_2_1 ) ) ;
    public final void rule__Search__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1667:1: ( ( ( rule__Search__ConditionsAssignment_5_2_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1668:1: ( ( rule__Search__ConditionsAssignment_5_2_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1668:1: ( ( rule__Search__ConditionsAssignment_5_2_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1669:1: ( rule__Search__ConditionsAssignment_5_2_1 )
            {
             before(grammarAccess.getSearchAccess().getConditionsAssignment_5_2_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1670:1: ( rule__Search__ConditionsAssignment_5_2_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1670:2: rule__Search__ConditionsAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Search__ConditionsAssignment_5_2_1_in_rule__Search__Group_5_2__1__Impl3352);
            rule__Search__ConditionsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSearchAccess().getConditionsAssignment_5_2_1()); 

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
    // $ANTLR end "rule__Search__Group_5_2__1__Impl"


    // $ANTLR start "rule__Keywords__Group__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1684:1: rule__Keywords__Group__0 : rule__Keywords__Group__0__Impl rule__Keywords__Group__1 ;
    public final void rule__Keywords__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1688:1: ( rule__Keywords__Group__0__Impl rule__Keywords__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1689:2: rule__Keywords__Group__0__Impl rule__Keywords__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group__0__Impl_in_rule__Keywords__Group__03386);
            rule__Keywords__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group__1_in_rule__Keywords__Group__03389);
            rule__Keywords__Group__1();

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
    // $ANTLR end "rule__Keywords__Group__0"


    // $ANTLR start "rule__Keywords__Group__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1696:1: rule__Keywords__Group__0__Impl : ( 'with' ) ;
    public final void rule__Keywords__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1700:1: ( ( 'with' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1701:1: ( 'with' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1701:1: ( 'with' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1702:1: 'with'
            {
             before(grammarAccess.getKeywordsAccess().getWithKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Keywords__Group__0__Impl3417); 
             after(grammarAccess.getKeywordsAccess().getWithKeyword_0()); 

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
    // $ANTLR end "rule__Keywords__Group__0__Impl"


    // $ANTLR start "rule__Keywords__Group__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1715:1: rule__Keywords__Group__1 : rule__Keywords__Group__1__Impl rule__Keywords__Group__2 ;
    public final void rule__Keywords__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1719:1: ( rule__Keywords__Group__1__Impl rule__Keywords__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1720:2: rule__Keywords__Group__1__Impl rule__Keywords__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group__1__Impl_in_rule__Keywords__Group__13448);
            rule__Keywords__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group__2_in_rule__Keywords__Group__13451);
            rule__Keywords__Group__2();

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
    // $ANTLR end "rule__Keywords__Group__1"


    // $ANTLR start "rule__Keywords__Group__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1727:1: rule__Keywords__Group__1__Impl : ( ( rule__Keywords__KeywordsAssignment_1 ) ) ;
    public final void rule__Keywords__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1731:1: ( ( ( rule__Keywords__KeywordsAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1732:1: ( ( rule__Keywords__KeywordsAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1732:1: ( ( rule__Keywords__KeywordsAssignment_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1733:1: ( rule__Keywords__KeywordsAssignment_1 )
            {
             before(grammarAccess.getKeywordsAccess().getKeywordsAssignment_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1734:1: ( rule__Keywords__KeywordsAssignment_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1734:2: rule__Keywords__KeywordsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Keywords__KeywordsAssignment_1_in_rule__Keywords__Group__1__Impl3478);
            rule__Keywords__KeywordsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeywordsAccess().getKeywordsAssignment_1()); 

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
    // $ANTLR end "rule__Keywords__Group__1__Impl"


    // $ANTLR start "rule__Keywords__Group__2"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1744:1: rule__Keywords__Group__2 : rule__Keywords__Group__2__Impl ;
    public final void rule__Keywords__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1748:1: ( rule__Keywords__Group__2__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1749:2: rule__Keywords__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group__2__Impl_in_rule__Keywords__Group__23508);
            rule__Keywords__Group__2__Impl();

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
    // $ANTLR end "rule__Keywords__Group__2"


    // $ANTLR start "rule__Keywords__Group__2__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1755:1: rule__Keywords__Group__2__Impl : ( ( rule__Keywords__Group_2__0 )* ) ;
    public final void rule__Keywords__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1759:1: ( ( ( rule__Keywords__Group_2__0 )* ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1760:1: ( ( rule__Keywords__Group_2__0 )* )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1760:1: ( ( rule__Keywords__Group_2__0 )* )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1761:1: ( rule__Keywords__Group_2__0 )*
            {
             before(grammarAccess.getKeywordsAccess().getGroup_2()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1762:1: ( rule__Keywords__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1762:2: rule__Keywords__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group_2__0_in_rule__Keywords__Group__2__Impl3535);
            	    rule__Keywords__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getKeywordsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Keywords__Group__2__Impl"


    // $ANTLR start "rule__Keywords__Group_2__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1778:1: rule__Keywords__Group_2__0 : rule__Keywords__Group_2__0__Impl rule__Keywords__Group_2__1 ;
    public final void rule__Keywords__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1782:1: ( rule__Keywords__Group_2__0__Impl rule__Keywords__Group_2__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1783:2: rule__Keywords__Group_2__0__Impl rule__Keywords__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group_2__0__Impl_in_rule__Keywords__Group_2__03572);
            rule__Keywords__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group_2__1_in_rule__Keywords__Group_2__03575);
            rule__Keywords__Group_2__1();

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
    // $ANTLR end "rule__Keywords__Group_2__0"


    // $ANTLR start "rule__Keywords__Group_2__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1790:1: rule__Keywords__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Keywords__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1794:1: ( ( ',' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1795:1: ( ',' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1795:1: ( ',' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1796:1: ','
            {
             before(grammarAccess.getKeywordsAccess().getCommaKeyword_2_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Keywords__Group_2__0__Impl3603); 
             after(grammarAccess.getKeywordsAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Keywords__Group_2__0__Impl"


    // $ANTLR start "rule__Keywords__Group_2__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1809:1: rule__Keywords__Group_2__1 : rule__Keywords__Group_2__1__Impl ;
    public final void rule__Keywords__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1813:1: ( rule__Keywords__Group_2__1__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1814:2: rule__Keywords__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Keywords__Group_2__1__Impl_in_rule__Keywords__Group_2__13634);
            rule__Keywords__Group_2__1__Impl();

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
    // $ANTLR end "rule__Keywords__Group_2__1"


    // $ANTLR start "rule__Keywords__Group_2__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1820:1: rule__Keywords__Group_2__1__Impl : ( ( rule__Keywords__KeywordsAssignment_2_1 ) ) ;
    public final void rule__Keywords__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1824:1: ( ( ( rule__Keywords__KeywordsAssignment_2_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1825:1: ( ( rule__Keywords__KeywordsAssignment_2_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1825:1: ( ( rule__Keywords__KeywordsAssignment_2_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1826:1: ( rule__Keywords__KeywordsAssignment_2_1 )
            {
             before(grammarAccess.getKeywordsAccess().getKeywordsAssignment_2_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1827:1: ( rule__Keywords__KeywordsAssignment_2_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1827:2: rule__Keywords__KeywordsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Keywords__KeywordsAssignment_2_1_in_rule__Keywords__Group_2__1__Impl3661);
            rule__Keywords__KeywordsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getKeywordsAccess().getKeywordsAssignment_2_1()); 

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
    // $ANTLR end "rule__Keywords__Group_2__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1841:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1845:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1846:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__0__Impl_in_rule__Location__Group__03695);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__1_in_rule__Location__Group__03698);
            rule__Location__Group__1();

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
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1853:1: rule__Location__Group__0__Impl : ( 'in' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1857:1: ( ( 'in' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1858:1: ( 'in' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1858:1: ( 'in' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1859:1: 'in'
            {
             before(grammarAccess.getLocationAccess().getInKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Location__Group__0__Impl3726); 
             after(grammarAccess.getLocationAccess().getInKeyword_0()); 

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
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1872:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1876:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1877:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__1__Impl_in_rule__Location__Group__13757);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__2_in_rule__Location__Group__13760);
            rule__Location__Group__2();

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
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1884:1: rule__Location__Group__1__Impl : ( 'geo' ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1888:1: ( ( 'geo' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1889:1: ( 'geo' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1889:1: ( 'geo' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1890:1: 'geo'
            {
             before(grammarAccess.getLocationAccess().getGeoKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Location__Group__1__Impl3788); 
             after(grammarAccess.getLocationAccess().getGeoKeyword_1()); 

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
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1903:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1907:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1908:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__2__Impl_in_rule__Location__Group__23819);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__3_in_rule__Location__Group__23822);
            rule__Location__Group__3();

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
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1915:1: rule__Location__Group__2__Impl : ( '(' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1919:1: ( ( '(' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1920:1: ( '(' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1920:1: ( '(' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1921:1: '('
            {
             before(grammarAccess.getLocationAccess().getLeftParenthesisKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Location__Group__2__Impl3850); 
             after(grammarAccess.getLocationAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1934:1: rule__Location__Group__3 : rule__Location__Group__3__Impl rule__Location__Group__4 ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1938:1: ( rule__Location__Group__3__Impl rule__Location__Group__4 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1939:2: rule__Location__Group__3__Impl rule__Location__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__3__Impl_in_rule__Location__Group__33881);
            rule__Location__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__4_in_rule__Location__Group__33884);
            rule__Location__Group__4();

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
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1946:1: rule__Location__Group__3__Impl : ( ( rule__Location__LonAssignment_3 ) ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1950:1: ( ( ( rule__Location__LonAssignment_3 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1951:1: ( ( rule__Location__LonAssignment_3 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1951:1: ( ( rule__Location__LonAssignment_3 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1952:1: ( rule__Location__LonAssignment_3 )
            {
             before(grammarAccess.getLocationAccess().getLonAssignment_3()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1953:1: ( rule__Location__LonAssignment_3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1953:2: rule__Location__LonAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__LonAssignment_3_in_rule__Location__Group__3__Impl3911);
            rule__Location__LonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLonAssignment_3()); 

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
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Location__Group__4"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1963:1: rule__Location__Group__4 : rule__Location__Group__4__Impl rule__Location__Group__5 ;
    public final void rule__Location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1967:1: ( rule__Location__Group__4__Impl rule__Location__Group__5 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1968:2: rule__Location__Group__4__Impl rule__Location__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__4__Impl_in_rule__Location__Group__43941);
            rule__Location__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__5_in_rule__Location__Group__43944);
            rule__Location__Group__5();

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
    // $ANTLR end "rule__Location__Group__4"


    // $ANTLR start "rule__Location__Group__4__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1975:1: rule__Location__Group__4__Impl : ( ',' ) ;
    public final void rule__Location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1979:1: ( ( ',' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1980:1: ( ',' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1980:1: ( ',' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1981:1: ','
            {
             before(grammarAccess.getLocationAccess().getCommaKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Location__Group__4__Impl3972); 
             after(grammarAccess.getLocationAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Location__Group__4__Impl"


    // $ANTLR start "rule__Location__Group__5"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1994:1: rule__Location__Group__5 : rule__Location__Group__5__Impl rule__Location__Group__6 ;
    public final void rule__Location__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1998:1: ( rule__Location__Group__5__Impl rule__Location__Group__6 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:1999:2: rule__Location__Group__5__Impl rule__Location__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__5__Impl_in_rule__Location__Group__54003);
            rule__Location__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__6_in_rule__Location__Group__54006);
            rule__Location__Group__6();

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
    // $ANTLR end "rule__Location__Group__5"


    // $ANTLR start "rule__Location__Group__5__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2006:1: rule__Location__Group__5__Impl : ( ( rule__Location__LatAssignment_5 ) ) ;
    public final void rule__Location__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2010:1: ( ( ( rule__Location__LatAssignment_5 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2011:1: ( ( rule__Location__LatAssignment_5 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2011:1: ( ( rule__Location__LatAssignment_5 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2012:1: ( rule__Location__LatAssignment_5 )
            {
             before(grammarAccess.getLocationAccess().getLatAssignment_5()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2013:1: ( rule__Location__LatAssignment_5 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2013:2: rule__Location__LatAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__LatAssignment_5_in_rule__Location__Group__5__Impl4033);
            rule__Location__LatAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLatAssignment_5()); 

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
    // $ANTLR end "rule__Location__Group__5__Impl"


    // $ANTLR start "rule__Location__Group__6"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2023:1: rule__Location__Group__6 : rule__Location__Group__6__Impl rule__Location__Group__7 ;
    public final void rule__Location__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2027:1: ( rule__Location__Group__6__Impl rule__Location__Group__7 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2028:2: rule__Location__Group__6__Impl rule__Location__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__6__Impl_in_rule__Location__Group__64063);
            rule__Location__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__7_in_rule__Location__Group__64066);
            rule__Location__Group__7();

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
    // $ANTLR end "rule__Location__Group__6"


    // $ANTLR start "rule__Location__Group__6__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2035:1: rule__Location__Group__6__Impl : ( ',' ) ;
    public final void rule__Location__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2039:1: ( ( ',' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2040:1: ( ',' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2040:1: ( ',' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2041:1: ','
            {
             before(grammarAccess.getLocationAccess().getCommaKeyword_6()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Location__Group__6__Impl4094); 
             after(grammarAccess.getLocationAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Location__Group__6__Impl"


    // $ANTLR start "rule__Location__Group__7"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2054:1: rule__Location__Group__7 : rule__Location__Group__7__Impl rule__Location__Group__8 ;
    public final void rule__Location__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2058:1: ( rule__Location__Group__7__Impl rule__Location__Group__8 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2059:2: rule__Location__Group__7__Impl rule__Location__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__7__Impl_in_rule__Location__Group__74125);
            rule__Location__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__8_in_rule__Location__Group__74128);
            rule__Location__Group__8();

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
    // $ANTLR end "rule__Location__Group__7"


    // $ANTLR start "rule__Location__Group__7__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2066:1: rule__Location__Group__7__Impl : ( ( rule__Location__RadiusAssignment_7 ) ) ;
    public final void rule__Location__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2070:1: ( ( ( rule__Location__RadiusAssignment_7 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2071:1: ( ( rule__Location__RadiusAssignment_7 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2071:1: ( ( rule__Location__RadiusAssignment_7 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2072:1: ( rule__Location__RadiusAssignment_7 )
            {
             before(grammarAccess.getLocationAccess().getRadiusAssignment_7()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2073:1: ( rule__Location__RadiusAssignment_7 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2073:2: rule__Location__RadiusAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__RadiusAssignment_7_in_rule__Location__Group__7__Impl4155);
            rule__Location__RadiusAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getRadiusAssignment_7()); 

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
    // $ANTLR end "rule__Location__Group__7__Impl"


    // $ANTLR start "rule__Location__Group__8"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2083:1: rule__Location__Group__8 : rule__Location__Group__8__Impl rule__Location__Group__9 ;
    public final void rule__Location__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2087:1: ( rule__Location__Group__8__Impl rule__Location__Group__9 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2088:2: rule__Location__Group__8__Impl rule__Location__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__8__Impl_in_rule__Location__Group__84185);
            rule__Location__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__9_in_rule__Location__Group__84188);
            rule__Location__Group__9();

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
    // $ANTLR end "rule__Location__Group__8"


    // $ANTLR start "rule__Location__Group__8__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2095:1: rule__Location__Group__8__Impl : ( ( rule__Location__RadiusUnitAssignment_8 ) ) ;
    public final void rule__Location__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2099:1: ( ( ( rule__Location__RadiusUnitAssignment_8 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2100:1: ( ( rule__Location__RadiusUnitAssignment_8 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2100:1: ( ( rule__Location__RadiusUnitAssignment_8 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2101:1: ( rule__Location__RadiusUnitAssignment_8 )
            {
             before(grammarAccess.getLocationAccess().getRadiusUnitAssignment_8()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2102:1: ( rule__Location__RadiusUnitAssignment_8 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2102:2: rule__Location__RadiusUnitAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__RadiusUnitAssignment_8_in_rule__Location__Group__8__Impl4215);
            rule__Location__RadiusUnitAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getRadiusUnitAssignment_8()); 

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
    // $ANTLR end "rule__Location__Group__8__Impl"


    // $ANTLR start "rule__Location__Group__9"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2112:1: rule__Location__Group__9 : rule__Location__Group__9__Impl ;
    public final void rule__Location__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2116:1: ( rule__Location__Group__9__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2117:2: rule__Location__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Location__Group__9__Impl_in_rule__Location__Group__94245);
            rule__Location__Group__9__Impl();

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
    // $ANTLR end "rule__Location__Group__9"


    // $ANTLR start "rule__Location__Group__9__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2123:1: rule__Location__Group__9__Impl : ( ')' ) ;
    public final void rule__Location__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2127:1: ( ( ')' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2128:1: ( ')' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2128:1: ( ')' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2129:1: ')'
            {
             before(grammarAccess.getLocationAccess().getRightParenthesisKeyword_9()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Location__Group__9__Impl4273); 
             after(grammarAccess.getLocationAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__Location__Group__9__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2162:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2166:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2167:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__0__Impl_in_rule__Time__Group__04324);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__1_in_rule__Time__Group__04327);
            rule__Time__Group__1();

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
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2174:1: rule__Time__Group__0__Impl : ( 'before' ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2178:1: ( ( 'before' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2179:1: ( 'before' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2179:1: ( 'before' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2180:1: 'before'
            {
             before(grammarAccess.getTimeAccess().getBeforeKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Time__Group__0__Impl4355); 
             after(grammarAccess.getTimeAccess().getBeforeKeyword_0()); 

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
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2193:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2197:1: ( rule__Time__Group__1__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2198:2: rule__Time__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__Group__1__Impl_in_rule__Time__Group__14386);
            rule__Time__Group__1__Impl();

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
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2204:1: rule__Time__Group__1__Impl : ( ( rule__Time__BeforeAssignment_1 ) ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2208:1: ( ( ( rule__Time__BeforeAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2209:1: ( ( rule__Time__BeforeAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2209:1: ( ( rule__Time__BeforeAssignment_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2210:1: ( rule__Time__BeforeAssignment_1 )
            {
             before(grammarAccess.getTimeAccess().getBeforeAssignment_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2211:1: ( rule__Time__BeforeAssignment_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2211:2: rule__Time__BeforeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Time__BeforeAssignment_1_in_rule__Time__Group__1__Impl4413);
            rule__Time__BeforeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getBeforeAssignment_1()); 

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
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__IntCondition__Group__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2225:1: rule__IntCondition__Group__0 : rule__IntCondition__Group__0__Impl rule__IntCondition__Group__1 ;
    public final void rule__IntCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2229:1: ( rule__IntCondition__Group__0__Impl rule__IntCondition__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2230:2: rule__IntCondition__Group__0__Impl rule__IntCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__Group__0__Impl_in_rule__IntCondition__Group__04447);
            rule__IntCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__Group__1_in_rule__IntCondition__Group__04450);
            rule__IntCondition__Group__1();

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
    // $ANTLR end "rule__IntCondition__Group__0"


    // $ANTLR start "rule__IntCondition__Group__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2237:1: rule__IntCondition__Group__0__Impl : ( ( rule__IntCondition__FieldDeclarationAssignment_0 ) ) ;
    public final void rule__IntCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2241:1: ( ( ( rule__IntCondition__FieldDeclarationAssignment_0 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2242:1: ( ( rule__IntCondition__FieldDeclarationAssignment_0 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2242:1: ( ( rule__IntCondition__FieldDeclarationAssignment_0 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2243:1: ( rule__IntCondition__FieldDeclarationAssignment_0 )
            {
             before(grammarAccess.getIntConditionAccess().getFieldDeclarationAssignment_0()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2244:1: ( rule__IntCondition__FieldDeclarationAssignment_0 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2244:2: rule__IntCondition__FieldDeclarationAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__FieldDeclarationAssignment_0_in_rule__IntCondition__Group__0__Impl4477);
            rule__IntCondition__FieldDeclarationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntConditionAccess().getFieldDeclarationAssignment_0()); 

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
    // $ANTLR end "rule__IntCondition__Group__0__Impl"


    // $ANTLR start "rule__IntCondition__Group__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2254:1: rule__IntCondition__Group__1 : rule__IntCondition__Group__1__Impl rule__IntCondition__Group__2 ;
    public final void rule__IntCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2258:1: ( rule__IntCondition__Group__1__Impl rule__IntCondition__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2259:2: rule__IntCondition__Group__1__Impl rule__IntCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__Group__1__Impl_in_rule__IntCondition__Group__14507);
            rule__IntCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__Group__2_in_rule__IntCondition__Group__14510);
            rule__IntCondition__Group__2();

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
    // $ANTLR end "rule__IntCondition__Group__1"


    // $ANTLR start "rule__IntCondition__Group__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2266:1: rule__IntCondition__Group__1__Impl : ( ( rule__IntCondition__OperatorAssignment_1 ) ) ;
    public final void rule__IntCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2270:1: ( ( ( rule__IntCondition__OperatorAssignment_1 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2271:1: ( ( rule__IntCondition__OperatorAssignment_1 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2271:1: ( ( rule__IntCondition__OperatorAssignment_1 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2272:1: ( rule__IntCondition__OperatorAssignment_1 )
            {
             before(grammarAccess.getIntConditionAccess().getOperatorAssignment_1()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2273:1: ( rule__IntCondition__OperatorAssignment_1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2273:2: rule__IntCondition__OperatorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__OperatorAssignment_1_in_rule__IntCondition__Group__1__Impl4537);
            rule__IntCondition__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntConditionAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__IntCondition__Group__1__Impl"


    // $ANTLR start "rule__IntCondition__Group__2"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2283:1: rule__IntCondition__Group__2 : rule__IntCondition__Group__2__Impl ;
    public final void rule__IntCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2287:1: ( rule__IntCondition__Group__2__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2288:2: rule__IntCondition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__Group__2__Impl_in_rule__IntCondition__Group__24567);
            rule__IntCondition__Group__2__Impl();

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
    // $ANTLR end "rule__IntCondition__Group__2"


    // $ANTLR start "rule__IntCondition__Group__2__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2294:1: rule__IntCondition__Group__2__Impl : ( ( rule__IntCondition__OperandAssignment_2 ) ) ;
    public final void rule__IntCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2298:1: ( ( ( rule__IntCondition__OperandAssignment_2 ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2299:1: ( ( rule__IntCondition__OperandAssignment_2 ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2299:1: ( ( rule__IntCondition__OperandAssignment_2 ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2300:1: ( rule__IntCondition__OperandAssignment_2 )
            {
             before(grammarAccess.getIntConditionAccess().getOperandAssignment_2()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2301:1: ( rule__IntCondition__OperandAssignment_2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2301:2: rule__IntCondition__OperandAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntCondition__OperandAssignment_2_in_rule__IntCondition__Group__2__Impl4594);
            rule__IntCondition__OperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntConditionAccess().getOperandAssignment_2()); 

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
    // $ANTLR end "rule__IntCondition__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2317:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2321:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2322:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__04630);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__04633);
            rule__DOUBLE__Group__1();

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
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2329:1: rule__DOUBLE__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2333:1: ( ( ( '-' )? ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2334:1: ( ( '-' )? )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2334:1: ( ( '-' )? )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2335:1: ( '-' )?
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2336:1: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2337:2: '-'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__DOUBLE__Group__0__Impl4662); 

                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2348:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2352:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2353:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__14695);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__14698);
            rule__DOUBLE__Group__2();

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
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2360:1: rule__DOUBLE__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2364:1: ( ( RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2365:1: ( RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2365:1: ( RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2366:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__DOUBLE__Group__1__Impl4725); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2377:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2381:1: ( rule__DOUBLE__Group__2__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2382:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__24754);
            rule__DOUBLE__Group__2__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2388:1: rule__DOUBLE__Group__2__Impl : ( ( rule__DOUBLE__Group_2__0 )? ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2392:1: ( ( ( rule__DOUBLE__Group_2__0 )? ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2393:1: ( ( rule__DOUBLE__Group_2__0 )? )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2393:1: ( ( rule__DOUBLE__Group_2__0 )? )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2394:1: ( rule__DOUBLE__Group_2__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_2()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2395:1: ( rule__DOUBLE__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2395:2: rule__DOUBLE__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group_2__0_in_rule__DOUBLE__Group__2__Impl4781);
                    rule__DOUBLE__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group_2__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2411:1: rule__DOUBLE__Group_2__0 : rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 ;
    public final void rule__DOUBLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2415:1: ( rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2416:2: rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group_2__0__Impl_in_rule__DOUBLE__Group_2__04818);
            rule__DOUBLE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group_2__1_in_rule__DOUBLE__Group_2__04821);
            rule__DOUBLE__Group_2__1();

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
    // $ANTLR end "rule__DOUBLE__Group_2__0"


    // $ANTLR start "rule__DOUBLE__Group_2__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2423:1: rule__DOUBLE__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2427:1: ( ( '.' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2428:1: ( '.' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2428:1: ( '.' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2429:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__DOUBLE__Group_2__0__Impl4849); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group_2__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_2__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2442:1: rule__DOUBLE__Group_2__1 : rule__DOUBLE__Group_2__1__Impl ;
    public final void rule__DOUBLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2446:1: ( rule__DOUBLE__Group_2__1__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2447:2: rule__DOUBLE__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DOUBLE__Group_2__1__Impl_in_rule__DOUBLE__Group_2__14880);
            rule__DOUBLE__Group_2__1__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group_2__1"


    // $ANTLR start "rule__DOUBLE__Group_2__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2453:1: rule__DOUBLE__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2457:1: ( ( RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2458:1: ( RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2458:1: ( RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2459:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__DOUBLE__Group_2__1__Impl4907); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group_2__1__Impl"


    // $ANTLR start "rule__DATE__Group__0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2474:1: rule__DATE__Group__0 : rule__DATE__Group__0__Impl rule__DATE__Group__1 ;
    public final void rule__DATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2478:1: ( rule__DATE__Group__0__Impl rule__DATE__Group__1 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2479:2: rule__DATE__Group__0__Impl rule__DATE__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__0__Impl_in_rule__DATE__Group__04940);
            rule__DATE__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__1_in_rule__DATE__Group__04943);
            rule__DATE__Group__1();

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
    // $ANTLR end "rule__DATE__Group__0"


    // $ANTLR start "rule__DATE__Group__0__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2486:1: rule__DATE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2490:1: ( ( RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2491:1: ( RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2491:1: ( RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2492:1: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__DATE__Group__0__Impl4970); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DATE__Group__0__Impl"


    // $ANTLR start "rule__DATE__Group__1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2503:1: rule__DATE__Group__1 : rule__DATE__Group__1__Impl rule__DATE__Group__2 ;
    public final void rule__DATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2507:1: ( rule__DATE__Group__1__Impl rule__DATE__Group__2 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2508:2: rule__DATE__Group__1__Impl rule__DATE__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__1__Impl_in_rule__DATE__Group__14999);
            rule__DATE__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__2_in_rule__DATE__Group__15002);
            rule__DATE__Group__2();

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
    // $ANTLR end "rule__DATE__Group__1"


    // $ANTLR start "rule__DATE__Group__1__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2515:1: rule__DATE__Group__1__Impl : ( '.' ) ;
    public final void rule__DATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2519:1: ( ( '.' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2520:1: ( '.' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2520:1: ( '.' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2521:1: '.'
            {
             before(grammarAccess.getDATEAccess().getFullStopKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__DATE__Group__1__Impl5030); 
             after(grammarAccess.getDATEAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__DATE__Group__1__Impl"


    // $ANTLR start "rule__DATE__Group__2"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2534:1: rule__DATE__Group__2 : rule__DATE__Group__2__Impl rule__DATE__Group__3 ;
    public final void rule__DATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2538:1: ( rule__DATE__Group__2__Impl rule__DATE__Group__3 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2539:2: rule__DATE__Group__2__Impl rule__DATE__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__2__Impl_in_rule__DATE__Group__25061);
            rule__DATE__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__3_in_rule__DATE__Group__25064);
            rule__DATE__Group__3();

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
    // $ANTLR end "rule__DATE__Group__2"


    // $ANTLR start "rule__DATE__Group__2__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2546:1: rule__DATE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2550:1: ( ( RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2551:1: ( RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2551:1: ( RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2552:1: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__DATE__Group__2__Impl5091); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DATE__Group__2__Impl"


    // $ANTLR start "rule__DATE__Group__3"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2563:1: rule__DATE__Group__3 : rule__DATE__Group__3__Impl rule__DATE__Group__4 ;
    public final void rule__DATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2567:1: ( rule__DATE__Group__3__Impl rule__DATE__Group__4 )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2568:2: rule__DATE__Group__3__Impl rule__DATE__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__3__Impl_in_rule__DATE__Group__35120);
            rule__DATE__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__4_in_rule__DATE__Group__35123);
            rule__DATE__Group__4();

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
    // $ANTLR end "rule__DATE__Group__3"


    // $ANTLR start "rule__DATE__Group__3__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2575:1: rule__DATE__Group__3__Impl : ( '.' ) ;
    public final void rule__DATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2579:1: ( ( '.' ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2580:1: ( '.' )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2580:1: ( '.' )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2581:1: '.'
            {
             before(grammarAccess.getDATEAccess().getFullStopKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__DATE__Group__3__Impl5151); 
             after(grammarAccess.getDATEAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__DATE__Group__3__Impl"


    // $ANTLR start "rule__DATE__Group__4"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2594:1: rule__DATE__Group__4 : rule__DATE__Group__4__Impl ;
    public final void rule__DATE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2598:1: ( rule__DATE__Group__4__Impl )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2599:2: rule__DATE__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DATE__Group__4__Impl_in_rule__DATE__Group__45182);
            rule__DATE__Group__4__Impl();

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
    // $ANTLR end "rule__DATE__Group__4"


    // $ANTLR start "rule__DATE__Group__4__Impl"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2605:1: rule__DATE__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2609:1: ( ( RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2610:1: ( RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2610:1: ( RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2611:1: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__DATE__Group__4__Impl5209); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__DATE__Group__4__Impl"


    // $ANTLR start "rule__Model__TwitterTypesAssignment_3"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2633:1: rule__Model__TwitterTypesAssignment_3 : ( ruleTwitterType ) ;
    public final void rule__Model__TwitterTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2637:1: ( ( ruleTwitterType ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2638:1: ( ruleTwitterType )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2638:1: ( ruleTwitterType )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2639:1: ruleTwitterType
            {
             before(grammarAccess.getModelAccess().getTwitterTypesTwitterTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTwitterType_in_rule__Model__TwitterTypesAssignment_35253);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2648:1: rule__Model__SearchesAssignment_7 : ( ruleSearch ) ;
    public final void rule__Model__SearchesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2652:1: ( ( ruleSearch ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2653:1: ( ruleSearch )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2653:1: ( ruleSearch )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2654:1: ruleSearch
            {
             before(grammarAccess.getModelAccess().getSearchesSearchParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSearch_in_rule__Model__SearchesAssignment_75284);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2663:1: rule__TwitterPrimitiveType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TwitterPrimitiveType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2667:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2668:1: ( RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2668:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2669:1: RULE_ID
            {
             before(grammarAccess.getTwitterPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TwitterPrimitiveType__NameAssignment_15315); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2678:1: rule__TwitterObjectType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TwitterObjectType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2682:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2683:1: ( RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2683:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2684:1: RULE_ID
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TwitterObjectType__NameAssignment_15346); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2693:1: rule__TwitterObjectType__FieldsAssignment_3 : ( ruleFieldDclr ) ;
    public final void rule__TwitterObjectType__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2697:1: ( ( ruleFieldDclr ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2698:1: ( ruleFieldDclr )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2698:1: ( ruleFieldDclr )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2699:1: ruleFieldDclr
            {
             before(grammarAccess.getTwitterObjectTypeAccess().getFieldsFieldDclrParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldDclr_in_rule__TwitterObjectType__FieldsAssignment_35377);
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2708:1: rule__FieldDclr__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldDclr__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2712:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2713:1: ( RULE_ID )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2713:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2714:1: RULE_ID
            {
             before(grammarAccess.getFieldDclrAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FieldDclr__NameAssignment_15408); 
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
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2723:1: rule__FieldDclr__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__FieldDclr__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2727:1: ( ( ( RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2728:1: ( ( RULE_ID ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2728:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2729:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldDclrAccess().getTypeTwitterTypeDeclarationCrossReference_3_0()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2730:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2731:1: RULE_ID
            {
             before(grammarAccess.getFieldDclrAccess().getTypeTwitterTypeDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FieldDclr__TypeAssignment_35443); 
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


    // $ANTLR start "rule__Search__SearchTypeAssignment_3"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2742:1: rule__Search__SearchTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Search__SearchTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2746:1: ( ( ( RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2747:1: ( ( RULE_ID ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2747:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2748:1: ( RULE_ID )
            {
             before(grammarAccess.getSearchAccess().getSearchTypeTwitterObjectTypeDeclarationCrossReference_3_0()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2749:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2750:1: RULE_ID
            {
             before(grammarAccess.getSearchAccess().getSearchTypeTwitterObjectTypeDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Search__SearchTypeAssignment_35482); 
             after(grammarAccess.getSearchAccess().getSearchTypeTwitterObjectTypeDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSearchAccess().getSearchTypeTwitterObjectTypeDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__Search__SearchTypeAssignment_3"


    // $ANTLR start "rule__Search__OptionsAssignment_4"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2761:1: rule__Search__OptionsAssignment_4 : ( ruleOption ) ;
    public final void rule__Search__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2765:1: ( ( ruleOption ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2766:1: ( ruleOption )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2766:1: ( ruleOption )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2767:1: ruleOption
            {
             before(grammarAccess.getSearchAccess().getOptionsOptionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_rule__Search__OptionsAssignment_45517);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getOptionsOptionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Search__OptionsAssignment_4"


    // $ANTLR start "rule__Search__ConditionsAssignment_5_1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2776:1: rule__Search__ConditionsAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__Search__ConditionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2780:1: ( ( ruleCondition ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2781:1: ( ruleCondition )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2781:1: ( ruleCondition )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2782:1: ruleCondition
            {
             before(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__Search__ConditionsAssignment_5_15548);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Search__ConditionsAssignment_5_1"


    // $ANTLR start "rule__Search__ConditionsAssignment_5_2_1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2791:1: rule__Search__ConditionsAssignment_5_2_1 : ( ruleCondition ) ;
    public final void rule__Search__ConditionsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2795:1: ( ( ruleCondition ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2796:1: ( ruleCondition )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2796:1: ( ruleCondition )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2797:1: ruleCondition
            {
             before(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__Search__ConditionsAssignment_5_2_15579);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getSearchAccess().getConditionsConditionParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__Search__ConditionsAssignment_5_2_1"


    // $ANTLR start "rule__Keywords__KeywordsAssignment_1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2806:1: rule__Keywords__KeywordsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Keywords__KeywordsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2810:1: ( ( RULE_STRING ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2811:1: ( RULE_STRING )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2811:1: ( RULE_STRING )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2812:1: RULE_STRING
            {
             before(grammarAccess.getKeywordsAccess().getKeywordsSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Keywords__KeywordsAssignment_15610); 
             after(grammarAccess.getKeywordsAccess().getKeywordsSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Keywords__KeywordsAssignment_1"


    // $ANTLR start "rule__Keywords__KeywordsAssignment_2_1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2821:1: rule__Keywords__KeywordsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Keywords__KeywordsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2825:1: ( ( RULE_STRING ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2826:1: ( RULE_STRING )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2826:1: ( RULE_STRING )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2827:1: RULE_STRING
            {
             before(grammarAccess.getKeywordsAccess().getKeywordsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Keywords__KeywordsAssignment_2_15641); 
             after(grammarAccess.getKeywordsAccess().getKeywordsSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Keywords__KeywordsAssignment_2_1"


    // $ANTLR start "rule__Location__LonAssignment_3"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2836:1: rule__Location__LonAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Location__LonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2840:1: ( ( ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2841:1: ( ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2841:1: ( ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2842:1: ruleDOUBLE
            {
             before(grammarAccess.getLocationAccess().getLonDOUBLEParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_rule__Location__LonAssignment_35672);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLonDOUBLEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Location__LonAssignment_3"


    // $ANTLR start "rule__Location__LatAssignment_5"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2851:1: rule__Location__LatAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Location__LatAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2855:1: ( ( ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2856:1: ( ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2856:1: ( ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2857:1: ruleDOUBLE
            {
             before(grammarAccess.getLocationAccess().getLatDOUBLEParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_rule__Location__LatAssignment_55703);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLatDOUBLEParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Location__LatAssignment_5"


    // $ANTLR start "rule__Location__RadiusAssignment_7"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2866:1: rule__Location__RadiusAssignment_7 : ( ruleDOUBLE ) ;
    public final void rule__Location__RadiusAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2870:1: ( ( ruleDOUBLE ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2871:1: ( ruleDOUBLE )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2871:1: ( ruleDOUBLE )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2872:1: ruleDOUBLE
            {
             before(grammarAccess.getLocationAccess().getRadiusDOUBLEParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDOUBLE_in_rule__Location__RadiusAssignment_75734);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getRadiusDOUBLEParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Location__RadiusAssignment_7"


    // $ANTLR start "rule__Location__RadiusUnitAssignment_8"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2881:1: rule__Location__RadiusUnitAssignment_8 : ( ruleDistanceUnit ) ;
    public final void rule__Location__RadiusUnitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2885:1: ( ( ruleDistanceUnit ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2886:1: ( ruleDistanceUnit )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2886:1: ( ruleDistanceUnit )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2887:1: ruleDistanceUnit
            {
             before(grammarAccess.getLocationAccess().getRadiusUnitDistanceUnitEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDistanceUnit_in_rule__Location__RadiusUnitAssignment_85765);
            ruleDistanceUnit();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getRadiusUnitDistanceUnitEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__Location__RadiusUnitAssignment_8"


    // $ANTLR start "rule__Time__BeforeAssignment_1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2896:1: rule__Time__BeforeAssignment_1 : ( ruleDATE ) ;
    public final void rule__Time__BeforeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2900:1: ( ( ruleDATE ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2901:1: ( ruleDATE )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2901:1: ( ruleDATE )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2902:1: ruleDATE
            {
             before(grammarAccess.getTimeAccess().getBeforeDATEParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDATE_in_rule__Time__BeforeAssignment_15796);
            ruleDATE();

            state._fsp--;

             after(grammarAccess.getTimeAccess().getBeforeDATEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Time__BeforeAssignment_1"


    // $ANTLR start "rule__IntCondition__FieldDeclarationAssignment_0"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2911:1: rule__IntCondition__FieldDeclarationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__IntCondition__FieldDeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2915:1: ( ( ( RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2916:1: ( ( RULE_ID ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2916:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2917:1: ( RULE_ID )
            {
             before(grammarAccess.getIntConditionAccess().getFieldDeclarationTwitterFieldDeclarationCrossReference_0_0()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2918:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2919:1: RULE_ID
            {
             before(grammarAccess.getIntConditionAccess().getFieldDeclarationTwitterFieldDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__IntCondition__FieldDeclarationAssignment_05831); 
             after(grammarAccess.getIntConditionAccess().getFieldDeclarationTwitterFieldDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getIntConditionAccess().getFieldDeclarationTwitterFieldDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__IntCondition__FieldDeclarationAssignment_0"


    // $ANTLR start "rule__IntCondition__OperatorAssignment_1"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2930:1: rule__IntCondition__OperatorAssignment_1 : ( ruleIntOperators ) ;
    public final void rule__IntCondition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2934:1: ( ( ruleIntOperators ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2935:1: ( ruleIntOperators )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2935:1: ( ruleIntOperators )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2936:1: ruleIntOperators
            {
             before(grammarAccess.getIntConditionAccess().getOperatorIntOperatorsEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntOperators_in_rule__IntCondition__OperatorAssignment_15866);
            ruleIntOperators();

            state._fsp--;

             after(grammarAccess.getIntConditionAccess().getOperatorIntOperatorsEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__IntCondition__OperatorAssignment_1"


    // $ANTLR start "rule__IntCondition__OperandAssignment_2"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2945:1: rule__IntCondition__OperandAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntCondition__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2949:1: ( ( RULE_INT ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2950:1: ( RULE_INT )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2950:1: ( RULE_INT )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2951:1: RULE_INT
            {
             before(grammarAccess.getIntConditionAccess().getOperandINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntCondition__OperandAssignment_25897); 
             after(grammarAccess.getIntConditionAccess().getOperandINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IntCondition__OperandAssignment_2"


    // $ANTLR start "rule__BooleanCondition__FieldDeclarationAssignment"
    // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2960:1: rule__BooleanCondition__FieldDeclarationAssignment : ( ( RULE_ID ) ) ;
    public final void rule__BooleanCondition__FieldDeclarationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2964:1: ( ( ( RULE_ID ) ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2965:1: ( ( RULE_ID ) )
            {
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2965:1: ( ( RULE_ID ) )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2966:1: ( RULE_ID )
            {
             before(grammarAccess.getBooleanConditionAccess().getFieldDeclarationTwitterFieldDeclarationCrossReference_0()); 
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2967:1: ( RULE_ID )
            // ../de.hub.modsoft.exercise6.xtext.ui/src-gen/de/hub/modsoft/twittersearch/xtext/ui/contentassist/antlr/internal/InternalTwitterSearch.g:2968:1: RULE_ID
            {
             before(grammarAccess.getBooleanConditionAccess().getFieldDeclarationTwitterFieldDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BooleanCondition__FieldDeclarationAssignment5932); 
             after(grammarAccess.getBooleanConditionAccess().getFieldDeclarationTwitterFieldDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getBooleanConditionAccess().getFieldDeclarationTwitterFieldDeclarationCrossReference_0()); 

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
    // $ANTLR end "rule__BooleanCondition__FieldDeclarationAssignment"

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
        public static final BitSet FOLLOW_rule__Search__Group__0_in_ruleSearch394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Alternatives_in_ruleOption454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeywords_in_entryRuleKeywords481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeywords488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Keywords__Group__0_in_ruleKeywords514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocation548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__0_in_ruleLocation574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__0_in_ruleTime634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Alternatives_in_ruleCondition694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntCondition_in_entryRuleIntCondition721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntCondition728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntCondition__Group__0_in_ruleIntCondition754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanCondition_in_entryRuleBooleanCondition781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanCondition788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanCondition__FieldDeclarationAssignment_in_ruleBooleanCondition814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDATE_in_entryRuleDATE901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDATE908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DATE__Group__0_in_ruleDATE934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntOperators__Alternatives_in_ruleIntOperators971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DistanceUnit__Alternatives_in_ruleDistanceUnit1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterObjectType_in_rule__TwitterType__Alternatives1042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterPrimitiveType_in_rule__TwitterType__Alternatives1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeywords_in_rule__Option__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocation_in_rule__Option__Alternatives1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_rule__Option__Alternatives1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntCondition_in_rule__Condition__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanCondition_in_rule__Condition__Alternatives1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__IntOperators__Alternatives1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__IntOperators__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__IntOperators__Alternatives1249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__IntOperators__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__IntOperators__Alternatives1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DistanceUnit__Alternatives1327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DistanceUnit__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01381 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11442 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Model__Group__1__Impl1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21504 = new BitSet(new long[]{0x0000000000D00000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Model__Group__2__Impl1535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31566 = new BitSet(new long[]{0x0000000000D00000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__TwitterTypesAssignment_3_in_rule__Model__Group__3__Impl1596 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41627 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Model__Group__4__Impl1658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51689 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Model__Group__5__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61751 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Model__Group__6__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71813 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__SearchesAssignment_7_in_rule__Model__Group__7__Impl1843 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Model__Group__8__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__Group__0__Impl_in_rule__TwitterPrimitiveType__Group__01951 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__Group__1_in_rule__TwitterPrimitiveType__Group__01954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TwitterPrimitiveType__Group__0__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__Group__1__Impl_in_rule__TwitterPrimitiveType__Group__12013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterPrimitiveType__NameAssignment_1_in_rule__TwitterPrimitiveType__Group__1__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__0__Impl_in_rule__TwitterObjectType__Group__02074 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__1_in_rule__TwitterObjectType__Group__02077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TwitterObjectType__Group__0__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__1__Impl_in_rule__TwitterObjectType__Group__12136 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__2_in_rule__TwitterObjectType__Group__12139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__NameAssignment_1_in_rule__TwitterObjectType__Group__1__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__2__Impl_in_rule__TwitterObjectType__Group__22196 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__3_in_rule__TwitterObjectType__Group__22199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TwitterObjectType__Group__2__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__3__Impl_in_rule__TwitterObjectType__Group__32258 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__4_in_rule__TwitterObjectType__Group__32261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__FieldsAssignment_3_in_rule__TwitterObjectType__Group__3__Impl2288 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TwitterObjectType__Group__4__Impl_in_rule__TwitterObjectType__Group__42319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TwitterObjectType__Group__4__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__0__Impl_in_rule__FieldDclr__Group__02388 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__1_in_rule__FieldDclr__Group__02391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__FieldDclr__Group__0__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__1__Impl_in_rule__FieldDclr__Group__12450 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__2_in_rule__FieldDclr__Group__12453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__NameAssignment_1_in_rule__FieldDclr__Group__1__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__2__Impl_in_rule__FieldDclr__Group__22510 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__3_in_rule__FieldDclr__Group__22513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__FieldDclr__Group__2__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__Group__3__Impl_in_rule__FieldDclr__Group__32572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FieldDclr__TypeAssignment_3_in_rule__FieldDclr__Group__3__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group__0__Impl_in_rule__Search__Group__02637 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Search__Group__1_in_rule__Search__Group__02640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group__1__Impl_in_rule__Search__Group__12698 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Search__Group__2_in_rule__Search__Group__12701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Search__Group__1__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group__2__Impl_in_rule__Search__Group__22760 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Search__Group__3_in_rule__Search__Group__22763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Search__Group__2__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group__3__Impl_in_rule__Search__Group__32822 = new BitSet(new long[]{0x00000022B0000000L});
        public static final BitSet FOLLOW_rule__Search__Group__4_in_rule__Search__Group__32825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__SearchTypeAssignment_3_in_rule__Search__Group__3__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group__4__Impl_in_rule__Search__Group__42882 = new BitSet(new long[]{0x00000022B0000000L});
        public static final BitSet FOLLOW_rule__Search__Group__5_in_rule__Search__Group__42885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__OptionsAssignment_4_in_rule__Search__Group__4__Impl2912 = new BitSet(new long[]{0x0000002280000002L});
        public static final BitSet FOLLOW_rule__Search__Group__5__Impl_in_rule__Search__Group__52943 = new BitSet(new long[]{0x00000022B0000000L});
        public static final BitSet FOLLOW_rule__Search__Group__6_in_rule__Search__Group__52946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_5__0_in_rule__Search__Group__5__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group__6__Impl_in_rule__Search__Group__63004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Search__Group__6__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_5__0__Impl_in_rule__Search__Group_5__03077 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Search__Group_5__1_in_rule__Search__Group_5__03080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Search__Group_5__0__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_5__1__Impl_in_rule__Search__Group_5__13139 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Search__Group_5__2_in_rule__Search__Group_5__13142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__ConditionsAssignment_5_1_in_rule__Search__Group_5__1__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_5__2__Impl_in_rule__Search__Group_5__23199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_5_2__0_in_rule__Search__Group_5__2__Impl3226 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__Search__Group_5_2__0__Impl_in_rule__Search__Group_5_2__03263 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Search__Group_5_2__1_in_rule__Search__Group_5_2__03266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Search__Group_5_2__0__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__Group_5_2__1__Impl_in_rule__Search__Group_5_2__13325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Search__ConditionsAssignment_5_2_1_in_rule__Search__Group_5_2__1__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Keywords__Group__0__Impl_in_rule__Keywords__Group__03386 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Keywords__Group__1_in_rule__Keywords__Group__03389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Keywords__Group__0__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Keywords__Group__1__Impl_in_rule__Keywords__Group__13448 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Keywords__Group__2_in_rule__Keywords__Group__13451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Keywords__KeywordsAssignment_1_in_rule__Keywords__Group__1__Impl3478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Keywords__Group__2__Impl_in_rule__Keywords__Group__23508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Keywords__Group_2__0_in_rule__Keywords__Group__2__Impl3535 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__Keywords__Group_2__0__Impl_in_rule__Keywords__Group_2__03572 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Keywords__Group_2__1_in_rule__Keywords__Group_2__03575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Keywords__Group_2__0__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Keywords__Group_2__1__Impl_in_rule__Keywords__Group_2__13634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Keywords__KeywordsAssignment_2_1_in_rule__Keywords__Group_2__1__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__0__Impl_in_rule__Location__Group__03695 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Location__Group__1_in_rule__Location__Group__03698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Location__Group__0__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__1__Impl_in_rule__Location__Group__13757 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Location__Group__2_in_rule__Location__Group__13760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Location__Group__1__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__2__Impl_in_rule__Location__Group__23819 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_rule__Location__Group__3_in_rule__Location__Group__23822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Location__Group__2__Impl3850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__3__Impl_in_rule__Location__Group__33881 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Location__Group__4_in_rule__Location__Group__33884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__LonAssignment_3_in_rule__Location__Group__3__Impl3911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__4__Impl_in_rule__Location__Group__43941 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_rule__Location__Group__5_in_rule__Location__Group__43944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Location__Group__4__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__5__Impl_in_rule__Location__Group__54003 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Location__Group__6_in_rule__Location__Group__54006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__LatAssignment_5_in_rule__Location__Group__5__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__6__Impl_in_rule__Location__Group__64063 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_rule__Location__Group__7_in_rule__Location__Group__64066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Location__Group__6__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__7__Impl_in_rule__Location__Group__74125 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__Location__Group__8_in_rule__Location__Group__74128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__RadiusAssignment_7_in_rule__Location__Group__7__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__8__Impl_in_rule__Location__Group__84185 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Location__Group__9_in_rule__Location__Group__84188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__RadiusUnitAssignment_8_in_rule__Location__Group__8__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Location__Group__9__Impl_in_rule__Location__Group__94245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Location__Group__9__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__0__Impl_in_rule__Time__Group__04324 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Time__Group__1_in_rule__Time__Group__04327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Time__Group__0__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__Group__1__Impl_in_rule__Time__Group__14386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Time__BeforeAssignment_1_in_rule__Time__Group__1__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntCondition__Group__0__Impl_in_rule__IntCondition__Group__04447 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__IntCondition__Group__1_in_rule__IntCondition__Group__04450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntCondition__FieldDeclarationAssignment_0_in_rule__IntCondition__Group__0__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntCondition__Group__1__Impl_in_rule__IntCondition__Group__14507 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__IntCondition__Group__2_in_rule__IntCondition__Group__14510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntCondition__OperatorAssignment_1_in_rule__IntCondition__Group__1__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntCondition__Group__2__Impl_in_rule__IntCondition__Group__24567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntCondition__OperandAssignment_2_in_rule__IntCondition__Group__2__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__04630 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__04633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__DOUBLE__Group__0__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__14695 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__14698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__1__Impl4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__24754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group_2__0_in_rule__DOUBLE__Group__2__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group_2__0__Impl_in_rule__DOUBLE__Group_2__04818 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group_2__1_in_rule__DOUBLE__Group_2__04821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__DOUBLE__Group_2__0__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DOUBLE__Group_2__1__Impl_in_rule__DOUBLE__Group_2__14880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group_2__1__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DATE__Group__0__Impl_in_rule__DATE__Group__04940 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__DATE__Group__1_in_rule__DATE__Group__04943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__DATE__Group__0__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DATE__Group__1__Impl_in_rule__DATE__Group__14999 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DATE__Group__2_in_rule__DATE__Group__15002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__DATE__Group__1__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DATE__Group__2__Impl_in_rule__DATE__Group__25061 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__DATE__Group__3_in_rule__DATE__Group__25064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__DATE__Group__2__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DATE__Group__3__Impl_in_rule__DATE__Group__35120 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DATE__Group__4_in_rule__DATE__Group__35123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__DATE__Group__3__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DATE__Group__4__Impl_in_rule__DATE__Group__45182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__DATE__Group__4__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTwitterType_in_rule__Model__TwitterTypesAssignment_35253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSearch_in_rule__Model__SearchesAssignment_75284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TwitterPrimitiveType__NameAssignment_15315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TwitterObjectType__NameAssignment_15346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldDclr_in_rule__TwitterObjectType__FieldsAssignment_35377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FieldDclr__NameAssignment_15408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FieldDclr__TypeAssignment_35443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Search__SearchTypeAssignment_35482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_rule__Search__OptionsAssignment_45517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__Search__ConditionsAssignment_5_15548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__Search__ConditionsAssignment_5_2_15579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Keywords__KeywordsAssignment_15610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Keywords__KeywordsAssignment_2_15641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Location__LonAssignment_35672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Location__LatAssignment_55703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDOUBLE_in_rule__Location__RadiusAssignment_75734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDistanceUnit_in_rule__Location__RadiusUnitAssignment_85765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDATE_in_rule__Time__BeforeAssignment_15796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__IntCondition__FieldDeclarationAssignment_05831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntOperators_in_rule__IntCondition__OperatorAssignment_15866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntCondition__OperandAssignment_25897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanCondition__FieldDeclarationAssignment5932 = new BitSet(new long[]{0x0000000000000002L});
    }


}