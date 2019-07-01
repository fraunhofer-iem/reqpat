package de.fraunhofer.iem.reqpat.demo.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.iem.reqpat.demo.services.ReqPatDemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqPatDemoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_SPECOBJECTDELIMITERLEFT", "RULE_SPECOBJECTDELIMITERRIGHT", "RULE_PARAMDELIMITERLEFT", "RULE_PARAMDELIMITERRIGHT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'The function'", "'The following information'", "'The top-level function is called'", "'has the following purpose:'", "'The functional device'", "'is a subfunction of the function'", "'is received by the function'", "'from the functional device'", "':'", "','", "'is sent from the function'", "'to the functional device'", "'is used by the function'", "'is created by the function'", "'H'", "'RP'", "'F'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_PARAMDELIMITERRIGHT=9;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_PARAMDELIMITERLEFT=8;
    public static final int RULE_SPECOBJECTDELIMITERLEFT=6;
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
    public static final int RULE_SPECOBJECTDELIMITERRIGHT=7;
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
     	
        public InternalReqPatDemoParser(TokenStream input, ReqPatDemoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected ReqPatDemoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // InternalReqPatDemo.g:67:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalReqPatDemo.g:68:2: (iv_ruleRoot= ruleRoot EOF )
            // InternalReqPatDemo.g:69:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalReqPatDemo.g:76:1: ruleRoot returns [EObject current=null] : ( () ( (lv_specObjects_1_0= ruleSpecObj ) )+ ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_specObjects_1_0 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:79:28: ( ( () ( (lv_specObjects_1_0= ruleSpecObj ) )+ ) )
            // InternalReqPatDemo.g:80:1: ( () ( (lv_specObjects_1_0= ruleSpecObj ) )+ )
            {
            // InternalReqPatDemo.g:80:1: ( () ( (lv_specObjects_1_0= ruleSpecObj ) )+ )
            // InternalReqPatDemo.g:80:2: () ( (lv_specObjects_1_0= ruleSpecObj ) )+
            {
            // InternalReqPatDemo.g:80:2: ()
            // InternalReqPatDemo.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRootAccess().getSpecificationAction_0(),
                        current);
                

            }

            // InternalReqPatDemo.g:86:2: ( (lv_specObjects_1_0= ruleSpecObj ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SPECOBJECTDELIMITERLEFT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReqPatDemo.g:87:1: (lv_specObjects_1_0= ruleSpecObj )
            	    {
            	    // InternalReqPatDemo.g:87:1: (lv_specObjects_1_0= ruleSpecObj )
            	    // InternalReqPatDemo.g:88:3: lv_specObjects_1_0= ruleSpecObj
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getSpecObjectsSpecObjParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_specObjects_1_0=ruleSpecObj();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"specObjects",
            	            		lv_specObjects_1_0, 
            	            		"de.fraunhofer.iem.reqpat.core.ReqPat.SpecObj");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleRequirementPattern"
    // InternalReqPatDemo.g:112:1: entryRuleRequirementPattern returns [EObject current=null] : iv_ruleRequirementPattern= ruleRequirementPattern EOF ;
    public final EObject entryRuleRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementPattern = null;


        try {
            // InternalReqPatDemo.g:113:2: (iv_ruleRequirementPattern= ruleRequirementPattern EOF )
            // InternalReqPatDemo.g:114:2: iv_ruleRequirementPattern= ruleRequirementPattern EOF
            {
             newCompositeNode(grammarAccess.getRequirementPatternRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRequirementPattern=ruleRequirementPattern();

            state._fsp--;

             current =iv_ruleRequirementPattern; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequirementPattern"


    // $ANTLR start "ruleRequirementPattern"
    // InternalReqPatDemo.g:121:1: ruleRequirementPattern returns [EObject current=null] : ( (this_AnalysisFunctionDef_0= ruleAnalysisFunctionDef | this_TheAnalysisFunction_1= ruleTheAnalysisFunction | this_FunctionalDeviceDef_2= ruleFunctionalDeviceDef | this_TheFollowingInformation_3= ruleTheFollowingInformation ) (otherlv_4= '.' )? ) ;
    public final EObject ruleRequirementPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_AnalysisFunctionDef_0 = null;

        EObject this_TheAnalysisFunction_1 = null;

        EObject this_FunctionalDeviceDef_2 = null;

        EObject this_TheFollowingInformation_3 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:124:28: ( ( (this_AnalysisFunctionDef_0= ruleAnalysisFunctionDef | this_TheAnalysisFunction_1= ruleTheAnalysisFunction | this_FunctionalDeviceDef_2= ruleFunctionalDeviceDef | this_TheFollowingInformation_3= ruleTheFollowingInformation ) (otherlv_4= '.' )? ) )
            // InternalReqPatDemo.g:125:1: ( (this_AnalysisFunctionDef_0= ruleAnalysisFunctionDef | this_TheAnalysisFunction_1= ruleTheAnalysisFunction | this_FunctionalDeviceDef_2= ruleFunctionalDeviceDef | this_TheFollowingInformation_3= ruleTheFollowingInformation ) (otherlv_4= '.' )? )
            {
            // InternalReqPatDemo.g:125:1: ( (this_AnalysisFunctionDef_0= ruleAnalysisFunctionDef | this_TheAnalysisFunction_1= ruleTheAnalysisFunction | this_FunctionalDeviceDef_2= ruleFunctionalDeviceDef | this_TheFollowingInformation_3= ruleTheFollowingInformation ) (otherlv_4= '.' )? )
            // InternalReqPatDemo.g:125:2: (this_AnalysisFunctionDef_0= ruleAnalysisFunctionDef | this_TheAnalysisFunction_1= ruleTheAnalysisFunction | this_FunctionalDeviceDef_2= ruleFunctionalDeviceDef | this_TheFollowingInformation_3= ruleTheFollowingInformation ) (otherlv_4= '.' )?
            {
            // InternalReqPatDemo.g:125:2: (this_AnalysisFunctionDef_0= ruleAnalysisFunctionDef | this_TheAnalysisFunction_1= ruleTheAnalysisFunction | this_FunctionalDeviceDef_2= ruleFunctionalDeviceDef | this_TheFollowingInformation_3= ruleTheFollowingInformation )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalReqPatDemo.g:126:5: this_AnalysisFunctionDef_0= ruleAnalysisFunctionDef
                    {
                     
                            newCompositeNode(grammarAccess.getRequirementPatternAccess().getAnalysisFunctionDefParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_AnalysisFunctionDef_0=ruleAnalysisFunctionDef();

                    state._fsp--;

                     
                            current = this_AnalysisFunctionDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalReqPatDemo.g:136:5: this_TheAnalysisFunction_1= ruleTheAnalysisFunction
                    {
                     
                            newCompositeNode(grammarAccess.getRequirementPatternAccess().getTheAnalysisFunctionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_TheAnalysisFunction_1=ruleTheAnalysisFunction();

                    state._fsp--;

                     
                            current = this_TheAnalysisFunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalReqPatDemo.g:146:5: this_FunctionalDeviceDef_2= ruleFunctionalDeviceDef
                    {
                     
                            newCompositeNode(grammarAccess.getRequirementPatternAccess().getFunctionalDeviceDefParserRuleCall_0_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_FunctionalDeviceDef_2=ruleFunctionalDeviceDef();

                    state._fsp--;

                     
                            current = this_FunctionalDeviceDef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalReqPatDemo.g:156:5: this_TheFollowingInformation_3= ruleTheFollowingInformation
                    {
                     
                            newCompositeNode(grammarAccess.getRequirementPatternAccess().getTheFollowingInformationParserRuleCall_0_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_4);
                    this_TheFollowingInformation_3=ruleTheFollowingInformation();

                    state._fsp--;

                     
                            current = this_TheFollowingInformation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalReqPatDemo.g:164:2: (otherlv_4= '.' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReqPatDemo.g:164:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_4, grammarAccess.getRequirementPatternAccess().getFullStopKeyword_1());
                        

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
    // $ANTLR end "ruleRequirementPattern"


    // $ANTLR start "entryRuleTheAnalysisFunction"
    // InternalReqPatDemo.g:176:1: entryRuleTheAnalysisFunction returns [EObject current=null] : iv_ruleTheAnalysisFunction= ruleTheAnalysisFunction EOF ;
    public final EObject entryRuleTheAnalysisFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheAnalysisFunction = null;


        try {
            // InternalReqPatDemo.g:177:2: (iv_ruleTheAnalysisFunction= ruleTheAnalysisFunction EOF )
            // InternalReqPatDemo.g:178:2: iv_ruleTheAnalysisFunction= ruleTheAnalysisFunction EOF
            {
             newCompositeNode(grammarAccess.getTheAnalysisFunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTheAnalysisFunction=ruleTheAnalysisFunction();

            state._fsp--;

             current =iv_ruleTheAnalysisFunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTheAnalysisFunction"


    // $ANTLR start "ruleTheAnalysisFunction"
    // InternalReqPatDemo.g:185:1: ruleTheAnalysisFunction returns [EObject current=null] : (otherlv_0= 'The function' (this_SubAnalysisFunctionDef_1= ruleSubAnalysisFunctionDef | this_AnalysisFunctionPurp_2= ruleAnalysisFunctionPurp ) ) ;
    public final EObject ruleTheAnalysisFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SubAnalysisFunctionDef_1 = null;

        EObject this_AnalysisFunctionPurp_2 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:188:28: ( (otherlv_0= 'The function' (this_SubAnalysisFunctionDef_1= ruleSubAnalysisFunctionDef | this_AnalysisFunctionPurp_2= ruleAnalysisFunctionPurp ) ) )
            // InternalReqPatDemo.g:189:1: (otherlv_0= 'The function' (this_SubAnalysisFunctionDef_1= ruleSubAnalysisFunctionDef | this_AnalysisFunctionPurp_2= ruleAnalysisFunctionPurp ) )
            {
            // InternalReqPatDemo.g:189:1: (otherlv_0= 'The function' (this_SubAnalysisFunctionDef_1= ruleSubAnalysisFunctionDef | this_AnalysisFunctionPurp_2= ruleAnalysisFunctionPurp ) )
            // InternalReqPatDemo.g:189:3: otherlv_0= 'The function' (this_SubAnalysisFunctionDef_1= ruleSubAnalysisFunctionDef | this_AnalysisFunctionPurp_2= ruleAnalysisFunctionPurp )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getTheAnalysisFunctionAccess().getTheFunctionKeyword_0());
                
            // InternalReqPatDemo.g:193:1: (this_SubAnalysisFunctionDef_1= ruleSubAnalysisFunctionDef | this_AnalysisFunctionPurp_2= ruleAnalysisFunctionPurp )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==21) ) {
                    alt4=1;
                }
                else if ( (LA4_1==19) ) {
                    alt4=2;
                }
                else {
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
                    // InternalReqPatDemo.g:194:5: this_SubAnalysisFunctionDef_1= ruleSubAnalysisFunctionDef
                    {
                     
                            newCompositeNode(grammarAccess.getTheAnalysisFunctionAccess().getSubAnalysisFunctionDefParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SubAnalysisFunctionDef_1=ruleSubAnalysisFunctionDef();

                    state._fsp--;

                     
                            current = this_SubAnalysisFunctionDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalReqPatDemo.g:204:5: this_AnalysisFunctionPurp_2= ruleAnalysisFunctionPurp
                    {
                     
                            newCompositeNode(grammarAccess.getTheAnalysisFunctionAccess().getAnalysisFunctionPurpParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AnalysisFunctionPurp_2=ruleAnalysisFunctionPurp();

                    state._fsp--;

                     
                            current = this_AnalysisFunctionPurp_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTheAnalysisFunction"


    // $ANTLR start "entryRuleTheFollowingInformation"
    // InternalReqPatDemo.g:220:1: entryRuleTheFollowingInformation returns [EObject current=null] : iv_ruleTheFollowingInformation= ruleTheFollowingInformation EOF ;
    public final EObject entryRuleTheFollowingInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheFollowingInformation = null;


        try {
            // InternalReqPatDemo.g:221:2: (iv_ruleTheFollowingInformation= ruleTheFollowingInformation EOF )
            // InternalReqPatDemo.g:222:2: iv_ruleTheFollowingInformation= ruleTheFollowingInformation EOF
            {
             newCompositeNode(grammarAccess.getTheFollowingInformationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTheFollowingInformation=ruleTheFollowingInformation();

            state._fsp--;

             current =iv_ruleTheFollowingInformation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTheFollowingInformation"


    // $ANTLR start "ruleTheFollowingInformation"
    // InternalReqPatDemo.g:229:1: ruleTheFollowingInformation returns [EObject current=null] : (otherlv_0= 'The following information' (this_IncomingInformationDef_1= ruleIncomingInformationDef | this_OutgoingInformationDef_2= ruleOutgoingInformationDef | this_InformationUsage_3= ruleInformationUsage | this_InformationCreation_4= ruleInformationCreation ) ) ;
    public final EObject ruleTheFollowingInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_IncomingInformationDef_1 = null;

        EObject this_OutgoingInformationDef_2 = null;

        EObject this_InformationUsage_3 = null;

        EObject this_InformationCreation_4 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:232:28: ( (otherlv_0= 'The following information' (this_IncomingInformationDef_1= ruleIncomingInformationDef | this_OutgoingInformationDef_2= ruleOutgoingInformationDef | this_InformationUsage_3= ruleInformationUsage | this_InformationCreation_4= ruleInformationCreation ) ) )
            // InternalReqPatDemo.g:233:1: (otherlv_0= 'The following information' (this_IncomingInformationDef_1= ruleIncomingInformationDef | this_OutgoingInformationDef_2= ruleOutgoingInformationDef | this_InformationUsage_3= ruleInformationUsage | this_InformationCreation_4= ruleInformationCreation ) )
            {
            // InternalReqPatDemo.g:233:1: (otherlv_0= 'The following information' (this_IncomingInformationDef_1= ruleIncomingInformationDef | this_OutgoingInformationDef_2= ruleOutgoingInformationDef | this_InformationUsage_3= ruleInformationUsage | this_InformationCreation_4= ruleInformationCreation ) )
            // InternalReqPatDemo.g:233:3: otherlv_0= 'The following information' (this_IncomingInformationDef_1= ruleIncomingInformationDef | this_OutgoingInformationDef_2= ruleOutgoingInformationDef | this_InformationUsage_3= ruleInformationUsage | this_InformationCreation_4= ruleInformationCreation )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getTheFollowingInformationAccess().getTheFollowingInformationKeyword_0());
                
            // InternalReqPatDemo.g:237:1: (this_IncomingInformationDef_1= ruleIncomingInformationDef | this_OutgoingInformationDef_2= ruleOutgoingInformationDef | this_InformationUsage_3= ruleInformationUsage | this_InformationCreation_4= ruleInformationCreation )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalReqPatDemo.g:238:5: this_IncomingInformationDef_1= ruleIncomingInformationDef
                    {
                     
                            newCompositeNode(grammarAccess.getTheFollowingInformationAccess().getIncomingInformationDefParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IncomingInformationDef_1=ruleIncomingInformationDef();

                    state._fsp--;

                     
                            current = this_IncomingInformationDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalReqPatDemo.g:248:5: this_OutgoingInformationDef_2= ruleOutgoingInformationDef
                    {
                     
                            newCompositeNode(grammarAccess.getTheFollowingInformationAccess().getOutgoingInformationDefParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OutgoingInformationDef_2=ruleOutgoingInformationDef();

                    state._fsp--;

                     
                            current = this_OutgoingInformationDef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalReqPatDemo.g:258:5: this_InformationUsage_3= ruleInformationUsage
                    {
                     
                            newCompositeNode(grammarAccess.getTheFollowingInformationAccess().getInformationUsageParserRuleCall_1_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InformationUsage_3=ruleInformationUsage();

                    state._fsp--;

                     
                            current = this_InformationUsage_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalReqPatDemo.g:268:5: this_InformationCreation_4= ruleInformationCreation
                    {
                     
                            newCompositeNode(grammarAccess.getTheFollowingInformationAccess().getInformationCreationParserRuleCall_1_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InformationCreation_4=ruleInformationCreation();

                    state._fsp--;

                     
                            current = this_InformationCreation_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTheFollowingInformation"


    // $ANTLR start "entryRuleAnalysisFunctionDef"
    // InternalReqPatDemo.g:284:1: entryRuleAnalysisFunctionDef returns [EObject current=null] : iv_ruleAnalysisFunctionDef= ruleAnalysisFunctionDef EOF ;
    public final EObject entryRuleAnalysisFunctionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalysisFunctionDef = null;


        try {
            // InternalReqPatDemo.g:285:2: (iv_ruleAnalysisFunctionDef= ruleAnalysisFunctionDef EOF )
            // InternalReqPatDemo.g:286:2: iv_ruleAnalysisFunctionDef= ruleAnalysisFunctionDef EOF
            {
             newCompositeNode(grammarAccess.getAnalysisFunctionDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnalysisFunctionDef=ruleAnalysisFunctionDef();

            state._fsp--;

             current =iv_ruleAnalysisFunctionDef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnalysisFunctionDef"


    // $ANTLR start "ruleAnalysisFunctionDef"
    // InternalReqPatDemo.g:293:1: ruleAnalysisFunctionDef returns [EObject current=null] : ( () otherlv_1= 'The top-level function is called' ( (lv_analysisFunction_2_0= ruleAnalysisFunction ) ) ) ;
    public final EObject ruleAnalysisFunctionDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_analysisFunction_2_0 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:296:28: ( ( () otherlv_1= 'The top-level function is called' ( (lv_analysisFunction_2_0= ruleAnalysisFunction ) ) ) )
            // InternalReqPatDemo.g:297:1: ( () otherlv_1= 'The top-level function is called' ( (lv_analysisFunction_2_0= ruleAnalysisFunction ) ) )
            {
            // InternalReqPatDemo.g:297:1: ( () otherlv_1= 'The top-level function is called' ( (lv_analysisFunction_2_0= ruleAnalysisFunction ) ) )
            // InternalReqPatDemo.g:297:2: () otherlv_1= 'The top-level function is called' ( (lv_analysisFunction_2_0= ruleAnalysisFunction ) )
            {
            // InternalReqPatDemo.g:297:2: ()
            // InternalReqPatDemo.g:298:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnalysisFunctionDefAccess().getAnalysisFunctionDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getAnalysisFunctionDefAccess().getTheTopLevelFunctionIsCalledKeyword_1());
                
            // InternalReqPatDemo.g:307:1: ( (lv_analysisFunction_2_0= ruleAnalysisFunction ) )
            // InternalReqPatDemo.g:308:1: (lv_analysisFunction_2_0= ruleAnalysisFunction )
            {
            // InternalReqPatDemo.g:308:1: (lv_analysisFunction_2_0= ruleAnalysisFunction )
            // InternalReqPatDemo.g:309:3: lv_analysisFunction_2_0= ruleAnalysisFunction
            {
             
            	        newCompositeNode(grammarAccess.getAnalysisFunctionDefAccess().getAnalysisFunctionAnalysisFunctionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_analysisFunction_2_0=ruleAnalysisFunction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnalysisFunctionDefRule());
            	        }
                   		set(
                   			current, 
                   			"analysisFunction",
                    		lv_analysisFunction_2_0, 
                    		"de.fraunhofer.iem.reqpat.demo.ReqPatDemo.AnalysisFunction");
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
    // $ANTLR end "ruleAnalysisFunctionDef"


    // $ANTLR start "entryRuleAnalysisFunctionPurp"
    // InternalReqPatDemo.g:333:1: entryRuleAnalysisFunctionPurp returns [EObject current=null] : iv_ruleAnalysisFunctionPurp= ruleAnalysisFunctionPurp EOF ;
    public final EObject entryRuleAnalysisFunctionPurp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalysisFunctionPurp = null;


        try {
            // InternalReqPatDemo.g:334:2: (iv_ruleAnalysisFunctionPurp= ruleAnalysisFunctionPurp EOF )
            // InternalReqPatDemo.g:335:2: iv_ruleAnalysisFunctionPurp= ruleAnalysisFunctionPurp EOF
            {
             newCompositeNode(grammarAccess.getAnalysisFunctionPurpRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnalysisFunctionPurp=ruleAnalysisFunctionPurp();

            state._fsp--;

             current =iv_ruleAnalysisFunctionPurp; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnalysisFunctionPurp"


    // $ANTLR start "ruleAnalysisFunctionPurp"
    // InternalReqPatDemo.g:342:1: ruleAnalysisFunctionPurp returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnalysisFunctionPurp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_purpose_3_0=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:345:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) ) ) )
            // InternalReqPatDemo.g:346:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) ) )
            {
            // InternalReqPatDemo.g:346:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) ) )
            // InternalReqPatDemo.g:346:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) )
            {
            // InternalReqPatDemo.g:346:2: ()
            // InternalReqPatDemo.g:347:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionPurposeAction_0(),
                        current);
                

            }

            // InternalReqPatDemo.g:352:2: ( (otherlv_1= RULE_ID ) )
            // InternalReqPatDemo.g:353:1: (otherlv_1= RULE_ID )
            {
            // InternalReqPatDemo.g:353:1: (otherlv_1= RULE_ID )
            // InternalReqPatDemo.g:354:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnalysisFunctionPurpRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            		newLeafNode(otherlv_1, grammarAccess.getAnalysisFunctionPurpAccess().getAnalysisFunctionAnalysisFunctionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getAnalysisFunctionPurpAccess().getHasTheFollowingPurposeKeyword_2());
                
            // InternalReqPatDemo.g:369:1: ( (lv_purpose_3_0= RULE_STRING ) )
            // InternalReqPatDemo.g:370:1: (lv_purpose_3_0= RULE_STRING )
            {
            // InternalReqPatDemo.g:370:1: (lv_purpose_3_0= RULE_STRING )
            // InternalReqPatDemo.g:371:3: lv_purpose_3_0= RULE_STRING
            {
            lv_purpose_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_purpose_3_0, grammarAccess.getAnalysisFunctionPurpAccess().getPurposeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnalysisFunctionPurpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"purpose",
                    		lv_purpose_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleAnalysisFunctionPurp"


    // $ANTLR start "entryRuleFunctionalDeviceDef"
    // InternalReqPatDemo.g:395:1: entryRuleFunctionalDeviceDef returns [EObject current=null] : iv_ruleFunctionalDeviceDef= ruleFunctionalDeviceDef EOF ;
    public final EObject entryRuleFunctionalDeviceDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalDeviceDef = null;


        try {
            // InternalReqPatDemo.g:396:2: (iv_ruleFunctionalDeviceDef= ruleFunctionalDeviceDef EOF )
            // InternalReqPatDemo.g:397:2: iv_ruleFunctionalDeviceDef= ruleFunctionalDeviceDef EOF
            {
             newCompositeNode(grammarAccess.getFunctionalDeviceDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionalDeviceDef=ruleFunctionalDeviceDef();

            state._fsp--;

             current =iv_ruleFunctionalDeviceDef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionalDeviceDef"


    // $ANTLR start "ruleFunctionalDeviceDef"
    // InternalReqPatDemo.g:404:1: ruleFunctionalDeviceDef returns [EObject current=null] : ( () otherlv_1= 'The functional device' ( (lv_functionalDevice_2_0= ruleFunctionalDevice ) ) ) ;
    public final EObject ruleFunctionalDeviceDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_functionalDevice_2_0 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:407:28: ( ( () otherlv_1= 'The functional device' ( (lv_functionalDevice_2_0= ruleFunctionalDevice ) ) ) )
            // InternalReqPatDemo.g:408:1: ( () otherlv_1= 'The functional device' ( (lv_functionalDevice_2_0= ruleFunctionalDevice ) ) )
            {
            // InternalReqPatDemo.g:408:1: ( () otherlv_1= 'The functional device' ( (lv_functionalDevice_2_0= ruleFunctionalDevice ) ) )
            // InternalReqPatDemo.g:408:2: () otherlv_1= 'The functional device' ( (lv_functionalDevice_2_0= ruleFunctionalDevice ) )
            {
            // InternalReqPatDemo.g:408:2: ()
            // InternalReqPatDemo.g:409:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionalDeviceDefAccess().getFunctionalDeviceDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionalDeviceDefAccess().getTheFunctionalDeviceKeyword_1());
                
            // InternalReqPatDemo.g:418:1: ( (lv_functionalDevice_2_0= ruleFunctionalDevice ) )
            // InternalReqPatDemo.g:419:1: (lv_functionalDevice_2_0= ruleFunctionalDevice )
            {
            // InternalReqPatDemo.g:419:1: (lv_functionalDevice_2_0= ruleFunctionalDevice )
            // InternalReqPatDemo.g:420:3: lv_functionalDevice_2_0= ruleFunctionalDevice
            {
             
            	        newCompositeNode(grammarAccess.getFunctionalDeviceDefAccess().getFunctionalDeviceFunctionalDeviceParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_functionalDevice_2_0=ruleFunctionalDevice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionalDeviceDefRule());
            	        }
                   		set(
                   			current, 
                   			"functionalDevice",
                    		lv_functionalDevice_2_0, 
                    		"de.fraunhofer.iem.reqpat.demo.ReqPatDemo.FunctionalDevice");
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
    // $ANTLR end "ruleFunctionalDeviceDef"


    // $ANTLR start "entryRuleFunctionalDevice"
    // InternalReqPatDemo.g:444:1: entryRuleFunctionalDevice returns [EObject current=null] : iv_ruleFunctionalDevice= ruleFunctionalDevice EOF ;
    public final EObject entryRuleFunctionalDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalDevice = null;


        try {
            // InternalReqPatDemo.g:445:2: (iv_ruleFunctionalDevice= ruleFunctionalDevice EOF )
            // InternalReqPatDemo.g:446:2: iv_ruleFunctionalDevice= ruleFunctionalDevice EOF
            {
             newCompositeNode(grammarAccess.getFunctionalDeviceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionalDevice=ruleFunctionalDevice();

            state._fsp--;

             current =iv_ruleFunctionalDevice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionalDevice"


    // $ANTLR start "ruleFunctionalDevice"
    // InternalReqPatDemo.g:453:1: ruleFunctionalDevice returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleFunctionalDevice() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_purpose_3_0=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:456:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) ) ) )
            // InternalReqPatDemo.g:457:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) ) )
            {
            // InternalReqPatDemo.g:457:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) ) )
            // InternalReqPatDemo.g:457:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'has the following purpose:' ( (lv_purpose_3_0= RULE_STRING ) )
            {
            // InternalReqPatDemo.g:457:2: ()
            // InternalReqPatDemo.g:458:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionalDeviceAccess().getFunctionalDeviceAction_0(),
                        current);
                

            }

            // InternalReqPatDemo.g:463:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqPatDemo.g:464:1: (lv_name_1_0= RULE_ID )
            {
            // InternalReqPatDemo.g:464:1: (lv_name_1_0= RULE_ID )
            // InternalReqPatDemo.g:465:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionalDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionalDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"de.fraunhofer.iem.reqpat.core.ReqPat.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionalDeviceAccess().getHasTheFollowingPurposeKeyword_2());
                
            // InternalReqPatDemo.g:485:1: ( (lv_purpose_3_0= RULE_STRING ) )
            // InternalReqPatDemo.g:486:1: (lv_purpose_3_0= RULE_STRING )
            {
            // InternalReqPatDemo.g:486:1: (lv_purpose_3_0= RULE_STRING )
            // InternalReqPatDemo.g:487:3: lv_purpose_3_0= RULE_STRING
            {
            lv_purpose_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_purpose_3_0, grammarAccess.getFunctionalDeviceAccess().getPurposeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionalDeviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"purpose",
                    		lv_purpose_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleFunctionalDevice"


    // $ANTLR start "entryRuleSubAnalysisFunctionDef"
    // InternalReqPatDemo.g:511:1: entryRuleSubAnalysisFunctionDef returns [EObject current=null] : iv_ruleSubAnalysisFunctionDef= ruleSubAnalysisFunctionDef EOF ;
    public final EObject entryRuleSubAnalysisFunctionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAnalysisFunctionDef = null;


        try {
            // InternalReqPatDemo.g:512:2: (iv_ruleSubAnalysisFunctionDef= ruleSubAnalysisFunctionDef EOF )
            // InternalReqPatDemo.g:513:2: iv_ruleSubAnalysisFunctionDef= ruleSubAnalysisFunctionDef EOF
            {
             newCompositeNode(grammarAccess.getSubAnalysisFunctionDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubAnalysisFunctionDef=ruleSubAnalysisFunctionDef();

            state._fsp--;

             current =iv_ruleSubAnalysisFunctionDef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubAnalysisFunctionDef"


    // $ANTLR start "ruleSubAnalysisFunctionDef"
    // InternalReqPatDemo.g:520:1: ruleSubAnalysisFunctionDef returns [EObject current=null] : ( () ( (lv_analysisFunction_1_0= ruleSubAnalysisFunction ) ) ) ;
    public final EObject ruleSubAnalysisFunctionDef() throws RecognitionException {
        EObject current = null;

        EObject lv_analysisFunction_1_0 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:523:28: ( ( () ( (lv_analysisFunction_1_0= ruleSubAnalysisFunction ) ) ) )
            // InternalReqPatDemo.g:524:1: ( () ( (lv_analysisFunction_1_0= ruleSubAnalysisFunction ) ) )
            {
            // InternalReqPatDemo.g:524:1: ( () ( (lv_analysisFunction_1_0= ruleSubAnalysisFunction ) ) )
            // InternalReqPatDemo.g:524:2: () ( (lv_analysisFunction_1_0= ruleSubAnalysisFunction ) )
            {
            // InternalReqPatDemo.g:524:2: ()
            // InternalReqPatDemo.g:525:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubAnalysisFunctionDefAccess().getSubAnalysisFunctionDefinitionAction_0(),
                        current);
                

            }

            // InternalReqPatDemo.g:530:2: ( (lv_analysisFunction_1_0= ruleSubAnalysisFunction ) )
            // InternalReqPatDemo.g:531:1: (lv_analysisFunction_1_0= ruleSubAnalysisFunction )
            {
            // InternalReqPatDemo.g:531:1: (lv_analysisFunction_1_0= ruleSubAnalysisFunction )
            // InternalReqPatDemo.g:532:3: lv_analysisFunction_1_0= ruleSubAnalysisFunction
            {
             
            	        newCompositeNode(grammarAccess.getSubAnalysisFunctionDefAccess().getAnalysisFunctionSubAnalysisFunctionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_analysisFunction_1_0=ruleSubAnalysisFunction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubAnalysisFunctionDefRule());
            	        }
                   		set(
                   			current, 
                   			"analysisFunction",
                    		lv_analysisFunction_1_0, 
                    		"de.fraunhofer.iem.reqpat.demo.ReqPatDemo.SubAnalysisFunction");
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
    // $ANTLR end "ruleSubAnalysisFunctionDef"


    // $ANTLR start "entryRuleSubAnalysisFunction"
    // InternalReqPatDemo.g:556:1: entryRuleSubAnalysisFunction returns [EObject current=null] : iv_ruleSubAnalysisFunction= ruleSubAnalysisFunction EOF ;
    public final EObject entryRuleSubAnalysisFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAnalysisFunction = null;


        try {
            // InternalReqPatDemo.g:557:2: (iv_ruleSubAnalysisFunction= ruleSubAnalysisFunction EOF )
            // InternalReqPatDemo.g:558:2: iv_ruleSubAnalysisFunction= ruleSubAnalysisFunction EOF
            {
             newCompositeNode(grammarAccess.getSubAnalysisFunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubAnalysisFunction=ruleSubAnalysisFunction();

            state._fsp--;

             current =iv_ruleSubAnalysisFunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubAnalysisFunction"


    // $ANTLR start "ruleSubAnalysisFunction"
    // InternalReqPatDemo.g:565:1: ruleSubAnalysisFunction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is a subfunction of the function' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSubAnalysisFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:568:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is a subfunction of the function' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalReqPatDemo.g:569:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is a subfunction of the function' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalReqPatDemo.g:569:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is a subfunction of the function' ( (otherlv_3= RULE_ID ) ) )
            // InternalReqPatDemo.g:569:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is a subfunction of the function' ( (otherlv_3= RULE_ID ) )
            {
            // InternalReqPatDemo.g:569:2: ()
            // InternalReqPatDemo.g:570:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubAnalysisFunctionAccess().getAnalysisFunctionAction_0(),
                        current);
                

            }

            // InternalReqPatDemo.g:575:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqPatDemo.g:576:1: (lv_name_1_0= RULE_ID )
            {
            // InternalReqPatDemo.g:576:1: (lv_name_1_0= RULE_ID )
            // InternalReqPatDemo.g:577:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubAnalysisFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubAnalysisFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"de.fraunhofer.iem.reqpat.core.ReqPat.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getSubAnalysisFunctionAccess().getIsASubfunctionOfTheFunctionKeyword_2());
                
            // InternalReqPatDemo.g:597:1: ( (otherlv_3= RULE_ID ) )
            // InternalReqPatDemo.g:598:1: (otherlv_3= RULE_ID )
            {
            // InternalReqPatDemo.g:598:1: (otherlv_3= RULE_ID )
            // InternalReqPatDemo.g:599:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubAnalysisFunctionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_3, grammarAccess.getSubAnalysisFunctionAccess().getParentAnalysisFunctionAnalysisFunctionCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleSubAnalysisFunction"


    // $ANTLR start "entryRuleIncomingInformationDef"
    // InternalReqPatDemo.g:618:1: entryRuleIncomingInformationDef returns [EObject current=null] : iv_ruleIncomingInformationDef= ruleIncomingInformationDef EOF ;
    public final EObject entryRuleIncomingInformationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncomingInformationDef = null;


        try {
            // InternalReqPatDemo.g:619:2: (iv_ruleIncomingInformationDef= ruleIncomingInformationDef EOF )
            // InternalReqPatDemo.g:620:2: iv_ruleIncomingInformationDef= ruleIncomingInformationDef EOF
            {
             newCompositeNode(grammarAccess.getIncomingInformationDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIncomingInformationDef=ruleIncomingInformationDef();

            state._fsp--;

             current =iv_ruleIncomingInformationDef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleIncomingInformationDef"


    // $ANTLR start "ruleIncomingInformationDef"
    // InternalReqPatDemo.g:627:1: ruleIncomingInformationDef returns [EObject current=null] : ( () otherlv_1= 'is received by the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'from the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )* ) ;
    public final EObject ruleIncomingInformationDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_informationList_6_0 = null;

        EObject lv_informationList_8_0 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:630:28: ( ( () otherlv_1= 'is received by the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'from the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )* ) )
            // InternalReqPatDemo.g:631:1: ( () otherlv_1= 'is received by the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'from the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )* )
            {
            // InternalReqPatDemo.g:631:1: ( () otherlv_1= 'is received by the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'from the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )* )
            // InternalReqPatDemo.g:631:2: () otherlv_1= 'is received by the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'from the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )*
            {
            // InternalReqPatDemo.g:631:2: ()
            // InternalReqPatDemo.g:632:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIncomingInformationDefAccess().getIncomingInformationDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getIncomingInformationDefAccess().getIsReceivedByTheFunctionKeyword_1());
                
            // InternalReqPatDemo.g:641:1: ( (otherlv_2= RULE_ID ) )
            // InternalReqPatDemo.g:642:1: (otherlv_2= RULE_ID )
            {
            // InternalReqPatDemo.g:642:1: (otherlv_2= RULE_ID )
            // InternalReqPatDemo.g:643:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncomingInformationDefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            		newLeafNode(otherlv_2, grammarAccess.getIncomingInformationDefAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 
            	

            }


            }

            // InternalReqPatDemo.g:654:2: (otherlv_3= 'from the functional device' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqPatDemo.g:654:4: otherlv_3= 'from the functional device' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getIncomingInformationDefAccess().getFromTheFunctionalDeviceKeyword_3_0());
                        
                    // InternalReqPatDemo.g:658:1: ( (otherlv_4= RULE_ID ) )
                    // InternalReqPatDemo.g:659:1: (otherlv_4= RULE_ID )
                    {
                    // InternalReqPatDemo.g:659:1: (otherlv_4= RULE_ID )
                    // InternalReqPatDemo.g:660:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncomingInformationDefRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getIncomingInformationDefAccess().getFunctionalDeviceFunctionalDeviceCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_5, grammarAccess.getIncomingInformationDefAccess().getColonKeyword_4());
                
            // InternalReqPatDemo.g:675:1: ( (lv_informationList_6_0= ruleInformation ) )
            // InternalReqPatDemo.g:676:1: (lv_informationList_6_0= ruleInformation )
            {
            // InternalReqPatDemo.g:676:1: (lv_informationList_6_0= ruleInformation )
            // InternalReqPatDemo.g:677:3: lv_informationList_6_0= ruleInformation
            {
             
            	        newCompositeNode(grammarAccess.getIncomingInformationDefAccess().getInformationListInformationParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_12);
            lv_informationList_6_0=ruleInformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIncomingInformationDefRule());
            	        }
                   		add(
                   			current, 
                   			"informationList",
                    		lv_informationList_6_0, 
                    		"de.fraunhofer.iem.reqpat.demo.ReqPatDemo.Information");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalReqPatDemo.g:693:2: (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReqPatDemo.g:693:4: otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIncomingInformationDefAccess().getCommaKeyword_6_0());
            	        
            	    // InternalReqPatDemo.g:697:1: ( (lv_informationList_8_0= ruleInformation ) )
            	    // InternalReqPatDemo.g:698:1: (lv_informationList_8_0= ruleInformation )
            	    {
            	    // InternalReqPatDemo.g:698:1: (lv_informationList_8_0= ruleInformation )
            	    // InternalReqPatDemo.g:699:3: lv_informationList_8_0= ruleInformation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIncomingInformationDefAccess().getInformationListInformationParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_informationList_8_0=ruleInformation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIncomingInformationDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"informationList",
            	            		lv_informationList_8_0, 
            	            		"de.fraunhofer.iem.reqpat.demo.ReqPatDemo.Information");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleIncomingInformationDef"


    // $ANTLR start "entryRuleOutgoingInformationDef"
    // InternalReqPatDemo.g:723:1: entryRuleOutgoingInformationDef returns [EObject current=null] : iv_ruleOutgoingInformationDef= ruleOutgoingInformationDef EOF ;
    public final EObject entryRuleOutgoingInformationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutgoingInformationDef = null;


        try {
            // InternalReqPatDemo.g:724:2: (iv_ruleOutgoingInformationDef= ruleOutgoingInformationDef EOF )
            // InternalReqPatDemo.g:725:2: iv_ruleOutgoingInformationDef= ruleOutgoingInformationDef EOF
            {
             newCompositeNode(grammarAccess.getOutgoingInformationDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOutgoingInformationDef=ruleOutgoingInformationDef();

            state._fsp--;

             current =iv_ruleOutgoingInformationDef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutgoingInformationDef"


    // $ANTLR start "ruleOutgoingInformationDef"
    // InternalReqPatDemo.g:732:1: ruleOutgoingInformationDef returns [EObject current=null] : ( () otherlv_1= 'is sent from the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )* ) ;
    public final EObject ruleOutgoingInformationDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_informationList_6_0 = null;

        EObject lv_informationList_8_0 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:735:28: ( ( () otherlv_1= 'is sent from the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )* ) )
            // InternalReqPatDemo.g:736:1: ( () otherlv_1= 'is sent from the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )* )
            {
            // InternalReqPatDemo.g:736:1: ( () otherlv_1= 'is sent from the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )* )
            // InternalReqPatDemo.g:736:2: () otherlv_1= 'is sent from the function' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'to the functional device' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' ( (lv_informationList_6_0= ruleInformation ) ) (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )*
            {
            // InternalReqPatDemo.g:736:2: ()
            // InternalReqPatDemo.g:737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOutgoingInformationDefAccess().getOutgoingInformationDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getOutgoingInformationDefAccess().getIsSentFromTheFunctionKeyword_1());
                
            // InternalReqPatDemo.g:746:1: ( (otherlv_2= RULE_ID ) )
            // InternalReqPatDemo.g:747:1: (otherlv_2= RULE_ID )
            {
            // InternalReqPatDemo.g:747:1: (otherlv_2= RULE_ID )
            // InternalReqPatDemo.g:748:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutgoingInformationDefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            		newLeafNode(otherlv_2, grammarAccess.getOutgoingInformationDefAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 
            	

            }


            }

            // InternalReqPatDemo.g:759:2: (otherlv_3= 'to the functional device' ( (otherlv_4= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReqPatDemo.g:759:4: otherlv_3= 'to the functional device' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getOutgoingInformationDefAccess().getToTheFunctionalDeviceKeyword_3_0());
                        
                    // InternalReqPatDemo.g:763:1: ( (otherlv_4= RULE_ID ) )
                    // InternalReqPatDemo.g:764:1: (otherlv_4= RULE_ID )
                    {
                    // InternalReqPatDemo.g:764:1: (otherlv_4= RULE_ID )
                    // InternalReqPatDemo.g:765:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutgoingInformationDefRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

                    		newLeafNode(otherlv_4, grammarAccess.getOutgoingInformationDefAccess().getFunctionalDeviceFunctionalDeviceCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_5, grammarAccess.getOutgoingInformationDefAccess().getColonKeyword_4());
                
            // InternalReqPatDemo.g:780:1: ( (lv_informationList_6_0= ruleInformation ) )
            // InternalReqPatDemo.g:781:1: (lv_informationList_6_0= ruleInformation )
            {
            // InternalReqPatDemo.g:781:1: (lv_informationList_6_0= ruleInformation )
            // InternalReqPatDemo.g:782:3: lv_informationList_6_0= ruleInformation
            {
             
            	        newCompositeNode(grammarAccess.getOutgoingInformationDefAccess().getInformationListInformationParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_12);
            lv_informationList_6_0=ruleInformation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutgoingInformationDefRule());
            	        }
                   		add(
                   			current, 
                   			"informationList",
                    		lv_informationList_6_0, 
                    		"de.fraunhofer.iem.reqpat.demo.ReqPatDemo.Information");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalReqPatDemo.g:798:2: (otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalReqPatDemo.g:798:4: otherlv_7= ',' ( (lv_informationList_8_0= ruleInformation ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_7, grammarAccess.getOutgoingInformationDefAccess().getCommaKeyword_6_0());
            	        
            	    // InternalReqPatDemo.g:802:1: ( (lv_informationList_8_0= ruleInformation ) )
            	    // InternalReqPatDemo.g:803:1: (lv_informationList_8_0= ruleInformation )
            	    {
            	    // InternalReqPatDemo.g:803:1: (lv_informationList_8_0= ruleInformation )
            	    // InternalReqPatDemo.g:804:3: lv_informationList_8_0= ruleInformation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutgoingInformationDefAccess().getInformationListInformationParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_informationList_8_0=ruleInformation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutgoingInformationDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"informationList",
            	            		lv_informationList_8_0, 
            	            		"de.fraunhofer.iem.reqpat.demo.ReqPatDemo.Information");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleOutgoingInformationDef"


    // $ANTLR start "entryRuleInformationUsage"
    // InternalReqPatDemo.g:828:1: entryRuleInformationUsage returns [EObject current=null] : iv_ruleInformationUsage= ruleInformationUsage EOF ;
    public final EObject entryRuleInformationUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformationUsage = null;


        try {
            // InternalReqPatDemo.g:829:2: (iv_ruleInformationUsage= ruleInformationUsage EOF )
            // InternalReqPatDemo.g:830:2: iv_ruleInformationUsage= ruleInformationUsage EOF
            {
             newCompositeNode(grammarAccess.getInformationUsageRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInformationUsage=ruleInformationUsage();

            state._fsp--;

             current =iv_ruleInformationUsage; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInformationUsage"


    // $ANTLR start "ruleInformationUsage"
    // InternalReqPatDemo.g:837:1: ruleInformationUsage returns [EObject current=null] : ( () otherlv_1= 'is used by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) ;
    public final EObject ruleInformationUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:840:28: ( ( () otherlv_1= 'is used by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) )
            // InternalReqPatDemo.g:841:1: ( () otherlv_1= 'is used by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            {
            // InternalReqPatDemo.g:841:1: ( () otherlv_1= 'is used by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            // InternalReqPatDemo.g:841:2: () otherlv_1= 'is used by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            {
            // InternalReqPatDemo.g:841:2: ()
            // InternalReqPatDemo.g:842:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInformationUsageAccess().getInformationUsageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getInformationUsageAccess().getIsUsedByTheFunctionKeyword_1());
                
            // InternalReqPatDemo.g:851:1: ( (otherlv_2= RULE_ID ) )
            // InternalReqPatDemo.g:852:1: (otherlv_2= RULE_ID )
            {
            // InternalReqPatDemo.g:852:1: (otherlv_2= RULE_ID )
            // InternalReqPatDemo.g:853:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInformationUsageRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            		newLeafNode(otherlv_2, grammarAccess.getInformationUsageAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getInformationUsageAccess().getColonKeyword_3());
                
            // InternalReqPatDemo.g:868:1: ( (otherlv_4= RULE_ID ) )
            // InternalReqPatDemo.g:869:1: (otherlv_4= RULE_ID )
            {
            // InternalReqPatDemo.g:869:1: (otherlv_4= RULE_ID )
            // InternalReqPatDemo.g:870:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInformationUsageRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            		newLeafNode(otherlv_4, grammarAccess.getInformationUsageAccess().getInformationListInformationCrossReference_4_0()); 
            	

            }


            }

            // InternalReqPatDemo.g:881:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalReqPatDemo.g:881:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInformationUsageAccess().getCommaKeyword_5_0());
            	        
            	    // InternalReqPatDemo.g:885:1: ( (otherlv_6= RULE_ID ) )
            	    // InternalReqPatDemo.g:886:1: (otherlv_6= RULE_ID )
            	    {
            	    // InternalReqPatDemo.g:886:1: (otherlv_6= RULE_ID )
            	    // InternalReqPatDemo.g:887:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInformationUsageRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            	    		newLeafNode(otherlv_6, grammarAccess.getInformationUsageAccess().getInformationListInformationCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleInformationUsage"


    // $ANTLR start "entryRuleInformationCreation"
    // InternalReqPatDemo.g:906:1: entryRuleInformationCreation returns [EObject current=null] : iv_ruleInformationCreation= ruleInformationCreation EOF ;
    public final EObject entryRuleInformationCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformationCreation = null;


        try {
            // InternalReqPatDemo.g:907:2: (iv_ruleInformationCreation= ruleInformationCreation EOF )
            // InternalReqPatDemo.g:908:2: iv_ruleInformationCreation= ruleInformationCreation EOF
            {
             newCompositeNode(grammarAccess.getInformationCreationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInformationCreation=ruleInformationCreation();

            state._fsp--;

             current =iv_ruleInformationCreation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInformationCreation"


    // $ANTLR start "ruleInformationCreation"
    // InternalReqPatDemo.g:915:1: ruleInformationCreation returns [EObject current=null] : ( () otherlv_1= 'is created by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) ;
    public final EObject ruleInformationCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:918:28: ( ( () otherlv_1= 'is created by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) )
            // InternalReqPatDemo.g:919:1: ( () otherlv_1= 'is created by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            {
            // InternalReqPatDemo.g:919:1: ( () otherlv_1= 'is created by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            // InternalReqPatDemo.g:919:2: () otherlv_1= 'is created by the function' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            {
            // InternalReqPatDemo.g:919:2: ()
            // InternalReqPatDemo.g:920:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInformationCreationAccess().getInformationCreationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getInformationCreationAccess().getIsCreatedByTheFunctionKeyword_1());
                
            // InternalReqPatDemo.g:929:1: ( (otherlv_2= RULE_ID ) )
            // InternalReqPatDemo.g:930:1: (otherlv_2= RULE_ID )
            {
            // InternalReqPatDemo.g:930:1: (otherlv_2= RULE_ID )
            // InternalReqPatDemo.g:931:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInformationCreationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); 

            		newLeafNode(otherlv_2, grammarAccess.getInformationCreationAccess().getAnalysisFunctionAnalysisFunctionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getInformationCreationAccess().getColonKeyword_3());
                
            // InternalReqPatDemo.g:946:1: ( (otherlv_4= RULE_ID ) )
            // InternalReqPatDemo.g:947:1: (otherlv_4= RULE_ID )
            {
            // InternalReqPatDemo.g:947:1: (otherlv_4= RULE_ID )
            // InternalReqPatDemo.g:948:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInformationCreationRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            		newLeafNode(otherlv_4, grammarAccess.getInformationCreationAccess().getInformationListInformationCrossReference_4_0()); 
            	

            }


            }

            // InternalReqPatDemo.g:959:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReqPatDemo.g:959:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInformationCreationAccess().getCommaKeyword_5_0());
            	        
            	    // InternalReqPatDemo.g:963:1: ( (otherlv_6= RULE_ID ) )
            	    // InternalReqPatDemo.g:964:1: (otherlv_6= RULE_ID )
            	    {
            	    // InternalReqPatDemo.g:964:1: (otherlv_6= RULE_ID )
            	    // InternalReqPatDemo.g:965:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInformationCreationRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            	    		newLeafNode(otherlv_6, grammarAccess.getInformationCreationAccess().getInformationListInformationCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleInformationCreation"


    // $ANTLR start "entryRuleAnalysisFunction"
    // InternalReqPatDemo.g:984:1: entryRuleAnalysisFunction returns [EObject current=null] : iv_ruleAnalysisFunction= ruleAnalysisFunction EOF ;
    public final EObject entryRuleAnalysisFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalysisFunction = null;


        try {
            // InternalReqPatDemo.g:985:2: (iv_ruleAnalysisFunction= ruleAnalysisFunction EOF )
            // InternalReqPatDemo.g:986:2: iv_ruleAnalysisFunction= ruleAnalysisFunction EOF
            {
             newCompositeNode(grammarAccess.getAnalysisFunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnalysisFunction=ruleAnalysisFunction();

            state._fsp--;

             current =iv_ruleAnalysisFunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnalysisFunction"


    // $ANTLR start "ruleAnalysisFunction"
    // InternalReqPatDemo.g:993:1: ruleAnalysisFunction returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnalysisFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:996:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalReqPatDemo.g:997:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalReqPatDemo.g:997:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalReqPatDemo.g:997:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalReqPatDemo.g:997:2: ()
            // InternalReqPatDemo.g:998:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnalysisFunctionAccess().getAnalysisFunctionAction_0(),
                        current);
                

            }

            // InternalReqPatDemo.g:1003:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqPatDemo.g:1004:1: (lv_name_1_0= RULE_ID )
            {
            // InternalReqPatDemo.g:1004:1: (lv_name_1_0= RULE_ID )
            // InternalReqPatDemo.g:1005:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnalysisFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnalysisFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"de.fraunhofer.iem.reqpat.core.ReqPat.ID");
            	    

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
    // $ANTLR end "ruleAnalysisFunction"


    // $ANTLR start "entryRuleInformation"
    // InternalReqPatDemo.g:1029:1: entryRuleInformation returns [EObject current=null] : iv_ruleInformation= ruleInformation EOF ;
    public final EObject entryRuleInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformation = null;


        try {
            // InternalReqPatDemo.g:1030:2: (iv_ruleInformation= ruleInformation EOF )
            // InternalReqPatDemo.g:1031:2: iv_ruleInformation= ruleInformation EOF
            {
             newCompositeNode(grammarAccess.getInformationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInformation=ruleInformation();

            state._fsp--;

             current =iv_ruleInformation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInformation"


    // $ANTLR start "ruleInformation"
    // InternalReqPatDemo.g:1038:1: ruleInformation returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInformation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:1041:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalReqPatDemo.g:1042:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalReqPatDemo.g:1042:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalReqPatDemo.g:1042:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalReqPatDemo.g:1042:2: ()
            // InternalReqPatDemo.g:1043:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInformationAccess().getInformationAction_0(),
                        current);
                

            }

            // InternalReqPatDemo.g:1048:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqPatDemo.g:1049:1: (lv_name_1_0= RULE_ID )
            {
            // InternalReqPatDemo.g:1049:1: (lv_name_1_0= RULE_ID )
            // InternalReqPatDemo.g:1050:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInformationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"de.fraunhofer.iem.reqpat.core.ReqPat.ID");
            	    

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
    // $ANTLR end "ruleInformation"


    // $ANTLR start "entryRuleSpecObj"
    // InternalReqPatDemo.g:1074:1: entryRuleSpecObj returns [EObject current=null] : iv_ruleSpecObj= ruleSpecObj EOF ;
    public final EObject entryRuleSpecObj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecObj = null;


        try {
            // InternalReqPatDemo.g:1075:2: (iv_ruleSpecObj= ruleSpecObj EOF )
            // InternalReqPatDemo.g:1076:2: iv_ruleSpecObj= ruleSpecObj EOF
            {
             newCompositeNode(grammarAccess.getSpecObjRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecObj=ruleSpecObj();

            state._fsp--;

             current =iv_ruleSpecObj; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecObj"


    // $ANTLR start "ruleSpecObj"
    // InternalReqPatDemo.g:1083:1: ruleSpecObj returns [EObject current=null] : (this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT ) ;
    public final EObject ruleSpecObj() throws RecognitionException {
        EObject current = null;

        Token this_SPECOBJECTDELIMITERLEFT_0=null;
        Token this_SPECOBJECTDELIMITERRIGHT_4=null;
        EObject this_HeadingSO_1 = null;

        EObject this_ReqPatSO_2 = null;

        EObject this_FreeTextSO_3 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:1086:28: ( (this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT ) )
            // InternalReqPatDemo.g:1087:1: (this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT )
            {
            // InternalReqPatDemo.g:1087:1: (this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT )
            // InternalReqPatDemo.g:1087:2: this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT
            {
            this_SPECOBJECTDELIMITERLEFT_0=(Token)match(input,RULE_SPECOBJECTDELIMITERLEFT,FollowSets000.FOLLOW_14); 
             
                newLeafNode(this_SPECOBJECTDELIMITERLEFT_0, grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERLEFTTerminalRuleCall_0()); 
                
            // InternalReqPatDemo.g:1091:1: (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_PARAMDELIMITERLEFT) ) {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt12=1;
                    }
                    break;
                case 31:
                    {
                    alt12=2;
                    }
                    break;
                case 32:
                    {
                    alt12=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalReqPatDemo.g:1092:5: this_HeadingSO_1= ruleHeadingSO
                    {
                     
                            newCompositeNode(grammarAccess.getSpecObjAccess().getHeadingSOParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_15);
                    this_HeadingSO_1=ruleHeadingSO();

                    state._fsp--;

                     
                            current = this_HeadingSO_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalReqPatDemo.g:1102:5: this_ReqPatSO_2= ruleReqPatSO
                    {
                     
                            newCompositeNode(grammarAccess.getSpecObjAccess().getReqPatSOParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_15);
                    this_ReqPatSO_2=ruleReqPatSO();

                    state._fsp--;

                     
                            current = this_ReqPatSO_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalReqPatDemo.g:1112:5: this_FreeTextSO_3= ruleFreeTextSO
                    {
                     
                            newCompositeNode(grammarAccess.getSpecObjAccess().getFreeTextSOParserRuleCall_1_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_15);
                    this_FreeTextSO_3=ruleFreeTextSO();

                    state._fsp--;

                     
                            current = this_FreeTextSO_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_SPECOBJECTDELIMITERRIGHT_4=(Token)match(input,RULE_SPECOBJECTDELIMITERRIGHT,FollowSets000.FOLLOW_2); 
             
                newLeafNode(this_SPECOBJECTDELIMITERRIGHT_4, grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERRIGHTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleSpecObj"


    // $ANTLR start "entryRuleHeadingSO"
    // InternalReqPatDemo.g:1132:1: entryRuleHeadingSO returns [EObject current=null] : iv_ruleHeadingSO= ruleHeadingSO EOF ;
    public final EObject entryRuleHeadingSO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadingSO = null;


        try {
            // InternalReqPatDemo.g:1133:2: (iv_ruleHeadingSO= ruleHeadingSO EOF )
            // InternalReqPatDemo.g:1134:2: iv_ruleHeadingSO= ruleHeadingSO EOF
            {
             newCompositeNode(grammarAccess.getHeadingSORule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHeadingSO=ruleHeadingSO();

            state._fsp--;

             current =iv_ruleHeadingSO; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeadingSO"


    // $ANTLR start "ruleHeadingSO"
    // InternalReqPatDemo.g:1141:1: ruleHeadingSO returns [EObject current=null] : ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeadingSO() throws RecognitionException {
        EObject current = null;

        Token this_PARAMDELIMITERLEFT_1=null;
        Token otherlv_2=null;
        Token this_PARAMDELIMITERRIGHT_3=null;
        Token this_PARAMDELIMITERLEFT_4=null;
        Token lv_id_5_0=null;
        Token this_PARAMDELIMITERRIGHT_6=null;
        Token this_PARAMDELIMITERLEFT_7=null;
        Token lv_parent_8_0=null;
        Token this_PARAMDELIMITERRIGHT_9=null;
        Token lv_text_10_0=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:1144:28: ( ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) ) ) )
            // InternalReqPatDemo.g:1145:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) ) )
            {
            // InternalReqPatDemo.g:1145:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) ) )
            // InternalReqPatDemo.g:1145:2: () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) )
            {
            // InternalReqPatDemo.g:1145:2: ()
            // InternalReqPatDemo.g:1146:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHeadingSOAccess().getHeadingSpecObjectAction_0(),
                        current);
                

            }

            this_PARAMDELIMITERLEFT_1=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_16); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_1, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_17); 

                	newLeafNode(otherlv_2, grammarAccess.getHeadingSOAccess().getHKeyword_2());
                
            this_PARAMDELIMITERRIGHT_3=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_14); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_3, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
                
            this_PARAMDELIMITERLEFT_4=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_5); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_4, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
                
            // InternalReqPatDemo.g:1167:1: ( (lv_id_5_0= RULE_ID ) )
            // InternalReqPatDemo.g:1168:1: (lv_id_5_0= RULE_ID )
            {
            // InternalReqPatDemo.g:1168:1: (lv_id_5_0= RULE_ID )
            // InternalReqPatDemo.g:1169:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

            			newLeafNode(lv_id_5_0, grammarAccess.getHeadingSOAccess().getIdIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeadingSORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_5_0, 
                    		"de.fraunhofer.iem.reqpat.core.ReqPat.ID");
            	    

            }


            }

            this_PARAMDELIMITERRIGHT_6=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_18); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_6, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
                
            // InternalReqPatDemo.g:1189:1: (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_PARAMDELIMITERLEFT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReqPatDemo.g:1189:2: this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT
                    {
                    this_PARAMDELIMITERLEFT_7=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_8); 
                     
                        newLeafNode(this_PARAMDELIMITERLEFT_7, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
                        
                    // InternalReqPatDemo.g:1193:1: ( (lv_parent_8_0= RULE_STRING ) )
                    // InternalReqPatDemo.g:1194:1: (lv_parent_8_0= RULE_STRING )
                    {
                    // InternalReqPatDemo.g:1194:1: (lv_parent_8_0= RULE_STRING )
                    // InternalReqPatDemo.g:1195:3: lv_parent_8_0= RULE_STRING
                    {
                    lv_parent_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); 

                    			newLeafNode(lv_parent_8_0, grammarAccess.getHeadingSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHeadingSORule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parent",
                            		lv_parent_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }

                    this_PARAMDELIMITERRIGHT_9=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_8); 
                     
                        newLeafNode(this_PARAMDELIMITERRIGHT_9, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
                        

                    }
                    break;

            }

            // InternalReqPatDemo.g:1215:3: ( (lv_text_10_0= RULE_STRING ) )
            // InternalReqPatDemo.g:1216:1: (lv_text_10_0= RULE_STRING )
            {
            // InternalReqPatDemo.g:1216:1: (lv_text_10_0= RULE_STRING )
            // InternalReqPatDemo.g:1217:3: lv_text_10_0= RULE_STRING
            {
            lv_text_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_text_10_0, grammarAccess.getHeadingSOAccess().getTextSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeadingSORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_10_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // $ANTLR end "ruleHeadingSO"


    // $ANTLR start "entryRuleReqPatSO"
    // InternalReqPatDemo.g:1241:1: entryRuleReqPatSO returns [EObject current=null] : iv_ruleReqPatSO= ruleReqPatSO EOF ;
    public final EObject entryRuleReqPatSO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqPatSO = null;


        try {
            // InternalReqPatDemo.g:1242:2: (iv_ruleReqPatSO= ruleReqPatSO EOF )
            // InternalReqPatDemo.g:1243:2: iv_ruleReqPatSO= ruleReqPatSO EOF
            {
             newCompositeNode(grammarAccess.getReqPatSORule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReqPatSO=ruleReqPatSO();

            state._fsp--;

             current =iv_ruleReqPatSO; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleReqPatSO"


    // $ANTLR start "ruleReqPatSO"
    // InternalReqPatDemo.g:1250:1: ruleReqPatSO returns [EObject current=null] : ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+ ) ;
    public final EObject ruleReqPatSO() throws RecognitionException {
        EObject current = null;

        Token this_PARAMDELIMITERLEFT_1=null;
        Token otherlv_2=null;
        Token this_PARAMDELIMITERRIGHT_3=null;
        Token this_PARAMDELIMITERLEFT_4=null;
        Token lv_id_5_0=null;
        Token this_PARAMDELIMITERRIGHT_6=null;
        Token this_PARAMDELIMITERLEFT_7=null;
        Token lv_parent_8_0=null;
        Token this_PARAMDELIMITERRIGHT_9=null;
        EObject lv_requirementPatterns_10_0 = null;


         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:1253:28: ( ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+ ) )
            // InternalReqPatDemo.g:1254:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+ )
            {
            // InternalReqPatDemo.g:1254:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+ )
            // InternalReqPatDemo.g:1254:2: () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+
            {
            // InternalReqPatDemo.g:1254:2: ()
            // InternalReqPatDemo.g:1255:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReqPatSOAccess().getRequirementPatternSpecObjectAction_0(),
                        current);
                

            }

            this_PARAMDELIMITERLEFT_1=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_1, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_17); 

                	newLeafNode(otherlv_2, grammarAccess.getReqPatSOAccess().getRPKeyword_2());
                
            this_PARAMDELIMITERRIGHT_3=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_14); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_3, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
                
            this_PARAMDELIMITERLEFT_4=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_5); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_4, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
                
            // InternalReqPatDemo.g:1276:1: ( (lv_id_5_0= RULE_ID ) )
            // InternalReqPatDemo.g:1277:1: (lv_id_5_0= RULE_ID )
            {
            // InternalReqPatDemo.g:1277:1: (lv_id_5_0= RULE_ID )
            // InternalReqPatDemo.g:1278:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

            			newLeafNode(lv_id_5_0, grammarAccess.getReqPatSOAccess().getIdIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReqPatSORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_5_0, 
                    		"de.fraunhofer.iem.reqpat.core.ReqPat.ID");
            	    

            }


            }

            this_PARAMDELIMITERRIGHT_6=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_20); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_6, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
                
            // InternalReqPatDemo.g:1298:1: (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_PARAMDELIMITERLEFT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReqPatDemo.g:1298:2: this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT
                    {
                    this_PARAMDELIMITERLEFT_7=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_8); 
                     
                        newLeafNode(this_PARAMDELIMITERLEFT_7, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
                        
                    // InternalReqPatDemo.g:1302:1: ( (lv_parent_8_0= RULE_STRING ) )
                    // InternalReqPatDemo.g:1303:1: (lv_parent_8_0= RULE_STRING )
                    {
                    // InternalReqPatDemo.g:1303:1: (lv_parent_8_0= RULE_STRING )
                    // InternalReqPatDemo.g:1304:3: lv_parent_8_0= RULE_STRING
                    {
                    lv_parent_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); 

                    			newLeafNode(lv_parent_8_0, grammarAccess.getReqPatSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReqPatSORule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parent",
                            		lv_parent_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }

                    this_PARAMDELIMITERRIGHT_9=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_20); 
                     
                        newLeafNode(this_PARAMDELIMITERRIGHT_9, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
                        

                    }
                    break;

            }

            // InternalReqPatDemo.g:1324:3: ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=16 && LA15_0<=18)||LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReqPatDemo.g:1325:1: (lv_requirementPatterns_10_0= ruleRequirementPattern )
            	    {
            	    // InternalReqPatDemo.g:1325:1: (lv_requirementPatterns_10_0= ruleRequirementPattern )
            	    // InternalReqPatDemo.g:1326:3: lv_requirementPatterns_10_0= ruleRequirementPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReqPatSOAccess().getRequirementPatternsRequirementPatternParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_requirementPatterns_10_0=ruleRequirementPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReqPatSORule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requirementPatterns",
            	            		lv_requirementPatterns_10_0, 
            	            		"de.fraunhofer.iem.reqpat.demo.ReqPatDemo.RequirementPattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // $ANTLR end "ruleReqPatSO"


    // $ANTLR start "entryRuleFreeTextSO"
    // InternalReqPatDemo.g:1350:1: entryRuleFreeTextSO returns [EObject current=null] : iv_ruleFreeTextSO= ruleFreeTextSO EOF ;
    public final EObject entryRuleFreeTextSO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeTextSO = null;


        try {
            // InternalReqPatDemo.g:1351:2: (iv_ruleFreeTextSO= ruleFreeTextSO EOF )
            // InternalReqPatDemo.g:1352:2: iv_ruleFreeTextSO= ruleFreeTextSO EOF
            {
             newCompositeNode(grammarAccess.getFreeTextSORule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFreeTextSO=ruleFreeTextSO();

            state._fsp--;

             current =iv_ruleFreeTextSO; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleFreeTextSO"


    // $ANTLR start "ruleFreeTextSO"
    // InternalReqPatDemo.g:1359:1: ruleFreeTextSO returns [EObject current=null] : ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )? ) ;
    public final EObject ruleFreeTextSO() throws RecognitionException {
        EObject current = null;

        Token this_PARAMDELIMITERLEFT_1=null;
        Token otherlv_2=null;
        Token this_PARAMDELIMITERRIGHT_3=null;
        Token this_PARAMDELIMITERLEFT_4=null;
        Token lv_id_5_0=null;
        Token this_PARAMDELIMITERRIGHT_6=null;
        Token this_PARAMDELIMITERLEFT_7=null;
        Token lv_parent_8_0=null;
        Token this_PARAMDELIMITERRIGHT_9=null;
        Token lv_freeText_10_0=null;

         enterRule(); 
            
        try {
            // InternalReqPatDemo.g:1362:28: ( ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )? ) )
            // InternalReqPatDemo.g:1363:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )? )
            {
            // InternalReqPatDemo.g:1363:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )? )
            // InternalReqPatDemo.g:1363:2: () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )?
            {
            // InternalReqPatDemo.g:1363:2: ()
            // InternalReqPatDemo.g:1364:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFreeTextSOAccess().getFreeTextSpecObjectAction_0(),
                        current);
                

            }

            this_PARAMDELIMITERLEFT_1=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_22); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_1, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_17); 

                	newLeafNode(otherlv_2, grammarAccess.getFreeTextSOAccess().getFKeyword_2());
                
            this_PARAMDELIMITERRIGHT_3=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_14); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_3, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
                
            this_PARAMDELIMITERLEFT_4=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_5); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_4, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
                
            // InternalReqPatDemo.g:1385:1: ( (lv_id_5_0= RULE_ID ) )
            // InternalReqPatDemo.g:1386:1: (lv_id_5_0= RULE_ID )
            {
            // InternalReqPatDemo.g:1386:1: (lv_id_5_0= RULE_ID )
            // InternalReqPatDemo.g:1387:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

            			newLeafNode(lv_id_5_0, grammarAccess.getFreeTextSOAccess().getIdIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreeTextSORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_5_0, 
                    		"de.fraunhofer.iem.reqpat.core.ReqPat.ID");
            	    

            }


            }

            this_PARAMDELIMITERRIGHT_6=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_23); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_6, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
                
            // InternalReqPatDemo.g:1407:1: (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_PARAMDELIMITERLEFT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReqPatDemo.g:1407:2: this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT
                    {
                    this_PARAMDELIMITERLEFT_7=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_8); 
                     
                        newLeafNode(this_PARAMDELIMITERLEFT_7, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
                        
                    // InternalReqPatDemo.g:1411:1: ( (lv_parent_8_0= RULE_STRING ) )
                    // InternalReqPatDemo.g:1412:1: (lv_parent_8_0= RULE_STRING )
                    {
                    // InternalReqPatDemo.g:1412:1: (lv_parent_8_0= RULE_STRING )
                    // InternalReqPatDemo.g:1413:3: lv_parent_8_0= RULE_STRING
                    {
                    lv_parent_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); 

                    			newLeafNode(lv_parent_8_0, grammarAccess.getFreeTextSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreeTextSORule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parent",
                            		lv_parent_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }

                    this_PARAMDELIMITERRIGHT_9=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_24); 
                     
                        newLeafNode(this_PARAMDELIMITERRIGHT_9, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
                        

                    }
                    break;

            }

            // InternalReqPatDemo.g:1433:3: ( (lv_freeText_10_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReqPatDemo.g:1434:1: (lv_freeText_10_0= RULE_STRING )
                    {
                    // InternalReqPatDemo.g:1434:1: (lv_freeText_10_0= RULE_STRING )
                    // InternalReqPatDemo.g:1435:3: lv_freeText_10_0= RULE_STRING
                    {
                    lv_freeText_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    			newLeafNode(lv_freeText_10_0, grammarAccess.getFreeTextSOAccess().getFreeTextSTRINGTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreeTextSORule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"freeText",
                            		lv_freeText_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


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
    // $ANTLR end "ruleFreeTextSO"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000034400000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000120L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000170100L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000170102L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000122L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    }


}