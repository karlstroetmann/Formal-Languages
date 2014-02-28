grammar LibExpr;         // Rename to distinguish from original
import CommonLexerRules; // includes all rules from CommonLexerRules.g4

/** The start rule; begin parsing here. */
prog:   stat+ ; 

stat:   expr ';'
    |   ID '=' expr ';'
    |   ';'            
    ;

expr:   expr ('*'|'/') expr   
    |   expr ('+'|'-') expr  
    |   INT                    
    |   ID                    
    |   '(' expr ')'    
    ;
