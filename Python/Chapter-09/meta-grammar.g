start: rule+

rule: RULE_NAME ":" body ("|" body)*    %ignore ":", "|"

body: item*

item: VARIABLE
    | TERMINAL
    | LITERAL

RULE_NAME: /[a-z][a-z0-9_]*(?=[ \t]*:)/
VARIABLE:  /[a-z][a-z0-9_]*/
TERMINAL:  /[A-Z][A-Z0-9_]*/
LITERAL:   /"[^"]+"/

%import common.WS
%ignore WS
        
