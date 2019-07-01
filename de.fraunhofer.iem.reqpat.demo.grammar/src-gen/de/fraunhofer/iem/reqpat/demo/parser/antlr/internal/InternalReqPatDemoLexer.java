package de.fraunhofer.iem.reqpat.demo.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqPatDemoLexer extends Lexer {
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

    public InternalReqPatDemoLexer() {;} 
    public InternalReqPatDemoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReqPatDemoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalReqPatDemo.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:11:7: ( '.' )
            // InternalReqPatDemo.g:11:9: '.'
            {
            match('.'); 

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
            // InternalReqPatDemo.g:12:7: ( 'The function' )
            // InternalReqPatDemo.g:12:9: 'The function'
            {
            match("The function"); 


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
            // InternalReqPatDemo.g:13:7: ( 'The following information' )
            // InternalReqPatDemo.g:13:9: 'The following information'
            {
            match("The following information"); 


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
            // InternalReqPatDemo.g:14:7: ( 'The top-level function is called' )
            // InternalReqPatDemo.g:14:9: 'The top-level function is called'
            {
            match("The top-level function is called"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:15:7: ( 'has the following purpose:' )
            // InternalReqPatDemo.g:15:9: 'has the following purpose:'
            {
            match("has the following purpose:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:16:7: ( 'The functional device' )
            // InternalReqPatDemo.g:16:9: 'The functional device'
            {
            match("The functional device"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:17:7: ( 'is a subfunction of the function' )
            // InternalReqPatDemo.g:17:9: 'is a subfunction of the function'
            {
            match("is a subfunction of the function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:18:7: ( 'is received by the function' )
            // InternalReqPatDemo.g:18:9: 'is received by the function'
            {
            match("is received by the function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:19:7: ( 'from the functional device' )
            // InternalReqPatDemo.g:19:9: 'from the functional device'
            {
            match("from the functional device"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:20:7: ( ':' )
            // InternalReqPatDemo.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:21:7: ( ',' )
            // InternalReqPatDemo.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:22:7: ( 'is sent from the function' )
            // InternalReqPatDemo.g:22:9: 'is sent from the function'
            {
            match("is sent from the function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:23:7: ( 'to the functional device' )
            // InternalReqPatDemo.g:23:9: 'to the functional device'
            {
            match("to the functional device"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:24:7: ( 'is used by the function' )
            // InternalReqPatDemo.g:24:9: 'is used by the function'
            {
            match("is used by the function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:25:7: ( 'is created by the function' )
            // InternalReqPatDemo.g:25:9: 'is created by the function'
            {
            match("is created by the function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:26:7: ( 'H' )
            // InternalReqPatDemo.g:26:9: 'H'
            {
            match('H'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:27:7: ( 'RP' )
            // InternalReqPatDemo.g:27:9: 'RP'
            {
            match("RP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:28:7: ( 'F' )
            // InternalReqPatDemo.g:28:9: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_PARAMDELIMITERLEFT"
    public final void mRULE_PARAMDELIMITERLEFT() throws RecognitionException {
        try {
            int _type = RULE_PARAMDELIMITERLEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqPatDemo.g:1458:25: ( '[' )
            // InternalReqPatDemo.g:1458:27: '['
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
            // InternalReqPatDemo.g:1460:26: ( ']' )
            // InternalReqPatDemo.g:1460:28: ']'
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
            // InternalReqPatDemo.g:1462:30: ( '{' )
            // InternalReqPatDemo.g:1462:32: '{'
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
            // InternalReqPatDemo.g:1464:31: ( '}' )
            // InternalReqPatDemo.g:1464:33: '}'
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
            // InternalReqPatDemo.g:1466:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalReqPatDemo.g:1466:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalReqPatDemo.g:1466:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReqPatDemo.g:
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
            // InternalReqPatDemo.g:1468:10: ( ( '0' .. '9' )+ )
            // InternalReqPatDemo.g:1468:12: ( '0' .. '9' )+
            {
            // InternalReqPatDemo.g:1468:12: ( '0' .. '9' )+
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
            	    // InternalReqPatDemo.g:1468:13: '0' .. '9'
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
            // InternalReqPatDemo.g:1470:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalReqPatDemo.g:1470:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalReqPatDemo.g:1470:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalReqPatDemo.g:1470:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalReqPatDemo.g:1470:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalReqPatDemo.g:1470:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReqPatDemo.g:1470:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalReqPatDemo.g:1470:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalReqPatDemo.g:1470:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalReqPatDemo.g:1470:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReqPatDemo.g:1470:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalReqPatDemo.g:1472:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalReqPatDemo.g:1472:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalReqPatDemo.g:1472:24: ( options {greedy=false; } : . )*
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
            	    // InternalReqPatDemo.g:1472:52: .
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
            // InternalReqPatDemo.g:1474:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalReqPatDemo.g:1474:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalReqPatDemo.g:1474:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReqPatDemo.g:1474:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalReqPatDemo.g:1474:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReqPatDemo.g:1474:41: ( '\\r' )? '\\n'
                    {
                    // InternalReqPatDemo.g:1474:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalReqPatDemo.g:1474:41: '\\r'
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
            // InternalReqPatDemo.g:1476:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalReqPatDemo.g:1476:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalReqPatDemo.g:1476:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalReqPatDemo.g:
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
            // InternalReqPatDemo.g:1478:16: ( . )
            // InternalReqPatDemo.g:1478:18: .
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
        // InternalReqPatDemo.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_PARAMDELIMITERLEFT | RULE_PARAMDELIMITERRIGHT | RULE_SPECOBJECTDELIMITERLEFT | RULE_SPECOBJECTDELIMITERRIGHT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=29;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalReqPatDemo.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalReqPatDemo.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalReqPatDemo.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalReqPatDemo.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalReqPatDemo.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalReqPatDemo.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalReqPatDemo.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalReqPatDemo.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalReqPatDemo.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalReqPatDemo.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalReqPatDemo.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalReqPatDemo.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalReqPatDemo.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalReqPatDemo.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalReqPatDemo.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalReqPatDemo.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalReqPatDemo.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalReqPatDemo.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalReqPatDemo.g:1:118: RULE_PARAMDELIMITERLEFT
                {
                mRULE_PARAMDELIMITERLEFT(); 

                }
                break;
            case 20 :
                // InternalReqPatDemo.g:1:142: RULE_PARAMDELIMITERRIGHT
                {
                mRULE_PARAMDELIMITERRIGHT(); 

                }
                break;
            case 21 :
                // InternalReqPatDemo.g:1:167: RULE_SPECOBJECTDELIMITERLEFT
                {
                mRULE_SPECOBJECTDELIMITERLEFT(); 

                }
                break;
            case 22 :
                // InternalReqPatDemo.g:1:196: RULE_SPECOBJECTDELIMITERRIGHT
                {
                mRULE_SPECOBJECTDELIMITERRIGHT(); 

                }
                break;
            case 23 :
                // InternalReqPatDemo.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // InternalReqPatDemo.g:1:234: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // InternalReqPatDemo.g:1:243: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalReqPatDemo.g:1:255: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalReqPatDemo.g:1:271: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalReqPatDemo.g:1:287: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalReqPatDemo.g:1:295: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\2\uffff\4\31\2\uffff\1\31\1\40\1\31\1\42\6\uffff\3\26\3\uffff\1\31\1\uffff\3\31\2\uffff\1\31\1\uffff\1\61\12\uffff\2\31\1\uffff\1\31\11\uffff\1\31\12\uffff\1\106\2\uffff";
    static final String DFA11_eofS =
        "\107\uffff";
    static final String DFA11_minS =
        "\1\0\1\uffff\1\150\1\141\1\163\1\162\2\uffff\1\157\1\55\1\120\1\55\6\uffff\2\0\1\52\3\uffff\1\145\1\uffff\1\163\1\40\1\157\2\uffff\1\40\1\uffff\1\55\12\uffff\2\40\1\141\1\155\2\uffff\1\146\6\uffff\1\40\1\157\2\uffff\1\156\1\uffff\1\143\1\164\1\151\1\157\1\156\1\141\2\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\uffff\1\150\1\141\1\163\1\162\2\uffff\1\157\1\172\1\120\1\172\6\uffff\2\uffff\1\57\3\uffff\1\145\1\uffff\1\163\1\40\1\157\2\uffff\1\40\1\uffff\1\172\12\uffff\2\40\1\165\1\155\2\uffff\1\164\6\uffff\1\40\1\165\2\uffff\1\156\1\uffff\1\143\1\164\1\151\1\157\1\156\1\141\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\4\uffff\1\12\1\13\4\uffff\1\23\1\24\1\25\1\26\1\27\1\30\3\uffff\1\34\1\35\1\1\1\uffff\1\27\3\uffff\1\12\1\13\1\uffff\1\20\1\uffff\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\33\1\34\4\uffff\1\15\1\21\1\uffff\1\5\1\7\1\10\1\14\1\16\1\17\2\uffff\1\4\1\11\1\uffff\1\3\6\uffff\1\6\1\2";
    static final String DFA11_specialS =
        "\1\2\21\uffff\1\0\1\1\63\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\4\26\1\7\1\26\1\1\1\24\12\21\1\6\6\26\5\20\1\13\1\20\1\11\11\20\1\12\1\20\1\2\6\20\1\14\1\26\1\15\3\26\5\20\1\5\1\20\1\3\1\4\12\20\1\10\6\20\1\16\1\26\1\17\uff82\26",
            "",
            "\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\37",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\41",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\50",
            "\0\50",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "",
            "\1\54",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "",
            "\1\60",
            "",
            "\1\31\2\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
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
            "\1\62",
            "\1\63",
            "\1\64\1\uffff\1\70\16\uffff\1\65\1\66\1\uffff\1\67",
            "\1\71",
            "",
            "",
            "\1\72\15\uffff\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\76\5\uffff\1\75",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_PARAMDELIMITERLEFT | RULE_PARAMDELIMITERRIGHT | RULE_SPECOBJECTDELIMITERLEFT | RULE_SPECOBJECTDELIMITERRIGHT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_18 = input.LA(1);

                        s = -1;
                        if ( ((LA11_18>='\u0000' && LA11_18<='\uFFFF')) ) {s = 40;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_19 = input.LA(1);

                        s = -1;
                        if ( ((LA11_19>='\u0000' && LA11_19<='\uFFFF')) ) {s = 40;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='.') ) {s = 1;}

                        else if ( (LA11_0=='T') ) {s = 2;}

                        else if ( (LA11_0=='h') ) {s = 3;}

                        else if ( (LA11_0=='i') ) {s = 4;}

                        else if ( (LA11_0=='f') ) {s = 5;}

                        else if ( (LA11_0==':') ) {s = 6;}

                        else if ( (LA11_0==',') ) {s = 7;}

                        else if ( (LA11_0=='t') ) {s = 8;}

                        else if ( (LA11_0=='H') ) {s = 9;}

                        else if ( (LA11_0=='R') ) {s = 10;}

                        else if ( (LA11_0=='F') ) {s = 11;}

                        else if ( (LA11_0=='[') ) {s = 12;}

                        else if ( (LA11_0==']') ) {s = 13;}

                        else if ( (LA11_0=='{') ) {s = 14;}

                        else if ( (LA11_0=='}') ) {s = 15;}

                        else if ( ((LA11_0>='A' && LA11_0<='E')||LA11_0=='G'||(LA11_0>='I' && LA11_0<='Q')||LA11_0=='S'||(LA11_0>='U' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='e')||LA11_0=='g'||(LA11_0>='j' && LA11_0<='s')||(LA11_0>='u' && LA11_0<='z')) ) {s = 16;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 17;}

                        else if ( (LA11_0=='\"') ) {s = 18;}

                        else if ( (LA11_0=='\'') ) {s = 19;}

                        else if ( (LA11_0=='/') ) {s = 20;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 21;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='+')||LA11_0=='-'||(LA11_0>=';' && LA11_0<='@')||LA11_0=='\\'||(LA11_0>='^' && LA11_0<='`')||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 22;}

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