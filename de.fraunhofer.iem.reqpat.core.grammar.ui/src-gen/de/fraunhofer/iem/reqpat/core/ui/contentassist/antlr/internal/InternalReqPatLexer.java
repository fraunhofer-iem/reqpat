package de.fraunhofer.iem.reqpat.core.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqPatLexer extends Lexer {
    public static final int RULE_ID=8;
    public static final int RULE_STRING=9;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_PARAMDELIMITERRIGHT=7;
    public static final int RULE_INT=10;
    public static final int RULE_SPECOBJECTDELIMITERRIGHT=5;
    public static final int RULE_WS=13;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_PARAMDELIMITERLEFT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_SPECOBJECTDELIMITERLEFT=4;

    // delegates
    // delegators

    public InternalReqPatLexer() {;} 
    public InternalReqPatLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReqPatLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:11:7: ( 'H' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:11:9: 'H'
            {
            match('H'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:12:7: ( 'RP' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:12:9: 'RP'
            {
            match("RP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:13:7: ( 'F' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:13:9: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:14:7: ( 'This is a sample requirement pattern.' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:14:9: 'This is a sample requirement pattern.'
            {
            match("This is a sample requirement pattern."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_PARAMDELIMITERLEFT"
    public final void mRULE_PARAMDELIMITERLEFT() throws RecognitionException {
        try {
            int _type = RULE_PARAMDELIMITERLEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1766:25: ( '[' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1766:27: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARAMDELIMITERLEFT"

    // $ANTLR start "RULE_PARAMDELIMITERRIGHT"
    public final void mRULE_PARAMDELIMITERRIGHT() throws RecognitionException {
        try {
            int _type = RULE_PARAMDELIMITERRIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1768:26: ( ']' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1768:28: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARAMDELIMITERRIGHT"

    // $ANTLR start "RULE_SPECOBJECTDELIMITERLEFT"
    public final void mRULE_SPECOBJECTDELIMITERLEFT() throws RecognitionException {
        try {
            int _type = RULE_SPECOBJECTDELIMITERLEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1770:30: ( '{' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1770:32: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECOBJECTDELIMITERLEFT"

    // $ANTLR start "RULE_SPECOBJECTDELIMITERRIGHT"
    public final void mRULE_SPECOBJECTDELIMITERRIGHT() throws RecognitionException {
        try {
            int _type = RULE_SPECOBJECTDELIMITERRIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1772:31: ( '}' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1772:33: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECOBJECTDELIMITERRIGHT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1774:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1774:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1774:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1776:10: ( ( '0' .. '9' )+ )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1776:12: ( '0' .. '9' )+
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1776:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1776:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1778:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1780:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1780:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1780:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1780:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1782:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1782:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1782:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1782:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1782:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1782:41: ( '\\r' )? '\\n'
                    {
                    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1782:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1782:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1784:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1784:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1784:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1786:16: ( . )
            // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1786:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:8: ( T__15 | T__16 | T__17 | T__18 | RULE_PARAMDELIMITERLEFT | RULE_PARAMDELIMITERRIGHT | RULE_SPECOBJECTDELIMITERLEFT | RULE_SPECOBJECTDELIMITERRIGHT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=15;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:34: RULE_PARAMDELIMITERLEFT
                {
                mRULE_PARAMDELIMITERLEFT(); 

                }
                break;
            case 6 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:58: RULE_PARAMDELIMITERRIGHT
                {
                mRULE_PARAMDELIMITERRIGHT(); 

                }
                break;
            case 7 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:83: RULE_SPECOBJECTDELIMITERLEFT
                {
                mRULE_SPECOBJECTDELIMITERLEFT(); 

                }
                break;
            case 8 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:112: RULE_SPECOBJECTDELIMITERRIGHT
                {
                mRULE_SPECOBJECTDELIMITERRIGHT(); 

                }
                break;
            case 9 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:142: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:150: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:159: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:171: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:187: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:203: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../de.fraunhofer.iem.reqpat.core.grammar.ui/src-gen/de/fraunhofer/iem/reqpat/core/ui/contentassist/antlr/internal/InternalReqPat.g:1:211: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\20\1\21\1\23\1\21\6\uffff\3\17\4\uffff\1\36\1\uffff"+
        "\1\21\12\uffff\2\21\1\uffff";
    static final String DFA11_eofS =
        "\42\uffff";
    static final String DFA11_minS =
        "\1\0\1\55\1\120\1\55\1\150\6\uffff\2\0\1\52\4\uffff\1\55\1\uffff"+
        "\1\151\12\uffff\1\163\1\40\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\172\1\120\1\172\1\150\6\uffff\2\uffff\1\57\4\uffff\1"+
        "\172\1\uffff\1\151\12\uffff\1\163\1\40\1\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\3\uffff\1\16\1\17\1\1\1\11"+
        "\1\uffff\1\3\1\uffff\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1"+
        "\2\2\uffff\1\4";
    static final String DFA11_specialS =
        "\1\1\12\uffff\1\0\1\2\25\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\13\4\17\1\14\7\17\1"+
            "\15\12\12\7\17\5\11\1\3\1\11\1\1\11\11\1\2\1\11\1\4\6\11\1\5"+
            "\1\17\1\6\3\17\32\11\1\7\1\17\1\10\uff82\17",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\22",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\32",
            "\0\32",
            "\1\33\4\uffff\1\34",
            "",
            "",
            "",
            "",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32"+
            "\21",
            "",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    static class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | RULE_PARAMDELIMITERLEFT | RULE_PARAMDELIMITERRIGHT | RULE_SPECOBJECTDELIMITERLEFT | RULE_SPECOBJECTDELIMITERRIGHT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_11 = input.LA(1);

                        s = -1;
                        if ( ((LA11_11>='\u0000' && LA11_11<='\uFFFF')) ) {s = 26;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='H') ) {s = 1;}

                        else if ( (LA11_0=='R') ) {s = 2;}

                        else if ( (LA11_0=='F') ) {s = 3;}

                        else if ( (LA11_0=='T') ) {s = 4;}

                        else if ( (LA11_0=='[') ) {s = 5;}

                        else if ( (LA11_0==']') ) {s = 6;}

                        else if ( (LA11_0=='{') ) {s = 7;}

                        else if ( (LA11_0=='}') ) {s = 8;}

                        else if ( ((LA11_0>='A' && LA11_0<='E')||LA11_0=='G'||(LA11_0>='I' && LA11_0<='Q')||LA11_0=='S'||(LA11_0>='U' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) ) {s = 9;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 10;}

                        else if ( (LA11_0=='\"') ) {s = 11;}

                        else if ( (LA11_0=='\'') ) {s = 12;}

                        else if ( (LA11_0=='/') ) {s = 13;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 14;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='.')||(LA11_0>=':' && LA11_0<='@')||LA11_0=='\\'||(LA11_0>='^' && LA11_0<='`')||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_12 = input.LA(1);

                        s = -1;
                        if ( ((LA11_12>='\u0000' && LA11_12<='\uFFFF')) ) {s = 26;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}