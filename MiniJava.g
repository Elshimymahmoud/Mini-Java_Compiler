grammar MiniJava;

options {output=AST;}

tokens{
Start;
Factor;
// mohamed aballah 9 -> 29





















// mohamed ragab 31 -> 51


FuncCall;
Print;
Whilestmt;
Initialize;
Ifstmt;















// ahmed ibrahem 53 -> 73
Class;
MainMethod;
Method;
ReturnMethod;
VoidMethod;
ArrayOrObj;
NotCond;
FuncCall;
Parameters;
While;
Block;









}
@members {
String s="";
}

// Rules here
start 	:	(class+) -> ^(Start class);
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

finally {s=s+"Exit..."+"\n";}
 
modifier	:	(PUBLICV|PRIVATEV)^;

class		:	(modifier? CLASS ID (EXTENDV ID)? CBO
				statment* 
				method*
				(mainmethod statment* method*)?
			CBC) -> ^(Class modifier? CLASS ID (EXTENDV ID)? CBO statment* method*(mainmethod statment* method*)?CBC);
			
			
			
			
			
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

mainmethod      :	(modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO
				statment*     
	       		CBC)-> ^(MainMethod modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO statment*);




catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

method		:       (modifier? STATIC? methodtype) -> ^(Method modifier? STATIC? methodtype);
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

methodtype	:	(voidmethod|returnmethod)^;

catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

voidmethod      :   	(VOID ID PO (type ID (COMA type ID)*)? PC CBO 
	        		statment*
			CBC) ->^(VoidMethod VOID ID PO (type ID (COMA type ID)*)? PC CBO statment* CBC);





catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
typev		:	(INT|DOUBLE|STRING|BOOLEAN|ID)^;
type     	:	(typev (SBO SBC)?) -> ^(typev (SBO SBC)?);





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

statment	:	print ->^(Print print)
                |initialize ->^(Initialize initialize)
                |ifstmt ->^(Ifstmt ifstmt)
                |whilestmt ->^(Whilestmt whilestmt)
                |funcCall SEMICOLON ->^(FuncCall funcCall SEMICOLON);







catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

print		:	PRINT PO (TEXT|arithExpr|funcCall|declobj) PC SEMICOLON; 






catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

initialize	:	type? ID (SBO (arithExpr)? SBC)? declaration? SEMICOLON;






catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

declaration	:	EQUAL (arithExpr|declobj|TEXT);







catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

declobj		:	NEW type ((PO (parameters)? PC dotvlaues*)| SBO (arithExpr)? SBC);






catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

dotvlaues 	:	(DOT ID (PO (parameters)? PC)?);






catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

ifstmt		:	IF PO condition PC block( ELSE block )?;







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


funcCall	:	ID PO ( parameters)? PC -> ^(FuncCall ID PO ( parameters)? PC);






catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}


parameters	:	arithExpr (COMA arithExpr)* -> ^(Parameters arithExpr (COMA arithExpr)*);






catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}


whilestmt	:	WHILE PO condition PC block -> ^(While WHILE PO condition PC block);






catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}


signs		:	(PLUS|MINUS|MULTI|DIV|REMINDER)^;




catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
arrayOrObj	:	dotvlaues* -> ^(ArrayOrObj dotvlaues*)
			|SBO arithExpr SBC -> ^(ArrayOrObj SBO arithExpr SBC);
			
notCond		:	(PO condition PC dotvlaues*) -> ^(NotCond PO condition PC dotvlaues*)
			|ID arrayOrObj ->^(NotCond ID arrayOrObj);
arithExpr	:	term ((PLUS | MINUS)^  term)*;

term		:	factor ( ( MULTI | DIV )^ factor)*;

factor		:	ID arrayOrObj -> ^(Factor ID arrayOrObj)
			|NUM -> ^(Factor NUM)
			|DNUM -> ^(Factor DNUM)
			| MINUS  ID -> ^(Factor  MINUS ID)
			| MINUS  NUM -> ^(Factor  MINUS NUM)
			| MINUS  DNUM  -> ^(Factor  MINUS DNUM)
			| NOT notCond -> ^(Factor  NOT notCond)
			| PO condition PC dotvlaues* -> ^(Factor  PO condition PC dotvlaues*)
			|BOOL -> ^(Factor BOOL)
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
PUBLICV             :	'public';
PRIVATEV             :	'private';
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
