// $ANTLR 3.4 D:\\Projects\\Mini-Java_Compiler\\MiniJava.g 2024-05-14 22:45:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "ArrayOrObj", "BOOL", "BOOLEAN", "Block", "CBC", "CBO", "CLASS", "COMA", "COMPARISONS", "Classl", "DIV", "DNUM", "DOT", "DOUBLE", "DeclObj", "DeclOr", "Declaration", "DotValues", "ELSE", "EQUAL", "EXTENDV", "Entry", "Factor", "FuncCall", "ID", "IF", "INT", "Ifstmt", "Initialize", "MAIN", "MINUS", "ML_COMMENT", "MODIFiER", "MULTI", "MainMethod", "Method", "NEW", "NOT", "NUM", "NotCond", "PC", "PLUS", "PO", "PRINT", "Parameters", "Printstmt", "REMINDER", "RETURNV", "ReturnMethod", "SBC", "SBO", "SEMICOLON", "SL_COMMENT", "STATIC", "STRING", "Start", "TEXT", "Type", "VOID", "VoidMethod", "WHILE", "While", "Whilestmt", "WhiteSpace"
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
    public static final int MODIFiER=37;
    public static final int MULTI=38;
    public static final int MainMethod=39;
    public static final int Method=40;
    public static final int NEW=41;
    public static final int NOT=42;
    public static final int NUM=43;
    public static final int NotCond=44;
    public static final int PC=45;
    public static final int PLUS=46;
    public static final int PO=47;
    public static final int PRINT=48;
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
    public static final int Type=62;
    public static final int VOID=63;
    public static final int VoidMethod=64;
    public static final int WHILE=65;
    public static final int While=66;
    public static final int Whilestmt=67;
    public static final int WhiteSpace=68;

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

                if ( (LA1_0==CLASS) ) {
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


    public static class classl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classl"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:1: classl : ( CLASS ID classes ) -> ^( Classl ID classes ) ;
    public final MiniJavaParser.classl_return classl() throws RecognitionException {
        MiniJavaParser.classl_return retval = new MiniJavaParser.classl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS3=null;
        Token ID4=null;
        MiniJavaParser.classes_return classes5 =null;


        Object CLASS3_tree=null;
        Object ID4_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_classes=new RewriteRuleSubtreeStream(adaptor,"rule classes");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:9: ( ( CLASS ID classes ) -> ^( Classl ID classes ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:11: ( CLASS ID classes )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:11: ( CLASS ID classes )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:12: CLASS ID classes
            {
            CLASS3=(Token)match(input,CLASS,FOLLOW_CLASS_in_classl172);  
            stream_CLASS.add(CLASS3);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_classl174);  
            stream_ID.add(ID4);


            pushFollow(FOLLOW_classes_in_classl176);
            classes5=classes();

            state._fsp--;

            stream_classes.add(classes5.getTree());

            }


            // AST REWRITE
            // elements: ID, classes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:29: -> ^( Classl ID classes )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:32: ^( Classl ID classes )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Classl, "Classl")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_classes.nextTree());

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


    public static class classes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classes"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:1: classes : ( mainClass | classDeclaration ) ^;
    public final MiniJavaParser.classes_return classes() throws RecognitionException {
        MiniJavaParser.classes_return retval = new MiniJavaParser.classes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.mainClass_return mainClass6 =null;

        MiniJavaParser.classDeclaration_return classDeclaration7 =null;



        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:10: ( ( mainClass | classDeclaration ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:12: ( mainClass | classDeclaration ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:12: ( mainClass | classDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CBO) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==MODIFiER) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==STATIC) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==VOID) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==MAIN) ) {
                                alt2=1;
                            }
                            else if ( (LA2_5==ID) ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA2_4==BOOLEAN||LA2_4==DOUBLE||LA2_4==ID||LA2_4==INT||LA2_4==STRING) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA2_3==BOOLEAN||LA2_3==DOUBLE||LA2_3==ID||LA2_3==INT||LA2_3==STRING||LA2_3==VOID) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA2_1==BOOLEAN||LA2_1==CBC||LA2_1==DOUBLE||(LA2_1 >= ID && LA2_1 <= INT)||LA2_1==PRINT||(LA2_1 >= STATIC && LA2_1 <= STRING)||LA2_1==VOID||LA2_1==WHILE) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==EXTENDV) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:13: mainClass
                    {
                    pushFollow(FOLLOW_mainClass_in_classes208);
                    mainClass6=mainClass();

                    state._fsp--;

                    adaptor.addChild(root_0, mainClass6.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:23: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_classes210);
                    classDeclaration7=classDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, classDeclaration7.getTree());

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
    // $ANTLR end "classes"


    public static class mainClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mainClass"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:1: mainClass : ( CBO mainmethod CBC ) ;
    public final MiniJavaParser.mainClass_return mainClass() throws RecognitionException {
        MiniJavaParser.mainClass_return retval = new MiniJavaParser.mainClass_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CBO8=null;
        Token CBC10=null;
        MiniJavaParser.mainmethod_return mainmethod9 =null;


        Object CBO8_tree=null;
        Object CBC10_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:11: ( ( CBO mainmethod CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:13: ( CBO mainmethod CBC )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:13: ( CBO mainmethod CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:14: CBO mainmethod CBC
            {
            CBO8=(Token)match(input,CBO,FOLLOW_CBO_in_mainClass221); 
            CBO8_tree = 
            (Object)adaptor.create(CBO8)
            ;
            adaptor.addChild(root_0, CBO8_tree);


            pushFollow(FOLLOW_mainmethod_in_mainClass223);
            mainmethod9=mainmethod();

            state._fsp--;

            adaptor.addChild(root_0, mainmethod9.getTree());

            CBC10=(Token)match(input,CBC,FOLLOW_CBC_in_mainClass225); 
            CBC10_tree = 
            (Object)adaptor.create(CBC10)
            ;
            adaptor.addChild(root_0, CBC10_tree);


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
    // $ANTLR end "mainClass"


    public static class classDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDeclaration"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:1: classDeclaration : ( ( EXTENDV ID )? CBO ( statment )* CBC ) ;
    public final MiniJavaParser.classDeclaration_return classDeclaration() throws RecognitionException {
        MiniJavaParser.classDeclaration_return retval = new MiniJavaParser.classDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDV11=null;
        Token ID12=null;
        Token CBO13=null;
        Token CBC15=null;
        MiniJavaParser.statment_return statment14 =null;


        Object EXTENDV11_tree=null;
        Object ID12_tree=null;
        Object CBO13_tree=null;
        Object CBC15_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:17: ( ( ( EXTENDV ID )? CBO ( statment )* CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:19: ( ( EXTENDV ID )? CBO ( statment )* CBC )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:19: ( ( EXTENDV ID )? CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:20: ( EXTENDV ID )? CBO ( statment )* CBC
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:20: ( EXTENDV ID )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXTENDV) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:21: EXTENDV ID
                    {
                    EXTENDV11=(Token)match(input,EXTENDV,FOLLOW_EXTENDV_in_classDeclaration252); 
                    EXTENDV11_tree = 
                    (Object)adaptor.create(EXTENDV11)
                    ;
                    adaptor.addChild(root_0, EXTENDV11_tree);


                    ID12=(Token)match(input,ID,FOLLOW_ID_in_classDeclaration254); 
                    ID12_tree = 
                    (Object)adaptor.create(ID12)
                    ;
                    adaptor.addChild(root_0, ID12_tree);


                    }
                    break;

            }


            CBO13=(Token)match(input,CBO,FOLLOW_CBO_in_classDeclaration258); 
            CBO13_tree = 
            (Object)adaptor.create(CBO13)
            ;
            adaptor.addChild(root_0, CBO13_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:38: ( statment )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||(LA4_0 >= ID && LA4_0 <= INT)||LA4_0==MODIFiER||LA4_0==PRINT||(LA4_0 >= STATIC && LA4_0 <= STRING)||LA4_0==VOID||LA4_0==WHILE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:38: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_classDeclaration260);
            	    statment14=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment14.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            CBC15=(Token)match(input,CBC,FOLLOW_CBC_in_classDeclaration263); 
            CBC15_tree = 
            (Object)adaptor.create(CBC15)
            ;
            adaptor.addChild(root_0, CBC15_tree);


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
    // $ANTLR end "classDeclaration"


    public static class mainmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mainmethod"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:1: mainmethod : ( MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) -> ^( MainMethod MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) ;
    public final MiniJavaParser.mainmethod_return mainmethod() throws RecognitionException {
        MiniJavaParser.mainmethod_return retval = new MiniJavaParser.mainmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MODIFiER16=null;
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
        MiniJavaParser.statment_return statment27 =null;


        Object MODIFiER16_tree=null;
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
        RewriteRuleTokenStream stream_MODIFiER=new RewriteRuleTokenStream(adaptor,"token MODIFiER");
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
        RewriteRuleSubtreeStream stream_statment=new RewriteRuleSubtreeStream(adaptor,"rule statment");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:17: ( ( MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) -> ^( MainMethod MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:19: ( MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:19: ( MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:20: MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC
            {
            MODIFiER16=(Token)match(input,MODIFiER,FOLLOW_MODIFiER_in_mainmethod298);  
            stream_MODIFiER.add(MODIFiER16);


            STATIC17=(Token)match(input,STATIC,FOLLOW_STATIC_in_mainmethod300);  
            stream_STATIC.add(STATIC17);


            VOID18=(Token)match(input,VOID,FOLLOW_VOID_in_mainmethod302);  
            stream_VOID.add(VOID18);


            MAIN19=(Token)match(input,MAIN,FOLLOW_MAIN_in_mainmethod304);  
            stream_MAIN.add(MAIN19);


            PO20=(Token)match(input,PO,FOLLOW_PO_in_mainmethod306);  
            stream_PO.add(PO20);


            STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_mainmethod308);  
            stream_STRING.add(STRING21);


            SBO22=(Token)match(input,SBO,FOLLOW_SBO_in_mainmethod310);  
            stream_SBO.add(SBO22);


            SBC23=(Token)match(input,SBC,FOLLOW_SBC_in_mainmethod312);  
            stream_SBC.add(SBC23);


            ID24=(Token)match(input,ID,FOLLOW_ID_in_mainmethod314);  
            stream_ID.add(ID24);


            PC25=(Token)match(input,PC,FOLLOW_PC_in_mainmethod316);  
            stream_PC.add(PC25);


            CBO26=(Token)match(input,CBO,FOLLOW_CBO_in_mainmethod318);  
            stream_CBO.add(CBO26);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:5: ( statment )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BOOLEAN||LA5_0==DOUBLE||(LA5_0 >= ID && LA5_0 <= INT)||LA5_0==MODIFiER||LA5_0==PRINT||(LA5_0 >= STATIC && LA5_0 <= STRING)||LA5_0==VOID||LA5_0==WHILE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:5: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_mainmethod324);
            	    statment27=statment();

            	    state._fsp--;

            	    stream_statment.add(statment27.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            CBC28=(Token)match(input,CBC,FOLLOW_CBC_in_mainmethod342);  
            stream_CBC.add(CBC28);


            }


            // AST REWRITE
            // elements: PO, MODIFiER, SBC, STATIC, MAIN, PC, CBC, STRING, ID, statment, VOID, CBO, SBO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:15: -> ^( MainMethod MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:18: ^( MainMethod MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MainMethod, "MainMethod")
                , root_1);

                adaptor.addChild(root_1, 
                stream_MODIFiER.nextNode()
                );

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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:85: ( statment )*
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:1: method : ( ( MODIFiER )? ( STATIC )? methodtype ) -> ^( Method ( MODIFiER )? ( STATIC )? methodtype ) ;
    public final MiniJavaParser.method_return method() throws RecognitionException {
        MiniJavaParser.method_return retval = new MiniJavaParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MODIFiER29=null;
        Token STATIC30=null;
        MiniJavaParser.methodtype_return methodtype31 =null;


        Object MODIFiER29_tree=null;
        Object STATIC30_tree=null;
        RewriteRuleTokenStream stream_MODIFiER=new RewriteRuleTokenStream(adaptor,"token MODIFiER");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleSubtreeStream stream_methodtype=new RewriteRuleSubtreeStream(adaptor,"rule methodtype");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:9: ( ( ( MODIFiER )? ( STATIC )? methodtype ) -> ^( Method ( MODIFiER )? ( STATIC )? methodtype ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:17: ( ( MODIFiER )? ( STATIC )? methodtype )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:17: ( ( MODIFiER )? ( STATIC )? methodtype )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:18: ( MODIFiER )? ( STATIC )? methodtype
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:18: ( MODIFiER )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==MODIFiER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:18: MODIFiER
                    {
                    MODIFiER29=(Token)match(input,MODIFiER,FOLLOW_MODIFiER_in_method404);  
                    stream_MODIFiER.add(MODIFiER29);


                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:28: ( STATIC )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==STATIC) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:28: STATIC
                    {
                    STATIC30=(Token)match(input,STATIC,FOLLOW_STATIC_in_method407);  
                    stream_STATIC.add(STATIC30);


                    }
                    break;

            }


            pushFollow(FOLLOW_methodtype_in_method410);
            methodtype31=methodtype();

            state._fsp--;

            stream_methodtype.add(methodtype31.getTree());

            }


            // AST REWRITE
            // elements: MODIFiER, STATIC, methodtype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:48: -> ^( Method ( MODIFiER )? ( STATIC )? methodtype )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:51: ^( Method ( MODIFiER )? ( STATIC )? methodtype )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Method, "Method")
                , root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:60: ( MODIFiER )?
                if ( stream_MODIFiER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_MODIFiER.nextNode()
                    );

                }
                stream_MODIFiER.reset();

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:70: ( STATIC )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:1: methodtype : ( voidmethod | returnmethod ) ^;
    public final MiniJavaParser.methodtype_return methodtype() throws RecognitionException {
        MiniJavaParser.methodtype_return retval = new MiniJavaParser.methodtype_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.voidmethod_return voidmethod32 =null;

        MiniJavaParser.returnmethod_return returnmethod33 =null;



        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:12: ( ( voidmethod | returnmethod ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:14: ( voidmethod | returnmethod ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:14: ( voidmethod | returnmethod )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==VOID) ) {
                alt8=1;
            }
            else if ( (LA8_0==BOOLEAN||LA8_0==DOUBLE||LA8_0==ID||LA8_0==INT||LA8_0==STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:15: voidmethod
                    {
                    pushFollow(FOLLOW_voidmethod_in_methodtype446);
                    voidmethod32=voidmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, voidmethod32.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:82:26: returnmethod
                    {
                    pushFollow(FOLLOW_returnmethod_in_methodtype448);
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:1: voidmethod : ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) ;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:17: ( ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:22: ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:22: ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:23: VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC
            {
            VOID34=(Token)match(input,VOID,FOLLOW_VOID_in_voidmethod467);  
            stream_VOID.add(VOID34);


            ID35=(Token)match(input,ID,FOLLOW_ID_in_voidmethod469);  
            stream_ID.add(ID35);


            PO36=(Token)match(input,PO,FOLLOW_PO_in_voidmethod471);  
            stream_PO.add(PO36);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:34: ( type ID ( COMA type ID )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BOOLEAN||LA10_0==DOUBLE||LA10_0==ID||LA10_0==INT||LA10_0==STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:35: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_voidmethod474);
                    type37=type();

                    state._fsp--;

                    stream_type.add(type37.getTree());

                    ID38=(Token)match(input,ID,FOLLOW_ID_in_voidmethod476);  
                    stream_ID.add(ID38);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:43: ( COMA type ID )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:84:44: COMA type ID
                    	    {
                    	    COMA39=(Token)match(input,COMA,FOLLOW_COMA_in_voidmethod479);  
                    	    stream_COMA.add(COMA39);


                    	    pushFollow(FOLLOW_type_in_voidmethod481);
                    	    type40=type();

                    	    state._fsp--;

                    	    stream_type.add(type40.getTree());

                    	    ID41=(Token)match(input,ID,FOLLOW_ID_in_voidmethod483);  
                    	    stream_ID.add(ID41);


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            PC42=(Token)match(input,PC,FOLLOW_PC_in_voidmethod489);  
            stream_PC.add(PC42);


            CBO43=(Token)match(input,CBO,FOLLOW_CBO_in_voidmethod491);  
            stream_CBO.add(CBO43);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:12: ( statment )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BOOLEAN||LA11_0==DOUBLE||(LA11_0 >= ID && LA11_0 <= INT)||LA11_0==MODIFiER||LA11_0==PRINT||(LA11_0 >= STATIC && LA11_0 <= STRING)||LA11_0==VOID||LA11_0==WHILE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:85:12: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_voidmethod505);
            	    statment44=statment();

            	    state._fsp--;

            	    stream_statment.add(statment44.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            CBC45=(Token)match(input,CBC,FOLLOW_CBC_in_voidmethod511);  
            stream_CBC.add(CBC45);


            }


            // AST REWRITE
            // elements: ID, ID, PC, statment, ID, type, VOID, PO, CBO, type, COMA, CBC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:9: -> ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:86:11: ^( VoidMethod VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:86:35: ( type ID ( COMA type ID )* )?
                if ( stream_ID.hasNext()||stream_ID.hasNext()||stream_type.hasNext()||stream_type.hasNext()||stream_COMA.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:86:44: ( COMA type ID )*
                    while ( stream_ID.hasNext()||stream_type.hasNext()||stream_COMA.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_COMA.nextNode()
                        );

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                    }
                    stream_ID.reset();
                    stream_type.reset();
                    stream_COMA.reset();

                }
                stream_ID.reset();
                stream_ID.reset();
                stream_type.reset();
                stream_type.reset();
                stream_COMA.reset();

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CBO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:86:69: ( statment )*
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:92:1: typev : ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^;
    public final MiniJavaParser.typev_return typev() throws RecognitionException {
        MiniJavaParser.typev_return retval = new MiniJavaParser.typev_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set46=null;

        Object set46_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:92:8: ( ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:92:10: ( INT | DOUBLE | STRING | BOOLEAN | ID ) ^
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:1: type : ( typev ( SBO SBC )? ) -> ^( Type typev ( SBO SBC )? ) ;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:11: ( ( typev ( SBO SBC )? ) -> ^( Type typev ( SBO SBC )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:13: ( typev ( SBO SBC )? )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:13: ( typev ( SBO SBC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:14: typev ( SBO SBC )?
            {
            pushFollow(FOLLOW_typev_in_type595);
            typev47=typev();

            state._fsp--;

            stream_typev.add(typev47.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:20: ( SBO SBC )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==SBO) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==SBC) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==ID||LA12_3==PO||LA12_3==SBO) ) {
                        alt12=1;
                    }
                }
            }
            switch (alt12) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:21: SBO SBC
                    {
                    SBO48=(Token)match(input,SBO,FOLLOW_SBO_in_type598);  
                    stream_SBO.add(SBO48);


                    SBC49=(Token)match(input,SBC,FOLLOW_SBC_in_type600);  
                    stream_SBC.add(SBC49);


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
            // 94:32: -> ^( Type typev ( SBO SBC )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:35: ^( Type typev ( SBO SBC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Type, "Type")
                , root_1);

                adaptor.addChild(root_1, stream_typev.nextTree());

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:94:48: ( SBO SBC )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:1: returnmethod : ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) ;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:15: ( ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:17: ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:17: ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:18: type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC
            {
            pushFollow(FOLLOW_type_in_returnmethod641);
            type50=type();

            state._fsp--;

            stream_type.add(type50.getTree());

            ID51=(Token)match(input,ID,FOLLOW_ID_in_returnmethod643);  
            stream_ID.add(ID51);


            PO52=(Token)match(input,PO,FOLLOW_PO_in_returnmethod645);  
            stream_PO.add(PO52);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:29: ( type ID ( COMA type ID )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BOOLEAN||LA14_0==DOUBLE||LA14_0==ID||LA14_0==INT||LA14_0==STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:30: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_returnmethod648);
                    type53=type();

                    state._fsp--;

                    stream_type.add(type53.getTree());

                    ID54=(Token)match(input,ID,FOLLOW_ID_in_returnmethod650);  
                    stream_ID.add(ID54);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:38: ( COMA type ID )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:100:39: COMA type ID
                    	    {
                    	    COMA55=(Token)match(input,COMA,FOLLOW_COMA_in_returnmethod653);  
                    	    stream_COMA.add(COMA55);


                    	    pushFollow(FOLLOW_type_in_returnmethod655);
                    	    type56=type();

                    	    state._fsp--;

                    	    stream_type.add(type56.getTree());

                    	    ID57=(Token)match(input,ID,FOLLOW_ID_in_returnmethod657);  
                    	    stream_ID.add(ID57);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            PC58=(Token)match(input,PC,FOLLOW_PC_in_returnmethod663);  
            stream_PC.add(PC58);


            CBO59=(Token)match(input,CBO,FOLLOW_CBO_in_returnmethod665);  
            stream_CBO.add(CBO59);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:101:6: ( statment )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==BOOLEAN||LA15_0==DOUBLE||(LA15_0 >= ID && LA15_0 <= INT)||LA15_0==MODIFiER||LA15_0==PRINT||(LA15_0 >= STATIC && LA15_0 <= STRING)||LA15_0==VOID||LA15_0==WHILE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:101:6: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_returnmethod684);
            	    statment60=statment();

            	    state._fsp--;

            	    stream_statment.add(statment60.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            RETURNV61=(Token)match(input,RETURNV,FOLLOW_RETURNV_in_returnmethod711);  
            stream_RETURNV.add(RETURNV61);


            pushFollow(FOLLOW_arithExpr_in_returnmethod713);
            arithExpr62=arithExpr();

            state._fsp--;

            stream_arithExpr.add(arithExpr62.getTree());

            SEMICOLON63=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnmethod715);  
            stream_SEMICOLON.add(SEMICOLON63);


            CBC64=(Token)match(input,CBC,FOLLOW_CBC_in_returnmethod720);  
            stream_CBC.add(CBC64);


            }


            // AST REWRITE
            // elements: PC, type, ID, COMA, type, statment, ID, CBO, RETURNV, PO, CBC, SEMICOLON, type, ID, arithExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:9: -> ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:11: ^( ReturnMethod type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:37: ( type ID ( COMA type ID )* )?
                if ( stream_ID.hasNext()||stream_type.hasNext()||stream_ID.hasNext()||stream_COMA.hasNext()||stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:46: ( COMA type ID )*
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
                stream_type.reset();
                stream_ID.reset();
                stream_COMA.reset();
                stream_type.reset();

                adaptor.addChild(root_1, 
                stream_PC.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_CBO.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:103:71: ( statment )*
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:109:1: statment : ( ( print ) -> ^( Printstmt print ) | ( initialize ) -> ^( Initialize initialize ) | ( ifstmt ) -> ^( Ifstmt ifstmt ) | ( whilestmt ) -> ^( Whilestmt whilestmt ) | ( funcCall SEMICOLON ) -> ^( FuncCall funcCall SEMICOLON ) | ( method ) -> ^( Method method ) );
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

        MiniJavaParser.method_return method71 =null;


        Object SEMICOLON70_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
        RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
        RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
        RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmt");
        RewriteRuleSubtreeStream stream_initialize=new RewriteRuleSubtreeStream(adaptor,"rule initialize");
        RewriteRuleSubtreeStream stream_funcCall=new RewriteRuleSubtreeStream(adaptor,"rule funcCall");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:109:10: ( ( print ) -> ^( Printstmt print ) | ( initialize ) -> ^( Initialize initialize ) | ( ifstmt ) -> ^( Ifstmt ifstmt ) | ( whilestmt ) -> ^( Whilestmt whilestmt ) | ( funcCall SEMICOLON ) -> ^( FuncCall funcCall SEMICOLON ) | ( method ) -> ^( Method method ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt16=1;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case PO:
                    {
                    alt16=5;
                    }
                    break;
                case SBO:
                    {
                    int LA16_8 = input.LA(3);

                    if ( (LA16_8==SBC) ) {
                        int LA16_12 = input.LA(4);

                        if ( (LA16_12==ID) ) {
                            int LA16_9 = input.LA(5);

                            if ( (LA16_9==PO) ) {
                                alt16=6;
                            }
                            else if ( (LA16_9==EQUAL||(LA16_9 >= SBO && LA16_9 <= SEMICOLON)) ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 9, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA16_12==EQUAL||LA16_12==SEMICOLON) ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 12, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA16_8==BOOL||LA16_8==DNUM||LA16_8==ID||LA16_8==MINUS||(LA16_8 >= NOT && LA16_8 <= NUM)||LA16_8==PO) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 8, input);

                        throw nvae;

                    }
                    }
                    break;
                case ID:
                    {
                    int LA16_9 = input.LA(3);

                    if ( (LA16_9==PO) ) {
                        alt16=6;
                    }
                    else if ( (LA16_9==EQUAL||(LA16_9 >= SBO && LA16_9 <= SEMICOLON)) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 9, input);

                        throw nvae;

                    }
                    }
                    break;
                case EQUAL:
                case SEMICOLON:
                    {
                    alt16=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }

                }
                break;
            case BOOLEAN:
            case DOUBLE:
            case INT:
            case STRING:
                {
                int LA16_3 = input.LA(2);

                if ( (LA16_3==SBO) ) {
                    int LA16_11 = input.LA(3);

                    if ( (LA16_11==SBC) ) {
                        int LA16_13 = input.LA(4);

                        if ( (LA16_13==ID) ) {
                            int LA16_9 = input.LA(5);

                            if ( (LA16_9==PO) ) {
                                alt16=6;
                            }
                            else if ( (LA16_9==EQUAL||(LA16_9 >= SBO && LA16_9 <= SEMICOLON)) ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 9, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 13, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 11, input);

                        throw nvae;

                    }
                }
                else if ( (LA16_3==ID) ) {
                    int LA16_9 = input.LA(3);

                    if ( (LA16_9==PO) ) {
                        alt16=6;
                    }
                    else if ( (LA16_9==EQUAL||(LA16_9 >= SBO && LA16_9 <= SEMICOLON)) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt16=3;
                }
                break;
            case WHILE:
                {
                alt16=4;
                }
                break;
            case MODIFiER:
            case STATIC:
            case VOID:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:109:12: ( print )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:109:12: ( print )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:109:13: print
                    {
                    pushFollow(FOLLOW_print_in_statment785);
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
                    // 109:20: -> ^( Printstmt print )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:109:23: ^( Printstmt print )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:19: ( initialize )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:19: ( initialize )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:20: initialize
                    {
                    pushFollow(FOLLOW_initialize_in_statment815);
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
                    // 110:32: -> ^( Initialize initialize )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:110:35: ^( Initialize initialize )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:111:18: ( ifstmt )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:111:18: ( ifstmt )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:111:19: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statment844);
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
                    // 111:27: -> ^( Ifstmt ifstmt )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:111:30: ^( Ifstmt ifstmt )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:19: ( whilestmt )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:19: ( whilestmt )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:20: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statment874);
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
                    // 112:31: -> ^( Whilestmt whilestmt )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:112:34: ^( Whilestmt whilestmt )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:113:19: ( funcCall SEMICOLON )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:113:19: ( funcCall SEMICOLON )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:113:20: funcCall SEMICOLON
                    {
                    pushFollow(FOLLOW_funcCall_in_statment904);
                    funcCall69=funcCall();

                    state._fsp--;

                    stream_funcCall.add(funcCall69.getTree());

                    SEMICOLON70=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statment906);  
                    stream_SEMICOLON.add(SEMICOLON70);


                    }


                    // AST REWRITE
                    // elements: SEMICOLON, funcCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:40: -> ^( FuncCall funcCall SEMICOLON )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:113:43: ^( FuncCall funcCall SEMICOLON )
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
                case 6 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:114:19: ( method )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:114:19: ( method )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:114:20: method
                    {
                    pushFollow(FOLLOW_method_in_statment938);
                    method71=method();

                    state._fsp--;

                    stream_method.add(method71.getTree());

                    }


                    // AST REWRITE
                    // elements: method
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:28: -> ^( Method method )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:114:31: ^( Method method )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Method, "Method")
                        , root_1);

                        adaptor.addChild(root_1, stream_method.nextTree());

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:1: print : ( PRINT PO printThings PC SEMICOLON ) -> ^( Printstmt PRINT PO printThings PC SEMICOLON ) ;
    public final MiniJavaParser.print_return print() throws RecognitionException {
        MiniJavaParser.print_return retval = new MiniJavaParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT72=null;
        Token PO73=null;
        Token PC75=null;
        Token SEMICOLON76=null;
        MiniJavaParser.printThings_return printThings74 =null;


        Object PRINT72_tree=null;
        Object PO73_tree=null;
        Object PC75_tree=null;
        Object SEMICOLON76_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_printThings=new RewriteRuleSubtreeStream(adaptor,"rule printThings");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:8: ( ( PRINT PO printThings PC SEMICOLON ) -> ^( Printstmt PRINT PO printThings PC SEMICOLON ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:10: ( PRINT PO printThings PC SEMICOLON )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:10: ( PRINT PO printThings PC SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:11: PRINT PO printThings PC SEMICOLON
            {
            PRINT72=(Token)match(input,PRINT,FOLLOW_PRINT_in_print970);  
            stream_PRINT.add(PRINT72);


            PO73=(Token)match(input,PO,FOLLOW_PO_in_print972);  
            stream_PO.add(PO73);


            pushFollow(FOLLOW_printThings_in_print974);
            printThings74=printThings();

            state._fsp--;

            stream_printThings.add(printThings74.getTree());

            PC75=(Token)match(input,PC,FOLLOW_PC_in_print976);  
            stream_PC.add(PC75);


            SEMICOLON76=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print978);  
            stream_SEMICOLON.add(SEMICOLON76);


            }


            // AST REWRITE
            // elements: SEMICOLON, PRINT, PC, PO, printThings
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:46: -> ^( Printstmt PRINT PO printThings PC SEMICOLON )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:120:49: ^( Printstmt PRINT PO printThings PC SEMICOLON )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:1: printThings : ( TEXT | arithExpr | funcCall | declobj ) ^;
    public final MiniJavaParser.printThings_return printThings() throws RecognitionException {
        MiniJavaParser.printThings_return retval = new MiniJavaParser.printThings_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT77=null;
        MiniJavaParser.arithExpr_return arithExpr78 =null;

        MiniJavaParser.funcCall_return funcCall79 =null;

        MiniJavaParser.declobj_return declobj80 =null;


        Object TEXT77_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:13: ( ( TEXT | arithExpr | funcCall | declobj ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:15: ( TEXT | arithExpr | funcCall | declobj ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:15: ( TEXT | arithExpr | funcCall | declobj )
            int alt17=4;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt17=1;
                }
                break;
            case ID:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==PO) ) {
                    alt17=3;
                }
                else if ( (LA17_2==DIV||LA17_2==DOT||LA17_2==MINUS||LA17_2==MULTI||(LA17_2 >= PC && LA17_2 <= PLUS)||LA17_2==SBO) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

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
                alt17=2;
                }
                break;
            case NEW:
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:16: TEXT
                    {
                    TEXT77=(Token)match(input,TEXT,FOLLOW_TEXT_in_printThings1018); 
                    TEXT77_tree = 
                    (Object)adaptor.create(TEXT77)
                    ;
                    adaptor.addChild(root_0, TEXT77_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:21: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_printThings1020);
                    arithExpr78=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr78.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:31: funcCall
                    {
                    pushFollow(FOLLOW_funcCall_in_printThings1022);
                    funcCall79=funcCall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcCall79.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:126:40: declobj
                    {
                    pushFollow(FOLLOW_declobj_in_printThings1024);
                    declobj80=declobj();

                    state._fsp--;

                    adaptor.addChild(root_0, declobj80.getTree());

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:1: initialize : ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) ;
    public final MiniJavaParser.initialize_return initialize() throws RecognitionException {
        MiniJavaParser.initialize_return retval = new MiniJavaParser.initialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID82=null;
        Token SBO83=null;
        Token SBC85=null;
        Token SEMICOLON87=null;
        MiniJavaParser.type_return type81 =null;

        MiniJavaParser.arithExpr_return arithExpr84 =null;

        MiniJavaParser.declaration_return declaration86 =null;


        Object ID82_tree=null;
        Object SBO83_tree=null;
        Object SBC85_tree=null;
        Object SEMICOLON87_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:12: ( ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:14: ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:14: ( ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:15: ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:15: ( type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==SBO) ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3==SBC) ) {
                        int LA18_5 = input.LA(4);

                        if ( (LA18_5==ID) ) {
                            alt18=1;
                        }
                    }
                }
                else if ( (LA18_1==ID) ) {
                    alt18=1;
                }
            }
            else if ( (LA18_0==BOOLEAN||LA18_0==DOUBLE||LA18_0==INT||LA18_0==STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:15: type
                    {
                    pushFollow(FOLLOW_type_in_initialize1035);
                    type81=type();

                    state._fsp--;

                    stream_type.add(type81.getTree());

                    }
                    break;

            }


            ID82=(Token)match(input,ID,FOLLOW_ID_in_initialize1038);  
            stream_ID.add(ID82);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:24: ( SBO ( arithExpr )? SBC )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==SBO) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:25: SBO ( arithExpr )? SBC
                    {
                    SBO83=(Token)match(input,SBO,FOLLOW_SBO_in_initialize1041);  
                    stream_SBO.add(SBO83);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:29: ( arithExpr )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==BOOL||LA19_0==DNUM||LA19_0==ID||LA19_0==MINUS||(LA19_0 >= NOT && LA19_0 <= NUM)||LA19_0==PO) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:30: arithExpr
                            {
                            pushFollow(FOLLOW_arithExpr_in_initialize1044);
                            arithExpr84=arithExpr();

                            state._fsp--;

                            stream_arithExpr.add(arithExpr84.getTree());

                            }
                            break;

                    }


                    SBC85=(Token)match(input,SBC,FOLLOW_SBC_in_initialize1048);  
                    stream_SBC.add(SBC85);


                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:48: ( declaration )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EQUAL) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:48: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_initialize1052);
                    declaration86=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration86.getTree());

                    }
                    break;

            }


            SEMICOLON87=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize1055);  
            stream_SEMICOLON.add(SEMICOLON87);


            }


            // AST REWRITE
            // elements: ID, SBO, arithExpr, declaration, SBC, type, SEMICOLON
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:72: -> ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:75: ^( Initialize ( type )? ID ( SBO ( arithExpr )? SBC )? ( declaration )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Initialize, "Initialize")
                , root_1);

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:88: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:97: ( SBO ( arithExpr )? SBC )?
                if ( stream_SBO.hasNext()||stream_arithExpr.hasNext()||stream_SBC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SBO.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:102: ( arithExpr )?
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:128:121: ( declaration )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:1: declaration : ( EQUAL declThings ) -> ^( Declaration EQUAL declThings ) ;
    public final MiniJavaParser.declaration_return declaration() throws RecognitionException {
        MiniJavaParser.declaration_return retval = new MiniJavaParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL88=null;
        MiniJavaParser.declThings_return declThings89 =null;


        Object EQUAL88_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_declThings=new RewriteRuleSubtreeStream(adaptor,"rule declThings");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:13: ( ( EQUAL declThings ) -> ^( Declaration EQUAL declThings ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:15: ( EQUAL declThings )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:15: ( EQUAL declThings )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:16: EQUAL declThings
            {
            EQUAL88=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration1106);  
            stream_EQUAL.add(EQUAL88);


            pushFollow(FOLLOW_declThings_in_declaration1108);
            declThings89=declThings();

            state._fsp--;

            stream_declThings.add(declThings89.getTree());

            }


            // AST REWRITE
            // elements: declThings, EQUAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:34: -> ^( Declaration EQUAL declThings )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:134:37: ^( Declaration EQUAL declThings )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:1: declThings : ( arithExpr | declobj | TEXT ) ^;
    public final MiniJavaParser.declThings_return declThings() throws RecognitionException {
        MiniJavaParser.declThings_return retval = new MiniJavaParser.declThings_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEXT92=null;
        MiniJavaParser.arithExpr_return arithExpr90 =null;

        MiniJavaParser.declobj_return declobj91 =null;


        Object TEXT92_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:12: ( ( arithExpr | declobj | TEXT ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:14: ( arithExpr | declobj | TEXT ) ^
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:14: ( arithExpr | declobj | TEXT )
            int alt22=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case DNUM:
            case ID:
            case MINUS:
            case NOT:
            case NUM:
            case PO:
                {
                alt22=1;
                }
                break;
            case NEW:
                {
                alt22=2;
                }
                break;
            case TEXT:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:15: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_declThings1141);
                    arithExpr90=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr90.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:25: declobj
                    {
                    pushFollow(FOLLOW_declobj_in_declThings1143);
                    declobj91=declobj();

                    state._fsp--;

                    adaptor.addChild(root_0, declobj91.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:140:33: TEXT
                    {
                    TEXT92=(Token)match(input,TEXT,FOLLOW_TEXT_in_declThings1145); 
                    TEXT92_tree = 
                    (Object)adaptor.create(TEXT92)
                    ;
                    adaptor.addChild(root_0, TEXT92_tree);


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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:1: declobj : ( NEW type declOR ) -> ^( DeclObj NEW type declOR ) ;
    public final MiniJavaParser.declobj_return declobj() throws RecognitionException {
        MiniJavaParser.declobj_return retval = new MiniJavaParser.declobj_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEW93=null;
        MiniJavaParser.type_return type94 =null;

        MiniJavaParser.declOR_return declOR95 =null;


        Object NEW93_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_declOR=new RewriteRuleSubtreeStream(adaptor,"rule declOR");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:10: ( ( NEW type declOR ) -> ^( DeclObj NEW type declOR ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:12: ( NEW type declOR )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:12: ( NEW type declOR )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:13: NEW type declOR
            {
            NEW93=(Token)match(input,NEW,FOLLOW_NEW_in_declobj1157);  
            stream_NEW.add(NEW93);


            pushFollow(FOLLOW_type_in_declobj1159);
            type94=type();

            state._fsp--;

            stream_type.add(type94.getTree());

            pushFollow(FOLLOW_declOR_in_declobj1161);
            declOR95=declOR();

            state._fsp--;

            stream_declOR.add(declOR95.getTree());

            }


            // AST REWRITE
            // elements: declOR, NEW, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 142:30: -> ^( DeclObj NEW type declOR )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:142:33: ^( DeclObj NEW type declOR )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:1: declOR1 : PO ( parameters )? PC ( dotvlaues )* ;
    public final MiniJavaParser.declOR1_return declOR1() throws RecognitionException {
        MiniJavaParser.declOR1_return retval = new MiniJavaParser.declOR1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PO96=null;
        Token PC98=null;
        MiniJavaParser.parameters_return parameters97 =null;

        MiniJavaParser.dotvlaues_return dotvlaues99 =null;


        Object PO96_tree=null;
        Object PC98_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:10: ( PO ( parameters )? PC ( dotvlaues )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:12: PO ( parameters )? PC ( dotvlaues )*
            {
            root_0 = (Object)adaptor.nil();


            PO96=(Token)match(input,PO,FOLLOW_PO_in_declOR11195); 
            PO96_tree = 
            (Object)adaptor.create(PO96)
            ;
            adaptor.addChild(root_0, PO96_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:15: ( parameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BOOL||LA23_0==DNUM||LA23_0==ID||LA23_0==MINUS||(LA23_0 >= NOT && LA23_0 <= NUM)||LA23_0==PO) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:16: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_declOR11198);
                    parameters97=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters97.getTree());

                    }
                    break;

            }


            PC98=(Token)match(input,PC,FOLLOW_PC_in_declOR11202); 
            PC98_tree = 
            (Object)adaptor.create(PC98)
            ;
            adaptor.addChild(root_0, PC98_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:32: ( dotvlaues )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DOT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:147:32: dotvlaues
            	    {
            	    pushFollow(FOLLOW_dotvlaues_in_declOR11204);
            	    dotvlaues99=dotvlaues();

            	    state._fsp--;

            	    adaptor.addChild(root_0, dotvlaues99.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:148:1: declOR2 : SBO ( arithExpr )? SBC ;
    public final MiniJavaParser.declOR2_return declOR2() throws RecognitionException {
        MiniJavaParser.declOR2_return retval = new MiniJavaParser.declOR2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SBO100=null;
        Token SBC102=null;
        MiniJavaParser.arithExpr_return arithExpr101 =null;


        Object SBO100_tree=null;
        Object SBC102_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:148:10: ( SBO ( arithExpr )? SBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:148:12: SBO ( arithExpr )? SBC
            {
            root_0 = (Object)adaptor.nil();


            SBO100=(Token)match(input,SBO,FOLLOW_SBO_in_declOR21213); 
            SBO100_tree = 
            (Object)adaptor.create(SBO100)
            ;
            adaptor.addChild(root_0, SBO100_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:148:16: ( arithExpr )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BOOL||LA25_0==DNUM||LA25_0==ID||LA25_0==MINUS||(LA25_0 >= NOT && LA25_0 <= NUM)||LA25_0==PO) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:148:17: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_declOR21216);
                    arithExpr101=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr101.getTree());

                    }
                    break;

            }


            SBC102=(Token)match(input,SBC,FOLLOW_SBC_in_declOR21220); 
            SBC102_tree = 
            (Object)adaptor.create(SBC102)
            ;
            adaptor.addChild(root_0, SBC102_tree);


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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:150:1: declOR : ( ( declOR1 ) -> ^( DeclOr declOR1 ) | ( declOR2 ) -> ^( DeclOr declOR2 ) );
    public final MiniJavaParser.declOR_return declOR() throws RecognitionException {
        MiniJavaParser.declOR_return retval = new MiniJavaParser.declOR_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.declOR1_return declOR1103 =null;

        MiniJavaParser.declOR2_return declOR2104 =null;


        RewriteRuleSubtreeStream stream_declOR2=new RewriteRuleSubtreeStream(adaptor,"rule declOR2");
        RewriteRuleSubtreeStream stream_declOR1=new RewriteRuleSubtreeStream(adaptor,"rule declOR1");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:150:9: ( ( declOR1 ) -> ^( DeclOr declOR1 ) | ( declOR2 ) -> ^( DeclOr declOR2 ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==PO) ) {
                alt26=1;
            }
            else if ( (LA26_0==SBO) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:150:11: ( declOR1 )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:150:11: ( declOR1 )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:150:12: declOR1
                    {
                    pushFollow(FOLLOW_declOR1_in_declOR1230);
                    declOR1103=declOR1();

                    state._fsp--;

                    stream_declOR1.add(declOR1103.getTree());

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
                    // 150:21: -> ^( DeclOr declOR1 )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:150:24: ^( DeclOr declOR1 )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:151:5: ( declOR2 )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:151:5: ( declOR2 )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:151:6: declOR2
                    {
                    pushFollow(FOLLOW_declOR2_in_declOR1246);
                    declOR2104=declOR2();

                    state._fsp--;

                    stream_declOR2.add(declOR2104.getTree());

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
                    // 151:15: -> ^( DeclOr declOR2 )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:151:18: ^( DeclOr declOR2 )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:1: dotvlaues : ( DOT ID ( PO ( parameters )? PC )? ) -> ^( DotValues DOT ID ( PO ( parameters )? PC )? ) ;
    public final MiniJavaParser.dotvlaues_return dotvlaues() throws RecognitionException {
        MiniJavaParser.dotvlaues_return retval = new MiniJavaParser.dotvlaues_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT105=null;
        Token ID106=null;
        Token PO107=null;
        Token PC109=null;
        MiniJavaParser.parameters_return parameters108 =null;


        Object DOT105_tree=null;
        Object ID106_tree=null;
        Object PO107_tree=null;
        Object PC109_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:12: ( ( DOT ID ( PO ( parameters )? PC )? ) -> ^( DotValues DOT ID ( PO ( parameters )? PC )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:14: ( DOT ID ( PO ( parameters )? PC )? )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:14: ( DOT ID ( PO ( parameters )? PC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:15: DOT ID ( PO ( parameters )? PC )?
            {
            DOT105=(Token)match(input,DOT,FOLLOW_DOT_in_dotvlaues1278);  
            stream_DOT.add(DOT105);


            ID106=(Token)match(input,ID,FOLLOW_ID_in_dotvlaues1280);  
            stream_ID.add(ID106);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:22: ( PO ( parameters )? PC )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==PO) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:23: PO ( parameters )? PC
                    {
                    PO107=(Token)match(input,PO,FOLLOW_PO_in_dotvlaues1283);  
                    stream_PO.add(PO107);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:26: ( parameters )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==BOOL||LA27_0==DNUM||LA27_0==ID||LA27_0==MINUS||(LA27_0 >= NOT && LA27_0 <= NUM)||LA27_0==PO) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:27: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_dotvlaues1286);
                            parameters108=parameters();

                            state._fsp--;

                            stream_parameters.add(parameters108.getTree());

                            }
                            break;

                    }


                    PC109=(Token)match(input,PC,FOLLOW_PC_in_dotvlaues1290);  
                    stream_PC.add(PC109);


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: parameters, PO, DOT, PC, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 157:46: -> ^( DotValues DOT ID ( PO ( parameters )? PC )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:49: ^( DotValues DOT ID ( PO ( parameters )? PC )? )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:68: ( PO ( parameters )? PC )?
                if ( stream_parameters.hasNext()||stream_PO.hasNext()||stream_PC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_PO.nextNode()
                    );

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:157:72: ( parameters )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:1: ifstmt : ( IF PO condition PC block ( ELSE block )? ) -> ^( Ifstmt IF PO condition PC block ( ELSE block )? ) ;
    public final MiniJavaParser.ifstmt_return ifstmt() throws RecognitionException {
        MiniJavaParser.ifstmt_return retval = new MiniJavaParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF110=null;
        Token PO111=null;
        Token PC113=null;
        Token ELSE115=null;
        MiniJavaParser.condition_return condition112 =null;

        MiniJavaParser.block_return block114 =null;

        MiniJavaParser.block_return block116 =null;


        Object IF110_tree=null;
        Object PO111_tree=null;
        Object PC113_tree=null;
        Object ELSE115_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:9: ( ( IF PO condition PC block ( ELSE block )? ) -> ^( Ifstmt IF PO condition PC block ( ELSE block )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:11: ( IF PO condition PC block ( ELSE block )? )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:11: ( IF PO condition PC block ( ELSE block )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:12: IF PO condition PC block ( ELSE block )?
            {
            IF110=(Token)match(input,IF,FOLLOW_IF_in_ifstmt1338);  
            stream_IF.add(IF110);


            PO111=(Token)match(input,PO,FOLLOW_PO_in_ifstmt1340);  
            stream_PO.add(PO111);


            pushFollow(FOLLOW_condition_in_ifstmt1342);
            condition112=condition();

            state._fsp--;

            stream_condition.add(condition112.getTree());

            PC113=(Token)match(input,PC,FOLLOW_PC_in_ifstmt1344);  
            stream_PC.add(PC113);


            pushFollow(FOLLOW_block_in_ifstmt1346);
            block114=block();

            state._fsp--;

            stream_block.add(block114.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:36: ( ELSE block )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ELSE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:38: ELSE block
                    {
                    ELSE115=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifstmt1349);  
                    stream_ELSE.add(ELSE115);


                    pushFollow(FOLLOW_block_in_ifstmt1351);
                    block116=block();

                    state._fsp--;

                    stream_block.add(block116.getTree());

                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: condition, PO, IF, block, ELSE, PC, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:53: -> ^( Ifstmt IF PO condition PC block ( ELSE block )? )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:56: ^( Ifstmt IF PO condition PC block ( ELSE block )? )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:163:89: ( ELSE block )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:170:1: condition : arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )* ;
    public final MiniJavaParser.condition_return condition() throws RecognitionException {
        MiniJavaParser.condition_return retval = new MiniJavaParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set118=null;
        MiniJavaParser.arithExpr_return arithExpr117 =null;

        MiniJavaParser.arithExpr_return arithExpr119 =null;


        Object set118_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:170:11: ( arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:170:13: arithExpr ( ( COMPARISONS | AndOr ) ^ arithExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arithExpr_in_condition1401);
            arithExpr117=arithExpr();

            state._fsp--;

            adaptor.addChild(root_0, arithExpr117.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:170:23: ( ( COMPARISONS | AndOr ) ^ arithExpr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==AndOr||LA30_0==COMPARISONS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:170:24: ( COMPARISONS | AndOr ) ^ arithExpr
            	    {
            	    set118=(Token)input.LT(1);

            	    set118=(Token)input.LT(1);

            	    if ( input.LA(1)==AndOr||input.LA(1)==COMPARISONS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set118)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_arithExpr_in_condition1411);
            	    arithExpr119=arithExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arithExpr119.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:1: block : ( ( CBO ( statment )* CBC ) -> ^( Block CBO ( statment )* CBC ) | ( statment ) -> ^( Block statment ) );
    public final MiniJavaParser.block_return block() throws RecognitionException {
        MiniJavaParser.block_return retval = new MiniJavaParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CBO120=null;
        Token CBC122=null;
        MiniJavaParser.statment_return statment121 =null;

        MiniJavaParser.statment_return statment123 =null;


        Object CBO120_tree=null;
        Object CBC122_tree=null;
        RewriteRuleTokenStream stream_CBO=new RewriteRuleTokenStream(adaptor,"token CBO");
        RewriteRuleTokenStream stream_CBC=new RewriteRuleTokenStream(adaptor,"token CBC");
        RewriteRuleSubtreeStream stream_statment=new RewriteRuleSubtreeStream(adaptor,"rule statment");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:8: ( ( CBO ( statment )* CBC ) -> ^( Block CBO ( statment )* CBC ) | ( statment ) -> ^( Block statment ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==CBO) ) {
                alt32=1;
            }
            else if ( (LA32_0==BOOLEAN||LA32_0==DOUBLE||(LA32_0 >= ID && LA32_0 <= INT)||LA32_0==MODIFiER||LA32_0==PRINT||(LA32_0 >= STATIC && LA32_0 <= STRING)||LA32_0==VOID||LA32_0==WHILE) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:10: ( CBO ( statment )* CBC )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:10: ( CBO ( statment )* CBC )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:11: CBO ( statment )* CBC
                    {
                    CBO120=(Token)match(input,CBO,FOLLOW_CBO_in_block1450);  
                    stream_CBO.add(CBO120);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:15: ( statment )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==BOOLEAN||LA31_0==DOUBLE||(LA31_0 >= ID && LA31_0 <= INT)||LA31_0==MODIFiER||LA31_0==PRINT||(LA31_0 >= STATIC && LA31_0 <= STRING)||LA31_0==VOID||LA31_0==WHILE) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:15: statment
                    	    {
                    	    pushFollow(FOLLOW_statment_in_block1452);
                    	    statment121=statment();

                    	    state._fsp--;

                    	    stream_statment.add(statment121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    CBC122=(Token)match(input,CBC,FOLLOW_CBC_in_block1455);  
                    stream_CBC.add(CBC122);


                    }


                    // AST REWRITE
                    // elements: CBC, statment, CBO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:30: -> ^( Block CBO ( statment )* CBC )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:33: ^( Block CBO ( statment )* CBC )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Block, "Block")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CBO.nextNode()
                        );

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:176:45: ( statment )*
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:177:6: ( statment )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:177:6: ( statment )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:177:7: statment
                    {
                    pushFollow(FOLLOW_statment_in_block1477);
                    statment123=statment();

                    state._fsp--;

                    stream_statment.add(statment123.getTree());

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
                    // 177:17: -> ^( Block statment )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:177:20: ^( Block statment )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:1: funcCall : ( ID PO ( parameters )? PC ) -> ^( FuncCall ID PO ( parameters )? PC ) ;
    public final MiniJavaParser.funcCall_return funcCall() throws RecognitionException {
        MiniJavaParser.funcCall_return retval = new MiniJavaParser.funcCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID124=null;
        Token PO125=null;
        Token PC127=null;
        MiniJavaParser.parameters_return parameters126 =null;


        Object ID124_tree=null;
        Object PO125_tree=null;
        Object PC127_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:10: ( ( ID PO ( parameters )? PC ) -> ^( FuncCall ID PO ( parameters )? PC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:12: ( ID PO ( parameters )? PC )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:12: ( ID PO ( parameters )? PC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:13: ID PO ( parameters )? PC
            {
            ID124=(Token)match(input,ID,FOLLOW_ID_in_funcCall1508);  
            stream_ID.add(ID124);


            PO125=(Token)match(input,PO,FOLLOW_PO_in_funcCall1510);  
            stream_PO.add(PO125);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:19: ( parameters )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BOOL||LA33_0==DNUM||LA33_0==ID||LA33_0==MINUS||(LA33_0 >= NOT && LA33_0 <= NUM)||LA33_0==PO) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:21: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_funcCall1514);
                    parameters126=parameters();

                    state._fsp--;

                    stream_parameters.add(parameters126.getTree());

                    }
                    break;

            }


            PC127=(Token)match(input,PC,FOLLOW_PC_in_funcCall1518);  
            stream_PC.add(PC127);


            }


            // AST REWRITE
            // elements: ID, parameters, PO, PC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 183:38: -> ^( FuncCall ID PO ( parameters )? PC )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:41: ^( FuncCall ID PO ( parameters )? PC )
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

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:183:58: ( parameters )?
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:1: parameters : ( arithExpr ( COMA arithExpr )* ) -> ^( Parameters arithExpr ( COMA arithExpr )* ) ;
    public final MiniJavaParser.parameters_return parameters() throws RecognitionException {
        MiniJavaParser.parameters_return retval = new MiniJavaParser.parameters_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMA129=null;
        MiniJavaParser.arithExpr_return arithExpr128 =null;

        MiniJavaParser.arithExpr_return arithExpr130 =null;


        Object COMA129_tree=null;
        RewriteRuleTokenStream stream_COMA=new RewriteRuleTokenStream(adaptor,"token COMA");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:12: ( ( arithExpr ( COMA arithExpr )* ) -> ^( Parameters arithExpr ( COMA arithExpr )* ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:14: ( arithExpr ( COMA arithExpr )* )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:14: ( arithExpr ( COMA arithExpr )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:15: arithExpr ( COMA arithExpr )*
            {
            pushFollow(FOLLOW_arithExpr_in_parameters1559);
            arithExpr128=arithExpr();

            state._fsp--;

            stream_arithExpr.add(arithExpr128.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:25: ( COMA arithExpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:26: COMA arithExpr
            	    {
            	    COMA129=(Token)match(input,COMA,FOLLOW_COMA_in_parameters1562);  
            	    stream_COMA.add(COMA129);


            	    pushFollow(FOLLOW_arithExpr_in_parameters1564);
            	    arithExpr130=arithExpr();

            	    state._fsp--;

            	    stream_arithExpr.add(arithExpr130.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
            // 189:44: -> ^( Parameters arithExpr ( COMA arithExpr )* )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:47: ^( Parameters arithExpr ( COMA arithExpr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Parameters, "Parameters")
                , root_1);

                adaptor.addChild(root_1, stream_arithExpr.nextTree());

                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:189:70: ( COMA arithExpr )*
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:1: whilestmt : ( WHILE PO condition PC block ) -> ^( While WHILE PO condition PC block ) ;
    public final MiniJavaParser.whilestmt_return whilestmt() throws RecognitionException {
        MiniJavaParser.whilestmt_return retval = new MiniJavaParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE131=null;
        Token PO132=null;
        Token PC134=null;
        MiniJavaParser.condition_return condition133 =null;

        MiniJavaParser.block_return block135 =null;


        Object WHILE131_tree=null;
        Object PO132_tree=null;
        Object PC134_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:11: ( ( WHILE PO condition PC block ) -> ^( While WHILE PO condition PC block ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:13: ( WHILE PO condition PC block )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:13: ( WHILE PO condition PC block )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:14: WHILE PO condition PC block
            {
            WHILE131=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilestmt1604);  
            stream_WHILE.add(WHILE131);


            PO132=(Token)match(input,PO,FOLLOW_PO_in_whilestmt1606);  
            stream_PO.add(PO132);


            pushFollow(FOLLOW_condition_in_whilestmt1608);
            condition133=condition();

            state._fsp--;

            stream_condition.add(condition133.getTree());

            PC134=(Token)match(input,PC,FOLLOW_PC_in_whilestmt1610);  
            stream_PC.add(PC134);


            pushFollow(FOLLOW_block_in_whilestmt1612);
            block135=block();

            state._fsp--;

            stream_block.add(block135.getTree());

            }


            // AST REWRITE
            // elements: block, PC, WHILE, PO, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 195:43: -> ^( While WHILE PO condition PC block )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:195:46: ^( While WHILE PO condition PC block )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:201:1: signs : ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^;
    public final MiniJavaParser.signs_return signs() throws RecognitionException {
        MiniJavaParser.signs_return retval = new MiniJavaParser.signs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set136=null;

        Object set136_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:201:8: ( ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^)
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:201:10: ( PLUS | MINUS | MULTI | DIV | REMINDER ) ^
            {
            root_0 = (Object)adaptor.nil();


            set136=(Token)input.LT(1);

            set136=(Token)input.LT(1);

            if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULTI||input.LA(1)==PLUS||input.LA(1)==REMINDER ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set136)
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:1: arrayOrObj : ( ( ( dotvlaues )* ) -> ^( ArrayOrObj ( dotvlaues )* ) | ( SBO arithExpr SBC ) -> ^( ArrayOrObj SBO arithExpr SBC ) );
    public final MiniJavaParser.arrayOrObj_return arrayOrObj() throws RecognitionException {
        MiniJavaParser.arrayOrObj_return retval = new MiniJavaParser.arrayOrObj_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SBO138=null;
        Token SBC140=null;
        MiniJavaParser.dotvlaues_return dotvlaues137 =null;

        MiniJavaParser.arithExpr_return arithExpr139 =null;


        Object SBO138_tree=null;
        Object SBC140_tree=null;
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SBC=new RewriteRuleTokenStream(adaptor,"token SBC");
        RewriteRuleSubtreeStream stream_dotvlaues=new RewriteRuleSubtreeStream(adaptor,"rule dotvlaues");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:12: ( ( ( dotvlaues )* ) -> ^( ArrayOrObj ( dotvlaues )* ) | ( SBO arithExpr SBC ) -> ^( ArrayOrObj SBO arithExpr SBC ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==AndOr||(LA36_0 >= COMA && LA36_0 <= COMPARISONS)||LA36_0==DIV||LA36_0==DOT||LA36_0==MINUS||LA36_0==MULTI||(LA36_0 >= PC && LA36_0 <= PLUS)||LA36_0==SBC||LA36_0==SEMICOLON) ) {
                alt36=1;
            }
            else if ( (LA36_0==SBO) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:14: ( ( dotvlaues )* )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:14: ( ( dotvlaues )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:15: ( dotvlaues )*
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:15: ( dotvlaues )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==DOT) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:15: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_arrayOrObj1671);
                    	    dotvlaues137=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues137.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
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
                    // 203:27: -> ^( ArrayOrObj ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:30: ^( ArrayOrObj ( dotvlaues )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayOrObj, "ArrayOrObj")
                        , root_1);

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:203:43: ( dotvlaues )*
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:204:5: ( SBO arithExpr SBC )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:204:5: ( SBO arithExpr SBC )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:204:6: SBO arithExpr SBC
                    {
                    SBO138=(Token)match(input,SBO,FOLLOW_SBO_in_arrayOrObj1689);  
                    stream_SBO.add(SBO138);


                    pushFollow(FOLLOW_arithExpr_in_arrayOrObj1691);
                    arithExpr139=arithExpr();

                    state._fsp--;

                    stream_arithExpr.add(arithExpr139.getTree());

                    SBC140=(Token)match(input,SBC,FOLLOW_SBC_in_arrayOrObj1693);  
                    stream_SBC.add(SBC140);


                    }


                    // AST REWRITE
                    // elements: SBO, SBC, arithExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:25: -> ^( ArrayOrObj SBO arithExpr SBC )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:204:28: ^( ArrayOrObj SBO arithExpr SBC )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:1: notCond : ( ( PO condition PC ( dotvlaues )* ) -> ^( NotCond PO condition PC ( dotvlaues )* ) | ( ID arrayOrObj ) -> ^( NotCond ID arrayOrObj ) );
    public final MiniJavaParser.notCond_return notCond() throws RecognitionException {
        MiniJavaParser.notCond_return retval = new MiniJavaParser.notCond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PO141=null;
        Token PC143=null;
        Token ID145=null;
        MiniJavaParser.condition_return condition142 =null;

        MiniJavaParser.dotvlaues_return dotvlaues144 =null;

        MiniJavaParser.arrayOrObj_return arrayOrObj146 =null;


        Object PO141_tree=null;
        Object PC143_tree=null;
        Object ID145_tree=null;
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_arrayOrObj=new RewriteRuleSubtreeStream(adaptor,"rule arrayOrObj");
        RewriteRuleSubtreeStream stream_dotvlaues=new RewriteRuleSubtreeStream(adaptor,"rule dotvlaues");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:10: ( ( PO condition PC ( dotvlaues )* ) -> ^( NotCond PO condition PC ( dotvlaues )* ) | ( ID arrayOrObj ) -> ^( NotCond ID arrayOrObj ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==PO) ) {
                alt38=1;
            }
            else if ( (LA38_0==ID) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:12: ( PO condition PC ( dotvlaues )* )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:12: ( PO condition PC ( dotvlaues )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:13: PO condition PC ( dotvlaues )*
                    {
                    PO141=(Token)match(input,PO,FOLLOW_PO_in_notCond1735);  
                    stream_PO.add(PO141);


                    pushFollow(FOLLOW_condition_in_notCond1737);
                    condition142=condition();

                    state._fsp--;

                    stream_condition.add(condition142.getTree());

                    PC143=(Token)match(input,PC,FOLLOW_PC_in_notCond1739);  
                    stream_PC.add(PC143);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:29: ( dotvlaues )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==DOT) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:29: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_notCond1741);
                    	    dotvlaues144=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues144.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    // AST REWRITE
                    // elements: condition, PC, dotvlaues, PO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:41: -> ^( NotCond PO condition PC ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:44: ^( NotCond PO condition PC ( dotvlaues )* )
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

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:210:70: ( dotvlaues )*
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:5: ( ID arrayOrObj )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:5: ( ID arrayOrObj )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:6: ID arrayOrObj
                    {
                    ID145=(Token)match(input,ID,FOLLOW_ID_in_notCond1765);  
                    stream_ID.add(ID145);


                    pushFollow(FOLLOW_arrayOrObj_in_notCond1767);
                    arrayOrObj146=arrayOrObj();

                    state._fsp--;

                    stream_arrayOrObj.add(arrayOrObj146.getTree());

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
                    // 211:21: -> ^( NotCond ID arrayOrObj )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:211:23: ^( NotCond ID arrayOrObj )
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:1: arithExpr : term ( ( PLUS | MINUS ) ^ term )* ;
    public final MiniJavaParser.arithExpr_return arithExpr() throws RecognitionException {
        MiniJavaParser.arithExpr_return retval = new MiniJavaParser.arithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set148=null;
        MiniJavaParser.term_return term147 =null;

        MiniJavaParser.term_return term149 =null;


        Object set148_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:11: ( term ( ( PLUS | MINUS ) ^ term )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:13: term ( ( PLUS | MINUS ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arithExpr1801);
            term147=term();

            state._fsp--;

            adaptor.addChild(root_0, term147.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:18: ( ( PLUS | MINUS ) ^ term )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==MINUS||LA39_0==PLUS) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:217:19: ( PLUS | MINUS ) ^ term
            	    {
            	    set148=(Token)input.LT(1);

            	    set148=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set148)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithExpr1814);
            	    term149=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term149.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:1: term : factor ( ( MULTI | DIV ) ^ factor )* ;
    public final MiniJavaParser.term_return term() throws RecognitionException {
        MiniJavaParser.term_return retval = new MiniJavaParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set151=null;
        MiniJavaParser.factor_return factor150 =null;

        MiniJavaParser.factor_return factor152 =null;


        Object set151_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:7: ( factor ( ( MULTI | DIV ) ^ factor )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:9: factor ( ( MULTI | DIV ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1825);
            factor150=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor150.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:16: ( ( MULTI | DIV ) ^ factor )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==DIV||LA40_0==MULTI) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:219:18: ( MULTI | DIV ) ^ factor
            	    {
            	    set151=(Token)input.LT(1);

            	    set151=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==MULTI ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set151)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term1840);
            	    factor152=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor152.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:1: factor : ( ( ID arrayOrObj ) -> ^( Factor ID arrayOrObj ) | ( NUM ) -> ^( Factor NUM ) | ( DNUM ) -> ^( Factor DNUM ) | ( MINUS ID ) -> ^( Factor MINUS ID ) | ( MINUS NUM ) -> ^( Factor MINUS NUM ) | ( MINUS DNUM ) -> ^( Factor MINUS DNUM ) | ( NOT notCond ) -> ^( Factor NOT notCond ) | ( PO condition PC ( dotvlaues )* ) -> ^( Factor PO condition PC ( dotvlaues )* ) | ( BOOL ) -> ^( Factor BOOL ) );
    public final MiniJavaParser.factor_return factor() throws RecognitionException {
        MiniJavaParser.factor_return retval = new MiniJavaParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID153=null;
        Token NUM155=null;
        Token DNUM156=null;
        Token MINUS157=null;
        Token ID158=null;
        Token MINUS159=null;
        Token NUM160=null;
        Token MINUS161=null;
        Token DNUM162=null;
        Token NOT163=null;
        Token PO165=null;
        Token PC167=null;
        Token BOOL169=null;
        MiniJavaParser.arrayOrObj_return arrayOrObj154 =null;

        MiniJavaParser.notCond_return notCond164 =null;

        MiniJavaParser.condition_return condition166 =null;

        MiniJavaParser.dotvlaues_return dotvlaues168 =null;


        Object ID153_tree=null;
        Object NUM155_tree=null;
        Object DNUM156_tree=null;
        Object MINUS157_tree=null;
        Object ID158_tree=null;
        Object MINUS159_tree=null;
        Object NUM160_tree=null;
        Object MINUS161_tree=null;
        Object DNUM162_tree=null;
        Object NOT163_tree=null;
        Object PO165_tree=null;
        Object PC167_tree=null;
        Object BOOL169_tree=null;
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
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:9: ( ( ID arrayOrObj ) -> ^( Factor ID arrayOrObj ) | ( NUM ) -> ^( Factor NUM ) | ( DNUM ) -> ^( Factor DNUM ) | ( MINUS ID ) -> ^( Factor MINUS ID ) | ( MINUS NUM ) -> ^( Factor MINUS NUM ) | ( MINUS DNUM ) -> ^( Factor MINUS DNUM ) | ( NOT notCond ) -> ^( Factor NOT notCond ) | ( PO condition PC ( dotvlaues )* ) -> ^( Factor PO condition PC ( dotvlaues )* ) | ( BOOL ) -> ^( Factor BOOL ) )
            int alt42=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt42=1;
                }
                break;
            case NUM:
                {
                alt42=2;
                }
                break;
            case DNUM:
                {
                alt42=3;
                }
                break;
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt42=4;
                    }
                    break;
                case NUM:
                    {
                    alt42=5;
                    }
                    break;
                case DNUM:
                    {
                    alt42=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 4, input);

                    throw nvae;

                }

                }
                break;
            case NOT:
                {
                alt42=7;
                }
                break;
            case PO:
                {
                alt42=8;
                }
                break;
            case BOOL:
                {
                alt42=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:11: ( ID arrayOrObj )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:11: ( ID arrayOrObj )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:12: ID arrayOrObj
                    {
                    ID153=(Token)match(input,ID,FOLLOW_ID_in_factor1852);  
                    stream_ID.add(ID153);


                    pushFollow(FOLLOW_arrayOrObj_in_factor1854);
                    arrayOrObj154=arrayOrObj();

                    state._fsp--;

                    stream_arrayOrObj.add(arrayOrObj154.getTree());

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
                    // 221:27: -> ^( Factor ID arrayOrObj )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:221:30: ^( Factor ID arrayOrObj )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:222:5: ( NUM )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:222:5: ( NUM )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:222:6: NUM
                    {
                    NUM155=(Token)match(input,NUM,FOLLOW_NUM_in_factor1872);  
                    stream_NUM.add(NUM155);


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
                    // 222:11: -> ^( Factor NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:222:14: ^( Factor NUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:223:5: ( DNUM )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:223:5: ( DNUM )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:223:6: DNUM
                    {
                    DNUM156=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1888);  
                    stream_DNUM.add(DNUM156);


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
                    // 223:12: -> ^( Factor DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:223:15: ^( Factor DNUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:5: ( MINUS ID )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:5: ( MINUS ID )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:6: MINUS ID
                    {
                    MINUS157=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1904);  
                    stream_MINUS.add(MINUS157);


                    ID158=(Token)match(input,ID,FOLLOW_ID_in_factor1907);  
                    stream_ID.add(ID158);


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
                    // 224:17: -> ^( Factor MINUS ID )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:224:20: ^( Factor MINUS ID )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:225:5: ( MINUS NUM )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:225:5: ( MINUS NUM )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:225:6: MINUS NUM
                    {
                    MINUS159=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1926);  
                    stream_MINUS.add(MINUS159);


                    NUM160=(Token)match(input,NUM,FOLLOW_NUM_in_factor1929);  
                    stream_NUM.add(NUM160);


                    }


                    // AST REWRITE
                    // elements: MINUS, NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:18: -> ^( Factor MINUS NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:225:21: ^( Factor MINUS NUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:226:5: ( MINUS DNUM )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:226:5: ( MINUS DNUM )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:226:6: MINUS DNUM
                    {
                    MINUS161=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1948);  
                    stream_MINUS.add(MINUS161);


                    DNUM162=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1951);  
                    stream_DNUM.add(DNUM162);


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
                    // 226:19: -> ^( Factor MINUS DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:226:22: ^( Factor MINUS DNUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:227:5: ( NOT notCond )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:227:5: ( NOT notCond )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:227:6: NOT notCond
                    {
                    NOT163=(Token)match(input,NOT,FOLLOW_NOT_in_factor1970);  
                    stream_NOT.add(NOT163);


                    pushFollow(FOLLOW_notCond_in_factor1972);
                    notCond164=notCond();

                    state._fsp--;

                    stream_notCond.add(notCond164.getTree());

                    }


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
                    // 227:19: -> ^( Factor NOT notCond )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:227:22: ^( Factor NOT notCond )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:228:5: ( PO condition PC ( dotvlaues )* )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:228:5: ( PO condition PC ( dotvlaues )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:228:6: PO condition PC ( dotvlaues )*
                    {
                    PO165=(Token)match(input,PO,FOLLOW_PO_in_factor1991);  
                    stream_PO.add(PO165);


                    pushFollow(FOLLOW_condition_in_factor1993);
                    condition166=condition();

                    state._fsp--;

                    stream_condition.add(condition166.getTree());

                    PC167=(Token)match(input,PC,FOLLOW_PC_in_factor1995);  
                    stream_PC.add(PC167);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:228:22: ( dotvlaues )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==DOT) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:228:22: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_factor1997);
                    	    dotvlaues168=dotvlaues();

                    	    state._fsp--;

                    	    stream_dotvlaues.add(dotvlaues168.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }


                    // AST REWRITE
                    // elements: PO, PC, dotvlaues, condition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:34: -> ^( Factor PO condition PC ( dotvlaues )* )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:228:37: ^( Factor PO condition PC ( dotvlaues )* )
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

                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:228:63: ( dotvlaues )*
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:229:5: ( BOOL )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:229:5: ( BOOL )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:229:6: BOOL
                    {
                    BOOL169=(Token)match(input,BOOL,FOLLOW_BOOL_in_factor2022);  
                    stream_BOOL.add(BOOL169);


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
                    // 229:12: -> ^( Factor BOOL )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:229:15: ^( Factor BOOL )
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
    public static final BitSet FOLLOW_classl_in_start138 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_CLASS_in_classl172 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_classl174 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_classes_in_classl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainClass_in_classes208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_classes210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CBO_in_mainClass221 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_mainmethod_in_mainClass223 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CBC_in_mainClass225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDV_in_classDeclaration252 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_classDeclaration254 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_classDeclaration258 = new BitSet(new long[]{0x8C010020E0040280L,0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_classDeclaration260 = new BitSet(new long[]{0x8C010020E0040280L,0x0000000000000002L});
    public static final BitSet FOLLOW_CBC_in_classDeclaration263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFiER_in_mainmethod298 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_STATIC_in_mainmethod300 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_VOID_in_mainmethod302 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_MAIN_in_mainmethod304 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PO_in_mainmethod306 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_STRING_in_mainmethod308 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_SBO_in_mainmethod310 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_mainmethod312 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_mainmethod314 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_mainmethod316 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_mainmethod318 = new BitSet(new long[]{0x8C010020E0040280L,0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_mainmethod324 = new BitSet(new long[]{0x8C010020E0040280L,0x0000000000000002L});
    public static final BitSet FOLLOW_CBC_in_mainmethod342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFiER_in_method404 = new BitSet(new long[]{0x8C000000A0040080L});
    public static final BitSet FOLLOW_STATIC_in_method407 = new BitSet(new long[]{0x88000000A0040080L});
    public static final BitSet FOLLOW_methodtype_in_method410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_voidmethod_in_methodtype446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnmethod_in_methodtype448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_voidmethod467 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod469 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PO_in_voidmethod471 = new BitSet(new long[]{0x08002000A0040080L});
    public static final BitSet FOLLOW_type_in_voidmethod474 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod476 = new BitSet(new long[]{0x0000200000001000L});
    public static final BitSet FOLLOW_COMA_in_voidmethod479 = new BitSet(new long[]{0x08000000A0040080L});
    public static final BitSet FOLLOW_type_in_voidmethod481 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_voidmethod483 = new BitSet(new long[]{0x0000200000001000L});
    public static final BitSet FOLLOW_PC_in_voidmethod489 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_voidmethod491 = new BitSet(new long[]{0x8C010020E0040280L,0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_voidmethod505 = new BitSet(new long[]{0x8C010020E0040280L,0x0000000000000002L});
    public static final BitSet FOLLOW_CBC_in_voidmethod511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typev570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typev_in_type595 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_SBO_in_type598 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_type600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_returnmethod641 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod643 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PO_in_returnmethod645 = new BitSet(new long[]{0x08002000A0040080L});
    public static final BitSet FOLLOW_type_in_returnmethod648 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod650 = new BitSet(new long[]{0x0000200000001000L});
    public static final BitSet FOLLOW_COMA_in_returnmethod653 = new BitSet(new long[]{0x08000000A0040080L});
    public static final BitSet FOLLOW_type_in_returnmethod655 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_returnmethod657 = new BitSet(new long[]{0x0000200000001000L});
    public static final BitSet FOLLOW_PC_in_returnmethod663 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CBO_in_returnmethod665 = new BitSet(new long[]{0x8C110020E0040080L,0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_returnmethod684 = new BitSet(new long[]{0x8C110020E0040080L,0x0000000000000002L});
    public static final BitSet FOLLOW_RETURNV_in_returnmethod711 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_arithExpr_in_returnmethod713 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnmethod715 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CBC_in_returnmethod720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_statment785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_in_statment815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statment844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statment874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_statment904 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statment906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_statment938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print970 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PO_in_print972 = new BitSet(new long[]{0x20008E0820010040L});
    public static final BitSet FOLLOW_printThings_in_print974 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_print976 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_printThings1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_printThings1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_printThings1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declobj_in_printThings1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_initialize1035 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_initialize1038 = new BitSet(new long[]{0x0180000001000000L});
    public static final BitSet FOLLOW_SBO_in_initialize1041 = new BitSet(new long[]{0x00408C0820010040L});
    public static final BitSet FOLLOW_arithExpr_in_initialize1044 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_initialize1048 = new BitSet(new long[]{0x0100000001000000L});
    public static final BitSet FOLLOW_declaration_in_initialize1052 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_declaration1106 = new BitSet(new long[]{0x20008E0820010040L});
    public static final BitSet FOLLOW_declThings_in_declaration1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_declThings1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declobj_in_declThings1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_declThings1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_declobj1157 = new BitSet(new long[]{0x08000000A0040080L});
    public static final BitSet FOLLOW_type_in_declobj1159 = new BitSet(new long[]{0x0080800000000000L});
    public static final BitSet FOLLOW_declOR_in_declobj1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_declOR11195 = new BitSet(new long[]{0x0000AC0820010040L});
    public static final BitSet FOLLOW_parameters_in_declOR11198 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_declOR11202 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_declOR11204 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_SBO_in_declOR21213 = new BitSet(new long[]{0x00408C0820010040L});
    public static final BitSet FOLLOW_arithExpr_in_declOR21216 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_declOR21220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOR1_in_declOR1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declOR2_in_declOR1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotvlaues1278 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_dotvlaues1280 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_PO_in_dotvlaues1283 = new BitSet(new long[]{0x0000AC0820010040L});
    public static final BitSet FOLLOW_parameters_in_dotvlaues1286 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_dotvlaues1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstmt1338 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PO_in_ifstmt1340 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_condition_in_ifstmt1342 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_ifstmt1344 = new BitSet(new long[]{0x8C010020E0040480L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_ifstmt1346 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ELSE_in_ifstmt1349 = new BitSet(new long[]{0x8C010020E0040480L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_ifstmt1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_condition1401 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_set_in_condition1404 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_arithExpr_in_condition1411 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_CBO_in_block1450 = new BitSet(new long[]{0x8C010020E0040280L,0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_block1452 = new BitSet(new long[]{0x8C010020E0040280L,0x0000000000000002L});
    public static final BitSet FOLLOW_CBC_in_block1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_block1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcCall1508 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PO_in_funcCall1510 = new BitSet(new long[]{0x0000AC0820010040L});
    public static final BitSet FOLLOW_parameters_in_funcCall1514 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_funcCall1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_parameters1559 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMA_in_parameters1562 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_arithExpr_in_parameters1564 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_WHILE_in_whilestmt1604 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_PO_in_whilestmt1606 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_condition_in_whilestmt1608 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_whilestmt1610 = new BitSet(new long[]{0x8C010020E0040480L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_whilestmt1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signs1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotvlaues_in_arrayOrObj1671 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_SBO_in_arrayOrObj1689 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_arithExpr_in_arrayOrObj1691 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SBC_in_arrayOrObj1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_notCond1735 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_condition_in_notCond1737 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_notCond1739 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_notCond1741 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ID_in_notCond1765 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_arrayOrObj_in_notCond1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithExpr1801 = new BitSet(new long[]{0x0000400800000002L});
    public static final BitSet FOLLOW_set_in_arithExpr1804 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_term_in_arithExpr1814 = new BitSet(new long[]{0x0000400800000002L});
    public static final BitSet FOLLOW_factor_in_term1825 = new BitSet(new long[]{0x0000004000008002L});
    public static final BitSet FOLLOW_set_in_term1829 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_factor_in_term1840 = new BitSet(new long[]{0x0000004000008002L});
    public static final BitSet FOLLOW_ID_in_factor1852 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_arrayOrObj_in_factor1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1904 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_factor1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1926 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NUM_in_factor1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1948 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DNUM_in_factor1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1970 = new BitSet(new long[]{0x0000800020000000L});
    public static final BitSet FOLLOW_notCond_in_factor1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_factor1991 = new BitSet(new long[]{0x00008C0820010040L});
    public static final BitSet FOLLOW_condition_in_factor1993 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PC_in_factor1995 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_dotvlaues_in_factor1997 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_BOOL_in_factor2022 = new BitSet(new long[]{0x0000000000000002L});

}