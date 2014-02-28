%token ID EXPR 
%%

Statement      : MatchedStmnt
               | UnMatchedStmnt
               ;

MatchedStmnt   : "if" "(" EXPR ")" MatchedStmnt "else" MatchedStmnt
               | "while" "(" EXPR ")" MatchedStmnt 
               | "{" StatementList "}"
               | ID "=" EXPR ";"
               ;

UnMatchedStmnt : "if" "(" EXPR ")" Statement 
               | "if" "(" EXPR ")" MatchedStmnt "else" UnMatchedStmnt
               | "while" "(" EXPR ")" UnMatchedStmnt
               ;

StatementList  : /* epsilon */
               | StatementList Statement
               ;
