grammar MiniJava;

options {output=AST;}

tokens{
Start;

}
@members {
String s="";
}

// Rules here
start 	:	class+ ->^(Start class+);
catch[MismatchedTokenException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[NoViableAltException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}
catch[RecognitionException e]{s=s+getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e)+"\n";}

finally {s=s+"Exit..."+"\n";}
 
class	:       Modifier? CLASS ID PO 
			
		PC;


// Tokens here 
Modifier:	'private'|'public';
CLASS	:	'class';
PO	:	'{';
PC	:	'}';
NUM	:	('0'..'9')*;
DNUM	:	NUM'.'NUM;
AndOr	:	'&&'|'||';
INT	:	'int';
DOUBLE	:	'double';
VOID	:	'void';
BOOLEAN	:	'boolean';
STRING  :	'String';
EQUAL	:	'=';
SEMICOLON:	';';
ID	:	('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
TEXT	:	'"' (.)* '"';
SIGNS	:	('+'|'-'|'*'|'/'|'%');
COMPARISONS:   '=='|'!='|'>'|'<'|'>='|'<=';
ML_COMMENT	:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};
WhiteSpace:	(' '|'\n'|'\r'|'\t')+{skip();};
