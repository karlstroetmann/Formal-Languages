start: rule+;

rule: VARIABLE ":" body ("|" body)* ";"    %ignore ":", "|", ";";

body: item*;

item: VARIABLE
    | TERMINAL
    | LITERAL
    ;

VARIABLE:  /[a-z][a-z0-9_]*/;
TERMINAL:  /[A-Z][A-Z0-9_]*/;
LITERAL:   /"[^"]+"/;

%import common.WS;
%ignore WS;
