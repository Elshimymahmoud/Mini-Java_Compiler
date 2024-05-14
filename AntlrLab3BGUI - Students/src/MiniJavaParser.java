// $ANTLR 3.4 D:\\Projects\\Mini-Java_Compiler\\MiniJava.g 2024-05-14 19:07:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "ArrayOrObj", "BOOL", "BOOLEAN", "Block", "CBC", "CBO", "CLASS", "COMA", "COMPARISONS", "Classl", "DIV", "DNUM", "DOT", "DOUBLE", "DeclObj", "DeclOr", "Declaration", "DotValues", "ELSE", "EQUAL", "EXTENDV", "Entry", "Factor", "FuncCall", "ID", "IF", "INT", "Ifstmt", "Initialize", "MAIN", "MINUS", "ML_COMMENT", "MULTI", "MainMethod", "Method", "NEW", "NOT", "NUM", "NotCond", "PC", "PLUS", "PO", "PRINT", "PRIVATEV", "PUBLICV", "Parameters", "Printstmt", "REMINDER", "RETURNV", "ReturnMethod", "SBC", "SBO", "SEMICOLON", "SL_COMMENT", "STATIC", "STRING", "Start", "TEXT", "Type", "VOID", "VoidMethod", "WHILE", "While", "Whilestmt", "WhiteSpace"
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
    public static final int Entry=26;
    public static final int Factor=27;
    public static final int FuncCall=28;
    public static final int ID=29;
    public static final int IF=30;
    public static final int INT=31;
    public static final int Ifstmt=32;
    public static final int Initialize=33;
    public static final int MAIN=34;
    public static final int MINUS=35;
    public static final int ML_COMMENT=36;
    public static final int MULTI=37;
    public static final int MainMethod=38;
    public static final int Method=39;
    public static final int NEW=40;
    public static final int NOT=41;
    public static final int NUM=42;
    public static final int NotCond=43;
    public static final int PC=44;
    public static final int PLUS=45;
    public static final int PO=46;
    public static final int PRINT=47;
    public static final int PRIVATEV=48;
    public static final int PUBLICV=49;
    public static final int Parameters=50;
    public static final int Printstmt=51;
    public static final int REMINDER=52;
    public static final int RETURNV=53;
    public static final int ReturnMethod=54;
    public static final int SBC=55;
    public static final int SBO=56;
    public static final int SEMICOLON=57;
    public static final int SL_COMMENT=58;
    public static final int STATIC=59;
    public static final int STRING=60;
    public static final int Start=61;
    public static final int TEXT=62;
    public static final int Type=63;
    public static final int VOID=64;
    public static final int VoidMethod=65;
    public static final int WHILE=66;
    public static final int While=67;
    public static final int Whilestmt=68;
    public static final int WhiteSpace=69;

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


    public static class entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "entry"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:1: entry : ( start ) -> ^( Entry start ) ;
    public final MiniJavaParser.entry_return entry() throws RecognitionException {
        MiniJavaParser.entry_return retval = new MiniJavaParser.entry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.start_return start1 =null;


        RewriteRuleSubtreeStream stream_start=new RewriteRuleSubtreeStream(adaptor,"rule start");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:7: ( ( start ) -> ^( Entry start ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:9: ( start )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:9: ( start )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:10: start
            {
            pushFollow(FOLLOW_start_in_entry102);
            start1=start();

            state._fsp--;

            stream_start.add(start1.getTree());

            }


            // AST REWRITE
            // elements: start
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 36:17: -> ^( Entry start )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:20: ^( Entry start )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Entry, "Entry")
                , root_1);

                adaptor.addChild(root_1, stream_start.nextTree());

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
    // $ANTLR end "entry"


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:1: start : ( ( classl )+ ) -> ^( Start ( classl )+ ) ;
    public final MiniJavaParser.start_return start() throws RecognitionException {
        MiniJavaParser.start_return retval = new MiniJavaParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.classl_return classl2 =null;


        RewriteRuleSubtreeStream stream_classl=new RewriteRuleSubtreeStream(adaptor,"rule classl");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:8: ( ( ( classl )+ ) -> ^( Start ( classl )+ ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:10: ( ( classl )+ )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:10: ( ( classl )+ )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:11: ( classl )+
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:11: ( classl )+
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
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:11: classl
            	    {
            	    pushFollow(FOLLOW_classl_in_start138);
            	    classl2=classl();

            	    state._fsp--;

            	    stream_classl.add(classl2.getTree());

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
            // 43:20: -> ^( Start ( classl )+ )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:23: ^( Start ( classl )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                if ( !(stream_classl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_classl.hasNext() ) {
                    adaptor.addChild(root_1, stream_classl.nextTree());

                }
                stream_classl.reset();

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
    // $ANTLR end "start"


    public static class modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modifier"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:1: modifier : ( PUBLICV | PRIVATEV ) ^;
    public final MiniJavaParser.modifier_return modifier() throws RecognitionException {
        MiniJavaParser.modifier_return retval = new MiniJavaParser.modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set3=null;

        Object set3_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:10: ( ( PUBLICV | PRIVATEV ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:12: ( PUBLICV | PRIVATEV ) ^
            {
            root_0 = (Object)adaptor.nil();


            set3=(Token)input.LT(1);

            set3=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATEV && input.LA(1) <= PUBLICV) ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set3)
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


    public static class stt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stt"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:1: stt : ( statment | method )* ;
    public final MiniJavaParser.stt_return stt() throws RecognitionException {
        MiniJavaParser.stt_return retval = new MiniJavaParser.stt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.statment_return statment4 =null;

        MiniJavaParser.method_return method5 =null;



        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:5: ( ( statment | method )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:7: ( statment | method )*
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:7: ( statment | method )*
            loop2:
            do {
                int alt2=3;
                switch ( input.LA(1) ) {
                case PRIVATEV:
                case PUBLICV:
                    {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==STATIC) ) {
                        int LA2_7 = input.LA(3);

                        if ( (LA2_7==VOID) ) {
                            int LA2_11 = input.LA(4);

                            if ( (LA2_11==ID) ) {
                                alt2=2;
                            }


                        }
                        else if ( (LA2_7==BOOLEAN||LA2_7==DOUBLE||LA2_7==ID||LA2_7==INT||LA2_7==STRING) ) {
                            alt2=2;
                        }


                    }
                    else if ( (LA2_1==BOOLEAN||LA2_1==DOUBLE||LA2_1==ID||LA2_1==INT||LA2_1==STRING||LA2_1==VOID) ) {
                        alt2=2;
                    }


                    }
                    break;
                case IF:
                case PRINT:
                case WHILE:
                    {
                    alt2=1;
                    }
                    break;
                case ID:
                    {
                    switch ( input.LA(2) ) {
                    case EQUAL:
                    case PO:
                    case SEMICOLON:
                        {
                        alt2=1;
                        }
                        break;
                    case SBO:
                        {
                        int LA2_8 = input.LA(3);

                        if ( (LA2_8==SBC) ) {
                            int LA2_12 = input.LA(4);

                            if ( (LA2_12==ID) ) {
                                int LA2_9 = input.LA(5);

                                if ( (LA2_9==PO) ) {
                                    alt2=2;
                                }
                                else if ( (LA2_9==EQUAL||(LA2_9 >= SBO && LA2_9 <= SEMICOLON)) ) {
                                    alt2=1;
                                }


                            }
                            else if ( (LA2_12==EQUAL||LA2_12==SEMICOLON) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_8==BOOL||LA2_8==DNUM||LA2_8==ID||LA2_8==MINUS||(LA2_8 >= NOT && LA2_8 <= NUM)||LA2_8==PO) ) {
                            alt2=1;
                        }


                        }
                        break;
                    case ID:
                        {
                        int LA2_9 = input.LA(3);

                        if ( (LA2_9==PO) ) {
                            alt2=2;
                        }
                        else if ( (LA2_9==EQUAL||(LA2_9 >= SBO && LA2_9 <= SEMICOLON)) ) {
                            alt2=1;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case BOOLEAN:
                case DOUBLE:
                case INT:
                case STRING:
                    {
                    int LA2_5 = input.LA(2);

                    if ( (LA2_5==SBO) ) {
                        int LA2_10 = input.LA(3);

                        if ( (LA2_10==SBC) ) {
                            int LA2_13 = input.LA(4);

                            if ( (LA2_13==ID) ) {
                                int LA2_9 = input.LA(5);

                                if ( (LA2_9==PO) ) {
                                    alt2=2;
                                }
                                else if ( (LA2_9==EQUAL||(LA2_9 >= SBO && LA2_9 <= SEMICOLON)) ) {
                                    alt2=1;
                                }


                            }


                        }


                    }
                    else if ( (LA2_5==ID) ) {
                        int LA2_9 = input.LA(3);

                        if ( (LA2_9==PO) ) {
                            alt2=2;
                        }
                        else if ( (LA2_9==EQUAL||(LA2_9 >= SBO && LA2_9 <= SEMICOLON)) ) {
                            alt2=1;
                        }


                    }


                    }
                    break;
                case STATIC:
                case VOID:
                    {
                    alt2=2;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:8: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_stt185);
            	    statment4=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment4.getTree());

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:17: method
            	    {
            	    pushFollow(FOLLOW_method_in_stt187);
            	    method5=method();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "stt"


    public static class classl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classl"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:1: classl : ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC ) -> ^( Classl ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC ) ;
    public final MiniJavaParser.classl_return classl() throws RecognitionException {
        MiniJavaParser.classl_return retval = new MiniJavaParser.classl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS7=null;
        Token ID8=null;
        Token EXTENDV9=null;
        Token ID10=null;
        Token CBO11=null;
        Token CBC15=null;
        MiniJavaParser.modifier_return modifier6 =null;

        MiniJavaParser.stt_return stt12 =null;

        MiniJavaParser.mainmethod_return mainmethod13 =null;

        MiniJavaParser.stt_return stt14 =null;


        Object CLASS7_tree=null;
        Object ID8_tree=null;
        Object EXTENDV9_tree=null;
        Object ID10_tree=null;
        Object CBO11_tree=null;
        Object CBC15_tree=null;
        RewriteRuleTokenStream stream_CBO=new RewriteRuleTokenStream(adaptor,"token CBO");
        RewriteRuleTokenStream stream_EXTENDV=new RewriteRuleTokenStream(adaptor,"token EXTENDV");
        RewriteRuleTokenStream stream_CBC=new RewriteRuleTokenStream(adaptor,"token CBC");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_stt=new RewriteRuleSubtreeStream(adaptor,"rule stt");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_mainmethod=new RewriteRuleSubtreeStream(adaptor,"rule mainmethod");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:9: ( ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC ) -> ^( Classl ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:11: ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:11: ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:12: ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:12: ( modifier )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= PRIVATEV && LA3_0 <= PUBLICV)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:12: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_classl199);
                    modifier6=modifier();

                    state._fsp--;

                    stream_modifier.add(modifier6.getTree());

                    }
                    break;

            }


            CLASS7=(Token)match(input,CLASS,FOLLOW_CLASS_in_classl202);  
            stream_CLASS.add(CLASS7);


            ID8=(Token)match(input,ID,FOLLOW_ID_in_classl204);  
            stream_ID.add(ID8);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:31: ( EXTENDV ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENDV) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:32: EXTENDV ID
                    {
                    EXTENDV9=(Token)match(input,EXTENDV,FOLLOW_EXTENDV_in_classl207);  
                    stream_EXTENDV.add(EXTENDV9);


                    ID10=(Token)match(input,ID,FOLLOW_ID_in_classl209);  
                    stream_ID.add(ID10);


                    }
                    break;

            }


            CBO11=(Token)match(input,CBO,FOLLOW_CBO_in_classl213);  
            stream_CBO.add(CBO11);


            pushFollow(FOLLOW_stt_in_classl218);
            stt12=stt();

            state._fsp--;

            stream_stt.add(stt12.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:4: ( mainmethod stt )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= PRIVATEV && LA5_0 <= PUBLICV)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:5: mainmethod stt
                    {
                    pushFollow(FOLLOW_mainmethod_in_classl224);
                    mainmethod13=mainmethod();

                    state._fsp--;

                    stream_mainmethod.add(mainmethod13.getTree());

                    pushFollow(FOLLOW_stt_in_classl226);
                    stt14=stt();

                    state._fsp--;

                    stream_stt.add(stt14.getTree());

                    }
                    break;

            }


            CBC15=(Token)match(input,CBC,FOLLOW_CBC_in_classl234);  
            stream_CBC.add(CBC15);


            }


            // AST REWRITE
            // elements: ID, stt, CLASS, CBO, EXTENDV, ID, modifier, CBC, mainmethod, stt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:9: -> ^( Classl ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:12: ^( Classl ( modifier )? CLASS ID ( EXTENDV ID )? CBO stt ( mainmethod stt )? CBC )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Classl, "Classl")
                , root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:21: ( modifier )?
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:40: ( EXTENDV ID )?
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

                adaptor.addChild(root_1, stream_stt.nextTree());

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:62: ( mainmethod stt )?
                if ( stream_mainmethod.hasNext()||stream_stt.hasNext() ) {
                    adaptor.addChild(root_1, stream_mainmethod.nextTree());

                    adaptor.addChild(root_1, stream_stt.nextTree());

                }
                stream_mainmethod.reset();
                stream_stt.reset();

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:1: mainmethod : ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) -> ^( MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) ;
    public final MiniJavaParser.mainmethod_return mainmethod() throws RecognitionException {
        MiniJavaParser.mainmethod_return retval = new MiniJavaParser.mainmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC17=null;
        Token VOID18=null;
        Token MAIN19=null;
        Token PO20=null;
        Token STRING21=null;
        Token SBO22=null;
        Token SBC23=null;
        Token ID24=null;
        Token PC25=null;
        Token CBO26=null;
        Token CBC28=null;
        MiniJavaParser.modifier_return modifier16 =null;

        MiniJavaParser.statment_return statment27 =null;


        Object STATIC17_tree=null;
        Object VOID18_tree=null;
        Object MAIN19_tree=null;
        Object PO20_tree=null;
        Object STRING21_tree=null;
        Object SBO22_tree=null;
        Object SBC23_tree=null;
        Object ID24_tree=null;
        Object PC25_tree=null;
        Object CBO26_tree=null;
        Object CBC28_tree=null;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:17: ( ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) -> ^( MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:19: ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:19: ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:20: modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC
            {
            pushFollow(FOLLOW_modifier_in_mainmethod300);
            modifier16=modifier();

            state._fsp--;

            stream_modifier.add(modifier16.getTree());

            STATIC17=(Token)match(input,STATIC,FOLLOW_STATIC_in_mainmethod302);  
            stream_STATIC.add(STATIC17);


            VOID18=(Token)match(input,VOID,FOLLOW_VOID_in_mainmethod304);  
            stream_VOID.add(VOID18);


            MAIN19=(Token)match(input,MAIN,FOLLOW_MAIN_in_mainmethod306);  
            stream_MAIN.add(MAIN19);


            PO20=(Token)match(input,PO,FOLLOW_PO_in_mainmethod308);  
            stream_PO.add(PO20);


            STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_mainmethod310);  
            stream_STRING.add(STRING21);


            SBO22=(Token)match(input,SBO,FOLLOW_SBO_in_mainmethod312);  
            stream_SBO.add(SBO22);


            SBC23=(Token)match(input,SBC,FOLLOW_SBC_in_mainmethod314);  
            stream_SBC.add(SBC23);


            ID24=(Token)match(input,ID,FOLLOW_ID_in_mainmethod316);  
            stream_ID.add(ID24);


            PC25=(Token)match(input,PC,FOLLOW_PC_in_mainmethod318);  
            stream_PC.add(PC25);


            CBO26=(Token)match(input,CBO,FOLLOW_CBO_in_mainmethod320);  
            stream_CBO.add(CBO26);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:5: ( statment )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||LA6_0==DOUBLE||(LA6_0 >= ID && LA6_0 <= INT)||LA6_0==PRINT||LA6_0==STRING||LA6_0==WHILE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:5: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_mainmethod326);
            	    statment27=statment();

            	    state._fsp--;

            	    stream_statment.add(statment27.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            CBC28=(Token)match(input,CBC,FOLLOW_CBC_in_mainmethod344);  
            stream_CBC.add(CBC28);


            }


            // AST REWRITE
            // elements: SBO, STRING, CBC, PC, CBO, ID, SBC, modifier, STATIC, VOID, MAIN, PO, statment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:15: -> ^( MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:64:18: ^( MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:64:85: ( statment )*
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
    // $ANTLR end "mainmethod"


    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:1: method : ( ( modifier )? ( STATIC )? methodtype ) -> ^( Method ( modifier )? ( STATIC )? methodtype ) ;
    public final MiniJavaParser.method_return method() throws RecognitionException {
        MiniJavaParser.method_return retval = new MiniJavaParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC30=null;
        MiniJavaParser.modifier_return modifier29 =null;

        MiniJavaParser.methodtype_return methodtype31 =null;


        Object STATIC30_tree=null;
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_methodtype=new RewriteRuleSubtreeStream(adaptor,"rule methodtype");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:9: ( ( ( modifier )? ( STATIC )? methodtype ) -> ^( Method ( modifier )? ( STATIC )? methodtype ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:17: ( ( modifier )? ( STATIC )? methodtype )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:17: ( ( modifier )? ( STATIC )? methodtype )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:18: ( modifier )? ( STATIC )? methodtype
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:18: ( modifier )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= PRIVATEV && LA7_0 <= PUBLICV)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:18: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_method406);
                    modifier29=modifier();

                    state._fsp--;

                    stream_modifier.add(modifier29.getTree());

                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:28: ( STATIC )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==STATIC) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:28: STATIC
                    {
                    STATIC30=(Token)match(input,STATIC,FOLLOW_STATIC_in_method409);  
                    stream_STATIC.add(STATIC30);


                    }
                    break;

            }


            pushFollow(FOLLOW_methodtype_in_method412);
            methodtype31=methodtype();

            state._fsp--;

            stream_methodtype.add(methodtype31.getTree());

            }


            // AST REWRITE
            // elements: modifier, STATIC, methodtype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:48: -> ^( Method ( modifier )? ( STATIC )? methodtype )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:51: ^( Method ( modifier )? ( STATIC )? methodtype )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Method, "Method")
                , root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:60: ( modifier )?
                if ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:70: ( STATIC )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:1: methodtype : ( voidmethod | returnmethod ) ^;
    public final MiniJavaParser.methodtype_return methodtype() throws RecognitionException {
        MiniJavaParser.methodtype_return retval = new MiniJavaParser.methodtype_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.voidmethod_return voidmethod32 =null;

        MiniJavaParser.returnmethod_return returnmethod33 =null;



        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:12: ( ( voidmethod | returnmethod ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:14: ( voidmethod | returnmethod ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:14: ( voidmethod | returnmethod )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VOID) ) {
                alt9=1;
            }
            else if ( (LA9_0==BOOLEAN||LA9_0==DOUBLE||LA9_0==ID||LA9_0==INT||LA9_0==STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:15: voidmethod
                    {
                    pushFollow(FOLLOW_voidmethod_in_methodtype448);
                    voidmethod32=voidmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, voidmethod32.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:26: returnmethod
                    {
                    pushFollow(FOLLOW_returnmethod_in_methodtype450);
                    returnmethod33=returnmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, returnmethod33.getTree());

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
    // $ANTLR end "methodtype"


    public static class voidmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "voidmethod"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:1: voidmethod : ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) ;
    public final MiniJavaParser.voidmethod_return voidmethod() throws RecognitionException {
        MiniJavaParser.voidmethod_return retval = new MiniJavaParser.voidmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID34=null;
        Token ID35=null;
        Token PO36=null;
        Token ID38=null;
        Token COMA39=null;
        Token ID41=null;
        Token PC42=null;
        Token CBO43=null;
        Token CBC45=null;
        MiniJavaParser.type_return type37 =null;

        MiniJavaParser.type_return type40 =null;

        MiniJavaParser.statment_return statment44 =null;


        Object VOID34_tree=null;
        Object ID35_tree=null;
        Object PO36_tree=null;
        Object ID38_tree=null;
        Object COMA39_tree=null;
        Object ID41_tree=null;
        Object PC42_tree=null;
        Object CBO43_tree=null;
        Object CBC45_tree=null;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:17: ( ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:22: ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:22: ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:23: VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC
            {
            VOID34=(Token)match(input,VOID,FOLLOW_VOID_in_voidmethod469);  
            stream_VOID.add(VOID34);


            ID35=(Token)match(input,ID,FOLLOW_ID_in_voidmethod471);  
            stream_ID.add(ID35);


            PO36=(Token)match(input,PO,FOLLOW_PO_in_voidmethod473);  
            stream_PO.add(PO36);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:34: ( type ID ( COMA type ID )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BOOLEAN||LA11_0==DOUBLE||LA11_0==ID||LA11_0==INT||LA11_0==STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:35: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_voidmethod476);
                    type37=type();

                    state._fsp--;

                    stream_type.add(type37.getTree());

                    ID38=(Token)match(input,ID,FOLLOW_ID_in_voidmethod478);  
                    stream_ID.add(ID38);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:43: ( COMA type ID )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:44: COMA type ID
                    	    {
                    	    COMA39=(Token)match(input,COMA,FOLLOW_COMA_in_voidmethod481);  
                    	    stream_COMA.add(COMA39);


                    	    pushFollow(FOLLOW_type_in_voidmethod483);
                    	    type40=type();

                    	    state._fsp--;

                    	    stream_type.add(type40.getTree());

                    	    ID41=(Token)match(input,ID,FOLLOW_ID_in_voidmethod485);  
                    	    stream_ID.add(ID41);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            PC42=(Token)match(input,PC,FOLLOW_PC_in_voidmethod491);  
            stream_PC.add(PC42);


            CBO43=(Token)match(input,CBO,FOLLOW_CBO_in_voidmethod493);  
            stream_CBO.add(CBO43);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:78:12: ( statment )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==BOOLEAN||LA12_0==DOUBLE||(LA12_0 >= ID && LA12_0 <= INT)||LA12_0==PRINT||LA12_0==STRING||LA12_0==WHILE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:78:12: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_voidmethod507);
            	    statment44=statment();

            	    state._fsp--;

            	    stream_statment.add(statment44.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            CBC45=(Token)match(input,CBC,FOLLOW_CBC_in_voidmethod513);  
            stream_CBC.add(CBC45);


            }


            // AST REWRITE
            // elements: ID, type, PC, VOID, type, ID, PO, CBO, statment, CBC, ID, COMA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:9: -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:11: ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:35: ( type ID ( COMA type ID )* )?
                if ( stream_ID.hasNext()||stream_type.hasNext()||stream_type.hasNext()||stream_ID.hasNext()||stream_COMA.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:44: ( COMA type ID )*
                    while ( stream_type.hasNext()||stream_ID.hasNext()||stream_COMA.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_COMA.nextNode()
                        );

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                    }
                    stream_type.reset();
                    stream_ID.reset();
                    stream_COMA.reset();

                }
                stream_ID.reset();
                stream_type.reset();
                stream_type.reset();
                stream_ID.reset();
                stream_COMA.reset();

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CBO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:69: ( statment )*
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:1: typev : ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^;
    public final MiniJavaParser.typev_return typev() throws RecognitionException {
        MiniJavaParser.typev_return retval = new MiniJavaParser.typev_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set46=null;

        Object set46_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:8: ( ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:10: ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^
            {
            root_0 = (Object)adaptor.nil();


            set46=(Token)input.LT(1);

            set46=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==ID||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set46)
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:1: type : ( typev ( SBO SBC )? ) -> ^( Type typev ( SBO SBC )? ) ;
    public final MiniJavaParser.type_return type() throws RecognitionException {
        MiniJavaParser.type_return retval = new MiniJavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SBO48=null;
        Token SBC49=null;
        MiniJavaParser.typev_return typev47 =null;


        Object SBO48_tree=null;
        Object SBC49_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleSubtreeStream stream_typev=new RewriteRuleSubtreeStream(adaptor,"rule typev");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:11: ( ( typev ( SBO SBC )? ) -> ^( Type typev ( SBO SBC )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:13: ( typev ( SBO SBC )? )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:13: ( typev ( SBO SBC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:14: typev ( SBO SBC )?
            {
            pushFollow(FOLLOW_typev_in_type597);
            typev47=typev();

            state._fsp--;

            stream_typev.add(typev47.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:20: ( SBO SBC )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==SBO) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==SBC) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==ID||LA13_3==PO||LA13_3==SBO) ) {
                        alt13=1;
                    }
                }
            }
            switch (alt13) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:21: SBO SBC
                    {
                    SBO48=(Token)match(input,SBO,FOLLOW_SBO_in_type600);  
                    stream_SBO.add(SBO48);


                    SBC49=(Token)match(input,SBC,FOLLOW_SBC_in_type602);  
                    stream_SBC.add(SBC49);


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: typev, SBC, SBO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:32: -> ^( Type typev ( SBO SBC )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:35: ^( Type typev ( SBO SBC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Type, "Type")
                , root_1);

                adaptor.addChild(root_1, stream_typev.nextTree());

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:87:48: ( SBO SBC )?
                if ( stream_SBC.hasNext()||stream_SBO.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SBO.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_SBC.nextNode()
                    );

                }
                stream_SBC.reset();
                stream_SBO.reset();

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:1: returnmethod : ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) ;
    public final MiniJavaParser.returnmethod_return returnmethod() throws RecognitionException {
        MiniJavaParser.returnmethod_return retval = new MiniJavaParser.returnmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID51=null;
        Token PO52=null;
        Token ID54=null;
        Token COMA55=null;
        Token ID57=null;
        Token PC58=null;
        Token CBO59=null;
        Token RETURNV61=null;
        Token SEMICOLON63=null;
        Token CBC64=null;
        MiniJavaParser.type_return type50 =null;

        MiniJavaParser.type_return type53 =null;

        MiniJavaParser.type_return type56 =null;

        MiniJavaParser.statment_return statment60 =null;

        MiniJavaParser.arithExpr_return arithExpr62 =null;


        Object ID51_tree=null;
        Object PO52_tree=null;
        Object ID54_tree=null;
        Object COMA55_tree=null;
        Object ID57_tree=null;
        Object PC58_tree=null;
        Object CBO59_tree=null;
        Object RETURNV61_tree=null;
        Object SEMICOLON63_tree=null;
        Object CBC64_tree=null;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:15: ( ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:17: ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:17: ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:18: type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC
            {
            pushFollow(FOLLOW_type_in_returnmethod643);
            type50=type();

            state._fsp--;

            stream_type.add(type50.getTree());

            ID51=(Token)match(input,ID,FOLLOW_ID_in_returnmethod645);  
            stream_ID.add(ID51);


            PO52=(Token)match(input,PO,FOLLOW_PO_in_returnmethod647);  
            stream_PO.add(PO52);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:29: ( type ID ( COMA type ID )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==BOOLEAN||LA15_0==DOUBLE||LA15_0==ID||LA15_0==INT||LA15_0==STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:30: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_returnmethod650);
                    type53=type();

                    state._fsp--;

                    stream_type.add(type53.getTree());

                    ID54=(Token)match(input,ID,FOLLOW_ID_in_returnmethod652);  
                    stream_ID.add(ID54);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:38: ( COMA type ID )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:93:39: COMA type ID
                    	    {
                    	    COMA55=(Token)match(input,COMA,FOLLOW_COMA_in_returnmethod655);  
                    	    stream_COMA.add(COMA55);


                    	    pushFollow(FOLLOW_type_in_returnmethod657);
                    	    type56=type();

                    	    state._fsp--;

                    	    stream_type.add(type56.getTree());

                    	    ID57=(Token)match(input,ID,FOLLOW_ID_in_returnmethod659);  
                    	    stream_ID.add(ID57);


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            PC58=(Token)match(input,PC,FOLLOW_PC_in_returnmethod665);  
            stream_PC.add(PC58);


            CBO59=(Token)match(input,CBO,FOLLOW_CBO_in_returnmethod667);  
            stream_CBO.add(CBO59);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:6: ( statment )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==BOOLEAN||LA16_0==DOUBLE||(LA16_0 >= ID && LA16_0 <= INT)||LA16_0==PRINT||LA16_0==STRING||LA16_0==WHILE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:6: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_returnmethod686);
            	    statment60=statment();

            	    state._fsp--;

            	    stream_statment.add(statment60.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            RETURNV61=(Token)match(input,RETURNV,FOLLOW_RETURNV_in_returnmethod713);  
            stream_RETURNV.add(RETURNV61);


            pushFollow(FOLLOW_arithExpr_in_returnmethod715);
            arithExpr62=arithExpr();

            state._fsp--;

            stream_arithExpr.add(arithExpr62.getTree());

            SEMICOLON63=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnmethod717);  
            stream_SEMICOLON.add(SEMICOLON63);


            CBC64=(Token)match(input,CBC,FOLLOW_CBC_in_returnmethod722);  
            stream_CBC.add(CBC64);


            }


            // AST REWRITE
            // elements: SEMICOLON, type, COMA, RETURNV, type, type, CBO, ID, ID, CBC, PO, arithExpr, PC, statment, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 96:9: -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:96:11: ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:96:37: ( type ID ( COMA type ID )* )?
                if ( stream_ID.hasNext()||stream_COMA.hasNext()||stream_type.hasNext()||stream_type.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:96:46: ( COMA type ID )*
                    while ( stream_ID.hasNext()||stream_COMA.hasNext()||stream_type.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_COMA.nextNode()
                        );

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                    }
                    stream_ID.reset();
                    stream_COMA.reset();
                    stream_type.reset();

                }
                stream_ID.reset();
                stream_COMA.reset();
                stream_type.reset();
                stream_type.reset();
                stream_ID.reset();

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CBO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:96:71: ( statment )*
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:102:1: statment : ( ( print ) -> ^( Printstmt print ) | ( initialize ) -> ^( Initialize initialize ) | ( ifstmt ) -> ^( Ifstmt ifstmt ) | ( whilestmt ) -> ^( Whilestmt whilestmt ) | ( funcCall SEMICOLON ) -> ^( FuncCall funcCall SEMICOLON ) );
    public final MiniJavaParser.statment_return statment() throws RecognitionException {
        MiniJavaParser.statment_return retval = new MiniJavaParser.statment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICOLON70=null;
        MiniJavaParser.print_return print65 =null;

        MiniJavaParser.initialize_return initialize66 =null;

        MiniJavaParser.ifstmt_return ifstmt67 =null;

        MiniJavaParser.whilestmt_return whilestmt68 =null;

        MiniJavaParser.funcCall_return funcCall69 =null;


        Object SEMICOLON70_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
        RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
        RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmt");
        RewriteRuleSubtreeStream stream_initialize=new RewriteRuleSubtreeStream(adaptor,"rule initialize");
        RewriteRuleSubtreeStream stream_funcCall=new RewriteRuleSubtreeStream(adaptor,"rule funcCall");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:102:10: ( ( print ) -> ^( Printstmt print ) | ( initialize ) -> ^( Initialize initialize ) | ( ifstmt ) -> ^( Ifstmt ifstmt ) | ( whilestmt ) -> ^( Whilestmt whilestmt ) | ( funcCall SEMICOLON ) -> ^( FuncCall funcCall SEMICOLON ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt17=1;
                }
                break;
            case ID:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==PO) ) {
                    alt17=5;
                }
                else if ( (LA17_2==EQUAL||LA17_2==ID||(LA17_2 >= SBO && LA17_2 <= SEMICOLON)) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case DOUBLE:
            case INT:
            case STRING:
                {
                alt17=2;
                }
                break;
            case IF:
                {
                alt17=3;
                }
                break;
            case WHILE:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:102:12: ( print )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:102:12: ( print )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:102:13: print
                    {
                    pushFollow(FOLLOW_print_in_statment787);
                    print65=print();

                    state._fsp--;

                    stream_print.add(print65.getTree());

                    }


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
                    // 102:20: -> ^( Printstmt print )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:102:23: ^( Printstmt print )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:19: ( initialize )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:19: ( initialize )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:20: initialize
                    {
                    pushFollow(FOLLOW_initialize_in_statment817);
                    initialize66=initialize();

                    state._fsp--;

                    stream_initialize.add(initialize66.getTree());

                    }


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
                    // 103:32: -> ^( Initialize initialize )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:35: ^( Initialize initialize )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:104:18: ( ifstmt )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:104:18: ( ifstmt )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:104:19: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statment846);
                    ifstmt67=ifstmt();

                    state._fsp--;

                    stream_ifstmt.add(ifstmt67.getTree());

                    }


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
                    // 104:27: -> ^( Ifstmt ifstmt )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:104:30: ^( Ifstmt ifstmt )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:105:19: ( whilestmt )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:105:19: ( whilestmt )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:105:20: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statment876);
                    whilestmt68=whilestmt();

                    state._fsp--;

                    stream_whilestmt.add(whilestmt68.getTree());

                    }


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
                    // 105:31: -> ^( Whilestmt whilestmt )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:105:34: ^( Whilestmt whilestmt )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:106:19: ( funcCall SEMICOLON )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:106:19: ( funcCall SEMICOLON )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:106:20: funcCall SEMICOLON
                    {
                    pushFollow(FOLLOW_funcCall_in_statment906);
                    funcCall69=funcCall();

                    state._fsp--;

                    stream_funcCall.add(funcCall69.getTree());

                    SEMICOLON70=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statment908);  
                    stream_SEMICOLON.add(SEMICOLON70);


                    }


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
                    // 106:40: -> ^( FuncCall funcCall SEMICOLON )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:106:43: ^( FuncCall funcCall SEMICOLON )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:1: print : ( PRINT PO printThings PC SEMICOLON ) -> ^( Printstmt PRINT PO printThings PC SEMICOLON ) ;
    public final MiniJavaParser.print_return print() throws RecognitionException {
        MiniJavaParser.print_return retval = new MiniJavaParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT71=null;
        Token PO72=null;
        Token PC74=null;
        Token SEMICOLON75=null;
        MiniJavaParser.printThings_return printThings73 =null;


        Object PRINT71_tree=null;
        Object PO72_tree=null;
        Object PC74_tree=null;
        Object SEMICOLON75_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_printThings=new RewriteRuleSubtreeStream(adaptor,"rule printThings");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:8: ( ( PRINT PO printThings PC SEMICOLON ) -> ^( Printstmt PRINT PO printThings PC SEMICOLON ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:10: ( PRINT PO printThings PC SEMICOLON )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:10: ( PRINT PO printThings PC SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:11: PRINT PO printThings PC SEMICOLON
            {
            PRINT71=(Token)match(input,PRINT,FOLLOW_PRINT_in_print942);  
            stream_PRINT.add(PRINT71);


            PO72=(Token)match(input,PO,FOLLOW_PO_in_print944);  
            stream_PO.add(PO72);


            pushFollow(FOLLOW_printThings_in_print946);
            printThings73=printThings();

            state._fsp--;

            stream_printThings.add(printThings73.getTree());

            PC74=(Token)match(input,PC,FOLLOW_PC_in_print948);  
            stream_PC.add(PC74);


            SEMICOLON75=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print950);  
            stream_SEMICOLON.add(SEMICOLON75);


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
            // 112:46: -> ^( Printstmt PRINT PO printThings PC SEMICOLON )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:49: ^( Printstmt PRINT PO printThings PC SEMICOLON )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:118:1: printThings : ( TEXT | arithExpr | funcCall | declobj ) ^;
    public final MiniJavaParser.printThings_return printThings() throws RecognitionException {
        MiniJavaParser.printThings_return retval = new MiniJavaParser.printThings_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT76=null;
        MiniJavaParser.arithExpr_return arithExpr77 =null;

        MiniJavaParser.funcCall_return funcCall78 =null;

        MiniJavaParser.declobj_return declobj79 =null;


        Object TEXT76_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:118:13: ( ( TEXT | arithExpr | funcCall | declobj ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:118:15: ( TEXT | arithExpr | funcCall | declobj ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:118:15: ( TEXT | arithExpr | funcCall | declobj )
            int alt18=4;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt18=1;
                }
                break;
            case ID:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==PO) ) {
                    alt18=3;
                }
                else if ( (LA18_2==DIV||LA18_2==DOT||LA18_2==MINUS||LA18_2==MULTI||(LA18_2 >= PC && LA18_2 <= PLUS)||LA18_2==SBO) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

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
                alt18=2;
                }
                break;
            case NEW:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:118:16: TEXT
                    {
                    TEXT76=(Token)match(input,TEXT,FOLLOW_TEXT_in_printThings990); 
                    TEXT76_tree = 
                    (Object)adaptor.create(TEXT76)
                    ;
                    adaptor.addChild(root_0, TEXT76_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:118:21: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_printThings992);
                    arithExpr77=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr77.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:118:31: funcCall
                    {
                    pushFollow(FOLLOW_funcCall_in_printThings994);
                    funcCall78=funcCall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcCall78.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:118:40: declobj
                    {
                    pushFollow(FOLLOW_declobj_in_printThings996);
                    declobj79=declobj();

                    state._fsp--;

                    adaptor.addChild(root_0, declobj79.getTree());

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:1: initialize : ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) ;
    public final MiniJavaParser.initialize_return initialize() throws RecognitionException {
        MiniJavaParser.initialize_return retval = new MiniJavaParser.initialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID81=null;
        Token SBO82=null;
        Token SBC84=null;
        Token SEMICOLON86=null;
        MiniJavaParser.type_return type80 =null;

        MiniJavaParser.arithExpr_return arithExpr83 =null;

        MiniJavaParser.declaration_return declaration85 =null;


        Object ID81_tree=null;
        Object SBO82_tree=null;
        Object SBC84_tree=null;
        Object SEMICOLON86_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:12: ( ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:14: ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:14: ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:15: ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:15: ( type )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==SBO) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==SBC) ) {
                        int LA19_5 = input.LA(4);

                        if ( (LA19_5==ID) ) {
                            alt19=1;
                        }
                    }
                }
                else if ( (LA19_1==ID) ) {
                    alt19=1;
                }
            }
            else if ( (LA19_0==BOOLEAN||LA19_0==DOUBLE||LA19_0==INT||LA19_0==STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:15: type
                    {
                    pushFollow(FOLLOW_type_in_initialize1007);
                    type80=type();

                    state._fsp--;

                    stream_type.add(type80.getTree());

                    }
                    break;

            }


            ID81=(Token)match(input,ID,FOLLOW_ID_in_initialize1010);  
            stream_ID.add(ID81);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:24: ( SBO ( arithExpr )? SBC )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==SBO) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:25: SBO ( arithExpr )? SBC
                    {
                    SBO82=(Token)match(input,SBO,FOLLOW_SBO_in_initialize1013);  
                    stream_SBO.add(SBO82);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:29: ( arithExpr )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BOOL||LA20_0==DNUM||LA20_0==ID||LA20_0==MINUS||(LA20_0 >= NOT && LA20_0 <= NUM)||LA20_0==PO) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:30: arithExpr
                            {
                            pushFollow(FOLLOW_arithExpr_in_initialize1016);
                            arithExpr83=arithExpr();

                            state._fsp--;

                            stream_arithExpr.add(arithExpr83.getTree());

                            }
                            break;

                    }


                    SBC84=(Token)match(input,SBC,FOLLOW_SBC_in_initialize1020);  
                    stream_SBC.add(SBC84);


                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:48: ( declaration )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:48: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_initialize1024);
                    declaration85=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration85.getTree());

                    }
                    break;

            }


            SEMICOLON86=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize1027);  
            stream_SEMICOLON.add(SEMICOLON86);


            }


            // AST REWRITE
            // elements: type, declaration, SEMICOLON, SBO, ID, arithExpr, SBC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:72: -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:75: ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Initialize, "Initialize")
                , root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:88: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:97: ( SBO ( arithExpr )? SBC )?
                if ( stream_SBO.hasNext()||stream_arithExpr.hasNext()||stream_SBC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SBO.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:102: ( arithExpr )?
                    if ( stream_arithExpr.hasNext() ) {
                        adaptor.addChild(root_1, stream_arithExpr.nextTree());

                    }
                    stream_arithExpr.reset();

                    adaptor.addChild(root_1, 
                    stream_SBC.nextNode()
                    );

                }
                stream_SBO.reset();
                stream_arithExpr.reset();
                stream_SBC.reset();

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:121: ( declaration )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:1: declaration : ( EQUAL declThings ) -> ^( Declaration EQUAL declThings ) ;
    public final MiniJavaParser.declaration_return declaration() throws RecognitionException {
        MiniJavaParser.declaration_return retval = new MiniJavaParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL87=null;
        MiniJavaParser.declThings_return declThings88 =null;


        Object EQUAL87_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_declThings=new RewriteRuleSubtreeStream(adaptor,"rule declThings");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:13: ( ( EQUAL declThings ) -> ^( Declaration EQUAL declThings ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:15: ( EQUAL declThings )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:15: ( EQUAL declThings )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:16: EQUAL declThings
            {
            EQUAL87=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration1078);  
            stream_EQUAL.add(EQUAL87);


            pushFollow(FOLLOW_declThings_in_declaration1080);
            declThings88=declThings();

            state._fsp--;

            stream_declThings.add(declThings88.getTree());

            }


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
            // 126:34: -> ^( Declaration EQUAL declThings )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:37: ^( Declaration EQUAL declThings )
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

        Token TEXT91=null;
        MiniJavaParser.arithExpr_return arithExpr89 =null;

        MiniJavaParser.declobj_return declobj90 =null;


        Object TEXT91_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:12: ( ( arithExpr | declobj | TEXT ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:14: ( arithExpr | declobj | TEXT ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:14: ( arithExpr | declobj | TEXT )
            int alt23=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case DNUM:
            case ID:
            case MINUS:
            case NOT:
            case NUM:
            case PO:
                {
                alt23=1;
                }
                break;
            case NEW:
                {
                alt23=2;
                }
                break;
            case TEXT:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:15: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_declThings1113);
                    arithExpr89=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr89.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:25: declobj
                    {
                    pushFollow(FOLLOW_declobj_in_declThings1115);
                    declobj90=declobj();

                    state._fsp--;

                    adaptor.addChild(root_0, declobj90.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:132:33: TEXT
                    {
                    TEXT91=(Token)match(input,TEXT,FOLLOW_TEXT_in_declThings1117); 
                    TEXT91_tree = 
                    (Object)adaptor.create(TEXT91)
                    ;
                    adaptor.addChild(root_0, TEXT91_tree);


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
    // $ANTLR end "declThings"


    public static class declobj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declobj"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:1: declobj : ( NEW type declOR ) -> ^( DeclObj NEW type declOR ) ;
    public final MiniJavaParser.declobj_return declobj() throws RecognitionException {
        MiniJavaParser.declobj_return retval = new MiniJavaParser.declobj_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEW92=null;
        MiniJavaParser.type_return type93 =null;

        MiniJavaParser.declOR_return declOR94 =null;


        Object NEW92_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_declOR=new RewriteRuleSubtreeStream(adaptor,"rule declOR");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:10: ( ( NEW type declOR ) -> ^( DeclObj NEW type declOR ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:12: ( NEW type declOR )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:12: ( NEW type declOR )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:13: NEW type declOR
            {
            NEW92=(Token)match(input,NEW,FOLLOW_NEW_in_declobj1129);  
            stream_NEW.add(NEW92);


            pushFollow(FOLLOW_type_in_declobj1131);
            type93=type();

            state._fsp--;

            stream_type.add(type93.getTree());

            pushFollow(FOLLOW_declOR_in_declobj1133);
            declOR94=declOR();

            state._fsp--;

            stream_declOR.add(declOR94.getTree());

            }


            // AST REWRITE
            // elements: declOR, type, NEW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:30: -> ^( DeclObj NEW type declOR )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:33: ^( DeclObj NEW type declOR )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:139:1: declOR1 : PO ( parameters )? PC ( dotvlaues )* ;
    public final MiniJavaParser.declOR1_return declOR1() throws RecognitionException {
        MiniJavaParser.declOR1_return retval = new MiniJavaParser.declOR1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PO95=null;
        Token PC97=null;
        MiniJavaParser.parameters_return parameters96 =null;

        MiniJavaParser.dotvlaues_return dotvlaues98 =null;


        Object PO95_tree=null;
        Object PC97_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:139:10: ( PO ( parameters )? PC ( dotvlaues )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:139:12: PO ( parameters )? PC ( dotvlaues )*
            {
            root_0 = (Object)adaptor.nil();


            PO95=(Token)match(input,PO,FOLLOW_PO_in_declOR11167); 
            PO95_tree = 
            (Object)adaptor.create(PO95)
            ;
            adaptor.addChild(root_0, PO95_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:139:15: ( parameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BOOL||LA24_0==DNUM||LA24_0==ID||LA24_0==MINUS||(LA24_0 >= NOT && LA24_0 <= NUM)||LA24_0==PO) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:139:16: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_declOR11170);
                    parameters96=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters96.getTree());

                    }
                    break;

            }


            PC97=(Token)match(input,PC,FOLLOW_PC_in_declOR11174); 
            PC97_tree = 
            (Object)adaptor.create(PC97)
            ;
            adaptor.addChild(root_0, PC97_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:139:32: ( dotvlaues )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DOT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:139:32: dotvlaues
            	    {
            	    pushFollow(FOLLOW_dotvlaues_in_declOR11176);
            	    dotvlaues98=dotvlaues();

            	    state._fsp--;

            	    adaptor.addChild(root_0, dotvlaues98.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:1: declOR2 : SBO ( arithExpr )? SBC ;
    public final MiniJavaParser.declOR2_return declOR2() throws RecognitionException {
        MiniJavaParser.declOR2_return retval = new MiniJavaParser.declOR2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SBO99=null;
        Token SBC101=null;
        MiniJavaParser.arithExpr_return arithExpr100 =null;


        Object SBO99_tree=null;
        Object SBC101_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:10: ( SBO ( arithExpr )? SBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:12: SBO ( arithExpr )? SBC
            {
            root_0 = (Object)adaptor.nil();


            SBO99=(Token)match(input,SBO,FOLLOW_SBO_in_declOR21185); 
            SBO99_tree = 
            (Object)adaptor.create(SBO99)
            ;
            adaptor.addChild(root_0, SBO99_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:16: ( arithExpr )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==BOOL||LA26_0==DNUM||LA26_0==ID||LA26_0==MINUS||(LA26_0 >= NOT && LA26_0 <= NUM)||LA26_0==PO) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:17: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_declOR21188);
                    arithExpr100=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr100.getTree());

                    }
                    break;

            }


            SBC101=(Token)match(input,SBC,FOLLOW_SBC_in_declOR21192); 
            SBC101_tree = 
            (Object)adaptor.create(SBC101)
            ;
            adaptor.addChild(root_0, SBC101_tree);


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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:1: declOR : ( ( declOR1 ) -> ^( DeclOr declOR1 ) | ( declOR2 ) -> ^( DeclOr declOR2 ) );
    public final MiniJavaParser.declOR_return declOR() throws RecognitionException {
        MiniJavaParser.declOR_return retval = new MiniJavaParser.declOR_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.declOR1_return declOR1102 =null;

        MiniJavaParser.declOR2_return declOR2103 =null;


        RewriteRuleSubtreeStream stream_declOR2=new RewriteRuleSubtreeStream(adaptor,"rule declOR2");
        RewriteRuleSubtreeStream stream_declOR1=new RewriteRuleSubtreeStream(adaptor,"rule declOR1");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:9: ( ( declOR1 ) -> ^( DeclOr declOR1 ) | ( declOR2 ) -> ^( DeclOr declOR2 ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==PO) ) {
                alt27=1;
            }
            else if ( (LA27_0==SBO) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:11: ( declOR1 )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:11: ( declOR1 )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:12: declOR1
                    {
                    pushFollow(FOLLOW_declOR1_in_declOR1202);
                    declOR1102=declOR1();

                    state._fsp--;

                    stream_declOR1.add(declOR1102.getTree());

                    }


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
                    // 142:21: -> ^( DeclOr declOR1 )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:24: ^( DeclOr declOR1 )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:5: ( declOR2 )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:5: ( declOR2 )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:6: declOR2
                    {
                    pushFollow(FOLLOW_declOR2_in_declOR1218);
                    declOR2103=declOR2();

                    state._fsp--;

                    stream_declOR2.add(declOR2103.getTree());

                    }


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
                    // 143:15: -> ^( DeclOr declOR2 )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:143:18: ^( DeclOr declOR2 )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:1: dotvlaues : ( DOT ID ( PO ( parameters )? PC )? ) -> ^( DotValues DOT ID ( PO ( parameters )? PC )? ) ;
    public final MiniJavaParser.dotvlaues_return dotvlaues() throws RecognitionException {
        MiniJavaParser.dotvlaues_return retval = new MiniJavaParser.dotvlaues_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT104=null;
        Token ID105=null;
        Token PO106=null;
        Token PC108=null;
        MiniJavaParser.parameters_return parameters107 =null;


        Object DOT104_tree=null;
        Object ID105_tree=null;
        Object PO106_tree=null;
        Object PC108_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:12: ( ( DOT ID ( PO ( parameters )? PC )? ) -> ^( DotValues DOT ID ( PO ( parameters )? PC )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:14: ( DOT ID ( PO ( parameters )? PC )? )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:14: ( DOT ID ( PO ( parameters )? PC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:15: DOT ID ( PO ( parameters )? PC )?
            {
            DOT104=(Token)match(input,DOT,FOLLOW_DOT_in_dotvlaues1250);  
            stream_DOT.add(DOT104);


            ID105=(Token)match(input,ID,FOLLOW_ID_in_dotvlaues1252);  
            stream_ID.add(ID105);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:22: ( PO ( parameters )? PC )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PO) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:23: PO ( parameters )? PC
                    {
                    PO106=(Token)match(input,PO,FOLLOW_PO_in_dotvlaues1255);  
                    stream_PO.add(PO106);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:26: ( parameters )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==BOOL||LA28_0==DNUM||LA28_0==ID||LA28_0==MINUS||(LA28_0 >= NOT && LA28_0 <= NUM)||LA28_0==PO) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:27: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_dotvlaues1258);
                            parameters107=parameters();

                            state._fsp--;

                            stream_parameters.add(parameters107.getTree());

                            }
                            break;

                    }


                    PC108=(Token)match(input,PC,FOLLOW_PC_in_dotvlaues1262);  
                    stream_PC.add(PC108);


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: DOT, ID, parameters, PO, PC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 149:46: -> ^( DotValues DOT ID ( PO ( parameters )? PC )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:49: ^( DotValues DOT ID ( PO ( parameters )? PC )? )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:68: ( PO ( parameters )? PC )?
                if ( stream_parameters.hasNext()||stream_PO.hasNext()||stream_PC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_PO.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:149:72: ( parameters )?
                    if ( stream_parameters.hasNext() ) {
                        adaptor.addChild(root_1, stream_parameters.nextTree());

                    }
                    stream_parameters.reset();

                    adaptor.addChild(root_1, 
                    stream_PC.nextNode()
                    );

                }
                stream_parameters.reset();
                stream_PO.reset();
                stream_PC.reset();

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:1: ifstmt : ( IF PO condition PC block ( ELSE block )? ) -> ^( Ifstmt IF PO condition PC block ( ELSE block )? ) ;
    public final MiniJavaParser.ifstmt_return ifstmt() throws RecognitionException {
        MiniJavaParser.ifstmt_return retval = new MiniJavaParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF109=null;
        Token PO110=null;
        Token PC112=null;
        Token ELSE114=null;
        MiniJavaParser.condition_return condition111 =null;

        MiniJavaParser.block_return block113 =null;

        MiniJavaParser.block_return block115 =null;


        Object IF109_tree=null;
        Object PO110_tree=null;
        Object PC112_tree=null;
        Object ELSE114_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:9: ( ( IF PO condition PC block ( ELSE block )? ) -> ^( Ifstmt IF PO condition PC block ( ELSE block )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:11: ( IF PO condition PC block ( ELSE block )? )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:11: ( IF PO condition PC block ( ELSE block )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:12: IF PO condition PC block ( ELSE block )?
            {
            IF109=(Token)match(input,IF,FOLLOW_IF_in_ifstmt1310);  
            stream_IF.add(IF109);


            PO110=(Token)match(input,PO,FOLLOW_PO_in_ifstmt1312);  
            stream_PO.add(PO110);


            pushFollow(FOLLOW_condition_in_ifstmt1314);
            condition111=condition();

            state._fsp--;

            stream_condition.add(condition111.getTree());

            PC112=(Token)match(input,PC,FOLLOW_PC_in_ifstmt1316);  
            stream_PC.add(PC112);


            pushFollow(FOLLOW_block_in_ifstmt1318);
            block113=block();

            state._fsp--;

            stream_block.add(block113.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:36: ( ELSE block )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ELSE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:38: ELSE block
                    {
                    ELSE114=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifstmt1321);  
                    stream_ELSE.add(ELSE114);


                    pushFollow(FOLLOW_block_in_ifstmt1323);
                    block115=block();

                    state._fsp--;

                    stream_block.add(block115.getTree());

                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: block, IF, ELSE, PO, block, condition, PC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 155:53: -> ^( Ifstmt IF PO condition PC block ( ELSE block )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:56: ^( Ifstmt IF PO condition PC block ( ELSE block )? )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:155:89: ( ELSE block )?
                if ( stream_ELSE.hasNext()||stream_block.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ELSE.nextNode()
                    );

                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_ELSE.reset();
                stream_block.reset();

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:162:1: condition : arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )* ;
    public final MiniJavaParser.condition_return condition() throws RecognitionException {
        MiniJavaParser.condition_return retval = new MiniJavaParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set117=null;
        MiniJavaParser.arithExpr_return arithExpr116 =null;

        MiniJavaParser.arithExpr_return arithExpr118 =null;


        Object set117_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:162:11: ( arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:162:13: arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arithExpr_in_condition1373);
            arithExpr116=arithExpr();

            state._fsp--;

            adaptor.addChild(root_0, arithExpr116.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:162:23: ( ( COMPARISONS | AndOr ) ^ arithExpr )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==AndOr||LA31_0==COMPARISONS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:162:24: ( COMPARISONS | AndOr ) ^ arithExpr
            	    {
            	    set117=(Token)input.LT(1);

            	    set117=(Token)input.LT(1);

            	    if ( input.LA(1)==AndOr||input.LA(1)==COMPARISONS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set117)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_arithExpr_in_condition1383);
            	    arithExpr118=arithExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arithExpr118.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:1: block : ( ( CBO ( statment )* CBC ) -> ^( Block CBO ( statment )* CBC ) | ( statment ) -> ^( Block statment ) );
    public final MiniJavaParser.block_return block() throws RecognitionException {
        MiniJavaParser.block_return retval = new MiniJavaParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CBO119=null;
        Token CBC121=null;
        MiniJavaParser.statment_return statment120 =null;

        MiniJavaParser.statment_return statment122 =null;


        Object CBO119_tree=null;
        Object CBC121_tree=null;
        RewriteRuleTokenStream stream_CBO=new RewriteRuleTokenStream(adaptor,"token CBO");
        RewriteRuleTokenStream stream_CBC=new RewriteRuleTokenStream(adaptor,"token CBC");
        RewriteRuleSubtreeStream stream_statment=new RewriteRuleSubtreeStream(adaptor,"rule statment");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:8: ( ( CBO ( statment )* CBC ) -> ^( Block CBO ( statment )* CBC ) | ( statment ) -> ^( Block statment ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==CBO) ) {
                alt33=1;
            }
            else if ( (LA33_0==BOOLEAN||LA33_0==DOUBLE||(LA33_0 >= ID && LA33_0 <= INT)||LA33_0==PRINT||LA33_0==STRING||LA33_0==WHILE) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:10: ( CBO ( statment )* CBC )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:10: ( CBO ( statment )* CBC )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:11: CBO ( statment )* CBC
                    {
                    CBO119=(Token)match(input,CBO,FOLLOW_CBO_in_block1422);  
                    stream_CBO.add(CBO119);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:15: ( statment )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==BOOLEAN||LA32_0==DOUBLE||(LA32_0 >= ID && LA32_0 <= INT)||LA32_0==PRINT||LA32_0==STRING||LA32_0==WHILE) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:15: statment
                    	    {
                    	    pushFollow(FOLLOW_statment_in_block1424);
                    	    statment120=statment();

                    	    state._fsp--;

                    	    stream_statment.add(statment120.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    CBC121=(Token)match(input,CBC,FOLLOW_CBC_in_block1427);  
                    stream_CBC.add(CBC121);


                    }


                    // AST REWRITE
                    // elements: statment, CBC, CBO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:30: -> ^( Block CBO ( statment )* CBC )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:33: ^( Block CBO ( statment )* CBC )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Block, "Block")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CBO.nextNode()
                        );

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:168:45: ( statment )*
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:169:6: ( statment )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:169:6: ( statment )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:169:7: statment
                    {
                    pushFollow(FOLLOW_statment_in_block1449);
                    statment122=statment();

                    state._fsp--;

                    stream_statment.add(statment122.getTree());

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
                    // 169:17: -> ^( Block statment )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:169:20: ^( Block statment )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:1: funcCall : ( ID PO ( parameters )? PC ) -> ^( FuncCall ID PO ( parameters )? PC ) ;
    public final MiniJavaParser.funcCall_return funcCall() throws RecognitionException {
        MiniJavaParser.funcCall_return retval = new MiniJavaParser.funcCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID123=null;
        Token PO124=null;
        Token PC126=null;
        MiniJavaParser.parameters_return parameters125 =null;


        Object ID123_tree=null;
        Object PO124_tree=null;
        Object PC126_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:10: ( ( ID PO ( parameters )? PC ) -> ^( FuncCall ID PO ( parameters )? PC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:12: ( ID PO ( parameters )? PC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:12: ( ID PO ( parameters )? PC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:13: ID PO ( parameters )? PC
            {
            ID123=(Token)match(input,ID,FOLLOW_ID_in_funcCall1480);  
            stream_ID.add(ID123);


            PO124=(Token)match(input,PO,FOLLOW_PO_in_funcCall1482);  
            stream_PO.add(PO124);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:19: ( parameters )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==BOOL||LA34_0==DNUM||LA34_0==ID||LA34_0==MINUS||(LA34_0 >= NOT && LA34_0 <= NUM)||LA34_0==PO) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:21: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_funcCall1486);
                    parameters125=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters125.getTree());

                    }
                    break;

            }


            PC126=(Token)match(input,PC,FOLLOW_PC_in_funcCall1490);  
            stream_PC.add(PC126);


            }


            // AST REWRITE
            // elements: ID, PC, PO, parameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 175:38: -> ^( FuncCall ID PO ( parameters )? PC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:41: ^( FuncCall ID PO ( parameters )? PC )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:175:58: ( parameters )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:1: parameters : ( arithExpr ( COMA arithExpr )* ) -> ^( Parameters arithExpr ( COMA arithExpr )* ) ;
    public final MiniJavaParser.parameters_return parameters() throws RecognitionException {
        MiniJavaParser.parameters_return retval = new MiniJavaParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMA128=null;
        MiniJavaParser.arithExpr_return arithExpr127 =null;

        MiniJavaParser.arithExpr_return arithExpr129 =null;


        Object COMA128_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:12: ( ( arithExpr ( COMA arithExpr )* ) -> ^( Parameters arithExpr ( COMA arithExpr )* ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:14: ( arithExpr ( COMA arithExpr )* )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:14: ( arithExpr ( COMA arithExpr )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:15: arithExpr ( COMA arithExpr )*
            {
            pushFollow(FOLLOW_arithExpr_in_parameters1531);
            arithExpr127=arithExpr();

            state._fsp--;

            stream_arithExpr.add(arithExpr127.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:25: ( COMA arithExpr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:26: COMA arithExpr
            	    {
            	    COMA128=(Token)match(input,COMA,FOLLOW_COMA_in_parameters1534);  
            	    stream_COMA.add(COMA128);


            	    pushFollow(FOLLOW_arithExpr_in_parameters1536);
            	    arithExpr129=arithExpr();

            	    state._fsp--;

            	    stream_arithExpr.add(arithExpr129.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: arithExpr, COMA, arithExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:44: -> ^( Parameters arithExpr ( COMA arithExpr )* )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:47: ^( Parameters arithExpr ( COMA arithExpr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Parameters, "Parameters")
                , root_1);

                adaptor.addChild(root_1, stream_arithExpr.nextTree());

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:181:70: ( COMA arithExpr )*
                while ( stream_COMA.hasNext()||stream_arithExpr.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_COMA.nextNode()
                    );

                    adaptor.addChild(root_1, stream_arithExpr.nextTree());

                }
                stream_COMA.reset();
                stream_arithExpr.reset();

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:187:1: whilestmt : ( WHILE PO condition PC block ) -> ^( While WHILE PO condition PC block ) ;
    public final MiniJavaParser.whilestmt_return whilestmt() throws RecognitionException {
        MiniJavaParser.whilestmt_return retval = new MiniJavaParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE130=null;
        Token PO131=null;
        Token PC133=null;
        MiniJavaParser.condition_return condition132 =null;

        MiniJavaParser.block_return block134 =null;


        Object WHILE130_tree=null;
        Object PO131_tree=null;
        Object PC133_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:187:11: ( ( WHILE PO condition PC block ) -> ^( While WHILE PO condition PC block ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:187:13: ( WHILE PO condition PC block )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:187:13: ( WHILE PO condition PC block )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:187:14: WHILE PO condition PC block
            {
            WHILE130=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilestmt1576);  
            stream_WHILE.add(WHILE130);


            PO131=(Token)match(input,PO,FOLLOW_PO_in_whilestmt1578);  
            stream_PO.add(PO131);


            pushFollow(FOLLOW_condition_in_whilestmt1580);
            condition132=condition();

            state._fsp--;

            stream_condition.add(condition132.getTree());

            PC133=(Token)match(input,PC,FOLLOW_PC_in_whilestmt1582);  
            stream_PC.add(PC133);


            pushFollow(FOLLOW_block_in_whilestmt1584);
            block134=block();

            state._fsp--;

            stream_block.add(block134.getTree());

            }


            // AST REWRITE
            // elements: PO, WHILE, PC, condition, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:43: -> ^( While WHILE PO condition PC block )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:187:46: ^( While WHILE PO condition PC block )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:193:1: signs : ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^;
    public final MiniJavaParser.signs_return signs() throws RecognitionException {
        MiniJavaParser.signs_return retval = new MiniJavaParser.signs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set135=null;

        Object set135_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:193:8: ( ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:193:10: ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^
            {
            root_0 = (Object)adaptor.nil();


            set135=(Token)input.LT(1);

            set135=(Token)input.LT(1);

            if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULTI||input.LA(1)==PLUS||input.LA(1)==REMINDER ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set135)
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:1: arrayOrObj : ( ( ( dotvlaues )* ) -> ^( ArrayOrObj ( dotvlaues )* ) | ( SBO arithExpr SBC ) -> ^( ArrayOrObj SBO arithExpr SBC ) );
    public final MiniJavaParser.arrayOrObj_return arrayOrObj() throws RecognitionException {
        MiniJavaParser.arrayOrObj_return retval = new MiniJavaParser.arrayOrObj_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SBO137=null;
        Token SBC139=null;
        MiniJavaParser.dotvlaues_return dotvlaues136 =null;

        MiniJavaParser.arithExpr_return arithExpr138 =null;


        Object SBO137_tree=null;
        Object SBC139_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleSubtreeStream stream_dotvlaues=new RewriteRuleSubtreeStream(adaptor,"rule dotvlaues");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:12: ( ( ( dotvlaues )* ) -> ^( ArrayOrObj ( dotvlaues )* ) | ( SBO arithExpr SBC ) -> ^( ArrayOrObj SBO arithExpr SBC ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AndOr||(LA37_0 >= COMA && LA37_0 <= COMPARISONS)||LA37_0==DIV||LA37_0==DOT||LA37_0==MINUS||LA37_0==MULTI||(LA37_0 >= PC && LA37_0 <= PLUS)||LA37_0==SBC||LA37_0==SEMICOLON) ) {
                alt37=1;
            }
            else if ( (LA37_0==SBO) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:14: ( ( dotvlaues )* )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:14: ( ( dotvlaues )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:15: ( dotvlaues )*
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:15: ( dotvlaues )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==DOT) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:15: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_arrayOrObj1643);
                    	    dotvlaues136=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues136.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }


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
                    // 195:27: -> ^( ArrayOrObj ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:30: ^( ArrayOrObj ( dotvlaues )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayOrObj, "ArrayOrObj")
                        , root_1);

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:43: ( dotvlaues )*
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:196:5: ( SBO arithExpr SBC )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:196:5: ( SBO arithExpr SBC )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:196:6: SBO arithExpr SBC
                    {
                    SBO137=(Token)match(input,SBO,FOLLOW_SBO_in_arrayOrObj1661);  
                    stream_SBO.add(SBO137);


                    pushFollow(FOLLOW_arithExpr_in_arrayOrObj1663);
                    arithExpr138=arithExpr();

                    state._fsp--;

                    stream_arithExpr.add(arithExpr138.getTree());

                    SBC139=(Token)match(input,SBC,FOLLOW_SBC_in_arrayOrObj1665);  
                    stream_SBC.add(SBC139);


                    }


                    // AST REWRITE
                    // elements: SBO, arithExpr, SBC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:25: -> ^( ArrayOrObj SBO arithExpr SBC )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:196:28: ^( ArrayOrObj SBO arithExpr SBC )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:1: notCond : ( ( PO condition PC ( dotvlaues )* ) -> ^( NotCond PO condition PC ( dotvlaues )* ) | ( ID arrayOrObj ) -> ^( NotCond ID arrayOrObj ) );
    public final MiniJavaParser.notCond_return notCond() throws RecognitionException {
        MiniJavaParser.notCond_return retval = new MiniJavaParser.notCond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PO140=null;
        Token PC142=null;
        Token ID144=null;
        MiniJavaParser.condition_return condition141 =null;

        MiniJavaParser.dotvlaues_return dotvlaues143 =null;

        MiniJavaParser.arrayOrObj_return arrayOrObj145 =null;


        Object PO140_tree=null;
        Object PC142_tree=null;
        Object ID144_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_arrayOrObj=new RewriteRuleSubtreeStream(adaptor,"rule arrayOrObj");
        RewriteRuleSubtreeStream stream_dotvlaues=new RewriteRuleSubtreeStream(adaptor,"rule dotvlaues");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:10: ( ( PO condition PC ( dotvlaues )* ) -> ^( NotCond PO condition PC ( dotvlaues )* ) | ( ID arrayOrObj ) -> ^( NotCond ID arrayOrObj ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==PO) ) {
                alt39=1;
            }
            else if ( (LA39_0==ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:12: ( PO condition PC ( dotvlaues )* )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:12: ( PO condition PC ( dotvlaues )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:13: PO condition PC ( dotvlaues )*
                    {
                    PO140=(Token)match(input,PO,FOLLOW_PO_in_notCond1707);  
                    stream_PO.add(PO140);


                    pushFollow(FOLLOW_condition_in_notCond1709);
                    condition141=condition();

                    state._fsp--;

                    stream_condition.add(condition141.getTree());

                    PC142=(Token)match(input,PC,FOLLOW_PC_in_notCond1711);  
                    stream_PC.add(PC142);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:29: ( dotvlaues )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==DOT) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:29: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_notCond1713);
                    	    dotvlaues143=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues143.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }


                    // AST REWRITE
                    // elements: PC, PO, condition, dotvlaues
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:41: -> ^( NotCond PO condition PC ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:44: ^( NotCond PO condition PC ( dotvlaues )* )
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

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:202:70: ( dotvlaues )*
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:5: ( ID arrayOrObj )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:5: ( ID arrayOrObj )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:6: ID arrayOrObj
                    {
                    ID144=(Token)match(input,ID,FOLLOW_ID_in_notCond1737);  
                    stream_ID.add(ID144);


                    pushFollow(FOLLOW_arrayOrObj_in_notCond1739);
                    arrayOrObj145=arrayOrObj();

                    state._fsp--;

                    stream_arrayOrObj.add(arrayOrObj145.getTree());

                    }


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
                    // 203:21: -> ^( NotCond ID arrayOrObj )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:23: ^( NotCond ID arrayOrObj )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:209:1: arithExpr : term ( ( PLUS | MINUS ) ^ term )* ;
    public final MiniJavaParser.arithExpr_return arithExpr() throws RecognitionException {
        MiniJavaParser.arithExpr_return retval = new MiniJavaParser.arithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set147=null;
        MiniJavaParser.term_return term146 =null;

        MiniJavaParser.term_return term148 =null;


        Object set147_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:209:11: ( term ( ( PLUS | MINUS ) ^ term )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:209:13: term ( ( PLUS | MINUS ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arithExpr1773);
            term146=term();

            state._fsp--;

            adaptor.addChild(root_0, term146.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:209:18: ( ( PLUS | MINUS ) ^ term )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==MINUS||LA40_0==PLUS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:209:19: ( PLUS | MINUS ) ^ term
            	    {
            	    set147=(Token)input.LT(1);

            	    set147=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set147)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithExpr1786);
            	    term148=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term148.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:1: term : factor ( ( MULTI | DIV ) ^ factor )* ;
    public final MiniJavaParser.term_return term() throws RecognitionException {
        MiniJavaParser.term_return retval = new MiniJavaParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set150=null;
        MiniJavaParser.factor_return factor149 =null;

        MiniJavaParser.factor_return factor151 =null;


        Object set150_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:7: ( factor ( ( MULTI | DIV ) ^ factor )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:9: factor ( ( MULTI | DIV ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1797);
            factor149=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor149.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:16: ( ( MULTI | DIV ) ^ factor )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==DIV||LA41_0==MULTI) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:18: ( MULTI | DIV ) ^ factor
            	    {
            	    set150=(Token)input.LT(1);

            	    set150=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==MULTI ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set150)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term1812);
            	    factor151=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor151.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:1: factor : ( ( ID arrayOrObj ) -> ^( Factor ID arrayOrObj ) | ( NUM ) -> ^( Factor NUM ) | ( DNUM ) -> ^( Factor DNUM ) | ( MINUS ID ) -> ^( Factor MINUS ID ) | ( MINUS NUM ) -> ^( Factor MINUS NUM ) | ( MINUS DNUM ) -> ^( Factor MINUS DNUM ) | ( NOT notCond ) -> ^( Factor NOT notCond ) | ( PO condition PC ( dotvlaues )* ) -> ^( Factor PO condition PC ( dotvlaues )* ) | ( BOOL ) -> ^( Factor BOOL ) );
    public final MiniJavaParser.factor_return factor() throws RecognitionException {
        MiniJavaParser.factor_return retval = new MiniJavaParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID152=null;
        Token NUM154=null;
        Token DNUM155=null;
        Token MINUS156=null;
        Token ID157=null;
        Token MINUS158=null;
        Token NUM159=null;
        Token MINUS160=null;
        Token DNUM161=null;
        Token NOT162=null;
        Token PO164=null;
        Token PC166=null;
        Token BOOL168=null;
        MiniJavaParser.arrayOrObj_return arrayOrObj153 =null;

        MiniJavaParser.notCond_return notCond163 =null;

        MiniJavaParser.condition_return condition165 =null;

        MiniJavaParser.dotvlaues_return dotvlaues167 =null;


        Object ID152_tree=null;
        Object NUM154_tree=null;
        Object DNUM155_tree=null;
        Object MINUS156_tree=null;
        Object ID157_tree=null;
        Object MINUS158_tree=null;
        Object NUM159_tree=null;
        Object MINUS160_tree=null;
        Object DNUM161_tree=null;
        Object NOT162_tree=null;
        Object PO164_tree=null;
        Object PC166_tree=null;
        Object BOOL168_tree=null;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:9: ( ( ID arrayOrObj ) -> ^( Factor ID arrayOrObj ) | ( NUM ) -> ^( Factor NUM ) | ( DNUM ) -> ^( Factor DNUM ) | ( MINUS ID ) -> ^( Factor MINUS ID ) | ( MINUS NUM ) -> ^( Factor MINUS NUM ) | ( MINUS DNUM ) -> ^( Factor MINUS DNUM ) | ( NOT notCond ) -> ^( Factor NOT notCond ) | ( PO condition PC ( dotvlaues )* ) -> ^( Factor PO condition PC ( dotvlaues )* ) | ( BOOL ) -> ^( Factor BOOL ) )
            int alt43=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt43=1;
                }
                break;
            case NUM:
                {
                alt43=2;
                }
                break;
            case DNUM:
                {
                alt43=3;
                }
                break;
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt43=4;
                    }
                    break;
                case NUM:
                    {
                    alt43=5;
                    }
                    break;
                case DNUM:
                    {
                    alt43=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 4, input);

                    throw nvae;

                }

                }
                break;
            case NOT:
                {
                alt43=7;
                }
                break;
            case PO:
                {
                alt43=8;
                }
                break;
            case BOOL:
                {
                alt43=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:11: ( ID arrayOrObj )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:11: ( ID arrayOrObj )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:12: ID arrayOrObj
                    {
                    ID152=(Token)match(input,ID,FOLLOW_ID_in_factor1824);  
                    stream_ID.add(ID152);


                    pushFollow(FOLLOW_arrayOrObj_in_factor1826);
                    arrayOrObj153=arrayOrObj();

                    state._fsp--;

                    stream_arrayOrObj.add(arrayOrObj153.getTree());

                    }


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
                    // 213:27: -> ^( Factor ID arrayOrObj )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:213:30: ^( Factor ID arrayOrObj )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:214:5: ( NUM )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:214:5: ( NUM )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:214:6: NUM
                    {
                    NUM154=(Token)match(input,NUM,FOLLOW_NUM_in_factor1844);  
                    stream_NUM.add(NUM154);


                    }


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
                    // 214:11: -> ^( Factor NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:214:14: ^( Factor NUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:5: ( DNUM )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:5: ( DNUM )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:6: DNUM
                    {
                    DNUM155=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1860);  
                    stream_DNUM.add(DNUM155);


                    }


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
                    // 215:12: -> ^( Factor DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:215:15: ^( Factor DNUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:216:5: ( MINUS ID )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:216:5: ( MINUS ID )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:216:6: MINUS ID
                    {
                    MINUS156=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1876);  
                    stream_MINUS.add(MINUS156);


                    ID157=(Token)match(input,ID,FOLLOW_ID_in_factor1879);  
                    stream_ID.add(ID157);


                    }


                    // AST REWRITE
                    // elements: ID, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:17: -> ^( Factor MINUS ID )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:216:20: ^( Factor MINUS ID )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:5: ( MINUS NUM )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:5: ( MINUS NUM )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:6: MINUS NUM
                    {
                    MINUS158=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1898);  
                    stream_MINUS.add(MINUS158);


                    NUM159=(Token)match(input,NUM,FOLLOW_NUM_in_factor1901);  
                    stream_NUM.add(NUM159);


                    }


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
                    // 217:18: -> ^( Factor MINUS NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:21: ^( Factor MINUS NUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:218:5: ( MINUS DNUM )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:218:5: ( MINUS DNUM )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:218:6: MINUS DNUM
                    {
                    MINUS160=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1920);  
                    stream_MINUS.add(MINUS160);


                    DNUM161=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1923);  
                    stream_DNUM.add(DNUM161);


                    }


                    // AST REWRITE
                    // elements: DNUM, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:19: -> ^( Factor MINUS DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:218:22: ^( Factor MINUS DNUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:5: ( NOT notCond )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:5: ( NOT notCond )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:6: NOT notCond
                    {
                    NOT162=(Token)match(input,NOT,FOLLOW_NOT_in_factor1942);  
                    stream_NOT.add(NOT162);


                    pushFollow(FOLLOW_notCond_in_factor1944);
                    notCond163=notCond();

                    state._fsp--;

                    stream_notCond.add(notCond163.getTree());

                    }


                    // AST REWRITE
                    // elements: NOT, notCond
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:19: -> ^( Factor NOT notCond )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:22: ^( Factor NOT notCond )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:5: ( PO condition PC ( dotvlaues )* )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:5: ( PO condition PC ( dotvlaues )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:6: PO condition PC ( dotvlaues )*
                    {
                    PO164=(Token)match(input,PO,FOLLOW_PO_in_factor1963);  
                    stream_PO.add(PO164);


                    pushFollow(FOLLOW_condition_in_factor1965);
                    condition165=condition();

                    state._fsp--;

                    stream_condition.add(condition165.getTree());

                    PC166=(Token)match(input,PC,FOLLOW_PC_in_factor1967);  
                    stream_PC.add(PC166);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:22: ( dotvlaues )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==DOT) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:22: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_factor1969);
                    	    dotvlaues167=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues167.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }


                    // AST REWRITE
                    // elements: condition, dotvlaues, PO, PC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:34: -> ^( Factor PO condition PC ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:37: ^( Factor PO condition PC ( dotvlaues )* )
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

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:220:63: ( dotvlaues )*
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:5: ( BOOL )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:5: ( BOOL )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:6: BOOL
                    {
                    BOOL168=(Token)match(input,BOOL,FOLLOW_BOOL_in_factor1994);  
                    stream_BOOL.add(BOOL168);


                    }


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
                    // 221:12: -> ^( Factor BOOL )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:15: ^( Factor BOOL )
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


 

    public static final BitSet FOLLOW_start_in_entry102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classl_in_start138 = new BitSet(new long[]{0x0003000000000802L});
    public static final BitSet FOLLOW_set_in_modifier171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_stt185 = new BitSet(new long[]{0x18038000E0040082L,0x0000000000000005L});
    public static final BitSet FOLLOW_method_in_stt187 = new BitSet(new long[]{0x18038000E0040082L,0x0000000000000005L});
    public static final BitSet FOLLOW_modifier_in_classl199 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CLASS_in_classl202 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_classl204 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_EXTENDV_in_classl207 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_classl209 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_classl213 = new BitSet(new long[]{0x18038000E0040280L,0x0000000000000005L});
    public static final BitSet FOLLOW_stt_in_classl218 = new BitSet(new long[]{0x0003000000000200L});
    public static final BitSet FOLLOW_mainmethod_in_classl224 = new BitSet(new long[]{0x18038000E0040280L,0x0000000000000005L});
    public static final BitSet FOLLOW_stt_in_classl226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CBC_in_classl234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_mainmethod300 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_STATIC_in_mainmethod302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VOID_in_mainmethod304 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_MAIN_in_mainmethod306 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PO_in_mainmethod308 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_STRING_in_mainmethod310 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SBO_in_mainmethod312 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SBC_in_mainmethod314 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_mainmethod316 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_mainmethod318 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_mainmethod320 = new BitSet(new long[]{0x10008000E0040280L,0x0000000000000004L});
    public static final BitSet FOLLOW_statment_in_mainmethod326 = new BitSet(new long[]{0x10008000E0040280L,0x0000000000000004L});
    public static final BitSet FOLLOW_CBC_in_mainmethod344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_method406 = new BitSet(new long[]{0x18000000A0040080L,0x0000000000000001L});
    public static final BitSet FOLLOW_STATIC_in_method409 = new BitSet(new long[]{0x10000000A0040080L,0x0000000000000001L});
    public static final BitSet FOLLOW_methodtype_in_method412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_voidmethod_in_methodtype448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnmethod_in_methodtype450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_voidmethod469 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod471 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PO_in_voidmethod473 = new BitSet(new long[]{0x10001000A0040080L});
    public static final BitSet FOLLOW_type_in_voidmethod476 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod478 = new BitSet(new long[]{0x0000100000001000L});
    public static final BitSet FOLLOW_COMA_in_voidmethod481 = new BitSet(new long[]{0x10000000A0040080L});
    public static final BitSet FOLLOW_type_in_voidmethod483 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod485 = new BitSet(new long[]{0x0000100000001000L});
    public static final BitSet FOLLOW_PC_in_voidmethod491 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_voidmethod493 = new BitSet(new long[]{0x10008000E0040280L,0x0000000000000004L});
    public static final BitSet FOLLOW_statment_in_voidmethod507 = new BitSet(new long[]{0x10008000E0040280L,0x0000000000000004L});
    public static final BitSet FOLLOW_CBC_in_voidmethod513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typev572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typev_in_type597 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_SBO_in_type600 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SBC_in_type602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_returnmethod643 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod645 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PO_in_returnmethod647 = new BitSet(new long[]{0x10001000A0040080L});
    public static final BitSet FOLLOW_type_in_returnmethod650 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod652 = new BitSet(new long[]{0x0000100000001000L});
    public static final BitSet FOLLOW_COMA_in_returnmethod655 = new BitSet(new long[]{0x10000000A0040080L});
    public static final BitSet FOLLOW_type_in_returnmethod657 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod659 = new BitSet(new long[]{0x0000100000001000L});
    public static final BitSet FOLLOW_PC_in_returnmethod665 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_returnmethod667 = new BitSet(new long[]{0x10208000E0040080L,0x0000000000000004L});
    public static final BitSet FOLLOW_statment_in_returnmethod686 = new BitSet(new long[]{0x10208000E0040080L,0x0000000000000004L});
    public static final BitSet FOLLOW_RETURNV_in_returnmethod713 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_arithExpr_in_returnmethod715 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnmethod717 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CBC_in_returnmethod722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_statment787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_in_statment817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statment846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statment876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_statment906 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statment908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print942 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PO_in_print944 = new BitSet(new long[]{0x4000470820010040L});
    public static final BitSet FOLLOW_printThings_in_print946 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_print948 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_printThings990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_printThings992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_printThings994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declobj_in_printThings996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_initialize1007 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_initialize1010 = new BitSet(new long[]{0x0300000001000000L});
    public static final BitSet FOLLOW_SBO_in_initialize1013 = new BitSet(new long[]{0x0080460820010040L});
    public static final BitSet FOLLOW_arithExpr_in_initialize1016 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SBC_in_initialize1020 = new BitSet(new long[]{0x0200000001000000L});
    public static final BitSet FOLLOW_declaration_in_initialize1024 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_declaration1078 = new BitSet(new long[]{0x4000470820010040L});
    public static final BitSet FOLLOW_declThings_in_declaration1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_declThings1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declobj_in_declThings1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_declThings1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_declobj1129 = new BitSet(new long[]{0x10000000A0040080L});
    public static final BitSet FOLLOW_type_in_declobj1131 = new BitSet(new long[]{0x0100400000000000L});
    public static final BitSet FOLLOW_declOR_in_declobj1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_declOR11167 = new BitSet(new long[]{0x0000560820010040L});
    public static final BitSet FOLLOW_parameters_in_declOR11170 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_declOR11174 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_declOR11176 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_SBO_in_declOR21185 = new BitSet(new long[]{0x0080460820010040L});
    public static final BitSet FOLLOW_arithExpr_in_declOR21188 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SBC_in_declOR21192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOR1_in_declOR1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOR2_in_declOR1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotvlaues1250 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_dotvlaues1252 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_PO_in_dotvlaues1255 = new BitSet(new long[]{0x0000560820010040L});
    public static final BitSet FOLLOW_parameters_in_dotvlaues1258 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_dotvlaues1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstmt1310 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PO_in_ifstmt1312 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_condition_in_ifstmt1314 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_ifstmt1316 = new BitSet(new long[]{0x10008000E0040480L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_ifstmt1318 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ELSE_in_ifstmt1321 = new BitSet(new long[]{0x10008000E0040480L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_ifstmt1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_condition1373 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_set_in_condition1376 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_arithExpr_in_condition1383 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_CBO_in_block1422 = new BitSet(new long[]{0x10008000E0040280L,0x0000000000000004L});
    public static final BitSet FOLLOW_statment_in_block1424 = new BitSet(new long[]{0x10008000E0040280L,0x0000000000000004L});
    public static final BitSet FOLLOW_CBC_in_block1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_block1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcCall1480 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PO_in_funcCall1482 = new BitSet(new long[]{0x0000560820010040L});
    public static final BitSet FOLLOW_parameters_in_funcCall1486 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_funcCall1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_parameters1531 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMA_in_parameters1534 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_arithExpr_in_parameters1536 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_WHILE_in_whilestmt1576 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PO_in_whilestmt1578 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_condition_in_whilestmt1580 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_whilestmt1582 = new BitSet(new long[]{0x10008000E0040480L,0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_whilestmt1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signs1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotvlaues_in_arrayOrObj1643 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_SBO_in_arrayOrObj1661 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_arithExpr_in_arrayOrObj1663 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SBC_in_arrayOrObj1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_notCond1707 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_condition_in_notCond1709 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_notCond1711 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_notCond1713 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_notCond1737 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_arrayOrObj_in_notCond1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithExpr1773 = new BitSet(new long[]{0x0000200800000002L});
    public static final BitSet FOLLOW_set_in_arithExpr1776 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_term_in_arithExpr1786 = new BitSet(new long[]{0x0000200800000002L});
    public static final BitSet FOLLOW_factor_in_term1797 = new BitSet(new long[]{0x0000002000008002L});
    public static final BitSet FOLLOW_set_in_term1801 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_factor_in_term1812 = new BitSet(new long[]{0x0000002000008002L});
    public static final BitSet FOLLOW_ID_in_factor1824 = new BitSet(new long[]{0x0100000000020000L});
    public static final BitSet FOLLOW_arrayOrObj_in_factor1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1876 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_factor1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1898 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NUM_in_factor1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1920 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DNUM_in_factor1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1942 = new BitSet(new long[]{0x0000400020000000L});
    public static final BitSet FOLLOW_notCond_in_factor1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_factor1963 = new BitSet(new long[]{0x0000460820010040L});
    public static final BitSet FOLLOW_condition_in_factor1965 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PC_in_factor1967 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_factor1969 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_BOOL_in_factor1994 = new BitSet(new long[]{0x0000000000000002L});

}