grammar Program;
 
@header {
    import java.util.TreeMap;
}

@members {
    TreeMap<String, Integer> varTable = new TreeMap<String, Integer>();
}

program : stmnt+ ;

stmnt : ID ':=' expr ';' { varTable.put($ID.text, $expr.result); }
      |         expr ';' { System.out.println($expr.result);     }
      ;    

expr returns [int result]
    : e = expr { $result = $e.result; }
      (   '+' p = product { $result += $p.result; }
        | '-' p = product { $result -= $p.result; }
      )
    | p = product { $result = $p.result; }
    ;

product returns [int result]
    : p = product { $result = $p.result; }
      (
          '*' f = factor { $result *= $f.result; }
        | '/' f = factor { $result /= $f.result; }
      )
    | f = factor { $result = $f.result; }
    ;

factor returns [int result]
    : '(' expr ')' { $result = $expr.result;           }
    | ID           { $result = varTable.get($ID.text); }
    | INT          { $result = new Integer($INT.text); }
    ;

ID : [a-zA-Z][a-zA-Z0-9]*;
INT: '0'|[1-9][0-9]*;
WS : [ \v\t\n\r] -> skip; 

