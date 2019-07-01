package de.fraunhofer.iem.reqpat.demo.ui.contentassist.antlr.internal; 

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
import de.fraunhofer.iem.reqpat.demo.services.ReqPatDemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqPatDemoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPECOBJECTDELIMITERLEFT", "RULE_SPECOBJECTDELIMITERRIGHT", "RULE_PARAMDELIMITERLEFT", "RULE_PARAMDELIMITERRIGHT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'The function'", "'The following information'", "'The top-level function is called'", "'has the following purpose:'", "'The functional device'", "'is a subfunction of the function'", "'is received by the function'", "':'", "'from the functional device'", "','", "'is sent from the function'", "'to the functional device'", "'is used by the function'", "'is created by the function'", "'H'", "'RP'", "'F'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_PARAMDELIMITERRIGHT=7;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_PARAMDELIMITERLEFT=6;
    public static final int RULE_SPECOBJECTDELIMITERLEFT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SPECOBJECTDELIMITERRIGHT=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalReqPatDemoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReqPatDemoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReqPatDemoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReqPatDemo.g"; }


     
     	private ReqPatDemoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ReqPatDemoGrammarAccess grammarAccess) {
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
    // InternalReqPatDemo.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:61:1: ( ruleRoot EOF )
            // InternalReqPatDemo.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalReqPatDemo.g:69:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:73:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalReqPatDemo.g:74:1: ( ( rule__Root__Group__0 ) )
            {
            // InternalReqPatDemo.g:74:1: ( ( rule__Root__Group__0 ) )
            // InternalReqPatDemo.g:75:1: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalReqPatDemo.g:76:1: ( rule__Root__Group__0 )
            // InternalReqPatDemo.g:76:2: rule__Root__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleRequirementPattern"
    // InternalReqPatDemo.g:88:1: entryRuleRequirementPattern : ruleRequirementPattern EOF ;
    public final void entryRuleRequirementPattern() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:89:1: ( ruleRequirementPattern EOF )
            // InternalReqPatDemo.g:90:1: ruleRequirementPattern EOF
            {
             before(grammarAccess.getRequirementPatternRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRequirementPattern();

            state._fsp--;

             after(grammarAccess.getRequirementPatternRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalReqPatDemo.g:97:1: ruleRequirementPattern : ( ( rule__RequirementPattern__Group__0 ) ) ;
    public final void ruleRequirementPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:101:2: ( ( ( rule__RequirementPattern__Group__0 ) ) )
            // InternalReqPatDemo.g:102:1: ( ( rule__RequirementPattern__Group__0 ) )
            {
            // InternalReqPatDemo.g:102:1: ( ( rule__RequirementPattern__Group__0 ) )
            // InternalReqPatDemo.g:103:1: ( rule__RequirementPattern__Group__0 )
            {
             before(grammarAccess.getRequirementPatternAccess().getGroup()); 
            // InternalReqPatDemo.g:104:1: ( rule__RequirementPattern__Group__0 )
            // InternalReqPatDemo.g:104:2: rule__RequirementPattern__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleTheAnalysisFunction"
    // InternalReqPatDemo.g:116:1: entryRuleTheAnalysisFunction : ruleTheAnalysisFunction EOF ;
    public final void entryRuleTheAnalysisFunction() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:117:1: ( ruleTheAnalysisFunction EOF )
            // InternalReqPatDemo.g:118:1: ruleTheAnalysisFunction EOF
            {
             before(grammarAccess.getTheAnalysisFunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTheAnalysisFunction();

            state._fsp--;

             after(grammarAccess.getTheAnalysisFunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTheAnalysisFunction"


    // $ANTLR start "ruleTheAnalysisFunction"
    // InternalReqPatDemo.g:125:1: ruleTheAnalysisFunction : ( ( rule__TheAnalysisFunction__Group__0 ) ) ;
    public final void ruleTheAnalysisFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:129:2: ( ( ( rule__TheAnalysisFunction__Group__0 ) ) )
            // InternalReqPatDemo.g:130:1: ( ( rule__TheAnalysisFunction__Group__0 ) )
            {
            // InternalReqPatDemo.g:130:1: ( ( rule__TheAnalysisFunction__Group__0 ) )
            // InternalReqPatDemo.g:131:1: ( rule__TheAnalysisFunction__Group__0 )
            {
             before(grammarAccess.getTheAnalysisFunctionAccess().getGroup()); 
            // InternalReqPatDemo.g:132:1: ( rule__TheAnalysisFunction__Group__0 )
            // InternalReqPatDemo.g:132:2: rule__TheAnalysisFunction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TheAnalysisFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheAnalysisFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleTheAnalysisFunction"


    // $ANTLR start "entryRuleTheFollowingInformation"
    // InternalReqPatDemo.g:144:1: entryRuleTheFollowingInformation : ruleTheFollowingInformation EOF ;
    public final void entryRuleTheFollowingInformation() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:145:1: ( ruleTheFollowingInformation EOF )
            // InternalReqPatDemo.g:146:1: ruleTheFollowingInformation EOF
            {
             before(grammarAccess.getTheFollowingInformationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTheFollowingInformation();

            state._fsp--;

             after(grammarAccess.getTheFollowingInformationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTheFollowingInformation"


    // $ANTLR start "ruleTheFollowingInformation"
    // InternalReqPatDemo.g:153:1: ruleTheFollowingInformation : ( ( rule__TheFollowingInformation__Group__0 ) ) ;
    public final void ruleTheFollowingInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:157:2: ( ( ( rule__TheFollowingInformation__Group__0 ) ) )
            // InternalReqPatDemo.g:158:1: ( ( rule__TheFollowingInformation__Group__0 ) )
            {
            // InternalReqPatDemo.g:158:1: ( ( rule__TheFollowingInformation__Group__0 ) )
            // InternalReqPatDemo.g:159:1: ( rule__TheFollowingInformation__Group__0 )
            {
             before(grammarAccess.getTheFollowingInformationAccess().getGroup()); 
            // InternalReqPatDemo.g:160:1: ( rule__TheFollowingInformation__Group__0 )
            // InternalReqPatDemo.g:160:2: rule__TheFollowingInformation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TheFollowingInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheFollowingInformationAccess().getGroup()); 

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
    // $ANTLR end "ruleTheFollowingInformation"


    // $ANTLR start "entryRuleAnalysisFunctionDef"
    // InternalReqPatDemo.g:172:1: entryRuleAnalysisFunctionDef : ruleAnalysisFunctionDef EOF ;
    public final void entryRuleAnalysisFunctionDef() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:173:1: ( ruleAnalysisFunctionDef EOF )
            // InternalReqPatDemo.g:174:1: ruleAnalysisFunctionDef EOF
            {
             before(grammarAccess.getAnalysisFunctionDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnalysisFunctionDef();

            state._fsp--;

             after(grammarAccess.getAnalysisFunctionDefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnalysisFunctionDef"


    // $ANTLR start "ruleAnalysisFunctionDef"
    // InternalReqPatDemo.g:181:1: ruleAnalysisFunctionDef : ( ( rule__AnalysisFunctionDef__Group__0 ) ) ;
    public final void ruleAnalysisFunctionDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:185:2: ( ( ( rule__AnalysisFunctionDef__Group__0 ) ) )
            // InternalReqPatDemo.g:186:1: ( ( rule__AnalysisFunctionDef__Group__0 ) )
            {
            // InternalReqPatDemo.g:186:1: ( ( rule__AnalysisFunctionDef__Group__0 ) )
            // InternalReqPatDemo.g:187:1: ( rule__AnalysisFunctionDef__Group__0 )
            {
             before(grammarAccess.getAnalysisFunctionDefAccess().getGroup()); 
            // InternalReqPatDemo.g:188:1: ( rule__AnalysisFunctionDef__Group__0 )
            // InternalReqPatDemo.g:188:2: rule__AnalysisFunctionDef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisFunctionDefAccess().getGroup()); 

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
    // $ANTLR end "ruleAnalysisFunctionDef"


    // $ANTLR start "entryRuleAnalysisFunctionPurp"
    // InternalReqPatDemo.g:200:1: entryRuleAnalysisFunctionPurp : ruleAnalysisFunctionPurp EOF ;
    public final void entryRuleAnalysisFunctionPurp() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:201:1: ( ruleAnalysisFunctionPurp EOF )
            // InternalReqPatDemo.g:202:1: ruleAnalysisFunctionPurp EOF
            {
             before(grammarAccess.getAnalysisFunctionPurpRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnalysisFunctionPurp();

            state._fsp--;

             after(grammarAccess.getAnalysisFunctionPurpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnalysisFunctionPurp"


    // $ANTLR start "ruleAnalysisFunctionPurp"
    // InternalReqPatDemo.g:209:1: ruleAnalysisFunctionPurp : ( ( rule__AnalysisFunctionPurp__Group__0 ) ) ;
    public final void ruleAnalysisFunctionPurp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:213:2: ( ( ( rule__AnalysisFunctionPurp__Group__0 ) ) )
            // InternalReqPatDemo.g:214:1: ( ( rule__AnalysisFunctionPurp__Group__0 ) )
            {
            // InternalReqPatDemo.g:214:1: ( ( rule__AnalysisFunctionPurp__Group__0 ) )
            // InternalReqPatDemo.g:215:1: ( rule__AnalysisFunctionPurp__Group__0 )
            {
             before(grammarAccess.getAnalysisFunctionPurpAccess().getGroup()); 
            // InternalReqPatDemo.g:216:1: ( rule__AnalysisFunctionPurp__Group__0 )
            // InternalReqPatDemo.g:216:2: rule__AnalysisFunctionPurp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionPurp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisFunctionPurpAccess().getGroup()); 

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
    // $ANTLR end "ruleAnalysisFunctionPurp"


    // $ANTLR start "entryRuleFunctionalDeviceDef"
    // InternalReqPatDemo.g:228:1: entryRuleFunctionalDeviceDef : ruleFunctionalDeviceDef EOF ;
    public final void entryRuleFunctionalDeviceDef() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:229:1: ( ruleFunctionalDeviceDef EOF )
            // InternalReqPatDemo.g:230:1: ruleFunctionalDeviceDef EOF
            {
             before(grammarAccess.getFunctionalDeviceDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFunctionalDeviceDef();

            state._fsp--;

             after(grammarAccess.getFunctionalDeviceDefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionalDeviceDef"


    // $ANTLR start "ruleFunctionalDeviceDef"
    // InternalReqPatDemo.g:237:1: ruleFunctionalDeviceDef : ( ( rule__FunctionalDeviceDef__Group__0 ) ) ;
    public final void ruleFunctionalDeviceDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:241:2: ( ( ( rule__FunctionalDeviceDef__Group__0 ) ) )
            // InternalReqPatDemo.g:242:1: ( ( rule__FunctionalDeviceDef__Group__0 ) )
            {
            // InternalReqPatDemo.g:242:1: ( ( rule__FunctionalDeviceDef__Group__0 ) )
            // InternalReqPatDemo.g:243:1: ( rule__FunctionalDeviceDef__Group__0 )
            {
             before(grammarAccess.getFunctionalDeviceDefAccess().getGroup()); 
            // InternalReqPatDemo.g:244:1: ( rule__FunctionalDeviceDef__Group__0 )
            // InternalReqPatDemo.g:244:2: rule__FunctionalDeviceDef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDeviceDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalDeviceDefAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionalDeviceDef"


    // $ANTLR start "entryRuleFunctionalDevice"
    // InternalReqPatDemo.g:256:1: entryRuleFunctionalDevice : ruleFunctionalDevice EOF ;
    public final void entryRuleFunctionalDevice() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:257:1: ( ruleFunctionalDevice EOF )
            // InternalReqPatDemo.g:258:1: ruleFunctionalDevice EOF
            {
             before(grammarAccess.getFunctionalDeviceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFunctionalDevice();

            state._fsp--;

             after(grammarAccess.getFunctionalDeviceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionalDevice"


    // $ANTLR start "ruleFunctionalDevice"
    // InternalReqPatDemo.g:265:1: ruleFunctionalDevice : ( ( rule__FunctionalDevice__Group__0 ) ) ;
    public final void ruleFunctionalDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:269:2: ( ( ( rule__FunctionalDevice__Group__0 ) ) )
            // InternalReqPatDemo.g:270:1: ( ( rule__FunctionalDevice__Group__0 ) )
            {
            // InternalReqPatDemo.g:270:1: ( ( rule__FunctionalDevice__Group__0 ) )
            // InternalReqPatDemo.g:271:1: ( rule__FunctionalDevice__Group__0 )
            {
             before(grammarAccess.getFunctionalDeviceAccess().getGroup()); 
            // InternalReqPatDemo.g:272:1: ( rule__FunctionalDevice__Group__0 )
            // InternalReqPatDemo.g:272:2: rule__FunctionalDevice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDevice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalDeviceAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionalDevice"


    // $ANTLR start "entryRuleSubAnalysisFunctionDef"
    // InternalReqPatDemo.g:284:1: entryRuleSubAnalysisFunctionDef : ruleSubAnalysisFunctionDef EOF ;
    public final void entryRuleSubAnalysisFunctionDef() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:285:1: ( ruleSubAnalysisFunctionDef EOF )
            // InternalReqPatDemo.g:286:1: ruleSubAnalysisFunctionDef EOF
            {
             before(grammarAccess.getSubAnalysisFunctionDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubAnalysisFunctionDef();

            state._fsp--;

             after(grammarAccess.getSubAnalysisFunctionDefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubAnalysisFunctionDef"


    // $ANTLR start "ruleSubAnalysisFunctionDef"
    // InternalReqPatDemo.g:293:1: ruleSubAnalysisFunctionDef : ( ( rule__SubAnalysisFunctionDef__Group__0 ) ) ;
    public final void ruleSubAnalysisFunctionDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:297:2: ( ( ( rule__SubAnalysisFunctionDef__Group__0 ) ) )
            // InternalReqPatDemo.g:298:1: ( ( rule__SubAnalysisFunctionDef__Group__0 ) )
            {
            // InternalReqPatDemo.g:298:1: ( ( rule__SubAnalysisFunctionDef__Group__0 ) )
            // InternalReqPatDemo.g:299:1: ( rule__SubAnalysisFunctionDef__Group__0 )
            {
             before(grammarAccess.getSubAnalysisFunctionDefAccess().getGroup()); 
            // InternalReqPatDemo.g:300:1: ( rule__SubAnalysisFunctionDef__Group__0 )
            // InternalReqPatDemo.g:300:2: rule__SubAnalysisFunctionDef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunctionDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubAnalysisFunctionDefAccess().getGroup()); 

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
    // $ANTLR end "ruleSubAnalysisFunctionDef"


    // $ANTLR start "entryRuleSubAnalysisFunction"
    // InternalReqPatDemo.g:312:1: entryRuleSubAnalysisFunction : ruleSubAnalysisFunction EOF ;
    public final void entryRuleSubAnalysisFunction() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:313:1: ( ruleSubAnalysisFunction EOF )
            // InternalReqPatDemo.g:314:1: ruleSubAnalysisFunction EOF
            {
             before(grammarAccess.getSubAnalysisFunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubAnalysisFunction();

            state._fsp--;

             after(grammarAccess.getSubAnalysisFunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubAnalysisFunction"


    // $ANTLR start "ruleSubAnalysisFunction"
    // InternalReqPatDemo.g:321:1: ruleSubAnalysisFunction : ( ( rule__SubAnalysisFunction__Group__0 ) ) ;
    public final void ruleSubAnalysisFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:325:2: ( ( ( rule__SubAnalysisFunction__Group__0 ) ) )
            // InternalReqPatDemo.g:326:1: ( ( rule__SubAnalysisFunction__Group__0 ) )
            {
            // InternalReqPatDemo.g:326:1: ( ( rule__SubAnalysisFunction__Group__0 ) )
            // InternalReqPatDemo.g:327:1: ( rule__SubAnalysisFunction__Group__0 )
            {
             before(grammarAccess.getSubAnalysisFunctionAccess().getGroup()); 
            // InternalReqPatDemo.g:328:1: ( rule__SubAnalysisFunction__Group__0 )
            // InternalReqPatDemo.g:328:2: rule__SubAnalysisFunction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubAnalysisFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleSubAnalysisFunction"


    // $ANTLR start "entryRuleIncomingInformationDef"
    // InternalReqPatDemo.g:340:1: entryRuleIncomingInformationDef : ruleIncomingInformationDef EOF ;
    public final void entryRuleIncomingInformationDef() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:341:1: ( ruleIncomingInformationDef EOF )
            // InternalReqPatDemo.g:342:1: ruleIncomingInformationDef EOF
            {
             before(grammarAccess.getIncomingInformationDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIncomingInformationDef();

            state._fsp--;

             after(grammarAccess.getIncomingInformationDefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleIncomingInformationDef"


    // $ANTLR start "ruleIncomingInformationDef"
    // InternalReqPatDemo.g:349:1: ruleIncomingInformationDef : ( ( rule__IncomingInformationDef__Group__0 ) ) ;
    public final void ruleIncomingInformationDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:353:2: ( ( ( rule__IncomingInformationDef__Group__0 ) ) )
            // InternalReqPatDemo.g:354:1: ( ( rule__IncomingInformationDef__Group__0 ) )
            {
            // InternalReqPatDemo.g:354:1: ( ( rule__IncomingInformationDef__Group__0 ) )
            // InternalReqPatDemo.g:355:1: ( rule__IncomingInformationDef__Group__0 )
            {
             before(grammarAccess.getIncomingInformationDefAccess().getGroup()); 
            // InternalReqPatDemo.g:356:1: ( rule__IncomingInformationDef__Group__0 )
            // InternalReqPatDemo.g:356:2: rule__IncomingInformationDef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncomingInformationDefAccess().getGroup()); 

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
    // $ANTLR end "ruleIncomingInformationDef"


    // $ANTLR start "entryRuleOutgoingInformationDef"
    // InternalReqPatDemo.g:368:1: entryRuleOutgoingInformationDef : ruleOutgoingInformationDef EOF ;
    public final void entryRuleOutgoingInformationDef() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:369:1: ( ruleOutgoingInformationDef EOF )
            // InternalReqPatDemo.g:370:1: ruleOutgoingInformationDef EOF
            {
             before(grammarAccess.getOutgoingInformationDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOutgoingInformationDef();

            state._fsp--;

             after(grammarAccess.getOutgoingInformationDefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutgoingInformationDef"


    // $ANTLR start "ruleOutgoingInformationDef"
    // InternalReqPatDemo.g:377:1: ruleOutgoingInformationDef : ( ( rule__OutgoingInformationDef__Group__0 ) ) ;
    public final void ruleOutgoingInformationDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:381:2: ( ( ( rule__OutgoingInformationDef__Group__0 ) ) )
            // InternalReqPatDemo.g:382:1: ( ( rule__OutgoingInformationDef__Group__0 ) )
            {
            // InternalReqPatDemo.g:382:1: ( ( rule__OutgoingInformationDef__Group__0 ) )
            // InternalReqPatDemo.g:383:1: ( rule__OutgoingInformationDef__Group__0 )
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getGroup()); 
            // InternalReqPatDemo.g:384:1: ( rule__OutgoingInformationDef__Group__0 )
            // InternalReqPatDemo.g:384:2: rule__OutgoingInformationDef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutgoingInformationDefAccess().getGroup()); 

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
    // $ANTLR end "ruleOutgoingInformationDef"


    // $ANTLR start "entryRuleInformationUsage"
    // InternalReqPatDemo.g:396:1: entryRuleInformationUsage : ruleInformationUsage EOF ;
    public final void entryRuleInformationUsage() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:397:1: ( ruleInformationUsage EOF )
            // InternalReqPatDemo.g:398:1: ruleInformationUsage EOF
            {
             before(grammarAccess.getInformationUsageRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInformationUsage();

            state._fsp--;

             after(grammarAccess.getInformationUsageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInformationUsage"


    // $ANTLR start "ruleInformationUsage"
    // InternalReqPatDemo.g:405:1: ruleInformationUsage : ( ( rule__InformationUsage__Group__0 ) ) ;
    public final void ruleInformationUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:409:2: ( ( ( rule__InformationUsage__Group__0 ) ) )
            // InternalReqPatDemo.g:410:1: ( ( rule__InformationUsage__Group__0 ) )
            {
            // InternalReqPatDemo.g:410:1: ( ( rule__InformationUsage__Group__0 ) )
            // InternalReqPatDemo.g:411:1: ( rule__InformationUsage__Group__0 )
            {
             before(grammarAccess.getInformationUsageAccess().getGroup()); 
            // InternalReqPatDemo.g:412:1: ( rule__InformationUsage__Group__0 )
            // InternalReqPatDemo.g:412:2: rule__InformationUsage__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInformationUsageAccess().getGroup()); 

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
    // $ANTLR end "ruleInformationUsage"


    // $ANTLR start "entryRuleInformationCreation"
    // InternalReqPatDemo.g:424:1: entryRuleInformationCreation : ruleInformationCreation EOF ;
    public final void entryRuleInformationCreation() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:425:1: ( ruleInformationCreation EOF )
            // InternalReqPatDemo.g:426:1: ruleInformationCreation EOF
            {
             before(grammarAccess.getInformationCreationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInformationCreation();

            state._fsp--;

             after(grammarAccess.getInformationCreationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInformationCreation"


    // $ANTLR start "ruleInformationCreation"
    // InternalReqPatDemo.g:433:1: ruleInformationCreation : ( ( rule__InformationCreation__Group__0 ) ) ;
    public final void ruleInformationCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:437:2: ( ( ( rule__InformationCreation__Group__0 ) ) )
            // InternalReqPatDemo.g:438:1: ( ( rule__InformationCreation__Group__0 ) )
            {
            // InternalReqPatDemo.g:438:1: ( ( rule__InformationCreation__Group__0 ) )
            // InternalReqPatDemo.g:439:1: ( rule__InformationCreation__Group__0 )
            {
             before(grammarAccess.getInformationCreationAccess().getGroup()); 
            // InternalReqPatDemo.g:440:1: ( rule__InformationCreation__Group__0 )
            // InternalReqPatDemo.g:440:2: rule__InformationCreation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInformationCreationAccess().getGroup()); 

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
    // $ANTLR end "ruleInformationCreation"


    // $ANTLR start "entryRuleAnalysisFunction"
    // InternalReqPatDemo.g:452:1: entryRuleAnalysisFunction : ruleAnalysisFunction EOF ;
    public final void entryRuleAnalysisFunction() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:453:1: ( ruleAnalysisFunction EOF )
            // InternalReqPatDemo.g:454:1: ruleAnalysisFunction EOF
            {
             before(grammarAccess.getAnalysisFunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnalysisFunction();

            state._fsp--;

             after(grammarAccess.getAnalysisFunctionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnalysisFunction"


    // $ANTLR start "ruleAnalysisFunction"
    // InternalReqPatDemo.g:461:1: ruleAnalysisFunction : ( ( rule__AnalysisFunction__Group__0 ) ) ;
    public final void ruleAnalysisFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:465:2: ( ( ( rule__AnalysisFunction__Group__0 ) ) )
            // InternalReqPatDemo.g:466:1: ( ( rule__AnalysisFunction__Group__0 ) )
            {
            // InternalReqPatDemo.g:466:1: ( ( rule__AnalysisFunction__Group__0 ) )
            // InternalReqPatDemo.g:467:1: ( rule__AnalysisFunction__Group__0 )
            {
             before(grammarAccess.getAnalysisFunctionAccess().getGroup()); 
            // InternalReqPatDemo.g:468:1: ( rule__AnalysisFunction__Group__0 )
            // InternalReqPatDemo.g:468:2: rule__AnalysisFunction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleAnalysisFunction"


    // $ANTLR start "entryRuleInformation"
    // InternalReqPatDemo.g:480:1: entryRuleInformation : ruleInformation EOF ;
    public final void entryRuleInformation() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:481:1: ( ruleInformation EOF )
            // InternalReqPatDemo.g:482:1: ruleInformation EOF
            {
             before(grammarAccess.getInformationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInformation();

            state._fsp--;

             after(grammarAccess.getInformationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInformation"


    // $ANTLR start "ruleInformation"
    // InternalReqPatDemo.g:489:1: ruleInformation : ( ( rule__Information__Group__0 ) ) ;
    public final void ruleInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:493:2: ( ( ( rule__Information__Group__0 ) ) )
            // InternalReqPatDemo.g:494:1: ( ( rule__Information__Group__0 ) )
            {
            // InternalReqPatDemo.g:494:1: ( ( rule__Information__Group__0 ) )
            // InternalReqPatDemo.g:495:1: ( rule__Information__Group__0 )
            {
             before(grammarAccess.getInformationAccess().getGroup()); 
            // InternalReqPatDemo.g:496:1: ( rule__Information__Group__0 )
            // InternalReqPatDemo.g:496:2: rule__Information__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Information__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInformationAccess().getGroup()); 

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
    // $ANTLR end "ruleInformation"


    // $ANTLR start "entryRuleSpecObj"
    // InternalReqPatDemo.g:508:1: entryRuleSpecObj : ruleSpecObj EOF ;
    public final void entryRuleSpecObj() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:509:1: ( ruleSpecObj EOF )
            // InternalReqPatDemo.g:510:1: ruleSpecObj EOF
            {
             before(grammarAccess.getSpecObjRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSpecObj();

            state._fsp--;

             after(grammarAccess.getSpecObjRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalReqPatDemo.g:517:1: ruleSpecObj : ( ( rule__SpecObj__Group__0 ) ) ;
    public final void ruleSpecObj() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:521:2: ( ( ( rule__SpecObj__Group__0 ) ) )
            // InternalReqPatDemo.g:522:1: ( ( rule__SpecObj__Group__0 ) )
            {
            // InternalReqPatDemo.g:522:1: ( ( rule__SpecObj__Group__0 ) )
            // InternalReqPatDemo.g:523:1: ( rule__SpecObj__Group__0 )
            {
             before(grammarAccess.getSpecObjAccess().getGroup()); 
            // InternalReqPatDemo.g:524:1: ( rule__SpecObj__Group__0 )
            // InternalReqPatDemo.g:524:2: rule__SpecObj__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:536:1: entryRuleHeadingSO : ruleHeadingSO EOF ;
    public final void entryRuleHeadingSO() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:537:1: ( ruleHeadingSO EOF )
            // InternalReqPatDemo.g:538:1: ruleHeadingSO EOF
            {
             before(grammarAccess.getHeadingSORule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleHeadingSO();

            state._fsp--;

             after(grammarAccess.getHeadingSORule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalReqPatDemo.g:545:1: ruleHeadingSO : ( ( rule__HeadingSO__Group__0 ) ) ;
    public final void ruleHeadingSO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:549:2: ( ( ( rule__HeadingSO__Group__0 ) ) )
            // InternalReqPatDemo.g:550:1: ( ( rule__HeadingSO__Group__0 ) )
            {
            // InternalReqPatDemo.g:550:1: ( ( rule__HeadingSO__Group__0 ) )
            // InternalReqPatDemo.g:551:1: ( rule__HeadingSO__Group__0 )
            {
             before(grammarAccess.getHeadingSOAccess().getGroup()); 
            // InternalReqPatDemo.g:552:1: ( rule__HeadingSO__Group__0 )
            // InternalReqPatDemo.g:552:2: rule__HeadingSO__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:564:1: entryRuleReqPatSO : ruleReqPatSO EOF ;
    public final void entryRuleReqPatSO() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:565:1: ( ruleReqPatSO EOF )
            // InternalReqPatDemo.g:566:1: ruleReqPatSO EOF
            {
             before(grammarAccess.getReqPatSORule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReqPatSO();

            state._fsp--;

             after(grammarAccess.getReqPatSORule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalReqPatDemo.g:573:1: ruleReqPatSO : ( ( rule__ReqPatSO__Group__0 ) ) ;
    public final void ruleReqPatSO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:577:2: ( ( ( rule__ReqPatSO__Group__0 ) ) )
            // InternalReqPatDemo.g:578:1: ( ( rule__ReqPatSO__Group__0 ) )
            {
            // InternalReqPatDemo.g:578:1: ( ( rule__ReqPatSO__Group__0 ) )
            // InternalReqPatDemo.g:579:1: ( rule__ReqPatSO__Group__0 )
            {
             before(grammarAccess.getReqPatSOAccess().getGroup()); 
            // InternalReqPatDemo.g:580:1: ( rule__ReqPatSO__Group__0 )
            // InternalReqPatDemo.g:580:2: rule__ReqPatSO__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:592:1: entryRuleFreeTextSO : ruleFreeTextSO EOF ;
    public final void entryRuleFreeTextSO() throws RecognitionException {
        try {
            // InternalReqPatDemo.g:593:1: ( ruleFreeTextSO EOF )
            // InternalReqPatDemo.g:594:1: ruleFreeTextSO EOF
            {
             before(grammarAccess.getFreeTextSORule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFreeTextSO();

            state._fsp--;

             after(grammarAccess.getFreeTextSORule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalReqPatDemo.g:601:1: ruleFreeTextSO : ( ( rule__FreeTextSO__Group__0 ) ) ;
    public final void ruleFreeTextSO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:605:2: ( ( ( rule__FreeTextSO__Group__0 ) ) )
            // InternalReqPatDemo.g:606:1: ( ( rule__FreeTextSO__Group__0 ) )
            {
            // InternalReqPatDemo.g:606:1: ( ( rule__FreeTextSO__Group__0 ) )
            // InternalReqPatDemo.g:607:1: ( rule__FreeTextSO__Group__0 )
            {
             before(grammarAccess.getFreeTextSOAccess().getGroup()); 
            // InternalReqPatDemo.g:608:1: ( rule__FreeTextSO__Group__0 )
            // InternalReqPatDemo.g:608:2: rule__FreeTextSO__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__RequirementPattern__Alternatives_0"
    // InternalReqPatDemo.g:620:1: rule__RequirementPattern__Alternatives_0 : ( ( ruleAnalysisFunctionDef ) | ( ruleTheAnalysisFunction ) | ( ruleFunctionalDeviceDef ) | ( ruleTheFollowingInformation ) );
    public final void rule__RequirementPattern__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:624:1: ( ( ruleAnalysisFunctionDef ) | ( ruleTheAnalysisFunction ) | ( ruleFunctionalDeviceDef ) | ( ruleTheFollowingInformation ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalReqPatDemo.g:625:1: ( ruleAnalysisFunctionDef )
                    {
                    // InternalReqPatDemo.g:625:1: ( ruleAnalysisFunctionDef )
                    // InternalReqPatDemo.g:626:1: ruleAnalysisFunctionDef
                    {
                     before(grammarAccess.getRequirementPatternAccess().getAnalysisFunctionDefParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAnalysisFunctionDef();

                    state._fsp--;

                     after(grammarAccess.getRequirementPatternAccess().getAnalysisFunctionDefParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqPatDemo.g:631:6: ( ruleTheAnalysisFunction )
                    {
                    // InternalReqPatDemo.g:631:6: ( ruleTheAnalysisFunction )
                    // InternalReqPatDemo.g:632:1: ruleTheAnalysisFunction
                    {
                     before(grammarAccess.getRequirementPatternAccess().getTheAnalysisFunctionParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTheAnalysisFunction();

                    state._fsp--;

                     after(grammarAccess.getRequirementPatternAccess().getTheAnalysisFunctionParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqPatDemo.g:637:6: ( ruleFunctionalDeviceDef )
                    {
                    // InternalReqPatDemo.g:637:6: ( ruleFunctionalDeviceDef )
                    // InternalReqPatDemo.g:638:1: ruleFunctionalDeviceDef
                    {
                     before(grammarAccess.getRequirementPatternAccess().getFunctionalDeviceDefParserRuleCall_0_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFunctionalDeviceDef();

                    state._fsp--;

                     after(grammarAccess.getRequirementPatternAccess().getFunctionalDeviceDefParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReqPatDemo.g:643:6: ( ruleTheFollowingInformation )
                    {
                    // InternalReqPatDemo.g:643:6: ( ruleTheFollowingInformation )
                    // InternalReqPatDemo.g:644:1: ruleTheFollowingInformation
                    {
                     before(grammarAccess.getRequirementPatternAccess().getTheFollowingInformationParserRuleCall_0_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTheFollowingInformation();

                    state._fsp--;

                     after(grammarAccess.getRequirementPatternAccess().getTheFollowingInformationParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__RequirementPattern__Alternatives_0"


    // $ANTLR start "rule__TheAnalysisFunction__Alternatives_1"
    // InternalReqPatDemo.g:654:1: rule__TheAnalysisFunction__Alternatives_1 : ( ( ruleSubAnalysisFunctionDef ) | ( ruleAnalysisFunctionPurp ) );
    public final void rule__TheAnalysisFunction__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:658:1: ( ( ruleSubAnalysisFunctionDef ) | ( ruleAnalysisFunctionPurp ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
                    alt2=1;
                }
                else if ( (LA2_1==19) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalReqPatDemo.g:659:1: ( ruleSubAnalysisFunctionDef )
                    {
                    // InternalReqPatDemo.g:659:1: ( ruleSubAnalysisFunctionDef )
                    // InternalReqPatDemo.g:660:1: ruleSubAnalysisFunctionDef
                    {
                     before(grammarAccess.getTheAnalysisFunctionAccess().getSubAnalysisFunctionDefParserRuleCall_1_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSubAnalysisFunctionDef();

                    state._fsp--;

                     after(grammarAccess.getTheAnalysisFunctionAccess().getSubAnalysisFunctionDefParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqPatDemo.g:665:6: ( ruleAnalysisFunctionPurp )
                    {
                    // InternalReqPatDemo.g:665:6: ( ruleAnalysisFunctionPurp )
                    // InternalReqPatDemo.g:666:1: ruleAnalysisFunctionPurp
                    {
                     before(grammarAccess.getTheAnalysisFunctionAccess().getAnalysisFunctionPurpParserRuleCall_1_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAnalysisFunctionPurp();

                    state._fsp--;

                     after(grammarAccess.getTheAnalysisFunctionAccess().getAnalysisFunctionPurpParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__TheAnalysisFunction__Alternatives_1"


    // $ANTLR start "rule__TheFollowingInformation__Alternatives_1"
    // InternalReqPatDemo.g:676:1: rule__TheFollowingInformation__Alternatives_1 : ( ( ruleIncomingInformationDef ) | ( ruleOutgoingInformationDef ) | ( ruleInformationUsage ) | ( ruleInformationCreation ) );
    public final void rule__TheFollowingInformation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:680:1: ( ( ruleIncomingInformationDef ) | ( ruleOutgoingInformationDef ) | ( ruleInformationUsage ) | ( ruleInformationCreation ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalReqPatDemo.g:681:1: ( ruleIncomingInformationDef )
                    {
                    // InternalReqPatDemo.g:681:1: ( ruleIncomingInformationDef )
                    // InternalReqPatDemo.g:682:1: ruleIncomingInformationDef
                    {
                     before(grammarAccess.getTheFollowingInformationAccess().getIncomingInformationDefParserRuleCall_1_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIncomingInformationDef();

                    state._fsp--;

                     after(grammarAccess.getTheFollowingInformationAccess().getIncomingInformationDefParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqPatDemo.g:687:6: ( ruleOutgoingInformationDef )
                    {
                    // InternalReqPatDemo.g:687:6: ( ruleOutgoingInformationDef )
                    // InternalReqPatDemo.g:688:1: ruleOutgoingInformationDef
                    {
                     before(grammarAccess.getTheFollowingInformationAccess().getOutgoingInformationDefParserRuleCall_1_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOutgoingInformationDef();

                    state._fsp--;

                     after(grammarAccess.getTheFollowingInformationAccess().getOutgoingInformationDefParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqPatDemo.g:693:6: ( ruleInformationUsage )
                    {
                    // InternalReqPatDemo.g:693:6: ( ruleInformationUsage )
                    // InternalReqPatDemo.g:694:1: ruleInformationUsage
                    {
                     before(grammarAccess.getTheFollowingInformationAccess().getInformationUsageParserRuleCall_1_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInformationUsage();

                    state._fsp--;

                     after(grammarAccess.getTheFollowingInformationAccess().getInformationUsageParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReqPatDemo.g:699:6: ( ruleInformationCreation )
                    {
                    // InternalReqPatDemo.g:699:6: ( ruleInformationCreation )
                    // InternalReqPatDemo.g:700:1: ruleInformationCreation
                    {
                     before(grammarAccess.getTheFollowingInformationAccess().getInformationCreationParserRuleCall_1_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInformationCreation();

                    state._fsp--;

                     after(grammarAccess.getTheFollowingInformationAccess().getInformationCreationParserRuleCall_1_3()); 

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
    // $ANTLR end "rule__TheFollowingInformation__Alternatives_1"


    // $ANTLR start "rule__SpecObj__Alternatives_1"
    // InternalReqPatDemo.g:710:1: rule__SpecObj__Alternatives_1 : ( ( ruleHeadingSO ) | ( ruleReqPatSO ) | ( ruleFreeTextSO ) );
    public final void rule__SpecObj__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:714:1: ( ( ruleHeadingSO ) | ( ruleReqPatSO ) | ( ruleFreeTextSO ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_PARAMDELIMITERLEFT) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt4=3;
                    }
                    break;
                case 31:
                    {
                    alt4=2;
                    }
                    break;
                case 30:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqPatDemo.g:715:1: ( ruleHeadingSO )
                    {
                    // InternalReqPatDemo.g:715:1: ( ruleHeadingSO )
                    // InternalReqPatDemo.g:716:1: ruleHeadingSO
                    {
                     before(grammarAccess.getSpecObjAccess().getHeadingSOParserRuleCall_1_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleHeadingSO();

                    state._fsp--;

                     after(grammarAccess.getSpecObjAccess().getHeadingSOParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqPatDemo.g:721:6: ( ruleReqPatSO )
                    {
                    // InternalReqPatDemo.g:721:6: ( ruleReqPatSO )
                    // InternalReqPatDemo.g:722:1: ruleReqPatSO
                    {
                     before(grammarAccess.getSpecObjAccess().getReqPatSOParserRuleCall_1_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReqPatSO();

                    state._fsp--;

                     after(grammarAccess.getSpecObjAccess().getReqPatSOParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqPatDemo.g:727:6: ( ruleFreeTextSO )
                    {
                    // InternalReqPatDemo.g:727:6: ( ruleFreeTextSO )
                    // InternalReqPatDemo.g:728:1: ruleFreeTextSO
                    {
                     before(grammarAccess.getSpecObjAccess().getFreeTextSOParserRuleCall_1_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:740:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:744:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalReqPatDemo.g:745:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:752:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:756:1: ( ( () ) )
            // InternalReqPatDemo.g:757:1: ( () )
            {
            // InternalReqPatDemo.g:757:1: ( () )
            // InternalReqPatDemo.g:758:1: ()
            {
             before(grammarAccess.getRootAccess().getSpecificationAction_0()); 
            // InternalReqPatDemo.g:759:1: ()
            // InternalReqPatDemo.g:761:1: 
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
    // InternalReqPatDemo.g:771:1: rule__Root__Group__1 : rule__Root__Group__1__Impl ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:775:1: ( rule__Root__Group__1__Impl )
            // InternalReqPatDemo.g:776:2: rule__Root__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:782:1: rule__Root__Group__1__Impl : ( ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:786:1: ( ( ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* ) ) )
            // InternalReqPatDemo.g:787:1: ( ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* ) )
            {
            // InternalReqPatDemo.g:787:1: ( ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* ) )
            // InternalReqPatDemo.g:788:1: ( ( rule__Root__SpecObjectsAssignment_1 ) ) ( ( rule__Root__SpecObjectsAssignment_1 )* )
            {
            // InternalReqPatDemo.g:788:1: ( ( rule__Root__SpecObjectsAssignment_1 ) )
            // InternalReqPatDemo.g:789:1: ( rule__Root__SpecObjectsAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getSpecObjectsAssignment_1()); 
            // InternalReqPatDemo.g:790:1: ( rule__Root__SpecObjectsAssignment_1 )
            // InternalReqPatDemo.g:790:2: rule__Root__SpecObjectsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Root__SpecObjectsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getSpecObjectsAssignment_1()); 

            }

            // InternalReqPatDemo.g:793:1: ( ( rule__Root__SpecObjectsAssignment_1 )* )
            // InternalReqPatDemo.g:794:1: ( rule__Root__SpecObjectsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getSpecObjectsAssignment_1()); 
            // InternalReqPatDemo.g:795:1: ( rule__Root__SpecObjectsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_SPECOBJECTDELIMITERLEFT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalReqPatDemo.g:795:2: rule__Root__SpecObjectsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__Root__SpecObjectsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "rule__RequirementPattern__Group__0"
    // InternalReqPatDemo.g:810:1: rule__RequirementPattern__Group__0 : rule__RequirementPattern__Group__0__Impl rule__RequirementPattern__Group__1 ;
    public final void rule__RequirementPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:814:1: ( rule__RequirementPattern__Group__0__Impl rule__RequirementPattern__Group__1 )
            // InternalReqPatDemo.g:815:2: rule__RequirementPattern__Group__0__Impl rule__RequirementPattern__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__RequirementPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:822:1: rule__RequirementPattern__Group__0__Impl : ( ( rule__RequirementPattern__Alternatives_0 ) ) ;
    public final void rule__RequirementPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:826:1: ( ( ( rule__RequirementPattern__Alternatives_0 ) ) )
            // InternalReqPatDemo.g:827:1: ( ( rule__RequirementPattern__Alternatives_0 ) )
            {
            // InternalReqPatDemo.g:827:1: ( ( rule__RequirementPattern__Alternatives_0 ) )
            // InternalReqPatDemo.g:828:1: ( rule__RequirementPattern__Alternatives_0 )
            {
             before(grammarAccess.getRequirementPatternAccess().getAlternatives_0()); 
            // InternalReqPatDemo.g:829:1: ( rule__RequirementPattern__Alternatives_0 )
            // InternalReqPatDemo.g:829:2: rule__RequirementPattern__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RequirementPattern__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementPatternAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__RequirementPattern__Group__0__Impl"


    // $ANTLR start "rule__RequirementPattern__Group__1"
    // InternalReqPatDemo.g:839:1: rule__RequirementPattern__Group__1 : rule__RequirementPattern__Group__1__Impl ;
    public final void rule__RequirementPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:843:1: ( rule__RequirementPattern__Group__1__Impl )
            // InternalReqPatDemo.g:844:2: rule__RequirementPattern__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:850:1: rule__RequirementPattern__Group__1__Impl : ( ( '.' )? ) ;
    public final void rule__RequirementPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:854:1: ( ( ( '.' )? ) )
            // InternalReqPatDemo.g:855:1: ( ( '.' )? )
            {
            // InternalReqPatDemo.g:855:1: ( ( '.' )? )
            // InternalReqPatDemo.g:856:1: ( '.' )?
            {
             before(grammarAccess.getRequirementPatternAccess().getFullStopKeyword_1()); 
            // InternalReqPatDemo.g:857:1: ( '.' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqPatDemo.g:858:2: '.'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRequirementPatternAccess().getFullStopKeyword_1()); 

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


    // $ANTLR start "rule__TheAnalysisFunction__Group__0"
    // InternalReqPatDemo.g:873:1: rule__TheAnalysisFunction__Group__0 : rule__TheAnalysisFunction__Group__0__Impl rule__TheAnalysisFunction__Group__1 ;
    public final void rule__TheAnalysisFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:877:1: ( rule__TheAnalysisFunction__Group__0__Impl rule__TheAnalysisFunction__Group__1 )
            // InternalReqPatDemo.g:878:2: rule__TheAnalysisFunction__Group__0__Impl rule__TheAnalysisFunction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__TheAnalysisFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TheAnalysisFunction__Group__1();

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
    // $ANTLR end "rule__TheAnalysisFunction__Group__0"


    // $ANTLR start "rule__TheAnalysisFunction__Group__0__Impl"
    // InternalReqPatDemo.g:885:1: rule__TheAnalysisFunction__Group__0__Impl : ( 'The function' ) ;
    public final void rule__TheAnalysisFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:889:1: ( ( 'The function' ) )
            // InternalReqPatDemo.g:890:1: ( 'The function' )
            {
            // InternalReqPatDemo.g:890:1: ( 'The function' )
            // InternalReqPatDemo.g:891:1: 'The function'
            {
             before(grammarAccess.getTheAnalysisFunctionAccess().getTheFunctionKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTheAnalysisFunctionAccess().getTheFunctionKeyword_0()); 

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
    // $ANTLR end "rule__TheAnalysisFunction__Group__0__Impl"


    // $ANTLR start "rule__TheAnalysisFunction__Group__1"
    // InternalReqPatDemo.g:904:1: rule__TheAnalysisFunction__Group__1 : rule__TheAnalysisFunction__Group__1__Impl ;
    public final void rule__TheAnalysisFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:908:1: ( rule__TheAnalysisFunction__Group__1__Impl )
            // InternalReqPatDemo.g:909:2: rule__TheAnalysisFunction__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TheAnalysisFunction__Group__1__Impl();

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
    // $ANTLR end "rule__TheAnalysisFunction__Group__1"


    // $ANTLR start "rule__TheAnalysisFunction__Group__1__Impl"
    // InternalReqPatDemo.g:915:1: rule__TheAnalysisFunction__Group__1__Impl : ( ( rule__TheAnalysisFunction__Alternatives_1 ) ) ;
    public final void rule__TheAnalysisFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:919:1: ( ( ( rule__TheAnalysisFunction__Alternatives_1 ) ) )
            // InternalReqPatDemo.g:920:1: ( ( rule__TheAnalysisFunction__Alternatives_1 ) )
            {
            // InternalReqPatDemo.g:920:1: ( ( rule__TheAnalysisFunction__Alternatives_1 ) )
            // InternalReqPatDemo.g:921:1: ( rule__TheAnalysisFunction__Alternatives_1 )
            {
             before(grammarAccess.getTheAnalysisFunctionAccess().getAlternatives_1()); 
            // InternalReqPatDemo.g:922:1: ( rule__TheAnalysisFunction__Alternatives_1 )
            // InternalReqPatDemo.g:922:2: rule__TheAnalysisFunction__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TheAnalysisFunction__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTheAnalysisFunctionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__TheAnalysisFunction__Group__1__Impl"


    // $ANTLR start "rule__TheFollowingInformation__Group__0"
    // InternalReqPatDemo.g:936:1: rule__TheFollowingInformation__Group__0 : rule__TheFollowingInformation__Group__0__Impl rule__TheFollowingInformation__Group__1 ;
    public final void rule__TheFollowingInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:940:1: ( rule__TheFollowingInformation__Group__0__Impl rule__TheFollowingInformation__Group__1 )
            // InternalReqPatDemo.g:941:2: rule__TheFollowingInformation__Group__0__Impl rule__TheFollowingInformation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TheFollowingInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TheFollowingInformation__Group__1();

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
    // $ANTLR end "rule__TheFollowingInformation__Group__0"


    // $ANTLR start "rule__TheFollowingInformation__Group__0__Impl"
    // InternalReqPatDemo.g:948:1: rule__TheFollowingInformation__Group__0__Impl : ( 'The following information' ) ;
    public final void rule__TheFollowingInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:952:1: ( ( 'The following information' ) )
            // InternalReqPatDemo.g:953:1: ( 'The following information' )
            {
            // InternalReqPatDemo.g:953:1: ( 'The following information' )
            // InternalReqPatDemo.g:954:1: 'The following information'
            {
             before(grammarAccess.getTheFollowingInformationAccess().getTheFollowingInformationKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTheFollowingInformationAccess().getTheFollowingInformationKeyword_0()); 

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
    // $ANTLR end "rule__TheFollowingInformation__Group__0__Impl"


    // $ANTLR start "rule__TheFollowingInformation__Group__1"
    // InternalReqPatDemo.g:967:1: rule__TheFollowingInformation__Group__1 : rule__TheFollowingInformation__Group__1__Impl ;
    public final void rule__TheFollowingInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:971:1: ( rule__TheFollowingInformation__Group__1__Impl )
            // InternalReqPatDemo.g:972:2: rule__TheFollowingInformation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TheFollowingInformation__Group__1__Impl();

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
    // $ANTLR end "rule__TheFollowingInformation__Group__1"


    // $ANTLR start "rule__TheFollowingInformation__Group__1__Impl"
    // InternalReqPatDemo.g:978:1: rule__TheFollowingInformation__Group__1__Impl : ( ( rule__TheFollowingInformation__Alternatives_1 ) ) ;
    public final void rule__TheFollowingInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:982:1: ( ( ( rule__TheFollowingInformation__Alternatives_1 ) ) )
            // InternalReqPatDemo.g:983:1: ( ( rule__TheFollowingInformation__Alternatives_1 ) )
            {
            // InternalReqPatDemo.g:983:1: ( ( rule__TheFollowingInformation__Alternatives_1 ) )
            // InternalReqPatDemo.g:984:1: ( rule__TheFollowingInformation__Alternatives_1 )
            {
             before(grammarAccess.getTheFollowingInformationAccess().getAlternatives_1()); 
            // InternalReqPatDemo.g:985:1: ( rule__TheFollowingInformation__Alternatives_1 )
            // InternalReqPatDemo.g:985:2: rule__TheFollowingInformation__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TheFollowingInformation__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTheFollowingInformationAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__TheFollowingInformation__Group__1__Impl"


    // $ANTLR start "rule__AnalysisFunctionDef__Group__0"
    // InternalReqPatDemo.g:999:1: rule__AnalysisFunctionDef__Group__0 : rule__AnalysisFunctionDef__Group__0__Impl rule__AnalysisFunctionDef__Group__1 ;
    public final void rule__AnalysisFunctionDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1003:1: ( rule__AnalysisFunctionDef__Group__0__Impl rule__AnalysisFunctionDef__Group__1 )
            // InternalReqPatDemo.g:1004:2: rule__AnalysisFunctionDef__Group__0__Impl rule__AnalysisFunctionDef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__AnalysisFunctionDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionDef__Group__1();

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
    // $ANTLR end "rule__AnalysisFunctionDef__Group__0"


    // $ANTLR start "rule__AnalysisFunctionDef__Group__0__Impl"
    // InternalReqPatDemo.g:1011:1: rule__AnalysisFunctionDef__Group__0__Impl : ( () ) ;
    public final void rule__AnalysisFunctionDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1015:1: ( ( () ) )
            // InternalReqPatDemo.g:1016:1: ( () )
            {
            // InternalReqPatDemo.g:1016:1: ( () )
            // InternalReqPatDemo.g:1017:1: ()
            {
             before(grammarAccess.getAnalysisFunctionDefAccess().getAnalysisFunctionDefinitionAction_0()); 
            // InternalReqPatDemo.g:1018:1: ()
            // InternalReqPatDemo.g:1020:1: 
            {
            }

             after(grammarAccess.getAnalysisFunctionDefAccess().getAnalysisFunctionDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalysisFunctionDef__Group__0__Impl"


    // $ANTLR start "rule__AnalysisFunctionDef__Group__1"
    // InternalReqPatDemo.g:1030:1: rule__AnalysisFunctionDef__Group__1 : rule__AnalysisFunctionDef__Group__1__Impl rule__AnalysisFunctionDef__Group__2 ;
    public final void rule__AnalysisFunctionDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1034:1: ( rule__AnalysisFunctionDef__Group__1__Impl rule__AnalysisFunctionDef__Group__2 )
            // InternalReqPatDemo.g:1035:2: rule__AnalysisFunctionDef__Group__1__Impl rule__AnalysisFunctionDef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AnalysisFunctionDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionDef__Group__2();

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
    // $ANTLR end "rule__AnalysisFunctionDef__Group__1"


    // $ANTLR start "rule__AnalysisFunctionDef__Group__1__Impl"
    // InternalReqPatDemo.g:1042:1: rule__AnalysisFunctionDef__Group__1__Impl : ( 'The top-level function is called' ) ;
    public final void rule__AnalysisFunctionDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1046:1: ( ( 'The top-level function is called' ) )
            // InternalReqPatDemo.g:1047:1: ( 'The top-level function is called' )
            {
            // InternalReqPatDemo.g:1047:1: ( 'The top-level function is called' )
            // InternalReqPatDemo.g:1048:1: 'The top-level function is called'
            {
             before(grammarAccess.getAnalysisFunctionDefAccess().getTheTopLevelFunctionIsCalledKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAnalysisFunctionDefAccess().getTheTopLevelFunctionIsCalledKeyword_1()); 

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
    // $ANTLR end "rule__AnalysisFunctionDef__Group__1__Impl"


    // $ANTLR start "rule__AnalysisFunctionDef__Group__2"
    // InternalReqPatDemo.g:1061:1: rule__AnalysisFunctionDef__Group__2 : rule__AnalysisFunctionDef__Group__2__Impl ;
    public final void rule__AnalysisFunctionDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1065:1: ( rule__AnalysisFunctionDef__Group__2__Impl )
            // InternalReqPatDemo.g:1066:2: rule__AnalysisFunctionDef__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionDef__Group__2__Impl();

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
    // $ANTLR end "rule__AnalysisFunctionDef__Group__2"


    // $ANTLR start "rule__AnalysisFunctionDef__Group__2__Impl"
    // InternalReqPatDemo.g:1072:1: rule__AnalysisFunctionDef__Group__2__Impl : ( ( rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2 ) ) ;
    public final void rule__AnalysisFunctionDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1076:1: ( ( ( rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2 ) ) )
            // InternalReqPatDemo.g:1077:1: ( ( rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2 ) )
            {
            // InternalReqPatDemo.g:1077:1: ( ( rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2 ) )
            // InternalReqPatDemo.g:1078:1: ( rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2 )
            {
             before(grammarAccess.getAnalysisFunctionDefAccess().getAnalysisFunctionAssignment_2()); 
            // InternalReqPatDemo.g:1079:1: ( rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2 )
            // InternalReqPatDemo.g:1079:2: rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisFunctionDefAccess().getAnalysisFunctionAssignment_2()); 

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
    // $ANTLR end "rule__AnalysisFunctionDef__Group__2__Impl"


    // $ANTLR start "rule__AnalysisFunctionPurp__Group__0"
    // InternalReqPatDemo.g:1095:1: rule__AnalysisFunctionPurp__Group__0 : rule__AnalysisFunctionPurp__Group__0__Impl rule__AnalysisFunctionPurp__Group__1 ;
    public final void rule__AnalysisFunctionPurp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1099:1: ( rule__AnalysisFunctionPurp__Group__0__Impl rule__AnalysisFunctionPurp__Group__1 )
            // InternalReqPatDemo.g:1100:2: rule__AnalysisFunctionPurp__Group__0__Impl rule__AnalysisFunctionPurp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AnalysisFunctionPurp__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionPurp__Group__1();

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
    // $ANTLR end "rule__AnalysisFunctionPurp__Group__0"


    // $ANTLR start "rule__AnalysisFunctionPurp__Group__0__Impl"
    // InternalReqPatDemo.g:1107:1: rule__AnalysisFunctionPurp__Group__0__Impl : ( () ) ;
    public final void rule__AnalysisFunctionPurp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1111:1: ( ( () ) )
            // InternalReqPatDemo.g:1112:1: ( () )
            {
            // InternalReqPatDemo.g:1112:1: ( () )
            // InternalReqPatDemo.g:1113:1: ()
            {
             before(grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionPurposeAction_0()); 
            // InternalReqPatDemo.g:1114:1: ()
            // InternalReqPatDemo.g:1116:1: 
            {
            }

             after(grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionPurposeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalysisFunctionPurp__Group__0__Impl"


    // $ANTLR start "rule__AnalysisFunctionPurp__Group__1"
    // InternalReqPatDemo.g:1126:1: rule__AnalysisFunctionPurp__Group__1 : rule__AnalysisFunctionPurp__Group__1__Impl rule__AnalysisFunctionPurp__Group__2 ;
    public final void rule__AnalysisFunctionPurp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1130:1: ( rule__AnalysisFunctionPurp__Group__1__Impl rule__AnalysisFunctionPurp__Group__2 )
            // InternalReqPatDemo.g:1131:2: rule__AnalysisFunctionPurp__Group__1__Impl rule__AnalysisFunctionPurp__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__AnalysisFunctionPurp__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionPurp__Group__2();

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
    // $ANTLR end "rule__AnalysisFunctionPurp__Group__1"


    // $ANTLR start "rule__AnalysisFunctionPurp__Group__1__Impl"
    // InternalReqPatDemo.g:1138:1: rule__AnalysisFunctionPurp__Group__1__Impl : ( ( rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1 ) ) ;
    public final void rule__AnalysisFunctionPurp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1142:1: ( ( ( rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1 ) ) )
            // InternalReqPatDemo.g:1143:1: ( ( rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1 ) )
            {
            // InternalReqPatDemo.g:1143:1: ( ( rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1 ) )
            // InternalReqPatDemo.g:1144:1: ( rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1 )
            {
             before(grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionAssignment_1()); 
            // InternalReqPatDemo.g:1145:1: ( rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1 )
            // InternalReqPatDemo.g:1145:2: rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionAssignment_1()); 

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
    // $ANTLR end "rule__AnalysisFunctionPurp__Group__1__Impl"


    // $ANTLR start "rule__AnalysisFunctionPurp__Group__2"
    // InternalReqPatDemo.g:1155:1: rule__AnalysisFunctionPurp__Group__2 : rule__AnalysisFunctionPurp__Group__2__Impl rule__AnalysisFunctionPurp__Group__3 ;
    public final void rule__AnalysisFunctionPurp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1159:1: ( rule__AnalysisFunctionPurp__Group__2__Impl rule__AnalysisFunctionPurp__Group__3 )
            // InternalReqPatDemo.g:1160:2: rule__AnalysisFunctionPurp__Group__2__Impl rule__AnalysisFunctionPurp__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__AnalysisFunctionPurp__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionPurp__Group__3();

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
    // $ANTLR end "rule__AnalysisFunctionPurp__Group__2"


    // $ANTLR start "rule__AnalysisFunctionPurp__Group__2__Impl"
    // InternalReqPatDemo.g:1167:1: rule__AnalysisFunctionPurp__Group__2__Impl : ( 'has the following purpose:' ) ;
    public final void rule__AnalysisFunctionPurp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1171:1: ( ( 'has the following purpose:' ) )
            // InternalReqPatDemo.g:1172:1: ( 'has the following purpose:' )
            {
            // InternalReqPatDemo.g:1172:1: ( 'has the following purpose:' )
            // InternalReqPatDemo.g:1173:1: 'has the following purpose:'
            {
             before(grammarAccess.getAnalysisFunctionPurpAccess().getHasTheFollowingPurposeKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAnalysisFunctionPurpAccess().getHasTheFollowingPurposeKeyword_2()); 

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
    // $ANTLR end "rule__AnalysisFunctionPurp__Group__2__Impl"


    // $ANTLR start "rule__AnalysisFunctionPurp__Group__3"
    // InternalReqPatDemo.g:1186:1: rule__AnalysisFunctionPurp__Group__3 : rule__AnalysisFunctionPurp__Group__3__Impl ;
    public final void rule__AnalysisFunctionPurp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1190:1: ( rule__AnalysisFunctionPurp__Group__3__Impl )
            // InternalReqPatDemo.g:1191:2: rule__AnalysisFunctionPurp__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionPurp__Group__3__Impl();

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
    // $ANTLR end "rule__AnalysisFunctionPurp__Group__3"


    // $ANTLR start "rule__AnalysisFunctionPurp__Group__3__Impl"
    // InternalReqPatDemo.g:1197:1: rule__AnalysisFunctionPurp__Group__3__Impl : ( ( rule__AnalysisFunctionPurp__PurposeAssignment_3 ) ) ;
    public final void rule__AnalysisFunctionPurp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1201:1: ( ( ( rule__AnalysisFunctionPurp__PurposeAssignment_3 ) ) )
            // InternalReqPatDemo.g:1202:1: ( ( rule__AnalysisFunctionPurp__PurposeAssignment_3 ) )
            {
            // InternalReqPatDemo.g:1202:1: ( ( rule__AnalysisFunctionPurp__PurposeAssignment_3 ) )
            // InternalReqPatDemo.g:1203:1: ( rule__AnalysisFunctionPurp__PurposeAssignment_3 )
            {
             before(grammarAccess.getAnalysisFunctionPurpAccess().getPurposeAssignment_3()); 
            // InternalReqPatDemo.g:1204:1: ( rule__AnalysisFunctionPurp__PurposeAssignment_3 )
            // InternalReqPatDemo.g:1204:2: rule__AnalysisFunctionPurp__PurposeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunctionPurp__PurposeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisFunctionPurpAccess().getPurposeAssignment_3()); 

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
    // $ANTLR end "rule__AnalysisFunctionPurp__Group__3__Impl"


    // $ANTLR start "rule__FunctionalDeviceDef__Group__0"
    // InternalReqPatDemo.g:1222:1: rule__FunctionalDeviceDef__Group__0 : rule__FunctionalDeviceDef__Group__0__Impl rule__FunctionalDeviceDef__Group__1 ;
    public final void rule__FunctionalDeviceDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1226:1: ( rule__FunctionalDeviceDef__Group__0__Impl rule__FunctionalDeviceDef__Group__1 )
            // InternalReqPatDemo.g:1227:2: rule__FunctionalDeviceDef__Group__0__Impl rule__FunctionalDeviceDef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__FunctionalDeviceDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDeviceDef__Group__1();

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
    // $ANTLR end "rule__FunctionalDeviceDef__Group__0"


    // $ANTLR start "rule__FunctionalDeviceDef__Group__0__Impl"
    // InternalReqPatDemo.g:1234:1: rule__FunctionalDeviceDef__Group__0__Impl : ( () ) ;
    public final void rule__FunctionalDeviceDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1238:1: ( ( () ) )
            // InternalReqPatDemo.g:1239:1: ( () )
            {
            // InternalReqPatDemo.g:1239:1: ( () )
            // InternalReqPatDemo.g:1240:1: ()
            {
             before(grammarAccess.getFunctionalDeviceDefAccess().getFunctionalDeviceDefinitionAction_0()); 
            // InternalReqPatDemo.g:1241:1: ()
            // InternalReqPatDemo.g:1243:1: 
            {
            }

             after(grammarAccess.getFunctionalDeviceDefAccess().getFunctionalDeviceDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDeviceDef__Group__0__Impl"


    // $ANTLR start "rule__FunctionalDeviceDef__Group__1"
    // InternalReqPatDemo.g:1253:1: rule__FunctionalDeviceDef__Group__1 : rule__FunctionalDeviceDef__Group__1__Impl rule__FunctionalDeviceDef__Group__2 ;
    public final void rule__FunctionalDeviceDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1257:1: ( rule__FunctionalDeviceDef__Group__1__Impl rule__FunctionalDeviceDef__Group__2 )
            // InternalReqPatDemo.g:1258:2: rule__FunctionalDeviceDef__Group__1__Impl rule__FunctionalDeviceDef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__FunctionalDeviceDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDeviceDef__Group__2();

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
    // $ANTLR end "rule__FunctionalDeviceDef__Group__1"


    // $ANTLR start "rule__FunctionalDeviceDef__Group__1__Impl"
    // InternalReqPatDemo.g:1265:1: rule__FunctionalDeviceDef__Group__1__Impl : ( 'The functional device' ) ;
    public final void rule__FunctionalDeviceDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1269:1: ( ( 'The functional device' ) )
            // InternalReqPatDemo.g:1270:1: ( 'The functional device' )
            {
            // InternalReqPatDemo.g:1270:1: ( 'The functional device' )
            // InternalReqPatDemo.g:1271:1: 'The functional device'
            {
             before(grammarAccess.getFunctionalDeviceDefAccess().getTheFunctionalDeviceKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFunctionalDeviceDefAccess().getTheFunctionalDeviceKeyword_1()); 

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
    // $ANTLR end "rule__FunctionalDeviceDef__Group__1__Impl"


    // $ANTLR start "rule__FunctionalDeviceDef__Group__2"
    // InternalReqPatDemo.g:1284:1: rule__FunctionalDeviceDef__Group__2 : rule__FunctionalDeviceDef__Group__2__Impl ;
    public final void rule__FunctionalDeviceDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1288:1: ( rule__FunctionalDeviceDef__Group__2__Impl )
            // InternalReqPatDemo.g:1289:2: rule__FunctionalDeviceDef__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDeviceDef__Group__2__Impl();

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
    // $ANTLR end "rule__FunctionalDeviceDef__Group__2"


    // $ANTLR start "rule__FunctionalDeviceDef__Group__2__Impl"
    // InternalReqPatDemo.g:1295:1: rule__FunctionalDeviceDef__Group__2__Impl : ( ( rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2 ) ) ;
    public final void rule__FunctionalDeviceDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1299:1: ( ( ( rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2 ) ) )
            // InternalReqPatDemo.g:1300:1: ( ( rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2 ) )
            {
            // InternalReqPatDemo.g:1300:1: ( ( rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2 ) )
            // InternalReqPatDemo.g:1301:1: ( rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2 )
            {
             before(grammarAccess.getFunctionalDeviceDefAccess().getFunctionalDeviceAssignment_2()); 
            // InternalReqPatDemo.g:1302:1: ( rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2 )
            // InternalReqPatDemo.g:1302:2: rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalDeviceDefAccess().getFunctionalDeviceAssignment_2()); 

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
    // $ANTLR end "rule__FunctionalDeviceDef__Group__2__Impl"


    // $ANTLR start "rule__FunctionalDevice__Group__0"
    // InternalReqPatDemo.g:1318:1: rule__FunctionalDevice__Group__0 : rule__FunctionalDevice__Group__0__Impl rule__FunctionalDevice__Group__1 ;
    public final void rule__FunctionalDevice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1322:1: ( rule__FunctionalDevice__Group__0__Impl rule__FunctionalDevice__Group__1 )
            // InternalReqPatDemo.g:1323:2: rule__FunctionalDevice__Group__0__Impl rule__FunctionalDevice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__FunctionalDevice__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDevice__Group__1();

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
    // $ANTLR end "rule__FunctionalDevice__Group__0"


    // $ANTLR start "rule__FunctionalDevice__Group__0__Impl"
    // InternalReqPatDemo.g:1330:1: rule__FunctionalDevice__Group__0__Impl : ( () ) ;
    public final void rule__FunctionalDevice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1334:1: ( ( () ) )
            // InternalReqPatDemo.g:1335:1: ( () )
            {
            // InternalReqPatDemo.g:1335:1: ( () )
            // InternalReqPatDemo.g:1336:1: ()
            {
             before(grammarAccess.getFunctionalDeviceAccess().getFunctionalDeviceAction_0()); 
            // InternalReqPatDemo.g:1337:1: ()
            // InternalReqPatDemo.g:1339:1: 
            {
            }

             after(grammarAccess.getFunctionalDeviceAccess().getFunctionalDeviceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDevice__Group__0__Impl"


    // $ANTLR start "rule__FunctionalDevice__Group__1"
    // InternalReqPatDemo.g:1349:1: rule__FunctionalDevice__Group__1 : rule__FunctionalDevice__Group__1__Impl rule__FunctionalDevice__Group__2 ;
    public final void rule__FunctionalDevice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1353:1: ( rule__FunctionalDevice__Group__1__Impl rule__FunctionalDevice__Group__2 )
            // InternalReqPatDemo.g:1354:2: rule__FunctionalDevice__Group__1__Impl rule__FunctionalDevice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__FunctionalDevice__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDevice__Group__2();

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
    // $ANTLR end "rule__FunctionalDevice__Group__1"


    // $ANTLR start "rule__FunctionalDevice__Group__1__Impl"
    // InternalReqPatDemo.g:1361:1: rule__FunctionalDevice__Group__1__Impl : ( ( rule__FunctionalDevice__NameAssignment_1 ) ) ;
    public final void rule__FunctionalDevice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1365:1: ( ( ( rule__FunctionalDevice__NameAssignment_1 ) ) )
            // InternalReqPatDemo.g:1366:1: ( ( rule__FunctionalDevice__NameAssignment_1 ) )
            {
            // InternalReqPatDemo.g:1366:1: ( ( rule__FunctionalDevice__NameAssignment_1 ) )
            // InternalReqPatDemo.g:1367:1: ( rule__FunctionalDevice__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionalDeviceAccess().getNameAssignment_1()); 
            // InternalReqPatDemo.g:1368:1: ( rule__FunctionalDevice__NameAssignment_1 )
            // InternalReqPatDemo.g:1368:2: rule__FunctionalDevice__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDevice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalDeviceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FunctionalDevice__Group__1__Impl"


    // $ANTLR start "rule__FunctionalDevice__Group__2"
    // InternalReqPatDemo.g:1378:1: rule__FunctionalDevice__Group__2 : rule__FunctionalDevice__Group__2__Impl rule__FunctionalDevice__Group__3 ;
    public final void rule__FunctionalDevice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1382:1: ( rule__FunctionalDevice__Group__2__Impl rule__FunctionalDevice__Group__3 )
            // InternalReqPatDemo.g:1383:2: rule__FunctionalDevice__Group__2__Impl rule__FunctionalDevice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__FunctionalDevice__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDevice__Group__3();

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
    // $ANTLR end "rule__FunctionalDevice__Group__2"


    // $ANTLR start "rule__FunctionalDevice__Group__2__Impl"
    // InternalReqPatDemo.g:1390:1: rule__FunctionalDevice__Group__2__Impl : ( 'has the following purpose:' ) ;
    public final void rule__FunctionalDevice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1394:1: ( ( 'has the following purpose:' ) )
            // InternalReqPatDemo.g:1395:1: ( 'has the following purpose:' )
            {
            // InternalReqPatDemo.g:1395:1: ( 'has the following purpose:' )
            // InternalReqPatDemo.g:1396:1: 'has the following purpose:'
            {
             before(grammarAccess.getFunctionalDeviceAccess().getHasTheFollowingPurposeKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFunctionalDeviceAccess().getHasTheFollowingPurposeKeyword_2()); 

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
    // $ANTLR end "rule__FunctionalDevice__Group__2__Impl"


    // $ANTLR start "rule__FunctionalDevice__Group__3"
    // InternalReqPatDemo.g:1409:1: rule__FunctionalDevice__Group__3 : rule__FunctionalDevice__Group__3__Impl ;
    public final void rule__FunctionalDevice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1413:1: ( rule__FunctionalDevice__Group__3__Impl )
            // InternalReqPatDemo.g:1414:2: rule__FunctionalDevice__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDevice__Group__3__Impl();

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
    // $ANTLR end "rule__FunctionalDevice__Group__3"


    // $ANTLR start "rule__FunctionalDevice__Group__3__Impl"
    // InternalReqPatDemo.g:1420:1: rule__FunctionalDevice__Group__3__Impl : ( ( rule__FunctionalDevice__PurposeAssignment_3 ) ) ;
    public final void rule__FunctionalDevice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1424:1: ( ( ( rule__FunctionalDevice__PurposeAssignment_3 ) ) )
            // InternalReqPatDemo.g:1425:1: ( ( rule__FunctionalDevice__PurposeAssignment_3 ) )
            {
            // InternalReqPatDemo.g:1425:1: ( ( rule__FunctionalDevice__PurposeAssignment_3 ) )
            // InternalReqPatDemo.g:1426:1: ( rule__FunctionalDevice__PurposeAssignment_3 )
            {
             before(grammarAccess.getFunctionalDeviceAccess().getPurposeAssignment_3()); 
            // InternalReqPatDemo.g:1427:1: ( rule__FunctionalDevice__PurposeAssignment_3 )
            // InternalReqPatDemo.g:1427:2: rule__FunctionalDevice__PurposeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FunctionalDevice__PurposeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalDeviceAccess().getPurposeAssignment_3()); 

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
    // $ANTLR end "rule__FunctionalDevice__Group__3__Impl"


    // $ANTLR start "rule__SubAnalysisFunctionDef__Group__0"
    // InternalReqPatDemo.g:1445:1: rule__SubAnalysisFunctionDef__Group__0 : rule__SubAnalysisFunctionDef__Group__0__Impl rule__SubAnalysisFunctionDef__Group__1 ;
    public final void rule__SubAnalysisFunctionDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1449:1: ( rule__SubAnalysisFunctionDef__Group__0__Impl rule__SubAnalysisFunctionDef__Group__1 )
            // InternalReqPatDemo.g:1450:2: rule__SubAnalysisFunctionDef__Group__0__Impl rule__SubAnalysisFunctionDef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__SubAnalysisFunctionDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunctionDef__Group__1();

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
    // $ANTLR end "rule__SubAnalysisFunctionDef__Group__0"


    // $ANTLR start "rule__SubAnalysisFunctionDef__Group__0__Impl"
    // InternalReqPatDemo.g:1457:1: rule__SubAnalysisFunctionDef__Group__0__Impl : ( () ) ;
    public final void rule__SubAnalysisFunctionDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1461:1: ( ( () ) )
            // InternalReqPatDemo.g:1462:1: ( () )
            {
            // InternalReqPatDemo.g:1462:1: ( () )
            // InternalReqPatDemo.g:1463:1: ()
            {
             before(grammarAccess.getSubAnalysisFunctionDefAccess().getSubAnalysisFunctionDefinitionAction_0()); 
            // InternalReqPatDemo.g:1464:1: ()
            // InternalReqPatDemo.g:1466:1: 
            {
            }

             after(grammarAccess.getSubAnalysisFunctionDefAccess().getSubAnalysisFunctionDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAnalysisFunctionDef__Group__0__Impl"


    // $ANTLR start "rule__SubAnalysisFunctionDef__Group__1"
    // InternalReqPatDemo.g:1476:1: rule__SubAnalysisFunctionDef__Group__1 : rule__SubAnalysisFunctionDef__Group__1__Impl ;
    public final void rule__SubAnalysisFunctionDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1480:1: ( rule__SubAnalysisFunctionDef__Group__1__Impl )
            // InternalReqPatDemo.g:1481:2: rule__SubAnalysisFunctionDef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunctionDef__Group__1__Impl();

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
    // $ANTLR end "rule__SubAnalysisFunctionDef__Group__1"


    // $ANTLR start "rule__SubAnalysisFunctionDef__Group__1__Impl"
    // InternalReqPatDemo.g:1487:1: rule__SubAnalysisFunctionDef__Group__1__Impl : ( ( rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1 ) ) ;
    public final void rule__SubAnalysisFunctionDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1491:1: ( ( ( rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1 ) ) )
            // InternalReqPatDemo.g:1492:1: ( ( rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1 ) )
            {
            // InternalReqPatDemo.g:1492:1: ( ( rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1 ) )
            // InternalReqPatDemo.g:1493:1: ( rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1 )
            {
             before(grammarAccess.getSubAnalysisFunctionDefAccess().getAnalysisFunctionAssignment_1()); 
            // InternalReqPatDemo.g:1494:1: ( rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1 )
            // InternalReqPatDemo.g:1494:2: rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubAnalysisFunctionDefAccess().getAnalysisFunctionAssignment_1()); 

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
    // $ANTLR end "rule__SubAnalysisFunctionDef__Group__1__Impl"


    // $ANTLR start "rule__SubAnalysisFunction__Group__0"
    // InternalReqPatDemo.g:1508:1: rule__SubAnalysisFunction__Group__0 : rule__SubAnalysisFunction__Group__0__Impl rule__SubAnalysisFunction__Group__1 ;
    public final void rule__SubAnalysisFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1512:1: ( rule__SubAnalysisFunction__Group__0__Impl rule__SubAnalysisFunction__Group__1 )
            // InternalReqPatDemo.g:1513:2: rule__SubAnalysisFunction__Group__0__Impl rule__SubAnalysisFunction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__SubAnalysisFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunction__Group__1();

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
    // $ANTLR end "rule__SubAnalysisFunction__Group__0"


    // $ANTLR start "rule__SubAnalysisFunction__Group__0__Impl"
    // InternalReqPatDemo.g:1520:1: rule__SubAnalysisFunction__Group__0__Impl : ( () ) ;
    public final void rule__SubAnalysisFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1524:1: ( ( () ) )
            // InternalReqPatDemo.g:1525:1: ( () )
            {
            // InternalReqPatDemo.g:1525:1: ( () )
            // InternalReqPatDemo.g:1526:1: ()
            {
             before(grammarAccess.getSubAnalysisFunctionAccess().getAnalysisFunctionAction_0()); 
            // InternalReqPatDemo.g:1527:1: ()
            // InternalReqPatDemo.g:1529:1: 
            {
            }

             after(grammarAccess.getSubAnalysisFunctionAccess().getAnalysisFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAnalysisFunction__Group__0__Impl"


    // $ANTLR start "rule__SubAnalysisFunction__Group__1"
    // InternalReqPatDemo.g:1539:1: rule__SubAnalysisFunction__Group__1 : rule__SubAnalysisFunction__Group__1__Impl rule__SubAnalysisFunction__Group__2 ;
    public final void rule__SubAnalysisFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1543:1: ( rule__SubAnalysisFunction__Group__1__Impl rule__SubAnalysisFunction__Group__2 )
            // InternalReqPatDemo.g:1544:2: rule__SubAnalysisFunction__Group__1__Impl rule__SubAnalysisFunction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__SubAnalysisFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunction__Group__2();

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
    // $ANTLR end "rule__SubAnalysisFunction__Group__1"


    // $ANTLR start "rule__SubAnalysisFunction__Group__1__Impl"
    // InternalReqPatDemo.g:1551:1: rule__SubAnalysisFunction__Group__1__Impl : ( ( rule__SubAnalysisFunction__NameAssignment_1 ) ) ;
    public final void rule__SubAnalysisFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1555:1: ( ( ( rule__SubAnalysisFunction__NameAssignment_1 ) ) )
            // InternalReqPatDemo.g:1556:1: ( ( rule__SubAnalysisFunction__NameAssignment_1 ) )
            {
            // InternalReqPatDemo.g:1556:1: ( ( rule__SubAnalysisFunction__NameAssignment_1 ) )
            // InternalReqPatDemo.g:1557:1: ( rule__SubAnalysisFunction__NameAssignment_1 )
            {
             before(grammarAccess.getSubAnalysisFunctionAccess().getNameAssignment_1()); 
            // InternalReqPatDemo.g:1558:1: ( rule__SubAnalysisFunction__NameAssignment_1 )
            // InternalReqPatDemo.g:1558:2: rule__SubAnalysisFunction__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubAnalysisFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SubAnalysisFunction__Group__1__Impl"


    // $ANTLR start "rule__SubAnalysisFunction__Group__2"
    // InternalReqPatDemo.g:1568:1: rule__SubAnalysisFunction__Group__2 : rule__SubAnalysisFunction__Group__2__Impl rule__SubAnalysisFunction__Group__3 ;
    public final void rule__SubAnalysisFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1572:1: ( rule__SubAnalysisFunction__Group__2__Impl rule__SubAnalysisFunction__Group__3 )
            // InternalReqPatDemo.g:1573:2: rule__SubAnalysisFunction__Group__2__Impl rule__SubAnalysisFunction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__SubAnalysisFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunction__Group__3();

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
    // $ANTLR end "rule__SubAnalysisFunction__Group__2"


    // $ANTLR start "rule__SubAnalysisFunction__Group__2__Impl"
    // InternalReqPatDemo.g:1580:1: rule__SubAnalysisFunction__Group__2__Impl : ( 'is a subfunction of the function' ) ;
    public final void rule__SubAnalysisFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1584:1: ( ( 'is a subfunction of the function' ) )
            // InternalReqPatDemo.g:1585:1: ( 'is a subfunction of the function' )
            {
            // InternalReqPatDemo.g:1585:1: ( 'is a subfunction of the function' )
            // InternalReqPatDemo.g:1586:1: 'is a subfunction of the function'
            {
             before(grammarAccess.getSubAnalysisFunctionAccess().getIsASubfunctionOfTheFunctionKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSubAnalysisFunctionAccess().getIsASubfunctionOfTheFunctionKeyword_2()); 

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
    // $ANTLR end "rule__SubAnalysisFunction__Group__2__Impl"


    // $ANTLR start "rule__SubAnalysisFunction__Group__3"
    // InternalReqPatDemo.g:1599:1: rule__SubAnalysisFunction__Group__3 : rule__SubAnalysisFunction__Group__3__Impl ;
    public final void rule__SubAnalysisFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1603:1: ( rule__SubAnalysisFunction__Group__3__Impl )
            // InternalReqPatDemo.g:1604:2: rule__SubAnalysisFunction__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunction__Group__3__Impl();

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
    // $ANTLR end "rule__SubAnalysisFunction__Group__3"


    // $ANTLR start "rule__SubAnalysisFunction__Group__3__Impl"
    // InternalReqPatDemo.g:1610:1: rule__SubAnalysisFunction__Group__3__Impl : ( ( rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3 ) ) ;
    public final void rule__SubAnalysisFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1614:1: ( ( ( rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3 ) ) )
            // InternalReqPatDemo.g:1615:1: ( ( rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3 ) )
            {
            // InternalReqPatDemo.g:1615:1: ( ( rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3 ) )
            // InternalReqPatDemo.g:1616:1: ( rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3 )
            {
             before(grammarAccess.getSubAnalysisFunctionAccess().getParentAnalysisFunctionAssignment_3()); 
            // InternalReqPatDemo.g:1617:1: ( rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3 )
            // InternalReqPatDemo.g:1617:2: rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubAnalysisFunctionAccess().getParentAnalysisFunctionAssignment_3()); 

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
    // $ANTLR end "rule__SubAnalysisFunction__Group__3__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group__0"
    // InternalReqPatDemo.g:1635:1: rule__IncomingInformationDef__Group__0 : rule__IncomingInformationDef__Group__0__Impl rule__IncomingInformationDef__Group__1 ;
    public final void rule__IncomingInformationDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1639:1: ( rule__IncomingInformationDef__Group__0__Impl rule__IncomingInformationDef__Group__1 )
            // InternalReqPatDemo.g:1640:2: rule__IncomingInformationDef__Group__0__Impl rule__IncomingInformationDef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__IncomingInformationDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group__1();

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
    // $ANTLR end "rule__IncomingInformationDef__Group__0"


    // $ANTLR start "rule__IncomingInformationDef__Group__0__Impl"
    // InternalReqPatDemo.g:1647:1: rule__IncomingInformationDef__Group__0__Impl : ( () ) ;
    public final void rule__IncomingInformationDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1651:1: ( ( () ) )
            // InternalReqPatDemo.g:1652:1: ( () )
            {
            // InternalReqPatDemo.g:1652:1: ( () )
            // InternalReqPatDemo.g:1653:1: ()
            {
             before(grammarAccess.getIncomingInformationDefAccess().getIncomingInformationDefinitionAction_0()); 
            // InternalReqPatDemo.g:1654:1: ()
            // InternalReqPatDemo.g:1656:1: 
            {
            }

             after(grammarAccess.getIncomingInformationDefAccess().getIncomingInformationDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncomingInformationDef__Group__0__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group__1"
    // InternalReqPatDemo.g:1666:1: rule__IncomingInformationDef__Group__1 : rule__IncomingInformationDef__Group__1__Impl rule__IncomingInformationDef__Group__2 ;
    public final void rule__IncomingInformationDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1670:1: ( rule__IncomingInformationDef__Group__1__Impl rule__IncomingInformationDef__Group__2 )
            // InternalReqPatDemo.g:1671:2: rule__IncomingInformationDef__Group__1__Impl rule__IncomingInformationDef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__IncomingInformationDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group__2();

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
    // $ANTLR end "rule__IncomingInformationDef__Group__1"


    // $ANTLR start "rule__IncomingInformationDef__Group__1__Impl"
    // InternalReqPatDemo.g:1678:1: rule__IncomingInformationDef__Group__1__Impl : ( 'is received by the function' ) ;
    public final void rule__IncomingInformationDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1682:1: ( ( 'is received by the function' ) )
            // InternalReqPatDemo.g:1683:1: ( 'is received by the function' )
            {
            // InternalReqPatDemo.g:1683:1: ( 'is received by the function' )
            // InternalReqPatDemo.g:1684:1: 'is received by the function'
            {
             before(grammarAccess.getIncomingInformationDefAccess().getIsReceivedByTheFunctionKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIncomingInformationDefAccess().getIsReceivedByTheFunctionKeyword_1()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group__1__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group__2"
    // InternalReqPatDemo.g:1697:1: rule__IncomingInformationDef__Group__2 : rule__IncomingInformationDef__Group__2__Impl rule__IncomingInformationDef__Group__3 ;
    public final void rule__IncomingInformationDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1701:1: ( rule__IncomingInformationDef__Group__2__Impl rule__IncomingInformationDef__Group__3 )
            // InternalReqPatDemo.g:1702:2: rule__IncomingInformationDef__Group__2__Impl rule__IncomingInformationDef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__IncomingInformationDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group__3();

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
    // $ANTLR end "rule__IncomingInformationDef__Group__2"


    // $ANTLR start "rule__IncomingInformationDef__Group__2__Impl"
    // InternalReqPatDemo.g:1709:1: rule__IncomingInformationDef__Group__2__Impl : ( ( rule__IncomingInformationDef__AnalysisFunctionAssignment_2 ) ) ;
    public final void rule__IncomingInformationDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1713:1: ( ( ( rule__IncomingInformationDef__AnalysisFunctionAssignment_2 ) ) )
            // InternalReqPatDemo.g:1714:1: ( ( rule__IncomingInformationDef__AnalysisFunctionAssignment_2 ) )
            {
            // InternalReqPatDemo.g:1714:1: ( ( rule__IncomingInformationDef__AnalysisFunctionAssignment_2 ) )
            // InternalReqPatDemo.g:1715:1: ( rule__IncomingInformationDef__AnalysisFunctionAssignment_2 )
            {
             before(grammarAccess.getIncomingInformationDefAccess().getAnalysisFunctionAssignment_2()); 
            // InternalReqPatDemo.g:1716:1: ( rule__IncomingInformationDef__AnalysisFunctionAssignment_2 )
            // InternalReqPatDemo.g:1716:2: rule__IncomingInformationDef__AnalysisFunctionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__AnalysisFunctionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIncomingInformationDefAccess().getAnalysisFunctionAssignment_2()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group__2__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group__3"
    // InternalReqPatDemo.g:1726:1: rule__IncomingInformationDef__Group__3 : rule__IncomingInformationDef__Group__3__Impl rule__IncomingInformationDef__Group__4 ;
    public final void rule__IncomingInformationDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1730:1: ( rule__IncomingInformationDef__Group__3__Impl rule__IncomingInformationDef__Group__4 )
            // InternalReqPatDemo.g:1731:2: rule__IncomingInformationDef__Group__3__Impl rule__IncomingInformationDef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__IncomingInformationDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group__4();

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
    // $ANTLR end "rule__IncomingInformationDef__Group__3"


    // $ANTLR start "rule__IncomingInformationDef__Group__3__Impl"
    // InternalReqPatDemo.g:1738:1: rule__IncomingInformationDef__Group__3__Impl : ( ( rule__IncomingInformationDef__Group_3__0 )? ) ;
    public final void rule__IncomingInformationDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1742:1: ( ( ( rule__IncomingInformationDef__Group_3__0 )? ) )
            // InternalReqPatDemo.g:1743:1: ( ( rule__IncomingInformationDef__Group_3__0 )? )
            {
            // InternalReqPatDemo.g:1743:1: ( ( rule__IncomingInformationDef__Group_3__0 )? )
            // InternalReqPatDemo.g:1744:1: ( rule__IncomingInformationDef__Group_3__0 )?
            {
             before(grammarAccess.getIncomingInformationDefAccess().getGroup_3()); 
            // InternalReqPatDemo.g:1745:1: ( rule__IncomingInformationDef__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReqPatDemo.g:1745:2: rule__IncomingInformationDef__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__IncomingInformationDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIncomingInformationDefAccess().getGroup_3()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group__3__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group__4"
    // InternalReqPatDemo.g:1755:1: rule__IncomingInformationDef__Group__4 : rule__IncomingInformationDef__Group__4__Impl rule__IncomingInformationDef__Group__5 ;
    public final void rule__IncomingInformationDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1759:1: ( rule__IncomingInformationDef__Group__4__Impl rule__IncomingInformationDef__Group__5 )
            // InternalReqPatDemo.g:1760:2: rule__IncomingInformationDef__Group__4__Impl rule__IncomingInformationDef__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__IncomingInformationDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group__5();

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
    // $ANTLR end "rule__IncomingInformationDef__Group__4"


    // $ANTLR start "rule__IncomingInformationDef__Group__4__Impl"
    // InternalReqPatDemo.g:1767:1: rule__IncomingInformationDef__Group__4__Impl : ( ':' ) ;
    public final void rule__IncomingInformationDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1771:1: ( ( ':' ) )
            // InternalReqPatDemo.g:1772:1: ( ':' )
            {
            // InternalReqPatDemo.g:1772:1: ( ':' )
            // InternalReqPatDemo.g:1773:1: ':'
            {
             before(grammarAccess.getIncomingInformationDefAccess().getColonKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIncomingInformationDefAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group__4__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group__5"
    // InternalReqPatDemo.g:1786:1: rule__IncomingInformationDef__Group__5 : rule__IncomingInformationDef__Group__5__Impl rule__IncomingInformationDef__Group__6 ;
    public final void rule__IncomingInformationDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1790:1: ( rule__IncomingInformationDef__Group__5__Impl rule__IncomingInformationDef__Group__6 )
            // InternalReqPatDemo.g:1791:2: rule__IncomingInformationDef__Group__5__Impl rule__IncomingInformationDef__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__IncomingInformationDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group__6();

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
    // $ANTLR end "rule__IncomingInformationDef__Group__5"


    // $ANTLR start "rule__IncomingInformationDef__Group__5__Impl"
    // InternalReqPatDemo.g:1798:1: rule__IncomingInformationDef__Group__5__Impl : ( ( rule__IncomingInformationDef__InformationListAssignment_5 ) ) ;
    public final void rule__IncomingInformationDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1802:1: ( ( ( rule__IncomingInformationDef__InformationListAssignment_5 ) ) )
            // InternalReqPatDemo.g:1803:1: ( ( rule__IncomingInformationDef__InformationListAssignment_5 ) )
            {
            // InternalReqPatDemo.g:1803:1: ( ( rule__IncomingInformationDef__InformationListAssignment_5 ) )
            // InternalReqPatDemo.g:1804:1: ( rule__IncomingInformationDef__InformationListAssignment_5 )
            {
             before(grammarAccess.getIncomingInformationDefAccess().getInformationListAssignment_5()); 
            // InternalReqPatDemo.g:1805:1: ( rule__IncomingInformationDef__InformationListAssignment_5 )
            // InternalReqPatDemo.g:1805:2: rule__IncomingInformationDef__InformationListAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__InformationListAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIncomingInformationDefAccess().getInformationListAssignment_5()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group__5__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group__6"
    // InternalReqPatDemo.g:1815:1: rule__IncomingInformationDef__Group__6 : rule__IncomingInformationDef__Group__6__Impl ;
    public final void rule__IncomingInformationDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1819:1: ( rule__IncomingInformationDef__Group__6__Impl )
            // InternalReqPatDemo.g:1820:2: rule__IncomingInformationDef__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group__6__Impl();

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
    // $ANTLR end "rule__IncomingInformationDef__Group__6"


    // $ANTLR start "rule__IncomingInformationDef__Group__6__Impl"
    // InternalReqPatDemo.g:1826:1: rule__IncomingInformationDef__Group__6__Impl : ( ( rule__IncomingInformationDef__Group_6__0 )* ) ;
    public final void rule__IncomingInformationDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1830:1: ( ( ( rule__IncomingInformationDef__Group_6__0 )* ) )
            // InternalReqPatDemo.g:1831:1: ( ( rule__IncomingInformationDef__Group_6__0 )* )
            {
            // InternalReqPatDemo.g:1831:1: ( ( rule__IncomingInformationDef__Group_6__0 )* )
            // InternalReqPatDemo.g:1832:1: ( rule__IncomingInformationDef__Group_6__0 )*
            {
             before(grammarAccess.getIncomingInformationDefAccess().getGroup_6()); 
            // InternalReqPatDemo.g:1833:1: ( rule__IncomingInformationDef__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalReqPatDemo.g:1833:2: rule__IncomingInformationDef__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__IncomingInformationDef__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIncomingInformationDefAccess().getGroup_6()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group__6__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group_3__0"
    // InternalReqPatDemo.g:1857:1: rule__IncomingInformationDef__Group_3__0 : rule__IncomingInformationDef__Group_3__0__Impl rule__IncomingInformationDef__Group_3__1 ;
    public final void rule__IncomingInformationDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1861:1: ( rule__IncomingInformationDef__Group_3__0__Impl rule__IncomingInformationDef__Group_3__1 )
            // InternalReqPatDemo.g:1862:2: rule__IncomingInformationDef__Group_3__0__Impl rule__IncomingInformationDef__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__IncomingInformationDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group_3__1();

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
    // $ANTLR end "rule__IncomingInformationDef__Group_3__0"


    // $ANTLR start "rule__IncomingInformationDef__Group_3__0__Impl"
    // InternalReqPatDemo.g:1869:1: rule__IncomingInformationDef__Group_3__0__Impl : ( 'from the functional device' ) ;
    public final void rule__IncomingInformationDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1873:1: ( ( 'from the functional device' ) )
            // InternalReqPatDemo.g:1874:1: ( 'from the functional device' )
            {
            // InternalReqPatDemo.g:1874:1: ( 'from the functional device' )
            // InternalReqPatDemo.g:1875:1: 'from the functional device'
            {
             before(grammarAccess.getIncomingInformationDefAccess().getFromTheFunctionalDeviceKeyword_3_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIncomingInformationDefAccess().getFromTheFunctionalDeviceKeyword_3_0()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group_3__0__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group_3__1"
    // InternalReqPatDemo.g:1888:1: rule__IncomingInformationDef__Group_3__1 : rule__IncomingInformationDef__Group_3__1__Impl ;
    public final void rule__IncomingInformationDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1892:1: ( rule__IncomingInformationDef__Group_3__1__Impl )
            // InternalReqPatDemo.g:1893:2: rule__IncomingInformationDef__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group_3__1__Impl();

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
    // $ANTLR end "rule__IncomingInformationDef__Group_3__1"


    // $ANTLR start "rule__IncomingInformationDef__Group_3__1__Impl"
    // InternalReqPatDemo.g:1899:1: rule__IncomingInformationDef__Group_3__1__Impl : ( ( rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1 ) ) ;
    public final void rule__IncomingInformationDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1903:1: ( ( ( rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1 ) ) )
            // InternalReqPatDemo.g:1904:1: ( ( rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1 ) )
            {
            // InternalReqPatDemo.g:1904:1: ( ( rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1 ) )
            // InternalReqPatDemo.g:1905:1: ( rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1 )
            {
             before(grammarAccess.getIncomingInformationDefAccess().getFunctionalDeviceAssignment_3_1()); 
            // InternalReqPatDemo.g:1906:1: ( rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1 )
            // InternalReqPatDemo.g:1906:2: rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIncomingInformationDefAccess().getFunctionalDeviceAssignment_3_1()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group_3__1__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group_6__0"
    // InternalReqPatDemo.g:1920:1: rule__IncomingInformationDef__Group_6__0 : rule__IncomingInformationDef__Group_6__0__Impl rule__IncomingInformationDef__Group_6__1 ;
    public final void rule__IncomingInformationDef__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1924:1: ( rule__IncomingInformationDef__Group_6__0__Impl rule__IncomingInformationDef__Group_6__1 )
            // InternalReqPatDemo.g:1925:2: rule__IncomingInformationDef__Group_6__0__Impl rule__IncomingInformationDef__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__IncomingInformationDef__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group_6__1();

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
    // $ANTLR end "rule__IncomingInformationDef__Group_6__0"


    // $ANTLR start "rule__IncomingInformationDef__Group_6__0__Impl"
    // InternalReqPatDemo.g:1932:1: rule__IncomingInformationDef__Group_6__0__Impl : ( ',' ) ;
    public final void rule__IncomingInformationDef__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1936:1: ( ( ',' ) )
            // InternalReqPatDemo.g:1937:1: ( ',' )
            {
            // InternalReqPatDemo.g:1937:1: ( ',' )
            // InternalReqPatDemo.g:1938:1: ','
            {
             before(grammarAccess.getIncomingInformationDefAccess().getCommaKeyword_6_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIncomingInformationDefAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group_6__0__Impl"


    // $ANTLR start "rule__IncomingInformationDef__Group_6__1"
    // InternalReqPatDemo.g:1951:1: rule__IncomingInformationDef__Group_6__1 : rule__IncomingInformationDef__Group_6__1__Impl ;
    public final void rule__IncomingInformationDef__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1955:1: ( rule__IncomingInformationDef__Group_6__1__Impl )
            // InternalReqPatDemo.g:1956:2: rule__IncomingInformationDef__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__Group_6__1__Impl();

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
    // $ANTLR end "rule__IncomingInformationDef__Group_6__1"


    // $ANTLR start "rule__IncomingInformationDef__Group_6__1__Impl"
    // InternalReqPatDemo.g:1962:1: rule__IncomingInformationDef__Group_6__1__Impl : ( ( rule__IncomingInformationDef__InformationListAssignment_6_1 ) ) ;
    public final void rule__IncomingInformationDef__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1966:1: ( ( ( rule__IncomingInformationDef__InformationListAssignment_6_1 ) ) )
            // InternalReqPatDemo.g:1967:1: ( ( rule__IncomingInformationDef__InformationListAssignment_6_1 ) )
            {
            // InternalReqPatDemo.g:1967:1: ( ( rule__IncomingInformationDef__InformationListAssignment_6_1 ) )
            // InternalReqPatDemo.g:1968:1: ( rule__IncomingInformationDef__InformationListAssignment_6_1 )
            {
             before(grammarAccess.getIncomingInformationDefAccess().getInformationListAssignment_6_1()); 
            // InternalReqPatDemo.g:1969:1: ( rule__IncomingInformationDef__InformationListAssignment_6_1 )
            // InternalReqPatDemo.g:1969:2: rule__IncomingInformationDef__InformationListAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncomingInformationDef__InformationListAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIncomingInformationDefAccess().getInformationListAssignment_6_1()); 

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
    // $ANTLR end "rule__IncomingInformationDef__Group_6__1__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group__0"
    // InternalReqPatDemo.g:1983:1: rule__OutgoingInformationDef__Group__0 : rule__OutgoingInformationDef__Group__0__Impl rule__OutgoingInformationDef__Group__1 ;
    public final void rule__OutgoingInformationDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1987:1: ( rule__OutgoingInformationDef__Group__0__Impl rule__OutgoingInformationDef__Group__1 )
            // InternalReqPatDemo.g:1988:2: rule__OutgoingInformationDef__Group__0__Impl rule__OutgoingInformationDef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__OutgoingInformationDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group__1();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__0"


    // $ANTLR start "rule__OutgoingInformationDef__Group__0__Impl"
    // InternalReqPatDemo.g:1995:1: rule__OutgoingInformationDef__Group__0__Impl : ( () ) ;
    public final void rule__OutgoingInformationDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:1999:1: ( ( () ) )
            // InternalReqPatDemo.g:2000:1: ( () )
            {
            // InternalReqPatDemo.g:2000:1: ( () )
            // InternalReqPatDemo.g:2001:1: ()
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getOutgoingInformationDefinitionAction_0()); 
            // InternalReqPatDemo.g:2002:1: ()
            // InternalReqPatDemo.g:2004:1: 
            {
            }

             after(grammarAccess.getOutgoingInformationDefAccess().getOutgoingInformationDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutgoingInformationDef__Group__0__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group__1"
    // InternalReqPatDemo.g:2014:1: rule__OutgoingInformationDef__Group__1 : rule__OutgoingInformationDef__Group__1__Impl rule__OutgoingInformationDef__Group__2 ;
    public final void rule__OutgoingInformationDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2018:1: ( rule__OutgoingInformationDef__Group__1__Impl rule__OutgoingInformationDef__Group__2 )
            // InternalReqPatDemo.g:2019:2: rule__OutgoingInformationDef__Group__1__Impl rule__OutgoingInformationDef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__OutgoingInformationDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group__2();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__1"


    // $ANTLR start "rule__OutgoingInformationDef__Group__1__Impl"
    // InternalReqPatDemo.g:2026:1: rule__OutgoingInformationDef__Group__1__Impl : ( 'is sent from the function' ) ;
    public final void rule__OutgoingInformationDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2030:1: ( ( 'is sent from the function' ) )
            // InternalReqPatDemo.g:2031:1: ( 'is sent from the function' )
            {
            // InternalReqPatDemo.g:2031:1: ( 'is sent from the function' )
            // InternalReqPatDemo.g:2032:1: 'is sent from the function'
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getIsSentFromTheFunctionKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutgoingInformationDefAccess().getIsSentFromTheFunctionKeyword_1()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__1__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group__2"
    // InternalReqPatDemo.g:2045:1: rule__OutgoingInformationDef__Group__2 : rule__OutgoingInformationDef__Group__2__Impl rule__OutgoingInformationDef__Group__3 ;
    public final void rule__OutgoingInformationDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2049:1: ( rule__OutgoingInformationDef__Group__2__Impl rule__OutgoingInformationDef__Group__3 )
            // InternalReqPatDemo.g:2050:2: rule__OutgoingInformationDef__Group__2__Impl rule__OutgoingInformationDef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__OutgoingInformationDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group__3();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__2"


    // $ANTLR start "rule__OutgoingInformationDef__Group__2__Impl"
    // InternalReqPatDemo.g:2057:1: rule__OutgoingInformationDef__Group__2__Impl : ( ( rule__OutgoingInformationDef__AnalysisFunctionAssignment_2 ) ) ;
    public final void rule__OutgoingInformationDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2061:1: ( ( ( rule__OutgoingInformationDef__AnalysisFunctionAssignment_2 ) ) )
            // InternalReqPatDemo.g:2062:1: ( ( rule__OutgoingInformationDef__AnalysisFunctionAssignment_2 ) )
            {
            // InternalReqPatDemo.g:2062:1: ( ( rule__OutgoingInformationDef__AnalysisFunctionAssignment_2 ) )
            // InternalReqPatDemo.g:2063:1: ( rule__OutgoingInformationDef__AnalysisFunctionAssignment_2 )
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getAnalysisFunctionAssignment_2()); 
            // InternalReqPatDemo.g:2064:1: ( rule__OutgoingInformationDef__AnalysisFunctionAssignment_2 )
            // InternalReqPatDemo.g:2064:2: rule__OutgoingInformationDef__AnalysisFunctionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__AnalysisFunctionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutgoingInformationDefAccess().getAnalysisFunctionAssignment_2()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__2__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group__3"
    // InternalReqPatDemo.g:2074:1: rule__OutgoingInformationDef__Group__3 : rule__OutgoingInformationDef__Group__3__Impl rule__OutgoingInformationDef__Group__4 ;
    public final void rule__OutgoingInformationDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2078:1: ( rule__OutgoingInformationDef__Group__3__Impl rule__OutgoingInformationDef__Group__4 )
            // InternalReqPatDemo.g:2079:2: rule__OutgoingInformationDef__Group__3__Impl rule__OutgoingInformationDef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__OutgoingInformationDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group__4();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__3"


    // $ANTLR start "rule__OutgoingInformationDef__Group__3__Impl"
    // InternalReqPatDemo.g:2086:1: rule__OutgoingInformationDef__Group__3__Impl : ( ( rule__OutgoingInformationDef__Group_3__0 )? ) ;
    public final void rule__OutgoingInformationDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2090:1: ( ( ( rule__OutgoingInformationDef__Group_3__0 )? ) )
            // InternalReqPatDemo.g:2091:1: ( ( rule__OutgoingInformationDef__Group_3__0 )? )
            {
            // InternalReqPatDemo.g:2091:1: ( ( rule__OutgoingInformationDef__Group_3__0 )? )
            // InternalReqPatDemo.g:2092:1: ( rule__OutgoingInformationDef__Group_3__0 )?
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getGroup_3()); 
            // InternalReqPatDemo.g:2093:1: ( rule__OutgoingInformationDef__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReqPatDemo.g:2093:2: rule__OutgoingInformationDef__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__OutgoingInformationDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutgoingInformationDefAccess().getGroup_3()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__3__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group__4"
    // InternalReqPatDemo.g:2103:1: rule__OutgoingInformationDef__Group__4 : rule__OutgoingInformationDef__Group__4__Impl rule__OutgoingInformationDef__Group__5 ;
    public final void rule__OutgoingInformationDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2107:1: ( rule__OutgoingInformationDef__Group__4__Impl rule__OutgoingInformationDef__Group__5 )
            // InternalReqPatDemo.g:2108:2: rule__OutgoingInformationDef__Group__4__Impl rule__OutgoingInformationDef__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__OutgoingInformationDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group__5();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__4"


    // $ANTLR start "rule__OutgoingInformationDef__Group__4__Impl"
    // InternalReqPatDemo.g:2115:1: rule__OutgoingInformationDef__Group__4__Impl : ( ':' ) ;
    public final void rule__OutgoingInformationDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2119:1: ( ( ':' ) )
            // InternalReqPatDemo.g:2120:1: ( ':' )
            {
            // InternalReqPatDemo.g:2120:1: ( ':' )
            // InternalReqPatDemo.g:2121:1: ':'
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getColonKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutgoingInformationDefAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__4__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group__5"
    // InternalReqPatDemo.g:2134:1: rule__OutgoingInformationDef__Group__5 : rule__OutgoingInformationDef__Group__5__Impl rule__OutgoingInformationDef__Group__6 ;
    public final void rule__OutgoingInformationDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2138:1: ( rule__OutgoingInformationDef__Group__5__Impl rule__OutgoingInformationDef__Group__6 )
            // InternalReqPatDemo.g:2139:2: rule__OutgoingInformationDef__Group__5__Impl rule__OutgoingInformationDef__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__OutgoingInformationDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group__6();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__5"


    // $ANTLR start "rule__OutgoingInformationDef__Group__5__Impl"
    // InternalReqPatDemo.g:2146:1: rule__OutgoingInformationDef__Group__5__Impl : ( ( rule__OutgoingInformationDef__InformationListAssignment_5 ) ) ;
    public final void rule__OutgoingInformationDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2150:1: ( ( ( rule__OutgoingInformationDef__InformationListAssignment_5 ) ) )
            // InternalReqPatDemo.g:2151:1: ( ( rule__OutgoingInformationDef__InformationListAssignment_5 ) )
            {
            // InternalReqPatDemo.g:2151:1: ( ( rule__OutgoingInformationDef__InformationListAssignment_5 ) )
            // InternalReqPatDemo.g:2152:1: ( rule__OutgoingInformationDef__InformationListAssignment_5 )
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getInformationListAssignment_5()); 
            // InternalReqPatDemo.g:2153:1: ( rule__OutgoingInformationDef__InformationListAssignment_5 )
            // InternalReqPatDemo.g:2153:2: rule__OutgoingInformationDef__InformationListAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__InformationListAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOutgoingInformationDefAccess().getInformationListAssignment_5()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__5__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group__6"
    // InternalReqPatDemo.g:2163:1: rule__OutgoingInformationDef__Group__6 : rule__OutgoingInformationDef__Group__6__Impl ;
    public final void rule__OutgoingInformationDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2167:1: ( rule__OutgoingInformationDef__Group__6__Impl )
            // InternalReqPatDemo.g:2168:2: rule__OutgoingInformationDef__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group__6__Impl();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__6"


    // $ANTLR start "rule__OutgoingInformationDef__Group__6__Impl"
    // InternalReqPatDemo.g:2174:1: rule__OutgoingInformationDef__Group__6__Impl : ( ( rule__OutgoingInformationDef__Group_6__0 )* ) ;
    public final void rule__OutgoingInformationDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2178:1: ( ( ( rule__OutgoingInformationDef__Group_6__0 )* ) )
            // InternalReqPatDemo.g:2179:1: ( ( rule__OutgoingInformationDef__Group_6__0 )* )
            {
            // InternalReqPatDemo.g:2179:1: ( ( rule__OutgoingInformationDef__Group_6__0 )* )
            // InternalReqPatDemo.g:2180:1: ( rule__OutgoingInformationDef__Group_6__0 )*
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getGroup_6()); 
            // InternalReqPatDemo.g:2181:1: ( rule__OutgoingInformationDef__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalReqPatDemo.g:2181:2: rule__OutgoingInformationDef__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__OutgoingInformationDef__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOutgoingInformationDefAccess().getGroup_6()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group__6__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group_3__0"
    // InternalReqPatDemo.g:2205:1: rule__OutgoingInformationDef__Group_3__0 : rule__OutgoingInformationDef__Group_3__0__Impl rule__OutgoingInformationDef__Group_3__1 ;
    public final void rule__OutgoingInformationDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2209:1: ( rule__OutgoingInformationDef__Group_3__0__Impl rule__OutgoingInformationDef__Group_3__1 )
            // InternalReqPatDemo.g:2210:2: rule__OutgoingInformationDef__Group_3__0__Impl rule__OutgoingInformationDef__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__OutgoingInformationDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group_3__1();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group_3__0"


    // $ANTLR start "rule__OutgoingInformationDef__Group_3__0__Impl"
    // InternalReqPatDemo.g:2217:1: rule__OutgoingInformationDef__Group_3__0__Impl : ( 'to the functional device' ) ;
    public final void rule__OutgoingInformationDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2221:1: ( ( 'to the functional device' ) )
            // InternalReqPatDemo.g:2222:1: ( 'to the functional device' )
            {
            // InternalReqPatDemo.g:2222:1: ( 'to the functional device' )
            // InternalReqPatDemo.g:2223:1: 'to the functional device'
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getToTheFunctionalDeviceKeyword_3_0()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutgoingInformationDefAccess().getToTheFunctionalDeviceKeyword_3_0()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group_3__0__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group_3__1"
    // InternalReqPatDemo.g:2236:1: rule__OutgoingInformationDef__Group_3__1 : rule__OutgoingInformationDef__Group_3__1__Impl ;
    public final void rule__OutgoingInformationDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2240:1: ( rule__OutgoingInformationDef__Group_3__1__Impl )
            // InternalReqPatDemo.g:2241:2: rule__OutgoingInformationDef__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group_3__1__Impl();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group_3__1"


    // $ANTLR start "rule__OutgoingInformationDef__Group_3__1__Impl"
    // InternalReqPatDemo.g:2247:1: rule__OutgoingInformationDef__Group_3__1__Impl : ( ( rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1 ) ) ;
    public final void rule__OutgoingInformationDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2251:1: ( ( ( rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1 ) ) )
            // InternalReqPatDemo.g:2252:1: ( ( rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1 ) )
            {
            // InternalReqPatDemo.g:2252:1: ( ( rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1 ) )
            // InternalReqPatDemo.g:2253:1: ( rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1 )
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getFunctionalDeviceAssignment_3_1()); 
            // InternalReqPatDemo.g:2254:1: ( rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1 )
            // InternalReqPatDemo.g:2254:2: rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOutgoingInformationDefAccess().getFunctionalDeviceAssignment_3_1()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group_3__1__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group_6__0"
    // InternalReqPatDemo.g:2268:1: rule__OutgoingInformationDef__Group_6__0 : rule__OutgoingInformationDef__Group_6__0__Impl rule__OutgoingInformationDef__Group_6__1 ;
    public final void rule__OutgoingInformationDef__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2272:1: ( rule__OutgoingInformationDef__Group_6__0__Impl rule__OutgoingInformationDef__Group_6__1 )
            // InternalReqPatDemo.g:2273:2: rule__OutgoingInformationDef__Group_6__0__Impl rule__OutgoingInformationDef__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__OutgoingInformationDef__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group_6__1();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group_6__0"


    // $ANTLR start "rule__OutgoingInformationDef__Group_6__0__Impl"
    // InternalReqPatDemo.g:2280:1: rule__OutgoingInformationDef__Group_6__0__Impl : ( ',' ) ;
    public final void rule__OutgoingInformationDef__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2284:1: ( ( ',' ) )
            // InternalReqPatDemo.g:2285:1: ( ',' )
            {
            // InternalReqPatDemo.g:2285:1: ( ',' )
            // InternalReqPatDemo.g:2286:1: ','
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getCommaKeyword_6_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutgoingInformationDefAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group_6__0__Impl"


    // $ANTLR start "rule__OutgoingInformationDef__Group_6__1"
    // InternalReqPatDemo.g:2299:1: rule__OutgoingInformationDef__Group_6__1 : rule__OutgoingInformationDef__Group_6__1__Impl ;
    public final void rule__OutgoingInformationDef__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2303:1: ( rule__OutgoingInformationDef__Group_6__1__Impl )
            // InternalReqPatDemo.g:2304:2: rule__OutgoingInformationDef__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__Group_6__1__Impl();

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
    // $ANTLR end "rule__OutgoingInformationDef__Group_6__1"


    // $ANTLR start "rule__OutgoingInformationDef__Group_6__1__Impl"
    // InternalReqPatDemo.g:2310:1: rule__OutgoingInformationDef__Group_6__1__Impl : ( ( rule__OutgoingInformationDef__InformationListAssignment_6_1 ) ) ;
    public final void rule__OutgoingInformationDef__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2314:1: ( ( ( rule__OutgoingInformationDef__InformationListAssignment_6_1 ) ) )
            // InternalReqPatDemo.g:2315:1: ( ( rule__OutgoingInformationDef__InformationListAssignment_6_1 ) )
            {
            // InternalReqPatDemo.g:2315:1: ( ( rule__OutgoingInformationDef__InformationListAssignment_6_1 ) )
            // InternalReqPatDemo.g:2316:1: ( rule__OutgoingInformationDef__InformationListAssignment_6_1 )
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getInformationListAssignment_6_1()); 
            // InternalReqPatDemo.g:2317:1: ( rule__OutgoingInformationDef__InformationListAssignment_6_1 )
            // InternalReqPatDemo.g:2317:2: rule__OutgoingInformationDef__InformationListAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutgoingInformationDef__InformationListAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOutgoingInformationDefAccess().getInformationListAssignment_6_1()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__Group_6__1__Impl"


    // $ANTLR start "rule__InformationUsage__Group__0"
    // InternalReqPatDemo.g:2331:1: rule__InformationUsage__Group__0 : rule__InformationUsage__Group__0__Impl rule__InformationUsage__Group__1 ;
    public final void rule__InformationUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2335:1: ( rule__InformationUsage__Group__0__Impl rule__InformationUsage__Group__1 )
            // InternalReqPatDemo.g:2336:2: rule__InformationUsage__Group__0__Impl rule__InformationUsage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__InformationUsage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group__1();

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
    // $ANTLR end "rule__InformationUsage__Group__0"


    // $ANTLR start "rule__InformationUsage__Group__0__Impl"
    // InternalReqPatDemo.g:2343:1: rule__InformationUsage__Group__0__Impl : ( () ) ;
    public final void rule__InformationUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2347:1: ( ( () ) )
            // InternalReqPatDemo.g:2348:1: ( () )
            {
            // InternalReqPatDemo.g:2348:1: ( () )
            // InternalReqPatDemo.g:2349:1: ()
            {
             before(grammarAccess.getInformationUsageAccess().getInformationUsageAction_0()); 
            // InternalReqPatDemo.g:2350:1: ()
            // InternalReqPatDemo.g:2352:1: 
            {
            }

             after(grammarAccess.getInformationUsageAccess().getInformationUsageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationUsage__Group__0__Impl"


    // $ANTLR start "rule__InformationUsage__Group__1"
    // InternalReqPatDemo.g:2362:1: rule__InformationUsage__Group__1 : rule__InformationUsage__Group__1__Impl rule__InformationUsage__Group__2 ;
    public final void rule__InformationUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2366:1: ( rule__InformationUsage__Group__1__Impl rule__InformationUsage__Group__2 )
            // InternalReqPatDemo.g:2367:2: rule__InformationUsage__Group__1__Impl rule__InformationUsage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__InformationUsage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group__2();

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
    // $ANTLR end "rule__InformationUsage__Group__1"


    // $ANTLR start "rule__InformationUsage__Group__1__Impl"
    // InternalReqPatDemo.g:2374:1: rule__InformationUsage__Group__1__Impl : ( 'is used by the function' ) ;
    public final void rule__InformationUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2378:1: ( ( 'is used by the function' ) )
            // InternalReqPatDemo.g:2379:1: ( 'is used by the function' )
            {
            // InternalReqPatDemo.g:2379:1: ( 'is used by the function' )
            // InternalReqPatDemo.g:2380:1: 'is used by the function'
            {
             before(grammarAccess.getInformationUsageAccess().getIsUsedByTheFunctionKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationUsageAccess().getIsUsedByTheFunctionKeyword_1()); 

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
    // $ANTLR end "rule__InformationUsage__Group__1__Impl"


    // $ANTLR start "rule__InformationUsage__Group__2"
    // InternalReqPatDemo.g:2393:1: rule__InformationUsage__Group__2 : rule__InformationUsage__Group__2__Impl rule__InformationUsage__Group__3 ;
    public final void rule__InformationUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2397:1: ( rule__InformationUsage__Group__2__Impl rule__InformationUsage__Group__3 )
            // InternalReqPatDemo.g:2398:2: rule__InformationUsage__Group__2__Impl rule__InformationUsage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__InformationUsage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group__3();

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
    // $ANTLR end "rule__InformationUsage__Group__2"


    // $ANTLR start "rule__InformationUsage__Group__2__Impl"
    // InternalReqPatDemo.g:2405:1: rule__InformationUsage__Group__2__Impl : ( ( rule__InformationUsage__AnalysisFunctionAssignment_2 ) ) ;
    public final void rule__InformationUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2409:1: ( ( ( rule__InformationUsage__AnalysisFunctionAssignment_2 ) ) )
            // InternalReqPatDemo.g:2410:1: ( ( rule__InformationUsage__AnalysisFunctionAssignment_2 ) )
            {
            // InternalReqPatDemo.g:2410:1: ( ( rule__InformationUsage__AnalysisFunctionAssignment_2 ) )
            // InternalReqPatDemo.g:2411:1: ( rule__InformationUsage__AnalysisFunctionAssignment_2 )
            {
             before(grammarAccess.getInformationUsageAccess().getAnalysisFunctionAssignment_2()); 
            // InternalReqPatDemo.g:2412:1: ( rule__InformationUsage__AnalysisFunctionAssignment_2 )
            // InternalReqPatDemo.g:2412:2: rule__InformationUsage__AnalysisFunctionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__AnalysisFunctionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInformationUsageAccess().getAnalysisFunctionAssignment_2()); 

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
    // $ANTLR end "rule__InformationUsage__Group__2__Impl"


    // $ANTLR start "rule__InformationUsage__Group__3"
    // InternalReqPatDemo.g:2422:1: rule__InformationUsage__Group__3 : rule__InformationUsage__Group__3__Impl rule__InformationUsage__Group__4 ;
    public final void rule__InformationUsage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2426:1: ( rule__InformationUsage__Group__3__Impl rule__InformationUsage__Group__4 )
            // InternalReqPatDemo.g:2427:2: rule__InformationUsage__Group__3__Impl rule__InformationUsage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__InformationUsage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group__4();

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
    // $ANTLR end "rule__InformationUsage__Group__3"


    // $ANTLR start "rule__InformationUsage__Group__3__Impl"
    // InternalReqPatDemo.g:2434:1: rule__InformationUsage__Group__3__Impl : ( ':' ) ;
    public final void rule__InformationUsage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2438:1: ( ( ':' ) )
            // InternalReqPatDemo.g:2439:1: ( ':' )
            {
            // InternalReqPatDemo.g:2439:1: ( ':' )
            // InternalReqPatDemo.g:2440:1: ':'
            {
             before(grammarAccess.getInformationUsageAccess().getColonKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationUsageAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__InformationUsage__Group__3__Impl"


    // $ANTLR start "rule__InformationUsage__Group__4"
    // InternalReqPatDemo.g:2453:1: rule__InformationUsage__Group__4 : rule__InformationUsage__Group__4__Impl rule__InformationUsage__Group__5 ;
    public final void rule__InformationUsage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2457:1: ( rule__InformationUsage__Group__4__Impl rule__InformationUsage__Group__5 )
            // InternalReqPatDemo.g:2458:2: rule__InformationUsage__Group__4__Impl rule__InformationUsage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__InformationUsage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group__5();

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
    // $ANTLR end "rule__InformationUsage__Group__4"


    // $ANTLR start "rule__InformationUsage__Group__4__Impl"
    // InternalReqPatDemo.g:2465:1: rule__InformationUsage__Group__4__Impl : ( ( rule__InformationUsage__InformationListAssignment_4 ) ) ;
    public final void rule__InformationUsage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2469:1: ( ( ( rule__InformationUsage__InformationListAssignment_4 ) ) )
            // InternalReqPatDemo.g:2470:1: ( ( rule__InformationUsage__InformationListAssignment_4 ) )
            {
            // InternalReqPatDemo.g:2470:1: ( ( rule__InformationUsage__InformationListAssignment_4 ) )
            // InternalReqPatDemo.g:2471:1: ( rule__InformationUsage__InformationListAssignment_4 )
            {
             before(grammarAccess.getInformationUsageAccess().getInformationListAssignment_4()); 
            // InternalReqPatDemo.g:2472:1: ( rule__InformationUsage__InformationListAssignment_4 )
            // InternalReqPatDemo.g:2472:2: rule__InformationUsage__InformationListAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__InformationListAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInformationUsageAccess().getInformationListAssignment_4()); 

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
    // $ANTLR end "rule__InformationUsage__Group__4__Impl"


    // $ANTLR start "rule__InformationUsage__Group__5"
    // InternalReqPatDemo.g:2482:1: rule__InformationUsage__Group__5 : rule__InformationUsage__Group__5__Impl ;
    public final void rule__InformationUsage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2486:1: ( rule__InformationUsage__Group__5__Impl )
            // InternalReqPatDemo.g:2487:2: rule__InformationUsage__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group__5__Impl();

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
    // $ANTLR end "rule__InformationUsage__Group__5"


    // $ANTLR start "rule__InformationUsage__Group__5__Impl"
    // InternalReqPatDemo.g:2493:1: rule__InformationUsage__Group__5__Impl : ( ( rule__InformationUsage__Group_5__0 )* ) ;
    public final void rule__InformationUsage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2497:1: ( ( ( rule__InformationUsage__Group_5__0 )* ) )
            // InternalReqPatDemo.g:2498:1: ( ( rule__InformationUsage__Group_5__0 )* )
            {
            // InternalReqPatDemo.g:2498:1: ( ( rule__InformationUsage__Group_5__0 )* )
            // InternalReqPatDemo.g:2499:1: ( rule__InformationUsage__Group_5__0 )*
            {
             before(grammarAccess.getInformationUsageAccess().getGroup_5()); 
            // InternalReqPatDemo.g:2500:1: ( rule__InformationUsage__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReqPatDemo.g:2500:2: rule__InformationUsage__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__InformationUsage__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInformationUsageAccess().getGroup_5()); 

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
    // $ANTLR end "rule__InformationUsage__Group__5__Impl"


    // $ANTLR start "rule__InformationUsage__Group_5__0"
    // InternalReqPatDemo.g:2522:1: rule__InformationUsage__Group_5__0 : rule__InformationUsage__Group_5__0__Impl rule__InformationUsage__Group_5__1 ;
    public final void rule__InformationUsage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2526:1: ( rule__InformationUsage__Group_5__0__Impl rule__InformationUsage__Group_5__1 )
            // InternalReqPatDemo.g:2527:2: rule__InformationUsage__Group_5__0__Impl rule__InformationUsage__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__InformationUsage__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group_5__1();

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
    // $ANTLR end "rule__InformationUsage__Group_5__0"


    // $ANTLR start "rule__InformationUsage__Group_5__0__Impl"
    // InternalReqPatDemo.g:2534:1: rule__InformationUsage__Group_5__0__Impl : ( ',' ) ;
    public final void rule__InformationUsage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2538:1: ( ( ',' ) )
            // InternalReqPatDemo.g:2539:1: ( ',' )
            {
            // InternalReqPatDemo.g:2539:1: ( ',' )
            // InternalReqPatDemo.g:2540:1: ','
            {
             before(grammarAccess.getInformationUsageAccess().getCommaKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationUsageAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__InformationUsage__Group_5__0__Impl"


    // $ANTLR start "rule__InformationUsage__Group_5__1"
    // InternalReqPatDemo.g:2553:1: rule__InformationUsage__Group_5__1 : rule__InformationUsage__Group_5__1__Impl ;
    public final void rule__InformationUsage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2557:1: ( rule__InformationUsage__Group_5__1__Impl )
            // InternalReqPatDemo.g:2558:2: rule__InformationUsage__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__Group_5__1__Impl();

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
    // $ANTLR end "rule__InformationUsage__Group_5__1"


    // $ANTLR start "rule__InformationUsage__Group_5__1__Impl"
    // InternalReqPatDemo.g:2564:1: rule__InformationUsage__Group_5__1__Impl : ( ( rule__InformationUsage__InformationListAssignment_5_1 ) ) ;
    public final void rule__InformationUsage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2568:1: ( ( ( rule__InformationUsage__InformationListAssignment_5_1 ) ) )
            // InternalReqPatDemo.g:2569:1: ( ( rule__InformationUsage__InformationListAssignment_5_1 ) )
            {
            // InternalReqPatDemo.g:2569:1: ( ( rule__InformationUsage__InformationListAssignment_5_1 ) )
            // InternalReqPatDemo.g:2570:1: ( rule__InformationUsage__InformationListAssignment_5_1 )
            {
             before(grammarAccess.getInformationUsageAccess().getInformationListAssignment_5_1()); 
            // InternalReqPatDemo.g:2571:1: ( rule__InformationUsage__InformationListAssignment_5_1 )
            // InternalReqPatDemo.g:2571:2: rule__InformationUsage__InformationListAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationUsage__InformationListAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInformationUsageAccess().getInformationListAssignment_5_1()); 

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
    // $ANTLR end "rule__InformationUsage__Group_5__1__Impl"


    // $ANTLR start "rule__InformationCreation__Group__0"
    // InternalReqPatDemo.g:2585:1: rule__InformationCreation__Group__0 : rule__InformationCreation__Group__0__Impl rule__InformationCreation__Group__1 ;
    public final void rule__InformationCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2589:1: ( rule__InformationCreation__Group__0__Impl rule__InformationCreation__Group__1 )
            // InternalReqPatDemo.g:2590:2: rule__InformationCreation__Group__0__Impl rule__InformationCreation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__InformationCreation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group__1();

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
    // $ANTLR end "rule__InformationCreation__Group__0"


    // $ANTLR start "rule__InformationCreation__Group__0__Impl"
    // InternalReqPatDemo.g:2597:1: rule__InformationCreation__Group__0__Impl : ( () ) ;
    public final void rule__InformationCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2601:1: ( ( () ) )
            // InternalReqPatDemo.g:2602:1: ( () )
            {
            // InternalReqPatDemo.g:2602:1: ( () )
            // InternalReqPatDemo.g:2603:1: ()
            {
             before(grammarAccess.getInformationCreationAccess().getInformationCreationAction_0()); 
            // InternalReqPatDemo.g:2604:1: ()
            // InternalReqPatDemo.g:2606:1: 
            {
            }

             after(grammarAccess.getInformationCreationAccess().getInformationCreationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InformationCreation__Group__0__Impl"


    // $ANTLR start "rule__InformationCreation__Group__1"
    // InternalReqPatDemo.g:2616:1: rule__InformationCreation__Group__1 : rule__InformationCreation__Group__1__Impl rule__InformationCreation__Group__2 ;
    public final void rule__InformationCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2620:1: ( rule__InformationCreation__Group__1__Impl rule__InformationCreation__Group__2 )
            // InternalReqPatDemo.g:2621:2: rule__InformationCreation__Group__1__Impl rule__InformationCreation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__InformationCreation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group__2();

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
    // $ANTLR end "rule__InformationCreation__Group__1"


    // $ANTLR start "rule__InformationCreation__Group__1__Impl"
    // InternalReqPatDemo.g:2628:1: rule__InformationCreation__Group__1__Impl : ( 'is created by the function' ) ;
    public final void rule__InformationCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2632:1: ( ( 'is created by the function' ) )
            // InternalReqPatDemo.g:2633:1: ( 'is created by the function' )
            {
            // InternalReqPatDemo.g:2633:1: ( 'is created by the function' )
            // InternalReqPatDemo.g:2634:1: 'is created by the function'
            {
             before(grammarAccess.getInformationCreationAccess().getIsCreatedByTheFunctionKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationCreationAccess().getIsCreatedByTheFunctionKeyword_1()); 

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
    // $ANTLR end "rule__InformationCreation__Group__1__Impl"


    // $ANTLR start "rule__InformationCreation__Group__2"
    // InternalReqPatDemo.g:2647:1: rule__InformationCreation__Group__2 : rule__InformationCreation__Group__2__Impl rule__InformationCreation__Group__3 ;
    public final void rule__InformationCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2651:1: ( rule__InformationCreation__Group__2__Impl rule__InformationCreation__Group__3 )
            // InternalReqPatDemo.g:2652:2: rule__InformationCreation__Group__2__Impl rule__InformationCreation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__InformationCreation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group__3();

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
    // $ANTLR end "rule__InformationCreation__Group__2"


    // $ANTLR start "rule__InformationCreation__Group__2__Impl"
    // InternalReqPatDemo.g:2659:1: rule__InformationCreation__Group__2__Impl : ( ( rule__InformationCreation__AnalysisFunctionAssignment_2 ) ) ;
    public final void rule__InformationCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2663:1: ( ( ( rule__InformationCreation__AnalysisFunctionAssignment_2 ) ) )
            // InternalReqPatDemo.g:2664:1: ( ( rule__InformationCreation__AnalysisFunctionAssignment_2 ) )
            {
            // InternalReqPatDemo.g:2664:1: ( ( rule__InformationCreation__AnalysisFunctionAssignment_2 ) )
            // InternalReqPatDemo.g:2665:1: ( rule__InformationCreation__AnalysisFunctionAssignment_2 )
            {
             before(grammarAccess.getInformationCreationAccess().getAnalysisFunctionAssignment_2()); 
            // InternalReqPatDemo.g:2666:1: ( rule__InformationCreation__AnalysisFunctionAssignment_2 )
            // InternalReqPatDemo.g:2666:2: rule__InformationCreation__AnalysisFunctionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__AnalysisFunctionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInformationCreationAccess().getAnalysisFunctionAssignment_2()); 

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
    // $ANTLR end "rule__InformationCreation__Group__2__Impl"


    // $ANTLR start "rule__InformationCreation__Group__3"
    // InternalReqPatDemo.g:2676:1: rule__InformationCreation__Group__3 : rule__InformationCreation__Group__3__Impl rule__InformationCreation__Group__4 ;
    public final void rule__InformationCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2680:1: ( rule__InformationCreation__Group__3__Impl rule__InformationCreation__Group__4 )
            // InternalReqPatDemo.g:2681:2: rule__InformationCreation__Group__3__Impl rule__InformationCreation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__InformationCreation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group__4();

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
    // $ANTLR end "rule__InformationCreation__Group__3"


    // $ANTLR start "rule__InformationCreation__Group__3__Impl"
    // InternalReqPatDemo.g:2688:1: rule__InformationCreation__Group__3__Impl : ( ':' ) ;
    public final void rule__InformationCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2692:1: ( ( ':' ) )
            // InternalReqPatDemo.g:2693:1: ( ':' )
            {
            // InternalReqPatDemo.g:2693:1: ( ':' )
            // InternalReqPatDemo.g:2694:1: ':'
            {
             before(grammarAccess.getInformationCreationAccess().getColonKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationCreationAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__InformationCreation__Group__3__Impl"


    // $ANTLR start "rule__InformationCreation__Group__4"
    // InternalReqPatDemo.g:2707:1: rule__InformationCreation__Group__4 : rule__InformationCreation__Group__4__Impl rule__InformationCreation__Group__5 ;
    public final void rule__InformationCreation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2711:1: ( rule__InformationCreation__Group__4__Impl rule__InformationCreation__Group__5 )
            // InternalReqPatDemo.g:2712:2: rule__InformationCreation__Group__4__Impl rule__InformationCreation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__InformationCreation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group__5();

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
    // $ANTLR end "rule__InformationCreation__Group__4"


    // $ANTLR start "rule__InformationCreation__Group__4__Impl"
    // InternalReqPatDemo.g:2719:1: rule__InformationCreation__Group__4__Impl : ( ( rule__InformationCreation__InformationListAssignment_4 ) ) ;
    public final void rule__InformationCreation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2723:1: ( ( ( rule__InformationCreation__InformationListAssignment_4 ) ) )
            // InternalReqPatDemo.g:2724:1: ( ( rule__InformationCreation__InformationListAssignment_4 ) )
            {
            // InternalReqPatDemo.g:2724:1: ( ( rule__InformationCreation__InformationListAssignment_4 ) )
            // InternalReqPatDemo.g:2725:1: ( rule__InformationCreation__InformationListAssignment_4 )
            {
             before(grammarAccess.getInformationCreationAccess().getInformationListAssignment_4()); 
            // InternalReqPatDemo.g:2726:1: ( rule__InformationCreation__InformationListAssignment_4 )
            // InternalReqPatDemo.g:2726:2: rule__InformationCreation__InformationListAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__InformationListAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInformationCreationAccess().getInformationListAssignment_4()); 

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
    // $ANTLR end "rule__InformationCreation__Group__4__Impl"


    // $ANTLR start "rule__InformationCreation__Group__5"
    // InternalReqPatDemo.g:2736:1: rule__InformationCreation__Group__5 : rule__InformationCreation__Group__5__Impl ;
    public final void rule__InformationCreation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2740:1: ( rule__InformationCreation__Group__5__Impl )
            // InternalReqPatDemo.g:2741:2: rule__InformationCreation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group__5__Impl();

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
    // $ANTLR end "rule__InformationCreation__Group__5"


    // $ANTLR start "rule__InformationCreation__Group__5__Impl"
    // InternalReqPatDemo.g:2747:1: rule__InformationCreation__Group__5__Impl : ( ( rule__InformationCreation__Group_5__0 )* ) ;
    public final void rule__InformationCreation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2751:1: ( ( ( rule__InformationCreation__Group_5__0 )* ) )
            // InternalReqPatDemo.g:2752:1: ( ( rule__InformationCreation__Group_5__0 )* )
            {
            // InternalReqPatDemo.g:2752:1: ( ( rule__InformationCreation__Group_5__0 )* )
            // InternalReqPatDemo.g:2753:1: ( rule__InformationCreation__Group_5__0 )*
            {
             before(grammarAccess.getInformationCreationAccess().getGroup_5()); 
            // InternalReqPatDemo.g:2754:1: ( rule__InformationCreation__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReqPatDemo.g:2754:2: rule__InformationCreation__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__InformationCreation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getInformationCreationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__InformationCreation__Group__5__Impl"


    // $ANTLR start "rule__InformationCreation__Group_5__0"
    // InternalReqPatDemo.g:2776:1: rule__InformationCreation__Group_5__0 : rule__InformationCreation__Group_5__0__Impl rule__InformationCreation__Group_5__1 ;
    public final void rule__InformationCreation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2780:1: ( rule__InformationCreation__Group_5__0__Impl rule__InformationCreation__Group_5__1 )
            // InternalReqPatDemo.g:2781:2: rule__InformationCreation__Group_5__0__Impl rule__InformationCreation__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__InformationCreation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group_5__1();

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
    // $ANTLR end "rule__InformationCreation__Group_5__0"


    // $ANTLR start "rule__InformationCreation__Group_5__0__Impl"
    // InternalReqPatDemo.g:2788:1: rule__InformationCreation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__InformationCreation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2792:1: ( ( ',' ) )
            // InternalReqPatDemo.g:2793:1: ( ',' )
            {
            // InternalReqPatDemo.g:2793:1: ( ',' )
            // InternalReqPatDemo.g:2794:1: ','
            {
             before(grammarAccess.getInformationCreationAccess().getCommaKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationCreationAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__InformationCreation__Group_5__0__Impl"


    // $ANTLR start "rule__InformationCreation__Group_5__1"
    // InternalReqPatDemo.g:2807:1: rule__InformationCreation__Group_5__1 : rule__InformationCreation__Group_5__1__Impl ;
    public final void rule__InformationCreation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2811:1: ( rule__InformationCreation__Group_5__1__Impl )
            // InternalReqPatDemo.g:2812:2: rule__InformationCreation__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__Group_5__1__Impl();

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
    // $ANTLR end "rule__InformationCreation__Group_5__1"


    // $ANTLR start "rule__InformationCreation__Group_5__1__Impl"
    // InternalReqPatDemo.g:2818:1: rule__InformationCreation__Group_5__1__Impl : ( ( rule__InformationCreation__InformationListAssignment_5_1 ) ) ;
    public final void rule__InformationCreation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2822:1: ( ( ( rule__InformationCreation__InformationListAssignment_5_1 ) ) )
            // InternalReqPatDemo.g:2823:1: ( ( rule__InformationCreation__InformationListAssignment_5_1 ) )
            {
            // InternalReqPatDemo.g:2823:1: ( ( rule__InformationCreation__InformationListAssignment_5_1 ) )
            // InternalReqPatDemo.g:2824:1: ( rule__InformationCreation__InformationListAssignment_5_1 )
            {
             before(grammarAccess.getInformationCreationAccess().getInformationListAssignment_5_1()); 
            // InternalReqPatDemo.g:2825:1: ( rule__InformationCreation__InformationListAssignment_5_1 )
            // InternalReqPatDemo.g:2825:2: rule__InformationCreation__InformationListAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InformationCreation__InformationListAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInformationCreationAccess().getInformationListAssignment_5_1()); 

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
    // $ANTLR end "rule__InformationCreation__Group_5__1__Impl"


    // $ANTLR start "rule__AnalysisFunction__Group__0"
    // InternalReqPatDemo.g:2839:1: rule__AnalysisFunction__Group__0 : rule__AnalysisFunction__Group__0__Impl rule__AnalysisFunction__Group__1 ;
    public final void rule__AnalysisFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2843:1: ( rule__AnalysisFunction__Group__0__Impl rule__AnalysisFunction__Group__1 )
            // InternalReqPatDemo.g:2844:2: rule__AnalysisFunction__Group__0__Impl rule__AnalysisFunction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AnalysisFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunction__Group__1();

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
    // $ANTLR end "rule__AnalysisFunction__Group__0"


    // $ANTLR start "rule__AnalysisFunction__Group__0__Impl"
    // InternalReqPatDemo.g:2851:1: rule__AnalysisFunction__Group__0__Impl : ( () ) ;
    public final void rule__AnalysisFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2855:1: ( ( () ) )
            // InternalReqPatDemo.g:2856:1: ( () )
            {
            // InternalReqPatDemo.g:2856:1: ( () )
            // InternalReqPatDemo.g:2857:1: ()
            {
             before(grammarAccess.getAnalysisFunctionAccess().getAnalysisFunctionAction_0()); 
            // InternalReqPatDemo.g:2858:1: ()
            // InternalReqPatDemo.g:2860:1: 
            {
            }

             after(grammarAccess.getAnalysisFunctionAccess().getAnalysisFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalysisFunction__Group__0__Impl"


    // $ANTLR start "rule__AnalysisFunction__Group__1"
    // InternalReqPatDemo.g:2870:1: rule__AnalysisFunction__Group__1 : rule__AnalysisFunction__Group__1__Impl ;
    public final void rule__AnalysisFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2874:1: ( rule__AnalysisFunction__Group__1__Impl )
            // InternalReqPatDemo.g:2875:2: rule__AnalysisFunction__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunction__Group__1__Impl();

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
    // $ANTLR end "rule__AnalysisFunction__Group__1"


    // $ANTLR start "rule__AnalysisFunction__Group__1__Impl"
    // InternalReqPatDemo.g:2881:1: rule__AnalysisFunction__Group__1__Impl : ( ( rule__AnalysisFunction__NameAssignment_1 ) ) ;
    public final void rule__AnalysisFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2885:1: ( ( ( rule__AnalysisFunction__NameAssignment_1 ) ) )
            // InternalReqPatDemo.g:2886:1: ( ( rule__AnalysisFunction__NameAssignment_1 ) )
            {
            // InternalReqPatDemo.g:2886:1: ( ( rule__AnalysisFunction__NameAssignment_1 ) )
            // InternalReqPatDemo.g:2887:1: ( rule__AnalysisFunction__NameAssignment_1 )
            {
             before(grammarAccess.getAnalysisFunctionAccess().getNameAssignment_1()); 
            // InternalReqPatDemo.g:2888:1: ( rule__AnalysisFunction__NameAssignment_1 )
            // InternalReqPatDemo.g:2888:2: rule__AnalysisFunction__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnalysisFunction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnalysisFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AnalysisFunction__Group__1__Impl"


    // $ANTLR start "rule__Information__Group__0"
    // InternalReqPatDemo.g:2902:1: rule__Information__Group__0 : rule__Information__Group__0__Impl rule__Information__Group__1 ;
    public final void rule__Information__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2906:1: ( rule__Information__Group__0__Impl rule__Information__Group__1 )
            // InternalReqPatDemo.g:2907:2: rule__Information__Group__0__Impl rule__Information__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Information__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Information__Group__1();

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
    // $ANTLR end "rule__Information__Group__0"


    // $ANTLR start "rule__Information__Group__0__Impl"
    // InternalReqPatDemo.g:2914:1: rule__Information__Group__0__Impl : ( () ) ;
    public final void rule__Information__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2918:1: ( ( () ) )
            // InternalReqPatDemo.g:2919:1: ( () )
            {
            // InternalReqPatDemo.g:2919:1: ( () )
            // InternalReqPatDemo.g:2920:1: ()
            {
             before(grammarAccess.getInformationAccess().getInformationAction_0()); 
            // InternalReqPatDemo.g:2921:1: ()
            // InternalReqPatDemo.g:2923:1: 
            {
            }

             after(grammarAccess.getInformationAccess().getInformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Information__Group__0__Impl"


    // $ANTLR start "rule__Information__Group__1"
    // InternalReqPatDemo.g:2933:1: rule__Information__Group__1 : rule__Information__Group__1__Impl ;
    public final void rule__Information__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2937:1: ( rule__Information__Group__1__Impl )
            // InternalReqPatDemo.g:2938:2: rule__Information__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Information__Group__1__Impl();

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
    // $ANTLR end "rule__Information__Group__1"


    // $ANTLR start "rule__Information__Group__1__Impl"
    // InternalReqPatDemo.g:2944:1: rule__Information__Group__1__Impl : ( ( rule__Information__NameAssignment_1 ) ) ;
    public final void rule__Information__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2948:1: ( ( ( rule__Information__NameAssignment_1 ) ) )
            // InternalReqPatDemo.g:2949:1: ( ( rule__Information__NameAssignment_1 ) )
            {
            // InternalReqPatDemo.g:2949:1: ( ( rule__Information__NameAssignment_1 ) )
            // InternalReqPatDemo.g:2950:1: ( rule__Information__NameAssignment_1 )
            {
             before(grammarAccess.getInformationAccess().getNameAssignment_1()); 
            // InternalReqPatDemo.g:2951:1: ( rule__Information__NameAssignment_1 )
            // InternalReqPatDemo.g:2951:2: rule__Information__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Information__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInformationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Information__Group__1__Impl"


    // $ANTLR start "rule__SpecObj__Group__0"
    // InternalReqPatDemo.g:2965:1: rule__SpecObj__Group__0 : rule__SpecObj__Group__0__Impl rule__SpecObj__Group__1 ;
    public final void rule__SpecObj__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2969:1: ( rule__SpecObj__Group__0__Impl rule__SpecObj__Group__1 )
            // InternalReqPatDemo.g:2970:2: rule__SpecObj__Group__0__Impl rule__SpecObj__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__SpecObj__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:2977:1: rule__SpecObj__Group__0__Impl : ( RULE_SPECOBJECTDELIMITERLEFT ) ;
    public final void rule__SpecObj__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2981:1: ( ( RULE_SPECOBJECTDELIMITERLEFT ) )
            // InternalReqPatDemo.g:2982:1: ( RULE_SPECOBJECTDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:2982:1: ( RULE_SPECOBJECTDELIMITERLEFT )
            // InternalReqPatDemo.g:2983:1: RULE_SPECOBJECTDELIMITERLEFT
            {
             before(grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERLEFTTerminalRuleCall_0()); 
            match(input,RULE_SPECOBJECTDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:2994:1: rule__SpecObj__Group__1 : rule__SpecObj__Group__1__Impl rule__SpecObj__Group__2 ;
    public final void rule__SpecObj__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:2998:1: ( rule__SpecObj__Group__1__Impl rule__SpecObj__Group__2 )
            // InternalReqPatDemo.g:2999:2: rule__SpecObj__Group__1__Impl rule__SpecObj__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__SpecObj__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3006:1: rule__SpecObj__Group__1__Impl : ( ( rule__SpecObj__Alternatives_1 ) ) ;
    public final void rule__SpecObj__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3010:1: ( ( ( rule__SpecObj__Alternatives_1 ) ) )
            // InternalReqPatDemo.g:3011:1: ( ( rule__SpecObj__Alternatives_1 ) )
            {
            // InternalReqPatDemo.g:3011:1: ( ( rule__SpecObj__Alternatives_1 ) )
            // InternalReqPatDemo.g:3012:1: ( rule__SpecObj__Alternatives_1 )
            {
             before(grammarAccess.getSpecObjAccess().getAlternatives_1()); 
            // InternalReqPatDemo.g:3013:1: ( rule__SpecObj__Alternatives_1 )
            // InternalReqPatDemo.g:3013:2: rule__SpecObj__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3023:1: rule__SpecObj__Group__2 : rule__SpecObj__Group__2__Impl ;
    public final void rule__SpecObj__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3027:1: ( rule__SpecObj__Group__2__Impl )
            // InternalReqPatDemo.g:3028:2: rule__SpecObj__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3034:1: rule__SpecObj__Group__2__Impl : ( RULE_SPECOBJECTDELIMITERRIGHT ) ;
    public final void rule__SpecObj__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3038:1: ( ( RULE_SPECOBJECTDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:3039:1: ( RULE_SPECOBJECTDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:3039:1: ( RULE_SPECOBJECTDELIMITERRIGHT )
            // InternalReqPatDemo.g:3040:1: RULE_SPECOBJECTDELIMITERRIGHT
            {
             before(grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERRIGHTTerminalRuleCall_2()); 
            match(input,RULE_SPECOBJECTDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3057:1: rule__HeadingSO__Group__0 : rule__HeadingSO__Group__0__Impl rule__HeadingSO__Group__1 ;
    public final void rule__HeadingSO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3061:1: ( rule__HeadingSO__Group__0__Impl rule__HeadingSO__Group__1 )
            // InternalReqPatDemo.g:3062:2: rule__HeadingSO__Group__0__Impl rule__HeadingSO__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__HeadingSO__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3069:1: rule__HeadingSO__Group__0__Impl : ( () ) ;
    public final void rule__HeadingSO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3073:1: ( ( () ) )
            // InternalReqPatDemo.g:3074:1: ( () )
            {
            // InternalReqPatDemo.g:3074:1: ( () )
            // InternalReqPatDemo.g:3075:1: ()
            {
             before(grammarAccess.getHeadingSOAccess().getHeadingSpecObjectAction_0()); 
            // InternalReqPatDemo.g:3076:1: ()
            // InternalReqPatDemo.g:3078:1: 
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
    // InternalReqPatDemo.g:3088:1: rule__HeadingSO__Group__1 : rule__HeadingSO__Group__1__Impl rule__HeadingSO__Group__2 ;
    public final void rule__HeadingSO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3092:1: ( rule__HeadingSO__Group__1__Impl rule__HeadingSO__Group__2 )
            // InternalReqPatDemo.g:3093:2: rule__HeadingSO__Group__1__Impl rule__HeadingSO__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__HeadingSO__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3100:1: rule__HeadingSO__Group__1__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__HeadingSO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3104:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:3105:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:3105:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:3106:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3117:1: rule__HeadingSO__Group__2 : rule__HeadingSO__Group__2__Impl rule__HeadingSO__Group__3 ;
    public final void rule__HeadingSO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3121:1: ( rule__HeadingSO__Group__2__Impl rule__HeadingSO__Group__3 )
            // InternalReqPatDemo.g:3122:2: rule__HeadingSO__Group__2__Impl rule__HeadingSO__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__HeadingSO__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3129:1: rule__HeadingSO__Group__2__Impl : ( 'H' ) ;
    public final void rule__HeadingSO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3133:1: ( ( 'H' ) )
            // InternalReqPatDemo.g:3134:1: ( 'H' )
            {
            // InternalReqPatDemo.g:3134:1: ( 'H' )
            // InternalReqPatDemo.g:3135:1: 'H'
            {
             before(grammarAccess.getHeadingSOAccess().getHKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3148:1: rule__HeadingSO__Group__3 : rule__HeadingSO__Group__3__Impl rule__HeadingSO__Group__4 ;
    public final void rule__HeadingSO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3152:1: ( rule__HeadingSO__Group__3__Impl rule__HeadingSO__Group__4 )
            // InternalReqPatDemo.g:3153:2: rule__HeadingSO__Group__3__Impl rule__HeadingSO__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__HeadingSO__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3160:1: rule__HeadingSO__Group__3__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__HeadingSO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3164:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:3165:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:3165:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:3166:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3177:1: rule__HeadingSO__Group__4 : rule__HeadingSO__Group__4__Impl rule__HeadingSO__Group__5 ;
    public final void rule__HeadingSO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3181:1: ( rule__HeadingSO__Group__4__Impl rule__HeadingSO__Group__5 )
            // InternalReqPatDemo.g:3182:2: rule__HeadingSO__Group__4__Impl rule__HeadingSO__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__HeadingSO__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3189:1: rule__HeadingSO__Group__4__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__HeadingSO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3193:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:3194:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:3194:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:3195:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3206:1: rule__HeadingSO__Group__5 : rule__HeadingSO__Group__5__Impl rule__HeadingSO__Group__6 ;
    public final void rule__HeadingSO__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3210:1: ( rule__HeadingSO__Group__5__Impl rule__HeadingSO__Group__6 )
            // InternalReqPatDemo.g:3211:2: rule__HeadingSO__Group__5__Impl rule__HeadingSO__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__HeadingSO__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3218:1: rule__HeadingSO__Group__5__Impl : ( ( rule__HeadingSO__IdAssignment_5 ) ) ;
    public final void rule__HeadingSO__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3222:1: ( ( ( rule__HeadingSO__IdAssignment_5 ) ) )
            // InternalReqPatDemo.g:3223:1: ( ( rule__HeadingSO__IdAssignment_5 ) )
            {
            // InternalReqPatDemo.g:3223:1: ( ( rule__HeadingSO__IdAssignment_5 ) )
            // InternalReqPatDemo.g:3224:1: ( rule__HeadingSO__IdAssignment_5 )
            {
             before(grammarAccess.getHeadingSOAccess().getIdAssignment_5()); 
            // InternalReqPatDemo.g:3225:1: ( rule__HeadingSO__IdAssignment_5 )
            // InternalReqPatDemo.g:3225:2: rule__HeadingSO__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3235:1: rule__HeadingSO__Group__6 : rule__HeadingSO__Group__6__Impl rule__HeadingSO__Group__7 ;
    public final void rule__HeadingSO__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3239:1: ( rule__HeadingSO__Group__6__Impl rule__HeadingSO__Group__7 )
            // InternalReqPatDemo.g:3240:2: rule__HeadingSO__Group__6__Impl rule__HeadingSO__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__HeadingSO__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3247:1: rule__HeadingSO__Group__6__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__HeadingSO__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3251:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:3252:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:3252:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:3253:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3264:1: rule__HeadingSO__Group__7 : rule__HeadingSO__Group__7__Impl rule__HeadingSO__Group__8 ;
    public final void rule__HeadingSO__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3268:1: ( rule__HeadingSO__Group__7__Impl rule__HeadingSO__Group__8 )
            // InternalReqPatDemo.g:3269:2: rule__HeadingSO__Group__7__Impl rule__HeadingSO__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__HeadingSO__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3276:1: rule__HeadingSO__Group__7__Impl : ( ( rule__HeadingSO__Group_7__0 )? ) ;
    public final void rule__HeadingSO__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3280:1: ( ( ( rule__HeadingSO__Group_7__0 )? ) )
            // InternalReqPatDemo.g:3281:1: ( ( rule__HeadingSO__Group_7__0 )? )
            {
            // InternalReqPatDemo.g:3281:1: ( ( rule__HeadingSO__Group_7__0 )? )
            // InternalReqPatDemo.g:3282:1: ( rule__HeadingSO__Group_7__0 )?
            {
             before(grammarAccess.getHeadingSOAccess().getGroup_7()); 
            // InternalReqPatDemo.g:3283:1: ( rule__HeadingSO__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_PARAMDELIMITERLEFT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReqPatDemo.g:3283:2: rule__HeadingSO__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3293:1: rule__HeadingSO__Group__8 : rule__HeadingSO__Group__8__Impl ;
    public final void rule__HeadingSO__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3297:1: ( rule__HeadingSO__Group__8__Impl )
            // InternalReqPatDemo.g:3298:2: rule__HeadingSO__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3304:1: rule__HeadingSO__Group__8__Impl : ( ( rule__HeadingSO__TextAssignment_8 ) ) ;
    public final void rule__HeadingSO__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3308:1: ( ( ( rule__HeadingSO__TextAssignment_8 ) ) )
            // InternalReqPatDemo.g:3309:1: ( ( rule__HeadingSO__TextAssignment_8 ) )
            {
            // InternalReqPatDemo.g:3309:1: ( ( rule__HeadingSO__TextAssignment_8 ) )
            // InternalReqPatDemo.g:3310:1: ( rule__HeadingSO__TextAssignment_8 )
            {
             before(grammarAccess.getHeadingSOAccess().getTextAssignment_8()); 
            // InternalReqPatDemo.g:3311:1: ( rule__HeadingSO__TextAssignment_8 )
            // InternalReqPatDemo.g:3311:2: rule__HeadingSO__TextAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3339:1: rule__HeadingSO__Group_7__0 : rule__HeadingSO__Group_7__0__Impl rule__HeadingSO__Group_7__1 ;
    public final void rule__HeadingSO__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3343:1: ( rule__HeadingSO__Group_7__0__Impl rule__HeadingSO__Group_7__1 )
            // InternalReqPatDemo.g:3344:2: rule__HeadingSO__Group_7__0__Impl rule__HeadingSO__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__HeadingSO__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3351:1: rule__HeadingSO__Group_7__0__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__HeadingSO__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3355:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:3356:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:3356:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:3357:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3368:1: rule__HeadingSO__Group_7__1 : rule__HeadingSO__Group_7__1__Impl rule__HeadingSO__Group_7__2 ;
    public final void rule__HeadingSO__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3372:1: ( rule__HeadingSO__Group_7__1__Impl rule__HeadingSO__Group_7__2 )
            // InternalReqPatDemo.g:3373:2: rule__HeadingSO__Group_7__1__Impl rule__HeadingSO__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__HeadingSO__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3380:1: rule__HeadingSO__Group_7__1__Impl : ( ( rule__HeadingSO__ParentAssignment_7_1 ) ) ;
    public final void rule__HeadingSO__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3384:1: ( ( ( rule__HeadingSO__ParentAssignment_7_1 ) ) )
            // InternalReqPatDemo.g:3385:1: ( ( rule__HeadingSO__ParentAssignment_7_1 ) )
            {
            // InternalReqPatDemo.g:3385:1: ( ( rule__HeadingSO__ParentAssignment_7_1 ) )
            // InternalReqPatDemo.g:3386:1: ( rule__HeadingSO__ParentAssignment_7_1 )
            {
             before(grammarAccess.getHeadingSOAccess().getParentAssignment_7_1()); 
            // InternalReqPatDemo.g:3387:1: ( rule__HeadingSO__ParentAssignment_7_1 )
            // InternalReqPatDemo.g:3387:2: rule__HeadingSO__ParentAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3397:1: rule__HeadingSO__Group_7__2 : rule__HeadingSO__Group_7__2__Impl ;
    public final void rule__HeadingSO__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3401:1: ( rule__HeadingSO__Group_7__2__Impl )
            // InternalReqPatDemo.g:3402:2: rule__HeadingSO__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3408:1: rule__HeadingSO__Group_7__2__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__HeadingSO__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3412:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:3413:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:3413:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:3414:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3431:1: rule__ReqPatSO__Group__0 : rule__ReqPatSO__Group__0__Impl rule__ReqPatSO__Group__1 ;
    public final void rule__ReqPatSO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3435:1: ( rule__ReqPatSO__Group__0__Impl rule__ReqPatSO__Group__1 )
            // InternalReqPatDemo.g:3436:2: rule__ReqPatSO__Group__0__Impl rule__ReqPatSO__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ReqPatSO__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3443:1: rule__ReqPatSO__Group__0__Impl : ( () ) ;
    public final void rule__ReqPatSO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3447:1: ( ( () ) )
            // InternalReqPatDemo.g:3448:1: ( () )
            {
            // InternalReqPatDemo.g:3448:1: ( () )
            // InternalReqPatDemo.g:3449:1: ()
            {
             before(grammarAccess.getReqPatSOAccess().getRequirementPatternSpecObjectAction_0()); 
            // InternalReqPatDemo.g:3450:1: ()
            // InternalReqPatDemo.g:3452:1: 
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
    // InternalReqPatDemo.g:3462:1: rule__ReqPatSO__Group__1 : rule__ReqPatSO__Group__1__Impl rule__ReqPatSO__Group__2 ;
    public final void rule__ReqPatSO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3466:1: ( rule__ReqPatSO__Group__1__Impl rule__ReqPatSO__Group__2 )
            // InternalReqPatDemo.g:3467:2: rule__ReqPatSO__Group__1__Impl rule__ReqPatSO__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__ReqPatSO__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3474:1: rule__ReqPatSO__Group__1__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__ReqPatSO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3478:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:3479:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:3479:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:3480:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3491:1: rule__ReqPatSO__Group__2 : rule__ReqPatSO__Group__2__Impl rule__ReqPatSO__Group__3 ;
    public final void rule__ReqPatSO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3495:1: ( rule__ReqPatSO__Group__2__Impl rule__ReqPatSO__Group__3 )
            // InternalReqPatDemo.g:3496:2: rule__ReqPatSO__Group__2__Impl rule__ReqPatSO__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__ReqPatSO__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3503:1: rule__ReqPatSO__Group__2__Impl : ( 'RP' ) ;
    public final void rule__ReqPatSO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3507:1: ( ( 'RP' ) )
            // InternalReqPatDemo.g:3508:1: ( 'RP' )
            {
            // InternalReqPatDemo.g:3508:1: ( 'RP' )
            // InternalReqPatDemo.g:3509:1: 'RP'
            {
             before(grammarAccess.getReqPatSOAccess().getRPKeyword_2()); 
            match(input,31,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3522:1: rule__ReqPatSO__Group__3 : rule__ReqPatSO__Group__3__Impl rule__ReqPatSO__Group__4 ;
    public final void rule__ReqPatSO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3526:1: ( rule__ReqPatSO__Group__3__Impl rule__ReqPatSO__Group__4 )
            // InternalReqPatDemo.g:3527:2: rule__ReqPatSO__Group__3__Impl rule__ReqPatSO__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ReqPatSO__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3534:1: rule__ReqPatSO__Group__3__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__ReqPatSO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3538:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:3539:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:3539:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:3540:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3551:1: rule__ReqPatSO__Group__4 : rule__ReqPatSO__Group__4__Impl rule__ReqPatSO__Group__5 ;
    public final void rule__ReqPatSO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3555:1: ( rule__ReqPatSO__Group__4__Impl rule__ReqPatSO__Group__5 )
            // InternalReqPatDemo.g:3556:2: rule__ReqPatSO__Group__4__Impl rule__ReqPatSO__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ReqPatSO__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3563:1: rule__ReqPatSO__Group__4__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__ReqPatSO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3567:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:3568:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:3568:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:3569:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3580:1: rule__ReqPatSO__Group__5 : rule__ReqPatSO__Group__5__Impl rule__ReqPatSO__Group__6 ;
    public final void rule__ReqPatSO__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3584:1: ( rule__ReqPatSO__Group__5__Impl rule__ReqPatSO__Group__6 )
            // InternalReqPatDemo.g:3585:2: rule__ReqPatSO__Group__5__Impl rule__ReqPatSO__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__ReqPatSO__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3592:1: rule__ReqPatSO__Group__5__Impl : ( ( rule__ReqPatSO__IdAssignment_5 ) ) ;
    public final void rule__ReqPatSO__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3596:1: ( ( ( rule__ReqPatSO__IdAssignment_5 ) ) )
            // InternalReqPatDemo.g:3597:1: ( ( rule__ReqPatSO__IdAssignment_5 ) )
            {
            // InternalReqPatDemo.g:3597:1: ( ( rule__ReqPatSO__IdAssignment_5 ) )
            // InternalReqPatDemo.g:3598:1: ( rule__ReqPatSO__IdAssignment_5 )
            {
             before(grammarAccess.getReqPatSOAccess().getIdAssignment_5()); 
            // InternalReqPatDemo.g:3599:1: ( rule__ReqPatSO__IdAssignment_5 )
            // InternalReqPatDemo.g:3599:2: rule__ReqPatSO__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3609:1: rule__ReqPatSO__Group__6 : rule__ReqPatSO__Group__6__Impl rule__ReqPatSO__Group__7 ;
    public final void rule__ReqPatSO__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3613:1: ( rule__ReqPatSO__Group__6__Impl rule__ReqPatSO__Group__7 )
            // InternalReqPatDemo.g:3614:2: rule__ReqPatSO__Group__6__Impl rule__ReqPatSO__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__ReqPatSO__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3621:1: rule__ReqPatSO__Group__6__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__ReqPatSO__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3625:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:3626:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:3626:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:3627:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3638:1: rule__ReqPatSO__Group__7 : rule__ReqPatSO__Group__7__Impl rule__ReqPatSO__Group__8 ;
    public final void rule__ReqPatSO__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3642:1: ( rule__ReqPatSO__Group__7__Impl rule__ReqPatSO__Group__8 )
            // InternalReqPatDemo.g:3643:2: rule__ReqPatSO__Group__7__Impl rule__ReqPatSO__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__ReqPatSO__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3650:1: rule__ReqPatSO__Group__7__Impl : ( ( rule__ReqPatSO__Group_7__0 )? ) ;
    public final void rule__ReqPatSO__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3654:1: ( ( ( rule__ReqPatSO__Group_7__0 )? ) )
            // InternalReqPatDemo.g:3655:1: ( ( rule__ReqPatSO__Group_7__0 )? )
            {
            // InternalReqPatDemo.g:3655:1: ( ( rule__ReqPatSO__Group_7__0 )? )
            // InternalReqPatDemo.g:3656:1: ( rule__ReqPatSO__Group_7__0 )?
            {
             before(grammarAccess.getReqPatSOAccess().getGroup_7()); 
            // InternalReqPatDemo.g:3657:1: ( rule__ReqPatSO__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_PARAMDELIMITERLEFT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReqPatDemo.g:3657:2: rule__ReqPatSO__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3667:1: rule__ReqPatSO__Group__8 : rule__ReqPatSO__Group__8__Impl ;
    public final void rule__ReqPatSO__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3671:1: ( rule__ReqPatSO__Group__8__Impl )
            // InternalReqPatDemo.g:3672:2: rule__ReqPatSO__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3678:1: rule__ReqPatSO__Group__8__Impl : ( ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* ) ) ;
    public final void rule__ReqPatSO__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3682:1: ( ( ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* ) ) )
            // InternalReqPatDemo.g:3683:1: ( ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* ) )
            {
            // InternalReqPatDemo.g:3683:1: ( ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* ) )
            // InternalReqPatDemo.g:3684:1: ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) ) ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* )
            {
            // InternalReqPatDemo.g:3684:1: ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 ) )
            // InternalReqPatDemo.g:3685:1: ( rule__ReqPatSO__RequirementPatternsAssignment_8 )
            {
             before(grammarAccess.getReqPatSOAccess().getRequirementPatternsAssignment_8()); 
            // InternalReqPatDemo.g:3686:1: ( rule__ReqPatSO__RequirementPatternsAssignment_8 )
            // InternalReqPatDemo.g:3686:2: rule__ReqPatSO__RequirementPatternsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__ReqPatSO__RequirementPatternsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getReqPatSOAccess().getRequirementPatternsAssignment_8()); 

            }

            // InternalReqPatDemo.g:3689:1: ( ( rule__ReqPatSO__RequirementPatternsAssignment_8 )* )
            // InternalReqPatDemo.g:3690:1: ( rule__ReqPatSO__RequirementPatternsAssignment_8 )*
            {
             before(grammarAccess.getReqPatSOAccess().getRequirementPatternsAssignment_8()); 
            // InternalReqPatDemo.g:3691:1: ( rule__ReqPatSO__RequirementPatternsAssignment_8 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=16 && LA15_0<=18)||LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReqPatDemo.g:3691:2: rule__ReqPatSO__RequirementPatternsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__ReqPatSO__RequirementPatternsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalReqPatDemo.g:3720:1: rule__ReqPatSO__Group_7__0 : rule__ReqPatSO__Group_7__0__Impl rule__ReqPatSO__Group_7__1 ;
    public final void rule__ReqPatSO__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3724:1: ( rule__ReqPatSO__Group_7__0__Impl rule__ReqPatSO__Group_7__1 )
            // InternalReqPatDemo.g:3725:2: rule__ReqPatSO__Group_7__0__Impl rule__ReqPatSO__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ReqPatSO__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3732:1: rule__ReqPatSO__Group_7__0__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__ReqPatSO__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3736:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:3737:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:3737:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:3738:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3749:1: rule__ReqPatSO__Group_7__1 : rule__ReqPatSO__Group_7__1__Impl rule__ReqPatSO__Group_7__2 ;
    public final void rule__ReqPatSO__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3753:1: ( rule__ReqPatSO__Group_7__1__Impl rule__ReqPatSO__Group_7__2 )
            // InternalReqPatDemo.g:3754:2: rule__ReqPatSO__Group_7__1__Impl rule__ReqPatSO__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__ReqPatSO__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3761:1: rule__ReqPatSO__Group_7__1__Impl : ( ( rule__ReqPatSO__ParentAssignment_7_1 ) ) ;
    public final void rule__ReqPatSO__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3765:1: ( ( ( rule__ReqPatSO__ParentAssignment_7_1 ) ) )
            // InternalReqPatDemo.g:3766:1: ( ( rule__ReqPatSO__ParentAssignment_7_1 ) )
            {
            // InternalReqPatDemo.g:3766:1: ( ( rule__ReqPatSO__ParentAssignment_7_1 ) )
            // InternalReqPatDemo.g:3767:1: ( rule__ReqPatSO__ParentAssignment_7_1 )
            {
             before(grammarAccess.getReqPatSOAccess().getParentAssignment_7_1()); 
            // InternalReqPatDemo.g:3768:1: ( rule__ReqPatSO__ParentAssignment_7_1 )
            // InternalReqPatDemo.g:3768:2: rule__ReqPatSO__ParentAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3778:1: rule__ReqPatSO__Group_7__2 : rule__ReqPatSO__Group_7__2__Impl ;
    public final void rule__ReqPatSO__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3782:1: ( rule__ReqPatSO__Group_7__2__Impl )
            // InternalReqPatDemo.g:3783:2: rule__ReqPatSO__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3789:1: rule__ReqPatSO__Group_7__2__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__ReqPatSO__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3793:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:3794:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:3794:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:3795:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3812:1: rule__FreeTextSO__Group__0 : rule__FreeTextSO__Group__0__Impl rule__FreeTextSO__Group__1 ;
    public final void rule__FreeTextSO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3816:1: ( rule__FreeTextSO__Group__0__Impl rule__FreeTextSO__Group__1 )
            // InternalReqPatDemo.g:3817:2: rule__FreeTextSO__Group__0__Impl rule__FreeTextSO__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FreeTextSO__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3824:1: rule__FreeTextSO__Group__0__Impl : ( () ) ;
    public final void rule__FreeTextSO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3828:1: ( ( () ) )
            // InternalReqPatDemo.g:3829:1: ( () )
            {
            // InternalReqPatDemo.g:3829:1: ( () )
            // InternalReqPatDemo.g:3830:1: ()
            {
             before(grammarAccess.getFreeTextSOAccess().getFreeTextSpecObjectAction_0()); 
            // InternalReqPatDemo.g:3831:1: ()
            // InternalReqPatDemo.g:3833:1: 
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
    // InternalReqPatDemo.g:3843:1: rule__FreeTextSO__Group__1 : rule__FreeTextSO__Group__1__Impl rule__FreeTextSO__Group__2 ;
    public final void rule__FreeTextSO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3847:1: ( rule__FreeTextSO__Group__1__Impl rule__FreeTextSO__Group__2 )
            // InternalReqPatDemo.g:3848:2: rule__FreeTextSO__Group__1__Impl rule__FreeTextSO__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__FreeTextSO__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3855:1: rule__FreeTextSO__Group__1__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__FreeTextSO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3859:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:3860:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:3860:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:3861:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3872:1: rule__FreeTextSO__Group__2 : rule__FreeTextSO__Group__2__Impl rule__FreeTextSO__Group__3 ;
    public final void rule__FreeTextSO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3876:1: ( rule__FreeTextSO__Group__2__Impl rule__FreeTextSO__Group__3 )
            // InternalReqPatDemo.g:3877:2: rule__FreeTextSO__Group__2__Impl rule__FreeTextSO__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__FreeTextSO__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3884:1: rule__FreeTextSO__Group__2__Impl : ( 'F' ) ;
    public final void rule__FreeTextSO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3888:1: ( ( 'F' ) )
            // InternalReqPatDemo.g:3889:1: ( 'F' )
            {
            // InternalReqPatDemo.g:3889:1: ( 'F' )
            // InternalReqPatDemo.g:3890:1: 'F'
            {
             before(grammarAccess.getFreeTextSOAccess().getFKeyword_2()); 
            match(input,32,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3903:1: rule__FreeTextSO__Group__3 : rule__FreeTextSO__Group__3__Impl rule__FreeTextSO__Group__4 ;
    public final void rule__FreeTextSO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3907:1: ( rule__FreeTextSO__Group__3__Impl rule__FreeTextSO__Group__4 )
            // InternalReqPatDemo.g:3908:2: rule__FreeTextSO__Group__3__Impl rule__FreeTextSO__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__FreeTextSO__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3915:1: rule__FreeTextSO__Group__3__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__FreeTextSO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3919:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:3920:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:3920:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:3921:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3932:1: rule__FreeTextSO__Group__4 : rule__FreeTextSO__Group__4__Impl rule__FreeTextSO__Group__5 ;
    public final void rule__FreeTextSO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3936:1: ( rule__FreeTextSO__Group__4__Impl rule__FreeTextSO__Group__5 )
            // InternalReqPatDemo.g:3937:2: rule__FreeTextSO__Group__4__Impl rule__FreeTextSO__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__FreeTextSO__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3944:1: rule__FreeTextSO__Group__4__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__FreeTextSO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3948:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:3949:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:3949:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:3950:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:3961:1: rule__FreeTextSO__Group__5 : rule__FreeTextSO__Group__5__Impl rule__FreeTextSO__Group__6 ;
    public final void rule__FreeTextSO__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3965:1: ( rule__FreeTextSO__Group__5__Impl rule__FreeTextSO__Group__6 )
            // InternalReqPatDemo.g:3966:2: rule__FreeTextSO__Group__5__Impl rule__FreeTextSO__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__FreeTextSO__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3973:1: rule__FreeTextSO__Group__5__Impl : ( ( rule__FreeTextSO__IdAssignment_5 ) ) ;
    public final void rule__FreeTextSO__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3977:1: ( ( ( rule__FreeTextSO__IdAssignment_5 ) ) )
            // InternalReqPatDemo.g:3978:1: ( ( rule__FreeTextSO__IdAssignment_5 ) )
            {
            // InternalReqPatDemo.g:3978:1: ( ( rule__FreeTextSO__IdAssignment_5 ) )
            // InternalReqPatDemo.g:3979:1: ( rule__FreeTextSO__IdAssignment_5 )
            {
             before(grammarAccess.getFreeTextSOAccess().getIdAssignment_5()); 
            // InternalReqPatDemo.g:3980:1: ( rule__FreeTextSO__IdAssignment_5 )
            // InternalReqPatDemo.g:3980:2: rule__FreeTextSO__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:3990:1: rule__FreeTextSO__Group__6 : rule__FreeTextSO__Group__6__Impl rule__FreeTextSO__Group__7 ;
    public final void rule__FreeTextSO__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:3994:1: ( rule__FreeTextSO__Group__6__Impl rule__FreeTextSO__Group__7 )
            // InternalReqPatDemo.g:3995:2: rule__FreeTextSO__Group__6__Impl rule__FreeTextSO__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__FreeTextSO__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4002:1: rule__FreeTextSO__Group__6__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__FreeTextSO__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4006:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:4007:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:4007:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:4008:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4019:1: rule__FreeTextSO__Group__7 : rule__FreeTextSO__Group__7__Impl rule__FreeTextSO__Group__8 ;
    public final void rule__FreeTextSO__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4023:1: ( rule__FreeTextSO__Group__7__Impl rule__FreeTextSO__Group__8 )
            // InternalReqPatDemo.g:4024:2: rule__FreeTextSO__Group__7__Impl rule__FreeTextSO__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__FreeTextSO__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4031:1: rule__FreeTextSO__Group__7__Impl : ( ( rule__FreeTextSO__Group_7__0 )? ) ;
    public final void rule__FreeTextSO__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4035:1: ( ( ( rule__FreeTextSO__Group_7__0 )? ) )
            // InternalReqPatDemo.g:4036:1: ( ( rule__FreeTextSO__Group_7__0 )? )
            {
            // InternalReqPatDemo.g:4036:1: ( ( rule__FreeTextSO__Group_7__0 )? )
            // InternalReqPatDemo.g:4037:1: ( rule__FreeTextSO__Group_7__0 )?
            {
             before(grammarAccess.getFreeTextSOAccess().getGroup_7()); 
            // InternalReqPatDemo.g:4038:1: ( rule__FreeTextSO__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_PARAMDELIMITERLEFT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReqPatDemo.g:4038:2: rule__FreeTextSO__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4048:1: rule__FreeTextSO__Group__8 : rule__FreeTextSO__Group__8__Impl ;
    public final void rule__FreeTextSO__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4052:1: ( rule__FreeTextSO__Group__8__Impl )
            // InternalReqPatDemo.g:4053:2: rule__FreeTextSO__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4059:1: rule__FreeTextSO__Group__8__Impl : ( ( rule__FreeTextSO__FreeTextAssignment_8 )? ) ;
    public final void rule__FreeTextSO__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4063:1: ( ( ( rule__FreeTextSO__FreeTextAssignment_8 )? ) )
            // InternalReqPatDemo.g:4064:1: ( ( rule__FreeTextSO__FreeTextAssignment_8 )? )
            {
            // InternalReqPatDemo.g:4064:1: ( ( rule__FreeTextSO__FreeTextAssignment_8 )? )
            // InternalReqPatDemo.g:4065:1: ( rule__FreeTextSO__FreeTextAssignment_8 )?
            {
             before(grammarAccess.getFreeTextSOAccess().getFreeTextAssignment_8()); 
            // InternalReqPatDemo.g:4066:1: ( rule__FreeTextSO__FreeTextAssignment_8 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReqPatDemo.g:4066:2: rule__FreeTextSO__FreeTextAssignment_8
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4094:1: rule__FreeTextSO__Group_7__0 : rule__FreeTextSO__Group_7__0__Impl rule__FreeTextSO__Group_7__1 ;
    public final void rule__FreeTextSO__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4098:1: ( rule__FreeTextSO__Group_7__0__Impl rule__FreeTextSO__Group_7__1 )
            // InternalReqPatDemo.g:4099:2: rule__FreeTextSO__Group_7__0__Impl rule__FreeTextSO__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__FreeTextSO__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4106:1: rule__FreeTextSO__Group_7__0__Impl : ( RULE_PARAMDELIMITERLEFT ) ;
    public final void rule__FreeTextSO__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4110:1: ( ( RULE_PARAMDELIMITERLEFT ) )
            // InternalReqPatDemo.g:4111:1: ( RULE_PARAMDELIMITERLEFT )
            {
            // InternalReqPatDemo.g:4111:1: ( RULE_PARAMDELIMITERLEFT )
            // InternalReqPatDemo.g:4112:1: RULE_PARAMDELIMITERLEFT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
            match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4123:1: rule__FreeTextSO__Group_7__1 : rule__FreeTextSO__Group_7__1__Impl rule__FreeTextSO__Group_7__2 ;
    public final void rule__FreeTextSO__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4127:1: ( rule__FreeTextSO__Group_7__1__Impl rule__FreeTextSO__Group_7__2 )
            // InternalReqPatDemo.g:4128:2: rule__FreeTextSO__Group_7__1__Impl rule__FreeTextSO__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__FreeTextSO__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4135:1: rule__FreeTextSO__Group_7__1__Impl : ( ( rule__FreeTextSO__ParentAssignment_7_1 ) ) ;
    public final void rule__FreeTextSO__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4139:1: ( ( ( rule__FreeTextSO__ParentAssignment_7_1 ) ) )
            // InternalReqPatDemo.g:4140:1: ( ( rule__FreeTextSO__ParentAssignment_7_1 ) )
            {
            // InternalReqPatDemo.g:4140:1: ( ( rule__FreeTextSO__ParentAssignment_7_1 ) )
            // InternalReqPatDemo.g:4141:1: ( rule__FreeTextSO__ParentAssignment_7_1 )
            {
             before(grammarAccess.getFreeTextSOAccess().getParentAssignment_7_1()); 
            // InternalReqPatDemo.g:4142:1: ( rule__FreeTextSO__ParentAssignment_7_1 )
            // InternalReqPatDemo.g:4142:2: rule__FreeTextSO__ParentAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4152:1: rule__FreeTextSO__Group_7__2 : rule__FreeTextSO__Group_7__2__Impl ;
    public final void rule__FreeTextSO__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4156:1: ( rule__FreeTextSO__Group_7__2__Impl )
            // InternalReqPatDemo.g:4157:2: rule__FreeTextSO__Group_7__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4163:1: rule__FreeTextSO__Group_7__2__Impl : ( RULE_PARAMDELIMITERRIGHT ) ;
    public final void rule__FreeTextSO__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4167:1: ( ( RULE_PARAMDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:4168:1: ( RULE_PARAMDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:4168:1: ( RULE_PARAMDELIMITERRIGHT )
            // InternalReqPatDemo.g:4169:1: RULE_PARAMDELIMITERRIGHT
            {
             before(grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
            match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__Root__SpecObjectsAssignment_1"
    // InternalReqPatDemo.g:4187:1: rule__Root__SpecObjectsAssignment_1 : ( ruleSpecObj ) ;
    public final void rule__Root__SpecObjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4191:1: ( ( ruleSpecObj ) )
            // InternalReqPatDemo.g:4192:1: ( ruleSpecObj )
            {
            // InternalReqPatDemo.g:4192:1: ( ruleSpecObj )
            // InternalReqPatDemo.g:4193:1: ruleSpecObj
            {
             before(grammarAccess.getRootAccess().getSpecObjectsSpecObjParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2"
    // InternalReqPatDemo.g:4202:1: rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2 : ( ruleAnalysisFunction ) ;
    public final void rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4206:1: ( ( ruleAnalysisFunction ) )
            // InternalReqPatDemo.g:4207:1: ( ruleAnalysisFunction )
            {
            // InternalReqPatDemo.g:4207:1: ( ruleAnalysisFunction )
            // InternalReqPatDemo.g:4208:1: ruleAnalysisFunction
            {
             before(grammarAccess.getAnalysisFunctionDefAccess().getAnalysisFunctionAnalysisFunctionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnalysisFunction();

            state._fsp--;

             after(grammarAccess.getAnalysisFunctionDefAccess().getAnalysisFunctionAnalysisFunctionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AnalysisFunctionDef__AnalysisFunctionAssignment_2"


    // $ANTLR start "rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1"
    // InternalReqPatDemo.g:4217:1: rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4221:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4222:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4222:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4223:1: ( RULE_ID )
            {
             before(grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionAnalysisFunctionCrossReference_1_0()); 
            // InternalReqPatDemo.g:4224:1: ( RULE_ID )
            // InternalReqPatDemo.g:4225:1: RULE_ID
            {
             before(grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionAnalysisFunctionCrossReference_1_0()); 

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
    // $ANTLR end "rule__AnalysisFunctionPurp__AnalysisFunctionAssignment_1"


    // $ANTLR start "rule__AnalysisFunctionPurp__PurposeAssignment_3"
    // InternalReqPatDemo.g:4236:1: rule__AnalysisFunctionPurp__PurposeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AnalysisFunctionPurp__PurposeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4240:1: ( ( RULE_STRING ) )
            // InternalReqPatDemo.g:4241:1: ( RULE_STRING )
            {
            // InternalReqPatDemo.g:4241:1: ( RULE_STRING )
            // InternalReqPatDemo.g:4242:1: RULE_STRING
            {
             before(grammarAccess.getAnalysisFunctionPurpAccess().getPurposeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAnalysisFunctionPurpAccess().getPurposeSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AnalysisFunctionPurp__PurposeAssignment_3"


    // $ANTLR start "rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2"
    // InternalReqPatDemo.g:4251:1: rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2 : ( ruleFunctionalDevice ) ;
    public final void rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4255:1: ( ( ruleFunctionalDevice ) )
            // InternalReqPatDemo.g:4256:1: ( ruleFunctionalDevice )
            {
            // InternalReqPatDemo.g:4256:1: ( ruleFunctionalDevice )
            // InternalReqPatDemo.g:4257:1: ruleFunctionalDevice
            {
             before(grammarAccess.getFunctionalDeviceDefAccess().getFunctionalDeviceFunctionalDeviceParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFunctionalDevice();

            state._fsp--;

             after(grammarAccess.getFunctionalDeviceDefAccess().getFunctionalDeviceFunctionalDeviceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FunctionalDeviceDef__FunctionalDeviceAssignment_2"


    // $ANTLR start "rule__FunctionalDevice__NameAssignment_1"
    // InternalReqPatDemo.g:4266:1: rule__FunctionalDevice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionalDevice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4270:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4271:1: ( RULE_ID )
            {
            // InternalReqPatDemo.g:4271:1: ( RULE_ID )
            // InternalReqPatDemo.g:4272:1: RULE_ID
            {
             before(grammarAccess.getFunctionalDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFunctionalDeviceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FunctionalDevice__NameAssignment_1"


    // $ANTLR start "rule__FunctionalDevice__PurposeAssignment_3"
    // InternalReqPatDemo.g:4281:1: rule__FunctionalDevice__PurposeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FunctionalDevice__PurposeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4285:1: ( ( RULE_STRING ) )
            // InternalReqPatDemo.g:4286:1: ( RULE_STRING )
            {
            // InternalReqPatDemo.g:4286:1: ( RULE_STRING )
            // InternalReqPatDemo.g:4287:1: RULE_STRING
            {
             before(grammarAccess.getFunctionalDeviceAccess().getPurposeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFunctionalDeviceAccess().getPurposeSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__FunctionalDevice__PurposeAssignment_3"


    // $ANTLR start "rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1"
    // InternalReqPatDemo.g:4296:1: rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1 : ( ruleSubAnalysisFunction ) ;
    public final void rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4300:1: ( ( ruleSubAnalysisFunction ) )
            // InternalReqPatDemo.g:4301:1: ( ruleSubAnalysisFunction )
            {
            // InternalReqPatDemo.g:4301:1: ( ruleSubAnalysisFunction )
            // InternalReqPatDemo.g:4302:1: ruleSubAnalysisFunction
            {
             before(grammarAccess.getSubAnalysisFunctionDefAccess().getAnalysisFunctionSubAnalysisFunctionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubAnalysisFunction();

            state._fsp--;

             after(grammarAccess.getSubAnalysisFunctionDefAccess().getAnalysisFunctionSubAnalysisFunctionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SubAnalysisFunctionDef__AnalysisFunctionAssignment_1"


    // $ANTLR start "rule__SubAnalysisFunction__NameAssignment_1"
    // InternalReqPatDemo.g:4311:1: rule__SubAnalysisFunction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubAnalysisFunction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4315:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4316:1: ( RULE_ID )
            {
            // InternalReqPatDemo.g:4316:1: ( RULE_ID )
            // InternalReqPatDemo.g:4317:1: RULE_ID
            {
             before(grammarAccess.getSubAnalysisFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSubAnalysisFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SubAnalysisFunction__NameAssignment_1"


    // $ANTLR start "rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3"
    // InternalReqPatDemo.g:4326:1: rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4330:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4331:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4331:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4332:1: ( RULE_ID )
            {
             before(grammarAccess.getSubAnalysisFunctionAccess().getParentAnalysisFunctionAnalysisFunctionCrossReference_3_0()); 
            // InternalReqPatDemo.g:4333:1: ( RULE_ID )
            // InternalReqPatDemo.g:4334:1: RULE_ID
            {
             before(grammarAccess.getSubAnalysisFunctionAccess().getParentAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSubAnalysisFunctionAccess().getParentAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSubAnalysisFunctionAccess().getParentAnalysisFunctionAnalysisFunctionCrossReference_3_0()); 

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
    // $ANTLR end "rule__SubAnalysisFunction__ParentAnalysisFunctionAssignment_3"


    // $ANTLR start "rule__IncomingInformationDef__AnalysisFunctionAssignment_2"
    // InternalReqPatDemo.g:4345:1: rule__IncomingInformationDef__AnalysisFunctionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__IncomingInformationDef__AnalysisFunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4349:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4350:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4350:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4351:1: ( RULE_ID )
            {
             before(grammarAccess.getIncomingInformationDefAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 
            // InternalReqPatDemo.g:4352:1: ( RULE_ID )
            // InternalReqPatDemo.g:4353:1: RULE_ID
            {
             before(grammarAccess.getIncomingInformationDefAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIncomingInformationDefAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getIncomingInformationDefAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 

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
    // $ANTLR end "rule__IncomingInformationDef__AnalysisFunctionAssignment_2"


    // $ANTLR start "rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1"
    // InternalReqPatDemo.g:4364:1: rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4368:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4369:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4369:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4370:1: ( RULE_ID )
            {
             before(grammarAccess.getIncomingInformationDefAccess().getFunctionalDeviceFunctionalDeviceCrossReference_3_1_0()); 
            // InternalReqPatDemo.g:4371:1: ( RULE_ID )
            // InternalReqPatDemo.g:4372:1: RULE_ID
            {
             before(grammarAccess.getIncomingInformationDefAccess().getFunctionalDeviceFunctionalDeviceIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIncomingInformationDefAccess().getFunctionalDeviceFunctionalDeviceIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getIncomingInformationDefAccess().getFunctionalDeviceFunctionalDeviceCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__IncomingInformationDef__FunctionalDeviceAssignment_3_1"


    // $ANTLR start "rule__IncomingInformationDef__InformationListAssignment_5"
    // InternalReqPatDemo.g:4383:1: rule__IncomingInformationDef__InformationListAssignment_5 : ( ruleInformation ) ;
    public final void rule__IncomingInformationDef__InformationListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4387:1: ( ( ruleInformation ) )
            // InternalReqPatDemo.g:4388:1: ( ruleInformation )
            {
            // InternalReqPatDemo.g:4388:1: ( ruleInformation )
            // InternalReqPatDemo.g:4389:1: ruleInformation
            {
             before(grammarAccess.getIncomingInformationDefAccess().getInformationListInformationParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInformation();

            state._fsp--;

             after(grammarAccess.getIncomingInformationDefAccess().getInformationListInformationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__IncomingInformationDef__InformationListAssignment_5"


    // $ANTLR start "rule__IncomingInformationDef__InformationListAssignment_6_1"
    // InternalReqPatDemo.g:4398:1: rule__IncomingInformationDef__InformationListAssignment_6_1 : ( ruleInformation ) ;
    public final void rule__IncomingInformationDef__InformationListAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4402:1: ( ( ruleInformation ) )
            // InternalReqPatDemo.g:4403:1: ( ruleInformation )
            {
            // InternalReqPatDemo.g:4403:1: ( ruleInformation )
            // InternalReqPatDemo.g:4404:1: ruleInformation
            {
             before(grammarAccess.getIncomingInformationDefAccess().getInformationListInformationParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInformation();

            state._fsp--;

             after(grammarAccess.getIncomingInformationDefAccess().getInformationListInformationParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__IncomingInformationDef__InformationListAssignment_6_1"


    // $ANTLR start "rule__OutgoingInformationDef__AnalysisFunctionAssignment_2"
    // InternalReqPatDemo.g:4413:1: rule__OutgoingInformationDef__AnalysisFunctionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OutgoingInformationDef__AnalysisFunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4417:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4418:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4418:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4419:1: ( RULE_ID )
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 
            // InternalReqPatDemo.g:4420:1: ( RULE_ID )
            // InternalReqPatDemo.g:4421:1: RULE_ID
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutgoingInformationDefAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getOutgoingInformationDefAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__AnalysisFunctionAssignment_2"


    // $ANTLR start "rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1"
    // InternalReqPatDemo.g:4432:1: rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4436:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4437:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4437:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4438:1: ( RULE_ID )
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getFunctionalDeviceFunctionalDeviceCrossReference_3_1_0()); 
            // InternalReqPatDemo.g:4439:1: ( RULE_ID )
            // InternalReqPatDemo.g:4440:1: RULE_ID
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getFunctionalDeviceFunctionalDeviceIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutgoingInformationDefAccess().getFunctionalDeviceFunctionalDeviceIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOutgoingInformationDefAccess().getFunctionalDeviceFunctionalDeviceCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__FunctionalDeviceAssignment_3_1"


    // $ANTLR start "rule__OutgoingInformationDef__InformationListAssignment_5"
    // InternalReqPatDemo.g:4451:1: rule__OutgoingInformationDef__InformationListAssignment_5 : ( ruleInformation ) ;
    public final void rule__OutgoingInformationDef__InformationListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4455:1: ( ( ruleInformation ) )
            // InternalReqPatDemo.g:4456:1: ( ruleInformation )
            {
            // InternalReqPatDemo.g:4456:1: ( ruleInformation )
            // InternalReqPatDemo.g:4457:1: ruleInformation
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getInformationListInformationParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInformation();

            state._fsp--;

             after(grammarAccess.getOutgoingInformationDefAccess().getInformationListInformationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__InformationListAssignment_5"


    // $ANTLR start "rule__OutgoingInformationDef__InformationListAssignment_6_1"
    // InternalReqPatDemo.g:4466:1: rule__OutgoingInformationDef__InformationListAssignment_6_1 : ( ruleInformation ) ;
    public final void rule__OutgoingInformationDef__InformationListAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4470:1: ( ( ruleInformation ) )
            // InternalReqPatDemo.g:4471:1: ( ruleInformation )
            {
            // InternalReqPatDemo.g:4471:1: ( ruleInformation )
            // InternalReqPatDemo.g:4472:1: ruleInformation
            {
             before(grammarAccess.getOutgoingInformationDefAccess().getInformationListInformationParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInformation();

            state._fsp--;

             after(grammarAccess.getOutgoingInformationDefAccess().getInformationListInformationParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__OutgoingInformationDef__InformationListAssignment_6_1"


    // $ANTLR start "rule__InformationUsage__AnalysisFunctionAssignment_2"
    // InternalReqPatDemo.g:4481:1: rule__InformationUsage__AnalysisFunctionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__InformationUsage__AnalysisFunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4485:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4486:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4486:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4487:1: ( RULE_ID )
            {
             before(grammarAccess.getInformationUsageAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 
            // InternalReqPatDemo.g:4488:1: ( RULE_ID )
            // InternalReqPatDemo.g:4489:1: RULE_ID
            {
             before(grammarAccess.getInformationUsageAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationUsageAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInformationUsageAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 

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
    // $ANTLR end "rule__InformationUsage__AnalysisFunctionAssignment_2"


    // $ANTLR start "rule__InformationUsage__InformationListAssignment_4"
    // InternalReqPatDemo.g:4500:1: rule__InformationUsage__InformationListAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InformationUsage__InformationListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4504:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4505:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4505:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4506:1: ( RULE_ID )
            {
             before(grammarAccess.getInformationUsageAccess().getInformationListInformationCrossReference_4_0()); 
            // InternalReqPatDemo.g:4507:1: ( RULE_ID )
            // InternalReqPatDemo.g:4508:1: RULE_ID
            {
             before(grammarAccess.getInformationUsageAccess().getInformationListInformationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationUsageAccess().getInformationListInformationIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInformationUsageAccess().getInformationListInformationCrossReference_4_0()); 

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
    // $ANTLR end "rule__InformationUsage__InformationListAssignment_4"


    // $ANTLR start "rule__InformationUsage__InformationListAssignment_5_1"
    // InternalReqPatDemo.g:4519:1: rule__InformationUsage__InformationListAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__InformationUsage__InformationListAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4523:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4524:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4524:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4525:1: ( RULE_ID )
            {
             before(grammarAccess.getInformationUsageAccess().getInformationListInformationCrossReference_5_1_0()); 
            // InternalReqPatDemo.g:4526:1: ( RULE_ID )
            // InternalReqPatDemo.g:4527:1: RULE_ID
            {
             before(grammarAccess.getInformationUsageAccess().getInformationListInformationIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationUsageAccess().getInformationListInformationIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getInformationUsageAccess().getInformationListInformationCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__InformationUsage__InformationListAssignment_5_1"


    // $ANTLR start "rule__InformationCreation__AnalysisFunctionAssignment_2"
    // InternalReqPatDemo.g:4538:1: rule__InformationCreation__AnalysisFunctionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__InformationCreation__AnalysisFunctionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4542:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4543:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4543:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4544:1: ( RULE_ID )
            {
             before(grammarAccess.getInformationCreationAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 
            // InternalReqPatDemo.g:4545:1: ( RULE_ID )
            // InternalReqPatDemo.g:4546:1: RULE_ID
            {
             before(grammarAccess.getInformationCreationAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationCreationAccess().getAnalysisFunctionAnalysisFunctionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInformationCreationAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 

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
    // $ANTLR end "rule__InformationCreation__AnalysisFunctionAssignment_2"


    // $ANTLR start "rule__InformationCreation__InformationListAssignment_4"
    // InternalReqPatDemo.g:4557:1: rule__InformationCreation__InformationListAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InformationCreation__InformationListAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4561:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4562:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4562:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4563:1: ( RULE_ID )
            {
             before(grammarAccess.getInformationCreationAccess().getInformationListInformationCrossReference_4_0()); 
            // InternalReqPatDemo.g:4564:1: ( RULE_ID )
            // InternalReqPatDemo.g:4565:1: RULE_ID
            {
             before(grammarAccess.getInformationCreationAccess().getInformationListInformationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationCreationAccess().getInformationListInformationIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInformationCreationAccess().getInformationListInformationCrossReference_4_0()); 

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
    // $ANTLR end "rule__InformationCreation__InformationListAssignment_4"


    // $ANTLR start "rule__InformationCreation__InformationListAssignment_5_1"
    // InternalReqPatDemo.g:4576:1: rule__InformationCreation__InformationListAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__InformationCreation__InformationListAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4580:1: ( ( ( RULE_ID ) ) )
            // InternalReqPatDemo.g:4581:1: ( ( RULE_ID ) )
            {
            // InternalReqPatDemo.g:4581:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4582:1: ( RULE_ID )
            {
             before(grammarAccess.getInformationCreationAccess().getInformationListInformationCrossReference_5_1_0()); 
            // InternalReqPatDemo.g:4583:1: ( RULE_ID )
            // InternalReqPatDemo.g:4584:1: RULE_ID
            {
             before(grammarAccess.getInformationCreationAccess().getInformationListInformationIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationCreationAccess().getInformationListInformationIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getInformationCreationAccess().getInformationListInformationCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__InformationCreation__InformationListAssignment_5_1"


    // $ANTLR start "rule__AnalysisFunction__NameAssignment_1"
    // InternalReqPatDemo.g:4595:1: rule__AnalysisFunction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnalysisFunction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4599:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4600:1: ( RULE_ID )
            {
            // InternalReqPatDemo.g:4600:1: ( RULE_ID )
            // InternalReqPatDemo.g:4601:1: RULE_ID
            {
             before(grammarAccess.getAnalysisFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAnalysisFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AnalysisFunction__NameAssignment_1"


    // $ANTLR start "rule__Information__NameAssignment_1"
    // InternalReqPatDemo.g:4610:1: rule__Information__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Information__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4614:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4615:1: ( RULE_ID )
            {
            // InternalReqPatDemo.g:4615:1: ( RULE_ID )
            // InternalReqPatDemo.g:4616:1: RULE_ID
            {
             before(grammarAccess.getInformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInformationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Information__NameAssignment_1"


    // $ANTLR start "rule__HeadingSO__IdAssignment_5"
    // InternalReqPatDemo.g:4625:1: rule__HeadingSO__IdAssignment_5 : ( RULE_ID ) ;
    public final void rule__HeadingSO__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4629:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4630:1: ( RULE_ID )
            {
            // InternalReqPatDemo.g:4630:1: ( RULE_ID )
            // InternalReqPatDemo.g:4631:1: RULE_ID
            {
             before(grammarAccess.getHeadingSOAccess().getIdIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4640:1: rule__HeadingSO__ParentAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__HeadingSO__ParentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4644:1: ( ( RULE_STRING ) )
            // InternalReqPatDemo.g:4645:1: ( RULE_STRING )
            {
            // InternalReqPatDemo.g:4645:1: ( RULE_STRING )
            // InternalReqPatDemo.g:4646:1: RULE_STRING
            {
             before(grammarAccess.getHeadingSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4655:1: rule__HeadingSO__TextAssignment_8 : ( RULE_STRING ) ;
    public final void rule__HeadingSO__TextAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4659:1: ( ( RULE_STRING ) )
            // InternalReqPatDemo.g:4660:1: ( RULE_STRING )
            {
            // InternalReqPatDemo.g:4660:1: ( RULE_STRING )
            // InternalReqPatDemo.g:4661:1: RULE_STRING
            {
             before(grammarAccess.getHeadingSOAccess().getTextSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4670:1: rule__ReqPatSO__IdAssignment_5 : ( RULE_ID ) ;
    public final void rule__ReqPatSO__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4674:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4675:1: ( RULE_ID )
            {
            // InternalReqPatDemo.g:4675:1: ( RULE_ID )
            // InternalReqPatDemo.g:4676:1: RULE_ID
            {
             before(grammarAccess.getReqPatSOAccess().getIdIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4685:1: rule__ReqPatSO__ParentAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__ReqPatSO__ParentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4689:1: ( ( RULE_STRING ) )
            // InternalReqPatDemo.g:4690:1: ( RULE_STRING )
            {
            // InternalReqPatDemo.g:4690:1: ( RULE_STRING )
            // InternalReqPatDemo.g:4691:1: RULE_STRING
            {
             before(grammarAccess.getReqPatSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4700:1: rule__ReqPatSO__RequirementPatternsAssignment_8 : ( ruleRequirementPattern ) ;
    public final void rule__ReqPatSO__RequirementPatternsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4704:1: ( ( ruleRequirementPattern ) )
            // InternalReqPatDemo.g:4705:1: ( ruleRequirementPattern )
            {
            // InternalReqPatDemo.g:4705:1: ( ruleRequirementPattern )
            // InternalReqPatDemo.g:4706:1: ruleRequirementPattern
            {
             before(grammarAccess.getReqPatSOAccess().getRequirementPatternsRequirementPatternParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalReqPatDemo.g:4715:1: rule__FreeTextSO__IdAssignment_5 : ( RULE_ID ) ;
    public final void rule__FreeTextSO__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4719:1: ( ( RULE_ID ) )
            // InternalReqPatDemo.g:4720:1: ( RULE_ID )
            {
            // InternalReqPatDemo.g:4720:1: ( RULE_ID )
            // InternalReqPatDemo.g:4721:1: RULE_ID
            {
             before(grammarAccess.getFreeTextSOAccess().getIdIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4730:1: rule__FreeTextSO__ParentAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__FreeTextSO__ParentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4734:1: ( ( RULE_STRING ) )
            // InternalReqPatDemo.g:4735:1: ( RULE_STRING )
            {
            // InternalReqPatDemo.g:4735:1: ( RULE_STRING )
            // InternalReqPatDemo.g:4736:1: RULE_STRING
            {
             before(grammarAccess.getFreeTextSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
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
    // InternalReqPatDemo.g:4745:1: rule__FreeTextSO__FreeTextAssignment_8 : ( RULE_STRING ) ;
    public final void rule__FreeTextSO__FreeTextAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalReqPatDemo.g:4749:1: ( ( RULE_STRING ) )
            // InternalReqPatDemo.g:4750:1: ( RULE_STRING )
            {
            // InternalReqPatDemo.g:4750:1: ( RULE_STRING )
            // InternalReqPatDemo.g:4751:1: RULE_STRING
            {
             before(grammarAccess.getFreeTextSOAccess().getFreeTextSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
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
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000034400000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000240L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000170040L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000170042L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    }


}