// Boolean expressions in negation normal form:  The negation operator is only applied to identifiers.

bool: bool "∨" conjunction
    | conjunction
    ;

conjunction: conjunction "∧" simple
           | simple
           ;

simple: "(" bool ")"
      | "¬" IDENTIFIER
      | IDENTIFIER
      ;
