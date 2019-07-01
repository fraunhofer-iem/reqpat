package de.fraunhofer.iem.reqpat.core.ui.contentassist.antlr.internal; 

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
import de.fraunhofer.iem.reqpat.core.services.ReqPatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqPatParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPECOBJECTDELIMITERLEFT", "RULE_SPECOBJECTDELIMITERRIGHT", "RULE_PARAMDELIMITERLEFT", "RULE_PARAMDELIMITERRIGHT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'H'", "'RP'", "'F'", "'This is a sample requirement pattern.'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=9;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=10;
    public static final int RULE_PARAMDELIMITERRIGHT=7;
    public static final int RULE_SPECOBJECTDELIMITERRIGHT=5;
    public static final int RULE_WS=13;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_PARAMDELIMITERLEFT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_SPECOBJECTDELIMITERLEFT=4;

    // delegates
    // delegators


        public InternalReqPatParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReqPatParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReqPatParser.tokenNames; }
    public String getGrammarFileName() { return "../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g"; }


     
     	private ReqPatGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ReqPatGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleRoot"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:61:1: ( ruleRoot EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot61);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot68); 

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:69:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:73:2: ( ( ( rule__Root__Group__0 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:74:1: ( ( rule__Root__Group__0 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:74:1: ( ( rule__Root__Group__0 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:75:1: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:76:1: ( rule__Root__Group__0 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:76:2: rule__Root__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0_in_ruleRoot94);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleSpecObj"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:88:1: entryRuleSpecObj : ruleSpecObj EOF ;
    public final void entryRuleSpecObj() throws RecognitionException {
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:89:1: ( ruleSpecObj EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:90:1: ruleSpecObj EOF
            {
             before(grammarAccess.getSpecObjRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpecObj_in_entryRuleSpecObj121);
            ruleSpecObj();

            state._fsp--;

             after(grammarAccess.getSpecObjRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpecObj128); 

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
    // $ANTLR end "entryRuleSpecObj"


    // $ANTLR start "ruleSpecObj"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:97:1: ruleSpecObj : ( ( rule__SpecObj__Group__0 ) ) ;
    public final void ruleSpecObj() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:101:2: ( ( ( rule__SpecObj__Group__0 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:102:1: ( ( rule__SpecObj__Group__0 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:102:1: ( ( rule__SpecObj__Group__0 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:103:1: ( rule__SpecObj__Group__0 )
            {
             before(grammarAccess.getSpecObjAccess().getGroup()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:104:1: ( rule__SpecObj__Group__0 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:104:2: rule__SpecObj__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SpecObj__Group__0_in_ruleSpecObj154);
            rule__SpecObj__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjAccess().getGroup()); 

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
    // $ANTLR end "ruleSpecObj"


    // $ANTLR start "entryRuleHeadingSO"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:116:1: entryRuleHeadingSO : ruleHeadingSO EOF ;
    public final void entryRuleHeadingSO() throws RecognitionException {
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:117:1: ( ruleHeadingSO EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:118:1: ruleHeadingSO EOF
            {
             before(grammarAccess.getHeadingSORule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHeadingSO_in_entryRuleHeadingSO181);
            ruleHeadingSO();

            state._fsp--;

             after(grammarAccess.getHeadingSORule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHeadingSO188); 

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
    // $ANTLR end "entryRuleHeadingSO"


    // $ANTLR start "ruleHeadingSO"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:125:1: ruleHeadingSO : ( ( rule__HeadingSO__Group__0 ) ) ;
    public final void ruleHeadingSO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:129:2: ( ( ( rule__HeadingSO__Group__0 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:130:1: ( ( rule__HeadingSO__Group__0 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:130:1: ( ( rule__HeadingSO__Group__0 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:131:1: ( rule__HeadingSO__Group__0 )
            {
             before(grammarAccess.getHeadingSOAccess().getGroup()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:132:1: ( rule__HeadingSO__Group__0 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:132:2: rule__HeadingSO__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__0_in_ruleHeadingSO214);
            rule__HeadingSO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadingSOAccess().getGroup()); 

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
    // $ANTLR end "ruleHeadingSO"


    // $ANTLR start "entryRuleReqPatSO"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:144:1: entryRuleReqPatSO : ruleReqPatSO EOF ;
    public final void entryRuleReqPatSO() throws RecognitionException {
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:145:1: ( ruleReqPatSO EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:146:1: ruleReqPatSO EOF
            {
             before(grammarAccess.getReqPatSORule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReqPatSO_in_entryRuleReqPatSO241);
            ruleReqPatSO();

            state._fsp--;

             after(grammarAccess.getReqPatSORule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReqPatSO248); 

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
    // $ANTLR end "entryRuleReqPatSO"


    // $ANTLR start "ruleReqPatSO"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:153:1: ruleReqPatSO : ( ( rule__ReqPatSO__Group__0 ) ) ;
    public final void ruleReqPatSO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:157:2: ( ( ( rule__ReqPatSO__Group__0 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:158:1: ( ( rule__ReqPatSO__Group__0 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:158:1: ( ( rule__ReqPatSO__Group__0 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:159:1: ( rule__ReqPatSO__Group__0 )
            {
             before(grammarAccess.getReqPatSOAccess().getGroup()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:160:1: ( rule__ReqPatSO__Group__0 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:160:2: rule__ReqPatSO__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__0_in_ruleReqPatSO274);
            rule__ReqPatSO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReqPatSOAccess().getGroup()); 

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
    // $ANTLR end "ruleReqPatSO"


    // $ANTLR start "entryRuleFreeTextSO"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:172:1: entryRuleFreeTextSO : ruleFreeTextSO EOF ;
    public final void entryRuleFreeTextSO() throws RecognitionException {
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:173:1: ( ruleFreeTextSO EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:174:1: ruleFreeTextSO EOF
            {
             before(grammarAccess.getFreeTextSORule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreeTextSO_in_entryRuleFreeTextSO301);
            ruleFreeTextSO();

            state._fsp--;

             after(grammarAccess.getFreeTextSORule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreeTextSO308); 

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
    // $ANTLR end "entryRuleFreeTextSO"


    // $ANTLR start "ruleFreeTextSO"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:181:1: ruleFreeTextSO : ( ( rule__FreeTextSO__Group__0 ) ) ;
    public final void ruleFreeTextSO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:185:2: ( ( ( rule__FreeTextSO__Group__0 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:186:1: ( ( rule__FreeTextSO__Group__0 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:186:1: ( ( rule__FreeTextSO__Group__0 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:187:1: ( rule__FreeTextSO__Group__0 )
            {
             before(grammarAccess.getFreeTextSOAccess().getGroup()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:188:1: ( rule__FreeTextSO__Group__0 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:188:2: rule__FreeTextSO__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__0_in_ruleFreeTextSO334);
            rule__FreeTextSO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextSOAccess().getGroup()); 

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
    // $ANTLR end "ruleFreeTextSO"


    // $ANTLR start "entryRuleRequirementPattern"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:200:1: entryRuleRequirementPattern : ruleRequirementPattern EOF ;
    public final void entryRuleRequirementPattern() throws RecognitionException {
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:201:1: ( ruleRequirementPattern EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:202:1: ruleRequirementPattern EOF
            {
             before(grammarAccess.getRequirementPatternRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequirementPattern_in_entryRuleRequirementPattern361);
            ruleRequirementPattern();

            state._fsp--;

             after(grammarAccess.getRequirementPatternRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequirementPattern368); 

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
    // $ANTLR end "entryRuleRequirementPattern"


    // $ANTLR start "ruleRequirementPattern"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:209:1: ruleRequirementPattern : ( ( rule__RequirementPattern__Group__0 ) ) ;
    public final void ruleRequirementPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:213:2: ( ( ( rule__RequirementPattern__Group__0 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:214:1: ( ( rule__RequirementPattern__Group__0 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:214:1: ( ( rule__RequirementPattern__Group__0 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:215:1: ( rule__RequirementPattern__Group__0 )
            {
             before(grammarAccess.getRequirementPatternAccess().getGroup()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:216:1: ( rule__RequirementPattern__Group__0 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:216:2: rule__RequirementPattern__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RequirementPattern__Group__0_in_ruleRequirementPattern394);
            rule__RequirementPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementPatternAccess().getGroup()); 

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
    // $ANTLR end "ruleRequirementPattern"


    // $ANTLR start "rule__SpecObj__Alternatives_1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:228:1: rule__SpecObj__Alternatives_1 : ( ( ruleHeadingSO ) | ( ruleReqPatSO ) | ( ruleFreeTextSO ) );
    public final void rule__SpecObj__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:232:1: ( ( ruleHeadingSO ) | ( ruleReqPatSO ) | ( ruleFreeTextSO ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_PARAMDELIMITERLEFT) ) {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                    {
                    alt1=3;
                    }
                    break;
                case 16:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:233:1: ( ruleHeadingSO )
                    {
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:233:1: ( ruleHeadingSO )
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:234:1: ruleHeadingSO
                    {
                     before(grammarAccess.getSpecObjAccess().getHeadingSOParserRuleCall_1_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHeadingSO_in_rule__SpecObj__Alternatives_1430);
                    ruleHeadingSO();

                    state._fsp--;

                     after(grammarAccess.getSpecObjAccess().getHeadingSOParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:239:6: ( ruleReqPatSO )
                    {
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:239:6: ( ruleReqPatSO )
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:240:1: ruleReqPatSO
                    {
                     before(grammarAccess.getSpecObjAccess().getReqPatSOParserRuleCall_1_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleReqPatSO_in_rule__SpecObj__Alternatives_1447);
                    ruleReqPatSO();

                    state._fsp--;

                     after(grammarAccess.getSpecObjAccess().getReqPatSOParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:245:6: ( ruleFreeTextSO )
                    {
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:245:6: ( ruleFreeTextSO )
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:246:1: ruleFreeTextSO
                    {
                     before(grammarAccess.getSpecObjAccess().getFreeTextSOParserRuleCall_1_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFreeTextSO_in_rule__SpecObj__Alternatives_1464);
                    ruleFreeTextSO();

                    state._fsp--;

                     after(grammarAccess.getSpecObjAccess().getFreeTextSOParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__SpecObj__Alternatives_1"


    // $ANTLR start "rule__Root__Group__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:258:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:262:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:263:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__0494);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1_in_rule__Root__Group__0497);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:270:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:274:1: ( ( () ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:275:1: ( () )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:275:1: ( () )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:276:1: ()
            {
             before(grammarAccess.getRootAccess().getSpecificationAction_0()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:277:1: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:279:1: 
            {
            }

             after(grammarAccess.getRootAccess().getSpecificationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:289:1: rule__Root__Group__1 : rule__Root__Group__1__Impl ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:293:1: ( rule__Root__Group__1__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:294:2: rule__Root__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__1555);
            rule__Root__Group__1__Impl();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:300:1: rule__Root__Group__1__Impl : ( ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:304:1: ( ( ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:305:1: ( ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:305:1: ( ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:306:1: ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:306:1: ( ( rule__Root__SpecObjectsAssignment_1 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:307:1: ( rule__Root__SpecObjectsAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getSpecObjectsAssignment_1()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:308:1: ( rule__Root__SpecObjectsAssignment_1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:308:2: rule__Root__SpecObjectsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__SpecObjectsAssignment_1_in_rule__Root__Group__1__Impl584);
            rule__Root__SpecObjectsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getSpecObjectsAssignment_1()); 

            }

            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:311:1: ( ( rule__Root__SpecObjectsAssignment_1 )* )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:312:1: ( rule__Root__SpecObjectsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getSpecObjectsAssignment_1()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:313:1: ( rule__Root__SpecObjectsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_SPECOBJECTDELIMITERLEFT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:313:2: rule__Root__SpecObjectsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__SpecObjectsAssignment_1_in_rule__Root__Group__1__Impl596);
            	    rule__Root__SpecObjectsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getSpecObjectsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__SpecObj__Group__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:328:1: rule__SpecObj__Group__0 : rule__SpecObj__Group__0__Impl rule__SpecObj__Group__1 ;
    public final void rule__SpecObj__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:332:1: ( rule__SpecObj__Group__0__Impl rule__SpecObj__Group__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:333:2: rule__SpecObj__Group__0__Impl rule__SpecObj__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SpecObj__Group__0__Impl_in_rule__SpecObj__Group__0633);
            rule__SpecObj__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SpecObj__Group__1_in_rule__SpecObj__Group__0636);
            rule__SpecObj__Group__1();

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
    // $ANTLR end "rule__SpecObj__Group__0"


    // $ANTLR start "rule__SpecObj__Group__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:340:1: rule__SpecObj__Group__0__Impl : ( RULE_SPECOBJECTDELIMITERLEFT ) ;
    public final void rule__SpecObj__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:344:1: ( ( RULE_SPECOBJECTDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:345:1: ( RULE_SPECOBJECTDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:345:1: ( RULE_SPECOBJECTDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:346:1: RULE_SPECOBJECTDELIMITERLEFT
            {
             before(grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERLEFTTerminalRuleCall_0()); 
            match(input,RULE_SPECOBJECTDELIMITERLEFT,FollowSets000.FOLLOW_RULE_SPECOBJECTDELIMITERLEFT_in_rule__SpecObj__Group__0__Impl663); 
             after(grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERLEFTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__SpecObj__Group__0__Impl"


    // $ANTLR start "rule__SpecObj__Group__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:357:1: rule__SpecObj__Group__1 : rule__SpecObj__Group__1__Impl rule__SpecObj__Group__2 ;
    public final void rule__SpecObj__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:361:1: ( rule__SpecObj__Group__1__Impl rule__SpecObj__Group__2 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:362:2: rule__SpecObj__Group__1__Impl rule__SpecObj__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SpecObj__Group__1__Impl_in_rule__SpecObj__Group__1692);
            rule__SpecObj__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SpecObj__Group__2_in_rule__SpecObj__Group__1695);
            rule__SpecObj__Group__2();

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
    // $ANTLR end "rule__SpecObj__Group__1"


    // $ANTLR start "rule__SpecObj__Group__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:369:1: rule__SpecObj__Group__1__Impl : ( ( rule__SpecObj__Alternatives_1 ) ) ;
    public final void rule__SpecObj__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:373:1: ( ( ( rule__SpecObj__Alternatives_1 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:374:1: ( ( rule__SpecObj__Alternatives_1 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:374:1: ( ( rule__SpecObj__Alternatives_1 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:375:1: ( rule__SpecObj__Alternatives_1 )
            {
             before(grammarAccess.getSpecObjAccess().getAlternatives_1()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:376:1: ( rule__SpecObj__Alternatives_1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:376:2: rule__SpecObj__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SpecObj__Alternatives_1_in_rule__SpecObj__Group__1__Impl722);
            rule__SpecObj__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__SpecObj__Group__1__Impl"


    // $ANTLR start "rule__SpecObj__Group__2"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:386:1: rule__SpecObj__Group__2 : rule__SpecObj__Group__2__Impl ;
    public final void rule__SpecObj__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:390:1: ( rule__SpecObj__Group__2__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:391:2: rule__SpecObj__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SpecObj__Group__2__Impl_in_rule__SpecObj__Group__2752);
            rule__SpecObj__Group__2__Impl();

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
    // $ANTLR end "rule__SpecObj__Group__2"


    // $ANTLR start "rule__SpecObj__Group__2__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:397:1: rule__SpecObj__Group__2__Impl : ( RULE_SPECOBJECTDELIMITERRIGHT ) ;
    public final void rule__SpecObj__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:401:1: ( ( RULE_SPECOBJECTDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:402:1: ( RULE_SPECOBJECTDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:402:1: ( RULE_SPECOBJECTDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:403:1: RULE_SPECOBJECTDELIMITERRIGHT
            {
             before(grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERRIGHTTerminalRuleCall_2()); 
            match(input,RULE_SPECOBJECTDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_SPECOBJECTDELIMITERRIGHT_in_rule__SpecObj__Group__2__Impl779); 
             after(grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERRIGHTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__SpecObj__Group__2__Impl"


    // $ANTLR start "rule__HeadingSO__Group__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:420:1: rule__HeadingSO__Group__0 : rule__HeadingSO__Group__0__Impl rule__HeadingSO__Group__1 ;
    public final void rule__HeadingSO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:424:1: ( rule__HeadingSO__Group__0__Impl rule__HeadingSO__Group__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:425:2: rule__HeadingSO__Group__0__Impl rule__HeadingSO__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__0__Impl_in_rule__HeadingSO__Group__0814);
            rule__HeadingSO__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__1_in_rule__HeadingSO__Group__0817);
            rule__HeadingSO__Group__1();

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
    // $ANTLR end "rule__HeadingSO__Group__0"


    // $ANTLR start "rule__HeadingSO__Group__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:432:1: rule__HeadingSO__Group__0__Impl : ( () ) ;
    public final void rule__HeadingSO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:436:1: ( ( () ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:437:1: ( () )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:437:1: ( () )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:438:1: ()
            {
             before(grammarAccess.getHeadingSOAccess().getHeadingSpecObjectAction_0()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:439:1: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:441:1: 
            {
            }

             after(grammarAccess.getHeadingSOAccess().getHeadingSpecObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadingSO__Group__0__Impl"


    // $ANTLR start "rule__HeadingSO__Group__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:451:1: rule__HeadingSO__Group__1 : rule__HeadingSO__Group__1__Impl rule__HeadingSO__Group__2 ;
    public final void rule__HeadingSO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:455:1: ( rule__HeadingSO__Group__1__Impl rule__HeadingSO__Group__2 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:456:2: rule__HeadingSO__Group__1__Impl rule__HeadingSO__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__1__Impl_in_rule__HeadingSO__Group__1875);
            rule__HeadingSO__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__2_in_rule__HeadingSO__Group__1878);
            rule__HeadingSO__Group__2();

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
    // $ANTLR end "rule__HeadingSO__Group__1"


    // $ANTLR start "rule__HeadingSO__Group__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:463:1: rule__HeadingSO__Group__1__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__HeadingSO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:467:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:468:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:468:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:469:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__HeadingSO__Group__1__Impl905); 
             after(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__HeadingSO__Group__1__Impl"


    // $ANTLR start "rule__HeadingSO__Group__2"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:480:1: rule__HeadingSO__Group__2 : rule__HeadingSO__Group__2__Impl rule__HeadingSO__Group__3 ;
    public final void rule__HeadingSO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:484:1: ( rule__HeadingSO__Group__2__Impl rule__HeadingSO__Group__3 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:485:2: rule__HeadingSO__Group__2__Impl rule__HeadingSO__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__2__Impl_in_rule__HeadingSO__Group__2934);
            rule__HeadingSO__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__3_in_rule__HeadingSO__Group__2937);
            rule__HeadingSO__Group__3();

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
    // $ANTLR end "rule__HeadingSO__Group__2"


    // $ANTLR start "rule__HeadingSO__Group__2__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:492:1: rule__HeadingSO__Group__2__Impl : ( 'H' ) ;
    public final void rule__HeadingSO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:496:1: ( ( 'H' ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:497:1: ( 'H' )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:497:1: ( 'H' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:498:1: 'H'
            {
             before(grammarAccess.getHeadingSOAccess().getHKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__HeadingSO__Group__2__Impl965); 
             after(grammarAccess.getHeadingSOAccess().getHKeyword_2()); 

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
    // $ANTLR end "rule__HeadingSO__Group__2__Impl"


    // $ANTLR start "rule__HeadingSO__Group__3"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:511:1: rule__HeadingSO__Group__3 : rule__HeadingSO__Group__3__Impl rule__HeadingSO__Group__4 ;
    public final void rule__HeadingSO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:515:1: ( rule__HeadingSO__Group__3__Impl rule__HeadingSO__Group__4 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:516:2: rule__HeadingSO__Group__3__Impl rule__HeadingSO__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__3__Impl_in_rule__HeadingSO__Group__3996);
            rule__HeadingSO__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__4_in_rule__HeadingSO__Group__3999);
            rule__HeadingSO__Group__4();

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
    // $ANTLR end "rule__HeadingSO__Group__3"


    // $ANTLR start "rule__HeadingSO__Group__3__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:523:1: rule__HeadingSO__Group__3__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__HeadingSO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:527:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:528:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:528:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:529:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__HeadingSO__Group__3__Impl1026); 
             after(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__HeadingSO__Group__3__Impl"


    // $ANTLR start "rule__HeadingSO__Group__4"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:540:1: rule__HeadingSO__Group__4 : rule__HeadingSO__Group__4__Impl rule__HeadingSO__Group__5 ;
    public final void rule__HeadingSO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:544:1: ( rule__HeadingSO__Group__4__Impl rule__HeadingSO__Group__5 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:545:2: rule__HeadingSO__Group__4__Impl rule__HeadingSO__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__4__Impl_in_rule__HeadingSO__Group__41055);
            rule__HeadingSO__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__5_in_rule__HeadingSO__Group__41058);
            rule__HeadingSO__Group__5();

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
    // $ANTLR end "rule__HeadingSO__Group__4"


    // $ANTLR start "rule__HeadingSO__Group__4__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:552:1: rule__HeadingSO__Group__4__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__HeadingSO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:556:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:557:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:557:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:558:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__HeadingSO__Group__4__Impl1085); 
             after(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__HeadingSO__Group__4__Impl"


    // $ANTLR start "rule__HeadingSO__Group__5"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:569:1: rule__HeadingSO__Group__5 : rule__HeadingSO__Group__5__Impl rule__HeadingSO__Group__6 ;
    public final void rule__HeadingSO__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:573:1: ( rule__HeadingSO__Group__5__Impl rule__HeadingSO__Group__6 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:574:2: rule__HeadingSO__Group__5__Impl rule__HeadingSO__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__5__Impl_in_rule__HeadingSO__Group__51114);
            rule__HeadingSO__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__6_in_rule__HeadingSO__Group__51117);
            rule__HeadingSO__Group__6();

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
    // $ANTLR end "rule__HeadingSO__Group__5"


    // $ANTLR start "rule__HeadingSO__Group__5__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:581:1: rule__HeadingSO__Group__5__Impl : ( ( rule__HeadingSO__IdAssignment_5 ) ) ;
    public final void rule__HeadingSO__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:585:1: ( ( ( rule__HeadingSO__IdAssignment_5 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:586:1: ( ( rule__HeadingSO__IdAssignment_5 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:586:1: ( ( rule__HeadingSO__IdAssignment_5 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:587:1: ( rule__HeadingSO__IdAssignment_5 )
            {
             before(grammarAccess.getHeadingSOAccess().getIdAssignment_5()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:588:1: ( rule__HeadingSO__IdAssignment_5 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:588:2: rule__HeadingSO__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__IdAssignment_5_in_rule__HeadingSO__Group__5__Impl1144);
            rule__HeadingSO__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHeadingSOAccess().getIdAssignment_5()); 

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
    // $ANTLR end "rule__HeadingSO__Group__5__Impl"


    // $ANTLR start "rule__HeadingSO__Group__6"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:598:1: rule__HeadingSO__Group__6 : rule__HeadingSO__Group__6__Impl rule__HeadingSO__Group__7 ;
    public final void rule__HeadingSO__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:602:1: ( rule__HeadingSO__Group__6__Impl rule__HeadingSO__Group__7 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:603:2: rule__HeadingSO__Group__6__Impl rule__HeadingSO__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__6__Impl_in_rule__HeadingSO__Group__61174);
            rule__HeadingSO__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__7_in_rule__HeadingSO__Group__61177);
            rule__HeadingSO__Group__7();

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
    // $ANTLR end "rule__HeadingSO__Group__6"


    // $ANTLR start "rule__HeadingSO__Group__6__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:610:1: rule__HeadingSO__Group__6__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__HeadingSO__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:614:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:615:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:615:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:616:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__HeadingSO__Group__6__Impl1204); 
             after(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__HeadingSO__Group__6__Impl"


    // $ANTLR start "rule__HeadingSO__Group__7"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:627:1: rule__HeadingSO__Group__7 : rule__HeadingSO__Group__7__Impl rule__HeadingSO__Group__8 ;
    public final void rule__HeadingSO__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:631:1: ( rule__HeadingSO__Group__7__Impl rule__HeadingSO__Group__8 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:632:2: rule__HeadingSO__Group__7__Impl rule__HeadingSO__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__7__Impl_in_rule__HeadingSO__Group__71233);
            rule__HeadingSO__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__8_in_rule__HeadingSO__Group__71236);
            rule__HeadingSO__Group__8();

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
    // $ANTLR end "rule__HeadingSO__Group__7"


    // $ANTLR start "rule__HeadingSO__Group__7__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:639:1: rule__HeadingSO__Group__7__Impl : ( ( rule__HeadingSO__Group_7__0 )? ) ;
    public final void rule__HeadingSO__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:643:1: ( ( ( rule__HeadingSO__Group_7__0 )? ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:644:1: ( ( rule__HeadingSO__Group_7__0 )? )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:644:1: ( ( rule__HeadingSO__Group_7__0 )? )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:645:1: ( rule__HeadingSO__Group_7__0 )?
            {
             before(grammarAccess.getHeadingSOAccess().getGroup_7()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:646:1: ( rule__HeadingSO__Group_7__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_PARAMDELIMITERLEFT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:646:2: rule__HeadingSO__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group_7__0_in_rule__HeadingSO__Group__7__Impl1263);
                    rule__HeadingSO__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeadingSOAccess().getGroup_7()); 

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
    // $ANTLR end "rule__HeadingSO__Group__7__Impl"


    // $ANTLR start "rule__HeadingSO__Group__8"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:656:1: rule__HeadingSO__Group__8 : rule__HeadingSO__Group__8__Impl ;
    public final void rule__HeadingSO__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:660:1: ( rule__HeadingSO__Group__8__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:661:2: rule__HeadingSO__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group__8__Impl_in_rule__HeadingSO__Group__81294);
            rule__HeadingSO__Group__8__Impl();

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
    // $ANTLR end "rule__HeadingSO__Group__8"


    // $ANTLR start "rule__HeadingSO__Group__8__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:667:1: rule__HeadingSO__Group__8__Impl : ( ( rule__HeadingSO__TextAssignment_8 ) ) ;
    public final void rule__HeadingSO__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:671:1: ( ( ( rule__HeadingSO__TextAssignment_8 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:672:1: ( ( rule__HeadingSO__TextAssignment_8 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:672:1: ( ( rule__HeadingSO__TextAssignment_8 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:673:1: ( rule__HeadingSO__TextAssignment_8 )
            {
             before(grammarAccess.getHeadingSOAccess().getTextAssignment_8()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:674:1: ( rule__HeadingSO__TextAssignment_8 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:674:2: rule__HeadingSO__TextAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__TextAssignment_8_in_rule__HeadingSO__Group__8__Impl1321);
            rule__HeadingSO__TextAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getHeadingSOAccess().getTextAssignment_8()); 

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
    // $ANTLR end "rule__HeadingSO__Group__8__Impl"


    // $ANTLR start "rule__HeadingSO__Group_7__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:702:1: rule__HeadingSO__Group_7__0 : rule__HeadingSO__Group_7__0__Impl rule__HeadingSO__Group_7__1 ;
    public final void rule__HeadingSO__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:706:1: ( rule__HeadingSO__Group_7__0__Impl rule__HeadingSO__Group_7__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:707:2: rule__HeadingSO__Group_7__0__Impl rule__HeadingSO__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group_7__0__Impl_in_rule__HeadingSO__Group_7__01369);
            rule__HeadingSO__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group_7__1_in_rule__HeadingSO__Group_7__01372);
            rule__HeadingSO__Group_7__1();

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
    // $ANTLR end "rule__HeadingSO__Group_7__0"


    // $ANTLR start "rule__HeadingSO__Group_7__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:714:1: rule__HeadingSO__Group_7__0__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__HeadingSO__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:718:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:719:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:719:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:720:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__HeadingSO__Group_7__0__Impl1399); 
             after(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__HeadingSO__Group_7__0__Impl"


    // $ANTLR start "rule__HeadingSO__Group_7__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:731:1: rule__HeadingSO__Group_7__1 : rule__HeadingSO__Group_7__1__Impl rule__HeadingSO__Group_7__2 ;
    public final void rule__HeadingSO__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:735:1: ( rule__HeadingSO__Group_7__1__Impl rule__HeadingSO__Group_7__2 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:736:2: rule__HeadingSO__Group_7__1__Impl rule__HeadingSO__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group_7__1__Impl_in_rule__HeadingSO__Group_7__11428);
            rule__HeadingSO__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group_7__2_in_rule__HeadingSO__Group_7__11431);
            rule__HeadingSO__Group_7__2();

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
    // $ANTLR end "rule__HeadingSO__Group_7__1"


    // $ANTLR start "rule__HeadingSO__Group_7__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:743:1: rule__HeadingSO__Group_7__1__Impl : ( ( rule__HeadingSO__ParentAssignment_7_1 ) ) ;
    public final void rule__HeadingSO__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:747:1: ( ( ( rule__HeadingSO__ParentAssignment_7_1 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:748:1: ( ( rule__HeadingSO__ParentAssignment_7_1 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:748:1: ( ( rule__HeadingSO__ParentAssignment_7_1 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:749:1: ( rule__HeadingSO__ParentAssignment_7_1 )
            {
             before(grammarAccess.getHeadingSOAccess().getParentAssignment_7_1()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:750:1: ( rule__HeadingSO__ParentAssignment_7_1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:750:2: rule__HeadingSO__ParentAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__ParentAssignment_7_1_in_rule__HeadingSO__Group_7__1__Impl1458);
            rule__HeadingSO__ParentAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadingSOAccess().getParentAssignment_7_1()); 

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
    // $ANTLR end "rule__HeadingSO__Group_7__1__Impl"


    // $ANTLR start "rule__HeadingSO__Group_7__2"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:760:1: rule__HeadingSO__Group_7__2 : rule__HeadingSO__Group_7__2__Impl ;
    public final void rule__HeadingSO__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:764:1: ( rule__HeadingSO__Group_7__2__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:765:2: rule__HeadingSO__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HeadingSO__Group_7__2__Impl_in_rule__HeadingSO__Group_7__21488);
            rule__HeadingSO__Group_7__2__Impl();

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
    // $ANTLR end "rule__HeadingSO__Group_7__2"


    // $ANTLR start "rule__HeadingSO__Group_7__2__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:771:1: rule__HeadingSO__Group_7__2__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__HeadingSO__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:775:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:776:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:776:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:777:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__HeadingSO__Group_7__2__Impl1515); 
             after(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 

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
    // $ANTLR end "rule__HeadingSO__Group_7__2__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:794:1: rule__ReqPatSO__Group__0 : rule__ReqPatSO__Group__0__Impl rule__ReqPatSO__Group__1 ;
    public final void rule__ReqPatSO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:798:1: ( rule__ReqPatSO__Group__0__Impl rule__ReqPatSO__Group__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:799:2: rule__ReqPatSO__Group__0__Impl rule__ReqPatSO__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__0__Impl_in_rule__ReqPatSO__Group__01550);
            rule__ReqPatSO__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__1_in_rule__ReqPatSO__Group__01553);
            rule__ReqPatSO__Group__1();

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
    // $ANTLR end "rule__ReqPatSO__Group__0"


    // $ANTLR start "rule__ReqPatSO__Group__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:806:1: rule__ReqPatSO__Group__0__Impl : ( () ) ;
    public final void rule__ReqPatSO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:810:1: ( ( () ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:811:1: ( () )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:811:1: ( () )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:812:1: ()
            {
             before(grammarAccess.getReqPatSOAccess().getRequirementPatternSpecObjectAction_0()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:813:1: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:815:1: 
            {
            }

             after(grammarAccess.getReqPatSOAccess().getRequirementPatternSpecObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqPatSO__Group__0__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:825:1: rule__ReqPatSO__Group__1 : rule__ReqPatSO__Group__1__Impl rule__ReqPatSO__Group__2 ;
    public final void rule__ReqPatSO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:829:1: ( rule__ReqPatSO__Group__1__Impl rule__ReqPatSO__Group__2 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:830:2: rule__ReqPatSO__Group__1__Impl rule__ReqPatSO__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__1__Impl_in_rule__ReqPatSO__Group__11611);
            rule__ReqPatSO__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__2_in_rule__ReqPatSO__Group__11614);
            rule__ReqPatSO__Group__2();

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
    // $ANTLR end "rule__ReqPatSO__Group__1"


    // $ANTLR start "rule__ReqPatSO__Group__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:837:1: rule__ReqPatSO__Group__1__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__ReqPatSO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:841:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:842:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:842:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:843:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__ReqPatSO__Group__1__Impl1641); 
             after(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ReqPatSO__Group__1__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__2"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:854:1: rule__ReqPatSO__Group__2 : rule__ReqPatSO__Group__2__Impl rule__ReqPatSO__Group__3 ;
    public final void rule__ReqPatSO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:858:1: ( rule__ReqPatSO__Group__2__Impl rule__ReqPatSO__Group__3 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:859:2: rule__ReqPatSO__Group__2__Impl rule__ReqPatSO__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__2__Impl_in_rule__ReqPatSO__Group__21670);
            rule__ReqPatSO__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__3_in_rule__ReqPatSO__Group__21673);
            rule__ReqPatSO__Group__3();

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
    // $ANTLR end "rule__ReqPatSO__Group__2"


    // $ANTLR start "rule__ReqPatSO__Group__2__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:866:1: rule__ReqPatSO__Group__2__Impl : ( 'RP' ) ;
    public final void rule__ReqPatSO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:870:1: ( ( 'RP' ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:871:1: ( 'RP' )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:871:1: ( 'RP' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:872:1: 'RP'
            {
             before(grammarAccess.getReqPatSOAccess().getRPKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ReqPatSO__Group__2__Impl1701); 
             after(grammarAccess.getReqPatSOAccess().getRPKeyword_2()); 

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
    // $ANTLR end "rule__ReqPatSO__Group__2__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__3"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:885:1: rule__ReqPatSO__Group__3 : rule__ReqPatSO__Group__3__Impl rule__ReqPatSO__Group__4 ;
    public final void rule__ReqPatSO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:889:1: ( rule__ReqPatSO__Group__3__Impl rule__ReqPatSO__Group__4 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:890:2: rule__ReqPatSO__Group__3__Impl rule__ReqPatSO__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__3__Impl_in_rule__ReqPatSO__Group__31732);
            rule__ReqPatSO__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__4_in_rule__ReqPatSO__Group__31735);
            rule__ReqPatSO__Group__4();

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
    // $ANTLR end "rule__ReqPatSO__Group__3"


    // $ANTLR start "rule__ReqPatSO__Group__3__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:897:1: rule__ReqPatSO__Group__3__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__ReqPatSO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:901:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:902:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:902:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:903:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__ReqPatSO__Group__3__Impl1762); 
             after(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__ReqPatSO__Group__3__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__4"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:914:1: rule__ReqPatSO__Group__4 : rule__ReqPatSO__Group__4__Impl rule__ReqPatSO__Group__5 ;
    public final void rule__ReqPatSO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:918:1: ( rule__ReqPatSO__Group__4__Impl rule__ReqPatSO__Group__5 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:919:2: rule__ReqPatSO__Group__4__Impl rule__ReqPatSO__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__4__Impl_in_rule__ReqPatSO__Group__41791);
            rule__ReqPatSO__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__5_in_rule__ReqPatSO__Group__41794);
            rule__ReqPatSO__Group__5();

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
    // $ANTLR end "rule__ReqPatSO__Group__4"


    // $ANTLR start "rule__ReqPatSO__Group__4__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:926:1: rule__ReqPatSO__Group__4__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__ReqPatSO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:930:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:931:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:931:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:932:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__ReqPatSO__Group__4__Impl1821); 
             after(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__ReqPatSO__Group__4__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__5"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:943:1: rule__ReqPatSO__Group__5 : rule__ReqPatSO__Group__5__Impl rule__ReqPatSO__Group__6 ;
    public final void rule__ReqPatSO__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:947:1: ( rule__ReqPatSO__Group__5__Impl rule__ReqPatSO__Group__6 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:948:2: rule__ReqPatSO__Group__5__Impl rule__ReqPatSO__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__5__Impl_in_rule__ReqPatSO__Group__51850);
            rule__ReqPatSO__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__6_in_rule__ReqPatSO__Group__51853);
            rule__ReqPatSO__Group__6();

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
    // $ANTLR end "rule__ReqPatSO__Group__5"


    // $ANTLR start "rule__ReqPatSO__Group__5__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:955:1: rule__ReqPatSO__Group__5__Impl : ( ( rule__ReqPatSO__IdAssignment_5 ) ) ;
    public final void rule__ReqPatSO__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:959:1: ( ( ( rule__ReqPatSO__IdAssignment_5 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:960:1: ( ( rule__ReqPatSO__IdAssignment_5 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:960:1: ( ( rule__ReqPatSO__IdAssignment_5 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:961:1: ( rule__ReqPatSO__IdAssignment_5 )
            {
             before(grammarAccess.getReqPatSOAccess().getIdAssignment_5()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:962:1: ( rule__ReqPatSO__IdAssignment_5 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:962:2: rule__ReqPatSO__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__IdAssignment_5_in_rule__ReqPatSO__Group__5__Impl1880);
            rule__ReqPatSO__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReqPatSOAccess().getIdAssignment_5()); 

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
    // $ANTLR end "rule__ReqPatSO__Group__5__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__6"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:972:1: rule__ReqPatSO__Group__6 : rule__ReqPatSO__Group__6__Impl rule__ReqPatSO__Group__7 ;
    public final void rule__ReqPatSO__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:976:1: ( rule__ReqPatSO__Group__6__Impl rule__ReqPatSO__Group__7 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:977:2: rule__ReqPatSO__Group__6__Impl rule__ReqPatSO__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__6__Impl_in_rule__ReqPatSO__Group__61910);
            rule__ReqPatSO__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__7_in_rule__ReqPatSO__Group__61913);
            rule__ReqPatSO__Group__7();

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
    // $ANTLR end "rule__ReqPatSO__Group__6"


    // $ANTLR start "rule__ReqPatSO__Group__6__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:984:1: rule__ReqPatSO__Group__6__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__ReqPatSO__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:988:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:989:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:989:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:990:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__ReqPatSO__Group__6__Impl1940); 
             after(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__ReqPatSO__Group__6__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__7"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1001:1: rule__ReqPatSO__Group__7 : rule__ReqPatSO__Group__7__Impl rule__ReqPatSO__Group__8 ;
    public final void rule__ReqPatSO__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1005:1: ( rule__ReqPatSO__Group__7__Impl rule__ReqPatSO__Group__8 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1006:2: rule__ReqPatSO__Group__7__Impl rule__ReqPatSO__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__7__Impl_in_rule__ReqPatSO__Group__71969);
            rule__ReqPatSO__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__8_in_rule__ReqPatSO__Group__71972);
            rule__ReqPatSO__Group__8();

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
    // $ANTLR end "rule__ReqPatSO__Group__7"


    // $ANTLR start "rule__ReqPatSO__Group__7__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1013:1: rule__ReqPatSO__Group__7__Impl : ( ( rule__ReqPatSO__Group_7__0 )? ) ;
    public final void rule__ReqPatSO__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1017:1: ( ( ( rule__ReqPatSO__Group_7__0 )? ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1018:1: ( ( rule__ReqPatSO__Group_7__0 )? )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1018:1: ( ( rule__ReqPatSO__Group_7__0 )? )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1019:1: ( rule__ReqPatSO__Group_7__0 )?
            {
             before(grammarAccess.getReqPatSOAccess().getGroup_7()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1020:1: ( rule__ReqPatSO__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_PARAMDELIMITERLEFT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1020:2: rule__ReqPatSO__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group_7__0_in_rule__ReqPatSO__Group__7__Impl1999);
                    rule__ReqPatSO__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReqPatSOAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ReqPatSO__Group__7__Impl"


    // $ANTLR start "rule__ReqPatSO__Group__8"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1030:1: rule__ReqPatSO__Group__8 : rule__ReqPatSO__Group__8__Impl ;
    public final void rule__ReqPatSO__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1034:1: ( rule__ReqPatSO__Group__8__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1035:2: rule__ReqPatSO__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group__8__Impl_in_rule__ReqPatSO__Group__82030);
            rule__ReqPatSO__Group__8__Impl();

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
    // $ANTLR end "rule__ReqPatSO__Group__8"


    // $ANTLR start "rule__ReqPatSO__Group__8__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1041:1: rule__ReqPatSO__Group__8__Impl : ( ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* ) ) ;
    public final void rule__ReqPatSO__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1045:1: ( ( ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1046:1: ( ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1046:1: ( ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1047:1: ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1047:1: ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1048:1: ( rule__ReqPatSO__RequirementPatternsAssignment_8 )
            {
             before(grammarAccess.getReqPatSOAccess().getRequirementPatternsAssignment_8()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1049:1: ( rule__ReqPatSO__RequirementPatternsAssignment_8 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1049:2: rule__ReqPatSO__RequirementPatternsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__RequirementPatternsAssignment_8_in_rule__ReqPatSO__Group__8__Impl2059);
            rule__ReqPatSO__RequirementPatternsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getReqPatSOAccess().getRequirementPatternsAssignment_8()); 

            }

            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1052:1: ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1053:1: ( rule__ReqPatSO__RequirementPatternsAssignment_8 )*
            {
             before(grammarAccess.getReqPatSOAccess().getRequirementPatternsAssignment_8()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1054:1: ( rule__ReqPatSO__RequirementPatternsAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1054:2: rule__ReqPatSO__RequirementPatternsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__RequirementPatternsAssignment_8_in_rule__ReqPatSO__Group__8__Impl2071);
            	    rule__ReqPatSO__RequirementPatternsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getReqPatSOAccess().getRequirementPatternsAssignment_8()); 

            }


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
    // $ANTLR end "rule__ReqPatSO__Group__8__Impl"


    // $ANTLR start "rule__ReqPatSO__Group_7__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1083:1: rule__ReqPatSO__Group_7__0 : rule__ReqPatSO__Group_7__0__Impl rule__ReqPatSO__Group_7__1 ;
    public final void rule__ReqPatSO__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1087:1: ( rule__ReqPatSO__Group_7__0__Impl rule__ReqPatSO__Group_7__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1088:2: rule__ReqPatSO__Group_7__0__Impl rule__ReqPatSO__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group_7__0__Impl_in_rule__ReqPatSO__Group_7__02122);
            rule__ReqPatSO__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group_7__1_in_rule__ReqPatSO__Group_7__02125);
            rule__ReqPatSO__Group_7__1();

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
    // $ANTLR end "rule__ReqPatSO__Group_7__0"


    // $ANTLR start "rule__ReqPatSO__Group_7__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1095:1: rule__ReqPatSO__Group_7__0__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__ReqPatSO__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1099:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1100:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1100:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1101:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__ReqPatSO__Group_7__0__Impl2152); 
             after(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__ReqPatSO__Group_7__0__Impl"


    // $ANTLR start "rule__ReqPatSO__Group_7__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1112:1: rule__ReqPatSO__Group_7__1 : rule__ReqPatSO__Group_7__1__Impl rule__ReqPatSO__Group_7__2 ;
    public final void rule__ReqPatSO__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1116:1: ( rule__ReqPatSO__Group_7__1__Impl rule__ReqPatSO__Group_7__2 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1117:2: rule__ReqPatSO__Group_7__1__Impl rule__ReqPatSO__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group_7__1__Impl_in_rule__ReqPatSO__Group_7__12181);
            rule__ReqPatSO__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group_7__2_in_rule__ReqPatSO__Group_7__12184);
            rule__ReqPatSO__Group_7__2();

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
    // $ANTLR end "rule__ReqPatSO__Group_7__1"


    // $ANTLR start "rule__ReqPatSO__Group_7__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1124:1: rule__ReqPatSO__Group_7__1__Impl : ( ( rule__ReqPatSO__ParentAssignment_7_1 ) ) ;
    public final void rule__ReqPatSO__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1128:1: ( ( ( rule__ReqPatSO__ParentAssignment_7_1 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1129:1: ( ( rule__ReqPatSO__ParentAssignment_7_1 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1129:1: ( ( rule__ReqPatSO__ParentAssignment_7_1 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1130:1: ( rule__ReqPatSO__ParentAssignment_7_1 )
            {
             before(grammarAccess.getReqPatSOAccess().getParentAssignment_7_1()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1131:1: ( rule__ReqPatSO__ParentAssignment_7_1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1131:2: rule__ReqPatSO__ParentAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__ParentAssignment_7_1_in_rule__ReqPatSO__Group_7__1__Impl2211);
            rule__ReqPatSO__ParentAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getReqPatSOAccess().getParentAssignment_7_1()); 

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
    // $ANTLR end "rule__ReqPatSO__Group_7__1__Impl"


    // $ANTLR start "rule__ReqPatSO__Group_7__2"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1141:1: rule__ReqPatSO__Group_7__2 : rule__ReqPatSO__Group_7__2__Impl ;
    public final void rule__ReqPatSO__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1145:1: ( rule__ReqPatSO__Group_7__2__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1146:2: rule__ReqPatSO__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReqPatSO__Group_7__2__Impl_in_rule__ReqPatSO__Group_7__22241);
            rule__ReqPatSO__Group_7__2__Impl();

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
    // $ANTLR end "rule__ReqPatSO__Group_7__2"


    // $ANTLR start "rule__ReqPatSO__Group_7__2__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1152:1: rule__ReqPatSO__Group_7__2__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__ReqPatSO__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1156:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1157:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1157:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1158:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__ReqPatSO__Group_7__2__Impl2268); 
             after(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 

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
    // $ANTLR end "rule__ReqPatSO__Group_7__2__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1175:1: rule__FreeTextSO__Group__0 : rule__FreeTextSO__Group__0__Impl rule__FreeTextSO__Group__1 ;
    public final void rule__FreeTextSO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1179:1: ( rule__FreeTextSO__Group__0__Impl rule__FreeTextSO__Group__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1180:2: rule__FreeTextSO__Group__0__Impl rule__FreeTextSO__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__0__Impl_in_rule__FreeTextSO__Group__02303);
            rule__FreeTextSO__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__1_in_rule__FreeTextSO__Group__02306);
            rule__FreeTextSO__Group__1();

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
    // $ANTLR end "rule__FreeTextSO__Group__0"


    // $ANTLR start "rule__FreeTextSO__Group__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1187:1: rule__FreeTextSO__Group__0__Impl : ( () ) ;
    public final void rule__FreeTextSO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1191:1: ( ( () ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1192:1: ( () )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1192:1: ( () )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1193:1: ()
            {
             before(grammarAccess.getFreeTextSOAccess().getFreeTextSpecObjectAction_0()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1194:1: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1196:1: 
            {
            }

             after(grammarAccess.getFreeTextSOAccess().getFreeTextSpecObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextSO__Group__0__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1206:1: rule__FreeTextSO__Group__1 : rule__FreeTextSO__Group__1__Impl rule__FreeTextSO__Group__2 ;
    public final void rule__FreeTextSO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1210:1: ( rule__FreeTextSO__Group__1__Impl rule__FreeTextSO__Group__2 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1211:2: rule__FreeTextSO__Group__1__Impl rule__FreeTextSO__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__1__Impl_in_rule__FreeTextSO__Group__12364);
            rule__FreeTextSO__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__2_in_rule__FreeTextSO__Group__12367);
            rule__FreeTextSO__Group__2();

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
    // $ANTLR end "rule__FreeTextSO__Group__1"


    // $ANTLR start "rule__FreeTextSO__Group__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1218:1: rule__FreeTextSO__Group__1__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__FreeTextSO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1222:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1223:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1223:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1224:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__FreeTextSO__Group__1__Impl2394); 
             after(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__FreeTextSO__Group__1__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__2"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1235:1: rule__FreeTextSO__Group__2 : rule__FreeTextSO__Group__2__Impl rule__FreeTextSO__Group__3 ;
    public final void rule__FreeTextSO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1239:1: ( rule__FreeTextSO__Group__2__Impl rule__FreeTextSO__Group__3 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1240:2: rule__FreeTextSO__Group__2__Impl rule__FreeTextSO__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__2__Impl_in_rule__FreeTextSO__Group__22423);
            rule__FreeTextSO__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__3_in_rule__FreeTextSO__Group__22426);
            rule__FreeTextSO__Group__3();

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
    // $ANTLR end "rule__FreeTextSO__Group__2"


    // $ANTLR start "rule__FreeTextSO__Group__2__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1247:1: rule__FreeTextSO__Group__2__Impl : ( 'F' ) ;
    public final void rule__FreeTextSO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1251:1: ( ( 'F' ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1252:1: ( 'F' )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1252:1: ( 'F' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1253:1: 'F'
            {
             before(grammarAccess.getFreeTextSOAccess().getFKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__FreeTextSO__Group__2__Impl2454); 
             after(grammarAccess.getFreeTextSOAccess().getFKeyword_2()); 

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
    // $ANTLR end "rule__FreeTextSO__Group__2__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__3"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1266:1: rule__FreeTextSO__Group__3 : rule__FreeTextSO__Group__3__Impl rule__FreeTextSO__Group__4 ;
    public final void rule__FreeTextSO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1270:1: ( rule__FreeTextSO__Group__3__Impl rule__FreeTextSO__Group__4 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1271:2: rule__FreeTextSO__Group__3__Impl rule__FreeTextSO__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__3__Impl_in_rule__FreeTextSO__Group__32485);
            rule__FreeTextSO__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__4_in_rule__FreeTextSO__Group__32488);
            rule__FreeTextSO__Group__4();

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
    // $ANTLR end "rule__FreeTextSO__Group__3"


    // $ANTLR start "rule__FreeTextSO__Group__3__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1278:1: rule__FreeTextSO__Group__3__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__FreeTextSO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1282:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1283:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1283:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1284:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__FreeTextSO__Group__3__Impl2515); 
             after(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__FreeTextSO__Group__3__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__4"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1295:1: rule__FreeTextSO__Group__4 : rule__FreeTextSO__Group__4__Impl rule__FreeTextSO__Group__5 ;
    public final void rule__FreeTextSO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1299:1: ( rule__FreeTextSO__Group__4__Impl rule__FreeTextSO__Group__5 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1300:2: rule__FreeTextSO__Group__4__Impl rule__FreeTextSO__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__4__Impl_in_rule__FreeTextSO__Group__42544);
            rule__FreeTextSO__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__5_in_rule__FreeTextSO__Group__42547);
            rule__FreeTextSO__Group__5();

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
    // $ANTLR end "rule__FreeTextSO__Group__4"


    // $ANTLR start "rule__FreeTextSO__Group__4__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1307:1: rule__FreeTextSO__Group__4__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__FreeTextSO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1311:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1312:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1312:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1313:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__FreeTextSO__Group__4__Impl2574); 
             after(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__FreeTextSO__Group__4__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__5"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1324:1: rule__FreeTextSO__Group__5 : rule__FreeTextSO__Group__5__Impl rule__FreeTextSO__Group__6 ;
    public final void rule__FreeTextSO__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1328:1: ( rule__FreeTextSO__Group__5__Impl rule__FreeTextSO__Group__6 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1329:2: rule__FreeTextSO__Group__5__Impl rule__FreeTextSO__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__5__Impl_in_rule__FreeTextSO__Group__52603);
            rule__FreeTextSO__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__6_in_rule__FreeTextSO__Group__52606);
            rule__FreeTextSO__Group__6();

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
    // $ANTLR end "rule__FreeTextSO__Group__5"


    // $ANTLR start "rule__FreeTextSO__Group__5__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1336:1: rule__FreeTextSO__Group__5__Impl : ( ( rule__FreeTextSO__IdAssignment_5 ) ) ;
    public final void rule__FreeTextSO__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1340:1: ( ( ( rule__FreeTextSO__IdAssignment_5 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1341:1: ( ( rule__FreeTextSO__IdAssignment_5 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1341:1: ( ( rule__FreeTextSO__IdAssignment_5 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1342:1: ( rule__FreeTextSO__IdAssignment_5 )
            {
             before(grammarAccess.getFreeTextSOAccess().getIdAssignment_5()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1343:1: ( rule__FreeTextSO__IdAssignment_5 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1343:2: rule__FreeTextSO__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__IdAssignment_5_in_rule__FreeTextSO__Group__5__Impl2633);
            rule__FreeTextSO__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextSOAccess().getIdAssignment_5()); 

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
    // $ANTLR end "rule__FreeTextSO__Group__5__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__6"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1353:1: rule__FreeTextSO__Group__6 : rule__FreeTextSO__Group__6__Impl rule__FreeTextSO__Group__7 ;
    public final void rule__FreeTextSO__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1357:1: ( rule__FreeTextSO__Group__6__Impl rule__FreeTextSO__Group__7 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1358:2: rule__FreeTextSO__Group__6__Impl rule__FreeTextSO__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__6__Impl_in_rule__FreeTextSO__Group__62663);
            rule__FreeTextSO__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__7_in_rule__FreeTextSO__Group__62666);
            rule__FreeTextSO__Group__7();

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
    // $ANTLR end "rule__FreeTextSO__Group__6"


    // $ANTLR start "rule__FreeTextSO__Group__6__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1365:1: rule__FreeTextSO__Group__6__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__FreeTextSO__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1369:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1370:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1370:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1371:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__FreeTextSO__Group__6__Impl2693); 
             after(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__FreeTextSO__Group__6__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__7"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1382:1: rule__FreeTextSO__Group__7 : rule__FreeTextSO__Group__7__Impl rule__FreeTextSO__Group__8 ;
    public final void rule__FreeTextSO__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1386:1: ( rule__FreeTextSO__Group__7__Impl rule__FreeTextSO__Group__8 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1387:2: rule__FreeTextSO__Group__7__Impl rule__FreeTextSO__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__7__Impl_in_rule__FreeTextSO__Group__72722);
            rule__FreeTextSO__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__8_in_rule__FreeTextSO__Group__72725);
            rule__FreeTextSO__Group__8();

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
    // $ANTLR end "rule__FreeTextSO__Group__7"


    // $ANTLR start "rule__FreeTextSO__Group__7__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1394:1: rule__FreeTextSO__Group__7__Impl : ( ( rule__FreeTextSO__Group_7__0 )? ) ;
    public final void rule__FreeTextSO__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1398:1: ( ( ( rule__FreeTextSO__Group_7__0 )? ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1399:1: ( ( rule__FreeTextSO__Group_7__0 )? )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1399:1: ( ( rule__FreeTextSO__Group_7__0 )? )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1400:1: ( rule__FreeTextSO__Group_7__0 )?
            {
             before(grammarAccess.getFreeTextSOAccess().getGroup_7()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1401:1: ( rule__FreeTextSO__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_PARAMDELIMITERLEFT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1401:2: rule__FreeTextSO__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group_7__0_in_rule__FreeTextSO__Group__7__Impl2752);
                    rule__FreeTextSO__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreeTextSOAccess().getGroup_7()); 

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
    // $ANTLR end "rule__FreeTextSO__Group__7__Impl"


    // $ANTLR start "rule__FreeTextSO__Group__8"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1411:1: rule__FreeTextSO__Group__8 : rule__FreeTextSO__Group__8__Impl ;
    public final void rule__FreeTextSO__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1415:1: ( rule__FreeTextSO__Group__8__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1416:2: rule__FreeTextSO__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group__8__Impl_in_rule__FreeTextSO__Group__82783);
            rule__FreeTextSO__Group__8__Impl();

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
    // $ANTLR end "rule__FreeTextSO__Group__8"


    // $ANTLR start "rule__FreeTextSO__Group__8__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1422:1: rule__FreeTextSO__Group__8__Impl : ( ( rule__FreeTextSO__FreeTextAssignment_8 )? ) ;
    public final void rule__FreeTextSO__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1426:1: ( ( ( rule__FreeTextSO__FreeTextAssignment_8 )? ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1427:1: ( ( rule__FreeTextSO__FreeTextAssignment_8 )? )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1427:1: ( ( rule__FreeTextSO__FreeTextAssignment_8 )? )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1428:1: ( rule__FreeTextSO__FreeTextAssignment_8 )?
            {
             before(grammarAccess.getFreeTextSOAccess().getFreeTextAssignment_8()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1429:1: ( rule__FreeTextSO__FreeTextAssignment_8 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1429:2: rule__FreeTextSO__FreeTextAssignment_8
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__FreeTextAssignment_8_in_rule__FreeTextSO__Group__8__Impl2810);
                    rule__FreeTextSO__FreeTextAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreeTextSOAccess().getFreeTextAssignment_8()); 

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
    // $ANTLR end "rule__FreeTextSO__Group__8__Impl"


    // $ANTLR start "rule__FreeTextSO__Group_7__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1457:1: rule__FreeTextSO__Group_7__0 : rule__FreeTextSO__Group_7__0__Impl rule__FreeTextSO__Group_7__1 ;
    public final void rule__FreeTextSO__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1461:1: ( rule__FreeTextSO__Group_7__0__Impl rule__FreeTextSO__Group_7__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1462:2: rule__FreeTextSO__Group_7__0__Impl rule__FreeTextSO__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group_7__0__Impl_in_rule__FreeTextSO__Group_7__02859);
            rule__FreeTextSO__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group_7__1_in_rule__FreeTextSO__Group_7__02862);
            rule__FreeTextSO__Group_7__1();

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
    // $ANTLR end "rule__FreeTextSO__Group_7__0"


    // $ANTLR start "rule__FreeTextSO__Group_7__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1469:1: rule__FreeTextSO__Group_7__0__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__FreeTextSO__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1473:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1474:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1474:1: ( RULE_PARAMDELIMITERLEFT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1475:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__FreeTextSO__Group_7__0__Impl2889); 
             after(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__FreeTextSO__Group_7__0__Impl"


    // $ANTLR start "rule__FreeTextSO__Group_7__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1486:1: rule__FreeTextSO__Group_7__1 : rule__FreeTextSO__Group_7__1__Impl rule__FreeTextSO__Group_7__2 ;
    public final void rule__FreeTextSO__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1490:1: ( rule__FreeTextSO__Group_7__1__Impl rule__FreeTextSO__Group_7__2 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1491:2: rule__FreeTextSO__Group_7__1__Impl rule__FreeTextSO__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group_7__1__Impl_in_rule__FreeTextSO__Group_7__12918);
            rule__FreeTextSO__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group_7__2_in_rule__FreeTextSO__Group_7__12921);
            rule__FreeTextSO__Group_7__2();

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
    // $ANTLR end "rule__FreeTextSO__Group_7__1"


    // $ANTLR start "rule__FreeTextSO__Group_7__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1498:1: rule__FreeTextSO__Group_7__1__Impl : ( ( rule__FreeTextSO__ParentAssignment_7_1 ) ) ;
    public final void rule__FreeTextSO__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1502:1: ( ( ( rule__FreeTextSO__ParentAssignment_7_1 ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1503:1: ( ( rule__FreeTextSO__ParentAssignment_7_1 ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1503:1: ( ( rule__FreeTextSO__ParentAssignment_7_1 ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1504:1: ( rule__FreeTextSO__ParentAssignment_7_1 )
            {
             before(grammarAccess.getFreeTextSOAccess().getParentAssignment_7_1()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1505:1: ( rule__FreeTextSO__ParentAssignment_7_1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1505:2: rule__FreeTextSO__ParentAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__ParentAssignment_7_1_in_rule__FreeTextSO__Group_7__1__Impl2948);
            rule__FreeTextSO__ParentAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextSOAccess().getParentAssignment_7_1()); 

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
    // $ANTLR end "rule__FreeTextSO__Group_7__1__Impl"


    // $ANTLR start "rule__FreeTextSO__Group_7__2"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1515:1: rule__FreeTextSO__Group_7__2 : rule__FreeTextSO__Group_7__2__Impl ;
    public final void rule__FreeTextSO__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1519:1: ( rule__FreeTextSO__Group_7__2__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1520:2: rule__FreeTextSO__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreeTextSO__Group_7__2__Impl_in_rule__FreeTextSO__Group_7__22978);
            rule__FreeTextSO__Group_7__2__Impl();

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
    // $ANTLR end "rule__FreeTextSO__Group_7__2"


    // $ANTLR start "rule__FreeTextSO__Group_7__2__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1526:1: rule__FreeTextSO__Group_7__2__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__FreeTextSO__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1530:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1531:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1531:1: ( RULE_PARAMDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1532:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__FreeTextSO__Group_7__2__Impl3005); 
             after(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 

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
    // $ANTLR end "rule__FreeTextSO__Group_7__2__Impl"


    // $ANTLR start "rule__RequirementPattern__Group__0"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1549:1: rule__RequirementPattern__Group__0 : rule__RequirementPattern__Group__0__Impl rule__RequirementPattern__Group__1 ;
    public final void rule__RequirementPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1553:1: ( rule__RequirementPattern__Group__0__Impl rule__RequirementPattern__Group__1 )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1554:2: rule__RequirementPattern__Group__0__Impl rule__RequirementPattern__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RequirementPattern__Group__0__Impl_in_rule__RequirementPattern__Group__03040);
            rule__RequirementPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RequirementPattern__Group__1_in_rule__RequirementPattern__Group__03043);
            rule__RequirementPattern__Group__1();

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
    // $ANTLR end "rule__RequirementPattern__Group__0"


    // $ANTLR start "rule__RequirementPattern__Group__0__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1561:1: rule__RequirementPattern__Group__0__Impl : ( () ) ;
    public final void rule__RequirementPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1565:1: ( ( () ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1566:1: ( () )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1566:1: ( () )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1567:1: ()
            {
             before(grammarAccess.getRequirementPatternAccess().getRequirementPatternAction_0()); 
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1568:1: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1570:1: 
            {
            }

             after(grammarAccess.getRequirementPatternAccess().getRequirementPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementPattern__Group__0__Impl"


    // $ANTLR start "rule__RequirementPattern__Group__1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1580:1: rule__RequirementPattern__Group__1 : rule__RequirementPattern__Group__1__Impl ;
    public final void rule__RequirementPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1584:1: ( rule__RequirementPattern__Group__1__Impl )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1585:2: rule__RequirementPattern__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RequirementPattern__Group__1__Impl_in_rule__RequirementPattern__Group__13101);
            rule__RequirementPattern__Group__1__Impl();

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
    // $ANTLR end "rule__RequirementPattern__Group__1"


    // $ANTLR start "rule__RequirementPattern__Group__1__Impl"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1591:1: rule__RequirementPattern__Group__1__Impl : ( 'This is a sample requirement pattern.' ) ;
    public final void rule__RequirementPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1595:1: ( ( 'This is a sample requirement pattern.' ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1596:1: ( 'This is a sample requirement pattern.' )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1596:1: ( 'This is a sample requirement pattern.' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1597:1: 'This is a sample requirement pattern.'
            {
             before(grammarAccess.getRequirementPatternAccess().getThisIsASampleRequirementPatternKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RequirementPattern__Group__1__Impl3129); 
             after(grammarAccess.getRequirementPatternAccess().getThisIsASampleRequirementPatternKeyword_1()); 

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
    // $ANTLR end "rule__RequirementPattern__Group__1__Impl"


    // $ANTLR start "rule__Root__SpecObjectsAssignment_1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1615:1: rule__Root__SpecObjectsAssignment_1 : ( ruleSpecObj ) ;
    public final void rule__Root__SpecObjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1619:1: ( ( ruleSpecObj ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1620:1: ( ruleSpecObj )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1620:1: ( ruleSpecObj )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1621:1: ruleSpecObj
            {
             before(grammarAccess.getRootAccess().getSpecObjectsSpecObjParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpecObj_in_rule__Root__SpecObjectsAssignment_13169);
            ruleSpecObj();

            state._fsp--;

             after(grammarAccess.getRootAccess().getSpecObjectsSpecObjParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Root__SpecObjectsAssignment_1"


    // $ANTLR start "rule__HeadingSO__IdAssignment_5"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1630:1: rule__HeadingSO__IdAssignment_5 : ( RULE_ID ) ;
    public final void rule__HeadingSO__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1634:1: ( ( RULE_ID ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1635:1: ( RULE_ID )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1635:1: ( RULE_ID )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1636:1: RULE_ID
            {
             before(grammarAccess.getHeadingSOAccess().getIdIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HeadingSO__IdAssignment_53200); 
             after(grammarAccess.getHeadingSOAccess().getIdIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__HeadingSO__IdAssignment_5"


    // $ANTLR start "rule__HeadingSO__ParentAssignment_7_1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1645:1: rule__HeadingSO__ParentAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__HeadingSO__ParentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1649:1: ( ( RULE_STRING ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1650:1: ( RULE_STRING )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1650:1: ( RULE_STRING )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1651:1: RULE_STRING
            {
             before(grammarAccess.getHeadingSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__HeadingSO__ParentAssignment_7_13231); 
             after(grammarAccess.getHeadingSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__HeadingSO__ParentAssignment_7_1"


    // $ANTLR start "rule__HeadingSO__TextAssignment_8"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1660:1: rule__HeadingSO__TextAssignment_8 : ( RULE_STRING ) ;
    public final void rule__HeadingSO__TextAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1664:1: ( ( RULE_STRING ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1665:1: ( RULE_STRING )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1665:1: ( RULE_STRING )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1666:1: RULE_STRING
            {
             before(grammarAccess.getHeadingSOAccess().getTextSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__HeadingSO__TextAssignment_83262); 
             after(grammarAccess.getHeadingSOAccess().getTextSTRINGTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__HeadingSO__TextAssignment_8"


    // $ANTLR start "rule__ReqPatSO__IdAssignment_5"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1675:1: rule__ReqPatSO__IdAssignment_5 : ( RULE_ID ) ;
    public final void rule__ReqPatSO__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1679:1: ( ( RULE_ID ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1680:1: ( RULE_ID )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1680:1: ( RULE_ID )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1681:1: RULE_ID
            {
             before(grammarAccess.getReqPatSOAccess().getIdIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ReqPatSO__IdAssignment_53293); 
             after(grammarAccess.getReqPatSOAccess().getIdIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ReqPatSO__IdAssignment_5"


    // $ANTLR start "rule__ReqPatSO__ParentAssignment_7_1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1690:1: rule__ReqPatSO__ParentAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__ReqPatSO__ParentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1694:1: ( ( RULE_STRING ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1695:1: ( RULE_STRING )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1695:1: ( RULE_STRING )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1696:1: RULE_STRING
            {
             before(grammarAccess.getReqPatSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ReqPatSO__ParentAssignment_7_13324); 
             after(grammarAccess.getReqPatSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__ReqPatSO__ParentAssignment_7_1"


    // $ANTLR start "rule__ReqPatSO__RequirementPatternsAssignment_8"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1705:1: rule__ReqPatSO__RequirementPatternsAssignment_8 : ( ruleRequirementPattern ) ;
    public final void rule__ReqPatSO__RequirementPatternsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1709:1: ( ( ruleRequirementPattern ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1710:1: ( ruleRequirementPattern )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1710:1: ( ruleRequirementPattern )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1711:1: ruleRequirementPattern
            {
             before(grammarAccess.getReqPatSOAccess().getRequirementPatternsRequirementPatternParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequirementPattern_in_rule__ReqPatSO__RequirementPatternsAssignment_83355);
            ruleRequirementPattern();

            state._fsp--;

             after(grammarAccess.getReqPatSOAccess().getRequirementPatternsRequirementPatternParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ReqPatSO__RequirementPatternsAssignment_8"


    // $ANTLR start "rule__FreeTextSO__IdAssignment_5"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1720:1: rule__FreeTextSO__IdAssignment_5 : ( RULE_ID ) ;
    public final void rule__FreeTextSO__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1724:1: ( ( RULE_ID ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1725:1: ( RULE_ID )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1725:1: ( RULE_ID )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1726:1: RULE_ID
            {
             before(grammarAccess.getFreeTextSOAccess().getIdIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FreeTextSO__IdAssignment_53386); 
             after(grammarAccess.getFreeTextSOAccess().getIdIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__FreeTextSO__IdAssignment_5"


    // $ANTLR start "rule__FreeTextSO__ParentAssignment_7_1"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1735:1: rule__FreeTextSO__ParentAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__FreeTextSO__ParentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1739:1: ( ( RULE_STRING ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1740:1: ( RULE_STRING )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1740:1: ( RULE_STRING )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1741:1: RULE_STRING
            {
             before(grammarAccess.getFreeTextSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__FreeTextSO__ParentAssignment_7_13417); 
             after(grammarAccess.getFreeTextSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__FreeTextSO__ParentAssignment_7_1"


    // $ANTLR start "rule__FreeTextSO__FreeTextAssignment_8"
    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1750:1: rule__FreeTextSO__FreeTextAssignment_8 : ( RULE_STRING ) ;
    public final void rule__FreeTextSO__FreeTextAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1754:1: ( ( RULE_STRING ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1755:1: ( RULE_STRING )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1755:1: ( RULE_STRING )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1756:1: RULE_STRING
            {
             before(grammarAccess.getFreeTextSOAccess().getFreeTextSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__FreeTextSO__FreeTextAssignment_83448); 
             after(grammarAccess.getFreeTextSOAccess().getFreeTextSTRINGTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__FreeTextSO__FreeTextAssignment_8"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpecObj_in_entryRuleSpecObj121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpecObj128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SpecObj__Group__0_in_ruleSpecObj154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeadingSO_in_entryRuleHeadingSO181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHeadingSO188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__0_in_ruleHeadingSO214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReqPatSO_in_entryRuleReqPatSO241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReqPatSO248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__0_in_ruleReqPatSO274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreeTextSO_in_entryRuleFreeTextSO301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreeTextSO308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__0_in_ruleFreeTextSO334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequirementPattern_in_entryRuleRequirementPattern361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequirementPattern368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RequirementPattern__Group__0_in_ruleRequirementPattern394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeadingSO_in_rule__SpecObj__Alternatives_1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReqPatSO_in_rule__SpecObj__Alternatives_1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreeTextSO_in_rule__SpecObj__Alternatives_1464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__0494 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__0497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__SpecObjectsAssignment_1_in_rule__Root__Group__1__Impl584 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Root__SpecObjectsAssignment_1_in_rule__Root__Group__1__Impl596 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__SpecObj__Group__0__Impl_in_rule__SpecObj__Group__0633 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__SpecObj__Group__1_in_rule__SpecObj__Group__0636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SPECOBJECTDELIMITERLEFT_in_rule__SpecObj__Group__0__Impl663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SpecObj__Group__1__Impl_in_rule__SpecObj__Group__1692 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SpecObj__Group__2_in_rule__SpecObj__Group__1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SpecObj__Alternatives_1_in_rule__SpecObj__Group__1__Impl722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SpecObj__Group__2__Impl_in_rule__SpecObj__Group__2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SPECOBJECTDELIMITERRIGHT_in_rule__SpecObj__Group__2__Impl779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__0__Impl_in_rule__HeadingSO__Group__0814 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__1_in_rule__HeadingSO__Group__0817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__1__Impl_in_rule__HeadingSO__Group__1875 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__2_in_rule__HeadingSO__Group__1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__HeadingSO__Group__1__Impl905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__2__Impl_in_rule__HeadingSO__Group__2934 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__3_in_rule__HeadingSO__Group__2937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__HeadingSO__Group__2__Impl965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__3__Impl_in_rule__HeadingSO__Group__3996 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__4_in_rule__HeadingSO__Group__3999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__HeadingSO__Group__3__Impl1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__4__Impl_in_rule__HeadingSO__Group__41055 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__5_in_rule__HeadingSO__Group__41058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__HeadingSO__Group__4__Impl1085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__5__Impl_in_rule__HeadingSO__Group__51114 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__6_in_rule__HeadingSO__Group__51117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__IdAssignment_5_in_rule__HeadingSO__Group__5__Impl1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__6__Impl_in_rule__HeadingSO__Group__61174 = new BitSet(new long[]{0x0000000000000240L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__7_in_rule__HeadingSO__Group__61177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__HeadingSO__Group__6__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__7__Impl_in_rule__HeadingSO__Group__71233 = new BitSet(new long[]{0x0000000000000240L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__8_in_rule__HeadingSO__Group__71236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group_7__0_in_rule__HeadingSO__Group__7__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group__8__Impl_in_rule__HeadingSO__Group__81294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__TextAssignment_8_in_rule__HeadingSO__Group__8__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group_7__0__Impl_in_rule__HeadingSO__Group_7__01369 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group_7__1_in_rule__HeadingSO__Group_7__01372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__HeadingSO__Group_7__0__Impl1399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group_7__1__Impl_in_rule__HeadingSO__Group_7__11428 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group_7__2_in_rule__HeadingSO__Group_7__11431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__ParentAssignment_7_1_in_rule__HeadingSO__Group_7__1__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HeadingSO__Group_7__2__Impl_in_rule__HeadingSO__Group_7__21488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__HeadingSO__Group_7__2__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__0__Impl_in_rule__ReqPatSO__Group__01550 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__1_in_rule__ReqPatSO__Group__01553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__1__Impl_in_rule__ReqPatSO__Group__11611 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__2_in_rule__ReqPatSO__Group__11614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__ReqPatSO__Group__1__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__2__Impl_in_rule__ReqPatSO__Group__21670 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__3_in_rule__ReqPatSO__Group__21673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ReqPatSO__Group__2__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__3__Impl_in_rule__ReqPatSO__Group__31732 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__4_in_rule__ReqPatSO__Group__31735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__ReqPatSO__Group__3__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__4__Impl_in_rule__ReqPatSO__Group__41791 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__5_in_rule__ReqPatSO__Group__41794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__ReqPatSO__Group__4__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__5__Impl_in_rule__ReqPatSO__Group__51850 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__6_in_rule__ReqPatSO__Group__51853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__IdAssignment_5_in_rule__ReqPatSO__Group__5__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__6__Impl_in_rule__ReqPatSO__Group__61910 = new BitSet(new long[]{0x0000000000040040L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__7_in_rule__ReqPatSO__Group__61913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__ReqPatSO__Group__6__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__7__Impl_in_rule__ReqPatSO__Group__71969 = new BitSet(new long[]{0x0000000000040040L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__8_in_rule__ReqPatSO__Group__71972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group_7__0_in_rule__ReqPatSO__Group__7__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group__8__Impl_in_rule__ReqPatSO__Group__82030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__RequirementPatternsAssignment_8_in_rule__ReqPatSO__Group__8__Impl2059 = new BitSet(new long[]{0x0000000000040042L});
        public static final BitSet FOLLOW_rule__ReqPatSO__RequirementPatternsAssignment_8_in_rule__ReqPatSO__Group__8__Impl2071 = new BitSet(new long[]{0x0000000000040042L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group_7__0__Impl_in_rule__ReqPatSO__Group_7__02122 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group_7__1_in_rule__ReqPatSO__Group_7__02125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__ReqPatSO__Group_7__0__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group_7__1__Impl_in_rule__ReqPatSO__Group_7__12181 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group_7__2_in_rule__ReqPatSO__Group_7__12184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__ParentAssignment_7_1_in_rule__ReqPatSO__Group_7__1__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReqPatSO__Group_7__2__Impl_in_rule__ReqPatSO__Group_7__22241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__ReqPatSO__Group_7__2__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__0__Impl_in_rule__FreeTextSO__Group__02303 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__1_in_rule__FreeTextSO__Group__02306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__1__Impl_in_rule__FreeTextSO__Group__12364 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__2_in_rule__FreeTextSO__Group__12367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__FreeTextSO__Group__1__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__2__Impl_in_rule__FreeTextSO__Group__22423 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__3_in_rule__FreeTextSO__Group__22426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FreeTextSO__Group__2__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__3__Impl_in_rule__FreeTextSO__Group__32485 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__4_in_rule__FreeTextSO__Group__32488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__FreeTextSO__Group__3__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__4__Impl_in_rule__FreeTextSO__Group__42544 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__5_in_rule__FreeTextSO__Group__42547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__FreeTextSO__Group__4__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__5__Impl_in_rule__FreeTextSO__Group__52603 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__6_in_rule__FreeTextSO__Group__52606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__IdAssignment_5_in_rule__FreeTextSO__Group__5__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__6__Impl_in_rule__FreeTextSO__Group__62663 = new BitSet(new long[]{0x0000000000000240L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__7_in_rule__FreeTextSO__Group__62666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__FreeTextSO__Group__6__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__7__Impl_in_rule__FreeTextSO__Group__72722 = new BitSet(new long[]{0x0000000000000240L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__8_in_rule__FreeTextSO__Group__72725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group_7__0_in_rule__FreeTextSO__Group__7__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group__8__Impl_in_rule__FreeTextSO__Group__82783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__FreeTextAssignment_8_in_rule__FreeTextSO__Group__8__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group_7__0__Impl_in_rule__FreeTextSO__Group_7__02859 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group_7__1_in_rule__FreeTextSO__Group_7__02862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_rule__FreeTextSO__Group_7__0__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group_7__1__Impl_in_rule__FreeTextSO__Group_7__12918 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group_7__2_in_rule__FreeTextSO__Group_7__12921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__ParentAssignment_7_1_in_rule__FreeTextSO__Group_7__1__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreeTextSO__Group_7__2__Impl_in_rule__FreeTextSO__Group_7__22978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_rule__FreeTextSO__Group_7__2__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RequirementPattern__Group__0__Impl_in_rule__RequirementPattern__Group__03040 = new BitSet(new long[]{0x0000000000040040L});
        public static final BitSet FOLLOW_rule__RequirementPattern__Group__1_in_rule__RequirementPattern__Group__03043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RequirementPattern__Group__1__Impl_in_rule__RequirementPattern__Group__13101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RequirementPattern__Group__1__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpecObj_in_rule__Root__SpecObjectsAssignment_13169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HeadingSO__IdAssignment_53200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__HeadingSO__ParentAssignment_7_13231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__HeadingSO__TextAssignment_83262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ReqPatSO__IdAssignment_53293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ReqPatSO__ParentAssignment_7_13324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequirementPattern_in_rule__ReqPatSO__RequirementPatternsAssignment_83355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FreeTextSO__IdAssignment_53386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__FreeTextSO__ParentAssignment_7_13417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__FreeTextSO__FreeTextAssignment_83448 = new BitSet(new long[]{0x0000000000000002L});
    }


}