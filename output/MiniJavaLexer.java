// $ANTLR 3.4 D:\\Projects\\Mini-Java_Compiler\\MiniJava.g 2024-05-14 17:22:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AndOr=4;
    public static final int ArrayOrObj=5;
    public static final int BOOL=6;
    public static final int BOOLEAN=7;
    public static final int Block=8;
    public static final int CBC=9;
    public static final int CBO=10;
    public static final int CLASS=11;
    public static final int COMA=12;
    public static final int COMPARISONS=13;
    public static final int Class=14;
    public static final int DIV=15;
    public static final int DNUM=16;
    public static final int DOT=17;
    public static final int DOUBLE=18;
    public static final int DeclObj=19;
    public static final int DeclOr=20;
    public static final int Declaration=21;
    public static final int DotValues=22;
    public static final int ELSE=23;
    public static final int EQUAL=24;
    public static final int EXTENDV=25;
    public static final int Factor=26;
    public static final int FuncCall=27;
    public static final int ID=28;
    public static final int IF=29;
    public static final int INT=30;
    public static final int Ifstmt=31;
    public static final int Initialize=32;
    public static final int MAIN=33;
    public static final int MINUS=34;
    public static final int ML_COMMENT=35;
    public static final int MULTI=36;
    public static final int MainMethod=37;
    public static final int Method=38;
    public static final int NEW=39;
    public static final int NOT=40;
    public static final int NUM=41;
    public static final int NotCond=42;
    public static final int PC=43;
    public static final int PLUS=44;
    public static final int PO=45;
    public static final int PRINT=46;
    public static final int PRIVATEV=47;
    public static final int PUBLICV=48;
    public static final int Parameters=49;
    public static final int Printstmt=50;
    public static final int REMINDER=51;
    public static final int RETURNV=52;
    public static final int ReturnMethod=53;
    public static final int SBC=54;
    public static final int SBO=55;
    public static final int SEMICOLON=56;
    public static final int SL_COMMENT=57;
    public static final int STATIC=58;
    public static final int STRING=59;
    public static final int Start=60;
    public static final int TEXT=61;
    public static final int VOID=62;
    public static final int VoidMethod=63;
    public static final int WHILE=64;
    public static final int While=65;
    public static final int Whilestmt=66;
    public static final int WhiteSpace=67;

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
    public String getGrammarFileName() { return "D:\\Projects\\Mini-Java_Compiler\\MiniJava.g"; }

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:251:5: ( '.' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:251:7: '.'
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
    // $ANTLR end "DOT"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:252:7: ( 'while' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:252:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:253:5: ( 'new' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:253:7: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:254:6: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:254:8: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:254:17: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:255:4: ( 'if' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:255:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:256:6: ( 'else' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:256:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:257:7: ( 'System.out.println' | 'System.out.print' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='S') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='y') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='s') ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3=='t') ) {
                            int LA2_4 = input.LA(5);

                            if ( (LA2_4=='e') ) {
                                int LA2_5 = input.LA(6);

                                if ( (LA2_5=='m') ) {
                                    int LA2_6 = input.LA(7);

                                    if ( (LA2_6=='.') ) {
                                        int LA2_7 = input.LA(8);

                                        if ( (LA2_7=='o') ) {
                                            int LA2_8 = input.LA(9);

                                            if ( (LA2_8=='u') ) {
                                                int LA2_9 = input.LA(10);

                                                if ( (LA2_9=='t') ) {
                                                    int LA2_10 = input.LA(11);

                                                    if ( (LA2_10=='.') ) {
                                                        int LA2_11 = input.LA(12);

                                                        if ( (LA2_11=='p') ) {
                                                            int LA2_12 = input.LA(13);

                                                            if ( (LA2_12=='r') ) {
                                                                int LA2_13 = input.LA(14);

                                                                if ( (LA2_13=='i') ) {
                                                                    int LA2_14 = input.LA(15);

                                                                    if ( (LA2_14=='n') ) {
                                                                        int LA2_15 = input.LA(16);

                                                                        if ( (LA2_15=='t') ) {
                                                                            int LA2_16 = input.LA(17);

                                                                            if ( (LA2_16=='l') ) {
                                                                                alt2=1;
                                                                            }
                                                                            else {
                                                                                alt2=2;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("", 2, 15, input);

                                                                            throw nvae;

                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("", 2, 14, input);

                                                                        throw nvae;

                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("", 2, 13, input);

                                                                    throw nvae;

                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 2, 12, input);

                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 2, 11, input);

                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 2, 10, input);

                                                        throw nvae;

                                                    }
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 2, 9, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 2, 8, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 7, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 6, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:257:9: 'System.out.println'
                    {
                    match("System.out.println"); 



                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:257:30: 'System.out.print'
                    {
                    match("System.out.print"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "PUBLICV"
    public final void mPUBLICV() throws RecognitionException {
        try {
            int _type = PUBLICV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:258:21: ( 'public' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:258:23: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLICV"

    // $ANTLR start "PRIVATEV"
    public final void mPRIVATEV() throws RecognitionException {
        try {
            int _type = PRIVATEV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:259:22: ( 'private' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:259:24: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIVATEV"

    // $ANTLR start "RETURNV"
    public final void mRETURNV() throws RecognitionException {
        try {
            int _type = RETURNV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:260:9: ( 'return' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:260:11: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURNV"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:261:7: ( 'class' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:261:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "EXTENDV"
    public final void mEXTENDV() throws RecognitionException {
        try {
            int _type = EXTENDV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:262:9: ( 'extends' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:262:11: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDV"

    // $ANTLR start "CBO"
    public final void mCBO() throws RecognitionException {
        try {
            int _type = CBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:263:5: ( '{' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:263:7: '{'
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
    // $ANTLR end "CBO"

    // $ANTLR start "CBC"
    public final void mCBC() throws RecognitionException {
        try {
            int _type = CBC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:264:5: ( '}' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:264:7: '}'
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
    // $ANTLR end "CBC"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:265:8: ( 'static' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:265:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:266:6: ( 'void' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:266:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "MAIN"
    public final void mMAIN() throws RecognitionException {
        try {
            int _type = MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:267:6: ( 'main' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:267:8: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAIN"

    // $ANTLR start "PO"
    public final void mPO() throws RecognitionException {
        try {
            int _type = PO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:268:4: ( '(' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:268:6: '('
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
    // $ANTLR end "PO"

    // $ANTLR start "PC"
    public final void mPC() throws RecognitionException {
        try {
            int _type = PC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:269:4: ( ')' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:269:6: ')'
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
    // $ANTLR end "PC"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:270:8: ( 'String' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:270:10: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "SBO"
    public final void mSBO() throws RecognitionException {
        try {
            int _type = SBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:271:5: ( '[' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:271:7: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SBO"

    // $ANTLR start "SBC"
    public final void mSBC() throws RecognitionException {
        try {
            int _type = SBC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:272:5: ( ']' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:272:7: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SBC"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:273:5: ( ( '0' .. '9' )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:273:7: ( '0' .. '9' )*
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:273:7: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:
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
            	    break loop3;
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
    // $ANTLR end "NUM"

    // $ANTLR start "DNUM"
    public final void mDNUM() throws RecognitionException {
        try {
            int _type = DNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:274:6: ( NUM '.' NUM )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:274:8: NUM '.' NUM
            {
            mNUM(); 


            match('.'); 

            mNUM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DNUM"

    // $ANTLR start "AndOr"
    public final void mAndOr() throws RecognitionException {
        try {
            int _type = AndOr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:275:7: ( '&&' | '||' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='&') ) {
                alt4=1;
            }
            else if ( (LA4_0=='|') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:275:9: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:275:14: '||'
                    {
                    match("||"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AndOr"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:276:5: ( 'int' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:276:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:277:8: ( 'double' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:277:10: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:278:9: ( 'boolean' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:278:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:279:7: ( '=' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:279:9: '='
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
    // $ANTLR end "EQUAL"

    // $ANTLR start "COMA"
    public final void mCOMA() throws RecognitionException {
        try {
            int _type = COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:280:6: ( ',' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:280:8: ','
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
    // $ANTLR end "COMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:281:15: ( ';' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:281:17: ';'
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

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:282:4: ( '!' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:282:6: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:283:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:283:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:283:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:
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
            	    break loop5;
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
    // $ANTLR end "ID"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:284:6: ( '\"' ( . )* '\"' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:284:8: '\"' ( . )* '\"'
            {
            match('\"'); 

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:284:12: ( . )*
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
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:284:13: .
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
    // $ANTLR end "TEXT"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:285:7: ( '-' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:285:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:286:6: ( '+' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:286:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MULTI"
    public final void mMULTI() throws RecognitionException {
        try {
            int _type = MULTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:287:7: ( '*' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:287:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTI"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:288:5: ( '/' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:288:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "REMINDER"
    public final void mREMINDER() throws RecognitionException {
        try {
            int _type = REMINDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:289:9: ( '%' )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:289:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REMINDER"

    // $ANTLR start "COMPARISONS"
    public final void mCOMPARISONS() throws RecognitionException {
        try {
            int _type = COMPARISONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:290:12: ( '==' | '!=' | '>' | '<' | '>=' | '<=' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt7=1;
                }
                break;
            case '!':
                {
                alt7=2;
                }
                break;
            case '>':
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3=='=') ) {
                    alt7=5;
                }
                else {
                    alt7=3;
                }
                }
                break;
            case '<':
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4=='=') ) {
                    alt7=6;
                }
                else {
                    alt7=4;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:290:43: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:290:48: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:290:53: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:290:57: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:290:61: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 6 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:290:66: '<='
                    {
                    match("<="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPARISONS"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:291:11: ( '/*' ( options {greedy=false; } : . )* ( '*/' )+ )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:291:13: '/*' ( options {greedy=false; } : . )* ( '*/' )+
            {
            match("/*"); 



            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:291:18: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:291:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:291:50: ( '*/' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:291:50: '*/'
            	    {
            	    match("*/"); 



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
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:292:12: ( '//' ( . )* ( '\\n' )+ )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:292:14: '//' ( . )* ( '\\n' )+
            {
            match("//"); 



            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:292:19: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n') ) {
                    alt10=2;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:292:20: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:292:23: ( '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\n') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:292:23: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:293:17: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:293:19: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:293:19: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:8: ( DOT | WHILE | NEW | BOOL | IF | ELSE | PRINT | PUBLICV | PRIVATEV | RETURNV | CLASS | EXTENDV | CBO | CBC | STATIC | VOID | MAIN | PO | PC | STRING | SBO | SBC | NUM | DNUM | AndOr | INT | DOUBLE | BOOLEAN | EQUAL | COMA | SEMICOLON | NOT | ID | TEXT | MINUS | PLUS | MULTI | DIV | REMINDER | COMPARISONS | ML_COMMENT | SL_COMMENT | WhiteSpace )
        int alt13=43;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:10: DOT
                {
                mDOT(); 


                }
                break;
            case 2 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:14: WHILE
                {
                mWHILE(); 


                }
                break;
            case 3 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:20: NEW
                {
                mNEW(); 


                }
                break;
            case 4 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:24: BOOL
                {
                mBOOL(); 


                }
                break;
            case 5 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:29: IF
                {
                mIF(); 


                }
                break;
            case 6 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:32: ELSE
                {
                mELSE(); 


                }
                break;
            case 7 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:37: PRINT
                {
                mPRINT(); 


                }
                break;
            case 8 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:43: PUBLICV
                {
                mPUBLICV(); 


                }
                break;
            case 9 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:51: PRIVATEV
                {
                mPRIVATEV(); 


                }
                break;
            case 10 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:60: RETURNV
                {
                mRETURNV(); 


                }
                break;
            case 11 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:68: CLASS
                {
                mCLASS(); 


                }
                break;
            case 12 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:74: EXTENDV
                {
                mEXTENDV(); 


                }
                break;
            case 13 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:82: CBO
                {
                mCBO(); 


                }
                break;
            case 14 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:86: CBC
                {
                mCBC(); 


                }
                break;
            case 15 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:90: STATIC
                {
                mSTATIC(); 


                }
                break;
            case 16 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:97: VOID
                {
                mVOID(); 


                }
                break;
            case 17 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:102: MAIN
                {
                mMAIN(); 


                }
                break;
            case 18 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:107: PO
                {
                mPO(); 


                }
                break;
            case 19 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:110: PC
                {
                mPC(); 


                }
                break;
            case 20 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:113: STRING
                {
                mSTRING(); 


                }
                break;
            case 21 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:120: SBO
                {
                mSBO(); 


                }
                break;
            case 22 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:124: SBC
                {
                mSBC(); 


                }
                break;
            case 23 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:128: NUM
                {
                mNUM(); 


                }
                break;
            case 24 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:132: DNUM
                {
                mDNUM(); 


                }
                break;
            case 25 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:137: AndOr
                {
                mAndOr(); 


                }
                break;
            case 26 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:143: INT
                {
                mINT(); 


                }
                break;
            case 27 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:147: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 28 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:154: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 29 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:162: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 30 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:168: COMA
                {
                mCOMA(); 


                }
                break;
            case 31 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:173: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 32 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:183: NOT
                {
                mNOT(); 


                }
                break;
            case 33 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:187: ID
                {
                mID(); 


                }
                break;
            case 34 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:190: TEXT
                {
                mTEXT(); 


                }
                break;
            case 35 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:195: MINUS
                {
                mMINUS(); 


                }
                break;
            case 36 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:201: PLUS
                {
                mPLUS(); 


                }
                break;
            case 37 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:206: MULTI
                {
                mMULTI(); 


                }
                break;
            case 38 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:212: DIV
                {
                mDIV(); 


                }
                break;
            case 39 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:216: REMINDER
                {
                mREMINDER(); 


                }
                break;
            case 40 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:225: COMPARISONS
                {
                mCOMPARISONS(); 


                }
                break;
            case 41 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:237: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 42 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:248: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 43 :
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:1:259: WhiteSpace
                {
                mWhiteSpace(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\26\1\47\12\36\2\uffff\3\36\4\uffff\1\26\2\uffff\2\36\1\74\2\uffff"+
        "\1\75\5\uffff\1\100\5\uffff\4\36\1\105\16\36\5\uffff\1\36\1\125"+
        "\2\36\1\uffff\1\130\16\36\1\uffff\1\147\1\36\1\uffff\1\151\10\36"+
        "\1\162\1\163\2\36\1\166\1\uffff\1\147\1\uffff\6\36\1\175\1\36\2"+
        "\uffff\2\36\1\uffff\2\36\1\u0083\1\u0084\1\36\1\u0086\1\uffff\1"+
        "\u0087\1\u0088\1\36\1\u008a\3\uffff\1\u008b\3\uffff\1\u008c\3\uffff";
    static final String DFA13_eofS =
        "\u008d\uffff";
    static final String DFA13_minS =
        "\1\11\1\60\1\150\1\145\1\162\1\141\1\146\1\154\1\164\1\162\1\145"+
        "\1\154\2\uffff\1\164\1\157\1\141\4\uffff\1\56\2\uffff\2\157\1\75"+
        "\2\uffff\1\75\5\uffff\1\52\5\uffff\1\151\1\167\1\165\1\154\1\60"+
        "\1\164\1\163\1\164\1\163\1\162\1\142\1\151\1\164\2\141\2\151\1\165"+
        "\1\157\5\uffff\1\154\1\60\1\145\1\163\1\uffff\1\60\2\145\1\164\1"+
        "\151\1\154\1\166\1\165\1\163\1\164\1\144\1\156\1\142\1\154\1\145"+
        "\1\uffff\1\60\1\145\1\uffff\1\60\1\156\1\145\1\156\1\151\1\141\1"+
        "\162\1\163\1\151\2\60\1\154\1\145\1\60\1\uffff\1\60\1\uffff\1\144"+
        "\1\155\1\147\1\143\1\164\1\156\1\60\1\143\2\uffff\1\145\1\141\1"+
        "\uffff\1\163\1\56\2\60\1\145\1\60\1\uffff\2\60\1\156\1\60\3\uffff"+
        "\1\60\3\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\175\1\71\1\150\1\145\1\162\1\141\1\156\1\170\1\171\1\165\1\145"+
        "\1\154\2\uffff\1\164\1\157\1\141\4\uffff\1\71\2\uffff\2\157\1\75"+
        "\2\uffff\1\75\5\uffff\1\57\5\uffff\1\151\1\167\1\165\1\154\1\172"+
        "\1\164\1\163\1\164\1\163\1\162\1\142\1\151\1\164\2\141\2\151\1\165"+
        "\1\157\5\uffff\1\154\1\172\1\145\1\163\1\uffff\1\172\2\145\1\164"+
        "\1\151\1\154\1\166\1\165\1\163\1\164\1\144\1\156\1\142\1\154\1\145"+
        "\1\uffff\1\172\1\145\1\uffff\1\172\1\156\1\145\1\156\1\151\1\141"+
        "\1\162\1\163\1\151\2\172\1\154\1\145\1\172\1\uffff\1\172\1\uffff"+
        "\1\144\1\155\1\147\1\143\1\164\1\156\1\172\1\143\2\uffff\1\145\1"+
        "\141\1\uffff\1\163\1\56\2\172\1\145\1\172\1\uffff\2\172\1\156\1"+
        "\172\3\uffff\1\172\3\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\14\uffff\1\15\1\16\3\uffff\1\22\1\23\1\25\1\26\1\uffff\1\27\1\31"+
        "\3\uffff\1\36\1\37\1\uffff\1\41\1\42\1\43\1\44\1\45\1\uffff\1\47"+
        "\1\50\1\53\1\1\1\30\23\uffff\1\35\1\40\1\51\1\52\1\46\4\uffff\1"+
        "\5\17\uffff\1\3\2\uffff\1\32\16\uffff\1\4\1\uffff\1\6\10\uffff\1"+
        "\20\1\21\2\uffff\1\2\6\uffff\1\13\4\uffff\1\7\1\24\1\10\1\uffff"+
        "\1\12\1\17\1\33\1\uffff\1\14\1\11\1\34";
    static final String DFA13_specialS =
        "\u008d\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\46\2\uffff\1\46\22\uffff\1\46\1\35\1\37\2\uffff\1\44\1\27"+
            "\1\uffff\1\21\1\22\1\42\1\41\1\33\1\40\1\1\1\43\12\25\1\uffff"+
            "\1\34\1\45\1\32\1\45\2\uffff\22\36\1\10\7\36\1\23\1\uffff\1"+
            "\24\1\uffff\1\36\1\uffff\1\36\1\31\1\13\1\30\1\7\1\5\2\36\1"+
            "\6\3\36\1\20\1\3\1\36\1\11\1\36\1\12\1\16\1\4\1\36\1\17\1\2"+
            "\3\36\1\14\1\27\1\15",
            "\12\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\7\uffff\1\56",
            "\1\57\13\uffff\1\60",
            "\1\62\4\uffff\1\61",
            "\1\64\2\uffff\1\63",
            "\1\65",
            "\1\66",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "",
            "\1\50\1\uffff\12\25",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\45",
            "",
            "",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "\1\124",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\126",
            "\1\127",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\150",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\164",
            "\1\165",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\176",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0085",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0089",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DOT | WHILE | NEW | BOOL | IF | ELSE | PRINT | PUBLICV | PRIVATEV | RETURNV | CLASS | EXTENDV | CBO | CBC | STATIC | VOID | MAIN | PO | PC | STRING | SBO | SBC | NUM | DNUM | AndOr | INT | DOUBLE | BOOLEAN | EQUAL | COMA | SEMICOLON | NOT | ID | TEXT | MINUS | PLUS | MULTI | DIV | REMINDER | COMPARISONS | ML_COMMENT | SL_COMMENT | WhiteSpace );";
        }
    }
 

}