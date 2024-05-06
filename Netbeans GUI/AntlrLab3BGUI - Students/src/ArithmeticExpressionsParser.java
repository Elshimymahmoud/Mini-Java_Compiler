// $ANTLR 3.4 C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g 2024-05-06 19:39:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmeticExpressionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Array", "Assigment", "Assign", "ClassBlock", "ClassDec", "Decl", "Forstmt", "NUM", "PrintStat", "SEMICOLON", "SL_COMMENT", "Start", "Statments", "Strings", "VAR", "WhiteSpace", "'$'", "'('", "')'", "'*='", "'++'", "'+='", "','", "'--'", "'-='", "'.'", "'<'", "'='", "'?'", "'?>'", "'array'", "'as'", "'echo'", "'foreach'", "'php'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ArithmeticExpressionsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmeticExpressionsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ArithmeticExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g"; }


    String s="";


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:23:1: start : '<' '?' 'php' statments '?>' -> ^( Start '<' '?' 'php' statments '?>' ) ;
    public final ArithmeticExpressionsParser.start_return start() throws RecognitionException {
        ArithmeticExpressionsParser.start_return retval = new ArithmeticExpressionsParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal1=null;
        Token char_literal2=null;
        Token string_literal3=null;
        Token string_literal5=null;
        ArithmeticExpressionsParser.statments_return statments4 =null;


        Object char_literal1_tree=null;
        Object char_literal2_tree=null;
        Object string_literal3_tree=null;
        Object string_literal5_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_statments=new RewriteRuleSubtreeStream(adaptor,"rule statments");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:23:7: ( '<' '?' 'php' statments '?>' -> ^( Start '<' '?' 'php' statments '?>' ) )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:23:9: '<' '?' 'php' statments '?>'
            {
            char_literal1=(Token)match(input,30,FOLLOW_30_in_start60);  
            stream_30.add(char_literal1);


            char_literal2=(Token)match(input,32,FOLLOW_32_in_start62);  
            stream_32.add(char_literal2);


            string_literal3=(Token)match(input,38,FOLLOW_38_in_start64);  
            stream_38.add(string_literal3);


            pushFollow(FOLLOW_statments_in_start66);
            statments4=statments();

            state._fsp--;

            stream_statments.add(statments4.getTree());

            string_literal5=(Token)match(input,33,FOLLOW_33_in_start68);  
            stream_33.add(string_literal5);


            // AST REWRITE
            // elements: 33, 32, statments, 30, 38
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 23:38: -> ^( Start '<' '?' 'php' statments '?>' )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:23:41: ^( Start '<' '?' 'php' statments '?>' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                adaptor.addChild(root_1, 
                stream_30.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_32.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_38.nextNode()
                );

                adaptor.addChild(root_1, stream_statments.nextTree());

                adaptor.addChild(root_1, 
                stream_33.nextNode()
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
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class statments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statments"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:33:1: statments : ( stmt )* -> ^( Statments ( stmt )* ) ;
    public final ArithmeticExpressionsParser.statments_return statments() throws RecognitionException {
        ArithmeticExpressionsParser.statments_return retval = new ArithmeticExpressionsParser.statments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.stmt_return stmt6 =null;


        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:34:2: ( ( stmt )* -> ^( Statments ( stmt )* ) )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:34:4: ( stmt )*
            {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:34:4: ( stmt )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||(LA1_0 >= 36 && LA1_0 <= 37)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:34:5: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_statments123);
            	    stmt6=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt6.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:12: -> ^( Statments ( stmt )* )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:34:14: ^( Statments ( stmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Statments, "Statments")
                , root_1);

                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:34:26: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

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
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statments"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:39:1: stmt : ( assigment -> ^( Assigment assigment ) | printStat -> ^( PrintStat printStat ) | foreach -> ^( Forstmt foreach ) ) ;
    public final ArithmeticExpressionsParser.stmt_return stmt() throws RecognitionException {
        ArithmeticExpressionsParser.stmt_return retval = new ArithmeticExpressionsParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ArithmeticExpressionsParser.assigment_return assigment7 =null;

        ArithmeticExpressionsParser.printStat_return printStat8 =null;

        ArithmeticExpressionsParser.foreach_return foreach9 =null;


        RewriteRuleSubtreeStream stream_assigment=new RewriteRuleSubtreeStream(adaptor,"rule assigment");
        RewriteRuleSubtreeStream stream_foreach=new RewriteRuleSubtreeStream(adaptor,"rule foreach");
        RewriteRuleSubtreeStream stream_printStat=new RewriteRuleSubtreeStream(adaptor,"rule printStat");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:39:9: ( ( assigment -> ^( Assigment assigment ) | printStat -> ^( PrintStat printStat ) | foreach -> ^( Forstmt foreach ) ) )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:39:13: ( assigment -> ^( Assigment assigment ) | printStat -> ^( PrintStat printStat ) | foreach -> ^( Forstmt foreach ) )
            {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:39:13: ( assigment -> ^( Assigment assigment ) | printStat -> ^( PrintStat printStat ) | foreach -> ^( Forstmt foreach ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:40:2: assigment
                    {
                    pushFollow(FOLLOW_assigment_in_stmt166);
                    assigment7=assigment();

                    state._fsp--;

                    stream_assigment.add(assigment7.getTree());

                    // AST REWRITE
                    // elements: assigment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 40:12: -> ^( Assigment assigment )
                    {
                        // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:40:15: ^( Assigment assigment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Assigment, "Assigment")
                        , root_1);

                        adaptor.addChild(root_1, stream_assigment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:41:3: printStat
                    {
                    pushFollow(FOLLOW_printStat_in_stmt178);
                    printStat8=printStat();

                    state._fsp--;

                    stream_printStat.add(printStat8.getTree());

                    // AST REWRITE
                    // elements: printStat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 41:13: -> ^( PrintStat printStat )
                    {
                        // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:41:15: ^( PrintStat printStat )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PrintStat, "PrintStat")
                        , root_1);

                        adaptor.addChild(root_1, stream_printStat.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:42:3: foreach
                    {
                    pushFollow(FOLLOW_foreach_in_stmt189);
                    foreach9=foreach();

                    state._fsp--;

                    stream_foreach.add(foreach9.getTree());

                    // AST REWRITE
                    // elements: foreach
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 42:11: -> ^( Forstmt foreach )
                    {
                        // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:42:13: ^( Forstmt foreach )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Forstmt, "Forstmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_foreach.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class printStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printStat"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:48:1: printStat : 'echo' ( echoStates )+ SEMICOLON ;
    public final ArithmeticExpressionsParser.printStat_return printStat() throws RecognitionException {
        ArithmeticExpressionsParser.printStat_return retval = new ArithmeticExpressionsParser.printStat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal10=null;
        Token SEMICOLON12=null;
        ArithmeticExpressionsParser.echoStates_return echoStates11 =null;


        Object string_literal10_tree=null;
        Object SEMICOLON12_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:48:20: ( 'echo' ( echoStates )+ SEMICOLON )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:48:22: 'echo' ( echoStates )+ SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            string_literal10=(Token)match(input,36,FOLLOW_36_in_printStat231); 
            string_literal10_tree = 
            (Object)adaptor.create(string_literal10)
            ;
            adaptor.addChild(root_0, string_literal10_tree);


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:48:29: ( echoStates )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Strings||LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:48:29: echoStates
            	    {
            	    pushFollow(FOLLOW_echoStates_in_printStat233);
            	    echoStates11=echoStates();

            	    state._fsp--;

            	    adaptor.addChild(root_0, echoStates11.getTree());

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


            SEMICOLON12=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_printStat236); 
            SEMICOLON12_tree = 
            (Object)adaptor.create(SEMICOLON12)
            ;
            adaptor.addChild(root_0, SEMICOLON12_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printStat"


    public static class echoStates_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "echoStates"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:1: echoStates : ( Strings | '.' ( NUM | assign ) '.' ) ;
    public final ArithmeticExpressionsParser.echoStates_return echoStates() throws RecognitionException {
        ArithmeticExpressionsParser.echoStates_return retval = new ArithmeticExpressionsParser.echoStates_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Strings13=null;
        Token char_literal14=null;
        Token NUM15=null;
        Token char_literal17=null;
        ArithmeticExpressionsParser.assign_return assign16 =null;


        Object Strings13_tree=null;
        Object char_literal14_tree=null;
        Object NUM15_tree=null;
        Object char_literal17_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:19: ( ( Strings | '.' ( NUM | assign ) '.' ) )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:22: ( Strings | '.' ( NUM | assign ) '.' )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:22: ( Strings | '.' ( NUM | assign ) '.' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Strings) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:23: Strings
                    {
                    Strings13=(Token)match(input,Strings,FOLLOW_Strings_in_echoStates268); 
                    Strings13_tree = 
                    (Object)adaptor.create(Strings13)
                    ;
                    adaptor.addChild(root_0, Strings13_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:31: '.' ( NUM | assign ) '.'
                    {
                    char_literal14=(Token)match(input,29,FOLLOW_29_in_echoStates270); 
                    char_literal14_tree = 
                    (Object)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);


                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:35: ( NUM | assign )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NUM) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==20) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:36: NUM
                            {
                            NUM15=(Token)match(input,NUM,FOLLOW_NUM_in_echoStates273); 
                            NUM15_tree = 
                            (Object)adaptor.create(NUM15)
                            ;
                            adaptor.addChild(root_0, NUM15_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:53:40: assign
                            {
                            pushFollow(FOLLOW_assign_in_echoStates275);
                            assign16=assign();

                            state._fsp--;

                            adaptor.addChild(root_0, assign16.getTree());

                            }
                            break;

                    }


                    char_literal17=(Token)match(input,29,FOLLOW_29_in_echoStates278); 
                    char_literal17_tree = 
                    (Object)adaptor.create(char_literal17)
                    ;
                    adaptor.addChild(root_0, char_literal17_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "echoStates"


    public static class assigment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigment"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:59:1: assigment : assign SEMICOLON -> ^( Assigment assign SEMICOLON ) ;
    public final ArithmeticExpressionsParser.assigment_return assigment() throws RecognitionException {
        ArithmeticExpressionsParser.assigment_return retval = new ArithmeticExpressionsParser.assigment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICOLON19=null;
        ArithmeticExpressionsParser.assign_return assign18 =null;


        Object SEMICOLON19_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:59:10: ( assign SEMICOLON -> ^( Assigment assign SEMICOLON ) )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:60:2: assign SEMICOLON
            {
            pushFollow(FOLLOW_assign_in_assigment308);
            assign18=assign();

            state._fsp--;

            stream_assign.add(assign18.getTree());

            SEMICOLON19=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assigment310);  
            stream_SEMICOLON.add(SEMICOLON19);


            // AST REWRITE
            // elements: SEMICOLON, assign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:2: -> ^( Assigment assign SEMICOLON )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:61:5: ^( Assigment assign SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Assigment, "Assigment")
                , root_1);

                adaptor.addChild(root_1, stream_assign.nextTree());

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
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assigment"


    public static class assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:66:1: assign : '$' VAR ( operatorBy )? -> ^( Assign '$' VAR ( operatorBy )? ) ;
    public final ArithmeticExpressionsParser.assign_return assign() throws RecognitionException {
        ArithmeticExpressionsParser.assign_return retval = new ArithmeticExpressionsParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal20=null;
        Token VAR21=null;
        ArithmeticExpressionsParser.operatorBy_return operatorBy22 =null;


        Object char_literal20_tree=null;
        Object VAR21_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleSubtreeStream stream_operatorBy=new RewriteRuleSubtreeStream(adaptor,"rule operatorBy");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:66:8: ( '$' VAR ( operatorBy )? -> ^( Assign '$' VAR ( operatorBy )? ) )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:66:10: '$' VAR ( operatorBy )?
            {
            char_literal20=(Token)match(input,20,FOLLOW_20_in_assign344);  
            stream_20.add(char_literal20);


            VAR21=(Token)match(input,VAR,FOLLOW_VAR_in_assign346);  
            stream_VAR.add(VAR21);


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:66:19: ( operatorBy )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= 23 && LA6_0 <= 25)||(LA6_0 >= 27 && LA6_0 <= 28)||LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:66:20: operatorBy
                    {
                    pushFollow(FOLLOW_operatorBy_in_assign350);
                    operatorBy22=operatorBy();

                    state._fsp--;

                    stream_operatorBy.add(operatorBy22.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: 20, VAR, operatorBy
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:33: -> ^( Assign '$' VAR ( operatorBy )? )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:66:35: ^( Assign '$' VAR ( operatorBy )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Assign, "Assign")
                , root_1);

                adaptor.addChild(root_1, 
                stream_20.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:66:53: ( operatorBy )?
                if ( stream_operatorBy.hasNext() ) {
                    adaptor.addChild(root_1, stream_operatorBy.nextTree());

                }
                stream_operatorBy.reset();

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
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:1: array : 'array' '(' ( ( NUM ) ( ',' NUM )* )? ')' ;
    public final ArithmeticExpressionsParser.array_return array() throws RecognitionException {
        ArithmeticExpressionsParser.array_return retval = new ArithmeticExpressionsParser.array_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal23=null;
        Token char_literal24=null;
        Token NUM25=null;
        Token char_literal26=null;
        Token NUM27=null;
        Token char_literal28=null;

        Object string_literal23_tree=null;
        Object char_literal24_tree=null;
        Object NUM25_tree=null;
        Object char_literal26_tree=null;
        Object NUM27_tree=null;
        Object char_literal28_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:7: ( 'array' '(' ( ( NUM ) ( ',' NUM )* )? ')' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:9: 'array' '(' ( ( NUM ) ( ',' NUM )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            string_literal23=(Token)match(input,34,FOLLOW_34_in_array390); 
            string_literal23_tree = 
            (Object)adaptor.create(string_literal23)
            ;
            adaptor.addChild(root_0, string_literal23_tree);


            char_literal24=(Token)match(input,21,FOLLOW_21_in_array391); 
            char_literal24_tree = 
            (Object)adaptor.create(char_literal24)
            ;
            adaptor.addChild(root_0, char_literal24_tree);


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:20: ( ( NUM ) ( ',' NUM )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NUM) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:21: ( NUM ) ( ',' NUM )*
                    {
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:21: ( NUM )
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:22: NUM
                    {
                    NUM25=(Token)match(input,NUM,FOLLOW_NUM_in_array395); 
                    NUM25_tree = 
                    (Object)adaptor.create(NUM25)
                    ;
                    adaptor.addChild(root_0, NUM25_tree);


                    }


                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:27: ( ',' NUM )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==26) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:71:28: ',' NUM
                    	    {
                    	    char_literal26=(Token)match(input,26,FOLLOW_26_in_array399); 
                    	    char_literal26_tree = 
                    	    (Object)adaptor.create(char_literal26)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal26_tree);


                    	    NUM27=(Token)match(input,NUM,FOLLOW_NUM_in_array400); 
                    	    NUM27_tree = 
                    	    (Object)adaptor.create(NUM27)
                    	    ;
                    	    adaptor.addChild(root_0, NUM27_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal28=(Token)match(input,22,FOLLOW_22_in_array405); 
            char_literal28_tree = 
            (Object)adaptor.create(char_literal28)
            ;
            adaptor.addChild(root_0, char_literal28_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class foreach_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "foreach"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:78:1: foreach : 'foreach' '(' assign 'as' assign ')' '{' ( stmt )* '}' ;
    public final ArithmeticExpressionsParser.foreach_return foreach() throws RecognitionException {
        ArithmeticExpressionsParser.foreach_return retval = new ArithmeticExpressionsParser.foreach_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal29=null;
        Token char_literal30=null;
        Token string_literal32=null;
        Token char_literal34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        ArithmeticExpressionsParser.assign_return assign31 =null;

        ArithmeticExpressionsParser.assign_return assign33 =null;

        ArithmeticExpressionsParser.stmt_return stmt36 =null;


        Object string_literal29_tree=null;
        Object char_literal30_tree=null;
        Object string_literal32_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:78:9: ( 'foreach' '(' assign 'as' assign ')' '{' ( stmt )* '}' )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:78:11: 'foreach' '(' assign 'as' assign ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal29=(Token)match(input,37,FOLLOW_37_in_foreach435); 
            string_literal29_tree = 
            (Object)adaptor.create(string_literal29)
            ;
            adaptor.addChild(root_0, string_literal29_tree);


            char_literal30=(Token)match(input,21,FOLLOW_21_in_foreach437); 
            char_literal30_tree = 
            (Object)adaptor.create(char_literal30)
            ;
            adaptor.addChild(root_0, char_literal30_tree);


            pushFollow(FOLLOW_assign_in_foreach439);
            assign31=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign31.getTree());

            string_literal32=(Token)match(input,35,FOLLOW_35_in_foreach441); 
            string_literal32_tree = 
            (Object)adaptor.create(string_literal32)
            ;
            adaptor.addChild(root_0, string_literal32_tree);


            pushFollow(FOLLOW_assign_in_foreach443);
            assign33=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign33.getTree());

            char_literal34=(Token)match(input,22,FOLLOW_22_in_foreach445); 
            char_literal34_tree = 
            (Object)adaptor.create(char_literal34)
            ;
            adaptor.addChild(root_0, char_literal34_tree);


            char_literal35=(Token)match(input,39,FOLLOW_39_in_foreach447); 
            char_literal35_tree = 
            (Object)adaptor.create(char_literal35)
            ;
            adaptor.addChild(root_0, char_literal35_tree);


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:78:52: ( stmt )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||(LA9_0 >= 36 && LA9_0 <= 37)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:78:52: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_foreach449);
            	    stmt36=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt36.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            char_literal37=(Token)match(input,40,FOLLOW_40_in_foreach452); 
            char_literal37_tree = 
            (Object)adaptor.create(char_literal37)
            ;
            adaptor.addChild(root_0, char_literal37_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "foreach"


    public static class operatorBy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operatorBy"
    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:1: operatorBy : ( '++' | '--' | ( '+=' | '-=' | '*=' | '=' ) ( NUM | array | '$' VAR ) ) ;
    public final ArithmeticExpressionsParser.operatorBy_return operatorBy() throws RecognitionException {
        ArithmeticExpressionsParser.operatorBy_return retval = new ArithmeticExpressionsParser.operatorBy_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal38=null;
        Token string_literal39=null;
        Token set40=null;
        Token NUM41=null;
        Token char_literal43=null;
        Token VAR44=null;
        ArithmeticExpressionsParser.array_return array42 =null;


        Object string_literal38_tree=null;
        Object string_literal39_tree=null;
        Object set40_tree=null;
        Object NUM41_tree=null;
        Object char_literal43_tree=null;
        Object VAR44_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:12: ( ( '++' | '--' | ( '+=' | '-=' | '*=' | '=' ) ( NUM | array | '$' VAR ) ) )
            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:45: ( '++' | '--' | ( '+=' | '-=' | '*=' | '=' ) ( NUM | array | '$' VAR ) )
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:45: ( '++' | '--' | ( '+=' | '-=' | '*=' | '=' ) ( NUM | array | '$' VAR ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 23:
            case 25:
            case 28:
            case 31:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:46: '++'
                    {
                    string_literal38=(Token)match(input,24,FOLLOW_24_in_operatorBy508); 
                    string_literal38_tree = 
                    (Object)adaptor.create(string_literal38)
                    ;
                    adaptor.addChild(root_0, string_literal38_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:51: '--'
                    {
                    string_literal39=(Token)match(input,27,FOLLOW_27_in_operatorBy510); 
                    string_literal39_tree = 
                    (Object)adaptor.create(string_literal39)
                    ;
                    adaptor.addChild(root_0, string_literal39_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:56: ( '+=' | '-=' | '*=' | '=' ) ( NUM | array | '$' VAR )
                    {
                    set40=(Token)input.LT(1);

                    if ( input.LA(1)==23||input.LA(1)==25||input.LA(1)==28||input.LA(1)==31 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set40)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:76: ( NUM | array | '$' VAR )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case NUM:
                        {
                        alt10=1;
                        }
                        break;
                    case 34:
                        {
                        alt10=2;
                        }
                        break;
                    case 20:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }

                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:77: NUM
                            {
                            NUM41=(Token)match(input,NUM,FOLLOW_NUM_in_operatorBy522); 
                            NUM41_tree = 
                            (Object)adaptor.create(NUM41)
                            ;
                            adaptor.addChild(root_0, NUM41_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:81: array
                            {
                            pushFollow(FOLLOW_array_in_operatorBy524);
                            array42=array();

                            state._fsp--;

                            adaptor.addChild(root_0, array42.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\Users\\McQueen\\Downloads\\quiz\\ArithmeticExpressions.g:83:87: '$' VAR
                            {
                            char_literal43=(Token)match(input,20,FOLLOW_20_in_operatorBy526); 
                            char_literal43_tree = 
                            (Object)adaptor.create(char_literal43)
                            ;
                            adaptor.addChild(root_0, char_literal43_tree);


                            VAR44=(Token)match(input,VAR,FOLLOW_VAR_in_operatorBy528); 
                            VAR44_tree = 
                            (Object)adaptor.create(VAR44)
                            ;
                            adaptor.addChild(root_0, VAR44_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operatorBy"

    // Delegated rules


 

    public static final BitSet FOLLOW_30_in_start60 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_start62 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_start64 = new BitSet(new long[]{0x0000003200100000L});
    public static final BitSet FOLLOW_statments_in_start66 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_start68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_statments123 = new BitSet(new long[]{0x0000003000100002L});
    public static final BitSet FOLLOW_assigment_in_stmt166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStat_in_stmt178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_stmt189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_printStat231 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_echoStates_in_printStat233 = new BitSet(new long[]{0x0000000020022000L});
    public static final BitSet FOLLOW_SEMICOLON_in_printStat236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Strings_in_echoStates268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_echoStates270 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_NUM_in_echoStates273 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_assign_in_echoStates275 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_echoStates278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assigment308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assigment310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_assign344 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_VAR_in_assign346 = new BitSet(new long[]{0x000000009B800002L});
    public static final BitSet FOLLOW_operatorBy_in_assign350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_array390 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_array391 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_NUM_in_array395 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_array399 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NUM_in_array400 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_array405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_foreach435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_foreach437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_assign_in_foreach439 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_foreach441 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_assign_in_foreach443 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_foreach445 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_foreach447 = new BitSet(new long[]{0x0000013000100000L});
    public static final BitSet FOLLOW_stmt_in_foreach449 = new BitSet(new long[]{0x0000013000100000L});
    public static final BitSet FOLLOW_40_in_foreach452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_operatorBy508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_operatorBy510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operatorBy512 = new BitSet(new long[]{0x0000000400100800L});
    public static final BitSet FOLLOW_NUM_in_operatorBy522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_operatorBy524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_operatorBy526 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_VAR_in_operatorBy528 = new BitSet(new long[]{0x0000000000000002L});

}