grammar Grammar;

start returns [result]
    : g=grammatik {$result = $g.result}
    ;

