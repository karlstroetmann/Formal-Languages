grammar LExpr;

start : expr ;

expr : expr '*' expr 		# Multiply
     | expr '/' expr 		# Divide
     | expr '+' expr 		# Add
     | expr '-' expr 		# Subtract
     | INT        		    # Int
     ;

INT : [0-9]+ ;
WS  : [ \t\n\r] -> skip ;
