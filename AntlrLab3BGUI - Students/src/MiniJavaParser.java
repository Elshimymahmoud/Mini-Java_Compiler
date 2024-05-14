// $ANTLR 3.4 C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g 2024-05-09 22:29:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ApNum", "AparOrUnitAndItsNumber", "ApartOrUnit", "City", "CityStateZip", "Country", "Firstname", "Fullname", "Gender", "Individuals", "Lastname", "NUM", "STRING", "Start", "Start1", "State", "Statments", "Street", "StreetName", "StreetNo", "VAR", "WhiteSpace", "ZipCode", "'#'", "'('", "')'", "','", "'---'", "'->'", "'Apartment'", "'City'", "'Country'", "'Female'", "'Individuals'", "'Male'", "'Street'", "'Unit'", "'and'", "'code'", "'first'", "'its'", "'last'", "'name'", "'number'", "'or'", "'state'", "'unit'", "'zip'"
    };

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
    public String getGrammarFileName() { return "C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g"; }


    String s="";


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:31:1: start : ( ( statments )+ ) -> ^( Start ( statments )+ ) ;
    public final MiniJavaParser.start_return start() throws RecognitionException {
        MiniJavaParser.start_return retval = new MiniJavaParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.statments_return statments1 =null;


        RewriteRuleSubtreeStream stream_statments=new RewriteRuleSubtreeStream(adaptor,"rule statments");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:31:7: ( ( ( statments )+ ) -> ^( Start ( statments )+ ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:31:9: ( ( statments )+ )
            {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:31:9: ( ( statments )+ )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:31:10: ( statments )+
            {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:31:10: ( statments )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:31:10: statments
            	    {
            	    pushFollow(FOLLOW_statments_in_start87);
            	    statments1=statments();

            	    state._fsp--;

            	    stream_statments.add(statments1.getTree());

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
            // elements: statments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 31:22: -> ^( Start ( statments )+ )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:31:24: ^( Start ( statments )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                if ( !(stream_statments.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statments.hasNext() ) {
                    adaptor.addChild(root_1, stream_statments.nextTree());

                }
                stream_statments.reset();

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
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:42:1: statments : '---' ( stmt )* '---' -> ^( Statments ( stmt )* ) ;
    public final MiniJavaParser.statments_return statments() throws RecognitionException {
        MiniJavaParser.statments_return retval = new MiniJavaParser.statments_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal2=null;
        Token string_literal4=null;
        MiniJavaParser.stmt_return stmt3 =null;


        Object string_literal2_tree=null;
        Object string_literal4_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:42:20: ( '---' ( stmt )* '---' -> ^( Statments ( stmt )* ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:42:22: '---' ( stmt )* '---'
            {
            string_literal2=(Token)match(input,31,FOLLOW_31_in_statments144);  
            stream_31.add(string_literal2);


            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:42:27: ( stmt )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 33 && LA2_0 <= 35)||LA2_0==37||LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:42:28: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_statments146);
            	    stmt3=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            string_literal4=(Token)match(input,31,FOLLOW_31_in_statments149);  
            stream_31.add(string_literal4);


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
            // 42:40: -> ^( Statments ( stmt )* )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:42:42: ^( Statments ( stmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Statments, "Statments")
                , root_1);

                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:42:54: ( stmt )*
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
    // $ANTLR end "statments"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:45:1: stmt : ( 'Individuals' 'first' 'and' 'last' 'name' ( '->' fullname ( '(' gender ')' )? )+ -> ^( Individuals ( fullname ( '(' gender ')' )? )+ ) | 'Street' 'number' 'and' 'name' '->' stnumber stname -> ^( Street stnumber stname ) | 'Apartment' 'or' 'unit' 'and' 'its' 'number' '->' place plnum -> ^( AparOrUnitAndItsNumber place plnum ) | 'City' ',' 'state' 'and' 'zip' 'code' '->' cityname ',' state zipcode -> ^( City cityname state zipcode ) | 'Country' '->' VAR -> ^( Country VAR ) ) ;
    public final MiniJavaParser.stmt_return stmt() throws RecognitionException {
        MiniJavaParser.stmt_return retval = new MiniJavaParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal5=null;
        Token string_literal6=null;
        Token string_literal7=null;
        Token string_literal8=null;
        Token string_literal9=null;
        Token string_literal10=null;
        Token char_literal12=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token string_literal16=null;
        Token string_literal17=null;
        Token string_literal18=null;
        Token string_literal19=null;
        Token string_literal22=null;
        Token string_literal23=null;
        Token string_literal24=null;
        Token string_literal25=null;
        Token string_literal26=null;
        Token string_literal27=null;
        Token string_literal28=null;
        Token string_literal31=null;
        Token char_literal32=null;
        Token string_literal33=null;
        Token string_literal34=null;
        Token string_literal35=null;
        Token string_literal36=null;
        Token string_literal37=null;
        Token char_literal39=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token VAR44=null;
        MiniJavaParser.fullname_return fullname11 =null;

        MiniJavaParser.gender_return gender13 =null;

        MiniJavaParser.stnumber_return stnumber20 =null;

        MiniJavaParser.stname_return stname21 =null;

        MiniJavaParser.place_return place29 =null;

        MiniJavaParser.plnum_return plnum30 =null;

        MiniJavaParser.cityname_return cityname38 =null;

        MiniJavaParser.state_return state40 =null;

        MiniJavaParser.zipcode_return zipcode41 =null;


        Object string_literal5_tree=null;
        Object string_literal6_tree=null;
        Object string_literal7_tree=null;
        Object string_literal8_tree=null;
        Object string_literal9_tree=null;
        Object string_literal10_tree=null;
        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object string_literal16_tree=null;
        Object string_literal17_tree=null;
        Object string_literal18_tree=null;
        Object string_literal19_tree=null;
        Object string_literal22_tree=null;
        Object string_literal23_tree=null;
        Object string_literal24_tree=null;
        Object string_literal25_tree=null;
        Object string_literal26_tree=null;
        Object string_literal27_tree=null;
        Object string_literal28_tree=null;
        Object string_literal31_tree=null;
        Object char_literal32_tree=null;
        Object string_literal33_tree=null;
        Object string_literal34_tree=null;
        Object string_literal35_tree=null;
        Object string_literal36_tree=null;
        Object string_literal37_tree=null;
        Object char_literal39_tree=null;
        Object string_literal42_tree=null;
        Object string_literal43_tree=null;
        Object VAR44_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_zipcode=new RewriteRuleSubtreeStream(adaptor,"rule zipcode");
        RewriteRuleSubtreeStream stream_gender=new RewriteRuleSubtreeStream(adaptor,"rule gender");
        RewriteRuleSubtreeStream stream_plnum=new RewriteRuleSubtreeStream(adaptor,"rule plnum");
        RewriteRuleSubtreeStream stream_cityname=new RewriteRuleSubtreeStream(adaptor,"rule cityname");
        RewriteRuleSubtreeStream stream_stnumber=new RewriteRuleSubtreeStream(adaptor,"rule stnumber");
        RewriteRuleSubtreeStream stream_fullname=new RewriteRuleSubtreeStream(adaptor,"rule fullname");
        RewriteRuleSubtreeStream stream_place=new RewriteRuleSubtreeStream(adaptor,"rule place");
        RewriteRuleSubtreeStream stream_state=new RewriteRuleSubtreeStream(adaptor,"rule state");
        RewriteRuleSubtreeStream stream_stname=new RewriteRuleSubtreeStream(adaptor,"rule stname");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:45:9: ( ( 'Individuals' 'first' 'and' 'last' 'name' ( '->' fullname ( '(' gender ')' )? )+ -> ^( Individuals ( fullname ( '(' gender ')' )? )+ ) | 'Street' 'number' 'and' 'name' '->' stnumber stname -> ^( Street stnumber stname ) | 'Apartment' 'or' 'unit' 'and' 'its' 'number' '->' place plnum -> ^( AparOrUnitAndItsNumber place plnum ) | 'City' ',' 'state' 'and' 'zip' 'code' '->' cityname ',' state zipcode -> ^( City cityname state zipcode ) | 'Country' '->' VAR -> ^( Country VAR ) ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:45:13: ( 'Individuals' 'first' 'and' 'last' 'name' ( '->' fullname ( '(' gender ')' )? )+ -> ^( Individuals ( fullname ( '(' gender ')' )? )+ ) | 'Street' 'number' 'and' 'name' '->' stnumber stname -> ^( Street stnumber stname ) | 'Apartment' 'or' 'unit' 'and' 'its' 'number' '->' place plnum -> ^( AparOrUnitAndItsNumber place plnum ) | 'City' ',' 'state' 'and' 'zip' 'code' '->' cityname ',' state zipcode -> ^( City cityname state zipcode ) | 'Country' '->' VAR -> ^( Country VAR ) )
            {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:45:13: ( 'Individuals' 'first' 'and' 'last' 'name' ( '->' fullname ( '(' gender ')' )? )+ -> ^( Individuals ( fullname ( '(' gender ')' )? )+ ) | 'Street' 'number' 'and' 'name' '->' stnumber stname -> ^( Street stnumber stname ) | 'Apartment' 'or' 'unit' 'and' 'its' 'number' '->' place plnum -> ^( AparOrUnitAndItsNumber place plnum ) | 'City' ',' 'state' 'and' 'zip' 'code' '->' cityname ',' state zipcode -> ^( City cityname state zipcode ) | 'Country' '->' VAR -> ^( Country VAR ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 35:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:46:2: 'Individuals' 'first' 'and' 'last' 'name' ( '->' fullname ( '(' gender ')' )? )+
                    {
                    string_literal5=(Token)match(input,37,FOLLOW_37_in_stmt176);  
                    stream_37.add(string_literal5);


                    string_literal6=(Token)match(input,43,FOLLOW_43_in_stmt178);  
                    stream_43.add(string_literal6);


                    string_literal7=(Token)match(input,41,FOLLOW_41_in_stmt180);  
                    stream_41.add(string_literal7);


                    string_literal8=(Token)match(input,45,FOLLOW_45_in_stmt182);  
                    stream_45.add(string_literal8);


                    string_literal9=(Token)match(input,46,FOLLOW_46_in_stmt183);  
                    stream_46.add(string_literal9);


                    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:46:43: ( '->' fullname ( '(' gender ')' )? )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==32) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:46:44: '->' fullname ( '(' gender ')' )?
                    	    {
                    	    string_literal10=(Token)match(input,32,FOLLOW_32_in_stmt186);  
                    	    stream_32.add(string_literal10);


                    	    pushFollow(FOLLOW_fullname_in_stmt188);
                    	    fullname11=fullname();

                    	    state._fsp--;

                    	    stream_fullname.add(fullname11.getTree());

                    	    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:46:59: ( '(' gender ')' )?
                    	    int alt3=2;
                    	    int LA3_0 = input.LA(1);

                    	    if ( (LA3_0==28) ) {
                    	        alt3=1;
                    	    }
                    	    switch (alt3) {
                    	        case 1 :
                    	            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:46:60: '(' gender ')'
                    	            {
                    	            char_literal12=(Token)match(input,28,FOLLOW_28_in_stmt192);  
                    	            stream_28.add(char_literal12);


                    	            pushFollow(FOLLOW_gender_in_stmt193);
                    	            gender13=gender();

                    	            state._fsp--;

                    	            stream_gender.add(gender13.getTree());

                    	            char_literal14=(Token)match(input,29,FOLLOW_29_in_stmt194);  
                    	            stream_29.add(char_literal14);


                    	            }
                    	            break;

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


                    // AST REWRITE
                    // elements: 28, fullname, gender, 29
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 46:78: -> ^( Individuals ( fullname ( '(' gender ')' )? )+ )
                    {
                        // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:46:80: ^( Individuals ( fullname ( '(' gender ')' )? )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Individuals, "Individuals")
                        , root_1);

                        if ( !(stream_fullname.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_fullname.hasNext() ) {
                            adaptor.addChild(root_1, stream_fullname.nextTree());

                            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:46:106: ( '(' gender ')' )?
                            if ( stream_28.hasNext()||stream_gender.hasNext()||stream_29.hasNext() ) {
                                adaptor.addChild(root_1, 
                                stream_28.nextNode()
                                );

                                adaptor.addChild(root_1, stream_gender.nextTree());

                                adaptor.addChild(root_1, 
                                stream_29.nextNode()
                                );

                            }
                            stream_28.reset();
                            stream_gender.reset();
                            stream_29.reset();

                        }
                        stream_fullname.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:47:3: 'Street' 'number' 'and' 'name' '->' stnumber stname
                    {
                    string_literal15=(Token)match(input,39,FOLLOW_39_in_stmt223);  
                    stream_39.add(string_literal15);


                    string_literal16=(Token)match(input,47,FOLLOW_47_in_stmt225);  
                    stream_47.add(string_literal16);


                    string_literal17=(Token)match(input,41,FOLLOW_41_in_stmt227);  
                    stream_41.add(string_literal17);


                    string_literal18=(Token)match(input,46,FOLLOW_46_in_stmt229);  
                    stream_46.add(string_literal18);


                    string_literal19=(Token)match(input,32,FOLLOW_32_in_stmt231);  
                    stream_32.add(string_literal19);


                    pushFollow(FOLLOW_stnumber_in_stmt233);
                    stnumber20=stnumber();

                    state._fsp--;

                    stream_stnumber.add(stnumber20.getTree());

                    pushFollow(FOLLOW_stname_in_stmt235);
                    stname21=stname();

                    state._fsp--;

                    stream_stname.add(stname21.getTree());

                    // AST REWRITE
                    // elements: stnumber, stname
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 47:56: -> ^( Street stnumber stname )
                    {
                        // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:47:58: ^( Street stnumber stname )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Street, "Street")
                        , root_1);

                        adaptor.addChild(root_1, stream_stnumber.nextTree());

                        adaptor.addChild(root_1, stream_stname.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:48:3: 'Apartment' 'or' 'unit' 'and' 'its' 'number' '->' place plnum
                    {
                    string_literal22=(Token)match(input,33,FOLLOW_33_in_stmt249);  
                    stream_33.add(string_literal22);


                    string_literal23=(Token)match(input,48,FOLLOW_48_in_stmt251);  
                    stream_48.add(string_literal23);


                    string_literal24=(Token)match(input,50,FOLLOW_50_in_stmt253);  
                    stream_50.add(string_literal24);


                    string_literal25=(Token)match(input,41,FOLLOW_41_in_stmt255);  
                    stream_41.add(string_literal25);


                    string_literal26=(Token)match(input,44,FOLLOW_44_in_stmt257);  
                    stream_44.add(string_literal26);


                    string_literal27=(Token)match(input,47,FOLLOW_47_in_stmt259);  
                    stream_47.add(string_literal27);


                    string_literal28=(Token)match(input,32,FOLLOW_32_in_stmt261);  
                    stream_32.add(string_literal28);


                    pushFollow(FOLLOW_place_in_stmt263);
                    place29=place();

                    state._fsp--;

                    stream_place.add(place29.getTree());

                    pushFollow(FOLLOW_plnum_in_stmt265);
                    plnum30=plnum();

                    state._fsp--;

                    stream_plnum.add(plnum30.getTree());

                    // AST REWRITE
                    // elements: place, plnum
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 48:65: -> ^( AparOrUnitAndItsNumber place plnum )
                    {
                        // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:48:67: ^( AparOrUnitAndItsNumber place plnum )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AparOrUnitAndItsNumber, "AparOrUnitAndItsNumber")
                        , root_1);

                        adaptor.addChild(root_1, stream_place.nextTree());

                        adaptor.addChild(root_1, stream_plnum.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:49:3: 'City' ',' 'state' 'and' 'zip' 'code' '->' cityname ',' state zipcode
                    {
                    string_literal31=(Token)match(input,34,FOLLOW_34_in_stmt279);  
                    stream_34.add(string_literal31);


                    char_literal32=(Token)match(input,30,FOLLOW_30_in_stmt281);  
                    stream_30.add(char_literal32);


                    string_literal33=(Token)match(input,49,FOLLOW_49_in_stmt283);  
                    stream_49.add(string_literal33);


                    string_literal34=(Token)match(input,41,FOLLOW_41_in_stmt285);  
                    stream_41.add(string_literal34);


                    string_literal35=(Token)match(input,51,FOLLOW_51_in_stmt287);  
                    stream_51.add(string_literal35);


                    string_literal36=(Token)match(input,42,FOLLOW_42_in_stmt289);  
                    stream_42.add(string_literal36);


                    string_literal37=(Token)match(input,32,FOLLOW_32_in_stmt291);  
                    stream_32.add(string_literal37);


                    pushFollow(FOLLOW_cityname_in_stmt293);
                    cityname38=cityname();

                    state._fsp--;

                    stream_cityname.add(cityname38.getTree());

                    char_literal39=(Token)match(input,30,FOLLOW_30_in_stmt294);  
                    stream_30.add(char_literal39);


                    pushFollow(FOLLOW_state_in_stmt296);
                    state40=state();

                    state._fsp--;

                    stream_state.add(state40.getTree());

                    pushFollow(FOLLOW_zipcode_in_stmt298);
                    zipcode41=zipcode();

                    state._fsp--;

                    stream_zipcode.add(zipcode41.getTree());

                    // AST REWRITE
                    // elements: zipcode, cityname, state
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 49:72: -> ^( City cityname state zipcode )
                    {
                        // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:49:74: ^( City cityname state zipcode )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(City, "City")
                        , root_1);

                        adaptor.addChild(root_1, stream_cityname.nextTree());

                        adaptor.addChild(root_1, stream_state.nextTree());

                        adaptor.addChild(root_1, stream_zipcode.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:50:3: 'Country' '->' VAR
                    {
                    string_literal42=(Token)match(input,35,FOLLOW_35_in_stmt314);  
                    stream_35.add(string_literal42);


                    string_literal43=(Token)match(input,32,FOLLOW_32_in_stmt316);  
                    stream_32.add(string_literal43);


                    VAR44=(Token)match(input,VAR,FOLLOW_VAR_in_stmt318);  
                    stream_VAR.add(VAR44);


                    // AST REWRITE
                    // elements: VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 50:22: -> ^( Country VAR )
                    {
                        // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:50:24: ^( Country VAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Country, "Country")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VAR.nextNode()
                        );

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
    // $ANTLR end "stmt"


    public static class fullname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fullname"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:58:1: fullname : firstname lastname -> ^( Fullname firstname lastname ) ;
    public final MiniJavaParser.fullname_return fullname() throws RecognitionException {
        MiniJavaParser.fullname_return retval = new MiniJavaParser.fullname_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.firstname_return firstname45 =null;

        MiniJavaParser.lastname_return lastname46 =null;


        RewriteRuleSubtreeStream stream_firstname=new RewriteRuleSubtreeStream(adaptor,"rule firstname");
        RewriteRuleSubtreeStream stream_lastname=new RewriteRuleSubtreeStream(adaptor,"rule lastname");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:58:10: ( firstname lastname -> ^( Fullname firstname lastname ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:58:12: firstname lastname
            {
            pushFollow(FOLLOW_firstname_in_fullname342);
            firstname45=firstname();

            state._fsp--;

            stream_firstname.add(firstname45.getTree());

            pushFollow(FOLLOW_lastname_in_fullname344);
            lastname46=lastname();

            state._fsp--;

            stream_lastname.add(lastname46.getTree());

            // AST REWRITE
            // elements: lastname, firstname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:31: -> ^( Fullname firstname lastname )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:58:33: ^( Fullname firstname lastname )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Fullname, "Fullname")
                , root_1);

                adaptor.addChild(root_1, stream_firstname.nextTree());

                adaptor.addChild(root_1, stream_lastname.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "fullname"


    public static class firstname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "firstname"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:60:1: firstname : VAR -> ^( Firstname VAR ) ;
    public final MiniJavaParser.firstname_return firstname() throws RecognitionException {
        MiniJavaParser.firstname_return retval = new MiniJavaParser.firstname_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR47=null;

        Object VAR47_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:60:10: ( VAR -> ^( Firstname VAR ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:60:12: VAR
            {
            VAR47=(Token)match(input,VAR,FOLLOW_VAR_in_firstname361);  
            stream_VAR.add(VAR47);


            // AST REWRITE
            // elements: VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:16: -> ^( Firstname VAR )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:60:18: ^( Firstname VAR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Firstname, "Firstname")
                , root_1);

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
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
    // $ANTLR end "firstname"


    public static class lastname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lastname"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:62:1: lastname : VAR -> ^( Lastname VAR ) ;
    public final MiniJavaParser.lastname_return lastname() throws RecognitionException {
        MiniJavaParser.lastname_return retval = new MiniJavaParser.lastname_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR48=null;

        Object VAR48_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:62:9: ( VAR -> ^( Lastname VAR ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:62:11: VAR
            {
            VAR48=(Token)match(input,VAR,FOLLOW_VAR_in_lastname375);  
            stream_VAR.add(VAR48);


            // AST REWRITE
            // elements: VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:15: -> ^( Lastname VAR )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:62:17: ^( Lastname VAR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Lastname, "Lastname")
                , root_1);

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
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
    // $ANTLR end "lastname"


    public static class gender_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gender"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:64:1: gender : verygender -> ^( Gender verygender ) ;
    public final MiniJavaParser.gender_return gender() throws RecognitionException {
        MiniJavaParser.gender_return retval = new MiniJavaParser.gender_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.verygender_return verygender49 =null;


        RewriteRuleSubtreeStream stream_verygender=new RewriteRuleSubtreeStream(adaptor,"rule verygender");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:64:8: ( verygender -> ^( Gender verygender ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:64:10: verygender
            {
            pushFollow(FOLLOW_verygender_in_gender390);
            verygender49=verygender();

            state._fsp--;

            stream_verygender.add(verygender49.getTree());

            // AST REWRITE
            // elements: verygender
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:21: -> ^( Gender verygender )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:64:23: ^( Gender verygender )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Gender, "Gender")
                , root_1);

                adaptor.addChild(root_1, stream_verygender.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "gender"


    public static class verygender_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "verygender"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:66:1: verygender : ( 'Female' | 'Male' ) ;
    public final MiniJavaParser.verygender_return verygender() throws RecognitionException {
        MiniJavaParser.verygender_return retval = new MiniJavaParser.verygender_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:66:11: ( ( 'Female' | 'Male' ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set50=(Token)input.LT(1);

            if ( input.LA(1)==36||input.LA(1)==38 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set50)
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
    // $ANTLR end "verygender"


    public static class stnumber_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stnumber"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:73:1: stnumber : NUM -> ^( StreetNo NUM ) ;
    public final MiniJavaParser.stnumber_return stnumber() throws RecognitionException {
        MiniJavaParser.stnumber_return retval = new MiniJavaParser.stnumber_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM51=null;

        Object NUM51_tree=null;
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:73:18: ( NUM -> ^( StreetNo NUM ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:73:20: NUM
            {
            NUM51=(Token)match(input,NUM,FOLLOW_NUM_in_stnumber429);  
            stream_NUM.add(NUM51);


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
            // 73:24: -> ^( StreetNo NUM )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:73:26: ^( StreetNo NUM )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(StreetNo, "StreetNo")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NUM.nextNode()
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
    // $ANTLR end "stnumber"


    public static class stname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stname"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:74:1: stname : stname1 stname2 -> ^( StreetName stname1 stname2 ) ;
    public final MiniJavaParser.stname_return stname() throws RecognitionException {
        MiniJavaParser.stname_return retval = new MiniJavaParser.stname_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.stname1_return stname152 =null;

        MiniJavaParser.stname2_return stname253 =null;


        RewriteRuleSubtreeStream stream_stname2=new RewriteRuleSubtreeStream(adaptor,"rule stname2");
        RewriteRuleSubtreeStream stream_stname1=new RewriteRuleSubtreeStream(adaptor,"rule stname1");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:74:8: ( stname1 stname2 -> ^( StreetName stname1 stname2 ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:74:10: stname1 stname2
            {
            pushFollow(FOLLOW_stname1_in_stname443);
            stname152=stname1();

            state._fsp--;

            stream_stname1.add(stname152.getTree());

            pushFollow(FOLLOW_stname2_in_stname445);
            stname253=stname2();

            state._fsp--;

            stream_stname2.add(stname253.getTree());

            // AST REWRITE
            // elements: stname1, stname2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:26: -> ^( StreetName stname1 stname2 )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:74:28: ^( StreetName stname1 stname2 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(StreetName, "StreetName")
                , root_1);

                adaptor.addChild(root_1, stream_stname1.nextTree());

                adaptor.addChild(root_1, stream_stname2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "stname"


    public static class stname1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stname1"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:75:1: stname1 : VAR ;
    public final MiniJavaParser.stname1_return stname1() throws RecognitionException {
        MiniJavaParser.stname1_return retval = new MiniJavaParser.stname1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR54=null;

        Object VAR54_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:75:9: ( VAR )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:75:11: VAR
            {
            root_0 = (Object)adaptor.nil();


            VAR54=(Token)match(input,VAR,FOLLOW_VAR_in_stname1461); 
            VAR54_tree = 
            (Object)adaptor.create(VAR54)
            ;
            adaptor.addChild(root_0, VAR54_tree);


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
    // $ANTLR end "stname1"


    public static class stname2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stname2"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:76:1: stname2 : VAR ;
    public final MiniJavaParser.stname2_return stname2() throws RecognitionException {
        MiniJavaParser.stname2_return retval = new MiniJavaParser.stname2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR55=null;

        Object VAR55_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:76:9: ( VAR )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:76:11: VAR
            {
            root_0 = (Object)adaptor.nil();


            VAR55=(Token)match(input,VAR,FOLLOW_VAR_in_stname2468); 
            VAR55_tree = 
            (Object)adaptor.create(VAR55)
            ;
            adaptor.addChild(root_0, VAR55_tree);


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
    // $ANTLR end "stname2"


    public static class place_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "place"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:82:1: place : veryplace -> ^( ApartOrUnit veryplace ) ;
    public final MiniJavaParser.place_return place() throws RecognitionException {
        MiniJavaParser.place_return retval = new MiniJavaParser.place_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.veryplace_return veryplace56 =null;


        RewriteRuleSubtreeStream stream_veryplace=new RewriteRuleSubtreeStream(adaptor,"rule veryplace");
        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:82:7: ( veryplace -> ^( ApartOrUnit veryplace ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:82:9: veryplace
            {
            pushFollow(FOLLOW_veryplace_in_place480);
            veryplace56=veryplace();

            state._fsp--;

            stream_veryplace.add(veryplace56.getTree());

            // AST REWRITE
            // elements: veryplace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:19: -> ^( ApartOrUnit veryplace )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:82:21: ^( ApartOrUnit veryplace )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ApartOrUnit, "ApartOrUnit")
                , root_1);

                adaptor.addChild(root_1, stream_veryplace.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "place"


    public static class veryplace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "veryplace"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:83:1: veryplace : ( 'Apartment' | 'Unit' ) ;
    public final MiniJavaParser.veryplace_return veryplace() throws RecognitionException {
        MiniJavaParser.veryplace_return retval = new MiniJavaParser.veryplace_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set57=null;

        Object set57_tree=null;

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:83:21: ( ( 'Apartment' | 'Unit' ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set57=(Token)input.LT(1);

            if ( input.LA(1)==33||input.LA(1)==40 ) {
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
    // $ANTLR end "veryplace"


    public static class plnum_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "plnum"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:84:1: plnum : '#' NUM -> ^( ApNum '#' NUM ) ;
    public final MiniJavaParser.plnum_return plnum() throws RecognitionException {
        MiniJavaParser.plnum_return retval = new MiniJavaParser.plnum_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal58=null;
        Token NUM59=null;

        Object char_literal58_tree=null;
        Object NUM59_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:84:7: ( '#' NUM -> ^( ApNum '#' NUM ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:84:9: '#' NUM
            {
            char_literal58=(Token)match(input,27,FOLLOW_27_in_plnum515);  
            stream_27.add(char_literal58);


            NUM59=(Token)match(input,NUM,FOLLOW_NUM_in_plnum516);  
            stream_NUM.add(NUM59);


            // AST REWRITE
            // elements: NUM, 27
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:16: -> ^( ApNum '#' NUM )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:84:18: ^( ApNum '#' NUM )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ApNum, "ApNum")
                , root_1);

                adaptor.addChild(root_1, 
                stream_27.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_NUM.nextNode()
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
    // $ANTLR end "plnum"


    public static class cityname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cityname"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:90:1: cityname : VAR VAR -> ^( City VAR VAR ) ;
    public final MiniJavaParser.cityname_return cityname() throws RecognitionException {
        MiniJavaParser.cityname_return retval = new MiniJavaParser.cityname_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR60=null;
        Token VAR61=null;

        Object VAR60_tree=null;
        Object VAR61_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:90:20: ( VAR VAR -> ^( City VAR VAR ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:90:22: VAR VAR
            {
            VAR60=(Token)match(input,VAR,FOLLOW_VAR_in_cityname546);  
            stream_VAR.add(VAR60);


            VAR61=(Token)match(input,VAR,FOLLOW_VAR_in_cityname548);  
            stream_VAR.add(VAR61);


            // AST REWRITE
            // elements: VAR, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:30: -> ^( City VAR VAR )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:90:32: ^( City VAR VAR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(City, "City")
                , root_1);

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
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
    // $ANTLR end "cityname"


    public static class state_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "state"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:91:1: state : VAR -> ^( State VAR ) ;
    public final MiniJavaParser.state_return state() throws RecognitionException {
        MiniJavaParser.state_return retval = new MiniJavaParser.state_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR62=null;

        Object VAR62_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:91:7: ( VAR -> ^( State VAR ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:91:9: VAR
            {
            VAR62=(Token)match(input,VAR,FOLLOW_VAR_in_state564);  
            stream_VAR.add(VAR62);


            // AST REWRITE
            // elements: VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:13: -> ^( State VAR )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:91:15: ^( State VAR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(State, "State")
                , root_1);

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
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
    // $ANTLR end "state"


    public static class zipcode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "zipcode"
    // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:92:1: zipcode : NUM -> ^( ZipCode NUM ) ;
    public final MiniJavaParser.zipcode_return zipcode() throws RecognitionException {
        MiniJavaParser.zipcode_return retval = new MiniJavaParser.zipcode_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM63=null;

        Object NUM63_tree=null;
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");

        try {
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:92:9: ( NUM -> ^( ZipCode NUM ) )
            // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:92:11: NUM
            {
            NUM63=(Token)match(input,NUM,FOLLOW_NUM_in_zipcode578);  
            stream_NUM.add(NUM63);


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
            // 92:15: -> ^( ZipCode NUM )
            {
                // C:\\Users\\McQueen\\Downloads\\quiz 3\\MiniJava.g:92:17: ^( ZipCode NUM )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ZipCode, "ZipCode")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NUM.nextNode()
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
    // $ANTLR end "zipcode"

    // Delegated rules


 

    public static final BitSet FOLLOW_statments_in_start87 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_statments144 = new BitSet(new long[]{0x000000AE80000000L});
    public static final BitSet FOLLOW_stmt_in_statments146 = new BitSet(new long[]{0x000000AE80000000L});
    public static final BitSet FOLLOW_31_in_statments149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_stmt176 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_stmt178 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_stmt180 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_stmt182 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_stmt183 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stmt186 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_fullname_in_stmt188 = new BitSet(new long[]{0x0000000110000002L});
    public static final BitSet FOLLOW_28_in_stmt192 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_gender_in_stmt193 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_stmt194 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_39_in_stmt223 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_stmt225 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_stmt227 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_stmt229 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stmt231 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_stnumber_in_stmt233 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_stname_in_stmt235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_stmt249 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_stmt251 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_stmt253 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_stmt255 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_stmt257 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_stmt259 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stmt261 = new BitSet(new long[]{0x0000010200000000L});
    public static final BitSet FOLLOW_place_in_stmt263 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_plnum_in_stmt265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_stmt279 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_stmt281 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_stmt283 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_stmt285 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_stmt287 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_stmt289 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stmt291 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_cityname_in_stmt293 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_stmt294 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_state_in_stmt296 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_zipcode_in_stmt298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_stmt314 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_stmt316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_VAR_in_stmt318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_firstname_in_fullname342 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_lastname_in_fullname344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_firstname361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_lastname375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verygender_in_gender390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_stnumber429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stname1_in_stname443 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_stname2_in_stname445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_stname1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_stname2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_veryplace_in_place480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_plnum515 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NUM_in_plnum516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_cityname546 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_VAR_in_cityname548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_state564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_zipcode578 = new BitSet(new long[]{0x0000000000000002L});

}