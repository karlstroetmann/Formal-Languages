cnf    : cnf '∧' clause
       | clause
       ;

clause : clause '∨' literal
       | literal
       ;

literal: '¬' ID
       | ID
       ;
