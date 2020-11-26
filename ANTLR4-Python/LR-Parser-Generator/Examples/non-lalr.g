// This grammar is an LR grammar, but not an LALR grammar.

s   : 'v' a 'y'
    | 'w' b 'y'
    | 'v' b 'z'
    | 'w' a 'z'
    ;

a   : 'x'
    ;

b   : 'x'
    ;
