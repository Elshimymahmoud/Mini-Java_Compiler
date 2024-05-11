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
 
modifier:	PRIVATEV|PUBLICV; 


class	:       normalclass* mainclass normalclass*;


mainclass 	:	CLASS ID CBO 
					method*
					mainmethod
					method*	
	         	CBC;
	         	
	         	
	         	
normalclass	:	modifier? CLASS ID CBO 
					method*	
			CBC;
			

mainmethod    :     modifier STATIC VOID MAIN PO STRING SBO SBC ID PC CBO
	        
	        CBC ;



method	:       modifier? STATIC?(voidmethod|returnmethod);


	    
voidmethod       :     VOID ID PO type ID (COMA type ID)* PC CBO //missing the parameters
	        
	        CBC;
	        


type        :      (INT|DOUBLE|STRING|BOOLEAN|ID) (SBO SBC)?;

returnmethod :      type ID PO type ID (COMA type ID)* PC CBO //missing the parameters
	        
	        
	        	RETURNV ID SEMICOLON
		CBC;		
		
		



// Tokens here 
PUBLICV             :	'public';
PRIVATEV             :	'private';
RETURNV	:	'return';
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
SIGNS	:	('+'|'-'|'*'|'/'|'%');
COMPARISONS:                              '=='|'!='|'>'|'<'|'>='|'<=';
ML_COMMENT:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};
WhiteSpace      :	(' '|'\n'|'\r'|'\t')+{skip();};
