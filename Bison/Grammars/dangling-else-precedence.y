%token ID EXPR 

%nonassoc "if"
%nonassoc "else"

%%

Statement     : "if" "(" EXPR ")" Statement                  %prec "if"
              | "if" "(" EXPR ")" Statement "else" Statement
              | "while" "(" EXPR ")" Statement 
              | "{" StatementList "}"
              | ID "=" EXPR ";"
              ;

StatementList : /* epsilon */
              | StatementList Statement
              ;
