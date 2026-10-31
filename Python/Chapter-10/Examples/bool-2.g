expr: expr "|" conjunction
    | conjunction

conjunction: conjunction "&" negation
           | negation

negation: "!" negation
        | atom

atom: "(" expr ")"
    | VAR
