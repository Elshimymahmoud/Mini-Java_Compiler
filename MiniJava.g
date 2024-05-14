grammar MiniJava;

options {output=AST;}

tokens{
Entry;
Start;
Classl;
MainMethod;
Method;
ReturnMethod;
VoidMethod;
FuncCall;
Printstmt;
Whilestmt;
Initialize;
Ifstmt;
Type;
Declaration;
ArrayOrObj;
NotCond;
FuncCall;
Parameters;
While;
Block;
DeclObj;
DeclOr;
DotValues;
Factor;
}
@members {
String s="";
}

// Rules here
entry	:	(start) -> ^(Entry start);
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

finally {s=s+"Exit..."+"\n";}

start 	:	(classl+) -> ^(Start classl+);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

classl		:	(CLASS ID classes)-> ^(Classl ID classes);
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

classes		:	(mainClass|classDeclaration)^;

mainClass	:	(CBO mainmethod CBC);	
			
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

classDeclaration:	((EXTENDV ID)? CBO statment* CBC) ;	
				
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}


mainmethod      :	(MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO
				statment*     
	       		CBC)-> ^(MainMethod MODIFiER STATIC VOID MAIN PO STRING SBO SBC ID PC CBO statment* CBC);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

method		:       (MODIFiER? STATIC? methodtype) -> ^(Method MODIFiER? STATIC? methodtype);
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

methodtype	:	(voidmethod|returnmethod)^;

voidmethod      :   	(VOID ID PO (type ID (COMA type ID)*)? PC CBO 
	        		statment*
			CBC) ->^(VoidMethod VOID ID PO (type ID (COMA type ID)*)? PC CBO statment* CBC);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

typev		:	(INT|DOUBLE|STRING|BOOLEAN|ID)^;

type     	:	(typev (SBO SBC)?) -> ^(Type typev (SBO SBC)?);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

returnmethod 	:	(type ID PO (type ID (COMA type ID)*)? PC CBO  	       		
	 			statment*			        		
	        		RETURNV arithExpr SEMICOLON
			CBC) ->^(ReturnMethod type ID PO (type ID (COMA type ID)*)? PC CBO statment* RETURNV arithExpr SEMICOLON CBC);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

statment	:	(print) -> ^(Printstmt print)
	                |(initialize) -> ^(Initialize initialize)
              		|(ifstmt) -> ^(Ifstmt ifstmt)
	                |(whilestmt) -> ^(Whilestmt whilestmt)
	                |(funcCall SEMICOLON) -> ^(FuncCall funcCall SEMICOLON)
	                |(method) -> ^(Method method);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

print		:	(PRINT PO printThings PC SEMICOLON) -> ^(Printstmt PRINT PO printThings PC SEMICOLON); 

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

printThings	:	(TEXT|arithExpr|funcCall|declobj)^;

initialize	:	(type? ID (SBO (arithExpr)? SBC)? declaration? SEMICOLON) -> ^(Initialize type? ID (SBO (arithExpr)? SBC)? declaration? SEMICOLON);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

declaration	:	(EQUAL declThings) -> ^(Declaration EQUAL declThings);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

declThings	:	(arithExpr|declobj|TEXT)^;

declobj		:	(NEW type declOR) -> ^(DeclObj NEW type declOR);
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

declOR1		:	PO (parameters)? PC dotvlaues*;
declOR2		:	SBO (arithExpr)? SBC;

declOR		:	(declOR1) -> ^(DeclOr declOR1)
			|(declOR2) -> ^(DeclOr declOR2);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

dotvlaues 	:	(DOT ID (PO (parameters)? PC)?) -> ^(DotValues DOT ID (PO (parameters)? PC)?);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

ifstmt		:	(IF PO condition PC block( ELSE block )?) -> ^(Ifstmt IF PO condition PC block( ELSE block )?);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}


condition	:	arithExpr ((COMPARISONS|AndOr)^ arithExpr)*;														

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

block		:	(CBO statment* CBC) -> ^(Block CBO statment* CBC)
			| (statment) -> ^(Block statment);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

funcCall	:	(ID PO ( parameters)? PC) -> ^(FuncCall ID PO ( parameters)? PC);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

parameters	:	(arithExpr (COMA arithExpr)*) -> ^(Parameters arithExpr (COMA arithExpr)*);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

whilestmt	:	(WHILE PO condition PC block) -> ^(While WHILE PO condition PC block);

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

signs		:	(PLUS|MINUS|MULTI|DIV|REMINDER)^;

arrayOrObj	:	(dotvlaues*) -> ^(ArrayOrObj dotvlaues*)
			|(SBO arithExpr SBC) -> ^(ArrayOrObj SBO arithExpr SBC);
			
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
			
notCond		:	(PO condition PC dotvlaues*) -> ^(NotCond PO condition PC dotvlaues*)
			|(ID arrayOrObj) ->^(NotCond ID arrayOrObj);
			
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

arithExpr	:	term ((PLUS | MINUS)^  term)*;

term		:	factor ( ( MULTI | DIV )^ factor)*;

factor		:	(ID arrayOrObj) -> ^(Factor ID arrayOrObj)
			|(NUM) -> ^(Factor NUM)
			|(DNUM) -> ^(Factor DNUM)
			|(MINUS  ID) -> ^(Factor  MINUS ID)
			|(MINUS  NUM) -> ^(Factor  MINUS NUM)
			|(MINUS  DNUM) -> ^(Factor  MINUS DNUM)
			|(NOT notCond) -> ^(Factor  NOT notCond)
			|(PO condition PC dotvlaues*) -> ^(Factor  PO condition PC dotvlaues*)
			|(BOOL) -> ^(Factor BOOL)
			;

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

// Tokens here
DOT	:	'.';
WHILE	:	'while';
NEW	:	'new';
BOOL	: 'true' | 'false';
IF	:	'if';
ELSE	:	'else';
PRINT	:	'System.out.println'|'System.out.print';
MODIFiER:	('public'|'private');
RETURNV	:	'return';
CLASS	:	'class';
EXTENDV	:	'extends';
CBO	:	'{'; // Curly Bracket Open
CBC	:	'}';// Curly Bracket Close
STATIC	:	'static';
VOID	:	'void';
MAIN	:	'main';
PO	:	'(';//Parenthese Open
PC	:	')';//Parenthese Close
STRING	:	'String';
SBO	:	'[';//Square Bracket Open
SBC	:	']';//Square Bracket Close
NUM	:	('0'..'9')*;
DNUM	:	NUM'.'NUM;
AndOr	:	'&&'|'||';
INT	:	'int';
DOUBLE	:	'double';
BOOLEAN	:	'boolean';
EQUAL	:	'=';
COMA	:	',';
SEMICOLON     :	';';
NOT: '!';	
ID	:	('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
TEXT	:	'"' (.)* '"';
MINUS	:	'-';
PLUS	:	'+';
MULTI	:	'*';
DIV	:	'/';
REMINDER:	'%';
COMPARISONS:                              '=='|'!='|'>'|'<'|'>='|'<=';
ML_COMMENT:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};
WhiteSpace      :	(' '|'\n'|'\r'|'\t')+{skip();};
