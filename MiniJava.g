grammar MiniJava;

options {output=AST;}

tokens{
Start;
Factor;

}
@members {
String s="";
}

// Rules here
start 	:	(entry) ->^(Start entry);
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

finally {s=s+"Exit..."+"\n";}
 
modifier	:	PUBLICV|PRIVATEV;

entry		:       normalclass* mainclass normalclass*;

mainclass 	:	PUBLICV? CLASS ID (EXTENDV ID)? CBO 
				method*
				mainmethod
				method*	
	         	CBC;
  	
normalclass	:	modifier? CLASS ID (EXTENDV ID)? CBO 
				method*	
			CBC;

mainmethod      :	modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO
				statment*     
	       		CBC ;

method		:       modifier? STATIC?(voidmethod|returnmethod);
    
voidmethod      :   	VOID ID PO (type ID (COMA type ID)*)? PC CBO //missing the parameters
	        		statment*
			CBC;

type     	:	(INT|DOUBLE|STRING|BOOLEAN|ID) (SBO SBC)?;

returnmethod 	:	type ID PO (type ID (COMA type ID)*)? PC CBO //missing the parameters	 	       		
	 			statment*			        		
	        		RETURNV (ID|NUM|DNUM) SEMICOLON
			CBC;		
	
print		:	PRINT PO (TEXT|arithExpr) PC SEMICOLON; // missing Arth Expr & Variable & Function call

// mohamed ragab 55 -> 85




ifstmt		:	IF PO PC 
			block 
			elsestmt*; // missing cond

elsestmt:	(ELSE_IF PO PC block)|(ELSE block);

block		:	CBO (statment*) CBC | statment;





//if(){}else{}
//if()else without {}
//if()else if()else without {}
//if(){}else if(){}else{}


















// mohamed abdallah 86 -> 116






























// ahmed Ibrahem 117 -> 147
signs		:	(PLUS|MINUS|MULTI|DIV|REMINDER);

statment	:	print|initialize|ifstmt;

initialize	:	type ID (EQUAL (arithExpr|TEXT))? SEMICOLON;//missing Arth Expr

arithExpr	:	term ((PLUS | MINUS)^  term)*;

term		:	factor ( ( MULTI | DIV )^ factor)*;

factor		:	ID -> ^(Factor ID)
			|NUM -> ^(Factor NUM)
			|DNUM -> ^(Factor DNUM)
			| MINUS  ID -> ^(Factor  MINUS ID)
			| MINUS  NUM -> ^(Factor  MINUS NUM)
			| MINUS  DNUM  -> ^(Factor  MINUS DNUM)
			| PO arithExpr PC -> ^(Factor  PO arithExpr PC)
			;

























// Tokens here
IF	:	'if';
ELSE	:	'else';
ELSE_IF	:	'else if';
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
