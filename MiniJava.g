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
 
class	:       Modifier? CLASS ID CBO 
		method*	
	         CBC;

method	:       Modifier? STATIC?((VOID(mainmethod|voidmethod))|returnmethod);

mainmethod    :       MAIN PO STRING SBO SBC ARGS PC CBO
	        
	        CBC ;
	    
voidmethod       :      ID PO PC CBO //missing the parameters
	        
	        CBC;

returntype        :      INT|DOUBLE|STRING|BOOLEAN;

returnmethod :      returntype ID PO PC CBO //missing the parameters
	        
	        CBC;		    


// Tokens here 
Modifier             :	'private'|'public';
CLASS	:	'class';
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
ARGS	:	'args';
NUM	:	('0'..'9')*;
DNUM	:	NUM'.'NUM;
AndOr	:	'&&'|'||';
INT	:	'int';
DOUBLE	:	'double';
BOOLEAN	:	'boolean';
EQUAL	:	'=';
SEMICOLON     :	';';
ID	:	('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
TEXT	:	'"' (.)* '"';
SIGNS	:	('+'|'-'|'*'|'/'|'%');
COMPARISONS:                              '=='|'!='|'>'|'<'|'>='|'<=';
ML_COMMENT:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};
WhiteSpace      :	(' '|'\n'|'\r'|'\t')+{skip();};
