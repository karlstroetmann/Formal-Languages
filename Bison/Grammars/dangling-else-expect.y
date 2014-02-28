%expect 1
%token ID EXPR 
%%

Statement     : "if" "(" EXPR ")" Statement 
              | "if" "(" EXPR ")" Statement "else" Statement
              | "while" "(" EXPR ")" Statement 
              | "{" StatementList "}"
              | ID "=" EXPR ";"
              ;

StatementList : /* epsilon */
              | StatementList Statement
              ;
