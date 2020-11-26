// Example from Dragon book for LALR grammar.

s   : c c ;

c   : 'x' c
    | 'y'
    ;
