// $ANTLR 3.4 C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g 2024-05-09 22:29:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int ApNum=4;
    public static final int AparOrUnitAndItsNumber=5;
    public static final int ApartOrUnit=6;
    public static final int City=7;
    public static final int CityStateZip=8;
    public static final int Country=9;
    public static final int Firstname=10;
    public static final int Fullname=11;
    public static final int Gender=12;
    public static final int Individuals=13;
    public static final int Lastname=14;
    public static final int NUM=15;
    public static final int STRING=16;
    public static final int Start=17;
    public static final int Start1=18;
    public static final int State=19;
    public static final int Statments=20;
    public static final int Street=21;
    public static final int StreetName=22;
    public static final int StreetNo=23;
    public static final int VAR=24;
    public static final int WhiteSpace=25;
    public static final int ZipCode=26;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniJavaLexer() {} 
    public MiniJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:2:7: ( '#' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:2:9: '#'
            {
            match('#'); 

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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:3:7: ( '(' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:3:9: '('
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:4:7: ( ')' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:4:9: ')'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:5:7: ( ',' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:5:9: ','
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:6:7: ( '---' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:6:9: '---'
            {
            match("---"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:7:7: ( '->' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:7:9: '->'
            {
            match("->"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:8:7: ( 'Apartment' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:8:9: 'Apartment'
            {
            match("Apartment"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:9:7: ( 'City' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:9:9: 'City'
            {
            match("City"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:10:7: ( 'Country' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:10:9: 'Country'
            {
            match("Country"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:11:7: ( 'Female' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:11:9: 'Female'
            {
            match("Female"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:12:7: ( 'Individuals' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:12:9: 'Individuals'
            {
            match("Individuals"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:13:7: ( 'Male' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:13:9: 'Male'
            {
            match("Male"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:14:7: ( 'Street' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:14:9: 'Street'
            {
            match("Street"); 



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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:15:7: ( 'Unit' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:15:9: 'Unit'
            {
            match("Unit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:16:7: ( 'and' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:16:9: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:17:7: ( 'code' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:17:9: 'code'
            {
            match("code"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:18:7: ( 'first' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:18:9: 'first'
            {
            match("first"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:19:7: ( 'its' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:19:9: 'its'
            {
            match("its"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:20:7: ( 'last' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:20:9: 'last'
            {
            match("last"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:21:7: ( 'name' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:21:9: 'name'
            {
            match("name"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:22:7: ( 'number' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:22:9: 'number'
            {
            match("number"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:23:7: ( 'or' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:23:9: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:24:7: ( 'state' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:24:9: 'state'
            {
            match("state"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:25:7: ( 'unit' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:25:9: 'unit'
            {
            match("unit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:26:7: ( 'zip' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:26:9: 'zip'
            {
            match("zip"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:103:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:103:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:103:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:
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
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:104:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:104:7: ( '0' .. '9' )+
            {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:104:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:105:8: ( '\"' ( . )* '\"' )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:105:10: '\"' ( . )* '\"'
            {
            match('\"'); 

            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:105:14: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:105:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "STRING"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:106:17: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:106:19: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:106:19: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
        // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | VAR | NUM | STRING | WhiteSpace )
        int alt5=29;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:10: T__27
                {
                mT__27(); 


                }
                break;
            case 2 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:16: T__28
                {
                mT__28(); 


                }
                break;
            case 3 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:22: T__29
                {
                mT__29(); 


                }
                break;
            case 4 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:28: T__30
                {
                mT__30(); 


                }
                break;
            case 5 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:34: T__31
                {
                mT__31(); 


                }
                break;
            case 6 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:40: T__32
                {
                mT__32(); 


                }
                break;
            case 7 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:46: T__33
                {
                mT__33(); 


                }
                break;
            case 8 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:52: T__34
                {
                mT__34(); 


                }
                break;
            case 9 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:58: T__35
                {
                mT__35(); 


                }
                break;
            case 10 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:64: T__36
                {
                mT__36(); 


                }
                break;
            case 11 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:70: T__37
                {
                mT__37(); 


                }
                break;
            case 12 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:76: T__38
                {
                mT__38(); 


                }
                break;
            case 13 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:82: T__39
                {
                mT__39(); 


                }
                break;
            case 14 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:88: T__40
                {
                mT__40(); 


                }
                break;
            case 15 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:94: T__41
                {
                mT__41(); 


                }
                break;
            case 16 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:100: T__42
                {
                mT__42(); 


                }
                break;
            case 17 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:106: T__43
                {
                mT__43(); 


                }
                break;
            case 18 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:112: T__44
                {
                mT__44(); 


                }
                break;
            case 19 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:118: T__45
                {
                mT__45(); 


                }
                break;
            case 20 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:124: T__46
                {
                mT__46(); 


                }
                break;
            case 21 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:130: T__47
                {
                mT__47(); 


                }
                break;
            case 22 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:136: T__48
                {
                mT__48(); 


                }
                break;
            case 23 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:142: T__49
                {
                mT__49(); 


                }
                break;
            case 24 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:148: T__50
                {
                mT__50(); 


                }
                break;
            case 25 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:154: T__51
                {
                mT__51(); 


                }
                break;
            case 26 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:160: VAR
                {
                mVAR(); 


                }
                break;
            case 27 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:164: NUM
                {
                mNUM(); 


                }
                break;
            case 28 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:168: STRING
                {
                mSTRING(); 


                }
                break;
            case 29 :
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:1:175: WhiteSpace
                {
                mWhiteSpace(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\6\uffff\21\27\6\uffff\17\27\1\77\13\27\1\113\2\27\1\116\3\27\1"+
        "\uffff\2\27\1\124\1\27\1\126\3\27\1\132\1\27\1\134\1\uffff\1\135"+
        "\1\27\1\uffff\1\137\1\140\2\27\1\143\1\uffff\1\27\1\uffff\3\27\1"+
        "\uffff\1\27\2\uffff\1\151\2\uffff\1\27\1\153\1\uffff\2\27\1\156"+
        "\1\27\1\160\1\uffff\1\161\1\uffff\1\27\1\163\1\uffff\1\27\2\uffff"+
        "\1\27\1\uffff\1\27\1\167\1\27\1\uffff\1\27\1\172\1\uffff";
    static final String DFA5_eofS =
        "\173\uffff";
    static final String DFA5_minS =
        "\1\11\4\uffff\1\55\1\160\1\151\1\145\1\156\1\141\1\164\2\156\1\157"+
        "\1\151\1\164\2\141\1\162\1\164\1\156\1\151\6\uffff\1\141\1\164\1"+
        "\165\1\155\1\144\1\154\1\162\1\151\2\144\1\162\2\163\2\155\1\60"+
        "\1\141\1\151\1\160\1\162\1\171\1\156\1\141\1\151\2\145\1\164\1\60"+
        "\1\145\1\163\1\60\1\164\1\145\1\142\1\uffff\2\164\1\60\1\164\1\60"+
        "\1\164\1\154\1\166\1\60\1\145\1\60\1\uffff\1\60\1\164\1\uffff\2"+
        "\60\2\145\1\60\1\uffff\1\155\1\uffff\1\162\1\145\1\151\1\uffff\1"+
        "\164\2\uffff\1\60\2\uffff\1\162\1\60\1\uffff\1\145\1\171\1\60\1"+
        "\144\1\60\1\uffff\1\60\1\uffff\1\156\1\60\1\uffff\1\165\2\uffff"+
        "\1\164\1\uffff\1\141\1\60\1\154\1\uffff\1\163\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\172\4\uffff\1\76\1\160\1\157\1\145\1\156\1\141\1\164\2\156\1"+
        "\157\1\151\1\164\1\141\1\165\1\162\1\164\1\156\1\151\6\uffff\1\141"+
        "\1\164\1\165\1\155\1\144\1\154\1\162\1\151\2\144\1\162\2\163\2\155"+
        "\1\172\1\141\1\151\1\160\1\162\1\171\1\156\1\141\1\151\2\145\1\164"+
        "\1\172\1\145\1\163\1\172\1\164\1\145\1\142\1\uffff\2\164\1\172\1"+
        "\164\1\172\1\164\1\154\1\166\1\172\1\145\1\172\1\uffff\1\172\1\164"+
        "\1\uffff\2\172\2\145\1\172\1\uffff\1\155\1\uffff\1\162\1\145\1\151"+
        "\1\uffff\1\164\2\uffff\1\172\2\uffff\1\162\1\172\1\uffff\1\145\1"+
        "\171\1\172\1\144\1\172\1\uffff\1\172\1\uffff\1\156\1\172\1\uffff"+
        "\1\165\2\uffff\1\164\1\uffff\1\141\1\172\1\154\1\uffff\1\163\1\172"+
        "\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\22\uffff\1\32\1\33\1\34\1\35\1\5\1\6\42"+
        "\uffff\1\26\13\uffff\1\17\2\uffff\1\22\5\uffff\1\31\1\uffff\1\10"+
        "\3\uffff\1\14\1\uffff\1\16\1\20\1\uffff\1\23\1\24\2\uffff\1\30\5"+
        "\uffff\1\21\1\uffff\1\27\2\uffff\1\12\1\uffff\1\15\1\25\1\uffff"+
        "\1\11\3\uffff\1\7\2\uffff\1\13";
    static final String DFA5_specialS =
        "\173\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\1\uffff\1\31\1\1\4\uffff\1"+
            "\2\1\3\2\uffff\1\4\1\5\2\uffff\12\30\7\uffff\1\6\1\27\1\7\2"+
            "\27\1\10\2\27\1\11\3\27\1\12\5\27\1\13\1\27\1\14\5\27\4\uffff"+
            "\1\27\1\uffff\1\15\1\27\1\16\2\27\1\17\2\27\1\20\2\27\1\21\1"+
            "\27\1\22\1\23\3\27\1\24\1\27\1\25\4\27\1\26",
            "",
            "",
            "",
            "",
            "\1\33\20\uffff\1\34",
            "\1\35",
            "\1\36\5\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\23\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\114",
            "\1\115",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\125",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\133",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\136",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\141",
            "\1\142",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\152",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\154",
            "\1\155",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\157",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\162",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\164",
            "",
            "",
            "\1\165",
            "",
            "\1\166",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\170",
            "",
            "\1\171",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | VAR | NUM | STRING | WhiteSpace );";
        }
    }
 

}