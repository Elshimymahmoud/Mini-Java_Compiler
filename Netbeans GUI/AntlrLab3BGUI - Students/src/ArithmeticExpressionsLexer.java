// $ANTLR 3.4 C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g 2024-05-06 19:39:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int Array=4;
    public static final int Assigment=5;
    public static final int Assign=6;
    public static final int ClassBlock=7;
    public static final int ClassDec=8;
    public static final int Decl=9;
    public static final int Forstmt=10;
    public static final int NUM=11;
    public static final int PrintStat=12;
    public static final int SEMICOLON=13;
    public static final int SL_COMMENT=14;
    public static final int Start=15;
    public static final int Statments=16;
    public static final int Strings=17;
    public static final int VAR=18;
    public static final int WhiteSpace=19;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ArithmeticExpressionsLexer() {} 
    public ArithmeticExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmeticExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:2:7: ( '$' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:2:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:3:7: ( '(' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:4:7: ( ')' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:5:7: ( '*=' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:5:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:6:7: ( '++' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:6:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:7:7: ( '+=' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:7:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:8:7: ( ',' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:9:7: ( '--' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:9:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:10:7: ( '-=' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:10:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:11:7: ( '.' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:12:7: ( '<' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:13:7: ( '=' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:14:7: ( '?' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:14:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:15:7: ( '?>' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:15:9: '?>'
            {
            match("?>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:16:7: ( 'array' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:16:9: 'array'
            {
            match("array"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:17:7: ( 'as' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:17:9: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:18:7: ( 'echo' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:18:9: 'echo'
            {
            match("echo"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:19:7: ( 'foreach' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:19:9: 'foreach'
            {
            match("foreach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:20:7: ( 'php' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:20:9: 'php'
            {
            match("php"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:21:7: ( '{' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:22:7: ( '}' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:89:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:89:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:89:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:90:5: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:90:7: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:90:7: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:90:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:90:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:90:23: ( '.' ( '0' .. '9' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:90:24: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:90:27: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:91:15: ( ';' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:91:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "Strings"
    public final void mStrings() throws RecognitionException {
        try {
            int _type = Strings;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:92:9: ( '\"' ( . )* '\"' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:92:11: '\"' ( . )* '\"'
            {
            match('\"'); 

            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:92:15: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\"') ) {
                    alt6=2;
                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:92:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Strings"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:93:12: ( '//' ( . )* ( '\\n' )+ )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:93:14: '//' ( . )* ( '\\n' )+
            {
            match("//"); 



            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:93:19: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\n') ) {
                    alt7=2;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:93:20: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:93:23: ( '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\n') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:93:23: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:94:17: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:94:19: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:94:19: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WhiteSpace"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | VAR | NUM | SEMICOLON | Strings | SL_COMMENT | WhiteSpace )
        int alt10=27;
        switch ( input.LA(1) ) {
        case '$':
            {
            alt10=1;
            }
            break;
        case '(':
            {
            alt10=2;
            }
            break;
        case ')':
            {
            alt10=3;
            }
            break;
        case '*':
            {
            alt10=4;
            }
            break;
        case '+':
            {
            int LA10_5 = input.LA(2);

            if ( (LA10_5=='+') ) {
                alt10=5;
            }
            else if ( (LA10_5=='=') ) {
                alt10=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 5, input);

                throw nvae;

            }
            }
            break;
        case ',':
            {
            alt10=7;
            }
            break;
        case '-':
            {
            switch ( input.LA(2) ) {
            case '-':
                {
                alt10=8;
                }
                break;
            case '=':
                {
                alt10=9;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt10=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 7, input);

                throw nvae;

            }

            }
            break;
        case '.':
            {
            alt10=10;
            }
            break;
        case '<':
            {
            alt10=11;
            }
            break;
        case '=':
            {
            alt10=12;
            }
            break;
        case '?':
            {
            int LA10_11 = input.LA(2);

            if ( (LA10_11=='>') ) {
                alt10=14;
            }
            else {
                alt10=13;
            }
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA10_30 = input.LA(3);

                if ( (LA10_30=='r') ) {
                    int LA10_35 = input.LA(4);

                    if ( (LA10_35=='a') ) {
                        int LA10_40 = input.LA(5);

                        if ( (LA10_40=='y') ) {
                            int LA10_44 = input.LA(6);

                            if ( ((LA10_44 >= '0' && LA10_44 <= '9')||(LA10_44 >= 'A' && LA10_44 <= 'Z')||LA10_44=='_'||(LA10_44 >= 'a' && LA10_44 <= 'z')) ) {
                                alt10=22;
                            }
                            else {
                                alt10=15;
                            }
                        }
                        else {
                            alt10=22;
                        }
                    }
                    else {
                        alt10=22;
                    }
                }
                else {
                    alt10=22;
                }
                }
                break;
            case 's':
                {
                int LA10_31 = input.LA(3);

                if ( ((LA10_31 >= '0' && LA10_31 <= '9')||(LA10_31 >= 'A' && LA10_31 <= 'Z')||LA10_31=='_'||(LA10_31 >= 'a' && LA10_31 <= 'z')) ) {
                    alt10=22;
                }
                else {
                    alt10=16;
                }
                }
                break;
            default:
                alt10=22;
            }

            }
            break;
        case 'e':
            {
            int LA10_13 = input.LA(2);

            if ( (LA10_13=='c') ) {
                int LA10_32 = input.LA(3);

                if ( (LA10_32=='h') ) {
                    int LA10_37 = input.LA(4);

                    if ( (LA10_37=='o') ) {
                        int LA10_41 = input.LA(5);

                        if ( ((LA10_41 >= '0' && LA10_41 <= '9')||(LA10_41 >= 'A' && LA10_41 <= 'Z')||LA10_41=='_'||(LA10_41 >= 'a' && LA10_41 <= 'z')) ) {
                            alt10=22;
                        }
                        else {
                            alt10=17;
                        }
                    }
                    else {
                        alt10=22;
                    }
                }
                else {
                    alt10=22;
                }
            }
            else {
                alt10=22;
            }
            }
            break;
        case 'f':
            {
            int LA10_14 = input.LA(2);

            if ( (LA10_14=='o') ) {
                int LA10_33 = input.LA(3);

                if ( (LA10_33=='r') ) {
                    int LA10_38 = input.LA(4);

                    if ( (LA10_38=='e') ) {
                        int LA10_42 = input.LA(5);

                        if ( (LA10_42=='a') ) {
                            int LA10_46 = input.LA(6);

                            if ( (LA10_46=='c') ) {
                                int LA10_48 = input.LA(7);

                                if ( (LA10_48=='h') ) {
                                    int LA10_49 = input.LA(8);

                                    if ( ((LA10_49 >= '0' && LA10_49 <= '9')||(LA10_49 >= 'A' && LA10_49 <= 'Z')||LA10_49=='_'||(LA10_49 >= 'a' && LA10_49 <= 'z')) ) {
                                        alt10=22;
                                    }
                                    else {
                                        alt10=18;
                                    }
                                }
                                else {
                                    alt10=22;
                                }
                            }
                            else {
                                alt10=22;
                            }
                        }
                        else {
                            alt10=22;
                        }
                    }
                    else {
                        alt10=22;
                    }
                }
                else {
                    alt10=22;
                }
            }
            else {
                alt10=22;
            }
            }
            break;
        case 'p':
            {
            int LA10_15 = input.LA(2);

            if ( (LA10_15=='h') ) {
                int LA10_34 = input.LA(3);

                if ( (LA10_34=='p') ) {
                    int LA10_39 = input.LA(4);

                    if ( ((LA10_39 >= '0' && LA10_39 <= '9')||(LA10_39 >= 'A' && LA10_39 <= 'Z')||LA10_39=='_'||(LA10_39 >= 'a' && LA10_39 <= 'z')) ) {
                        alt10=22;
                    }
                    else {
                        alt10=19;
                    }
                }
                else {
                    alt10=22;
                }
            }
            else {
                alt10=22;
            }
            }
            break;
        case '{':
            {
            alt10=20;
            }
            break;
        case '}':
            {
            alt10=21;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'b':
        case 'c':
        case 'd':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt10=22;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt10=23;
            }
            break;
        case ';':
            {
            alt10=24;
            }
            break;
        case '\"':
            {
            alt10=25;
            }
            break;
        case '/':
            {
            alt10=26;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt10=27;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 10, 0, input);

            throw nvae;

        }

        switch (alt10) {
            case 1 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:10: T__20
                {
                mT__20(); 


                }
                break;
            case 2 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:16: T__21
                {
                mT__21(); 


                }
                break;
            case 3 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:22: T__22
                {
                mT__22(); 


                }
                break;
            case 4 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:28: T__23
                {
                mT__23(); 


                }
                break;
            case 5 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:34: T__24
                {
                mT__24(); 


                }
                break;
            case 6 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:40: T__25
                {
                mT__25(); 


                }
                break;
            case 7 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:46: T__26
                {
                mT__26(); 


                }
                break;
            case 8 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:52: T__27
                {
                mT__27(); 


                }
                break;
            case 9 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:58: T__28
                {
                mT__28(); 


                }
                break;
            case 10 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:64: T__29
                {
                mT__29(); 


                }
                break;
            case 11 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:70: T__30
                {
                mT__30(); 


                }
                break;
            case 12 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:76: T__31
                {
                mT__31(); 


                }
                break;
            case 13 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:82: T__32
                {
                mT__32(); 


                }
                break;
            case 14 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:88: T__33
                {
                mT__33(); 


                }
                break;
            case 15 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:94: T__34
                {
                mT__34(); 


                }
                break;
            case 16 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:100: T__35
                {
                mT__35(); 


                }
                break;
            case 17 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:106: T__36
                {
                mT__36(); 


                }
                break;
            case 18 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:112: T__37
                {
                mT__37(); 


                }
                break;
            case 19 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:118: T__38
                {
                mT__38(); 


                }
                break;
            case 20 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:124: T__39
                {
                mT__39(); 


                }
                break;
            case 21 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:130: T__40
                {
                mT__40(); 


                }
                break;
            case 22 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:136: VAR
                {
                mVAR(); 


                }
                break;
            case 23 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:140: NUM
                {
                mNUM(); 


                }
                break;
            case 24 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:144: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 25 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:154: Strings
                {
                mStrings(); 


                }
                break;
            case 26 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:162: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 27 :
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:1:173: WhiteSpace
                {
                mWhiteSpace(); 


                }
                break;

        }

    }


 

}