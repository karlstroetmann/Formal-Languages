grammar Prefix;

program : expr { System.out.println($expr.result); } ;

expr returns [int result]
     : '+' e1 = expr e2 = expr { $result = $e1.result + $e2.result; } 
     | '-' e1 = expr e2 = expr { $result = $e1.result - $e2.result; } 
     | '*' e1 = expr e2 = expr { $result = $e1.result * $e2.result; } 
     | '/' e1 = expr e2 = expr { $result = $e1.result / $e2.result; } 
     | NUMBER { $result = new Integer($NUMBER.text); }
     ;

NUMBER: '0'|('1'..'9')('0'..'9')*;
WS    : (' '|'\t'|'\v'|'\n'|'\r') { skip(); };
