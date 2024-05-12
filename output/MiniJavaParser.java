// $ANTLR 3.4 D:\\Projects\\Mini-Java_Compiler\\MiniJava.g 2024-05-12 07:22:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndOr", "BOOL", "BOOLEAN", "CBC", "CBO", "CLASS", "COMA", "COMPARISONS", "DIV", "DNUM", "DOUBLE", "ELSE", "EQUAL", "EXTENDV", "Factor", "ID", "IF", "INT", "MAIN", "MINUS", "ML_COMMENT", "MULTI", "NUM", "PC", "PLUS", "PO", "PRINT", "PRIVATEV", "PUBLICV", "REMINDER", "RETURNV", "SBC", "SBO", "SEMICOLON", "SL_COMMENT", "STATIC", "STRING", "Start", "TEXT", "VOID", "WhiteSpace"
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
    public static final int DOUBLE=14;
    public static final int ELSE=15;
    public static final int EQUAL=16;
    public static final int EXTENDV=17;
    public static final int Factor=18;
    public static final int ID=19;
    public static final int IF=20;
    public static final int INT=21;
    public static final int MAIN=22;
    public static final int MINUS=23;
    public static final int ML_COMMENT=24;
    public static final int MULTI=25;
    public static final int NUM=26;
    public static final int PC=27;
    public static final int PLUS=28;
    public static final int PO=29;
    public static final int PRINT=30;
    public static final int PRIVATEV=31;
    public static final int PUBLICV=32;
    public static final int REMINDER=33;
    public static final int RETURNV=34;
    public static final int SBC=35;
    public static final int SBO=36;
    public static final int SEMICOLON=37;
    public static final int SL_COMMENT=38;
    public static final int STATIC=39;
    public static final int STRING=40;
    public static final int Start=41;
    public static final int TEXT=42;
    public static final int VOID=43;
    public static final int WhiteSpace=44;

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:1: class : ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( method )* ( mainmethod ( method )* )? CBC ;
    public final MiniJavaParser.class_return class() throws RecognitionException {
        MiniJavaParser.class_return retval = new MiniJavaParser.class_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLASS4=null;
        Token ID5=null;
        Token EXTENDV6=null;
        Token ID7=null;
        Token CBO8=null;
        Token CBC12=null;
        MiniJavaParser.modifier_return modifier3 =null;

        MiniJavaParser.method_return method9 =null;

        MiniJavaParser.mainmethod_return mainmethod10 =null;

        MiniJavaParser.method_return method11 =null;


        Object CLASS4_tree=null;
        Object ID5_tree=null;
        Object EXTENDV6_tree=null;
        Object ID7_tree=null;
        Object CBO8_tree=null;
        Object CBC12_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:8: ( ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( method )* ( mainmethod ( method )* )? CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:24:10: ( modifier )? CLASS ID ( EXTENDV ID )? CBO ( method )* ( mainmethod ( method )* )? CBC
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


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:25:5: ( method )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= PRIVATEV && LA4_0 <= PUBLICV)) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==STATIC) ) {
                        int LA4_4 = input.LA(3);

                        if ( (LA4_4==VOID) ) {
                            int LA4_5 = input.LA(4);

                            if ( (LA4_5==ID) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_4==BOOLEAN||LA4_4==DOUBLE||LA4_4==ID||LA4_4==INT||LA4_4==STRING) ) {
                            alt4=1;
                        }


                    }
                    else if ( (LA4_1==BOOLEAN||LA4_1==DOUBLE||LA4_1==ID||LA4_1==INT||LA4_1==STRING||LA4_1==VOID) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||LA4_0==ID||LA4_0==INT||(LA4_0 >= STATIC && LA4_0 <= STRING)||LA4_0==VOID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:25:5: method
            	    {
            	    pushFollow(FOLLOW_method_in_class104);
            	    method9=method();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method9.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:26:5: ( mainmethod ( method )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= PRIVATEV && LA6_0 <= PUBLICV)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:26:6: mainmethod ( method )*
                    {
                    pushFollow(FOLLOW_mainmethod_in_class112);
                    mainmethod10=mainmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, mainmethod10.getTree());

                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:26:17: ( method )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==BOOLEAN||LA5_0==DOUBLE||LA5_0==ID||LA5_0==INT||(LA5_0 >= PRIVATEV && LA5_0 <= PUBLICV)||(LA5_0 >= STATIC && LA5_0 <= STRING)||LA5_0==VOID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:26:17: method
                    	    {
                    	    pushFollow(FOLLOW_method_in_class114);
                    	    method11=method();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, method11.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            CBC12=(Token)match(input,CBC,FOLLOW_CBC_in_class122); 
            CBC12_tree = 
            (Object)adaptor.create(CBC12)
            ;
            adaptor.addChild(root_0, CBC12_tree);


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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:29:1: mainmethod : modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC ;
    public final MiniJavaParser.mainmethod_return mainmethod() throws RecognitionException {
        MiniJavaParser.mainmethod_return retval = new MiniJavaParser.mainmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC14=null;
        Token VOID15=null;
        Token MAIN16=null;
        Token PO17=null;
        Token STRING18=null;
        Token SBO19=null;
        Token SBC20=null;
        Token ID21=null;
        Token PC22=null;
        Token CBO23=null;
        Token CBC25=null;
        MiniJavaParser.modifier_return modifier13 =null;

        MiniJavaParser.statment_return statment24 =null;


        Object STATIC14_tree=null;
        Object VOID15_tree=null;
        Object MAIN16_tree=null;
        Object PO17_tree=null;
        Object STRING18_tree=null;
        Object SBO19_tree=null;
        Object SBC20_tree=null;
        Object ID21_tree=null;
        Object PC22_tree=null;
        Object CBO23_tree=null;
        Object CBC25_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:29:17: ( modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:29:19: modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO ( statment )* CBC
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_modifier_in_mainmethod135);
            modifier13=modifier();

            state._fsp--;

            adaptor.addChild(root_0, modifier13.getTree());

            STATIC14=(Token)match(input,STATIC,FOLLOW_STATIC_in_mainmethod137); 
            STATIC14_tree = 
            (Object)adaptor.create(STATIC14)
            ;
            adaptor.addChild(root_0, STATIC14_tree);


            VOID15=(Token)match(input,VOID,FOLLOW_VOID_in_mainmethod139); 
            VOID15_tree = 
            (Object)adaptor.create(VOID15)
            ;
            adaptor.addChild(root_0, VOID15_tree);


            MAIN16=(Token)match(input,MAIN,FOLLOW_MAIN_in_mainmethod141); 
            MAIN16_tree = 
            (Object)adaptor.create(MAIN16)
            ;
            adaptor.addChild(root_0, MAIN16_tree);


            PO17=(Token)match(input,PO,FOLLOW_PO_in_mainmethod143); 
            PO17_tree = 
            (Object)adaptor.create(PO17)
            ;
            adaptor.addChild(root_0, PO17_tree);


            STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_mainmethod145); 
            STRING18_tree = 
            (Object)adaptor.create(STRING18)
            ;
            adaptor.addChild(root_0, STRING18_tree);


            SBO19=(Token)match(input,SBO,FOLLOW_SBO_in_mainmethod147); 
            SBO19_tree = 
            (Object)adaptor.create(SBO19)
            ;
            adaptor.addChild(root_0, SBO19_tree);


            SBC20=(Token)match(input,SBC,FOLLOW_SBC_in_mainmethod149); 
            SBC20_tree = 
            (Object)adaptor.create(SBC20)
            ;
            adaptor.addChild(root_0, SBC20_tree);


            ID21=(Token)match(input,ID,FOLLOW_ID_in_mainmethod151); 
            ID21_tree = 
            (Object)adaptor.create(ID21)
            ;
            adaptor.addChild(root_0, ID21_tree);


            PC22=(Token)match(input,PC,FOLLOW_PC_in_mainmethod153); 
            PC22_tree = 
            (Object)adaptor.create(PC22)
            ;
            adaptor.addChild(root_0, PC22_tree);


            CBO23=(Token)match(input,CBO,FOLLOW_CBO_in_mainmethod155); 
            CBO23_tree = 
            (Object)adaptor.create(CBO23)
            ;
            adaptor.addChild(root_0, CBO23_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:30:5: ( statment )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLEAN||LA7_0==DOUBLE||(LA7_0 >= ID && LA7_0 <= INT)||LA7_0==PRINT||LA7_0==STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:30:5: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_mainmethod161);
            	    statment24=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment24.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            CBC25=(Token)match(input,CBC,FOLLOW_CBC_in_mainmethod179); 
            CBC25_tree = 
            (Object)adaptor.create(CBC25)
            ;
            adaptor.addChild(root_0, CBC25_tree);


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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:1: method : ( modifier )? ( STATIC )? ( voidmethod | returnmethod ) ;
    public final MiniJavaParser.method_return method() throws RecognitionException {
        MiniJavaParser.method_return retval = new MiniJavaParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STATIC27=null;
        MiniJavaParser.modifier_return modifier26 =null;

        MiniJavaParser.voidmethod_return voidmethod28 =null;

        MiniJavaParser.returnmethod_return returnmethod29 =null;


        Object STATIC27_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:9: ( ( modifier )? ( STATIC )? ( voidmethod | returnmethod ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:17: ( modifier )? ( STATIC )? ( voidmethod | returnmethod )
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:17: ( modifier )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= PRIVATEV && LA8_0 <= PUBLICV)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:17: modifier
                    {
                    pushFollow(FOLLOW_modifier_in_method195);
                    modifier26=modifier();

                    state._fsp--;

                    adaptor.addChild(root_0, modifier26.getTree());

                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:27: ( STATIC )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==STATIC) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:27: STATIC
                    {
                    STATIC27=(Token)match(input,STATIC,FOLLOW_STATIC_in_method198); 
                    STATIC27_tree = 
                    (Object)adaptor.create(STATIC27)
                    ;
                    adaptor.addChild(root_0, STATIC27_tree);


                    }
                    break;

            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:34: ( voidmethod | returnmethod )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==VOID) ) {
                alt10=1;
            }
            else if ( (LA10_0==BOOLEAN||LA10_0==DOUBLE||LA10_0==ID||LA10_0==INT||LA10_0==STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:35: voidmethod
                    {
                    pushFollow(FOLLOW_voidmethod_in_method201);
                    voidmethod28=voidmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, voidmethod28.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:33:46: returnmethod
                    {
                    pushFollow(FOLLOW_returnmethod_in_method203);
                    returnmethod29=returnmethod();

                    state._fsp--;

                    adaptor.addChild(root_0, returnmethod29.getTree());

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:35:1: voidmethod : VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC ;
    public final MiniJavaParser.voidmethod_return voidmethod() throws RecognitionException {
        MiniJavaParser.voidmethod_return retval = new MiniJavaParser.voidmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VOID30=null;
        Token ID31=null;
        Token PO32=null;
        Token ID34=null;
        Token COMA35=null;
        Token ID37=null;
        Token PC38=null;
        Token CBO39=null;
        Token CBC41=null;
        MiniJavaParser.type_return type33 =null;

        MiniJavaParser.type_return type36 =null;

        MiniJavaParser.statment_return statment40 =null;


        Object VOID30_tree=null;
        Object ID31_tree=null;
        Object PO32_tree=null;
        Object ID34_tree=null;
        Object COMA35_tree=null;
        Object ID37_tree=null;
        Object PC38_tree=null;
        Object CBO39_tree=null;
        Object CBC41_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:35:17: ( VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:35:22: VOID ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* CBC
            {
            root_0 = (Object)adaptor.nil();


            VOID30=(Token)match(input,VOID,FOLLOW_VOID_in_voidmethod224); 
            VOID30_tree = 
            (Object)adaptor.create(VOID30)
            ;
            adaptor.addChild(root_0, VOID30_tree);


            ID31=(Token)match(input,ID,FOLLOW_ID_in_voidmethod226); 
            ID31_tree = 
            (Object)adaptor.create(ID31)
            ;
            adaptor.addChild(root_0, ID31_tree);


            PO32=(Token)match(input,PO,FOLLOW_PO_in_voidmethod228); 
            PO32_tree = 
            (Object)adaptor.create(PO32)
            ;
            adaptor.addChild(root_0, PO32_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:35:33: ( type ID ( COMA type ID )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BOOLEAN||LA12_0==DOUBLE||LA12_0==ID||LA12_0==INT||LA12_0==STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:35:34: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_voidmethod231);
                    type33=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type33.getTree());

                    ID34=(Token)match(input,ID,FOLLOW_ID_in_voidmethod233); 
                    ID34_tree = 
                    (Object)adaptor.create(ID34)
                    ;
                    adaptor.addChild(root_0, ID34_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:35:42: ( COMA type ID )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:35:43: COMA type ID
                    	    {
                    	    COMA35=(Token)match(input,COMA,FOLLOW_COMA_in_voidmethod236); 
                    	    COMA35_tree = 
                    	    (Object)adaptor.create(COMA35)
                    	    ;
                    	    adaptor.addChild(root_0, COMA35_tree);


                    	    pushFollow(FOLLOW_type_in_voidmethod238);
                    	    type36=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type36.getTree());

                    	    ID37=(Token)match(input,ID,FOLLOW_ID_in_voidmethod240); 
                    	    ID37_tree = 
                    	    (Object)adaptor.create(ID37)
                    	    ;
                    	    adaptor.addChild(root_0, ID37_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            PC38=(Token)match(input,PC,FOLLOW_PC_in_voidmethod246); 
            PC38_tree = 
            (Object)adaptor.create(PC38)
            ;
            adaptor.addChild(root_0, PC38_tree);


            CBO39=(Token)match(input,CBO,FOLLOW_CBO_in_voidmethod248); 
            CBO39_tree = 
            (Object)adaptor.create(CBO39)
            ;
            adaptor.addChild(root_0, CBO39_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:12: ( statment )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==BOOLEAN||LA13_0==DOUBLE||(LA13_0 >= ID && LA13_0 <= INT)||LA13_0==PRINT||LA13_0==STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:36:12: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_voidmethod262);
            	    statment40=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment40.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            CBC41=(Token)match(input,CBC,FOLLOW_CBC_in_voidmethod268); 
            CBC41_tree = 
            (Object)adaptor.create(CBC41)
            ;
            adaptor.addChild(root_0, CBC41_tree);


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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:39:1: type : ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( SBO SBC )? ;
    public final MiniJavaParser.type_return type() throws RecognitionException {
        MiniJavaParser.type_return retval = new MiniJavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set42=null;
        Token SBO43=null;
        Token SBC44=null;

        Object set42_tree=null;
        Object SBO43_tree=null;
        Object SBC44_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:39:11: ( ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( SBO SBC )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:39:13: ( INT | DOUBLE | STRING | BOOLEAN | ID ) ( SBO SBC )?
            {
            root_0 = (Object)adaptor.nil();


            set42=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==ID||input.LA(1)==INT||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set42)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:39:44: ( SBO SBC )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==SBO) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:39:45: SBO SBC
                    {
                    SBO43=(Token)match(input,SBO,FOLLOW_SBO_in_type294); 
                    SBO43_tree = 
                    (Object)adaptor.create(SBO43)
                    ;
                    adaptor.addChild(root_0, SBO43_tree);


                    SBC44=(Token)match(input,SBC,FOLLOW_SBC_in_type296); 
                    SBC44_tree = 
                    (Object)adaptor.create(SBC44)
                    ;
                    adaptor.addChild(root_0, SBC44_tree);


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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:41:1: returnmethod : type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV ( ID | NUM | DNUM ) SEMICOLON CBC ;
    public final MiniJavaParser.returnmethod_return returnmethod() throws RecognitionException {
        MiniJavaParser.returnmethod_return retval = new MiniJavaParser.returnmethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID46=null;
        Token PO47=null;
        Token ID49=null;
        Token COMA50=null;
        Token ID52=null;
        Token PC53=null;
        Token CBO54=null;
        Token RETURNV56=null;
        Token set57=null;
        Token SEMICOLON58=null;
        Token CBC59=null;
        MiniJavaParser.type_return type45 =null;

        MiniJavaParser.type_return type48 =null;

        MiniJavaParser.type_return type51 =null;

        MiniJavaParser.statment_return statment55 =null;


        Object ID46_tree=null;
        Object PO47_tree=null;
        Object ID49_tree=null;
        Object COMA50_tree=null;
        Object ID52_tree=null;
        Object PC53_tree=null;
        Object CBO54_tree=null;
        Object RETURNV56_tree=null;
        Object set57_tree=null;
        Object SEMICOLON58_tree=null;
        Object CBC59_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:41:15: ( type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV ( ID | NUM | DNUM ) SEMICOLON CBC )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:41:17: type ID PO ( type ID ( COMA type ID )* )? PC CBO ( statment )* RETURNV ( ID | NUM | DNUM ) SEMICOLON CBC
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_returnmethod307);
            type45=type();

            state._fsp--;

            adaptor.addChild(root_0, type45.getTree());

            ID46=(Token)match(input,ID,FOLLOW_ID_in_returnmethod309); 
            ID46_tree = 
            (Object)adaptor.create(ID46)
            ;
            adaptor.addChild(root_0, ID46_tree);


            PO47=(Token)match(input,PO,FOLLOW_PO_in_returnmethod311); 
            PO47_tree = 
            (Object)adaptor.create(PO47)
            ;
            adaptor.addChild(root_0, PO47_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:41:28: ( type ID ( COMA type ID )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==BOOLEAN||LA16_0==DOUBLE||LA16_0==ID||LA16_0==INT||LA16_0==STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:41:29: type ID ( COMA type ID )*
                    {
                    pushFollow(FOLLOW_type_in_returnmethod314);
                    type48=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type48.getTree());

                    ID49=(Token)match(input,ID,FOLLOW_ID_in_returnmethod316); 
                    ID49_tree = 
                    (Object)adaptor.create(ID49)
                    ;
                    adaptor.addChild(root_0, ID49_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:41:37: ( COMA type ID )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:41:38: COMA type ID
                    	    {
                    	    COMA50=(Token)match(input,COMA,FOLLOW_COMA_in_returnmethod319); 
                    	    COMA50_tree = 
                    	    (Object)adaptor.create(COMA50)
                    	    ;
                    	    adaptor.addChild(root_0, COMA50_tree);


                    	    pushFollow(FOLLOW_type_in_returnmethod321);
                    	    type51=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type51.getTree());

                    	    ID52=(Token)match(input,ID,FOLLOW_ID_in_returnmethod323); 
                    	    ID52_tree = 
                    	    (Object)adaptor.create(ID52)
                    	    ;
                    	    adaptor.addChild(root_0, ID52_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            PC53=(Token)match(input,PC,FOLLOW_PC_in_returnmethod329); 
            PC53_tree = 
            (Object)adaptor.create(PC53)
            ;
            adaptor.addChild(root_0, PC53_tree);


            CBO54=(Token)match(input,CBO,FOLLOW_CBO_in_returnmethod331); 
            CBO54_tree = 
            (Object)adaptor.create(CBO54)
            ;
            adaptor.addChild(root_0, CBO54_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:6: ( statment )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==BOOLEAN||LA17_0==DOUBLE||(LA17_0 >= ID && LA17_0 <= INT)||LA17_0==PRINT||LA17_0==STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:42:6: statment
            	    {
            	    pushFollow(FOLLOW_statment_in_returnmethod350);
            	    statment55=statment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statment55.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            RETURNV56=(Token)match(input,RETURNV,FOLLOW_RETURNV_in_returnmethod377); 
            RETURNV56_tree = 
            (Object)adaptor.create(RETURNV56)
            ;
            adaptor.addChild(root_0, RETURNV56_tree);


            set57=(Token)input.LT(1);

            if ( input.LA(1)==DNUM||input.LA(1)==ID||input.LA(1)==NUM ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set57)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            SEMICOLON58=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_returnmethod387); 
            SEMICOLON58_tree = 
            (Object)adaptor.create(SEMICOLON58)
            ;
            adaptor.addChild(root_0, SEMICOLON58_tree);


            CBC59=(Token)match(input,CBC,FOLLOW_CBC_in_returnmethod392); 
            CBC59_tree = 
            (Object)adaptor.create(CBC59)
            ;
            adaptor.addChild(root_0, CBC59_tree);


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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:46:1: statment : ( print | initialize | ifstmt );
    public final MiniJavaParser.statment_return statment() throws RecognitionException {
        MiniJavaParser.statment_return retval = new MiniJavaParser.statment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.print_return print60 =null;

        MiniJavaParser.initialize_return initialize61 =null;

        MiniJavaParser.ifstmt_return ifstmt62 =null;



        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:46:10: ( print | initialize | ifstmt )
            int alt18=3;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt18=1;
                }
                break;
            case BOOLEAN:
            case DOUBLE:
            case ID:
            case INT:
            case STRING:
                {
                alt18=2;
                }
                break;
            case IF:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:46:12: print
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_print_in_statment402);
                    print60=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print60.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:46:18: initialize
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_initialize_in_statment404);
                    initialize61=initialize();

                    state._fsp--;

                    adaptor.addChild(root_0, initialize61.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:46:29: ifstmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifstmt_in_statment406);
                    ifstmt62=ifstmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ifstmt62.getTree());

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:1: print : PRINT PO ( TEXT | arithExpr ) PC SEMICOLON ;
    public final MiniJavaParser.print_return print() throws RecognitionException {
        MiniJavaParser.print_return retval = new MiniJavaParser.print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRINT63=null;
        Token PO64=null;
        Token TEXT65=null;
        Token PC67=null;
        Token SEMICOLON68=null;
        MiniJavaParser.arithExpr_return arithExpr66 =null;


        Object PRINT63_tree=null;
        Object PO64_tree=null;
        Object TEXT65_tree=null;
        Object PC67_tree=null;
        Object SEMICOLON68_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:8: ( PRINT PO ( TEXT | arithExpr ) PC SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:10: PRINT PO ( TEXT | arithExpr ) PC SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            PRINT63=(Token)match(input,PRINT,FOLLOW_PRINT_in_print415); 
            PRINT63_tree = 
            (Object)adaptor.create(PRINT63)
            ;
            adaptor.addChild(root_0, PRINT63_tree);


            PO64=(Token)match(input,PO,FOLLOW_PO_in_print417); 
            PO64_tree = 
            (Object)adaptor.create(PO64)
            ;
            adaptor.addChild(root_0, PO64_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:19: ( TEXT | arithExpr )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TEXT) ) {
                alt19=1;
            }
            else if ( (LA19_0==DNUM||LA19_0==ID||LA19_0==MINUS||LA19_0==NUM||LA19_0==PO) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:20: TEXT
                    {
                    TEXT65=(Token)match(input,TEXT,FOLLOW_TEXT_in_print420); 
                    TEXT65_tree = 
                    (Object)adaptor.create(TEXT65)
                    ;
                    adaptor.addChild(root_0, TEXT65_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:48:25: arithExpr
                    {
                    pushFollow(FOLLOW_arithExpr_in_print422);
                    arithExpr66=arithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpr66.getTree());

                    }
                    break;

            }


            PC67=(Token)match(input,PC,FOLLOW_PC_in_print425); 
            PC67_tree = 
            (Object)adaptor.create(PC67)
            ;
            adaptor.addChild(root_0, PC67_tree);


            SEMICOLON68=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_print427); 
            SEMICOLON68_tree = 
            (Object)adaptor.create(SEMICOLON68)
            ;
            adaptor.addChild(root_0, SEMICOLON68_tree);


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


    public static class ifstmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmt"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:50:1: ifstmt : IF PO condition PC block ( ELSE block )? ;
    public final MiniJavaParser.ifstmt_return ifstmt() throws RecognitionException {
        MiniJavaParser.ifstmt_return retval = new MiniJavaParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF69=null;
        Token PO70=null;
        Token PC72=null;
        Token ELSE74=null;
        MiniJavaParser.condition_return condition71 =null;

        MiniJavaParser.block_return block73 =null;

        MiniJavaParser.block_return block75 =null;


        Object IF69_tree=null;
        Object PO70_tree=null;
        Object PC72_tree=null;
        Object ELSE74_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:50:9: ( IF PO condition PC block ( ELSE block )? )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:50:11: IF PO condition PC block ( ELSE block )?
            {
            root_0 = (Object)adaptor.nil();


            IF69=(Token)match(input,IF,FOLLOW_IF_in_ifstmt437); 
            IF69_tree = 
            (Object)adaptor.create(IF69)
            ;
            adaptor.addChild(root_0, IF69_tree);


            PO70=(Token)match(input,PO,FOLLOW_PO_in_ifstmt439); 
            PO70_tree = 
            (Object)adaptor.create(PO70)
            ;
            adaptor.addChild(root_0, PO70_tree);


            pushFollow(FOLLOW_condition_in_ifstmt441);
            condition71=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition71.getTree());

            PC72=(Token)match(input,PC,FOLLOW_PC_in_ifstmt443); 
            PC72_tree = 
            (Object)adaptor.create(PC72)
            ;
            adaptor.addChild(root_0, PC72_tree);


            pushFollow(FOLLOW_block_in_ifstmt445);
            block73=block();

            state._fsp--;

            adaptor.addChild(root_0, block73.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:50:35: ( ELSE block )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ELSE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:50:37: ELSE block
                    {
                    ELSE74=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifstmt448); 
                    ELSE74_tree = 
                    (Object)adaptor.create(ELSE74)
                    ;
                    adaptor.addChild(root_0, ELSE74_tree);


                    pushFollow(FOLLOW_block_in_ifstmt450);
                    block75=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block75.getTree());

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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:52:1: condition : primaryExpr ( ( '+' | '-' | '*' | '/' ) primaryExpr )* ;
    public final MiniJavaParser.condition_return condition() throws RecognitionException {
        MiniJavaParser.condition_return retval = new MiniJavaParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set77=null;
        MiniJavaParser.primaryExpr_return primaryExpr76 =null;

        MiniJavaParser.primaryExpr_return primaryExpr78 =null;


        Object set77_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:52:11: ( primaryExpr ( ( '+' | '-' | '*' | '/' ) primaryExpr )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:52:13: primaryExpr ( ( '+' | '-' | '*' | '/' ) primaryExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_primaryExpr_in_condition461);
            primaryExpr76=primaryExpr();

            state._fsp--;

            adaptor.addChild(root_0, primaryExpr76.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:52:25: ( ( '+' | '-' | '*' | '/' ) primaryExpr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==DIV||LA21_0==MINUS||LA21_0==MULTI||LA21_0==PLUS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:52:27: ( '+' | '-' | '*' | '/' ) primaryExpr
            	    {
            	    set77=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULTI||input.LA(1)==PLUS ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set77)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_primaryExpr_in_condition475);
            	    primaryExpr78=primaryExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, primaryExpr78.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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


    public static class primaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaryExpr"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:1: primaryExpr : ( ID | NUM | DNUM | BOOL | '(' condition ')' );
    public final MiniJavaParser.primaryExpr_return primaryExpr() throws RecognitionException {
        MiniJavaParser.primaryExpr_return retval = new MiniJavaParser.primaryExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID79=null;
        Token NUM80=null;
        Token DNUM81=null;
        Token BOOL82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        MiniJavaParser.condition_return condition84 =null;


        Object ID79_tree=null;
        Object NUM80_tree=null;
        Object DNUM81_tree=null;
        Object BOOL82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:13: ( ID | NUM | DNUM | BOOL | '(' condition ')' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt22=1;
                }
                break;
            case NUM:
                {
                alt22=2;
                }
                break;
            case DNUM:
                {
                alt22=3;
                }
                break;
            case BOOL:
                {
                alt22=4;
                }
                break;
            case PO:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:15: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID79=(Token)match(input,ID,FOLLOW_ID_in_primaryExpr486); 
                    ID79_tree = 
                    (Object)adaptor.create(ID79)
                    ;
                    adaptor.addChild(root_0, ID79_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:20: NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM80=(Token)match(input,NUM,FOLLOW_NUM_in_primaryExpr490); 
                    NUM80_tree = 
                    (Object)adaptor.create(NUM80)
                    ;
                    adaptor.addChild(root_0, NUM80_tree);


                    }
                    break;
                case 3 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:26: DNUM
                    {
                    root_0 = (Object)adaptor.nil();


                    DNUM81=(Token)match(input,DNUM,FOLLOW_DNUM_in_primaryExpr494); 
                    DNUM81_tree = 
                    (Object)adaptor.create(DNUM81)
                    ;
                    adaptor.addChild(root_0, DNUM81_tree);


                    }
                    break;
                case 4 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:33: BOOL
                    {
                    root_0 = (Object)adaptor.nil();


                    BOOL82=(Token)match(input,BOOL,FOLLOW_BOOL_in_primaryExpr498); 
                    BOOL82_tree = 
                    (Object)adaptor.create(BOOL82)
                    ;
                    adaptor.addChild(root_0, BOOL82_tree);


                    }
                    break;
                case 5 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:54:40: '(' condition ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal83=(Token)match(input,PO,FOLLOW_PO_in_primaryExpr502); 
                    char_literal83_tree = 
                    (Object)adaptor.create(char_literal83)
                    ;
                    adaptor.addChild(root_0, char_literal83_tree);


                    pushFollow(FOLLOW_condition_in_primaryExpr504);
                    condition84=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition84.getTree());

                    char_literal85=(Token)match(input,PC,FOLLOW_PC_in_primaryExpr506); 
                    char_literal85_tree = 
                    (Object)adaptor.create(char_literal85)
                    ;
                    adaptor.addChild(root_0, char_literal85_tree);


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
    // $ANTLR end "primaryExpr"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:1: block : ( CBO ( ( statment )* ) CBC | statment );
    public final MiniJavaParser.block_return block() throws RecognitionException {
        MiniJavaParser.block_return retval = new MiniJavaParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CBO86=null;
        Token CBC88=null;
        MiniJavaParser.statment_return statment87 =null;

        MiniJavaParser.statment_return statment89 =null;


        Object CBO86_tree=null;
        Object CBC88_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:8: ( CBO ( ( statment )* ) CBC | statment )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==CBO) ) {
                alt24=1;
            }
            else if ( (LA24_0==BOOLEAN||LA24_0==DOUBLE||(LA24_0 >= ID && LA24_0 <= INT)||LA24_0==PRINT||LA24_0==STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:10: CBO ( ( statment )* ) CBC
                    {
                    root_0 = (Object)adaptor.nil();


                    CBO86=(Token)match(input,CBO,FOLLOW_CBO_in_block515); 
                    CBO86_tree = 
                    (Object)adaptor.create(CBO86)
                    ;
                    adaptor.addChild(root_0, CBO86_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:14: ( ( statment )* )
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:15: ( statment )*
                    {
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:15: ( statment )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==BOOLEAN||LA23_0==DOUBLE||(LA23_0 >= ID && LA23_0 <= INT)||LA23_0==PRINT||LA23_0==STRING) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:15: statment
                    	    {
                    	    pushFollow(FOLLOW_statment_in_block518);
                    	    statment87=statment();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statment87.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }


                    CBC88=(Token)match(input,CBC,FOLLOW_CBC_in_block522); 
                    CBC88_tree = 
                    (Object)adaptor.create(CBC88)
                    ;
                    adaptor.addChild(root_0, CBC88_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:56:32: statment
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statment_in_block526);
                    statment89=statment();

                    state._fsp--;

                    adaptor.addChild(root_0, statment89.getTree());

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


    public static class signs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signs"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:58:1: signs : ( PLUS | MINUS | MULTI | DIV | REMINDER ) ;
    public final MiniJavaParser.signs_return signs() throws RecognitionException {
        MiniJavaParser.signs_return retval = new MiniJavaParser.signs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set90=null;

        Object set90_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:58:8: ( ( PLUS | MINUS | MULTI | DIV | REMINDER ) )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set90=(Token)input.LT(1);

            if ( input.LA(1)==DIV||input.LA(1)==MINUS||input.LA(1)==MULTI||input.LA(1)==PLUS||input.LA(1)==REMINDER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set90)
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


    public static class initialize_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialize"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:60:1: initialize : type ID ( EQUAL ( arithExpr | TEXT ) )? SEMICOLON ;
    public final MiniJavaParser.initialize_return initialize() throws RecognitionException {
        MiniJavaParser.initialize_return retval = new MiniJavaParser.initialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID92=null;
        Token EQUAL93=null;
        Token TEXT95=null;
        Token SEMICOLON96=null;
        MiniJavaParser.type_return type91 =null;

        MiniJavaParser.arithExpr_return arithExpr94 =null;


        Object ID92_tree=null;
        Object EQUAL93_tree=null;
        Object TEXT95_tree=null;
        Object SEMICOLON96_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:60:12: ( type ID ( EQUAL ( arithExpr | TEXT ) )? SEMICOLON )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:60:14: type ID ( EQUAL ( arithExpr | TEXT ) )? SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_initialize553);
            type91=type();

            state._fsp--;

            adaptor.addChild(root_0, type91.getTree());

            ID92=(Token)match(input,ID,FOLLOW_ID_in_initialize555); 
            ID92_tree = 
            (Object)adaptor.create(ID92)
            ;
            adaptor.addChild(root_0, ID92_tree);


            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:60:22: ( EQUAL ( arithExpr | TEXT ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EQUAL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:60:23: EQUAL ( arithExpr | TEXT )
                    {
                    EQUAL93=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_initialize558); 
                    EQUAL93_tree = 
                    (Object)adaptor.create(EQUAL93)
                    ;
                    adaptor.addChild(root_0, EQUAL93_tree);


                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:60:29: ( arithExpr | TEXT )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DNUM||LA25_0==ID||LA25_0==MINUS||LA25_0==NUM||LA25_0==PO) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==TEXT) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:60:30: arithExpr
                            {
                            pushFollow(FOLLOW_arithExpr_in_initialize561);
                            arithExpr94=arithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, arithExpr94.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:60:40: TEXT
                            {
                            TEXT95=(Token)match(input,TEXT,FOLLOW_TEXT_in_initialize563); 
                            TEXT95_tree = 
                            (Object)adaptor.create(TEXT95)
                            ;
                            adaptor.addChild(root_0, TEXT95_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            SEMICOLON96=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_initialize568); 
            SEMICOLON96_tree = 
            (Object)adaptor.create(SEMICOLON96)
            ;
            adaptor.addChild(root_0, SEMICOLON96_tree);


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


    public static class arithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithExpr"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:1: arithExpr : term ( ( PLUS | MINUS ) ^ term )* ;
    public final MiniJavaParser.arithExpr_return arithExpr() throws RecognitionException {
        MiniJavaParser.arithExpr_return retval = new MiniJavaParser.arithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set98=null;
        MiniJavaParser.term_return term97 =null;

        MiniJavaParser.term_return term99 =null;


        Object set98_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:11: ( term ( ( PLUS | MINUS ) ^ term )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:13: term ( ( PLUS | MINUS ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_arithExpr576);
            term97=term();

            state._fsp--;

            adaptor.addChild(root_0, term97.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:18: ( ( PLUS | MINUS ) ^ term )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==MINUS||LA27_0==PLUS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:62:19: ( PLUS | MINUS ) ^ term
            	    {
            	    set98=(Token)input.LT(1);

            	    set98=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set98)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_arithExpr589);
            	    term99=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term99.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:64:1: term : factor ( ( MULTI | DIV ) ^ factor )* ;
    public final MiniJavaParser.term_return term() throws RecognitionException {
        MiniJavaParser.term_return retval = new MiniJavaParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set101=null;
        MiniJavaParser.factor_return factor100 =null;

        MiniJavaParser.factor_return factor102 =null;


        Object set101_tree=null;

        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:64:7: ( factor ( ( MULTI | DIV ) ^ factor )* )
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:64:9: factor ( ( MULTI | DIV ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term600);
            factor100=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor100.getTree());

            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:64:16: ( ( MULTI | DIV ) ^ factor )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==DIV||LA28_0==MULTI) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:64:18: ( MULTI | DIV ) ^ factor
            	    {
            	    set101=(Token)input.LT(1);

            	    set101=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==MULTI ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set101)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term615);
            	    factor102=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor102.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:66:1: factor : ( ID -> ^( Factor ID ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DNUM ) | MINUS ID -> ^( Factor MINUS ID ) | MINUS NUM -> ^( Factor MINUS NUM ) | MINUS DNUM -> ^( Factor MINUS DNUM ) | PO arithExpr PC -> ^( Factor PO arithExpr PC ) );
    public final MiniJavaParser.factor_return factor() throws RecognitionException {
        MiniJavaParser.factor_return retval = new MiniJavaParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID103=null;
        Token NUM104=null;
        Token DNUM105=null;
        Token MINUS106=null;
        Token ID107=null;
        Token MINUS108=null;
        Token NUM109=null;
        Token MINUS110=null;
        Token DNUM111=null;
        Token PO112=null;
        Token PC114=null;
        MiniJavaParser.arithExpr_return arithExpr113 =null;


        Object ID103_tree=null;
        Object NUM104_tree=null;
        Object DNUM105_tree=null;
        Object MINUS106_tree=null;
        Object ID107_tree=null;
        Object MINUS108_tree=null;
        Object NUM109_tree=null;
        Object MINUS110_tree=null;
        Object DNUM111_tree=null;
        Object PO112_tree=null;
        Object PC114_tree=null;
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_PC=new RewriteRuleTokenStream(adaptor,"token PC");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_PO=new RewriteRuleTokenStream(adaptor,"token PO");
        RewriteRuleSubtreeStream stream_arithExpr=new RewriteRuleSubtreeStream(adaptor,"rule arithExpr");
        try {
            // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:66:9: ( ID -> ^( Factor ID ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DNUM ) | MINUS ID -> ^( Factor MINUS ID ) | MINUS NUM -> ^( Factor MINUS NUM ) | MINUS DNUM -> ^( Factor MINUS DNUM ) | PO arithExpr PC -> ^( Factor PO arithExpr PC ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt29=1;
                }
                break;
            case NUM:
                {
                alt29=2;
                }
                break;
            case DNUM:
                {
                alt29=3;
                }
                break;
            case MINUS:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    alt29=4;
                    }
                    break;
                case NUM:
                    {
                    alt29=5;
                    }
                    break;
                case DNUM:
                    {
                    alt29=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 4, input);

                    throw nvae;

                }

                }
                break;
            case PO:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:66:11: ID
                    {
                    ID103=(Token)match(input,ID,FOLLOW_ID_in_factor626);  
                    stream_ID.add(ID103);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:14: -> ^( Factor ID )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:66:17: ^( Factor ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:67:5: NUM
                    {
                    NUM104=(Token)match(input,NUM,FOLLOW_NUM_in_factor640);  
                    stream_NUM.add(NUM104);


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
                    // 67:9: -> ^( Factor NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:67:12: ^( Factor NUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:68:5: DNUM
                    {
                    DNUM105=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor654);  
                    stream_DNUM.add(DNUM105);


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
                    // 68:10: -> ^( Factor DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:68:13: ^( Factor DNUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:6: MINUS ID
                    {
                    MINUS106=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor669);  
                    stream_MINUS.add(MINUS106);


                    ID107=(Token)match(input,ID,FOLLOW_ID_in_factor672);  
                    stream_ID.add(ID107);


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
                    // 69:16: -> ^( Factor MINUS ID )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:69:19: ^( Factor MINUS ID )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:6: MINUS NUM
                    {
                    MINUS108=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor690);  
                    stream_MINUS.add(MINUS108);


                    NUM109=(Token)match(input,NUM,FOLLOW_NUM_in_factor693);  
                    stream_NUM.add(NUM109);


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
                    // 70:17: -> ^( Factor MINUS NUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:70:20: ^( Factor MINUS NUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:6: MINUS DNUM
                    {
                    MINUS110=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor711);  
                    stream_MINUS.add(MINUS110);


                    DNUM111=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor714);  
                    stream_DNUM.add(DNUM111);


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
                    // 71:19: -> ^( Factor MINUS DNUM )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:71:22: ^( Factor MINUS DNUM )
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
                    // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:72:6: PO arithExpr PC
                    {
                    PO112=(Token)match(input,PO,FOLLOW_PO_in_factor733);  
                    stream_PO.add(PO112);


                    pushFollow(FOLLOW_arithExpr_in_factor735);
                    arithExpr113=arithExpr();

                    state._fsp--;

                    stream_arithExpr.add(arithExpr113.getTree());

                    PC114=(Token)match(input,PC,FOLLOW_PC_in_factor737);  
                    stream_PC.add(PC114);


                    // AST REWRITE
                    // elements: arithExpr, PO, PC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:22: -> ^( Factor PO arithExpr PC )
                    {
                        // D:\\Projects\\Mini-Java_Compiler\\MiniJava.g:72:25: ^( Factor PO arithExpr PC )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_PO.nextNode()
                        );

                        adaptor.addChild(root_1, stream_arithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_PC.nextNode()
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
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_class_in_start38 = new BitSet(new long[]{0x0000000180000202L});
    public static final BitSet FOLLOW_modifier_in_class84 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CLASS_in_class87 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_class89 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_EXTENDV_in_class92 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_class94 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CBO_in_class98 = new BitSet(new long[]{0x00000981802840C0L});
    public static final BitSet FOLLOW_method_in_class104 = new BitSet(new long[]{0x00000981802840C0L});
    public static final BitSet FOLLOW_mainmethod_in_class112 = new BitSet(new long[]{0x00000981802840C0L});
    public static final BitSet FOLLOW_method_in_class114 = new BitSet(new long[]{0x00000981802840C0L});
    public static final BitSet FOLLOW_CBC_in_class122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_mainmethod135 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_STATIC_in_mainmethod137 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_VOID_in_mainmethod139 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_MAIN_in_mainmethod141 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PO_in_mainmethod143 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_STRING_in_mainmethod145 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SBO_in_mainmethod147 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_SBC_in_mainmethod149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_mainmethod151 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PC_in_mainmethod153 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CBO_in_mainmethod155 = new BitSet(new long[]{0x00000100403840C0L});
    public static final BitSet FOLLOW_statment_in_mainmethod161 = new BitSet(new long[]{0x00000100403840C0L});
    public static final BitSet FOLLOW_CBC_in_mainmethod179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_method195 = new BitSet(new long[]{0x0000098000284040L});
    public static final BitSet FOLLOW_STATIC_in_method198 = new BitSet(new long[]{0x0000090000284040L});
    public static final BitSet FOLLOW_voidmethod_in_method201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnmethod_in_method203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_voidmethod224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_voidmethod226 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PO_in_voidmethod228 = new BitSet(new long[]{0x0000010008284040L});
    public static final BitSet FOLLOW_type_in_voidmethod231 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_voidmethod233 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_COMA_in_voidmethod236 = new BitSet(new long[]{0x0000010000284040L});
    public static final BitSet FOLLOW_type_in_voidmethod238 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_voidmethod240 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_PC_in_voidmethod246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CBO_in_voidmethod248 = new BitSet(new long[]{0x00000100403840C0L});
    public static final BitSet FOLLOW_statment_in_voidmethod262 = new BitSet(new long[]{0x00000100403840C0L});
    public static final BitSet FOLLOW_CBC_in_voidmethod268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type281 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_SBO_in_type294 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_SBC_in_type296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_returnmethod307 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_returnmethod309 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PO_in_returnmethod311 = new BitSet(new long[]{0x0000010008284040L});
    public static final BitSet FOLLOW_type_in_returnmethod314 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_returnmethod316 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_COMA_in_returnmethod319 = new BitSet(new long[]{0x0000010000284040L});
    public static final BitSet FOLLOW_type_in_returnmethod321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_returnmethod323 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_PC_in_returnmethod329 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CBO_in_returnmethod331 = new BitSet(new long[]{0x0000010440384040L});
    public static final BitSet FOLLOW_statment_in_returnmethod350 = new BitSet(new long[]{0x0000010440384040L});
    public static final BitSet FOLLOW_RETURNV_in_returnmethod377 = new BitSet(new long[]{0x0000000004082000L});
    public static final BitSet FOLLOW_set_in_returnmethod379 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_returnmethod387 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CBC_in_returnmethod392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_statment402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initialize_in_statment404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statment406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print415 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PO_in_print417 = new BitSet(new long[]{0x0000040024882000L});
    public static final BitSet FOLLOW_TEXT_in_print420 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_arithExpr_in_print422 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PC_in_print425 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_print427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstmt437 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_PO_in_ifstmt439 = new BitSet(new long[]{0x0000000024082020L});
    public static final BitSet FOLLOW_condition_in_ifstmt441 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PC_in_ifstmt443 = new BitSet(new long[]{0x0000010040384140L});
    public static final BitSet FOLLOW_block_in_ifstmt445 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ELSE_in_ifstmt448 = new BitSet(new long[]{0x0000010040384140L});
    public static final BitSet FOLLOW_block_in_ifstmt450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_condition461 = new BitSet(new long[]{0x0000000012801002L});
    public static final BitSet FOLLOW_set_in_condition465 = new BitSet(new long[]{0x0000000024082020L});
    public static final BitSet FOLLOW_primaryExpr_in_condition475 = new BitSet(new long[]{0x0000000012801002L});
    public static final BitSet FOLLOW_ID_in_primaryExpr486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_primaryExpr490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_primaryExpr494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primaryExpr498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_primaryExpr502 = new BitSet(new long[]{0x0000000024082020L});
    public static final BitSet FOLLOW_condition_in_primaryExpr504 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PC_in_primaryExpr506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CBO_in_block515 = new BitSet(new long[]{0x00000100403840C0L});
    public static final BitSet FOLLOW_statment_in_block518 = new BitSet(new long[]{0x00000100403840C0L});
    public static final BitSet FOLLOW_CBC_in_block522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statment_in_block526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_initialize553 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_initialize555 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_EQUAL_in_initialize558 = new BitSet(new long[]{0x0000040024882000L});
    public static final BitSet FOLLOW_arithExpr_in_initialize561 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_TEXT_in_initialize563 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_initialize568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithExpr576 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_set_in_arithExpr579 = new BitSet(new long[]{0x0000000024882000L});
    public static final BitSet FOLLOW_term_in_arithExpr589 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_factor_in_term600 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_set_in_term604 = new BitSet(new long[]{0x0000000024882000L});
    public static final BitSet FOLLOW_factor_in_term615 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_ID_in_factor626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor669 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_factor672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor690 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_NUM_in_factor693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor711 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DNUM_in_factor714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PO_in_factor733 = new BitSet(new long[]{0x0000000024882000L});
    public static final BitSet FOLLOW_arithExpr_in_factor735 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PC_in_factor737 = new BitSet(new long[]{0x0000000000000002L});

}