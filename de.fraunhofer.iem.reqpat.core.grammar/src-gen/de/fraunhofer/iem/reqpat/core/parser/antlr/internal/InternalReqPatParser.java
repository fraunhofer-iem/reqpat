package de.fraunhofer.iem.reqpat.core.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.iem.reqpat.core.services.ReqPatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqPatParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g"; }



     	private ReqPatGrammarAccess grammarAccess;
     	
        public InternalReqPatParser(TokenStream input, ReqPatGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected ReqPatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:67:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:68:2: (iv_ruleRoot= ruleRoot EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:69:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot85); 

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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:76:1: ruleRoot returns [EObject current=null] : ( () ( (lv_specObjects_1_0= ruleSpecObj ) )+ ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_specObjects_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:79:28: ( ( () ( (lv_specObjects_1_0= ruleSpecObj ) )+ ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:80:1: ( () ( (lv_specObjects_1_0= ruleSpecObj ) )+ )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:80:1: ( () ( (lv_specObjects_1_0= ruleSpecObj ) )+ )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:80:2: () ( (lv_specObjects_1_0= ruleSpecObj ) )+
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:80:2: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRootAccess().getSpecificationAction_0(),
                        current);
                

            }

            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:86:2: ( (lv_specObjects_1_0= ruleSpecObj ) )+
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
            	    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:87:1: (lv_specObjects_1_0= ruleSpecObj )
            	    {
            	    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:87:1: (lv_specObjects_1_0= ruleSpecObj )
            	    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:88:3: lv_specObjects_1_0= ruleSpecObj
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getSpecObjectsSpecObjParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSpecObj_in_ruleRoot140);
            	    lv_specObjects_1_0=ruleSpecObj();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"specObjects",
            	            		lv_specObjects_1_0, 
            	            		"SpecObj");
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


    // $ANTLR start "entryRuleSpecObj"
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:112:1: entryRuleSpecObj returns [EObject current=null] : iv_ruleSpecObj= ruleSpecObj EOF ;
    public final EObject entryRuleSpecObj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecObj = null;


        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:113:2: (iv_ruleSpecObj= ruleSpecObj EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:114:2: iv_ruleSpecObj= ruleSpecObj EOF
            {
             newCompositeNode(grammarAccess.getSpecObjRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpecObj_in_entryRuleSpecObj177);
            iv_ruleSpecObj=ruleSpecObj();

            state._fsp--;

             current =iv_ruleSpecObj; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpecObj187); 

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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:121:1: ruleSpecObj returns [EObject current=null] : (this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT ) ;
    public final EObject ruleSpecObj() throws RecognitionException {
        EObject current = null;

        Token this_SPECOBJECTDELIMITERLEFT_0=null;
        Token this_SPECOBJECTDELIMITERRIGHT_4=null;
        EObject this_HeadingSO_1 = null;

        EObject this_ReqPatSO_2 = null;

        EObject this_FreeTextSO_3 = null;


         enterRule(); 
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:124:28: ( (this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:125:1: (this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:125:1: (this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:125:2: this_SPECOBJECTDELIMITERLEFT_0= RULE_SPECOBJECTDELIMITERLEFT (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO ) this_SPECOBJECTDELIMITERRIGHT_4= RULE_SPECOBJECTDELIMITERRIGHT
            {
            this_SPECOBJECTDELIMITERLEFT_0=(Token)match(input,RULE_SPECOBJECTDELIMITERLEFT,FollowSets000.FOLLOW_RULE_SPECOBJECTDELIMITERLEFT_in_ruleSpecObj223); 
             
                newLeafNode(this_SPECOBJECTDELIMITERLEFT_0, grammarAccess.getSpecObjAccess().getSPECOBJECTDELIMITERLEFTTerminalRuleCall_0()); 
                
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:129:1: (this_HeadingSO_1= ruleHeadingSO | this_ReqPatSO_2= ruleReqPatSO | this_FreeTextSO_3= ruleFreeTextSO )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_PARAMDELIMITERLEFT) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt2=3;
                    }
                    break;
                case 15:
                    {
                    alt2=1;
                    }
                    break;
                case 16:
                    {
                    alt2=2;
                    }
                    break;
                default:
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
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:130:5: this_HeadingSO_1= ruleHeadingSO
                    {
                     
                            newCompositeNode(grammarAccess.getSpecObjAccess().getHeadingSOParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeadingSO_in_ruleSpecObj245);
                    this_HeadingSO_1=ruleHeadingSO();

                    state._fsp--;

                     
                            current = this_HeadingSO_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:140:5: this_ReqPatSO_2= ruleReqPatSO
                    {
                     
                            newCompositeNode(grammarAccess.getSpecObjAccess().getReqPatSOParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReqPatSO_in_ruleSpecObj272);
                    this_ReqPatSO_2=ruleReqPatSO();

                    state._fsp--;

                     
                            current = this_ReqPatSO_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:150:5: this_FreeTextSO_3= ruleFreeTextSO
                    {
                     
                            newCompositeNode(grammarAccess.getSpecObjAccess().getFreeTextSOParserRuleCall_1_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFreeTextSO_in_ruleSpecObj299);
                    this_FreeTextSO_3=ruleFreeTextSO();

                    state._fsp--;

                     
                            current = this_FreeTextSO_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_SPECOBJECTDELIMITERRIGHT_4=(Token)match(input,RULE_SPECOBJECTDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_SPECOBJECTDELIMITERRIGHT_in_ruleSpecObj310); 
             
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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:170:1: entryRuleHeadingSO returns [EObject current=null] : iv_ruleHeadingSO= ruleHeadingSO EOF ;
    public final EObject entryRuleHeadingSO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadingSO = null;


        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:171:2: (iv_ruleHeadingSO= ruleHeadingSO EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:172:2: iv_ruleHeadingSO= ruleHeadingSO EOF
            {
             newCompositeNode(grammarAccess.getHeadingSORule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHeadingSO_in_entryRuleHeadingSO345);
            iv_ruleHeadingSO=ruleHeadingSO();

            state._fsp--;

             current =iv_ruleHeadingSO; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHeadingSO355); 

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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:179:1: ruleHeadingSO returns [EObject current=null] : ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) ) ) ;
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
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:182:28: ( ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:183:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:183:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:183:2: () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'H' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_text_10_0= RULE_STRING ) )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:183:2: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:184:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHeadingSOAccess().getHeadingSpecObjectAction_0(),
                        current);
                

            }

            this_PARAMDELIMITERLEFT_1=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleHeadingSO400); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_1, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHeadingSO411); 

                	newLeafNode(otherlv_2, grammarAccess.getHeadingSOAccess().getHKeyword_2());
                
            this_PARAMDELIMITERRIGHT_3=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleHeadingSO422); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_3, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
                
            this_PARAMDELIMITERLEFT_4=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleHeadingSO432); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_4, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
                
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:205:1: ( (lv_id_5_0= RULE_ID ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:206:1: (lv_id_5_0= RULE_ID )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:206:1: (lv_id_5_0= RULE_ID )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:207:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHeadingSO448); 

            			newLeafNode(lv_id_5_0, grammarAccess.getHeadingSOAccess().getIdIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeadingSORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_5_0, 
                    		"ID");
            	    

            }


            }

            this_PARAMDELIMITERRIGHT_6=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleHeadingSO464); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_6, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
                
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:227:1: (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_PARAMDELIMITERLEFT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:227:2: this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT
                    {
                    this_PARAMDELIMITERLEFT_7=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleHeadingSO475); 
                     
                        newLeafNode(this_PARAMDELIMITERLEFT_7, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
                        
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:231:1: ( (lv_parent_8_0= RULE_STRING ) )
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:232:1: (lv_parent_8_0= RULE_STRING )
                    {
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:232:1: (lv_parent_8_0= RULE_STRING )
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:233:3: lv_parent_8_0= RULE_STRING
                    {
                    lv_parent_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleHeadingSO491); 

                    			newLeafNode(lv_parent_8_0, grammarAccess.getHeadingSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHeadingSORule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parent",
                            		lv_parent_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    this_PARAMDELIMITERRIGHT_9=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleHeadingSO507); 
                     
                        newLeafNode(this_PARAMDELIMITERRIGHT_9, grammarAccess.getHeadingSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
                        

                    }
                    break;

            }

            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:253:3: ( (lv_text_10_0= RULE_STRING ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:254:1: (lv_text_10_0= RULE_STRING )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:254:1: (lv_text_10_0= RULE_STRING )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:255:3: lv_text_10_0= RULE_STRING
            {
            lv_text_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleHeadingSO525); 

            			newLeafNode(lv_text_10_0, grammarAccess.getHeadingSOAccess().getTextSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeadingSORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_10_0, 
                    		"STRING");
            	    

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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:279:1: entryRuleReqPatSO returns [EObject current=null] : iv_ruleReqPatSO= ruleReqPatSO EOF ;
    public final EObject entryRuleReqPatSO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqPatSO = null;


        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:280:2: (iv_ruleReqPatSO= ruleReqPatSO EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:281:2: iv_ruleReqPatSO= ruleReqPatSO EOF
            {
             newCompositeNode(grammarAccess.getReqPatSORule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReqPatSO_in_entryRuleReqPatSO566);
            iv_ruleReqPatSO=ruleReqPatSO();

            state._fsp--;

             current =iv_ruleReqPatSO; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReqPatSO576); 

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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:288:1: ruleReqPatSO returns [EObject current=null] : ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+ ) ;
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
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:291:28: ( ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+ ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:292:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+ )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:292:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+ )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:292:2: () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'RP' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:292:2: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:293:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReqPatSOAccess().getRequirementPatternSpecObjectAction_0(),
                        current);
                

            }

            this_PARAMDELIMITERLEFT_1=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleReqPatSO621); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_1, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleReqPatSO632); 

                	newLeafNode(otherlv_2, grammarAccess.getReqPatSOAccess().getRPKeyword_2());
                
            this_PARAMDELIMITERRIGHT_3=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleReqPatSO643); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_3, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
                
            this_PARAMDELIMITERLEFT_4=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleReqPatSO653); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_4, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
                
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:314:1: ( (lv_id_5_0= RULE_ID ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:315:1: (lv_id_5_0= RULE_ID )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:315:1: (lv_id_5_0= RULE_ID )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:316:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReqPatSO669); 

            			newLeafNode(lv_id_5_0, grammarAccess.getReqPatSOAccess().getIdIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReqPatSORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_5_0, 
                    		"ID");
            	    

            }


            }

            this_PARAMDELIMITERRIGHT_6=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleReqPatSO685); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_6, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
                
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:336:1: (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_PARAMDELIMITERLEFT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:336:2: this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT
                    {
                    this_PARAMDELIMITERLEFT_7=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleReqPatSO696); 
                     
                        newLeafNode(this_PARAMDELIMITERLEFT_7, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
                        
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:340:1: ( (lv_parent_8_0= RULE_STRING ) )
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:341:1: (lv_parent_8_0= RULE_STRING )
                    {
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:341:1: (lv_parent_8_0= RULE_STRING )
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:342:3: lv_parent_8_0= RULE_STRING
                    {
                    lv_parent_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReqPatSO712); 

                    			newLeafNode(lv_parent_8_0, grammarAccess.getReqPatSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReqPatSORule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parent",
                            		lv_parent_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    this_PARAMDELIMITERRIGHT_9=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleReqPatSO728); 
                     
                        newLeafNode(this_PARAMDELIMITERRIGHT_9, grammarAccess.getReqPatSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
                        

                    }
                    break;

            }

            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:362:3: ( (lv_requirementPatterns_10_0= ruleRequirementPattern ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:363:1: (lv_requirementPatterns_10_0= ruleRequirementPattern )
            	    {
            	    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:363:1: (lv_requirementPatterns_10_0= ruleRequirementPattern )
            	    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:364:3: lv_requirementPatterns_10_0= ruleRequirementPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReqPatSOAccess().getRequirementPatternsRequirementPatternParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRequirementPattern_in_ruleReqPatSO750);
            	    lv_requirementPatterns_10_0=ruleRequirementPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReqPatSORule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requirementPatterns",
            	            		lv_requirementPatterns_10_0, 
            	            		"RequirementPattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:388:1: entryRuleFreeTextSO returns [EObject current=null] : iv_ruleFreeTextSO= ruleFreeTextSO EOF ;
    public final EObject entryRuleFreeTextSO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeTextSO = null;


        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:389:2: (iv_ruleFreeTextSO= ruleFreeTextSO EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:390:2: iv_ruleFreeTextSO= ruleFreeTextSO EOF
            {
             newCompositeNode(grammarAccess.getFreeTextSORule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreeTextSO_in_entryRuleFreeTextSO787);
            iv_ruleFreeTextSO=ruleFreeTextSO();

            state._fsp--;

             current =iv_ruleFreeTextSO; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreeTextSO797); 

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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:397:1: ruleFreeTextSO returns [EObject current=null] : ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )? ) ;
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
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:400:28: ( ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )? ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:401:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )? )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:401:1: ( () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )? )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:401:2: () this_PARAMDELIMITERLEFT_1= RULE_PARAMDELIMITERLEFT otherlv_2= 'F' this_PARAMDELIMITERRIGHT_3= RULE_PARAMDELIMITERRIGHT this_PARAMDELIMITERLEFT_4= RULE_PARAMDELIMITERLEFT ( (lv_id_5_0= RULE_ID ) ) this_PARAMDELIMITERRIGHT_6= RULE_PARAMDELIMITERRIGHT (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )? ( (lv_freeText_10_0= RULE_STRING ) )?
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:401:2: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:402:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFreeTextSOAccess().getFreeTextSpecObjectAction_0(),
                        current);
                

            }

            this_PARAMDELIMITERLEFT_1=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleFreeTextSO842); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_1, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFreeTextSO853); 

                	newLeafNode(otherlv_2, grammarAccess.getFreeTextSOAccess().getFKeyword_2());
                
            this_PARAMDELIMITERRIGHT_3=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleFreeTextSO864); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_3, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_3()); 
                
            this_PARAMDELIMITERLEFT_4=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleFreeTextSO874); 
             
                newLeafNode(this_PARAMDELIMITERLEFT_4, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_4()); 
                
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:423:1: ( (lv_id_5_0= RULE_ID ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:424:1: (lv_id_5_0= RULE_ID )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:424:1: (lv_id_5_0= RULE_ID )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:425:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFreeTextSO890); 

            			newLeafNode(lv_id_5_0, grammarAccess.getFreeTextSOAccess().getIdIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreeTextSORule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_5_0, 
                    		"ID");
            	    

            }


            }

            this_PARAMDELIMITERRIGHT_6=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleFreeTextSO906); 
             
                newLeafNode(this_PARAMDELIMITERRIGHT_6, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_6()); 
                
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:445:1: (this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_PARAMDELIMITERLEFT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:445:2: this_PARAMDELIMITERLEFT_7= RULE_PARAMDELIMITERLEFT ( (lv_parent_8_0= RULE_STRING ) ) this_PARAMDELIMITERRIGHT_9= RULE_PARAMDELIMITERRIGHT
                    {
                    this_PARAMDELIMITERLEFT_7=(Token)match(input,RULE_PARAMDELIMITERLEFT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleFreeTextSO917); 
                     
                        newLeafNode(this_PARAMDELIMITERLEFT_7, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERLEFTTerminalRuleCall_7_0()); 
                        
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:449:1: ( (lv_parent_8_0= RULE_STRING ) )
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:450:1: (lv_parent_8_0= RULE_STRING )
                    {
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:450:1: (lv_parent_8_0= RULE_STRING )
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:451:3: lv_parent_8_0= RULE_STRING
                    {
                    lv_parent_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFreeTextSO933); 

                    			newLeafNode(lv_parent_8_0, grammarAccess.getFreeTextSOAccess().getParentSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreeTextSORule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parent",
                            		lv_parent_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    this_PARAMDELIMITERRIGHT_9=(Token)match(input,RULE_PARAMDELIMITERRIGHT,FollowSets000.FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleFreeTextSO949); 
                     
                        newLeafNode(this_PARAMDELIMITERRIGHT_9, grammarAccess.getFreeTextSOAccess().getPARAMDELIMITERRIGHTTerminalRuleCall_7_2()); 
                        

                    }
                    break;

            }

            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:471:3: ( (lv_freeText_10_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:472:1: (lv_freeText_10_0= RULE_STRING )
                    {
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:472:1: (lv_freeText_10_0= RULE_STRING )
                    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:473:3: lv_freeText_10_0= RULE_STRING
                    {
                    lv_freeText_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFreeTextSO967); 

                    			newLeafNode(lv_freeText_10_0, grammarAccess.getFreeTextSOAccess().getFreeTextSTRINGTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFreeTextSORule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"freeText",
                            		lv_freeText_10_0, 
                            		"STRING");
                    	    

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


    // $ANTLR start "entryRuleRequirementPattern"
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:497:1: entryRuleRequirementPattern returns [EObject current=null] : iv_ruleRequirementPattern= ruleRequirementPattern EOF ;
    public final EObject entryRuleRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementPattern = null;


        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:498:2: (iv_ruleRequirementPattern= ruleRequirementPattern EOF )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:499:2: iv_ruleRequirementPattern= ruleRequirementPattern EOF
            {
             newCompositeNode(grammarAccess.getRequirementPatternRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequirementPattern_in_entryRuleRequirementPattern1009);
            iv_ruleRequirementPattern=ruleRequirementPattern();

            state._fsp--;

             current =iv_ruleRequirementPattern; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequirementPattern1019); 

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
    // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:506:1: ruleRequirementPattern returns [EObject current=null] : ( () otherlv_1= 'This is a sample requirement pattern.' ) ;
    public final EObject ruleRequirementPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:509:28: ( ( () otherlv_1= 'This is a sample requirement pattern.' ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:510:1: ( () otherlv_1= 'This is a sample requirement pattern.' )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:510:1: ( () otherlv_1= 'This is a sample requirement pattern.' )
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:510:2: () otherlv_1= 'This is a sample requirement pattern.'
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:510:2: ()
            // ../de.fraunhofer.iem.reqpat.core.grammar/src-gen/de/fraunhofer/iem/reqpat/core/parser/antlr/internal/InternalReqPat.g:511:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequirementPatternAccess().getRequirementPatternAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRequirementPattern1065); 

                	newLeafNode(otherlv_1, grammarAccess.getRequirementPatternAccess().getThisIsASampleRequirementPatternKeyword_1());
                

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpecObj_in_ruleRoot140 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleSpecObj_in_entryRuleSpecObj177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpecObj187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SPECOBJECTDELIMITERLEFT_in_ruleSpecObj223 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleHeadingSO_in_ruleSpecObj245 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleReqPatSO_in_ruleSpecObj272 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleFreeTextSO_in_ruleSpecObj299 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_SPECOBJECTDELIMITERRIGHT_in_ruleSpecObj310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeadingSO_in_entryRuleHeadingSO345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHeadingSO355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleHeadingSO400 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHeadingSO411 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleHeadingSO422 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleHeadingSO432 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHeadingSO448 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleHeadingSO464 = new BitSet(new long[]{0x0000000000000240L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleHeadingSO475 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleHeadingSO491 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleHeadingSO507 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleHeadingSO525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReqPatSO_in_entryRuleReqPatSO566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReqPatSO576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleReqPatSO621 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleReqPatSO632 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleReqPatSO643 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleReqPatSO653 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReqPatSO669 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleReqPatSO685 = new BitSet(new long[]{0x0000000000040040L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleReqPatSO696 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReqPatSO712 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleReqPatSO728 = new BitSet(new long[]{0x0000000000040040L});
        public static final BitSet FOLLOW_ruleRequirementPattern_in_ruleReqPatSO750 = new BitSet(new long[]{0x0000000000040042L});
        public static final BitSet FOLLOW_ruleFreeTextSO_in_entryRuleFreeTextSO787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreeTextSO797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleFreeTextSO842 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFreeTextSO853 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleFreeTextSO864 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleFreeTextSO874 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFreeTextSO890 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleFreeTextSO906 = new BitSet(new long[]{0x0000000000000242L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERLEFT_in_ruleFreeTextSO917 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFreeTextSO933 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_PARAMDELIMITERRIGHT_in_ruleFreeTextSO949 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFreeTextSO967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequirementPattern_in_entryRuleRequirementPattern1009 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequirementPattern1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleRequirementPattern1065 = new BitSet(new long[]{0x0000000000000002L});
    }


}