// $ANTLR 3.4 D:\\Projects\\Mini-Java_Compiler\\MiniJava.g 2024-05-14 13:56:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "BOOL", "BOOLEAN", "CBC", "CBO", "CLASS", "COMA", "COMPARISONS", "DIV", "DNUM", "DOT", "DOUBLE", "ELSE", "EQUAL", "EXCLAMATION", "EXTENDV", "Factor", "ID", "IF", "INT", "MAIN", "MINUS", "ML_COMMENT", "MULTI", "NEW", "NUM", "PC", "PLUS", "PO", "PRINT", "PRIVATEV", "PUBLICV", "REMINDER", "RETURNV", "SBC", "SBO", "SEMICOLON", "SL_COMMENT", "STATIC", "STRING", "Start", "TEXT", "VOID", "WHILE", "WhiteSpace"
    };

    public static final int EOF=-1;
    public static final int AndOr=4;
    public static final int BOOL=5;
    public static final int BOOLEAN=6;
    public static final int CBC=7;
    public static final int CBO=8;
    public static final int CLASS=9;
    public static final int COMA=10;
    public static final int COMPARISONS=11;
    public static final int DIV=12;
    public static final int DNUM=13;
    public static final int DOT=14;
    public static final int DOUBLE=15;
    public static final int ELSE=16;
    public static final int EQUAL=17;
    public static final int EXCLAMATION=18;
    public static final int EXTENDV=19;
    public static final int Factor=20;
    public static final int ID=21;
    public static final int IF=22;
    public static final int INT=23;
    public static final int MAIN=24;
    public static final int MINUS=25;
    public static final int ML_COMMENT=26;
    public static final int MULTI=27;
    public static final int NEW=28;
    public static final int NUM=29;
    public static final int PC=30;
    public static final int PLUS=31;
    public static final int PO=32;
    public static final int PRINT=33;
    public static final int PRIVATEV=34;
    public static final int PUBLICV=35;
    public static final int REMINDER=36;
    public static final int RETURNV=37;
    public static final int SBC=38;
    public static final int SBO=39;
    public static final int SEMICOLON=40;
    public static final int SL_COMMENT=41;
    public static final int STATIC=42;
    public static final int STRING=43;
    public static final int Start=44;
    public static final int TEXT=45;
    public static final int VOID=46;
    public static final int WHILE=47;
    public static final int WhiteSpace=48;

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:15:1: start : ( ( class )+ ) -> ^( Start class ) ;
    public final MiniJavaParser.start_return start() throws RecognitionException {
        MiniJavaParser.start_return retval = new MiniJavaParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.class_return class1 =null;


        RewriteRuleSubtreeStream stream_class=new RewriteRuleSubtreeStream(adaptor,"rule class");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:15:8: ( ( ( class )+ ) -> ^( Start class ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:15:10: ( ( class )+ )
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:15:10: ( ( class )+ )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:15:11: ( class )+
            {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:15:11: ( class )+
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
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:15:11: class
            	    {
            	    pushFollow(FOLLOW_class_in_start38);
            	    class1=class();

            	    state._fsp--;

            	    stream_class.add(class1.getTree());

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
            // elements: class
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 15:19: -> ^( Start class )
            {
                // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:15:21: ^( Start class )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                adaptor.addChild(root_1, stream_class.nextTree());

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:22:1: modifier : ( PUBLICV | PRIVATEV );
    public final MiniJavaParser.modifier_return modifier() throws RecognitionException {
        MiniJavaParser.modifier_return retval = new MiniJavaParser.modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:22:10: ( PUBLICV | PRIVATEV )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set2=(Token)input.LT(1);

            if ( (input.LA(1) >= PRIVATEV && input.LA(1) <= PUBLICV) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set2)
                );
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


    public static class class_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:1: class : ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC ;
    public final MiniJavaParser.class_return class() throws RecognitionException {
        MiniJavaParser.class_return retval = new MiniJavaParser.class_return();
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

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:8: ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:10: ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( statment )* ( method )* ( mainmethod ( statment )* ( method )* )? CBC
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:10: ( modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= PRIVATEV && LA2_0 <= PUBLICV)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:10: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_class84);
                    modifier3=modifier();

                    state._fsp--;

                    adaptor.addChild(root_0, modifier3.getTree());

                    }
                    break;

            }


            CLASS4=(Token)match(input,CLASS,FOLLOW_CLASS_in_class87); 
            CLASS4_tree = 
            (Object)adaptor.create(CLASS4)
            ;
            adaptor.addChild(root_0, CLASS4_tree);


            ID5=(Token)match(input,ID,FOLLOW_ID_in_class89); 
            ID5_tree = 
            (Object)adaptor.create(ID5)
            ;
            adaptor.addChild(root_0, ID5_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:29: ( EXTENDV ID )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXTENDV) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:30: EXTENDV ID
                    {
                    EXTENDV6=(Token)match(input,EXTENDV,FOLLOW_EXTENDV_in_class92); 
                    EXTENDV6_tree = 
                    (Object)adaptor.create(EXTENDV6)
                    ;
                    adaptor.addChild(root_0, EXTENDV6_tree);


                    ID7=(Token)match(input,ID,FOLLOW_ID_in_class94); 
                    ID7_tree = 
                    (Object)adaptor.create(ID7)
                    ;
                    adaptor.addChild(root_0, ID7_tree);


                    }
                    break;

            }


            CBO8=(Token)match(input,CBO,FOLLOW_CBO_in_class98); 
            CBO8_tree = 
            (Object)adaptor.create(CBO8)
            ;
            adaptor.addChild(root_0, CBO8_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:25:5: ( statment )*
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
                        else if ( (LA4_5==ID||LA4_5==NUM) ) {
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
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:25:5: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_class104);
            	    statment9=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment9.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:26:5: ( method )*
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
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:26:5: method
            	    {
            	    pushFollow(FOLLOW_method_in_class112);
            	    method10=method();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method10.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:27:5: ( mainmethod ( statment )* ( method )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= PRIVATEV && LA8_0 <= PUBLICV)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:27:6: mainmethod ( statment )* ( method )*
                    {
                    pushFollow(FOLLOW_mainmethod_in_class120);
                    mainmethod11=mainmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, mainmethod11.getTree());

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:27:17: ( statment )*
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
                                else if ( (LA6_5==ID||LA6_5==NUM) ) {
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
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:27:17: statment
                    	    {
                    	    pushFollow(FOLLOW_statment_in_class122);
                    	    statment12=statment();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statment12.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:27:27: ( method )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==BOOLEAN||LA7_0==DOUBLE||LA7_0==ID||LA7_0==INT||(LA7_0 >= PRIVATEV && LA7_0 <= PUBLICV)||(LA7_0 >= STATIC && LA7_0 <= STRING)||LA7_0==VOID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:27:27: method
                    	    {
                    	    pushFollow(FOLLOW_method_in_class125);
                    	    method13=method();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, method13.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            CBC14=(Token)match(input,CBC,FOLLOW_CBC_in_class133); 
            CBC14_tree = 
            (Object)adaptor.create(CBC14)
            ;
            adaptor.addChild(root_0, CBC14_tree);


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
    // $ANTLR end "class"


    public static class mainmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mainmethod"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:30:1: mainmethod : modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ;
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

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:30:17: ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:30:19: modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_modifier_in_mainmethod146);
            modifier15=modifier();

            state._fsp--;

            adaptor.addChild(root_0, modifier15.getTree());

            STATIC16=(Token)match(input,STATIC,FOLLOW_STATIC_in_mainmethod148); 
            STATIC16_tree = 
            (Object)adaptor.create(STATIC16)
            ;
            adaptor.addChild(root_0, STATIC16_tree);


            VOID17=(Token)match(input,VOID,FOLLOW_VOID_in_mainmethod150); 
            VOID17_tree = 
            (Object)adaptor.create(VOID17)
            ;
            adaptor.addChild(root_0, VOID17_tree);


            MAIN18=(Token)match(input,MAIN,FOLLOW_MAIN_in_mainmethod152); 
            MAIN18_tree = 
            (Object)adaptor.create(MAIN18)
            ;
            adaptor.addChild(root_0, MAIN18_tree);


            PO19=(Token)match(input,PO,FOLLOW_PO_in_mainmethod154); 
            PO19_tree = 
            (Object)adaptor.create(PO19)
            ;
            adaptor.addChild(root_0, PO19_tree);


            STRING20=(Token)match(input,STRING,FOLLOW_STRING_in_mainmethod156); 
            STRING20_tree = 
            (Object)adaptor.create(STRING20)
            ;
            adaptor.addChild(root_0, STRING20_tree);


            SBO21=(Token)match(input,SBO,FOLLOW_SBO_in_mainmethod158); 
            SBO21_tree = 
            (Object)adaptor.create(SBO21)
            ;
            adaptor.addChild(root_0, SBO21_tree);


            SBC22=(Token)match(input,SBC,FOLLOW_SBC_in_mainmethod160); 
            SBC22_tree = 
            (Object)adaptor.create(SBC22)
            ;
            adaptor.addChild(root_0, SBC22_tree);


            ID23=(Token)match(input,ID,FOLLOW_ID_in_mainmethod162); 
            ID23_tree = 
            (Object)adaptor.create(ID23)
            ;
            adaptor.addChild(root_0, ID23_tree);


            PC24=(Token)match(input,PC,FOLLOW_PC_in_mainmethod164); 
            PC24_tree = 
            (Object)adaptor.create(PC24)
            ;
            adaptor.addChild(root_0, PC24_tree);


            CBO25=(Token)match(input,CBO,FOLLOW_CBO_in_mainmethod166); 
            CBO25_tree = 
            (Object)adaptor.create(CBO25)
            ;
            adaptor.addChild(root_0, CBO25_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:31:5: ( statment )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==BOOLEAN||LA9_0==DOUBLE||(LA9_0 >= ID && LA9_0 <= INT)||LA9_0==PRINT||LA9_0==STRING||LA9_0==WHILE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:31:5: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_mainmethod172);
            	    statment26=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment26.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            CBC27=(Token)match(input,CBC,FOLLOW_CBC_in_mainmethod190); 
            CBC27_tree = 
            (Object)adaptor.create(CBC27)
            ;
            adaptor.addChild(root_0, CBC27_tree);


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
    // $ANTLR end "mainmethod"


    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:1: method : ( modifier )? ( STATIC )? ( voidmethod | returnmethod ) ;
    public final MiniJavaParser.method_return method() throws RecognitionException {
        MiniJavaParser.method_return retval = new MiniJavaParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC29=null;
        MiniJavaParser.modifier_return modifier28 =null;

        MiniJavaParser.voidmethod_return voidmethod30 =null;

        MiniJavaParser.returnmethod_return returnmethod31 =null;


        Object STATIC29_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:9: ( ( modifier )? ( STATIC )? ( voidmethod | returnmethod ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:17: ( modifier )? ( STATIC )? ( voidmethod | returnmethod )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:17: ( modifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0 >= PRIVATEV && LA10_0 <= PUBLICV)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:17: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_method206);
                    modifier28=modifier();

                    state._fsp--;

                    adaptor.addChild(root_0, modifier28.getTree());

                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:27: ( STATIC )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==STATIC) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:27: STATIC
                    {
                    STATIC29=(Token)match(input,STATIC,FOLLOW_STATIC_in_method209); 
                    STATIC29_tree = 
                    (Object)adaptor.create(STATIC29)
                    ;
                    adaptor.addChild(root_0, STATIC29_tree);


                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:34: ( voidmethod | returnmethod )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:35: voidmethod
                    {
                    pushFollow(FOLLOW_voidmethod_in_method212);
                    voidmethod30=voidmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, voidmethod30.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:34:46: returnmethod
                    {
                    pushFollow(FOLLOW_returnmethod_in_method214);
                    returnmethod31=returnmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, returnmethod31.getTree());

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
    // $ANTLR end "method"


    public static class voidmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "voidmethod"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:1: voidmethod : VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ;
    public final MiniJavaParser.voidmethod_return voidmethod() throws RecognitionException {
        MiniJavaParser.voidmethod_return retval = new MiniJavaParser.voidmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID32=null;
        Token ID33=null;
        Token PO34=null;
        Token ID36=null;
        Token COMA37=null;
        Token ID39=null;
        Token PC40=null;
        Token CBO41=null;
        Token CBC43=null;
        MiniJavaParser.type_return type35 =null;

        MiniJavaParser.type_return type38 =null;

        MiniJavaParser.statment_return statment42 =null;


        Object VOID32_tree=null;
        Object ID33_tree=null;
        Object PO34_tree=null;
        Object ID36_tree=null;
        Object COMA37_tree=null;
        Object ID39_tree=null;
        Object PC40_tree=null;
        Object CBO41_tree=null;
        Object CBC43_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:17: ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:22: VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC
            {
            root_0 = (Object)adaptor.nil();


            VOID32=(Token)match(input,VOID,FOLLOW_VOID_in_voidmethod235); 
            VOID32_tree = 
            (Object)adaptor.create(VOID32)
            ;
            adaptor.addChild(root_0, VOID32_tree);


            ID33=(Token)match(input,ID,FOLLOW_ID_in_voidmethod237); 
            ID33_tree = 
            (Object)adaptor.create(ID33)
            ;
            adaptor.addChild(root_0, ID33_tree);


            PO34=(Token)match(input,PO,FOLLOW_PO_in_voidmethod239); 
            PO34_tree = 
            (Object)adaptor.create(PO34)
            ;
            adaptor.addChild(root_0, PO34_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:33: ( type ID ( COMA type ID )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BOOLEAN||LA14_0==DOUBLE||LA14_0==ID||LA14_0==INT||LA14_0==STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:34: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_voidmethod242);
                    type35=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type35.getTree());

                    ID36=(Token)match(input,ID,FOLLOW_ID_in_voidmethod244); 
                    ID36_tree = 
                    (Object)adaptor.create(ID36)
                    ;
                    adaptor.addChild(root_0, ID36_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:42: ( COMA type ID )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:43: COMA type ID
                    	    {
                    	    COMA37=(Token)match(input,COMA,FOLLOW_COMA_in_voidmethod247); 
                    	    COMA37_tree = 
                    	    (Object)adaptor.create(COMA37)
                    	    ;
                    	    adaptor.addChild(root_0, COMA37_tree);


                    	    pushFollow(FOLLOW_type_in_voidmethod249);
                    	    type38=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type38.getTree());

                    	    ID39=(Token)match(input,ID,FOLLOW_ID_in_voidmethod251); 
                    	    ID39_tree = 
                    	    (Object)adaptor.create(ID39)
                    	    ;
                    	    adaptor.addChild(root_0, ID39_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            PC40=(Token)match(input,PC,FOLLOW_PC_in_voidmethod257); 
            PC40_tree = 
            (Object)adaptor.create(PC40)
            ;
            adaptor.addChild(root_0, PC40_tree);


            CBO41=(Token)match(input,CBO,FOLLOW_CBO_in_voidmethod259); 
            CBO41_tree = 
            (Object)adaptor.create(CBO41)
            ;
            adaptor.addChild(root_0, CBO41_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:37:12: ( statment )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==BOOLEAN||LA15_0==DOUBLE||(LA15_0 >= ID && LA15_0 <= INT)||LA15_0==PRINT||LA15_0==STRING||LA15_0==WHILE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:37:12: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_voidmethod273);
            	    statment42=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment42.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            CBC43=(Token)match(input,CBC,FOLLOW_CBC_in_voidmethod279); 
            CBC43_tree = 
            (Object)adaptor.create(CBC43)
            ;
            adaptor.addChild(root_0, CBC43_tree);


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
    // $ANTLR end "voidmethod"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:40:1: type : ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( SBO SBC )? ;
    public final MiniJavaParser.type_return type() throws RecognitionException {
        MiniJavaParser.type_return retval = new MiniJavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set44=null;
        Token SBO45=null;
        Token SBC46=null;

        Object set44_tree=null;
        Object SBO45_tree=null;
        Object SBC46_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:40:11: ( ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( SBO SBC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:40:13: ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( SBO SBC )?
            {
            root_0 = (Object)adaptor.nil();


            set44=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==ID||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set44)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:40:44: ( SBO SBC )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==SBO) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:40:45: SBO SBC
                    {
                    SBO45=(Token)match(input,SBO,FOLLOW_SBO_in_type305); 
                    SBO45_tree = 
                    (Object)adaptor.create(SBO45)
                    ;
                    adaptor.addChild(root_0, SBO45_tree);


                    SBC46=(Token)match(input,SBC,FOLLOW_SBC_in_type307); 
                    SBC46_tree = 
                    (Object)adaptor.create(SBC46)
                    ;
                    adaptor.addChild(root_0, SBC46_tree);


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
    // $ANTLR end "type"


    public static class returnmethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnmethod"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:1: returnmethod : type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC ;
    public final MiniJavaParser.returnmethod_return returnmethod() throws RecognitionException {
        MiniJavaParser.returnmethod_return retval = new MiniJavaParser.returnmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID48=null;
        Token PO49=null;
        Token ID51=null;
        Token COMA52=null;
        Token ID54=null;
        Token PC55=null;
        Token CBO56=null;
        Token RETURNV58=null;
        Token SEMICOLON60=null;
        Token CBC61=null;
        MiniJavaParser.type_return type47 =null;

        MiniJavaParser.type_return type50 =null;

        MiniJavaParser.type_return type53 =null;

        MiniJavaParser.statment_return statment57 =null;

        MiniJavaParser.arithExpr_return arithExpr59 =null;


        Object ID48_tree=null;
        Object PO49_tree=null;
        Object ID51_tree=null;
        Object COMA52_tree=null;
        Object ID54_tree=null;
        Object PC55_tree=null;
        Object CBO56_tree=null;
        Object RETURNV58_tree=null;
        Object SEMICOLON60_tree=null;
        Object CBC61_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:15: ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:17: type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV arithExpr SEMICOLON CBC
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_returnmethod318);
            type47=type();

            state._fsp--;

            adaptor.addChild(root_0, type47.getTree());

            ID48=(Token)match(input,ID,FOLLOW_ID_in_returnmethod320); 
            ID48_tree = 
            (Object)adaptor.create(ID48)
            ;
            adaptor.addChild(root_0, ID48_tree);


            PO49=(Token)match(input,PO,FOLLOW_PO_in_returnmethod322); 
            PO49_tree = 
            (Object)adaptor.create(PO49)
            ;
            adaptor.addChild(root_0, PO49_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:28: ( type ID ( COMA type ID )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==BOOLEAN||LA18_0==DOUBLE||LA18_0==ID||LA18_0==INT||LA18_0==STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:29: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_returnmethod325);
                    type50=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type50.getTree());

                    ID51=(Token)match(input,ID,FOLLOW_ID_in_returnmethod327); 
                    ID51_tree = 
                    (Object)adaptor.create(ID51)
                    ;
                    adaptor.addChild(root_0, ID51_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:37: ( COMA type ID )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:38: COMA type ID
                    	    {
                    	    COMA52=(Token)match(input,COMA,FOLLOW_COMA_in_returnmethod330); 
                    	    COMA52_tree = 
                    	    (Object)adaptor.create(COMA52)
                    	    ;
                    	    adaptor.addChild(root_0, COMA52_tree);


                    	    pushFollow(FOLLOW_type_in_returnmethod332);
                    	    type53=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type53.getTree());

                    	    ID54=(Token)match(input,ID,FOLLOW_ID_in_returnmethod334); 
                    	    ID54_tree = 
                    	    (Object)adaptor.create(ID54)
                    	    ;
                    	    adaptor.addChild(root_0, ID54_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            PC55=(Token)match(input,PC,FOLLOW_PC_in_returnmethod340); 
            PC55_tree = 
            (Object)adaptor.create(PC55)
            ;
            adaptor.addChild(root_0, PC55_tree);


            CBO56=(Token)match(input,CBO,FOLLOW_CBO_in_returnmethod342); 
            CBO56_tree = 
            (Object)adaptor.create(CBO56)
            ;
            adaptor.addChild(root_0, CBO56_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:6: ( statment )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==BOOLEAN||LA19_0==DOUBLE||(LA19_0 >= ID && LA19_0 <= INT)||LA19_0==PRINT||LA19_0==STRING||LA19_0==WHILE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:43:6: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_returnmethod361);
            	    statment57=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment57.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            RETURNV58=(Token)match(input,RETURNV,FOLLOW_RETURNV_in_returnmethod388); 
            RETURNV58_tree = 
            (Object)adaptor.create(RETURNV58)
            ;
            adaptor.addChild(root_0, RETURNV58_tree);


            pushFollow(FOLLOW_arithExpr_in_returnmethod390);
            arithExpr59=arithExpr();

            state._fsp--;

            adaptor.addChild(root_0, arithExpr59.getTree());

            SEMICOLON60=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnmethod392); 
            SEMICOLON60_tree = 
            (Object)adaptor.create(SEMICOLON60)
            ;
            adaptor.addChild(root_0, SEMICOLON60_tree);


            CBC61=(Token)match(input,CBC,FOLLOW_CBC_in_returnmethod397); 
            CBC61_tree = 
            (Object)adaptor.create(CBC61)
            ;
            adaptor.addChild(root_0, CBC61_tree);


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
    // $ANTLR end "returnmethod"


    public static class statment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statment"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:1: statment : ( print | initialize | ifstmt | whilestmt | funcCall SEMICOLON );
    public final MiniJavaParser.statment_return statment() throws RecognitionException {
        MiniJavaParser.statment_return retval = new MiniJavaParser.statment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICOLON67=null;
        MiniJavaParser.print_return print62 =null;

        MiniJavaParser.initialize_return initialize63 =null;

        MiniJavaParser.ifstmt_return ifstmt64 =null;

        MiniJavaParser.whilestmt_return whilestmt65 =null;

        MiniJavaParser.funcCall_return funcCall66 =null;


        Object SEMICOLON67_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:10: ( print | initialize | ifstmt | whilestmt | funcCall SEMICOLON )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:12: print
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_print_in_statment405);
                    print62=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print62.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:18: initialize
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_initialize_in_statment407);
                    initialize63=initialize();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize63.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:29: ifstmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifstmt_in_statment409);
                    ifstmt64=ifstmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ifstmt64.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:36: whilestmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_whilestmt_in_statment411);
                    whilestmt65=whilestmt();

                    state._fsp--;

                    adaptor.addChild(root_0, whilestmt65.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:47:46: funcCall SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcCall_in_statment413);
                    funcCall66=funcCall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcCall66.getTree());

                    SEMICOLON67=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statment415); 
                    SEMICOLON67_tree = 
                    (Object)adaptor.create(SEMICOLON67)
                    ;
                    adaptor.addChild(root_0, SEMICOLON67_tree);


                    }
                    break;

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
    // $ANTLR end "statment"


    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:1: print : PRINT PO ( TEXT | arithExpr | funcCall | declobj ) PC SEMICOLON ;
    public final MiniJavaParser.print_return print() throws RecognitionException {
        MiniJavaParser.print_return retval = new MiniJavaParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT68=null;
        Token PO69=null;
        Token TEXT70=null;
        Token PC74=null;
        Token SEMICOLON75=null;
        MiniJavaParser.arithExpr_return arithExpr71 =null;

        MiniJavaParser.funcCall_return funcCall72 =null;

        MiniJavaParser.declobj_return declobj73 =null;


        Object PRINT68_tree=null;
        Object PO69_tree=null;
        Object TEXT70_tree=null;
        Object PC74_tree=null;
        Object SEMICOLON75_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:8: ( PRINT PO ( TEXT | arithExpr | funcCall | declobj ) PC SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:10: PRINT PO ( TEXT | arithExpr | funcCall | declobj ) PC SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            PRINT68=(Token)match(input,PRINT,FOLLOW_PRINT_in_print424); 
            PRINT68_tree = 
            (Object)adaptor.create(PRINT68)
            ;
            adaptor.addChild(root_0, PRINT68_tree);


            PO69=(Token)match(input,PO,FOLLOW_PO_in_print426); 
            PO69_tree = 
            (Object)adaptor.create(PO69)
            ;
            adaptor.addChild(root_0, PO69_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:19: ( TEXT | arithExpr | funcCall | declobj )
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
            case EXCLAMATION:
            case MINUS:
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:20: TEXT
                    {
                    TEXT70=(Token)match(input,TEXT,FOLLOW_TEXT_in_print429); 
                    TEXT70_tree = 
                    (Object)adaptor.create(TEXT70)
                    ;
                    adaptor.addChild(root_0, TEXT70_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:25: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_print431);
                    arithExpr71=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr71.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:35: funcCall
                    {
                    pushFollow(FOLLOW_funcCall_in_print433);
                    funcCall72=funcCall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcCall72.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:49:44: declobj
                    {
                    pushFollow(FOLLOW_declobj_in_print435);
                    declobj73=declobj();

                    state._fsp--;

                    adaptor.addChild(root_0, declobj73.getTree());

                    }
                    break;

            }


            PC74=(Token)match(input,PC,FOLLOW_PC_in_print438); 
            PC74_tree = 
            (Object)adaptor.create(PC74)
            ;
            adaptor.addChild(root_0, PC74_tree);


            SEMICOLON75=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print440); 
            SEMICOLON75_tree = 
            (Object)adaptor.create(SEMICOLON75)
            ;
            adaptor.addChild(root_0, SEMICOLON75_tree);


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
    // $ANTLR end "print"


    public static class initialize_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialize"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:1: initialize : ( type )? ID ( SBO ( ID | NUM )? SBC )? ( declaration )? SEMICOLON ;
    public final MiniJavaParser.initialize_return initialize() throws RecognitionException {
        MiniJavaParser.initialize_return retval = new MiniJavaParser.initialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID77=null;
        Token SBO78=null;
        Token set79=null;
        Token SBC80=null;
        Token SEMICOLON82=null;
        MiniJavaParser.type_return type76 =null;

        MiniJavaParser.declaration_return declaration81 =null;


        Object ID77_tree=null;
        Object SBO78_tree=null;
        Object set79_tree=null;
        Object SBC80_tree=null;
        Object SEMICOLON82_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:12: ( ( type )? ID ( SBO ( ID | NUM )? SBC )? ( declaration )? SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:14: ( type )? ID ( SBO ( ID | NUM )? SBC )? ( declaration )? SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:14: ( type )?
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:14: type
                    {
                    pushFollow(FOLLOW_type_in_initialize449);
                    type76=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type76.getTree());

                    }
                    break;

            }


            ID77=(Token)match(input,ID,FOLLOW_ID_in_initialize452); 
            ID77_tree = 
            (Object)adaptor.create(ID77)
            ;
            adaptor.addChild(root_0, ID77_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:23: ( SBO ( ID | NUM )? SBC )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==SBO) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:24: SBO ( ID | NUM )? SBC
                    {
                    SBO78=(Token)match(input,SBO,FOLLOW_SBO_in_initialize455); 
                    SBO78_tree = 
                    (Object)adaptor.create(SBO78)
                    ;
                    adaptor.addChild(root_0, SBO78_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:28: ( ID | NUM )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==ID||LA23_0==NUM) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:
                            {
                            set79=(Token)input.LT(1);

                            if ( input.LA(1)==ID||input.LA(1)==NUM ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set79)
                                );
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    SBC80=(Token)match(input,SBC,FOLLOW_SBC_in_initialize464); 
                    SBC80_tree = 
                    (Object)adaptor.create(SBC80)
                    ;
                    adaptor.addChild(root_0, SBC80_tree);


                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:44: ( declaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==EQUAL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:51:44: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_initialize468);
                    declaration81=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration81.getTree());

                    }
                    break;

            }


            SEMICOLON82=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize471); 
            SEMICOLON82_tree = 
            (Object)adaptor.create(SEMICOLON82)
            ;
            adaptor.addChild(root_0, SEMICOLON82_tree);


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
    // $ANTLR end "initialize"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:1: declaration : EQUAL ( arithExpr | declobj | TEXT ) ;
    public final MiniJavaParser.declaration_return declaration() throws RecognitionException {
        MiniJavaParser.declaration_return retval = new MiniJavaParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL83=null;
        Token TEXT86=null;
        MiniJavaParser.arithExpr_return arithExpr84 =null;

        MiniJavaParser.declobj_return declobj85 =null;


        Object EQUAL83_tree=null;
        Object TEXT86_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:13: ( EQUAL ( arithExpr | declobj | TEXT ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:15: EQUAL ( arithExpr | declobj | TEXT )
            {
            root_0 = (Object)adaptor.nil();


            EQUAL83=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration479); 
            EQUAL83_tree = 
            (Object)adaptor.create(EQUAL83)
            ;
            adaptor.addChild(root_0, EQUAL83_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:21: ( arithExpr | declobj | TEXT )
            int alt26=3;
            switch ( input.LA(1) ) {
            case BOOL:
            case DNUM:
            case EXCLAMATION:
            case ID:
            case MINUS:
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:22: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_declaration482);
                    arithExpr84=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr84.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:32: declobj
                    {
                    pushFollow(FOLLOW_declobj_in_declaration484);
                    declobj85=declobj();

                    state._fsp--;

                    adaptor.addChild(root_0, declobj85.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:53:40: TEXT
                    {
                    TEXT86=(Token)match(input,TEXT,FOLLOW_TEXT_in_declaration486); 
                    TEXT86_tree = 
                    (Object)adaptor.create(TEXT86)
                    ;
                    adaptor.addChild(root_0, TEXT86_tree);


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
    // $ANTLR end "declaration"


    public static class declobj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declobj"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:1: declobj : NEW ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( ( PO ( NUM )? PC ( dotvlaues )* ) | SBO ( ID | NUM )? SBC ) ;
    public final MiniJavaParser.declobj_return declobj() throws RecognitionException {
        MiniJavaParser.declobj_return retval = new MiniJavaParser.declobj_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEW87=null;
        Token set88=null;
        Token PO89=null;
        Token NUM90=null;
        Token PC91=null;
        Token SBO93=null;
        Token set94=null;
        Token SBC95=null;
        MiniJavaParser.dotvlaues_return dotvlaues92 =null;


        Object NEW87_tree=null;
        Object set88_tree=null;
        Object PO89_tree=null;
        Object NUM90_tree=null;
        Object PC91_tree=null;
        Object SBO93_tree=null;
        Object set94_tree=null;
        Object SBC95_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:10: ( NEW ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( ( PO ( NUM )? PC ( dotvlaues )* ) | SBO ( ID | NUM )? SBC ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:12: NEW ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( ( PO ( NUM )? PC ( dotvlaues )* ) | SBO ( ID | NUM )? SBC )
            {
            root_0 = (Object)adaptor.nil();


            NEW87=(Token)match(input,NEW,FOLLOW_NEW_in_declobj496); 
            NEW87_tree = 
            (Object)adaptor.create(NEW87)
            ;
            adaptor.addChild(root_0, NEW87_tree);


            set88=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==ID||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set88)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:47: ( ( PO ( NUM )? PC ( dotvlaues )* ) | SBO ( ID | NUM )? SBC )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:48: ( PO ( NUM )? PC ( dotvlaues )* )
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:48: ( PO ( NUM )? PC ( dotvlaues )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:49: PO ( NUM )? PC ( dotvlaues )*
                    {
                    PO89=(Token)match(input,PO,FOLLOW_PO_in_declobj512); 
                    PO89_tree = 
                    (Object)adaptor.create(PO89)
                    ;
                    adaptor.addChild(root_0, PO89_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:52: ( NUM )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NUM) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:52: NUM
                            {
                            NUM90=(Token)match(input,NUM,FOLLOW_NUM_in_declobj514); 
                            NUM90_tree = 
                            (Object)adaptor.create(NUM90)
                            ;
                            adaptor.addChild(root_0, NUM90_tree);


                            }
                            break;

                    }


                    PC91=(Token)match(input,PC,FOLLOW_PC_in_declobj517); 
                    PC91_tree = 
                    (Object)adaptor.create(PC91)
                    ;
                    adaptor.addChild(root_0, PC91_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:60: ( dotvlaues )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==DOT) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:60: dotvlaues
                    	    {
                    	    pushFollow(FOLLOW_dotvlaues_in_declobj519);
                    	    dotvlaues92=dotvlaues();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, dotvlaues92.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:73: SBO ( ID | NUM )? SBC
                    {
                    SBO93=(Token)match(input,SBO,FOLLOW_SBO_in_declobj524); 
                    SBO93_tree = 
                    (Object)adaptor.create(SBO93)
                    ;
                    adaptor.addChild(root_0, SBO93_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:55:77: ( ID | NUM )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==ID||LA29_0==NUM) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:
                            {
                            set94=(Token)input.LT(1);

                            if ( input.LA(1)==ID||input.LA(1)==NUM ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set94)
                                );
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    SBC95=(Token)match(input,SBC,FOLLOW_SBC_in_declobj533); 
                    SBC95_tree = 
                    (Object)adaptor.create(SBC95)
                    ;
                    adaptor.addChild(root_0, SBC95_tree);


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
    // $ANTLR end "declobj"


    public static class dotvlaues_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotvlaues"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:1: dotvlaues : ( DOT ID ( PO ( arithExpr ( COMA arithExpr )* )? PC )? ) ;
    public final MiniJavaParser.dotvlaues_return dotvlaues() throws RecognitionException {
        MiniJavaParser.dotvlaues_return retval = new MiniJavaParser.dotvlaues_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT96=null;
        Token ID97=null;
        Token PO98=null;
        Token COMA100=null;
        Token PC102=null;
        MiniJavaParser.arithExpr_return arithExpr99 =null;

        MiniJavaParser.arithExpr_return arithExpr101 =null;


        Object DOT96_tree=null;
        Object ID97_tree=null;
        Object PO98_tree=null;
        Object COMA100_tree=null;
        Object PC102_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:12: ( ( DOT ID ( PO ( arithExpr ( COMA arithExpr )* )? PC )? ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:14: ( DOT ID ( PO ( arithExpr ( COMA arithExpr )* )? PC )? )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:14: ( DOT ID ( PO ( arithExpr ( COMA arithExpr )* )? PC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:15: DOT ID ( PO ( arithExpr ( COMA arithExpr )* )? PC )?
            {
            DOT96=(Token)match(input,DOT,FOLLOW_DOT_in_dotvlaues544); 
            DOT96_tree = 
            (Object)adaptor.create(DOT96)
            ;
            adaptor.addChild(root_0, DOT96_tree);


            ID97=(Token)match(input,ID,FOLLOW_ID_in_dotvlaues546); 
            ID97_tree = 
            (Object)adaptor.create(ID97)
            ;
            adaptor.addChild(root_0, ID97_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:22: ( PO ( arithExpr ( COMA arithExpr )* )? PC )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==PO) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:23: PO ( arithExpr ( COMA arithExpr )* )? PC
                    {
                    PO98=(Token)match(input,PO,FOLLOW_PO_in_dotvlaues549); 
                    PO98_tree = 
                    (Object)adaptor.create(PO98)
                    ;
                    adaptor.addChild(root_0, PO98_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:26: ( arithExpr ( COMA arithExpr )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==BOOL||LA32_0==DNUM||LA32_0==EXCLAMATION||LA32_0==ID||LA32_0==MINUS||LA32_0==NUM||LA32_0==PO) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:27: arithExpr ( COMA arithExpr )*
                            {
                            pushFollow(FOLLOW_arithExpr_in_dotvlaues552);
                            arithExpr99=arithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, arithExpr99.getTree());

                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:37: ( COMA arithExpr )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==COMA) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:57:38: COMA arithExpr
                            	    {
                            	    COMA100=(Token)match(input,COMA,FOLLOW_COMA_in_dotvlaues555); 
                            	    COMA100_tree = 
                            	    (Object)adaptor.create(COMA100)
                            	    ;
                            	    adaptor.addChild(root_0, COMA100_tree);


                            	    pushFollow(FOLLOW_arithExpr_in_dotvlaues557);
                            	    arithExpr101=arithExpr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, arithExpr101.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }


                    PC102=(Token)match(input,PC,FOLLOW_PC_in_dotvlaues563); 
                    PC102_tree = 
                    (Object)adaptor.create(PC102)
                    ;
                    adaptor.addChild(root_0, PC102_tree);


                    }
                    break;

            }


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
    // $ANTLR end "dotvlaues"


    public static class ifstmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmt"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:59:1: ifstmt : IF PO condition PC block ( ELSE block )? ;
    public final MiniJavaParser.ifstmt_return ifstmt() throws RecognitionException {
        MiniJavaParser.ifstmt_return retval = new MiniJavaParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF103=null;
        Token PO104=null;
        Token PC106=null;
        Token ELSE108=null;
        MiniJavaParser.condition_return condition105 =null;

        MiniJavaParser.block_return block107 =null;

        MiniJavaParser.block_return block109 =null;


        Object IF103_tree=null;
        Object PO104_tree=null;
        Object PC106_tree=null;
        Object ELSE108_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:59:9: ( IF PO condition PC block ( ELSE block )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:59:11: IF PO condition PC block ( ELSE block )?
            {
            root_0 = (Object)adaptor.nil();


            IF103=(Token)match(input,IF,FOLLOW_IF_in_ifstmt575); 
            IF103_tree = 
            (Object)adaptor.create(IF103)
            ;
            adaptor.addChild(root_0, IF103_tree);


            PO104=(Token)match(input,PO,FOLLOW_PO_in_ifstmt577); 
            PO104_tree = 
            (Object)adaptor.create(PO104)
            ;
            adaptor.addChild(root_0, PO104_tree);


            pushFollow(FOLLOW_condition_in_ifstmt579);
            condition105=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition105.getTree());

            PC106=(Token)match(input,PC,FOLLOW_PC_in_ifstmt581); 
            PC106_tree = 
            (Object)adaptor.create(PC106)
            ;
            adaptor.addChild(root_0, PC106_tree);


            pushFollow(FOLLOW_block_in_ifstmt583);
            block107=block();

            state._fsp--;

            adaptor.addChild(root_0, block107.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:59:35: ( ELSE block )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:59:37: ELSE block
                    {
                    ELSE108=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifstmt586); 
                    ELSE108_tree = 
                    (Object)adaptor.create(ELSE108)
                    ;
                    adaptor.addChild(root_0, ELSE108_tree);


                    pushFollow(FOLLOW_block_in_ifstmt588);
                    block109=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block109.getTree());

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
    // $ANTLR end "ifstmt"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:61:1: condition : arithExpr ( COMPARISONS arithExpr )* ;
    public final MiniJavaParser.condition_return condition() throws RecognitionException {
        MiniJavaParser.condition_return retval = new MiniJavaParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPARISONS111=null;
        MiniJavaParser.arithExpr_return arithExpr110 =null;

        MiniJavaParser.arithExpr_return arithExpr112 =null;


        Object COMPARISONS111_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:61:11: ( arithExpr ( COMPARISONS arithExpr )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:61:13: arithExpr ( COMPARISONS arithExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arithExpr_in_condition599);
            arithExpr110=arithExpr();

            state._fsp--;

            adaptor.addChild(root_0, arithExpr110.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:61:23: ( COMPARISONS arithExpr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMPARISONS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:61:24: COMPARISONS arithExpr
            	    {
            	    COMPARISONS111=(Token)match(input,COMPARISONS,FOLLOW_COMPARISONS_in_condition602); 
            	    COMPARISONS111_tree = 
            	    (Object)adaptor.create(COMPARISONS111)
            	    ;
            	    adaptor.addChild(root_0, COMPARISONS111_tree);


            	    pushFollow(FOLLOW_arithExpr_in_condition604);
            	    arithExpr112=arithExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arithExpr112.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "condition"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:1: block : ( CBO ( ( statment )* ) CBC | statment );
    public final MiniJavaParser.block_return block() throws RecognitionException {
        MiniJavaParser.block_return retval = new MiniJavaParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CBO113=null;
        Token CBC115=null;
        MiniJavaParser.statment_return statment114 =null;

        MiniJavaParser.statment_return statment116 =null;


        Object CBO113_tree=null;
        Object CBC115_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:8: ( CBO ( ( statment )* ) CBC | statment )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==CBO) ) {
                alt37=1;
            }
            else if ( (LA37_0==BOOLEAN||LA37_0==DOUBLE||(LA37_0 >= ID && LA37_0 <= INT)||LA37_0==PRINT||LA37_0==STRING||LA37_0==WHILE) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:10: CBO ( ( statment )* ) CBC
                    {
                    root_0 = (Object)adaptor.nil();


                    CBO113=(Token)match(input,CBO,FOLLOW_CBO_in_block615); 
                    CBO113_tree = 
                    (Object)adaptor.create(CBO113)
                    ;
                    adaptor.addChild(root_0, CBO113_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:14: ( ( statment )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:15: ( statment )*
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:15: ( statment )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==BOOLEAN||LA36_0==DOUBLE||(LA36_0 >= ID && LA36_0 <= INT)||LA36_0==PRINT||LA36_0==STRING||LA36_0==WHILE) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:15: statment
                    	    {
                    	    pushFollow(FOLLOW_statment_in_block618);
                    	    statment114=statment();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statment114.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }


                    CBC115=(Token)match(input,CBC,FOLLOW_CBC_in_block622); 
                    CBC115_tree = 
                    (Object)adaptor.create(CBC115)
                    ;
                    adaptor.addChild(root_0, CBC115_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:63:32: statment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statment_in_block626);
                    statment116=statment();

                    state._fsp--;

                    adaptor.addChild(root_0, statment116.getTree());

                    }
                    break;

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
    // $ANTLR end "block"


    public static class funcCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcCall"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:65:1: funcCall : ID PO ( arithExpr ( COMA arithExpr )* )? PC ;
    public final MiniJavaParser.funcCall_return funcCall() throws RecognitionException {
        MiniJavaParser.funcCall_return retval = new MiniJavaParser.funcCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID117=null;
        Token PO118=null;
        Token COMA120=null;
        Token PC122=null;
        MiniJavaParser.arithExpr_return arithExpr119 =null;

        MiniJavaParser.arithExpr_return arithExpr121 =null;


        Object ID117_tree=null;
        Object PO118_tree=null;
        Object COMA120_tree=null;
        Object PC122_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:65:10: ( ID PO ( arithExpr ( COMA arithExpr )* )? PC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:65:12: ID PO ( arithExpr ( COMA arithExpr )* )? PC
            {
            root_0 = (Object)adaptor.nil();


            ID117=(Token)match(input,ID,FOLLOW_ID_in_funcCall634); 
            ID117_tree = 
            (Object)adaptor.create(ID117)
            ;
            adaptor.addChild(root_0, ID117_tree);


            PO118=(Token)match(input,PO,FOLLOW_PO_in_funcCall636); 
            PO118_tree = 
            (Object)adaptor.create(PO118)
            ;
            adaptor.addChild(root_0, PO118_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:65:18: ( arithExpr ( COMA arithExpr )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==BOOL||LA39_0==DNUM||LA39_0==EXCLAMATION||LA39_0==ID||LA39_0==MINUS||LA39_0==NUM||LA39_0==PO) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:65:20: arithExpr ( COMA arithExpr )*
                    {
                    pushFollow(FOLLOW_arithExpr_in_funcCall640);
                    arithExpr119=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr119.getTree());

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:65:30: ( COMA arithExpr )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==COMA) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:65:31: COMA arithExpr
                    	    {
                    	    COMA120=(Token)match(input,COMA,FOLLOW_COMA_in_funcCall643); 
                    	    COMA120_tree = 
                    	    (Object)adaptor.create(COMA120)
                    	    ;
                    	    adaptor.addChild(root_0, COMA120_tree);


                    	    pushFollow(FOLLOW_arithExpr_in_funcCall645);
                    	    arithExpr121=arithExpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, arithExpr121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }


            PC122=(Token)match(input,PC,FOLLOW_PC_in_funcCall651); 
            PC122_tree = 
            (Object)adaptor.create(PC122)
            ;
            adaptor.addChild(root_0, PC122_tree);


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
    // $ANTLR end "funcCall"


    public static class whilestmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilestmt"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:67:1: whilestmt : WHILE PO condition PC block ;
    public final MiniJavaParser.whilestmt_return whilestmt() throws RecognitionException {
        MiniJavaParser.whilestmt_return retval = new MiniJavaParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE123=null;
        Token PO124=null;
        Token PC126=null;
        MiniJavaParser.condition_return condition125 =null;

        MiniJavaParser.block_return block127 =null;


        Object WHILE123_tree=null;
        Object PO124_tree=null;
        Object PC126_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:67:11: ( WHILE PO condition PC block )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:67:13: WHILE PO condition PC block
            {
            root_0 = (Object)adaptor.nil();


            WHILE123=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilestmt659); 
            WHILE123_tree = 
            (Object)adaptor.create(WHILE123)
            ;
            adaptor.addChild(root_0, WHILE123_tree);


            PO124=(Token)match(input,PO,FOLLOW_PO_in_whilestmt661); 
            PO124_tree = 
            (Object)adaptor.create(PO124)
            ;
            adaptor.addChild(root_0, PO124_tree);


            pushFollow(FOLLOW_condition_in_whilestmt663);
            condition125=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition125.getTree());

            PC126=(Token)match(input,PC,FOLLOW_PC_in_whilestmt665); 
            PC126_tree = 
            (Object)adaptor.create(PC126)
            ;
            adaptor.addChild(root_0, PC126_tree);


            pushFollow(FOLLOW_block_in_whilestmt667);
            block127=block();

            state._fsp--;

            adaptor.addChild(root_0, block127.getTree());

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
    // $ANTLR end "whilestmt"


    public static class signs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signs"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:1: signs : ( PLUS | MINUS | MULTI | DIV | REMINDER ) ;
    public final MiniJavaParser.signs_return signs() throws RecognitionException {
        MiniJavaParser.signs_return retval = new MiniJavaParser.signs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set128=null;

        Object set128_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:8: ( ( PLUS | MINUS | MULTI | DIV | REMINDER ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set128=(Token)input.LT(1);

            if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULTI||input.LA(1)==PLUS||input.LA(1)==REMINDER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set128)
                );
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


    public static class arithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithExpr"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:1: arithExpr : term ( ( PLUS | MINUS | MULTI | DIV ) ^ term )* ;
    public final MiniJavaParser.arithExpr_return arithExpr() throws RecognitionException {
        MiniJavaParser.arithExpr_return retval = new MiniJavaParser.arithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set130=null;
        MiniJavaParser.term_return term129 =null;

        MiniJavaParser.term_return term131 =null;


        Object set130_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:11: ( term ( ( PLUS | MINUS | MULTI | DIV ) ^ term )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:13: term ( ( PLUS | MINUS | MULTI | DIV ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arithExpr694);
            term129=term();

            state._fsp--;

            adaptor.addChild(root_0, term129.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:18: ( ( PLUS | MINUS | MULTI | DIV ) ^ term )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==DIV||LA40_0==MINUS||LA40_0==MULTI||LA40_0==PLUS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:19: ( PLUS | MINUS | MULTI | DIV ) ^ term
            	    {
            	    set130=(Token)input.LT(1);

            	    set130=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULTI||input.LA(1)==PLUS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set130)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithExpr715);
            	    term131=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term131.getTree());

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:73:1: term : ( ID ( ( dotvlaues )* | SBO arithExpr SBC ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DNUM ) | MINUS ID -> ^( Factor MINUS ID ) | MINUS NUM -> ^( Factor MINUS NUM ) | MINUS DNUM -> ^( Factor MINUS DNUM ) | EXCLAMATION ( ( PO condition PC ) | ID ( ( dotvlaues )* | SBO arithExpr SBC ) ) | PO condition PC | BOOL );
    public final MiniJavaParser.term_return term() throws RecognitionException {
        MiniJavaParser.term_return retval = new MiniJavaParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID132=null;
        Token SBO134=null;
        Token SBC136=null;
        Token NUM137=null;
        Token DNUM138=null;
        Token MINUS139=null;
        Token ID140=null;
        Token MINUS141=null;
        Token NUM142=null;
        Token MINUS143=null;
        Token DNUM144=null;
        Token EXCLAMATION145=null;
        Token PO146=null;
        Token PC148=null;
        Token ID149=null;
        Token SBO151=null;
        Token SBC153=null;
        Token PO154=null;
        Token PC156=null;
        Token BOOL157=null;
        MiniJavaParser.dotvlaues_return dotvlaues133 =null;

        MiniJavaParser.arithExpr_return arithExpr135 =null;

        MiniJavaParser.condition_return condition147 =null;

        MiniJavaParser.dotvlaues_return dotvlaues150 =null;

        MiniJavaParser.arithExpr_return arithExpr152 =null;

        MiniJavaParser.condition_return condition155 =null;


        Object ID132_tree=null;
        Object SBO134_tree=null;
        Object SBC136_tree=null;
        Object NUM137_tree=null;
        Object DNUM138_tree=null;
        Object MINUS139_tree=null;
        Object ID140_tree=null;
        Object MINUS141_tree=null;
        Object NUM142_tree=null;
        Object MINUS143_tree=null;
        Object DNUM144_tree=null;
        Object EXCLAMATION145_tree=null;
        Object PO146_tree=null;
        Object PC148_tree=null;
        Object ID149_tree=null;
        Object SBO151_tree=null;
        Object SBC153_tree=null;
        Object PO154_tree=null;
        Object PC156_tree=null;
        Object BOOL157_tree=null;
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:73:7: ( ID ( ( dotvlaues )* | SBO arithExpr SBC ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DNUM ) | MINUS ID -> ^( Factor MINUS ID ) | MINUS NUM -> ^( Factor MINUS NUM ) | MINUS DNUM -> ^( Factor MINUS DNUM ) | EXCLAMATION ( ( PO condition PC ) | ID ( ( dotvlaues )* | SBO arithExpr SBC ) ) | PO condition PC | BOOL )
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
            case EXCLAMATION:
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:73:9: ID ( ( dotvlaues )* | SBO arithExpr SBC )
                    {
                    root_0 = (Object)adaptor.nil();


                    ID132=(Token)match(input,ID,FOLLOW_ID_in_term726); 
                    ID132_tree = 
                    (Object)adaptor.create(ID132)
                    ;
                    adaptor.addChild(root_0, ID132_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:73:12: ( ( dotvlaues )* | SBO arithExpr SBC )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0 >= COMA && LA42_0 <= DIV)||LA42_0==DOT||LA42_0==MINUS||LA42_0==MULTI||(LA42_0 >= PC && LA42_0 <= PLUS)||LA42_0==SBC||LA42_0==SEMICOLON) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==SBO) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;

                    }
                    switch (alt42) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:73:13: ( dotvlaues )*
                            {
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:73:13: ( dotvlaues )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==DOT) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:73:13: dotvlaues
                            	    {
                            	    pushFollow(FOLLOW_dotvlaues_in_term729);
                            	    dotvlaues133=dotvlaues();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, dotvlaues133.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:73:24: SBO arithExpr SBC
                            {
                            SBO134=(Token)match(input,SBO,FOLLOW_SBO_in_term732); 
                            SBO134_tree = 
                            (Object)adaptor.create(SBO134)
                            ;
                            adaptor.addChild(root_0, SBO134_tree);


                            pushFollow(FOLLOW_arithExpr_in_term734);
                            arithExpr135=arithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, arithExpr135.getTree());

                            SBC136=(Token)match(input,SBC,FOLLOW_SBC_in_term736); 
                            SBC136_tree = 
                            (Object)adaptor.create(SBC136)
                            ;
                            adaptor.addChild(root_0, SBC136_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:5: NUM
                    {
                    NUM137=(Token)match(input,NUM,FOLLOW_NUM_in_term743);  
                    stream_NUM.add(NUM137);


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
                    // 74:9: -> ^( Factor NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:74:12: ^( Factor NUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:5: DNUM
                    {
                    DNUM138=(Token)match(input,DNUM,FOLLOW_DNUM_in_term757);  
                    stream_DNUM.add(DNUM138);


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
                    // 75:10: -> ^( Factor DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:75:13: ^( Factor DNUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:76:6: MINUS ID
                    {
                    MINUS139=(Token)match(input,MINUS,FOLLOW_MINUS_in_term772);  
                    stream_MINUS.add(MINUS139);


                    ID140=(Token)match(input,ID,FOLLOW_ID_in_term775);  
                    stream_ID.add(ID140);


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
                    // 76:16: -> ^( Factor MINUS ID )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:76:19: ^( Factor MINUS ID )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:6: MINUS NUM
                    {
                    MINUS141=(Token)match(input,MINUS,FOLLOW_MINUS_in_term793);  
                    stream_MINUS.add(MINUS141);


                    NUM142=(Token)match(input,NUM,FOLLOW_NUM_in_term796);  
                    stream_NUM.add(NUM142);


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
                    // 77:17: -> ^( Factor MINUS NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:77:20: ^( Factor MINUS NUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:78:6: MINUS DNUM
                    {
                    MINUS143=(Token)match(input,MINUS,FOLLOW_MINUS_in_term814);  
                    stream_MINUS.add(MINUS143);


                    DNUM144=(Token)match(input,DNUM,FOLLOW_DNUM_in_term817);  
                    stream_DNUM.add(DNUM144);


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
                    // 78:19: -> ^( Factor MINUS DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:78:22: ^( Factor MINUS DNUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:6: EXCLAMATION ( ( PO condition PC ) | ID ( ( dotvlaues )* | SBO arithExpr SBC ) )
                    {
                    root_0 = (Object)adaptor.nil();


                    EXCLAMATION145=(Token)match(input,EXCLAMATION,FOLLOW_EXCLAMATION_in_term836); 
                    EXCLAMATION145_tree = 
                    (Object)adaptor.create(EXCLAMATION145)
                    ;
                    adaptor.addChild(root_0, EXCLAMATION145_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:18: ( ( PO condition PC ) | ID ( ( dotvlaues )* | SBO arithExpr SBC ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==PO) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==ID) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;

                    }
                    switch (alt45) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:19: ( PO condition PC )
                            {
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:19: ( PO condition PC )
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:20: PO condition PC
                            {
                            PO146=(Token)match(input,PO,FOLLOW_PO_in_term840); 
                            PO146_tree = 
                            (Object)adaptor.create(PO146)
                            ;
                            adaptor.addChild(root_0, PO146_tree);


                            pushFollow(FOLLOW_condition_in_term842);
                            condition147=condition();

                            state._fsp--;

                            adaptor.addChild(root_0, condition147.getTree());

                            PC148=(Token)match(input,PC,FOLLOW_PC_in_term844); 
                            PC148_tree = 
                            (Object)adaptor.create(PC148)
                            ;
                            adaptor.addChild(root_0, PC148_tree);


                            }


                            }
                            break;
                        case 2 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:37: ID ( ( dotvlaues )* | SBO arithExpr SBC )
                            {
                            ID149=(Token)match(input,ID,FOLLOW_ID_in_term847); 
                            ID149_tree = 
                            (Object)adaptor.create(ID149)
                            ;
                            adaptor.addChild(root_0, ID149_tree);


                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:40: ( ( dotvlaues )* | SBO arithExpr SBC )
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( ((LA44_0 >= COMA && LA44_0 <= DIV)||LA44_0==DOT||LA44_0==MINUS||LA44_0==MULTI||(LA44_0 >= PC && LA44_0 <= PLUS)||LA44_0==SBC||LA44_0==SEMICOLON) ) {
                                alt44=1;
                            }
                            else if ( (LA44_0==SBO) ) {
                                alt44=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 44, 0, input);

                                throw nvae;

                            }
                            switch (alt44) {
                                case 1 :
                                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:41: ( dotvlaues )*
                                    {
                                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:41: ( dotvlaues )*
                                    loop43:
                                    do {
                                        int alt43=2;
                                        int LA43_0 = input.LA(1);

                                        if ( (LA43_0==DOT) ) {
                                            alt43=1;
                                        }


                                        switch (alt43) {
                                    	case 1 :
                                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:41: dotvlaues
                                    	    {
                                    	    pushFollow(FOLLOW_dotvlaues_in_term850);
                                    	    dotvlaues150=dotvlaues();

                                    	    state._fsp--;

                                    	    adaptor.addChild(root_0, dotvlaues150.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop43;
                                        }
                                    } while (true);


                                    }
                                    break;
                                case 2 :
                                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:79:53: SBO arithExpr SBC
                                    {
                                    SBO151=(Token)match(input,SBO,FOLLOW_SBO_in_term854); 
                                    SBO151_tree = 
                                    (Object)adaptor.create(SBO151)
                                    ;
                                    adaptor.addChild(root_0, SBO151_tree);


                                    pushFollow(FOLLOW_arithExpr_in_term856);
                                    arithExpr152=arithExpr();

                                    state._fsp--;

                                    adaptor.addChild(root_0, arithExpr152.getTree());

                                    SBC153=(Token)match(input,SBC,FOLLOW_SBC_in_term858); 
                                    SBC153_tree = 
                                    (Object)adaptor.create(SBC153)
                                    ;
                                    adaptor.addChild(root_0, SBC153_tree);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:80:6: PO condition PC
                    {
                    root_0 = (Object)adaptor.nil();


                    PO154=(Token)match(input,PO,FOLLOW_PO_in_term868); 
                    PO154_tree = 
                    (Object)adaptor.create(PO154)
                    ;
                    adaptor.addChild(root_0, PO154_tree);


                    pushFollow(FOLLOW_condition_in_term870);
                    condition155=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition155.getTree());

                    PC156=(Token)match(input,PC,FOLLOW_PC_in_term872); 
                    PC156_tree = 
                    (Object)adaptor.create(PC156)
                    ;
                    adaptor.addChild(root_0, PC156_tree);


                    }
                    break;
                case 9 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:81:5: BOOL
                    {
                    root_0 = (Object)adaptor.nil();


                    BOOL157=(Token)match(input,BOOL,FOLLOW_BOOL_in_term879); 
                    BOOL157_tree = 
                    (Object)adaptor.create(BOOL157)
                    ;
                    adaptor.addChild(root_0, BOOL157_tree);


                    }
                    break;

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

    // Delegated rules


 

    public static final BitSet FOLLOW_class_in_start38 = new BitSet(new long[]{0x0000000C00000202L});
    public static final BitSet FOLLOW_modifier_in_class84 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CLASS_in_class87 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_class89 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_EXTENDV_in_class92 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_class94 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CBO_in_class98 = new BitSet(new long[]{0x0000CC0E00E080C0L});
    public static final BitSet FOLLOW_statment_in_class104 = new BitSet(new long[]{0x0000CC0E00E080C0L});
    public static final BitSet FOLLOW_method_in_class112 = new BitSet(new long[]{0x00004C0C00A080C0L});
    public static final BitSet FOLLOW_mainmethod_in_class120 = new BitSet(new long[]{0x0000CC0E00E080C0L});
    public static final BitSet FOLLOW_statment_in_class122 = new BitSet(new long[]{0x0000CC0E00E080C0L});
    public static final BitSet FOLLOW_method_in_class125 = new BitSet(new long[]{0x00004C0C00A080C0L});
    public static final BitSet FOLLOW_CBC_in_class133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_mainmethod146 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STATIC_in_mainmethod148 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_VOID_in_mainmethod150 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_MAIN_in_mainmethod152 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_PO_in_mainmethod154 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_STRING_in_mainmethod156 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SBO_in_mainmethod158 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SBC_in_mainmethod160 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_mainmethod162 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PC_in_mainmethod164 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CBO_in_mainmethod166 = new BitSet(new long[]{0x0000880200E080C0L});
    public static final BitSet FOLLOW_statment_in_mainmethod172 = new BitSet(new long[]{0x0000880200E080C0L});
    public static final BitSet FOLLOW_CBC_in_mainmethod190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_method206 = new BitSet(new long[]{0x00004C0000A08040L});
    public static final BitSet FOLLOW_STATIC_in_method209 = new BitSet(new long[]{0x0000480000A08040L});
    public static final BitSet FOLLOW_voidmethod_in_method212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnmethod_in_method214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_voidmethod235 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_voidmethod237 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_PO_in_voidmethod239 = new BitSet(new long[]{0x0000080040A08040L});
    public static final BitSet FOLLOW_type_in_voidmethod242 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_voidmethod244 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_COMA_in_voidmethod247 = new BitSet(new long[]{0x0000080000A08040L});
    public static final BitSet FOLLOW_type_in_voidmethod249 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_voidmethod251 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_PC_in_voidmethod257 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CBO_in_voidmethod259 = new BitSet(new long[]{0x0000880200E080C0L});
    public static final BitSet FOLLOW_statment_in_voidmethod273 = new BitSet(new long[]{0x0000880200E080C0L});
    public static final BitSet FOLLOW_CBC_in_voidmethod279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type292 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_SBO_in_type305 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SBC_in_type307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_returnmethod318 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_returnmethod320 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_PO_in_returnmethod322 = new BitSet(new long[]{0x0000080040A08040L});
    public static final BitSet FOLLOW_type_in_returnmethod325 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_returnmethod327 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_COMA_in_returnmethod330 = new BitSet(new long[]{0x0000080000A08040L});
    public static final BitSet FOLLOW_type_in_returnmethod332 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_returnmethod334 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_PC_in_returnmethod340 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CBO_in_returnmethod342 = new BitSet(new long[]{0x0000882200E08040L});
    public static final BitSet FOLLOW_statment_in_returnmethod361 = new BitSet(new long[]{0x0000882200E08040L});
    public static final BitSet FOLLOW_RETURNV_in_returnmethod388 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_arithExpr_in_returnmethod390 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnmethod392 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CBC_in_returnmethod397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_statment405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_in_statment407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statment409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statment411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_statment413 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_statment415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print424 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_PO_in_print426 = new BitSet(new long[]{0x0000200132242020L});
    public static final BitSet FOLLOW_TEXT_in_print429 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_arithExpr_in_print431 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_funcCall_in_print433 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_declobj_in_print435 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PC_in_print438 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_initialize449 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_initialize452 = new BitSet(new long[]{0x0000018000020000L});
    public static final BitSet FOLLOW_SBO_in_initialize455 = new BitSet(new long[]{0x0000004020200000L});
    public static final BitSet FOLLOW_SBC_in_initialize464 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_declaration_in_initialize468 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_declaration479 = new BitSet(new long[]{0x0000200132242020L});
    public static final BitSet FOLLOW_arithExpr_in_declaration482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declobj_in_declaration484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_declaration486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_declobj496 = new BitSet(new long[]{0x0000080000A08040L});
    public static final BitSet FOLLOW_set_in_declobj498 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_PO_in_declobj512 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_NUM_in_declobj514 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PC_in_declobj517 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_dotvlaues_in_declobj519 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_SBO_in_declobj524 = new BitSet(new long[]{0x0000004020200000L});
    public static final BitSet FOLLOW_SBC_in_declobj533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotvlaues544 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_dotvlaues546 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_PO_in_dotvlaues549 = new BitSet(new long[]{0x0000000162242020L});
    public static final BitSet FOLLOW_arithExpr_in_dotvlaues552 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_COMA_in_dotvlaues555 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_arithExpr_in_dotvlaues557 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_PC_in_dotvlaues563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstmt575 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_PO_in_ifstmt577 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_condition_in_ifstmt579 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PC_in_ifstmt581 = new BitSet(new long[]{0x0000880200E08140L});
    public static final BitSet FOLLOW_block_in_ifstmt583 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ELSE_in_ifstmt586 = new BitSet(new long[]{0x0000880200E08140L});
    public static final BitSet FOLLOW_block_in_ifstmt588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpr_in_condition599 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMPARISONS_in_condition602 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_arithExpr_in_condition604 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_CBO_in_block615 = new BitSet(new long[]{0x0000880200E080C0L});
    public static final BitSet FOLLOW_statment_in_block618 = new BitSet(new long[]{0x0000880200E080C0L});
    public static final BitSet FOLLOW_CBC_in_block622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_block626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcCall634 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_PO_in_funcCall636 = new BitSet(new long[]{0x0000000162242020L});
    public static final BitSet FOLLOW_arithExpr_in_funcCall640 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_COMA_in_funcCall643 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_arithExpr_in_funcCall645 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_PC_in_funcCall651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilestmt659 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_PO_in_whilestmt661 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_condition_in_whilestmt663 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PC_in_whilestmt665 = new BitSet(new long[]{0x0000880200E08140L});
    public static final BitSet FOLLOW_block_in_whilestmt667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithExpr694 = new BitSet(new long[]{0x000000008A001002L});
    public static final BitSet FOLLOW_set_in_arithExpr697 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_term_in_arithExpr715 = new BitSet(new long[]{0x000000008A001002L});
    public static final BitSet FOLLOW_ID_in_term726 = new BitSet(new long[]{0x0000008000004002L});
    public static final BitSet FOLLOW_dotvlaues_in_term729 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_SBO_in_term732 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_arithExpr_in_term734 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SBC_in_term736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_term743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_term757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_term772 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_term775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_term793 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NUM_in_term796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_term814 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DNUM_in_term817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAMATION_in_term836 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_PO_in_term840 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_condition_in_term842 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PC_in_term844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term847 = new BitSet(new long[]{0x0000008000004002L});
    public static final BitSet FOLLOW_dotvlaues_in_term850 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_SBO_in_term854 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_arithExpr_in_term856 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SBC_in_term858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_term868 = new BitSet(new long[]{0x0000000122242020L});
    public static final BitSet FOLLOW_condition_in_term870 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PC_in_term872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_term879 = new BitSet(new long[]{0x0000000000000002L});

}