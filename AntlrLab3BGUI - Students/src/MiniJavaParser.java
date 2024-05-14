// $ANTLR 3.4 D:\\Projects\\Mini-Java_Compiler\\MiniJava.g 2024-05-14 17:31:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "ArrayOrObj", "BOOL", "BOOLEAN", "Block", "CBC", "CBO", "CLASS", "COMA", "COMPARISONS", "Classl", "DIV", "DNUM", "DOT", "DOUBLE", "DeclObj", "DeclOr", "Declaration", "DotValues", "ELSE", "EQUAL", "EXTENDV", "Factor", "FuncCall", "ID", "IF", "INT", "Ifstmt", "Initialize", "MAIN", "MINUS", "ML_COMMENT", "MULTI", "MainMethod", "Method", "NEW", "NOT", "NUM", "NotCond", "PC", "PLUS", "PO", "PRINT", "PRIVATEV", "PUBLICV", "Parameters", "Printstmt", "REMINDER", "RETURNV", "ReturnMethod", "SBC", "SBO", "SEMICOLON", "SL_COMMENT", "STATIC", "STRING", "Start", "TEXT", "VOID", "VoidMethod", "WHILE", "While", "Whilestmt", "WhiteSpace"
    };

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
    public static final int Classl=14;
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MiniJavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Projects\\Mini-Java_Compiler\\MiniJava.g"; }


    String s="";


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:1: start : ( ( classl )+ ) -> ^( Start classl ) ;
    public final MiniJavaParser.start_return start() throws RecognitionException {
        MiniJavaParser.start_return retval = new MiniJavaParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.classl_return classl1 =null;


        RewriteRuleSubtreeStream stream_classl=new RewriteRuleSubtreeStream(adaptor,"rule classl");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:8: ( ( ( classl )+ ) -> ^( Start classl ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:10: ( ( classl )+ )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:10: ( ( classl )+ )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:11: ( classl )+
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:11: ( classl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CLASS||(LA1_0 >= PRIVATEV && LA1_0 <= PUBLICV)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:11: classl
            	    {
            	    pushFollow(FOLLOW_classl_in_start97);
            	    classl1=classl();

            	    state._fsp--;

            	    stream_classl.add(classl1.getTree());

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


            // AST REWRITE
            // elements: classl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:20: -> ^( Start classl )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:23: ^( Start classl )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                adaptor.addChild(root_1, stream_classl.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
            s=s+"Exit..."+"\n";
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modifier"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:1: modifier : ( PUBLICV | PRIVATEV ) ^;
    public final MiniJavaParser.modifier_return modifier() throws RecognitionException {
        MiniJavaParser.modifier_return retval = new MiniJavaParser.modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:10: ( ( PUBLICV | PRIVATEV ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:12: ( PUBLICV | PRIVATEV ) ^
            {
            root_0 = (Object)adaptor.nil();


            set2=(Token)input.LT(1);

            set2=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATEV && input.LA(1) <= PUBLICV) ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set2)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modifier"


    public static class classl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classl"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:1: classl : ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC ) -> ^( Classl ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC ) ;
    public final MiniJavaParser.classl_return classl() throws RecognitionException {
        MiniJavaParser.classl_return retval = new MiniJavaParser.classl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS4=null;
        Token ID5=null;
        Token EXTENDV6=null;
        Token ID7=null;
        Token CBO8=null;
        Token CBC14=null;
        MiniJavaParser.modifier_return modifier3 =null;

        MiniJavaParser.statment_return statment9 =null;

        MiniJavaParser.method_return method10 =null;

        MiniJavaParser.mainmethod_return mainmethod11 =null;

        MiniJavaParser.statment_return statment12 =null;

        MiniJavaParser.method_return method13 =null;


        Object CLASS4_tree=null;
        Object ID5_tree=null;
        Object EXTENDV6_tree=null;
        Object ID7_tree=null;
        Object CBO8_tree=null;
        Object CBC14_tree=null;
        RewriteRuleTokenStream stream_CBO=new RewriteRuleTokenStream(adaptor,"token CBO");
        RewriteRuleTokenStream stream_EXTENDV=new RewriteRuleTokenStream(adaptor,"token EXTENDV");
        RewriteRuleTokenStream stream_CBC=new RewriteRuleTokenStream(adaptor,"token CBC");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_statment=new RewriteRuleSubtreeStream(adaptor,"rule statment");
        RewriteRuleSubtreeStream stream_mainmethod=new RewriteRuleSubtreeStream(adaptor,"rule mainmethod");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:9: ( ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC ) -> ^( Classl ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:11: ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:11: ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:12: ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:12: ( modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= PRIVATEV && LA2_0 <= PUBLICV)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:12: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_classl150);
                    modifier3=modifier();

                    state._fsp--;

                    stream_modifier.add(modifier3.getTree());

                    }
                    break;

            }


            CLASS4=(Token)match(input,CLASS,FOLLOW_CLASS_in_classl153);  
            stream_CLASS.add(CLASS4);


            ID5=(Token)match(input,ID,FOLLOW_ID_in_classl155);  
            stream_ID.add(ID5);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:31: ( EXTENDV ID )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXTENDV) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:45:32: EXTENDV ID
                    {
                    EXTENDV6=(Token)match(input,EXTENDV,FOLLOW_EXTENDV_in_classl158);  
                    stream_EXTENDV.add(EXTENDV6);


                    ID7=(Token)match(input,ID,FOLLOW_ID_in_classl160);  
                    stream_ID.add(ID7);


                    }
                    break;

            }


            CBO8=(Token)match(input,CBO,FOLLOW_CBO_in_classl164);  
            stream_CBO.add(CBO8);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:46:5: ( statment )*
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    switch ( input.LA(2) ) {
                    case EQUAL:
                    case PO:
                    case SEMICOLON:
                        {
                        alt4=1;
                        }
                        break;
                    case SBO:
                        {
                        int LA4_5 = input.LA(3);

                        if ( (LA4_5==SBC) ) {
                            int LA4_8 = input.LA(4);

                            if ( (LA4_8==ID) ) {
                                int LA4_6 = input.LA(5);

                                if ( (LA4_6==EQUAL||(LA4_6 >= SBO && LA4_6 <= SEMICOLON)) ) {
                                    alt4=1;
                                }


                            }
                            else if ( (LA4_8==EQUAL||LA4_8==SEMICOLON) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_5==BOOL||LA4_5==DNUM||LA4_5==ID||LA4_5==MINUS||(LA4_5 >= NOT && LA4_5 <= NUM)||LA4_5==PO) ) {
                            alt4=1;
                        }


                        }
                        break;
                    case ID:
                        {
                        int LA4_6 = input.LA(3);

                        if ( (LA4_6==EQUAL||(LA4_6 >= SBO && LA4_6 <= SEMICOLON)) ) {
                            alt4=1;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case IF:
                case PRINT:
                case WHILE:
                    {
                    alt4=1;
                    }
                    break;
                case BOOLEAN:
                case DOUBLE:
                case INT:
                case STRING:
                    {
                    int LA4_4 = input.LA(2);

                    if ( (LA4_4==SBO) ) {
                        int LA4_7 = input.LA(3);

                        if ( (LA4_7==SBC) ) {
                            int LA4_9 = input.LA(4);

                            if ( (LA4_9==ID) ) {
                                int LA4_6 = input.LA(5);

                                if ( (LA4_6==EQUAL||(LA4_6 >= SBO && LA4_6 <= SEMICOLON)) ) {
                                    alt4=1;
                                }


                            }


                        }


                    }
                    else if ( (LA4_4==ID) ) {
                        int LA4_6 = input.LA(3);

                        if ( (LA4_6==EQUAL||(LA4_6 >= SBO && LA4_6 <= SEMICOLON)) ) {
                            alt4=1;
                        }


                    }


                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:46:5: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_classl170);
            	    statment9=statment();

            	    state._fsp--;

            	    stream_statment.add(statment9.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:5: ( method )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= PRIVATEV && LA5_0 <= PUBLICV)) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==STATIC) ) {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==VOID) ) {
                            int LA5_5 = input.LA(4);

                            if ( (LA5_5==ID) ) {
                                alt5=1;
                            }


                        }
                        else if ( (LA5_4==BOOLEAN||LA5_4==DOUBLE||LA5_4==ID||LA5_4==INT||LA5_4==STRING) ) {
                            alt5=1;
                        }


                    }
                    else if ( (LA5_1==BOOLEAN||LA5_1==DOUBLE||LA5_1==ID||LA5_1==INT||LA5_1==STRING||LA5_1==VOID) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==BOOLEAN||LA5_0==DOUBLE||LA5_0==ID||LA5_0==INT||(LA5_0 >= STATIC && LA5_0 <= STRING)||LA5_0==VOID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:5: method
            	    {
            	    pushFollow(FOLLOW_method_in_classl178);
            	    method10=method();

            	    state._fsp--;

            	    stream_method.add(method10.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:5: ( mainmethod ( statment )* ( method )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= PRIVATEV && LA8_0 <= PUBLICV)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:6: mainmethod ( statment )* ( method )*
                    {
                    pushFollow(FOLLOW_mainmethod_in_classl186);
                    mainmethod11=mainmethod();

                    state._fsp--;

                    stream_mainmethod.add(mainmethod11.getTree());

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:17: ( statment )*
                    loop6:
                    do {
                        int alt6=2;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            switch ( input.LA(2) ) {
                            case EQUAL:
                            case PO:
                            case SEMICOLON:
                                {
                                alt6=1;
                                }
                                break;
                            case SBO:
                                {
                                int LA6_5 = input.LA(3);

                                if ( (LA6_5==SBC) ) {
                                    int LA6_8 = input.LA(4);

                                    if ( (LA6_8==ID) ) {
                                        int LA6_6 = input.LA(5);

                                        if ( (LA6_6==EQUAL||(LA6_6 >= SBO && LA6_6 <= SEMICOLON)) ) {
                                            alt6=1;
                                        }


                                    }
                                    else if ( (LA6_8==EQUAL||LA6_8==SEMICOLON) ) {
                                        alt6=1;
                                    }


                                }
                                else if ( (LA6_5==BOOL||LA6_5==DNUM||LA6_5==ID||LA6_5==MINUS||(LA6_5 >= NOT && LA6_5 <= NUM)||LA6_5==PO) ) {
                                    alt6=1;
                                }


                                }
                                break;
                            case ID:
                                {
                                int LA6_6 = input.LA(3);

                                if ( (LA6_6==EQUAL||(LA6_6 >= SBO && LA6_6 <= SEMICOLON)) ) {
                                    alt6=1;
                                }


                                }
                                break;

                            }

                            }
                            break;
                        case IF:
                        case PRINT:
                        case WHILE:
                            {
                            alt6=1;
                            }
                            break;
                        case BOOLEAN:
                        case DOUBLE:
                        case INT:
                        case STRING:
                            {
                            int LA6_4 = input.LA(2);

                            if ( (LA6_4==SBO) ) {
                                int LA6_7 = input.LA(3);

                                if ( (LA6_7==SBC) ) {
                                    int LA6_9 = input.LA(4);

                                    if ( (LA6_9==ID) ) {
                                        int LA6_6 = input.LA(5);

                                        if ( (LA6_6==EQUAL||(LA6_6 >= SBO && LA6_6 <= SEMICOLON)) ) {
                                            alt6=1;
                                        }


                                    }


                                }


                            }
                            else if ( (LA6_4==ID) ) {
                                int LA6_6 = input.LA(3);

                                if ( (LA6_6==EQUAL||(LA6_6 >= SBO && LA6_6 <= SEMICOLON)) ) {
                                    alt6=1;
                                }


                            }


                            }
                            break;

                        }

                        switch (alt6) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:17: statment
                    	    {
                    	    pushFollow(FOLLOW_statment_in_classl188);
                    	    statment12=statment();

                    	    state._fsp--;

                    	    stream_statment.add(statment12.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:27: ( method )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==BOOLEAN||LA7_0==DOUBLE||LA7_0==ID||LA7_0==INT||(LA7_0 >= PRIVATEV && LA7_0 <= PUBLICV)||(LA7_0 >= STATIC && LA7_0 <= STRING)||LA7_0==VOID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:27: method
                    	    {
                    	    pushFollow(FOLLOW_method_in_classl191);
                    	    method13=method();

                    	    state._fsp--;

                    	    stream_method.add(method13.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            CBC14=(Token)match(input,CBC,FOLLOW_CBC_in_classl199);  
            stream_CBC.add(CBC14);


            }


            // AST REWRITE
            // elements: statment, EXTENDV, modifier, CBO, method, ID, CLASS, statment, CBC, ID, mainmethod, method
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:9: -> ^( Classl ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:12: ^( Classl ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Classl, "Classl")
                , root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:21: ( modifier )?
                if ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();

                adaptor.addChild(root_1, 
                stream_CLASS.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:40: ( EXTENDV ID )?
                if ( stream_EXTENDV.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_EXTENDV.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_EXTENDV.reset();
                stream_ID.reset();

                adaptor.addChild(root_1, 
                stream_CBO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:58: ( statment )*
                while ( stream_statment.hasNext() ) {
                    adaptor.addChild(root_1, stream_statment.nextTree());

                }
                stream_statment.reset();

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:68: ( method )*
                while ( stream_method.hasNext() ) {
                    adaptor.addChild(root_1, stream_method.nextTree());

                }
                stream_method.reset();

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:75: ( mainmethod ( statment )* ( method )* )?
                if ( stream_statment.hasNext()||stream_method.hasNext()||stream_mainmethod.hasNext() ) {
                    adaptor.addChild(root_1, stream_mainmethod.nextTree());

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:87: ( statment )*
                    while ( stream_statment.hasNext() ) {
                        adaptor.addChild(root_1, stream_statment.nextTree());

                    }
                    stream_statment.reset();

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:97: ( method )*
                    while ( stream_method.hasNext() ) {
                        adaptor.addChild(root_1, stream_method.nextTree());

                    }
                    stream_method.reset();

                }
                stream_statment.reset();
                stream_method.reset();
                stream_mainmethod.reset();

                adaptor.addChild(root_1, 
                stream_CBC.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classl"


    public static class mainmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mainmethod"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:1: mainmethod : ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) -> ^( MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* ) ;
    public final MiniJavaParser.mainmethod_return mainmethod() throws RecognitionException {
        MiniJavaParser.mainmethod_return retval = new MiniJavaParser.mainmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC16=null;
        Token VOID17=null;
        Token MAIN18=null;
        Token PO19=null;
        Token STRING20=null;
        Token SBO21=null;
        Token SBC22=null;
        Token ID23=null;
        Token PC24=null;
        Token CBO25=null;
        Token CBC27=null;
        MiniJavaParser.modifier_return modifier15 =null;

        MiniJavaParser.statment_return statment26 =null;


        Object STATIC16_tree=null;
        Object VOID17_tree=null;
        Object MAIN18_tree=null;
        Object PO19_tree=null;
        Object STRING20_tree=null;
        Object SBO21_tree=null;
        Object SBC22_tree=null;
        Object ID23_tree=null;
        Object PC24_tree=null;
        Object CBO25_tree=null;
        Object CBC27_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_CBO=new RewriteRuleTokenStream(adaptor,"token CBO");
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleTokenStream stream_CBC=new RewriteRuleTokenStream(adaptor,"token CBC");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_statment=new RewriteRuleSubtreeStream(adaptor,"rule statment");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:17: ( ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) -> ^( MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:19: ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:19: ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:20: modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC
            {
            pushFollow(FOLLOW_modifier_in_mainmethod271);
            modifier15=modifier();

            state._fsp--;

            stream_modifier.add(modifier15.getTree());

            STATIC16=(Token)match(input,STATIC,FOLLOW_STATIC_in_mainmethod273);  
            stream_STATIC.add(STATIC16);


            VOID17=(Token)match(input,VOID,FOLLOW_VOID_in_mainmethod275);  
            stream_VOID.add(VOID17);


            MAIN18=(Token)match(input,MAIN,FOLLOW_MAIN_in_mainmethod277);  
            stream_MAIN.add(MAIN18);


            PO19=(Token)match(input,PO,FOLLOW_PO_in_mainmethod279);  
            stream_PO.add(PO19);


            STRING20=(Token)match(input,STRING,FOLLOW_STRING_in_mainmethod281);  
            stream_STRING.add(STRING20);


            SBO21=(Token)match(input,SBO,FOLLOW_SBO_in_mainmethod283);  
            stream_SBO.add(SBO21);


            SBC22=(Token)match(input,SBC,FOLLOW_SBC_in_mainmethod285);  
            stream_SBC.add(SBC22);


            ID23=(Token)match(input,ID,FOLLOW_ID_in_mainmethod287);  
            stream_ID.add(ID23);


            PC24=(Token)match(input,PC,FOLLOW_PC_in_mainmethod289);  
            stream_PC.add(PC24);


            CBO25=(Token)match(input,CBO,FOLLOW_CBO_in_mainmethod291);  
            stream_CBO.add(CBO25);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:5: ( statment )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==BOOLEAN||LA9_0==DOUBLE||(LA9_0 >= ID && LA9_0 <= INT)||LA9_0==PRINT||LA9_0==STRING||LA9_0==WHILE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:5: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_mainmethod297);
            	    statment26=statment();

            	    state._fsp--;

            	    stream_statment.add(statment26.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            CBC27=(Token)match(input,CBC,FOLLOW_CBC_in_mainmethod315);  
            stream_CBC.add(CBC27);


            }


            // AST REWRITE
            // elements: VOID, PC, statment, STRING, SBC, modifier, MAIN, CBO, STATIC, PO, ID, SBO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:15: -> ^( MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:18: ^( MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MainMethod, "MainMethod")
                , root_1);

                adaptor.addChild(root_1, stream_modifier.nextTree());

                adaptor.addChild(root_1, 
                stream_STATIC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VOID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_MAIN.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PO.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_SBO.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_SBC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CBO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:85: ( statment )*
                while ( stream_statment.hasNext() ) {
                    adaptor.addChild(root_1, stream_statment.nextTree());

                }
                stream_statment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mainmethod"


    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:1: method : ( ( modifier )? ( STATIC )? methodtype ) -> ^( Method ( modifier )? ( STATIC )? methodtype ) ;
    public final MiniJavaParser.method_return method() throws RecognitionException {
        MiniJavaParser.method_return retval = new MiniJavaParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC29=null;
        MiniJavaParser.modifier_return modifier28 =null;

        MiniJavaParser.methodtype_return methodtype30 =null;


        Object STATIC29_tree=null;
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_methodtype=new RewriteRuleSubtreeStream(adaptor,"rule methodtype");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:9: ( ( ( modifier )? ( STATIC )? methodtype ) -> ^( Method ( modifier )? ( STATIC )? methodtype ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:17: ( ( modifier )? ( STATIC )? methodtype )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:17: ( ( modifier )? ( STATIC )? methodtype )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:18: ( modifier )? ( STATIC )? methodtype
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:18: ( modifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0 >= PRIVATEV && LA10_0 <= PUBLICV)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:18: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_method375);
                    modifier28=modifier();

                    state._fsp--;

                    stream_modifier.add(modifier28.getTree());

                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:28: ( STATIC )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==STATIC) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:28: STATIC
                    {
                    STATIC29=(Token)match(input,STATIC,FOLLOW_STATIC_in_method378);  
                    stream_STATIC.add(STATIC29);


                    }
                    break;

            }


            pushFollow(FOLLOW_methodtype_in_method381);
            methodtype30=methodtype();

            state._fsp--;

            stream_methodtype.add(methodtype30.getTree());

            }


            // AST REWRITE
            // elements: modifier, methodtype, STATIC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:48: -> ^( Method ( modifier )? ( STATIC )? methodtype )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:51: ^( Method ( modifier )? ( STATIC )? methodtype )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Method, "Method")
                , root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:60: ( modifier )?
                if ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:70: ( STATIC )?
                if ( stream_STATIC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_STATIC.nextNode()
                    );

                }
                stream_STATIC.reset();

                adaptor.addChild(root_1, stream_methodtype.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method"


    public static class methodtype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodtype"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:68:1: methodtype : ( voidmethod | returnmethod ) ^;
    public final MiniJavaParser.methodtype_return methodtype() throws RecognitionException {
        MiniJavaParser.methodtype_return retval = new MiniJavaParser.methodtype_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.voidmethod_return voidmethod31 =null;

        MiniJavaParser.returnmethod_return returnmethod32 =null;



        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:68:12: ( ( voidmethod | returnmethod ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:68:14: ( voidmethod | returnmethod ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:68:14: ( voidmethod | returnmethod )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==VOID) ) {
                alt12=1;
            }
            else if ( (LA12_0==BOOLEAN||LA12_0==DOUBLE||LA12_0==ID||LA12_0==INT||LA12_0==STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:68:15: voidmethod
                    {
                    pushFollow(FOLLOW_voidmethod_in_methodtype417);
                    voidmethod31=voidmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, voidmethod31.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:68:26: returnmethod
                    {
                    pushFollow(FOLLOW_returnmethod_in_methodtype419);
                    returnmethod32=returnmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, returnmethod32.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodtype"


    public static class voidmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "voidmethod"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:1: voidmethod : ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) ;
    public final MiniJavaParser.voidmethod_return voidmethod() throws RecognitionException {
        MiniJavaParser.voidmethod_return retval = new MiniJavaParser.voidmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID33=null;
        Token ID34=null;
        Token PO35=null;
        Token ID37=null;
        Token COMA38=null;
        Token ID40=null;
        Token PC41=null;
        Token CBO42=null;
        Token CBC44=null;
        MiniJavaParser.type_return type36 =null;

        MiniJavaParser.type_return type39 =null;

        MiniJavaParser.statment_return statment43 =null;


        Object VOID33_tree=null;
        Object ID34_tree=null;
        Object PO35_tree=null;
        Object ID37_tree=null;
        Object COMA38_tree=null;
        Object ID40_tree=null;
        Object PC41_tree=null;
        Object CBO42_tree=null;
        Object CBC44_tree=null;
        RewriteRuleTokenStream stream_CBO=new RewriteRuleTokenStream(adaptor,"token CBO");
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_CBC=new RewriteRuleTokenStream(adaptor,"token CBC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_statment=new RewriteRuleSubtreeStream(adaptor,"rule statment");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:17: ( ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:22: ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:22: ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:23: VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC
            {
            VOID33=(Token)match(input,VOID,FOLLOW_VOID_in_voidmethod451);  
            stream_VOID.add(VOID33);


            ID34=(Token)match(input,ID,FOLLOW_ID_in_voidmethod453);  
            stream_ID.add(ID34);


            PO35=(Token)match(input,PO,FOLLOW_PO_in_voidmethod455);  
            stream_PO.add(PO35);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:34: ( type ID ( COMA type ID )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BOOLEAN||LA14_0==DOUBLE||LA14_0==ID||LA14_0==INT||LA14_0==STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:35: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_voidmethod458);
                    type36=type();

                    state._fsp--;

                    stream_type.add(type36.getTree());

                    ID37=(Token)match(input,ID,FOLLOW_ID_in_voidmethod460);  
                    stream_ID.add(ID37);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:43: ( COMA type ID )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:44: COMA type ID
                    	    {
                    	    COMA38=(Token)match(input,COMA,FOLLOW_COMA_in_voidmethod463);  
                    	    stream_COMA.add(COMA38);


                    	    pushFollow(FOLLOW_type_in_voidmethod465);
                    	    type39=type();

                    	    state._fsp--;

                    	    stream_type.add(type39.getTree());

                    	    ID40=(Token)match(input,ID,FOLLOW_ID_in_voidmethod467);  
                    	    stream_ID.add(ID40);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            PC41=(Token)match(input,PC,FOLLOW_PC_in_voidmethod473);  
            stream_PC.add(PC41);


            CBO42=(Token)match(input,CBO,FOLLOW_CBO_in_voidmethod475);  
            stream_CBO.add(CBO42);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:12: ( statment )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==BOOLEAN||LA15_0==DOUBLE||(LA15_0 >= ID && LA15_0 <= INT)||LA15_0==PRINT||LA15_0==STRING||LA15_0==WHILE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:12: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_voidmethod489);
            	    statment43=statment();

            	    state._fsp--;

            	    stream_statment.add(statment43.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            CBC44=(Token)match(input,CBC,FOLLOW_CBC_in_voidmethod495);  
            stream_CBC.add(CBC44);


            }


            // AST REWRITE
            // elements: COMA, type, statment, PC, CBO, CBC, type, ID, VOID, PO, ID, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:9: -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:76:11: ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VoidMethod, "VoidMethod")
                , root_1);

                adaptor.addChild(root_1, 
                stream_VOID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:76:35: ( type ID ( COMA type ID )* )?
                if ( stream_COMA.hasNext()||stream_type.hasNext()||stream_type.hasNext()||stream_ID.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:76:44: ( COMA type ID )*
                    while ( stream_COMA.hasNext()||stream_type.hasNext()||stream_ID.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_COMA.nextNode()
                        );

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                    }
                    stream_COMA.reset();
                    stream_type.reset();
                    stream_ID.reset();

                }
                stream_COMA.reset();
                stream_type.reset();
                stream_type.reset();
                stream_ID.reset();
                stream_ID.reset();

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CBO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:76:69: ( statment )*
                while ( stream_statment.hasNext() ) {
                    adaptor.addChild(root_1, stream_statment.nextTree());

                }
                stream_statment.reset();

                adaptor.addChild(root_1, 
                stream_CBC.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "voidmethod"


    public static class typev_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typev"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:1: typev : ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^;
    public final MiniJavaParser.typev_return typev() throws RecognitionException {
        MiniJavaParser.typev_return retval = new MiniJavaParser.typev_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set45=null;

        Object set45_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:8: ( ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:10: ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^
            {
            root_0 = (Object)adaptor.nil();


            set45=(Token)input.LT(1);

            set45=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==ID||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set45)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typev"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:1: type : ( typev ( SBO SBC )? ) -> ^( typev ( SBO SBC )? ) ;
    public final MiniJavaParser.type_return type() throws RecognitionException {
        MiniJavaParser.type_return retval = new MiniJavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SBO47=null;
        Token SBC48=null;
        MiniJavaParser.typev_return typev46 =null;


        Object SBO47_tree=null;
        Object SBC48_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleSubtreeStream stream_typev=new RewriteRuleSubtreeStream(adaptor,"rule typev");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:11: ( ( typev ( SBO SBC )? ) -> ^( typev ( SBO SBC )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:13: ( typev ( SBO SBC )? )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:13: ( typev ( SBO SBC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:14: typev ( SBO SBC )?
            {
            pushFollow(FOLLOW_typev_in_type580);
            typev46=typev();

            state._fsp--;

            stream_typev.add(typev46.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:20: ( SBO SBC )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==SBO) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==SBC) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==ID||LA16_3==PO||LA16_3==SBO) ) {
                        alt16=1;
                    }
                }
            }
            switch (alt16) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:21: SBO SBC
                    {
                    SBO47=(Token)match(input,SBO,FOLLOW_SBO_in_type583);  
                    stream_SBO.add(SBO47);


                    SBC48=(Token)match(input,SBC,FOLLOW_SBC_in_type585);  
                    stream_SBC.add(SBC48);


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: typev, SBO, SBC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 85:32: -> ^( typev ( SBO SBC )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:35: ^( typev ( SBO SBC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_typev.nextNode(), root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:43: ( SBO SBC )?
                if ( stream_SBO.hasNext()||stream_SBC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SBO.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_SBC.nextNode()
                    );

                }
                stream_SBO.reset();
                stream_SBC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class returnmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnmethod"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:1: returnmethod : ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) ;
    public final MiniJavaParser.returnmethod_return returnmethod() throws RecognitionException {
        MiniJavaParser.returnmethod_return retval = new MiniJavaParser.returnmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID50=null;
        Token PO51=null;
        Token ID53=null;
        Token COMA54=null;
        Token ID56=null;
        Token PC57=null;
        Token CBO58=null;
        Token RETURNV60=null;
        Token SEMICOLON62=null;
        Token CBC63=null;
        MiniJavaParser.type_return type49 =null;

        MiniJavaParser.type_return type52 =null;

        MiniJavaParser.type_return type55 =null;

        MiniJavaParser.statment_return statment59 =null;

        MiniJavaParser.arithExpr_return arithExpr61 =null;


        Object ID50_tree=null;
        Object PO51_tree=null;
        Object ID53_tree=null;
        Object COMA54_tree=null;
        Object ID56_tree=null;
        Object PC57_tree=null;
        Object CBO58_tree=null;
        Object RETURNV60_tree=null;
        Object SEMICOLON62_tree=null;
        Object CBC63_tree=null;
        RewriteRuleTokenStream stream_CBO=new RewriteRuleTokenStream(adaptor,"token CBO");
        RewriteRuleTokenStream stream_RETURNV=new RewriteRuleTokenStream(adaptor,"token RETURNV");
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_CBC=new RewriteRuleTokenStream(adaptor,"token CBC");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_statment=new RewriteRuleSubtreeStream(adaptor,"rule statment");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:15: ( ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:17: ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:17: ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:18: type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC
            {
            pushFollow(FOLLOW_type_in_returnmethod624);
            type49=type();

            state._fsp--;

            stream_type.add(type49.getTree());

            ID50=(Token)match(input,ID,FOLLOW_ID_in_returnmethod626);  
            stream_ID.add(ID50);


            PO51=(Token)match(input,PO,FOLLOW_PO_in_returnmethod628);  
            stream_PO.add(PO51);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:29: ( type ID ( COMA type ID )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BOOLEAN||LA18_0==DOUBLE||LA18_0==ID||LA18_0==INT||LA18_0==STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:30: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_returnmethod631);
                    type52=type();

                    state._fsp--;

                    stream_type.add(type52.getTree());

                    ID53=(Token)match(input,ID,FOLLOW_ID_in_returnmethod633);  
                    stream_ID.add(ID53);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:38: ( COMA type ID )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:91:39: COMA type ID
                    	    {
                    	    COMA54=(Token)match(input,COMA,FOLLOW_COMA_in_returnmethod636);  
                    	    stream_COMA.add(COMA54);


                    	    pushFollow(FOLLOW_type_in_returnmethod638);
                    	    type55=type();

                    	    state._fsp--;

                    	    stream_type.add(type55.getTree());

                    	    ID56=(Token)match(input,ID,FOLLOW_ID_in_returnmethod640);  
                    	    stream_ID.add(ID56);


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            PC57=(Token)match(input,PC,FOLLOW_PC_in_returnmethod646);  
            stream_PC.add(PC57);


            CBO58=(Token)match(input,CBO,FOLLOW_CBO_in_returnmethod648);  
            stream_CBO.add(CBO58);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:92:6: ( statment )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==BOOLEAN||LA19_0==DOUBLE||(LA19_0 >= ID && LA19_0 <= INT)||LA19_0==PRINT||LA19_0==STRING||LA19_0==WHILE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:92:6: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_returnmethod667);
            	    statment59=statment();

            	    state._fsp--;

            	    stream_statment.add(statment59.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            RETURNV60=(Token)match(input,RETURNV,FOLLOW_RETURNV_in_returnmethod694);  
            stream_RETURNV.add(RETURNV60);


            pushFollow(FOLLOW_arithExpr_in_returnmethod696);
            arithExpr61=arithExpr();

            state._fsp--;

            stream_arithExpr.add(arithExpr61.getTree());

            SEMICOLON62=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnmethod698);  
            stream_SEMICOLON.add(SEMICOLON62);


            CBC63=(Token)match(input,CBC,FOLLOW_CBC_in_returnmethod703);  
            stream_CBC.add(CBC63);


            }


            // AST REWRITE
            // elements: CBO, arithExpr, SEMICOLON, CBC, ID, type, type, statment, ID, COMA, RETURNV, PO, ID, type, PC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:9: -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:11: ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ReturnMethod, "ReturnMethod")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:37: ( type ID ( COMA type ID )* )?
                if ( stream_type.hasNext()||stream_ID.hasNext()||stream_COMA.hasNext()||stream_ID.hasNext()||stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:46: ( COMA type ID )*
                    while ( stream_COMA.hasNext()||stream_ID.hasNext()||stream_type.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_COMA.nextNode()
                        );

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                    }
                    stream_COMA.reset();
                    stream_ID.reset();
                    stream_type.reset();

                }
                stream_type.reset();
                stream_ID.reset();
                stream_COMA.reset();
                stream_ID.reset();
                stream_type.reset();

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CBO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:71: ( statment )*
                while ( stream_statment.hasNext() ) {
                    adaptor.addChild(root_1, stream_statment.nextTree());

                }
                stream_statment.reset();

                adaptor.addChild(root_1, 
                stream_RETURNV.nextNode()
                );

                adaptor.addChild(root_1, stream_arithExpr.nextTree());

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CBC.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnmethod"


    public static class statment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statment"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:1: statment : ( print -> ^( Printstmt print ) | initialize -> ^( Initialize initialize ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | funcCall SEMICOLON -> ^( FuncCall funcCall SEMICOLON ) );
    public final MiniJavaParser.statment_return statment() throws RecognitionException {
        MiniJavaParser.statment_return retval = new MiniJavaParser.statment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICOLON69=null;
        MiniJavaParser.print_return print64 =null;

        MiniJavaParser.initialize_return initialize65 =null;

        MiniJavaParser.ifstmt_return ifstmt66 =null;

        MiniJavaParser.whilestmt_return whilestmt67 =null;

        MiniJavaParser.funcCall_return funcCall68 =null;


        Object SEMICOLON69_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
        RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
        RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmt");
        RewriteRuleSubtreeStream stream_initialize=new RewriteRuleSubtreeStream(adaptor,"rule initialize");
        RewriteRuleSubtreeStream stream_funcCall=new RewriteRuleSubtreeStream(adaptor,"rule funcCall");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:10: ( print -> ^( Printstmt print ) | initialize -> ^( Initialize initialize ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | funcCall SEMICOLON -> ^( FuncCall funcCall SEMICOLON ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt20=1;
                }
                break;
            case ID:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==PO) ) {
                    alt20=5;
                }
                else if ( (LA20_2==EQUAL||LA20_2==ID||(LA20_2 >= SBO && LA20_2 <= SEMICOLON)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case DOUBLE:
            case INT:
            case STRING:
                {
                alt20=2;
                }
                break;
            case IF:
                {
                alt20=3;
                }
                break;
            case WHILE:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:12: print
                    {
                    pushFollow(FOLLOW_print_in_statment767);
                    print64=print();

                    state._fsp--;

                    stream_print.add(print64.getTree());

                    // AST REWRITE
                    // elements: print
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:18: -> ^( Printstmt print )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:21: ^( Printstmt print )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Printstmt, "Printstmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_print.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:101:19: initialize
                    {
                    pushFollow(FOLLOW_initialize_in_statment795);
                    initialize65=initialize();

                    state._fsp--;

                    stream_initialize.add(initialize65.getTree());

                    // AST REWRITE
                    // elements: initialize
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:30: -> ^( Initialize initialize )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:101:33: ^( Initialize initialize )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Initialize, "Initialize")
                        , root_1);

                        adaptor.addChild(root_1, stream_initialize.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:102:18: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statment822);
                    ifstmt66=ifstmt();

                    state._fsp--;

                    stream_ifstmt.add(ifstmt66.getTree());

                    // AST REWRITE
                    // elements: ifstmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:25: -> ^( Ifstmt ifstmt )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:102:28: ^( Ifstmt ifstmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Ifstmt, "Ifstmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_ifstmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:19: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statment850);
                    whilestmt67=whilestmt();

                    state._fsp--;

                    stream_whilestmt.add(whilestmt67.getTree());

                    // AST REWRITE
                    // elements: whilestmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:29: -> ^( Whilestmt whilestmt )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:32: ^( Whilestmt whilestmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Whilestmt, "Whilestmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_whilestmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:104:19: funcCall SEMICOLON
                    {
                    pushFollow(FOLLOW_funcCall_in_statment878);
                    funcCall68=funcCall();

                    state._fsp--;

                    stream_funcCall.add(funcCall68.getTree());

                    SEMICOLON69=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statment880);  
                    stream_SEMICOLON.add(SEMICOLON69);


                    // AST REWRITE
                    // elements: funcCall, SEMICOLON
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:38: -> ^( FuncCall funcCall SEMICOLON )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:104:41: ^( FuncCall funcCall SEMICOLON )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FuncCall, "FuncCall")
                        , root_1);

                        adaptor.addChild(root_1, stream_funcCall.nextTree());

                        adaptor.addChild(root_1, 
                        stream_SEMICOLON.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statment"


    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:1: print : ( PRINT PO printThings PC SEMICOLON ) -> ^( Printstmt PRINT PO printThings PC SEMICOLON ) ;
    public final MiniJavaParser.print_return print() throws RecognitionException {
        MiniJavaParser.print_return retval = new MiniJavaParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT70=null;
        Token PO71=null;
        Token PC73=null;
        Token SEMICOLON74=null;
        MiniJavaParser.printThings_return printThings72 =null;


        Object PRINT70_tree=null;
        Object PO71_tree=null;
        Object PC73_tree=null;
        Object SEMICOLON74_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_printThings=new RewriteRuleSubtreeStream(adaptor,"rule printThings");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:8: ( ( PRINT PO printThings PC SEMICOLON ) -> ^( Printstmt PRINT PO printThings PC SEMICOLON ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:10: ( PRINT PO printThings PC SEMICOLON )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:10: ( PRINT PO printThings PC SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:11: PRINT PO printThings PC SEMICOLON
            {
            PRINT70=(Token)match(input,PRINT,FOLLOW_PRINT_in_print913);  
            stream_PRINT.add(PRINT70);


            PO71=(Token)match(input,PO,FOLLOW_PO_in_print915);  
            stream_PO.add(PO71);


            pushFollow(FOLLOW_printThings_in_print917);
            printThings72=printThings();

            state._fsp--;

            stream_printThings.add(printThings72.getTree());

            PC73=(Token)match(input,PC,FOLLOW_PC_in_print919);  
            stream_PC.add(PC73);


            SEMICOLON74=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print921);  
            stream_SEMICOLON.add(SEMICOLON74);


            }


            // AST REWRITE
            // elements: PC, PRINT, SEMICOLON, PO, printThings
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 110:46: -> ^( Printstmt PRINT PO printThings PC SEMICOLON )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:49: ^( Printstmt PRINT PO printThings PC SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Printstmt, "Printstmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_PRINT.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PO.nextNode()
                );

                adaptor.addChild(root_1, stream_printThings.nextTree());

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print"


    public static class printThings_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printThings"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:116:1: printThings : ( TEXT | arithExpr | funcCall | declobj ) ^;
    public final MiniJavaParser.printThings_return printThings() throws RecognitionException {
        MiniJavaParser.printThings_return retval = new MiniJavaParser.printThings_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT75=null;
        MiniJavaParser.arithExpr_return arithExpr76 =null;

        MiniJavaParser.funcCall_return funcCall77 =null;

        MiniJavaParser.declobj_return declobj78 =null;


        Object TEXT75_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:116:13: ( ( TEXT | arithExpr | funcCall | declobj ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:116:15: ( TEXT | arithExpr | funcCall | declobj ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:116:15: ( TEXT | arithExpr | funcCall | declobj )
            int alt21=4;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt21=1;
                }
                break;
            case ID:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==PO) ) {
                    alt21=3;
                }
                else if ( (LA21_2==DIV||LA21_2==DOT||LA21_2==MINUS||LA21_2==MULTI||(LA21_2 >= PC && LA21_2 <= PLUS)||LA21_2==SBO) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
                }
                break;
            case BOOL:
            case DNUM:
            case MINUS:
            case NOT:
            case NUM:
            case PO:
                {
                alt21=2;
                }
                break;
            case NEW:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:116:16: TEXT
                    {
                    TEXT75=(Token)match(input,TEXT,FOLLOW_TEXT_in_printThings961); 
                    TEXT75_tree = 
                    (Object)adaptor.create(TEXT75)
                    ;
                    adaptor.addChild(root_0, TEXT75_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:116:21: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_printThings963);
                    arithExpr76=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr76.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:116:31: funcCall
                    {
                    pushFollow(FOLLOW_funcCall_in_printThings965);
                    funcCall77=funcCall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcCall77.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:116:40: declobj
                    {
                    pushFollow(FOLLOW_declobj_in_printThings967);
                    declobj78=declobj();

                    state._fsp--;

                    adaptor.addChild(root_0, declobj78.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printThings"


    public static class initialize_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialize"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:1: initialize : ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) ;
    public final MiniJavaParser.initialize_return initialize() throws RecognitionException {
        MiniJavaParser.initialize_return retval = new MiniJavaParser.initialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID80=null;
        Token SBO81=null;
        Token SBC83=null;
        Token SEMICOLON85=null;
        MiniJavaParser.type_return type79 =null;

        MiniJavaParser.arithExpr_return arithExpr82 =null;

        MiniJavaParser.declaration_return declaration84 =null;


        Object ID80_tree=null;
        Object SBO81_tree=null;
        Object SBC83_tree=null;
        Object SEMICOLON85_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:12: ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:14: ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:14: ( type )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==SBO) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==SBC) ) {
                        int LA22_5 = input.LA(4);

                        if ( (LA22_5==ID) ) {
                            alt22=1;
                        }
                    }
                }
                else if ( (LA22_1==ID) ) {
                    alt22=1;
                }
            }
            else if ( (LA22_0==BOOLEAN||LA22_0==DOUBLE||LA22_0==INT||LA22_0==STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:14: type
                    {
                    pushFollow(FOLLOW_type_in_initialize979);
                    type79=type();

                    state._fsp--;

                    stream_type.add(type79.getTree());

                    }
                    break;

            }


            ID80=(Token)match(input,ID,FOLLOW_ID_in_initialize982);  
            stream_ID.add(ID80);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:23: ( SBO ( arithExpr )? SBC )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==SBO) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:24: SBO ( arithExpr )? SBC
                    {
                    SBO81=(Token)match(input,SBO,FOLLOW_SBO_in_initialize985);  
                    stream_SBO.add(SBO81);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:28: ( arithExpr )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==BOOL||LA23_0==DNUM||LA23_0==ID||LA23_0==MINUS||(LA23_0 >= NOT && LA23_0 <= NUM)||LA23_0==PO) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:29: arithExpr
                            {
                            pushFollow(FOLLOW_arithExpr_in_initialize988);
                            arithExpr82=arithExpr();

                            state._fsp--;

                            stream_arithExpr.add(arithExpr82.getTree());

                            }
                            break;

                    }


                    SBC83=(Token)match(input,SBC,FOLLOW_SBC_in_initialize992);  
                    stream_SBC.add(SBC83);


                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:47: ( declaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==EQUAL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:47: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_initialize996);
                    declaration84=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration84.getTree());

                    }
                    break;

            }


            SEMICOLON85=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize999);  
            stream_SEMICOLON.add(SEMICOLON85);


            // AST REWRITE
            // elements: declaration, ID, SEMICOLON, type, SBC, arithExpr, SBO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:70: -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:73: ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Initialize, "Initialize")
                , root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:86: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:95: ( SBO ( arithExpr )? SBC )?
                if ( stream_SBC.hasNext()||stream_arithExpr.hasNext()||stream_SBO.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SBO.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:100: ( arithExpr )?
                    if ( stream_arithExpr.hasNext() ) {
                        adaptor.addChild(root_1, stream_arithExpr.nextTree());

                    }
                    stream_arithExpr.reset();

                    adaptor.addChild(root_1, 
                    stream_SBC.nextNode()
                    );

                }
                stream_SBC.reset();
                stream_arithExpr.reset();
                stream_SBO.reset();

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:119: ( declaration )?
                if ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initialize"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:1: declaration : EQUAL declThings -> ^( Declaration EQUAL declThings ) ;
    public final MiniJavaParser.declaration_return declaration() throws RecognitionException {
        MiniJavaParser.declaration_return retval = new MiniJavaParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL86=null;
        MiniJavaParser.declThings_return declThings87 =null;


        Object EQUAL86_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_declThings=new RewriteRuleSubtreeStream(adaptor,"rule declThings");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:13: ( EQUAL declThings -> ^( Declaration EQUAL declThings ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:15: EQUAL declThings
            {
            EQUAL86=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration1048);  
            stream_EQUAL.add(EQUAL86);


            pushFollow(FOLLOW_declThings_in_declaration1050);
            declThings87=declThings();

            state._fsp--;

            stream_declThings.add(declThings87.getTree());

            // AST REWRITE
            // elements: EQUAL, declThings
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:32: -> ^( Declaration EQUAL declThings )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:35: ^( Declaration EQUAL declThings )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Declaration, "Declaration")
                , root_1);

                adaptor.addChild(root_1, 
                stream_EQUAL.nextNode()
                );

                adaptor.addChild(root_1, stream_declThings.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class declThings_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declThings"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:1: declThings : ( arithExpr | declobj | TEXT ) ^;
    public final MiniJavaParser.declThings_return declThings() throws RecognitionException {
        MiniJavaParser.declThings_return retval = new MiniJavaParser.declThings_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT90=null;
        MiniJavaParser.arithExpr_return arithExpr88 =null;

        MiniJavaParser.declobj_return declobj89 =null;


        Object TEXT90_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:12: ( ( arithExpr | declobj | TEXT ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:14: ( arithExpr | declobj | TEXT ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:14: ( arithExpr | declobj | TEXT )
            int alt26=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case DNUM:
            case ID:
            case MINUS:
            case NOT:
            case NUM:
            case PO:
                {
                alt26=1;
                }
                break;
            case NEW:
                {
                alt26=2;
                }
                break;
            case TEXT:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:15: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_declThings1082);
                    arithExpr88=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr88.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:25: declobj
                    {
                    pushFollow(FOLLOW_declobj_in_declThings1084);
                    declobj89=declobj();

                    state._fsp--;

                    adaptor.addChild(root_0, declobj89.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:33: TEXT
                    {
                    TEXT90=(Token)match(input,TEXT,FOLLOW_TEXT_in_declThings1086); 
                    TEXT90_tree = 
                    (Object)adaptor.create(TEXT90)
                    ;
                    adaptor.addChild(root_0, TEXT90_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declThings"


    public static class declobj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declobj"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:138:1: declobj : NEW type declOR -> ^( DeclObj NEW type declOR ) ;
    public final MiniJavaParser.declobj_return declobj() throws RecognitionException {
        MiniJavaParser.declobj_return retval = new MiniJavaParser.declobj_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEW91=null;
        MiniJavaParser.type_return type92 =null;

        MiniJavaParser.declOR_return declOR93 =null;


        Object NEW91_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_declOR=new RewriteRuleSubtreeStream(adaptor,"rule declOR");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:138:10: ( NEW type declOR -> ^( DeclObj NEW type declOR ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:138:12: NEW type declOR
            {
            NEW91=(Token)match(input,NEW,FOLLOW_NEW_in_declobj1110);  
            stream_NEW.add(NEW91);


            pushFollow(FOLLOW_type_in_declobj1112);
            type92=type();

            state._fsp--;

            stream_type.add(type92.getTree());

            pushFollow(FOLLOW_declOR_in_declobj1114);
            declOR93=declOR();

            state._fsp--;

            stream_declOR.add(declOR93.getTree());

            // AST REWRITE
            // elements: NEW, type, declOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:28: -> ^( DeclObj NEW type declOR )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:138:31: ^( DeclObj NEW type declOR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DeclObj, "DeclObj")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NEW.nextNode()
                );

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, stream_declOR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declobj"


    public static class declOR1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOR1"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:1: declOR1 : PO ( parameters )? PC ( dotvlaues )* ;
    public final MiniJavaParser.declOR1_return declOR1() throws RecognitionException {
        MiniJavaParser.declOR1_return retval = new MiniJavaParser.declOR1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PO94=null;
        Token PC96=null;
        MiniJavaParser.parameters_return parameters95 =null;

        MiniJavaParser.dotvlaues_return dotvlaues97 =null;


        Object PO94_tree=null;
        Object PC96_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:10: ( PO ( parameters )? PC ( dotvlaues )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:12: PO ( parameters )? PC ( dotvlaues )*
            {
            root_0 = (Object)adaptor.nil();


            PO94=(Token)match(input,PO,FOLLOW_PO_in_declOR11147); 
            PO94_tree = 
            (Object)adaptor.create(PO94)
            ;
            adaptor.addChild(root_0, PO94_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:15: ( parameters )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==BOOL||LA27_0==DNUM||LA27_0==ID||LA27_0==MINUS||(LA27_0 >= NOT && LA27_0 <= NUM)||LA27_0==PO) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:16: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_declOR11150);
                    parameters95=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters95.getTree());

                    }
                    break;

            }


            PC96=(Token)match(input,PC,FOLLOW_PC_in_declOR11154); 
            PC96_tree = 
            (Object)adaptor.create(PC96)
            ;
            adaptor.addChild(root_0, PC96_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:32: ( dotvlaues )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==DOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:32: dotvlaues
            	    {
            	    pushFollow(FOLLOW_dotvlaues_in_declOR11156);
            	    dotvlaues97=dotvlaues();

            	    state._fsp--;

            	    adaptor.addChild(root_0, dotvlaues97.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOR1"


    public static class declOR2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOR2"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:144:1: declOR2 : SBO ( arithExpr )? SBC ;
    public final MiniJavaParser.declOR2_return declOR2() throws RecognitionException {
        MiniJavaParser.declOR2_return retval = new MiniJavaParser.declOR2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SBO98=null;
        Token SBC100=null;
        MiniJavaParser.arithExpr_return arithExpr99 =null;


        Object SBO98_tree=null;
        Object SBC100_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:144:10: ( SBO ( arithExpr )? SBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:144:12: SBO ( arithExpr )? SBC
            {
            root_0 = (Object)adaptor.nil();


            SBO98=(Token)match(input,SBO,FOLLOW_SBO_in_declOR21165); 
            SBO98_tree = 
            (Object)adaptor.create(SBO98)
            ;
            adaptor.addChild(root_0, SBO98_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:144:16: ( arithExpr )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==BOOL||LA29_0==DNUM||LA29_0==ID||LA29_0==MINUS||(LA29_0 >= NOT && LA29_0 <= NUM)||LA29_0==PO) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:144:17: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_declOR21168);
                    arithExpr99=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr99.getTree());

                    }
                    break;

            }


            SBC100=(Token)match(input,SBC,FOLLOW_SBC_in_declOR21172); 
            SBC100_tree = 
            (Object)adaptor.create(SBC100)
            ;
            adaptor.addChild(root_0, SBC100_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOR2"


    public static class declOR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declOR"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:146:1: declOR : ( declOR1 -> ^( DeclOr declOR1 ) | declOR2 -> ^( DeclOr declOR2 ) );
    public final MiniJavaParser.declOR_return declOR() throws RecognitionException {
        MiniJavaParser.declOR_return retval = new MiniJavaParser.declOR_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.declOR1_return declOR1101 =null;

        MiniJavaParser.declOR2_return declOR2102 =null;


        RewriteRuleSubtreeStream stream_declOR2=new RewriteRuleSubtreeStream(adaptor,"rule declOR2");
        RewriteRuleSubtreeStream stream_declOR1=new RewriteRuleSubtreeStream(adaptor,"rule declOR1");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:146:9: ( declOR1 -> ^( DeclOr declOR1 ) | declOR2 -> ^( DeclOr declOR2 ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==PO) ) {
                alt30=1;
            }
            else if ( (LA30_0==SBO) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:146:11: declOR1
                    {
                    pushFollow(FOLLOW_declOR1_in_declOR1181);
                    declOR1101=declOR1();

                    state._fsp--;

                    stream_declOR1.add(declOR1101.getTree());

                    // AST REWRITE
                    // elements: declOR1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:19: -> ^( DeclOr declOR1 )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:146:22: ^( DeclOr declOR1 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DeclOr, "DeclOr")
                        , root_1);

                        adaptor.addChild(root_1, stream_declOR1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:5: declOR2
                    {
                    pushFollow(FOLLOW_declOR2_in_declOR1195);
                    declOR2102=declOR2();

                    state._fsp--;

                    stream_declOR2.add(declOR2102.getTree());

                    // AST REWRITE
                    // elements: declOR2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:13: -> ^( DeclOr declOR2 )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:16: ^( DeclOr declOR2 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DeclOr, "DeclOr")
                        , root_1);

                        adaptor.addChild(root_1, stream_declOR2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declOR"


    public static class dotvlaues_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotvlaues"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:1: dotvlaues : ( DOT ID ( PO ( parameters )? PC )? ) -> ^( DotValues DOT ID ( PO ( parameters )? PC )? ) ;
    public final MiniJavaParser.dotvlaues_return dotvlaues() throws RecognitionException {
        MiniJavaParser.dotvlaues_return retval = new MiniJavaParser.dotvlaues_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT103=null;
        Token ID104=null;
        Token PO105=null;
        Token PC107=null;
        MiniJavaParser.parameters_return parameters106 =null;


        Object DOT103_tree=null;
        Object ID104_tree=null;
        Object PO105_tree=null;
        Object PC107_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:12: ( ( DOT ID ( PO ( parameters )? PC )? ) -> ^( DotValues DOT ID ( PO ( parameters )? PC )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:14: ( DOT ID ( PO ( parameters )? PC )? )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:14: ( DOT ID ( PO ( parameters )? PC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:15: DOT ID ( PO ( parameters )? PC )?
            {
            DOT103=(Token)match(input,DOT,FOLLOW_DOT_in_dotvlaues1226);  
            stream_DOT.add(DOT103);


            ID104=(Token)match(input,ID,FOLLOW_ID_in_dotvlaues1228);  
            stream_ID.add(ID104);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:22: ( PO ( parameters )? PC )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==PO) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:23: PO ( parameters )? PC
                    {
                    PO105=(Token)match(input,PO,FOLLOW_PO_in_dotvlaues1231);  
                    stream_PO.add(PO105);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:26: ( parameters )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==BOOL||LA31_0==DNUM||LA31_0==ID||LA31_0==MINUS||(LA31_0 >= NOT && LA31_0 <= NUM)||LA31_0==PO) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:27: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_dotvlaues1234);
                            parameters106=parameters();

                            state._fsp--;

                            stream_parameters.add(parameters106.getTree());

                            }
                            break;

                    }


                    PC107=(Token)match(input,PC,FOLLOW_PC_in_dotvlaues1238);  
                    stream_PC.add(PC107);


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: PO, PC, DOT, ID, parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 153:46: -> ^( DotValues DOT ID ( PO ( parameters )? PC )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:49: ^( DotValues DOT ID ( PO ( parameters )? PC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DotValues, "DotValues")
                , root_1);

                adaptor.addChild(root_1, 
                stream_DOT.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:68: ( PO ( parameters )? PC )?
                if ( stream_PO.hasNext()||stream_PC.hasNext()||stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_PO.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:153:72: ( parameters )?
                    if ( stream_parameters.hasNext() ) {
                        adaptor.addChild(root_1, stream_parameters.nextTree());

                    }
                    stream_parameters.reset();

                    adaptor.addChild(root_1, 
                    stream_PC.nextNode()
                    );

                }
                stream_PO.reset();
                stream_PC.reset();
                stream_parameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dotvlaues"


    public static class ifstmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmt"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:159:1: ifstmt : IF PO condition PC block ( ELSE block )? -> ^( Ifstmt IF PO condition PC block ( ELSE block )? ) ;
    public final MiniJavaParser.ifstmt_return ifstmt() throws RecognitionException {
        MiniJavaParser.ifstmt_return retval = new MiniJavaParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF108=null;
        Token PO109=null;
        Token PC111=null;
        Token ELSE113=null;
        MiniJavaParser.condition_return condition110 =null;

        MiniJavaParser.block_return block112 =null;

        MiniJavaParser.block_return block114 =null;


        Object IF108_tree=null;
        Object PO109_tree=null;
        Object PC111_tree=null;
        Object ELSE113_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:159:9: ( IF PO condition PC block ( ELSE block )? -> ^( Ifstmt IF PO condition PC block ( ELSE block )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:159:11: IF PO condition PC block ( ELSE block )?
            {
            IF108=(Token)match(input,IF,FOLLOW_IF_in_ifstmt1285);  
            stream_IF.add(IF108);


            PO109=(Token)match(input,PO,FOLLOW_PO_in_ifstmt1287);  
            stream_PO.add(PO109);


            pushFollow(FOLLOW_condition_in_ifstmt1289);
            condition110=condition();

            state._fsp--;

            stream_condition.add(condition110.getTree());

            PC111=(Token)match(input,PC,FOLLOW_PC_in_ifstmt1291);  
            stream_PC.add(PC111);


            pushFollow(FOLLOW_block_in_ifstmt1293);
            block112=block();

            state._fsp--;

            stream_block.add(block112.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:159:35: ( ELSE block )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ELSE) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:159:37: ELSE block
                    {
                    ELSE113=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifstmt1296);  
                    stream_ELSE.add(ELSE113);


                    pushFollow(FOLLOW_block_in_ifstmt1298);
                    block114=block();

                    state._fsp--;

                    stream_block.add(block114.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: PO, block, block, condition, ELSE, IF, PC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 159:51: -> ^( Ifstmt IF PO condition PC block ( ELSE block )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:159:54: ^( Ifstmt IF PO condition PC block ( ELSE block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Ifstmt, "Ifstmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IF.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PO.nextNode()
                );

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, stream_block.nextTree());

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:159:87: ( ELSE block )?
                if ( stream_block.hasNext()||stream_ELSE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ELSE.nextNode()
                    );

                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();
                stream_ELSE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifstmt"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:166:1: condition : arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )* ;
    public final MiniJavaParser.condition_return condition() throws RecognitionException {
        MiniJavaParser.condition_return retval = new MiniJavaParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set116=null;
        MiniJavaParser.arithExpr_return arithExpr115 =null;

        MiniJavaParser.arithExpr_return arithExpr117 =null;


        Object set116_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:166:11: ( arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:166:13: arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arithExpr_in_condition1347);
            arithExpr115=arithExpr();

            state._fsp--;

            adaptor.addChild(root_0, arithExpr115.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:166:23: ( ( COMPARISONS | AndOr ) ^ arithExpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AndOr||LA34_0==COMPARISONS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:166:24: ( COMPARISONS | AndOr ) ^ arithExpr
            	    {
            	    set116=(Token)input.LT(1);

            	    set116=(Token)input.LT(1);

            	    if ( input.LA(1)==AndOr||input.LA(1)==COMPARISONS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set116)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_arithExpr_in_condition1357);
            	    arithExpr117=arithExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arithExpr117.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:1: block : ( ( CBO ( statment )* CBC ) -> ^( Block CBO ( statment )* CBC ) | ( statment ) -> ^( Block statment ) );
    public final MiniJavaParser.block_return block() throws RecognitionException {
        MiniJavaParser.block_return retval = new MiniJavaParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CBO118=null;
        Token CBC120=null;
        MiniJavaParser.statment_return statment119 =null;

        MiniJavaParser.statment_return statment121 =null;


        Object CBO118_tree=null;
        Object CBC120_tree=null;
        RewriteRuleTokenStream stream_CBO=new RewriteRuleTokenStream(adaptor,"token CBO");
        RewriteRuleTokenStream stream_CBC=new RewriteRuleTokenStream(adaptor,"token CBC");
        RewriteRuleSubtreeStream stream_statment=new RewriteRuleSubtreeStream(adaptor,"rule statment");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:8: ( ( CBO ( statment )* CBC ) -> ^( Block CBO ( statment )* CBC ) | ( statment ) -> ^( Block statment ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==CBO) ) {
                alt36=1;
            }
            else if ( (LA36_0==BOOLEAN||LA36_0==DOUBLE||(LA36_0 >= ID && LA36_0 <= INT)||LA36_0==PRINT||LA36_0==STRING||LA36_0==WHILE) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:10: ( CBO ( statment )* CBC )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:10: ( CBO ( statment )* CBC )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:11: CBO ( statment )* CBC
                    {
                    CBO118=(Token)match(input,CBO,FOLLOW_CBO_in_block1396);  
                    stream_CBO.add(CBO118);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:15: ( statment )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==BOOLEAN||LA35_0==DOUBLE||(LA35_0 >= ID && LA35_0 <= INT)||LA35_0==PRINT||LA35_0==STRING||LA35_0==WHILE) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:15: statment
                    	    {
                    	    pushFollow(FOLLOW_statment_in_block1398);
                    	    statment119=statment();

                    	    state._fsp--;

                    	    stream_statment.add(statment119.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    CBC120=(Token)match(input,CBC,FOLLOW_CBC_in_block1401);  
                    stream_CBC.add(CBC120);


                    }


                    // AST REWRITE
                    // elements: CBO, CBC, statment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:30: -> ^( Block CBO ( statment )* CBC )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:33: ^( Block CBO ( statment )* CBC )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Block, "Block")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CBO.nextNode()
                        );

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:172:45: ( statment )*
                        while ( stream_statment.hasNext() ) {
                            adaptor.addChild(root_1, stream_statment.nextTree());

                        }
                        stream_statment.reset();

                        adaptor.addChild(root_1, 
                        stream_CBC.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:173:6: ( statment )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:173:6: ( statment )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:173:7: statment
                    {
                    pushFollow(FOLLOW_statment_in_block1423);
                    statment121=statment();

                    state._fsp--;

                    stream_statment.add(statment121.getTree());

                    }


                    // AST REWRITE
                    // elements: statment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:17: -> ^( Block statment )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:173:20: ^( Block statment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Block, "Block")
                        , root_1);

                        adaptor.addChild(root_1, stream_statment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class funcCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcCall"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:179:1: funcCall : ID PO ( parameters )? PC -> ^( FuncCall ID PO ( parameters )? PC ) ;
    public final MiniJavaParser.funcCall_return funcCall() throws RecognitionException {
        MiniJavaParser.funcCall_return retval = new MiniJavaParser.funcCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID122=null;
        Token PO123=null;
        Token PC125=null;
        MiniJavaParser.parameters_return parameters124 =null;


        Object ID122_tree=null;
        Object PO123_tree=null;
        Object PC125_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:179:10: ( ID PO ( parameters )? PC -> ^( FuncCall ID PO ( parameters )? PC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:179:12: ID PO ( parameters )? PC
            {
            ID122=(Token)match(input,ID,FOLLOW_ID_in_funcCall1453);  
            stream_ID.add(ID122);


            PO123=(Token)match(input,PO,FOLLOW_PO_in_funcCall1455);  
            stream_PO.add(PO123);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:179:18: ( parameters )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==BOOL||LA37_0==DNUM||LA37_0==ID||LA37_0==MINUS||(LA37_0 >= NOT && LA37_0 <= NUM)||LA37_0==PO) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:179:20: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_funcCall1459);
                    parameters124=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters124.getTree());

                    }
                    break;

            }


            PC125=(Token)match(input,PC,FOLLOW_PC_in_funcCall1463);  
            stream_PC.add(PC125);


            // AST REWRITE
            // elements: parameters, PC, ID, PO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:36: -> ^( FuncCall ID PO ( parameters )? PC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:179:39: ^( FuncCall ID PO ( parameters )? PC )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FuncCall, "FuncCall")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:179:56: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcCall"


    public static class parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:185:1: parameters : arithExpr ( COMA arithExpr )* -> ^( Parameters arithExpr ( COMA arithExpr )* ) ;
    public final MiniJavaParser.parameters_return parameters() throws RecognitionException {
        MiniJavaParser.parameters_return retval = new MiniJavaParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMA127=null;
        MiniJavaParser.arithExpr_return arithExpr126 =null;

        MiniJavaParser.arithExpr_return arithExpr128 =null;


        Object COMA127_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:185:12: ( arithExpr ( COMA arithExpr )* -> ^( Parameters arithExpr ( COMA arithExpr )* ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:185:14: arithExpr ( COMA arithExpr )*
            {
            pushFollow(FOLLOW_arithExpr_in_parameters1502);
            arithExpr126=arithExpr();

            state._fsp--;

            stream_arithExpr.add(arithExpr126.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:185:24: ( COMA arithExpr )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:185:25: COMA arithExpr
            	    {
            	    COMA127=(Token)match(input,COMA,FOLLOW_COMA_in_parameters1505);  
            	    stream_COMA.add(COMA127);


            	    pushFollow(FOLLOW_arithExpr_in_parameters1507);
            	    arithExpr128=arithExpr();

            	    state._fsp--;

            	    stream_arithExpr.add(arithExpr128.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // AST REWRITE
            // elements: arithExpr, arithExpr, COMA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 185:42: -> ^( Parameters arithExpr ( COMA arithExpr )* )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:185:45: ^( Parameters arithExpr ( COMA arithExpr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Parameters, "Parameters")
                , root_1);

                adaptor.addChild(root_1, stream_arithExpr.nextTree());

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:185:68: ( COMA arithExpr )*
                while ( stream_arithExpr.hasNext()||stream_COMA.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_COMA.nextNode()
                    );

                    adaptor.addChild(root_1, stream_arithExpr.nextTree());

                }
                stream_arithExpr.reset();
                stream_COMA.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class whilestmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilestmt"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:191:1: whilestmt : WHILE PO condition PC block -> ^( While WHILE PO condition PC block ) ;
    public final MiniJavaParser.whilestmt_return whilestmt() throws RecognitionException {
        MiniJavaParser.whilestmt_return retval = new MiniJavaParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE129=null;
        Token PO130=null;
        Token PC132=null;
        MiniJavaParser.condition_return condition131 =null;

        MiniJavaParser.block_return block133 =null;


        Object WHILE129_tree=null;
        Object PO130_tree=null;
        Object PC132_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:191:11: ( WHILE PO condition PC block -> ^( While WHILE PO condition PC block ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:191:13: WHILE PO condition PC block
            {
            WHILE129=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilestmt1545);  
            stream_WHILE.add(WHILE129);


            PO130=(Token)match(input,PO,FOLLOW_PO_in_whilestmt1547);  
            stream_PO.add(PO130);


            pushFollow(FOLLOW_condition_in_whilestmt1549);
            condition131=condition();

            state._fsp--;

            stream_condition.add(condition131.getTree());

            PC132=(Token)match(input,PC,FOLLOW_PC_in_whilestmt1551);  
            stream_PC.add(PC132);


            pushFollow(FOLLOW_block_in_whilestmt1553);
            block133=block();

            state._fsp--;

            stream_block.add(block133.getTree());

            // AST REWRITE
            // elements: PO, condition, block, PC, WHILE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:41: -> ^( While WHILE PO condition PC block )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:191:44: ^( While WHILE PO condition PC block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(While, "While")
                , root_1);

                adaptor.addChild(root_1, 
                stream_WHILE.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_PO.nextNode()
                );

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whilestmt"


    public static class signs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signs"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:197:1: signs : ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^;
    public final MiniJavaParser.signs_return signs() throws RecognitionException {
        MiniJavaParser.signs_return retval = new MiniJavaParser.signs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set134=null;

        Object set134_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:197:8: ( ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:197:10: ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^
            {
            root_0 = (Object)adaptor.nil();


            set134=(Token)input.LT(1);

            set134=(Token)input.LT(1);

            if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULTI||input.LA(1)==PLUS||input.LA(1)==REMINDER ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set134)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signs"


    public static class arrayOrObj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayOrObj"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:199:1: arrayOrObj : ( ( dotvlaues )* -> ^( ArrayOrObj ( dotvlaues )* ) | SBO arithExpr SBC -> ^( ArrayOrObj SBO arithExpr SBC ) );
    public final MiniJavaParser.arrayOrObj_return arrayOrObj() throws RecognitionException {
        MiniJavaParser.arrayOrObj_return retval = new MiniJavaParser.arrayOrObj_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SBO136=null;
        Token SBC138=null;
        MiniJavaParser.dotvlaues_return dotvlaues135 =null;

        MiniJavaParser.arithExpr_return arithExpr137 =null;


        Object SBO136_tree=null;
        Object SBC138_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleSubtreeStream stream_dotvlaues=new RewriteRuleSubtreeStream(adaptor,"rule dotvlaues");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:199:12: ( ( dotvlaues )* -> ^( ArrayOrObj ( dotvlaues )* ) | SBO arithExpr SBC -> ^( ArrayOrObj SBO arithExpr SBC ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==AndOr||(LA40_0 >= COMA && LA40_0 <= COMPARISONS)||LA40_0==DIV||LA40_0==DOT||LA40_0==MINUS||LA40_0==MULTI||(LA40_0 >= PC && LA40_0 <= PLUS)||LA40_0==SBC||LA40_0==SEMICOLON) ) {
                alt40=1;
            }
            else if ( (LA40_0==SBO) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:199:14: ( dotvlaues )*
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:199:14: ( dotvlaues )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==DOT) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:199:14: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_arrayOrObj1610);
                    	    dotvlaues135=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues135.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: dotvlaues
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:25: -> ^( ArrayOrObj ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:199:28: ^( ArrayOrObj ( dotvlaues )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayOrObj, "ArrayOrObj")
                        , root_1);

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:199:41: ( dotvlaues )*
                        while ( stream_dotvlaues.hasNext() ) {
                            adaptor.addChild(root_1, stream_dotvlaues.nextTree());

                        }
                        stream_dotvlaues.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:200:5: SBO arithExpr SBC
                    {
                    SBO136=(Token)match(input,SBO,FOLLOW_SBO_in_arrayOrObj1626);  
                    stream_SBO.add(SBO136);


                    pushFollow(FOLLOW_arithExpr_in_arrayOrObj1628);
                    arithExpr137=arithExpr();

                    state._fsp--;

                    stream_arithExpr.add(arithExpr137.getTree());

                    SBC138=(Token)match(input,SBC,FOLLOW_SBC_in_arrayOrObj1630);  
                    stream_SBC.add(SBC138);


                    // AST REWRITE
                    // elements: arithExpr, SBO, SBC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:23: -> ^( ArrayOrObj SBO arithExpr SBC )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:200:26: ^( ArrayOrObj SBO arithExpr SBC )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayOrObj, "ArrayOrObj")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SBO.nextNode()
                        );

                        adaptor.addChild(root_1, stream_arithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_SBC.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayOrObj"


    public static class notCond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notCond"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:1: notCond : ( ( PO condition PC ( dotvlaues )* ) -> ^( NotCond PO condition PC ( dotvlaues )* ) | ID arrayOrObj -> ^( NotCond ID arrayOrObj ) );
    public final MiniJavaParser.notCond_return notCond() throws RecognitionException {
        MiniJavaParser.notCond_return retval = new MiniJavaParser.notCond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PO139=null;
        Token PC141=null;
        Token ID143=null;
        MiniJavaParser.condition_return condition140 =null;

        MiniJavaParser.dotvlaues_return dotvlaues142 =null;

        MiniJavaParser.arrayOrObj_return arrayOrObj144 =null;


        Object PO139_tree=null;
        Object PC141_tree=null;
        Object ID143_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_arrayOrObj=new RewriteRuleSubtreeStream(adaptor,"rule arrayOrObj");
        RewriteRuleSubtreeStream stream_dotvlaues=new RewriteRuleSubtreeStream(adaptor,"rule dotvlaues");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:10: ( ( PO condition PC ( dotvlaues )* ) -> ^( NotCond PO condition PC ( dotvlaues )* ) | ID arrayOrObj -> ^( NotCond ID arrayOrObj ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==PO) ) {
                alt42=1;
            }
            else if ( (LA42_0==ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:12: ( PO condition PC ( dotvlaues )* )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:12: ( PO condition PC ( dotvlaues )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:13: PO condition PC ( dotvlaues )*
                    {
                    PO139=(Token)match(input,PO,FOLLOW_PO_in_notCond1671);  
                    stream_PO.add(PO139);


                    pushFollow(FOLLOW_condition_in_notCond1673);
                    condition140=condition();

                    state._fsp--;

                    stream_condition.add(condition140.getTree());

                    PC141=(Token)match(input,PC,FOLLOW_PC_in_notCond1675);  
                    stream_PC.add(PC141);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:29: ( dotvlaues )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==DOT) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:29: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_notCond1677);
                    	    dotvlaues142=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues142.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }


                    // AST REWRITE
                    // elements: condition, PC, PO, dotvlaues
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:41: -> ^( NotCond PO condition PC ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:44: ^( NotCond PO condition PC ( dotvlaues )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NotCond, "NotCond")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_PO.nextNode()
                        );

                        adaptor.addChild(root_1, stream_condition.nextTree());

                        adaptor.addChild(root_1, 
                        stream_PC.nextNode()
                        );

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:206:70: ( dotvlaues )*
                        while ( stream_dotvlaues.hasNext() ) {
                            adaptor.addChild(root_1, stream_dotvlaues.nextTree());

                        }
                        stream_dotvlaues.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:207:5: ID arrayOrObj
                    {
                    ID143=(Token)match(input,ID,FOLLOW_ID_in_notCond1700);  
                    stream_ID.add(ID143);


                    pushFollow(FOLLOW_arrayOrObj_in_notCond1702);
                    arrayOrObj144=arrayOrObj();

                    state._fsp--;

                    stream_arrayOrObj.add(arrayOrObj144.getTree());

                    // AST REWRITE
                    // elements: arrayOrObj, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:19: -> ^( NotCond ID arrayOrObj )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:207:21: ^( NotCond ID arrayOrObj )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NotCond, "NotCond")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_arrayOrObj.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notCond"


    public static class arithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithExpr"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:1: arithExpr : term ( ( PLUS | MINUS ) ^ term )* ;
    public final MiniJavaParser.arithExpr_return arithExpr() throws RecognitionException {
        MiniJavaParser.arithExpr_return retval = new MiniJavaParser.arithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set146=null;
        MiniJavaParser.term_return term145 =null;

        MiniJavaParser.term_return term147 =null;


        Object set146_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:11: ( term ( ( PLUS | MINUS ) ^ term )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:13: term ( ( PLUS | MINUS ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arithExpr1735);
            term145=term();

            state._fsp--;

            adaptor.addChild(root_0, term145.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:18: ( ( PLUS | MINUS ) ^ term )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==MINUS||LA43_0==PLUS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:19: ( PLUS | MINUS ) ^ term
            	    {
            	    set146=(Token)input.LT(1);

            	    set146=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set146)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithExpr1748);
            	    term147=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term147.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithExpr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:1: term : factor ( ( MULTI | DIV ) ^ factor )* ;
    public final MiniJavaParser.term_return term() throws RecognitionException {
        MiniJavaParser.term_return retval = new MiniJavaParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set149=null;
        MiniJavaParser.factor_return factor148 =null;

        MiniJavaParser.factor_return factor150 =null;


        Object set149_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:7: ( factor ( ( MULTI | DIV ) ^ factor )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:9: factor ( ( MULTI | DIV ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1759);
            factor148=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor148.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:16: ( ( MULTI | DIV ) ^ factor )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==DIV||LA44_0==MULTI) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:18: ( MULTI | DIV ) ^ factor
            	    {
            	    set149=(Token)input.LT(1);

            	    set149=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==MULTI ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set149)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term1774);
            	    factor150=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor150.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:1: factor : ( ID arrayOrObj -> ^( Factor ID arrayOrObj ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DNUM ) | MINUS ID -> ^( Factor MINUS ID ) | MINUS NUM -> ^( Factor MINUS NUM ) | MINUS DNUM -> ^( Factor MINUS DNUM ) | NOT notCond -> ^( Factor NOT notCond ) | PO condition PC ( dotvlaues )* -> ^( Factor PO condition PC ( dotvlaues )* ) | BOOL -> ^( Factor BOOL ) );
    public final MiniJavaParser.factor_return factor() throws RecognitionException {
        MiniJavaParser.factor_return retval = new MiniJavaParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID151=null;
        Token NUM153=null;
        Token DNUM154=null;
        Token MINUS155=null;
        Token ID156=null;
        Token MINUS157=null;
        Token NUM158=null;
        Token MINUS159=null;
        Token DNUM160=null;
        Token NOT161=null;
        Token PO163=null;
        Token PC165=null;
        Token BOOL167=null;
        MiniJavaParser.arrayOrObj_return arrayOrObj152 =null;

        MiniJavaParser.notCond_return notCond162 =null;

        MiniJavaParser.condition_return condition164 =null;

        MiniJavaParser.dotvlaues_return dotvlaues166 =null;


        Object ID151_tree=null;
        Object NUM153_tree=null;
        Object DNUM154_tree=null;
        Object MINUS155_tree=null;
        Object ID156_tree=null;
        Object MINUS157_tree=null;
        Object NUM158_tree=null;
        Object MINUS159_tree=null;
        Object DNUM160_tree=null;
        Object NOT161_tree=null;
        Object PO163_tree=null;
        Object PC165_tree=null;
        Object BOOL167_tree=null;
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_arrayOrObj=new RewriteRuleSubtreeStream(adaptor,"rule arrayOrObj");
        RewriteRuleSubtreeStream stream_dotvlaues=new RewriteRuleSubtreeStream(adaptor,"rule dotvlaues");
        RewriteRuleSubtreeStream stream_notCond=new RewriteRuleSubtreeStream(adaptor,"rule notCond");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:9: ( ID arrayOrObj -> ^( Factor ID arrayOrObj ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DNUM ) | MINUS ID -> ^( Factor MINUS ID ) | MINUS NUM -> ^( Factor MINUS NUM ) | MINUS DNUM -> ^( Factor MINUS DNUM ) | NOT notCond -> ^( Factor NOT notCond ) | PO condition PC ( dotvlaues )* -> ^( Factor PO condition PC ( dotvlaues )* ) | BOOL -> ^( Factor BOOL ) )
            int alt46=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt46=1;
                }
                break;
            case NUM:
                {
                alt46=2;
                }
                break;
            case DNUM:
                {
                alt46=3;
                }
                break;
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt46=4;
                    }
                    break;
                case NUM:
                    {
                    alt46=5;
                    }
                    break;
                case DNUM:
                    {
                    alt46=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 4, input);

                    throw nvae;

                }

                }
                break;
            case NOT:
                {
                alt46=7;
                }
                break;
            case PO:
                {
                alt46=8;
                }
                break;
            case BOOL:
                {
                alt46=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:11: ID arrayOrObj
                    {
                    ID151=(Token)match(input,ID,FOLLOW_ID_in_factor1785);  
                    stream_ID.add(ID151);


                    pushFollow(FOLLOW_arrayOrObj_in_factor1787);
                    arrayOrObj152=arrayOrObj();

                    state._fsp--;

                    stream_arrayOrObj.add(arrayOrObj152.getTree());

                    // AST REWRITE
                    // elements: ID, arrayOrObj
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:25: -> ^( Factor ID arrayOrObj )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:28: ^( Factor ID arrayOrObj )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_arrayOrObj.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:218:5: NUM
                    {
                    NUM153=(Token)match(input,NUM,FOLLOW_NUM_in_factor1803);  
                    stream_NUM.add(NUM153);


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:9: -> ^( Factor NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:218:12: ^( Factor NUM )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NUM.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:5: DNUM
                    {
                    DNUM154=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1817);  
                    stream_DNUM.add(DNUM154);


                    // AST REWRITE
                    // elements: DNUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:10: -> ^( Factor DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:13: ^( Factor DNUM )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_DNUM.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:6: MINUS ID
                    {
                    MINUS155=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1832);  
                    stream_MINUS.add(MINUS155);


                    ID156=(Token)match(input,ID,FOLLOW_ID_in_factor1835);  
                    stream_ID.add(ID156);


                    // AST REWRITE
                    // elements: MINUS, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:16: -> ^( Factor MINUS ID )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:19: ^( Factor MINUS ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MINUS.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:6: MINUS NUM
                    {
                    MINUS157=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1853);  
                    stream_MINUS.add(MINUS157);


                    NUM158=(Token)match(input,NUM,FOLLOW_NUM_in_factor1856);  
                    stream_NUM.add(NUM158);


                    // AST REWRITE
                    // elements: NUM, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:17: -> ^( Factor MINUS NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:20: ^( Factor MINUS NUM )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MINUS.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_NUM.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:222:6: MINUS DNUM
                    {
                    MINUS159=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1874);  
                    stream_MINUS.add(MINUS159);


                    DNUM160=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1877);  
                    stream_DNUM.add(DNUM160);


                    // AST REWRITE
                    // elements: MINUS, DNUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:19: -> ^( Factor MINUS DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:222:22: ^( Factor MINUS DNUM )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MINUS.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_DNUM.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:223:6: NOT notCond
                    {
                    NOT161=(Token)match(input,NOT,FOLLOW_NOT_in_factor1896);  
                    stream_NOT.add(NOT161);


                    pushFollow(FOLLOW_notCond_in_factor1898);
                    notCond162=notCond();

                    state._fsp--;

                    stream_notCond.add(notCond162.getTree());

                    // AST REWRITE
                    // elements: notCond, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:18: -> ^( Factor NOT notCond )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:223:21: ^( Factor NOT notCond )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NOT.nextNode()
                        );

                        adaptor.addChild(root_1, stream_notCond.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:6: PO condition PC ( dotvlaues )*
                    {
                    PO163=(Token)match(input,PO,FOLLOW_PO_in_factor1916);  
                    stream_PO.add(PO163);


                    pushFollow(FOLLOW_condition_in_factor1918);
                    condition164=condition();

                    state._fsp--;

                    stream_condition.add(condition164.getTree());

                    PC165=(Token)match(input,PC,FOLLOW_PC_in_factor1920);  
                    stream_PC.add(PC165);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:22: ( dotvlaues )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==DOT) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:22: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_factor1922);
                    	    dotvlaues166=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues166.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: dotvlaues, condition, PC, PO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:33: -> ^( Factor PO condition PC ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:36: ^( Factor PO condition PC ( dotvlaues )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_PO.nextNode()
                        );

                        adaptor.addChild(root_1, stream_condition.nextTree());

                        adaptor.addChild(root_1, 
                        stream_PC.nextNode()
                        );

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:62: ( dotvlaues )*
                        while ( stream_dotvlaues.hasNext() ) {
                            adaptor.addChild(root_1, stream_dotvlaues.nextTree());

                        }
                        stream_dotvlaues.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:225:5: BOOL
                    {
                    BOOL167=(Token)match(input,BOOL,FOLLOW_BOOL_in_factor1945);  
                    stream_BOOL.add(BOOL167);


                    // AST REWRITE
                    // elements: BOOL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:10: -> ^( Factor BOOL )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:225:13: ^( Factor BOOL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_BOOL.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (NoViableAltException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }
        catch (RecognitionException e) {
            s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_classl_in_start97 = new BitSet(new long[]{0x0001800000000802L});
    public static final BitSet FOLLOW_set_in_modifier134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_classl150 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLASS_in_classl153 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_classl155 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_EXTENDV_in_classl158 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_classl160 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_classl164 = new BitSet(new long[]{0x4C01C00070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_statment_in_classl170 = new BitSet(new long[]{0x4C01C00070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_method_in_classl178 = new BitSet(new long[]{0x4C01800050040280L});
    public static final BitSet FOLLOW_mainmethod_in_classl186 = new BitSet(new long[]{0x4C01C00070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_statment_in_classl188 = new BitSet(new long[]{0x4C01C00070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_method_in_classl191 = new BitSet(new long[]{0x4C01800050040280L});
    public static final BitSet FOLLOW_CBC_in_classl199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_mainmethod271 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_STATIC_in_mainmethod273 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_VOID_in_mainmethod275 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_MAIN_in_mainmethod277 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PO_in_mainmethod279 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_STRING_in_mainmethod281 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SBO_in_mainmethod283 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_mainmethod285 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_mainmethod287 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_mainmethod289 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_mainmethod291 = new BitSet(new long[]{0x0800400070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_statment_in_mainmethod297 = new BitSet(new long[]{0x0800400070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_CBC_in_mainmethod315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_method375 = new BitSet(new long[]{0x4C00000050040080L});
    public static final BitSet FOLLOW_STATIC_in_method378 = new BitSet(new long[]{0x4800000050040080L});
    public static final BitSet FOLLOW_methodtype_in_method381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_voidmethod_in_methodtype417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnmethod_in_methodtype419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_voidmethod451 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod453 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PO_in_voidmethod455 = new BitSet(new long[]{0x0800080050040080L});
    public static final BitSet FOLLOW_type_in_voidmethod458 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod460 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_COMA_in_voidmethod463 = new BitSet(new long[]{0x0800000050040080L});
    public static final BitSet FOLLOW_type_in_voidmethod465 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod467 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_PC_in_voidmethod473 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_voidmethod475 = new BitSet(new long[]{0x0800400070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_statment_in_voidmethod489 = new BitSet(new long[]{0x0800400070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_CBC_in_voidmethod495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typev554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typev_in_type580 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_SBO_in_type583 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_type585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_returnmethod624 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod626 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PO_in_returnmethod628 = new BitSet(new long[]{0x0800080050040080L});
    public static final BitSet FOLLOW_type_in_returnmethod631 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod633 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_COMA_in_returnmethod636 = new BitSet(new long[]{0x0800000050040080L});
    public static final BitSet FOLLOW_type_in_returnmethod638 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod640 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_PC_in_returnmethod646 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_returnmethod648 = new BitSet(new long[]{0x0810400070040080L,0x0000000000000001L});
    public static final BitSet FOLLOW_statment_in_returnmethod667 = new BitSet(new long[]{0x0810400070040080L,0x0000000000000001L});
    public static final BitSet FOLLOW_RETURNV_in_returnmethod694 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_arithExpr_in_returnmethod696 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnmethod698 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CBC_in_returnmethod703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_statment767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_in_statment795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statment822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statment850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_statment878 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statment880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print913 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PO_in_print915 = new BitSet(new long[]{0x2000238410010040L});
    public static final BitSet FOLLOW_printThings_in_print917 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_print919 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_printThings961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_printThings963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_printThings965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declobj_in_printThings967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_initialize979 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_initialize982 = new BitSet(new long[]{0x0180000001000000L});
    public static final BitSet FOLLOW_SBO_in_initialize985 = new BitSet(new long[]{0x0040230410010040L});
    public static final BitSet FOLLOW_arithExpr_in_initialize988 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_initialize992 = new BitSet(new long[]{0x0100000001000000L});
    public static final BitSet FOLLOW_declaration_in_initialize996 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_declaration1048 = new BitSet(new long[]{0x2000238410010040L});
    public static final BitSet FOLLOW_declThings_in_declaration1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_declThings1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declobj_in_declThings1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_declThings1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_declobj1110 = new BitSet(new long[]{0x0800000050040080L});
    public static final BitSet FOLLOW_type_in_declobj1112 = new BitSet(new long[]{0x0080200000000000L});
    public static final BitSet FOLLOW_declOR_in_declobj1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_declOR11147 = new BitSet(new long[]{0x00002B0410010040L});
    public static final BitSet FOLLOW_parameters_in_declOR11150 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_declOR11154 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_declOR11156 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_SBO_in_declOR21165 = new BitSet(new long[]{0x0040230410010040L});
    public static final BitSet FOLLOW_arithExpr_in_declOR21168 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_declOR21172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOR1_in_declOR1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOR2_in_declOR1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotvlaues1226 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_dotvlaues1228 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_PO_in_dotvlaues1231 = new BitSet(new long[]{0x00002B0410010040L});
    public static final BitSet FOLLOW_parameters_in_dotvlaues1234 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_dotvlaues1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstmt1285 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PO_in_ifstmt1287 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_condition_in_ifstmt1289 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_ifstmt1291 = new BitSet(new long[]{0x0800400070040480L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_ifstmt1293 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ELSE_in_ifstmt1296 = new BitSet(new long[]{0x0800400070040480L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_ifstmt1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_condition1347 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_set_in_condition1350 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_arithExpr_in_condition1357 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_CBO_in_block1396 = new BitSet(new long[]{0x0800400070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_statment_in_block1398 = new BitSet(new long[]{0x0800400070040280L,0x0000000000000001L});
    public static final BitSet FOLLOW_CBC_in_block1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_block1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcCall1453 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PO_in_funcCall1455 = new BitSet(new long[]{0x00002B0410010040L});
    public static final BitSet FOLLOW_parameters_in_funcCall1459 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_funcCall1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_parameters1502 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMA_in_parameters1505 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_arithExpr_in_parameters1507 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_WHILE_in_whilestmt1545 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PO_in_whilestmt1547 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_condition_in_whilestmt1549 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_whilestmt1551 = new BitSet(new long[]{0x0800400070040480L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_whilestmt1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signs1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotvlaues_in_arrayOrObj1610 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_SBO_in_arrayOrObj1626 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_arithExpr_in_arrayOrObj1628 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_arrayOrObj1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_notCond1671 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_condition_in_notCond1673 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_notCond1675 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_notCond1677 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_notCond1700 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_arrayOrObj_in_notCond1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithExpr1735 = new BitSet(new long[]{0x0000100400000002L});
    public static final BitSet FOLLOW_set_in_arithExpr1738 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_term_in_arithExpr1748 = new BitSet(new long[]{0x0000100400000002L});
    public static final BitSet FOLLOW_factor_in_term1759 = new BitSet(new long[]{0x0000001000008002L});
    public static final BitSet FOLLOW_set_in_term1763 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_factor_in_term1774 = new BitSet(new long[]{0x0000001000008002L});
    public static final BitSet FOLLOW_ID_in_factor1785 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_arrayOrObj_in_factor1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1832 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_factor1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1853 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NUM_in_factor1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1874 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DNUM_in_factor1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1896 = new BitSet(new long[]{0x0000200010000000L});
    public static final BitSet FOLLOW_notCond_in_factor1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_factor1916 = new BitSet(new long[]{0x0000230410010040L});
    public static final BitSet FOLLOW_condition_in_factor1918 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PC_in_factor1920 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_factor1922 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_BOOL_in_factor1945 = new BitSet(new long[]{0x0000000000000002L});

}