%{
#include "yydoc.h"
%}

%union {
	Grammar*  grammar;
    Rule*     rule;
	BodyList* bodyList;
	Body*     body;
	Item*     item;	
	char*     name;	
};

%type  <grammar>   rule_list
%type  <rule>      rule
%type  <bodyList>  body_list
%type  <body>      body
%type  <item>      item
%token <name>      TOKEN NONTERMINAL CHAR STRING

%%

grammar   : rule_list                     { writeGrammar($1); }
          ;

rule_list : rule                          { $$ = createGrammar($1, NULL); }
          | rule rule_list                { $$ = createGrammar($1, $2);   }
          ;

rule      : NONTERMINAL ':' body_list ';' { $$ = createRule($1, $3); } 
          ;

body_list : body                          { $$ = createBodyList($1, NULL); }
          | body '|' body_list            { $$ = createBodyList($1, $3);   }
          ;

body : item body                          { $$ = createBody($1, $2); }
     | /* epsilon */                      { $$ = NULL;               }
     ;

item : TOKEN         { $$ = createItem(TOKEN_KIND,       $1); }
     | NONTERMINAL   { $$ = createItem(NONTERMINAL_KIND, $1); }
     | CHAR          { $$ = createItem(CHAR_KIND,        $1); } 
     | STRING        { $$ = createItem(CHAR_KIND,        $1); } 
     ;

%%

int main() {
    yyparse();
	return 0;
}

